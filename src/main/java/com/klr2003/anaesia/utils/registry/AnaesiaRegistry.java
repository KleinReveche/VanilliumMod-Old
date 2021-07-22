package com.klr2003.anaesia.utils.registry;

import net.minecraft.block.AnaesiaBlockRegistry;

public class AnaesiaRegistry {

    public static void register(){
        AnaesiaItemRegistry.registerItems();
        AnaesiaItemRegistry.registerItemsFromBlock();
        AnaesiaBlockRegistry.registerBlocks();

    }

}
