package com.moddingminecraft.block.blueprint;

import com.moddingminecraft.ModdingMinecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * Classe base astratta per tutti i blocchi del mod.
 */
public abstract class ModBlock {

    protected final String name;
    protected final BlockBehaviour.Properties properties;
    protected Block block;

    protected ModBlock(String name, BlockBehaviour.Properties properties) {
        this.name = name;
        this.properties = properties;
    }

    public void register() {
        Identifier id = Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);
        this.block = Blocks.register(key, properties);
    }

    public void registerItem() {
        Items.registerBlock(block);
    }

    public Block getBlock() {
        return block;
    }

    public String getName() {
        return name;
    }
}
