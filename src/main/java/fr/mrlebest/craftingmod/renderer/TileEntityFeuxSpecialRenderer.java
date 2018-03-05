package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import GLLoader.GLModel;
import fr.mrlebest.craftingmod.glutils.TessellatorModel;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeux;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFeuxSpecialRenderer extends TileEntitySpecialRenderer
{
    public static GLModel model;
    
    public TileEntityFeuxSpecialRenderer()
    {
        model = new GLModel("/assets/obj/Extinguisher.obj");
    }
    
    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick)
    {
        this.renderTileEntityFeuxAt((TileEntityFeux)tile, x, y, z, partialRenderTick); 
    }

    public void renderTileEntityFeuxAt(TileEntity tileentity, double d0, double d1, double d2, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(d0+0.5, d1, d2+0.5);
        GL11.glScaled(0.33, 0.33, 0.33);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        model.render();
        GL11.glPopMatrix();
    }
    

}
