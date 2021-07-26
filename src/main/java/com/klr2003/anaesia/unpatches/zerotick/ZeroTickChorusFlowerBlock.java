package com.klr2003.anaesia.unpatches.zerotick;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.ChorusFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin({ChorusFlowerBlock.class})
public class ZeroTickChorusFlowerBlock {
    @Shadow
    public void tick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
    }

    @Inject(at = {@At("TAIL")}, method = {"tick"})
    public void tick(BlockState state, ServerLevel world, BlockPos pos, Random random, CallbackInfo info) {
        if (!world.isEmptyBlock(pos.below()))
            tick(state, world, pos, random);
    }
}
