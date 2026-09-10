package dev.ryanhcode.sable.api.physics.object.box;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.object.box.BoxPhysicsObject
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class BoxPhysicsObject implements dev.ryanhcode.sable.api.physics.object.ArbitraryPhysicsObject, dev.ryanhcode.sable.api.physics.PhysicsPipelineBody {
    protected dev.ryanhcode.sable.api.physics.object.box.BoxHandle handle = null;
    public BoxPhysicsObject(dev.ryanhcode.sable.companion.math.Pose3dc p0, org.joml.Vector3dc p1, double p2) {}
    public void getBoundingBox(dev.ryanhcode.sable.companion.math.BoundingBox3d p0) {}
    public void updatePose() {}
    public void onUnloaded(dev.ryanhcode.sable.sublevel.storage.holding.SubLevelHoldingChunkMap p0, net.minecraft.world.level.ChunkPos p1) {}
    public void onRemoved() {}
    protected void remove() {}
    public void onAddition(dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p0) {}
    public void wakeUp() {}
    public dev.ryanhcode.sable.companion.math.Pose3dc getPose() { return null; }
    public org.joml.Vector3dc getHalfExtents() { return null; }
    public double getMass() { return 0.0; }
    public boolean isActive() { return false; }
    public int getRuntimeId() { return 0; }
    public dev.ryanhcode.sable.api.physics.mass.MassData getMassTracker() { return null; }
    public boolean isRemoved() { return false; }
}
