package com.klr2003.vanillium.unpatches;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.GrowingPlantBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin({GrowingPlantBlock.class})
public abstract class ZeroTickAbstractPlantPartBlock extends BlockBehaviour {
    public ZeroTickAbstractPlantPartBlock(BlockBehaviour.Properties settings) {
        super(settings);
    }

    @Inject(at = {@At("TAIL")},
            method = {"tick(Lnet/minecraft/world/level/block/state/BlockState;" +
                    "Lnet/minecraft/server/level/ServerLevel;" +
                    "Lnet/minecraft/core/BlockPos;Ljava/util/Random;)V"})
    public void scheduledTick(BlockState state, ServerLevel world, BlockPos pos, Random random, CallbackInfo info) {
        if (!state.canSurvive(world, pos)) {
            world.destroyBlock(pos, true);
            return;
        }
        if (!world.isEmptyBlock(pos.below()))
            randomTick(state, world, pos, random);
    }
}
