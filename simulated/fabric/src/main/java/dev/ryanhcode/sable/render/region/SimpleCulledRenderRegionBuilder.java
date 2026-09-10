package dev.ryanhcode.sable.render.region;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.render.region.SimpleCulledRenderRegionBuilder
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SimpleCulledRenderRegionBuilder {
    protected static final java.util.Comparator<dev.ryanhcode.sable.render.region.SimpleCulledRenderRegionBuilder.Cube> Z_SORTER = null;
    protected static final java.util.Comparator<dev.ryanhcode.sable.render.region.SimpleCulledRenderRegionBuilder.Cube> Y_SORTER = null;
    protected final int gridSize = 0;
    protected final java.util.List<dev.ryanhcode.sable.render.region.SimpleCulledRenderRegionBuilder.Cube> cubes = null;
    protected final java.util.BitSet grid = null;
    public SimpleCulledRenderRegionBuilder(int p0) {}
    protected boolean shouldFaceRender(dev.ryanhcode.sable.render.region.SimpleCulledRenderRegionBuilder.Cube p0, net.minecraft.core.Direction p1) { return false; }
    public void add(int p0, int p1, int p2) {}
    public void build() {}
    public void buildNoGreedy() {}
    public void render(org.joml.Matrix4f p0, com.mojang.blaze3d.vertex.VertexConsumer p1) {}
    public java.util.List<dev.ryanhcode.sable.render.region.SimpleCulledRenderRegionBuilder.Cube> getCubes() { return null; }
    static public record Cube(int x, int y, int z, int sizeX, int sizeY, int sizeZ) {
    }
}
