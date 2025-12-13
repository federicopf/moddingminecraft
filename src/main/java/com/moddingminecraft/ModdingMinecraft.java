package com.moddingminecraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingMinecraft implements ModInitializer {

    public static final String MOD_ID = "moddingminecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item STUPID_ITEM = new Item(new Item.Properties());

    @Override
    public void onInitialize() {
        Registry.register(
                BuiltInRegistries.ITEM,
                Identifier.parse(MOD_ID + ":stupid_item"),
                STUPID_ITEM
        );

        LOGGER.info("ModdingMinecraft loaded");
    }
}
