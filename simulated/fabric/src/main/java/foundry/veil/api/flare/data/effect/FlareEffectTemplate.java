package foundry.veil.api.flare.data.effect;

// AUTO-GENERATED STUB for foundry.veil.api.flare.data.effect.FlareEffectTemplate
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record FlareEffectTemplate(foundry.veil.api.flare.data.effect.FlareEffectLayer[] effectLayers, foundry.veil.api.flare.data.effect.FlareEffectLayer[] activeEffectLayers) {
    public static final com.mojang.serialization.Codec<foundry.veil.api.flare.data.effect.FlareEffectTemplate> CODEC = null;
    public FlareEffectTemplate(foundry.veil.api.flare.data.effect.FlareEffectLayer[] p0) { this(null, null); }
    public FlareEffectTemplate(java.util.Collection<foundry.veil.api.flare.data.effect.FlareEffectLayer> p0) { this(null, null); }
    public void render(foundry.veil.api.flare.EffectHost p0, foundry.veil.api.client.render.MatrixStack p1, float p2) {}
    public void render(foundry.veil.api.flare.EffectHost p0, foundry.veil.api.client.render.MatrixStack p1, float p2, java.util.Map<java.lang.Object, foundry.veil.api.flare.model.BakedShell> p3) {}
}
