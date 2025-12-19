package com.moddingminecraft.item.impl;

import com.moddingminecraft.item.blueprint.ModItem;
import net.minecraft.world.item.Item;

/**
 * Item per il light iron ingot.
 * Questo item viene ottenuto facendo il melting del raw light iron nella fornace.
 */
public class LightIronIngotItem extends ModItem {

    public LightIronIngotItem() {
        super("light_iron_ingot", new Item.Properties());
    }
}
