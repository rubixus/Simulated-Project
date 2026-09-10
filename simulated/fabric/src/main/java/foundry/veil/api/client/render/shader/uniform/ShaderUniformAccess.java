package foundry.veil.api.client.render.shader.uniform;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderUniformAccess {
    public static final foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess EMPTY = new foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess() { @Override public boolean isValid() { return false; }  @Override public void setFloat(float p0) {}  @Override public void setVector(float p0, float p1) {}  @Override public void setVector(float p0, float p1, float p2) {}  @Override public void setVector(float p0, float p1, float p2, float p3) {}  @Override public void setInt(int p0) {}  @Override public void setVectorI(int p0, int p1) {}  @Override public void setVectorI(int p0, int p1, int p2) {}  @Override public void setVectorI(int p0, int p1, int p2, int p3) {}  @Override public void setDouble(double p0) {}  @Override public void setVector64(double p0, double p1) {}  @Override public void setVector64(double p0, double p1, double p2) {}  @Override public void setVector64(double p0, double p1, double p2, double p3) {}  @Override public void setLong(long p0) {}  @Override public void setVectorI64(long p0, long p1) {}  @Override public void setVectorI64(long p0, long p1, long p2) {}  @Override public void setVectorI64(long p0, long p1, long p2, long p3) {}  @Override public void setFloats(float... p0) {}  @Override public void setVectors(org.joml.Vector2fc... p0) {}  @Override public void setVectors(org.joml.Vector3fc... p0) {}  @Override public void setVectors(org.joml.Vector4fc... p0) {}  @Override public void setInts(int... p0) {}  @Override public void setIVectors(org.joml.Vector2ic... p0) {}  @Override public void setIVectors(org.joml.Vector3ic... p0) {}  @Override public void setIVectors(org.joml.Vector4ic... p0) {}  @Override public void setDoubles(double... p0) {}  @Override public void set64Vectors(org.joml.Vector2dc... p0) {}  @Override public void set64Vectors(org.joml.Vector3dc... p0) {}  @Override public void set64Vectors(org.joml.Vector4dc... p0) {}  @Override public void setLongs(long... p0) {}  @Override public void setHandle(long p0) {}  @Override public void setHandles(long... p0) {}  @Override public void setMatrix(org.joml.Matrix2fc p0, boolean p1) {}  @Override public void setMatrix(org.joml.Matrix3fc p0, boolean p1) {}  @Override public void setMatrix(org.joml.Matrix4fc p0, boolean p1) {}  @Override public void setMatrix2x3(org.joml.Matrix3x2fc p0, boolean p1) {}  @Override public void setMatrix3x2(org.joml.Matrix3x2fc p0, boolean p1) {}  @Override public void setMatrix3x4(org.joml.Matrix4x3fc p0, boolean p1) {}  @Override public void setMatrix4x3(org.joml.Matrix4x3fc p0, boolean p1) {}  @Override public void setMatrix(org.joml.Matrix2dc p0, boolean p1) {}  @Override public void setMatrix(org.joml.Matrix3dc p0, boolean p1) {}  @Override public void setMatrix(org.joml.Matrix4dc p0, boolean p1) {}  @Override public void setMatrix2x3(org.joml.Matrix3x2dc p0, boolean p1) {}  @Override public void setMatrix3x2(org.joml.Matrix3x2dc p0, boolean p1) {}  @Override public void setMatrix3x4(org.joml.Matrix4x3dc p0, boolean p1) {}  @Override public void setMatrix4x3(org.joml.Matrix4x3dc p0, boolean p1) {} };
    public static foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess of(foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess... p0) { return null; }
    public static foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess wrapped(java.util.function.Supplier<foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess> p0) { return null; }
    public abstract boolean isValid();
    public abstract void setFloat(float p0);
    public abstract void setVector(float p0, float p1);
    public abstract void setVector(float p0, float p1, float p2);
    public abstract void setVector(float p0, float p1, float p2, float p3);
    public default void setVector(org.joml.Vector2fc p0) {}
    public default void setVector(org.joml.Vector3fc p0) {}
    public default void setVector(org.joml.Vector4fc p0) {}
    public default void setVector(float[] p0) {}
    public abstract void setInt(int p0);
    public abstract void setVectorI(int p0, int p1);
    public abstract void setVectorI(int p0, int p1, int p2);
    public abstract void setVectorI(int p0, int p1, int p2, int p3);
    public default void setVectorI(org.joml.Vector2ic p0) {}
    public default void setVectorI(org.joml.Vector3ic p0) {}
    public default void setVectorI(org.joml.Vector4ic p0) {}
    public default void setVectorI(int[] p0) {}
    public abstract void setDouble(double p0);
    public abstract void setVector64(double p0, double p1);
    public abstract void setVector64(double p0, double p1, double p2);
    public abstract void setVector64(double p0, double p1, double p2, double p3);
    public default void setVector64(org.joml.Vector2dc p0) {}
    public default void setVector64(org.joml.Vector3dc p0) {}
    public default void setVector64(org.joml.Vector4dc p0) {}
    public default void setVector64(double[] p0) {}
    public abstract void setLong(long p0);
    public abstract void setVectorI64(long p0, long p1);
    public abstract void setVectorI64(long p0, long p1, long p2);
    public abstract void setVectorI64(long p0, long p1, long p2, long p3);
    public default void setVectorI64(long[] p0) {}
    public abstract void setFloats(float... p0);
    public abstract void setVectors(org.joml.Vector2fc... p0);
    public abstract void setVectors(org.joml.Vector3fc... p0);
    public abstract void setVectors(org.joml.Vector4fc... p0);
    public abstract void setInts(int... p0);
    public abstract void setIVectors(org.joml.Vector2ic... p0);
    public abstract void setIVectors(org.joml.Vector3ic... p0);
    public abstract void setIVectors(org.joml.Vector4ic... p0);
    public abstract void setDoubles(double... p0);
    public abstract void set64Vectors(org.joml.Vector2dc... p0);
    public abstract void set64Vectors(org.joml.Vector3dc... p0);
    public abstract void set64Vectors(org.joml.Vector4dc... p0);
    public abstract void setLongs(long... p0);
    public abstract void setHandle(long p0);
    public abstract void setHandles(long... p0);
    public default void setMatrix(org.joml.Matrix2fc p0) {}
    public default void setMatrix(org.joml.Matrix3fc p0) {}
    public default void setMatrix(org.joml.Matrix4fc p0) {}
    public default void setMatrix2x3(org.joml.Matrix3x2fc p0) {}
    public default void setMatrix3x2(org.joml.Matrix3x2fc p0) {}
    public default void setMatrix3x4(org.joml.Matrix4x3fc p0) {}
    public default void setMatrix4x3(org.joml.Matrix4x3fc p0) {}
    public abstract void setMatrix(org.joml.Matrix2fc p0, boolean p1);
    public abstract void setMatrix(org.joml.Matrix3fc p0, boolean p1);
    public abstract void setMatrix(org.joml.Matrix4fc p0, boolean p1);
    public abstract void setMatrix2x3(org.joml.Matrix3x2fc p0, boolean p1);
    public abstract void setMatrix3x2(org.joml.Matrix3x2fc p0, boolean p1);
    public abstract void setMatrix3x4(org.joml.Matrix4x3fc p0, boolean p1);
    public abstract void setMatrix4x3(org.joml.Matrix4x3fc p0, boolean p1);
    public default void setMatrix(org.joml.Matrix2dc p0) {}
    public default void setMatrix(org.joml.Matrix3dc p0) {}
    public default void setMatrix(org.joml.Matrix4dc p0) {}
    public default void setMatrix2x3(org.joml.Matrix3x2dc p0) {}
    public default void setMatrix3x2(org.joml.Matrix3x2dc p0) {}
    public default void setMatrix3x4(org.joml.Matrix4x3dc p0) {}
    public default void setMatrix4x3(org.joml.Matrix4x3dc p0) {}
    public abstract void setMatrix(org.joml.Matrix2dc p0, boolean p1);
    public abstract void setMatrix(org.joml.Matrix3dc p0, boolean p1);
    public abstract void setMatrix(org.joml.Matrix4dc p0, boolean p1);
    public abstract void setMatrix2x3(org.joml.Matrix3x2dc p0, boolean p1);
    public abstract void setMatrix3x2(org.joml.Matrix3x2dc p0, boolean p1);
    public abstract void setMatrix3x4(org.joml.Matrix4x3dc p0, boolean p1);
    public abstract void setMatrix4x3(org.joml.Matrix4x3dc p0, boolean p1);
}
