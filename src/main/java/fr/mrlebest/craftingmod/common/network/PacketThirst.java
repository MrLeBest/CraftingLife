package fr.mrlebest.craftingmod.common.network;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.handlers.gamelogic.ThirstStats;
import fr.mrlebest.craftingmod.proxy.ClientProxy;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketThirst implements IMessage
{

    public short currentThirstLevel = 0;

    public PacketThirst()
    {

    }

    public PacketThirst(short currentThirstLevel)
    {
        this.currentThirstLevel = currentThirstLevel;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.currentThirstLevel = buf.readShort();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeShort(currentThirstLevel);

    }

    public static class ClientHandler implements IMessageHandler<PacketThirst, IMessage>
    {
        @Override
        @SideOnly(Side.CLIENT)
        public IMessage onMessage(PacketThirst message, MessageContext ctx)
        {

            ExtPropCraftingLife.get(Minecraft.getMinecraft().thePlayer).thirstSystem.setThirstLevel(message.currentThirstLevel);
            return null;
        }
    }

}