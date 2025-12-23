package com.moddingminecraft.item;

import com.moddingminecraft.ModdingMinecraft;
import net.minecraft.core.Holder;
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
 * Registro dei materiali per le armature del mod.
 */
public class ModArmorMaterials {

    // Tag per gli item di riparazione - usa lo stesso tag dell'armatura di ferro
    private static final TagKey<Item> LIGHT_IRON_REPAIR_TAG = ItemTags.REPAIRS_IRON_ARMOR;

    // Asset ID per le texture dell'armatura
    public static final ResourceKey<EquipmentAsset> LIGHT_IRON_ASSET = 
            ResourceKey.create(EquipmentAssets.ROOT_ID, 
                    Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, "light_iron"));

    /**
     * Materiale Light Iron: leggermente più debole del ferro normale.
     */
    public static final ArmorMaterial LIGHT_IRON = new ArmorMaterial(
            15,  // Durability base (ferro = 15)
            createDefenseMap(2, 5, 4, 2, 5),  // defense: helmet, chestplate, leggings, boots, body
            15,  // Enchantability (ferro = 9, oro = 25)
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,  // Toughness (ferro = 0, diamante = 2)
            0.0F,  // Knockback resistance (netherite = 0.1)
            LIGHT_IRON_REPAIR_TAG,
            LIGHT_IRON_ASSET
    );

    /**
     * Crea la mappa di difesa per ogni tipo di armatura.
     */
    private static Map<ArmorType, Integer> createDefenseMap(int helmet, int chestplate, int leggings, int boots, int body) {
        EnumMap<ArmorType, Integer> map = new EnumMap<>(ArmorType.class);
        map.put(ArmorType.HELMET, helmet);
        map.put(ArmorType.CHESTPLATE, chestplate);
        map.put(ArmorType.LEGGINGS, leggings);
        map.put(ArmorType.BOOTS, boots);
        map.put(ArmorType.BODY, body);
        return map;
    }

    /**
     * Inizializza i materiali (chiamato durante il bootstrap del mod).
     */
    public static void initialize() {
        ModdingMinecraft.LOGGER.info("Armor materials initialized");
    }
}
