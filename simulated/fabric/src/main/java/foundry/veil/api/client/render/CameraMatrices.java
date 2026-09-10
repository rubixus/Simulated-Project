package foundry.veil.api.client.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.CameraMatrices
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class CameraMatrices {
    public CameraMatrices() {}
    public static foundry.veil.api.client.render.VeilShaderBufferLayout<foundry.veil.api.client.render.CameraMatrices> createLayout() { return null; }
    public void update(org.joml.Matrix4fc p0, org.joml.Matrix4fc p1, double p2, double p3, double p4) {}
    public void updateRenderSystem() {}
    public void backup(foundry.veil.api.client.render.CameraMatrices p0) {}
    public void restore(foundry.veil.api.client.render.CameraMatrices p0) {}
    public org.joml.Matrix4f getProjectionMatrix() { return null; }
    public org.joml.Matrix4f getInverseProjectionMatrix() { return null; }
    public org.joml.Matrix4f getViewMatrix() { return null; }
    public org.joml.Matrix4f getInverseViewMatrix() { return null; }
    public org.joml.Matrix3f getInverseViewRotMatrix() { return null; }
    public org.joml.Vector3f getCameraPosition() { return null; }
    public org.joml.Vector3f getCameraBobOffset() { return null; }
    public float getNearPlane() { return 0.0f; }
    public float getFarPlane() { return 0.0f; }
    public void setNearPlane(float p0) {}
    public void setFarPlane(float p0) {}
}
