package foundry.veil.api.network;

// AUTO-GENERATED STUB for foundry.veil.api.network.VeilPacketManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilPacketManager {
    public static final foundry.veil.api.network.VeilPacketManager.Factory FACTORY = new foundry.veil.api.network.VeilPacketManager.Factory() { @Override public foundry.veil.api.network.VeilPacketManager create(java.lang.String p0, java.lang.String p1) { return null; } };
    public static foundry.veil.api.network.VeilPacketManager create(java.lang.String p0, java.lang.String p1) { return null; }
    public default <T extends net.minecraft.network.protocol.common.custom.CustomPacketPayload> void registerClientbound(java.lang.Object p0, net.minecraft.network.codec.StreamCodec<? super net.minecraft.network.RegistryFriendlyByteBuf, T> p1, foundry.veil.api.network.VeilPacketManager.PacketHandler<foundry.veil.api.network.handler.ClientPacketContext, T> p2) {}
    public abstract <T extends net.minecraft.network.protocol.common.custom.CustomPacketPayload> void registerClientbound(java.lang.Object p0, net.minecraft.network.codec.StreamCodec<? super net.minecraft.network.RegistryFriendlyByteBuf, T> p1, foundry.veil.api.network.VeilPacketManager.PacketHandler<foundry.veil.api.network.handler.ClientPacketContext, T> p2, boolean p3);
    public default <T extends net.minecraft.network.protocol.common.custom.CustomPacketPayload> void registerServerbound(java.lang.Object p0, net.minecraft.network.codec.StreamCodec<? super net.minecraft.network.RegistryFriendlyByteBuf, T> p1, foundry.veil.api.network.VeilPacketManager.PacketHandler<foundry.veil.api.network.handler.ServerPacketContext, T> p2) {}
    public abstract <T extends net.minecraft.network.protocol.common.custom.CustomPacketPayload> void registerServerbound(java.lang.Object p0, net.minecraft.network.codec.StreamCodec<? super net.minecraft.network.RegistryFriendlyByteBuf, T> p1, foundry.veil.api.network.VeilPacketManager.PacketHandler<foundry.veil.api.network.handler.ServerPacketContext, T> p2, boolean p3);
    public static foundry.veil.api.network.VeilPacketManager.PacketSink server() { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink player(net.minecraft.server.level.ServerPlayer p0) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink level(net.minecraft.server.level.ServerLevel p0) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink around(net.minecraft.server.level.ServerPlayer p0, net.minecraft.server.level.ServerLevel p1, double p2, double p3, double p4, double p5) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink all(java.lang.Object p0) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink tracking(net.minecraft.world.entity.Entity p0) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink trackingAndSelf(net.minecraft.world.entity.Entity p0) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink tracking(net.minecraft.server.level.ServerLevel p0, net.minecraft.world.level.ChunkPos p1) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink tracking(net.minecraft.server.level.ServerLevel p0, net.minecraft.core.BlockPos p1) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink tracking(net.minecraft.server.level.ServerLevel p0, net.minecraft.core.BlockPos p1, net.minecraft.core.BlockPos p2) { return null; }
    public static foundry.veil.api.network.VeilPacketManager.PacketSink tracking(net.minecraft.world.level.block.entity.BlockEntity p0) { return null; }
    public interface Factory {
        public abstract foundry.veil.api.network.VeilPacketManager create(java.lang.String p0, java.lang.String p1);
    }
    public interface PacketHandler<T extends foundry.veil.api.network.handler.PacketContext, P extends net.minecraft.network.protocol.common.custom.CustomPacketPayload> {
        public abstract void handlePacket(P p0, T p1);
    }
    public interface PacketSink {
        public default void sendPacket(net.minecraft.network.protocol.common.custom.CustomPacketPayload... p0) {}
        public abstract void sendPacket(net.minecraft.network.protocol.Packet<?> p0);
    }
}
