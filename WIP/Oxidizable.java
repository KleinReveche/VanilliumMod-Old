package com.klr2003.anaesia.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.block.AnaesiaBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public interface Oxidizable extends Degradable<Oxidizable.OxidizationLevel> {

   Supplier<BiMap<Block, Block>> OXIDATION_LEVEL_INCREASES = Suppliers.memoize(() -> {
      return ImmutableBiMap.builder().put(AnaesiaBlockRegistry.COPPER_BLOCK, AnaesiaBlockRegistry.EXPOSED_COPPER)
              .put(AnaesiaBlockRegistry.EXPOSED_COPPER, AnaesiaBlockRegistry.WEATHERED_COPPER)
              .put(AnaesiaBlockRegistry.WEATHERED_COPPER, AnaesiaBlockRegistry.OXIDIZED_COPPER)
              .put(AnaesiaBlockRegistry.CUT_COPPER, AnaesiaBlockRegistry.EXPOSED_CUT_COPPER)
              .put(AnaesiaBlockRegistry.EXPOSED_CUT_COPPER, AnaesiaBlockRegistry.WEATHERED_CUT_COPPER)
              .put(AnaesiaBlockRegistry.WEATHERED_CUT_COPPER, AnaesiaBlockRegistry.OXIDIZED_CUT_COPPER)
              .put(AnaesiaBlockRegistry.CUT_COPPER_SLAB, AnaesiaBlockRegistry.EXPOSED_CUT_COPPER_SLAB)
              .put(AnaesiaBlockRegistry.EXPOSED_CUT_COPPER_SLAB, AnaesiaBlockRegistry.WEATHERED_CUT_COPPER_SLAB)
              .put(AnaesiaBlockRegistry.WEATHERED_CUT_COPPER_SLAB, AnaesiaBlockRegistry.OXIDIZED_CUT_COPPER_SLAB)
              .put(AnaesiaBlockRegistry.CUT_COPPER_STAIRS, AnaesiaBlockRegistry.EXPOSED_CUT_COPPER_STAIRS)
              .put(AnaesiaBlockRegistry.EXPOSED_CUT_COPPER_STAIRS, AnaesiaBlockRegistry.WEATHERED_CUT_COPPER_STAIRS)
              .put(AnaesiaBlockRegistry.WEATHERED_CUT_COPPER_STAIRS, AnaesiaBlockRegistry.OXIDIZED_CUT_COPPER_STAIRS).build();
   });
   Supplier<BiMap<Block, Block>> OXIDATION_LEVEL_DECREASES = Suppliers.memoize(() -> {
      return ((BiMap)OXIDATION_LEVEL_INCREASES.get()).inverse();
   });

   static Optional<Block> getDecreasedOxidationBlock(Block block) {
      return Optional.ofNullable((Block)((BiMap)OXIDATION_LEVEL_DECREASES).get(block));
   }

   static Block getUnaffectedOxidationBlock(Block block) {
      Block block2 = block;

      for(Block block3 = (Block)((BiMap)OXIDATION_LEVEL_DECREASES).get(block);
          block3 != null; block3 = (Block)((BiMap)OXIDATION_LEVEL_DECREASES).get(block3)) {
         block2 = block3;
      }

      return block2;
   }

   static Optional<BlockState> getDecreasedOxidationState(BlockState state) {
      return getDecreasedOxidationBlock(state.getBlock()).map((block) -> {
         return block.getStateWithProperties(state);
      });
   }

   static Optional<Block> getIncreasedOxidationBlock(Block block) {
      return Optional.ofNullable((Block)((BiMap)OXIDATION_LEVEL_INCREASES).get(block));
   }

   static BlockState getUnaffectedOxidationState(BlockState state) {
      return getUnaffectedOxidationBlock(state.getBlock()).getStateWithProperties(state);
   }

   default Optional<BlockState> getDegradationResult(BlockState state) {
      return getIncreasedOxidationBlock(state.getBlock()).map((block) -> {
         return block.getStateWithProperties(state);
      });
   }

   default float getDegradationChanceMultiplier() {
      return this.getDegradationLevel() == OxidizationLevel.UNAFFECTED ? 0.75F : 1.0F;
   }

   enum OxidizationLevel {
      UNAFFECTED,
      EXPOSED,
      WEATHERED,
      OXIDIZED
   }
}
