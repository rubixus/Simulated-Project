package foundry.veil.api.client.render.shader.program;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.program.TextureUniformAccess
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface TextureUniformAccess {
    public default void setFramebufferSamplers(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0) {}
    public default void setTexture(java.lang.CharSequence p0, java.lang.Object p1) {}
    public default void setTexture(java.lang.CharSequence p0, java.lang.Object p1, int p2) {}
    public default void setTexture(java.lang.CharSequence p0, net.minecraft.client.renderer.texture.AbstractTexture p1) {}
    public default void setTexture(java.lang.CharSequence p0, net.minecraft.client.renderer.texture.AbstractTexture p1, int p2) {}
    public default void setTexture(java.lang.CharSequence p0, int p1, int p2) {}
    public abstract void setTexture(java.lang.CharSequence p0, int p1, int p2, int p3);
    public abstract void removeTexture(java.lang.CharSequence p0);
    public default void bindSamplers(int p0) {}
    public abstract void bindSamplers(foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Context p0, int p1);
    public abstract void clearSamplers();
    public static void setFramebufferSamplers(java.lang.Object p0, foundry.veil.api.client.render.framebuffer.AdvancedFbo p1) {}
}
