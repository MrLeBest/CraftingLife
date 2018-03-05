package fr.mrlebest.craftingmod.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fr.mrlebest.craftingmod.common.entity.EntityConcessionnaire;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

public class PacketConcessionnaire implements IMessage
{
    public int id;
    public int concessEntity;

    public PacketConcessionnaire()
    {}

    public PacketConcessionnaire(int concessEntity, int id)
    {
        this.concessEntity = concessEntity;
        this.id = id;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.id = buf.readInt();
        this.concessEntity = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(id);
        buf.writeInt(concessEntity);

    }

    public static class CommonHandler implements IMessageHandler<PacketConcessionnaire, IMessage>
    {
        @Override
        public IMessage onMessage(PacketConcessionnaire message, MessageContext ctx)
        {
            Entity concessEntity = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.concessEntity);
            if(concessEntity instanceof EntityConcessionnaire)
            {
                EntityConcessionnaire concess = (EntityConcessionnaire)concessEntity;
                /*System.out.println(concessEntity);
                System.out.println(message.concessEntity);
                System.out.println(message.id);*/
                concess.setConcessionnaire(message.id);
            }
            return null;
        }
    }

}
