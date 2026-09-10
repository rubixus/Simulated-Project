package dev.ryanhcode.sable.sublevel;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.SubLevel
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class SubLevel implements dev.ryanhcode.sable.companion.SubLevelAccess {
    protected final dev.ryanhcode.sable.companion.math.Pose3d lastPose = null;
    protected final dev.ryanhcode.sable.companion.math.BoundingBox3d globalBounds = null;
    protected final dev.ryanhcode.sable.companion.math.BoundingBox3d lastGlobalBounds = null;
    protected SubLevel(net.minecraft.world.level.Level p0, int p1, int p2, dev.ryanhcode.sable.companion.math.Pose3d p3) {}
    protected abstract dev.ryanhcode.sable.sublevel.plot.LevelPlot createPlot(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0, int p1, int p2, int p3);
    public void onPlotBoundsChanged() {}
    public void updateLastPose() {}
    public void tick() {}
    public void updateBoundingBox() {}
    public void forceUpdateGlobalBounds() {}
    public net.minecraft.world.level.Level getLevel() { return null; }
    public dev.ryanhcode.sable.companion.math.Pose3d logicalPose() { return null; }
    public dev.ryanhcode.sable.companion.math.Pose3dc lastPose() { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3dc boundingBox() { return null; }
    public dev.ryanhcode.sable.sublevel.plot.LevelPlot getPlot() { return null; }
    public void onRemove() {}
    public boolean isRemoved() { return false; }
    public void markRemoved() {}
    public void setUniqueId(java.util.UUID p0) {}
    public java.util.UUID getUniqueId() { return null; }
    public java.lang.String getName() { return null; }
    public void setName(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
}
