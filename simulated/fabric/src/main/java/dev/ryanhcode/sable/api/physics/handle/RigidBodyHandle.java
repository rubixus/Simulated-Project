package dev.ryanhcode.sable.api.physics.handle;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class RigidBodyHandle {
    public static dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle of(net.minecraft.server.level.ServerLevel p0, dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p1) { return null; }
    public static dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle of(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) { return null; }
    public RigidBodyHandle(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p1) {}
    public void applyImpulseAtPoint(org.joml.Vector3dc p0, org.joml.Vector3dc p1) {}
    public void applyImpulseAtPoint(net.minecraft.world.phys.Vec3 p0, net.minecraft.world.phys.Vec3 p1) {}
    public void applyLinearAndAngularImpulse(org.joml.Vector3dc p0, org.joml.Vector3dc p1) {}
    public void applyLinearAndAngularImpulse(org.joml.Vector3dc p0, org.joml.Vector3dc p1, boolean p2) {}
    public void applyLinearImpulse(org.joml.Vector3dc p0) {}
    public void applyAngularImpulse(org.joml.Vector3dc p0) {}
    public void applyTorqueImpulse(org.joml.Vector3dc p0) {}
    public org.joml.Vector3dc getLinearVelocity() { return null; }
    public org.joml.Vector3dc getAngularVelocity() { return null; }
    public org.joml.Vector3d getLinearVelocity(org.joml.Vector3d p0) { return null; }
    public org.joml.Vector3d getAngularVelocity(org.joml.Vector3d p0) { return null; }
    public void applyForcesAndReset(dev.ryanhcode.sable.api.physics.force.ForceTotal p0) {}
    public void addLinearAndAngularVelocity(org.joml.Vector3dc p0, org.joml.Vector3dc p1) {}
    public void teleport(org.joml.Vector3dc p0, org.joml.Quaterniondc p1) {}
    public boolean isValid() { return false; }
}
