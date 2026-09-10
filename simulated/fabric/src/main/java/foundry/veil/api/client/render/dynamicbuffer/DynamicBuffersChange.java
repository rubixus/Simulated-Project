package foundry.veil.api.client.render.dynamicbuffer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.dynamicbuffer.DynamicBuffersChange
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record DynamicBuffersChange(int previouslyEnabledBuffersMask, int enabledBuffersMask) {
    public foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType[] getPreviouslyEnabledBuffers() { return null; }
    public foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType[] getEnabledBuffers() { return null; }
    public boolean hasChanged(foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType p0) { return false; }
    public boolean isEnabled(foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType p0) { return false; }
    public boolean wasPreviouslyEnabled(foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType p0) { return false; }
}
