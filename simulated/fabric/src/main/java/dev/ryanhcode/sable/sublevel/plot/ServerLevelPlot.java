package dev.ryanhcode.sable.sublevel.plot;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.plot.ServerLevelPlot
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ServerLevelPlot extends dev.ryanhcode.sable.sublevel.plot.LevelPlot {
    protected static final int DATA_VERSION = 1;
    protected final net.minecraft.world.level.lighting.LevelLightEngine lightEngine = null;
    public ServerLevelPlot(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0, int p1, int p2, int p3, dev.ryanhcode.sable.sublevel.ServerSubLevel p4) {}
    public void addContraption(dev.ryanhcode.sable.api.sublevel.KinematicContraption p0) {}
    public void removeContraption(dev.ryanhcode.sable.api.sublevel.KinematicContraption p0) {}
    public java.util.Collection<dev.ryanhcode.sable.api.sublevel.KinematicContraption> getContraptions() { return null; }
    public void tick() {}
    public net.minecraft.world.level.lighting.LevelLightEngine getLightEngine() { return null; }
    protected void onRemoveChunkHolder(net.minecraft.world.level.chunk.LevelChunk p0) {}
    public void setBiome(net.minecraft.resources.ResourceKey<net.minecraft.world.level.biome.Biome> p0) {}
    public void addChunkHolder(net.minecraft.world.level.ChunkPos p0, dev.ryanhcode.sable.sublevel.plot.PlotChunkHolder p1, boolean p2) {}
    public void kickAllEntities() {}
    public void destroyAllBlocks() {}
    public net.minecraft.nbt.CompoundTag save() { return null; }
    public void load(net.minecraft.nbt.CompoundTag p0) {}
    public void onBlockChange(net.minecraft.core.BlockPos p0, net.minecraft.world.level.block.state.BlockState p1) {}
    public it.unimi.dsi.fastutil.objects.ObjectCollection<dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider.LiftProviderContext> getLiftProviders() { return null; }
    public dev.ryanhcode.sable.sublevel.ServerSubLevel getSubLevel() { return null; }
}
