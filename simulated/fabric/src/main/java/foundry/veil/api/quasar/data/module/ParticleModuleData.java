package foundry.veil.api.quasar.data.module;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.data.module.ParticleModuleData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ParticleModuleData {
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.data.module.ParticleModuleData> DIRECT_CODEC = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.data.module.ParticleModuleData> INIT_DIRECT_CODEC = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.data.module.ParticleModuleData> UPDATE_DIRECT_CODEC = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.data.module.ParticleModuleData> RENDER_DIRECT_CODEC = null;
    public static final com.mojang.serialization.Codec<net.minecraft.core.Holder<foundry.veil.api.quasar.data.module.ParticleModuleData>> CODEC = null;
    public static final com.mojang.serialization.Codec<net.minecraft.core.Holder<foundry.veil.api.quasar.data.module.ParticleModuleData>> INIT_CODEC = null;
    public static final com.mojang.serialization.Codec<net.minecraft.core.Holder<foundry.veil.api.quasar.data.module.ParticleModuleData>> UPDATE_CODEC = null;
    public static final com.mojang.serialization.Codec<net.minecraft.core.Holder<foundry.veil.api.quasar.data.module.ParticleModuleData>> RENDER_CODEC = null;
    public abstract void addModules(foundry.veil.api.quasar.particle.ParticleModuleSet.Builder p0);
    public abstract foundry.veil.api.quasar.data.module.ModuleType<?> getType();
}
