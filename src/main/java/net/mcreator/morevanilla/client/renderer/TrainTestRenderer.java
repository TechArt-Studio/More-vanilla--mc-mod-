
package net.mcreator.morevanilla.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PiglinModel;

import net.mcreator.morevanilla.entity.TrainTestEntity;

public class TrainTestRenderer extends MobRenderer<TrainTestEntity, PiglinModel<TrainTestEntity>> {
	public TrainTestRenderer(EntityRendererProvider.Context context) {
		super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrainTestEntity entity) {
		return new ResourceLocation("more_vanilla:textures/entities/df11z.png");
	}
}
