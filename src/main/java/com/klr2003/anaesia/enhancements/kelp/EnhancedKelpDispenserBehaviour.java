package com.klr2003.anaesia.enhancements.kelp;

import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.Collections;
import java.util.Iterator;

public class EnhancedKelpDispenserBehaviour extends OptionalDispenseItemBehavior {
    public EnhancedKelpDispenserBehaviour() {
        DispenserBlock.registerBehavior(Items.KELP, this);
    }

    protected ItemStack execute(BlockSource block, ItemStack stack) {
        setSuccess(true);
        ServerLevel world = block.getLevel();
        BlockPos blockPos = block.getPos().relative(block.getBlockState().getValue(DispenserBlock.FACING));
        if (BoneMealItem.growCrop(stack, world, blockPos) || BoneMealItem.growWaterPlant(stack, world, blockPos, null)) {
            world.levelEvent(2005, blockPos, 0);
        } else {
            BlockState blockState = world.getBlockState(blockPos);
            Block currentBlock = blockState.getBlock();
            if (currentBlock.equals(Blocks.SUGAR_CANE) || currentBlock.equals(Blocks.CACTUS)) {
                for (int y = blockPos.getY(); y <= 256; y++) {
                    BlockPos upperPos = new BlockPos(blockPos.getX(), y, blockPos.getZ());
                    Block upperBlock = world.getBlockState(upperPos).getBlock();
                    if (upperBlock.equals(Blocks.AIR)) {
                        world.setBlockAndUpdate(upperPos, blockState.getBlock().defaultBlockState());
                        world.levelEvent(2005, upperPos, 0);
                        world.levelEvent(2005, upperPos.above(), 0);
                        stack.shrink(1);
                        break;
                    }
                }
            } else if (blockState.getBlock().equals(Blocks.VINE)) {
                for (int y = blockPos.getY(); y > 0; y--) {
                    BlockPos downPos = new BlockPos(blockPos.getX(), y, blockPos.getZ());
                    Block downBlock = world.getBlockState(downPos).getBlock();
                    if (downBlock.equals(Blocks.AIR)) {
                        world.setBlockAndUpdate(downPos, blockState.getBlock().defaultBlockState());
                        world.levelEvent(2005, downPos, 0);
                        world.levelEvent(2005, downPos.below(), 0);
                        stack.shrink(1);
                        break;
                    }
                }
            } else if (blockState.getBlock().equals(Blocks.NETHER_WART)) {
                Iterator<Property<?>> itp = Collections.unmodifiableCollection(blockState.getProperties()).iterator();
                while (itp.hasNext()) {
                    Property<?> property = itp.next();
                    if (property instanceof IntegerProperty) {
                        IntegerProperty prop = (IntegerProperty) property;
                        String name = prop.getName();
                        if (name.equals("age")) {
                            Comparable<?> cv = blockState.getValue(property);
                            int value = Integer.parseUnsignedInt(cv.toString());
                            int max = Collections.max(prop.getPossibleValues());
                            if (value == max)
                                break;
                            world.setBlockAndUpdate(blockPos, world.getBlockState(blockPos).cycle(property));
                            world.levelEvent(2005, blockPos, 0);
                            stack.shrink(1);
                            break;
                        }
                    }
                }
            } else {
                setSuccess(false);
            }
        }
        return stack;
    }
}
