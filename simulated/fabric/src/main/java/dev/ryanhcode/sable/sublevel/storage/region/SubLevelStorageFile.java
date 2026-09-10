package dev.ryanhcode.sable.sublevel.storage.region;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.storage.region.SubLevelStorageFile
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelStorageFile implements java.lang.AutoCloseable {
    public static final java.lang.String FILE_EXTENSION = ".slvls";
    public static final java.lang.String SINGLE_FILE_EXTENSION = ".slvl";
    public static boolean COMPRESS_DATA = false;
    public static int EXTERNAL_MASK = 0;
    protected final java.util.BitSet usedSectors = null;
    protected final java.util.BitSet usedIndices = null;
    public SubLevelStorageFile(java.nio.file.Path p0, java.nio.file.Path p1, int p2) throws java.io.IOException {}
    public SubLevelStorageFile(java.nio.file.Path p0, java.nio.file.Path p1) throws java.io.IOException {}
    public int findFreeIndex() { return 0; }
    public int getTotalIndexCapacity() { return 0; }
    public java.io.DataInputStream getSubLevelDataInputStream(int p0) throws java.io.IOException { return null; }
    public boolean isEmpty() { return false; }
    protected void write(int p0, java.nio.ByteBuffer p1) throws java.io.IOException {}
    public int allocateSpace(int p0) { return 0; }
    public void write(int p0, net.minecraft.nbt.CompoundTag p1) throws java.io.IOException {}
    public net.minecraft.nbt.CompoundTag read(int p0) throws java.io.IOException { return null; }
    public java.io.DataOutputStream getSubLevelDataOutputStream(int p0) { return null; }
    public java.nio.file.Path getPath() { return null; }
    public int getSpanStart(int p0) { return 0; }
    public int getSpanLength(int p0) { return 0; }
    public int packSpan(int p0, int p1) { return 0; }
    public void close() throws java.io.IOException {}
    public void delete() {}
    public void flush() throws java.io.IOException {}
}
