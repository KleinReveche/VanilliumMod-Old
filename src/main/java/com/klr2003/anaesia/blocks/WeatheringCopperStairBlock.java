package com.klr2003.anaesia.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class WeatheringCopperStairBlock extends StairBlock implements WeatheringCopper {
   private final WeatheringCopper.WeatherState weatherState;

   public WeatheringCopperStairBlock(WeatheringCopper.WeatherState weatherState, BlockState blockState, Properties properties) {
      super(blockState, properties);
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
