package com.klr2003.anaesia.utils;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import com.klr2003.anaesia.behaviour.EnhancedBoneMeal;
import com.klr2003.anaesia.behaviour.EnhancedBoneMealDispenserBehaviour;
import com.klr2003.anaesia.behaviour.EnhancedKelp;
import com.klr2003.anaesia.behaviour.EnhancedSeeds;
import com.klr2003.anaesia.behaviour.EnhancedSeedsDispenserBehaviour;
import com.klr2003.anaesia.items.AnaesiaItems;

public class AnaesiaRegistry {
    public static void register() {
        AnaesiaItems.registerItems();
        AnaesiaItems.registerItemsFromBlock();
        AnaesiaBlocks.registerBlocks();
        registerBehaviour();
    }

    private static void registerBehaviour() {
        if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedBoneMealEnabled)) {
            new EnhancedBoneMeal();
            new EnhancedBoneMealDispenserBehaviour();
        }
        if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedKelpEnabled))
            new EnhancedKelp();
        if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedSeedsEnabled)) {
            new EnhancedSeeds();
            new EnhancedSeedsDispenserBehaviour();
        }
    }

}
