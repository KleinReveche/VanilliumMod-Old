package com.klr2003.anaesia.enhancements.berries;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({SweetBerryBushBlock.class})
public abstract class SweetBerryBushBlockMixin extends BushBlock {
  protected SweetBerryBushBlockMixin(BlockBehaviour.Properties settings) {
    super(settings);
  }
  
  @Inject(method = {"onEntityCollision"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/entity/damage/DamageSource;F)Z")}, cancellable = true)
  private void onEntityCollision(BlockState state, Level world, BlockPos pos, Entity entity, CallbackInfo info) {
    if (entity instanceof ServerPlayer) {
      ServerPlayer player = (ServerPlayer)entity;
      if (!player.getItemBySlot(EquipmentSlot.FEET).isEmpty() && !player.getItemBySlot(EquipmentSlot.LEGS).isEmpty())
        info.cancel(); 
    } 
    if (entity.isShiftKeyDown())
      info.cancel(); 
  }
}
