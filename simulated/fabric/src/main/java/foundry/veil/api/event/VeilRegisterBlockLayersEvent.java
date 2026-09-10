package foundry.veil.api.event;

// AUTO-GENERATED STUB for foundry.veil.api.event.VeilRegisterBlockLayersEvent
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilRegisterBlockLayersEvent {
    public abstract void onRegisterBlockLayers(foundry.veil.api.event.VeilRegisterBlockLayersEvent.Registry p0);
    public interface Registry {
        public abstract void registerBlockLayer(java.lang.Object p0);
    }
}
