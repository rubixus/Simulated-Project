package dev.ryanhcode.sable.physics.config.dimension_physics;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysicsData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class DimensionPhysicsData {
    static final java.util.Map<net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>, dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics> DIMENSION_PHYSICS_DATA = null;
    static final java.util.Map<net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level>, dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics> DEFAULT_DIMENSION_PHYSICS_DATA = null;
    public DimensionPhysicsData() {}
    public static dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics of(net.minecraft.world.level.Level p0) { return null; }
    public static dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics getDefault(net.minecraft.world.level.Level p0) { return null; }
    public static org.joml.Vector3d getGravity(net.minecraft.world.level.Level p0) { return null; }
    public static org.joml.Vector3d getGravity(net.minecraft.world.level.Level p0, org.joml.Vector3dc p1) { return null; }
    public static org.joml.Vector3d getGravity(net.minecraft.world.level.Level p0, org.joml.Vector3dc p1, org.joml.Vector3d p2) { return null; }
    public static double getAirPressure(net.minecraft.world.level.Level p0, org.joml.Vector3dc p1) { return 0.0; }
    public static org.joml.Vector3fc getMagneticNorth(net.minecraft.world.level.Level p0) { return null; }
    public static double getUniversalDrag(net.minecraft.server.level.ServerLevel p0) { return 0.0; }
    public static void addPhysicsWithPriority(net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> p0, dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics p1) {}
    public static void putPhysics(net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> p0, dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics p1) {}
    public static void clearPhysics() {}
    public static dev.ryanhcode.sable.network.packets.tcp.ClientboundDimensionPhysicsPacket compilePacket() { return null; }
}
