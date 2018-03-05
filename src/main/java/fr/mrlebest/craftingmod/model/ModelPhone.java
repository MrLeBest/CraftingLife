package fr.mrlebest.craftingmod.model;


import fr.mrlebest.craftingmod.glutils.Model;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelPhone extends ModelBase
{
    ModelRenderer Block;
    ModelRenderer Block1;
    ModelRenderer Block2;

    public ModelPhone()
    {
        this( 0.0f );
    }

    public ModelPhone( float par1 )
    {
        Block = new ModelRenderer( this, 23, 10 );
        Block.setTextureSize( 64, 32 );
        Block.addBox( -2F, -1.5F, -0.5F, 4, 3, 1);
        Block.setRotationPoint( 0F, 22.5F, 0F );
        Block1 = new ModelRenderer( this, 17, 4 );
        Block1.setTextureSize( 64, 32 );
        Block1.addBox( -1F, -3F, -0.5F, 2, 6, 1);
        Block1.setRotationPoint( 0F, 21F, 0F );
        Block2 = new ModelRenderer( this, 14, 14 );
        Block2.setTextureSize( 64, 32 );
        Block2.addBox( -1.5F, -1F, -0.5F, 3, 2, 1);
        Block2.setRotationPoint( 0F, 23F, 1F );
    }

   public void renderAll()
   {
        Block.rotateAngleX = 0.6676952F;
        Block.rotateAngleY = -3.141593F;
        Block.rotateAngleZ = -3.141593F;
        Block.renderWithRotation(0.0625F);

        Block1.rotateAngleX = 0.07739491F;
        Block1.rotateAngleY = -3.141593F;
        Block1.rotateAngleZ = -3.141593F;
        Block1.renderWithRotation(0.0625F);

        Block2.rotateAngleX = 0.8749381F;
        Block2.rotateAngleY = 0F;
        Block2.rotateAngleZ = 0F;
        Block2.renderWithRotation(0.0625F);

    }

}
