package fr.mrlebest.craftingmod.client.gui;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;

import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.network.PacketDead;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;

public class GuiScreenPolice extends GuiScreen
{

    private ResourceLocation texture = new ResourceLocation("craftingmod", "textures/gui/guipolice.png");

    EntityPlayer playerEntity;

    public Minecraft mc;

    private EntityVehicle v;

    private int ButtonFourriere, BouttonCoffre, coffre;

    public GuiScreenPolice(EntityPlayer ep)
    {

        this.playerEntity = ep;
        this.mc = Minecraft.getMinecraft();
        List vehicles = playerEntity.worldObj.getEntitiesWithinAABB(EntityVehicle.class, playerEntity.boundingBox.expand(2.0D, 2.0D, 2.0D));
        this.v = (EntityVehicle)vehicles.get(0);

    }

    public void drawScreen(int x, int y, float f)
    {
        drawDefaultBackground();

        mc.getTextureManager().bindTexture(texture);
        String nomveh = I18n.format("item." + v.getVehicleType().shortName + ".name", (Object[])new Object[0]);

        this.drawTexturedModalRect(this.width / 2 - 135, this.height / 2 - 120, 0, 0, 256, 250);

        drawString(mc.fontRenderer, "Gestion de véhicule", this.width / 2 - 130, this.height / 2 - 115, 0xFFFFFF);
        drawString(mc.fontRenderer, "Actions :", this.width / 2 - 90, this.height / 2 - 70, 0xFFFFFF);
        drawString(mc.fontRenderer, "Model de véhicule:", this.width / 2 - -5, this.height / 2 - 20, 0x828282);
        drawString(mc.fontRenderer, StringUtils.abbreviate(nomveh, 15), this.width / 2 - -5, this.height / 2 - 5, 0x828282);
        drawString(mc.fontRenderer, "Propriétaire:", this.width / 2 - -5, this.height / 2 - -10, 0x828282);
        drawString(mc.fontRenderer, StringUtils.abbreviate(v.owner.getName(), 10), this.width / 2 - -5, this.height / 2 - -25, 0x828282);

        super.drawScreen(x, y, f);
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    public void initGui()
    {

        ButtonFourriere = 0;
        BouttonCoffre = 1;

        this.buttonList.add(new GuiButton(ButtonFourriere, width / 2 - 100, height / 2 - 40, 60, 20, "Fourriere"));
        this.buttonList.add(new GuiButton(BouttonCoffre, width / 2 - 100, height / 2 - 70, 60, 20, "Coffre"));

        super.initGui();
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {

        switch(button.id)
        {
            case 0:

                List vehicles = playerEntity.worldObj.getEntitiesWithinAABB(EntityVehicle.class, playerEntity.boundingBox.expand(2.0D, 2.0D, 2.0D));

                if(vehicles.size() == 0)
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Il n'y a pas de vehicule dans les environ."));
                    this.mc.thePlayer.closeScreen();
                }
                for(Object o : vehicles)
                {
                    if(vehicles.size() == 1)
                    {
                        if(o instanceof EntityVehicle)
                        {
                            EntityVehicle vehicle = (EntityVehicle)o;
                            if(vehicle.getOwner().getId() != playerEntity.getGameProfile().getId())
                            {
                                this.playerEntity.addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.GREEN + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + " Le vehicule a bien ete mit dans la fourrier."));
                                CraftingMod.network.sendToServer(new PacketDead(vehicle.getEntityId()));
                                // FlansMod.packetHandler.sendToServer(new PacketDead(vehicle));
                                this.mc.thePlayer.closeScreen();
                            }
                            else
                            {
                                playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Vous ne pouvez pas mettre a la fourrier votre §cpropre vehicule !"));
                                this.mc.thePlayer.closeScreen();
                            }

                        }
                    }
                    else
                    {
                        playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Il y'a trop de vehicule !"));
                        this.mc.thePlayer.closeScreen();
                    }
                }
                break;

            case 1:
                List vehicles1 = playerEntity.worldObj.getEntitiesWithinAABB(EntityVehicle.class, playerEntity.boundingBox.expand(2.0D, 2.0D, 2.0D));

                if(vehicles1.size() == 0)
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Il n'y a pas de vehicule dans les environ."));
                    this.mc.thePlayer.closeScreen();
                }
                for(Object o : vehicles1)
                {
                    if(vehicles1.size() == 1)
                    {
                        if(o instanceof EntityVehicle)
                        {
                            EntityVehicle vehicle = (EntityVehicle)o;
                            for(int s = 0; s < vehicle.getDriveableData().numCargo; s++)
                            {
                                if(vehicle.getDriveableData().cargo[s] != null)
                                {
                                    this.coffre += 1;
                                    if(vehicle.getDriveableData().cargo[s].stackSize != 1)
                                    {
                                        this.playerEntity.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GREEN + "Coffre: " + EnumChatFormatting.AQUA + vehicle.getDriveableData().cargo[s].getDisplayName() + "(" + vehicle.getDriveableData().cargo[s].stackSize + "x)"));
                                        this.mc.thePlayer.closeScreen();
                                    }
                                    else
                                    {
                                        this.playerEntity.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_GREEN + "Coffre: " + EnumChatFormatting.AQUA + vehicle.getDriveableData().cargo[s].getDisplayName()));
                                        this.mc.thePlayer.closeScreen();
                                    }
                                }
                            }
                            if(this.coffre == 0)
                            {
                                System.out.println("Yesy");
                                this.playerEntity.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Coffre vide."));
                                this.mc.thePlayer.closeScreen();
                            }
                            this.coffre = 0;
                        }
                    }
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

}
