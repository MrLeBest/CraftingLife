package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFoot extends ModelBase
{
    ModelRenderer Block1;
    ModelRenderer Block6;
    ModelRenderer Block7;
    ModelRenderer fil1;
    ModelRenderer fil2;
    ModelRenderer Block8;
    ModelRenderer Block9;
    ModelRenderer fil3;
    ModelRenderer fil4;
    ModelRenderer fil5;
    ModelRenderer Block10;
    ModelRenderer Block11;
    ModelRenderer Block12;
    ModelRenderer fil6;
    ModelRenderer fil7;

    public ModelFoot()
    {
        this( 0.0f );
    }

    public ModelFoot( float par1 )
    {
        Block1 = new ModelRenderer( this, 14, 14 );
        Block1.setTextureSize( 512, 256 );
        Block1.addBox( -1F, -16F, -1F, 2, 32, 2);
        Block1.setRotationPoint( 0F, 8F, 0F );
        Block6 = new ModelRenderer( this, 14, 14 );
        Block6.setTextureSize( 512, 256 );
        Block6.addBox( -1F, -25.5F, -1F, 2, 51, 2);
        Block6.setRotationPoint( 25F, -7F, 0F );
        Block7 = new ModelRenderer( this, 14, 14 );
        Block7.setTextureSize( 512, 256 );
        Block7.addBox( -1F, -16F, -1F, 2, 32, 2);
        Block7.setRotationPoint( 50F, 8F, 0F );
        fil1 = new ModelRenderer( this, 60, 45 );
        fil1.setTextureSize( 512, 256 );
        fil1.addBox( -0.5F, -15F, -9F, 1, 30, 18);
        fil1.setRotationPoint( 50F, 9F, 10F );
        fil2 = new ModelRenderer( this, 60, 45 );
        fil2.setTextureSize( 512, 256 );
        fil2.addBox( -0.5F, -15F, -9F, 1, 30, 18);
        fil2.setRotationPoint( 0F, 9F, 10F );
        Block8 = new ModelRenderer( this, -5, -5 );
        Block8.setTextureSize( 512, 256 );
        Block8.addBox( -1F, -1F, -10.5F, 2, 2, 21);
        Block8.setRotationPoint( 0F, -7F, 10F );
        Block9 = new ModelRenderer( this, -5, -5 );
        Block9.setTextureSize( 512, 256 );
        Block9.addBox( -1F, -1F, -10.5F, 2, 2, 21);
        Block9.setRotationPoint( 50F, -7F, 10F );
        fil3 = new ModelRenderer( this, 60, 45 );
        fil3.setTextureSize( 512, 256 );
        fil3.addBox( -0.5F, -15F, -9F, 1, 30, 18);
        fil3.setRotationPoint( 9F, 9F, 19F );
        fil4 = new ModelRenderer( this, 60, 45 );
        fil4.setTextureSize( 512, 256 );
        fil4.addBox( -0.5F, -15F, -9F, 1, 30, 18);
        fil4.setRotationPoint( 27F, 9F, 19F );
        fil5 = new ModelRenderer( this, 65, 50 );
        fil5.setTextureSize( 512, 256 );
        fil5.addBox( -0.5F, -15F, -6.5F, 1, 30, 13);
        fil5.setRotationPoint( 41.5F, 9F, 19F );
        Block10 = new ModelRenderer( this, 14, 14 );
        Block10.setTextureSize( 512, 256 );
        Block10.addBox( -2F, -16F, -1F, 4, 32, 2);
        Block10.setRotationPoint( 49F, 8F, 20F );
        Block11 = new ModelRenderer( this, 14, 14 );
        Block11.setTextureSize( 512, 256 );
        Block11.addBox( -2F, -16F, -1F, 4, 32, 2);
        Block11.setRotationPoint( 1F, 8F, 20F );
        Block12 = new ModelRenderer( this, 14, 14 );
        Block12.setTextureSize( 512, 256 );
        Block12.addBox( -1F, -25.5F, -1F, 2, 51, 2);
        Block12.setRotationPoint( 25F, -7F, 20F );
        fil6 = new ModelRenderer( this, 60, 45 );
        fil6.setTextureSize( 512, 256 );
        fil6.addBox( -0.5F, -15F, -9F, 1, 30, 18);
        fil6.setRotationPoint( 34F, -7F, 10F );
        fil7 = new ModelRenderer( this, 60, 45 );
        fil7.setTextureSize( 512, 256 );
        fil7.addBox( -0.5F, -15F, -9F, 1, 30, 18);
        fil7.setRotationPoint( 16F, -7F, 10F );
    }

   public void renderAll()
   {
        Block1.rotateAngleX = 0F;
        Block1.rotateAngleY = 0F;
        Block1.rotateAngleZ = 0F;
        Block1.renderWithRotation(0.0625F);

        Block6.rotateAngleX = 0F;
        Block6.rotateAngleY = 0F;
        Block6.rotateAngleZ = -1.570796F;
        Block6.renderWithRotation(0.0625F);

        Block7.rotateAngleX = 0F;
        Block7.rotateAngleY = 0F;
        Block7.rotateAngleZ = 0F;
        Block7.renderWithRotation(0.0625F);

        fil1.rotateAngleX = 0F;
        fil1.rotateAngleY = 0F;
        fil1.rotateAngleZ = 0F;
        fil1.renderWithRotation(0.0625F);

        fil2.rotateAngleX = 0F;
        fil2.rotateAngleY = 0F;
        fil2.rotateAngleZ = 0F;
        fil2.renderWithRotation(0.0625F);

        Block8.rotateAngleX = 0F;
        Block8.rotateAngleY = 0F;
        Block8.rotateAngleZ = -1.570796F;
        Block8.renderWithRotation(0.0625F);

        Block9.rotateAngleX = 0F;
        Block9.rotateAngleY = 0F;
        Block9.rotateAngleZ = -1.570796F;
        Block9.renderWithRotation(0.0625F);

        fil3.rotateAngleX = 0F;
        fil3.rotateAngleY = -1.570796F;
        fil3.rotateAngleZ = 0F;
        fil3.renderWithRotation(0.0625F);

        fil4.rotateAngleX = 0F;
        fil4.rotateAngleY = -1.570796F;
        fil4.rotateAngleZ = 0F;
        fil4.renderWithRotation(0.0625F);

        fil5.rotateAngleX = 0F;
        fil5.rotateAngleY = -1.570796F;
        fil5.rotateAngleZ = 0F;
        fil5.renderWithRotation(0.0625F);

        Block10.rotateAngleX = 0F;
        Block10.rotateAngleY = 0F;
        Block10.rotateAngleZ = 0F;
        Block10.renderWithRotation(0.0625F);

        Block11.rotateAngleX = 0F;
        Block11.rotateAngleY = 0F;
        Block11.rotateAngleZ = 0F;
        Block11.renderWithRotation(0.0625F);

        Block12.rotateAngleX = 0F;
        Block12.rotateAngleY = 0F;
        Block12.rotateAngleZ = -1.570796F;
        Block12.renderWithRotation(0.0625F);

        fil6.rotateAngleX = 0F;
        fil6.rotateAngleY = 0F;
        fil6.rotateAngleZ = -1.570796F;
        fil6.renderWithRotation(0.0625F);

        fil7.rotateAngleX = 0F;
        fil7.rotateAngleY = 0F;
        fil7.rotateAngleZ = -1.570796F;
        fil7.renderWithRotation(0.0625F);

    }

}
