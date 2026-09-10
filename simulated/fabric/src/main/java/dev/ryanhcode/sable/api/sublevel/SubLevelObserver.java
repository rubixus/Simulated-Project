package dev.ryanhcode.sable.api.sublevel;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.sublevel.SubLevelObserver
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface SubLevelObserver {
    public default void onSubLevelAdded(dev.ryanhcode.sable.sublevel.SubLevel p0) {}
    public default void onSubLevelRemoved(dev.ryanhcode.sable.sublevel.SubLevel p0, dev.ryanhcode.sable.sublevel.storage.SubLevelRemovalReason p1) {}
    public default void tick(dev.ryanhcode.sable.api.sublevel.SubLevelContainer p0) {}
}
