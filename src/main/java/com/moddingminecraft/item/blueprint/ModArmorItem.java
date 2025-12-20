package com.moddingminecraft.item.blueprint;

import net.minecraft.world.item.Item;

/**
 * Classe base per gli item dell'armatura del mod.
 * Per ora usa Item normale, non ArmorItem, quindi non equipaggiabili.
 */
public abstract class ModArmorItem extends ModItem {

    public ModArmorItem(String name, Item.Properties properties) {
        super(name, properties);
    }
}
