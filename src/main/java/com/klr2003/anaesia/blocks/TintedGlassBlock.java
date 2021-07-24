package com.klr2003.anaesia.blocks;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassBlock extends AbstractGlassBlock {
   public TintedGlassBlock(Settings settings) {
      super(settings);
   }

   public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
      return true;
   }

   public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
      return 255;
   }


}
