package foundry.veil.api.client.registry.LightTypeRegistry;

// AUTO-GENERATED STUB for foundry.veil.api.client.registry.LightTypeRegistry.RendererFactory
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface RendererFactory<T extends foundry.veil.api.client.render.light.data.LightData> {
    public abstract foundry.veil.api.client.render.light.renderer.LightTypeRenderer<T> createRenderer();
}
