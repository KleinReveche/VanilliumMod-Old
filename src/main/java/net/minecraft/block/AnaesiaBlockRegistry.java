package net.minecraft.block;

import com.klr2003.anaesia.AnaesiaMod;
import com.klr2003.anaesia.blocks.MossBlock;
import com.klr2003.anaesia.blocks.RotatedInfestedBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AnaesiaBlockRegistry {

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

    }

}
