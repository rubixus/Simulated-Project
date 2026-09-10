package foundry.veil.api.client.render.texture;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.texture.TextureFilter
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record TextureFilter(boolean blur, boolean mipmap, float anisotropy, foundry.veil.api.client.render.texture.TextureFilter.CompareFunction compareFunction, foundry.veil.api.client.render.texture.TextureFilter.Wrap wrapX, foundry.veil.api.client.render.texture.TextureFilter.Wrap wrapY, foundry.veil.api.client.render.texture.TextureFilter.Wrap wrapZ, int minFilter, foundry.veil.api.client.render.texture.TextureFilter.EdgeType borderType, boolean seamless) {
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.texture.TextureFilter> REPEAT_DEFAULT_CODEC = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.texture.TextureFilter> CLAMP_DEFAULT_CODEC = null;
    public static final foundry.veil.api.client.render.texture.TextureFilter REPEAT = null;
    public static final foundry.veil.api.client.render.texture.TextureFilter CLAMP = null;
    public int magFilter() { return 0; }
    public void applyToTextureTarget(int p0) {}
    public void applyToTexture(int p0) {}
    public int borderColor() { return 0; }
    static public enum CompareFunction {
        NEVER(0),
        ALWAYS(0),
        LESS(0),
        LEQUAL(0),
        EQUAL(0),
        NOT_EQUAL(0),
        GEQUAL(0),
        GREATER(0);
        public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.texture.TextureFilter.CompareFunction> CODEC = null;
        public int getId() { return 0; }
    }
    static public enum EdgeType {
        FLOAT,
        INT,
        UINT;
        public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.texture.TextureFilter.EdgeType> CODEC = null;
    }
    static public enum Wrap {
        CLAMP_TO_EDGE(0),
        CLAMP_TO_BORDER(0),
        MIRRORED_REPEAT(0),
        REPEAT(0),
        MIRROR_CLAMP_TO_EDGE(0);
        public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.texture.TextureFilter.Wrap> CODEC = null;
        public static final it.unimi.dsi.fastutil.ints.Int2ObjectMap<foundry.veil.api.client.render.texture.TextureFilter.Wrap> BY_GL_ID = null;
        public int getId() { return 0; }
    }
}
