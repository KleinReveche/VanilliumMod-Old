package com.klr2003.vanillium.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.klr2003.vanillium.utils.UtilHandler;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public interface WeatheringCopper extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {
   Supplier<ImmutableBiMap<Block, Block>> NEXT_BY_BLOCK =
           Suppliers.memoize(() -> {
              ImmutableBiMap.Builder<Block, Block> builder = new ImmutableBiMap.Builder<>();
              builder.put(VanilliumBlocks.COPPER_BLOCK, VanilliumBlocks.EXPOSED_COPPER);
              builder.put(VanilliumBlocks.EXPOSED_COPPER, VanilliumBlocks.WEATHERED_COPPER);
              builder.put(VanilliumBlocks.WEATHERED_COPPER, VanilliumBlocks.OXIDIZED_COPPER);
              builder.put(VanilliumBlocks.CUT_COPPER, VanilliumBlocks.EXPOSED_CUT_COPPER);
              builder.put(VanilliumBlocks.EXPOSED_CUT_COPPER, VanilliumBlocks.WEATHERED_CUT_COPPER);
              builder.put(VanilliumBlocks.WEATHERED_CUT_COPPER, VanilliumBlocks.OXIDIZED_CUT_COPPER);
              builder.put(VanilliumBlocks.CUT_COPPER_SLAB, VanilliumBlocks.EXPOSED_CUT_COPPER_SLAB);
              builder.put(VanilliumBlocks.EXPOSED_CUT_COPPER_SLAB, VanilliumBlocks.WEATHERED_CUT_COPPER_SLAB);
              builder.put(VanilliumBlocks.WEATHERED_CUT_COPPER_SLAB, VanilliumBlocks.OXIDIZED_CUT_COPPER_SLAB);
              builder.put(VanilliumBlocks.CUT_COPPER_STAIRS, VanilliumBlocks.EXPOSED_CUT_COPPER_STAIRS);
              builder.put(VanilliumBlocks.EXPOSED_CUT_COPPER_STAIRS, VanilliumBlocks.WEATHERED_CUT_COPPER_STAIRS);
              builder.put(VanilliumBlocks.WEATHERED_CUT_COPPER_STAIRS, VanilliumBlocks.OXIDIZED_CUT_COPPER_STAIRS);
              return builder.build();
           });
   Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(NEXT_BY_BLOCK::get);

   static Optional<Block> getPrevious(Block block) {
      return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(block));
   }

   static Block getFirst(Block block) {
      Block block2 = block;

      for(Block block3 = PREVIOUS_BY_BLOCK.get().get(block); block3 != null; block3 = PREVIOUS_BY_BLOCK.get().get(block3)) {
         block2 = block3;
      }

      return block2;
   }

   static Optional<BlockState> getPrevious(BlockState blockState) {
      return getPrevious(blockState.getBlock()).map((block) -> UtilHandler.withPropertiesOf(block.defaultBlockState().getBlock(), blockState));
   }

   static Optional<Block> getNext(Block block) {
      return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
   }

   static BlockState getFirst(BlockState blockState) {
      return UtilHandler.withPropertiesOf(blockState.getBlock(), blockState);
   }

   default Optional<BlockState> getNext(BlockState blockState) {
      return getNext(blockState.getBlock()).map((block) -> UtilHandler.withPropertiesOf(block.defaultBlockState().getBlock(), blockState));
   }

   default float getChanceModifier() {
      return this.getAge() == WeatherState.UNAFFECTED ? 0.75F : 1.0F;
   }

   enum WeatherState {
      UNAFFECTED,
      EXPOSED,
      WEATHERED,
      OXIDIZED
   }
}
