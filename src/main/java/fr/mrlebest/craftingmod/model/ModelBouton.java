package fr.mrlebest.craftingmod.model;

import javax.swing.text.html.parser.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelBouton extends ModelBase
{
    ModelRenderer Block1;
    ModelRenderer inte;

    public ModelBouton()
    {
        this( 0.0f );
    }

    public ModelBouton( float par1 )
    {
        Block1 = new ModelRenderer( this, 15, 15 );
        Block1.setTextureSize( 64, 32 );
        Block1.addBox( -1.5F, -1.5F, -0.5F, 3, 3, 1);
        Block1.setRotationPoint( 0F, 16F, 8F );
        inte = new ModelRenderer( this, 11, 9 );
        inte.setTextureSize( 64, 32 );
        inte.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        inte.setRotationPoint( 0F, 16F, 7.5F );
    }

   public void renderAll(boolean enabled)
   {
        Block1.rotateAngleX = 0F;
        Block1.rotateAngleY = 0F;
        Block1.rotateAngleZ = 0F;
        Block1.renderWithRotation(0.0625F);

        if (!enabled){
            inte.rotateAngleX = 0.08845568F;
        }else{
            inte.rotateAngleX = -0.1368953F;
        }
        
        inte.rotateAngleY = 0F;
        inte.rotateAngleZ = 0F;
        inte.renderWithRotation(0.0625F);

    }

}
