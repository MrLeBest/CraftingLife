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
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketGarage implements IMessage
{

    public List<String> vehiculeList = new ArrayList<String>();

    public PacketGarage()
    {

    }

    public PacketGarage(List<String> vehiculeList)
    {
        this.vehiculeList = vehiculeList;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {

        this.vehiculeList = new ArrayList<String>();
        int size = buf.readInt();
        for(int i = 0; i < size; i++)
            vehiculeList.add(ByteBufUtils.readUTF8String(buf));
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(vehiculeList.size());
        for(int i = 0; i < vehiculeList.size(); i++)
            ByteBufUtils.writeUTF8String(buf, vehiculeList.get(i));
    }

    public static class ClientHandler implements IMessageHandler<PacketGarage, IMessage>
    {
        @Override
        @SideOnly(Side.CLIENT)
        public IMessage onMessage(PacketGarage message, MessageContext ctx)
        {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
            props.vehiculeList = message.vehiculeList;
            // System.out.println("paquet " + props.vehiculeList + " " + message.vehiculeList);
            return null;
        }
    }

    public static class CommonHandler implements IMessageHandler<PacketGarage, IMessage>
    {
        @Override
        public IMessage onMessage(PacketGarage message, MessageContext ctx)
        {
            EntityPlayerMP player = ctx.getServerHandler().playerEntity;
            ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
            props.vehiculeList = message.vehiculeList;
            return null;
        }
    }
}