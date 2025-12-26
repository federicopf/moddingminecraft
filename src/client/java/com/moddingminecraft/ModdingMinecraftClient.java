package com.moddingminecraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.api.ClientModInitializer;

public class ModdingMinecraftClient implements ClientModInitializer {
	public static final String MOD_ID = "moddingminecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		// Client-side initialization
	}
}
