package foundry.veil.platform.registry;

// AUTO-GENERATED STUB for foundry.veil.platform.registry.RegistrationProvider
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface RegistrationProvider<T> {
    public static final foundry.veil.platform.registry.RegistrationProvider.Factory FACTORY = new foundry.veil.platform.registry.RegistrationProvider.Factory() { @Override public <T> foundry.veil.platform.registry.RegistrationProvider<T> create(net.minecraft.resources.ResourceKey<? extends net.minecraft.core.Registry<T>> p0, java.lang.String p1) { return null; } };
    public static <T> foundry.veil.platform.registry.RegistrationProvider<T> get(net.minecraft.resources.ResourceKey<? extends net.minecraft.core.Registry<T>> p0, java.lang.String p1) { return null; }
    public static <T> foundry.veil.platform.registry.RegistrationProvider<T> get(net.minecraft.core.Registry<T> p0, java.lang.String p1) { return null; }
    public default <I extends T> foundry.veil.platform.registry.RegistryObject<I> register(java.lang.String p0, java.util.function.Supplier<? extends I> p1) { return null; }
    public abstract <I extends T> foundry.veil.platform.registry.RegistryObject<I> register(java.lang.Object p0, java.util.function.Supplier<? extends I> p1);
    public abstract java.util.Collection<foundry.veil.platform.registry.RegistryObject<T>> getEntries();
    public abstract net.minecraft.core.Registry<T> asVanillaRegistry();
    public abstract java.lang.String getModId();
    public interface Factory {
        public abstract <T> foundry.veil.platform.registry.RegistrationProvider<T> create(net.minecraft.resources.ResourceKey<? extends net.minecraft.core.Registry<T>> p0, java.lang.String p1);
        public default <T> foundry.veil.platform.registry.RegistrationProvider<T> create(net.minecraft.core.Registry<T> p0, java.lang.String p1) { return null; }
    }
}
