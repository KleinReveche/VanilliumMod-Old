package com.klr2003.vanillium.utils;

import java.io.*;
import java.util.Properties;

public class ConfigHandler {
    public static final String configFileLoc = "./config/vanillium.properties";

    public static final Properties config = new Properties();

    public static void initConfig() {
        File f = new File(configFileLoc);
        if (!f.exists())
            try {
                OutputStream output = new FileOutputStream(configFileLoc);
                try {
                    config.put(ConfigList.isSlimeSuperFlatPatchEnabled, "true");
                    config.put(ConfigList.isEnhancedBerriesEnabled, "true");
                    config.put(ConfigList.isEnhancedBoneMealEnabled, "true");
                    config.put(ConfigList.isEnhancedBurningEnabled, "true");
                    config.put(ConfigList.isEnhancedIceEnabled, "true");
                    config.put(ConfigList.isEnhancedKelpEnabled, "true");
                    config.put(ConfigList.isEnhancedSeedsEnabled, "true");
                    config.put(ConfigList.isEnhancedTotemEnabled, "true");
                    config.put(ConfigList.isFishingUnpatchEnabled, "true");
                    config.put(ConfigList.isProtectionUnpatchEnabled, "true");
                    config.put(ConfigList.isWitherRosesUnpatchEnabled, "true");
                    config.put(ConfigList.isZeroTickUnpatchEnabled, "true");
                    config.put(ConfigList.isDebugModeEnabled, "false");
                    config.put(ConfigList.configFileVersion, "1");
                    config.put(ConfigList.isInfinityPatchEnabled, "false");
                    config.put(ConfigList.isDamageEnchantsPatchEnabled, "false");
                    config.put(ConfigList.isInfiniteVillagerTradingEnabled, "false");
                    config.put(ConfigList.isBackportEnabled, "true");
                    config.store(output, "Anaesia Mod Configuration");
                    output.close();
                } catch (Throwable throwable) {
                    try {
                        output.close();
                    } catch (Throwable throwable1) {
                        throwable.addSuppressed(throwable1);
                    }
                    throw throwable;
                }
            } catch (IOException io) {
                io.printStackTrace();
            }
    }

    public static boolean readConfigBoolean(String configString) {
        try {
            InputStream input = new FileInputStream(configFileLoc);
            try {
                config.load(input);
                boolean bool = Boolean.parseBoolean(config.getProperty(configString));
                input.close();
                return bool;
            } catch (Throwable throwable) {
                try {
                    input.close();
                } catch (Throwable throwable1) {
                    throwable.addSuppressed(throwable1);
                }
                throw throwable;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static String readConfigString(String configString) {
        try {
            InputStream input = new FileInputStream(configFileLoc);
            try {
                config.load(input);
                String str = config.getProperty(configString);
                input.close();
                return str;
            } catch (Throwable throwable) {
                try {
                    input.close();
                } catch (Throwable throwable1) {
                    throwable.addSuppressed(throwable1);
                }
                throw throwable;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return "Not Found";
        }
    }
}
