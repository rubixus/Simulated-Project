package dev.ryanhcode.sable.physics.chunk;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.chunk.VoxelNeighborhoodState
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public enum VoxelNeighborhoodState {
    EMPTY(0),
    FACE(0),
    EDGE(0),
    CORNER(0),
    INTERIOR(0);
    public static boolean isSolid(net.minecraft.world.level.BlockGetter p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.block.state.BlockState p2) { return false; }
    public static boolean isFullBlock(net.minecraft.world.level.BlockGetter p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.block.state.BlockState p2) { return false; }
    public static boolean isLiquid(net.minecraft.world.level.block.state.BlockState p0) { return false; }
    public static dev.ryanhcode.sable.physics.chunk.VoxelNeighborhoodState getState(dev.ryanhcode.sable.util.LevelAccelerator p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.chunk.LevelChunk p2) { return null; }
    public int getDebugColor() { return 0; }
    public byte byteRepresentation() { return 0; }
}
