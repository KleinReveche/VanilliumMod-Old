package com.klr2003.vanillium.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public abstract class AbstractCandleBlock extends Block {
  protected AbstractCandleBlock(Properties settings) {
    super(settings);
  }
  
  public void onProjectileHit(Level world, BlockState state, BlockHitResult hit, Projectile projectile) {
    if (!world.isClientSide && projectile.isOnFire() && !state.getValue(LIT))
      setLit(world, state, hit.getBlockPos(), true);
  }
  
  @Environment(EnvType.CLIENT)
  public void animateTick(BlockState state, Level world, BlockPos pos, Random random) {
    if (state.getValue(LIT))
      getParticleOffsets(state).forEach(offset -> spawnCandleParticles(world, offset.add(pos.getX(), pos.getY(), pos.getZ()), random)); 
  }
  
  @Environment(EnvType.CLIENT)
  private static void spawnCandleParticles(Level world, Vec3 vec3d, Random random) {
    float f = random.nextFloat();
    if (f < 0.3F) {
      world.addParticle(ParticleTypes.SMOKE, vec3d.x, vec3d.y, vec3d.z, 0.0D, 0.0D, 0.0D);
    }
    world.addParticle(ParticleTypes.FLAME, vec3d.x, vec3d.y, vec3d.z, 0.0D, 0.0D, 0.0D);
  }
  
  protected static void extinguish(@Nullable Player player, BlockState state, LevelAccessor world, BlockPos pos) {
    setLit(world, state, pos, false);
    world.addParticle(ParticleTypes.SMOKE, pos.getX(), pos.getY(), pos.getZ(), 0.0D, 0.10000000149011612D, 0.0D);
    world.playSound(null, pos, SoundEvents.GENERIC_BURN, SoundSource.BLOCKS, 0.5F, 1.0F);
  }
  
  protected static void light(LevelAccessor world, BlockState state, BlockPos pos) {
    if (!world.isClientSide() && !(state.getValue(LIT)))
      setLit(world, state, pos, true); 
  }
  
  private static void setLit(LevelAccessor world, BlockState state, BlockPos pos, boolean lit) {
    world.setBlock(pos, state.setValue(LIT, lit), 11);
  }
  
  public static final BooleanProperty LIT = BlockStateProperties.LIT;
  
  @Environment(EnvType.CLIENT)
  protected abstract Iterable<Vec3> getParticleOffsets(BlockState paramBlockState);
}
