package foundry.veil.api.client.render.rendertype.layer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.rendertype.layer.RenderTypeLayer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface RenderTypeLayer {
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.rendertype.layer.RenderTypeLayer> CODEC = null;
    public abstract void addShard(foundry.veil.api.client.render.rendertype.VeilRenderTypeBuilder p0, java.lang.Object... p1);
    public abstract foundry.veil.api.client.registry.RenderTypeLayerRegistry.LayerType<?> getType();
}
