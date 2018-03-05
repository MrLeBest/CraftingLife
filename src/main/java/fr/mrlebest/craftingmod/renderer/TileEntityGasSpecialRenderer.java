package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import GLLoader.GLModel;
import fr.mrlebest.craftingmod.glutils.TessellatorModel;
import fr.mrlebest.craftingmod.tileentity.TileEntityGas;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGasSpecialRenderer extends TileEntitySpecialRenderer
{
    
    public static  GLModel model;
    
    public TileEntityGasSpecialRenderer()
    {
        model = new GLModel("/assets/obj/Gasoline_Canister.obj");

    }
    
    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick)
    {
        this.renderTileEntityGasAt((TileEntityGas)tile, x, y, z, partialRenderTick); 
    }

    public void renderTileEntityGasAt(TileEntity tileentity, double d0, double d1, double d2, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(d0+0.5, d1, d2+0.5);
        GL11.glScaled(1.0, 1.0, 1.0);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        model.render();
        GL11.glPopMatrix();
    }

}
