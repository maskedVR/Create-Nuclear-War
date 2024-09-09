
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ngbatz.createnuclearwar.init;

import net.ngbatz.createnuclearwar.block.UraniumOreBlock;
import net.ngbatz.createnuclearwar.block.NukeBlock;
import net.ngbatz.createnuclearwar.block.NuclearPowerConductorBlock;
import net.ngbatz.createnuclearwar.block.CompactedUraniumBlock;
import net.ngbatz.createnuclearwar.CreateNuclearWarMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class CreateNuclearWarModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateNuclearWarMod.MODID);
	public static final RegistryObject<Block> NUCLEAR_POWER_CONDUCTOR = REGISTRY.register("nuclear_power_conductor", () -> new NuclearPowerConductorBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> COMPACTED_URANIUM = REGISTRY.register("compacted_uranium", () -> new CompactedUraniumBlock());
	public static final RegistryObject<Block> NUKE = REGISTRY.register("nuke", () -> new NukeBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
