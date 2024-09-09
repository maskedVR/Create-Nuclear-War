
package net.ngbatz.createnuclearwar.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NuclearFuelItem extends Item {
	public NuclearFuelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
