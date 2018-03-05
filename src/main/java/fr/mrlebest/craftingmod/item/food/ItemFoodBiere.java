package fr.mrlebest.craftingmod.item.food;

import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodBiere extends ItemFood
{
	private ExtPropCraftingLife props;

	public ItemFoodBiere(int amount, float saturation, boolean isWolfFood)
	{
		super(amount, saturation, isWolfFood);
		setAlwaysEdible();
	}

	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
	{
		props = ExtPropCraftingLife.get(player);
		player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 0));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0));
		if (world.isRemote) {
			// props.thirstCurrent += 20;
		}

	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.drink;
	}
}