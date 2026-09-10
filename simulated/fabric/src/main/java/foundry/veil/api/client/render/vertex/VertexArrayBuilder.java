package foundry.veil.api.client.render.vertex;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.vertex.VertexArrayBuilder
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VertexArrayBuilder {
    public static void validateRelativeOffset(int p0) {}
    public static void validateFloatType(foundry.veil.api.client.render.vertex.VertexArrayBuilder.DataType p0, int p1) {}
    public static void validateIntType(foundry.veil.api.client.render.vertex.VertexArrayBuilder.DataType p0) {}
    public static void validateLongType(foundry.veil.api.client.render.vertex.VertexArrayBuilder.DataType p0) {}
    public abstract foundry.veil.api.client.render.vertex.VertexArray vertexArray();
    public default foundry.veil.api.client.render.vertex.VertexArrayBuilder applyFrom(int p0, int p1, int p2, com.mojang.blaze3d.vertex.VertexFormat p3) { return null; }
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder defineVertexBuffer(int p0, int p1, int p2, int p3, int p4);
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder setVertexAttribute(int p0, int p1, int p2, foundry.veil.api.client.render.vertex.VertexArrayBuilder.DataType p3, boolean p4, int p5);
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder setVertexIAttribute(int p0, int p1, int p2, foundry.veil.api.client.render.vertex.VertexArrayBuilder.DataType p3, int p4);
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder setVertexLAttribute(int p0, int p1, int p2, foundry.veil.api.client.render.vertex.VertexArrayBuilder.DataType p3, int p4);
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder removeVertexBuffer(int p0);
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder removeAttribute(int p0);
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder clearVertexBuffers();
    public abstract foundry.veil.api.client.render.vertex.VertexArrayBuilder clearVertexAttributes();
    public enum DataType {
        BYTE(0),
        SHORT(0),
        INT(0),
        FIXED(0),
        FLOAT(0),
        HALF_FLOAT(0),
        DOUBLE(0),
        UNSIGNED_BYTE(0),
        UNSIGNED_SHORT(0),
        UNSIGNED_INT(0),
        INT_2_10_10_10_REV(0),
        UNSIGNED_INT_2_10_10_10_REV(0),
        UNSIGNED_INT_10F_11F_11F_REV(0),
        UNSIGNED_INT64_ARB(0);
        public boolean isSupported() { return false; }
        public int getGlType() { return 0; }
        public static foundry.veil.api.client.render.vertex.VertexArrayBuilder.DataType fromType(java.lang.Object p0) { return null; }
    }
}
