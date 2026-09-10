package dev.ryanhcode.sable.physics.config.block_properties;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.config.block_properties.BlockStateConditionSet
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record BlockStateConditionSet(java.util.List<dev.ryanhcode.sable.physics.config.block_properties.BlockStateConditionSet.BlockStateCondition> blockStateConditions) {
    public static final com.mojang.serialization.Codec<dev.ryanhcode.sable.physics.config.block_properties.BlockStateConditionSet> CODEC = null;
    public static com.mojang.serialization.DataResult<dev.ryanhcode.sable.physics.config.block_properties.BlockStateConditionSet> parse(java.lang.String p0) { return null; }
    public boolean matches(net.minecraft.world.level.block.state.StateDefinition<net.minecraft.world.level.block.Block, net.minecraft.world.level.block.state.BlockState> p0, net.minecraft.world.level.block.state.BlockState p1) { return false; }
    static public record BlockStateCondition(java.lang.String property, java.lang.String value) {
        public static dev.ryanhcode.sable.physics.config.block_properties.BlockStateConditionSet.BlockStateCondition parse(java.lang.String p0) { return null; }
    }
}
