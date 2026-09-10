package foundry.veil.api.client.render.shader.program;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.shader.program.ShaderBlendMode
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record ShaderBlendMode(foundry.veil.api.client.render.shader.program.ShaderBlendMode.BlendEquation colorEquation, foundry.veil.api.client.render.shader.program.ShaderBlendMode.BlendEquation alphaEquation, java.lang.Object srcColorFactor, java.lang.Object dstColorFactor, java.lang.Object srcAlphaFactor, java.lang.Object dstAlphaFactor) {
    public static final com.mojang.serialization.Codec<java.lang.Object> SOURCE_FACTOR_CODEC = null;
    public static final com.mojang.serialization.Codec<java.lang.Object> DESTINATION_FACTOR_CODEC = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.shader.program.ShaderBlendMode> CODEC = null;
    public void apply() {}
    public boolean hasEquation() { return false; }
    static public enum BlendEquation {
        ADD(0),
        SUBTRACT(0),
        REVERSE_SUBTRACT(0),
        MIN(0),
        MAX(0);
        public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.shader.program.ShaderBlendMode.BlendEquation> CODEC = null;
        public int getGlType() { return 0; }
    }
}
