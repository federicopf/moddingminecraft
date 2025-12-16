package com.moddingminecraft.item.blueprint;

import com.moddingminecraft.ModdingMinecraft;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public abstract class ModItem {

    protected final String name;
    protected final Item.Properties properties;
    protected Item item;

    public ModItem(String name, Item.Properties properties) {
        this.name = name;
        this.properties = properties;
    }

    protected Item createItem() {
        return new Item(properties);
    }

    public void register() {
        Identifier id = Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, name);

        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        properties.setId(key); // ✅ IMPORTANTISSIMO in 1.21.11

        this.item = Registry.register(BuiltInRegistries.ITEM, id, createItem());
    }

    public void onRegistered() {}
}
