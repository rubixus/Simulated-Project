package dev.ryanhcode.sable.companion.math;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.companion.math.BoundingBox3d
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public final class BoundingBox3d implements dev.ryanhcode.sable.companion.math.BoundingBox3dc {
    public static final dev.ryanhcode.sable.companion.math.BoundingBox3d EMPTY = new dev.ryanhcode.sable.companion.math.BoundingBox3d();
    public static com.mojang.serialization.Codec<dev.ryanhcode.sable.companion.math.BoundingBox3d> CODEC = null;
    public double minX = 0.0;
    public double minY = 0.0;
    public double minZ = 0.0;
    public double maxX = 0.0;
    public double maxY = 0.0;
    public double maxZ = 0.0;
    public BoundingBox3d(double p0, double p1, double p2, double p3, double p4, double p5) {}
    public BoundingBox3d(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) {}
    public BoundingBox3d(net.minecraft.world.phys.AABB p0) {}
    public BoundingBox3d(net.minecraft.world.level.levelgen.structure.BoundingBox p0) {}
    public BoundingBox3d(net.minecraft.core.BlockPos p0) {}
    public BoundingBox3d(dev.ryanhcode.sable.companion.math.BoundingBox3ic p0) {}
    public BoundingBox3d(net.minecraft.world.phys.Vec3 p0, net.minecraft.world.phys.Vec3 p1) {}
    public BoundingBox3d(net.minecraft.core.Position p0, net.minecraft.core.Position p1) {}
    public BoundingBox3d() {}
    public dev.ryanhcode.sable.companion.math.BoundingBox3d set(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d set(net.minecraft.world.phys.AABB p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d set(double p0, double p1, double p2, double p3, double p4, double p5) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d setUnchecked(double p0, double p1, double p2, double p3, double p4, double p5) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d setUnchecked(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d expandTo(org.joml.Vector3dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d expandTo(double p0, double p1, double p2) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d expandTo(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d expand(double p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d expand(double p0, double p1, double p2) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d move(double p0, double p1, double p2) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d intersect(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d transform(dev.ryanhcode.sable.companion.math.Pose3dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d transform(dev.ryanhcode.sable.companion.math.Pose3dc p0, org.joml.Matrix4d p1) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d transform(org.joml.Matrix4dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d transformInverse(dev.ryanhcode.sable.companion.math.Pose3dc p0) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d transformInverse(dev.ryanhcode.sable.companion.math.Pose3dc p0, org.joml.Matrix4d p1) { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3d transformInverse(org.joml.Matrix4dc p0) { return null; }
    public double minX() { return 0.0; }
    public double minY() { return 0.0; }
    public double minZ() { return 0.0; }
    public double maxX() { return 0.0; }
    public double maxY() { return 0.0; }
    public double maxZ() { return 0.0; }
}
