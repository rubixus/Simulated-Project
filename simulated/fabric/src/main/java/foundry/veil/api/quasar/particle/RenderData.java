package foundry.veil.api.quasar.particle;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.particle.RenderData
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public final class RenderData {
    public static final java.lang.Object BLANK = null;
    public float renderAge = 0.0f;
    public float agePercent = 0.0f;
    public RenderData(foundry.veil.api.quasar.particle.QuasarParticle p0, foundry.veil.api.quasar.data.QuasarParticleData p1) {}
    public void tick(foundry.veil.api.quasar.particle.QuasarParticle p0, int p1) {}
    public void render(foundry.veil.api.quasar.particle.QuasarParticle p0, float p1) {}
    public void markDirty() {}
    public org.joml.Vector3dc getRenderPosition() { return null; }
    public org.joml.Vector3fc getRenderRotation() { return null; }
    public float getRenderRadius() { return 0.0f; }
    public float getRenderAge() { return 0.0f; }
    public float getAgePercent() { return 0.0f; }
    public int getPackedLight() { return 0; }
    public int getFixedPackedLight() { return 0; }
    public float getRed() { return 0.0f; }
    public float getGreen() { return 0.0f; }
    public float getBlue() { return 0.0f; }
    public float getAlpha() { return 0.0f; }
    public foundry.veil.api.quasar.particle.SpriteData getSpriteData() { return null; }
    public net.minecraft.client.renderer.texture.TextureAtlasSprite getAtlasSprite() { return null; }
    public boolean isAdditive() { return false; }
    public java.lang.Object getRenderType() { return null; }
    public java.util.List<foundry.veil.api.quasar.fx.Trail> getTrails() { return null; }
    public void renderTrails(foundry.veil.api.client.render.MatrixStack p0, java.lang.Object p1, net.minecraft.world.phys.Vec3 p2, int p3, float p4) {}
    public void setRed(float p0) {}
    public void setGreen(float p0) {}
    public void setBlue(float p0) {}
    public void setAlpha(float p0) {}
    public void setColor(float p0, float p1, float p2, float p3) {}
    public void setColor(org.joml.Vector4fc p0) {}
    public void setColor(foundry.veil.api.client.color.Colorc p0) {}
    public void setFixedPackedLight(int p0) {}
    public void setAdditive(boolean p0) {}
    public void setSpriteData(foundry.veil.api.quasar.particle.SpriteData p0) {}
    public void setAtlasSprite(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {}
}
