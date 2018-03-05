package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCafe extends ModelBase
{
    ModelRenderer Block2;
    ModelRenderer Block3;
    ModelRenderer Block4;
    ModelRenderer Block5;
    ModelRenderer Block6;
    ModelRenderer Block7;
    ModelRenderer Block8;
    ModelRenderer Block9;
    ModelRenderer Block10;
    ModelRenderer Block11;
    ModelRenderer Block12;
    ModelRenderer Block13;
    ModelRenderer Block14;
    ModelRenderer Block15;
    ModelRenderer Block16;

    public ModelCafe()
    {
        this( 0.0f );
    }

    public ModelCafe( float par1 )
    {
        Block2 = new ModelRenderer( this, 116, 10 );
        Block2.setTextureSize( 512, 512 );
        Block2.addBox( -15.5F, -17F, -16F, 31, 34, 32);
        Block2.setRotationPoint( 0F, 8F, 0F );
        Block3 = new ModelRenderer( this, 126, 84 );
        Block3.setTextureSize( 512, 512 );
        Block3.addBox( -1.5F, -17F, -16F, 3, 34, 32);
        Block3.setRotationPoint( -14F, -26F, 0F );
        Block4 = new ModelRenderer( this, 300, 68 );
        Block4.setTextureSize( 512, 512 );
        Block4.addBox( -1.5F, -17F, -16F, 3, 34, 32);
        Block4.setRotationPoint( 14F, -26F, 0F );
        Block5 = new ModelRenderer( this, 285, 256 );
        Block5.setTextureSize( 512, 512 );
        Block5.addBox( -1.5F, -17F, -15F, 3, 34, 30);
        Block5.setRotationPoint( 0F, -26F, 15F );
        Block6 = new ModelRenderer( this, 12, 85 );
        Block6.setTextureSize( 512, 512 );
        Block6.addBox( -1.5F, -17F, -7.5F, 3, 34, 15);
        Block6.setRotationPoint( 8F, -26F, -15F );
        Block7 = new ModelRenderer( this, 8, 211 );
        Block7.setTextureSize( 512, 512 );
        Block7.addBox( -1.5F, -17F, -7.5F, 3, 34, 15);
        Block7.setRotationPoint( -6F, -26F, -7F );
        Block8 = new ModelRenderer( this, 179, 208 );
        Block8.setTextureSize( 512, 512 );
        Block8.addBox( -1.5F, -17F, -7.5F, 3, 34, 15);
        Block8.setRotationPoint( 2F, -26F, -7F );
        Block9 = new ModelRenderer( this, 49, 139 );
        Block9.setTextureSize( 512, 512 );
        Block9.addBox( -1.5F, -11F, -6.5F, 3, 22, 13);
        Block9.setRotationPoint( -6F, -32F, -15F );
        Block10 = new ModelRenderer( this, 68, 266 );
        Block10.setTextureSize( 512, 512 );
        Block10.addBox( -15.5F, -5F, -16F, 31, 10, 32);
        Block10.setRotationPoint( 0F, -39F, 0F );
        Block11 = new ModelRenderer( this, 56, 65 );
        Block11.setTextureSize( 512, 512 );
        Block11.addBox( -5.5F, -0.5F, -7.5F, 11, 1, 15);
        Block11.setRotationPoint( -5F, -23F, -9F );
        Block12 = new ModelRenderer( this, 69, 99 );
        Block12.setTextureSize( 512, 512 );
        Block12.addBox( -1F, -3F, -1F, 2, 6, 2);
        Block12.setRotationPoint( -6F, -23F, -11F );
        Block13 = new ModelRenderer( this, 15, 15 );
        Block13.setTextureSize( 512, 512 );
        Block13.addBox( -2.5F, -1F, -0.5F, 5, 2, 1);
        Block13.setRotationPoint( 5F, -18F, -16.5F );
        Block14 = new ModelRenderer( this, 15, 22 );
        Block14.setTextureSize( 512, 512 );
        Block14.addBox( -2.5F, -1F, -0.5F, 5, 2, 1);
        Block14.setRotationPoint( 5F, -21F, -16.5F );
        Block15 = new ModelRenderer( this, 15, 30 );
        Block15.setTextureSize( 512, 512 );
        Block15.addBox( -2.5F, -1F, -0.5F, 5, 2, 1);
        Block15.setRotationPoint( 5F, -24F, -16.5F );
        Block16 = new ModelRenderer( this, 16, 7 );
        Block16.setTextureSize( 512, 512 );
        Block16.addBox( -2.5F, -1F, -0.5F, 5, 2, 1);
        Block16.setRotationPoint( 5F, -15F, -16.5F );
    }

   public void renderAll()
   {
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

        Block5.rotateAngleX = 0F;
        Block5.rotateAngleY = -1.570796F;
        Block5.rotateAngleZ = 0F;
        Block5.renderWithRotation(0.0625F);

        Block6.rotateAngleX = 0F;
        Block6.rotateAngleY = -1.570796F;
        Block6.rotateAngleZ = 0F;
        Block6.renderWithRotation(0.0625F);

        Block7.rotateAngleX = 0F;
        Block7.rotateAngleY = -1.570796F;
        Block7.rotateAngleZ = 0F;
        Block7.renderWithRotation(0.0625F);

        Block8.rotateAngleX = 0F;
        Block8.rotateAngleY = -3.141593F;
        Block8.rotateAngleZ = 0F;
        Block8.renderWithRotation(0.0625F);

        Block9.rotateAngleX = 0F;
        Block9.rotateAngleY = -1.570796F;
        Block9.rotateAngleZ = 0F;
        Block9.renderWithRotation(0.0625F);

        Block10.rotateAngleX = 0F;
        Block10.rotateAngleY = 0F;
        Block10.rotateAngleZ = 0F;
        Block10.renderWithRotation(0.0625F);

        Block11.rotateAngleX = 0F;
        Block11.rotateAngleY = -1.570796F;
        Block11.rotateAngleZ = 0F;
        Block11.renderWithRotation(0.0625F);

        Block12.rotateAngleX = 0F;
        Block12.rotateAngleY = -1.570796F;
        Block12.rotateAngleZ = 0F;
        Block12.renderWithRotation(0.0625F);

        Block13.rotateAngleX = 0F;
        Block13.rotateAngleY = 0F;
        Block13.rotateAngleZ = 0F;
        Block13.renderWithRotation(0.0625F);

        Block14.rotateAngleX = 0F;
        Block14.rotateAngleY = 0F;
        Block14.rotateAngleZ = 0F;
        Block14.renderWithRotation(0.0625F);

        Block15.rotateAngleX = 0F;
        Block15.rotateAngleY = 0F;
        Block15.rotateAngleZ = 0F;
        Block15.renderWithRotation(0.0625F);

        Block16.rotateAngleX = 0F;
        Block16.rotateAngleY = 0F;
        Block16.rotateAngleZ = 0F;
        Block16.renderWithRotation(0.0625F);

    }

}
