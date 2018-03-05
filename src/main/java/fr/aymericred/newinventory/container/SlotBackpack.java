package fr.aymericred.newinventory.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.aymericred.newinventory.client.gui.GuiPlayerAdv;
import fr.aymericred.newinventory.utils.BagpackUtils.IBagpack;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBackpack extends Slot 
{
	private final EntityPlayer player;
	private final boolean locked;
	
	public SlotBackpack(IInventory inventory, int id, int x, int y, EntityPlayer player, boolean locked)
	{
		super(inventory, id, x, y);
		this.player = player;
		this.locked = locked;
	}
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return !locked && stack.getItem() instanceof IBagpack;
	}
	@Override
	public boolean canTakeStack(EntityPlayer p_82869_1_) {
		return !locked && super.canTakeStack(p_82869_1_);
	}
	@Override
	public void onSlotChanged() 
	{
		super.onSlotChanged();
		((InventoryPlayerAdv)player.inventory).currentBag = getStack();
	}
	@Override
	public void onPickupFromSlot(EntityPlayer player, ItemStack stack)
	{
		super.onPickupFromSlot(player, stack);
	}
}
