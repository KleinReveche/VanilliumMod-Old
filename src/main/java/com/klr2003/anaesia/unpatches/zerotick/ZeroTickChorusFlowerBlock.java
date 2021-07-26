package com.klr2003.anaesia.unpatches.zerotick;

import java.util.Random;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.ChorusFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ChorusFlowerBlock.class})
public class ZeroTickChorusFlowerBlock {
  @Shadow
  public void method_9514(BlockState state, ServerLevel world, BlockPos pos, Random random) {}
  
  @Inject(at = {@At("TAIL")}, method = {"scheduledTick"})
  public void scheduledTick(BlockState state, ServerLevel world, BlockPos pos, Random random, CallbackInfo info) {
    if (!world.isEmptyBlock(pos.below()))
      method_9514(state, world, pos, random); 
  }
}
