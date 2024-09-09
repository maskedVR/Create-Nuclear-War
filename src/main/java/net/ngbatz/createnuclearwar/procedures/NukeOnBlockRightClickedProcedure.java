package net.ngbatz.createnuclearwar.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class NukeOnBlockRightClickedProcedure {

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (world == null || entity == null)
            return;

        // Check if the entity is holding Flint and Steel in the main hand
        if (entity instanceof LivingEntity _entity) {
            ItemStack itemInMainHand = _entity.getMainHandItem();

            // If the item in the main hand is Flint and Steel
            if (itemInMainHand.getItem() == Items.FLINT_AND_STEEL) {
                // Nuke logic: Remove blocks in a 100-block radius

                // Radius for the nuke
                int radius = 50;

                // Loop through all blocks in a cube around the clicked block
                for (int xPos = (int) x - radius; xPos <= x + radius; xPos++) {
                    for (int yPos = (int) y - radius; yPos <= y + radius; yPos++) {
                        for (int zPos = (int) z - radius; zPos <= z + radius; zPos++) {
                            // Check if within a spherical radius
                            if (Math.sqrt(Math.pow(x - xPos, 2) + Math.pow(y - yPos, 2) + Math.pow(z - zPos, 2)) <= radius) {
                                // Get the block at the current position
                                BlockPos currentPos = new BlockPos(xPos, yPos, zPos);
                                BlockState blockState = world.getBlockState(currentPos);

                                // Set the block to air (delete it)
                                world.setBlock(currentPos, Blocks.AIR.defaultBlockState(), 3);
                            }
                        }
                    }
                }
            }
        }
    }
}
