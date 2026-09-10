package foundry.veil.api.network.handler;

// AUTO-GENERATED STUB for foundry.veil.api.network.handler.PacketContext
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface PacketContext {
    public abstract net.minecraft.world.entity.player.Player player();
    public default net.minecraft.world.level.Level level() { return null; }
    public abstract net.minecraft.network.protocol.Packet<?> createPacket(net.minecraft.network.protocol.common.custom.CustomPacketPayload p0);
    public default void sendPacket(net.minecraft.network.protocol.common.custom.CustomPacketPayload p0) {}
    public default void sendPacket(net.minecraft.network.protocol.common.custom.CustomPacketPayload p0, net.minecraft.network.PacketSendListener p1) {}
    public default void sendPacket(net.minecraft.network.protocol.Packet<?> p0) {}
    public abstract void sendPacket(net.minecraft.network.protocol.Packet<?> p0, net.minecraft.network.PacketSendListener p1);
    public abstract void disconnect(net.minecraft.network.chat.Component p0);
}
