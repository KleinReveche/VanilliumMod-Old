package com.klr2003.anaesia.blocks.saplings;

import com.klr2003.anaesia.world.WorldFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class FloweringAzaleaTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random random, boolean bl) {
        return WorldFeatures.FLOWERING_AZALEA_TREE;
    }

}
