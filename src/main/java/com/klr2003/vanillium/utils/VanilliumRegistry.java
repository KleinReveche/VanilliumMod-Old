package com.klr2003.vanillium.utils;

import com.klr2003.vanillium.blocks.VanilliumBlocks;
import com.klr2003.vanillium.behaviour.EnhancedBoneMeal;
import com.klr2003.vanillium.behaviour.EnhancedBoneMealDispenserBehaviour;
import com.klr2003.vanillium.behaviour.EnhancedKelp;
import com.klr2003.vanillium.behaviour.EnhancedSeeds;
import com.klr2003.vanillium.behaviour.EnhancedSeedsDispenserBehaviour;
import com.klr2003.vanillium.items.VanilliumItems;

public class VanilliumRegistry {
    public static void register() {
        VanilliumItems.registerItems();
        VanilliumItems.registerItemsFromBlock();
        VanilliumBlocks.registerBlocks();
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
