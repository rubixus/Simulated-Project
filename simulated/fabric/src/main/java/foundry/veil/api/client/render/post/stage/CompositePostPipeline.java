package foundry.veil.api.client.render.post.stage;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.post.stage.CompositePostPipeline
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public final class CompositePostPipeline implements foundry.veil.api.client.render.post.PostPipeline {
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.post.stage.CompositePostPipeline> CODEC = null;
    public CompositePostPipeline(foundry.veil.api.client.render.post.PostPipeline[] p0, java.util.Map<java.lang.String, foundry.veil.api.client.render.shader.texture.ShaderTextureSource> p1, java.util.Map<java.lang.Object, foundry.veil.api.client.render.framebuffer.FramebufferDefinition> p2, foundry.veil.api.event.VeilRenderLevelStageEvent.Stage p3, int p4) {}
    public void apply(foundry.veil.api.client.render.post.PostPipeline.Context p0) {}
    public void free() {}
    public foundry.veil.api.client.registry.PostPipelineStageRegistry.PipelineType<? extends foundry.veil.api.client.render.post.PostPipeline> getType() { return null; }
    public boolean hasUniform(java.lang.CharSequence p0) { return false; }
    public foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess getUniform(java.lang.CharSequence p0) { return null; }
    public foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess getUniformSafe(java.lang.CharSequence p0) { return null; }
    public boolean hasUniformBlock(java.lang.CharSequence p0) { return false; }
    public boolean hasStorageBlock(java.lang.CharSequence p0) { return false; }
    public void setUniformBlock(java.lang.CharSequence p0, int p1) {}
    public void setStorageBlock(java.lang.CharSequence p0, int p1) {}
    public foundry.veil.api.client.render.post.PostPipeline[] getStages() { return null; }
    public java.util.Map<java.lang.String, foundry.veil.api.client.render.shader.texture.ShaderTextureSource> getTextureSources() { return null; }
    public java.util.Map<java.lang.Object, foundry.veil.api.client.render.framebuffer.FramebufferDefinition> getFramebuffers() { return null; }
    public foundry.veil.api.client.render.dynamicbuffer.DynamicBufferType[] getDynamicBuffers() { return null; }
    public foundry.veil.api.event.VeilRenderLevelStageEvent.Stage getRenderStage() { return null; }
    public int getDynamicBuffersMask() { return 0; }
    public int getPriority() { return 0; }
    public boolean isReplace() { return false; }
}
