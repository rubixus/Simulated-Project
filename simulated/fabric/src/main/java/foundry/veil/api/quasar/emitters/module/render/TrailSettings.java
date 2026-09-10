package foundry.veil.api.quasar.emitters.module.render;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.emitters.module.render.TrailSettings
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class TrailSettings implements foundry.veil.api.client.editor.EditorAttributeProvider {
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.emitters.module.render.TrailSettings> CODEC = null;
    public TrailSettings(int p0, int p1, org.joml.Vector4fc p2, foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailWidthModifier p3, java.lang.Object p4, foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailPointModifier p5, foundry.veil.api.quasar.fx.Trail.TilingMode p6, boolean p7, boolean p8) {}
    public TrailSettings(int p0, int p1, org.joml.Vector4fc p2, foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailWidthModifier p3, java.lang.Object p4, foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailPointModifier p5, foundry.veil.api.quasar.fx.Trail.TilingMode p6, boolean p7, boolean p8, boolean p9) {}
    public TrailSettings() {}
    public void setParentRotation(boolean p0) {}
    public boolean getParentRotation() { return false; }
    public boolean isAdditive() { return false; }
    public void setAdditive(boolean p0) {}
    public void setBillboard(boolean p0) {}
    public boolean getBillboard() { return false; }
    public void setTilingMode(foundry.veil.api.quasar.fx.Trail.TilingMode p0) {}
    public foundry.veil.api.quasar.fx.Trail.TilingMode getTilingMode() { return null; }
    public void setTrailPointModifier(foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailPointModifier p0) {}
    public foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailPointModifier getTrailPointModifier() { return null; }
    public void setTrailFrequency(int p0) {}
    public void setTrailLength(int p0) {}
    public void setTrailColor(org.joml.Vector4f p0) {}
    public void setTrailWidthModifier(foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailWidthModifier p0) {}
    public void setTrailTexture(java.lang.Object p0) {}
    public int getTrailFrequency() { return 0; }
    public int getTrailLength() { return 0; }
    public org.joml.Vector4f getTrailColor() { return null; }
    public foundry.veil.api.quasar.emitters.module.render.TrailSettings.TrailWidthModifier getTrailWidthModifier() { return null; }
    public java.lang.Object getTrailTexture() { return null; }
    public void renderImGuiAttributes() {}
    public interface TrailPointModifier {
        public abstract org.joml.Vector4f modify(org.joml.Vector4f p0, java.lang.Integer p1, net.minecraft.world.phys.Vec3 p2);
    }
    public interface TrailWidthModifier {
        public abstract float modify(float p0, double p1);
    }
}
