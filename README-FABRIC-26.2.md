# Fabric 26.2 branch (Create Fly)

This branch (`fabric/26.2`) scaffolds Fabric loader modules for Minecraft 26.2
on top of the NeoForge 1.21.1 codebase, targeting
[Create Fly](https://github.com/ZurrTum/Create-Fly) (Fabric port of Create,
default branch `26.2`). Content is unchanged; only loader plumbing is added.

Fork: `rubixus/Simulated-Project`, branch `fabric/26.2`.

## Pinned versions

| Component | Version | Source |
|---|---|---|
| Minecraft | `26.2` | Fabric develop |
| Fabric Loader | `0.19.3` | Fabric blog 26.2 |
| Fabric Loom | `1.17-SNAPSHOT` | `create-deco-fly` (verified 26.2) |
| Gradle | `9.5.1` | Fabric blog 26.2 (repo wrapper is 9.4.1, bump required) |
| Java | `25` | required by 26.2 |
| Fabric API | `0.154.2+26.2` | `create-deco-fly` (verified 26.2) |
| Create Fly | `26.2-rc-2-6.0.9-1` | `maven.modrinth:create-fly` |

Create Fly keeps mod id `create`; packages moved
`com.simibubi.create` -> `com.zurrtum.create` (client-only classes additionally
moved under `com.zurrtum.create.client.*`). Ponder / Flywheel / Registrate ship
inside the Create Fly jar.

## What this scaffold adds

- `settings.gradle.kts`: includes `simulated:fabric`, `aeronautics:fabric`, `offroad:fabric`
- `gradle.properties`: `minecraft_version=26.2`, `java_version=25`,
  `fabric_loader_version=0.19.3`, `fabric_loom_version=1.17-SNAPSHOT`,
  `fabric_version=0.154.2+26.2`, `create_fly_version=26.2-rc-2-6.0.9-1`
- `buildSrc/.../multiloader-fabric.gradle`: shared Fabric loader conventions
  (wires `:common` java + resources, mirrors `multiloader-loader.gradle`)
- Per mod under `<mod>/fabric/`:
  - `build.gradle` (Loom, `splitEnvironmentSourceSets`, deps above)
  - `src/main/resources/fabric.mod.json` (entrypoints, `depends` on `create`)
  - Fabric entrypoints calling the existing common `init()` methods
- `PORTING-NOTES-FABRIC-26.2.md`: full mechanical mapping + remaining work list
- `.github/workflows/build-fabric-26.2.yml`: CI sketch (Java 25, Fabric modules)

## What is NOT done yet (honest status)

The Fabric modules plus 322 verified Create -> Create Fly import renames
(482 files, targets checked against the Fly 26.2 jar) are committed. Remaining
before anything compiles: ~67 unique Create refs with no Fly counterpart
(Registrate/datagen stack, registries, JEI compat), the NeoForge-capability
wrappers -> Transfer API, networking/config rewrite, Fabric service impls,
mixin re-validation, and — blocking everything at runtime — **Sable 26.2 and
Veil 26.2 do not exist yet** (latest: Sable `2.0.5+mc1.21.1`, Veil `4.5.0`).
See `PORTING-NOTES-FABRIC-26.2.md` sections 3-8 for the full list.

Do not merge this branch into `main`; keep `main` on NeoForge 1.21.1 until the
Fabric modules go green.

## Build (once toolchain is ready)

Requires JDK 25 and Gradle 9.5.1 (`./gradlew wrapper --gradle-version 9.5.1`).

```bash
./gradlew :simulated:fabric:build :aeronautics:fabric:build :offroad:fabric:build
```

Runtime test instance: Fabric Loader 0.19.3 + Fabric API 0.154.2+26.2 +
Create Fly `26.2-rc-2-6.0.9-1` on Minecraft 26.2, Java 25.
