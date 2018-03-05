package fr.mrlebest.craftingmod.client.gui;

import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.ItemVehicle;

import fr.mrlebest.craftingmod.block.BlockGarage;
import fr.mrlebest.craftingmod.common.entity.EntityConcessionnaire;
import fr.mrlebest.craftingmod.common.network.PacketDead;
import fr.mrlebest.craftingmod.common.network.PacketKlaxon;
import fr.mrlebest.craftingmod.renderer.RenderConcessionnaireEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiBlockGarage extends GuiScreen
{

    private ResourceLocation texture = new ResourceLocation("craftingmod", "textures/gui/concess.png");
    EntityPlayer playerEntity;
    BlockGarage garageBlock;
    public Minecraft mc;
    private GuiTextField concess;

    public GuiBlockGarage(EntityPlayer ep, BlockGarage blockGarage)
    {

        this.playerEntity = ep;
        this.mc = Minecraft.getMinecraft();
        this.garageBlock = blockGarage;

    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    public void initGui()
    {
        int X = (width -  256) / 2;
        int Y = (height - 256) / 2;

        this.concess = new GuiTextField(this.fontRendererObj,X + 130,Y + 90, 100, 20);
        concess.setMaxStringLength(300);
        concess.setText("Nom du Garage");
        this.concess.setFocused(true);

        this.buttonList.add(new GuiButton(100, X+22, Y+120, 60, 20, "Valider"));
        this.buttonList.add(new GuiButton(103, X+ 5, Y + 90, 100, 20, "Liste des Garage"));

        super.initGui();
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        super.keyTyped(typedChar, keyCode);
        this.concess.textboxKeyTyped(typedChar, keyCode);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        switch(button.id)
        {
            case 100:
                if(concess.getText().equals("Gendarmerie"))
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien séléctionné le Garage Gendarmerie")));
                    garageBlock.getTileEntity(playerEntity.worldObj, (int)playerEntity.posX,(int)playerEntity.posY, (int)playerEntity.posZ).setGarage("all", false);
                    garageBlock.getTileEntity(playerEntity.worldObj, (int)playerEntity.posX,(int)playerEntity.posY, (int)playerEntity.posZ).setGarage("gendermerie", true);
                }
                else if(concess.getText().equals("Civil"))
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien séléctionné le Garage Civil")));
                    garageBlock.getTileEntity(playerEntity.worldObj, (int)playerEntity.posX,(int)playerEntity.posY, (int)playerEntity.posZ).setGarage("all", true);
                    garageBlock.getTileEntity(playerEntity.worldObj, (int)playerEntity.posX,(int)playerEntity.posY, (int)playerEntity.posZ).setGarage("gendermerie", false);
                }
                break;

            case 103:

                playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + "Civil , Gendarmerie"));
                break;
            default:
                break;

        }

        super.actionPerformed(button);
    }

    @Override
    public void updateScreen()
    {
        super.updateScreen();
    }

    public void drawScreen(int x, int y, float f)
    {
        drawDefaultBackground();
        
        mc.getTextureManager().bindTexture(texture);
        
        double X = (width -  256) / 2;
        double Y = (height - 256) / 2;
        this.drawTexturedModalRect((int)X, (int)Y + 50, 0, 0, 256, 256);
        
        drawString(mc.fontRenderer, "Gestion des Garage", (int)X, (int)Y + 51, 0xFFFFFF);

        this.concess.drawTextBox();

        super.drawScreen(x, y, f);
    }

    protected void mouseClicked(int x, int y, int btn)
    {
        super.mouseClicked(x, y, btn);
        this.concess.mouseClicked(x, y, btn);
    }

}
