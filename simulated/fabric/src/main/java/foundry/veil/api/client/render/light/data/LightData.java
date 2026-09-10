package foundry.veil.api.client.render.light.data;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.light.data.LightData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class LightData {
    protected final foundry.veil.api.client.color.Color color = null;
    protected float brightness = 0.0f;
    public LightData() {}
    public void markDirty() {}
    public long getRevision() { return 0L; }
    public foundry.veil.api.client.color.Color getColor() { return null; }
    public foundry.veil.api.client.color.Color getColorMutable() { return null; }
    public float getBrightness() { return 0.0f; }
    public foundry.veil.api.client.render.light.data.LightData setColor(org.joml.Vector3fc p0) { return null; }
    public foundry.veil.api.client.render.light.data.LightData setColor(foundry.veil.api.client.color.Colorc p0) { return null; }
    public foundry.veil.api.client.render.light.data.LightData setColor(float p0, float p1, float p2) { return null; }
    public foundry.veil.api.client.render.light.data.LightData setColor(int p0) { return null; }
    public foundry.veil.api.client.render.light.data.LightData setBrightness(float p0) { return null; }
    public abstract boolean isVisible(foundry.veil.api.client.render.CullFrustum p0);
    public foundry.veil.api.client.render.light.data.LightData setTo(net.minecraft.client.Camera p0) { return null; }
    public abstract foundry.veil.api.client.registry.LightTypeRegistry.LightType<?> getType();
}
