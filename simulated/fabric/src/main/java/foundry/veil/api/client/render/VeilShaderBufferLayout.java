package foundry.veil.api.client.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.VeilShaderBufferLayout
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record VeilShaderBufferLayout<T>(java.lang.String name, java.util.Map<java.lang.String, foundry.veil.api.client.render.VeilShaderBufferLayout.FieldSerializer<T>> fields, foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding binding, foundry.veil.api.client.render.shader.block.ShaderBlock.MemoryLayout memoryLayout, io.github.ocelot.glslprocessor.api.grammar.GlslStructSpecifier structSpecifier) {
    public io.github.ocelot.glslprocessor.api.node.GlslNode createNode(boolean p0, java.lang.String p1) { return null; }
    public static <T> foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> builder() { return null; }
    public foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding requestedBinding() { return null; }
    static public class Builder<T> {
        public Builder() {}
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> binding(foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding p0) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> memoryLayout(foundry.veil.api.client.render.shader.block.ShaderBlock.MemoryLayout p0) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> f32(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> f64(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> integer(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> uint(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> vec2(java.lang.String p0, java.util.function.Function<T, org.joml.Vector2fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> vec2(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p2) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> vec3(java.lang.String p0, java.util.function.Function<T, org.joml.Vector3fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> vec3(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p3) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> vec4(java.lang.String p0, java.util.function.Function<T, org.joml.Vector4fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> vec4(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p3, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.FloatSerializer<T> p4) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dvec2(java.lang.String p0, java.util.function.Function<T, org.joml.Vector2dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dvec2(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p2) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dvec3(java.lang.String p0, java.util.function.Function<T, org.joml.Vector3dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dvec3(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p3) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dvec4(java.lang.String p0, java.util.function.Function<T, org.joml.Vector4dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dvec4(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p3, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.DoubleSerializer<T> p4) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> ivec2(java.lang.String p0, java.util.function.Function<T, org.joml.Vector2ic> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> ivec2(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p2) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> ivec3(java.lang.String p0, java.util.function.Function<T, org.joml.Vector3ic> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> ivec3(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p3) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> ivec4(java.lang.String p0, java.util.function.Function<T, org.joml.Vector4ic> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> ivec4(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p3, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p4) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> uvec2(java.lang.String p0, java.util.function.Function<T, org.joml.Vector2ic> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> uvec2(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p2) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> uvec3(java.lang.String p0, java.util.function.Function<T, org.joml.Vector3ic> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> uvec3(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p3) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> uvec4(java.lang.String p0, java.util.function.Function<T, org.joml.Vector4ic> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> uvec4(java.lang.String p0, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p1, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p2, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p3, foundry.veil.api.client.render.VeilShaderBufferLayout.Builder.IntSerializer<T> p4) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> mat2(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix2fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> mat3(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix3fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> mat4(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix4fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> mat3x2(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix3x2fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> mat4x3(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix4x3fc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dmat2(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix2dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dmat3(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix3dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dmat4(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix4dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dmat3x2(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix3x2dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout.Builder<T> dmat4x3(java.lang.String p0, java.util.function.Function<T, org.joml.Matrix4x3dc> p1) { return null; }
        public foundry.veil.api.client.render.VeilShaderBufferLayout<T> build() { return null; }
        public interface DoubleSerializer<T> {
            public abstract double serialize(T p0);
        }
        public interface FloatSerializer<T> {
            public abstract float serialize(T p0);
        }
        public interface IntSerializer<T> {
            public abstract int serialize(T p0);
        }
    }
    public interface FieldSerializer<T> {
        public abstract void write(T p0, int p1, java.nio.ByteBuffer p2);
    }
}
