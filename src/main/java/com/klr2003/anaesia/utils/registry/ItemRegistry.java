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
    public static final Item SMOOTH_BASALT = new BlockItem(BlockRegistry.SMOOTH_BASALT, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item TUFF = new BlockItem(BlockRegistry.TUFF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CALCITE = new BlockItem(BlockRegistry.CALCITE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item MOSS_BLOCK = new BlockItem(BlockRegistry.MOSS_BLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Item MOSS_CARPET = new BlockItem(BlockRegistry.MOSS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron"), RAW_IRON);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold"), RAW_GOLD);
    }

    public static void registerItemsFromBlock(){
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron_block"), RAW_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold_block"), RAW_GOLD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "smooth_basalt"), SMOOTH_BASALT);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "tuff"), TUFF);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "calcite"), CALCITE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_block"), MOSS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_carpet"), MOSS_CARPET);


    }
}
