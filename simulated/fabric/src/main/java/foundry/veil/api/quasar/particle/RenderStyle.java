package foundry.veil.api.quasar.particle;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.particle.RenderStyle
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class RenderStyle implements org.lwjgl.system.NativeResource {
    public static final com.mojang.serialization.Codec<foundry.veil.api.quasar.particle.RenderStyle> CODEC = null;
    protected foundry.veil.api.client.render.vertex.VertexArray vertexArray = null;
    protected int instanceVBO = 0;
    protected final int bufferSize = 0;
    protected int maxParticles = 0;
    public static final int MIN_PARTICLES = 400;
    public RenderStyle(int p0) {}
    public void init() {}
    public boolean setup(int p0) { return false; }
    public void clear() {}
    public void render(java.util.List<foundry.veil.api.quasar.particle.QuasarParticle> p0, net.minecraft.client.Camera p1) {}
    public java.lang.Object getRenderType(foundry.veil.api.quasar.particle.QuasarParticle p0, foundry.veil.api.quasar.particle.RenderData p1) { return null; }
    public void free() {}
    protected abstract com.mojang.blaze3d.vertex.MeshData createMesh();
    protected abstract void setupBufferState(foundry.veil.api.client.render.vertex.VertexArrayBuilder p0);
    protected abstract void putBufferData(foundry.veil.api.quasar.particle.QuasarParticle p0, net.minecraft.client.Camera p1, java.nio.ByteBuffer p2);
}
