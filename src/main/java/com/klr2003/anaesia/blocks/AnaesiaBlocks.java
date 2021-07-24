package com.klr2003.anaesia.blocks;

import com.klr2003.anaesia.AnaesiaMod;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class AnaesiaBlocks{

    public static final Block RAW_IRON_BLOCK = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.CYAN).requiresTool().strength(5.0F, 6.0F));
    public static final Block RAW_GOLD_BLOCK = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.GOLD).requiresTool().strength(5.0F, 6.0F));

    public static final Block SMOOTH_BASALT = new Block(AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block TUFF = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_GRAY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F));
    public static final Block CALCITE = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.STONE).requiresTool().strength(0.75F));
    public static final Block COPPER_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE));

    public static final Block MOSS_BLOCK = new MossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.GREEN).strength(0.1F));
    public static final Block MOSS_CARPET = new CarpetBlock(DyeColor.GREEN, AbstractBlock.Settings.of(Material.PLANT, MapColor.GREEN).strength(0.1F).sounds(BlockSoundGroup.GRASS));

    public static final Block DEEPSLATE = new PillarBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.GRAY).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block COBBLED_DEEPSLATE = new Block(AbstractBlock.Settings.copy(DEEPSLATE).strength(3.5F, 6.0F));
    public static final Block COBBLED_DEEPSLATE_STAIRS = new StairsBlock(COBBLED_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_WALL = new WallBlock(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE = new Block(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE).sounds(BlockSoundGroup.STONE));
    public static final Block POLISHED_DEEPSLATE_STAIRS = new StairsBlock(POLISHED_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(POLISHED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_WALL = new WallBlock(AbstractBlock.Settings.copy(POLISHED_DEEPSLATE));
    public static final Block DEEPSLATE_TILES = new Block(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_TILE_STAIRS = new StairsBlock(DEEPSLATE_TILES.getDefaultState(), AbstractBlock.Settings.copy(DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILE_WALL = new WallBlock(AbstractBlock.Settings.copy(DEEPSLATE_TILES));
    public static final Block DEEPSLATE_BRICKS = new Block(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_BRICK_STAIRS = new StairsBlock(DEEPSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICK_WALL = new WallBlock(AbstractBlock.Settings.copy(DEEPSLATE_BRICKS));
    public static final Block CHISELED_DEEPSLATE = new Block(AbstractBlock.Settings.copy(COBBLED_DEEPSLATE).sounds(BlockSoundGroup.STONE));
    public static final Block CRACKED_DEEPSLATE_BRICKS = new Block(AbstractBlock.Settings.copy(DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES = new Block(AbstractBlock.Settings.copy(DEEPSLATE_TILES));
    public static final Block INFESTED_DEEPSLATE = new RotatedInfestedBlock(DEEPSLATE, AbstractBlock.Settings.of(Material.ORGANIC_PRODUCT, MapColor.GRAY).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_EMERALD_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_GOLD_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.GOLD_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_IRON_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_COAL_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.COAL_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_DIAMOND_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_COPPER_ORE = new OreBlock(AbstractBlock.Settings.copy(COPPER_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_LAPIS_ORE = new OreBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_REDSTONE_ORE = new RedstoneOreBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE).strength(4.5F, 3.0F).sounds(BlockSoundGroup.STONE));

    /*
    public static final Block COPPER_BLOCK = new OxidizableBlock(Oxidizable.OxidizationLevel.UNAFFECTED, AbstractBlock.Settings.of(Material.METAL, MapColor.ORANGE).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block EXPOSED_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.EXPOSED, AbstractBlock.Settings.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block WEATHERED_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.WEATHERED, AbstractBlock.Settings.of(Material.METAL, MapColor.field_25706).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block OXIDIZED_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.OXIDIZED, AbstractBlock.Settings.of(Material.METAL, MapColor.field_25705).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block OXIDIZED_CUT_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.OXIDIZED, AbstractBlock.Settings.copy(OXIDIZED_COPPER));
    public static final Block WEATHERED_CUT_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.WEATHERED, AbstractBlock.Settings.copy(WEATHERED_COPPER));
    public static final Block EXPOSED_CUT_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.EXPOSED, AbstractBlock.Settings.copy(EXPOSED_COPPER));
    public static final Block CUT_COPPER = new OxidizableBlock(Oxidizable.OxidizationLevel.UNAFFECTED, AbstractBlock.Settings.copy(COPPER_BLOCK));
    public static final Block OXIDIZED_CUT_COPPER_STAIRS = new OxidizableStairsBlock(Oxidizable.OxidizationLevel.OXIDIZED, OXIDIZED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(OXIDIZED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_STAIRS = new OxidizableStairsBlock(Oxidizable.OxidizationLevel.WEATHERED, WEATHERED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(WEATHERED_COPPER));
    public static final Block EXPOSED_CUT_COPPER_STAIRS = new OxidizableStairsBlock(Oxidizable.OxidizationLevel.EXPOSED, EXPOSED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(EXPOSED_COPPER));
    public static final Block CUT_COPPER_STAIRS = new OxidizableStairsBlock(Oxidizable.OxidizationLevel.UNAFFECTED, CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(COPPER_BLOCK));
    public static final Block OXIDIZED_CUT_COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.OXIDIZED, AbstractBlock.Settings.copy(OXIDIZED_CUT_COPPER).requiresTool());
    public static final Block WEATHERED_CUT_COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.WEATHERED, AbstractBlock.Settings.copy(WEATHERED_CUT_COPPER).requiresTool());
    public static final Block EXPOSED_CUT_COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.EXPOSED, AbstractBlock.Settings.copy(EXPOSED_CUT_COPPER).requiresTool());
    public static final Block CUT_COPPER_SLAB = new OxidizableSlabBlock(Oxidizable.OxidizationLevel.UNAFFECTED, AbstractBlock.Settings.copy(CUT_COPPER).requiresTool());
     */
    public static final Block COPPER_BLOCK = new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.ORANGE).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block EXPOSED_COPPER = new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block WEATHERED_COPPER = new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.field_25706).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block OXIDIZED_COPPER = new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.field_25705).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    public static final Block OXIDIZED_CUT_COPPER = new Block(AbstractBlock.Settings.copy(OXIDIZED_COPPER));
    public static final Block WEATHERED_CUT_COPPER = new Block(AbstractBlock.Settings.copy(WEATHERED_COPPER));
    public static final Block EXPOSED_CUT_COPPER = new Block(AbstractBlock.Settings.copy(EXPOSED_COPPER));
    public static final Block CUT_COPPER = new Block(AbstractBlock.Settings.copy(COPPER_BLOCK));
    public static final Block OXIDIZED_CUT_COPPER_STAIRS = new StairsBlock(OXIDIZED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(OXIDIZED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_STAIRS = new StairsBlock(WEATHERED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(WEATHERED_COPPER));
    public static final Block EXPOSED_CUT_COPPER_STAIRS = new StairsBlock(EXPOSED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(EXPOSED_COPPER));
    public static final Block CUT_COPPER_STAIRS = new StairsBlock(CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(COPPER_BLOCK));
    public static final Block OXIDIZED_CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(OXIDIZED_CUT_COPPER).requiresTool());
    public static final Block WEATHERED_CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WEATHERED_CUT_COPPER).requiresTool());
    public static final Block EXPOSED_CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(EXPOSED_CUT_COPPER).requiresTool());
    public static final Block CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(CUT_COPPER).requiresTool());

    public static final Block WAXED_COPPER_BLOCK = new Block(AbstractBlock.Settings.copy(COPPER_BLOCK));
    public static final Block WAXED_WEATHERED_COPPER = new Block(AbstractBlock.Settings.copy(WEATHERED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER = new Block(AbstractBlock.Settings.copy(EXPOSED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER = new Block(AbstractBlock.Settings.copy(OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER = new Block(AbstractBlock.Settings.copy(OXIDIZED_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER = new Block(AbstractBlock.Settings.copy(WEATHERED_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER = new Block(AbstractBlock.Settings.copy(EXPOSED_COPPER));
    public static final Block WAXED_CUT_COPPER = new Block(AbstractBlock.Settings.copy(COPPER_BLOCK));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_STAIRS = new StairsBlock(WAXED_OXIDIZED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(OXIDIZED_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_STAIRS = new StairsBlock(WAXED_WEATHERED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(WEATHERED_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_STAIRS = new StairsBlock(WAXED_EXPOSED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(EXPOSED_COPPER));
    public static final Block WAXED_CUT_COPPER_STAIRS = new StairsBlock(WAXED_CUT_COPPER.getDefaultState(), AbstractBlock.Settings.copy(COPPER_BLOCK));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WAXED_OXIDIZED_CUT_COPPER).requiresTool());
    public static final Block WAXED_WEATHERED_CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WAXED_WEATHERED_CUT_COPPER).requiresTool());
    public static final Block WAXED_EXPOSED_CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WAXED_EXPOSED_CUT_COPPER).requiresTool());
    public static final Block WAXED_CUT_COPPER_SLAB = new SlabBlock(AbstractBlock.Settings.copy(WAXED_CUT_COPPER).requiresTool());
    public static final Block AZALEA = new AzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque());
    public static final Block AZALEA_LEAVES = createLeavesBlock();
    public static final Block FLOWERING_AZALEA = new FloweringAzaleaBlock(AbstractBlock.Settings.of(Material.PLANT).breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque());
    public static final Block FLOWERING_AZALEA_LEAVES = createLeavesBlock();
    public static final Block POTTED_AZALEA_BUSH = new FlowerPotBlock(AZALEA, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque());
    public static final Block POTTED_FLOWERING_AZALEA_BUSH = new FlowerPotBlock(FLOWERING_AZALEA, AbstractBlock.Settings.of(Material.DECORATION).breakInstantly().nonOpaque());
    public static final Block TINTED_GLASS = new TintedGlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS).nonOpaque().allowsSpawning(AnaesiaBlocks::never).solidBlock(AnaesiaBlocks::never).suffocates(AnaesiaBlocks::never).blockVision(AnaesiaBlocks::never));


    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron_block"), RAW_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold_block"), RAW_GOLD_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "smooth_basalt"), SMOOTH_BASALT);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "tuff"), TUFF);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "calcite"), CALCITE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "copper_ore"), COPPER_ORE);

        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_block"), MOSS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_carpet"), MOSS_CARPET);
        
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate"), DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate"), COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate_stairs"), COBBLED_DEEPSLATE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate_slab"), COBBLED_DEEPSLATE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cobbled_deepslate_wall"), COBBLED_DEEPSLATE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate"), POLISHED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate_stairs"), POLISHED_DEEPSLATE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate_slab"), POLISHED_DEEPSLATE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "polished_deepslate_wall"), POLISHED_DEEPSLATE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tiles"), DEEPSLATE_TILES);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tile_stairs"), DEEPSLATE_TILE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tile_slab"), DEEPSLATE_TILE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_tile_wall"), DEEPSLATE_TILE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_bricks"), DEEPSLATE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_brick_stairs"), DEEPSLATE_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_brick_slab"), DEEPSLATE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_brick_wall"), DEEPSLATE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "chiseled_deepslate"), CHISELED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cracked_deepslate_bricks"), CRACKED_DEEPSLATE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cracked_deepslate_tiles"), CRACKED_DEEPSLATE_TILES);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "infested_deepslate"), INFESTED_DEEPSLATE);

        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_gold_ore"), DEEPSLATE_GOLD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_iron_ore"), DEEPSLATE_IRON_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_coal_ore"), DEEPSLATE_COAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_copper_ore"), DEEPSLATE_COPPER_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_lapis_ore"), DEEPSLATE_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_redstone_ore"), DEEPSLATE_REDSTONE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_emerald_ore"), DEEPSLATE_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "deepslate_diamond_ore"), DEEPSLATE_DIAMOND_ORE);

        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "copper_block"), COPPER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_copper"), EXPOSED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_copper"), WEATHERED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_copper"), OXIDIZED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cut_copper"), CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_cut_copper"), EXPOSED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_cut_copper"), WEATHERED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_cut_copper"), OXIDIZED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cut_copper_stairs"), CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_cut_copper_stairs"), EXPOSED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_cut_copper_stairs"), WEATHERED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_cut_copper_stairs"), OXIDIZED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "cut_copper_slab"), CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "exposed_cut_copper_slab"), EXPOSED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "weathered_cut_copper_slab"), WEATHERED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "oxidized_cut_copper_slab"), OXIDIZED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_copper_block"), WAXED_COPPER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_copper"), WAXED_EXPOSED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_copper"), WAXED_WEATHERED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_copper"), WAXED_OXIDIZED_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_cut_copper"), WAXED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_cut_copper"), WAXED_EXPOSED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_cut_copper"), WAXED_WEATHERED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_cut_copper"), WAXED_OXIDIZED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_cut_copper_stairs"), WAXED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_cut_copper_stairs"), WAXED_EXPOSED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_cut_copper_stairs"), WAXED_WEATHERED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_cut_copper_stairs"), WAXED_OXIDIZED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_cut_copper_slab"), WAXED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_exposed_cut_copper_slab"), WAXED_EXPOSED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_weathered_cut_copper_slab"), WAXED_WEATHERED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "waxed_oxidized_cut_copper_slab"), WAXED_OXIDIZED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "azalea"), AZALEA);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "azalea_leaves"), AZALEA_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "flowering_azalea"), FLOWERING_AZALEA);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "flowering_azalea_leaves"), FLOWERING_AZALEA_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "potted_azalea_bush"), POTTED_AZALEA_BUSH);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "potted_flowering_azalea_bush"), POTTED_FLOWERING_AZALEA_BUSH);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "tinted_glass"), TINTED_GLASS);


        addFlammables();
    }
    private static LeavesBlock createLeavesBlock() {
        return new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES).strength(0.2F)
                .ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().allowsSpawning(AnaesiaBlocks::canSpawnOnLeaves)
                .suffocates(AnaesiaBlocks::never).blockVision(AnaesiaBlocks::never));
    }

    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos) {return false;}
    private static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) {return false;}
    //private static Boolean always(BlockState blockState, BlockView blockView, BlockPos blockPos) {return true;}

    private static Boolean canSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return type == EntityType.OCELOT || type == EntityType.PARROT;
    }


    private static void addFlammables() {
        FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
        flammableRegistry.add(AZALEA_LEAVES, 30, 60);
        flammableRegistry.add(FLOWERING_AZALEA_LEAVES, 30, 60);
    }

}
