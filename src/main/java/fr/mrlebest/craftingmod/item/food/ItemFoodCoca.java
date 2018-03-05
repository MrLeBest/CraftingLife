package fr.mrlebest.craftingmod.item.food;

import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodCoca extends ItemFood {
	private ExtPropCraftingLife props;

	public ItemFoodCoca(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setAlwaysEdible();
	}

	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		props = ExtPropCraftingLife.get(player);

		if (world.isRemote) {
			// props.thirstCurrent += 25;
		}
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.drink;
	}
}
