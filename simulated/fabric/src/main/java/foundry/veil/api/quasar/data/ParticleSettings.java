package foundry.veil.api.quasar.data;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.data.ParticleSettings
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record ParticleSettings(float particleSpeed, float particleSpeedVariation, float particleSize, float particleSizeVariation, int particleLifetime, float particleLifetimeVariation, org.joml.Vector3fc initialDirection, boolean randomInitialDirection, org.joml.Vector3fc initialDirectionVariation, org.joml.Vector3fc initialRotation, boolean randomInitialRotation, org.joml.Vector3fc initialRotationVariation, boolean randomSpeed, boolean randomSize, boolean randomLifetime) {
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.data.ParticleSettings> DIRECT_CODEC = null;
    public static final com.mojang.serialization.Codec<net.minecraft.core.Holder<foundry.veil.api.quasar.data.ParticleSettings>> CODEC = null;
    public org.joml.Vector3f particleDirection(net.minecraft.util.RandomSource p0) { return null; }
    public java.lang.Object getRegistryId() { return null; }
}
