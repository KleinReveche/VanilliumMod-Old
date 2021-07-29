package com.klr2003.anaesia.blocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.ToIntFunction;

public class AnaesiaBlocks {

    public static final Block RAW_IRON_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN).requiresCorrectToolForDrops().strength(5.0F, 6.0F));
    public static final Block RAW_GOLD_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GOLD).requiresCorrectToolForDrops().strength(5.0F, 6.0F));
    public static final Block RAW_COPPER_BLOCK = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(5.0F, 6.0F));

    public static final Block SMOOTH_BASALT = new Block(BlockBehaviour.Properties.copy(Blocks.BASALT));
    public static final Block TUFF = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F));
    public static final Block CALCITE = new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.75F));
    public static final Block COPPER_ORE = new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE));

    public static final Block MOSS_BLOCK = new MossBlock(BlockBehaviour.Properties.of(Material.VEGETABLE, MaterialColor.COLOR_GREEN).strength(0.1F));
    public static final Block MOSS_CARPET = new CarpetBlock(DyeColor.GREEN, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_GREEN).strength(0.1F).sound(SoundType.GRASS));

    public static final Block DEEPSLATE = new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE));
    public static final Block COBBLED_DEEPSLATE = new Block(BlockBehaviour.Properties.copy(DEEPSLATE).strength(3.5F, 6.0F));
    public static final Block COBBLED_DEEPSLATE_STAIRS = new StairBlock(COBBLED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE));
    public static final Block COBBLED_DEEPSLATE_WALL = new WallBlock(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE = new Block(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE).sound(SoundType.STONE));
    public static final Block POLISHED_DEEPSLATE_STAIRS = new StairBlock(POLISHED_DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_DEEPSLATE));
    public static final Block POLISHED_DEEPSLATE_WALL = new WallBlock(BlockBehaviour.Properties.copy(POLISHED_DEEPSLATE));
    public static final Block DEEPSLATE_TILES = new Block(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE).sound(SoundType.STONE));
    public static final Block DEEPSLATE_TILE_STAIRS = new StairBlock(DEEPSLATE_TILES.defaultBlockState(), BlockBehaviour.Properties.copy(DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILE_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(DEEPSLATE_TILES));
    public static final Block DEEPSLATE_TILE_WALL = new WallBlock(BlockBehaviour.Properties.copy(DEEPSLATE_TILES));
    public static final Block DEEPSLATE_BRICKS = new Block(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE).sound(SoundType.STONE));
    public static final Block DEEPSLATE_BRICK_STAIRS = new StairBlock(DEEPSLATE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICK_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(DEEPSLATE_BRICKS));
    public static final Block DEEPSLATE_BRICK_WALL = new WallBlock(BlockBehaviour.Properties.copy(DEEPSLATE_BRICKS));
    public static final Block CHISELED_DEEPSLATE = new Block(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE).sound(SoundType.STONE));
    public static final Block CRACKED_DEEPSLATE_BRICKS = new Block(BlockBehaviour.Properties.copy(DEEPSLATE_BRICKS));
    public static final Block CRACKED_DEEPSLATE_TILES = new Block(BlockBehaviour.Properties.copy(DEEPSLATE_TILES));
    public static final Block INFESTED_DEEPSLATE = new InfestedRotatedPillarBlock(DEEPSLATE, BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).sound(SoundType.STONE));
    public static final Block DEEPSLATE_EMERALD_ORE = new OreBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    public static final Block DEEPSLATE_GOLD_ORE = new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    public static final Block DEEPSLATE_IRON_ORE = new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    public static final Block DEEPSLATE_COAL_ORE = new OreBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    public static final Block DEEPSLATE_DIAMOND_ORE = new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    public static final Block DEEPSLATE_COPPER_ORE = new OreBlock(BlockBehaviour.Properties.copy(COPPER_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    public static final Block DEEPSLATE_LAPIS_ORE = new OreBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    public static final Block DEEPSLATE_REDSTONE_ORE = new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(4.5F, 3.0F).sound(SoundType.STONE));
    
    public static final Block COPPER_BLOCK = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL));
    public static final Block EXPOSED_COPPER = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL));
    public static final Block WEATHERED_COPPER = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL));
    public static final Block OXIDIZED_COPPER = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL));
    public static final Block OXIDIZED_CUT_COPPER = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(OXIDIZED_COPPER));
    public static final Block WEATHERED_CUT_COPPER = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(WEATHERED_COPPER));
    public static final Block EXPOSED_CUT_COPPER = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(EXPOSED_COPPER));
    public static final Block CUT_COPPER = new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(COPPER_BLOCK));
    public static final Block OXIDIZED_CUT_COPPER_STAIRS = new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, OXIDIZED_CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(OXIDIZED_CUT_COPPER));
    public static final Block WEATHERED_CUT_COPPER_STAIRS = new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, WEATHERED_CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(WEATHERED_COPPER));
    public static final Block EXPOSED_CUT_COPPER_STAIRS = new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, EXPOSED_CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(EXPOSED_COPPER));
    public static final Block CUT_COPPER_STAIRS = new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(COPPER_BLOCK));
    public static final Block OXIDIZED_CUT_COPPER_SLAB = new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(OXIDIZED_CUT_COPPER).requiresCorrectToolForDrops());
    public static final Block WEATHERED_CUT_COPPER_SLAB = new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(WEATHERED_CUT_COPPER).requiresCorrectToolForDrops());
    public static final Block EXPOSED_CUT_COPPER_SLAB = new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(EXPOSED_CUT_COPPER).requiresCorrectToolForDrops());
    public static final Block CUT_COPPER_SLAB = new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(CUT_COPPER).requiresCorrectToolForDrops());
    
    public static final Block WAXED_COPPER_BLOCK = new Block(BlockBehaviour.Properties.copy(COPPER_BLOCK));
    public static final Block WAXED_WEATHERED_COPPER = new Block(BlockBehaviour.Properties.copy(WEATHERED_COPPER));
    public static final Block WAXED_EXPOSED_COPPER = new Block(BlockBehaviour.Properties.copy(EXPOSED_COPPER));
    public static final Block WAXED_OXIDIZED_COPPER = new Block(BlockBehaviour.Properties.copy(OXIDIZED_COPPER));
    public static final Block WAXED_OXIDIZED_CUT_COPPER = new Block(BlockBehaviour.Properties.copy(OXIDIZED_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER = new Block(BlockBehaviour.Properties.copy(WEATHERED_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER = new Block(BlockBehaviour.Properties.copy(EXPOSED_COPPER));
    public static final Block WAXED_CUT_COPPER = new Block(BlockBehaviour.Properties.copy(COPPER_BLOCK));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_STAIRS = new StairBlock(WAXED_OXIDIZED_CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(OXIDIZED_COPPER));
    public static final Block WAXED_WEATHERED_CUT_COPPER_STAIRS = new StairBlock(WAXED_WEATHERED_CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(WEATHERED_COPPER));
    public static final Block WAXED_EXPOSED_CUT_COPPER_STAIRS = new StairBlock(WAXED_EXPOSED_CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(EXPOSED_COPPER));
    public static final Block WAXED_CUT_COPPER_STAIRS = new StairBlock(WAXED_CUT_COPPER.defaultBlockState(), BlockBehaviour.Properties.copy(COPPER_BLOCK));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(WAXED_OXIDIZED_CUT_COPPER).requiresCorrectToolForDrops());
    public static final Block WAXED_WEATHERED_CUT_COPPER_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(WAXED_WEATHERED_CUT_COPPER).requiresCorrectToolForDrops());
    public static final Block WAXED_EXPOSED_CUT_COPPER_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(WAXED_EXPOSED_CUT_COPPER).requiresCorrectToolForDrops());
    public static final Block WAXED_CUT_COPPER_SLAB = new SlabBlock(BlockBehaviour.Properties.copy(WAXED_CUT_COPPER).requiresCorrectToolForDrops());
    public static final Block AZALEA = new AzaleaBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().sound(SoundType.GRASS).noOcclusion());
    public static final Block AZALEA_LEAVES = leaves();
    public static final Block FLOWERING_AZALEA = new FloweringAzaleaBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().sound(SoundType.GRASS).noOcclusion());
    public static final Block FLOWERING_AZALEA_LEAVES = leaves();
    public static final Block POTTED_AZALEA_BUSH = new FlowerPotBlock(AZALEA, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion());
    public static final Block POTTED_FLOWERING_AZALEA_BUSH = new FlowerPotBlock(FLOWERING_AZALEA, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion());
    public static final Block TINTED_GLASS = new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion().isValidSpawn(AnaesiaBlocks::never).isRedstoneConductor(AnaesiaBlocks::never).isSuffocating(AnaesiaBlocks::never).isViewBlocking(AnaesiaBlocks::never));

    public static final Block CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, MaterialColor.TERRACOTTA_WHITE).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block WHITE_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.WHITE).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block ORANGE_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.ORANGE).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block MAGENTA_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.MAGENTA).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block LIGHT_BLUE_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.LIGHT_BLUE).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block YELLOW_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.YELLOW).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block LIME_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.LIME).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block PINK_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.PINK).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block GRAY_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.GRAY).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block LIGHT_GRAY_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.LIGHT_GRAY).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block CYAN_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.CYAN).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block PURPLE_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.PURPLE).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block BLUE_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.BLUE).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block BROWN_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.BROWN).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block GREEN_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.GREEN).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block RED_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.RED).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));
    public static final Block BLACK_CANDLE = new CandleBlock(BlockBehaviour.Properties.of(Material.CAKE, DyeColor.BLACK).noOcclusion().strength(0.1F).sound(SoundType.WART_BLOCK).lightLevel(CandleBlock.STATE_TO_LUMINANCE));

    public static final Block CANDLE_CAKE = new CandleCakeBlock(CANDLE, BlockBehaviour.Properties.copy(Blocks.CAKE).lightLevel(lightLevel(3)));
    public static final Block WHITE_CANDLE_CAKE = new CandleCakeBlock(WHITE_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block ORANGE_CANDLE_CAKE = new CandleCakeBlock(ORANGE_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block MAGENTA_CANDLE_CAKE = new CandleCakeBlock(MAGENTA_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block LIGHT_BLUE_CANDLE_CAKE = new CandleCakeBlock(LIGHT_BLUE_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block YELLOW_CANDLE_CAKE = new CandleCakeBlock(YELLOW_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block LIME_CANDLE_CAKE = new CandleCakeBlock(LIME_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block PINK_CANDLE_CAKE = new CandleCakeBlock(PINK_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block GRAY_CANDLE_CAKE = new CandleCakeBlock(GRAY_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block LIGHT_GRAY_CANDLE_CAKE = new CandleCakeBlock(LIGHT_GRAY_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block CYAN_CANDLE_CAKE = new CandleCakeBlock(CYAN_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block PURPLE_CANDLE_CAKE = new CandleCakeBlock(PURPLE_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block BLUE_CANDLE_CAKE = new CandleCakeBlock(BLUE_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block BROWN_CANDLE_CAKE = new CandleCakeBlock(BROWN_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block GREEN_CANDLE_CAKE = new CandleCakeBlock(GREEN_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block RED_CANDLE_CAKE = new CandleCakeBlock(RED_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));
    public static final Block BLACK_CANDLE_CAKE = new CandleCakeBlock(BLACK_CANDLE, BlockBehaviour.Properties.copy(CANDLE_CAKE));


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "raw_iron_block"), RAW_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "raw_gold_block"), RAW_GOLD_BLOCK);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "raw_copper_block"), RAW_COPPER_BLOCK);

        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "smooth_basalt"), SMOOTH_BASALT);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "tuff"), TUFF);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "calcite"), CALCITE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "copper_ore"), COPPER_ORE);

        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "moss_block"), MOSS_BLOCK);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "moss_carpet"), MOSS_CARPET);

        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate"), DEEPSLATE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cobbled_deepslate"), COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cobbled_deepslate_stairs"), COBBLED_DEEPSLATE_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cobbled_deepslate_slab"), COBBLED_DEEPSLATE_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cobbled_deepslate_wall"), COBBLED_DEEPSLATE_WALL);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "polished_deepslate"), POLISHED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "polished_deepslate_stairs"), POLISHED_DEEPSLATE_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "polished_deepslate_slab"), POLISHED_DEEPSLATE_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "polished_deepslate_wall"), POLISHED_DEEPSLATE_WALL);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_tiles"), DEEPSLATE_TILES);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_tile_stairs"), DEEPSLATE_TILE_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_tile_slab"), DEEPSLATE_TILE_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_tile_wall"), DEEPSLATE_TILE_WALL);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_bricks"), DEEPSLATE_BRICKS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_brick_stairs"), DEEPSLATE_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_brick_slab"), DEEPSLATE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_brick_wall"), DEEPSLATE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "chiseled_deepslate"), CHISELED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cracked_deepslate_bricks"), CRACKED_DEEPSLATE_BRICKS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cracked_deepslate_tiles"), CRACKED_DEEPSLATE_TILES);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "infested_deepslate"), INFESTED_DEEPSLATE);

        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_gold_ore"), DEEPSLATE_GOLD_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_iron_ore"), DEEPSLATE_IRON_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_coal_ore"), DEEPSLATE_COAL_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_copper_ore"), DEEPSLATE_COPPER_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_lapis_ore"), DEEPSLATE_LAPIS_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_redstone_ore"), DEEPSLATE_REDSTONE_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_emerald_ore"), DEEPSLATE_EMERALD_ORE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "deepslate_diamond_ore"), DEEPSLATE_DIAMOND_ORE);

        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "copper_block"), COPPER_BLOCK);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "exposed_copper"), EXPOSED_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "weathered_copper"), WEATHERED_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "oxidized_copper"), OXIDIZED_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cut_copper"), CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "exposed_cut_copper"), EXPOSED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "weathered_cut_copper"), WEATHERED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "oxidized_cut_copper"), OXIDIZED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cut_copper_stairs"), CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "exposed_cut_copper_stairs"), EXPOSED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "weathered_cut_copper_stairs"), WEATHERED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "oxidized_cut_copper_stairs"), OXIDIZED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cut_copper_slab"), CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "exposed_cut_copper_slab"), EXPOSED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "weathered_cut_copper_slab"), WEATHERED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "oxidized_cut_copper_slab"), OXIDIZED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_copper_block"), WAXED_COPPER_BLOCK);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_exposed_copper"), WAXED_EXPOSED_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_weathered_copper"), WAXED_WEATHERED_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_oxidized_copper"), WAXED_OXIDIZED_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_cut_copper"), WAXED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_exposed_cut_copper"), WAXED_EXPOSED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_weathered_cut_copper"), WAXED_WEATHERED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper"), WAXED_OXIDIZED_CUT_COPPER);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_cut_copper_stairs"), WAXED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_stairs"), WAXED_EXPOSED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_stairs"), WAXED_WEATHERED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_stairs"), WAXED_OXIDIZED_CUT_COPPER_STAIRS);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_cut_copper_slab"), WAXED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_exposed_cut_copper_slab"), WAXED_EXPOSED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_weathered_cut_copper_slab"), WAXED_WEATHERED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_slab"), WAXED_OXIDIZED_CUT_COPPER_SLAB);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "azalea"), AZALEA);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "azalea_leaves"), AZALEA_LEAVES);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "flowering_azalea"), FLOWERING_AZALEA);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "flowering_azalea_leaves"), FLOWERING_AZALEA_LEAVES);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "potted_azalea_bush"), POTTED_AZALEA_BUSH);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "potted_flowering_azalea_bush"), POTTED_FLOWERING_AZALEA_BUSH);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "tinted_glass"), TINTED_GLASS);

        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "candle"), CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "white_candle"), WHITE_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "orange_candle"), ORANGE_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "magenta_candle"), MAGENTA_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "light_blue_candle"), LIGHT_BLUE_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "yellow_candle"), YELLOW_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "lime_candle"), LIME_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "pink_candle"), PINK_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "gray_candle"), GRAY_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "light_gray_candle"), LIGHT_GRAY_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cyan_candle"), CYAN_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "purple_candle"), PURPLE_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "blue_candle"), BLUE_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "brown_candle"), BROWN_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "green_candle"), GREEN_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "red_candle"), RED_CANDLE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "black_candle"), BLACK_CANDLE);

        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "candle_cake"), CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "white_candle_cake"), WHITE_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "orange_candle_cake"), ORANGE_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "magenta_candle_cake"), MAGENTA_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "light_blue_candle_cake"), LIGHT_BLUE_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "yellow_candle_cake"), YELLOW_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "lime_candle_cake"), LIME_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "pink_candle_cake"), PINK_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "gray_candle_cake"), GRAY_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "light_gray_candle_cake"), LIGHT_GRAY_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "cyan_candle_cake"), CYAN_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "purple_candle_cake"), PURPLE_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "blue_candle_cake"), BLUE_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "brown_candle_cake"), BROWN_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "green_candle_cake"), GREEN_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "red_candle_cake"), RED_CANDLE_CAKE);
        Registry.register(Registry.BLOCK, new ResourceLocation("minecraft", "black_candle_cake"), BLACK_CANDLE_CAKE);

        addFlammables();
    }

    private static LeavesBlock leaves() {
        return new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES)
                .strength(0.2F).randomTicks().sound(SoundType.GRASS)
                .noOcclusion().isValidSpawn(AnaesiaBlocks::ocelotOrParrot)
                .isSuffocating(AnaesiaBlocks::never).isViewBlocking(AnaesiaBlocks::never));
    }

    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }

    private static Boolean ocelotOrParrot(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return entityType == EntityType.OCELOT || entityType == EntityType.PARROT;
    }

    private static ToIntFunction<BlockState> lightLevel(int litLevel) {
        return state -> (state.getValue(BlockStateProperties.LIT)) ? litLevel : 0;
    }

    private static void addFlammables() {
        FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
        flammableRegistry.add(AZALEA_LEAVES, 30, 60);
        flammableRegistry.add(FLOWERING_AZALEA_LEAVES, 30, 60);
    }


}
