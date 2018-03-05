package fr.mrlebest.craftingmod.common.creativetabs;

import fr.mrlebest.craftingmod.block.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CraftingModFoodCreativeTabs extends CreativeTabs {

	public CraftingModFoodCreativeTabs(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Blocks.blockCaisse);
	}

}
