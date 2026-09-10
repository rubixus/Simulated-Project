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

This is a **scaffold, not a working port**. The common code (~905 Java files)
still imports `com.simibubi.create` (~1,100 refs), NeoForge APIs, Sable/Veil
NeoForge variants, Curios, and JEI-NeoForge. Compiling
`:simulated:fabric:build` will fail until the porting work in
`PORTING-NOTES-FABRIC-26.2.md` is worked through file by file, ideally with
Java 25 + Gradle 9.5.1 installed so each step can be compile-checked.

Do not merge this branch into `main`; keep `main` on NeoForge 1.21.1 until the
Fabric modules go green.

## Build (once toolchain is ready)

Requires JDK 25 and Gradle 9.5.1 (`./gradlew wrapper --gradle-version 9.5.1`).

```bash
./gradlew :simulated:fabric:build :aeronautics:fabric:build :offroad:fabric:build
```

Runtime test instance: Fabric Loader 0.19.3 + Fabric API 0.154.2+26.2 +
Create Fly `26.2-rc-2-6.0.9-1` on Minecraft 26.2, Java 25.
