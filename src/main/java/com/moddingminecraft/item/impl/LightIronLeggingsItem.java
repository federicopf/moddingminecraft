package com.moddingminecraft.item.impl;

import com.moddingminecraft.item.ModArmorMaterials;
import com.moddingminecraft.item.blueprint.ModArmorItem;
import net.minecraft.world.item.equipment.ArmorType;

/**
 * Item per i gambali di light iron.
 */
public class LightIronLeggingsItem extends ModArmorItem {

    public LightIronLeggingsItem() {
        super("light_iron_leggings", 
              ModArmorMaterials.LIGHT_IRON, 
              ArmorType.LEGGINGS);
    }
}
