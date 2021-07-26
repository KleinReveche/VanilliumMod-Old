package com.klr2003.anaesia;

import com.klr2003.anaesia.blocks.AnaesiaBlocks;
import com.klr2003.anaesia.utils.ConfigHandler;
import com.klr2003.anaesia.utils.ConfigList;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class AnaesiaClientMod implements ClientModInitializer {
    public void onInitializeClient() {
        if (ConfigHandler.readConfigBoolean(ConfigList.isBackportEnabled)) {
            BlockRenderLayerMap.INSTANCE.putBlock(AnaesiaBlocks.TINTED_GLASS, RenderType.translucent());
            BlockRenderLayerMap.INSTANCE.putBlock(AnaesiaBlocks.AZALEA, RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(AnaesiaBlocks.FLOWERING_AZALEA, RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(AnaesiaBlocks.POTTED_AZALEA_BUSH, RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(AnaesiaBlocks.POTTED_FLOWERING_AZALEA_BUSH, RenderType.cutout());
        }
    }
}
