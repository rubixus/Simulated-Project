package foundry.veil.api.resource;

// AUTO-GENERATED STUB for foundry.veil.api.resource.VeilEditorEnvironment
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilEditorEnvironment {
    public abstract <T extends foundry.veil.api.resource.VeilResource<?>> void open(T p0, foundry.veil.api.resource.editor.ResourceFileEditor.Factory<T> p1);
    public default void open(foundry.veil.api.resource.VeilResource<?> p0, java.lang.Object p1) {}
    public abstract foundry.veil.api.resource.VeilResourceManager getResourceManager();
}
