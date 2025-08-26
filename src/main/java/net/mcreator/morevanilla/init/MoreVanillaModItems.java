
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morevanilla.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.morevanilla.item.TennesseeItem;
import net.mcreator.morevanilla.item.TendollarItem;
import net.mcreator.morevanilla.item.RiverFlowsInYouItem;
import net.mcreator.morevanilla.item.OnehundredDollarItem;
import net.mcreator.morevanilla.item.MySunsetItem;
import net.mcreator.morevanilla.item.LiberatorsItem;
import net.mcreator.morevanilla.item.IllusionaryDaytimeItem;
import net.mcreator.morevanilla.item.DollarItem;
import net.mcreator.morevanilla.item.DimeItem;
import net.mcreator.morevanilla.item.CentItem;
import net.mcreator.morevanilla.item.CallOfSilencePianoItem;
import net.mcreator.morevanilla.item.CallOfSilenceItem;
import net.mcreator.morevanilla.MoreVanillaMod;

public class MoreVanillaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreVanillaMod.MODID);
	public static final RegistryObject<Item> DOLLAR = REGISTRY.register("dollar", () -> new DollarItem());
	public static final RegistryObject<Item> DIME = REGISTRY.register("dime", () -> new DimeItem());
	public static final RegistryObject<Item> CENT = REGISTRY.register("cent", () -> new CentItem());
	public static final RegistryObject<Item> TENDOLLAR = REGISTRY.register("tendollar", () -> new TendollarItem());
	public static final RegistryObject<Item> ONEHUNDRED_DOLLAR = REGISTRY.register("onehundred_dollar", () -> new OnehundredDollarItem());
	public static final RegistryObject<Item> MY_SUNSET = REGISTRY.register("my_sunset", () -> new MySunsetItem());
	public static final RegistryObject<Item> ILLUSIONARY_DAYTIME = REGISTRY.register("illusionary_daytime", () -> new IllusionaryDaytimeItem());
	public static final RegistryObject<Item> RIVER_FLOWS_IN_YOU = REGISTRY.register("river_flows_in_you", () -> new RiverFlowsInYouItem());
	public static final RegistryObject<Item> TENNESSEE = REGISTRY.register("tennessee", () -> new TennesseeItem());
	public static final RegistryObject<Item> LIBERATORS = REGISTRY.register("liberators", () -> new LiberatorsItem());
	public static final RegistryObject<Item> TRAIN_TEST_SPAWN_EGG = REGISTRY.register("train_test_spawn_egg", () -> new ForgeSpawnEggItem(MoreVanillaModEntities.TRAIN_TEST, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> CALL_OF_SILENCE = REGISTRY.register("call_of_silence", () -> new CallOfSilenceItem());
	public static final RegistryObject<Item> CALL_OF_SILENCE_PIANO = REGISTRY.register("call_of_silence_piano", () -> new CallOfSilencePianoItem());
}
