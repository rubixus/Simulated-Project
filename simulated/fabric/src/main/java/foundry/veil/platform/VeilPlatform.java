package foundry.veil.platform;

// AUTO-GENERATED STUB for foundry.veil.platform.VeilPlatform
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilPlatform {
    public abstract foundry.veil.platform.VeilPlatform.PlatformType getPlatformType();
    public abstract boolean isModLoaded(java.lang.String p0);
    public abstract boolean isDevelopmentEnvironment();
    public abstract boolean canAttachRenderdoc();
    public abstract boolean hasErrors();
    public abstract boolean hasChannel(net.minecraft.network.PacketListener p0, java.lang.Object p1);
    public enum PlatformType {
        NEOFORGE(null, null),
        FABRIC(null, null);
        public java.lang.String getPlatformName() { return null; }
        public java.lang.String getMixinPackageName() { return null; }
    }
}
