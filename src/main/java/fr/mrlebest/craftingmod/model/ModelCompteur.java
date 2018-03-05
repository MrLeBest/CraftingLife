package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCompteur extends ModelBase
{
    ModelRenderer Block1;
    ModelRenderer Block5;
    ModelRenderer Block2;
    ModelRenderer Block3;
    ModelRenderer Block4;
    ModelRenderer Block6;

    public ModelCompteur()
    {
        this( 0.0f );
    }

    public ModelCompteur( float par1 )
    {
        Block1 = new ModelRenderer( this, 37, 3 );
        Block1.setTextureSize( 64, 32 );
        Block1.addBox( -0.5F, -11.5F, -0.5F, 1, 23, 1);
        Block1.setRotationPoint( -8F, 14F, -5.5F );
        Block5 = new ModelRenderer( this, 9, 9 );
        Block5.setTextureSize( 64, 32 );
        Block5.addBox( -1F, -1.5F, -3.5F, 2, 3, 7);
        Block5.setRotationPoint( -8F, 9F, -4F );
        Block2 = new ModelRenderer( this, 9, 9 );
        Block2.setTextureSize( 64, 32 );
        Block2.addBox( -1.5F, -4F, -3.5F, 3, 8, 7);
        Block2.setRotationPoint( -8F, -1F, -4.82717F );
        Block3 = new ModelRenderer( this, 48, 5 );
        Block3.setTextureSize( 64, 32 );
        Block3.addBox( -0.5F, -3.5F, -3F, 1, 7, 6);
        Block3.setRotationPoint( -6.7F, -1F, -4.83F );
        Block4 = new ModelRenderer( this, 10, 5 );
        Block4.setTextureSize( 64, 32 );
        Block4.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        Block4.setRotationPoint( -6.5F, 0F, -3F );
        Block6 = new ModelRenderer( this, 37, 3 );
        Block6.setTextureSize( 64, 32 );
        Block6.addBox( -0.5F, -4F, -0.5F, 1, 8, 1);
        Block6.setRotationPoint( -8F, 7F, -3F );
    }

   public void renderAll()
   {
        Block1.rotateAngleX = 0F;
        Block1.rotateAngleY = 0F;
        Block1.rotateAngleZ = 0F;
        Block1.renderWithRotation(0.0625F);

        Block5.rotateAngleX = 0F;
        Block5.rotateAngleY = 0F;
        Block5.rotateAngleZ = 0F;
        Block5.renderWithRotation(0.0625F);

        Block2.rotateAngleX = 0F;
        Block2.rotateAngleY = 0F;
        Block2.rotateAngleZ = 0F;
        Block2.renderWithRotation(0.0625F);

        Block3.rotateAngleX = 0F;
        Block3.rotateAngleY = 0F;
        Block3.rotateAngleZ = 0F;
        Block3.renderWithRotation(0.0625F);

        Block4.rotateAngleX = 0F;
        Block4.rotateAngleY = 0F;
        Block4.rotateAngleZ = 0F;
        Block4.renderWithRotation(0.0625F);

        Block6.rotateAngleX = 0F;
        Block6.rotateAngleY = 0F;
        Block6.rotateAngleZ = 0F;
        Block6.renderWithRotation(0.0625F);

    }

}
