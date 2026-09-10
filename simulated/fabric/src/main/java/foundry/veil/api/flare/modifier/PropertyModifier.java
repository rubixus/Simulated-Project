package foundry.veil.api.flare.modifier;

// AUTO-GENERATED STUB for foundry.veil.api.flare.modifier.PropertyModifier
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public abstract class PropertyModifier<T> {
    public PropertyModifier(foundry.veil.api.client.registry.PropertyModifierRegistry.PropertyModifierType<T, ?> p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode p5, java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>> p6) {}
    public abstract T get(foundry.veil.api.flare.modifier.Controller p0);
    public <A> void apply(foundry.veil.api.flare.EffectHost p0, foundry.veil.api.client.property.Property<A> p1) {}
    public java.lang.String name() { return null; }
    public java.lang.String clazz() { return null; }
    public java.util.Optional<java.lang.String> optionalClazz() { return null; }
    public java.lang.String inputControllerName() { return null; }
    public foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode mode() { return null; }
    public java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>> molangExpressions() { return null; }
    public java.lang.String outputPropertyName() { return null; }
    public foundry.veil.api.client.registry.PropertyModifierRegistry.PropertyModifierType<T, ?> type() { return null; }
    public com.mojang.datafixers.util.Pair<java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>>, foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode> getPair() { return null; }
    public static void modifyProperty(foundry.veil.api.flare.EffectHost p0, java.lang.String p1, foundry.veil.api.client.property.Property<?> p2, java.lang.Iterable<foundry.veil.api.flare.modifier.PropertyModifier<?>> p3) {}
    public static <A, T extends foundry.veil.api.flare.modifier.PropertyModifier<A>> com.mojang.serialization.MapCodec<T> createCodec(com.mojang.datafixers.util.Function6<java.lang.String, java.lang.String, java.lang.String, java.lang.String, foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode, java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>>, T> p0, int p1) { return null; }
    public static <A, T extends foundry.veil.api.flare.modifier.PropertyModifier<A>, O> com.mojang.serialization.MapCodec<T> createCodec(com.mojang.datafixers.util.Function7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, foundry.veil.api.flare.modifier.PropertyModifier.PropertyModifierMode, java.util.Optional<java.util.List<gg.moonflower.molangcompiler.api.MolangExpression>>, O, T> p0, java.util.function.Function<T, O> p1, com.mojang.serialization.MapCodec<O> p2, int p3) { return null; }
    static public enum PropertyModifierMode implements net.minecraft.util.StringRepresentable {
        REPLACE(null),
        ADD(null),
        SUBTRACT(null),
        MULTIPLY(null),
        MOLANG(null);
    }
}
