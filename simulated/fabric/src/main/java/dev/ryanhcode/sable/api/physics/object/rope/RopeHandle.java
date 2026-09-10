package dev.ryanhcode.sable.api.physics.object.rope;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.object.rope.RopeHandle
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface RopeHandle {
    public abstract void readPose(java.util.List<org.joml.Vector3d> p0);
    public abstract void remove();
    public abstract void setFirstSegmentLength(double p0);
    public abstract void removeFirstPoint();
    public abstract void addPoint(org.joml.Vector3dc p0);
    public abstract void setAttachment(dev.ryanhcode.sable.api.physics.object.rope.RopeHandle.AttachmentPoint p0, org.joml.Vector3dc p1, dev.ryanhcode.sable.sublevel.ServerSubLevel p2);
    public abstract void wakeUp();
    public enum AttachmentPoint {
        START,
        END;
    }
}
