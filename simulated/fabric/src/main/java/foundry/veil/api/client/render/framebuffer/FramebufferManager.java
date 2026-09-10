package foundry.veil.api.client.render.framebuffer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.framebuffer.FramebufferManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class FramebufferManager extends foundry.veil.api.CodecReloadListener<foundry.veil.api.client.render.framebuffer.FramebufferDefinition> implements org.lwjgl.system.NativeResource {
    public static final com.mojang.serialization.Codec<java.lang.Object> FRAMEBUFFER_CODEC = null;
    public static final net.minecraft.resources.FileToIdConverter FRAMEBUFFER_LISTER = null;
    public FramebufferManager() {}
    public void resizeFramebuffers(int p0, int p1) {}
    public void clear() {}
    public void setDefinition(java.lang.Object p0, foundry.veil.api.client.render.framebuffer.FramebufferDefinition p1) {}
    public void setFramebuffer(java.lang.Object p0, foundry.veil.api.client.render.framebuffer.AdvancedFbo p1) {}
    public foundry.veil.api.client.render.framebuffer.AdvancedFbo removeFramebuffer(java.lang.Object p0) { return null; }
    public foundry.veil.api.client.render.framebuffer.AdvancedFbo getFramebuffer(java.lang.Object p0) { return null; }
    public foundry.veil.api.client.render.framebuffer.FramebufferDefinition getFramebufferDefinition(java.lang.Object p0) { return null; }
    public java.util.Map<java.lang.Object, foundry.veil.api.client.render.framebuffer.AdvancedFbo> getFramebuffers() { return null; }
    protected void apply(java.util.Map<java.lang.Object, foundry.veil.api.client.render.framebuffer.FramebufferDefinition> p0, net.minecraft.server.packs.resources.ResourceManager p1, net.minecraft.util.profiling.ProfilerFiller p2) {}
    public void free() {}
}
