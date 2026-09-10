package foundry.veil.api.client.render.light.renderer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.light.renderer.LightRenderer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public final class LightRenderer implements org.lwjgl.system.NativeResource {
    public LightRenderer() {}
    public boolean render(foundry.veil.api.client.render.CullFrustum p0, foundry.veil.api.client.render.framebuffer.AdvancedFbo p1, foundry.veil.api.client.render.framebuffer.AdvancedFbo p2, boolean p3) { return false; }
    public <T extends foundry.veil.api.client.render.light.data.LightData> foundry.veil.api.client.render.light.renderer.LightRenderHandle<T> addLight(T p0) { return null; }
    public <T extends foundry.veil.api.client.render.light.data.LightData> foundry.veil.api.client.render.light.renderer.LightRenderHandle<T> addLight(foundry.veil.api.client.render.light.renderer.LightRenderHandle<T> p0) { return null; }
    public <T extends foundry.veil.api.client.render.light.data.LightData> java.util.Collection<? extends foundry.veil.api.client.render.light.renderer.LightRenderHandle<T>> getLights(foundry.veil.api.client.registry.LightTypeRegistry.LightType<? extends T> p0) { return null; }
    public java.util.Map<foundry.veil.api.client.registry.LightTypeRegistry.LightType<?>, foundry.veil.api.client.render.light.renderer.LightTypeRenderer<?>> getRenderers() { return null; }
    public void free() {}
    public void addDebugInfo(java.util.function.Consumer<java.lang.String> p0) {}
}
