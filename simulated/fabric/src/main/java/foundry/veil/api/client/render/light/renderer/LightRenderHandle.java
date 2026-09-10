package foundry.veil.api.client.render.light.renderer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.light.renderer.LightRenderHandle
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface LightRenderHandle<T extends foundry.veil.api.client.render.light.data.LightData> {
    public abstract T getLightData();
    public abstract void markDirty();
    public abstract boolean isValid();
}
