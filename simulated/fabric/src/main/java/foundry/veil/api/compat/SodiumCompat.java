package foundry.veil.api.compat;

// AUTO-GENERATED STUB for foundry.veil.api.compat.SodiumCompat
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface SodiumCompat {
    public static final foundry.veil.api.compat.SodiumCompat INSTANCE = new foundry.veil.api.compat.SodiumCompat() { @Override public it.unimi.dsi.fastutil.objects.Object2IntMap<java.lang.Object> getLoadedShaders() { return null; }  @Override public void recompile() {}  @Override public void setActiveBuffers(int p0) {}  @Override public void markChunksDirty() {}  @Override public java.lang.Object getSortedRenderLists() { return null; }  @Override public void setSortedRenderLists(java.lang.Object p0) {}  @Override public java.lang.Object getTaskLists() { return null; }  @Override public void setTaskList(java.lang.Object p0) {} };
    public static boolean isLoaded() { return false; }
    public abstract it.unimi.dsi.fastutil.objects.Object2IntMap<java.lang.Object> getLoadedShaders();
    public abstract void recompile();
    public abstract void setActiveBuffers(int p0);
    public abstract void markChunksDirty();
    public abstract java.lang.Object getSortedRenderLists();
    public abstract void setSortedRenderLists(java.lang.Object p0);
    public abstract java.lang.Object getTaskLists();
    public abstract void setTaskList(java.lang.Object p0);
}
