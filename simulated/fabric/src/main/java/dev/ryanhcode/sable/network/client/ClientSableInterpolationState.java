package dev.ryanhcode.sable.network.client;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.network.client.ClientSableInterpolationState
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ClientSableInterpolationState {
    public static final boolean RENDER_INTERPOLATION_BOUNDS = false;
    public double mostRecentInterpolationTick = 0.0;
    public double lastInterpolationTick = 0.0;
    public ClientSableInterpolationState() {}
    public void tick() {}
    public double getTickPointer() { return 0.0; }
    public void receiveSnapshot(dev.ryanhcode.sable.sublevel.ClientSubLevel p0, int p1, dev.ryanhcode.sable.companion.math.Pose3dc p2, dev.ryanhcode.sable.network.packets.PacketReceiveMode p3) {}
    public void addDebugInfo(java.util.function.Consumer<java.lang.String> p0) {}
    public double getInterpolationDelay() { return 0.0; }
    public void receiveInfo(int p0, int p1, boolean p2) {}
    public boolean isStopped() { return false; }
}
