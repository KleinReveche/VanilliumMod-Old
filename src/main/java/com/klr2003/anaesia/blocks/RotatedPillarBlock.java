package com.klr2003.anaesia.blocks;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class RotatedPillarBlock extends Block {
    public static final EnumProperty<Direction.Axis> AXIS;

    public RotatedPillarBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
    }

    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return rotatePillar(blockState, rotation);
    }

    public static BlockState rotatePillar(BlockState blockState, Rotation rotation) {
        switch (rotation) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch (blockState.getValue(AXIS)) {
                    case X:
                        return blockState.setValue(AXIS, Direction.Axis.Z);
                    case Z:
                        return blockState.setValue(AXIS, Direction.Axis.X);
                    default:
                        return blockState;
                }
            default:
                return blockState;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return this.defaultBlockState().setValue(AXIS, blockPlaceContext.getClickedFace().getAxis());
    }

    static {
        AXIS = BlockStateProperties.AXIS;
    }
}

