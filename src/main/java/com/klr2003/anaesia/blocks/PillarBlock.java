package com.klr2003.anaesia.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class PillarBlock extends Block {
  public PillarBlock(BlockBehaviour.Properties settings) {
    super(settings);
    registerDefaultState((BlockState)defaultBlockState().setValue((Property)AXIS, (Comparable)Direction.Axis.Y));
  }
  
  public BlockState rotate(BlockState state, Rotation rotation) {
    return changeRotation(state, rotation);
  }
  
  public static BlockState changeRotation(BlockState state, Rotation rotation) {
    switch (rotation) {
      case COUNTERCLOCKWISE_90:
      case CLOCKWISE_90:
        switch ((Direction.Axis)state.getValue((Property)AXIS)) {
          case COUNTERCLOCKWISE_90:
            return (BlockState)state.setValue((Property)AXIS, (Comparable)Direction.Axis.Z);
          case CLOCKWISE_90:
            return (BlockState)state.setValue((Property)AXIS, (Comparable)Direction.Axis.X);
        } 
        return state;
    } 
    return state;
  }
  
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(new Property[] { (Property)AXIS });
  }
  
  public BlockState getStateForPlacement(BlockPlaceContext ctx) {
    return (BlockState)defaultBlockState().setValue((Property)AXIS, (Comparable)ctx.getClickedFace().getAxis());
  }
  
  public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
}
