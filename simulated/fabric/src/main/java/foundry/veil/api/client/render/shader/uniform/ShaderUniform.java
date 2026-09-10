package foundry.veil.api.client.render.shader.uniform;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.uniform.ShaderUniform
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderUniform {
    public abstract void invalidateCache();
    public abstract java.lang.String getName();
    public abstract int getLocation();
    public abstract foundry.veil.api.client.render.shader.uniform.ShaderUniform.Type getType();
    public abstract int getArrayLength();
    public abstract float getFloat();
    public default float[] getFloats() { return null; }
    public default void getFloats(float[] p0) {}
    public abstract void getFloats(float[] p0, int p1, int p2);
    public abstract int getInt();
    public default int[] getInts() { return null; }
    public default void getInts(int[] p0) {}
    public abstract void getInts(int[] p0, int p1, int p2);
    public abstract double getDouble();
    public default double[] getDoubles() { return null; }
    public default void getDoubles(double[] p0) {}
    public abstract void getDoubles(double[] p0, int p1, int p2);
    public abstract long getLong();
    public default long[] getLongs() { return null; }
    public default void getLongs(long[] p0) {}
    public abstract void getLongs(long[] p0, int p1, int p2);
    public abstract void getVector(java.lang.CharSequence p0, org.joml.Vector2f... p1);
    public abstract void getVector(java.lang.CharSequence p0, org.joml.Vector3f... p1);
    public abstract void getVector(java.lang.CharSequence p0, org.joml.Vector4f... p1);
    public abstract void getVectori(java.lang.CharSequence p0, org.joml.Vector2i... p1);
    public abstract void getVectori(java.lang.CharSequence p0, org.joml.Vector3i... p1);
    public abstract void getVectori(java.lang.CharSequence p0, org.joml.Vector4i... p1);
    public abstract void getMatrix(java.lang.CharSequence p0, org.joml.Matrix2f p1);
    public abstract void getMatrix(java.lang.CharSequence p0, org.joml.Matrix3f p1);
    public abstract void getMatrix(java.lang.CharSequence p0, org.joml.Matrix4f p1);
    public abstract void getMatrix(java.lang.CharSequence p0, org.joml.Matrix3x2f p1);
    public abstract void getMatrix(java.lang.CharSequence p0, org.joml.Matrix4x3f p1);
    public enum Type {
        SAMPLER(0),
        FLOAT(0),
        FLOAT_VEC2(0),
        FLOAT_VEC3(0),
        FLOAT_VEC4(0),
        INT(0),
        INT_VEC2(0),
        INT_VEC3(0),
        INT_VEC4(0),
        UNSIGNED_INT(0),
        UNSIGNED_INT_VEC2(0),
        UNSIGNED_INT_VEC3(0),
        UNSIGNED_INT_VEC4(0),
        MATRIX2x2(0),
        MATRIX3x3(0),
        MATRIX4x4(0),
        MATRIX2x3(0),
        MATRIX3x2(0),
        MATRIX2x4(0),
        MATRIX4x2(0),
        MATRIX3x4(0),
        MATRIX4x3(0),
        DOUBLE(0),
        DOUBLE_VEC2(0),
        DOUBLE_VEC3(0),
        DOUBLE_VEC4(0),
        LONG(0),
        LONG_VEC2(0),
        LONG_VEC3(0),
        LONG_VEC4(0),
        UNSIGNED_LONG(0),
        UNSIGNED_LONG_VEC2(0),
        UNSIGNED_LONG_VEC3(0),
        UNSIGNED_LONG_VEC4(0),
        DOUBLE_MATRIX2x2(0),
        DOUBLE_MATRIX3x3(0),
        DOUBLE_MATRIX4x4(0),
        DOUBLE_MATRIX2x3(0),
        DOUBLE_MATRIX3x2(0),
        DOUBLE_MATRIX2x4(0),
        DOUBLE_MATRIX4x2(0),
        DOUBLE_MATRIX3x4(0),
        DOUBLE_MATRIX4x3(0);
        public static foundry.veil.api.client.render.shader.uniform.ShaderUniform.Type byId(int p0) { return null; }
        public void upload(int p0, int p1, java.nio.ByteBuffer p2) {}
        public void uploadAsMatrix(int p0, int p1, boolean p2, java.nio.ByteBuffer p3) {}
        public int getBytes() { return 0; }
    }
}
