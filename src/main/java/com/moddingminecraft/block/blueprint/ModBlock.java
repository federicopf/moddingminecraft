package com.moddingminecraft.block.blueprint;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import com.moddingminecraft.ModdingMinecraft;

/**
 * Classe astratta base per tutti i blocchi del mod.
 * Fornisce metodi comuni per la registrazione e gestione delle proprietà.
 */
public abstract class ModBlock {

    protected final String name;
    protected final BlockBehaviour.Properties properties;
    protected Block block;

    public ModBlock(String name, BlockBehaviour.Properties properties) {
        this.name = name;
        this.properties = properties;
    }

    /**
     * Restituisce il nome del blocco (usato per l'identifier).
     */
    public String getName() {
        return name;
    }

    /**
     * Restituisce le proprietà del blocco.
     */
    public BlockBehaviour.Properties getProperties() {
        return properties;
    }

    /**
     * Restituisce l'istanza del blocco dopo la registrazione.
     */
    public Block getBlock() {
        return block;
    }

    /**
     * Registra il blocco nel registro di Minecraft.
     */
    public void register() {
        Identifier id = Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);
        this.block = net.minecraft.world.level.block.Blocks.register(key, properties);
    }

    /**
     * Registra l'item corrispondente al blocco.
     * Override questo metodo se il blocco non dovrebbe avere un item corrispondente.
     */
    public void registerItem() {
        // Registra l'item corrispondente al blocco
        Items.registerBlock(block);
    }

    /**
     * Metodo chiamato dopo la registrazione per eventuali setup aggiuntivi.
     */
    public void onRegistered() {
        // Implementazione di default vuota, può essere sovrascritta dalle sottoclassi
    }
}
