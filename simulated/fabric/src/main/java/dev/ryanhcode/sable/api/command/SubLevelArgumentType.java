package dev.ryanhcode.sable.api.command;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.command.SubLevelArgumentType
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class SubLevelArgumentType implements com.mojang.brigadier.arguments.ArgumentType<dev.ryanhcode.sable.command.argument.selector.SubLevelTarget> {
    public static final java.util.function.Function<com.mojang.brigadier.suggestion.SuggestionsBuilder, com.mojang.brigadier.suggestion.SuggestionsBuilder> NO_SUGGESTIONS = null;
    public static final com.mojang.brigadier.exceptions.SimpleCommandExceptionType ERROR_SINGLE_SUB_LEVEL_REQUIRED = null;
    public static final com.mojang.brigadier.exceptions.SimpleCommandExceptionType ERROR_INVALID_SELECTOR = null;
    public static final com.mojang.brigadier.exceptions.SimpleCommandExceptionType ERROR_UNEXPECTED_END_OF_INPUT = null;
    public static final com.mojang.brigadier.exceptions.SimpleCommandExceptionType ERROR_INVALID_UUID = null;
    public static final com.mojang.brigadier.exceptions.SimpleCommandExceptionType ERROR_CANNOT_FIND_SUB_LEVEL = null;
    public SubLevelArgumentType(boolean p0, boolean p1) {}
    public static java.util.Collection<dev.ryanhcode.sable.sublevel.ServerSubLevel> getSubLevels(com.mojang.brigadier.context.CommandContext<net.minecraft.commands.CommandSourceStack> p0, java.lang.String p1) throws com.mojang.brigadier.exceptions.CommandSyntaxException { return null; }
    public static dev.ryanhcode.sable.sublevel.ServerSubLevel getSingleSubLevel(com.mojang.brigadier.context.CommandContext<net.minecraft.commands.CommandSourceStack> p0, java.lang.String p1) throws com.mojang.brigadier.exceptions.CommandSyntaxException { return null; }
    public static dev.ryanhcode.sable.api.command.SubLevelArgumentType singleSubLevel() { return null; }
    public static dev.ryanhcode.sable.api.command.SubLevelArgumentType subLevels() { return null; }
    public static dev.ryanhcode.sable.api.command.SubLevelArgumentType subLevelsOrLevel() { return null; }
    public static void setSelectorSuggestions(com.mojang.brigadier.StringReader p0, java.lang.String... p1) {}
    public static void setSelectorSuggestions(com.mojang.brigadier.StringReader p0, java.util.List<java.lang.String> p1) {}
    public static void setSelectorSuggestionsWithTooltip(com.mojang.brigadier.StringReader p0, it.unimi.dsi.fastutil.Pair<java.lang.String, com.mojang.brigadier.Message>... p1) {}
    public static void setSelectorSuggestionsWithTooltip(com.mojang.brigadier.StringReader p0, java.util.List<it.unimi.dsi.fastutil.Pair<java.lang.String, com.mojang.brigadier.Message>> p1) {}
    public static java.lang.String readUntilEndOrCharacter(com.mojang.brigadier.StringReader p0, char p1) throws com.mojang.brigadier.exceptions.CommandSyntaxException { return null; }
    public dev.ryanhcode.sable.command.argument.selector.SubLevelTarget parse(com.mojang.brigadier.StringReader p0) throws com.mojang.brigadier.exceptions.CommandSyntaxException { return null; }
    public <S> java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> listSuggestions(com.mojang.brigadier.context.CommandContext<S> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) { return null; }
    public java.util.Collection<java.lang.String> getExamples() { return null; }
}
