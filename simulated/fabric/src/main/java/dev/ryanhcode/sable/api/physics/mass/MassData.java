package dev.ryanhcode.sable.api.physics.mass;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.mass.MassData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface MassData {
    public abstract double getMass();
    public abstract double getInverseMass();
    public abstract org.joml.Matrix3dc getInertiaTensor();
    public abstract org.joml.Matrix3dc getInverseInertiaTensor();
    public abstract org.joml.Vector3dc getCenterOfMass();
    public default boolean isInvalid() { return false; }
    public default double getInverseNormalMass(org.joml.Vector3dc p0, org.joml.Vector3dc p1) { return 0.0; }
}
