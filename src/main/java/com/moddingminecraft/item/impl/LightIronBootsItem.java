package com.moddingminecraft.item.impl;

import com.moddingminecraft.item.ModArmorMaterials;
import com.moddingminecraft.item.blueprint.ModArmorItem;
import net.minecraft.world.item.equipment.ArmorType;

/**
 * Item per gli stivali di light iron.
 */
public class LightIronBootsItem extends ModArmorItem {

    public LightIronBootsItem() {
        super("light_iron_boots", 
              ModArmorMaterials.LIGHT_IRON, 
              ArmorType.BOOTS);
    }
}
