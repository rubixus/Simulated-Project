package foundry.veil.api.event;

// AUTO-GENERATED STUB for foundry.veil.api.event.VeilRenderLevelStageEvent
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface VeilRenderLevelStageEvent {
    public abstract void onRenderLevelStage(foundry.veil.api.event.VeilRenderLevelStageEvent.Stage p0, net.minecraft.client.renderer.LevelRenderer p1, java.lang.Object p2, foundry.veil.api.client.render.MatrixStack p3, org.joml.Matrix4fc p4, org.joml.Matrix4fc p5, int p6, net.minecraft.client.DeltaTracker p7, net.minecraft.client.Camera p8, net.minecraft.client.renderer.culling.Frustum p9);
    public enum Stage {
        AFTER_SKY,
        AFTER_SOLID_BLOCKS,
        AFTER_CUTOUT_MIPPED_BLOCKS,
        AFTER_CUTOUT_BLOCKS,
        AFTER_ENTITIES,
        AFTER_BLOCK_ENTITIES,
        AFTER_TRANSLUCENT_BLOCKS,
        AFTER_TRIPWIRE_BLOCKS,
        AFTER_PARTICLES,
        AFTER_WEATHER,
        AFTER_LEVEL;
        public static final com.mojang.serialization.Codec<foundry.veil.api.event.VeilRenderLevelStageEvent.Stage> CODEC = null;
        public java.lang.String getName() { return null; }
    }
}
