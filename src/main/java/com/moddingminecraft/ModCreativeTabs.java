package com.moddingminecraft;

import com.moddingminecraft.registry.ItemRegistry;
import com.moddingminecraft.registry.BlockRegistry;
import org.slf4j.Logger;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Creative tabs per il mod ModdingMinecraft.
 * Organizza tutti gli item del mod in una tab dedicata.
 */
public class ModCreativeTabs {

    public static final CreativeModeTab LIGHT_IRON_TAB = FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.moddingminecraft.light_iron"))
            .icon(() -> new ItemStack(ItemRegistry.LIGHT_IRON_INGOT.getItem()))
            .displayItems((itemDisplayParameters, output) -> {
                ModdingMinecraft.LOGGER.info("🔧 Costruendo creative tab Light Iron...");

                // Aggiungi il blocco ore
                output.accept(BlockRegistry.LIGHT_IRON_ORE.getBlock().asItem());
                ModdingMinecraft.LOGGER.info("✅ Aggiunto Light Iron Ore Block alla tab");

                // Aggiungi tutti gli item del mod alla tab
                output.accept(ItemRegistry.RAW_LIGHT_IRON.getItem());
                ModdingMinecraft.LOGGER.info("✅ Aggiunto Raw Light Iron alla tab");

                output.accept(ItemRegistry.LIGHT_IRON_INGOT.getItem());
                ModdingMinecraft.LOGGER.info("✅ Aggiunto Light Iron Ingot alla tab");

                // Armor items - ora dovrebbero essere inizializzati
                output.accept(ItemRegistry.LIGHT_IRON_HELMET.getItem());
                ModdingMinecraft.LOGGER.info("✅ Aggiunto Light Iron Helmet alla tab");

                output.accept(ItemRegistry.LIGHT_IRON_CHESTPLATE.getItem());
                ModdingMinecraft.LOGGER.info("✅ Aggiunto Light Iron Chestplate alla tab");

                output.accept(ItemRegistry.LIGHT_IRON_LEGGINGS.getItem());
                ModdingMinecraft.LOGGER.info("✅ Aggiunto Light Iron Leggings alla tab");

                output.accept(ItemRegistry.LIGHT_IRON_BOOTS.getItem());
                ModdingMinecraft.LOGGER.info("✅ Aggiunto Light Iron Boots alla tab");

                ModdingMinecraft.LOGGER.info("🎉 Creative tab Light Iron completata!");
            })
            .build();

    /**
     * Registra la creative tab.
     */
    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, "light_iron"),
                LIGHT_IRON_TAB);

        // Log per confermare la registrazione
        ModdingMinecraft.LOGGER.info("✅ Creative tab 'Light Iron' registrata con successo!");
    }
}
