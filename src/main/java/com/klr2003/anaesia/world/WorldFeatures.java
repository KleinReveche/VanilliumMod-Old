package com.klr2003.anaesia.world;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import net.minecraft.util.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.FeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;

public class WorldFeatures {
  protected static final BlockState OAK_LOG = Blocks.OAK_LOG.defaultBlockState();
  
  protected static final BlockState AZALEA_LEAVES = AnaesiaBlocks.AZALEA_LEAVES.defaultBlockState();
  
  protected static final BlockState FLOWERING_AZALEA_LEAVES = AnaesiaBlocks.FLOWERING_AZALEA_LEAVES.defaultBlockState();
  
  public static final ConfiguredFeature<TreeConfiguration, ?> AZALEA_TREE = Feature.TREE
    .configured((FeatureConfiguration)(new TreeConfiguration.TreeConfigurationBuilder((BlockStateProvider)new SimpleStateProvider(OAK_LOG), (BlockStateProvider)new SimpleStateProvider(AZALEA_LEAVES), (FoliagePlacer)new BlobFoliagePlacer(
          
          UniformInt.fixed(2), UniformInt.fixed(0), 3), (TrunkPlacer)new StraightTrunkPlacer(4, 2, 0), (FeatureSize)new TwoLayersFeatureSize(1, 0, 1)))
      .ignoreVines().build());
  
  public static final ConfiguredFeature<TreeConfiguration, ?> FLOWERING_AZALEA_TREES = Feature.TREE
    .configured((FeatureConfiguration)(new TreeConfiguration.TreeConfigurationBuilder((BlockStateProvider)new SimpleStateProvider(OAK_LOG), (BlockStateProvider)new SimpleStateProvider(FLOWERING_AZALEA_LEAVES), (FoliagePlacer)new BlobFoliagePlacer(
          
          UniformInt.fixed(2), UniformInt.fixed(0), 3), (TrunkPlacer)new StraightTrunkPlacer(4, 2, 0), (FeatureSize)new TwoLayersFeatureSize(1, 0, 1)))
      .ignoreVines().build());
  
  public static void registerWorldFeatures() {}
}
