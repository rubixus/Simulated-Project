package dev.ryanhcode.sable.sublevel.plot.heat;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.plot.heat.SubLevelHeatMapManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelHeatMapManager {
    public SubLevelHeatMapManager(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) {}
    public void tick() {}
    public void onSolidAdded(net.minecraft.core.BlockPos p0) {}
    public void onSolidRemoved(net.minecraft.core.BlockPos p0) {}
    public static void addSplitListener(dev.ryanhcode.sable.sublevel.plot.heat.SubLevelHeatMapManager.SplitListener p0) {}
    public interface SplitListener {
        public abstract void addBlocks(net.minecraft.world.level.Level p0, dev.ryanhcode.sable.companion.math.BoundingBox3ic p1, java.util.Collection<net.minecraft.core.BlockPos> p2);
    }
}
