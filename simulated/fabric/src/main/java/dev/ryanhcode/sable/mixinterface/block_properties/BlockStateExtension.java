package dev.ryanhcode.sable.mixinterface.block_properties;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.mixinterface.block_properties.BlockStateExtension
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BlockStateExtension {
    public abstract void sable$loadProperties(net.minecraft.world.level.block.state.StateDefinition<net.minecraft.world.level.block.Block, net.minecraft.world.level.block.state.BlockState> p0, dev.ryanhcode.sable.physics.config.block_properties.PhysicsBlockPropertiesDefinition p1);
    public abstract <T> T sable$getProperty(dev.ryanhcode.sable.physics.config.block_properties.PhysicsBlockPropertyTypes.PhysicsBlockPropertyType<T> p0);
}
