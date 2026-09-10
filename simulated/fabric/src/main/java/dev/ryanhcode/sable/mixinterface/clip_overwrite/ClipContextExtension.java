package dev.ryanhcode.sable.mixinterface.clip_overwrite;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.mixinterface.clip_overwrite.ClipContextExtension
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface ClipContextExtension {
    public abstract dev.ryanhcode.sable.sublevel.SubLevel sable$getIgnoredSubLevel();
    public abstract java.util.function.Predicate<dev.ryanhcode.sable.sublevel.SubLevel> sable$getSubLevelIgnoring();
    public abstract void sable$setIgnoredSubLevel(dev.ryanhcode.sable.sublevel.SubLevel p0);
    public abstract void sable$setSubLevelIgnoring(java.util.function.Predicate<dev.ryanhcode.sable.sublevel.SubLevel> p0);
    public abstract void sable$setIgnoreMainLevel(boolean p0);
    public abstract boolean sable$isIgnoreMainLevel();
    public abstract void sable$setDoNotProject(boolean p0);
    public abstract boolean sable$doNotProject();
}
