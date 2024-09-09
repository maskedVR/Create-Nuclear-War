
package net.ngbatz.createnuclearwar.client.renderer;

import net.ngbatz.createnuclearwar.entity.UraniumMonsterEntity;
import net.ngbatz.createnuclearwar.client.model.ModelUraniumMoster;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class UraniumMonsterRenderer extends MobRenderer<UraniumMonsterEntity, ModelUraniumMoster<UraniumMonsterEntity>> {
	public UraniumMonsterRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUraniumMoster(context.bakeLayer(ModelUraniumMoster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UraniumMonsterEntity entity) {
		return new ResourceLocation("create_nuclear_war:textures/entities/compacted_uranium.png");
	}
}
