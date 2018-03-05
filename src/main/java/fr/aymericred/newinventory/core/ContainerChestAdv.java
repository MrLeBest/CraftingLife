package fr.aymericred.newinventory.core;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.aymericred.newinventory.InventoryMod;
import fr.aymericred.newinventory.container.ContainerBagpack.BagSlot;
import fr.aymericred.newinventory.container.InventoryPlayerAdv;
import fr.aymericred.newinventory.utils.BagpackUtils;
import fr.aymericred.newinventory.utils.BagpackUtils.IBagpack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerChestAdv extends InventoryMod
{
	private static IInventory storedPlayerInv, storedChestInv;
	private static boolean openingBagChest;
	
	@SideOnly(Side.CLIENT)
	public static IInventory setOpeningBagChest() {
		openingBagChest = true;
		return storedChestInv;
	}
	public static void constructor(IInventory p_i1806_1_, IInventory p_i1806_2_)
	{
		storedPlayerInv = p_i1806_1_;
		storedChestInv = p_i1806_2_;
	}
	public static void onAddCraftingToCrafters(Container cont)
	{
		if(cont instanceof ContainerChest)
		{
			if(storedPlayerInv != null && storedChestInv != null)
			{
				ContainerChest chestIn = (ContainerChest) cont;
				chestIn.lowerChestInventory = storedChestInv;
				chestIn.numRows = storedChestInv.getSizeInventory() / 9;
				storedChestInv.openInventory();
		        int i = (chestIn.numRows - 4) * 18;
		        int j;
		        int k;
		        
		        int offsetx = openingBagChest ? 50 : 0;
		        openingBagChest = false;
	
		        for (j = 0; j < chestIn.numRows; ++j)
		        {
		            for (k = 0; k < 9; ++k)
		            {
		            	chestIn.addSlotToContainer(new Slot(storedChestInv, k + j * 9, offsetx + 8 + k * 18, 18 + j * 18));
		            }
		        }
	
		        int l = 0;
		        for (k = 0; k < 2; ++k) //Inventory
		        {
		            for (j = 0; j < 3; ++j)
		            {
		            	chestIn.addSlotToContainer(new Slot(storedPlayerInv, l, offsetx + 62+j*18, 107+i+k*18));
		                l++;
		            }
		        }
		        ItemStack bagIn = ((InventoryPlayerAdv)storedPlayerInv).currentBag;
		        if(bagIn != null)
		        {
			        l = 0;
			        InventoryBasic bagInv = BagpackUtils.fillContents(bagIn, new InventoryBasic("bag.inv", false, ((IBagpack)bagIn.getItem()).getSize()));
			        switch (((IBagpack)bagIn.getItem()).getId()) {
					case 0:
						chestIn.addSlotToContainer(new BagSlot(bagInv, 0, 29, 15));
						chestIn.addSlotToContainer(new BagSlot(bagInv, 1, 29, 32));
						break;
					case 1:
						for(i=0;i<2;i++)
						{
							for(j=0;j<2;j++)
							{
								chestIn.addSlotToContainer(new BagSlot(bagInv, l, 9+i*17, 13+j*17));
					            l++;
							}
						}
						break;
					case 2:
						for(i=0;i<2;i++)
						{
							for(j=0;j<3;j++)
							{
								chestIn.addSlotToContainer(new BagSlot(bagInv, l, 9+i*17, 13+j*17));
					            l++;
							}
						}
						break;
					case 3:
						for(i=0;i<2;i++)
						{
							for(j=0;j<4;j++)
							{
								chestIn.addSlotToContainer(new BagSlot(bagInv, l, 9+i*17, 13+j*17));
					            l++;
							}
						}
						break;
					}
		        }
		        storedPlayerInv = storedChestInv = null;
			}
		}
	}
    public static ItemStack transferStackInSlot(ContainerChest chestIn, EntityPlayer p_82846_1_, int p_82846_2_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)chestIn.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ < chestIn.numRows * 9)
            {
                if (!chestIn.mergeItemStack(itemstack1, chestIn.numRows * 9, chestIn.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!chestIn.mergeItemStack(itemstack1, 0, chestIn.numRows * 9, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }
        return itemstack;
    }
    //TODO DO IT AND ASK FOR PAYMENT
    /**
	public void onContainerClosed(EntityPlayer p_75134_1_) {
		BagpackUtils.setContents(bagIn, bagInv);
		super.onContainerClosed(p_75134_1_);
	}
	*/
}
