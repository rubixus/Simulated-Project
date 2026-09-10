package foundry.veil.api.client.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.CullFrustum
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface CullFrustum {
    public default boolean testBlock(net.minecraft.core.BlockPos p0) { return false; }
    public default boolean testSection(net.minecraft.core.SectionPos p0) { return false; }
    public default boolean testPoint(net.minecraft.core.Position p0) { return false; }
    public default boolean testPoint(org.joml.Vector3ic p0) { return false; }
    public default boolean testPoint(org.joml.Vector3fc p0) { return false; }
    public default boolean testPoint(org.joml.Vector3dc p0) { return false; }
    public abstract boolean testPoint(double p0, double p1, double p2);
    public default boolean testSphere(org.joml.Vector3dc p0, float p1) { return false; }
    public default boolean testSphere(org.joml.Vector3fc p0, float p1) { return false; }
    public abstract boolean testSphere(double p0, double p1, double p2, float p3);
    public abstract boolean testAab(net.minecraft.world.phys.AABB p0);
    public default boolean testAab(org.joml.Vector3dc p0, org.joml.Vector3dc p1) { return false; }
    public default boolean testAab(org.joml.Vector3fc p0, org.joml.Vector3fc p1) { return false; }
    public abstract boolean testAab(double p0, double p1, double p2, double p3, double p4, double p5);
    public default boolean testPlaneXY(org.joml.Vector2dc p0, org.joml.Vector2dc p1) { return false; }
    public default boolean testPlaneXY(org.joml.Vector2fc p0, org.joml.Vector2fc p1) { return false; }
    public abstract boolean testPlaneXY(double p0, double p1, double p2, double p3);
    public default boolean testPlaneXZ(org.joml.Vector2dc p0, org.joml.Vector2dc p1) { return false; }
    public default boolean testPlaneXZ(org.joml.Vector2fc p0, org.joml.Vector2fc p1) { return false; }
    public abstract boolean testPlaneXZ(double p0, double p1, double p2, double p3);
    public default boolean testLineSegment(org.joml.Vector3dc p0, org.joml.Vector3dc p1) { return false; }
    public default boolean testLineSegment(org.joml.Vector3fc p0, org.joml.Vector3fc p1) { return false; }
    public abstract boolean testLineSegment(double p0, double p1, double p2, double p3, double p4, double p5);
    public abstract org.joml.Vector4fc[] getPlanes();
    public abstract org.joml.Matrix4fc getModelViewProjectionMatrix();
    public abstract org.joml.Vector3fc getViewVector();
    public abstract org.joml.Vector3dc getPosition();
    public abstract net.minecraft.client.renderer.culling.Frustum toFrustum();
}
