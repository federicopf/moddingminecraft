package com.moddingminecraft;

import com.moddingminecraft.registry.ItemRegistry;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;

/**
 * Gestisce gli effetti speciali dell'armor Light Iron.
 * Applica l'effetto SPEED quando il player indossa tutto il set completo.
 */
public class ModArmorEffects {

    private static int tickCounter = 0;

    /**
     * Inizializza gli event handler per gli effetti armor.
     */
    public static void initialize() {
        // Controlla ogni 20 tick (1 secondo) per non essere troppo pesante
        ServerTickEvents.END_SERVER_TICK.register(ModArmorEffects::onServerTick);
        ModdingMinecraft.LOGGER.info("⚡ Sistema effetti armor Light Iron inizializzato!");
    }

    /**
     * Event handler chiamato ogni tick del server.
     */
    private static void onServerTick(MinecraftServer server) {
        tickCounter++;

        // Controlla ogni 20 tick (1 secondo) per prestazioni
        if (tickCounter >= 20) {
            tickCounter = 0;

            // Controlla tutti i player online
            for (ServerPlayer player : server.getPlayerList().getPlayers()) {
                checkAndApplyArmorEffects(player);
            }
        }
    }

    /**
     * Controlla se il player indossa il set completo di Light Iron armor
     * e applica/rimuove l'effetto SPEED di conseguenza.
     */
    private static void checkAndApplyArmorEffects(ServerPlayer player) {
        boolean hasFullSet = isWearingFullLightIronArmor(player);

        if (hasFullSet) {
            // Applica effetto SPEED livello 1 per 3 secondi (61 tick)
            // Il livello 1 di SPEED aumenta la velocità del 20%
            MobEffectInstance speedEffect = new MobEffectInstance(
                MobEffects.SPEED,
                61, // Durata in tick (3 secondi + 1)
                0,  // Livello 0 = velocità +20%
                false, // Non visibile alle particelle
                false, // Non mostra icona
                true  // Mostra icona
            );

            // Applica l'effetto solo se non è già presente
            if (!player.hasEffect(MobEffects.SPEED)) {
                player.addEffect(speedEffect);
                ModdingMinecraft.LOGGER.debug("⚡ {} ora ha l'effetto SPEED dal set Light Iron completo!",
                    player.getName().getString());
            } else {
                // Rinnova l'effetto se sta per scadere (meno di 10 secondi)
                MobEffectInstance currentEffect = player.getEffect(MobEffects.SPEED);
                if (currentEffect != null && currentEffect.getDuration() < 200) {
                    player.addEffect(speedEffect);
                }
            }
        } else {
            // Rimuovi l'effetto SPEED se presente e il player non ha il set completo
            if (player.hasEffect(MobEffects.SPEED)) {
                MobEffectInstance currentEffect = player.getEffect(MobEffects.SPEED);
                if (currentEffect != null && currentEffect.getAmplifier() == 0) {
                    // Rimuovi solo se è il livello 0 (quello che applichiamo noi)
                    player.removeEffect(MobEffects.SPEED);
                    ModdingMinecraft.LOGGER.debug("❌ {} ha perso l'effetto SPEED (set Light Iron non completo)",
                        player.getName().getString());
                }
            }
        }
    }

    /**
     * Verifica se il player indossa tutto il set di Light Iron armor.
     */
    private static boolean isWearingFullLightIronArmor(ServerPlayer player) {
        // Controlla tutti e 4 gli slot armor usando EquipmentSlot
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);

        return helmet.getItem() == ItemRegistry.LIGHT_IRON_HELMET.getItem() &&
               chestplate.getItem() == ItemRegistry.LIGHT_IRON_CHESTPLATE.getItem() &&
               leggings.getItem() == ItemRegistry.LIGHT_IRON_LEGGINGS.getItem() &&
               boots.getItem() == ItemRegistry.LIGHT_IRON_BOOTS.getItem();
    }
}
