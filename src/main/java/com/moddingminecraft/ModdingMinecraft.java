package com.moddingminecraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingMinecraft implements ModInitializer {

    public static final String MOD_ID = "moddingminecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Identifier STUPID_ID = Identifier.parse(MOD_ID + ":stupid_item");
    public static final ResourceKey<Item> STUPID_KEY = ResourceKey.create(Registries.ITEM, STUPID_ID);

    public static final Item STUPID_ITEM = new Item(new Item.Properties().setId(STUPID_KEY));

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.ITEM, STUPID_ID, STUPID_ITEM);
        LOGGER.info("ModdingMinecraft loaded");
    }
}
