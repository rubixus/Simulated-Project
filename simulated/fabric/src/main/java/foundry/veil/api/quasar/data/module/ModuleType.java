package foundry.veil.api.quasar.data.module;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.data.module.ModuleType
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ModuleType<T extends foundry.veil.api.quasar.data.module.ParticleModuleData> {
    public abstract com.mojang.serialization.MapCodec<T> codec();
    public default java.util.function.Supplier<T> defaultValue() { return null; }
    public default foundry.veil.api.quasar.data.module.ModuleType.DeprecationStatus deprecationStatus() { return null; }
    public record DeprecationStatus(java.lang.String reason, java.lang.String removeVersion) {
    }
}
