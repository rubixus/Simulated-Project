package dev.ryanhcode.sable.api.block;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BlockSubLevelLiftProvider {
    public static final net.minecraft.core.Direction[] DIRECTIONS = null;
    public static final org.joml.Vector3d LIFT_FORCE = null;
    public static final org.joml.Vector3d LIFT_POS = null;
    public static final org.joml.Vector3d LIFT_NORMAL = null;
    public static final org.joml.Vector3d LIFT_VELO = null;
    public static final org.joml.Vector3d DRAG = null;
    public static final org.joml.Vector3d TEMP = null;
    public static void resetVectors() {}
    public static java.util.List<dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider.LiftProviderGroup> groupLiftProviders(java.util.Collection<dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider.LiftProviderContext> p0) { return null; }
    public abstract net.minecraft.core.Direction sable$getNormal(net.minecraft.world.level.block.state.BlockState p0);
    public default float sable$getParallelDragScalar() { return 0.0f; }
    public default float sable$getDirectionlessDragScalar() { return 0.0f; }
    public default float sable$getLiftScalar() { return 0.0f; }
    public default void sable$contributeLiftAndDrag(dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider.LiftProviderContext p0, dev.ryanhcode.sable.sublevel.ServerSubLevel p1, dev.ryanhcode.sable.companion.math.Pose3d p2, double p3, org.joml.Vector3dc p4, org.joml.Vector3dc p5, org.joml.Vector3d p6, org.joml.Vector3d p7, dev.ryanhcode.sable.api.block.BlockSubLevelLiftProvider.LiftProviderGroup p8) {}
    public record LiftProviderContext(net.minecraft.core.BlockPos pos, net.minecraft.world.level.block.state.BlockState state, net.minecraft.world.phys.Vec3 dir) {
    }
    public final class LiftProviderGroup {
        public double totalLiftStrength = 0.0;
        public double totalDragStrength = 0.0;
        public LiftProviderGroup(java.util.Set<net.minecraft.core.BlockPos> p0) {}
        public java.util.Set<net.minecraft.core.BlockPos> positions() { return null; }
        public org.joml.Vector3d totalLift() { return null; }
        public org.joml.Vector3d liftCenter() { return null; }
        public org.joml.Vector3d totalDrag() { return null; }
        public org.joml.Vector3d dragCenter() { return null; }
    }
}
