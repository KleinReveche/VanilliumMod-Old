package com.klr2003.vanillium.patches;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin({CropBlock.class})
public class EnhancedIceMixin {
    @Inject(method = {"randomTick"}, at = {@At("HEAD")}, cancellable = true)
    private void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random, CallbackInfo ci) {
        Block block = world.getBlockState(pos.below(2)).getBlock();
        if (block.equals(Blocks.PACKED_ICE) || block.equals(Blocks.BLUE_ICE))
            ci.cancel();
    }
}
