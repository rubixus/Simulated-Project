package foundry.veil.api.event;

// AUTO-GENERATED STUB for foundry.veil.api.event.VeilRegisterInspectorsEvent
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilRegisterInspectorsEvent {
    public abstract void onRegisterInspectors(foundry.veil.api.event.VeilRegisterInspectorsEvent.Registry p0);
    public interface Registry {
        public abstract foundry.veil.api.client.editor.EditorManager editorManager();
        public abstract void registerInspector(foundry.veil.api.client.editor.Inspector p0);
    }
}
