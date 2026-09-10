package dev.ryanhcode.sable.sublevel.system;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelPhysicsSystem implements dev.ryanhcode.sable.api.sublevel.SubLevelObserver {
    public static final int DEFAULT_RESIDENT_CAPACITY = 8;
    public static final boolean USE_TICKETS_FOR_QUERIES = false;
    public static boolean IN_PHYSICS_STEP = false;
    public static dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem currentlySteppingSystem = null;
    public SubLevelPhysicsSystem(net.minecraft.server.level.ServerLevel p0) {}
    public static dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem get(net.minecraft.world.level.Level p0) { return null; }
    public static dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem require(net.minecraft.world.level.Level p0) { return null; }
    public static dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem getCurrentlySteppingSystem() { return null; }
    public void initialize() {}
    public void onConfigUpdated() {}
    public void onSubLevelAdded(dev.ryanhcode.sable.sublevel.SubLevel p0) {}
    public void onSubLevelRemoved(dev.ryanhcode.sable.sublevel.SubLevel p0, dev.ryanhcode.sable.sublevel.storage.SubLevelRemovalReason p1) {}
    public void tick(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0) {}
    public void updatePose(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) {}
    public boolean recoverSubLevel(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) { return false; }
    public boolean tryPunch(java.util.UUID p0, int p1) { return false; }
    public dev.ryanhcode.sable.api.physics.PhysicsPipeline getPipeline() { return null; }
    public dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle getPhysicsHandle(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) { return null; }
    public void handleBlockChange(net.minecraft.core.SectionPos p0, net.minecraft.world.level.chunk.LevelChunkSection p1, int p2, int p3, int p4, net.minecraft.world.level.block.state.BlockState p5, net.minecraft.world.level.block.state.BlockState p6) {}
    public void wakeUpObjectsAt(int p0, int p1, int p2) {}
    public void updateMassDataFromBlockChange(dev.ryanhcode.sable.sublevel.SubLevel p0, net.minecraft.core.BlockPos p1, net.minecraft.world.level.block.state.BlockState p2, net.minecraft.world.level.block.state.BlockState p3, boolean p4) {}
    public double getPartialPhysicsTick() { return 0.0; }
    public boolean getPaused() { return false; }
    public void setPaused(boolean p0) {}
    public java.lang.Iterable<dev.ryanhcode.sable.sublevel.SubLevel> queryIntersecting(dev.ryanhcode.sable.companion.math.BoundingBox3dc p0) { return null; }
    public dev.ryanhcode.sable.physics.config.PhysicsConfigData getConfig() { return null; }
    public java.lang.Iterable<dev.ryanhcode.sable.api.physics.object.ArbitraryPhysicsObject> getArbitraryObjects() { return null; }
    public net.minecraft.server.level.ServerLevel getLevel() { return null; }
    public dev.ryanhcode.sable.sublevel.system.ticket.PhysicsChunkTicketManager getTicketManager() { return null; }
    public void addObject(dev.ryanhcode.sable.api.physics.object.ArbitraryPhysicsObject p0) {}
    public void removeObject(dev.ryanhcode.sable.api.physics.object.ArbitraryPhysicsObject p0) {}
    public int getNextRuntimeID() { return 0; }
}
