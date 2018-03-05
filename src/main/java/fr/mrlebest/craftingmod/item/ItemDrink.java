package fr.mrlebest.craftingmod.item;

import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDrink extends Item
{
	public final short healedThirstAmount;
	public final float addedSaturation;
	
	public ItemDrink(short healedThirstAmount, float addedSaturation)
	{
		this.healedThirstAmount = healedThirstAmount;
		this.addedSaturation = addedSaturation;
		
		this.setCreativeTab(CraftingMod.craftingmodFoodCreativeTabs);
	}
	
    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.drink;
    }
    
    /**
     * called when player finishes to use item with a duration by holding right click
     */
    public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if (ExtPropCraftingLife.get(player).thirstSystem.getCurrentThirstLevel() != 0)
    	ExtPropCraftingLife.get(player).thirstSystem.addStatsFromDrinkStats(this);
    	return stack;
    }
    
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
        return p_77659_1_;
    }
}
