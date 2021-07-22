package com.klr2003.anaesia.utils.registry;

import com.klr2003.anaesia.AnaesiaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AnaesiaBlockRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AnaesiaItemRegistry {

    public static final Item RAW_IRON = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item RAW_GOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item RAW_COPPER = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item COPPER_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    public static final Item RAW_IRON_BLOCK = new BlockItem(AnaesiaBlockRegistry.RAW_IRON_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item RAW_GOLD_BLOCK = new BlockItem(AnaesiaBlockRegistry.RAW_GOLD_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item SMOOTH_BASALT = new BlockItem(AnaesiaBlockRegistry.SMOOTH_BASALT, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item TUFF = new BlockItem(AnaesiaBlockRegistry.TUFF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CALCITE = new BlockItem(AnaesiaBlockRegistry.CALCITE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item MOSS_BLOCK = new BlockItem(AnaesiaBlockRegistry.MOSS_BLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Item MOSS_CARPET = new BlockItem(AnaesiaBlockRegistry.MOSS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    public static final Item DEEPSLATE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item COBBLED_DEEPSLATE = new BlockItem(AnaesiaBlockRegistry.COBBLED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item COBBLED_DEEPSLATE_STAIRS = new BlockItem(AnaesiaBlockRegistry.COBBLED_DEEPSLATE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item COBBLED_DEEPSLATE_SLAB = new BlockItem(AnaesiaBlockRegistry.COBBLED_DEEPSLATE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item COBBLED_DEEPSLATE_WALL = new BlockItem(AnaesiaBlockRegistry.COBBLED_DEEPSLATE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_DEEPSLATE = new BlockItem(AnaesiaBlockRegistry.POLISHED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_DEEPSLATE_STAIRS = new BlockItem(AnaesiaBlockRegistry.POLISHED_DEEPSLATE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_DEEPSLATE_SLAB = new BlockItem(AnaesiaBlockRegistry.POLISHED_DEEPSLATE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_DEEPSLATE_WALL = new BlockItem(AnaesiaBlockRegistry.POLISHED_DEEPSLATE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_TILES = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_TILE_STAIRS = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_TILE_SLAB = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_TILE_WALL = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_BRICKS = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_BRICK_STAIRS = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_BRICK_SLAB = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_BRICK_WALL = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CHISELED_DEEPSLATE = new BlockItem(AnaesiaBlockRegistry.CHISELED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CRACKED_DEEPSLATE_BRICKS = new BlockItem(AnaesiaBlockRegistry.CRACKED_DEEPSLATE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CRACKED_DEEPSLATE_TILES = new BlockItem(AnaesiaBlockRegistry.CRACKED_DEEPSLATE_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item INFESTED_DEEPSLATE = new BlockItem(AnaesiaBlockRegistry.INFESTED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_EMERALD_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_EMERALD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_GOLD_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_GOLD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_IRON_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_IRON_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_COAL_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_COAL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_DIAMOND_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_DIAMOND_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_COPPER_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_LAPIS_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_LAPIS_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DEEPSLATE_REDSTONE_ORE = new BlockItem(AnaesiaBlockRegistry.DEEPSLATE_REDSTONE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron"), RAW_IRON);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold"), RAW_GOLD);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_copper"), RAW_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "copper_ingot"), COPPER_INGOT);

    }

    public static void registerItemsFromBlock() {
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron_block"), RAW_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold_block"), RAW_GOLD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "smooth_basalt"), SMOOTH_BASALT);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "tuff"), TUFF);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "calcite"), CALCITE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_block"), MOSS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_carpet"), MOSS_CARPET);

        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate"), DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate"), COBBLED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate_stairs"), COBBLED_DEEPSLATE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate_slab"), COBBLED_DEEPSLATE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate_wall"), COBBLED_DEEPSLATE_WALL);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate"), POLISHED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate_stairs"), POLISHED_DEEPSLATE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate_slab"), POLISHED_DEEPSLATE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate_wall"), POLISHED_DEEPSLATE_WALL);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tiles"), DEEPSLATE_TILES);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tile_stairs"), DEEPSLATE_TILE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tile_slab"), DEEPSLATE_TILE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tile_wall"), DEEPSLATE_TILE_WALL);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_bricks"), DEEPSLATE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_brick_stairs"), DEEPSLATE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_brick_slab"), DEEPSLATE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_brick_wall"), DEEPSLATE_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "chiseled_deepslate"), CHISELED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cracked_deepslate_bricks"), CRACKED_DEEPSLATE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cracked_deepslate_tiles"), CRACKED_DEEPSLATE_TILES);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "infested_deepslate"), INFESTED_DEEPSLATE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_gold_ore"), DEEPSLATE_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_iron_ore"), DEEPSLATE_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_coal_ore"), DEEPSLATE_COAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_copper_ore"), DEEPSLATE_COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_lapis_ore"), DEEPSLATE_LAPIS_ORE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_redstone_ore"), DEEPSLATE_REDSTONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_emerald_ore"), DEEPSLATE_EMERALD_ORE);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_diamond_ore"), DEEPSLATE_DIAMOND_ORE);
    }
}
