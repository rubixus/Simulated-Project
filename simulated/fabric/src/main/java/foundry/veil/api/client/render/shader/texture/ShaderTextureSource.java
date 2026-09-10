package foundry.veil.api.client.render.shader.texture;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.texture.ShaderTextureSource
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderTextureSource {
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.shader.texture.ShaderTextureSource> CODEC = null;
    public static final foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Context GLOBAL_CONTEXT = new foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Context() { @Override public foundry.veil.api.client.render.framebuffer.AdvancedFbo getFramebuffer(java.lang.Object p0) { return null; } };
    public abstract int getId(foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Context p0);
    public abstract int getTarget(foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Context p0);
    public abstract foundry.veil.api.client.render.texture.TextureFilter filter();
    public abstract foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Type type();
    public interface Context {
        public abstract foundry.veil.api.client.render.framebuffer.AdvancedFbo getFramebuffer(java.lang.Object p0);
        public default int getTexture(java.lang.Object p0) { return 0; }
        public default int getTextureTarget(java.lang.Object p0) { return 0; }
    }
    public enum Type {
        LOCATION(null),
        FRAMEBUFFER(null);
        public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Type> CODEC = null;
        public com.mojang.serialization.MapCodec<? extends foundry.veil.api.client.render.shader.texture.ShaderTextureSource> codec() { return null; }
    }
}
