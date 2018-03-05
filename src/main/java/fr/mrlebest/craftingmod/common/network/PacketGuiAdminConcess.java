package fr.mrlebest.craftingmod.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.client.gui.GuiScreenConcessAdmin;
import fr.mrlebest.craftingmod.client.gui.NewGuiConcessAdmin;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class PacketGuiAdminConcess implements IMessage
{

    @Override
    public void fromBytes(ByteBuf buf)
    {}

    @Override
    public void toBytes(ByteBuf buf)
    {}

    public static class Handler implements IMessageHandler<PacketGuiAdminConcess, IMessage>
    {
    @SideOnly(Side.CLIENT)
        @Override
        public IMessage onMessage(PacketGuiAdminConcess message, MessageContext ctx)
        {
            Minecraft.getMinecraft().displayGuiScreen(new NewGuiConcessAdmin(Minecraft.getMinecraft().thePlayer));//new GuiScreenConcessAdmin(Minecraft.getMinecraft().thePlayer));
            return null;
        }
    }
}
