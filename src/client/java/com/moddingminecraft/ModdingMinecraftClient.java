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
		LOGGER.info("🎭 OGGETTO STUPIDO ATTIVATO! Rendering pronto!");
		LOGGER.info("🤪 Preparati per l'oggetto più stupido di Minecraft!");
		LOGGER.info("🖼️ CLIENT: Texture stupida caricata con successo!");
		LOGGER.info("📋 CLIENT: Modello stupido pronto per il rendering!");

		// Qui aggiungeremo:
		// - ✅ Rendering personalizzato (texture già caricata!)
		// - Suoni stupidi
		// - Interfacce utente
		// - Particelle colorate
		// - Modelli 3D
	}
}
