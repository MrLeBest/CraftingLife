package fr.aymericred.newinventory.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ContainerBaseInv extends Container 
{
    protected final EntityPlayer thePlayer;
    protected final InventoryBasic backpackSlot = new InventoryBasic("backpack.slot", false, 1);

    public ContainerBaseInv(final InventoryPlayerAdv playerInv, EntityPlayer player, int xOffset)
    {
        this.thePlayer = player;
		backpackSlot.setInventorySlotContents(0, playerInv.currentBag);

        int i, j;
        for (i = 0; i < 4; ++i)
        {
            final int k = i;
            this.addSlotToContainer(new Slot(playerInv, playerInv.getSizeInventory() - 1 - i, 54+xOffset, 11 + i * 17)
            {
                public int getSlotStackLimit()
                {
                    return 1;
                }
                public boolean isItemValid(ItemStack p_75214_1_)
                {
                    if (p_75214_1_ == null) return false;
                    return p_75214_1_.getItem().isValidArmor(p_75214_1_, k, thePlayer);
                }
                @SideOnly(Side.CLIENT)
                public IIcon getBackgroundIconIndex()
                {
                    return ItemArmor.func_94602_b(k);
                }
            });
        }
        int l = 0;
        for (i = 0; i < 2; ++i) //Inventory
        {
            for (j = 0; j < 3; ++j)
            {
                this.addSlotToContainer(new Slot(playerInv, l, 5+j*17+xOffset, 91+i*17));
                l++;
            }
        }
    }
    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_)
    {
        return true;
    }
    private final Slot fakeSlot = new Slot(new InventoryBasic("Fake", false, 1), 0, -40, -40);
    @Override
    public Slot getSlot(int p_75139_1_) 
    {
    	if(p_75139_1_ >= inventorySlots.size())
    		return fakeSlot;
    	return super.getSlot(p_75139_1_);
    }
	@Override
    public void onContainerClosed(EntityPlayer p_75134_1_)
    {
        super.onContainerClosed(p_75134_1_);
    }
	@Override
	public void detectAndSendChanges() 
	{
		/*if(!thePlayer.getEntityWorld().isRemote)
			((InventoryPlayerAdv)thePlayer.inventory).currentBag = backpackSlot.getStackInSlot(0);*/
		if(!thePlayer.getEntityWorld().isRemote || thePlayer.capabilities.isCreativeMode)
			super.detectAndSendChanges();
	}
    @Override
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
    	return null;
    }
    public InventoryBasic getBackpackSlot() {
		return backpackSlot;
	}   
}
