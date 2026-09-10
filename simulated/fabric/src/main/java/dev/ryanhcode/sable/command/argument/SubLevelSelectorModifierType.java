package dev.ryanhcode.sable.command.argument;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelSelectorModifierType {
    public SubLevelSelectorModifierType(java.lang.String p0, dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType.Parser p1, dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType.FilterPriority p2) {}
    public static void registerType(java.lang.String p0, dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType.Parser p1, dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType.FilterPriority p2) {}
    public static dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType getModifier(java.lang.String p0, com.mojang.brigadier.StringReader p1) throws com.mojang.brigadier.exceptions.CommandSyntaxException { return null; }
    public static void clearRegistry() {}
    public static java.util.List<it.unimi.dsi.fastutil.Pair<java.lang.String, com.mojang.brigadier.Message>> getAllNamesWithTooltip() { return null; }
    public dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType.Parser getParser() { return null; }
    public dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType.FilterPriority getFilterPriority() { return null; }
    static public enum FilterPriority {
        POSITION,
        FILTER,
        SORTING,
        SORTING_SELECTION;
    }
    public interface Modifier {
        public abstract int getMaxResults();
        public abstract java.util.List<dev.ryanhcode.sable.sublevel.ServerSubLevel> apply(java.util.List<dev.ryanhcode.sable.sublevel.ServerSubLevel> p0, org.joml.Vector3d p1);
    }
    public interface Parser {
        public abstract dev.ryanhcode.sable.command.argument.SubLevelSelectorModifierType.Modifier parse(com.mojang.brigadier.StringReader p0) throws com.mojang.brigadier.exceptions.CommandSyntaxException;
    }
}
