
package net.ngbatz.createnuclearwar.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UraniumPowderItem extends Item {
	public UraniumPowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
