package com.klr2003.anaesia.utils.datapack;

import com.klr2003.anaesia.utils.UtilHandler;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStarted;
import net.minecraft.server.MinecraftServer;

public class DataPackDisabler implements ServerStarted {

    public DataPackDisabler() {
        ServerLifecycleEvents.SERVER_STARTED.register(this);
    }

    @Override
    public void onServerStarted(MinecraftServer server) {
        server.getCommandManager().execute(server.getCommandSource().withLevel(2), "datapack disable \"fabric/" + UtilHandler.getModId() + "\"");
    }
}
