package com.moddingminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public class ModdingMinecraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
            entries.accept(ModdingMinecraft.STUPID_ITEM);
        });
    }
}
