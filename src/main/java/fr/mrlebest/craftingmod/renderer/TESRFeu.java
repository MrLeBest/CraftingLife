package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import GLLoader.GLApp;
import GLLoader.GLModel;
import GLLoader.GL_Mesh;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeu;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TESRFeu extends TileEntitySpecialRenderer
{
    public static GLModel model;
    private int textureHandleID0, textureHandleID1, textureHandleID2, textureHandleID3;
    private GL_Mesh mainMesh;

    public TESRFeu()
    {
        model = new GLModel("/assets/obj/model_feu.obj");
        mainMesh = model.loadMesh("/assets/obj/model_feu.obj");
        try
        {
            textureHandleID0 = GLApp.makeTexture("/assets/obj/lights.png");
            textureHandleID1 = GLApp.makeTexture("/assets/obj/lights_red.png");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    
    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick)
    {
        this.renderTileEntityFeuAt((TileEntityFeu)tile, x, y, z, partialRenderTick); 
    }

    public void renderTileEntityFeuAt(TileEntityFeu tileentity, double d0, double d1, double d2, float f)
    {
        GL11.glPushMatrix();
        GL11.glColor4f(1F, 1F, 1F, 1F);
        GL11.glTranslated(d0 + 0.5, d1 + 0.5, d2 + 0.5);
        GL11.glScaled(1.0, 1.0, 1.0);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        GL11.glRotatef(180F + 90F * tileentity.getDirection(), 0.0F, 1.0F, 0.0F);
        //GL11.glTranslated(0, -0.5, 0);
        switch(tileentity.getLightState())
        {
            case 0:
                this.mainMesh.materials[1].setTextureFile("lights.png");
                this.mainMesh.materials[1].setTexture(textureHandleID0);
                break;
            case 1:
                this.mainMesh.materials[1].setTextureFile("lights_red.png");
                this.mainMesh.materials[1].setTexture(textureHandleID1);
                break;

        }

        //GL11.glTranslated(d0+0.5, d1+ 0.5, d2+0.5);
        GL11.glScaled(1.0, 1.0, 1.0);
        GL11.glShadeModel(GL11.GL_SMOOTH);
        GL11.glRotatef(180F+90F * tileentity.getDirection(), 0.0F, 1.0F, 0.0F);
        GL11.glTranslated(0, -0.5, 0);
        model.render();
        GL11.glPopMatrix();
    }

}