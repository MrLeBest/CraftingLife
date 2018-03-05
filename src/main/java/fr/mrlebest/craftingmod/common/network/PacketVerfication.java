package fr.mrlebest.craftingmod.common.network;

import com.flansmod.common.network.PacketBase;

import fr.mrlebest.craftingmod.client.gui.GuiGarage;
import fr.mrlebest.craftingmod.client.gui.GuiScreenConcessionnaire;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketVerfication extends PacketBase
{

    private boolean verif;

    public PacketVerfication(boolean verif)
    {
        this.verif = verif;
       // System.out.println("fff" + this.verif);
    }

    public PacketVerfication()
    {}

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        data.writeBoolean(verif);

    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        verif = data.readBoolean();

    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity)
    {

    }

    @Override
    public void handleClientSide(EntityPlayer clientPlayer)
    {
        System.out.println(Minecraft.getMinecraft().currentScreen);
        if(Minecraft.getMinecraft().currentScreen instanceof GuiGarage)
        {
            ((GuiGarage)Minecraft.getMinecraft().currentScreen).isBlockSpawn(verif);
           // System.out.println(this.verif);
        }else if(Minecraft.getMinecraft().currentScreen instanceof GuiScreenConcessionnaire){
            ((GuiScreenConcessionnaire)Minecraft.getMinecraft().currentScreen).isBlockSpawn(verif);
           // System.out.println(this.verif);
        }
    }

}
