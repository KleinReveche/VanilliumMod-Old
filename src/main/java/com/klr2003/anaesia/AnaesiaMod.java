package com.klr2003.anaesia;

import com.klr2003.anaesia.utils.AnaesiaRegistry;
import com.klr2003.anaesia.utils.ConfigHandler;
import com.klr2003.anaesia.utils.ConfigList;
import com.klr2003.anaesia.utils.Debug;
import net.fabricmc.api.ModInitializer;

public class AnaesiaMod implements ModInitializer {
    public static final String MOD_NAME = "Anaesia";
    public static final String VERSION = "0.4.0";

    public void onInitialize() {
        ConfigHandler.initConfig();
        if (ConfigHandler.readConfigBoolean(ConfigList.isDebugModeEnabled))
            new Debug();
        if (ConfigHandler.readConfigBoolean(ConfigList.isBackportEnabled))
            AnaesiaRegistry.register();
    }
}
