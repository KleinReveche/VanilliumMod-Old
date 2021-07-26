package com.klr2003.anaesia.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class TintedGlassBlock extends AbstractGlassBlock {
  public TintedGlassBlock(BlockBehaviour.Properties settings) {
    super(settings);
  }
  
  public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
    return true;
  }
  
  public int getLightBlock(BlockState state, BlockGetter world, BlockPos pos) {
    return 255;
  }
}
