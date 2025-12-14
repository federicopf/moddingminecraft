package com.moddingminecraft.registry;

import java.util.ArrayList;
import java.util.List;
import com.moddingminecraft.block.blueprint.ModBlock;
import com.moddingminecraft.block.impl.LightIronOreBlock;

/**
 * Registro centralizzato per tutti i blocchi del mod.
 * Gestisce la registrazione e fornisce accesso ai blocchi registrati.
 */
public class BlockRegistry {

    private static final List<ModBlock> BLOCKS = new ArrayList<>();

    // Istanza del blocco di ferro leggero
    public static final LightIronOreBlock LIGHT_IRON_ORE = register(new LightIronOreBlock());

    /**
     * Registra un blocco nel registro.
     * @param block Il blocco da registrare
     * @return Il blocco registrato
     */
    private static <T extends ModBlock> T register(T block) {
        BLOCKS.add(block);
        return block;
    }

    /**
     * Registra tutti i blocchi nel registro di Minecraft.
     * Chiamare questo metodo durante l'inizializzazione del mod.
     */
    public static void registerAll() {
        for (ModBlock block : BLOCKS) {
            block.register();
            block.registerItem();
            block.onRegistered();
        }
    }

    /**
     * Restituisce una lista di tutti i blocchi registrati.
     */
    public static List<ModBlock> getAllBlocks() {
        return new ArrayList<>(BLOCKS);
    }
}