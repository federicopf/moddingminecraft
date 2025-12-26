package com.moddingminecraft.effect;

import com.moddingminecraft.registry.ItemRegistry;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;

/**
 * Gestisce gli effetti speciali quando si indossa l'armatura Light Iron.
 * Applica l'effetto Speed quando il player indossa il set completo.
 */
public final class ArmorEffects {

    private static final int CHECK_INTERVAL = 20; // tick (1 secondo)
    private static final int EFFECT_DURATION = 61; // tick
    private static final int EFFECT_AMPLIFIER = 0; // Speed I (+20%)
    
    private static int tickCounter = 0;

    private ArmorEffects() {}

    public static void initialize() {
        ServerTickEvents.END_SERVER_TICK.register(ArmorEffects::onServerTick);
    }

    private static void onServerTick(MinecraftServer server) {
        if (++tickCounter < CHECK_INTERVAL) return;
        tickCounter = 0;

        for (ServerPlayer player : server.getPlayerList().getPlayers()) {
            applyEffectsIfWearingFullSet(player);
        }
    }

    private static void applyEffectsIfWearingFullSet(ServerPlayer player) {
        if (isWearingFullLightIronArmor(player)) {
            applySpeedEffect(player);
        } else {
            removeSpeedEffectIfFromArmor(player);
        }
    }

    private static void applySpeedEffect(ServerPlayer player) {
        MobEffectInstance current = player.getEffect(MobEffects.SPEED);

        if (current == null || current.getDuration() < 200) {
            player.addEffect(new MobEffectInstance(
                MobEffects.SPEED,
                EFFECT_DURATION,
                EFFECT_AMPLIFIER,
                false, // ambient
                false, // show particles
                true   // show icon
            ));
        }
    }

    private static void removeSpeedEffectIfFromArmor(ServerPlayer player) {
        MobEffectInstance current = player.getEffect(MobEffects.SPEED);
        // Only remove if it's the level we apply (to not interfere with potions)
        if (current != null && current.getAmplifier() == EFFECT_AMPLIFIER) {
            player.removeEffect(MobEffects.SPEED);
        }
    }

    private static boolean isWearingFullLightIronArmor(ServerPlayer player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).is(ItemRegistry.LIGHT_IRON_HELMET.getItem()) &&
               player.getItemBySlot(EquipmentSlot.CHEST).is(ItemRegistry.LIGHT_IRON_CHESTPLATE.getItem()) &&
               player.getItemBySlot(EquipmentSlot.LEGS).is(ItemRegistry.LIGHT_IRON_LEGGINGS.getItem()) &&
               player.getItemBySlot(EquipmentSlot.FEET).is(ItemRegistry.LIGHT_IRON_BOOTS.getItem());
    }
}

