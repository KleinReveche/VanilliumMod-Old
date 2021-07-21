package com.klr2003.anaesia.utils.registry;

public class AnaesiaRegistry {

    public static void register(){
        ItemRegistry.registerItems();
        ItemRegistry.registerItemsFromBlock();
        BlockRegistry.registerBlocks();

    }

}
