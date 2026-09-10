package dev.simulated_team.simulated.fabric;

import dev.simulated_team.simulated.Simulated;
import net.fabricmc.api.ModInitializer;

/**
 * Fabric entrypoint for Create Simulated on Minecraft 26.2 + Create Fly.
 *
 * <p>Mirrors {@code dev.simulated_team.simulated.neoforge.SimulatedNeoForge}
 * but uses Fabric Entrypoints instead of the NeoForge mod bus. Loader-specific
 * work (creative tabs, events, networking, configs) must move into Fabric
 * service implementations; see PORTING-NOTES-FABRIC-26.2.md.
 */
public final class SimulatedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Simulated.init();
        // TODO(port): register Fabric creative tab, server events, networking,
        // configs and Create Fly compat (see SimulatedNeoForge for the NeoForge list).
    }
}
