package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import fr.mrlebest.craftingmod.model.ModelPerce;
import fr.mrlebest.craftingmod.tileentity.TileEntityPerceuse;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityPerceuseSpecialRenderer extends TileEntitySpecialRenderer
{
    public static ModelPerce model = new ModelPerce();
    public static ResourceLocation texture = new ResourceLocation("craftingmod:textures/models/blocks/model_perceuse.png");

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick)
    {
        this.renderTileEntityPerceuseAt((TileEntityPerceuse)tile, x, y, z, partialRenderTick); 
    }

    private void renderTileEntityPerceuseAt(TileEntityPerceuse tile, double x, double y, double z, float partialRenderTick) 
    {
        
        GL11.glPushMatrix(); // ouvre une matrix
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D); // déplace le bloc sur les coordonnés et le centre
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F); // met droit le bloc (par défaut il est à l'envers)
        GL11.glRotatef(10F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
        this.bindTexture(texture); // affiche la texture
        model.renderAll(); // rend le modèle
        GL11.glPopMatrix(); // ferme la matri

    }

}

  
