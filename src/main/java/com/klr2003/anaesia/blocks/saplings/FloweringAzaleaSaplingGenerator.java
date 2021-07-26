package com.klr2003.anaesia.blocks.saplings;

import com.klr2003.anaesia.world.WorldFeatures;
import java.util.Random;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import org.jetbrains.annotations.Nullable;

public class FloweringAzaleaSaplingGenerator extends AbstractTreeGrower {
  @Nullable
  protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random random, boolean bees) {
    return WorldFeatures.FLOWERING_AZALEA_TREES;
  }
}
