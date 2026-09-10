package dev.ryanhcode.sable.sublevel.plot;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.plot.LevelPlot
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class LevelPlot {
    public final net.minecraft.world.level.ChunkPos plotPos = null;
    protected final dev.ryanhcode.sable.api.sublevel.SubLevelContainer container = null;
    protected final int logSize = 0;
    protected final it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap<net.minecraft.core.BlockPos, dev.ryanhcode.sable.api.block.BlockEntitySubLevelActor> blockEntityActors = null;
    protected boolean expandPlotIfNecessary = false;
    protected dev.ryanhcode.sable.companion.math.BoundingBox3i localBounds = null;
    protected net.minecraft.resources.ResourceKey<net.minecraft.world.level.biome.Biome> biome = null;
    public LevelPlot(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0, int p1, int p2, int p3, dev.ryanhcode.sable.sublevel.SubLevel p4) {}
    public void tick() {}
    public dev.ryanhcode.sable.sublevel.plot.EmbeddedPlotLevelAccessor getEmbeddedLevelAccessor() { return null; }
    public net.minecraft.core.BlockPos getCenterBlock() { return null; }
    protected void newChunk(net.minecraft.world.level.ChunkPos p0, net.minecraft.world.level.chunk.LevelChunk p1, boolean p2) {}
    public abstract net.minecraft.world.level.lighting.LevelLightEngine getLightEngine();
    public void newEmptyChunk(net.minecraft.world.level.ChunkPos p0) {}
    public dev.ryanhcode.sable.sublevel.SubLevel getSubLevel() { return null; }
    public boolean contains(double p0, double p1) { return false; }
    public boolean contains(net.minecraft.world.phys.Vec3 p0) { return false; }
    public boolean contains(org.joml.Vector3dc p0) { return false; }
    public net.minecraft.world.level.ChunkPos getChunkMin() { return null; }
    public net.minecraft.world.level.ChunkPos getChunkMax() { return null; }
    public boolean contains(net.minecraft.world.level.ChunkPos p0) { return false; }
    public net.minecraft.world.level.ChunkPos toLocal(net.minecraft.world.level.ChunkPos p0) { return null; }
    public net.minecraft.world.level.ChunkPos toGlobal(net.minecraft.world.level.ChunkPos p0) { return null; }
    public dev.ryanhcode.sable.sublevel.plot.PlotChunkHolder getChunkHolder(net.minecraft.world.level.ChunkPos p0) { return null; }
    public void addChunkHolder(net.minecraft.world.level.ChunkPos p0, dev.ryanhcode.sable.sublevel.plot.PlotChunkHolder p1, boolean p2) {}
    public net.minecraft.world.level.chunk.LevelChunk getChunk(net.minecraft.world.level.ChunkPos p0) { return null; }
    public net.minecraft.world.level.ChunkPos getCenterChunk() { return null; }
    public java.util.Collection<dev.ryanhcode.sable.sublevel.plot.PlotChunkHolder> getLoadedChunks() { return null; }
    public void updateBoundingBox() {}
    public dev.ryanhcode.sable.companion.math.BoundingBox3ic getBoundingBox() { return null; }
    public void setBoundingBox(dev.ryanhcode.sable.companion.math.BoundingBox3ic p0) {}
    public void onRemove() {}
    protected abstract void onRemoveChunkHolder(net.minecraft.world.level.chunk.LevelChunk p0);
    public void expandIfNecessary(net.minecraft.core.BlockPos p0) {}
    public void onBlockChange(net.minecraft.core.BlockPos p0, net.minecraft.world.level.block.state.BlockState p1) {}
    public java.lang.Iterable<dev.ryanhcode.sable.api.block.BlockEntitySubLevelActor> getBlockEntityActors() { return null; }
    public java.util.Collection<dev.ryanhcode.sable.api.block.BlockEntitySubLevelReactionWheel> getBlockEntityReactionWheels() { return null; }
    public java.util.Set<java.util.Map.Entry<net.minecraft.core.BlockPos, dev.ryanhcode.sable.api.block.BlockEntitySubLevelReactionWheel>> getBlockEntityReactionWheelMap() { return null; }
}
