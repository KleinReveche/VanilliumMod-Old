package com.klr2003.anaesia.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class MossBlock extends Block implements BonemealableBlock {
    public MossBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter blockGetter, BlockPos blockPos, BlockState blockState, boolean bl) {
        return blockGetter.getBlockState(blockPos.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(Level level, Random random, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel serverLevel, Random random, BlockPos blockPos, BlockState blockState) {
        //TODO: Moss Block Growing Feature
        //Feature.VEGETATION_PATCH.place(new FeaturePlaceContext(serverLevel, serverLevel.getChunkSource().getGenerator(), random, blockPos.above(), Features.MOSS_PATCH_BONEMEAL.config()));

    }
}
