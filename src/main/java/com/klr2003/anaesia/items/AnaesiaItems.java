package com.klr2003.anaesia.items;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class AnaesiaItems {

    public static final Item RAW_IRON = new Item((new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
    public static final Item RAW_GOLD = new Item((new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
    public static final Item RAW_COPPER = new Item((new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
    public static final Item COPPER_INGOT = new Item((new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
    public static final Item AMETHYST_SHARD = new Item((new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
    public static final Item HONEYCOMB = new HoneycombItem((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_iron"), RAW_IRON);
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_gold"), RAW_GOLD);
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_copper"), RAW_COPPER);
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "amethyst_shard"), AMETHYST_SHARD);
    }

    public static void registerItemsFromBlock() {
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_iron_block"), new BlockItem(AnaesiaBlocks.RAW_IRON_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_gold_block"),  new BlockItem(AnaesiaBlocks.RAW_GOLD_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_copper_block"),  new BlockItem(AnaesiaBlocks.RAW_COPPER_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "smooth_basalt"),  new BlockItem(AnaesiaBlocks.SMOOTH_BASALT, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "copper_ore"),  new BlockItem(AnaesiaBlocks.COPPER_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "tuff"),  new BlockItem(AnaesiaBlocks.TUFF, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "calcite"),  new BlockItem(AnaesiaBlocks.CALCITE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "moss_block"),  new BlockItem(AnaesiaBlocks.MOSS_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "moss_carpet"),  new BlockItem(AnaesiaBlocks.MOSS_CARPET, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate"),  new BlockItem(AnaesiaBlocks.DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate"),  new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_stairs"),  new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_slab"),  new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_wall"),  new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate"),  new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_stairs"),  new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_slab"),  new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_wall"),  new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tiles"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_TILES, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_stairs"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_slab"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_wall"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_bricks"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICKS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_stairs"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_slab"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_wall"),  new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "chiseled_deepslate"), new BlockItem(AnaesiaBlocks.CHISELED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cracked_deepslate_bricks"), new BlockItem(AnaesiaBlocks.CRACKED_DEEPSLATE_BRICKS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cracked_deepslate_tiles"), new BlockItem(AnaesiaBlocks.CRACKED_DEEPSLATE_TILES, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "infested_deepslate"), new BlockItem(AnaesiaBlocks.INFESTED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_gold_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_GOLD_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_iron_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_IRON_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_coal_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_COAL_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_copper_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_COPPER_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_lapis_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_LAPIS_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_redstone_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_REDSTONE_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_emerald_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_EMERALD_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_diamond_ore"), new BlockItem(AnaesiaBlocks.DEEPSLATE_DIAMOND_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "copper_block"), new BlockItem(AnaesiaBlocks.COPPER_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_copper"), new BlockItem(AnaesiaBlocks.EXPOSED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_copper"), new BlockItem(AnaesiaBlocks.WEATHERED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_copper"), new BlockItem(AnaesiaBlocks.OXIDIZED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cut_copper"), new BlockItem(AnaesiaBlocks.CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper"), new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper"), new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper"), new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cut_copper_stairs"), new BlockItem(AnaesiaBlocks.CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper_stairs"), new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper_stairs"), new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper_stairs"), new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cut_copper_slab"), new BlockItem(AnaesiaBlocks.CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper_slab"), new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper_slab"), new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper_slab"), new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_copper_block"), new BlockItem(AnaesiaBlocks.WAXED_COPPER_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_copper"), new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_copper"), new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_copper"), new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper"), new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper"), new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper"), new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper"), new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper_stairs"), new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_stairs"), new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_stairs"), new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_stairs"), new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper_slab"), new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_slab"), new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_slab"), new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_slab"), new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "azalea"), new BlockItem(AnaesiaBlocks.AZALEA, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "azalea_leaves"), new BlockItem(AnaesiaBlocks.AZALEA_LEAVES, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "flowering_azalea"), new BlockItem(AnaesiaBlocks.FLOWERING_AZALEA, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "flowering_azalea_leaves"), new BlockItem(AnaesiaBlocks.FLOWERING_AZALEA_LEAVES, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "tinted_glass"), new BlockItem(AnaesiaBlocks.TINTED_GLASS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "candle"), new BlockItem(AnaesiaBlocks.CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "white_candle"), new BlockItem(AnaesiaBlocks.WHITE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "orange_candle"), new BlockItem(AnaesiaBlocks.ORANGE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "magenta_candle"), new BlockItem(AnaesiaBlocks.MAGENTA_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "light_blue_candle"), new BlockItem(AnaesiaBlocks.LIGHT_BLUE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "yellow_candle"), new BlockItem(AnaesiaBlocks.YELLOW_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "lime_candle"), new BlockItem(AnaesiaBlocks.LIME_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "pink_candle"), new BlockItem(AnaesiaBlocks.PINK_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "gray_candle"), new BlockItem(AnaesiaBlocks.GRAY_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "light_gray_candle"), new BlockItem(AnaesiaBlocks.LIGHT_GRAY_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cyan_candle"), new BlockItem(AnaesiaBlocks.CYAN_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "purple_candle"), new BlockItem(AnaesiaBlocks.PURPLE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "blue_candle"), new BlockItem(AnaesiaBlocks.BLUE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "brown_candle"), new BlockItem(AnaesiaBlocks.BROWN_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "green_candle"), new BlockItem(AnaesiaBlocks.GREEN_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "red_candle"), new BlockItem(AnaesiaBlocks.RED_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "black_candle"), new BlockItem(AnaesiaBlocks.BLACK_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));

    }
}
