package foundry.veil.api.quasar.data;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.data.ParticleEmitterData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record ParticleEmitterData(int maxLifetime, boolean loop, int rate, int count, int maxParticles, foundry.veil.api.quasar.data.EmitterSettings emitterSettings, net.minecraft.core.Holder<foundry.veil.api.quasar.data.QuasarParticleData> particleDataHolder) {
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.data.ParticleEmitterData> DIRECT_CODEC = null;
    public static final com.mojang.serialization.Codec<net.minecraft.core.Holder<foundry.veil.api.quasar.data.ParticleEmitterData>> CODEC = null;
    public foundry.veil.api.quasar.data.QuasarParticleData particleData() { return null; }
    public java.lang.Object getRegistryId() { return null; }
}
