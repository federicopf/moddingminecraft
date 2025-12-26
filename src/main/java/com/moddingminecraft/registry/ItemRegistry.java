package com.moddingminecraft.registry;

import java.util.ArrayList;
import java.util.List;

import com.moddingminecraft.item.material.LightIronArmorMaterial;
import com.moddingminecraft.item.blueprint.ModArmorItem;
import com.moddingminecraft.item.blueprint.ModItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

/**
 * Registro centralizzato per tutti gli item del mod.
 */
public final class ItemRegistry {

    private static final List<ModItem> ITEMS = new ArrayList<>();
    private static final List<ModArmorItem> ARMOR_ITEMS = new ArrayList<>();

    public static final ModItem RAW_LIGHT_IRON = register(new ModItem("raw_light_iron", new Item.Properties()));
    public static final ModItem LIGHT_IRON_INGOT = register(new ModItem("light_iron_ingot", new Item.Properties()));

    // Armor (initialized in registerAll after materials are ready)
    public static ModArmorItem LIGHT_IRON_HELMET;
    public static ModArmorItem LIGHT_IRON_CHESTPLATE;
    public static ModArmorItem LIGHT_IRON_LEGGINGS;
    public static ModArmorItem LIGHT_IRON_BOOTS;

    private ItemRegistry() {}

    private static ModItem register(ModItem item) {
        ITEMS.add(item);
        return item;
    }

    private static ModArmorItem registerArmor(ModArmorItem item) {
        ARMOR_ITEMS.add(item);
        return item;
    }

    public static void registerAll() {
        // Register base items first (ingot is needed for armor repair)
        for (ModItem item : ITEMS) {
            item.register();
        }

        // Initialize armor material (requires LIGHT_IRON_INGOT to be registered)
        LightIronArmorMaterial.initialize();

        LIGHT_IRON_HELMET = registerArmor(new ModArmorItem("light_iron_helmet", LightIronArmorMaterial.MATERIAL, ArmorType.HELMET));
        LIGHT_IRON_HELMET = registerArmor(new ModArmorItem("light_iron_helmet", LightIronArmorMaterial.MATERIAL, ArmorType.HELMET));
        LIGHT_IRON_CHESTPLATE = registerArmor(new ModArmorItem("light_iron_chestplate", LightIronArmorMaterial.MATERIAL, ArmorType.CHESTPLATE));
        LIGHT_IRON_LEGGINGS = registerArmor(new ModArmorItem("light_iron_leggings", LightIronArmorMaterial.MATERIAL, ArmorType.LEGGINGS));
        LIGHT_IRON_BOOTS = registerArmor(new ModArmorItem("light_iron_boots", LightIronArmorMaterial.MATERIAL, ArmorType.BOOTS));

        for (ModArmorItem armorItem : ARMOR_ITEMS) {
            armorItem.register();
        }
    }
}
