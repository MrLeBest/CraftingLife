package fr.mrlebest.craftingmod.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class BoutonAnim extends GuiButton
{
    protected static final ResourceLocation acheterButton = new ResourceLocation("craftingmod","textures/gui/Acheter.png");

    public BoutonAnim(int p_i1021_1_, int p_i1021_2_, int p_i1021_3_, int p_i1021_4_, int p_i1021_5_, String p_i1021_6_)
    {
        super(p_i1021_1_, p_i1021_2_, p_i1021_3_, p_i1021_4_, p_i1021_5_, p_i1021_6_);
        // TODO Auto-generated constructor stub
    }
    
    public void drawButton(Minecraft mc, int par2, int par3)
    {  
        FontRenderer fontrenderer = mc.fontRenderer;
        mc.renderEngine.bindTexture(acheterButton);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        boolean flag = par2 >= xPosition && par3 >= yPosition && par2 < xPosition + width && par3 < yPosition + height;
        int i = getHoverState(flag);

        drawTexturedModalRect(xPosition, yPosition, 0, 0, width, height);
        
        this.drawCenteredString(fontrenderer, "§f"+this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, i);

    }

}
