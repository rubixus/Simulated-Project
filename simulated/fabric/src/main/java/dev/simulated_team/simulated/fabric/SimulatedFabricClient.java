package dev.simulated_team.simulated.fabric;

import dev.simulated_team.simulated.SimulatedClient;
import net.fabricmc.api.ClientModInitializer;

/**
 * Fabric client entrypoint for Create Simulated on Minecraft 26.2 + Create Fly.
 *
 * <p>Mirrors {@code dev.simulated_team.simulated.neoforge.SimulatedNeoForgeClient}.
 */
public final class SimulatedFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SimulatedClient.init();
        // TODO(port): register Fabric client events, keybinds, renderers
        // (see SimulatedNeoForgeClient for the NeoForge list, plus 26.2
        // rendering changes: pipeline, Gui/Hud split, render-state extraction).
    }
}
