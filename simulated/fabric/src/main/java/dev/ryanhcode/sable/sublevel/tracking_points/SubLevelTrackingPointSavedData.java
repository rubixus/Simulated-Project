package dev.ryanhcode.sable.sublevel.tracking_points;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.tracking_points.SubLevelTrackingPointSavedData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelTrackingPointSavedData extends net.minecraft.world.level.saveddata.SavedData implements dev.ryanhcode.sable.api.sublevel.SubLevelObserver {
    public static final java.lang.String FILE_ID = "sable_tracking_points";
    public static dev.ryanhcode.sable.sublevel.tracking_points.SubLevelTrackingPointSavedData getOrLoad(net.minecraft.server.level.ServerLevel p0) { return null; }
    public java.util.UUID generateTrackingPoint(net.minecraft.server.level.ServerPlayer p0) { return null; }
    public java.util.UUID generateTrackingPoint(net.minecraft.server.level.ServerPlayer p0, dev.ryanhcode.sable.sublevel.ServerSubLevel p1) { return null; }
    public java.util.UUID generateTrackingPoint(net.minecraft.world.phys.Vec3 p0, dev.ryanhcode.sable.sublevel.ServerSubLevel p1) { return null; }
    public dev.ryanhcode.sable.sublevel.tracking_points.SubLevelTrackingPointSavedData.TakenLoginPoint take(java.util.UUID p0, boolean p1) { return null; }
    public java.lang.Iterable<java.util.Map.Entry<java.util.UUID, dev.ryanhcode.sable.sublevel.tracking_points.TrackingPoint>> getAllTrackingPoints() { return null; }
    public java.lang.Iterable<it.unimi.dsi.fastutil.Pair<java.util.UUID, dev.ryanhcode.sable.sublevel.tracking_points.TrackingPoint>> getAllTrackingPoints(dev.ryanhcode.sable.companion.math.BoundingBox3ic p0) { return null; }
    public void setTrackingPoint(java.util.UUID p0, dev.ryanhcode.sable.sublevel.tracking_points.TrackingPoint p1) {}
    public void removeTrackingPoint(java.util.UUID p0) {}
    public dev.ryanhcode.sable.sublevel.tracking_points.TrackingPoint getTrackingPoint(java.util.UUID p0) { return null; }
    static public record TakenLoginPoint(org.joml.Vector3dc position, java.util.UUID subLevelId, org.joml.Vector3d localAnchor) {
    }
}
