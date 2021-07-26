package com.klr2003.anaesia.enhancements.seeds;

import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class EnhancedSeedsDispenserBehaviour extends OptionalDispenseItemBehavior {
  public EnhancedSeedsDispenserBehaviour() {
    DispenserBlock.registerBehavior((ItemLike)Items.WHEAT_SEEDS, (DispenseItemBehavior)this);
  }
  
  protected ItemStack execute(BlockSource block, ItemStack stack) {
    setSuccess(true);
    ServerLevel world = block.getLevel();
    BlockPos blockPos = block.getPos().relative((Direction)block.getBlockState().getValue((Property)DispenserBlock.FACING));
    BlockState blockState = world.getBlockState(blockPos);
    Block currentBlock = blockState.getBlock();
    if (currentBlock.equals(Blocks.DIRT)) {
      world.setBlockAndUpdate(blockPos, Blocks.GRASS_BLOCK.defaultBlockState());
      world.levelEvent(2005, blockPos, 0);
      stack.shrink(1);
    } else if (currentBlock.equals(Blocks.GRASS_BLOCK)) {
      BlockPos upperPos = blockPos.above();
      Block upperBlock = world.getBlockState(upperPos).getBlock();
      if (upperBlock.equals(Blocks.AIR)) {
        world.setBlockAndUpdate(upperPos, Blocks.GRASS.defaultBlockState());
        stack.shrink(1);
      } else if (upperBlock.equals(Blocks.GRASS) && 
        upgrade((Level)world, upperPos)) {
        stack.shrink(1);
      } 
    } else if (currentBlock.equals(Blocks.GRASS)) {
      if (upgrade((Level)world, blockPos))
        stack.shrink(1); 
    } else {
      setSuccess(false);
    } 
    return stack;
  }
  
  public boolean upgrade(Level world, BlockPos pos) {
    DoublePlantBlock blockDoublePlant = (DoublePlantBlock)Blocks.TALL_GRASS;
    if (world.isEmptyBlock(pos.above())) {
      blockDoublePlant.placeAt((LevelAccessor)world, pos, 2);
      return true;
    } 
    return false;
  }
}
