package dev.ryanhcode.sable.api.particle;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.particle.ParticleSubLevelKickable
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ParticleSubLevelKickable {
    public default boolean sable$shouldCareAboutIntersectingSubLevels() { return false; }
    public abstract boolean sable$shouldKickFromTracking();
    public abstract boolean sable$shouldCollideWithTrackingSubLevel();
    public default org.joml.Vector3dc sable$getUpDirection() { return null; }
}
