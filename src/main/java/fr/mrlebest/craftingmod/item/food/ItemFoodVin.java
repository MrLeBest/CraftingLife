package fr.mrlebest.craftingmod.item.food;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFoodVin
  extends ItemFood
{
  public ItemFoodVin(int amount, float saturation, boolean isWolfFood)
  {
    super(amount, saturation, isWolfFood);
    setAlwaysEdible();
  }
  
  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
      return EnumAction.drink;
  }
}
