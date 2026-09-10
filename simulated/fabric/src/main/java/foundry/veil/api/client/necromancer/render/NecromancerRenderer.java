package foundry.veil.api.client.necromancer.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.necromancer.render.NecromancerRenderer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface NecromancerRenderer {
    public abstract void setUv1(int p0, int p1);
    public abstract void setUv2(int p0, int p1);
    public abstract void setColor(float p0, float p1, float p2, float p3);
    public abstract void setColor(int p0);
    public abstract void setTransform(org.joml.Matrix4fc p0);
    public default void setLight(int p0) {}
    public default void setOverlay(int p0) {}
    public abstract void reset();
    public abstract void draw(java.lang.Object p0, foundry.veil.api.client.necromancer.Skeleton p1, foundry.veil.api.client.necromancer.render.Skin p2, float p3);
}
