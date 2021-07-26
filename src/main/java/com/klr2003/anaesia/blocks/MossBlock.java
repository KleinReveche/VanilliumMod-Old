package com.klr2003.anaesia.blocks;

import java.util.Random;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class MossBlock extends Block implements BonemealableBlock {
  public MossBlock(BlockBehaviour.Properties settings) {
    super(settings);
  }
  
  public boolean isValidBonemealTarget(BlockGetter world, BlockPos pos, BlockState state, boolean isClient) {
    return world.getBlockState(pos.above()).isAir();
  }
  
  public boolean isBonemealSuccess(Level world, Random random, BlockPos pos, BlockState state) {
    return true;
  }
  
  public void performBonemeal(ServerLevel world, Random random, BlockPos pos, BlockState state) {}
}
