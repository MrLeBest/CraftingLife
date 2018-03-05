package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelDistributeur extends ModelBase
{
    ModelRenderer Block;
    ModelRenderer Block2;
    ModelRenderer Block_du_bas;
    ModelRenderer Block33;
    ModelRenderer Block_du_haut;
    ModelRenderer coter1;
    ModelRenderer coter2;
    ModelRenderer haut2;
    ModelRenderer bas3;
    ModelRenderer bouton;
    ModelRenderer bouton2;
    ModelRenderer bouton3;
    ModelRenderer bouton4;
    ModelRenderer bouton5;
    ModelRenderer bouton6;
    ModelRenderer bouton7;
    ModelRenderer bouton8;
    ModelRenderer bouton9;
    ModelRenderer bouton10;
    ModelRenderer bouton11;
    ModelRenderer bouton12;

    public ModelDistributeur()
    {
        this( 0.0f );
    }

    public ModelDistributeur( float par1 )
    {
        Block = new ModelRenderer( this, 12, 44 );
        Block.setTextureSize( 512, 512 );
        Block.addBox( -8F, -5F, -6F, 16, 10, 12);
        Block.setRotationPoint( 0F, 19F, 2F );
        Block2 = new ModelRenderer( this, 14, 74 );
        Block2.setTextureSize( 512, 512 );
        Block2.addBox( -5F, -8F, -8F, 10, 16, 16);
        Block2.setRotationPoint( -3F, 6F, 0F );
        Block_du_bas = new ModelRenderer( this, 11, 116 );
        Block_du_bas.setTextureSize( 512, 512 );
        Block_du_bas.addBox( -7.5F, -0.5F, -7.5F, 15, 1, 15);
        Block_du_bas.setRotationPoint( 0F, 24F, 0F );
        Block33 = new ModelRenderer( this, 20, 149 );
        Block33.setTextureSize( 512, 512 );
        Block33.addBox( -3F, -8F, -7.5F, 6, 16, 15);
        Block33.setRotationPoint( 5F, 6F, 0.5F );
        Block_du_haut = new ModelRenderer( this, 57, 8 );
        Block_du_haut.setTextureSize( 512, 512 );
        Block_du_haut.addBox( -8F, -3F, -8F, 16, 6, 16);
        Block_du_haut.setRotationPoint( 0F, -5F, 0F );
        coter1 = new ModelRenderer( this, 90, 55 );
        coter1.setTextureSize( 512, 512 );
        coter1.addBox( -2F, -5F, -2F, 4, 10, 4);
        coter1.setRotationPoint( -6F, 19F, -6F );
        coter2 = new ModelRenderer( this, 87, 90 );
        coter2.setTextureSize( 512, 512 );
        coter2.addBox( -2F, -5F, -2F, 4, 10, 4);
        coter2.setRotationPoint( 6F, 19F, -6F );
        haut2 = new ModelRenderer( this, 93, 123 );
        haut2.setTextureSize( 512, 512 );
        haut2.addBox( -4F, -1F, -2F, 8, 2, 4);
        haut2.setRotationPoint( 0F, 15F, -6F );
        bas3 = new ModelRenderer( this, 93, 147 );
        bas3.setTextureSize( 512, 512 );
        bas3.addBox( -4F, -2F, -2F, 8, 4, 4);
        bas3.setRotationPoint( 0F, 22F, -6F );
        bouton = new ModelRenderer( this, 88, 179 );
        bouton.setTextureSize( 512, 512 );
        bouton.addBox( -2.5F, -1F, -0.5F, 5, 2, 1);
        bouton.setRotationPoint( 5F, -0.5F, -7F );
        bouton2 = new ModelRenderer( this, 71, 149 );
        bouton2.setTextureSize( 512, 512 );
        bouton2.addBox( -2.5F, -2F, -0.5F, 5, 4, 1);
        bouton2.setRotationPoint( 5F, 3F, -7F );
        bouton3 = new ModelRenderer( this, 66, 193 );
        bouton3.setTextureSize( 512, 512 );
        bouton3.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        bouton3.setRotationPoint( 4.5F, 6F, -7F );
        bouton4 = new ModelRenderer( this, 31, 7 );
        bouton4.setTextureSize( 512, 512 );
        bouton4.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        bouton4.setRotationPoint( 4.5F, 7.5F, -7F );
        bouton5 = new ModelRenderer( this, 38, 26 );
        bouton5.setTextureSize( 512, 512 );
        bouton5.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        bouton5.setRotationPoint( 4.5F, 9F, -7F );
        bouton6 = new ModelRenderer( this, 17, 26 );
        bouton6.setTextureSize( 512, 512 );
        bouton6.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        bouton6.setRotationPoint( 4.5F, 10.5F, -7F );
        bouton7 = new ModelRenderer( this, 33, 16 );
        bouton7.setTextureSize( 512, 512 );
        bouton7.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        bouton7.setRotationPoint( 4.5F, 12F, -7F );
        bouton8 = new ModelRenderer( this, 15, 8 );
        bouton8.setTextureSize( 512, 512 );
        bouton8.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        bouton8.setRotationPoint( 7.3F, 6F, -7F );
        bouton9 = new ModelRenderer( this, 15, 15 );
        bouton9.setTextureSize( 512, 512 );
        bouton9.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        bouton9.setRotationPoint( 7.3F, 7.5F, -7F );
        bouton10 = new ModelRenderer( this, 15, 15 );
        bouton10.setTextureSize( 512, 512 );
        bouton10.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        bouton10.setRotationPoint( 7.3F, 9F, -7F );
        bouton11 = new ModelRenderer( this, 15, 15 );
        bouton11.setTextureSize( 512, 512 );
        bouton11.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        bouton11.setRotationPoint( 7.3F, 10.5F, -7F );
        bouton12 = new ModelRenderer( this, 15, 15 );
        bouton12.setTextureSize( 512, 512 );
        bouton12.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        bouton12.setRotationPoint( 7.3F, 12F, -7F );
    }

   public void renderAll()
   {
        Block.rotateAngleX = 0F;
        Block.rotateAngleY = 0F;
        Block.rotateAngleZ = 0F;
        Block.renderWithRotation(0.0625F);

        Block2.rotateAngleX = 0F;
        Block2.rotateAngleY = 0F;
        Block2.rotateAngleZ = 0F;
        Block2.renderWithRotation(0.0625F);

        Block_du_bas.rotateAngleX = 0F;
        Block_du_bas.rotateAngleY = 0F;
        Block_du_bas.rotateAngleZ = 0F;
        Block_du_bas.renderWithRotation(0.0625F);

        Block33.rotateAngleX = 0F;
        Block33.rotateAngleY = 0F;
        Block33.rotateAngleZ = 0F;
        Block33.renderWithRotation(0.0625F);

        Block_du_haut.rotateAngleX = 0F;
        Block_du_haut.rotateAngleY = 0F;
        Block_du_haut.rotateAngleZ = 0F;
        Block_du_haut.renderWithRotation(0.0625F);

        coter1.rotateAngleX = 0F;
        coter1.rotateAngleY = 0F;
        coter1.rotateAngleZ = 0F;
        coter1.renderWithRotation(0.0625F);

        coter2.rotateAngleX = 0F;
        coter2.rotateAngleY = 0F;
        coter2.rotateAngleZ = 0F;
        coter2.renderWithRotation(0.0625F);

        haut2.rotateAngleX = 0F;
        haut2.rotateAngleY = 0F;
        haut2.rotateAngleZ = 0F;
        haut2.renderWithRotation(0.0625F);

        bas3.rotateAngleX = 0F;
        bas3.rotateAngleY = 0F;
        bas3.rotateAngleZ = 0F;
        bas3.renderWithRotation(0.0625F);

        bouton.rotateAngleX = 0F;
        bouton.rotateAngleY = 0F;
        bouton.rotateAngleZ = 0F;
        bouton.renderWithRotation(0.0625F);

        bouton2.rotateAngleX = 0F;
        bouton2.rotateAngleY = 0F;
        bouton2.rotateAngleZ = 0F;
        bouton2.renderWithRotation(0.0625F);

        bouton3.rotateAngleX = 0F;
        bouton3.rotateAngleY = 0F;
        bouton3.rotateAngleZ = 0F;
        bouton3.renderWithRotation(0.0625F);

        bouton4.rotateAngleX = 0F;
        bouton4.rotateAngleY = 0F;
        bouton4.rotateAngleZ = 0F;
        bouton4.renderWithRotation(0.0625F);

        bouton5.rotateAngleX = 0F;
        bouton5.rotateAngleY = 0F;
        bouton5.rotateAngleZ = 0F;
        bouton5.renderWithRotation(0.0625F);

        bouton6.rotateAngleX = 0F;
        bouton6.rotateAngleY = 0F;
        bouton6.rotateAngleZ = 0F;
        bouton6.renderWithRotation(0.0625F);

        bouton7.rotateAngleX = 0F;
        bouton7.rotateAngleY = 0F;
        bouton7.rotateAngleZ = 0F;
        bouton7.renderWithRotation(0.0625F);

        bouton8.rotateAngleX = 0F;
        bouton8.rotateAngleY = 0F;
        bouton8.rotateAngleZ = 0F;
        bouton8.renderWithRotation(0.0625F);

        bouton9.rotateAngleX = 0F;
        bouton9.rotateAngleY = 0F;
        bouton9.rotateAngleZ = 0F;
        bouton9.renderWithRotation(0.0625F);

        bouton10.rotateAngleX = 0F;
        bouton10.rotateAngleY = 0F;
        bouton10.rotateAngleZ = 0F;
        bouton10.renderWithRotation(0.0625F);

        bouton11.rotateAngleX = 0F;
        bouton11.rotateAngleY = 0F;
        bouton11.rotateAngleZ = 0F;
        bouton11.renderWithRotation(0.0625F);

        bouton12.rotateAngleX = 0F;
        bouton12.rotateAngleY = 0F;
        bouton12.rotateAngleZ = 0F;
        bouton12.renderWithRotation(0.0625F);

    }

}
