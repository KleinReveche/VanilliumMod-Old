package com.klr2003.anaesia.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TintedGlassBlock extends AbstractGlassBlock {
    public TintedGlassBlock(Properties properties) {
        super(properties);
    }

    public boolean propagatesSkylightDown(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }

    public int getLightBlock(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return 255;
    }

}
