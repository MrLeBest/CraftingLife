package fr.mrlebest.craftingmod.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

public class PacketDead implements IMessage
{
    public int entity;

    public PacketDead()
    {}

    public PacketDead(int entity)
    {
        this.entity = entity;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.entity = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(entity);

    }

    public static class CommonHandler implements IMessageHandler<PacketDead, IMessage>
    {
        @Override
        public IMessage onMessage(PacketDead message, MessageContext ctx)
        {
            Entity entity = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);
            entity.setDead();
            return null;
        }
    }

}
