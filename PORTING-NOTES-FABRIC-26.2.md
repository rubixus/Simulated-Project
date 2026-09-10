# Porting notes: NeoForge 1.21.1 -> Fabric 26.2 (Create Fly)

Measured on the fork point (`fae8e3f`): ~905 Java files,
~1,101 `com.simibubi.*` refs, ~1,251 Sable/Veil/Curios refs,
22 `net.neoforged.*` imports inside `:common`, 401 Ponder/Flywheel/Registrate
refs. Three mods share the pattern `common` + `neoforge`; this branch adds
`fabric` alongside.

Reference ports that prove the shape: `Domanffe/create-deco-fly` (Fabric 26.2 +
Create Fly, canonical `build.gradle`/`fabric.mod.json`), Steam 'n' Rails
Continued `fabric-26.2` port, and `R2bEEaton-Minecraft/create-connected-fly`
`PORTING_NOTES.md` (NeoForge Create addon -> Create Fly 1.21.11, documents the
`com.zurrtum.create` move, bundled Registrate, accesswidener precedent).

## 1. Toolchain

- Java 21 -> 25 (`options.release = 25`, `source/targetCompatibility 25`).
- Gradle wrapper 9.4.1 -> 9.5.1 (`./gradlew wrapper --gradle-version 9.5.1`).
- ModDevGradle (`net.neoforged.moddev`) -> Fabric Loom `1.17-SNAPSHOT`
  (Create Fly 26.2 itself still uses `1.16-SNAPSHOT`; either works, prefer 1.17
  per the Fabric 26.2 blog).
- Loader `0.16.9` -> `0.19.3`; Fabric API `0.103.0+1.21.1` -> `0.154.2+26.2`.
- 26.1+ ships **unobfuscated** (Mojang official mappings); Parchment is gone
  for 26.2 modules.
- 26.2 vanilla breakages to sweep mixins/renderers for: rendering pipeline +
  experimental Vulkan backend (no raw GL), `Minecraft.setScreen()` moved to
  `Minecraft.gui.setScreen()`, other `Gui`/`Hud` splits, registration +
  datagen changes, tag-removal API (`fabric:remove`). See Fabric "for 26.2"
  blog + docs "Porting to 26.2" + NeoForge 26.1->26.2 migration primer.

## 2. Create -> Create Fly (`maven.modrinth:create-fly:26.2-rc-2-6.0.9-1`)

- Mod id stays `create`; **package root moves**
  `com.simibubi.create` -> `com.zurrtum.create`.
- Client-only classes additionally move under `com.zurrtum.create.client.*`
  (a class that was shared in NeoForge Create may be client-only in Fly;
  fix each import by locating the class in the Fly sources jar).
- Ponder (`net.createmod.ponder`), Flywheel (`dev.engine-room.flywheel`),
  Registrate (`com.tterrag.registrate`) ship **inside** the Fly jar — do NOT
  add separate deps; drop the NeoForge-classifier artifacts
  (`ponder-neoforge`, `flywheel-neoforge`, `create-<mc>:slim`).
- `catnip` (`com.zurrtum.create.client.catnip.lang.FontHelper` etc.): check Fly jar; the
  `create-connected-fly` notes report the multiloader `CatnipServices` locator
  does NOT exist in Fly — call sites (e.g. `FeatureToggle`-style
  `executeOnClientOnly`) need direct Fabric replacements.
- Mixin targets into Create classes must be re-pointed to the new packages and
  re-validated (method bodies changed for the 26.2 render/data-loading rework).

## 3. Service layer (`:common` service/* + `:neoforge` service/*)

Each `Sim*Service` interface needs a `fabric` implementation mirroring the
`neoforge` one (package `...fabric.service...`, registered via
`META-INF/services` in the fabric module or wired in the entrypoint):

- Assembly, BlockState, Entity, EntityDataSerialization, Inventory, Item,
  Fluid, Menu, Platform, Tab, Config, ResourceManagerRegistry.
- `SimModCompatibilityService` entries (ComputerCraft, Nature's/Explorer's
  Compass): re-check against each mod's Fabric 26.2 artifact; CC:Tweaked
  coordinates are `cc.tweaked:cc-tweaked-26.1.2-fabric:1.119.0`-style.
- Networking (`SimPacketManager`, NeoForge `ConfigurationTask`-based config
  sync): rewrite on Fabric networking; Fly's own `ServerConfigPacket` is the
  model to copy.
- Events: `SimNeoForgeCommonEvents`/`...ClientEvents` (`@Mod` bus + NeoForge
  `EVENT_BUS`) -> Fabric `ServerTickEvents`, `ClientTickEvents`,
  `ServerLifecycleEvents`, etc.

## 4. Multiloader wrappers

- Inventory (`ContainerWrapper`, `InventoryLoaderWrapperImpl` over
  `IItemHandler`) -> Fabric Transfer API `Storage<ItemVariant>`
  (`fabric-transfer-api-v1`).
- Tanks (`SingleTankWrapper` over `IFluidHandler`) ->
  `Storage<FluidVariant>`.
- Energy (`SingleBatteryWrapper` over Forge Energy) -> Fabric
  `EnergyStorage` (or Fly's energy compat).
- `registrate/neoforge/SimBlockEntityBuilderImpl` (wraps CreateRegistrate) ->
  `registrate/fabric/...` against the Registrate bundled in Fly.
- Fluids: `AeroFluidType`/`LevititeBlendFluidType` extend NeoForge
  `FluidType` — Fabric has no `FluidType`; port to vanilla fluid properties +
  Fly fluid handling.
- Mounted storage (`MountedItemStorageMixin`, `WrappedWrappedMountedItemStorage`)
  wraps Forge capabilities — rewrite against Transfer API.

## 5. Compat swaps

- Curios (`top.theillusivec4.curios:curios-neoforge`) -> Trinkets
  (`eu.pb4:trinkets:4.1.0-beta.1+26.2`, clientCompileOnly in Fly).
- JEI NeoForge (`jei-<mc>-neoforge-api`) -> JEI Fabric
  (`mezz.jei:jei-26.1.2-fabric:29.6.2.31`-style); or REI/RRV
  (`reliable-recipe-viewer-fabric:8.3.1+26.2-pre-5`).
- Sodium/Iris NeoForge (`-neoforge` Modrinth variants) -> Fabric variants
  (`sodium mc26.1.2-0.8.12-beta.2-fabric`-style, `iris 1.10.9+26.1-fabric`-style;
  confirm 26.2 builds).
- Veil: `veil-neoforge-<mc>` -> `veil-fabric-<mc>` (Veil ships both).
- Sable: `sable-neoforge-<mc>` -> `sable-fabric-<mc>` +
  `sable-companion-fabric-<mc>` via `https://maven.ryanhcode.dev/releases`
  (Sable already has a `fabric/` module; needs a 26.2 release — same author as
  this project, so coordinate versions).

## 6. Mixins, access wideners, datagen

- `simulated/aeronautics/offroad.mixins.json`: keep file names; bump
  `compatibilityLevel` `JAVA_21` -> `JAVA_25`; re-validate every target
  (vanilla splits + Fly package moves). Client mixins stay environment-gated.
- `simulated/aeronautics/offroad.accesswidener` (already `accessWidener v2
  named`) + `META-INF/accesstransformer.cfg` (NeoForge-only): keep the AT for
  NeoForge modules; wire the accesswidener into Loom
  (`loom.accessWidenerPath`) for Fabric modules.
- Datagen: NeoForge `runs.data` (`--all --mod ... --existing-mod create`) has
  no Fabric equivalent — port providers to Fabric datagen
  (`fabric-resource-loader-v1` + vanilla providers) or generate once and check
  in `src/generated/resources` like the `create-connected-fly` approach.

## 7. Suggested work order

1. Install JDK 25 + Gradle 9.5.1; `./gradlew :simulated:fabric:compileJava`
   and fix errors file by file (package moves first).
2. Stub-then-fill `fabric.service.*` impls; register in entrypoints.
3. Transfer-API wrappers (inventory/tanks/energy); fluids.
4. Networking + config sync.
5. Client: renderers, keybinds, JEI/REI/RRV plugins, Trinkets.
6. Mixins + accesswidener + datagen; runtime test on 26.2 + Loader 0.19.3 +
   Fabric API 0.154.2+26.2 + Fly `26.2-rc-2-6.0.9-1`.

## 8. Automated conversion progress (this branch)

Two verified bulk-rename passes were applied and committed (pure import-path
changes, 482 files, no logic touched):

- Pass 1: 314 fully-qualified Create/Catnip/Ponder references renamed after
  verifying each target class exists in
  `create-fly-26.2-rc-2-6.0.9-1.jar` (3,544 classes inventoried), e.g.
  `com.simibubi.create.*` -> `com.zurrtum.create.*` (client classes under
  `com.zurrtum.create.client.*`), `net.createmod.catnip.*` ->
  `com.zurrtum.create.{client.}catnip.*`.
- Pass 2: 8 more via unique same-name matches confirmed against Fly sources
  (goggle interfaces, `AirParticleData`, `RotationIndicatorParticleData`,
  `BrassDiodeScrollValueBehaviour`, `BlockEntityBehaviour`,
  `ValueSettingsBoard/Formatter`).
- Pass 3: 5 package/field maps verified against Fly sources
  (`AllCTTypes.OMNIDIRECTIONAL` field, ponder `api.element`/`api.scene`/
  `foundation.instruction` packages, `content.kinetics.base` package),
  plus `SimRenderTypes` retargeted to Fly's `CreateRenderTypes`
  (`itemGlowingSolid/Translucent` confirmed present) and a `CreateClient`
  Misclick corrected to Fly's client `Create` entrypoint
  (`ZAPPER_RENDER_HANDLER`/`VALUE_SETTINGS_HANDLER` live there).

Left for manual passes: ~67 unique Create refs with no Fly counterpart
(Registrate/datagen stack — Fly has no Registrate, datagen must be rewritten
on vanilla providers; `CreateBuiltInRegistries`/`CreateDataMaps`/`AllTags`;
JEI `ConversionRecipe`; piston members; `CreateClient`; assorted
foundation/content classes), plus the `com.tterrag.registrate` (33),
`net.neoforged` (22 in common), Sable/Veil/Curios/JEI-NeoForge layers.

Hard external blockers (verified 2026-09-10 via Modrinth API, no 26.2 builds
exist): **Sable** (latest `2.0.5+mc1.21.1`) and **Veil** (latest `4.5.0`
for 1.21.1). The mod cannot run on 26.2 until Sable 26.2 exists. Sable is by
the same author as this project, so coordinate there.
