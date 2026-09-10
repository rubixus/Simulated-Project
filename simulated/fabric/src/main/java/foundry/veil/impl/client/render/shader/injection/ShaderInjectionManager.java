package foundry.veil.impl.client.render.shader.injection;

// AUTO-GENERATED STUB for foundry.veil.impl.client.render.shader.injection.ShaderInjectionManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ShaderInjectionManager extends net.minecraft.server.packs.resources.SimplePreparableReloadListener<foundry.veil.impl.client.render.shader.injection.ShaderInjectionManager.Preparations> {
    public ShaderInjectionManager() {}
    public void applyModifiers(java.lang.Object p0, io.github.ocelot.glslprocessor.api.node.GlslTree p1, boolean p2) {}
    public java.util.List<foundry.veil.impl.client.render.shader.injection.util.ShaderInjection> getModifiers(java.lang.Object p0) { return null; }
    public java.lang.Object getModifierId(foundry.veil.impl.client.render.shader.injection.util.ShaderInjection p0) { return null; }
    public java.lang.Object getReplacement(java.lang.Object p0) { return null; }
    protected foundry.veil.impl.client.render.shader.injection.ShaderInjectionManager.Preparations prepare(net.minecraft.server.packs.resources.ResourceManager p0, net.minecraft.util.profiling.ProfilerFiller p1) { return null; }
    protected void apply(foundry.veil.impl.client.render.shader.injection.ShaderInjectionManager.Preparations p0, net.minecraft.server.packs.resources.ResourceManager p1, net.minecraft.util.profiling.ProfilerFiller p2) {}
    static public record Preparations(java.util.Map<java.lang.Object, java.util.List<foundry.veil.impl.client.render.shader.injection.util.ShaderInjection>> shaders, java.util.Map<foundry.veil.impl.client.render.shader.injection.util.ShaderInjection, java.lang.Object> names, java.util.Map<java.lang.Object, java.lang.Object> replacements) {
    }
}
