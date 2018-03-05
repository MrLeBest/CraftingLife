package fr.mrlebest.craftingmod.common.network;

import java.util.ArrayList;
import java.util.List;

import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.network.PacketBase;

import fr.mrlebest.craftingmod.event.CmEventHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class PacketKlaxon extends PacketBase{
	

	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) {
		EntitySeat s = (EntitySeat)playerEntity.ridingEntity;
		if (playerEntity.ridingEntity instanceof EntitySeat){
		if(s.driveable instanceof EntityVehicle)
		{
		    EntityVehicle v = (EntityVehicle)s.driveable;
		    
		    if(CmEventHandler.playerinpolicecar.contains(v))
		    {
		    	playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Sirene de police désactivé !"));
		        CmEventHandler.playerinpolicecar.remove(v);
		    }
		    else
		    {
		 		playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.GREEN + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + " Sirene de police activé !"));
		       CmEventHandler.playerinpolicecar.add(v);
		    }
		}
		}
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) {
		// TODO Auto-generated method stub
		
	}

}
