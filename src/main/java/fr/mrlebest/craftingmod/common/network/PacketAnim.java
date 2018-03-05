package fr.mrlebest.craftingmod.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketAnim implements IMessage
{
    public int animid;

    public PacketAnim()
    {}

    public PacketAnim(int animid)
    {
        this.animid = animid;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.animid = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(animid);

    }

    public static class CommonHandler implements IMessageHandler<PacketAnim, IMessage>
    {
        @Override
        public IMessage onMessage(PacketAnim message, MessageContext ctx)
        {
            EntityPlayerMP player = ctx.getServerHandler().playerEntity;
            ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
            props.setAnimId(message.animid);
            /*props.tickHand = 0;
            props.tick = 0;*/

            return null;
        }
    }

}
