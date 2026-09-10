package dev.eriksonn.aeronautics.fabric;

import dev.eriksonn.aeronautics.Aeronautics;
import net.fabricmc.api.ModInitializer;

/**
 * Fabric entrypoint for Create Aeronautics on Minecraft 26.2 + Create Fly.
 *
 * <p>Mirrors {@code dev.eriksonn.aeronautics.neoforge.AeronauticsNeoForge}.
 */
public final class AeronauticsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Aeronautics.init();
        // TODO(port): register Fabric creative tab, server events, networking,
        // configs and Create Fly compat (see AeronauticsNeoForge for the NeoForge list).
    }
}
