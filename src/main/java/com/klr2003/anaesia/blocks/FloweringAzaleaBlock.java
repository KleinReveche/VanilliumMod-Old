package com.klr2003.anaesia.blocks;

import com.klr2003.anaesia.blocks.saplings.FloweringAzaleaSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class FloweringAzaleaBlock extends PlantBlock implements Fertilizable {
   private static final FloweringAzaleaSaplingGenerator generator = new FloweringAzaleaSaplingGenerator();
   private static final VoxelShape SHAPE = VoxelShapes.union(Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(6.0D, 0.0D, 6.0D, 10.0D, 8.0D, 10.0D));

   protected FloweringAzaleaBlock(Settings settings) {
      super(settings);
   }

   public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
      return SHAPE;
   }

   protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
      return floor.isOf(Blocks.CLAY) || super.canPlantOnTop(floor, world, pos);
   }

   public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
      return world.getFluidState(pos.up()).isEmpty();
   }

   public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
      return (double)world.random.nextFloat() < 0.45D;
   }

   public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
      generator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
   }
}
