package com.moddingminecraft.item.blueprint;

import com.moddingminecraft.ModdingMinecraft;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

/**
 * Classe base per gli item dell'armatura del mod.
 * Usa il nuovo sistema 1.21 con Item.Properties.humanoidArmor().
 */
public abstract class ModArmorItem {

    protected final String name;
    protected final ArmorMaterial material;
    protected final ArmorType armorType;
    protected Item item;

    public ModArmorItem(String name, ArmorMaterial material, ArmorType armorType) {
        this.name = name;
        this.material = material;
        this.armorType = armorType;
    }

    protected Item createItem() {
        Item.Properties properties = new Item.Properties()
                .humanoidArmor(material, armorType);
        return new Item(properties);
    }

    public void register() {
        Identifier id = Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, name);

        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        
        Item.Properties properties = new Item.Properties()
                .setId(key)
                .humanoidArmor(material, armorType);

        this.item = Registry.register(BuiltInRegistries.ITEM, id, new Item(properties));
    }

    public void onRegistered() {}

    public Item getItem() {
        return item;
    }

    public String getName() {
        return name;
    }
}
