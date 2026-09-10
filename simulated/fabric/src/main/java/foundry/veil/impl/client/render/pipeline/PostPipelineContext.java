package foundry.veil.impl.client.render.pipeline;

// AUTO-GENERATED STUB for foundry.veil.impl.client.render.pipeline.PostPipelineContext
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class PostPipelineContext implements foundry.veil.api.client.render.post.PostPipeline.Context {
    public PostPipelineContext() {}
    public void begin() {}
    public void end() {}
    public void setTexture(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void setFramebuffer(java.lang.Object p0, foundry.veil.api.client.render.framebuffer.AdvancedFbo p1) {}
    public void applySamplers(foundry.veil.api.client.render.shader.program.TextureUniformAccess p0) {}
    public void clearSamplers(foundry.veil.api.client.render.shader.program.TextureUniformAccess p0) {}
    public foundry.veil.api.client.render.framebuffer.AdvancedFbo getFramebuffer(java.lang.Object p0) { return null; }
    public foundry.veil.api.client.render.framebuffer.AdvancedFbo getDrawFramebuffer() { return null; }
}
