package com.klr2003.anaesia.blocks;

import java.util.Iterator;
import java.util.Optional;
import java.util.Random;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public interface Degradable<T extends Enum<T>> {
  public static final int field_31056 = 4;
  
  Optional<BlockState> getDegradationResult(BlockState paramBlockState);
  
  float getDegradationChanceMultiplier();
  
  default void tickDegradation(BlockState state, ServerLevel world, BlockPos pos, Random random) {
    float f = 0.05688889F;
    if (random.nextFloat() < 0.05688889F)
      tryDegrade(state, world, pos, random); 
  }
  
  T getDegradationLevel();
  
  default void tryDegrade(BlockState state, ServerLevel world, BlockPos pos, Random random) {
    int i = getDegradationLevel().ordinal();
    int j = 0;
    int k = 0;
    Iterator<BlockPos> var8 = BlockPos.withinManhattan(pos, 4, 4, 4).iterator();
    while (var8.hasNext()) {
      BlockPos blockPos = var8.next();
      int l = blockPos.distManhattan((Vec3i)pos);
      if (l > 4)
        break; 
      if (!blockPos.equals(pos)) {
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        if (block instanceof Degradable) {
          Enum<?> enum_ = ((Degradable<Enum<?>>)block).getDegradationLevel();
          if (getDegradationLevel().getClass() == enum_.getClass()) {
            int m = enum_.ordinal();
            if (m < i)
              return; 
            if (m > i) {
              k++;
              continue;
            } 
            j++;
          } 
        } 
      } 
    } 
    float f = (k + 1) / (k + j + 1);
    float g = f * f * getDegradationChanceMultiplier();
    if (random.nextFloat() < g)
      getDegradationResult(state).ifPresent(statex -> world.setBlockAndUpdate(pos, statex)); 
  }
}
