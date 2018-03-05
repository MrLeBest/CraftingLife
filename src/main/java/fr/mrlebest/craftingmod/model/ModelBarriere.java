package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBarriere extends ModelBase
{
    ModelRenderer Block7;
    ModelRenderer Block8;
    ModelRenderer Block6;
    ModelRenderer Block5;
    ModelRenderer Block3;
    ModelRenderer Block4;
    ModelRenderer Block9;
    ModelRenderer Block10;

    public ModelBarriere()
    {
        this( 0.0f );
    }

    public ModelBarriere( float par1 )
    {
        Block7 = new ModelRenderer( this, 15, 15 );
        Block7.setTextureSize( 512, 512 );
        Block7.addBox( -1F, -19F, -0.5F, 2, 38, 1);
        Block7.setRotationPoint( 8F, 7F, -3F );
        Block8 = new ModelRenderer( this, 15, 15 );
        Block8.setTextureSize( 512, 512 );
        Block8.addBox( -0.5F, -5.5F, -0.5F, 1, 11, 1);
        Block8.setRotationPoint( -6F, 18F, -2F );
        Block6 = new ModelRenderer( this, 15, 15 );
        Block6.setTextureSize( 512, 512 );
        Block6.addBox( -1F, -10F, -0.5F, 2, 20, 1);
        Block6.setRotationPoint( 23F, 16F, 2F );
        Block5 = new ModelRenderer( this, 15, 15 );
        Block5.setTextureSize( 512, 512 );
        Block5.addBox( -1F, -10F, -0.5F, 2, 20, 1);
        Block5.setRotationPoint( 23F, 15.89733F, -6.999415F );
        Block3 = new ModelRenderer( this, 15, 15 );
        Block3.setTextureSize( 512, 512 );
        Block3.addBox( -1F, -10F, -0.5F, 2, 20, 1);
        Block3.setRotationPoint( -6F, 16F, 2F );
        Block4 = new ModelRenderer( this, 15, 15 );
        Block4.setTextureSize( 512, 512 );
        Block4.addBox( -1F, -10F, -0.5F, 2, 20, 1);
        Block4.setRotationPoint( -6F, 16.01435F, -6.999989F );
        Block9 = new ModelRenderer( this, 15, 15 );
        Block9.setTextureSize( 512, 512 );
        Block9.addBox( -0.5F, -5.5F, -0.5F, 1, 11, 1);
        Block9.setRotationPoint( 23F, 18F, -2F );
        Block10 = new ModelRenderer( this, 30, 15 );
        Block10.setTextureSize( 512, 512 );
        Block10.addBox( -4F, -18.5F, -0.5F, 8, 37, 1);
        Block10.setRotationPoint( 8F, 2F, -3F );
    }

   public void renderAll()
   {
        Block7.rotateAngleX = 0F;
        Block7.rotateAngleY = 0F;
        Block7.rotateAngleZ = -1.570796F;
        Block7.renderWithRotation(0.0625F);

        Block8.rotateAngleX = 0F;
        Block8.rotateAngleY = -1.570796F;
        Block8.rotateAngleZ = -1.570796F;
        Block8.renderWithRotation(0.0625F);

        Block6.rotateAngleX = 0.479378F;
        Block6.rotateAngleY = 0F;
        Block6.rotateAngleZ = 0F;
        Block6.renderWithRotation(0.0625F);

        Block5.rotateAngleX = -0.4400288F;
        Block5.rotateAngleY = 0F;
        Block5.rotateAngleZ = 0F;
        Block5.renderWithRotation(0.0625F);

        Block3.rotateAngleX = 0.4923812F;
        Block3.rotateAngleY = 0F;
        Block3.rotateAngleZ = 0F;
        Block3.renderWithRotation(0.0625F);

        Block4.rotateAngleX = -0.4470325F;
        Block4.rotateAngleY = 0F;
        Block4.rotateAngleZ = 0F;
        Block4.renderWithRotation(0.0625F);

        Block9.rotateAngleX = 0F;
        Block9.rotateAngleY = -1.570796F;
        Block9.rotateAngleZ = -1.570796F;
        Block9.renderWithRotation(0.0625F);

        Block10.rotateAngleX = 0F;
        Block10.rotateAngleY = 0F;
        Block10.rotateAngleZ = -1.570796F;
        Block10.renderWithRotation(0.0625F);

    }

}
