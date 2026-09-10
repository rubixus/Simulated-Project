package foundry.veil.api.client.render;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.VeilRenderSystem
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public final class VeilRenderSystem {
    public static final java.lang.Object BLOOM_SHARD = null;
    public static void bindTextures(int p0, java.nio.IntBuffer p1, java.nio.IntBuffer p2) {}
    public static void bindTextures(int p0, int[] p1, int[] p2) {}
    public static void bindSamplers(int p0, java.nio.IntBuffer p1) {}
    public static void bindSamplers(int p0, int... p1) {}
    public static void unbindSamplers(int p0, int p1) {}
    public static <T extends net.minecraft.client.renderer.texture.AbstractTexture & foundry.veil.api.client.render.texture.VeilPreloadedTexture> java.util.concurrent.CompletableFuture<?> registerPreloadedTexture(java.lang.Object p0, T p1) { return null; }
    public static <T extends net.minecraft.client.renderer.texture.AbstractTexture & foundry.veil.api.client.render.texture.VeilPreloadedTexture> java.util.concurrent.CompletableFuture<?> registerPreloadedTexture(java.lang.Object p0, T p1, java.util.concurrent.Executor p2) { return null; }
    public static void drawScreenQuad() {}
    public static foundry.veil.api.client.render.shader.program.ShaderProgram setShader(java.lang.Object p0) { return null; }
    public static foundry.veil.api.client.render.shader.program.ShaderProgram setShader(foundry.veil.api.client.render.shader.program.ShaderProgram p0) { return null; }
    public static foundry.veil.api.client.render.shader.program.ShaderProgram setShader(java.util.function.Supplier<foundry.veil.api.client.render.shader.program.ShaderProgram> p0) { return null; }
    public static void drawInstanced(java.lang.Object p0, int p1) {}
    public static void drawIndirect(java.lang.Object p0, long p1, int p2, int p3) {}
    public static void endLastBatch(java.lang.Object p0, java.lang.String p1) {}
    public static void endLastBatch(java.lang.Object p0, java.lang.Object p1) {}
    public static void rebuildChunks() {}
    public static void printGlErrors(java.lang.String p0) {}
    public static int getIndexCount(java.lang.Object p0) { return 0; }
    public static boolean tessellationSupported() { return false; }
    public static boolean computeSupported() { return false; }
    public static boolean atomicCounterSupported() { return false; }
    public static boolean transformFeedbackSupported() { return false; }
    public static boolean multibindSupported() { return false; }
    public static boolean sparseBuffersSupported() { return false; }
    public static boolean directStateAccessSupported() { return false; }
    public static boolean separateShaderObjectsSupported() { return false; }
    public static boolean clearTextureSupported() { return false; }
    public static boolean copyImageSupported() { return false; }
    public static boolean shaderStorageBufferSupported() { return false; }
    public static boolean programInterfaceQuerySupported() { return false; }
    public static boolean textureAnisotropySupported() { return false; }
    public static boolean textureMirrorClampToEdgeSupported() { return false; }
    public static boolean textureCubeMapSeamlessSupported() { return false; }
    public static boolean textureCubeMapArraySupported() { return false; }
    public static boolean nvDrawTextureSupported() { return false; }
    public static boolean drawIndirectSupported() { return false; }
    public static boolean multiDrawIndirectSupported() { return false; }
    public static boolean gpuShaderFloat64BitSupported() { return false; }
    public static boolean gpuShaderInt64BitSupported() { return false; }
    public static boolean vertexAttribute64BitSupported() { return false; }
    public static boolean bindlessTextureSupported() { return false; }
    public static boolean vertexType10F11F11FRevSupported() { return false; }
    public static boolean pipelineStatisticsQuerySupported() { return false; }
    public static int maxCombinedTextureUnits() { return 0; }
    public static int maxColorAttachments() { return 0; }
    public static int maxSamples() { return 0; }
    public static int maxTargetBindings(int p0) { return 0; }
    public static foundry.veil.api.client.render.VeilShaderLimits shaderLimits(int p0) { return null; }
    public static int maxTransformFeedbackBindings() { return 0; }
    public static int maxUniformBuffersBindings() { return 0; }
    public static int maxAtomicCounterBufferBindings() { return 0; }
    public static int maxShaderStorageBufferBindings() { return 0; }
    public static int maxArrayTextureLayers() { return 0; }
    public static float maxTextureAnisotropy() { return 0.0f; }
    public static int maxVertexAttributes() { return 0; }
    public static int maxVertexAttributeRelativeOffset() { return 0; }
    public static int maxFramebufferWidth() { return 0; }
    public static int maxFramebufferHeight() { return 0; }
    public static int maxComputeWorkGroupCountX() { return 0; }
    public static int maxComputeWorkGroupCountY() { return 0; }
    public static int maxComputeWorkGroupCountZ() { return 0; }
    public static int maxComputeWorkGroupSizeX() { return 0; }
    public static int maxComputeWorkGroupSizeY() { return 0; }
    public static int maxComputeWorkGroupSizeZ() { return 0; }
    public static int maxComputeWorkGroupInvocations() { return 0; }
    public static long maxUniformBufferSize() { return 0L; }
    public static int uniformBufferAlignment() { return 0; }
    public static long maxShaderStorageBufferSize() { return 0L; }
    public static void bind(java.lang.CharSequence p0, foundry.veil.api.client.render.shader.block.ShaderBlock<?> p1) {}
    public static void bind(foundry.veil.api.client.render.VeilShaderBufferLayout<?> p0) throws java.lang.IllegalArgumentException {}
    public static void unbind(foundry.veil.api.client.render.shader.block.ShaderBlock<?> p0) {}
    public static void unbind(foundry.veil.api.client.render.VeilShaderBufferLayout<?> p0) throws java.lang.IllegalArgumentException {}
    public static <T> foundry.veil.api.client.render.shader.block.ShaderBlock<T> getBlock(foundry.veil.api.client.render.VeilShaderBufferLayout<T> p0) throws java.lang.IllegalArgumentException { return null; }
    public static void bindVertexArray(int p0) {}
    public static int getBoundTexture(int p0) { return 0; }
    public static int createTextures(int p0) { return 0; }
    public static void createTextures(int p0, int[] p1) {}
    public static void createTextures(int p0, java.nio.IntBuffer p1) {}
    public static foundry.veil.api.client.render.VeilRenderer renderer() { return null; }
    public static foundry.veil.api.client.render.GpuVendor gpuVendor() { return null; }
    public static java.util.concurrent.Executor renderThreadExecutor() { return null; }
    public static foundry.veil.api.client.render.shader.program.ShaderProgram getShader() { return null; }
    public static org.joml.Vector3fc getLight0Direction() { return null; }
    public static org.joml.Vector3fc getLight1Direction() { return null; }
    public static org.joml.Vector3fc getCameraBobOffset() { return null; }
    public static boolean hasImGui() { return false; }
    public static foundry.veil.api.client.render.CullFrustum getCullingFrustum() { return null; }
    public static foundry.veil.api.client.necromancer.render.NecromancerRenderer getNecromancerRenderer() { return null; }
    public static void bootstrap() {}
    public static void init() {}
    public static void beginFrame() {}
    public static void endFrame() {}
    public static void clearShaderBlocks() {}
    public static void shaderUpdate() {}
    public static void resize(int p0, int p1) {}
    public static void close() {}
    public static void renderPost(foundry.veil.api.event.VeilRenderLevelStageEvent.Stage p0) {}
    public static void setShaderLights(org.joml.Vector3fc p0, org.joml.Vector3fc p1) {}
    public static void setCameraBobOffset(org.joml.Vector3fc p0) {}
    public static boolean drawLights(net.minecraft.util.profiling.ProfilerFiller p0, foundry.veil.api.client.render.CullFrustum p1, boolean p2) { return false; }
    public static void compositeLights(net.minecraft.util.profiling.ProfilerFiller p0) {}
    public static void clearLevel() {}
}
