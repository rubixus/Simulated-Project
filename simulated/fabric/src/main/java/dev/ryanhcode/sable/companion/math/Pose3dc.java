package dev.ryanhcode.sable.companion.math;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.companion.math.Pose3dc
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface Pose3dc {
    public abstract org.joml.Vector3dc position();
    public abstract org.joml.Quaterniondc orientation();
    public abstract org.joml.Vector3dc rotationPoint();
    public abstract org.joml.Vector3dc scale();
    public default org.joml.Vector3d transformPosition(org.joml.Vector3dc p0, org.joml.Vector3d p1) { return null; }
    public default net.minecraft.world.phys.Vec3 transformPosition(net.minecraft.world.phys.Vec3 p0) { return null; }
    public default net.minecraft.world.phys.Vec3 transformPositionInverse(net.minecraft.world.phys.Vec3 p0) { return null; }
    public default org.joml.Vector3d transformPositionInverse(org.joml.Vector3dc p0, org.joml.Vector3d p1) { return null; }
    public default org.joml.Vector3d transformNormal(org.joml.Vector3dc p0, org.joml.Vector3d p1) { return null; }
    public default org.joml.Vector3d transformNormalInverse(org.joml.Vector3dc p0, org.joml.Vector3d p1) { return null; }
    public default org.joml.Vector3d transformPosition(org.joml.Vector3d p0) { return null; }
    public default org.joml.Vector3d transformPositionInverse(org.joml.Vector3d p0) { return null; }
    public default org.joml.Vector3d transformNormal(org.joml.Vector3d p0) { return null; }
    public default org.joml.Vector3d transformNormalInverse(org.joml.Vector3d p0) { return null; }
    public default net.minecraft.world.phys.Vec3 transformNormal(net.minecraft.world.phys.Vec3 p0) { return null; }
    public default net.minecraft.world.phys.Vec3 transformNormalInverse(net.minecraft.world.phys.Vec3 p0) { return null; }
    public default dev.ryanhcode.sable.companion.math.Pose3d lerp(dev.ryanhcode.sable.companion.math.Pose3dc p0, double p1, dev.ryanhcode.sable.companion.math.Pose3d p2) { return null; }
    public default org.joml.Matrix4d bakeIntoMatrix(org.joml.Matrix4d p0) { return null; }
    public default boolean withinTolerance(dev.ryanhcode.sable.companion.math.Pose3d p0, double p1, double p2) { return false; }
}
