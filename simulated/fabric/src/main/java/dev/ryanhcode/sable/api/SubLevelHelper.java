package dev.ryanhcode.sable.api;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.SubLevelHelper
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public final class SubLevelHelper {
    public SubLevelHelper() {}
    public static void pushEntityLocal(dev.ryanhcode.sable.sublevel.SubLevel p0, net.minecraft.world.entity.Entity p1) {}
    public static void popEntityLocal(dev.ryanhcode.sable.sublevel.SubLevel p0, net.minecraft.world.entity.Entity p1) {}
    public static void pushEntityLocal(dev.ryanhcode.sable.sublevel.SubLevel p0, net.minecraft.world.entity.Entity p1, java.lang.Object p2) {}
    public static void popEntityLocal(dev.ryanhcode.sable.sublevel.SubLevel p0, net.minecraft.world.entity.Entity p1, java.lang.Object p2) {}
    public static org.joml.Vector3d getVelocityRelativeToAir(net.minecraft.world.level.Level p0, org.joml.Vector3dc p1, org.joml.Vector3d p2) { return null; }
    public static void registerWindProvider(java.util.function.BiFunction<org.joml.Vector3dc, net.minecraft.world.level.Level, org.joml.Vector3dc> p0) {}
    public static java.util.Collection<dev.ryanhcode.sable.sublevel.ServerSubLevel> getLoadingDependencyChain(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) { return null; }
    public static java.util.Collection<dev.ryanhcode.sable.sublevel.SubLevel> getConnectedChain(dev.ryanhcode.sable.sublevel.SubLevel p0) { return null; }
    static class EntityRot {
        public void apply(net.minecraft.world.entity.Entity p0) {}
        public void copy(net.minecraft.world.entity.Entity p0) {}
    }
}
