package com.moddingminecraft.block.blueprint;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

/**
 * Classe per i blocchi di minerale del mod.
 * Definisce le proprietà standard per gli ores: colore metallo, resistenza, richiede strumento corretto.
 */
public class OreBlock extends ModBlock {

    private final float hardness;
    private final float resistance;
    private final MapColor mapColor;

    public OreBlock(String name, float hardness, float resistance, MapColor mapColor) {
        super(name, BlockBehaviour.Properties.of()
            .mapColor(mapColor)
            .strength(hardness, resistance)
            .requiresCorrectToolForDrops());
        this.hardness = hardness;
        this.resistance = resistance;
        this.mapColor = mapColor;
    }

    public OreBlock(String name, float hardness, float resistance) {
        this(name, hardness, resistance, MapColor.METAL);
    }

    public float getHardness() {
        return hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public MapColor getMapColor() {
        return mapColor;
    }
}
