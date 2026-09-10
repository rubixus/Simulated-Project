package foundry.veil.api.flare.data.effect;

// AUTO-GENERATED STUB for foundry.veil.api.flare.data.effect.FlareModel
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public final class FlareModel {
    public static final com.mojang.serialization.Codec<foundry.veil.api.flare.data.effect.FlareModel> CODEC = null;
    public static final java.lang.String POSITION_PROPERTY_NAME = "model::position";
    public static final java.lang.String ROTATION_PROPERTY_NAME = "model::rotation";
    public static final java.lang.String SCALE_PROPERTY_NAME = "model::scale";
    final foundry.veil.api.client.property.model.Vec3ModelProperty positionOffset = null;
    final foundry.veil.api.client.property.model.RotationModelProperty rotationOffset = null;
    final foundry.veil.api.client.property.model.Vec3ModelProperty scaleOffset = null;
    final foundry.veil.api.client.property.model.Mat4ModelProperty modelToWorld = null;
    public FlareModel(java.lang.Object p0, org.joml.Vector3fc p1, org.joml.Vector3fc p2, org.joml.Vector3fc p3, java.util.Collection<foundry.veil.api.flare.data.effect.FlareMaterial> p4) {}
    public void render(foundry.veil.api.flare.EffectHost p0, foundry.veil.api.client.render.MatrixStack p1, java.util.Map<java.lang.String, java.util.List<foundry.veil.api.flare.modifier.PropertyModifier<?>>> p2, java.util.Map<java.lang.Object, foundry.veil.api.flare.model.BakedShell> p3) {}
    public java.lang.Object getShell() { return null; }
    public org.joml.Vector3fc getPositionOffset() { return null; }
    public org.joml.Vector3fc getRotationOffset() { return null; }
    public org.joml.Vector3fc getScaleOffset() { return null; }
    public foundry.veil.api.flare.data.effect.FlareMaterial[] getMaterials() { return null; }
}
