package com.klr2003.anaesia.utils.registry;

import com.klr2003.anaesia.AnaesiaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final Item RAW_IRON = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item RAW_GOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static final Item RAW_IRON_BLOCK = new BlockItem(BlockRegistry.RAW_IRON_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item RAW_GOLD_BLOCK = new BlockItem(BlockRegistry.RAW_GOLD_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron"), RAW_IRON);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold"), RAW_GOLD);
    }

    public static void registerItemsFromBlock(){
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron_block"), RAW_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold_block"), RAW_GOLD_BLOCK);

    }
}
