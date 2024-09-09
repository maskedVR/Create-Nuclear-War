
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ngbatz.createnuclearwar.init;

import net.ngbatz.createnuclearwar.block.entity.NuclearPowerConductorBlockEntity;
import net.ngbatz.createnuclearwar.CreateNuclearWarMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class CreateNuclearWarModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateNuclearWarMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NUCLEAR_POWER_CONDUCTOR = register("nuclear_power_conductor", CreateNuclearWarModBlocks.NUCLEAR_POWER_CONDUCTOR, NuclearPowerConductorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
