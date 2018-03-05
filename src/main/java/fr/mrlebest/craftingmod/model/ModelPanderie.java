package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelPanderie extends ModelBase
{
    ModelRenderer Block;
    ModelRenderer Vetement4;
    ModelRenderer Vetement3;
    ModelRenderer Vetement2;
    ModelRenderer Vetement1;
    ModelRenderer b_1;
    ModelRenderer b_2;
    ModelRenderer b_3;
    ModelRenderer b4;
    ModelRenderer b5;
    ModelRenderer b6;
    ModelRenderer b7;
    ModelRenderer b8;
    ModelRenderer b9;
    ModelRenderer a1;
    ModelRenderer a2;
    ModelRenderer a3;
    ModelRenderer a4;
    ModelRenderer a7;
    ModelRenderer a5;
    ModelRenderer a6;
    ModelRenderer Chaussure_1_1;
    ModelRenderer Chaussure_1_2;
    ModelRenderer Chaussure_1_3;
    ModelRenderer Chaussure_1_4;
    ModelRenderer Chaussure_1_5;
    ModelRenderer Chaussure_1_6;
    ModelRenderer Chaussure_2_2;
    ModelRenderer Chaussure_2_2_2;
    ModelRenderer Chaussure_2_3;
    ModelRenderer Chaussure_2_4;
    ModelRenderer Chaussure_2_5;
    ModelRenderer Chaussure_2_6;
    ModelRenderer Vetement5;
    ModelRenderer Vetement6;

    public ModelPanderie()
    {
        this( 0.0f );
    }

    public ModelPanderie( float par1 )
    {
        Block = new ModelRenderer( this, 79, 25 );
        Block.setTextureSize( 256, 256 );
        Block.addBox( -16F, -24F, -0.5F, 32, 48, 1);
        Block.setRotationPoint( 0F, 0F, 6F );
        Vetement4 = new ModelRenderer( this, 64, 190 );
        Vetement4.setTextureSize( 256, 256 );
        Vetement4.addBox( -3.5F, -0.5F, -4.5F, 7, 1, 9);
        Vetement4.setRotationPoint( -10F, -1F, -0.3000002F );
        Vetement3 = new ModelRenderer( this, 6, 206 );
        Vetement3.setTextureSize( 256, 256 );
        Vetement3.addBox( -3.5F, -0.5F, -4.5F, 7, 1, 9);
        Vetement3.setRotationPoint( -10F, 0F, -0.3000002F );
        Vetement2 = new ModelRenderer( this, 32, 196 );
        Vetement2.setTextureSize( 256, 256 );
        Vetement2.addBox( -3.5F, -0.5F, -4.5F, 7, 1, 9);
        Vetement2.setRotationPoint( -10F, -12F, -0.3000002F );
        Vetement1 = new ModelRenderer( this, 35, 176 );
        Vetement1.setTextureSize( 256, 256 );
        Vetement1.addBox( -3.5F, -0.5F, -4.5F, 7, 1, 9);
        Vetement1.setRotationPoint( -10F, -11F, -0.3000002F );
        b_1 = new ModelRenderer( this, 43, 93 );
        b_1.setTextureSize( 256, 256 );
        b_1.addBox( -1F, -24F, -0.5F, 2, 48, 1);
        b_1.setRotationPoint( 0F, 0F, -7.3F );
        b_2 = new ModelRenderer( this, 43, 93 );
        b_2.setTextureSize( 256, 256 );
        b_2.addBox( -1F, -24F, -0.5F, 2, 48, 1);
        b_2.setRotationPoint( 15F, 0F, -8.3F );
        b_3 = new ModelRenderer( this, 43, 93 );
        b_3.setTextureSize( 256, 256 );
        b_3.addBox( -1F, -24F, -0.5F, 2, 48, 1);
        b_3.setRotationPoint( -14F, 0F, -7.3F );
        b4 = new ModelRenderer( this, 30, 76 );
        b4.setTextureSize( 256, 256 );
        b4.addBox( -13F, -1F, -0.5F, 26, 2, 1);
        b4.setRotationPoint( 0F, -22F, -7.3F );
        b5 = new ModelRenderer( this, 43, 93 );
        b5.setTextureSize( 256, 256 );
        b5.addBox( -1F, -24F, -0.5F, 2, 48, 1);
        b5.setRotationPoint( 14F, 0F, -7.3F );
        b6 = new ModelRenderer( this, 43, 93 );
        b6.setTextureSize( 256, 256 );
        b6.addBox( -1F, -24F, -0.5F, 2, 48, 1);
        b6.setRotationPoint( -15F, 0F, -8.3F );
        b7 = new ModelRenderer( this, 26, 84 );
        b7.setTextureSize( 256, 256 );
        b7.addBox( -14F, -1F, -0.5F, 28, 2, 1);
        b7.setRotationPoint( 0F, -23F, -8.3F );
        b8 = new ModelRenderer( this, 36, 0 );
        b8.setTextureSize( 256, 256 );
        b8.addBox( -0.5F, -24F, -7F, 1, 48, 14);
        b8.setRotationPoint( 15.5F, 0F, -1.3F );
        b9 = new ModelRenderer( this, 2, 0 );
        b9.setTextureSize( 256, 256 );
        b9.addBox( -0.5F, -24F, -7F, 1, 48, 14);
        b9.setRotationPoint( -15.5F, 0F, -1.3F );
        a1 = new ModelRenderer( this, 5, 80 );
        a1.setTextureSize( 256, 256 );
        a1.addBox( -0.5F, -24F, -7F, 1, 48, 14);
        a1.setRotationPoint( 0F, 0F, -6F );
        a2 = new ModelRenderer( this, 5, 80 );
        a2.setTextureSize( 256, 256 );
        a2.addBox( -0.5F, -24F, -7F, 1, 48, 14);
        a2.setRotationPoint( 7F, 0F, -6.8F );
        a3 = new ModelRenderer( this, 94, 6 );
        a3.setTextureSize( 256, 256 );
        a3.addBox( -15F, -0.5F, -5.5F, 30, 1, 11);
        a3.setRotationPoint( 0F, 12F, -0.3000002F );
        a4 = new ModelRenderer( this, 90, 2 );
        a4.setTextureSize( 256, 256 );
        a4.addBox( -16F, -0.5F, -7.5F, 32, 1, 15);
        a4.setRotationPoint( 0F, -24F, -1F );
        a7 = new ModelRenderer( this, 94, 6 );
        a7.setTextureSize( 256, 256 );
        a7.addBox( -15F, -0.5F, -5.5F, 30, 1, 11);
        a7.setRotationPoint( 0F, -10F, -0.3000002F );
        a5 = new ModelRenderer( this, 94, 6 );
        a5.setTextureSize( 256, 256 );
        a5.addBox( -15F, -0.5F, -5.5F, 30, 1, 11);
        a5.setRotationPoint( 0F, 22F, -0.3000002F );
        a6 = new ModelRenderer( this, 94, 6 );
        a6.setTextureSize( 256, 256 );
        a6.addBox( -15F, -0.5F, -5.5F, 30, 1, 11);
        a6.setRotationPoint( 0F, 1F, -0.3000002F );
        Chaussure_1_1 = new ModelRenderer( this, 165, 58 );
        Chaussure_1_1.setTextureSize( 256, 256 );
        Chaussure_1_1.addBox( -2F, -0.5F, -3F, 4, 1, 6);
        Chaussure_1_1.setRotationPoint( -11F, 21F, -1F );
        Chaussure_1_2 = new ModelRenderer( this, 96, 80 );
        Chaussure_1_2.setTextureSize( 256, 256 );
        Chaussure_1_2.addBox( -0.5F, -1.5F, -3F, 1, 3, 6);
        Chaussure_1_2.setRotationPoint( -12.5F, 20F, -1F );
        Chaussure_1_3 = new ModelRenderer( this, 112, 96 );
        Chaussure_1_3.setTextureSize( 256, 256 );
        Chaussure_1_3.addBox( -0.5F, -1.5F, -3F, 1, 3, 6);
        Chaussure_1_3.setRotationPoint( -9.5F, 20F, -1F );
        Chaussure_1_4 = new ModelRenderer( this, 113, 89 );
        Chaussure_1_4.setTextureSize( 256, 256 );
        Chaussure_1_4.addBox( -2F, -0.5F, -1F, 4, 1, 2);
        Chaussure_1_4.setRotationPoint( -11F, 19F, 1F );
        Chaussure_1_5 = new ModelRenderer( this, 100, 94 );
        Chaussure_1_5.setTextureSize( 256, 256 );
        Chaussure_1_5.addBox( -2F, -1F, -0.5F, 4, 2, 1);
        Chaussure_1_5.setRotationPoint( -11F, 19.5F, -3.5F );
        Chaussure_1_6 = new ModelRenderer( this, 170, 72 );
        Chaussure_1_6.setTextureSize( 256, 256 );
        Chaussure_1_6.addBox( -2F, -1F, -1.5F, 4, 2, 3);
        Chaussure_1_6.setRotationPoint( -11F, 20.5F, 2F );
        Chaussure_2_2 = new ModelRenderer( this, 165, 58 );
        Chaussure_2_2.setTextureSize( 256, 256 );
        Chaussure_2_2.addBox( -2F, -0.5F, -3F, 4, 1, 6);
        Chaussure_2_2.setRotationPoint( -6F, 21F, -1F );
        Chaussure_2_2_2 = new ModelRenderer( this, 96, 80 );
        Chaussure_2_2_2.setTextureSize( 256, 256 );
        Chaussure_2_2_2.addBox( -0.5F, -1.5F, -3F, 1, 3, 6);
        Chaussure_2_2_2.setRotationPoint( -7.434635F, 20F, -0.5620256F );
        Chaussure_2_3 = new ModelRenderer( this, 112, 96 );
        Chaussure_2_3.setTextureSize( 256, 256 );
        Chaussure_2_3.addBox( -0.5F, -1.5F, -3F, 1, 3, 6);
        Chaussure_2_3.setRotationPoint( -4.565365F, 20F, -1.437974F );
        Chaussure_2_4 = new ModelRenderer( this, 113, 89 );
        Chaussure_2_4.setTextureSize( 256, 256 );
        Chaussure_2_4.addBox( -2F, -0.5F, -1F, 4, 1, 2);
        Chaussure_2_4.setRotationPoint( -5.416034F, 19F, 0.912847F );
        Chaussure_2_5 = new ModelRenderer( this, 100, 94 );
        Chaussure_2_5.setTextureSize( 256, 256 );
        Chaussure_2_5.addBox( -2F, -1F, -0.5F, 4, 2, 1);
        Chaussure_2_5.setRotationPoint( -6.729957F, 19.5F, -3.391059F );
        Chaussure_2_6 = new ModelRenderer( this, 170, 72 );
        Chaussure_2_6.setTextureSize( 256, 256 );
        Chaussure_2_6.addBox( -2F, -1F, -1.5F, 4, 2, 3);
        Chaussure_2_6.setRotationPoint( -5.124051F, 20.5F, 1.869271F );
        Vetement5 = new ModelRenderer( this, 32, 196 );
        Vetement5.setTextureSize( 256, 256 );
        Vetement5.addBox( -3.5F, -0.5F, -4.5F, 7, 1, 9);
        Vetement5.setRotationPoint( 0F, 0F, -0.3000002F );
        Vetement6 = new ModelRenderer( this, 43, 215 );
        Vetement6.setTextureSize( 256, 256 );
        Vetement6.addBox( -3.5F, -0.5F, -4.5F, 7, 1, 9);
        Vetement6.setRotationPoint( -3F, 11F, -0.3000002F );
    }

   public void renderAll()
   {
        Block.rotateAngleX = 0F;
        Block.rotateAngleY = 0F;
        Block.rotateAngleZ = 0F;
        Block.renderWithRotation(0.0625F);

        Vetement4.rotateAngleX = 0F;
        Vetement4.rotateAngleY = 0.0858587F;
        Vetement4.rotateAngleZ = 0F;
        Vetement4.renderWithRotation(0.0625F);

        Vetement3.rotateAngleX = 0F;
        Vetement3.rotateAngleY = -0.09719037F;
        Vetement3.rotateAngleZ = 0F;
        Vetement3.renderWithRotation(0.0625F);

        Vetement2.rotateAngleX = 0F;
        Vetement2.rotateAngleY = -0.09719037F;
        Vetement2.rotateAngleZ = 0F;
        Vetement2.renderWithRotation(0.0625F);

        Vetement1.rotateAngleX = 0F;
        Vetement1.rotateAngleY = 0F;
        Vetement1.rotateAngleZ = 0F;
        Vetement1.renderWithRotation(0.0625F);

        b_1.rotateAngleX = 0F;
        b_1.rotateAngleY = 0F;
        b_1.rotateAngleZ = 0F;
        b_1.renderWithRotation(0.0625F);

        b_2.rotateAngleX = 0F;
        b_2.rotateAngleY = 0F;
        b_2.rotateAngleZ = 0F;
        b_2.renderWithRotation(0.0625F);

        b_3.rotateAngleX = 0F;
        b_3.rotateAngleY = 0F;
        b_3.rotateAngleZ = 0F;
        b_3.renderWithRotation(0.0625F);

        b4.rotateAngleX = 0F;
        b4.rotateAngleY = 0F;
        b4.rotateAngleZ = 0F;
        b4.renderWithRotation(0.0625F);

        b5.rotateAngleX = 0F;
        b5.rotateAngleY = 0F;
        b5.rotateAngleZ = 0F;
        b5.renderWithRotation(0.0625F);

        b6.rotateAngleX = 0F;
        b6.rotateAngleY = 0F;
        b6.rotateAngleZ = 0F;
        b6.renderWithRotation(0.0625F);

        b7.rotateAngleX = 0F;
        b7.rotateAngleY = 0F;
        b7.rotateAngleZ = 0F;
        b7.renderWithRotation(0.0625F);

        b8.rotateAngleX = 0F;
        b8.rotateAngleY = 0F;
        b8.rotateAngleZ = 0F;
        b8.renderWithRotation(0.0625F);

        b9.rotateAngleX = 0F;
        b9.rotateAngleY = 0F;
        b9.rotateAngleZ = 0F;
        b9.renderWithRotation(0.0625F);

        a1.rotateAngleX = 0F;
        a1.rotateAngleY = 1.578171F;
        a1.rotateAngleZ = 0F;
        a1.renderWithRotation(0.0625F);

        a2.rotateAngleX = 0F;
        a2.rotateAngleY = 1.570796F;
        a2.rotateAngleZ = 0F;
        a2.renderWithRotation(0.0625F);

        a3.rotateAngleX = 0F;
        a3.rotateAngleY = 0F;
        a3.rotateAngleZ = 0F;
        a3.renderWithRotation(0.0625F);

        a4.rotateAngleX = 0F;
        a4.rotateAngleY = 0F;
        a4.rotateAngleZ = 0F;
        a4.renderWithRotation(0.0625F);

        a7.rotateAngleX = 0F;
        a7.rotateAngleY = 0F;
        a7.rotateAngleZ = 0F;
        a7.renderWithRotation(0.0625F);

        a5.rotateAngleX = 0F;
        a5.rotateAngleY = 0F;
        a5.rotateAngleZ = 0F;
        a5.renderWithRotation(0.0625F);

        a6.rotateAngleX = 0F;
        a6.rotateAngleY = 0F;
        a6.rotateAngleZ = 0F;
        a6.renderWithRotation(0.0625F);

        Chaussure_1_1.rotateAngleX = 0F;
        Chaussure_1_1.rotateAngleY = 0F;
        Chaussure_1_1.rotateAngleZ = 0F;
        Chaussure_1_1.renderWithRotation(0.0625F);

        Chaussure_1_2.rotateAngleX = 0F;
        Chaussure_1_2.rotateAngleY = 0F;
        Chaussure_1_2.rotateAngleZ = 0F;
        Chaussure_1_2.renderWithRotation(0.0625F);

        Chaussure_1_3.rotateAngleX = 0F;
        Chaussure_1_3.rotateAngleY = 0F;
        Chaussure_1_3.rotateAngleZ = 0F;
        Chaussure_1_3.renderWithRotation(0.0625F);

        Chaussure_1_4.rotateAngleX = 0F;
        Chaussure_1_4.rotateAngleY = 0F;
        Chaussure_1_4.rotateAngleZ = 0F;
        Chaussure_1_4.renderWithRotation(0.0625F);

        Chaussure_1_5.rotateAngleX = 0F;
        Chaussure_1_5.rotateAngleY = 0F;
        Chaussure_1_5.rotateAngleZ = 0F;
        Chaussure_1_5.renderWithRotation(0.0625F);

        Chaussure_1_6.rotateAngleX = 0F;
        Chaussure_1_6.rotateAngleY = 0F;
        Chaussure_1_6.rotateAngleZ = 0F;
        Chaussure_1_6.renderWithRotation(0.0625F);

        Chaussure_2_2.rotateAngleX = 0F;
        Chaussure_2_2.rotateAngleY = 0.2962994F;
        Chaussure_2_2.rotateAngleZ = 0F;
        Chaussure_2_2.renderWithRotation(0.0625F);

        Chaussure_2_2_2.rotateAngleX = 0F;
        Chaussure_2_2_2.rotateAngleY = 0.2962994F;
        Chaussure_2_2_2.rotateAngleZ = 0F;
        Chaussure_2_2_2.renderWithRotation(0.0625F);

        Chaussure_2_3.rotateAngleX = 0F;
        Chaussure_2_3.rotateAngleY = 0.2962994F;
        Chaussure_2_3.rotateAngleZ = 0F;
        Chaussure_2_3.renderWithRotation(0.0625F);

        Chaussure_2_4.rotateAngleX = 0F;
        Chaussure_2_4.rotateAngleY = 0.2962994F;
        Chaussure_2_4.rotateAngleZ = 0F;
        Chaussure_2_4.renderWithRotation(0.0625F);

        Chaussure_2_5.rotateAngleX = 0F;
        Chaussure_2_5.rotateAngleY = 0.2962994F;
        Chaussure_2_5.rotateAngleZ = 0F;
        Chaussure_2_5.renderWithRotation(0.0625F);

        Chaussure_2_6.rotateAngleX = 0F;
        Chaussure_2_6.rotateAngleY = 0.2962994F;
        Chaussure_2_6.rotateAngleZ = 0F;
        Chaussure_2_6.renderWithRotation(0.0625F);

        Vetement5.rotateAngleX = 0F;
        Vetement5.rotateAngleY = 0.0858587F;
        Vetement5.rotateAngleZ = 0F;
        Vetement5.renderWithRotation(0.0625F);

        Vetement6.rotateAngleX = 0F;
        Vetement6.rotateAngleY = -0.03580083F;
        Vetement6.rotateAngleZ = 0F;
        Vetement6.renderWithRotation(0.0625F);

    }

}
