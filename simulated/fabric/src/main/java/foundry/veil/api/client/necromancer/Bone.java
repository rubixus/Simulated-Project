package foundry.veil.api.client.necromancer;

// AUTO-GENERATED STUB for foundry.veil.api.client.necromancer.Bone
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class Bone {
    public org.joml.Vector3f position = null;
    public org.joml.Vector3f previousPosition = null;
    public org.joml.Vector3f basePosition = null;
    public org.joml.Vector3f rotationPoint = null;
    public org.joml.Vector3f previousRotationPoint = null;
    public org.joml.Vector3f baseRotationPoint = null;
    public org.joml.Quaternionf rotation = null;
    public org.joml.Quaternionf previousRotation = null;
    public org.joml.Quaternionf baseRotation = null;
    public org.joml.Vector3f size = null;
    public org.joml.Vector3f previousSize = null;
    public org.joml.Vector3f baseSize = null;
    public org.joml.Vector4f color = null;
    public org.joml.Vector4f previousColor = null;
    public org.joml.Vector4f baseColor = null;
    public foundry.veil.api.client.necromancer.Bone parent = null;
    public java.util.List<foundry.veil.api.client.necromancer.Bone> children = null;
    public final java.lang.String identifier = null;
    public java.util.List<foundry.veil.api.client.necromancer.Bone> parentChain = null;
    public Bone(java.lang.String p0) {}
    protected void setIndex(int p0) {}
    public int getIndex() { return 0; }
    public void setBaseAttributes(org.joml.Vector3fc p0, org.joml.Quaternionfc p1, org.joml.Vector3f p2, org.joml.Vector3fc p3, org.joml.Vector4fc p4) {}
    public void reset() {}
    protected void updatePreviousAttributes() {}
    public org.joml.Matrix4x3f getModelTransform(org.joml.Matrix4x3f p0, org.joml.Quaternionf p1, float p2) { return null; }
    public org.joml.Matrix4x3f getModelTransform(org.joml.Matrix4x3f p0, float p1) { return null; }
    public void getLocalTransform(org.joml.Matrix4x3f p0, org.joml.Quaternionf p1, float p2) {}
    public void getLocalTransform(org.joml.Matrix4x3f p0, float p1) {}
    public void getColor(org.joml.Vector4f p0, float p1) {}
    protected void tick(float p0) {}
    public void addChild(foundry.veil.api.client.necromancer.Bone p0) {}
    public void setParent(foundry.veil.api.client.necromancer.Bone p0) {}
    public foundry.veil.api.client.necromancer.Bone rotate(float p0, net.minecraft.core.Direction$Axis p1) { return null; }
    public foundry.veil.api.client.necromancer.Bone rotateDeg(float p0, net.minecraft.core.Direction$Axis p1) { return null; }
    public foundry.veil.api.client.necromancer.Bone offset(float p0, float p1, float p2) { return null; }
    public foundry.veil.api.client.necromancer.Bone offsetX(float p0) { return null; }
    public foundry.veil.api.client.necromancer.Bone offsetY(float p0) { return null; }
    public foundry.veil.api.client.necromancer.Bone offsetZ(float p0) { return null; }
}
