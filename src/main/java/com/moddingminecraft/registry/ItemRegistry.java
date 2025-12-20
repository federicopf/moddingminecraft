package com.moddingminecraft.registry;

import java.util.ArrayList;
import java.util.List;

import com.moddingminecraft.item.blueprint.ModItem;
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

    public static final RawLightIronItem RAW_LIGHT_IRON = register(new RawLightIronItem());
    public static final LightIronIngotItem LIGHT_IRON_INGOT = register(new LightIronIngotItem());

    // Light Iron Armor Items
    public static final LightIronHelmetItem LIGHT_IRON_HELMET = register(new LightIronHelmetItem());
    public static final LightIronChestplateItem LIGHT_IRON_CHESTPLATE = register(new LightIronChestplateItem());
    public static final LightIronLeggingsItem LIGHT_IRON_LEGGINGS = register(new LightIronLeggingsItem());
    public static final LightIronBootsItem LIGHT_IRON_BOOTS = register(new LightIronBootsItem());

    private static <T extends ModItem> T register(T item) {
        ITEMS.add(item);
        return item;
    }

    /**
     * Registra tutti gli item sul registratore di Minecraft.
     */
    public static void registerAll() {
        for (ModItem item : ITEMS) {
            item.register();
            item.onRegistered();
        }
    }
}
