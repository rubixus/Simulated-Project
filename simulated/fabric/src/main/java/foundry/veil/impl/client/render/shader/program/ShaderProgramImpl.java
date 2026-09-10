package foundry.veil.impl.client.render.shader.program;

// AUTO-GENERATED STUB for foundry.veil.impl.client.render.shader.program.ShaderProgramImpl
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ShaderProgramImpl implements foundry.veil.api.client.render.shader.program.ShaderProgram {
    public static final foundry.veil.api.client.render.shader.compiler.VeilShaderSource DUMMY_FRAGMENT_SHADER = null;
    public ShaderProgramImpl(java.lang.Object p0) {}
    public static void saveBlendState(boolean p0) {}
    public static void restoreBlendState() {}
    protected void applyProgram(foundry.veil.impl.client.render.shader.program.ShaderProgramImpl.CompiledProgram p0) {}
    protected void attachShaders(foundry.veil.impl.client.render.shader.program.ShaderProgramImpl.CompiledProgram p0, foundry.veil.api.client.render.shader.ShaderSourceSet p1, foundry.veil.api.client.render.shader.compiler.ShaderCompiler p2) throws foundry.veil.api.client.render.shader.compiler.ShaderException, java.io.IOException {}
    public void compile(int p0, foundry.veil.api.client.render.shader.ShaderSourceSet p1, foundry.veil.api.client.render.shader.program.ProgramDefinition p2, foundry.veil.api.client.render.shader.compiler.ShaderCompiler p3) throws foundry.veil.api.client.render.shader.compiler.ShaderException, java.io.IOException {}
    public void recompile(int p0, foundry.veil.api.client.render.shader.ShaderSourceSet p1, foundry.veil.api.client.render.shader.compiler.ShaderCompiler p2) throws foundry.veil.api.client.render.shader.compiler.ShaderException, java.io.IOException {}
    public boolean setActiveBuffers(int p0) { return false; }
    public void bind() {}
    public void setDefaultUniforms(java.lang.Object p0, org.joml.Matrix4fc p1, org.joml.Matrix4fc p2) {}
    public void freeInternal() {}
    public void free() {}
    public it.unimi.dsi.fastutil.ints.Int2ObjectMap<foundry.veil.api.client.render.shader.compiler.CompiledShader> getShaders() { return null; }
    public boolean isValid() { return false; }
    public java.util.Set<foundry.veil.api.client.render.shader.ShaderFeature> getRequiredFeatures() { return null; }
    public com.mojang.blaze3d.vertex.VertexFormat getFormat() { return null; }
    public java.util.Set<java.lang.String> getDefinitionDependencies() { return null; }
    public java.lang.Object getName() { return null; }
    public foundry.veil.impl.client.render.shader.program.ShaderProgramImpl.Wrapper toShaderInstance() { return null; }
    public int getUniformLocation(java.lang.CharSequence p0) { return 0; }
    public foundry.veil.impl.client.render.shader.uniform.ShaderUniformImpl getUniform(java.lang.CharSequence p0) { return null; }
    public foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess getUniformSafe(java.lang.CharSequence p0) { return null; }
    public boolean hasUniform(java.lang.CharSequence p0) { return false; }
    public int getUniformBlock(java.lang.CharSequence p0) { return 0; }
    public boolean hasUniformBlock(java.lang.CharSequence p0) { return false; }
    public int getStorageBlock(java.lang.CharSequence p0) { return 0; }
    public boolean hasStorageBlock(java.lang.CharSequence p0) { return false; }
    public int getProgram() { return 0; }
    public int getActiveDynamicBuffers() { return 0; }
    public foundry.veil.api.client.render.shader.program.ProgramDefinition getDefinition() { return null; }
    public void bindSamplers(foundry.veil.api.client.render.shader.texture.ShaderTextureSource.Context p0, int p1) {}
    public void setTexture(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void removeTexture(java.lang.CharSequence p0) {}
    public void clearSamplers() {}
    public void addShaderBlock(java.lang.String p0, foundry.veil.api.client.render.shader.block.ShaderBlock<?> p1) {}
    public void clearShaderBlocks() {}
    static public record CompiledProgram(int program, it.unimi.dsi.fastutil.ints.Int2ObjectMap<foundry.veil.api.client.render.shader.compiler.CompiledShader> shaders, it.unimi.dsi.fastutil.ints.Int2ObjectMap<foundry.veil.api.client.render.shader.compiler.CompiledShader> shadersView, foundry.veil.api.client.render.shader.program.ShaderUniformCache uniformCache, java.util.Set<java.lang.String> definitionDependencies, int activeBuffers) {
        public static foundry.veil.impl.client.render.shader.program.ShaderProgramImpl.CompiledProgram create(java.lang.Object p0, int p1) { return null; }
        public void attachShader(int p0, foundry.veil.api.client.render.shader.compiler.CompiledShader p1) {}
        public com.mojang.blaze3d.vertex.VertexFormat detectVertexFormat() { return null; }
        public void validate(foundry.veil.api.client.render.shader.program.ShaderProgram p0) {}
        public void link() throws foundry.veil.api.client.render.shader.compiler.ShaderException {}
        public void setup(foundry.veil.api.client.render.shader.program.ShaderProgram p0) {}
        public void free() {}
    }
    static public record ShaderTexture(foundry.veil.api.client.render.shader.texture.ShaderTextureSource textureSource, foundry.veil.api.client.render.texture.SamplerObject sampler) {
        public static foundry.veil.impl.client.render.shader.program.ShaderProgramImpl.ShaderTexture create(foundry.veil.api.client.render.shader.texture.ShaderTextureSource p0) { return null; }
        public void free() {}
        public int samplerId() { return 0; }
    }
    static public class UniformWrapper {
        public UniformWrapper(java.lang.String p0, java.util.function.Supplier<foundry.veil.api.client.render.shader.uniform.ShaderUniform> p1) {}
        public void close() {}
    }
    static public class Wrapper extends java.lang.Object {
        public static foundry.veil.api.client.render.shader.program.ShaderProgram constructingProgram = null;
        public void close() {}
        public foundry.veil.impl.client.render.shader.program.ShaderProgramImpl.UniformWrapper getUniform(java.lang.String p0) { return null; }
        public foundry.veil.api.client.render.shader.program.ShaderProgram program() { return null; }
    }
}
