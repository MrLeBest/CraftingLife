package fr.aymericred.newinventory.client.gui;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import fr.aymericred.newinventory.InventoryMod;
import fr.aymericred.newinventory.container.ContainerBagpack;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GuiBagpack extends GuiContainer 
{
	public static final ResourceLocation[] TEXTURES = new ResourceLocation[]{new ResourceLocation(InventoryMod.ID, "textures/gui/sacoche.png"), new ResourceLocation(InventoryMod.ID, "textures/gui/Grand sac.png"), 
    		new ResourceLocation(InventoryMod.ID, "textures/gui/Sac militaire.png"), new ResourceLocation(InventoryMod.ID, "textures/gui/militaire.png")};

    public GuiBagpack(EntityPlayer p_i1094_1_, ItemStack bag)
    {
        super(new ContainerBagpack(p_i1094_1_.inventory, p_i1094_1_, bag));
        this.allowUserInput = true;
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        if (this.mc.playerController.isInCreativeMode())
        {
            this.mc.displayGuiScreen(new GuiContainerCreative(this.mc.thePlayer));
        }
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        this.buttonList.clear();

        if (this.mc.playerController.isInCreativeMode())
        {
            this.mc.displayGuiScreen(new GuiContainerCreative(this.mc.thePlayer));
        }
        else
        {
            super.initGui();
            this.guiLeft = this.guiLeft - 50;
            this.xSize = this.xSize + 50;
        }
    }
    
    @Override
    protected void keyTyped(char p_73869_1_, int p_73869_2_)
    {
    	/*if(p_73869_2_ == 1)
    	{
            mc.getNetHandler().addToSendQueue(new C0DPacketCloseWindow(inventorySlots.windowId));
    		mc.displayGuiScreen(new GuiPlayerAdv(mc.thePlayer));
    	}
    	else*/
    		super.keyTyped(p_73869_1_, p_73869_2_);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        //this.fontRendererObj.drawString(I18n.format("container.crafting", new Object[0]), 86, 16, 4210752);
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
    {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int id = ((ContainerBagpack)this.inventorySlots).getBagIn().getId();
        this.mc.getTextureManager().bindTexture(TEXTURES[id]);
        int k = this.guiLeft+51;
        int l = this.guiTop;
        switch (id) {
		case 0:
			Gui.func_152125_a(guiLeft+24, guiTop, 0, 0, 26, 53, 26, 53, 26, 53);
			break;
		case 1:
			Gui.func_152125_a(guiLeft, guiTop, 0, 0, 50, 88, 50, 88, 50, 88);
			break;
		case 2:
			Gui.func_152125_a(guiLeft, guiTop, 0, 0, 50, 88, 50, 88, 50, 88);
			break;
		case 3:
			Gui.func_152125_a(guiLeft, guiTop, 0, 0, 50, 120, 50, 120, 50, 120);
			break;
		}
        this.mc.getTextureManager().bindTexture(GuiPlayerAdv.TEXTURE);
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        
    	int index = mc.thePlayer.inventory.currentItem;
    	Slot s = this.inventorySlots.getSlotFromInventory(mc.thePlayer.inventory, index);
    	drawRect(k+s.xDisplayPosition-51, l+s.yDisplayPosition, k+s.xDisplayPosition+16-51, l+s.yDisplayPosition+16, Color.decode(""+0x04A1FE).getRGB());
    	
        GuiPlayerAdv.func_147046_a(k + 26, l + 71, 30, (float)(k + 51) - p_146976_2_, (float)(l + 75 - 50) - p_146976_3_, this.mc.thePlayer);
    }
}
