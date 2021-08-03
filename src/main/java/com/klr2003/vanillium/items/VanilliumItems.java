package com.klr2003.vanillium.items;

import com.klr2003.vanillium.blocks.VanilliumBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class VanilliumItems {

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
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_iron_block"), new BlockItem(VanilliumBlocks.RAW_IRON_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_gold_block"),  new BlockItem(VanilliumBlocks.RAW_GOLD_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "raw_copper_block"),  new BlockItem(VanilliumBlocks.RAW_COPPER_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "smooth_basalt"),  new BlockItem(VanilliumBlocks.SMOOTH_BASALT, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "copper_ore"),  new BlockItem(VanilliumBlocks.COPPER_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "tuff"),  new BlockItem(VanilliumBlocks.TUFF, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "calcite"),  new BlockItem(VanilliumBlocks.CALCITE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "moss_block"),  new BlockItem(VanilliumBlocks.MOSS_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "moss_carpet"),  new BlockItem(VanilliumBlocks.MOSS_CARPET, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate"),  new BlockItem(VanilliumBlocks.DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate"),  new BlockItem(VanilliumBlocks.COBBLED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_stairs"),  new BlockItem(VanilliumBlocks.COBBLED_DEEPSLATE_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_slab"),  new BlockItem(VanilliumBlocks.COBBLED_DEEPSLATE_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_wall"),  new BlockItem(VanilliumBlocks.COBBLED_DEEPSLATE_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate"),  new BlockItem(VanilliumBlocks.POLISHED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_stairs"),  new BlockItem(VanilliumBlocks.POLISHED_DEEPSLATE_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_slab"),  new BlockItem(VanilliumBlocks.POLISHED_DEEPSLATE_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_wall"),  new BlockItem(VanilliumBlocks.POLISHED_DEEPSLATE_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tiles"),  new BlockItem(VanilliumBlocks.DEEPSLATE_TILES, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_stairs"),  new BlockItem(VanilliumBlocks.DEEPSLATE_TILE_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_slab"),  new BlockItem(VanilliumBlocks.DEEPSLATE_TILE_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_wall"),  new BlockItem(VanilliumBlocks.DEEPSLATE_TILE_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_bricks"),  new BlockItem(VanilliumBlocks.DEEPSLATE_BRICKS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_stairs"),  new BlockItem(VanilliumBlocks.DEEPSLATE_BRICK_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_slab"),  new BlockItem(VanilliumBlocks.DEEPSLATE_BRICK_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_wall"),  new BlockItem(VanilliumBlocks.DEEPSLATE_BRICK_WALL, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "chiseled_deepslate"), new BlockItem(VanilliumBlocks.CHISELED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cracked_deepslate_bricks"), new BlockItem(VanilliumBlocks.CRACKED_DEEPSLATE_BRICKS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cracked_deepslate_tiles"), new BlockItem(VanilliumBlocks.CRACKED_DEEPSLATE_TILES, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "infested_deepslate"), new BlockItem(VanilliumBlocks.INFESTED_DEEPSLATE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_gold_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_GOLD_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_iron_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_IRON_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_coal_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_COAL_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_copper_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_COPPER_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_lapis_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_LAPIS_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_redstone_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_REDSTONE_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_emerald_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_EMERALD_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "deepslate_diamond_ore"), new BlockItem(VanilliumBlocks.DEEPSLATE_DIAMOND_ORE, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "copper_block"), new BlockItem(VanilliumBlocks.COPPER_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_copper"), new BlockItem(VanilliumBlocks.EXPOSED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_copper"), new BlockItem(VanilliumBlocks.WEATHERED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_copper"), new BlockItem(VanilliumBlocks.OXIDIZED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cut_copper"), new BlockItem(VanilliumBlocks.CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper"), new BlockItem(VanilliumBlocks.EXPOSED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper"), new BlockItem(VanilliumBlocks.WEATHERED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper"), new BlockItem(VanilliumBlocks.OXIDIZED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cut_copper_stairs"), new BlockItem(VanilliumBlocks.CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper_stairs"), new BlockItem(VanilliumBlocks.EXPOSED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper_stairs"), new BlockItem(VanilliumBlocks.WEATHERED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper_stairs"), new BlockItem(VanilliumBlocks.OXIDIZED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cut_copper_slab"), new BlockItem(VanilliumBlocks.CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper_slab"), new BlockItem(VanilliumBlocks.EXPOSED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper_slab"), new BlockItem(VanilliumBlocks.WEATHERED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper_slab"), new BlockItem(VanilliumBlocks.OXIDIZED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_copper_block"), new BlockItem(VanilliumBlocks.WAXED_COPPER_BLOCK, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_copper"), new BlockItem(VanilliumBlocks.WAXED_EXPOSED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_copper"), new BlockItem(VanilliumBlocks.WAXED_WEATHERED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_copper"), new BlockItem(VanilliumBlocks.WAXED_OXIDIZED_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper"), new BlockItem(VanilliumBlocks.WAXED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper"), new BlockItem(VanilliumBlocks.WAXED_EXPOSED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper"), new BlockItem(VanilliumBlocks.WAXED_WEATHERED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper"), new BlockItem(VanilliumBlocks.WAXED_OXIDIZED_CUT_COPPER, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper_stairs"), new BlockItem(VanilliumBlocks.WAXED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_stairs"), new BlockItem(VanilliumBlocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_stairs"), new BlockItem(VanilliumBlocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_stairs"), new BlockItem(VanilliumBlocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper_slab"), new BlockItem(VanilliumBlocks.WAXED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_slab"), new BlockItem(VanilliumBlocks.WAXED_EXPOSED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_slab"), new BlockItem(VanilliumBlocks.WAXED_WEATHERED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_slab"), new BlockItem(VanilliumBlocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "azalea"), new BlockItem(VanilliumBlocks.AZALEA, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "azalea_leaves"), new BlockItem(VanilliumBlocks.AZALEA_LEAVES, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "flowering_azalea"), new BlockItem(VanilliumBlocks.FLOWERING_AZALEA, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "flowering_azalea_leaves"), new BlockItem(VanilliumBlocks.FLOWERING_AZALEA_LEAVES, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "tinted_glass"), new BlockItem(VanilliumBlocks.TINTED_GLASS, (new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "candle"), new BlockItem(VanilliumBlocks.CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "white_candle"), new BlockItem(VanilliumBlocks.WHITE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "orange_candle"), new BlockItem(VanilliumBlocks.ORANGE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "magenta_candle"), new BlockItem(VanilliumBlocks.MAGENTA_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "light_blue_candle"), new BlockItem(VanilliumBlocks.LIGHT_BLUE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "yellow_candle"), new BlockItem(VanilliumBlocks.YELLOW_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "lime_candle"), new BlockItem(VanilliumBlocks.LIME_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "pink_candle"), new BlockItem(VanilliumBlocks.PINK_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "gray_candle"), new BlockItem(VanilliumBlocks.GRAY_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "light_gray_candle"), new BlockItem(VanilliumBlocks.LIGHT_GRAY_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "cyan_candle"), new BlockItem(VanilliumBlocks.CYAN_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "purple_candle"), new BlockItem(VanilliumBlocks.PURPLE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "blue_candle"), new BlockItem(VanilliumBlocks.BLUE_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "brown_candle"), new BlockItem(VanilliumBlocks.BROWN_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "green_candle"), new BlockItem(VanilliumBlocks.GREEN_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "red_candle"), new BlockItem(VanilliumBlocks.RED_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));
        Registry.register(Registry.ITEM, new ResourceLocation("minecraft", "black_candle"), new BlockItem(VanilliumBlocks.BLACK_CANDLE, (new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS)));

    }
}
