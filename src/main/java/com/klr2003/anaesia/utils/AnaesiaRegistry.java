package com.klr2003.anaesia.utils;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import com.klr2003.anaesia.items.AnaesiaItems;

public class AnaesiaRegistry {
    public static void register() {
        AnaesiaItems.registerItems();
        AnaesiaItems.registerItemsFromBlock();
        AnaesiaBlocks.registerBlocks();
    }
}
