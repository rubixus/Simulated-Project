package dev.ryanhcode.sable.api.math;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.math.OrientedBoundingBox3d
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class OrientedBoundingBox3d {
    public static final org.joml.Vector3dc RIGHT = null;
    public static final org.joml.Vector3dc UP = null;
    public static final org.joml.Vector3dc FORWARD = null;
    public OrientedBoundingBox3d(dev.ryanhcode.sable.api.math.LevelReusedVectors p0) {}
    public OrientedBoundingBox3d(org.joml.Vector3dc p0, org.joml.Vector3dc p1, org.joml.Quaterniondc p2, dev.ryanhcode.sable.api.math.LevelReusedVectors p3) {}
    public OrientedBoundingBox3d(double p0, double p1, double p2, double p3, double p4, double p5, org.joml.Quaterniondc p6, dev.ryanhcode.sable.api.math.LevelReusedVectors p7) {}
    public void set(org.joml.Vector3dc p0, org.joml.Vector3dc p1, org.joml.Quaterniondc p2) {}
    public dev.ryanhcode.sable.api.math.OrientedBoundingBox3d setPosition(org.joml.Vector3dc p0) { return null; }
    public dev.ryanhcode.sable.api.math.OrientedBoundingBox3d setDimensions(org.joml.Vector3dc p0) { return null; }
    public dev.ryanhcode.sable.api.math.OrientedBoundingBox3d setOrientation(org.joml.Quaterniondc p0) { return null; }
    public org.joml.Quaterniond getOrientation() { return null; }
    public org.joml.Vector3d getPosition() { return null; }
    public org.joml.Vector3d getDimensions() { return null; }
    public org.joml.Vector3d[] vertices(org.joml.Vector3d[] p0) { return null; }
    public org.joml.Vector3d rotate(org.joml.Vector3d p0) { return null; }
    public static double getOverlap(org.joml.Vector2d p0, org.joml.Vector2d p1) { return 0.0; }
    public static org.joml.Vector3d sat(dev.ryanhcode.sable.api.math.OrientedBoundingBox3d p0, dev.ryanhcode.sable.api.math.OrientedBoundingBox3d p1) { return null; }
    public static org.joml.Vector3d sat(dev.ryanhcode.sable.api.math.OrientedBoundingBox3d p0, dev.ryanhcode.sable.api.math.OrientedBoundingBox3d p1, org.joml.Vector3d p2) { return null; }
    public static org.joml.Vector3d[] genChecks(org.joml.Vector3d p0, org.joml.Vector3d p1, org.joml.Vector3d p2, org.joml.Vector3d p3, org.joml.Vector3d p4, org.joml.Vector3d p5, org.joml.Vector3d[] p6) { return null; }
    public static org.joml.Vector3dc satToleranced(dev.ryanhcode.sable.api.math.OrientedBoundingBox3d p0, dev.ryanhcode.sable.api.math.OrientedBoundingBox3d p1, double p2) { return null; }
    public static org.joml.Vector2d checkSeparation(org.joml.Vector3d[] p0, org.joml.Vector3d p1, org.joml.Vector2d p2) { return null; }
}
