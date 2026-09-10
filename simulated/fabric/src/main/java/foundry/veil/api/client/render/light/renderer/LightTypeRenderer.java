package foundry.veil.api.client.render.light.renderer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.light.renderer.LightTypeRenderer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface LightTypeRenderer<T extends foundry.veil.api.client.render.light.data.LightData> {
    public abstract foundry.veil.api.client.render.light.renderer.LightRenderHandle<T> addLight(T p0);
    public abstract foundry.veil.api.client.render.light.renderer.LightRenderHandle<T> steal(foundry.veil.api.client.render.light.renderer.LightRenderHandle<T> p0);
    public abstract void prepareLights(foundry.veil.api.client.render.light.renderer.LightRenderer p0, foundry.veil.api.client.render.CullFrustum p1);
    public abstract void renderLights(foundry.veil.api.client.render.light.renderer.LightRenderer p0);
    public abstract java.util.Collection<? extends foundry.veil.api.client.render.light.renderer.LightRenderHandle<T>> getLights();
    public abstract int getVisibleLights();
    public static void createQuad(com.mojang.blaze3d.vertex.VertexConsumer p0) {}
    public static void createInvertedCube(com.mojang.blaze3d.vertex.VertexConsumer p0) {}
}
