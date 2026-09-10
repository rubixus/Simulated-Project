package foundry.veil.api.client.render.framebuffer;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.framebuffer.FramebufferDefinition
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public record FramebufferDefinition(gg.moonflower.molangcompiler.api.MolangExpression width, gg.moonflower.molangcompiler.api.MolangExpression height, foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition[] colorBuffers, foundry.veil.api.client.render.framebuffer.FramebufferAttachmentDefinition depthBuffer, boolean autoClear) {
    public static final gg.moonflower.molangcompiler.api.MolangExpression DEFAULT_WIDTH = null;
    public static final gg.moonflower.molangcompiler.api.MolangExpression DEFAULT_HEIGHT = null;
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.framebuffer.FramebufferDefinition> CODEC = null;
    public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder createBuilder(int p0, int p1) { return null; }
    public foundry.veil.api.client.render.framebuffer.AdvancedFbo.Builder createBuilder(gg.moonflower.molangcompiler.api.MolangEnvironment p0) { return null; }
}
