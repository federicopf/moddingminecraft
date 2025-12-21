package com.moddingminecraft.item.material;

import com.moddingminecraft.registry.ItemRegistry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

/**
 * Materiale per l'armatura di light iron.
 * Definisce le proprietà dell'armatura come durabilità, protezione, ecc.
 */
public class LightIronArmorMaterial implements ArmorMaterial {

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private static final int[] SLOT_PROTECTIONS = new int[]{3, 6, 5, 2};

    @Override
    public int getDurabilityForSlot(ArmorItem.Type type) {
        return HEALTH_PER_SLOT[type.getSlot().getIndex()] * 15; // Durabilità base simile al ferro
    }

    @Override
    public int getDefenseForSlot(ArmorItem.Type type) {
        return SLOT_PROTECTIONS[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return 12; // Enchantabilità simile al ferro
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ItemRegistry.LIGHT_IRON_INGOT.getItem());
    }

    @Override
    public String getName() {
        return "light_iron";
    }

    @Override
    public float getToughness() {
        return 0.0F; // Nessuna toughness extra
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F; // Nessuna resistenza al knockback
    }
}
