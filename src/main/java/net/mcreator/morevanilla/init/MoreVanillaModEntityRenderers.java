
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morevanilla.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.morevanilla.client.renderer.TrainTestRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreVanillaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MoreVanillaModEntities.TRAIN_TEST.get(), TrainTestRenderer::new);
	}
}
