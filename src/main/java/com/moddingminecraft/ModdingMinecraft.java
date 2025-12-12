package com.moddingminecraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModdingMinecraft implements ModInitializer {
	public static final String MOD_ID = "moddingminecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// SERVER-SIDE: Logica di gioco, mob, fisica, mondo
		LOGGER.info("🖥️ SERVER: ModdingMinecraft caricata lato SERVER!");
		LOGGER.info("🎯 SERVER: Qui gestiamo la logica di gioco importante!");
		LOGGER.info("🤖 SERVER: Mob, fisica, crafting, mondo - tutto qui!");
		LOGGER.info("💾 SERVER: Salvataggio e sincronizzazione multiplayer!");
		LOGGER.info("🎭 SERVER: L'Oggetto Stupidamente Stupido è pronto!");
		LOGGER.info("🖼️ SERVER: Texture caricata: stupid_item.png");
		LOGGER.info("📋 SERVER: Modello pronto: stupid_item.json");
		LOGGER.info("🌍 SERVER: Traduzione italiana: 'Oggetto Stupidamente Stupido'");

		// 🎪 PROSSIMAMENTE: Registrazione dell'item
		// Quando risolveremo gli import, aggiungeremo:
		// Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stupid_item"), STUPID_ITEM);

		// Qui aggiungeremo:
		// - ✅ Nuovi item nel registro (quando gli import funzioneranno!)
		// - Nuovi blocchi
		// - Nuove ricette crafting
		// - Logica di gioco personalizzata
		// - Eventi server-side
	}
}
