package foundry.veil.api.client.necromancer.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.necromancer.render.Skin
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class Skin implements org.lwjgl.system.NativeResource {
    public Skin(foundry.veil.api.client.render.vertex.VertexArray p0, it.unimi.dsi.fastutil.objects.Object2IntMap<java.lang.String> p1) {}
    public void render(java.lang.Object p0, java.util.List<org.joml.Matrix4x3f> p1, java.util.List<foundry.veil.api.client.necromancer.Skeleton> p2, int p3, com.mojang.blaze3d.vertex.ByteBufferBuilder p4, int p5, foundry.veil.api.client.render.shader.block.DynamicShaderBlock<?> p6, it.unimi.dsi.fastutil.floats.FloatList p7) {}
    public foundry.veil.api.client.render.vertex.VertexArray getVertexArray() { return null; }
    public int getSkeletonDataSize() { return 0; }
    public static foundry.veil.api.client.render.vertex.VertexArray createVertexArray() { return null; }
    public void free() {}
    public static foundry.veil.api.client.necromancer.render.Skin.Builder builder(int p0, int p1) { return null; }
    static public class Builder {
        public foundry.veil.api.client.necromancer.render.Skin.Builder startBone(java.lang.String p0) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder setTransform(foundry.veil.api.client.render.MatrixStack p0) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder setTransform(com.mojang.blaze3d.vertex.PoseStack p0) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder setTransform(java.lang.Object p0) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder setTransform(org.joml.Matrix4fc p0) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder addVertex(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder addIndex(int p0) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder addQuadIndices(int p0) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder addCube(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, boolean p11) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder addTri(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11, float p12, float p13, float p14, float p15, float p16, float p17) { return null; }
        public foundry.veil.api.client.necromancer.render.Skin.Builder addFace(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11, float p12, float p13, float p14, float p15, float p16, float p17, float p18, float p19, float p20, float p21, float p22) { return null; }
        public int nextIndex() { return 0; }
        public foundry.veil.api.client.necromancer.render.Skin build() { return null; }
    }
}
