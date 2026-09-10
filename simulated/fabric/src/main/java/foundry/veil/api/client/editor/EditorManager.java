package foundry.veil.api.client.editor;

// AUTO-GENERATED STUB for foundry.veil.api.client.editor.EditorManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class EditorManager implements foundry.veil.api.resource.VeilEditorEnvironment, net.minecraft.server.packs.resources.PreparableReloadListener {
    public static final java.lang.Object DEFAULT_FONT = null;
    public EditorManager(net.minecraft.server.packs.resources.ReloadableResourceManager p0) {}
    public void render() {}
    public void renderLast() {}
    public void onFileChange(foundry.veil.api.resource.VeilResource<?> p0) {}
    public void show(foundry.veil.api.client.editor.Inspector p0) {}
    public void hide(foundry.veil.api.client.editor.Inspector p0) {}
    public boolean isVisible(foundry.veil.api.client.editor.Inspector p0) { return false; }
    public boolean isVisible(java.util.function.Predicate<foundry.veil.api.client.editor.Inspector> p0) { return false; }
    public void add(foundry.veil.api.client.editor.Inspector p0) {}
    public void remove(foundry.veil.api.client.editor.Inspector p0) {}
    public void toggle() {}
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public <T extends foundry.veil.api.resource.VeilResource<?>> void open(T p0, foundry.veil.api.resource.editor.ResourceFileEditor.Factory<T> p1) {}
    public foundry.veil.api.resource.VeilResourceManager getResourceManager() { return null; }
}
