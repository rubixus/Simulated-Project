package foundry.veil.api.compat;

// AUTO-GENERATED STUB for foundry.veil.api.compat.IrisCompat
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface IrisCompat {
    public static final foundry.veil.api.compat.IrisCompat INSTANCE = new foundry.veil.api.compat.IrisCompat() { @Override public java.util.Set<java.lang.Object> getLoadedShaders() { return null; }  @Override public java.util.Map<java.lang.String, foundry.veil.ext.iris.IrisRenderTargetExtension> getRenderTargets() { return null; }  @Override public boolean areShadersLoaded() { return false; }  @Override public void recompile() {}  @Override public java.lang.Class<?> getPipelineClass() { return null; } };
    public static boolean isLoaded() { return false; }
    public abstract java.util.Set<java.lang.Object> getLoadedShaders();
    public abstract java.util.Map<java.lang.String, foundry.veil.ext.iris.IrisRenderTargetExtension> getRenderTargets();
    public abstract boolean areShadersLoaded();
    public abstract void recompile();
    public abstract java.lang.Class<?> getPipelineClass();
}
