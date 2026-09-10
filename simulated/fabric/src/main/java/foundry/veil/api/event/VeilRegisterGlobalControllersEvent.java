package foundry.veil.api.event;

// AUTO-GENERATED STUB for foundry.veil.api.event.VeilRegisterGlobalControllersEvent
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilRegisterGlobalControllersEvent {
    public abstract void onRegisterGlobalControllers(foundry.veil.api.event.VeilRegisterGlobalControllersEvent.Registry p0);
    public interface Registry {
        public abstract void registerGlobalController(foundry.veil.api.flare.modifier.GlobalController p0);
    }
}
