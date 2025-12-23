package com.moddingminecraft.registry;

import java.util.ArrayList;
import java.util.List;

import com.moddingminecraft.item.ModArmorMaterials;
import com.moddingminecraft.item.blueprint.ModItem;
import com.moddingminecraft.item.blueprint.ModArmorItem;
import com.moddingminecraft.item.impl.RawLightIronItem;
import com.moddingminecraft.item.impl.LightIronIngotItem;
import com.moddingminecraft.item.impl.LightIronHelmetItem;
import com.moddingminecraft.item.impl.LightIronChestplateItem;
import com.moddingminecraft.item.impl.LightIronLeggingsItem;
import com.moddingminecraft.item.impl.LightIronBootsItem;

/**
 * Registro centralizzato per tutti gli item del mod.
 * Mantiene la lista degli item da registrare e li registra durante l'inizializzazione.
 */
public class ItemRegistry {

    private static final List<ModItem> ITEMS = new ArrayList<>();
    private static final List<ModArmorItem> ARMOR_ITEMS = new ArrayList<>();

    // Item base
    public static final RawLightIronItem RAW_LIGHT_IRON = register(new RawLightIronItem());
    public static final LightIronIngotItem LIGHT_IRON_INGOT = register(new LightIronIngotItem());

    // Light Iron Armor Items (registrati dopo l'inizializzazione dei materiali)
    public static LightIronHelmetItem LIGHT_IRON_HELMET;
    public static LightIronChestplateItem LIGHT_IRON_CHESTPLATE;
    public static LightIronLeggingsItem LIGHT_IRON_LEGGINGS;
    public static LightIronBootsItem LIGHT_IRON_BOOTS;

    private static <T extends ModItem> T register(T item) {
        ITEMS.add(item);
        return item;
    }

    private static <T extends ModArmorItem> T registerArmor(T item) {
        ARMOR_ITEMS.add(item);
        return item;
    }

    /**
     * Registra tutti gli item sul registratore di Minecraft.
     */
    public static void registerAll() {
        // Prima registra gli item normali (incluso l'ingot necessario per il repair)
        for (ModItem item : ITEMS) {
            item.register();
            item.onRegistered();
        }

        // Inizializza i materiali armatura (richiede che LIGHT_IRON_INGOT sia registrato)
        ModArmorMaterials.initialize();

        // Ora crea e registra gli armor items
        LIGHT_IRON_HELMET = registerArmor(new LightIronHelmetItem());
        LIGHT_IRON_CHESTPLATE = registerArmor(new LightIronChestplateItem());
        LIGHT_IRON_LEGGINGS = registerArmor(new LightIronLeggingsItem());
        LIGHT_IRON_BOOTS = registerArmor(new LightIronBootsItem());

        for (ModArmorItem armorItem : ARMOR_ITEMS) {
            armorItem.register();
            armorItem.onRegistered();
        }
    }
}
