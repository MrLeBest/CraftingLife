package fr.mrlebest.craftingmod.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.client.gui.GuiAnimation;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class PacketOpenGui implements IMessage
{
    public PacketOpenGui()
    {}

    @Override
    public void fromBytes(ByteBuf buf)
    {}

    @Override
    public void toBytes(ByteBuf buf)
    {}

    public static class Handler implements IMessageHandler<PacketOpenGui, IMessage>
    {
    @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(PacketOpenGui message, MessageContext ctx)
        {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            Minecraft.getMinecraft().displayGuiScreen(new GuiAnimation());//On fait un packet car si on utilise la classe Minecraft côté serveur en multijoueur ça crash!
            System.out.println("Ca marche le Gui !");
            return null;
        }
    }
}
