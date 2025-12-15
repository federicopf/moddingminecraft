package com.moddingminecraft.item.impl;

import com.moddingminecraft.item.blueprint.ModItem;
import net.minecraft.world.item.Item;

/**
 * Item per il raw light iron.
 * Simile al raw gold di Minecraft, questo item viene droppato dal light iron ore.
 */
public class RawLightIronItem extends ModItem {

    public RawLightIronItem() {
        super("raw_light_iron", new Item.Properties());
    }
}
