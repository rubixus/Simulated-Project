package dev.ryanhcode.sable.mixinterface.clip_overwrite;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.mixinterface.clip_overwrite.LevelPoseProviderExtension
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface LevelPoseProviderExtension {
    public abstract void sable$pushPoseSupplier(it.unimi.dsi.fastutil.Function<dev.ryanhcode.sable.sublevel.SubLevel, dev.ryanhcode.sable.companion.math.Pose3dc> p0);
    public abstract void sable$popPoseSupplier();
    public abstract dev.ryanhcode.sable.companion.math.Pose3dc sable$getPose(dev.ryanhcode.sable.sublevel.SubLevel p0);
}
