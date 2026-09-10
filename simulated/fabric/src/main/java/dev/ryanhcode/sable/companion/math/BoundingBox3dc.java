package dev.ryanhcode.sable.companion.math;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.companion.math.BoundingBox3dc
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BoundingBox3dc {
    public default boolean intersects(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return false; }
    public default boolean intersects(net.minecraft.world.phys.AABB p0) { return false; }
    public default boolean intersects(double p0, double p1, double p2, double p3, double p4, double p5) { return false; }
    public default boolean contains(org.joml.Vector3dc p0) { return false; }
    public default boolean contains(double p0, double p1, double p2) { return false; }
    public abstract double minX();
    public abstract double minY();
    public abstract double minZ();
    public abstract double maxX();
    public abstract double maxY();
    public abstract double maxZ();
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d expandTo(org.joml.Vector3dc p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d expandTo(double p0, double p1, double p2, dev.ryanhcode.sable.companion.math.BoundingBox3d p3) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d expandTo(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d expand(double p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d expand(double p0, double p1, double p2, dev.ryanhcode.sable.companion.math.BoundingBox3d p3) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d move(double p0, double p1, double p2, dev.ryanhcode.sable.companion.math.BoundingBox3d p3) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d intersect(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d transform(dev.ryanhcode.sable.companion.math.Pose3dc p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d transform(dev.ryanhcode.sable.companion.math.Pose3dc p0, org.joml.Matrix4d p1, dev.ryanhcode.sable.companion.math.BoundingBox3d p2) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d transform(org.joml.Matrix4dc p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d transformInverse(dev.ryanhcode.sable.companion.math.Pose3dc p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d transformInverse(dev.ryanhcode.sable.companion.math.Pose3dc p0, org.joml.Matrix4d p1, dev.ryanhcode.sable.companion.math.BoundingBox3d p2) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3d transformInverse(org.joml.Matrix4dc p0, dev.ryanhcode.sable.companion.math.BoundingBox3d p1) { return null; }
    public default org.joml.Vector3d center() { return null; }
    public default org.joml.Vector3d center(org.joml.Vector3d p0) { return null; }
    public default org.joml.Vector3d size() { return null; }
    public default org.joml.Vector3d size(org.joml.Vector3d p0) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i chunkBoundsFrom() { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i chunkBoundsFrom(dev.ryanhcode.sable.companion.math.BoundingBox3i p0) { return null; }
    public default double width() { return 0.0; }
    public default double height() { return 0.0; }
    public default double length() { return 0.0; }
    public default double volume() { return 0.0; }
    public default net.minecraft.world.phys.AABB toMojang() { return null; }
}
