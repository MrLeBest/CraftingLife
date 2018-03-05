package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGarage extends ModelBase
{
    ModelRenderer Block7;
    ModelRenderer Block6;
    ModelRenderer Block5;
    ModelRenderer Block3;
    ModelRenderer Block10;
    ModelRenderer Block8;
    ModelRenderer Block1;
    ModelRenderer Block2;

    public ModelGarage()
    {
        this( 0.0f );
    }

    public ModelGarage( float par1 )
    {
        Block7 = new ModelRenderer( this, 21, 34 );
        Block7.setTextureSize( 128, 128 );
        Block7.addBox( -0.5F, -0.5F, -1.5F, 1, 1, 3);
        Block7.setRotationPoint( 2F, 22.5F, 5.960464E-08F );
        Block6 = new ModelRenderer( this, 12, 12 );
        Block6.setTextureSize( 128, 128 );
        Block6.addBox( -0.5F, -7F, -2F, 1, 14, 4);
        Block6.setRotationPoint( 2F, 14F, 5.960464E-08F );
        Block5 = new ModelRenderer( this, 82, 46 );
        Block5.setTextureSize( 128, 128 );
        Block5.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        Block5.setRotationPoint( -1.6F, 3F, -0.9999999F );
        Block3 = new ModelRenderer( this, 14, 74 );
        Block3.setTextureSize( 128, 128 );
        Block3.addBox( -6F, -0.5F, -6F, 12, 1, 12);
        Block3.setRotationPoint( 5.210593E-08F, 24F, 5.960464E-08F );
        Block10 = new ModelRenderer( this, 34, 27 );
        Block10.setTextureSize( 128, 128 );
        Block10.addBox( -1.5F, -3F, -2.5F, 3, 6, 5);
        Block10.setRotationPoint( 1.310764E-07F, 1.941231F, 0.1617315F );
        Block8 = new ModelRenderer( this, 31, 41 );
        Block8.setTextureSize( 128, 128 );
        Block8.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        Block8.setRotationPoint( 2.2F, 8F, 1F );
        Block1 = new ModelRenderer( this, 13, 3 );
        Block1.setTextureSize( 128, 128 );
        Block1.addBox( -2F, -10F, -3F, 4, 22, 6);
        Block1.setRotationPoint( 0F, 12F, 0F );
        Block2 = new ModelRenderer( this, 9, 46 );
        Block2.setTextureSize( 128, 128 );
        Block2.addBox( -7F, -5F, -0.5F, 14, 10, 1);
        Block2.setRotationPoint( 0F, 2F, -3F );
    }

   public void renderAll()
   {
        Block7.rotateAngleX = -1.525561F;
        Block7.rotateAngleY = 3.141592F;
        Block7.rotateAngleZ = -3.141593F;
        Block7.renderWithRotation(0.0625F);

        Block6.rotateAngleX = 0F;
        Block6.rotateAngleY = 0F;
        Block6.rotateAngleZ = 0F;
        Block6.renderWithRotation(0.0625F);

        Block5.rotateAngleX = 0F;
        Block5.rotateAngleY = 0F;
        Block5.rotateAngleZ = 0F;
        Block5.renderWithRotation(0.0625F);

        Block3.rotateAngleX = 0F;
        Block3.rotateAngleY = 0F;
        Block3.rotateAngleZ = 0F;
        Block3.renderWithRotation(0.0625F);

        Block10.rotateAngleX = -0.3031637F;
        Block10.rotateAngleY = 6.922405E-10F;
        Block10.rotateAngleZ = -3.533751E-08F;
        Block10.renderWithRotation(0.0625F);

        Block8.rotateAngleX = 0F;
        Block8.rotateAngleY = 0F;
        Block8.rotateAngleZ = 1.55694F;
        Block8.renderWithRotation(0.0625F);

        Block1.rotateAngleX = 0F;
        Block1.rotateAngleY = 0F;
        Block1.rotateAngleZ = 0F;
        Block1.renderWithRotation(0.0625F);

        Block2.rotateAngleX = -0.3031637F;
        Block2.rotateAngleY = 0F;
        Block2.rotateAngleZ = 0F;
        Block2.renderWithRotation(0.0625F);

    }

}
