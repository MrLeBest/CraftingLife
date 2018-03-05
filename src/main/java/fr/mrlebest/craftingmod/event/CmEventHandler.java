package fr.mrlebest.craftingmod.event;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.client.KeyInputHandler;
import com.flansmod.common.driveables.EntityVehicle;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CmEventHandler {
	
	public static int sirene = 0;
	public static List<EntityVehicle> playerinpolicecar = new ArrayList<EntityVehicle>();
    
	
	@SubscribeEvent
	public void onTick(TickEvent.ServerTickEvent event)
	{
		++sirene;
	
		
		if(sirene == 370){

			for(EntityVehicle v : playerinpolicecar)
			{
        	    v.worldObj.playSoundAtEntity(v, "craftingmod:policesirene", 1.0F, 1.0F);
			}
			
			
			this.sirene = 0;
		}

	}

}
