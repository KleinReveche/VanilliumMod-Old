package com.klr2003.anaesia.items;

import com.klr2003.anaesia.AnaesiaMod;
import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AnaesiaItems {

    public static final Item RAW_IRON = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item RAW_GOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item RAW_COPPER = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item COPPER_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item AMETHYST_SHARD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    private static final Item RAW_IRON_BLOCK = new BlockItem(AnaesiaBlocks.RAW_IRON_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item RAW_GOLD_BLOCK = new BlockItem(AnaesiaBlocks.RAW_GOLD_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item SMOOTH_BASALT = new BlockItem(AnaesiaBlocks.SMOOTH_BASALT, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item TUFF = new BlockItem(AnaesiaBlocks.TUFF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item CALCITE = new BlockItem(AnaesiaBlocks.CALCITE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item MOSS_BLOCK = new BlockItem(AnaesiaBlocks.MOSS_BLOCK, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    private static final Item MOSS_CARPET = new BlockItem(AnaesiaBlocks.MOSS_CARPET, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    private static final Item DEEPSLATE = new BlockItem(AnaesiaBlocks.DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item COBBLED_DEEPSLATE = new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item COBBLED_DEEPSLATE_STAIRS = new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item COBBLED_DEEPSLATE_SLAB = new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item COBBLED_DEEPSLATE_WALL = new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item POLISHED_DEEPSLATE = new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item POLISHED_DEEPSLATE_STAIRS = new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item POLISHED_DEEPSLATE_SLAB = new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item POLISHED_DEEPSLATE_WALL = new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_TILES = new BlockItem(AnaesiaBlocks.DEEPSLATE_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_TILE_STAIRS = new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_TILE_SLAB = new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_TILE_WALL = new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_BRICKS = new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_BRICK_STAIRS = new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_BRICK_SLAB = new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_BRICK_WALL = new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item CHISELED_DEEPSLATE = new BlockItem(AnaesiaBlocks.CHISELED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item CRACKED_DEEPSLATE_BRICKS = new BlockItem(AnaesiaBlocks.CRACKED_DEEPSLATE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item CRACKED_DEEPSLATE_TILES = new BlockItem(AnaesiaBlocks.CRACKED_DEEPSLATE_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item INFESTED_DEEPSLATE = new BlockItem(AnaesiaBlocks.INFESTED_DEEPSLATE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_EMERALD_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_EMERALD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_GOLD_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_GOLD_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_IRON_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_IRON_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_COAL_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_COAL_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_DIAMOND_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_DIAMOND_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_COPPER_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_LAPIS_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_LAPIS_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item DEEPSLATE_REDSTONE_ORE = new BlockItem(AnaesiaBlocks.DEEPSLATE_REDSTONE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    private static final Item COPPER_BLOCK = new BlockItem(AnaesiaBlocks.COPPER_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item EXPOSED_COPPER = new BlockItem(AnaesiaBlocks.EXPOSED_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WEATHERED_COPPER = new BlockItem(AnaesiaBlocks.WEATHERED_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item OXIDIZED_COPPER = new BlockItem(AnaesiaBlocks.OXIDIZED_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item OXIDIZED_CUT_COPPER = new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WEATHERED_CUT_COPPER = new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item EXPOSED_CUT_COPPER = new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item CUT_COPPER = new BlockItem(AnaesiaBlocks.CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item OXIDIZED_CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WEATHERED_CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item EXPOSED_CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item OXIDIZED_CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WEATHERED_CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item EXPOSED_CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_COPPER_BLOCK = new BlockItem(AnaesiaBlocks.WAXED_COPPER_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_WEATHERED_COPPER = new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_EXPOSED_COPPER = new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_OXIDIZED_COPPER = new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_OXIDIZED_CUT_COPPER = new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_WEATHERED_CUT_COPPER = new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_EXPOSED_CUT_COPPER = new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_CUT_COPPER = new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_OXIDIZED_CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_WEATHERED_CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_EXPOSED_CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_CUT_COPPER_STAIRS = new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_OXIDIZED_CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_WEATHERED_CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_EXPOSED_CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    private static final Item WAXED_CUT_COPPER_SLAB = new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    private static final Item AZALEA = new BlockItem(AnaesiaBlocks.AZALEA, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    private static final Item AZALEA_LEAVES = new BlockItem(AnaesiaBlocks.AZALEA_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    private static final Item FLOWERING_AZALEA = new BlockItem(AnaesiaBlocks.FLOWERING_AZALEA, new FabricItemSettings().group(ItemGroup.DECORATIONS));
    private static final Item FLOWERING_AZALEA_LEAVES = new BlockItem(AnaesiaBlocks.FLOWERING_AZALEA_LEAVES, new FabricItemSettings().group(ItemGroup.DECORATIONS));

    private static final Item TINTED_GLASS = new BlockItem(AnaesiaBlocks.TINTED_GLASS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron"), RAW_IRON);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold"), RAW_GOLD);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_copper"), RAW_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "amethyst_shard"), AMETHYST_SHARD);

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

        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "copper_block"), COPPER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_copper"), EXPOSED_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_copper"), WEATHERED_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_copper"), OXIDIZED_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cut_copper"), CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_cut_copper"), EXPOSED_CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_cut_copper"), WEATHERED_CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_cut_copper"), OXIDIZED_CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cut_copper_stairs"), CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_cut_copper_stairs"), EXPOSED_CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_cut_copper_stairs"), WEATHERED_CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_cut_copper_stairs"), OXIDIZED_CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "cut_copper_slab"), CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_cut_copper_slab"), EXPOSED_CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_cut_copper_slab"), WEATHERED_CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_cut_copper_slab"), OXIDIZED_CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_copper_block"), WAXED_COPPER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_copper"), WAXED_EXPOSED_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_copper"), WAXED_WEATHERED_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_copper"), WAXED_OXIDIZED_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_cut_copper"), WAXED_CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_cut_copper"), WAXED_EXPOSED_CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_cut_copper"), WAXED_WEATHERED_CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_cut_copper"), WAXED_OXIDIZED_CUT_COPPER);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_cut_copper_stairs"), WAXED_CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_cut_copper_stairs"), WAXED_EXPOSED_CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_cut_copper_stairs"), WAXED_WEATHERED_CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_cut_copper_stairs"), WAXED_OXIDIZED_CUT_COPPER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_cut_copper_slab"), WAXED_CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_cut_copper_slab"), WAXED_EXPOSED_CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_cut_copper_slab"), WAXED_WEATHERED_CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_cut_copper_slab"), WAXED_OXIDIZED_CUT_COPPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "azalea"), AZALEA);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "azalea_leaves"), AZALEA_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "flowering_azalea"), FLOWERING_AZALEA);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "flowering_azalea_leaves"), FLOWERING_AZALEA_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(AnaesiaMod.MINECRAFT_ID, "tinted_glass"), TINTED_GLASS);

    }
}
