package com.klr2003.anaesia.patches.damage;

import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({DamageEnchantment.class})
public class DamageEnchantmentPatchMixin {
  @Inject(at = {@At("HEAD")}, method = {"canAccept"}, cancellable = true)
  private void canAccept(Enchantment other, CallbackInfoReturnable<Boolean> info) {
    info.setReturnValue(Boolean.valueOf(true));
  }
}
