package dev.ryanhcode.sable.sublevel.system;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.system.SubLevelTrackingSystem
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelTrackingSystem implements dev.ryanhcode.sable.api.sublevel.SubLevelObserver {
    public SubLevelTrackingSystem(net.minecraft.server.level.ServerLevel p0) {}
    public void onSubLevelAdded(dev.ryanhcode.sable.sublevel.SubLevel p0) {}
    public void onSubLevelRemoved(dev.ryanhcode.sable.sublevel.SubLevel p0, dev.ryanhcode.sable.sublevel.storage.SubLevelRemovalReason p1) {}
    public foundry.veil.api.network.VeilPacketManager.PacketSink serverWidePlayerSink(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) { return null; }
    public void tick(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0) {}
    public int getInterpolationTick() { return 0; }
    public void addTrackingPlugin(dev.ryanhcode.sable.api.sublevel.SubLevelTrackingPlugin p0) {}
}
