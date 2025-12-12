package com.moddingminecraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ClientModInitializer;

public class ModdingMinecraftClient implements ClientModInitializer {
	public static final String MOD_ID = "moddingminecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		LOGGER.info("🎨 MOD STUPIDA CARICATA! Solo lato client - niente server!");
		LOGGER.info("🎭 OGGETTO STUPIDO ATTIVATO! La tua mod ModdingMinecraft è caricata!");
		LOGGER.info("🤪 Preparati per l'oggetto più stupido di Minecraft!");
		LOGGER.info("💡 Questo oggetto non fa niente... ma è STUPIDO!");
		LOGGER.info("🎪 Benvenuto nel mondo delle mod stupide!");

		// 🤪 Qui ci sarà il nostro oggetto stupido!
		// Per ora è solo un commento, ma presto sarà realtà!
	}
}
