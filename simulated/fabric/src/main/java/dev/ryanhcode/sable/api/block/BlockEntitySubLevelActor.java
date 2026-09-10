package dev.ryanhcode.sable.api.block;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.block.BlockEntitySubLevelActor
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BlockEntitySubLevelActor {
    public default void sable$tick(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) {}
    public default void sable$physicsTick(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle p1, double p2) {}
    public default java.lang.Iterable<dev.ryanhcode.sable.sublevel.SubLevel> sable$getLoadingDependencies() { return null; }
    public default java.lang.Iterable<dev.ryanhcode.sable.sublevel.SubLevel> sable$getConnectionDependencies() { return null; }
}
