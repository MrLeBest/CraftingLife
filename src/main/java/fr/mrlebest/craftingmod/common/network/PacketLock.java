package fr.mrlebest.craftingmod.common.network;

import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.network.PacketBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;

public class PacketLock extends PacketBase
{

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
            List vehicles = playerEntity.worldObj.getEntitiesWithinAABB(EntityVehicle.class, playerEntity.boundingBox.expand(5.0D, 5.0D, 5.0D));
            if(vehicles.size() == 0)
            {
                playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Vous étes trop loin de votre véhicule."));
            }
            for(Object o : vehicles)
            {
            if(o instanceof EntityVehicle)
            {
                EntityVehicle vehicle = (EntityVehicle)o;
                if (vehicle.getOwner().getId().equals(playerEntity.getGameProfile().getId()))
                {
                	playerEntity.worldObj.playSoundToNearExcept(playerEntity, "craftingmod:", 1.0F, 1.0F);
                	if (vehicle.isVehicleLocked()){
                		vehicle.setVehicleLocked(false);
                	}else{
                		vehicle.setVehicleLocked(true);
                	}
                    if(vehicle.isVehicleLocked())
                    {
                       // System.out.println("Vehicule de " + vehicle.getOwner() + vehicle.getVehicleType().shortName + vehicle.isVehicleLocked());
                        playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Votre véhicule est verrouillé."));
                    }
                    else
                    {
                        //System.out.println("Vehicule de " + vehicle.getOwner() + vehicle.getVehicleType().shortName + vehicle.isVehicleLocked());
                        playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.GREEN + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + " Votre véhicule est déverrouillé."));
                    }

                }
                else{
                    //System.out.println("Vehicule de " + vehicle.getOwner() + vehicle.getVehicleType().shortName +  vehicle.isVehicleLocked());
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Ce n'est pas votre véhicule."));
                }
            }
            }
        }


    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) 
    {
        FlansMod.log("Received driveable repair packet on client side. Skipping.");
    }


}
		

