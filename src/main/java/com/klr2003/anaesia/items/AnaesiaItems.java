package com.klr2003.anaesia.items;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class AnaesiaItems {
  public static final Item RAW_IRON = new Item((Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
  
  public static final Item RAW_GOLD = new Item((Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
  
  public static final Item RAW_COPPER = new Item((Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
  
  public static final Item COPPER_INGOT = new Item((Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
  
  public static final Item AMETHYST_SHARD = new Item((Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_MATERIALS));
  
  private static final Item RAW_IRON_BLOCK = (Item)new BlockItem(AnaesiaBlocks.RAW_IRON_BLOCK, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item RAW_GOLD_BLOCK = (Item)new BlockItem(AnaesiaBlocks.RAW_GOLD_BLOCK, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item SMOOTH_BASALT = (Item)new BlockItem(AnaesiaBlocks.SMOOTH_BASALT, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item TUFF = (Item)new BlockItem(AnaesiaBlocks.TUFF, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item CALCITE = (Item)new BlockItem(AnaesiaBlocks.CALCITE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item MOSS_BLOCK = (Item)new BlockItem(AnaesiaBlocks.MOSS_BLOCK, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS));
  
  private static final Item MOSS_CARPET = (Item)new BlockItem(AnaesiaBlocks.MOSS_CARPET, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS));
  
  private static final Item DEEPSLATE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item COBBLED_DEEPSLATE = (Item)new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item COBBLED_DEEPSLATE_STAIRS = (Item)new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item COBBLED_DEEPSLATE_SLAB = (Item)new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item COBBLED_DEEPSLATE_WALL = (Item)new BlockItem(AnaesiaBlocks.COBBLED_DEEPSLATE_WALL, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item POLISHED_DEEPSLATE = (Item)new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item POLISHED_DEEPSLATE_STAIRS = (Item)new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item POLISHED_DEEPSLATE_SLAB = (Item)new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item POLISHED_DEEPSLATE_WALL = (Item)new BlockItem(AnaesiaBlocks.POLISHED_DEEPSLATE_WALL, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_TILES = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_TILES, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_TILE_STAIRS = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_TILE_SLAB = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_TILE_WALL = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_TILE_WALL, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_BRICKS = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICKS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_BRICK_STAIRS = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_BRICK_SLAB = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_BRICK_WALL = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_BRICK_WALL, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item CHISELED_DEEPSLATE = (Item)new BlockItem(AnaesiaBlocks.CHISELED_DEEPSLATE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item CRACKED_DEEPSLATE_BRICKS = (Item)new BlockItem(AnaesiaBlocks.CRACKED_DEEPSLATE_BRICKS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item CRACKED_DEEPSLATE_TILES = (Item)new BlockItem(AnaesiaBlocks.CRACKED_DEEPSLATE_TILES, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item INFESTED_DEEPSLATE = (Item)new BlockItem(AnaesiaBlocks.INFESTED_DEEPSLATE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_EMERALD_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_EMERALD_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_GOLD_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_GOLD_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_IRON_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_IRON_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_COAL_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_COAL_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_DIAMOND_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_DIAMOND_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_COPPER_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_COPPER_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_LAPIS_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_LAPIS_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item DEEPSLATE_REDSTONE_ORE = (Item)new BlockItem(AnaesiaBlocks.DEEPSLATE_REDSTONE_ORE, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item COPPER_BLOCK = (Item)new BlockItem(AnaesiaBlocks.COPPER_BLOCK, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item EXPOSED_COPPER = (Item)new BlockItem(AnaesiaBlocks.EXPOSED_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WEATHERED_COPPER = (Item)new BlockItem(AnaesiaBlocks.WEATHERED_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item OXIDIZED_COPPER = (Item)new BlockItem(AnaesiaBlocks.OXIDIZED_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item OXIDIZED_CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WEATHERED_CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item EXPOSED_CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item OXIDIZED_CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WEATHERED_CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item EXPOSED_CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item OXIDIZED_CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.OXIDIZED_CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WEATHERED_CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.WEATHERED_CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item EXPOSED_CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.EXPOSED_CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_COPPER_BLOCK = (Item)new BlockItem(AnaesiaBlocks.WAXED_COPPER_BLOCK, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_WEATHERED_COPPER = (Item)new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_EXPOSED_COPPER = (Item)new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_OXIDIZED_COPPER = (Item)new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_OXIDIZED_CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_WEATHERED_CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_EXPOSED_CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_CUT_COPPER = (Item)new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_OXIDIZED_CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_WEATHERED_CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_EXPOSED_CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_CUT_COPPER_STAIRS = (Item)new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER_STAIRS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_OXIDIZED_CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_WEATHERED_CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.WAXED_WEATHERED_CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_EXPOSED_CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.WAXED_EXPOSED_CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item WAXED_CUT_COPPER_SLAB = (Item)new BlockItem(AnaesiaBlocks.WAXED_CUT_COPPER_SLAB, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  private static final Item AZALEA = (Item)new BlockItem(AnaesiaBlocks.AZALEA, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS));
  
  private static final Item AZALEA_LEAVES = (Item)new BlockItem(AnaesiaBlocks.AZALEA_LEAVES, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS));
  
  private static final Item FLOWERING_AZALEA = (Item)new BlockItem(AnaesiaBlocks.FLOWERING_AZALEA, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS));
  
  private static final Item FLOWERING_AZALEA_LEAVES = (Item)new BlockItem(AnaesiaBlocks.FLOWERING_AZALEA_LEAVES, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_DECORATIONS));
  
  private static final Item TINTED_GLASS = (Item)new BlockItem(AnaesiaBlocks.TINTED_GLASS, (Item.Properties)(new FabricItemSettings()).group(CreativeModeTab.TAB_BUILDING_BLOCKS));
  
  public static void registerItems() {
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "raw_iron"), RAW_IRON);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "raw_gold"), RAW_GOLD);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "raw_copper"), RAW_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "copper_ingot"), COPPER_INGOT);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "amethyst_shard"), AMETHYST_SHARD);
  }
  
  public static void registerItemsFromBlock() {
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "raw_iron_block"), RAW_IRON_BLOCK);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "raw_gold_block"), RAW_GOLD_BLOCK);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "smooth_basalt"), SMOOTH_BASALT);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "tuff"), TUFF);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "calcite"), CALCITE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "moss_block"), MOSS_BLOCK);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "moss_carpet"), MOSS_CARPET);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate"), DEEPSLATE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate"), COBBLED_DEEPSLATE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_stairs"), COBBLED_DEEPSLATE_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_slab"), COBBLED_DEEPSLATE_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cobbled_deepslate_wall"), COBBLED_DEEPSLATE_WALL);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate"), POLISHED_DEEPSLATE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_stairs"), POLISHED_DEEPSLATE_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_slab"), POLISHED_DEEPSLATE_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "polished_deepslate_wall"), POLISHED_DEEPSLATE_WALL);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tiles"), DEEPSLATE_TILES);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_stairs"), DEEPSLATE_TILE_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_slab"), DEEPSLATE_TILE_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_tile_wall"), DEEPSLATE_TILE_WALL);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_bricks"), DEEPSLATE_BRICKS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_stairs"), DEEPSLATE_BRICK_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_slab"), DEEPSLATE_BRICK_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_brick_wall"), DEEPSLATE_BRICK_WALL);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "chiseled_deepslate"), CHISELED_DEEPSLATE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cracked_deepslate_bricks"), CRACKED_DEEPSLATE_BRICKS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cracked_deepslate_tiles"), CRACKED_DEEPSLATE_TILES);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "infested_deepslate"), INFESTED_DEEPSLATE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_gold_ore"), DEEPSLATE_GOLD_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_iron_ore"), DEEPSLATE_IRON_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_coal_ore"), DEEPSLATE_COAL_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_copper_ore"), DEEPSLATE_COPPER_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_lapis_ore"), DEEPSLATE_LAPIS_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_redstone_ore"), DEEPSLATE_REDSTONE_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_emerald_ore"), DEEPSLATE_EMERALD_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "deepslate_diamond_ore"), DEEPSLATE_DIAMOND_ORE);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "copper_block"), COPPER_BLOCK);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "exposed_copper"), EXPOSED_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "weathered_copper"), WEATHERED_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "oxidized_copper"), OXIDIZED_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cut_copper"), CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper"), EXPOSED_CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper"), WEATHERED_CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper"), OXIDIZED_CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cut_copper_stairs"), CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper_stairs"), EXPOSED_CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper_stairs"), WEATHERED_CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper_stairs"), OXIDIZED_CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "cut_copper_slab"), CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "exposed_cut_copper_slab"), EXPOSED_CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "weathered_cut_copper_slab"), WEATHERED_CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "oxidized_cut_copper_slab"), OXIDIZED_CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_copper_block"), WAXED_COPPER_BLOCK);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_copper"), WAXED_EXPOSED_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_copper"), WAXED_WEATHERED_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_copper"), WAXED_OXIDIZED_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper"), WAXED_CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper"), WAXED_EXPOSED_CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper"), WAXED_WEATHERED_CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper"), WAXED_OXIDIZED_CUT_COPPER);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper_stairs"), WAXED_CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_stairs"), WAXED_EXPOSED_CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_stairs"), WAXED_WEATHERED_CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_stairs"), WAXED_OXIDIZED_CUT_COPPER_STAIRS);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_cut_copper_slab"), WAXED_CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_slab"), WAXED_EXPOSED_CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_slab"), WAXED_WEATHERED_CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_slab"), WAXED_OXIDIZED_CUT_COPPER_SLAB);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "azalea"), AZALEA);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "azalea_leaves"), AZALEA_LEAVES);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "flowering_azalea"), FLOWERING_AZALEA);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "flowering_azalea_leaves"), FLOWERING_AZALEA_LEAVES);
    Registry.register((Registry)Registry.ITEM, new ResourceLocation("minecraft", "tinted_glass"), TINTED_GLASS);
  }
}
