package dev.ryanhcode.sable.companion.math;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.companion.math.BoundingBox3ic
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BoundingBox3ic {
    public default boolean intersects(dev.ryanhcode.sable.companion.math.BoundingBox3ic p0) { return false; }
    public default boolean intersects(net.minecraft.world.level.levelgen.structure.BoundingBox p0) { return false; }
    public default boolean intersects(int p0, int p1, int p2, int p3, int p4, int p5) { return false; }
    public default boolean contains(org.joml.Vector3ic p0) { return false; }
    public default boolean contains(int p0, int p1, int p2) { return false; }
    public default boolean contains(org.joml.Vector3dc p0) { return false; }
    public abstract int minX();
    public abstract int minY();
    public abstract int minZ();
    public abstract int maxX();
    public abstract int maxY();
    public abstract int maxZ();
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i expandTo(org.joml.Vector3ic p0, dev.ryanhcode.sable.companion.math.BoundingBox3i p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i expandTo(int p0, int p1, int p2, dev.ryanhcode.sable.companion.math.BoundingBox3i p3) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i expandTo(dev.ryanhcode.sable.companion.math.BoundingBox3ic p0, dev.ryanhcode.sable.companion.math.BoundingBox3i p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i move(org.joml.Vector3ic p0, dev.ryanhcode.sable.companion.math.BoundingBox3i p1) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i move(int p0, int p1, int p2, dev.ryanhcode.sable.companion.math.BoundingBox3i p3) { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i intersect(dev.ryanhcode.sable.companion.math.BoundingBox3ic p0, dev.ryanhcode.sable.companion.math.BoundingBox3i p1) { return null; }
    public default org.joml.Vector3i center(org.joml.Vector3i p0) { return null; }
    public default org.joml.Vector3i size(org.joml.Vector3i p0) { return null; }
    public default int width() { return 0; }
    public default int height() { return 0; }
    public default int length() { return 0; }
    public default int volume() { return 0; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i chunkBoundsFrom() { return null; }
    public default dev.ryanhcode.sable.companion.math.BoundingBox3i chunkBoundsFrom(dev.ryanhcode.sable.companion.math.BoundingBox3i p0) { return null; }
    public default net.minecraft.world.phys.AABB toAABB() { return null; }
    public default net.minecraft.world.level.levelgen.structure.BoundingBox toMojang() { return null; }
}
