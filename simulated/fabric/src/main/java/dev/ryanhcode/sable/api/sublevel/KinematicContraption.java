package dev.ryanhcode.sable.api.sublevel;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.sublevel.KinematicContraption
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface KinematicContraption {
    public abstract void sable$getLocalBounds(dev.ryanhcode.sable.companion.math.BoundingBox3i p0);
    public abstract net.minecraft.world.level.BlockGetter sable$blockGetter();
    public abstract dev.ryanhcode.sable.api.physics.mass.MassTracker sable$getMassTracker();
    public abstract org.joml.Vector3dc sable$getPosition(double p0);
    public abstract org.joml.Quaterniond sable$getOrientation(double p0);
    public abstract java.util.Map<net.minecraft.core.BlockPos, dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider.LiftProviderContext> sable$liftProviders();
    public abstract dev.ryanhcode.sable.physics.floating_block.FloatingClusterContainer sable$getFloatingClusterContainer();
    public abstract boolean sable$shouldCollide();
    public abstract boolean sable$isValid();
    public default org.joml.Vector3dc sable$getPosition() { return null; }
    public default org.joml.Quaterniond sable$getOrientation() { return null; }
    public default dev.ryanhcode.sable.companion.math.Pose3d sable$getLocalPose(dev.ryanhcode.sable.companion.math.Pose3d p0, double p1) { return null; }
}
