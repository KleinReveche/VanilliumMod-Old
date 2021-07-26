package com.klr2003.anaesia.blocks;

import com.klr2003.anaesia.blocks.saplings.AzaleaSaplingGenerator;
import java.util.Random;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AzaleaBlock extends BushBlock implements BonemealableBlock {
  private static final AzaleaSaplingGenerator generator = new AzaleaSaplingGenerator();
  
  private static final VoxelShape SHAPE = Shapes.or(Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 8.0D, 10.0D));
  
  protected AzaleaBlock(BlockBehaviour.Properties settings) {
    super(settings);
  }
  
  public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
    return SHAPE;
  }
  
  protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
    return (floor.is(Blocks.CLAY) || super.mayPlaceOn(floor, world, pos));
  }
  
  public boolean isValidBonemealTarget(BlockGetter world, BlockPos pos, BlockState state, boolean isClient) {
    return world.getFluidState(pos.above()).isEmpty();
  }
  
  public boolean isBonemealSuccess(Level world, Random random, BlockPos pos, BlockState state) {
    return (world.random.nextFloat() < 0.45D);
  }
  
  public void performBonemeal(ServerLevel world, Random random, BlockPos pos, BlockState state) {
    generator.growTree(world, world.getChunkSource().getGenerator(), pos, state, random);
  }
}
