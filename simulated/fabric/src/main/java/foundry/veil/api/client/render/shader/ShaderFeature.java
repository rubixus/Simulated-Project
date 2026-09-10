package foundry.veil.api.client.render.shader;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.ShaderFeature
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public enum ShaderFeature {
    COMPUTE,
    SHADER_STORAGE,
    ATOMIC_COUNTER,
    BINDLESS_TEXTURE,
    CUBE_MAP_ARRAY,
    FLOAT64,
    INT64,
    VERTEX_ATTRIBUTE64,
    TESSELLATION;
    public static final foundry.veil.api.client.render.shader.ShaderFeature[] FEATURES = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.shader.ShaderFeature> CODEC = null;
    public boolean isSupported() { return false; }
    public java.lang.String getDefinitionName() { return null; }
    public void modifyShader(int p0, io.github.ocelot.glslprocessor.api.node.GlslTree p1) {}
}
