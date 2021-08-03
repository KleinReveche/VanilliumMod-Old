package com.klr2003.vanillium;

import com.klr2003.vanillium.blocks.VanilliumBlocks;
import com.klr2003.vanillium.utils.ConfigHandler;
import com.klr2003.vanillium.utils.ConfigList;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class VanilliumClientMod implements ClientModInitializer {
    public void onInitializeClient() {
        if (ConfigHandler.readConfigBoolean(ConfigList.isBackportEnabled)) {
            renderTranslucentBlock(VanilliumBlocks.TINTED_GLASS);

            renderTransparentBlock(VanilliumBlocks.AZALEA);
            renderTransparentBlock(VanilliumBlocks.FLOWERING_AZALEA);
            renderTransparentBlock(VanilliumBlocks.POTTED_AZALEA_BUSH);
            renderTransparentBlock(VanilliumBlocks.POTTED_FLOWERING_AZALEA_BUSH);

            renderTransparentBlock(VanilliumBlocks.CANDLE);
            renderTransparentBlock(VanilliumBlocks.WHITE_CANDLE);
            renderTransparentBlock(VanilliumBlocks.ORANGE_CANDLE);
            renderTransparentBlock(VanilliumBlocks.MAGENTA_CANDLE);
            renderTransparentBlock(VanilliumBlocks.LIGHT_BLUE_CANDLE);
            renderTransparentBlock(VanilliumBlocks.YELLOW_CANDLE);
            renderTransparentBlock(VanilliumBlocks.LIGHT_GRAY_CANDLE);
            renderTransparentBlock(VanilliumBlocks.CYAN_CANDLE);
            renderTransparentBlock(VanilliumBlocks.PURPLE_CANDLE);
            renderTransparentBlock(VanilliumBlocks.BLUE_CANDLE);
            renderTransparentBlock(VanilliumBlocks.BROWN_CANDLE);
            renderTransparentBlock(VanilliumBlocks.GREEN_CANDLE);
            renderTransparentBlock(VanilliumBlocks.RED_CANDLE);
            renderTransparentBlock(VanilliumBlocks.BLACK_CANDLE);
            renderTransparentBlock(VanilliumBlocks.CANDLE_CAKE);

            renderTransparentBlock(VanilliumBlocks.WHITE_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.ORANGE_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.MAGENTA_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.LIGHT_BLUE_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.YELLOW_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.LIGHT_GRAY_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.CYAN_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.PURPLE_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.BLUE_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.BROWN_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.GREEN_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.RED_CANDLE_CAKE);
            renderTransparentBlock(VanilliumBlocks.BLACK_CANDLE_CAKE);

        }
    }

    private static void renderTransparentBlock(Block block){
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());

    }

    private static void renderTranslucentBlock(Block block){
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent());
    }
}
