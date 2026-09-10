package dev.ryanhcode.sable.sublevel.system.ticket;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.system.ticket.PhysicsChunkTicketManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class PhysicsChunkTicketManager {
    public static final double MAX_PREDICTION_DISTANCE = 20.0d;
    public static final net.minecraft.server.level.TicketType SUB_LEVEL_LOADED_TICKET_TYPE = null;
    public PhysicsChunkTicketManager() {}
    public void update(net.minecraft.server.level.ServerLevel p0, dev.ryanhcode.sable.api.sublevel.ServerSubLevelContainer p1, dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p2, dev.ryanhcode.sable.api.physics.PhysicsPipeline p3, double p4) {}
    public void addSectionIfNotTracked(net.minecraft.server.level.ServerLevel p0, net.minecraft.world.level.chunk.LevelChunkSection p1, net.minecraft.core.SectionPos p2, dev.ryanhcode.sable.api.physics.PhysicsPipeline p3) {}
    public void addTicketForSection(net.minecraft.server.level.ServerLevel p0, net.minecraft.core.SectionPos p1) {}
    public java.lang.Iterable<dev.ryanhcode.sable.sublevel.SubLevel> queryIntersecting(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return null; }
    public boolean wouldBeLoaded(net.minecraft.world.level.Level p0, dev.ryanhcode.sable.api.physics.object.ArbitraryPhysicsObject p1) { return false; }
    public static boolean isChunkLoadedEnough(net.minecraft.server.level.ServerLevel p0, int p1, int p2) { return false; }
}
