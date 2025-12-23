package com.moddingminecraft.item.impl;

import com.moddingminecraft.item.ModArmorMaterials;
import com.moddingminecraft.item.blueprint.ModArmorItem;
import net.minecraft.world.item.equipment.ArmorType;

/**
 * Item per la corazza di light iron.
 */
public class LightIronChestplateItem extends ModArmorItem {

    public LightIronChestplateItem() {
        super("light_iron_chestplate", 
              ModArmorMaterials.LIGHT_IRON, 
              ArmorType.CHESTPLATE);
    }
}
