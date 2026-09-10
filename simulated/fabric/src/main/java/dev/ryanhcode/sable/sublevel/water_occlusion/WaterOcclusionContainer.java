package dev.ryanhcode.sable.sublevel.water_occlusion;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.water_occlusion.WaterOcclusionContainer
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class WaterOcclusionContainer<T extends dev.ryanhcode.sable.sublevel.water_occlusion.WaterOcclusionRegion> {
    protected final java.util.Set<T> regions = null;
    public WaterOcclusionContainer(net.minecraft.world.level.Level p0) {}
    public static dev.ryanhcode.sable.sublevel.water_occlusion.WaterOcclusionContainer<?> getContainer(net.minecraft.world.level.Level p0) { return null; }
    public boolean isOccluded(net.minecraft.world.phys.Vec3 p0) { return false; }
    public T getOccludingRegion(net.minecraft.world.phys.Vec3 p0) { return null; }
    public void markDirty(net.minecraft.core.BlockPos p0) {}
    public abstract void removeRegion(dev.ryanhcode.sable.sublevel.water_occlusion.WaterOcclusionRegion p0);
    public abstract dev.ryanhcode.sable.sublevel.water_occlusion.WaterOcclusionRegion addRegion(dev.ryanhcode.sable.util.BoundedBitVolume3i p0);
    public java.util.Set<T> getRegions() { return null; }
}
