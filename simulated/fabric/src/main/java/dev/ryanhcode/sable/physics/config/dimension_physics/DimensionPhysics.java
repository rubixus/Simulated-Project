package dev.ryanhcode.sable.physics.config.dimension_physics;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record DimensionPhysics(java.lang.Object dimension, int priority, java.util.Optional<java.lang.Float> universalDrag, java.util.Optional<org.joml.Vector3f> baseGravity, java.util.Optional<java.lang.Double> basePressure, java.util.Optional<dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction> pressureFunction, java.util.Optional<org.joml.Vector3f> magneticNorth, boolean ignoreChunks) {
    public static final org.joml.Vector3f DEFAULT_GRAVITY = null;
    public static final org.joml.Vector3f DEFAULT_MAGNETIC_NORTH = null;
    public static final double DEFAULT_PRESSURE = 1.0d;
    public static final com.mojang.serialization.Codec<dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics> CODEC = null;
    public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics> STREAM_CODEC = null;
    public static dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics createDefault(net.minecraft.world.level.Level p0) { return null; }
}
