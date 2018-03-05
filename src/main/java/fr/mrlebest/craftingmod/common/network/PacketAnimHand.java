package fr.mrlebest.craftingmod.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketAnimHand implements IMessage
{

    public int tick = 0;
    public double tickHand = 0, tickRightHand = 0, tickLeftHand = 0;
    public int playerId;

    public PacketAnimHand()
    {

    }

    public PacketAnimHand(int playerId, int tick, double tickHand, double tickRightHand, double tickLeftHand)
    {
        this.playerId = playerId;
        this.tick = tick;
        this.tickHand = tickHand;
        this.tickRightHand = tickRightHand;
        this.tickLeftHand = tickLeftHand;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.playerId = buf.readInt();
        this.tick = buf.readInt();
        this.tickHand = buf.readDouble();
        this.tickRightHand = buf.readDouble();
        this.tickLeftHand = buf.readDouble();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(playerId);
        buf.writeInt(tick);
        buf.writeDouble(tickHand);
        buf.writeDouble(tickRightHand);
        buf.writeDouble(tickLeftHand);
    }

    public static class CommonHandler implements IMessageHandler<PacketAnimHand, IMessage>
    {
        @Override
        public IMessage onMessage(PacketAnimHand message, MessageContext ctx)
        {
            EntityPlayerMP player = ctx.getServerHandler().playerEntity;
            ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
            props.tick = message.tick;
            props.tickHand = message.tickHand;
            props.tickRightHand = message.tickRightHand;
            props.tickLeftHand = message.tickLeftHand;
            System.out.println("Il est recu server");
            CraftingMod.network.sendToAll(new PacketAnimHand(message.playerId, message.tick, message.tickHand, message.tickRightHand, message.tickLeftHand));

            return null;
        }
    }

    public static class ClientHandler implements IMessageHandler<PacketAnimHand, IMessage>
    {
        @Override
        @SideOnly(Side.CLIENT)
        public IMessage onMessage(PacketAnimHand message, MessageContext ctx)
        {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
            props.tick = message.tick;
            props.tickHand = message.tickHand;
            props.tickRightHand = message.tickRightHand;
            props.tickLeftHand = message.tickLeftHand;
            System.out.println("Il est recu client");
            return null;

        }
    }
}