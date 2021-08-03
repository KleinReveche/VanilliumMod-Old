package com.klr2003.vanillium.blocks;

import java.util.Random;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringCopperFullBlock extends Block implements WeatheringCopper {
   private final WeatheringCopper.WeatherState weatherState;

   public WeatheringCopperFullBlock(WeatheringCopper.WeatherState weatherState, Properties properties) {
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
