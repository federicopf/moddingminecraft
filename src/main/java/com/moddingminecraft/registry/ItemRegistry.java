package com.moddingminecraft.registry;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import com.moddingminecraft.ModdingMinecraft;
import com.moddingminecraft.item.blueprint.ModItem;
import com.moddingminecraft.item.impl.RawLightIronItem;

/**
 * Registro centralizzato per tutti gli item del mod.
 * Gestisce la registrazione e fornisce accesso agli item registrati.
 */
public class ItemRegistry {

    private static final List<ModItem> ITEMS = new ArrayList<>();

    // Istanza dell'item raw light iron
    public static final RawLightIronItem RAW_LIGHT_IRON = register(new RawLightIronItem());

    /**
     * Registra un item nel registro.
     * @param item L'item da registrare
     * @return L'item registrato
     */
    private static <T extends ModItem> T register(T item) {
        ITEMS.add(item);
        return item;
    }

    /**
     * Inizializza tutti gli item del mod.
     * Gli item vengono registrati automaticamente quando referenziati.
     */
    public static void registerAll() {
        for (ModItem item : ITEMS) {
            // Crea semplicemente l'item senza registrarlo
            // La registrazione avviene automaticamente quando l'item viene referenziato nei loot table
            if (item.getItem() == null) {
                item.register(); // Questo crea l'item
            }
            item.onRegistered();
        }
    }

    /**
     * Restituisce una lista di tutti gli item registrati.
     */
    public static List<ModItem> getAllItems() {
        return new ArrayList<>(ITEMS);
    }
}
