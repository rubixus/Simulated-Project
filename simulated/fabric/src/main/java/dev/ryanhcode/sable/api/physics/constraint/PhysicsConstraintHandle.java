package dev.ryanhcode.sable.api.physics.constraint;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.constraint.PhysicsConstraintHandle
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface PhysicsConstraintHandle {
    public abstract void getJointImpulses(org.joml.Vector3d p0, org.joml.Vector3d p1);
    public abstract void setContactsEnabled(boolean p0);
    public abstract void setMotor(dev.ryanhcode.sable.api.physics.constraint.ConstraintJointAxis p0, double p1, double p2, double p3, boolean p4, double p5);
    public abstract void remove();
    public abstract boolean isValid();
}
