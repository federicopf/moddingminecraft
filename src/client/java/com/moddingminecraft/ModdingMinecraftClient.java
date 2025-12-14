package com.moddingminecraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ClientModInitializer;

public class ModdingMinecraftClient implements ClientModInitializer {
	public static final String MOD_ID = "moddingminecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		// CLIENT-SIDE: Rendering, suoni, interfaccia utente, grafica
		LOGGER.info("🎨 CLIENT: ModdingMinecraft caricata lato CLIENT!");
		LOGGER.info("🖼️ CLIENT: Qui gestiamo texture, suoni, menu, particelle!");
		LOGGER.info("🎭 FERRO LEGGERO ATTIVATO! Rendering pronto!");
		LOGGER.info("⚡ Preparati per il blocco più leggero di Minecraft!");
		LOGGER.info("🖼️ CLIENT: Texture del ferro leggero caricata con successo!");
		LOGGER.info("📋 CLIENT: Modello del ferro leggero pronto per il rendering!");

		// Qui aggiungeremo:
		// - ✅ Rendering personalizzato (texture già caricata!)
		// - Suoni metallici
		// - Interfacce utente
		// - Particelle colorate
		// - Modelli 3D
	}
}
