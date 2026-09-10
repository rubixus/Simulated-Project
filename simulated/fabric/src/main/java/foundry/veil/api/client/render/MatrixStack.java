package foundry.veil.api.client.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.MatrixStack
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface MatrixStack {
    public abstract void clear();
    public default void translate(org.joml.Vector3dc p0) {}
    public default void translate(org.joml.Vector3fc p0) {}
    public default void translate(double p0, double p1, double p2) {}
    public abstract void translate(float p0, float p1, float p2);
    public abstract void rotate(org.joml.Quaterniondc p0);
    public abstract void rotate(org.joml.Quaternionfc p0);
    public default void rotate(double p0, double p1, double p2, double p3) {}
    public abstract void rotate(float p0, float p1, float p2, float p3);
    public default void rotateXYZ(double p0, double p1, double p2) {}
    public abstract void rotateXYZ(float p0, float p1, float p2);
    public default void rotateZYX(double p0, double p1, double p2) {}
    public abstract void rotateZYX(float p0, float p1, float p2);
    public abstract void rotateAround(org.joml.Quaterniondc p0, double p1, double p2, double p3);
    public abstract void rotateAround(org.joml.Quaternionfc p0, float p1, float p2, float p3);
    public default void applyScale(org.joml.Vector3dc p0) {}
    public default void applyScale(org.joml.Vector3fc p0) {}
    public default void applyScale(double p0) {}
    public default void applyScale(float p0) {}
    public default void applyScale(double p0, double p1, double p2) {}
    public abstract void applyScale(float p0, float p1, float p2);
    public default void copy(com.mojang.blaze3d.vertex.PoseStack p0) {}
    public default void copy(foundry.veil.api.client.render.MatrixStack p0) {}
    public default void copy(java.lang.Object p0) {}
    public default void setIdentity() {}
    public abstract boolean isIdentity();
    public abstract boolean isEmpty();
    public abstract void matrixPush();
    public abstract void matrixPop();
    public abstract java.lang.Object pose();
    public default org.joml.Matrix4f position() { return null; }
    public default org.joml.Matrix3f normal() { return null; }
    public abstract com.mojang.blaze3d.vertex.PoseStack toPoseStack();
}
