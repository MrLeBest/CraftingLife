package fr.aymericred.newinventory.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.aymericred.newinventory.container.ContainerPlayerAdv;
import fr.aymericred.newinventory.container.InventoryPlayerAdv;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class CommonEventHandler 
{
	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			((EntityPlayer)event.entity).inventory = new InventoryPlayerAdv((EntityPlayer) event.entity, ((EntityPlayer)event.entity).inventory);//Todo read data from old
			((EntityPlayer)event.entity).openContainer = ((EntityPlayer)event.entity).inventoryContainer = new ContainerPlayerAdv(((EntityPlayer)event.entity).inventory, (EntityPlayer) event.entity);
		}
	}
}
