
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.morevanilla.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MoreVanillaModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.COBBLESTONE),

					new ItemStack(MoreVanillaModItems.TENDOLLAR.get(), 2), 1000, 2, 0.013f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.WHEAT),

					new ItemStack(MoreVanillaModItems.CENT.get()), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 3), 100, 3, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.IRON_ORE),

					new ItemStack(MoreVanillaModItems.DOLLAR.get()), 100, 3, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 5), 50, 10, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.GOLD_ORE),

					new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 2), 50, 10, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT),

					new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 64), 10, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_ORE),

					new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 15), 10, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.DIAMOND),

					new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 41), 10, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.COPPER_ORE),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 2), 1000, 5, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 45), 1000, 5, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.COAL),

					new ItemStack(MoreVanillaModItems.DOLLAR.get()), 1000, 5, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.COAL_BLOCK),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 9), 1000, 5, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EGG),

					new ItemStack(MoreVanillaModItems.DIME.get()), 1000, 5, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.MUTTON),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 5), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.PORKCHOP),

					new ItemStack(MoreVanillaModItems.DOLLAR.get()), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.BEEF),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 20), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.CHICKEN),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 6), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_MUTTON),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 6), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_PORKCHOP),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 5), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_BEEF),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 22), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COOKED_CHICKEN),

					new ItemStack(MoreVanillaModItems.DOLLAR.get(), 10), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 20),

					new ItemStack(Blocks.COBBLESTONE), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.CENT.get()),

					new ItemStack(Blocks.WHEAT), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 3),

					new ItemStack(Items.IRON_INGOT), 1000, 2, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get()),

					new ItemStack(Blocks.IRON_ORE), 1000, 2, 0.05f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 5),

					new ItemStack(Items.EMERALD), 1000, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 2),

					new ItemStack(Blocks.GOLD_ORE), 1000, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 64),

					new ItemStack(Items.GOLD_INGOT), 1000, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 15),

					new ItemStack(Blocks.DIAMOND_ORE), 1000, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.ONEHUNDRED_DOLLAR.get(), 41),

					new ItemStack(Items.DIAMOND), 1000, 20, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 2),

					new ItemStack(Blocks.COPPER_ORE), 1000, 2, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 45),

					new ItemStack(Items.COPPER_INGOT), 1000, 2, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get()),

					new ItemStack(Items.COAL), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 9),

					new ItemStack(Blocks.COAL_BLOCK), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DIME.get()),

					new ItemStack(Items.EGG), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 5),

					new ItemStack(Items.MUTTON), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get()),

					new ItemStack(Items.PORKCHOP), 1000, 1, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 20),

					new ItemStack(Items.BEEF), 1000, 3, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 6),

					new ItemStack(Items.CHICKEN), 1000, 2, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 6),

					new ItemStack(Items.COOKED_MUTTON), 1000, 4, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 5),

					new ItemStack(Items.COOKED_PORKCHOP), 1000, 4, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 22),

					new ItemStack(Items.COOKED_BEEF), 1000, 4, 0f));
		}
		if (event.getType() == MoreVanillaModVillagerProfessions.PROSPECTOR_PROVISIONS_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreVanillaModItems.DOLLAR.get(), 10),

					new ItemStack(Items.COOKED_CHICKEN), 1000, 4, 0f));
		}
	}
}
