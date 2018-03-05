package fr.mrlebest.craftingmod.client.gui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;

import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.network.PacketSpawn;
import fr.mrlebest.craftingmod.event.WorldSaveData;
import fr.mrlebest.craftingmod.tileentity.TileEntityGarage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiScreenEvent.ActionPerformedEvent;
import net.minecraftforge.common.MinecraftForge;

public class GuiScreenConcessionnaire extends GuiScreen
{

    private EntityPlayer playerEntity;
    public Map<String, Integer> vehicleList = new HashMap();
    public int Acheter;
    public Minecraft mc;
    private GuiButton buttonAcheter;
    private GuiBouton bouttonVehicle;
    private String vehiculename;
    private int lastClicked;
    private EntityVehicle vehicleToRender;
    private ResourceLocation texture = new ResourceLocation("craftingmod", "textures/gui/concessionnaire.png");
    public int rotation;
    public int speedRotation = 1;
    private boolean found = false;
    public ExtPropCraftingLife garage;
    public String concessName;

    public GuiScreenConcessionnaire(String concessName, String vehicleList, EntityPlayer ep)
    {
        this.playerEntity = ep;
        this.mc = Minecraft.getMinecraft();
        garage = ExtPropCraftingLife.get(ep);
        setConcessionnaireName(concessName);
        setVehicleList(vehicleList);
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

        Acheter = 50;
        int X = (width - 256) / 2;
        int Y = (height - 256) / 2;

        this.buttonList.add(buttonAcheter = new BoutonAcheter(Acheter, X + 189, Y + 214, 60, 20, "Acheter"));
        this.buttonList.add(new BoutonFermer(51, X + 226, Y+8, 25, 7, ""));

        int i = 0, totalHeight=0;
        int buttonsHeight = 0;
        for(String vehic : vehicleList.keySet()) // Pour chaque v�hicule
        {
        	List<String> lines = trimTextToWidth(vehic, 69);
        	int height = mc.fontRenderer.FONT_HEIGHT*lines.size()+9;
            this.buttonList.add(new GuiBouton(i + 100, this.width / 2 - 126, this.height/2-110+totalHeight, 100, height, vehic) {
            	@Override
                public void drawButton(Minecraft mc, int mx, int my)
            	{  
                    int y = this.yPosition+2;
                    for(VehicleType v : VehicleType.types)
                    {
                        //String nomveh = I18n.format("item." + v.shortName + ".name", (Object[])new Object[0]);
                        if(v.name.equals(vehic))
                        {
                            GL11.glPushMatrix();
                            //ItemStack vehicle = new ItemStack(v.getItem());
                            mc.getTextureManager().bindTexture(new ResourceLocation(FlansMod.MODID+":textures/items/"+v.iconPath+".png"));
                            //drawTexturedModelRectFromIcon(xPosition, y, v.item.getIconFromDamage(0), 16, 16);
                            GL11.glScaled(0.05, 0.05, 0.05);
                            GL11.glColor4f(1, 1, 1,1);
                            drawTexturedModalRect(xPosition*20, yPosition*20, 0, 0, 256, 256);
                            GL11.glPopMatrix();
                           // y+=mc.fontRenderer.FONT_HEIGHT;
                        }
                    }
            		for(String line : lines) {
            			drawString(fontRendererObj, (this.select?"§3":"§f")+line, xPosition+15, y, 1);
            			y+=mc.fontRenderer.FONT_HEIGHT;
            		}
            	}
            });
            totalHeight+=height;
            i++;
        }
        scrollY = 0; //On reset le scroll
        maxScroll = totalHeight-220; //Et on met le scroll max à partir hauteur de tous les boutons
        buttonAcheter.enabled = false; // comme aucun v�hicule est s�lectionn�
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        if(button.id == 50)
        {
            if(vehicleToRender != null)
            {
                String nomveh = I18n.format("item." + vehicleToRender.getVehicleType().shortName + ".name", (Object[])new Object[0]);
                //this.mc.thePlayer.sendChatMessage("/eco take " + this.mc.thePlayer.getDisplayName() + " " + vehicleList.get(vehiculename));
                long count = garage.vehiculeList.stream().filter(nomveh::equals).count();
                if(count >= 1)
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText("Vous avez deja le meme vehicule dans le garage"));
                    bouttonVehicle.select = false;
                    vehiculename = null;
                }
                else
                {
                    garage.vehiculeList.add(nomveh);
                    garage.sync();
                    FlansMod.getPacketHandler().sendToServer(new PacketSpawn(vehicleToRender.getVehicleType().shortName));
                    System.out.println(bouttonVehicle.select);
                    bouttonVehicle.select = false;
                    vehiculename = null;

                }
            }
        }
        else if(button.id >= 100) // Les boutons de v�hicules
        {
            for(VehicleType v : VehicleType.types)
            {
                //String nomveh = I18n.format("item." + v.shortName + ".name", (Object[])new Object[0]);
                if(v.name.equals(button.displayString))
                {
                    NBTTagCompound tag = new NBTTagCompound();
                    tag.setString("Type", v.shortName);
                    tag.setString("Engine", ((PartType)PartType.defaultEngines.get(EnumType.vehicle)).shortName);
                    vehicleToRender = new EntityVehicle(mc.theWorld, 0, 0, 0, (VehicleType)VehicleType.getDriveable(v.shortName), new DriveableData(tag));
                    found = true;
                    break; // Pour sortir de la boucle
                }
            }

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
            buttonAcheter.enabled = oneSelected;// oneSelected;
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

    public void isBlockSpawn(boolean verif)
    {
        if(verif)
        {
            TileEntityGarage.lastsVehicle.add(vehicleToRender.getVehicleType().shortName);
            vehicleToRender = null;
            // System.out.println("Oueygfi");
        }
        vehicleToRender = null;
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
        this.rotation++;
       // System.out.println("Test");
        drawString(mc.fontRenderer, StringUtils.abbreviate(getConcessionnaireName(), 35), X+2, Y+5, 0xFFFFFF);
        drawString(mc.fontRenderer, "Informations", X+92, Y+147, 0xFFFFFF);
        drawRect(this.width / 2 - 43, this.height / 2 - 110, this.width / 2 - 39, this.height / 2 + 110, 0x70000000);
        if(vehicleList.size() != 0)
        {
            // System.out.println(vehicleList.size());
        	int relativeHeight = (maxScroll%220);//10;
        	if(maxScroll <= 0) //Hauteur du carré de la scrollbar en fonction de la hauteur totale des boutons (esthétique)
        		relativeHeight = 220;
        	//else if(maxScroll < 220)
        		//relativeHeight = (-maxScroll%220);
        	int relativeY = (this.height / 2 - 110)+(scrollY*(220-relativeHeight)/maxScroll); //Position du carré dans la barre de 220 pixels de haut en fonction du scroll
            drawRect(this.width / 2 - 43, relativeY, this.width / 2 - 39, relativeY+relativeHeight, 0xB0000000);
            //System.out.println(posY);
        }

        GL11.glPushMatrix();
        for (int k = 0; k < this.buttonList.size(); ++k) //Dessin des boutons
        {
        	GuiButton bu = (GuiButton) this.buttonList.get(k);
        	if(bu.id == 100) { //Quand on atteint les boutons de véhicules
        		int e = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight).getScaleFactor(); //Résolution utilisée pour le scissor
        		int ye = mc.displayHeight - ((this.height/2-110) + 220) * e;//e*(this.height/2-110);
        		GL11.glScissor(e*(this.width / 2 - 126), ye, e*100, e*220);
        		GL11.glEnable(GL11.GL_SCISSOR_TEST); //On setup le scissor pour ignorer tout ce qui est en dehors de la zone des boutons de véhicules
        		GL11.glTranslated(0, -scrollY, 0);  //Et on translate à l'inverse du scroll pour faire apparaître boutons du bas
        	}
            bu.drawButton(this.mc, x, y);
        }
        GL11.glDisable(GL11.GL_SCISSOR_TEST);
        GL11.glPopMatrix();
        
        for(ItemVehicle itemV : FlansMod.vehicleItems)
        {
            //String nomveh = I18n.format("item." + itemV.type.shortName + ".name", (Object[])new Object[0]);
           
            //System.out.println(itemV.getInfoType().iconPath);
            if(itemV.type.name.equals(vehiculename))
            {
                //if(vehiculename != null)
                {
                    drawString(mc.fontRenderer, "Modèle: §a" + StringUtils.abbreviate(vehiculename,24), this.width / 2 - 30, this.height / 2 + 30, 0xFFFFFF);
                    drawString(mc.fontRenderer, "Places passagers: §a" + itemV.type.seats.length, this.width / 2 - 30, this.height / 2 +45, 0xFFFFFF);
                    drawString(mc.fontRenderer, "Places dans le coffre: §a" + itemV.type.numCargoSlots, this.width / 2 - 30, this.height / 2 +60, 0xFFFFFF);
                    drawString(mc.fontRenderer, "Vitesse: §a" + (int)itemV.type.maxThrottle*122+" km/h", this.width / 2 - 30, this.height / 2 +75, 0xFFFFFF);
                    drawString(mc.fontRenderer, "Prix: §a" + vehicleList.get(vehiculename), this.width / 2 - 30, this.height / 2 +95, 0xFFFFFF);
                    GL11.glColor4f(1, 1, 1, 1);
                    this.drawModel(x, y, f);
                }

            }
        }
    }

    public void drawModel(int par0, int par1, float par2)
    {
        if(vehicleToRender.getDriveableType() != null)
        {
            int X = (width - 256) / 2;
            int Y = (height - 256) / 2;
            // Render rotating driveable model
            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glTranslatef(X + 171.5F, Y + 110, 100);
            GL11.glScalef(-40*vehicleToRender.getDriveableType().modelScale / vehicleToRender.getDriveableType().cameraDistance, 50F * vehicleToRender.getDriveableType().modelScale / vehicleToRender.getDriveableType().cameraDistance, 50F*vehicleToRender.getDriveableType().modelScale / vehicleToRender.getDriveableType().cameraDistance);
            GL11.glScalef(1.8F, 1.8F, 1.8F);
            GL11.glRotatef(180F, 0F, 0.1F, 1F);
            GL11.glRotatef(0F, 1F, 0F, 0F);
            GL11.glRotatef(this.rotation/1F, 0F, 20F, 0F);
            //System.out.println(vehicleToRender.getDriveableType().modelScale);
            mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(vehicleToRender.getDriveableType()));
            if(vehicleToRender.getDriveableType().model != null)
            {
                vehicleToRender.getDriveableType().model.render(vehicleToRender.getDriveableType());
            }
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glPopMatrix();
        }

    }

    @Override
    public void handleMouseInput()
    {
        super.handleMouseInput();
        if(maxScroll > 0) { //Si on a besoin de scroll (hauteur boutons > hauteur espace sur le gui)
	        int i = Mouse.getEventDWheel()/10;
	        if(i != 0)
	        {
	        	scrollY -= i; //On modifie valeur du scroll
	        	scrollY = Math.max(Math.min(scrollY, maxScroll), 0); //Mais la garde entre 0 et maxScroll
	        }
        }
    }
    @Override
    protected void mouseClicked(int mx, int my, int button)
    {
        if (button == 0)
        {
            for (int l = 0; l < this.buttonList.size(); ++l)
            {
                GuiButton guibutton = (GuiButton)this.buttonList.get(l);

                if (guibutton.mousePressed(this.mc, mx, my+(guibutton.id>=100?scrollY:0))) //Si le bouton est un bouton de véhicule (id>=100), on prend en compte le scroll
                {
                    ActionPerformedEvent.Pre event = new ActionPerformedEvent.Pre(this, guibutton, this.buttonList);
                    if (MinecraftForge.EVENT_BUS.post(event))
                        break;
                    //NOT VISIBLE this.selectedButton = event.button;
                    event.button.func_146113_a(this.mc.getSoundHandler());
                    this.actionPerformed(event.button);
                    if (this.equals(this.mc.currentScreen))
                        MinecraftForge.EVENT_BUS.post(new ActionPerformedEvent.Post(this, event.button, this.buttonList));
                }
            }
        }
    }

    public void setVehicleList(String vehicleList)
    {
        this.vehicleList = getVehicleList(vehicleList);
    }

    public static Map<String, Integer> getVehicleList(String vehicleList)
    {
        if(vehicleList.equalsIgnoreCase("Civil"))
        {
            return WorldSaveData.vehicivil;
        }
        else if(vehicleList.equalsIgnoreCase("Camion"))
        {
            return WorldSaveData.vehicamion;
        }
        else if(vehicleList.equalsIgnoreCase("Gendarmerie"))
        {
            return WorldSaveData.vehigendarmerie;
        }
        else if(vehicleList.equalsIgnoreCase("Luxe"))
        {
            return WorldSaveData.vehiluxe;
        }
        else if(vehicleList.equalsIgnoreCase("Pompier"))
        {
            return WorldSaveData.vehipompier;
        }
        return WorldSaveData.vehicivil;
    }

    public void setConcessionnaireName(String name)
    {
        concessName = name;
    }

    public String getConcessionnaireName()
    {
        return concessName;
    }

    public static List<String> trimTextToWidth(String text, int maxWidth)
    {

        List<String> lines = new ArrayList<String>();

        while(!text.isEmpty())
        {
            String rawTrim = Minecraft.getMinecraft().fontRenderer.trimStringToWidth(text, maxWidth);

            String str = text.substring(MathHelper.clamp_int(rawTrim.length(), 0, text.length()), MathHelper.clamp_int(rawTrim.length() + 1, 0, text.length()));
            Character lastChar = rawTrim.isEmpty() ? null : rawTrim.charAt(rawTrim.length() - 1);
            Character nextChar = str.isEmpty() ? null : str.charAt(str.length() - 1);

            int lastSpace = rawTrim.lastIndexOf(' ');

            boolean flag = lastChar == null || lastChar == ' ' || nextChar == null || nextChar == ' ' || lastSpace == 0 || lastSpace == -1;

            String line;

            if(rawTrim.contains("\n") && (rawTrim.indexOf("\n") == 0 || rawTrim.charAt(rawTrim.indexOf("\n") - 1) != '\\'))
            {
                line = rawTrim.substring(0, rawTrim.indexOf("\n"));
                text = text.replaceFirst("\n", "");
            }
            else
            {
                if(flag)
                {
                    line = rawTrim;
                }
                else
                {
                    line = rawTrim.substring(0, MathHelper.clamp_int(lastSpace + 1, 0, rawTrim.length()));
                }
            }

            if(line.isEmpty())
            {
                break;
            }

            text = text.substring(line.length(), text.length());
            lines.add(line);
        }

        if(lines.isEmpty())
            lines.add("");

        return lines;
    }

}
