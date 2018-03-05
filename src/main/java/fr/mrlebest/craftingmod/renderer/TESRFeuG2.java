package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import fr.mrlebest.craftingmod.glutils.TessellatorModel;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeu;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeuG2;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TESRFeuG2 extends TileEntitySpecialRenderer{

    
    public static TessellatorModel model, modeli;

    
    public TESRFeuG2()
    {
        model = new TessellatorModel("/assets/obj/model_feu.obj");
        modeli = new TessellatorModel("/assets/obj/model_feu.obj");
    }
    
    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick)
    {
        this.renderTileEntityFeuAt((TileEntityFeuG2)tile, x, y, z, partialRenderTick); 
    }

    public void renderTileEntityFeuAt(TileEntityFeuG2 tileentity, double d0, double d1, double d2, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated(d0+0.5, d1+ 0.5, d2+0.5);
        GL11.glScaled(1.0, 1.0, 1.0);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        GL11.glRotatef(180F+90F * tileentity.getDirection(), 0.0F, 1.0F, 0.0F);
        GL11.glTranslated(0, -0.5, 0);
        model.render();
        GL11.glPopMatrix();
    }

}