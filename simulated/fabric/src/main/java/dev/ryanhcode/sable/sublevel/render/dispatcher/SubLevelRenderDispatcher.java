package dev.ryanhcode.sable.sublevel.render.dispatcher;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.sublevel.render.dispatcher.SubLevelRenderDispatcher
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface SubLevelRenderDispatcher {
    public static dev.ryanhcode.sable.sublevel.render.dispatcher.SubLevelRenderDispatcher get() { return null; }
    public abstract dev.ryanhcode.sable.sublevel.render.SubLevelRenderData resize(dev.ryanhcode.sable.sublevel.ClientSubLevel p0, dev.ryanhcode.sable.sublevel.render.SubLevelRenderData p1);
    public abstract dev.ryanhcode.sable.sublevel.render.SubLevelRenderData createRenderData(dev.ryanhcode.sable.sublevel.ClientSubLevel p0);
    public default void rebuild(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0) {}
    public abstract void updateCulling(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, double p1, double p2, double p3, foundry.veil.api.client.render.CullFrustum p4, boolean p5);
    public abstract void renderSectionLayer(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, java.lang.Object p1, java.lang.Object p2, double p3, double p4, double p5, org.joml.Matrix4f p6, org.joml.Matrix4f p7, float p8);
    public abstract void renderAfterSections(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, double p1, double p2, double p3, org.joml.Matrix4f p4, org.joml.Matrix4f p5, float p6);
    public abstract void renderBlockEntities(java.lang.Iterable<dev.ryanhcode.sable.sublevel.ClientSubLevel> p0, dev.ryanhcode.sable.sublevel.render.dispatcher.SubLevelRenderDispatcher.BlockEntityRenderer p1, double p2, double p3, double p4, float p5);
    public abstract void addDebugInfo(java.util.function.Consumer<java.lang.String> p0);
    public default void preRenderChunks(net.minecraft.client.Camera p0) {}
    public interface BlockEntityRenderer {
        public default void renderBlockEntities(java.util.Collection<net.minecraft.world.level.block.entity.BlockEntity> p0, com.mojang.blaze3d.vertex.PoseStack p1, float p2, double p3, double p4, double p5) {}
        public abstract void renderSingleBE(net.minecraft.world.level.block.entity.BlockEntity p0, com.mojang.blaze3d.vertex.PoseStack p1, float p2, double p3, double p4, double p5);
        public abstract net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher getBlockEntityRenderDispatcher();
    }
}
