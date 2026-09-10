package foundry.veil.ext;

// AUTO-GENERATED STUB for foundry.veil.ext.ShaderInstanceExtension
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderInstanceExtension {
    public abstract boolean veil$isRecompileReady(int p0);
    public abstract boolean veil$applyCompile();
    public abstract boolean veil$swapBuffers(int p0);
    public abstract void veil$recompile(boolean p0, java.lang.String p1, int p2);
    public abstract java.util.Collection<java.lang.Object> veil$getShaderSources();
    public abstract int veil$getActiveBuffers();
}
