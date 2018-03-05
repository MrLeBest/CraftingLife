package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import fr.mrlebest.craftingmod.model.ModelCasier;
import fr.mrlebest.craftingmod.tileentity.TileEntityBouton;
import fr.mrlebest.craftingmod.tileentity.TileEntityCasier;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TESRCasier extends TileEntitySpecialRenderer
{

    public static ModelCasier model = new ModelCasier();
    public static ResourceLocation texture = new ResourceLocation("craftingmod:textures/models/blocks/model_casier.png");

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick)
    {
        this.renderTileEntityCasierAt((TileEntityCasier)tile, x, y, z, partialRenderTick); 
    }

    private void renderTileEntityCasierAt(TileEntityCasier tile, double x, double y, double z, float partialRenderTick) 
    {
        
        GL11.glPushMatrix(); // ouvre une matrix
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D); // déplace le bloc sur les coordonnés et le centre
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F); // met droit le bloc (par défaut il est à l'envers)
        GL11.glRotatef(180F + 90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
        GL11.glTranslated(0, 0, -0.5);
        this.bindTexture(texture); // affiche la texture
        model.renderAll(); // rend le modèle
        GL11.glPopMatrix(); // ferme la matrix
        
        

    }

}
