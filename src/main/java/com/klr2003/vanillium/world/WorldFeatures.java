package com.klr2003.vanillium.world;

import com.klr2003.vanillium.blocks.VanilliumBlocks;
import net.minecraft.util.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class WorldFeatures {

    protected static final BlockState OAK_LOG = Blocks.OAK_LOG.defaultBlockState();
    protected static final BlockState AZALEA_LEAVES = VanilliumBlocks.AZALEA_LEAVES.defaultBlockState();
    protected static final BlockState FLOWERING_AZALEA_LEAVES = VanilliumBlocks.FLOWERING_AZALEA_LEAVES.defaultBlockState();

    public static final ConfiguredFeature<TreeConfiguration, ?> AZALEA_TREE = Feature.TREE
            .configured((new TreeConfiguration.TreeConfigurationBuilder
                    (new SimpleStateProvider(OAK_LOG), new SimpleStateProvider(AZALEA_LEAVES),
                            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
                            new StraightTrunkPlacer(4, 2, 0),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());


    public static final ConfiguredFeature<TreeConfiguration, ?> FLOWERING_AZALEA_TREE = Feature.TREE
            .configured((new TreeConfiguration.TreeConfigurationBuilder
                    (new SimpleStateProvider(OAK_LOG), new SimpleStateProvider(FLOWERING_AZALEA_LEAVES),
                            new BlobFoliagePlacer(UniformInt.fixed(2), UniformInt.fixed(0), 3),
                            new StraightTrunkPlacer(4, 2, 0),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());


}
