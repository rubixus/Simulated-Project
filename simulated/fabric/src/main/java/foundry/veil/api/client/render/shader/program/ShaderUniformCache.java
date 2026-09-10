package foundry.veil.api.client.render.shader.program;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.program.ShaderUniformCache
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ShaderUniformCache {
    public ShaderUniformCache(java.util.function.IntSupplier p0) {}
    public void clear() {}
    public foundry.veil.api.client.render.shader.program.ShaderUniformCache.Uniform getUniform(java.lang.CharSequence p0) { return null; }
    public boolean hasUniform(java.lang.String p0) { return false; }
    public foundry.veil.api.client.render.shader.program.ShaderUniformCache.UniformBlock getUniformBlock(java.lang.String p0) { return null; }
    public boolean hasUniformBlock(java.lang.String p0) { return false; }
    public foundry.veil.api.client.render.shader.program.ShaderUniformCache.StorageBlock getStorageBlock(java.lang.String p0) { return null; }
    public boolean hasStorageBlock(java.lang.String p0) { return false; }
    public boolean hasSampler(java.lang.String p0) { return false; }
    public java.util.Map<java.lang.String, foundry.veil.api.client.render.shader.program.ShaderUniformCache.Uniform> getSamplers() { return null; }
    public java.util.Map<java.lang.String, foundry.veil.api.client.render.shader.program.ShaderUniformCache.Uniform> getUniforms() { return null; }
    public java.util.Map<java.lang.String, foundry.veil.api.client.render.shader.program.ShaderUniformCache.UniformBlock> getUniformBlocks() { return null; }
    public java.util.Map<java.lang.String, foundry.veil.api.client.render.shader.program.ShaderUniformCache.StorageBlock> getStorageBlocks() { return null; }
    public static boolean isSampler(int p0) { return false; }
    public static java.lang.String getName(int p0) { return null; }
    static public record StorageBlock(java.lang.String name, int index, int size, int arrayStride, foundry.veil.api.client.render.shader.program.ShaderUniformCache.Uniform[] fields) {
        public boolean array() { return false; }
    }
    static public record Uniform(java.lang.String name, int location, int offset, int type, int arrayLength) {
    }
    static public record UniformBlock(java.lang.String name, int index, int size, foundry.veil.api.client.render.shader.program.ShaderUniformCache.Uniform[] fields) {
    }
}
