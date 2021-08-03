package com.klr2003.vanillium.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MessageHandler {
    private static final Logger LOGGER = LogManager.getLogger("Vanillium");

    public static void infoMessage(String message) {
        LOGGER.info(message);
    }

    public static void warningMessage(String warningMessage) {
        LOGGER.info(warningMessage);
    }

    public static void errorMessage(String errorMessage) {
        LOGGER.info(errorMessage);
    }
}
