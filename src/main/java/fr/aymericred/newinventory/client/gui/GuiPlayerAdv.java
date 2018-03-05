package fr.aymericred.newinventory.client.gui;

import java.awt.Color;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import fr.aymericred.newinventory.InventoryMod;
import fr.aymericred.newinventory.container.ContainerPlayerAdv;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.util.ResourceLocation;

public class GuiPlayerAdv extends InventoryEffectRenderer
{
    private static final ResourceLocation WIDGITS = new ResourceLocation("textures/gui/widgets.png");
    public static final ResourceLocation TEXTURE = new ResourceLocation(InventoryMod.ID, "textures/gui/inventory.png");
	/** x size of the inventory window in pixels. Defined as  float, passed as int */
    private float xSizeFloat;
    /** y size of the inventory window in pixels. Defined as  float, passed as int. */
    private float ySizeFloat;
    
    //private int openingBag;
    //private final GuiButton openBag = new GuiButton(400, 0, 0, 46, 20, "Sac");

    public GuiPlayerAdv(EntityPlayer p_i1094_1_)
    {
        super(new ContainerPlayerAdv(p_i1094_1_.inventory, p_i1094_1_));
        this.allowUserInput = true;
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        if (this.mc.playerController.isInCreativeMode())
        {
            this.mc.displayGuiScreen(new GuiCreativeAdv(this.mc.thePlayer));
        }
        /*else
        {
        	//openBag.enabled = ((ContainerBaseInv)this.inventorySlots).getBackpackSlot().getStackInSlot(0) != null;
        	if(((ContainerPlayerAdv)inventorySlots).bag && openingBag < 10) {
        		openingBag++;
        		if(openingBag >= 1) {
	            	ByteArrayDataOutput buf = ByteStreams.newDataOutput();
	            	buf.writeInt(400);
	            	mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(InventoryMod.ID+".channel", buf.toByteArray()));
        		}
        	}
        	else
        		openingBag = 0;
        }*/
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        this.buttonList.clear();

        if (this.mc.playerController.isInCreativeMode())
        {
            this.mc.displayGuiScreen(new GuiCreativeAdv(this.mc.thePlayer));
        }
        else
        {
            super.initGui();
            //openBag.xPosition = guiLeft+24; openBag.yPosition = guiTop+139;
            //this.buttonList.add(openBag);
            /*if(((ContainerBaseInv)this.inventorySlots).getBackpackSlot().getStackInSlot(0) != null) {
            	openingBag = 10;
            	ByteArrayDataOutput buf = ByteStreams.newDataOutput();
            	buf.writeInt(400);
            	mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(InventoryMod.ID+".channel", buf.toByteArray()));
            }*/
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
        /**GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(WIDGITS);
        
    	int index = mc.thePlayer.inventory.currentItem;
    	Slot s = this.inventorySlots.getSlotFromInventory(mc.thePlayer.inventory, index);
    	Gui.func_152125_a(s.xDisplayPosition-1, s.yDisplayPosition-2, 0, 22, 24, 22, 18, 18, 256, 256);
        //drawTexturedModalRect(s.xDisplayPosition-2, s.yDisplayPosition-2, 0, 22, 17, 17);
        
        GL11.glDisable(GL11.GL_BLEND);*/
    	
    	/**if(openingBag != 0)
    	{
    		String s = "Tu ouvres le sac...";
    		mc.fontRenderer.drawString(s, this.xSize/2-mc.fontRenderer.getStringWidth(s)/2, this.ySize+3, Color.WHITE.getRGB());
    	}*/
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
    {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
        this.xSizeFloat = (float)p_73863_1_;
        this.ySizeFloat = (float)p_73863_2_;
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(TEXTURE);
        int k = this.guiLeft;
        int l = this.guiTop;
        //Gui.func_152125_a(k, l, 0, 0, 177, 165, xSize, ySize, 177, 165);
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        
    	int index = mc.thePlayer.inventory.currentItem;
    	Slot s = this.inventorySlots.getSlotFromInventory(mc.thePlayer.inventory, index);
    	drawRect(k+s.xDisplayPosition, l+s.yDisplayPosition, k+s.xDisplayPosition+16, l+s.yDisplayPosition+16, Color.decode(""+0x04A1FE).getRGB());
    	//Gui.func_152125_a(s.xDisplayPosition-1, s.yDisplayPosition-2, 0, 22, 24, 22, 18, 18, 256, 256);
    	
        func_147046_a(k + 29, l + 71, 30, (float)(k + 29) - this.xSizeFloat, (float)(l + 72 - 50) - this.ySizeFloat, this.mc.thePlayer);
    }

    public static void func_147046_a(int p_147046_0_, int p_147046_1_, int p_147046_2_, float p_147046_3_, float p_147046_4_, EntityLivingBase p_147046_5_)
    {
        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_147046_0_, (float)p_147046_1_, 50.0F);
        GL11.glScalef((float)(-p_147046_2_), (float)p_147046_2_, (float)p_147046_2_);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        float f2 = p_147046_5_.renderYawOffset;
        float f3 = p_147046_5_.rotationYaw;
        float f4 = p_147046_5_.rotationPitch;
        float f5 = p_147046_5_.prevRotationYawHead;
        float f6 = p_147046_5_.rotationYawHead;
        GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-((float)Math.atan((double)(p_147046_4_ / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
        p_147046_5_.renderYawOffset = (float)Math.atan((double)(p_147046_3_ / 40.0F)) * 20.0F;
        p_147046_5_.rotationYaw = (float)Math.atan((double)(p_147046_3_ / 40.0F)) * 40.0F;
        p_147046_5_.rotationPitch = -((float)Math.atan((double)(p_147046_4_ / 40.0F))) * 20.0F;
        p_147046_5_.rotationYawHead = p_147046_5_.rotationYaw;
        p_147046_5_.prevRotationYawHead = p_147046_5_.rotationYaw;
        GL11.glTranslatef(0.0F, p_147046_5_.yOffset, 0.0F);
        RenderManager.instance.playerViewY = 180.0F;
        RenderManager.instance.renderEntityWithPosYaw(p_147046_5_, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        p_147046_5_.renderYawOffset = f2;
        p_147046_5_.rotationYaw = f3;
        p_147046_5_.rotationPitch = f4;
        p_147046_5_.prevRotationYawHead = f5;
        p_147046_5_.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }

    protected void actionPerformed(GuiButton p_146284_1_)
    {
        if (p_146284_1_.id == 0)
        {
            this.mc.displayGuiScreen(new GuiAchievements(this, this.mc.thePlayer.getStatFileWriter()));
        }
        else if (p_146284_1_.id == 1)
        {
            this.mc.displayGuiScreen(new GuiStats(this, this.mc.thePlayer.getStatFileWriter()));
        }
        /*else if(p_146284_1_.id == 400)
        {
        	ByteArrayDataOutput buf = ByteStreams.newDataOutput();
        	buf.writeInt(400);
        	mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(InventoryMod.ID+".channel", buf.toByteArray()));
        }*/
    }
}