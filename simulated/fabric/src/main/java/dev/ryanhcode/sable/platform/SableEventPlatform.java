package dev.ryanhcode.sable.platform;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.platform.SableEventPlatform
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface SableEventPlatform {
    public static final dev.ryanhcode.sable.platform.SableEventPlatform INSTANCE = new dev.ryanhcode.sable.platform.SableEventPlatform() { @Override public void onSubLevelContainerReady(dev.ryanhcode.sable.api.event.SableSubLevelContainerReadyEvent p0) {}  @Override public void onPhysicsTick(dev.ryanhcode.sable.api.event.SablePrePhysicsTickEvent p0) {}  @Override public void onPostPhysicsTick(dev.ryanhcode.sable.api.event.SablePostPhysicsTickEvent p0) {} };
    public abstract void onSubLevelContainerReady(dev.ryanhcode.sable.api.event.SableSubLevelContainerReadyEvent p0);
    public abstract void onPhysicsTick(dev.ryanhcode.sable.api.event.SablePrePhysicsTickEvent p0);
    public abstract void onPostPhysicsTick(dev.ryanhcode.sable.api.event.SablePostPhysicsTickEvent p0);
}
