package foundry.veil.api.client.necromancer;

// AUTO-GENERATED STUB for foundry.veil.api.client.necromancer.Skeleton
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class Skeleton {
    public static final int MAX_BONES = 256;
    public static final int UNIFORM_STRIDE = 112;
    public java.util.List<foundry.veil.api.client.necromancer.Bone> roots = null;
    public java.util.Map<java.lang.String, foundry.veil.api.client.necromancer.Bone> bones = null;
    public Skeleton() {}
    public void tick() {}
    public void addBone(foundry.veil.api.client.necromancer.Bone p0) {}
    public void buildRoots() {}
    public int getMaxDepth() { return 0; }
    public void storeInstancedData(java.nio.ByteBuffer p0, java.util.Collection<foundry.veil.api.client.necromancer.Bone> p1, it.unimi.dsi.fastutil.objects.Object2IntMap<java.lang.String> p2, int p3, org.joml.Vector4f p4, org.joml.Matrix3f p5, org.joml.Matrix4x3f p6, org.joml.Matrix4x3f[] p7, org.joml.Quaternionf[] p8, float p9) {}
}
