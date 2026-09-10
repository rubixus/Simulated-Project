package dev.ryanhcode.sable.sublevel.render.dispatcher;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.render.dispatcher.VanillaSubLevelRenderDispatcher
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class VanillaSubLevelRenderDispatcher implements dev.ryanhcode.sable.sublevel.render.dispatcher.SubLevelRenderDispatcher {
    public VanillaSubLevelRenderDispatcher() {}
    public static void setupDynamicEffects(java.lang.Object p0, boolean p1, boolean p2) {}
    public static boolean isSingleBlock(dev.ryanhcode.sable.sublevel.ClientSubLevel p0) { return false; }
    public dev.ryanhcode.sable.sublevel.render.SubLevelRenderData resize(dev.ryanhcode.sable.sublevel.ClientSubLevel p0, dev.ryanhcode.sable.sublevel.render.SubLevelRenderData p1) { return null; }
    public dev.ryanhcode.sable.sublevel.render.SubLevelRenderData createRenderData(dev.ryanhcode.sable.sublevel.ClientSubLevel p0) { return null; }
    public void updateCulling(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, double p1, double p2, double p3, foundry.veil.api.client.render.CullFrustum p4, boolean p5) {}
    public void renderSectionLayer(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, java.lang.Object p1, java.lang.Object p2, double p3, double p4, double p5, org.joml.Matrix4f p6, org.joml.Matrix4f p7, float p8) {}
    public void renderAfterSections(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, double p1, double p2, double p3, org.joml.Matrix4f p4, org.joml.Matrix4f p5, float p6) {}
    public void renderBlockEntities(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, dev.ryanhcode.sable.sublevel.render.dispatcher.SubLevelRenderDispatcher.BlockEntityRenderer p1, double p2, double p3, double p4, float p5) {}
    public void addDebugInfo(java.util.function.Consumer<java.lang.String> p0) {}
    public void free() {}
}
