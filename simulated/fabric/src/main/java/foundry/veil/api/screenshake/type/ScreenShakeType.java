package foundry.veil.api.screenshake.type;

// AUTO-GENERATED STUB for foundry.veil.api.screenshake.type.ScreenShakeType
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class ScreenShakeType {
    protected int ticksRemaining = 0;
    public ScreenShakeType(net.minecraft.util.RandomSource p0, int p1) {}
    public void tick() {}
    public boolean isRemoved() { return false; }
    public void remove() {}
    public float age() { return 0.0f; }
    public float length() { return 0.0f; }
    public org.joml.Vector3f getPositionOffset() { return null; }
    protected abstract float getStrength();
}
