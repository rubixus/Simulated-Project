package foundry.veil.api.client.render.shader.compiler;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.compiler.CompiledShader
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record CompiledShader(java.lang.Object sourceFile, int id, it.unimi.dsi.fastutil.objects.Object2IntMap<java.lang.String> uniformBindings, java.util.Set<java.lang.String> definitionDependencies, java.util.Set<java.lang.Object> includes) {
    public void apply(foundry.veil.api.client.render.shader.program.ShaderProgram p0) {}
    public void free() {}
}
