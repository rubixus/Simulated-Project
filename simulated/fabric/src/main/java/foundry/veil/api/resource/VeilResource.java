package foundry.veil.api.resource;

// AUTO-GENERATED STUB for foundry.veil.api.resource.VeilResource
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilResource<T extends foundry.veil.api.resource.VeilResource<?>> {
    public default void render(boolean p0, boolean p1) {}
    public default java.util.concurrent.CompletableFuture<?> onFileSystemChange(foundry.veil.api.resource.VeilResourceManager p0, java.nio.file.WatchEvent<java.nio.file.Path> p1) { return null; }
    public abstract foundry.veil.api.resource.VeilResourceInfo resourceInfo();
    public abstract java.util.List<foundry.veil.api.resource.VeilResourceAction<T>> getActions();
    public abstract boolean canHotReload();
    public abstract void hotReload(foundry.veil.api.resource.VeilResourceManager p0) throws java.io.IOException;
    public default void copyToResources() throws java.io.IOException {}
    public abstract int getIconCode();
}
