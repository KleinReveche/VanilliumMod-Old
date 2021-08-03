package com.klr2003.vanillium.blocks;


import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.InfestedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

public class InfestedRotatedPillarBlock extends InfestedBlock {
    public InfestedRotatedPillarBlock(Block block, Properties properties) {
        super(block, properties);
        this.registerDefaultState(this.defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y));
    }

    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return RotatedPillarBlock.rotatePillar(blockState, rotation);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(RotatedPillarBlock.AXIS);
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return this.defaultBlockState().setValue(RotatedPillarBlock.AXIS, blockPlaceContext.getClickedFace().getAxis());
    }
}