package fr.mrlebest.craftingmod.client.gui;

import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;

import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.network.PacketRentrer;
import fr.mrlebest.craftingmod.common.network.PacketSpawn;
import fr.mrlebest.craftingmod.tileentity.TileEntityGarage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;

public class GuiGarage extends GuiScreen
{

    EntityPlayer playerEntity;

    public int Acheter, activeIndex = -1;
    private GuiTextField text;
    public Minecraft mc;
    private GuiButton buttonSortir;
    private GuiBouton bouttonVehicle;
    private String vehiculename;
    private int lastClicked;
    private EntityVehicle vehicleToRender;
    public float field_74209_t;
    public float field_74208_u;
    private ResourceLocation texture = new ResourceLocation("craftingmod", "textures/gui/concess.png");
    public int rotation;
    public int speedRotation = 1;
    private boolean found = false;
    public ExtPropCraftingLife garage;
    public String lastVehicule;

    public GuiGarage(EntityPlayer ep)
    {
        this.playerEntity = ep;
        this.mc = Minecraft.getMinecraft();
        this.garage = ExtPropCraftingLife.get(ep);
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
        
        this.buttonList.add(new BoutonAcheter(52, X+115, Y + 200, 60, 20, "Rentrer"));
        this.buttonList.add(buttonSortir = new BoutonAcheter(Acheter, X + 190, Y + 200, 60, 20, "Sortir"));
        this.buttonList.add(new BoutonFermer(51, X + 220, Y + 51, 60, 20, ""));
        System.out.println(garage);
        System.out.println(garage.vehiculeList);
        for(int i = 0; i < garage.vehiculeList.size(); i++) // Pour chaque v�hicule

        {
            String vehic = garage.vehiculeList.get(i);
            this.buttonList.add(bouttonVehicle = new GuiBouton(i + 100, this.width / 2 - 100, this.height / 2 - 60 + i * 20, 60, 20, StringUtils.abbreviate(vehic, 18)));
        }
        buttonSortir.enabled = false; // comme aucun v�hicule est s�lectionn�

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
                for(int k = 0; k < TileEntityGarage.lastsVehicle.size(); k++)
                {
                    System.out.println(TileEntityGarage.lastsVehicle.get(k));
                }
                long count = TileEntityGarage.lastsVehicle.stream().filter(vehicleToRender.getVehicleType().shortName::equals).count();
                System.out.println(count);
                if(count >= 2)
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText("Vous avez deja le meme vehicule sorti"));
                    bouttonVehicle.select = false; 
                }
                else
                {
                    FlansMod.getPacketHandler().sendToServer(new PacketSpawn(vehicleToRender.getVehicleType().shortName));
                    bouttonVehicle.select = false;   
                    vehiculename = null;
                }

            }

        }
        else if(button.id >= 100) // Les boutons de v�hicules
        {
            for(VehicleType v : VehicleType.types)
            {
                String nomveh = I18n.format("item." + v.shortName + ".name", (Object[])new Object[0]);
                if(nomveh.equalsIgnoreCase(button.displayString))
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
            //System.out.println(oneSelected + " " + bouttonVehicle.displayString + " " + bouttonVehicle.id + " "+ bouttonVehicle.select);
            //bouttonVehicle.select = oneSelected;
            vehiculename = oneSelected ? button.displayString : "";
            lastClicked = oneSelected ? button.id : -1;
            for(int k = 0; k < buttonList.size() ; k++) 
            {
                GuiButton b = (GuiButton) buttonList.get(k);
                 if(b.id != lastClicked && b.id >= 100) {
                     ((GuiBouton)b).select = false;//!oneSelected;
                 }
            }
            buttonSortir.enabled = oneSelected;//oneSelected;
        }

        vehiculename = button.displayString;

        switch(button.id)
        {
            case 51:
                this.mc.thePlayer.closeScreen();  
                vehiculename = null;
                break;
                
            case 52:
                //System.out.println("Test");
                   FlansMod.packetHandler.sendToServer(new PacketRentrer());
                   //bouttonVehicle.select = false;   
                   vehiculename = null;
                   break;

            default:
                break;
        }

        super.actionPerformed(button);
    }

    public void isBlockSpawn(boolean verif)
    {
        if(verif)
        {
            TileEntityGarage.lastsVehicle.add(vehicleToRender.getVehicleType().shortName);
            vehicleToRender = null;
            //System.out.println("Oueygfi");
        }
            vehicleToRender = null;
    }

    @Override
    public void updateScreen()
    {
        super.updateScreen();

    }

    protected void mouseClicked(int x, int y, int btn)
    {
        super.mouseClicked(x, y, btn);
    }

    public void drawScreen(int x, int y, float f)
    {
        drawDefaultBackground();

        GL11.glPushMatrix();
        mc.getTextureManager().bindTexture(texture);
        int X = (width -  256) / 2;
        int Y = (height - 256) / 2;
        this.drawTexturedModalRect(X, Y+50, 0, 0, 256, 250);
        GL11.glPopMatrix();

        drawString(mc.fontRenderer, StringUtils.abbreviate("Garage de " + this.mc.thePlayer.getDisplayName(), 18), X, Y+51, 0xFFFFFF);
        for(ItemVehicle itemV : FlansMod.vehicleItems)
        {
            String nomveh = I18n.format("item." + itemV.type.shortName + ".name", (Object[])new Object[0]);
            if(nomveh.equals(vehiculename))
            {
                if(vehiculename != null)
                {
                    drawString(mc.fontRenderer, "Model: §a"+vehiculename, this.width / 2 - 10,this.height / 2 - -30,0xFFFFFF);
                    drawString(mc.fontRenderer, "Places passagers: §a"+itemV.type.seats.length, this.width / 2 - 10,this.height / 2 - -45, 0xFFFFFF);
                    drawString(mc.fontRenderer, "Places dans le coffre: §a"+itemV.type.numCargoSlots, this.width / 2 - 10,this.height / 2 - -60, 0xFFFFFF);
                    GL11.glColor4f(1, 1, 1, 1);
                    this.drawModel(x, y, f);
                }
            }
        }

        super.drawScreen(x, y, f);
    }

    public void drawModel(int par0, int par1, float par2)
    {
        GL11.glPushMatrix();
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();

        ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        GL11.glViewport((scaledresolution.getScaledWidth() - 140) / 2 * scaledresolution.getScaleFactor(), (scaledresolution.getScaledHeight() - 140) / 2 * scaledresolution.getScaleFactor(), 512 * scaledresolution.getScaleFactor(), 300 * scaledresolution.getScaleFactor());

        GL11.glTranslatef(-0.75F, -0.1F, 0.0F);

        GL11.glScalef(0.66F, 0.85F, 0.66F);

        Project.gluPerspective(90.599998F, 1.333333F, 9.0F, 180.0F);

        float f1 = 1.0F;

        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();

        RenderHelper.enableStandardItemLighting();

        GL11.glTranslatef(0.0F, -3.6F, -16.0F);

        GL11.glScalef(f1, f1, f1);

        GL11.glScalef(4.0F, 4.0F, 4.0F);

        GL11.glRotatef(20.0F, -1.0F, 0.0F, 0.0F);

        GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);

        float f3 = this.field_74208_u + (this.field_74209_t - this.field_74208_u) * par1;
        GL11.glTranslatef((1.0F - f3) * 0.2F, (1.0F - f3) * 0.1F, (1.0F - f3) * 0.25F);

        GL11.glScalef(1.1F, 1.1F, 0.5F);

        // GL11.glRotatef(this.rotation, 0.0F, 1.0F, 0.0F);

        GL11.glRotatef(-(1.0F - f3) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);

        GL11.glEnable(32826);

        GL11.glScalef(0.3F, 0.3F, 1F);
        Render rend = RenderManager.instance.getEntityClassRenderObject(EntityVehicle.class);
        GL11.glTranslatef(0, 0, -1);
        rend.doRender(vehicleToRender, -2.5, -2, 0, 0, 1);
        vehicleToRender.axes.setAngles(-15, 1, 1);
        GL11.glDisable(32826);
        RenderHelper.disableStandardItemLighting();
        GL11.glMatrixMode(5889);
        GL11.glViewport(0, 0, this.mc.displayWidth, this.mc.displayHeight);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();

        RenderHelper.disableStandardItemLighting();

    }

}
