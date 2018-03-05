package fr.mrlebest.craftingmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class BoutonFermer extends GuiButton{

    protected static final ResourceLocation closeButton = new ResourceLocation("craftingmod","textures/gui/concessionnaire.png");
	
	public BoutonFermer(int par1, int par2, int par3, int par4, int par5, String str)
	{
	   super(par1, par2, par3, par4, par5, str);
	}
	
    public void drawButton(Minecraft mc, int par2, int par3)
	{  
        FontRenderer fontrenderer = mc.fontRenderer;
    	mc.renderEngine.bindTexture(closeButton);
    	//GL11.glPushMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		//GL11.glScaled(0.3, 0.3, 0.3);
		drawTexturedModalRect(xPosition, yPosition, 0, 241, 23, 10);
		//System.out.println((int)3.3333333333333335);
		//GL11.glPopMatrix();

	}
    protected void mouseDragged(Minecraft p_146119_1_, int p_146119_2_, int p_146119_3_) {
    	
    }

}
