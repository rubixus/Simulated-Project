package dev.ryanhcode.sable.api.sublevel;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.sublevel.SubLevelContainer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class SubLevelContainer {
    public static int DEFAULT_LOG_SIZE_LENGTH = 0;
    public static int DEFAULT_LOG_PLOT_SIZE = 0;
    public static final int DEFAULT_ORIGIN = 10000;
    protected final dev.ryanhcode.sable.sublevel.SubLevel[] subLevels = null;
    public static dev.ryanhcode.sable.api.sublevel.SubLevelContainer getContainer(net.minecraft.world.level.Level p0) { return null; }
    public static dev.ryanhcode.sable.api.sublevel.ServerSubLevelContainer getContainer(net.minecraft.server.level.ServerLevel p0) { return null; }
    public static dev.ryanhcode.sable.api.sublevel.ClientSubLevelContainer getContainer(net.minecraft.client.multiplayer.ClientLevel p0) { return null; }
    public SubLevelContainer(net.minecraft.world.level.Level p0, int p1, int p2, int p3, int p4) {}
    public void tick() {}
    public void processSubLevelRemovals() {}
    public void addObserver(dev.ryanhcode.sable.api.sublevel.SubLevelObserver p0) {}
    public int getIndex(int p0, int p1) { return 0; }
    public dev.ryanhcode.sable.sublevel.SubLevel getSubLevel(int p0, int p1) { return null; }
    public dev.ryanhcode.sable.sublevel.SubLevel allocateNewSubLevel(dev.ryanhcode.sable.companion.math.Pose3d p0) { return null; }
    public dev.ryanhcode.sable.sublevel.SubLevel allocateSubLevel(java.util.UUID p0, int p1, int p2, dev.ryanhcode.sable.companion.math.Pose3d p3) { return null; }
    protected abstract dev.ryanhcode.sable.sublevel.SubLevel createSubLevel(int p0, int p1, dev.ryanhcode.sable.companion.math.Pose3d p2, java.util.UUID p3);
    public net.minecraft.world.level.chunk.LevelChunk getChunk(net.minecraft.world.level.ChunkPos p0) { return null; }
    public dev.ryanhcode.sable.sublevel.plot.PlotChunkHolder getChunkHolder(net.minecraft.world.level.ChunkPos p0) { return null; }
    public dev.ryanhcode.sable.sublevel.plot.LevelPlot getPlot(int p0, int p1) { return null; }
    public dev.ryanhcode.sable.sublevel.plot.LevelPlot getPlot(net.minecraft.world.level.ChunkPos p0) { return null; }
    public boolean inBounds(net.minecraft.world.level.ChunkPos p0) { return false; }
    public boolean inBounds(net.minecraft.core.BlockPos p0) { return false; }
    public boolean inBounds(org.joml.Vector3dc p0) { return false; }
    public boolean inBounds(int p0, int p1) { return false; }
    public void newPopulatedChunk(net.minecraft.world.level.ChunkPos p0, net.minecraft.world.level.chunk.LevelChunk p1) {}
    public java.util.List<net.minecraft.server.level.ServerPlayer> getPlayersTracking(net.minecraft.world.level.ChunkPos p0) { return null; }
    public java.util.List<? extends dev.ryanhcode.sable.sublevel.SubLevel> getAllSubLevels() { return null; }
    public net.minecraft.world.level.Level getLevel() { return null; }
    public int getLogPlotSize() { return 0; }
    public int getLogSideLength() { return 0; }
    public org.joml.Vector2i getOrigin() { return null; }
    public void removeSubLevel(int p0, int p1, dev.ryanhcode.sable.sublevel.storage.SubLevelRemovalReason p2) {}
    public int getLoadedCount() { return 0; }
    public java.lang.Iterable<dev.ryanhcode.sable.sublevel.SubLevel> queryIntersecting(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return null; }
    public void removeSubLevel(dev.ryanhcode.sable.sublevel.SubLevel p0, dev.ryanhcode.sable.sublevel.storage.SubLevelRemovalReason p1) {}
    public dev.ryanhcode.sable.sublevel.SubLevel getSubLevel(java.util.UUID p0) { return null; }
    public java.util.BitSet getOccupancy() { return null; }
}
