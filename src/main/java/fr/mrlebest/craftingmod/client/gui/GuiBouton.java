package fr.mrlebest.craftingmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class GuiBouton extends GuiButton
{   
	
	public boolean select;
	
	
	public GuiBouton(int par1, int par2, int par3, int par4, int par5, String str)
	{
	   super(par1, par2, par3, par4, par5, str);
	}
	
    public boolean mousePressed(Minecraft mc, int posX, int posY)
    {
        if(this.enabled && this.visible && posX >= this.xPosition && posY >= this.yPosition && posX < this.xPosition + this.width && posY < this.yPosition + this.height)
        {
               this.select = !this.select;
              // System.out.println(select);

               return true;
         }
         return false;
    }
	
	
    public void drawButton(Minecraft mc, int par2, int par3)
	{  	
        FontRenderer fontrenderer = mc.fontRenderer;

        
    	if (this.select){
    		drawCenteredString(fontrenderer, "§3"+this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, 1);
    	}else{
    		drawCenteredString(fontrenderer, "§f"+this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, 1);
    	}

		
	}
}