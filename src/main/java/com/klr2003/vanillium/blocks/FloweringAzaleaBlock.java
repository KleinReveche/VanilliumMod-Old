package com.klr2003.vanillium.blocks;


import com.klr2003.vanillium.blocks.saplings.FloweringAzaleaTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class FloweringAzaleaBlock extends BushBlock implements BonemealableBlock {
    private static final FloweringAzaleaTreeGrower TREE_GROWER = new FloweringAzaleaTreeGrower();
    private static final VoxelShape SHAPE = Shapes.or(Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 8.0D, 10.0D));

    protected FloweringAzaleaBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockState.is(Blocks.CLAY) || super.mayPlaceOn(blockState, blockGetter, blockPos);
    }

    public boolean isValidBonemealTarget(BlockGetter blockGetter, BlockPos blockPos, BlockState blockState, boolean bl) {
        return blockGetter.getFluidState(blockPos.above()).isEmpty();
    }

    public boolean isBonemealSuccess(Level level, Random random, BlockPos blockPos, BlockState blockState) {
        return (double) level.random.nextFloat() < 0.45D;
    }

    public void performBonemeal(ServerLevel serverLevel, Random random, BlockPos blockPos, BlockState blockState) {
        TREE_GROWER.growTree(serverLevel, serverLevel.getChunkSource().getGenerator(), blockPos, blockState, random);
    }
}