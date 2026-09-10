package dev.ryanhcode.sable.mixinterface.entity.entity_sublevel_collision;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.mixinterface.entity.entity_sublevel_collision.EntityMovementExtension
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface EntityMovementExtension {
    public abstract dev.ryanhcode.sable.sublevel.entity_collision.SubLevelEntityCollision.CollisionInfo sable$getCollisionInfo();
    public abstract dev.ryanhcode.sable.sublevel.SubLevel sable$getTrackingSubLevel();
    public abstract java.util.UUID sable$getLastTrackingSubLevelID();
    public abstract void sable$setPosField(net.minecraft.world.phys.Vec3 p0);
    public abstract void sable$setTrackingSubLevel(dev.ryanhcode.sable.sublevel.SubLevel p0);
    public abstract void sable$setLastTrackingSubLevelID(java.util.UUID p0);
    public abstract net.minecraft.core.BlockPos sable$getInBlockStatePos();
}
