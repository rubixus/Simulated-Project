package dev.ryanhcode.sable.physics.config.block_properties;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.physics.config.block_properties.PhysicsBlockPropertiesDefinition
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record PhysicsBlockPropertiesDefinition(net.minecraft.util.ExtraCodecs$TagOrElementLocation selector, int priority, java.util.Map<java.lang.Object, java.lang.Object> properties, java.util.Optional<java.util.Map<dev.ryanhcode.sable.physics.config.block_properties.BlockStateConditionSet, java.util.Map<java.lang.Object, java.lang.Object>>> overrides) {
    public static final com.mojang.serialization.Codec<java.util.Map<java.lang.Object, java.lang.Object>> PROPERTIES_CODEC = null;
    public static final com.mojang.serialization.Codec<dev.ryanhcode.sable.physics.config.block_properties.PhysicsBlockPropertiesDefinition> CODEC = null;
    public static final net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, dev.ryanhcode.sable.physics.config.block_properties.PhysicsBlockPropertiesDefinition> STREAM_CODEC = null;
}
