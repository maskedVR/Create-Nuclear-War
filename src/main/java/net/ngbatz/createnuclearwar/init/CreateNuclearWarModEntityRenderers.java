
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ngbatz.createnuclearwar.init;

import net.ngbatz.createnuclearwar.client.renderer.UraniumMonsterRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreateNuclearWarModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreateNuclearWarModEntities.URANIUM_MONSTER.get(), UraniumMonsterRenderer::new);
	}
}
