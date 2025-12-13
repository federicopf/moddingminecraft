package com.moddingminecraft;

import com.moddingminecraft.item.StupidItem;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingMinecraft implements ModInitializer {
	public static final String MOD_ID = "moddingminecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Registrazione dell'item
	public static final Item STUPID_ITEM = new StupidItem(new Item.Settings());

	@Override
	public void onInitialize() {
		// SERVER-SIDE: Logica di gioco, mob, fisica, mondo
		LOGGER.info("🖥️ SERVER: ModdingMinecraft caricata lato SERVER!");
		LOGGER.info("🎯 SERVER: Qui gestiamo la logica di gioco importante!");
		LOGGER.info("🤖 SERVER: Mob, fisica, crafting, mondo - tutto qui!");
		LOGGER.info("💾 SERVER: Salvataggio e sincronizzazione multiplayer!");

		// Registrazione dell'item
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stupid_item"), STUPID_ITEM);
		LOGGER.info("🎭 SERVER: L'Oggetto Stupidamente Stupido è registrato!");
		LOGGER.info("🖼️ SERVER: Texture caricata: stupid_item.png");
		LOGGER.info("📋 SERVER: Modello pronto: stupid_item.json");
		LOGGER.info("🌍 SERVER: Traduzione italiana: 'Oggetto Stupidamente Stupido'");

		// Qui aggiungeremo:
		// - Nuovi blocchi
		// - Nuove ricette crafting
		// - Logica di gioco personalizzata
		// - Eventi server-side
	}
}
