package com.klr2003.anaesia.unpatches.witherrose;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({EntityType.class})
public class EntityTypeMixin {
  @Redirect(method = {"isInvalidSpawn(Lnet/minecraft/block/BlockState;)Z"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z", ordinal = 2))
  private boolean restoreWitherRoseSpawning(BlockState blockState, Block block) {
    return false;
  }
}
