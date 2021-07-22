package com.klr2003.anaesia.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.Direction;

public class RotatedInfestedBlock extends InfestedBlock {
   public RotatedInfestedBlock(Block block, Settings settings) {
      super(block, settings);
      this.setDefaultState(this.getDefaultState().with(PillarBlock.AXIS, Direction.Axis.Y));
   }

   public BlockState rotate(BlockState state, BlockRotation rotation) {
      return PillarBlock.changeRotation(state, rotation);
   }

   protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
      builder.add(PillarBlock.AXIS);
   }

   public BlockState getPlacementState(ItemPlacementContext ctx) {
      return this.getDefaultState().with(PillarBlock.AXIS, ctx.getSide().getAxis());
   }
}