package foundry.veil.api.client.render.shader.program;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.program.ShaderProgram
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderProgram {
    public default void bind() {}
    public static void unbind() {}
    public default void setDefaultUniforms(java.lang.Object p0) {}
    public abstract void setDefaultUniforms(java.lang.Object p0, org.joml.Matrix4fc p1, org.joml.Matrix4fc p2);
    public abstract int getProgram();
    public abstract int getActiveDynamicBuffers();
    public abstract foundry.veil.api.client.render.shader.uniform.ShaderUniform getUniform(java.lang.CharSequence p0);
    public default void setUniformBlock(java.lang.CharSequence p0, int p1) {}
    public default void setStorageBlock(java.lang.CharSequence p0, int p1) {}
    public abstract foundry.veil.api.client.render.shader.program.ProgramDefinition getDefinition();
    public abstract it.unimi.dsi.fastutil.ints.Int2ObjectMap<foundry.veil.api.client.render.shader.compiler.CompiledShader> getShaders();
    public default foundry.veil.api.client.render.shader.compiler.CompiledShader getVertexShader() { return null; }
    public default foundry.veil.api.client.render.shader.compiler.CompiledShader getGeometryShader() { return null; }
    public default foundry.veil.api.client.render.shader.compiler.CompiledShader getTessellationControlShader() { return null; }
    public default foundry.veil.api.client.render.shader.compiler.CompiledShader getTessellationEvaluationShader() { return null; }
    public default foundry.veil.api.client.render.shader.compiler.CompiledShader getFragmentShader() { return null; }
    public default foundry.veil.api.client.render.shader.compiler.CompiledShader getComputeShader() { return null; }
    public abstract boolean isValid();
    public default boolean hasVertex() { return false; }
    public default boolean hasGeometry() { return false; }
    public default boolean hasFragment() { return false; }
    public default boolean hasTesselation() { return false; }
    public default boolean isCompute() { return false; }
    public abstract java.util.Set<foundry.veil.api.client.render.shader.ShaderFeature> getRequiredFeatures();
    public abstract com.mojang.blaze3d.vertex.VertexFormat getFormat();
    public abstract java.util.Set<java.lang.String> getDefinitionDependencies();
    public abstract java.lang.Object getName();
    public abstract java.lang.Object toShaderInstance();
}
