package com.moddingminecraft;

import net.minecraft.world.level.block.Block;
import com.moddingminecraft.registry.BlockRegistry;

/**
 * Classe di compatibilità per accedere ai blocchi registrati.
 * Utilizza internamente il sistema OOP del BlockRegistry per una migliore organizzazione.
 *
 * @deprecated Utilizzare BlockRegistry per l'accesso diretto ai blocchi.
 */
@Deprecated
public class ModBlocks {

    // Riferimenti statici ai blocchi per retrocompatibilità
    public static Block LIGHT_IRON_ORE = BlockRegistry.LIGHT_IRON_ORE.getBlock();

    /**
     * Registra tutti i blocchi del mod.
     * Questo metodo chiama internamente BlockRegistry.registerAll().
     */
    public static void register() {
        BlockRegistry.registerAll();
        // Aggiorna i riferimenti statici dopo la registrazione
        LIGHT_IRON_ORE = BlockRegistry.LIGHT_IRON_ORE.getBlock();
    }
}
