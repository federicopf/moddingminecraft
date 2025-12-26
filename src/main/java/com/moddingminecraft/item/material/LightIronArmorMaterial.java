package com.moddingminecraft.item.material;

import com.moddingminecraft.ModdingMinecraft;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.EnumMap;
import java.util.Map;

/**
 * Materiale per l'armatura Light Iron.
 */
public final class LightIronArmorMaterial {

    private static final TagKey<Item> REPAIR_TAG = ItemTags.REPAIRS_IRON_ARMOR;

    public static final ResourceKey<EquipmentAsset> ASSET_KEY = ResourceKey.create(
        EquipmentAssets.ROOT_ID,
        Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, "light_iron")
    );

    public static final ArmorMaterial MATERIAL = new ArmorMaterial(
        15,  // durability (iron = 15)
        createDefenseMap(2, 5, 4, 2, 5),
        15,  // enchantability (iron = 9, gold = 25)
        SoundEvents.ARMOR_EQUIP_IRON,
        0.0F, // toughness
        0.0F, // knockback resistance
        REPAIR_TAG,
        ASSET_KEY
    );

    private LightIronArmorMaterial() {}

    private static Map<ArmorType, Integer> createDefenseMap(int helmet, int chestplate, int leggings, int boots, int body) {
        EnumMap<ArmorType, Integer> map = new EnumMap<>(ArmorType.class);
        map.put(ArmorType.HELMET, helmet);
        map.put(ArmorType.CHESTPLATE, chestplate);
        map.put(ArmorType.LEGGINGS, leggings);
        map.put(ArmorType.BOOTS, boots);
        map.put(ArmorType.BODY, body);
        return map;
    }

    public static void initialize() {
        // Forces class loading - material is already defined as static final
    }
}

