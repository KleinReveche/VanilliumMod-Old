package com.klr2003.anaesia.utils;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

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
}
