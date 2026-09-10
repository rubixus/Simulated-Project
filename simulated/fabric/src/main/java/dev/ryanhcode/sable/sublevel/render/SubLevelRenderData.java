package dev.ryanhcode.sable.sublevel.render;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.render.SubLevelRenderData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface SubLevelRenderData {
    public abstract void close();
    public abstract void rebuild();
    public abstract boolean isSectionCompiled(int p0, int p1, int p2);
    public abstract void setDirty(int p0, int p1, int p2, boolean p3);
    public abstract void compileSections(net.minecraft.client.PrioritizeChunkUpdates p0, net.minecraft.client.renderer.chunk.RenderRegionCache p1, net.minecraft.client.Camera p2);
    public abstract int getVisibleSectionCount();
    public default org.joml.Matrix4f getTransformation(double p0, double p1, double p2) { return null; }
    public default org.joml.Matrix4f getTransformation(double p0, double p1, double p2, org.joml.Matrix4f p3) { return null; }
    public abstract dev.ryanhcode.sable.sublevel.ClientSubLevel getSubLevel();
    public default org.joml.Vector3d getChunkOffset() { return null; }
    public default org.joml.Vector3d getChunkOffset(org.joml.Vector3d p0) { return null; }
}
