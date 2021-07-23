package com.klr2003.anaesia.utils;

import com.klr2003.anaesia.AnaesiaMod;

import java.io.*;
import java.util.Properties;

public class ConfigHandler {
    public static String configFileLoc = "./config/" + AnaesiaMod.MOD_ID + ".properties";

    public static Properties config = new Properties();

    public static void initConfig() {

        File f = new File(configFileLoc);
        if(!f.exists()){
            try (OutputStream output = new FileOutputStream(configFileLoc)) {

                // set the properties value
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
                config.put(ConfigList.isDamageEnchantsPatchEnabled, "false");

                // save properties to project root folder
                config.store(output, AnaesiaMod.MOD_NAME + " Mod Configuration");


            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }
    public static boolean readConfigBoolean(String configString){

        try (InputStream input = new FileInputStream(configFileLoc)){

            config.load(input);
            return Boolean.parseBoolean(config.getProperty(configString));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public static String readConfigString(String configString){

        try (InputStream input = new FileInputStream(configFileLoc)){

            config.load(input);
            return config.getProperty(configString);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "Not Found";
    }
}
