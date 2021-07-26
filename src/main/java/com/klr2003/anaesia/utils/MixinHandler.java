package com.klr2003.anaesia.utils;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class MixinHandler implements IMixinConfigPlugin {
    private boolean sentZeroTickMessage = false;

    private boolean initConfig = false;

    private boolean initMessage = false;

    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (mixinClassName.equals("com.klr2003.anaesia.enhancements.totem.EnhancedTotemMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedTotemEnabled)) {
            MessageHandler.infoMessage("Enhancing the Pillager's Totems of Undying..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.enhancements.berries.SweetBerryBushBlockMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedBerriesEnabled)) {
            MessageHandler.infoMessage("Fertilizing the Local Berries..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.enhancements.burning.mixin.FirePatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedBurningEnabled)) {
            MessageHandler.infoMessage("Making Mobs fear your Flint 'n Steel..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.unpatches.protection.ProtectionUnpatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isProtectionUnpatchEnabled)) {
            MessageHandler.infoMessage("Removing Protection Restrictions..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.unpatches.fishing.FishingUnpatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isFishingUnpatchEnabled)) {
            MessageHandler.infoMessage("Returning Fishing to its old roots..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.unpatches.witherrose.EntityTypeMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isWitherRosesUnpatchEnabled)) {
            MessageHandler.infoMessage("Reinvigorating Wither Roses..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.patches.slime.SlimePatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isSlimeSuperFlatPatchEnabled)) {
            MessageHandler.infoMessage("Removing Slimes from Flat Worlds..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.patches.infinity.InfinityPatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isInfinityPatchEnabled)) {
            MessageHandler.infoMessage("Allowing Bows with Infinity and Mending..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.patches.damage.DamageEnchantmentPatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isDamageEnchantsPatchEnabled)) {
            MessageHandler.infoMessage("Monsters Beware! preparing the Ultimate Damage..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.anaesia.enhancements.ice.EnhancedIceMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedIceEnabled)) {
            MessageHandler.infoMessage("Enhancing your Icy Experience..");
            return true;
        }
        if (mixinClassName.contains("com.klr2003.anaesia.unpatches.zerotick") &&
                ConfigHandler.readConfigBoolean(ConfigList.isZeroTickUnpatchEnabled)) {
            if (!this.sentZeroTickMessage) {
                this.sentZeroTickMessage = true;
                MessageHandler.infoMessage("Reintroducing the Zero Tick Bug..");
            }
            if (mixinClassName.equals("com.klr2003.anaesia.unpatches.zerotick.ZeroTickAbstractPlantPartBlock"))
                return true;
            return mixinClassName.equals("com.klr2003.anaesia.unpatches.zerotick.ZeroTickAbstractPlantStemBlock");
        }
        return false;
    }

    public void onLoad(String mixinPackage) {
        if (!this.initMessage) {
            MessageHandler.infoMessage("Starting Anaesia Mod v0.4.0");
            this.initMessage = true;
        }
        if (!this.initConfig) {
            ConfigHandler.initConfig();
            this.initConfig = true;
        }
        if (ConfigHandler.readConfigBoolean(ConfigList.isDebugModeEnabled))
            MessageHandler.infoMessage("Injecting " + mixinPackage);
    }

    public String getRefMapperConfig() {
        return null;
    }

    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
    }

    public List<String> getMixins() {
        return null;
    }

    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }

    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }
}
