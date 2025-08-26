
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morevanilla.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.morevanilla.MoreVanillaMod;

public class MoreVanillaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreVanillaMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOREVANILLA = REGISTRY.register("morevanilla",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.more_vanilla.morevanilla")).icon(() -> new ItemStack(Blocks.DEEPSLATE_DIAMOND_ORE)).displayItems((parameters, tabData) -> {
				tabData.accept(MoreVanillaModItems.DOLLAR.get());
				tabData.accept(MoreVanillaModItems.DIME.get());
				tabData.accept(MoreVanillaModItems.CENT.get());
				tabData.accept(MoreVanillaModItems.TENDOLLAR.get());
				tabData.accept(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get());
				tabData.accept(MoreVanillaModItems.MY_SUNSET.get());
				tabData.accept(MoreVanillaModItems.ILLUSIONARY_DAYTIME.get());
				tabData.accept(MoreVanillaModItems.RIVER_FLOWS_IN_YOU.get());
				tabData.accept(MoreVanillaModItems.TENNESSEE.get());
				tabData.accept(MoreVanillaModItems.LIBERATORS.get());
				tabData.accept(MoreVanillaModItems.TRAIN_TEST_SPAWN_EGG.get());
				tabData.accept(MoreVanillaModItems.CALL_OF_SILENCE.get());
				tabData.accept(MoreVanillaModItems.CALL_OF_SILENCE_PIANO.get());
			}).withSearchBar().build());
}
