package com.moddingminecraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingMinecraft implements ModInitializer {

    public static final String MOD_ID = "moddingminecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.register();
        LOGGER.info("ModdingMinecraft loaded");
    }
}
