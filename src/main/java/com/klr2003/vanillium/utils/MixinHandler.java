package com.klr2003.vanillium.utils;

import com.klr2003.vanillium.VanilliumMod;
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
        if (mixinClassName.equals("com.klr2003.vanillium.behaviour.items.CandleCakeMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isBackportEnabled)) {
            MessageHandler.infoMessage("Sweetifying the Cake Experience with Candles..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.behaviour.items.HoneycombMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isBackportEnabled)) {
            MessageHandler.infoMessage("Sweetening the Honeycombs..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.EnhancedTotemMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedTotemEnabled)) {
            MessageHandler.infoMessage("Enhancing the Pillager's Totems of Undying..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.SweetBerryBushBlockMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedBerriesEnabled)) {
            MessageHandler.infoMessage("Fertilizing the Local Berries..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.FirePatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedBurningEnabled)) {
            MessageHandler.infoMessage("Making Mobs fear your Flint 'n Steel..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.unpatches.ProtectionUnpatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isProtectionUnpatchEnabled)) {
            MessageHandler.infoMessage("Removing Protection Restrictions..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.unpatches.FishingUnpatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isFishingUnpatchEnabled)) {
            MessageHandler.infoMessage("Returning Fishing to its old roots..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.unpatches.EntityTypeMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isWitherRosesUnpatchEnabled)) {
            MessageHandler.infoMessage("Reinvigorating Wither Roses..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.SlimePatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isSlimeSuperFlatPatchEnabled)) {
            MessageHandler.infoMessage("Removing Slimes from Flat Worlds..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.InfinityPatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isInfinityPatchEnabled)) {
            MessageHandler.infoMessage("Allowing Bows with Infinity and Mending..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.DamageEnchantmentPatchMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isDamageEnchantsPatchEnabled)) {
            MessageHandler.infoMessage("Monsters Beware! Preparing the Ultimate Damage..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.MerchantOfferMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isInfiniteVillagerTradingEnabled)) {
            MessageHandler.infoMessage("Enhancing Villagers' Productivity by 1000%..");
            return true;
        }
        if (mixinClassName.equals("com.klr2003.vanillium.patches.EnhancedIceMixin") &&
                ConfigHandler.readConfigBoolean(ConfigList.isEnhancedIceEnabled)) {
            MessageHandler.infoMessage("Enhancing your Icy Experience..");
            return true;
        }
        if (mixinClassName.contains("com.klr2003.vanillium.unpatches.zerotick") &&
                ConfigHandler.readConfigBoolean(ConfigList.isZeroTickUnpatchEnabled)) {
            if (!this.sentZeroTickMessage) {
                this.sentZeroTickMessage = true;
                MessageHandler.infoMessage("Reintroducing the Zero Tick Bug..");
            }
            if (mixinClassName.equals("com.klr2003.vanillium.unpatches.ZeroTickAbstractPlantPartBlock"))
                return true;
            return mixinClassName.equals("com.klr2003.vanillium.unpatches.ZeroTickAbstractPlantStemBlock");
        }
        return false;
    }

    public void onLoad(String mixinPackage) {
        if (!this.initMessage) {
            MessageHandler.infoMessage("Starting Anaesia Mod " + VanilliumMod.VERSION);
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
