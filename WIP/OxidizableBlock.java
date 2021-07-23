package com.klr2003.anaesia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class OxidizableBlock extends Block implements Oxidizable {
   private final OxidizationLevel oxidizationLevel;

   public OxidizableBlock(OxidizationLevel oxidizationLevel, Settings settings) {
      super(settings);
      this.oxidizationLevel = oxidizationLevel;
   }

   public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
      this.tickDegradation(state, world, pos, random);
   }

   public boolean hasRandomTicks(BlockState state) {
      return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
   }

   public OxidizationLevel getDegradationLevel() {
      return this.oxidizationLevel;
   }
}
