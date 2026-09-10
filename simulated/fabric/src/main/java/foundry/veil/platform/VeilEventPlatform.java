package foundry.veil.platform;

// AUTO-GENERATED STUB for foundry.veil.platform.VeilEventPlatform
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilEventPlatform {
    public static final foundry.veil.platform.VeilEventPlatform INSTANCE = new foundry.veil.platform.VeilEventPlatform() { @Override public void onFreeNativeResources(foundry.veil.api.event.FreeNativeResourcesEvent p0) {}  @Override public void onVeilAddShaderProcessors(foundry.veil.api.event.VeilAddShaderPreProcessorsEvent p0) {}  @Override public void preVeilPostProcessing(foundry.veil.api.event.VeilPostProcessingEvent.Pre p0) {}  @Override public void postVeilPostProcessing(foundry.veil.api.event.VeilPostProcessingEvent.Post p0) {}  @Override public void onVeilRegisterBlockLayers(foundry.veil.api.event.VeilRegisterBlockLayersEvent p0) {}  @Override public void onVeilRegisterFixedBuffers(foundry.veil.api.event.VeilRegisterFixedBuffersEvent p0) {}  @Override public void onVeilRegisterGlobalControllers(foundry.veil.api.event.VeilRegisterGlobalControllersEvent p0) {}  @Override public void onVeilRegisterInspectors(foundry.veil.api.event.VeilRegisterInspectorsEvent p0) {}  @Override public void onVeilRendererAvailable(foundry.veil.api.event.VeilRendererAvailableEvent p0) {}  @Override public void onVeilRenderLevelStage(foundry.veil.api.event.VeilRenderLevelStageEvent p0) {}  @Override public void onVeilShaderCompile(foundry.veil.api.event.VeilShaderCompileEvent p0) {}  @Override public void onVeilDynamicBuffersChanged(foundry.veil.api.event.VeilDynamicBuffersChangedEvent p0) {} };
    public abstract void onFreeNativeResources(foundry.veil.api.event.FreeNativeResourcesEvent p0);
    public abstract void onVeilAddShaderProcessors(foundry.veil.api.event.VeilAddShaderPreProcessorsEvent p0);
    public abstract void preVeilPostProcessing(foundry.veil.api.event.VeilPostProcessingEvent.Pre p0);
    public abstract void postVeilPostProcessing(foundry.veil.api.event.VeilPostProcessingEvent.Post p0);
    public abstract void onVeilRegisterBlockLayers(foundry.veil.api.event.VeilRegisterBlockLayersEvent p0);
    public abstract void onVeilRegisterFixedBuffers(foundry.veil.api.event.VeilRegisterFixedBuffersEvent p0);
    public abstract void onVeilRegisterGlobalControllers(foundry.veil.api.event.VeilRegisterGlobalControllersEvent p0);
    public abstract void onVeilRegisterInspectors(foundry.veil.api.event.VeilRegisterInspectorsEvent p0);
    public abstract void onVeilRendererAvailable(foundry.veil.api.event.VeilRendererAvailableEvent p0);
    public abstract void onVeilRenderLevelStage(foundry.veil.api.event.VeilRenderLevelStageEvent p0);
    public abstract void onVeilShaderCompile(foundry.veil.api.event.VeilShaderCompileEvent p0);
    public abstract void onVeilDynamicBuffersChanged(foundry.veil.api.event.VeilDynamicBuffersChangedEvent p0);
}
