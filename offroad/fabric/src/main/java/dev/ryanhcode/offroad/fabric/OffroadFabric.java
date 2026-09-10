package dev.ryanhcode.offroad.fabric;

import dev.ryanhcode.offroad.Offroad;
import net.fabricmc.api.ModInitializer;

/**
 * Fabric entrypoint for Create Offroad on Minecraft 26.2 + Create Fly.
 *
 * <p>Mirrors {@code dev.ryanhcode.offroad.neoforge.OffroadNeoForge}.
 */
public final class OffroadFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Offroad.init();
        // TODO(port): register Fabric creative tab, server events, networking,
        // configs and Create Fly compat (see OffroadNeoForge for the NeoForge list).
    }
}
