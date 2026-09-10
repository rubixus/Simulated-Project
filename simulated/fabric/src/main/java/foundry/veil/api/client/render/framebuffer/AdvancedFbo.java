package foundry.veil.api.client.render.framebuffer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.framebuffer.AdvancedFbo
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface AdvancedFbo {
    public abstract void create();
    public default void clear() {}
    public default void clear(int p0) {}
    public default void clear(int p0, int... p1) {}
    public default void clear(float p0, float p1, float p2, float p3, int p4) {}
    public default void clear(float p0, float p1, float p2, float p3, int p4, int... p5) {}
    public default void clear(float p0, float p1, float p2, float p3, float p4, int p5) {}
    public abstract void clear(float p0, float p1, float p2, float p3, float p4, int p5, int... p6);
    public abstract void resetDrawBuffers();
    public abstract void drawBuffers(int... p0);
    public abstract void bind(boolean p0);
    public default void bindRead() {}
    public abstract void bindDraw(boolean p0);
    public static foundry.veil.api.client.render.framebuffer.AdvancedFbo getMainFramebuffer() { return null; }
    public static void unbind() {}
    public static void unbindRead() {}
    public static void unbindDraw() {}
    public abstract void resolveToFbo(int p0, int p1, int p2, int p3, int p4);
    public default void resolveToAdvancedFbo(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0) {}
    public abstract void resolveToAdvancedFbo(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0, int p1, int p2);
    public default void resolveToRenderTarget(com.mojang.blaze3d.pipeline.RenderTarget p0) {}
    public abstract void resolveToRenderTarget(com.mojang.blaze3d.pipeline.RenderTarget p0, int p1, int p2);
    public default void resolveToScreen() {}
    public default void resolveToScreen(int p0, int p1) {}
    public abstract int getId();
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract int getColorAttachments();
    public abstract int getClearMask();
    public abstract int[] getDrawBuffers();
    public abstract boolean hasColorAttachment(int p0);
    public abstract boolean hasDepthAttachment();
    public abstract boolean hasStencilAttachment();
    public abstract foundry.veil.api.client.render.framebuffer.AdvancedFboAttachment getColorAttachment(int p0);
    public default boolean isColorTextureAttachment(int p0) { return false; }
    public default boolean isMutableColorTextureAttachment(int p0) { return false; }
    public default boolean isColorRenderAttachment(int p0) { return false; }
    public default foundry.veil.api.client.render.framebuffer.AdvancedFboTextureAttachment getColorTextureAttachment(int p0) { return null; }
    public default void setColorAttachmentTexture(int p0, int p1) {}
    public default void setColorAttachmentTexture(int p0, int p1, int p2) {}
    public default foundry.veil.api.client.render.framebuffer.AdvancedFboRenderAttachment getColorRenderAttachment(int p0) { return null; }
    public abstract foundry.veil.api.client.render.framebuffer.AdvancedFboAttachment getDepthAttachment();
    public default boolean isDepthTextureAttachment() { return false; }
    public default boolean isDepthMutableTextureAttachment() { return false; }
    public default boolean isDepthRenderAttachment() { return false; }
    public default foundry.veil.api.client.render.framebuffer.AdvancedFboTextureAttachment getDepthTextureAttachment() { return null; }
    public default void setDepthAttachmentTexture(int p0) {}
    public default void setDepthAttachmentTexture(int p0, int p1) {}
    public default foundry.veil.api.client.render.framebuffer.AdvancedFboRenderAttachment getDepthRenderAttachment() { return null; }
    public abstract java.lang.String getDebugLabel();
    public abstract com.mojang.blaze3d.pipeline.RenderTarget toRenderTarget();
    public static foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder withSize(int p0, int p1) { return null; }
    public static foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder copy(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0) { return null; }
    public static foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder copy(com.mojang.blaze3d.pipeline.RenderTarget p0) { return null; }
    public class Builder {
        public Builder(int p0, int p1) {}
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addAttachments(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addAttachments(com.mojang.blaze3d.pipeline.RenderTarget p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setLevels(int p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setFormat(foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition.Format p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setFormat(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setFilter(boolean p0, boolean p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setAnisotropy(float p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setCompareFunction(foundry.veil.api.client.render.texture.TextureFilter.CompareFunction p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setWrapS(foundry.veil.api.client.render.texture.TextureFilter.Wrap p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setWrapS(int p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setWrapT(foundry.veil.api.client.render.texture.TextureFilter.Wrap p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setWrapT(int p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setWrap(foundry.veil.api.client.render.texture.TextureFilter.Wrap p0, foundry.veil.api.client.render.texture.TextureFilter.Wrap p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setWrap(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setBorderColor(int p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setFilter(foundry.veil.api.client.render.texture.TextureFilter p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setName(java.lang.String p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addColorBuffer(foundry.veil.api.client.render.framebuffer.AdvancedFboAttachment p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addColorTextureWrapper(int p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addColorTextureWrapper(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addColorTextureBuffer() { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addColorTextureBuffer(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addColorRenderBuffer() { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder addColorRenderBuffer(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDepthBuffer(foundry.veil.api.client.render.framebuffer.AdvancedFboAttachment p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDepthTextureWrapper(int p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDepthTextureWrapper(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDepthTextureBuffer() { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDepthTextureBuffer(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDepthRenderBuffer() { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDepthRenderBuffer(int p0, int p1) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder setDebugLabel(java.lang.String p0) { return null; }
        public foundry.veil.api.client.render.framebuffer.AdvancedFbo build(boolean p0) { return null; }
    }
}
