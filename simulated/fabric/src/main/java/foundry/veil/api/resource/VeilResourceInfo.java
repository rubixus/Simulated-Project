package foundry.veil.api.resource;

// AUTO-GENERATED STUB for foundry.veil.api.resource.VeilResourceInfo
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record VeilResourceInfo(net.minecraft.server.packs.PackType packType, java.lang.Object location, java.nio.file.Path filePath, java.nio.file.Path modResourcePath, boolean isStatic) {
    public java.util.Optional<net.minecraft.server.packs.resources.Resource> getResource(foundry.veil.api.resource.VeilResourceManager p0) { return null; }
    public net.minecraft.server.packs.resources.Resource getResourceOrThrow(foundry.veil.api.resource.VeilResourceManager p0) throws java.io.FileNotFoundException { return null; }
    public java.io.InputStream open(foundry.veil.api.resource.VeilResourceManager p0) throws java.io.IOException { return null; }
    public java.io.BufferedReader openAsReader(foundry.veil.api.resource.VeilResourceManager p0) throws java.io.IOException { return null; }
    public java.lang.String fileName() { return null; }
    public boolean hidden() { return false; }
}
