package foundry.veil.api.resource.editor;

// AUTO-GENERATED STUB for foundry.veil.api.resource.editor.ResourceFileEditor
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ResourceFileEditor<T extends foundry.veil.api.resource.VeilResource<?>> {
    public abstract void render();
    public abstract void loadFromDisk();
    public abstract boolean isClosed();
    public abstract T getResource();
    public default void close() {}
    public default java.util.concurrent.CompletableFuture<?> save(com.google.gson.JsonElement p0, foundry.veil.api.resource.VeilResourceManager p1, foundry.veil.api.resource.VeilResource<?> p2) throws java.io.IOException { return null; }
    public default java.util.concurrent.CompletableFuture<?> save(byte[] p0, foundry.veil.api.resource.VeilResourceManager p1, foundry.veil.api.resource.VeilResource<?> p2) { return null; }
    public interface Factory<T extends foundry.veil.api.resource.VeilResource<?>> {
        public abstract foundry.veil.api.resource.editor.ResourceFileEditor<T> open(foundry.veil.api.resource.VeilEditorEnvironment p0, T p1);
    }
}
