package com.klr2003.anaesia.patches.slime;

import java.util.Random;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Slime.class})
public class SlimePatchMixin {
  @Inject(method = {"canSpawn"}, at = {@At("RETURN")}, cancellable = true)
  private static void canSpawn(EntityType<Slime> type, LevelAccessor world, MobSpawnType spawnReason, BlockPos pos, Random random, CallbackInfoReturnable<Boolean> info) {
    if (world instanceof ServerLevel) {
      ServerLevel serverworld = (ServerLevel)world;
      if (serverworld.getServer().getWorldData().worldGenSettings().isFlatWorld())
        info.setReturnValue(Boolean.valueOf(false)); 
    } 
  }
}
