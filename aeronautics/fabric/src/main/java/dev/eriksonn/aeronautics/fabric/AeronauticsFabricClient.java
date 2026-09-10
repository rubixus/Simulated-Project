package dev.eriksonn.aeronautics.fabric;

import dev.eriksonn.aeronautics.AeronauticsClient;
import net.fabricmc.api.ClientModInitializer;

/**
 * Fabric client entrypoint for Create Aeronautics on Minecraft 26.2 + Create Fly.
 *
 * <p>Mirrors {@code dev.eriksonn.aeronautics.neoforge.AeronauticsNeoForgeClient}.
 */
public final class AeronauticsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AeronauticsClient.init();
        // TODO(port): register Fabric client events, keybinds, renderers
        // (see AeronauticsNeoForgeClient for the NeoForge list).
    }
}
