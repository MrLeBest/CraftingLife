package fr.mrlebest.craftingmod.common.network;

import java.util.List;

import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.network.PacketBase;

import fr.mrlebest.craftingmod.client.gui.GuiScreenPolice;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class PacketGuiPolice extends PacketBase{


	    @Override
	    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	    {
	    }

	    @Override
	    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	    {
	    }
	    

	    @Override
	    public void handleServerSide(EntityPlayerMP playerEntity) 
	    {

	        }

		@Override
		public void handleClientSide(EntityPlayer clientPlayer) {

	    	Minecraft.getMinecraft().displayGuiScreen(new GuiScreenPolice(clientPlayer));
		}

}
