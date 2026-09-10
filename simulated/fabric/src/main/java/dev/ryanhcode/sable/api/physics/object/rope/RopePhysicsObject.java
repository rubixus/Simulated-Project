package dev.ryanhcode.sable.api.physics.object.rope;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.object.rope.RopePhysicsObject
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class RopePhysicsObject implements dev.ryanhcode.sable.api.physics.object.ArbitraryPhysicsObject {
    protected final it.unimi.dsi.fastutil.objects.ObjectList<org.joml.Vector3d> points = null;
    protected final it.unimi.dsi.fastutil.objects.ObjectList<org.joml.Vector3d> pointsView = null;
    protected final double collisionRadius = 0.0;
    protected boolean active = false;
    protected dev.ryanhcode.sable.api.physics.object.rope.RopeHandle handle = null;
    protected org.joml.Vector3dc startAttachmentLocation = null;
    protected dev.ryanhcode.sable.sublevel.ServerSubLevel startAttachmentSubLevel = null;
    public RopePhysicsObject(java.util.Collection<org.joml.Vector3d> p0, double p1) {}
    public void getBoundingBox(dev.ryanhcode.sable.companion.math.BoundingBox3d p0) {}
    public double getCollisionRadius() { return 0.0; }
    public it.unimi.dsi.fastutil.objects.ObjectList<org.joml.Vector3d> getPoints() { return null; }
    public void updatePose() {}
    public void setFirstSegmentLength(double p0) {}
    public void removeFirstPoint() {}
    public void addPoint(org.joml.Vector3dc p0) {}
    public void setAttachment(dev.ryanhcode.sable.api.physics.object.rope.RopeHandle.AttachmentPoint p0, org.joml.Vector3dc p1, dev.ryanhcode.sable.sublevel.ServerSubLevel p2) {}
    public void onUnloaded(dev.ryanhcode.sable.sublevel.storage.holding.SubLevelHoldingChunkMap p0, net.minecraft.world.level.ChunkPos p1) {}
    public void onRemoved() {}
    protected void remove() {}
    public void onAddition(dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p0) {}
    public void wakeUp() {}
    public boolean isActive() { return false; }
}
