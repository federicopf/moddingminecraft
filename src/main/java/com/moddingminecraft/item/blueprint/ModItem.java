package com.moddingminecraft.item.blueprint;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import com.moddingminecraft.ModdingMinecraft;

/**
 * Classe astratta base per tutti gli item del mod.
 * Fornisce metodi comuni per la registrazione e gestione delle proprietà.
 */
public abstract class ModItem {

    protected final String name;
    protected final Item.Properties properties;
    protected Item item;

    public ModItem(String name, Item.Properties properties) {
        this.name = name;
        this.properties = properties;
    }

    /**
     * Restituisce il nome dell'item (usato per l'identifier).
     */
    public String getName() {
        return name;
    }

    /**
     * Restituisce le proprietà dell'item.
     */
    public Item.Properties getProperties() {
        return properties;
    }

    /**
     * Restituisce l'istanza dell'item dopo la registrazione.
     */
    public Item getItem() {
        return item;
    }

    /**
     * Imposta l'istanza dell'item (usato durante la registrazione).
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Prepara l'item per la registrazione.
     * La registrazione vera e propria avverrà in ItemRegistry.registerAll().
     */
    public void register() {
        // L'item verrà creato e registrato in ItemRegistry.registerAll()
    }

    /**
     * Metodo chiamato dopo la registrazione per eventuali setup aggiuntivi.
     */
    public void onRegistered() {
        // Implementazione di default vuota, può essere sovrascritta dalle sottoclassi
    }
}
