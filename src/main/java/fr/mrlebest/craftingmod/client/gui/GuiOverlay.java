package fr.mrlebest.craftingmod.client.gui;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.mrlebest.craftingmod.common.entity.EntityItem;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.handlers.gamelogic.ThirstStats;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class GuiOverlay extends Gui
{
    private ExtPropCraftingLife props;
    private Minecraft mc;
    private static final ResourceLocation icons = new ResourceLocation("craftingmod", "textures/gui/icons.png");

    public GuiOverlay()
    {
        this.mc = Minecraft.getMinecraft();
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent event)
    {
        if(event.type == RenderGameOverlayEvent.ElementType.HEALTH || event.type == RenderGameOverlayEvent.ElementType.FOOD || event.type == RenderGameOverlayEvent.ElementType.ARMOR || event.type == RenderGameOverlayEvent.ElementType.EXPERIENCE)
        {
            event.setCanceled(true);

            props = ExtPropCraftingLife.get(mc.thePlayer);
            ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
            int Width = sr.getScaledWidth();
            int Height = sr.getScaledHeight();
            GuiIngame localGuiIngame = Minecraft.getMinecraft().ingameGUI;
            Minecraft.getMinecraft().getTextureManager().bindTexture(icons);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if(event.type == RenderGameOverlayEvent.ElementType.FOOD)
            {
                localGuiIngame.drawTexturedModalRect(Width - 32, Height / 2 + 80, 30, 0, 13, 20);
                FMLClientHandler.instance().getClient().fontRenderer.drawString("§b" + Math.round(Minecraft.getMinecraft().thePlayer.getFoodStats().getFoodLevel() * 5) + "", Width - 20, Height / 2 + 87, 5132111);
            }
            else if(event.type == RenderGameOverlayEvent.ElementType.HEALTH)
            {
                localGuiIngame.drawTexturedModalRect(Width - 33, Height / 2 + 67, 7, 0, 15, 94);
                FMLClientHandler.instance().getClient().fontRenderer.drawString("§b" + Math.round(Minecraft.getMinecraft().thePlayer.getHealth() * 5.0F) + "", Width - 20, Height / 2 + 75, 5132111);
            }
            else if(event.type == RenderGameOverlayEvent.ElementType.ARMOR)
            {
                localGuiIngame.drawTexturedModalRect(Width - 32, Height / 2 + 93, 50, 0, 20, 256);
                FMLClientHandler.instance().getClient().fontRenderer.drawString("§b" + Minecraft.getMinecraft().thePlayer.getTotalArmorValue() * 5 + "", Width - 18, Height / 2 + 102, 16777215);
            }
            else if(mc.playerController.isNotCreative())
            {
                localGuiIngame.drawTexturedModalRect(Width / 230, Height / 2 + 93, 70, 0, 11, 17);
                FMLClientHandler.instance().getClient().fontRenderer.drawString("§b" + (ThirstStats.THIRST_DEFAULT_MAX_VALUE - props.thirstSystem.getCurrentThirstLevel()) + "", Width / 230 + 15, Height / 2 + 100, 16777215);
            }

        }

    }

}
