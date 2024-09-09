
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ngbatz.createnuclearwar.init;

import net.ngbatz.createnuclearwar.CreateNuclearWarMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class CreateNuclearWarModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateNuclearWarMod.MODID);
	public static final RegistryObject<CreativeModeTab> NUCLEAR_WAR = REGISTRY.register("nuclear_war",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_nuclear_war.nuclear_war")).icon(() -> new ItemStack(CreateNuclearWarModItems.URANIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateNuclearWarModItems.URANIUM.get());
				tabData.accept(CreateNuclearWarModBlocks.NUCLEAR_POWER_CONDUCTOR.get().asItem());
				tabData.accept(CreateNuclearWarModItems.NUCLEAR_FUEL.get());
				tabData.accept(CreateNuclearWarModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(CreateNuclearWarModItems.HAZMAT_SUIT_HELMET.get());
				tabData.accept(CreateNuclearWarModItems.HAZMAT_SUIT_CHESTPLATE.get());
				tabData.accept(CreateNuclearWarModItems.HAZMAT_SUIT_LEGGINGS.get());
				tabData.accept(CreateNuclearWarModItems.HAZMAT_SUIT_BOOTS.get());
				tabData.accept(CreateNuclearWarModBlocks.COMPACTED_URANIUM.get().asItem());
				tabData.accept(CreateNuclearWarModBlocks.NUKE.get().asItem());
				tabData.accept(CreateNuclearWarModItems.URANIUM_POWDER.get());
				tabData.accept(CreateNuclearWarModItems.URANIUM_MONSTER_SPAWN_EGG.get());
			})

					.build());
}
