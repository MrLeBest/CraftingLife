package fr.aymericred.newinventory.client.gui;

import org.lwjgl.opengl.GL11;

import fr.aymericred.newinventory.container.InventoryPlayerAdv;
import fr.aymericred.newinventory.utils.BagpackUtils.IBagpack;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.util.ResourceLocation;

public class GuiChestWithBag extends GuiContainer 
{
	public static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/generic_54.png");
    private int inventoryRows;

    public GuiChestWithBag(EntityPlayer p_i1094_1_, IInventory chest)
    {
        super(new ContainerChest(p_i1094_1_.inventory, chest));
        this.allowUserInput = true;
        this.inventoryRows = chest.getSizeInventory() / 9;
        this.ySize = 222-108 + this.inventoryRows * 18;
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
        int id = ((IBagpack)((InventoryPlayerAdv)mc.thePlayer.inventory).currentBag.getItem()).getId();
        this.mc.getTextureManager().bindTexture(GuiBagpack.TEXTURES[id]);
        int k = this.guiLeft+50;
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
			Gui.func_152125_a(guiLeft, guiTop, 0, 0, 50, 88, 50, 88, 50, 88);
			break;
		}
        this.mc.getTextureManager().bindTexture(TEXTURE);
        //int k = (this.width - this.xSize) / 2;
        //int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize-50, this.inventoryRows * 18 + 17);
        this.drawTexturedModalRect(k, l + this.inventoryRows * 18 + 17, 0, 126, this.xSize-50, 96);
        //this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        //GuiPlayerAdv.func_147046_a(k + 26, l + 71, 30, (float)(k + 51) - p_146976_2_, (float)(l + 75 - 50) - p_146976_3_, this.mc.thePlayer);
    }
}
