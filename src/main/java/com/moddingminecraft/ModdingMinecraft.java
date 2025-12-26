package com.moddingminecraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.moddingminecraft.init.ModCreativeTabs;
import com.moddingminecraft.effect.ArmorEffects;
import com.moddingminecraft.registry.BlockRegistry;
import com.moddingminecraft.registry.ItemRegistry;
import com.moddingminecraft.world.WorldGeneration;

public class ModdingMinecraft implements ModInitializer {

    public static final String MOD_ID = "moddingminecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        BlockRegistry.registerAll();
        ItemRegistry.registerAll();
        WorldGeneration.register();
        ModCreativeTabs.register();
        ArmorEffects.initialize();
        
        LOGGER.info("ModdingMinecraft initialized successfully");
    }
}
