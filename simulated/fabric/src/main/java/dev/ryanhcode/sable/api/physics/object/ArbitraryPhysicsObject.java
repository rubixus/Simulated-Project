package dev.ryanhcode.sable.api.physics.object;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.object.ArbitraryPhysicsObject
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ArbitraryPhysicsObject {
    public abstract void getBoundingBox(dev.ryanhcode.sable.companion.math.BoundingBox3d p0);
    public abstract void onUnloaded(dev.ryanhcode.sable.sublevel.storage.holding.SubLevelHoldingChunkMap p0, net.minecraft.world.level.ChunkPos p1);
    public abstract void onRemoved();
    public abstract void onAddition(dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p0);
    public abstract void wakeUp();
}
