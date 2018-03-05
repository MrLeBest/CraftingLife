package fr.aymericred.newinventory.container;

import fr.mrlebest.craftingmod.common.CraftingMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;

public class ContainerPlayerAdv extends ContainerBaseInv 
{
    public ContainerPlayerAdv(final InventoryPlayer playerInv, EntityPlayer player)
    {
    	super((InventoryPlayerAdv) playerInv, player, -1);
        this.addSlotToContainer(new SlotBackpack(backpackSlot, 0, 4, 141, player, false) {
        	@Override
        	public boolean canTakeStack(EntityPlayer p_82869_1_) {
        		return false;
        	}
        }); //Bagpack
        //bag = ((InventoryPlayerAdv)thePlayer.inventory).currentBag != null;
    }
    //public boolean bag;
    @Override
    public void detectAndSendChanges() {
    	super.detectAndSendChanges();
    	if(getBackpackSlot().getStackInSlot(0) != ((InventoryPlayerAdv)thePlayer.inventory).currentBag)
    		getBackpackSlot().setInventorySlotContents(0, ((InventoryPlayerAdv)thePlayer.inventory).currentBag);
    	if((((InventoryPlayerAdv)thePlayer.inventory).currentBag!=null))// != bag)
    	{
    		//bag = ((InventoryPlayerAdv)thePlayer.inventory).currentBag != null;
    		/*for(ICrafting c : ((List<ICrafting>)crafters)) {
    			c.sendProgressBarUpdate(this, 481, bag?1:0);
    		}*/
    		thePlayer.openGui(CraftingMod.instance, 1, null, 0, 0, 0);
    	}
    }
    /*@Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int p_75137_1_, int p_75137_2_) {
    	if(p_75137_1_ == 481) {
    		bag = p_75137_2_ == 1;
    	}
    }*/
}
