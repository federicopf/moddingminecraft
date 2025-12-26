package com.moddingminecraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.moddingminecraft.registry.ItemRegistry;
import com.moddingminecraft.ModCreativeTabs;
import com.moddingminecraft.ModArmorEffects;

public class ModdingMinecraft implements ModInitializer {

    public static final String MOD_ID = "moddingminecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ItemRegistry.registerAll();
        ModWorldGen.register();
        // Registra la creative tab DOPO gli item per assicurarsi che gli armor siano disponibili
        ModCreativeTabs.register();
        // Inizializza il sistema degli effetti armor
        ModArmorEffects.initialize();
        LOGGER.info("ModdingMinecraft loaded");
    }
}
