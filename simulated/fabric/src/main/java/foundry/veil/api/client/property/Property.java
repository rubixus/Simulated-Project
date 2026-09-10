package foundry.veil.api.client.property;

// AUTO-GENERATED STUB for foundry.veil.api.client.property.Property
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class Property<T> {
    protected T overrideValue = null;
    protected final T value = null;
    public Property(foundry.veil.api.client.registry.PropertyRegistry.PropertyType<T, ? extends foundry.veil.api.client.property.Property<T>> p0, T p1) {}
    protected void setQueries(gg.moonflower.molangcompiler.api.MolangRuntime.Builder p0) {}
    public abstract void applyValue(java.lang.String p0, java.lang.Object p1);
    public abstract void modify(T p0, foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode p1, java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>> p2);
    protected abstract T cloneValue(T p0);
    public void resetOverrideValue() {}
    public foundry.veil.api.client.registry.PropertyRegistry.PropertyType<T, ? extends foundry.veil.api.client.property.Property<T>> getType() { return null; }
    public static <T, M extends foundry.veil.api.client.property.Property<T>> com.mojang.serialization.MapCodec<M> codec(foundry.veil.api.client.registry.PropertyRegistry.PropertyType<T, M> p0) { return null; }
    public static <T, M extends foundry.veil.api.client.property.Property<T>> com.mojang.serialization.MapCodec<M> createCodec(java.util.function.Function<T, M> p0, com.mojang.serialization.Codec<T> p1) { return null; }
    public java.util.function.Supplier<gg.moonflower.molangcompiler.api.MolangEnvironment> getEnvironment() { return null; }
}
