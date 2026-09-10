package dev.ryanhcode.sable.network.client;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.network.client.SubLevelSnapshotInterpolator
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelSnapshotInterpolator {
    public final it.unimi.dsi.fastutil.objects.ObjectArrayList<dev.ryanhcode.sable.network.client.SubLevelSnapshotInterpolator.Snapshot> buffer = null;
    public SubLevelSnapshotInterpolator(dev.ryanhcode.sable.companion.math.Pose3d p0) {}
    public void getSampleAt(double p0, dev.ryanhcode.sable.companion.math.Pose3d p1) {}
    public void receiveSnapshot(int p0, dev.ryanhcode.sable.companion.math.Pose3dc p1) {}
    public void setFirstPoses(dev.ryanhcode.sable.companion.math.Pose3dc p0, dev.ryanhcode.sable.companion.math.Pose3dc p1) {}
    public dev.ryanhcode.sable.companion.math.Pose3dc getInterpolatedPose() { return null; }
    public void receiveStop() {}
    public void splitFrom(dev.ryanhcode.sable.network.client.SubLevelSnapshotInterpolator p0, dev.ryanhcode.sable.companion.math.Pose3dc p1) {}
    public void tick(double p0) {}
    static public record Snapshot(int gameTick, dev.ryanhcode.sable.companion.math.Pose3dc pose) {
    }
}
