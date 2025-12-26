package com.moddingminecraft.init;

import com.moddingminecraft.ModdingMinecraft;
import com.moddingminecraft.registry.BlockRegistry;
import com.moddingminecraft.registry.ItemRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Creative tab per il mod ModdingMinecraft.
 */
public final class ModCreativeTabs {

    public static final CreativeModeTab LIGHT_IRON_TAB = FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.moddingminecraft.light_iron"))
            .icon(() -> new ItemStack(ItemRegistry.LIGHT_IRON_INGOT.getItem()))
            .displayItems((params, output) -> {
                output.accept(BlockRegistry.LIGHT_IRON_ORE.getBlock().asItem());

                output.accept(ItemRegistry.RAW_LIGHT_IRON.getItem());
                output.accept(ItemRegistry.LIGHT_IRON_INGOT.getItem());

                output.accept(ItemRegistry.LIGHT_IRON_HELMET.getItem());
                output.accept(ItemRegistry.LIGHT_IRON_CHESTPLATE.getItem());
                output.accept(ItemRegistry.LIGHT_IRON_LEGGINGS.getItem());
                output.accept(ItemRegistry.LIGHT_IRON_BOOTS.getItem());
            })
            .build();

    private ModCreativeTabs() {}

    public static void register() {
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ModdingMinecraft.MOD_ID, "light_iron"),
            LIGHT_IRON_TAB
        );
    }
}

