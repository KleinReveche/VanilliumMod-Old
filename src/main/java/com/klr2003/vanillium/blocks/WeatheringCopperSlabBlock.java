package com.klr2003.vanillium.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class WeatheringCopperSlabBlock extends SlabBlock implements WeatheringCopper {
   private final WeatheringCopper.WeatherState weatherState;

   public WeatheringCopperSlabBlock(WeatheringCopper.WeatherState weatherState, Properties properties) {
      super(properties);
      this.weatherState = weatherState;
   }

   public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, Random random) {
      this.onRandomTick(blockState, serverLevel, blockPos, random);
   }

   public boolean isRandomlyTicking(BlockState blockState) {
      return WeatheringCopper.getNext(blockState.getBlock()).isPresent();
   }

   public WeatheringCopper.WeatherState getAge() {
      return this.weatherState;
   }
}
