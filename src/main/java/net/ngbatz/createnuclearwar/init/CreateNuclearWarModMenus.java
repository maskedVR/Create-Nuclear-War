
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ngbatz.createnuclearwar.init;

import net.ngbatz.createnuclearwar.world.inventory.NuclearPowerConductorScreenMenu;
import net.ngbatz.createnuclearwar.CreateNuclearWarMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class CreateNuclearWarModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreateNuclearWarMod.MODID);
	public static final RegistryObject<MenuType<NuclearPowerConductorScreenMenu>> NUCLEAR_POWER_CONDUCTOR_SCREEN = REGISTRY.register("nuclear_power_conductor_screen", () -> IForgeMenuType.create(NuclearPowerConductorScreenMenu::new));
}
