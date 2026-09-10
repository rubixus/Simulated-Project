package foundry.veil.api.quasar.fx;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.fx.Trail
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class Trail {
    public Trail(foundry.veil.api.quasar.emitters.module.render.TrailSettings p0) {}
    public Trail(java.util.Collection<net.minecraft.world.phys.Vec3> p0, int p1, java.util.function.Function<java.lang.Float, java.lang.Float> p2) {}
    public Trail(int p0, java.util.function.Function<java.lang.Float, java.lang.Float> p1) {}
    public void setParentRotation(boolean p0) {}
    public void setTilingMode(foundry.veil.api.quasar.fx.Trail.TilingMode p0) {}
    public void setTexture(java.lang.Object p0) {}
    public void setFrequency(int p0) {}
    public void setMinDistance(float p0) {}
    public void setPoints(net.minecraft.world.phys.Vec3[] p0) {}
    public void setColor(int p0) {}
    public void setLength(int p0) {}
    public void setBillboard(boolean p0) {}
    public boolean isAdditive() { return false; }
    public void setAdditive(boolean p0) {}
    public void setWidthFunction(java.util.function.Function<java.lang.Float, java.lang.Float> p0) {}
    public java.lang.Object getTexture() { return null; }
    public int getLength() { return 0; }
    public void pushRotatedPoint(net.minecraft.world.phys.Vec3 p0, net.minecraft.world.phys.Vec3 p1) {}
    public void render(foundry.veil.api.client.render.MatrixStack p0, com.mojang.blaze3d.vertex.VertexConsumer p1, int p2, float p3, net.minecraft.world.phys.Vec3 p4, net.minecraft.world.phys.Vec3 p5) {}
    static public enum TilingMode {
        NONE,
        STRETCH,
        REPEAT;
        public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.fx.Trail.TilingMode> CODEC = null;
    }
}
