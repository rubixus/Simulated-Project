package foundry.veil.impl.client.render.shader.block;

// AUTO-GENERATED STUB for foundry.veil.impl.client.render.shader.block.ShaderBlockImpl
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class ShaderBlockImpl<T> implements foundry.veil.api.client.render.shader.block.ShaderBlock<T> {
    protected final foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding binding = null;
    protected int buffer = 0;
    protected T value = null;
    protected boolean dirty = false;
    protected ShaderBlockImpl(foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding p0) {}
    protected static foundry.veil.impl.client.render.shader.block.ShaderBlockImpl.StorageType getStorageType() { return null; }
    public void set(T p0) {}
    public abstract void bind(int p0);
    public abstract void unbind(int p0);
    public foundry.veil.api.client.render.shader.block.ShaderBlock.BufferBinding getBinding() { return null; }
    public int getIndex() { return 0; }
    public T getValue() { return null; }
    public void setIndex(int p0) {}
    public void free() {}
    static public enum StorageType {
        LEGACY,
        DSA;
        public int createBuffer(int p0) { return 0; }
        public void resize(int p0, int p1, long p2) {}
        public void write(int p0, int p1, java.nio.ByteBuffer p2) {}
    }
}
