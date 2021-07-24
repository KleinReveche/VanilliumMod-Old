package com.klr2003.anaesia.world;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class WorldFeatures {

    protected static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
    protected static final BlockState AZALEA_LEAVES = AnaesiaBlocks.AZALEA_LEAVES.getDefaultState();
    protected static final BlockState FLOWERING_AZALEA_LEAVES = AnaesiaBlocks.FLOWERING_AZALEA_LEAVES.getDefaultState();

    public static final ConfiguredFeature<TreeFeatureConfig, ?> AZALEA_TREE =
            Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG),
                    new SimpleBlockStateProvider(AZALEA_LEAVES),
                    new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());

    public static final ConfiguredFeature<TreeFeatureConfig, ?> FLOWERING_AZALEA_TREES =
            Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG),
                    new SimpleBlockStateProvider(FLOWERING_AZALEA_LEAVES),
                    new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3),
                    new StraightTrunkPlacer(4, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());
    ;

    public static void registerWorldFeatures(){

    }

}
