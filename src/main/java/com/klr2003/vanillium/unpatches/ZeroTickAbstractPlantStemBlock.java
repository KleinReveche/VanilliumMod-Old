package com.klr2003.vanillium.unpatches;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin({GrowingPlantHeadBlock.class})
public class ZeroTickAbstractPlantStemBlock {
    @Shadow
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
    }

    @Inject(at = {@At("TAIL")},
            method = {"randomTick(Lnet/minecraft/world/level/block/state/BlockState;" +
                    "Lnet/minecraft/server/level/ServerLevel;" +
                    "Lnet/minecraft/core/BlockPos;Ljava/util/Random;)V"})
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random, CallbackInfo info) {
        if (!world.isEmptyBlock(pos.below()))
            randomTick(state, world, pos, random);
    }
}
