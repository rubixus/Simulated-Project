package dev.ryanhcode.sable.api.physics;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.PhysicsPipelineBody
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface PhysicsPipelineBody {
    public static final int NULL_RUNTIME_ID = -1;
    public abstract int getRuntimeId();
    public abstract dev.ryanhcode.sable.api.physics.mass.MassData getMassTracker();
    public abstract boolean isRemoved();
}
