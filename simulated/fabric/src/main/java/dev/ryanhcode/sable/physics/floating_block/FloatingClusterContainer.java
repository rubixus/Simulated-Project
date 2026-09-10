package dev.ryanhcode.sable.physics.floating_block;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.floating_block.FloatingClusterContainer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class FloatingClusterContainer {
    public java.util.List<dev.ryanhcode.sable.physics.floating_block.FloatingBlockCluster> clusters = null;
    public final org.joml.Vector3d positionOffset = null;
    public final org.joml.Quaterniond rotationOffset = null;
    public final org.joml.Vector3d velocity = null;
    public final org.joml.Vector3d angularVelocity = null;
    public FloatingClusterContainer() {}
    public boolean needsTicking() { return false; }
    public void processBlockChanges(org.joml.Vector3dc p0) {}
    public void addFloatingBlock(net.minecraft.world.level.block.state.BlockState p0, org.joml.Vector3d p1) {}
    public void removeFloatingBlock(net.minecraft.world.level.block.state.BlockState p0, org.joml.Vector3d p1) {}
    public void queueAddFloatingBlock(net.minecraft.world.level.block.state.BlockState p0, net.minecraft.core.BlockPos p1) {}
    public void queueRemoveFloatingBlock(net.minecraft.world.level.block.state.BlockState p0, net.minecraft.core.BlockPos p1) {}
}
