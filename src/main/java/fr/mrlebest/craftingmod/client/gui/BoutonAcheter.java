package fr.mrlebest.craftingmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class BoutonAcheter extends GuiButton{

    protected static final ResourceLocation acheterButton = new ResourceLocation("craftingmod","textures/gui/Acheter.png");
	
	public BoutonAcheter(int par1, int par2, int par3, int par4, int par5, String str)
	{
	   super(par1, par2, par3, par4, par5, str);
	}
	
    public void drawButton(Minecraft mc, int par2, int par3)
	{  
    	if(!visible)
    		return;
        FontRenderer fontrenderer = mc.fontRenderer;
    	mc.renderEngine.bindTexture(acheterButton);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		boolean flag = par2 >= xPosition && par3 >= yPosition && par2 < xPosition + width && par3 < yPosition + height;
		int i = getHoverState(flag);

		drawTexturedModalRect(xPosition, yPosition, 0, 0, width, height);
		
		this.drawCenteredString(fontrenderer, "§f"+this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, i);

	}
    protected void mouseDragged(Minecraft p_146119_1_, int p_146119_2_, int p_146119_3_) {
    	
    }

}
