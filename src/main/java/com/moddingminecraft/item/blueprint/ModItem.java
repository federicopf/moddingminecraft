package com.moddingminecraft.item.blueprint;

import com.moddingminecraft.ModdingMinecraft;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

/**
 * Rappresenta un item del mod con registrazione automatica.
 */
public class ModItem {

    protected final String name;
    protected final Item.Properties properties;
    protected Item item;

    public ModItem(String name, Item.Properties properties) {
        this.name = name;
        this.properties = properties;
    }

    public void register() {
        Identifier id = Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        properties.setId(key);
        this.item = Registry.register(BuiltInRegistries.ITEM, id, new Item(properties));
    }

    public Item getItem() {
        return item;
    }

    public String getName() {
        return name;
    }
}
