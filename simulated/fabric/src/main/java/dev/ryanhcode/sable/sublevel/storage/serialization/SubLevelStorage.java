package dev.ryanhcode.sable.sublevel.storage.serialization;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.storage.serialization.SubLevelStorage
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelStorage implements java.lang.AutoCloseable {
    public static int MAX_CACHE_SIZE = 0;
    public SubLevelStorage(java.nio.file.Path p0) {}
    public dev.ryanhcode.sable.sublevel.storage.holding.SubLevelHoldingChunk attemptLoadHoldingChunk(net.minecraft.world.level.ChunkPos p0) { return null; }
    public void attemptSaveHoldingChunk(net.minecraft.world.level.ChunkPos p0, dev.ryanhcode.sable.sublevel.storage.holding.SubLevelHoldingChunk p1) {}
    public void attemptRemoveHoldingChunk(net.minecraft.world.level.ChunkPos p0) {}
    public dev.ryanhcode.sable.sublevel.storage.serialization.SubLevelData attemptLoadSubLevel(net.minecraft.world.level.ChunkPos p0, dev.ryanhcode.sable.sublevel.storage.holding.SavedSubLevelPointer p1) { return null; }
    public dev.ryanhcode.sable.sublevel.storage.holding.GlobalSavedSubLevelPointer attemptSaveSubLevel(net.minecraft.world.level.ChunkPos p0, dev.ryanhcode.sable.sublevel.storage.serialization.SubLevelData p1) { return null; }
    public void attemptSaveSubLevel(dev.ryanhcode.sable.sublevel.storage.holding.GlobalSavedSubLevelPointer p0, dev.ryanhcode.sable.sublevel.storage.serialization.SubLevelData p1) {}
    public void close() throws java.io.IOException {}
    public java.nio.file.Path getFolder() { return null; }
    public void pruneCache() throws java.io.IOException {}
    public void flush() throws java.io.IOException {}
}
