package fr.aymericred.newinventory.utils;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.Constants;

public class BagpackUtils
{
	public static ItemStack setContents(ItemStack stack, InventoryBasic backpackInv)
	{
		NBTTagCompound tag = new NBTTagCompound();
		NBTTagCompound t;
		ItemStack s;
		for(int i=0;i<backpackInv.getSizeInventory();i++)
		{
			t = new NBTTagCompound();
			s = backpackInv.getStackInSlot(i);
			if(s != null)
			{
				s.writeToNBT(t);
				tag.setTag("Content"+i, t);
			}
		}
		stack.setTagCompound(tag);
		return stack;
	}
	public static InventoryBasic fillContents(ItemStack stack, InventoryBasic inv)
	{
		NBTTagCompound tag = stack.getTagCompound();
		if(tag == null)
			return inv;
		ItemStack s;
		for(int i=0;i<Math.min(inv.getSizeInventory(), ((IBagpack)stack.getItem()).getSize());i++)
		{
			if(tag.hasKey("Content"+i, Constants.NBT.TAG_COMPOUND))
			{
				s = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Content"+i));
				inv.setInventorySlotContents(i, s);
			}
			else
				inv.setInventorySlotContents(i, null);
		}
		return inv;
	}
	
	//TODO tes sacs devront implémenter cette interface
	public static interface IBagpack
	{
		/**
		 * @return The number of slots of the bag
		 */
		public int getSize();
		/**
		 * @return The bag id, used to bind the correct bag gui texture
		 */
		public int getId();
	}
}
