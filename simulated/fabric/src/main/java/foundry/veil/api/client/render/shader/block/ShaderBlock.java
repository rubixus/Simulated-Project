package foundry.veil.api.client.render.shader.block;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.block.ShaderBlock
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ShaderBlock<T> {
    public static <T> foundry.veil.api.client.render.shader.block.ShaderBlock<T> withSize(foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding p0, int p1, java.util.function.BiConsumer<T, java.nio.ByteBuffer> p2) { return null; }
    public static <T> foundry.veil.api.client.render.shader.block.DynamicShaderBlock<T> dynamic(foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding p0, java.util.function.BiConsumer<T, java.nio.ByteBuffer> p1) { return null; }
    public static <T> foundry.veil.api.client.render.shader.block.DynamicShaderBlock<T> dynamic(foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding p0, int p1, java.util.function.BiConsumer<T, java.nio.ByteBuffer> p2) { return null; }
    public static foundry.veil.api.client.render.shader.block.DynamicShaderBlock<?> wrapper(foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding p0, int p1) { return null; }
    public default void update(T p0) {}
    public abstract void set(T p0);
    public abstract T getValue();
    public enum BufferBinding {
        UNIFORM(0),
        SHADER_STORAGE(0);
        public int getGlType() { return 0; }
    }
    public enum MemoryLayout {
        PACKED,
        SHARED,
        STD140,
        STD430;
        public io.github.ocelot.glslprocessor.api.grammar.GlslTypeQualifier.LayoutId getLayoutId() { return null; }
    }
}
