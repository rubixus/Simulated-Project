package dev.ryanhcode.sable.network.packets.tcp;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.network.packets.tcp.ClientboundFloatingBlockMaterialPacket
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record ClientboundFloatingBlockMaterialPacket(java.lang.Object name, dev.ryanhcode.sable.physics.floating_block.FloatingBlockMaterial material) {
    public static final java.lang.Object TYPE = null;
    public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, dev.ryanhcode.sable.network.packets.tcp.ClientboundFloatingBlockMaterialPacket> CODEC = null;
    public void handle(foundry.veil.api.network.handler.PacketContext p0) {}
}
