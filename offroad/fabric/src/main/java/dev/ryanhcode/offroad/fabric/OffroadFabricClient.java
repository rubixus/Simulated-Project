package dev.ryanhcode.offroad.fabric;

import dev.ryanhcode.offroad.OffroadClient;
import net.fabricmc.api.ClientModInitializer;

/**
 * Fabric client entrypoint for Create Offroad on Minecraft 26.2 + Create Fly.
 *
 * <p>Mirrors {@code dev.ryanhcode.offroad.neoforge.OffroadNeoForgeClient}.
 */
public final class OffroadFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OffroadClient.init();
        // TODO(port): register Fabric client events, keybinds, renderers
        // (see OffroadNeoForgeClient for the NeoForge list).
    }
}
