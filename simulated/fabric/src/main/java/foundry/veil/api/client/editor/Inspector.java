package foundry.veil.api.client.editor;

// AUTO-GENERATED STUB for foundry.veil.api.client.editor.Inspector
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface Inspector {
    public static final net.minecraft.network.chat.Component DEFAULT_GROUP = null;
    public static final net.minecraft.network.chat.Component EXAMPLE_GROUP = null;
    public static final net.minecraft.network.chat.Component RENDERER_GROUP = null;
    public static final net.minecraft.network.chat.Component INFO_GROUP = null;
    public static final net.minecraft.network.chat.Component RESOURCE_GROUP = null;
    public default void renderMenuBar() {}
    public abstract void render();
    public default void renderLast() {}
    public abstract net.minecraft.network.chat.Component getDisplayName();
    public default net.minecraft.network.chat.Component getGroup() { return null; }
    public default boolean isEnabled() { return false; }
    public default boolean isMenuBarEnabled() { return false; }
    public default void onShow() {}
    public default void onHide() {}
    public default boolean isOpen() { return false; }
    public default void free() {}
    public static net.minecraft.network.chat.Component group(java.lang.Object p0) { return null; }
}
