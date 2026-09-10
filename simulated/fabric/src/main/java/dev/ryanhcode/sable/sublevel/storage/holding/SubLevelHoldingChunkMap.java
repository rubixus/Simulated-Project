package dev.ryanhcode.sable.sublevel.storage.holding;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.storage.holding.SubLevelHoldingChunkMap
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelHoldingChunkMap implements java.lang.AutoCloseable {
    public SubLevelHoldingChunkMap(net.minecraft.server.level.ServerLevel p0, dev.ryanhcode.sable.api.sublevel.ServerSubLevelContainer p1) {}
    public void updateChunkStatus(net.minecraft.world.level.ChunkPos p0, boolean p1) {}
    public void saveAll() {}
    public void snatchAndLoad(dev.ryanhcode.sable.sublevel.storage.holding.GlobalSavedSubLevelPointer p0, java.util.UUID p1) {}
    public void processChanges() {}
    public void loadHoldingSubLevel(dev.ryanhcode.sable.sublevel.storage.HoldingSubLevel p0) {}
    public dev.ryanhcode.sable.sublevel.storage.HoldingSubLevel getHoldingSubLevel(java.util.UUID p0) { return null; }
    public void moveToUnloaded(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, net.minecraft.world.level.ChunkPos p1) {}
    public void queueDeletion(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) {}
    public dev.ryanhcode.sable.sublevel.storage.serialization.SubLevelStorage getStorage() { return null; }
    public void close() throws java.lang.Exception {}
}
