package dev.ryanhcode.sable.api;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.SubLevelAssemblyHelper
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelAssemblyHelper {
    public SubLevelAssemblyHelper() {}
    public static dev.ryanhcode.sable.sublevel.ServerSubLevel assembleBlocks(net.minecraft.server.level.ServerLevel p0, net.minecraft.core.BlockPos p1, java.lang.Iterable<net.minecraft.core.BlockPos> p2, dev.ryanhcode.sable.companion.math.BoundingBox3ic p3) { return null; }
    public static void kickFromContainingSubLevel(net.minecraft.server.level.ServerLevel p0, dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p1, dev.ryanhcode.sable.api.physics.PhysicsPipeline p2, dev.ryanhcode.sable.sublevel.ServerSubLevel p3, dev.ryanhcode.sable.sublevel.SubLevel p4) {}
    public static dev.ryanhcode.sable.api.SubLevelAssemblyHelper.GatherResult gatherConnectedBlocks(net.minecraft.core.BlockPos p0, net.minecraft.server.level.ServerLevel p1, int p2, dev.ryanhcode.sable.api.SubLevelAssemblyHelper.FrontierPredicate p3) { return null; }
    public static void moveTrackingPoints(net.minecraft.server.level.ServerLevel p0, dev.ryanhcode.sable.companion.math.BoundingBox3ic p1, dev.ryanhcode.sable.sublevel.ServerSubLevel p2, dev.ryanhcode.sable.api.SubLevelAssemblyHelper.AssemblyTransform p3) {}
    public static void moveOtherStuff(net.minecraft.server.level.ServerLevel p0, dev.ryanhcode.sable.api.SubLevelAssemblyHelper.AssemblyTransform p1, java.lang.Iterable<net.minecraft.core.BlockPos> p2, dev.ryanhcode.sable.companion.math.BoundingBox3ic p3) {}
    public static void moveBlocks(net.minecraft.server.level.ServerLevel p0, dev.ryanhcode.sable.api.SubLevelAssemblyHelper.AssemblyTransform p1, java.lang.Iterable<net.minecraft.core.BlockPos> p2) {}
    public static void markAndNotifyBlock(net.minecraft.world.level.Level p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.chunk.LevelChunk p2, net.minecraft.world.level.block.state.BlockState p3, net.minecraft.world.level.block.state.BlockState p4, int p5, int p6) {}
    static public class AssemblyTransform {
        public AssemblyTransform(net.minecraft.core.BlockPos p0, net.minecraft.core.BlockPos p1, int p2, net.minecraft.world.level.block.Rotation p3, net.minecraft.server.level.ServerLevel p4) {}
        public net.minecraft.world.phys.Vec3 apply(net.minecraft.world.phys.Vec3 p0) { return null; }
        public net.minecraft.core.BlockPos apply(net.minecraft.core.BlockPos p0) { return null; }
        public net.minecraft.world.level.block.state.BlockState apply(net.minecraft.world.level.block.state.BlockState p0) { return null; }
        public net.minecraft.server.level.ServerLevel getLevel() { return null; }
        public net.minecraft.world.level.block.Rotation getRotation() { return null; }
    }
    public interface FrontierPredicate {
        public abstract boolean isValidConnection(net.minecraft.core.BlockPos p0, net.minecraft.world.level.block.state.BlockState p1, net.minecraft.core.BlockPos p2, net.minecraft.world.level.block.state.BlockState p3, net.minecraft.core.Direction p4);
    }
    static public record GatherResult(java.util.Set<net.minecraft.core.BlockPos> blocks, int checkedBlocks, dev.ryanhcode.sable.companion.math.BoundingBox3i boundingBox, dev.ryanhcode.sable.api.SubLevelAssemblyHelper.GatherResult.State assemblyState) {
        static public enum State {
            SUCCESS(null),
            TOO_MANY_BLOCKS(null),
            NO_BLOCKS(null);
            public final java.lang.String errorKey = null;
        }
    }
}
