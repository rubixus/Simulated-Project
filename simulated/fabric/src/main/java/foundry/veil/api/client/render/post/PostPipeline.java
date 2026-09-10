package foundry.veil.api.client.render.post;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.post.PostPipeline
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface PostPipeline {
    public static final com.mojang.serialization.Codec<foundry.veil.api.client.render.post.PostPipeline> CODEC = null;
    public abstract void apply(foundry.veil.api.client.render.post.PostPipeline.Context p0);
    public default void free() {}
    public abstract foundry.veil.api.client.registry.PostPipelineStageRegistry.PipelineType<? extends foundry.veil.api.client.render.post.PostPipeline> getType();
    public default int getUniformLocation(java.lang.CharSequence p0) { return 0; }
    public default foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess getUniform(java.lang.CharSequence p0) { return null; }
    public default foundry.veil.api.client.render.shader.uniform.ShaderUniformAccess getUniformSafe(java.lang.CharSequence p0) { return null; }
    public default int getUniformBlock(java.lang.CharSequence p0) { return 0; }
    public default int getStorageBlock(java.lang.CharSequence p0) { return 0; }
    public default boolean hasUniform(java.lang.CharSequence p0) { return false; }
    public default boolean hasUniformBlock(java.lang.CharSequence p0) { return false; }
    public default boolean hasStorageBlock(java.lang.CharSequence p0) { return false; }
    public default void setUniformBlock(java.lang.CharSequence p0, int p1) {}
    public default void setStorageBlock(java.lang.CharSequence p0, int p1) {}
    public interface Context {
        public abstract void setTexture(java.lang.CharSequence p0, int p1, int p2, int p3);
        public abstract void setFramebuffer(java.lang.Object p0, foundry.veil.api.client.render.framebuffer.AdvancedFbo p1);
        public abstract void applySamplers(foundry.veil.api.client.render.shader.program.TextureUniformAccess p0);
        public abstract void clearSamplers(foundry.veil.api.client.render.shader.program.TextureUniformAccess p0);
        public default foundry.veil.api.client.render.framebuffer.AdvancedFbo getFramebufferOrDraw(java.lang.Object p0) { return null; }
        public abstract foundry.veil.api.client.render.framebuffer.AdvancedFbo getDrawFramebuffer();
        public default foundry.veil.api.client.render.post.PostPipeline getPipeline(java.lang.Object p0) { return null; }
        public default foundry.veil.api.client.render.shader.program.ShaderProgram getShader(java.lang.Object p0) { return null; }
    }
}
