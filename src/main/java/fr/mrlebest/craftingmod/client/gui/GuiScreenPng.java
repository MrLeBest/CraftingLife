package fr.mrlebest.craftingmod.client.gui;

import java.util.List;
import java.util.Random;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.ItemVehicle;

import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.entity.EntityConcessionnaire;
import fr.mrlebest.craftingmod.common.network.PacketAnim;
import fr.mrlebest.craftingmod.common.network.PacketConcessionnaire;
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
import scala.tools.nsc.interpreter.JLineCompletion.PackageCompletion;

public class GuiScreenPng extends GuiScreen
{

    EntityPlayer playerEntity;
    EntityConcessionnaire concessentity;
    protected Random rand;
    public Minecraft mc;
    public static GuiTextField texture;
    private GuiTextField concess;
    private ResourceLocation textures = new ResourceLocation("craftingmod", "textures/gui/concess.png");

    public GuiScreenPng(EntityPlayer ep, EntityConcessionnaire entityConcessionnaire)
    {
        this.rand = new Random();
        this.playerEntity = ep;
        this.mc = Minecraft.getMinecraft();
        this.concessentity = entityConcessionnaire;

    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    public void initGui()
    {

        int X = (width - 256) / 2;
        int Y = (height - 256) / 2;

        this.texture = new GuiTextField(this.fontRendererObj, this.width / 2 - -5, this.height / 2 - 20, 100, 20);
        this.concess = new GuiTextField(this.fontRendererObj, this.width / 2 - -5, this.height / 2 - 46, 100, 20);
        texture.setMaxStringLength(300);
        texture.setText("Texture");
        concess.setMaxStringLength(300);
        concess.setText("Concessionnaire");
        this.concess.setFocused(false);
        this.texture.setFocused(true);

        this.buttonList.add(new GuiButton(100, X + 10, Y + 100, 90, 20, "Valider Concess..."));
        this.buttonList.add(new GuiButton(101, X + 13, Y + 130, 84, 20, "Valider Texture"));
        this.buttonList.add(new GuiButton(102, X + 12, Y + 160, 89, 20, "Supprimer le png"));
        this.buttonList.add(new GuiButton(103, X + 3, Y + 70, 102, 20, "Liste des concess..."));

        super.initGui();
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        super.keyTyped(typedChar, keyCode);
        this.concess.textboxKeyTyped(typedChar, keyCode);
        this.texture.textboxKeyTyped(typedChar, keyCode);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        switch(button.id)
        {
            // 1 = Civil , 2 = Gendarmerie , 3 Pompier , 4 Camion , 5 Luxe
            case 100:
                if(concess.getText().equalsIgnoreCase("Gendarmerie"))
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien séléctionné le Concessionnaire Gendarmerie")));
                    CraftingMod.network.sendToServer(new PacketConcessionnaire(concessentity.getEntityId(), 2));
                }
                else if(concess.getText().equalsIgnoreCase("Civil"))
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien séléctionné le Concessionnaire Civil")));
                    CraftingMod.network.sendToServer(new PacketConcessionnaire(concessentity.getEntityId(), 1));
                }
                else if(concess.getText().equalsIgnoreCase("Pompier"))
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien séléctionné le Concessionnaire Pompier")));
                    CraftingMod.network.sendToServer(new PacketConcessionnaire(concessentity.getEntityId(), 3));
                }
                else if(concess.getText().equalsIgnoreCase("Camion"))
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien séléctionné le Concessionnaire Camion")));
                    CraftingMod.network.sendToServer(new PacketConcessionnaire(concessentity.getEntityId(), 4));
                }
                else if(concess.getText().equalsIgnoreCase("Luxe"))
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien séléctionné le Concessionnaire de Luxe")));
                    CraftingMod.network.sendToServer(new PacketConcessionnaire(concessentity.getEntityId(), 5));
                }
                else if(concess.getText() != "Civil" || concess.getText() != "Luxe" || concess.getText() != "Camion" || concess.getText() != "Pompier" || concess.getText() != "Gendarmerie")
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + "Il n'y a pas de " + concess.getText() + " dans §cla liste des concessionnaire"));
                }
                /*
                 * else if(concess.getText().equalsIgnoreCase("GuiScreenConcessionnaire")){
                 * }else if(concess.getText().equalsIgnoreCase("GuiScreenConcessionnaire")){
                 * }
                 */
                break;
            case 101:
                if(texture.getText().equalsIgnoreCase("police"))
                {
                    concessentity.setTameSkin(1);
                }
                else if(texture.getText().equalsIgnoreCase("pompier"))
                {
                    concessentity.setTameSkin(2);
                }

                break;
            case 102:
                //concessentity.setDead();
                CraftingMod.network.sendToServer(new PacketDead(concessentity.getEntityId()));
                this.mc.thePlayer.closeScreen();
                break;

            case 103:
                for(int i = 0; i < GuiScreenConcessAdmin.listConcess.length; i++)
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + GuiScreenConcessAdmin.listConcess[i]));
                }
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

        mc.getTextureManager().bindTexture(textures);

        int X = (width - 256) / 2;
        int Y = (height - 256) / 2;
        this.drawTexturedModalRect((int)X, (int)Y + 50, 0, 0, 256, 256);

        drawString(mc.fontRenderer, "Gestion du Png", (int)X, (int)Y + 51, 0xFFFFFF);

        this.concess.drawTextBox();
        this.texture.drawTextBox();

        super.drawScreen(x, y, f);
    }

    protected void mouseClicked(int x, int y, int btn)
    {
        super.mouseClicked(x, y, btn);
        this.concess.mouseClicked(x, y, btn);
        this.texture.mouseClicked(x, y, btn);
    }
    

}
