package com.moddingminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.ItemGroups;

public class ModdingMinecraftClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		// Usa il logger del mod principale
		ModdingMinecraft.LOGGER.info("🖥️ CLIENT: ModdingMinecraft caricata lato CLIENT!");
		// CLIENT-SIDE: Rendering, suoni, controlli, interfaccia utente
		ModdingMinecraft.LOGGER.info("🎨 CLIENT: Qui gestiamo rendering, texture e suoni!");
		ModdingMinecraft.LOGGER.info("🎮 CLIENT: Controlli personalizzati e interfaccia utente!");
		ModdingMinecraft.LOGGER.info("🎵 CLIENT: Suoni e musica del mod!");

		// Aggiungiamo l'item al gruppo creativo
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.add(ModdingMinecraft.STUPID_ITEM);
		});
	}
}
