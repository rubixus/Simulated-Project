package dev.ryanhcode.sable.api.physics.force;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.force.ForceTotal
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ForceTotal {
    public ForceTotal() {}
    public void applyForces(dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle p0) {}
    public void reset() {}
    public void applyForceTotal(dev.ryanhcode.sable.api.physics.force.ForceTotal p0) {}
    public void applyLinearAndAngularImpulse(org.joml.Vector3dc p0, org.joml.Vector3dc p1) {}
    public void applyLinearImpulse(org.joml.Vector3dc p0) {}
    public void applyAngularImpulse(org.joml.Vector3dc p0) {}
    public void applyTorqueImpulse(org.joml.Vector3dc p0) {}
    public void applyImpulseAtPoint(dev.ryanhcode.sable.api.physics.mass.MassData p0, org.joml.Vector3dc p1, org.joml.Vector3dc p2) {}
    public void applyImpulseAtPoint(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, org.joml.Vector3dc p1, org.joml.Vector3dc p2) {}
    public org.joml.Vector3d getLocalForce() { return null; }
    public org.joml.Vector3d getLocalTorque() { return null; }
    public void applyImpulseAtPoint(dev.ryanhcode.sable.api.physics.mass.MassTracker p0, net.minecraft.world.phys.Vec3 p1, net.minecraft.world.phys.Vec3 p2) {}
}
