package foundry.veil.api.client.property;

// AUTO-GENERATED STUB for foundry.veil.api.client.property.InvertibleProperty
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class InvertibleProperty<T> extends foundry.veil.api.client.property.Property<T> {
    protected T overrideInverseValue = null;
    public InvertibleProperty(foundry.veil.api.client.registry.PropertyRegistry.PropertyType<T, ?> p0, T p1) {}
    protected abstract T invertAndMutate(T p0);
    public final void modify(T p0, foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode p1, java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>> p2) {}
    public abstract void modifyPreInvert(T p0, foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode p1, java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>> p2);
    public void applyInverseValue(java.lang.String p0, java.lang.Object p1) {}
    public void resetOverrideValue() {}
}
