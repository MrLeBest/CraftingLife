package fr.aymericred.newinventory.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.aymericred.newinventory.client.gui.GuiPlayerAdv;
import fr.aymericred.newinventory.utils.BagpackUtils;
import fr.aymericred.newinventory.utils.BagpackUtils.IBagpack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBagpack extends ContainerBaseInv
{
	private ItemStack bagIn;
	private InventoryBasic bagInv;
	
	public ContainerBagpack(InventoryPlayer playerInv, EntityPlayer player, ItemStack bagIn) {
		super((InventoryPlayerAdv) playerInv, player, 50);
		this.bagIn = bagIn;
		this.bagInv = BagpackUtils.fillContents(bagIn, new InventoryBasic("bag.inv", false, ((IBagpack)bagIn.getItem()).getSize()));
		
        int l = 0;
        /*for (int i = 0; i < 2; ++i) //Inventory
        {
            for (int j = 0; j < 3; ++j)
            {
                this.addSlotToContainer(new Slot(playerInv, l, 54+j*17, 91+i*17));
                l++;
            }
        }
        
        l=0;*/
        switch (getBagIn().getId()) {
		case 0:
            this.addSlotToContainer(new BagSlot(bagInv, 0, 29, 15));
            this.addSlotToContainer(new BagSlot(bagInv, 1, 29, 32));
			break;
		case 1:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<3;j++)
				{
		            this.addSlotToContainer(new BagSlot(bagInv, l, 9+i*17, 13+j*17));
		            l++;
				}
			}
			break;
		case 2:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<4;j++)
				{
		            this.addSlotToContainer(new BagSlot(bagInv, l, 9+i*17, 13+j*17));
		            l++;
				}
			}
			break;
		case 3:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<6;j++)
				{
		            this.addSlotToContainer(new BagSlot(bagInv, l, 9+i*17, 13+j*17));
		            l++;
				}
			}
			break;
		}
        this.addSlotToContainer(new SlotBackpack(backpackSlot, 0, 55, 141, player, false) {
        	@Override
        	public boolean isItemValid(ItemStack stack) {
        		return false;
        	}
        	@Override
        	public void onPickupFromSlot(EntityPlayer player, ItemStack stack) {
        		super.onPickupFromSlot(player, stack);
        		if(!player.worldObj.isRemote)
        		{
        			//System.out.println("Remove srv");
        			//player.inventory.setItemStack(null);
        			((EntityPlayerMP)player).closeContainer();
        			//player.inventory.setItemStack(stack);
        		}
        		else
        		{
        			//System.out.println("Remove client");
        			//player.inventory.setItemStack(null);
        			openNormalInv();
        			//player.inventory.setItemStack(stack);
        		}
        	}
        }); //Bagpack
	}

	@Override
	public void onContainerClosed(EntityPlayer p_75134_1_) {
		BagpackUtils.setContents(bagIn, bagInv);
	}
	public IBagpack getBagIn() {
		return (IBagpack) bagIn.getItem();
	}
	public static class BagSlot extends Slot
	{
    	public BagSlot(IInventory inv, int p_i1824_2_, int p_i1824_3_, int p_i1824_4_) {
			super(inv, p_i1824_2_, p_i1824_3_, p_i1824_4_);
		}
		@Override
    	public boolean isItemValid(ItemStack p_75214_1_) {
    		return p_75214_1_ == null || !(p_75214_1_.getItem() instanceof IBagpack);
    	}
	}
	@SideOnly(Side.CLIENT)
	public void openNormalInv() {
		Minecraft.getMinecraft().displayGuiScreen(new GuiPlayerAdv(thePlayer));
	}
}
