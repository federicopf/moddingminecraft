package com.moddingminecraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModBlocks {
    public static final Identifier STUPID_BLOCK_ID = Identifier.parse("moddingminecraft:stupid_block");
    public static final ResourceKey<Block> STUPID_BLOCK_KEY = ResourceKey.create(Registries.BLOCK, STUPID_BLOCK_ID);

    public static final Block STUPID_BLOCK = new Block(Block.Properties.ofFullCopy(Blocks.STONE).setId(STUPID_BLOCK_KEY));

    private ModBlocks() {
    }
}
