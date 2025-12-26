package com.moddingminecraft.registry;

import java.util.ArrayList;
import java.util.List;

import com.moddingminecraft.block.blueprint.ModBlock;
import com.moddingminecraft.block.impl.LightIronOreBlock;

/**
 * Registro centralizzato per tutti i blocchi del mod.
 */
public final class BlockRegistry {

    private static final List<ModBlock> BLOCKS = new ArrayList<>();

    public static final LightIronOreBlock LIGHT_IRON_ORE = register(new LightIronOreBlock());

    private BlockRegistry() {}

    private static <T extends ModBlock> T register(T block) {
        BLOCKS.add(block);
        return block;
    }

    public static void registerAll() {
        for (ModBlock block : BLOCKS) {
            block.register();
            block.registerItem();
        }
    }
}