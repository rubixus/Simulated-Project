package foundry.veil.api.event;

// AUTO-GENERATED STUB for foundry.veil.api.event.VeilRegisterFixedBuffersEvent
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilRegisterFixedBuffersEvent {
    public abstract void onRegisterFixedBuffers(foundry.veil.api.event.VeilRegisterFixedBuffersEvent.Registry p0);
    public interface Registry {
        public abstract void registerFixedBuffer(foundry.veil.api.event.VeilRenderLevelStageEvent.Stage p0, java.lang.Object p1);
    }
}
