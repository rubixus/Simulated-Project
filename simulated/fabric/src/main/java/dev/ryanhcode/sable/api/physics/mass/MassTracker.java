package dev.ryanhcode.sable.api.physics.mass;

// AUTO-GENERATED STUB for dev.ryanhcode.sable.api.physics.mass.MassTracker
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class MassTracker implements dev.ryanhcode.sable.api.physics.mass.MassData {
    public static java.util.function.BiFunction<net.minecraft.world.level.BlockGetter, net.minecraft.world.level.block.state.BlockState, org.joml.Vector3dc> BLOCK_CENTER_OF_MASS = null;
    public MassTracker() {}
    public static dev.ryanhcode.sable.api.physics.mass.MassTracker build(net.minecraft.world.level.BlockGetter p0, dev.ryanhcode.sable.companion.math.BoundingBox3ic p1) { return null; }
    public void addBlockMass(net.minecraft.world.level.BlockGetter p0, net.minecraft.world.level.block.state.BlockState p1, net.minecraft.core.BlockPos p2, double p3, net.minecraft.world.phys.Vec3 p4) {}
    public void moveCenterOfMass(org.joml.Vector3d p0) {}
    public double getInverseMass() { return 0.0; }
    public org.joml.Matrix3dc getInverseInertiaTensor() { return null; }
    public org.joml.Matrix3dc getInertiaTensor() { return null; }
    public double getMass() { return 0.0; }
    public org.joml.Vector3dc getCenterOfMass() { return null; }
}
