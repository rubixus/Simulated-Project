package dev.ryanhcode.sable.api.physics.force;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.force.QueuedForceGroup
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class QueuedForceGroup {
    public QueuedForceGroup(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) {}
    public dev.ryanhcode.sable.api.physics.force.ForceTotal getForceTotal() { return null; }
    public void applyAndRecordPointForce(org.joml.Vector3dc p0, org.joml.Vector3dc p1) {}
    public void recordPointForce(org.joml.Vector3dc p0, org.joml.Vector3dc p1) {}
    public java.util.List<dev.ryanhcode.sable.api.physics.force.QueuedForceGroup.PointForce> getRecordedPointForces() { return null; }
    public void reset() {}
    static public record PointForce(org.joml.Vector3dc point, org.joml.Vector3dc force) {
    }
}
