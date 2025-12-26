package com.moddingminecraft.world;

import com.moddingminecraft.ModdingMinecraft;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

/**
 * Registra le feature di world generation per il mod.
 */
public final class WorldGeneration {

    private static final ResourceKey<PlacedFeature> LIGHT_IRON_ORE_PLACED = ResourceKey.create(
        Registries.PLACED_FEATURE,
        Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, "light_iron_ore")
    );

    private WorldGeneration() {}

    public static void register() {
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            LIGHT_IRON_ORE_PLACED
        );
    }
}

