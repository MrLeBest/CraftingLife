package fr.mrlebest.craftingmod.client.gui;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumDriveablePart;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class VehicleOverlay extends Gui
{
    private Minecraft mc;
    private String DXString;
    public static EntityDriveable vehicule;
    public static float speed = 0.0F;
    public static float maxSpeed = 0.0F;
    public EnumDriveablePart type1;
    public DriveableData driveableData;
    public String driveableType;
    public static int etatwheel = 100;
    public static int etatwheelmax = 200;
    public static int fuel = 0;
    public static float fuelMax = 100;
    public EntityVehicle vehiculess;
    private ArrayList<DriveablePart> partsToDraw = new ArrayList();

    public VehicleOverlay(EntityVehicle vehicules)
    {
        vehiculess = vehicules;
    }

    public DriveableData getDriveableData()
    {
        return this.driveableData;
    }

    public DriveableType getDriveableType()
    {
        return DriveableType.getDriveable(this.driveableType);
    }

    public static void setVehicle(EntityDriveable driveable)
    {
        vehicule = driveable;
    }

    public static void setSpeed(float speeds)
    {
        speed = speeds;
    }

    public static void setmaxSpeed(float maxsped)
    {
        maxSpeed = maxsped;
    }

    public static void setFuel(int fueln)
    {
        fuel = fueln;
    }

    public static void setFuelMax(float fuelInTank)
    {
        fuelMax = fuelInTank;
    }

    public VehicleOverlay(Minecraft mc)
    {
        this.mc = mc;
    }

    public static int getWorldMinutes(World world)
    {
        int time = (int)Math.abs((world.getWorldTime() + 6000) % 24000);
        return (time % 1000) * 6 / 100;
    }

    public static int getWorldHours(World world)
    {
        int time = (int)Math.abs((world.getWorldTime() + 6000) % 24000);
        return (int)((float)time / 1000F);
    }

    DriveableType type = getDriveableType();
    DriveableData data = getDriveableData();

    @SubscribeEvent
    public void onRenderRepa(RenderGameOverlayEvent.Post event)
    {
        if((event.type == RenderGameOverlayEvent.ElementType.ALL) && mc.thePlayer.ridingEntity instanceof EntitySeat)
        {
            int essence = fuel;
            ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
            int Width = sr.getScaledWidth();
            int Height = sr.getScaledHeight();
            int x = 40 / 6;
            int y = 40 / 6;
            this.mc.renderEngine.bindTexture(new ResourceLocation("craftingmod", "textures/gui/voiture.png"));
            drawTexturedModalRect(0, 0, 0, 0, 140, 174);

            if(vehicule instanceof EntityVehicle)
            {
                EntityVehicle v = (EntityVehicle)vehicule;
                String nomveh = I18n.format("item." + v.getVehicleType().shortName + ".name", (Object[])new Object[0]);
                if(!v.isVehicleLocked())
                {
                    drawTexturedModalRect(102, 57, 160, 0, 50, 100);
                }
                else
                {
                    drawTexturedModalRect(108, 57, 145, 0, 10, 100);
                } 

            String essences = essence + "L";
          
            double speedMS = vehicule.getDistance(vehicule.prevPosX, vehicule.prevPosY, vehicule.prevPosZ) * 20;
            double speedKH = Math.sqrt(speedMS) * 3.6;

            GL11.glPushMatrix();
            GL11.glScalef(2F, 2F, 1);
            if(speedKH >= 0)
            {
                drawString(Minecraft.getMinecraft().fontRenderer, speedKH * speed + " km/h", x + 13, y + 10, 16777215);
            }
            else if (speedKH < 0)
            {
                drawString(Minecraft.getMinecraft().fontRenderer, Math.abs(speedKH) + " km/h", x + 13, y + 10, 0xffffff);
                GL11.glScalef(0.4F, 0.4F, 1F);
                drawString(Minecraft.getMinecraft().fontRenderer, "R", x + 30, y + 45, 0xffffff);
            }
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glScalef(0.5F, 0.5F, 1);
            drawString(Minecraft.getMinecraft().fontRenderer, "Réservoir", x + 112, y + 103, 0x3498db);
            drawString(Minecraft.getMinecraft().fontRenderer, getWorldHours(mc.theWorld) + "h:" + getWorldMinutes(mc.theWorld) + "m", x + 35, y + 125, 0x3498db);
            drawString(Minecraft.getMinecraft().fontRenderer, nomveh, x + 15, y + 17, 16777215);
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glScalef(0.7F, 0.7F, 1);
            drawString(Minecraft.getMinecraft().fontRenderer, essences, x + 85, y + 87, 0x3498db);
            GL11.glPopMatrix();

        }
        }
    }

}
