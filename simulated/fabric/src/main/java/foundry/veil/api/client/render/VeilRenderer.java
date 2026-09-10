package foundry.veil.api.client.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.VeilRenderer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class VeilRenderer implements net.minecraft.server.packs.resources.ResourceManagerReloadListener {
    public static final java.lang.Object ALBEDO_BUFFER_TEXTURE = null;
    public static final java.lang.Object NORMAL_BUFFER_TEXTURE = null;
    public static final java.lang.Object LIGHT_UV_BUFFER_TEXTURE = null;
    public static final java.lang.Object LIGHT_COLOR_BUFFER_TEXTURE = null;
    public static final java.lang.Object DEBUG_BUFFER_TEXTURE = null;
    public static final java.lang.Object COMPOSITE = null;
    public VeilRenderer(net.minecraft.server.packs.resources.ReloadableResourceManager p0, com.mojang.blaze3d.platform.Window p1) {}
    public void addDebugInfo(java.util.function.Consumer<java.lang.String> p0) {}
    public boolean enableBuffers(java.lang.Object p0, foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType... p1) { return false; }
    public boolean disableBuffers(java.lang.Object p0, foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType... p1) { return false; }
    public boolean disableBuffers(java.lang.Object p0) { return false; }
    public int getActiveBuffers() { return 0; }
    public foundry.veil.impl.client.render.dynamicbuffer.VanillaShaderCompiler getVanillaShaderCompiler() { return null; }
    public foundry.veil.impl.client.render.dynamicbuffer.DynamicBufferManager getDynamicBufferManger() { return null; }
    public foundry.veil.api.client.render.shader.ShaderModificationManager getShaderModificationManager() { return null; }
    public foundry.veil.impl.client.render.shader.injection.ShaderInjectionManager getShaderInjectionManager() { return null; }
    public foundry.veil.api.client.render.shader.ShaderPreDefinitions getShaderDefinitions() { return null; }
    public foundry.veil.api.client.render.shader.ShaderManager getShaderManager() { return null; }
    public foundry.veil.api.client.render.framebuffer.FramebufferManager getFramebufferManager() { return null; }
    public foundry.veil.api.client.render.post.PostProcessingManager getPostProcessingManager() { return null; }
    public foundry.veil.impl.client.render.rendertype.DynamicRenderTypeManager getDynamicRenderTypeManager() { return null; }
    public foundry.veil.api.quasar.particle.ParticleSystemManager getParticleManager() { return null; }
    public foundry.veil.api.flare.FlareEffectManager getEffectManager() { return null; }
    public foundry.veil.api.client.editor.EditorManager getEditorManager() { return null; }
    public foundry.veil.api.client.render.CameraMatrices getCameraMatrices() { return null; }
    public foundry.veil.api.client.render.light.renderer.LightRenderer getLightRenderer() { return null; }
    public foundry.veil.api.screenshake.ScreenShakeManager getScreenShakeManager() { return null; }
    public foundry.veil.api.client.render.GuiInfo getGuiInfo() { return null; }
    public void resize(int p0, int p1) {}
    public void endFrame() {}
    public void free() {}
}
