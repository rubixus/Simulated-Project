package foundry.veil.impl.client.render.dynamicbuffer;

// AUTO-GENERATED STUB for foundry.veil.impl.client.render.dynamicbuffer.DynamicBufferManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class DynamicBufferManager implements org.lwjgl.system.NativeResource {
    public static final java.lang.Object MAIN_WRAPPER = null;
    public DynamicBufferManager(int p0, int p1) {}
    public int getActiveBuffers(java.lang.Object p0) { return 0; }
    public int getActiveBuffers() { return 0; }
    public int getBufferTexture(foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType p0) { return 0; }
    public boolean setActiveBuffers(java.lang.Object p0, int p1) { return false; }
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public void free() {}
    public void setupRenderState(java.lang.Object p0, com.mojang.blaze3d.pipeline.RenderTarget p1, boolean p2) {}
    public foundry.veil.api.client.render.framebuffer.AdvancedFbo getDynamicFbo(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0) { return null; }
    public int[] getClearBuffers() { return null; }
    public void endFrame() {}
    public void markRecompiled(java.lang.Object p0) {}
    public void resizeFramebuffers(int p0, int p1) {}
    static record DynamicBuffer(foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType type, int textureId) {
        public void init(int p0, int p1) {}
        public void resize(int p0, int p1) {}
    }
}
