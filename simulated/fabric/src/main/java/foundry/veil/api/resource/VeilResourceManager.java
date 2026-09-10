package foundry.veil.api.resource;

// AUTO-GENERATED STUB for foundry.veil.api.resource.VeilResourceManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilResourceManager {
    public static foundry.veil.api.resource.VeilResourceManager get() { return null; }
    public default net.minecraft.server.packs.resources.ResourceManager resources(foundry.veil.api.resource.VeilResourceInfo p0) { return null; }
    public abstract net.minecraft.server.packs.resources.ResourceManager clientResources();
    public abstract net.minecraft.server.packs.resources.ResourceManager serverResources();
    public abstract foundry.veil.api.resource.VeilResource<?> getVeilResource(java.lang.String p0, java.lang.String p1);
    public default foundry.veil.api.resource.VeilResource<?> getVeilResource(java.lang.Object p0) { return null; }
    public default net.minecraft.server.packs.resources.ResourceMetadata getResourceMetadata(java.lang.String p0, java.lang.String p1) { return null; }
    public default net.minecraft.server.packs.resources.ResourceMetadata getResourceMetadata(java.lang.Object p0) { return null; }
}
