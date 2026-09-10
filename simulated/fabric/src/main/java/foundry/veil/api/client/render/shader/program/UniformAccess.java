package foundry.veil.api.client.render.shader.program;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.program.UniformAccess
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface UniformAccess {
    public abstract int getUniformLocation(java.lang.CharSequence p0);
    public abstract boolean hasUniform(java.lang.CharSequence p0);
    public abstract foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess getUniform(java.lang.CharSequence p0);
    public abstract foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess getUniformSafe(java.lang.CharSequence p0);
    public abstract int getUniformBlock(java.lang.CharSequence p0);
    public abstract boolean hasUniformBlock(java.lang.CharSequence p0);
    public abstract int getStorageBlock(java.lang.CharSequence p0);
    public abstract boolean hasStorageBlock(java.lang.CharSequence p0);
    public abstract void setUniformBlock(java.lang.CharSequence p0, int p1);
    public abstract void setStorageBlock(java.lang.CharSequence p0, int p1);
}
