package foundry.veil.api.client.render.shader;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.ShaderManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ShaderManager implements net.minecraft.server.packs.resources.PreparableReloadListener, java.io.Closeable {
    public static final net.minecraft.resources.FileToIdConverter INCLUDE_LISTER = null;
    public static final foundry.veil.api.client.render.shader.ShaderSourceSet PROGRAM_SET = null;
    public ShaderManager(foundry.veil.api.client.render.shader.ShaderSourceSet p0, foundry.veil.api.client.render.shader.ShaderPreDefinitions p1, foundry.veil.impl.client.render.dynamicbuffer.DynamicBufferManager p2) {}
    public java.util.concurrent.CompletableFuture<foundry.veil.api.client.render.shader.program.ShaderProgram> createDynamicProgram(java.lang.Object p0, it.unimi.dsi.fastutil.ints.Int2ObjectMap<java.lang.String> p1) { return null; }
    public void setGlobal(java.util.function.Consumer<foundry.veil.api.client.render.shader.program.ShaderProgram> p0) {}
    public boolean hasFeatures(foundry.veil.api.client.render.shader.ShaderFeature... p0) { return false; }
    public foundry.veil.api.client.render.shader.program.ShaderProgram getShader(java.lang.Object p0) { return null; }
    public java.util.Map<java.lang.Object, foundry.veil.api.client.render.shader.program.ShaderProgram> getShaders() { return null; }
    public foundry.veil.api.client.render.shader.ShaderSourceSet getSourceSet() { return null; }
    public void scheduleRecompile(java.lang.Object p0) {}
    public void setActiveBuffers(int p0) {}
    public java.util.concurrent.CompletableFuture<java.lang.Void> getRecompileFuture() { return null; }
    public java.util.concurrent.CompletableFuture<java.lang.Void> getUpdateBuffersFuture() { return null; }
    public static java.lang.String getTypeName(int p0) { return null; }
    public void close() {}
    public void addMacros(java.util.Map<java.lang.String, java.lang.String> p0) {}
    static record ProgramSource(foundry.veil.api.client.render.shader.compiler.ShaderCompiler createCompiler, foundry.veil.api.client.render.shader.program.ProgramDefinition definition, java.util.Map<java.lang.Object, foundry.veil.api.client.render.shader.compiler.VeilShaderSource> sources) {
    }
}
