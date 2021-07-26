package com.klr2003.anaesia.blocks;


import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public interface WeatheringCopper extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize((
            ImmutableBiMap.builder().put(AnaesiaBlocks.COPPER_BLOCK, AnaesiaBlocks.EXPOSED_COPPER)
                .put(AnaesiaBlocks.EXPOSED_COPPER, AnaesiaBlocks.WEATHERED_COPPER)
                .put(AnaesiaBlocks.WEATHERED_COPPER, AnaesiaBlocks.OXIDIZED_COPPER)
                .put(AnaesiaBlocks.CUT_COPPER, AnaesiaBlocks.EXPOSED_CUT_COPPER)
                .put(AnaesiaBlocks.EXPOSED_CUT_COPPER, AnaesiaBlocks.WEATHERED_CUT_COPPER)
                .put(AnaesiaBlocks.WEATHERED_CUT_COPPER, AnaesiaBlocks.OXIDIZED_CUT_COPPER)
                .put(AnaesiaBlocks.CUT_COPPER_SLAB, AnaesiaBlocks.EXPOSED_CUT_COPPER_SLAB)
                .put(AnaesiaBlocks.EXPOSED_CUT_COPPER_SLAB, AnaesiaBlocks.WEATHERED_CUT_COPPER_SLAB)
                .put(AnaesiaBlocks.WEATHERED_CUT_COPPER_SLAB, AnaesiaBlocks.OXIDIZED_CUT_COPPER_SLAB)
                .put(AnaesiaBlocks.CUT_COPPER_STAIRS, AnaesiaBlocks.EXPOSED_CUT_COPPER_STAIRS)
                .put(AnaesiaBlocks.EXPOSED_CUT_COPPER_STAIRS, AnaesiaBlocks.WEATHERED_CUT_COPPER_STAIRS)
                .put(AnaesiaBlocks.WEATHERED_CUT_COPPER_STAIRS, AnaesiaBlocks.OXIDIZED_CUT_COPPER_STAIRS).build());

    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(NEXT_BY_BLOCK::get);

    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable((Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get(block));
    }

    static Block getFirst(Block block) {
        Block block2 = block;

        for(Block block3 = (Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get(block); block3 != null; block3 =
                (Block)((BiMap)PREVIOUS_BY_BLOCK.get()).get(block3)) {
            block2 = block3;
        }

        return block2;
    }

    static Optional<BlockState> getPrevious(BlockState blockState) {
        return getPrevious(blockState.getBlock()).map((block) -> {
            return block.withPropertiesOf(blockState);
        });
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable((Block)((BiMap)NEXT_BY_BLOCK.get()).get(block));
    }

    static BlockState getFirst(BlockState blockState) {
        return getFirst(blockState.getBlock()).withPropertiesOf(blockState);
    }

    default Optional<BlockState> getNext(BlockState blockState) {
        return getNext(blockState.getBlock()).map((block) -> {
            return block.withPropertiesOf(blockState);
        });
    }

    default float getChanceModifier() {
        return this.getAge() == WeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}

