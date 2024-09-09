
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ngbatz.createnuclearwar.init;

import net.ngbatz.createnuclearwar.client.gui.NuclearPowerConductorScreenScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreateNuclearWarModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CreateNuclearWarModMenus.NUCLEAR_POWER_CONDUCTOR_SCREEN.get(), NuclearPowerConductorScreenScreen::new);
		});
	}
}
