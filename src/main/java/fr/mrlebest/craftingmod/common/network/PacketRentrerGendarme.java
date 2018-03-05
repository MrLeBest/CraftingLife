package fr.mrlebest.craftingmod.common.network;

import java.util.List;

import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.network.PacketBase;

import fr.mrlebest.craftingmod.tileentity.TileEntityGarage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class PacketRentrerGendarme extends PacketBase
{

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity)
    {
        List vehicles = playerEntity.worldObj.getEntitiesWithinAABB(EntityVehicle.class, playerEntity.boundingBox.expand(10.0D, 10.0D, 10.0D));
        System.out.println(vehicles);
        if(vehicles.size() == 0)
        {
            playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Il n'y a pas de vehicule dans les environ."));
        }
        else
        {
            for(Object o : vehicles)
            {
                for(int k = 0; k < TileEntityGarage.lastsVehicleGendarme.size(); k++)
                {

                    if(o instanceof EntityVehicle)
                    {
                        EntityVehicle vehicle = (EntityVehicle)o;
                        if(vehicle.getOwner().getId().equals(playerEntity.getGameProfile().getId()))
                        {
                            if(vehicle.getVehicleType().shortName.equals(TileEntityGarage.lastsVehicleGendarme.get(k)))
                            {
                                TileEntityGarage.lastsVehicleGendarme.remove(vehicle.getVehicleType().shortName);
                                playerEntity.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.GREEN + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + " Le vehicule a bien ete mit dans votre garage."));
                                vehicle.setDead();
                            }
                            else
                            {
                                playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Veuillez selectionner le bon vehicule."));
                            }
                        }
                        else
                        {
                            playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Vous ne pouvez pas mettre dans votre garage le vehicule des autres !"));
                        }
                    }
                    else
                    {
                        playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Il y'a trop de vehicule !"));
                    }

                }

            }

        }
    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer)
    {
        // TODO Auto-generated method stub

    }

}
