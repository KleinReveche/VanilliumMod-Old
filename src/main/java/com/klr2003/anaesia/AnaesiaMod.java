package com.klr2003.anaesia;

import com.klr2003.anaesia.utils.Registry;
import net.fabricmc.api.ModInitializer;

public class AnaesiaMod implements ModInitializer {

    public static final String MOD_ID = "anaesia";

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Registry.register();
    }
}
