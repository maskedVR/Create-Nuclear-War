package net.ngbatz.createnuclearwar.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.world.level.LevelAccessor;

import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.eventbus.api.Event;
import net.ngbatz.createnuclearwar.CreateNuclearWarMod;
import net.ngbatz.createnuclearwar.init.CreateNuclearWarModItems;

@Mod.EventBusSubscriber
public class UraniumItemInInventoryTickProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;

		if (entity instanceof Player _player) {
			// Check if the player has Uranium in their inventory
			boolean hasUranium = _player.getInventory().contains(new ItemStack(CreateNuclearWarModItems.URANIUM.get()));

			// Check if the player is wearing a full set of hazmat armor
			boolean isWearingHazmatArmor = 
				_player.getItemBySlot(EquipmentSlot.HEAD).getItem() == CreateNuclearWarModItems.HAZMAT_SUIT_HELMET.get() &&
				_player.getItemBySlot(EquipmentSlot.CHEST).getItem() == CreateNuclearWarModItems.HAZMAT_SUIT_CHESTPLATE.get() &&
				_player.getItemBySlot(EquipmentSlot.LEGS).getItem() == CreateNuclearWarModItems.HAZMAT_SUIT_LEGGINGS.get() &&
				_player.getItemBySlot(EquipmentSlot.FEET).getItem() == CreateNuclearWarModItems.HAZMAT_SUIT_BOOTS.get();

			if (hasUranium && !isWearingHazmatArmor) {
				// Apply effects if the player has Uranium and is not wearing hazmat armor
				CreateNuclearWarMod.queueServerWork(80, () -> {
					if (!_player.level().isClientSide() && _player.getServer() != null) {
						_player.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(
								CommandSource.NULL, 
								_player.position(), 
								_player.getRotationVector(), 
								_player.level() instanceof ServerLevel ? (ServerLevel) _player.level() : null, 
								4, 
								_player.getName().getString(), 
								_player.getDisplayName(), 
								_player.level().getServer(), 
								_player
							), 
							"effect @p weakness 999 5"
						);
					}
					_player.getFoodData().setFoodLevel(5);

					CreateNuclearWarMod.queueServerWork(120, () -> {
						if (!_player.level().isClientSide() && _player.getServer() != null) {
							_player.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(
									CommandSource.NULL, 
									_player.position(), 
									_player.getRotationVector(), 
									_player.level() instanceof ServerLevel ? (ServerLevel) _player.level() : null, 
									4, 
									_player.getName().getString(), 
									_player.getDisplayName(), 
									_player.level().getServer(), 
									_player
								), 
								"effect @p poison 999 5"
							);
						}
					});
				});
			}
		}
	}
}
