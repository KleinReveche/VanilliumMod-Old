package com.klr2003.anaesia.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class OxidizableSlabBlock extends SlabBlock implements Oxidizable {
   private final Oxidizable.OxidizationLevel oxidizationLevel;

   public OxidizableSlabBlock(Oxidizable.OxidizationLevel oxidizationLevel, Settings settings) {
      super(settings);
      this.oxidizationLevel = oxidizationLevel;
   }

   public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
      this.tickDegradation(state, world, pos, random);
   }

   public boolean hasRandomTicks(BlockState state) {
      return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
   }

   public Oxidizable.OxidizationLevel getDegradationLevel() {
      return this.oxidizationLevel;
   }
}
