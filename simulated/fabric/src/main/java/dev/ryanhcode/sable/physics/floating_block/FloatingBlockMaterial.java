package dev.ryanhcode.sable.physics.floating_block;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.floating_block.FloatingBlockMaterial
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record FloatingBlockMaterial(boolean preventSelfLift, boolean scaleWithPressure, boolean scaleWithGravity, double liftStrength, double transitionSpeed, double slowVerticalFriction, double fastVerticalFriction, double slowHorizontalFriction, double fastHorizontalFriction) {
    public static final com.mojang.serialization.Codec<dev.ryanhcode.sable.physics.floating_block.FloatingBlockMaterial> CODEC = null;
    public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, dev.ryanhcode.sable.physics.floating_block.FloatingBlockMaterial> STREAM_CODEC = null;
}
