package foundry.veil.api.quasar.emitters.shape;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.emitters.shape.EmitterShape
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface EmitterShape {
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.emitters.shape.EmitterShape> CODEC = null;
    public abstract org.joml.Vector3d getPoint(net.minecraft.util.RandomSource p0, org.joml.Vector3fc p1, org.joml.Vector3fc p2, org.joml.Vector3dc p3, boolean p4);
    public abstract void renderShape(com.mojang.blaze3d.vertex.PoseStack p0, com.mojang.blaze3d.vertex.VertexConsumer p1, org.joml.Vector3fc p2, org.joml.Vector3fc p3);
}
