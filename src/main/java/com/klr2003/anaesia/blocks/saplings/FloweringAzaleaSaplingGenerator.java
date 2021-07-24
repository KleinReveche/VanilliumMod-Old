package com.klr2003.anaesia.blocks.saplings;

import com.klr2003.anaesia.world.WorldFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class FloweringAzaleaSaplingGenerator extends SaplingGenerator {

   @Nullable
   @Override
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bees) {
      return WorldFeatures.FLOWERING_AZALEA_TREES;
   }
}
