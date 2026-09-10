package foundry.veil.api.client.render.framebuffer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record FramebufferAttachmentDefinition(foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition.Type type, foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition.Format format, boolean isCompactDepthAttachment, foundry.veil.api.client.render.texture.TextureFilter filter, int levels, java.lang.String name) {
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition> COLOR_CODEC = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition> DEPTH_CODEC = null;
    public boolean depth() { return false; }
    static public enum Format {
        RED(0, 0),
        RG(0, 0),
        RGB(0, 0),
        BGR(0, 0),
        RGBA(0, 0),
        BGRA(0, 0),
        DEPTH_COMPONENT(0, 0),
        DEPTH_STENCIL(0, 0),
        R8(0, 0),
        R8_SNORM(0, 0),
        R16(0, 0),
        R16_SNORM(0, 0),
        RG8(0, 0),
        RG8_SNORM(0, 0),
        RG16(0, 0),
        RG16_SNORM(0, 0),
        R3_G3_B2(0, 0),
        RGB4(0, 0),
        RGB5(0, 0),
        RGB565(0, 0),
        RGB8(0, 0),
        RGB8_SNORM(0, 0),
        RGB10(0, 0),
        RGB12(0, 0),
        RGB16(0, 0),
        RGB16_SNORM(0, 0),
        RGBA2(0, 0),
        RGBA4(0, 0),
        RGB5_A1(0, 0),
        RGBA8(0, 0),
        RGBA8_SNORM(0, 0),
        RGB10_A2(0, 0),
        RGB10_A2UI(0, 0),
        RGBA12(0, 0),
        RGBA16(0, 0),
        RGBA16_SNORM(0, 0),
        SRGB(0, 0),
        SRGB8(0, 0),
        SRGB_ALPHA(0, 0),
        SRGB8_ALPHA8(0, 0),
        COMPRESSED_SRGB(0, 0),
        COMPRESSED_SRGB_ALPHA(0, 0),
        R16F(0, 0),
        RG16F(0, 0),
        RGB16F(0, 0),
        RGBA16F(0, 0),
        R32F(0, 0),
        RG32F(0, 0),
        RGB32F(0, 0),
        RGB9_E5(0, 0),
        RGBA32F(0, 0),
        R11F_G11F_B10F(0, 0),
        R8I(0, 0),
        R8UI(0, 0),
        R16I(0, 0),
        R16UI(0, 0),
        R32I(0, 0),
        R32UI(0, 0),
        RG8I(0, 0),
        RG8UI(0, 0),
        RG16I(0, 0),
        RG16UI(0, 0),
        RG32I(0, 0),
        RG32UI(0, 0),
        RGB8I(0, 0),
        RGB8UI(0, 0),
        RGB16I(0, 0),
        RGB16UI(0, 0),
        RGB32I(0, 0),
        RGB32UI(0, 0),
        RGBA8I(0, 0),
        RGBA8UI(0, 0),
        RGBA16I(0, 0),
        RGBA16UI(0, 0),
        RGBA32I(0, 0),
        RGBA32UI(0, 0),
        DEPTH_COMPONENT16(0, 0),
        DEPTH_COMPONENT24(0, 0),
        DEPTH_COMPONENT32(0, 0),
        DEPTH_COMPONENT32F(0, 0),
        DEPTH24_STENCIL8(0, 0),
        DEPTH32F_STENCIL8(0, 0);
        public static final foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition.Format[] VALUES = null;
        public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition.Format> CODEC = null;
        public int getFormat() { return 0; }
        public int getInternalFormat() { return 0; }
    }
    static public enum Type {
        TEXTURE(null),
        RENDER_BUFFER(null);
        public static final foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition.Type[] VALUES = null;
        public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition.Type> CODEC = null;
        public java.lang.String getDisplayName() { return null; }
    }
}
