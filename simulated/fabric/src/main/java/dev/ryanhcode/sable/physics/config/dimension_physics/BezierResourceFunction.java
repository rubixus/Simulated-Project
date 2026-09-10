package dev.ryanhcode.sable.physics.config.dimension_physics;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class BezierResourceFunction {
    public static final com.mojang.serialization.Codec<dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction> CODEC = null;
    public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction> STREAM_CODEC = null;
    public BezierResourceFunction(java.util.List<dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction.BezierPoint> p0) {}
    public BezierResourceFunction() {}
    public java.util.List<dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction.BezierPoint> getPoints() { return null; }
    public void addPoint(dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction.BezierPoint p0) {}
    public int pointSize() { return 0; }
    public double evaluateFunction(double p0) { return 0.0; }
    static public record BezierPoint(double altitude, double value, double slope) {
        public static final com.mojang.serialization.Codec<dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction.BezierPoint> CODEC = null;
        public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, dev.ryanhcode.sable.physics.config.dimension_physics.BezierResourceFunction.BezierPoint> STREAM_CODEC = null;
    }
}
