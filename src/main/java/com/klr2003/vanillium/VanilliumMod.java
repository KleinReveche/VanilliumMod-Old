package com.klr2003.vanillium;

import com.klr2003.vanillium.utils.VanilliumRegistry;
import com.klr2003.vanillium.utils.ConfigHandler;
import com.klr2003.vanillium.utils.ConfigList;
import com.klr2003.vanillium.utils.Debug;
import net.fabricmc.api.ModInitializer;

public class VanilliumMod implements ModInitializer {
    public static final String MOD_NAME = "Vanillium";
    public static final String VERSION = "0.4.0";

    public void onInitialize() {
        ConfigHandler.initConfig();
        if (ConfigHandler.readConfigBoolean(ConfigList.isDebugModeEnabled))
            new Debug();
        if (ConfigHandler.readConfigBoolean(ConfigList.isBackportEnabled))
            VanilliumRegistry.register();
    }
}
