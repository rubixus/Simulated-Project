package dev.ryanhcode.sable.api.schematic;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelSchematicSerializationContext {
    public SubLevelSchematicSerializationContext(dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext.Type p0, dev.ryanhcode.sable.companion.math.BoundingBox3i p1) {}
    public dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext.Type getType() { return null; }
    public dev.ryanhcode.sable.companion.math.BoundingBox3i getBoundingBox() { return null; }
    public static dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext getCurrentContext() { return null; }
    public static void setCurrentContext(dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext p0) {}
    public it.unimi.dsi.fastutil.Function<net.minecraft.core.BlockPos, net.minecraft.core.BlockPos> getPlaceTransform() { return null; }
    public it.unimi.dsi.fastutil.Function<net.minecraft.core.BlockPos, net.minecraft.core.BlockPos> getSetupTransform() { return null; }
    public void setPlaceTransform(it.unimi.dsi.fastutil.Function<net.minecraft.core.BlockPos, net.minecraft.core.BlockPos> p0) {}
    public void setSetupTransform(it.unimi.dsi.fastutil.Function<net.minecraft.core.BlockPos, net.minecraft.core.BlockPos> p0) {}
    public dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext.SchematicMapping getMapping(dev.ryanhcode.sable.sublevel.SubLevel p0) { return null; }
    public dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext.SchematicMapping getMapping(java.util.UUID p0) { return null; }
    public java.util.Map<java.util.UUID, dev.ryanhcode.sable.api.schematic.SubLevelSchematicSerializationContext.SchematicMapping> getMappings() { return null; }
    static public record SchematicMapping(org.joml.Vector3dc newCorner, org.joml.Quaterniondc newOrientation, java.util.UUID newUUID, it.unimi.dsi.fastutil.Function<net.minecraft.core.BlockPos, net.minecraft.core.BlockPos> transform) {
    }
    static public enum Type {
        PLACE,
        SAVE;
    }
}
