package com.klr2003.anaesia.unpatches.fishing;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.projectile.FishingHook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({FishingHook.class})
public class FishingUnpatchMixin {
  @Inject(method = {"isOpenOrWaterAround"}, cancellable = true, at = {@At("RETURN")})
  private void isOpenOrWaterAround(BlockPos pos, CallbackInfoReturnable<Boolean> info) {
    info.setReturnValue(Boolean.valueOf(true));
  }
}
