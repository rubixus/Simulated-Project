package foundry.veil.api.util;

// AUTO-GENERATED STUB for foundry.veil.api.util.EnumCodec
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class EnumCodec<T extends java.lang.Enum<?>> implements com.mojang.serialization.Codec<T> {
    public <T1> com.mojang.serialization.DataResult<com.mojang.datafixers.util.Pair<T, T1>> decode(com.mojang.serialization.DynamicOps<T1> p0, T1 p1) { return null; }
    public <T1> com.mojang.serialization.DataResult<T1> encode(T p0, com.mojang.serialization.DynamicOps<T1> p1, T1 p2) { return null; }
    public net.minecraft.network.codec.StreamCodec<io.netty.buffer.ByteBuf, T> streamCodec() { return null; }
    public static <T extends java.lang.Enum<?>> foundry.veil.api.util.EnumCodec.Builder<T> builder(java.lang.String p0) { return null; }
    public com.mojang.serialization.DataResult encode(java.lang.Object p0, com.mojang.serialization.DynamicOps p1, java.lang.Object p2) { return null; }
    static public class Builder<T extends java.lang.Enum<?>> {
        public foundry.veil.api.util.EnumCodec.Builder<T> values(java.lang.Class<T> p0) { return null; }
        public final foundry.veil.api.util.EnumCodec.Builder<T> values(T... p0) { return null; }
        public foundry.veil.api.util.EnumCodec.Builder<T> toStringFunction(java.util.function.Function<T, java.lang.String> p0) { return null; }
        public foundry.veil.api.util.EnumCodec.Builder<T> uppercase() { return null; }
        public foundry.veil.api.util.EnumCodec.Builder<T> lowercase() { return null; }
        public foundry.veil.api.util.EnumCodec<T> build() { return null; }
    }
}
