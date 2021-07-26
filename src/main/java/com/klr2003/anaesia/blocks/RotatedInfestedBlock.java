package com.klr2003.anaesia.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;

public class RotatedInfestedBlock extends InfestedBlock {
  public RotatedInfestedBlock(Block block, BlockBehaviour.Properties settings) {
    super(block, settings);
    registerDefaultState((BlockState)defaultBlockState().setValue((Property)PillarBlock.AXIS, (Comparable)Direction.Axis.Y));
  }
  
  public BlockState rotate(BlockState state, Rotation rotation) {
    return PillarBlock.changeRotation(state, rotation);
  }
  
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(new Property[] { (Property)PillarBlock.AXIS });
  }
  
  public BlockState getStateForPlacement(BlockPlaceContext ctx) {
    return (BlockState)defaultBlockState().setValue((Property)PillarBlock.AXIS, (Comparable)ctx.getClickedFace().getAxis());
  }
}
