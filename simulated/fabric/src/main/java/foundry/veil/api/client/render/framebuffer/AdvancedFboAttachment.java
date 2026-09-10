package foundry.veil.api.client.render.framebuffer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.framebuffer.AdvancedFboAttachment
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface AdvancedFboAttachment {
    public abstract void create();
    public abstract void attach(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0, int p1);
    public abstract void bindAttachment();
    public abstract void unbindAttachment();
    public abstract int getAttachmentType();
    public abstract int getFormat();
    public abstract int getLevels();
    public abstract boolean canSample();
    public abstract java.lang.String getName();
    public abstract foundry.veil.api.client.render.framebuffer.AdvancedFboAttachment clone();
}
