package com.klr2003.anaesia.utils.registry;

import com.klr2003.anaesia.AnaesiaMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry{

    public static final Block RAW_IRON_BLOCK = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.CYAN).requiresTool().strength(5.0F, 6.0F));
    public static final Block RAW_GOLD_BLOCK = new Block(AbstractBlock.Settings.of(Material.STONE, MapColor.GOLD).requiresTool().strength(5.0F, 6.0F));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_iron_block"), RAW_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AnaesiaMod.MINECRAFT_ID, "raw_gold_block"), RAW_GOLD_BLOCK);
    }

}
