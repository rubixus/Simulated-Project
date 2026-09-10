package foundry.veil.api.client.render.post;

// AUTO-GENERATED STUB for foundry.veil.api.client.render.post.PostProcessingManager
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class PostProcessingManager extends foundry.veil.api.CodecReloadListener<foundry.veil.api.client.render.post.stage.CompositePostPipeline> implements org.lwjgl.system.NativeResource {
    public PostProcessingManager() {}
    public boolean isActive(java.lang.Object p0) { return false; }
    public boolean add(java.lang.Object p0) { return false; }
    public boolean add(int p0, java.lang.Object p1) { return false; }
    public boolean remove(java.lang.Object p0) { return false; }
    public foundry.veil.api.client.render.post.PostPipeline getPipeline(java.lang.Object p0) { return null; }
    public void endFrame() {}
    public void runDefaultPipeline(foundry.veil.api.event.VeilRenderLevelStageEvent.Stage p0) {}
    public void runPipeline(foundry.veil.api.client.render.post.PostPipeline p0) {}
    public void runPipeline(foundry.veil.api.client.render.post.PostPipeline p0, boolean p1) {}
    public static void resolvePost(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0) {}
    public static void resolvePost(foundry.veil.api.client.render.framebuffer.AdvancedFbo p0, int p1) {}
    protected java.util.Map<java.lang.Object, foundry.veil.api.client.render.post.stage.CompositePostPipeline> prepare(net.minecraft.server.packs.resources.ResourceManager p0, net.minecraft.util.profiling.ProfilerFiller p1) { return null; }
    protected void apply(java.util.Map<java.lang.Object, foundry.veil.api.client.render.post.stage.CompositePostPipeline> p0, net.minecraft.server.packs.resources.ResourceManager p1, net.minecraft.util.profiling.ProfilerFiller p2) {}
    public void free() {}
    public foundry.veil.api.client.render.post.PostPipeline.Context getPostPipelineContext() { return null; }
    public java.util.Set<java.lang.Object> getPipelines() { return null; }
    public java.util.List<foundry.veil.api.client.render.post.PostProcessingManager.ProfileEntry> getActivePipelines() { return null; }
    static public class ProfileEntry {
        public ProfileEntry(java.lang.Object p0, int p1) {}
        public java.lang.Object getPipeline() { return null; }
        public int getPriority() { return 0; }
        public void setPriority(int p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
