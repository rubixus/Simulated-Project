package foundry.veil.api.client.render.vertex;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.vertex.VertexArray
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class VertexArray implements org.lwjgl.system.NativeResource {
    public static final int VERTEX_BUFFER = 0;
    public static final int ELEMENT_ARRAY_BUFFER = 1;
    public static final int INSTANCE_BUFFER = 2;
    protected final int id = 0;
    protected final foundry.veil.api.client.render.vertex.VertexArrayBuilder builder = null;
    protected final it.unimi.dsi.fastutil.ints.Int2IntMap buffers = null;
    protected int indexCount = 0;
    protected foundry.veil.api.client.render.vertex.VertexArray.IndexType indexType = null;
    protected java.lang.Object drawMode = null;
    protected java.lang.Object indexBuffer = null;
    protected VertexArray(int p0, java.util.function.Function<foundry.veil.api.client.render.vertex.VertexArray, foundry.veil.api.client.render.vertex.VertexArrayBuilder> p1) {}
    public static foundry.veil.api.client.render.vertex.VertexArray create() { return null; }
    public static foundry.veil.api.client.render.vertex.VertexArray[] create(int p0) { return null; }
    public static void create(foundry.veil.api.client.render.vertex.VertexArray[] p0) {}
    public void setup(java.lang.Object p0) {}
    public void clear(java.lang.Object p0) {}
    public int getOrCreateBuffer(int p0) { return 0; }
    public int getId() { return 0; }
    public int getIndexCount() { return 0; }
    public foundry.veil.api.client.render.vertex.VertexArray.IndexType getIndexType() { return null; }
    public java.lang.Object getDrawMode() { return null; }
    public static void upload(int p0, java.nio.ByteBuffer p1, foundry.veil.api.client.render.vertex.VertexArray.DrawUsage p2) {}
    public void upload(com.mojang.blaze3d.vertex.MeshData p0, foundry.veil.api.client.render.vertex.VertexArray.DrawUsage p1) {}
    public void upload(int p0, com.mojang.blaze3d.vertex.MeshData p1, foundry.veil.api.client.render.vertex.VertexArray.DrawUsage p2) {}
    public void uploadIndexBuffer(com.mojang.blaze3d.vertex.MeshData$DrawState p0) {}
    public void uploadIndexBuffer(java.nio.ByteBuffer p0) {}
    public void uploadIndexBuffer(java.nio.ByteBuffer p0, foundry.veil.api.client.render.vertex.VertexArray.IndexType p1) {}
    public foundry.veil.api.client.render.vertex.VertexArrayBuilder editFormat() { return null; }
    public void bind() {}
    public static void unbind() {}
    public void draw() {}
    public void drawInstanced(int p0) {}
    public void drawIndirect(long p0, int p1, int p2) {}
    public void drawWithRenderType(java.lang.Object p0) {}
    public void drawInstancedWithRenderType(java.lang.Object p0, int p1) {}
    public void drawIndirectWithRenderType(java.lang.Object p0, long p1, int p2, int p3) {}
    public void setIndexCount(int p0, foundry.veil.api.client.render.vertex.VertexArray.IndexType p1) {}
    public void setDrawMode(java.lang.Object p0) {}
    public void free() {}
    static public enum DrawUsage {
        STATIC(0),
        DYNAMIC(0),
        STREAM(0);
        public int getGlType() { return 0; }
        public static foundry.veil.api.client.render.vertex.VertexArray.DrawUsage fromBlaze3D(java.lang.Object p0) { return null; }
    }
    static public enum IndexType {
        BYTE(0),
        SHORT(0),
        INT(0);
        public int getGlType() { return 0; }
        public int getBytes() { return 0; }
        public static foundry.veil.api.client.render.vertex.VertexArray.IndexType fromBlaze3D(java.lang.Object p0) { return null; }
        public static foundry.veil.api.client.render.vertex.VertexArray.IndexType least(int p0) { return null; }
    }
    static enum VertexArrayType {
        LEGACY(null),
        ARB(null),
        DSA(null);
    }
}
