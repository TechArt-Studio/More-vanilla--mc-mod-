
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morevanilla.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.morevanilla.MoreVanillaMod;

public class MoreVanillaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreVanillaMod.MODID);
	public static final RegistryObject<SoundEvent> MYSUNSET = REGISTRY.register("mysunset", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_vanilla", "mysunset")));
	public static final RegistryObject<SoundEvent> ILLUSIONARYDAYTIME = REGISTRY.register("illusionarydaytime", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_vanilla", "illusionarydaytime")));
	public static final RegistryObject<SoundEvent> RIVERFLOWSINYOU = REGISTRY.register("riverflowsinyou", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_vanilla", "riverflowsinyou")));
	public static final RegistryObject<SoundEvent> TENNESSE = REGISTRY.register("tennesse", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_vanilla", "tennesse")));
	public static final RegistryObject<SoundEvent> LIBERATORS = REGISTRY.register("liberators", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_vanilla", "liberators")));
	public static final RegistryObject<SoundEvent> CALL_OF_SILENCE_SAWANO_HIROYUKI = REGISTRY.register("call_of_silence_sawano_hiroyuki",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_vanilla", "call_of_silence_sawano_hiroyuki")));
	public static final RegistryObject<SoundEvent> CALL_OF_SILENCE_PIANO = REGISTRY.register("call_of_silence_piano", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("more_vanilla", "call_of_silence_piano")));
}
