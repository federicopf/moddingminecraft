package com.moddingminecraft.block.blueprint;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

/**
 * Classe base per i blocchi di minerale.
 */
public class OreBlock extends ModBlock {

    public OreBlock(String name, float hardness, float resistance, MapColor mapColor) {
        super(name, BlockBehaviour.Properties.of()
            .mapColor(mapColor)
            .strength(hardness, resistance)
            .requiresCorrectToolForDrops());
    }

    public OreBlock(String name, float hardness, float resistance) {
        this(name, hardness, resistance, MapColor.METAL);
    }
}
