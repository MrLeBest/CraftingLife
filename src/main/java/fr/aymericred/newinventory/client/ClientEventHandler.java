package fr.aymericred.newinventory.client;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.aymericred.newinventory.InventoryMod;
import fr.aymericred.newinventory.client.gui.GuiChestWithBag;
import fr.aymericred.newinventory.client.gui.GuiPlayerAdv;
import fr.aymericred.newinventory.container.InventoryPlayerAdv;
import fr.aymericred.newinventory.core.ContainerChestAdv;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class ClientEventHandler 
{
	public static final Minecraft mc = Minecraft.getMinecraft();
	public static final ResourceLocation SLOT_TEXTURE = new ResourceLocation(InventoryMod.ID, "texture/gui/africa.png");
	
	@SubscribeEvent
	public void onGuiOpened(GuiOpenEvent event)
	{
		if(event.gui instanceof GuiInventory)
		{
			event.gui = new GuiPlayerAdv(mc.thePlayer);
		}
		else if(event.gui instanceof GuiChest)// && ((InventoryPlayerAdv)mc.thePlayer.inventory).currentBag != null)
		{
			event.gui = new GuiChestWithBag(mc.thePlayer, ContainerChestAdv.setOpeningBagChest());
		}
	}
	@SubscribeEvent
	public void overlayRender(RenderGameOverlayEvent.Pre event)
	{
		if(event.type.equals(ElementType.HOTBAR))
		{
			event.setCanceled(true);
			ScaledResolution r = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			mc.getTextureManager().bindTexture(new ResourceLocation(InventoryMod.ID, "textures/gui/africa.png"));
			Gui.func_152125_a(r.getScaledWidth()-10-40, r.getScaledHeight()-10-40, 0, 0, 103, 103, 40, 40, 103, 103);
			
			if(mc.thePlayer.getHeldItem() != null)
			{
				GL11.glScaled(2.1, 2.1, 1);
				RenderItem.getInstance().renderItemIntoGUI(mc.fontRenderer, mc.renderEngine, mc.thePlayer.getHeldItem(), (int) ((r.getScaledWidth()-15-30)/2.1), (int) ((r.getScaledHeight()-15-30)/2.1), true);
				GL11.glScaled(1/2.1, 1/2.1, 1);
				RenderItem.getInstance().renderItemOverlayIntoGUI(mc.fontRenderer, mc.renderEngine, mc.thePlayer.getHeldItem(), (int) ((r.getScaledWidth()-14-16)), (int) ((r.getScaledHeight()-14-16)));
			}
            GL11.glDisable(GL11.GL_LIGHTING);
		}
	}
}