package com.moddingminecraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final Identifier LIGHT_IRON_BLOCK_ID = Identifier.parse("moddingminecraft:light_iron");
    public static final ResourceKey<Block> LIGHT_IRON_BLOCK_KEY = ResourceKey.create(Registries.BLOCK, LIGHT_IRON_BLOCK_ID);

    public static final Block LIGHT_IRON_BLOCK = new Block(
        BlockBehaviour.Properties.of()
            .strength(0.5F) // veloce
            .setId(LIGHT_IRON_BLOCK_KEY)
    );
    
    private ModBlocks() {
    }
}
