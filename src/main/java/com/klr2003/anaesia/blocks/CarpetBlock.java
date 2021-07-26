package com.klr2003.anaesia.blocks;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.WoolCarpetBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CarpetBlock extends WoolCarpetBlock {
  protected CarpetBlock(DyeColor color, BlockBehaviour.Properties settings) {
    super(color, settings);
  }
}
