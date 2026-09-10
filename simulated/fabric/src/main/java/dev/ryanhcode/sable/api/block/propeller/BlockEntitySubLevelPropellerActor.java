package dev.ryanhcode.sable.api.block.propeller;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.block.propeller.BlockEntitySubLevelPropellerActor
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public interface BlockEntitySubLevelPropellerActor {
    public static final org.joml.Vector3d THRUST_VECTOR = null;
    public static final org.joml.Vector3d THRUST_POSITION = null;
    public abstract dev.ryanhcode.sable.api.block.propeller.BlockEntityPropeller getPropeller();
    public default void sable$physicsTick(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, dev.ryanhcode.sable.api.physics.handle.RigidBodyHandle p1, double p2) {}
    public default void applyForces(dev.ryanhcode.sable.sublevel.ServerSubLevel p0, net.minecraft.world.phys.Vec3 p1, double p2) {}
}
