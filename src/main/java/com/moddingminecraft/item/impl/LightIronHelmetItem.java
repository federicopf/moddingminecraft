package com.moddingminecraft.item.impl;

import com.moddingminecraft.item.ModArmorMaterials;
import com.moddingminecraft.item.blueprint.ModArmorItem;
import net.minecraft.world.item.equipment.ArmorType;

/**
 * Item per l'elmetto di light iron.
 */
public class LightIronHelmetItem extends ModArmorItem {

    public LightIronHelmetItem() {
        super("light_iron_helmet", 
              ModArmorMaterials.LIGHT_IRON, 
              ArmorType.HELMET);
    }
}
