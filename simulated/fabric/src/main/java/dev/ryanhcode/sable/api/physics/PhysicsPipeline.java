package dev.ryanhcode.sable.api.physics;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.PhysicsPipeline
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface PhysicsPipeline {
    public abstract void init(org.joml.Vector3dc p0, double p1);
    public abstract void dispose();
    public abstract void prePhysicsTicks();
    public abstract void physicsTick(double p0);
    public abstract void postPhysicsTicks();
    public abstract void tick();
    public abstract void add(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, dev.ryanhcode.sable.companion.math.Pose3dc p1);
    public abstract void remove(dev.ryanhcode.sable.sublevel.ServerSubLevel p0);
    public abstract void add(dev.ryanhcode.sable.api.sublevel.KinematicContraption p0);
    public abstract void remove(dev.ryanhcode.sable.api.sublevel.KinematicContraption p0);
    public abstract dev.ryanhcode.sable.companion.math.Pose3d readPose(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, dev.ryanhcode.sable.companion.math.Pose3d p1);
    public abstract dev.ryanhcode.sable.api.physics.object.rope.RopeHandle addRope(dev.ryanhcode.sable.api.physics.object.rope.RopePhysicsObject p0);
    public abstract dev.ryanhcode.sable.api.physics.object.box.BoxHandle addBox(dev.ryanhcode.sable.api.physics.object.box.BoxPhysicsObject p0);
    public abstract void handleChunkSectionAddition(net.minecraft.world.level.chunk.LevelChunkSection p0, int p1, int p2, int p3, boolean p4);
    public abstract void handleChunkSectionRemoval(int p0, int p1, int p2);
    public abstract void handleBlockChange(net.minecraft.core.SectionPos p0, net.minecraft.world.level.chunk.LevelChunkSection p1, int p2, int p3, int p4, net.minecraft.world.level.block.state.BlockState p5, net.minecraft.world.level.block.state.BlockState p6);
    public default void onStatsChanged(dev.ryanhcode.sable.sublevel.ServerSubLevel p0) {}
    public abstract void teleport(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, org.joml.Vector3dc p1, org.joml.Quaterniondc p2);
    public abstract void applyImpulse(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, org.joml.Vector3dc p1, org.joml.Vector3dc p2);
    public abstract void applyLinearAndAngularImpulse(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, org.joml.Vector3dc p1, org.joml.Vector3dc p2, boolean p3);
    public default void addLinearAndAngularVelocity(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, org.joml.Vector3dc p1, org.joml.Vector3dc p2) {}
    public default void resetVelocity(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0) {}
    public default org.joml.Vector3d getLinearVelocity(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, org.joml.Vector3d p1) { return null; }
    public default org.joml.Vector3d getAngularVelocity(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, org.joml.Vector3d p1) { return null; }
    public abstract void wakeUp(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0);
    public default <T extends dev.ryanhcode.sable.api.physics.constraint.PhysicsConstraintHandle> T addConstraint(dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p0, dev.ryanhcode.sable.api.physics.PhysicsPipelineBody p1, dev.ryanhcode.sable.api.physics.constraint.PhysicsConstraintConfiguration<T> p2) { return null; }
    public default void updateConfigFrom(dev.ryanhcode.sable.physics.config.PhysicsConfigData p0) {}
    public abstract int getNextRuntimeID();
}
