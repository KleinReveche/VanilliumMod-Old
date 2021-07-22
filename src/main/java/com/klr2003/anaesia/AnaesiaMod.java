package com.klr2003.anaesia;

import com.klr2003.anaesia.utils.*;
import com.klr2003.anaesia.utils.registry.AnaesiaRegistry;
import net.fabricmc.api.ModInitializer;

public class AnaesiaMod implements ModInitializer {

    public static final String MOD_ID = "anaesia";
    public static final String MOD_NAME = "Anaesia";
    public static final String VERSION = "0.1.10";
    public static final String MINECRAFT_ID = "minecraft";


    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ConfigHandler.initConfig();
        if(ConfigHandler.readConfigBoolean(ConfigList.isDebugModeEnabled)){new Debug();}
        AnaesiaRegistry.register();
    }
}
