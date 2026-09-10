package foundry.veil.api.event;

// AUTO-GENERATED STUB for foundry.veil.api.event.VeilAddShaderPreProcessorsEvent
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilAddShaderPreProcessorsEvent {
    public abstract void onRegisterShaderPreProcessors(net.minecraft.server.packs.resources.ResourceProvider p0, foundry.veil.api.event.VeilAddShaderPreProcessorsEvent.Registry p1);
    public interface Registry {
        public abstract void addPreprocessorFirst(foundry.veil.api.client.render.shader.processor.ShaderPreProcessor p0, boolean p1);
        public default void addPreprocessorFirst(foundry.veil.api.client.render.shader.processor.ShaderPreProcessor p0) {}
        public abstract void addPreprocessor(foundry.veil.api.client.render.shader.processor.ShaderPreProcessor p0, boolean p1);
        public default void addPreprocessor(foundry.veil.api.client.render.shader.processor.ShaderPreProcessor p0) {}
    }
}
