package dev.ryanhcode.sable.api.block.propeller;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.block.propeller.BlockEntityPropeller
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BlockEntityPropeller {
    public abstract net.minecraft.core.Direction getBlockDirection();
    public abstract double getAirflow();
    public abstract double getThrust();
    public abstract boolean isActive();
    public default double getScaledThrust() { return 0.0; }
    public default double getCurrentAirPressure() { return 0.0; }
    public default double getAirflowScaling() { return 0.0; }
    public abstract net.minecraft.world.level.Level getLevel();
    public abstract net.minecraft.core.BlockPos getBlockPos();
}
