package foundry.veil.api.resource;

// AUTO-GENERATED STUB for foundry.veil.api.resource.VeilResourceAction
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilResourceAction<T extends foundry.veil.api.resource.VeilResource<?>> {
    public abstract net.minecraft.network.chat.Component getName();
    public abstract net.minecraft.network.chat.Component getDescription();
    public abstract java.util.OptionalInt getIcon();
    public abstract void perform(foundry.veil.api.resource.VeilEditorEnvironment p0, T p1);
}
