package dev.ryanhcode.sable.network.packets.tcp;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.network.packets.tcp.ClientboundDimensionPhysicsPacket
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record ClientboundDimensionPhysicsPacket(java.util.List<dev.ryanhcode.sable.physics.config.dimension_physics.DimensionPhysics> dimensionPhysics) {
    public static final java.lang.Object TYPE = null;
    public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, dev.ryanhcode.sable.network.packets.tcp.ClientboundDimensionPhysicsPacket> CODEC = null;
    public void handle(foundry.veil.api.network.handler.PacketContext p0) {}
}
