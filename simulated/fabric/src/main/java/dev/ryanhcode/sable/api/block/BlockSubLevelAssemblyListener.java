package dev.ryanhcode.sable.api.block;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.block.BlockSubLevelAssemblyListener
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BlockSubLevelAssemblyListener {
    public default void beforeMove(net.minecraft.server.level.ServerLevel p0, net.minecraft.server.level.ServerLevel p1, net.minecraft.world.level.block.state.BlockState p2, net.minecraft.core.BlockPos p3, net.minecraft.core.BlockPos p4) {}
    public abstract void afterMove(net.minecraft.server.level.ServerLevel p0, net.minecraft.server.level.ServerLevel p1, net.minecraft.world.level.block.state.BlockState p2, net.minecraft.core.BlockPos p3, net.minecraft.core.BlockPos p4);
}
