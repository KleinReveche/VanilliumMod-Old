package com.klr2003.anaesia.utils;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class MixinHandler implements IMixinConfigPlugin {


    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if(mixinClassName.equals("com.klr2003.anaesia.enhancements.totem.EnhancedTotemMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isEnhancedTotemEnabled)) {
                MessageHandler.infoMessage("Patching EnhancedTotem");
                return true;
            }
        }
        if(mixinClassName.equals("com.klr2003.anaesia.unpatches.protection.ProtectionUnpatchMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isProtectionUnpatchEnabled)) {
                MessageHandler.infoMessage("Unpatching Protection");
                return true;
            }

        }
        if(mixinClassName.equals("com.klr2003.anaesia.patches.slime.SlimePatchMixin")) {
            if(ConfigHandler.readConfigBoolean(ConfigList.isSlimeSuperFlatPatchEnabled)) {
                MessageHandler.infoMessage("Patching Slimes");
                return true;
            }
        }
        return false;
    }

    @Override
    public void onLoad(String mixinPackage) {
        MessageHandler.infoMessage("Injecting " + mixinPackage);
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
