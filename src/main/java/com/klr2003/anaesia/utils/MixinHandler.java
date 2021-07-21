package com.klr2003.anaesia.utils;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class MixinHandler implements IMixinConfigPlugin {

    private boolean sentZeroTickMessage = false;
    private boolean initConfig = false;

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if(mixinClassName.equals("com.klr2003.anaesia.enhancements.totem.EnhancedTotemMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedTotemEnabled)) {
                MessageHandler.infoMessage("Enhancing the Pillager's Totems of Undying..");
                return true;
            }
        }
        if(mixinClassName.equals("com.klr2003.anaesia.enhancements.berries.SweetBerryBushBlockMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedBerriesEnabled)) {
                MessageHandler.infoMessage("Fertilizing the Local Berries..");
                return true;
            }
        }
        if(mixinClassName.equals("com.klr2003.anaesia.enhancements.burning.mixin.FirePatchMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedBurningEnabled)){
                MessageHandler.infoMessage("Making Mobs fear your Flint 'n Steel..");
                return true;
            }
        }
        if(mixinClassName.equals("com.klr2003.anaesia.unpatches.protection.ProtectionUnpatchMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isProtectionUnpatchEnabled)) {
                MessageHandler.infoMessage("Removing Protection Restrictions..");
                return true;
            }

        }
        if(mixinClassName.equals("com.klr2003.anaesia.unpatches.fishing.FishingUnpatchMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isFishingUnpatchEnabled)) {
                MessageHandler.infoMessage("Returning Fishing to its old roots..");
                return true;
            }
        }
        if(mixinClassName.equals("com.klr2003.anaesia.unpatches.witherrose.EntityTypeMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isWitherRosesUnpatchEnabled)) {
                MessageHandler.infoMessage("Reinvigorating Wither Roses..");
                return true;
            }
        }
        if(mixinClassName.equals("com.klr2003.anaesia.patches.slime.SlimePatchMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isSlimeSuperFlatPatchEnabled)) {
                MessageHandler.infoMessage("Removing Slimes from Flat Worlds..");
                return true;
            }
        }

        if(mixinClassName.equals("com.klr2003.anaesia.enhancements.ice.EnhancedIceMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedIceEnabled)) {
                MessageHandler.infoMessage("Enhancing your Icy Experience..");
                return true;
            }
        }
        if(mixinClassName.contains("com.klr2003.anaesia.unpatches.zerotick")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isZeroTickUnpatchEnabled)) {
                if(!sentZeroTickMessage) {
                    sentZeroTickMessage = true;
                    MessageHandler.infoMessage("Reintroducing the Zero Tick Bug..");
                }
                if(mixinClassName.equals("com.klr2003.anaesia.unpatches.zerotick.ZeroTickAbstractPlantPartBlock"))
                    return true;
                if(mixinClassName.equals("com.klr2003.anaesia.unpatches.zerotick.ZeroTickAbstractPlantStemBlock"))
                    return true;
            }
        }
        return false;
    }

    @Override
    public void onLoad(String mixinPackage) {
        if(!initConfig) ConfigHandler.initConfig();
        if(ConfigHandler.readConfigBoolean(ConfigList.isDebugModeEnabled)) MessageHandler.infoMessage("Injecting " + mixinPackage);

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }
}
