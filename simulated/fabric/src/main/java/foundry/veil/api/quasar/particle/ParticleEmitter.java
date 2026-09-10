package foundry.veil.api.quasar.particle;

// AUTO-GENERATED STUB for foundry.veil.api.quasar.particle.ParticleEmitter
// Source API: Sable/Veil 1.21.1. Physics and custom rendering are INERT by design.
// Regenerate instead of hand-editing.
@SuppressWarnings({"unchecked", "unused", "rawtypes"})
public class ParticleEmitter {
    protected final foundry.veil.api.quasar.particle.ParticleSystemManager particleManager = null;
    protected foundry.veil.api.quasar.data.QuasarParticleData particleData = null;
    protected java.util.concurrent.CompletableFuture<?> spawnTask = null;
    protected java.util.concurrent.CompletableFuture<?> removeTask = null;
    protected ParticleEmitter(foundry.veil.api.quasar.particle.ParticleSystemManager p0, net.minecraft.client.multiplayer.ClientLevel p1, foundry.veil.api.quasar.data.ParticleEmitterData p2) {}
    void onAdd() {}
    public static void clearErrors() {}
    protected void spawn() {}
    protected static java.util.List<foundry.veil.api.quasar.data.module.ParticleModuleData> createModuleSet(foundry.veil.api.quasar.data.QuasarParticleData p0) { return null; }
    protected void tick() {}
    public void render(foundry.veil.api.client.render.MatrixStack p0, java.lang.Object p1, net.minecraft.client.Camera p2, float p3) {}
    void onRemoved() {}
    public void addCodeModule(foundry.veil.api.quasar.data.module.CodeModule p0) {}
    public void addModule(foundry.veil.api.quasar.data.module.ParticleModuleData p0) {}
    public void removeModule(foundry.veil.api.quasar.data.module.ParticleModuleData p0) {}
    public int trim(int p0) { return 0; }
    public void remove() {}
    public void reset() {}
    public java.lang.Object getRegistryName() { return null; }
    public boolean isRemoved() { return false; }
    public org.joml.Vector3d getPosition() { return null; }
    public org.joml.Quaternionf getRotation() { return null; }
    public foundry.veil.api.quasar.data.ParticleEmitterData getData() { return null; }
    public int getParticleCount() { return 0; }
    public int getMaxLifetime() { return 0; }
    public boolean isLoop() { return false; }
    public int getRate() { return 0; }
    public int getCount() { return 0; }
    public int getMaxParticles() { return 0; }
    public java.util.List<foundry.veil.api.quasar.data.EmitterShapeSettings> getEmitterShapeSettings() { return null; }
    public foundry.veil.api.quasar.data.ParticleSettings getParticleSettings() { return null; }
    public boolean isForceSpawn() { return false; }
    public foundry.veil.api.quasar.data.QuasarParticleData getParticleData() { return null; }
    public net.minecraft.world.entity.Entity getAttachedEntity() { return null; }
    public void setPosition(net.minecraft.world.phys.Vec3 p0) {}
    public void setPosition(org.joml.Vector3dc p0) {}
    public void setPosition(double p0, double p1, double p2) {}
    public void setRotation(float p0, float p1, float p2) {}
    public void setRotation(org.joml.Quaternionfc p0) {}
    public void setMaxLifetime(int p0) {}
    public void setLoop(boolean p0) {}
    public void setRate(int p0) {}
    public void setCount(int p0) {}
    public void setMaxParticles(int p0) {}
    public void setEmitterShapeSettings(java.util.List<foundry.veil.api.quasar.data.EmitterShapeSettings> p0) {}
    public void setParticleSettings(foundry.veil.api.quasar.data.ParticleSettings p0) {}
    public void setForceSpawn(boolean p0) {}
    public void setParticleData(foundry.veil.api.quasar.data.QuasarParticleData p0) {}
    public java.util.List<foundry.veil.api.quasar.data.module.ParticleModuleData> getModules() { return null; }
    public void setAttachedEntity(net.minecraft.world.entity.Entity p0) {}
}
