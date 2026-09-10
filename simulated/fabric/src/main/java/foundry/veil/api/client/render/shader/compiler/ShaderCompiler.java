package foundry.veil.api.client.render.shader.compiler;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.compiler.ShaderCompiler
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderCompiler {
    public abstract foundry.veil.api.client.render.shader.compiler.CompiledShader compile(int p0, java.lang.Object p1) throws java.io.IOException, foundry.veil.api.client.render.shader.compiler.ShaderException;
    public abstract foundry.veil.api.client.render.shader.compiler.CompiledShader compile(int p0, foundry.veil.api.client.render.shader.compiler.VeilShaderSource p1) throws foundry.veil.api.client.render.shader.compiler.ShaderException;
    public static foundry.veil.api.client.render.shader.compiler.ShaderCompiler direct(foundry.veil.api.client.render.shader.compiler.ShaderCompiler.ShaderProvider p0) { return null; }
    public static foundry.veil.api.client.render.shader.compiler.ShaderCompiler cached(foundry.veil.api.client.render.shader.compiler.ShaderCompiler.ShaderProvider p0) { return null; }
    public interface ShaderProvider {
        public abstract foundry.veil.api.client.render.shader.compiler.VeilShaderSource getShader(java.lang.Object p0) throws java.io.FileNotFoundException;
    }
}
