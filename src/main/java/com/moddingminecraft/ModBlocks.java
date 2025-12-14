package com.moddingminecraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

    public static Block LIGHT_IRON_BLOCK;

    public static void register() {
        Identifier id = Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, "light_iron");
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);

        BlockBehaviour.Properties props = BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(5.0F, 6.0F)
            .requiresCorrectToolForDrops();

        LIGHT_IRON_BLOCK = Blocks.register(key, props);
        Items.registerBlock(LIGHT_IRON_BLOCK);
    }
}
