package dev.ryanhcode.sable.sublevel;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.ClientSubLevel
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ClientSubLevel extends dev.ryanhcode.sable.sublevel.SubLevel implements dev.ryanhcode.sable.companion.ClientSubLevelAccess {
    public ClientSubLevel(net.minecraft.world.level.Level p0, int p1, int p2, dev.ryanhcode.sable.companion.math.Pose3d p3) {}
    protected dev.ryanhcode.sable.sublevel.plot.LevelPlot createPlot(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0, int p1, int p2, int p3) { return null; }
    public void tick() {}
    public void forceUpdateBounds() {}
    public int scaleSkyLight(int p0) { return 0; }
    public int scaleLightColor(int p0) { return 0; }
    public int getLatestSkyLightScale() { return 0; }
    public int computeSubLevelSkyLight(dev.ryanhcode.sable.companion.math.Pose3dc p0) { return 0; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3dc boundingBox() { return null; }
    public void onPlotBoundsChanged() {}
    public void onRemove() {}
    public void updateRenderData() {}
    public dev.ryanhcode.sable.sublevel.render.SubLevelRenderData getRenderData() { return null; }
    public net.minecraft.client.multiplayer.ClientLevel getLevel() { return null; }
    public dev.ryanhcode.sable.sublevel.plot.ClientLevelPlot getPlot() { return null; }
    public void setLightingSceneId(int p0) {}
    public int getLightingSceneId() { return 0; }
    public dev.ryanhcode.sable.companion.math.Pose3dc renderPose() { return null; }
    public dev.ryanhcode.sable.companion.math.Pose3dc renderPose(float p0) { return null; }
    public void receiveServerMovementStop() {}
    public void wasSplitFrom(dev.ryanhcode.sable.network.client.ClientSableInterpolationState p0, dev.ryanhcode.sable.sublevel.ClientSubLevel p1, dev.ryanhcode.sable.companion.math.Pose3dc p2) {}
    public void setInitialPosesFrom(dev.ryanhcode.sable.network.client.ClientSableInterpolationState p0) {}
    public dev.ryanhcode.sable.network.client.SubLevelSnapshotInterpolator getInterpolator() { return null; }
    public java.lang.String toString() { return null; }
    public void setFinalized() {}
    public boolean isFinalized() { return false; }
}
