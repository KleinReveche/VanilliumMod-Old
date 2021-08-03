package com.klr2003.vanillium.utils;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.Iterator;

public class UtilHandler {

    public static final IntegerProperty CANDLES = IntegerProperty.create("candles", 1, 4);

    public static int getXpDifference(Player player, int from, int to) {
        int currentLevel = player.experienceLevel;
        int xpSum = 0;
        for (int l = from; l < to; l++) {
            player.experienceLevel = l;
            xpSum += player.getXpNeededForNextLevel();
        }
        player.experienceLevel = currentLevel;
        return xpSum;
    }

    public static BlockState withPropertiesOf(Block block, BlockState blockState) {
        BlockState blockState2 = block.defaultBlockState();
        Iterator<Property<?>> var3 = blockState.getBlock().getStateDefinition().getProperties().iterator();

        while(var3.hasNext()) {
            Property<?> property = var3.next();
            if (blockState2.hasProperty(property)) {
                blockState2 = copyProperty(blockState, blockState2, property);
            }
        }

        return blockState2;
    }
    private static <T extends Comparable<T>> BlockState copyProperty(BlockState blockState, BlockState blockState2, Property<T> property) {
        return blockState2.setValue(property, blockState.getValue(property));
    }

}
