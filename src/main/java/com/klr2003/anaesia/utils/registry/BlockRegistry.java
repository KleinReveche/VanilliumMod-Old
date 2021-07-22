package com.klr2003.anaesia.utils.registry;

import com.klr2003.anaesia.AnaesiaMod;
import com.klr2003.anaesia.blocks.AnaesiaCarpetBlock;
import com.klr2003.anaesia.blocks.MossBlock;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry{

    public static final Block RAW_IRON_BLOCK = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.CYAN).requiresTool().strength(5.0F, 6.0F));
    public static final Block RAW_GOLD_BLOCK = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.GOLD).requiresTool().strength(5.0F, 6.0F));

    public static final Block SMOOTH_BASALT = new Block(AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block TUFF = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_GRAY).sounds(BlockSoundGroup.STONE).requiresTool().strength(1.5F, 6.0F));
    public static final Block CALCITE = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.STONE).requiresTool().strength(0.75F));

    public static final Block MOSS_BLOCK = new MossBlock(AbstractBlock.Settings.of(Material.MOSS_BLOCK, MapColor.GREEN).strength(0.1F));
    public static final Block MOSS_CARPET = new AnaesiaCarpetBlock(AbstractBlock.Settings.of(Material.PLANT, MapColor.GREEN).strength(0.1F).sounds(BlockSoundGroup.GRASS), DyeColor.GREEN);

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron_block"), RAW_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold_block"), RAW_GOLD_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "smooth_basalt"), SMOOTH_BASALT);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "tuff"), TUFF);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "calcite"), CALCITE);

        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_block"), MOSS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "moss_carpet"), MOSS_CARPET);
    }

}
