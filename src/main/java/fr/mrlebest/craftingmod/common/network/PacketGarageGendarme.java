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

public class PacketGarageGendarme implements IMessage
{
    
    public List<String> vehiculeGendarme = new ArrayList<String>();
    
    public PacketGarageGendarme()
    {
        
    }

    public PacketGarageGendarme(List<String> vehiculeGendarme)
    {
        this.vehiculeGendarme = vehiculeGendarme;
    }
    
    @Override
    public void fromBytes(ByteBuf buf) 
    {
        
        this.vehiculeGendarme = new ArrayList<String>();
        int size = buf.readInt();
        for(int i = 0; i < size; i++)
        vehiculeGendarme.add(ByteBufUtils.readUTF8String(buf));
    }

    @Override
    public void toBytes(ByteBuf buf) 
    {
        buf.writeInt(vehiculeGendarme.size());
        for(int i=0;i<vehiculeGendarme.size();i++)
        {
            ByteBufUtils.writeUTF8String(buf, vehiculeGendarme.get(i));
        }
    }
    
    public static class ClientHandler implements IMessageHandler<PacketGarageGendarme, IMessage>
    {
        @Override
        @SideOnly(Side.CLIENT)
        public IMessage onMessage(PacketGarageGendarme message, MessageContext ctx) 
        {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
            props.vehiculeGendarme = message.vehiculeGendarme;
            //System.out.println("paquet " + props.vehiculeGendarme + " " + message.vehiculeGendarme);
            return null;
        }
    }
    public static class CommonHandler implements IMessageHandler<PacketGarageGendarme, IMessage>
    {
        @Override
        public IMessage onMessage(PacketGarageGendarme message, MessageContext ctx) 
        {
            EntityPlayerMP player = ctx.getServerHandler().playerEntity;
            ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
            props.vehiculeGendarme = message.vehiculeGendarme;
            return null;
        }
    }
}