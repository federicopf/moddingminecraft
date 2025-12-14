package com.moddingminecraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingMinecraft implements ModInitializer {

    public static final String MOD_ID = "moddingminecraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block LIGHT_IRON_BLOCK = ModBlocks.LIGHT_IRON_BLOCK;
    public static final Item LIGHT_IRON_ITEM = new BlockItem(LIGHT_IRON_BLOCK, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModBlocks.LIGHT_IRON_BLOCK_ID)));

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.BLOCK, ModBlocks.LIGHT_IRON_BLOCK_ID, LIGHT_IRON_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, ModBlocks.LIGHT_IRON_BLOCK_ID, LIGHT_IRON_ITEM);
        LOGGER.info("ModdingMinecraft loaded");
    }
}
