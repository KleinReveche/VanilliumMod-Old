package com.klr2003.anaesia;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import com.klr2003.anaesia.utils.ConfigHandler;
import com.klr2003.anaesia.utils.ConfigList;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

public class AnaesiaClientMod implements ClientModInitializer {
    public void onInitializeClient() {
        if (ConfigHandler.readConfigBoolean(ConfigList.isBackportEnabled)) {
            renderTranslucentBlock(AnaesiaBlocks.TINTED_GLASS);

            renderTransparentBlock(AnaesiaBlocks.AZALEA);
            renderTransparentBlock(AnaesiaBlocks.FLOWERING_AZALEA);
            renderTransparentBlock(AnaesiaBlocks.POTTED_AZALEA_BUSH);
            renderTransparentBlock(AnaesiaBlocks.POTTED_FLOWERING_AZALEA_BUSH);

            renderTransparentBlock(AnaesiaBlocks.CANDLE);
            renderTransparentBlock(AnaesiaBlocks.WHITE_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.ORANGE_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.MAGENTA_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.LIGHT_BLUE_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.YELLOW_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.LIGHT_GRAY_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.CYAN_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.PURPLE_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.BLUE_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.BROWN_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.GREEN_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.RED_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.BLACK_CANDLE);
            renderTransparentBlock(AnaesiaBlocks.CANDLE_CAKE);

            renderTransparentBlock(AnaesiaBlocks.WHITE_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.ORANGE_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.MAGENTA_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.LIGHT_BLUE_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.YELLOW_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.LIGHT_GRAY_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.CYAN_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.PURPLE_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.BLUE_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.BROWN_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.GREEN_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.RED_CANDLE_CAKE);
            renderTransparentBlock(AnaesiaBlocks.BLACK_CANDLE_CAKE);

        }
    }

    private static void renderTransparentBlock(Block block){
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());

    }

    private static void renderTranslucentBlock(Block block){
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent());
    }
}
