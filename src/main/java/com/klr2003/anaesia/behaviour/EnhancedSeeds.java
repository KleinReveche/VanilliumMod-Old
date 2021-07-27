package com.klr2003.anaesia.behaviour;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class EnhancedSeeds implements UseBlockCallback {
    public EnhancedSeeds() {
        UseBlockCallback.EVENT.register(this);
    }

    public InteractionResult interact(Player player, Level world, InteractionHand hand, BlockHitResult block) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getItem().equals(Items.WHEAT_SEEDS)) {
            BlockPos blockPos = block.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);
            Block currentBlock = blockState.getBlock();
            if (currentBlock.equals(Blocks.DIRT)) {
                world.setBlockAndUpdate(blockPos, Blocks.GRASS_BLOCK.defaultBlockState());
                if (!player.isCreative())
                    stack.shrink(1);
                return InteractionResult.SUCCESS;
            }
            if (currentBlock.equals(Blocks.GRASS_BLOCK)) {
                BlockPos upperPos = blockPos.above();
                Block upperBlock = world.getBlockState(upperPos).getBlock();
                if (upperBlock.equals(Blocks.AIR)) {
                    world.setBlockAndUpdate(upperPos, Blocks.GRASS.defaultBlockState());
                    if (!player.isCreative())
                        stack.shrink(1);
                    return InteractionResult.SUCCESS;
                }
                if (upperBlock.equals(Blocks.GRASS) &&
                        upgrade(world, upperPos)) {
                    if (!player.isCreative())
                        stack.shrink(1);
                    return InteractionResult.SUCCESS;
                }
            } else if (currentBlock.equals(Blocks.GRASS) &&
                    upgrade(world, blockPos)) {
                if (!player.isCreative())
                    stack.shrink(1);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    public boolean upgrade(Level world, BlockPos pos) {
        DoublePlantBlock blockDoublePlant = (DoublePlantBlock) Blocks.TALL_GRASS;
        if (world.isEmptyBlock(pos.above())) {
            blockDoublePlant.placeAt(world, pos, 2);
            return true;
        }
        return false;
    }
}
