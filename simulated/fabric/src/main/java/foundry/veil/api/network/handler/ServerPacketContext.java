package foundry.veil.api.network.handler;

// AUTO-GENERATED STUB for foundry.veil.api.network.handler.ServerPacketContext
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ServerPacketContext {
    public default java.lang.Object server() { return null; }
    public abstract net.minecraft.server.level.ServerPlayer player();
    public default net.minecraft.world.level.Level level() { return null; }
}
