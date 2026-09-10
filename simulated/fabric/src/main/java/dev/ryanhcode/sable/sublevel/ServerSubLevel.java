package dev.ryanhcode.sable.sublevel;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.ServerSubLevel
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ServerSubLevel extends dev.ryanhcode.sable.sublevel.SubLevel implements dev.ryanhcode.sable.api.physics.PhysicsPipelineBody {
    public final org.joml.Vector3d latestLinearVelocity = null;
    public final org.joml.Vector3d latestAngularVelocity = null;
    public ServerSubLevel(net.minecraft.server.level.ServerLevel p0, int p1, int p2, dev.ryanhcode.sable.companion.math.Pose3d p3) {}
    public java.util.Collection<java.util.UUID> getTrackingPlayers() { return null; }
    public foundry.veil.api.network.VeilPacketManager.PacketSink playerSink() { return null; }
    public dev.ryanhcode.sable.companion.math.Pose3d lastNetworkedPose() { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3i lastNetworkedBoundingBox() { return null; }
    public int getRuntimeId() { return 0; }
    protected dev.ryanhcode.sable.sublevel.plot.LevelPlot createPlot(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0, int p1, int p2, int p3) { return null; }
    public void onPlotBoundsChanged() {}
    public void tick() {}
    public boolean getLastNetworkedStopped() { return false; }
    public void setLastNetworkedStopped(boolean p0) {}
    public void updateMergedMassData(float p0) {}
    public void prePhysicsTickBegin() {}
    public void applyQueuedForces(dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p0, dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle p1, double p2) {}
    public void prePhysicsTick(dev.ryanhcode.sable.sublevel.system.SubLevelPhysicsSystem p0, dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle p1, double p2) {}
    public dev.ryanhcode.sable.api.physics.force.QueuedForceGroup getOrCreateQueuedForceGroup(dev.ryanhcode.sable.api.physics.force.ForceGroup p0) { return null; }
    public void deleteAllEntities() {}
    public void setName(java.lang.String p0) {}
    public dev.ryanhcode.sable.sublevel.plot.heat.SubLevelHeatMapManager getHeatMapManager() { return null; }
    public dev.ryanhcode.sable.physics.floating_block.FloatingBlockController getFloatingBlockController() { return null; }
    public dev.ryanhcode.sable.physics.ReactionWheelManager getReactionWheelManager() { return null; }
    public void setSplitFrom(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, dev.ryanhcode.sable.companion.math.Pose3d p1) {}
    public java.util.UUID getSplitFromSubLevel() { return null; }
    public dev.ryanhcode.sable.companion.math.Pose3d getSplitFromPose() { return null; }
    public void clearSplitFrom() {}
    public net.minecraft.server.level.ServerLevel getLevel() { return null; }
    public dev.ryanhcode.sable.sublevel.plot.ServerLevelPlot getPlot() { return null; }
    public dev.ryanhcode.sable.api.physics.mass.MassData getMassTracker() { return null; }
    public void buildMassTracker() {}
    public dev.ryanhcode.sable.api.physics.mass.MassTracker getSelfMassTracker() { return null; }
    public dev.ryanhcode.sable.sublevel.storage.holding.GlobalSavedSubLevelPointer getLastSerializationPointer() { return null; }
    public void setLastSerializationPointer(dev.ryanhcode.sable.sublevel.storage.holding.GlobalSavedSubLevelPointer p0) {}
    public void enableIndividualQueuedForcesTracking(boolean p0) {}
    public boolean isTrackingIndividualQueuedForces() { return false; }
    public it.unimi.dsi.fastutil.objects.Object2ObjectMap<dev.ryanhcode.sable.api.physics.force.ForceGroup, dev.ryanhcode.sable.api.physics.force.QueuedForceGroup> getQueuedForceGroups() { return null; }
    public net.minecraft.nbt.CompoundTag getUserDataTag() { return null; }
    public void setUserDataTag(net.minecraft.nbt.CompoundTag p0) {}
    public java.lang.String toString() { return null; }
}
