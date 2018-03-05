package fr.mrlebest.craftingmod.item.drink;

import fr.mrlebest.craftingmod.item.ItemDrink;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodBiere extends ItemDrink
{


	public ItemFoodBiere(short healedThirstAmount, float addedSaturation)
    {
        super(healedThirstAmount, addedSaturation);
    }

    protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
	{
		player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 0));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0));

	}

}