
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ngbatz.createnuclearwar.init;

import net.ngbatz.createnuclearwar.item.UraniumPowderItem;
import net.ngbatz.createnuclearwar.item.UraniumItem;
import net.ngbatz.createnuclearwar.item.NuclearFuelItem;
import net.ngbatz.createnuclearwar.item.HazmatSuitItem;
import net.ngbatz.createnuclearwar.CreateNuclearWarMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class CreateNuclearWarModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateNuclearWarMod.MODID);
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> NUCLEAR_POWER_CONDUCTOR = block(CreateNuclearWarModBlocks.NUCLEAR_POWER_CONDUCTOR);
	public static final RegistryObject<Item> NUCLEAR_FUEL = REGISTRY.register("nuclear_fuel", () -> new NuclearFuelItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(CreateNuclearWarModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> HAZMAT_SUIT_HELMET = REGISTRY.register("hazmat_suit_helmet", () -> new HazmatSuitItem.Helmet());
	public static final RegistryObject<Item> HAZMAT_SUIT_CHESTPLATE = REGISTRY.register("hazmat_suit_chestplate", () -> new HazmatSuitItem.Chestplate());
	public static final RegistryObject<Item> HAZMAT_SUIT_LEGGINGS = REGISTRY.register("hazmat_suit_leggings", () -> new HazmatSuitItem.Leggings());
	public static final RegistryObject<Item> HAZMAT_SUIT_BOOTS = REGISTRY.register("hazmat_suit_boots", () -> new HazmatSuitItem.Boots());
	public static final RegistryObject<Item> COMPACTED_URANIUM = block(CreateNuclearWarModBlocks.COMPACTED_URANIUM);
	public static final RegistryObject<Item> NUKE = block(CreateNuclearWarModBlocks.NUKE);
	public static final RegistryObject<Item> URANIUM_POWDER = REGISTRY.register("uranium_powder", () -> new UraniumPowderItem());
	public static final RegistryObject<Item> URANIUM_MONSTER_SPAWN_EGG = REGISTRY.register("uranium_monster_spawn_egg", () -> new ForgeSpawnEggItem(CreateNuclearWarModEntities.URANIUM_MONSTER, -16724992, -16751104, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
