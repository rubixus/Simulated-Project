package dev.ryanhcode.sable.api.sublevel;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.sublevel.ServerSubLevelContainer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ServerSubLevelContainer extends dev.ryanhcode.sable.api.sublevel.SubLevelContainer {
    protected final it.unimi.dsi.fastutil.objects.Object2ObjectMap<dev.ryanhcode.sable.sublevel.ServerSubLevel, it.unimi.dsi.fastutil.objects.ObjectSet<dev.ryanhcode.sable.api.sublevel.ticket.SubLevelLoadingTicket<?>>> activeTickets = null;
    protected final it.unimi.dsi.fastutil.objects.Object2ObjectMap<java.util.UUID, dev.ryanhcode.sable.api.sublevel.ticket.SubLevelTicketInfo> allTickets = null;
    public ServerSubLevelContainer(net.minecraft.world.level.Level p0, int p1, int p2, int p3, int p4) {}
    public void initialize() {}
    public void tick() {}
    public void takePhysicsSystem(dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p0) {}
    public void takeTrackingSystem(dev.ryanhcode.sable.sublevel.system.SubLevelTrackingSystem p0) {}
    public dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem physicsSystem() { return null; }
    public dev.ryanhcode.sable.sublevel.system.SubLevelTrackingSystem trackingSystem() { return null; }
    public void removeSubLevel(int p0, int p1, dev.ryanhcode.sable.sublevel.storage.SubLevelRemovalReason p2) {}
    protected dev.ryanhcode.sable.sublevel.SubLevel createSubLevel(int p0, int p1, dev.ryanhcode.sable.companion.math.Pose3d p2, java.util.UUID p3) { return null; }
    public dev.ryanhcode.sable.sublevel.storage.holding.SubLevelHoldingChunkMap getHoldingChunkMap() { return null; }
    public java.util.List<dev.ryanhcode.sable.sublevel.ServerSubLevel> getAllSubLevels() { return null; }
    public net.minecraft.server.level.ServerLevel getLevel() { return null; }
    public <T> boolean addForceLoadTicket(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, dev.ryanhcode.sable.api.sublevel.ticket.SubLevelLoadingTicketType<T> p1, T p2) { return false; }
    public <T> boolean removeForceLoadTicket(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, dev.ryanhcode.sable.api.sublevel.ticket.SubLevelLoadingTicketType<T> p1, T p2) { return false; }
    public java.util.Collection<dev.ryanhcode.sable.sublevel.ServerSubLevel> collectForceLoadedSubLevels() { return null; }
    public java.util.Map<dev.ryanhcode.sable.sublevel.ServerSubLevel, java.util.Set<dev.ryanhcode.sable.api.sublevel.ticket.SubLevelLoadingTicket<?>>> collectForceLoadTickets() { return null; }
    public void loadTickets(it.unimi.dsi.fastutil.objects.Object2ObjectMap<java.util.UUID, dev.ryanhcode.sable.api.sublevel.ticket.SubLevelTicketInfo> p0) {}
    public java.util.Map<java.util.UUID, dev.ryanhcode.sable.api.sublevel.ticket.SubLevelTicketInfo> getAllTickets() { return null; }
    public void close() {}
}
