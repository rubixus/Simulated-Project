package foundry.veil.platform.registry;

// AUTO-GENERATED STUB for foundry.veil.platform.registry.RegistryObject
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface RegistryObject<T> {
    public abstract net.minecraft.resources.ResourceKey<T> getResourceKey();
    public default java.lang.Object getId() { return null; }
    public abstract boolean isPresent();
    public abstract T get();
    public abstract net.minecraft.core.Holder<T> asHolder();
}
