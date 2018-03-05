package fr.mrlebest.craftingmod.client.gui;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.VehicleType;

import cpw.mods.fml.client.config.GuiCheckBox;
import fr.mrlebest.craftingmod.event.WorldSaveData;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiScreenEvent.ActionPerformedEvent;
import net.minecraftforge.common.MinecraftForge;

/**
 * @author AymericRed
 */
public class NewGuiConcessAdmin extends GuiScreen
{
    private EntityPlayer playerEntity;
    private GuiTextField price;
    private GuiCheckBox civil, gendarmerie, pompier, luxe, camion;
    public Minecraft mc;
    private GuiButton buttonConfirm;
    private GuiBouton bouttonVehicle;
    private String vehiculename;
    private int lastClicked;
    private ResourceLocation texture = new ResourceLocation("craftingmod", "textures/gui/concessionnaire.png");
    private boolean found = false;

    public NewGuiConcessAdmin(EntityPlayer ep)
    {
        this.playerEntity = ep;
        this.mc = Minecraft.getMinecraft();
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    public void initGui()
    {
        super.initGui();

        int X = (width - 256) / 2;
        int Y = (height - 256) / 2;

        this.price = new TextFieldCustom(this.fontRendererObj, width / 2, Y + 214, X + 189 - width / 2, 20);
        price.setMaxStringLength(10);
        price.setText("Prix");

        this.buttonList.add(civil = new GuiCheckBox(1, X + 100, Y + 30, "Civil", false));
        this.buttonList.add(gendarmerie = new GuiCheckBox(1, X + 100, Y + 45, "Gendarmerie", false));
        this.buttonList.add(pompier = new GuiCheckBox(1, X + 100, Y + 60, "Pompier", false));
        this.buttonList.add(luxe = new GuiCheckBox(1, X + 100, Y + 75, "Luxe", false));
        this.buttonList.add(camion = new GuiCheckBox(1, X + 100, Y + 90, "Camion", false));

        this.buttonList.add(buttonConfirm = new BoutonAcheter(50, X + 189, Y + 214, 60, 20, "Ajouter"));
        this.buttonList.add(new BoutonFermer(51, X + 226, Y + 8, 25, 7, ""));

        this.civil.visible = this.gendarmerie.visible = this.pompier.visible = this.luxe.visible = this.camion.visible = false;
        this.price.setVisible(false);
        this.buttonConfirm.visible = false;

        int i = 0, totalHeight = 0;
        int buttonsHeight = 0;
        for(VehicleType v : VehicleType.types) // Pour chaque v�hicule
        {
            String vehic = v.name;
            if(vehic != null)
            {
                List<String> lines = GuiScreenConcessionnaire.trimTextToWidth(vehic, 69);
                int height = mc.fontRenderer.FONT_HEIGHT * lines.size() + 9;
                this.buttonList.add(new GuiBouton(i + 100, this.width / 2 - 126, this.height / 2 - 110 + totalHeight, 100, height, vehic)
                {
                    @Override
                    public void drawButton(Minecraft mc, int mx, int my)
                    {
                        int y = this.yPosition + 2;
                        GL11.glPushMatrix();
                        // ItemStack vehicle = new ItemStack(v.getItem());
                        mc.getTextureManager().bindTexture(new ResourceLocation(FlansMod.MODID + ":textures/items/" + v.iconPath + ".png"));
                        // drawTexturedModelRectFromIcon(xPosition, y, v.item.getIconFromDamage(0), 16, 16);
                        GL11.glScaled(0.05, 0.05, 0.05);
                        GL11.glColor4f(1, 1, 1, 1);
                        drawTexturedModalRect(xPosition * 20, yPosition * 20, 0, 0, 256, 256);
                        GL11.glPopMatrix();
                        // y+=mc.fontRenderer.FONT_HEIGHT;
                        for(String line : lines)
                        {
                            drawString(fontRendererObj, (this.select ? "§3" : "§f") + line, xPosition + 15, y, 1);
                            y += mc.fontRenderer.FONT_HEIGHT;
                        }
                    }
                });
                totalHeight += height;
                i++;
            }
        }
        scrollY = 0; // On reset le scroll
        maxScroll = totalHeight - 220; // Et on met le scroll max à partir hauteur de tous les boutons
        if(maxScroll == 0)
            maxScroll = 1;
        buttonConfirm.enabled = false; // comme aucun v�hicule est s�lectionn�
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        super.keyTyped(typedChar, keyCode);
        this.price.textboxKeyTyped(typedChar, keyCode);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        if(button.id == 50)
        {
            int pricee = 0;
            try
            {
                pricee = Integer.valueOf(price.getText());
                if(civil.isChecked())
                    WorldSaveData.vehicivil.put(vehiculename, pricee);
                else
                    WorldSaveData.vehicivil.remove(vehiculename);
                if(gendarmerie.isChecked())
                    WorldSaveData.vehigendarmerie.put(vehiculename, pricee);
                else
                    WorldSaveData.vehigendarmerie.remove(vehiculename);
                if(pompier.isChecked())
                    WorldSaveData.vehipompier.put(vehiculename, pricee);
                else
                    WorldSaveData.vehipompier.remove(vehiculename);
                if(luxe.isChecked())
                    WorldSaveData.vehiluxe.put(vehiculename, pricee);
                else
                    WorldSaveData.vehiluxe.remove(vehiculename);
                if(camion.isChecked())
                    WorldSaveData.vehicamion.put(vehiculename, pricee);
                else
                    WorldSaveData.vehicamion.remove(vehiculename);
                playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien ajouter le " + vehiculename + " au §aconcessionnaires choisis"));
            }
            catch(NumberFormatException ex)
            {
                playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + "Le prix est invalide"));
            }
        }
        else if(button.id >= 100) // Les boutons de v�hicules
        {
            bouttonVehicle = (GuiBouton)button;
            boolean oneSelected = bouttonVehicle.select;
            // System.out.println(oneSelected + " " + bouttonVehicle.displayString + " " + bouttonVehicle.id + " "+ bouttonVehicle.select);
            // bouttonVehicle.select = oneSelected;
            vehiculename = oneSelected ? button.displayString : "";
            lastClicked = oneSelected ? button.id : -1;
            for(int k = 0; k < buttonList.size(); k++)
            {
                GuiButton b = (GuiButton)buttonList.get(k);
                if(b.id != lastClicked && b.id >= 100)
                {
                    ((GuiBouton)b).select = false;// !oneSelected;
                }
            }
            buttonConfirm.enabled = oneSelected;// oneSelected;

            // System.out.println(WorldSaveData.vehicivil);

            this.civil.visible = this.gendarmerie.visible = this.pompier.visible = this.luxe.visible = this.camion.visible = oneSelected;
            this.price.setVisible(oneSelected);
            this.buttonConfirm.visible = oneSelected;
            if(oneSelected)
            {
                String price = "0";
                this.civil.setIsChecked(WorldSaveData.vehicivil.containsKey(button.displayString));
                this.gendarmerie.setIsChecked(WorldSaveData.vehigendarmerie.containsKey(button.displayString));
                this.pompier.setIsChecked(WorldSaveData.vehipompier.containsKey(button.displayString));
                this.luxe.setIsChecked(WorldSaveData.vehiluxe.containsKey(button.displayString));
                this.camion.setIsChecked(WorldSaveData.vehicamion.containsKey(button.displayString));
                if(WorldSaveData.vehicivil.containsKey(button.displayString))
                    price = "" + WorldSaveData.vehicivil.get(button.displayString);
                else if(WorldSaveData.vehigendarmerie.containsKey(button.displayString))
                    price = "" + WorldSaveData.vehigendarmerie.get(button.displayString);
                else if(WorldSaveData.vehipompier.containsKey(button.displayString))
                    price = "" + WorldSaveData.vehipompier.get(button.displayString);
                else if(WorldSaveData.vehiluxe.containsKey(button.displayString))
                    price = "" + WorldSaveData.vehiluxe.get(button.displayString);
                else if(WorldSaveData.vehicamion.containsKey(button.displayString))
                    price = "" + WorldSaveData.vehicamion.get(button.displayString);
                this.price.setText(price);
            }
        }
        else
        {
            switch(button.id)
            {
                case 51:
                    this.mc.thePlayer.closeScreen();
                    break;

                default:
                    break;
            }
        }
        super.actionPerformed(button);
    }

    @Override
    public void updateScreen()
    {
        super.updateScreen();
    }

    private int scrollY = 0;
    private int maxScroll;

    public void drawScreen(int x, int y, float f)
    {
        drawDefaultBackground();

        mc.getTextureManager().bindTexture(texture);

        int X = (width - 256) / 2;
        int Y = (height - 256) / 2;
        this.drawTexturedModalRect(X, Y, 0, 0, 256, 240);
        // System.out.println("Test");
        drawString(mc.fontRenderer, "Gestion des Conces...", X + 2, Y + 5, 0xFFFFFF);
        drawString(mc.fontRenderer, "Informations", X + 92, Y + 147, 0xFFFFFF);
        drawRect(this.width / 2 - 43, this.height / 2 - 110, this.width / 2 - 39, this.height / 2 + 110, 0x70000000);
        if(VehicleType.types.size() != 0)
        {
            // System.out.println(vehicleList.size());
            int relativeHeight = (maxScroll % 220);// 10;
            if(maxScroll <= 0) // Hauteur du carré de la scrollbar en fonction de la hauteur totale des boutons (esthétique)
                relativeHeight = 220;
            // else if(maxScroll < 220)
            // relativeHeight = (-maxScroll%220);
            int relativeY = (this.height / 2 - 110) + (scrollY * (220 - relativeHeight) / maxScroll); // Position du carré dans la barre de 220 pixels de haut en fonction du scroll
            drawRect(this.width / 2 - 43, relativeY, this.width / 2 - 39, relativeY + relativeHeight, 0xB0000000);
            // System.out.println(posY);
        }

        GL11.glPushMatrix();
        for(int k = 0; k < this.buttonList.size(); ++k) // Dessin des boutons
        {
            GuiButton bu = (GuiButton)this.buttonList.get(k);
            if(bu.id == 100)
            { // Quand on atteint les boutons de véhicules
                int e = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight).getScaleFactor(); // Résolution utilisée pour le scissor
                int ye = mc.displayHeight - ((this.height / 2 - 110) + 220) * e;// e*(this.height/2-110);
                GL11.glScissor(e * (this.width / 2 - 126), ye, e * 100, e * 220);
                GL11.glEnable(GL11.GL_SCISSOR_TEST); // On setup le scissor pour ignorer tout ce qui est en dehors de la zone des boutons de véhicules
                GL11.glTranslated(0, -scrollY, 0);  // Et on translate à l'inverse du scroll pour faire apparaître boutons du bas
            }
            bu.drawButton(this.mc, x, y);
        }
        GL11.glDisable(GL11.GL_SCISSOR_TEST);
        GL11.glPopMatrix();

        for(ItemVehicle itemV : FlansMod.vehicleItems)
        {
            // String nomveh = I18n.format("item." + itemV.type.shortName + ".name", (Object[])new Object[0]);

            // System.out.println(itemV.getInfoType().iconPath);
            if(vehiculename != null)
            {
                if(itemV.type.name.equals(vehiculename))
                {
                     if(itemV != null)
                    {
                        drawString(mc.fontRenderer, "Modèle: §a" + StringUtils.abbreviate(itemV.type.name, 24), this.width / 2 - 30, this.height / 2 + 30, 0xFFFFFF);
                        drawString(mc.fontRenderer, "Places passagers: §a" + itemV.type.seats.length, this.width / 2 - 30, this.height / 2 + 45, 0xFFFFFF);
                        drawString(mc.fontRenderer, "Places dans le coffre: §a" + itemV.type.numCargoSlots, this.width / 2 - 30, this.height / 2 + 60, 0xFFFFFF);
                        drawString(mc.fontRenderer, "Vitesse: §a" + (int)itemV.type.maxThrottle * 122 + " km/h", this.width / 2 - 30, this.height / 2 + 75, 0xFFFFFF);
                        drawString(mc.fontRenderer, "Prix: ", this.width / 2 - 30, this.height / 2 + 95, 0xFFFFFF);
                        GL11.glColor4f(1, 1, 1, 1);
                    }

                }
            }
        }

        this.price.drawTextBox();
    }

    @Override
    public void handleMouseInput()
    {
        super.handleMouseInput();
        if(maxScroll > 0)
        { // Si on a besoin de scroll (hauteur boutons > hauteur espace sur le gui)
            int i = Mouse.getEventDWheel() / 10;
            if(i != 0)
            {
                scrollY -= i; // On modifie valeur du scroll
                scrollY = Math.max(Math.min(scrollY, maxScroll), 0); // Mais la garde entre 0 et maxScroll
            }
        }
    }

    @Override
    protected void mouseClicked(int mx, int my, int button)
    {
        this.price.mouseClicked(mx, my, button);
        if(button == 0)
        {
            for(int l = 0; l < this.buttonList.size(); ++l)
            {
                GuiButton guibutton = (GuiButton)this.buttonList.get(l);

                if(guibutton.mousePressed(this.mc, mx, my + (guibutton.id >= 100 ? scrollY : 0))) // Si le bouton est un bouton de véhicule (id>=100), on prend en compte le scroll
                {
                    ActionPerformedEvent.Pre event = new ActionPerformedEvent.Pre(this, guibutton, this.buttonList);
                    if(MinecraftForge.EVENT_BUS.post(event))
                        break;
                    // NOT VISIBLE this.selectedButton = event.button;
                    event.button.func_146113_a(this.mc.getSoundHandler());
                    this.actionPerformed(event.button);
                    if(this.equals(this.mc.currentScreen))
                        MinecraftForge.EVENT_BUS.post(new ActionPerformedEvent.Post(this, event.button, this.buttonList));
                }
            }
        }
    }
}