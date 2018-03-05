package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAeration extends ModelBase
{
    ModelRenderer Blocksoutien1;
    ModelRenderer Block;
    ModelRenderer Blocksoutien4;
    ModelRenderer Blocksoutien5;
    ModelRenderer Blocksoutien2;
    ModelRenderer Blocksoutien6;
    ModelRenderer Blocksoutien3;
    ModelRenderer Block2;
    ModelRenderer Block3;
    ModelRenderer Block4;
    ModelRenderer Block5;
    ModelRenderer Blockventilo1;
    ModelRenderer Blockventilo3;
    ModelRenderer Blockventilo2;
    ModelRenderer Blockventilo4;
    ModelRenderer Blockventilo5;
    ModelRenderer Blockventilo20;
    ModelRenderer Blockventilo21;
    ModelRenderer Blockventilo41;
    ModelRenderer Blockventilo51;
    ModelRenderer Block6;
    ModelRenderer Block7;
    ModelRenderer Block8;
    ModelRenderer Block9;
    ModelRenderer grille1;
    ModelRenderer grille2;
    ModelRenderer grille3;
    ModelRenderer grille4;
    ModelRenderer grille5;
    ModelRenderer Block10;
    ModelRenderer Block101;
    ModelRenderer Block102;
    ModelRenderer Block103;
    ModelRenderer Block150;

    public ModelAeration()
    {
        this( 0.0f );
    }

    public ModelAeration( float par1 )
    {
        Blocksoutien1 = new ModelRenderer( this, 4, 3 );
        Blocksoutien1.setTextureSize( 256, 512 );
        Blocksoutien1.addBox( -0.5F, -0.5F, -6F, 1, 1, 12);
        Blocksoutien1.setRotationPoint( 0F, 23F, 1F );
        Block = new ModelRenderer( this, 84, 199 );
        Block.setTextureSize( 256, 512 );
        Block.addBox( -10.5F, -6.5F, -1F, 21, 13, 2);
        Block.setRotationPoint( 11F, 14F, 6F );
        Blocksoutien4 = new ModelRenderer( this, 15, 15 );
        Blocksoutien4.setTextureSize( 256, 512 );
        Blocksoutien4.addBox( -0.5F, -8.5F, -0.5F, 1, 17, 1);
        Blocksoutien4.setRotationPoint( 0F, 15F, 7F );
        Blocksoutien5 = new ModelRenderer( this, 15, 15 );
        Blocksoutien5.setTextureSize( 256, 512 );
        Blocksoutien5.addBox( -0.5F, -8.5F, -0.5F, 1, 17, 1);
        Blocksoutien5.setRotationPoint( 0F, 16F, 2F );
        Blocksoutien2 = new ModelRenderer( this, 4, 4 );
        Blocksoutien2.setTextureSize( 256, 512 );
        Blocksoutien2.addBox( -0.5F, -0.5F, -6F, 1, 1, 12);
        Blocksoutien2.setRotationPoint( 22F, 23F, 1F );
        Blocksoutien6 = new ModelRenderer( this, 15, 15 );
        Blocksoutien6.setTextureSize( 256, 512 );
        Blocksoutien6.addBox( -0.5F, -8.5F, -0.5F, 1, 17, 1);
        Blocksoutien6.setRotationPoint( 22F, 16F, 2F );
        Blocksoutien3 = new ModelRenderer( this, 15, 15 );
        Blocksoutien3.setTextureSize( 256, 512 );
        Blocksoutien3.addBox( -0.5F, -8.5F, -0.5F, 1, 17, 1);
        Blocksoutien3.setRotationPoint( 22F, 15F, 7F );
        Block2 = new ModelRenderer( this, 76, 191 );
        Block2.setTextureSize( 256, 512 );
        Block2.addBox( -0.5F, -6.5F, -5F, 1, 13, 10);
        Block2.setRotationPoint( 1F, 14F, 0F );
        Block3 = new ModelRenderer( this, 76, 191 );
        Block3.setTextureSize( 256, 512 );
        Block3.addBox( -0.5F, -6.5F, -5F, 1, 13, 10);
        Block3.setRotationPoint( 21F, 14F, 0F );
        Block4 = new ModelRenderer( this, 76, 191 );
        Block4.setTextureSize( 256, 512 );
        Block4.addBox( -9.5F, -0.5F, -5F, 19, 1, 10);
        Block4.setRotationPoint( 11F, 8F, 0F );
        Block5 = new ModelRenderer( this, 76, 191 );
        Block5.setTextureSize( 256, 512 );
        Block5.addBox( -10.5F, -0.5F, -5F, 21, 1, 10);
        Block5.setRotationPoint( 11F, 20F, 0F );
        Blockventilo1 = new ModelRenderer( this, 67, 155 );
        Blockventilo1.setTextureSize( 256, 512 );
        Blockventilo1.addBox( -1F, -1F, -4F, 2, 2, 8);
        Blockventilo1.setRotationPoint( 7F, 14F, 2F );
        Blockventilo3 = new ModelRenderer( this, 27, 160 );
        Blockventilo3.setTextureSize( 256, 512 );
        Blockventilo3.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo3.setRotationPoint( 7F, 14F, 0F );
        Blockventilo2 = new ModelRenderer( this, 27, 160 );
        Blockventilo2.setTextureSize( 256, 512 );
        Blockventilo2.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo2.setRotationPoint( 7F, 14F, 0F );
        Blockventilo4 = new ModelRenderer( this, 28, 164 );
        Blockventilo4.setTextureSize( 256, 512 );
        Blockventilo4.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo4.setRotationPoint( 7F, 14F, 0F );
        Blockventilo5 = new ModelRenderer( this, 27, 163 );
        Blockventilo5.setTextureSize( 256, 512 );
        Blockventilo5.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo5.setRotationPoint( 7F, 14F, 0F );
        Blockventilo20 = new ModelRenderer( this, 21, 168 );
        Blockventilo20.setTextureSize( 256, 512 );
        Blockventilo20.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo20.setRotationPoint( 7F, 14F, 2F );
        Blockventilo21 = new ModelRenderer( this, 16, 173 );
        Blockventilo21.setTextureSize( 256, 512 );
        Blockventilo21.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo21.setRotationPoint( 7F, 14F, 2F );
        Blockventilo41 = new ModelRenderer( this, 24, 175 );
        Blockventilo41.setTextureSize( 256, 512 );
        Blockventilo41.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo41.setRotationPoint( 7F, 14F, 2F );
        Blockventilo51 = new ModelRenderer( this, 17, 177 );
        Blockventilo51.setTextureSize( 256, 512 );
        Blockventilo51.addBox( -5F, -1F, -0.5F, 10, 2, 1);
        Blockventilo51.setRotationPoint( 7F, 14F, 2F );
        Block6 = new ModelRenderer( this, 85, 200 );
        Block6.setTextureSize( 256, 512 );
        Block6.addBox( -4.5F, -6F, -0.5F, 9, 12, 1);
        Block6.setRotationPoint( 16F, 14F, -5F );
        Block7 = new ModelRenderer( this, 85, 200 );
        Block7.setTextureSize( 256, 512 );
        Block7.addBox( -0.5F, -6F, -0.5F, 1, 12, 1);
        Block7.setRotationPoint( 2F, 14F, -5F );
        Block8 = new ModelRenderer( this, 85, 200 );
        Block8.setTextureSize( 256, 512 );
        Block8.addBox( -4.5F, -0.5F, -0.5F, 9, 1, 1);
        Block8.setRotationPoint( 7F, 8.5F, -5F );
        Block9 = new ModelRenderer( this, 85, 200 );
        Block9.setTextureSize( 256, 512 );
        Block9.addBox( -4.5F, -0.5F, -0.5F, 9, 1, 1);
        Block9.setRotationPoint( 7F, 19.5F, -5F );
        grille1 = new ModelRenderer( this, 14, 204 );
        grille1.setTextureSize( 256, 512 );
        grille1.addBox( -4.5F, -0.5F, 0F, 9, 1, 0);
        grille1.setRotationPoint( 7F, 18F, -5F );
        grille2 = new ModelRenderer( this, 14, 206 );
        grille2.setTextureSize( 256, 512 );
        grille2.addBox( -4.5F, -0.5F, 0F, 9, 1, 0);
        grille2.setRotationPoint( 7F, 16F, -5F );
        grille3 = new ModelRenderer( this, 14, 209 );
        grille3.setTextureSize( 256, 512 );
        grille3.addBox( -4.5F, -0.5F, 0F, 9, 1, 0);
        grille3.setRotationPoint( 7F, 14F, -5F );
        grille4 = new ModelRenderer( this, 13, 212 );
        grille4.setTextureSize( 256, 512 );
        grille4.addBox( -4.5F, -0.5F, 0F, 9, 1, 0);
        grille4.setRotationPoint( 7F, 12F, -5F );
        grille5 = new ModelRenderer( this, 13, 219 );
        grille5.setTextureSize( 256, 512 );
        grille5.addBox( -4.5F, -0.5F, 0F, 9, 1, 0);
        grille5.setRotationPoint( 7F, 10F, -5F );
        Block10 = new ModelRenderer( this, 85, 200 );
        Block10.setTextureSize( 256, 512 );
        Block10.addBox( -3.5F, -0.5F, -0.5F, 7, 1, 1);
        Block10.setRotationPoint( 16F, 17F, -5.5F );
        Block101 = new ModelRenderer( this, 85, 200 );
        Block101.setTextureSize( 256, 512 );
        Block101.addBox( -3.5F, -0.5F, -0.5F, 7, 1, 1);
        Block101.setRotationPoint( 16F, 15F, -5.5F );
        Block102 = new ModelRenderer( this, 85, 200 );
        Block102.setTextureSize( 256, 512 );
        Block102.addBox( -3.5F, -0.5F, -0.5F, 7, 1, 1);
        Block102.setRotationPoint( 16F, 13F, -5.5F );
        Block103 = new ModelRenderer( this, 85, 200 );
        Block103.setTextureSize( 256, 512 );
        Block103.addBox( -3.5F, -0.5F, -0.5F, 7, 1, 1);
        Block103.setRotationPoint( 16F, 11F, -5.5F );
        Block150 = new ModelRenderer( this, 101, 233 );
        Block150.setTextureSize( 256, 512 );
        Block150.addBox( -0.5F, -4.5F, -4F, 1, 9, 8);
        Block150.setRotationPoint( 21.5F, 14F, 0F );
    }

   public void renderAll()
   {
        Blocksoutien1.rotateAngleX = 0F;
        Blocksoutien1.rotateAngleY = 0F;
        Blocksoutien1.rotateAngleZ = 0F;
        Blocksoutien1.renderWithRotation(0.0625F);

        Block.rotateAngleX = 0F;
        Block.rotateAngleY = 0F;
        Block.rotateAngleZ = 0F;
        Block.renderWithRotation(0.0625F);

        Blocksoutien4.rotateAngleX = 0F;
        Blocksoutien4.rotateAngleY = 0F;
        Blocksoutien4.rotateAngleZ = 0F;
        Blocksoutien4.renderWithRotation(0.0625F);

        Blocksoutien5.rotateAngleX = -0.6483401F;
        Blocksoutien5.rotateAngleY = 0F;
        Blocksoutien5.rotateAngleZ = 0F;
        Blocksoutien5.renderWithRotation(0.0625F);

        Blocksoutien2.rotateAngleX = 0F;
        Blocksoutien2.rotateAngleY = 0F;
        Blocksoutien2.rotateAngleZ = 0F;
        Blocksoutien2.renderWithRotation(0.0625F);

        Blocksoutien6.rotateAngleX = -0.6483401F;
        Blocksoutien6.rotateAngleY = 0F;
        Blocksoutien6.rotateAngleZ = 0F;
        Blocksoutien6.renderWithRotation(0.0625F);

        Blocksoutien3.rotateAngleX = 0F;
        Blocksoutien3.rotateAngleY = 0F;
        Blocksoutien3.rotateAngleZ = 0F;
        Blocksoutien3.renderWithRotation(0.0625F);

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
        Block5.rotateAngleY = 0F;
        Block5.rotateAngleZ = 0F;
        Block5.renderWithRotation(0.0625F);

        Blockventilo1.rotateAngleX = 0F;
        Blockventilo1.rotateAngleY = 0F;
        Blockventilo1.rotateAngleZ = 0F;
        Blockventilo1.renderWithRotation(0.0625F);

        Blockventilo3.rotateAngleX = 0F;
        Blockventilo3.rotateAngleY = 0F;
        Blockventilo3.rotateAngleZ = -1.084006F;
        Blockventilo3.renderWithRotation(0.0625F);

        Blockventilo2.rotateAngleX = 0F;
        Blockventilo2.rotateAngleY = 0F;
        Blockventilo2.rotateAngleZ = 0.4533459F;
        Blockventilo2.renderWithRotation(0.0625F);

        Blockventilo4.rotateAngleX = 0F;
        Blockventilo4.rotateAngleY = 0F;
        Blockventilo4.rotateAngleZ = 2.917645F;
        Blockventilo4.renderWithRotation(0.0625F);

        Blockventilo5.rotateAngleX = 0F;
        Blockventilo5.rotateAngleY = 0F;
        Blockventilo5.rotateAngleZ = 1.324601F;
        Blockventilo5.renderWithRotation(0.0625F);

        Blockventilo20.rotateAngleX = 0F;
        Blockventilo20.rotateAngleY = 0F;
        Blockventilo20.rotateAngleZ = -1.351733F;
        Blockventilo20.renderWithRotation(0.0625F);

        Blockventilo21.rotateAngleX = 0F;
        Blockventilo21.rotateAngleY = 0F;
        Blockventilo21.rotateAngleZ = 0.1856188F;
        Blockventilo21.renderWithRotation(0.0625F);

        Blockventilo41.rotateAngleX = 0F;
        Blockventilo41.rotateAngleY = 0F;
        Blockventilo41.rotateAngleZ = 2.649917F;
        Blockventilo41.renderWithRotation(0.0625F);

        Blockventilo51.rotateAngleX = 0F;
        Blockventilo51.rotateAngleY = 0F;
        Blockventilo51.rotateAngleZ = 1.056874F;
        Blockventilo51.renderWithRotation(0.0625F);

        Block6.rotateAngleX = 0F;
        Block6.rotateAngleY = 0F;
        Block6.rotateAngleZ = 0F;
        Block6.renderWithRotation(0.0625F);

        Block7.rotateAngleX = 0F;
        Block7.rotateAngleY = 0F;
        Block7.rotateAngleZ = 0F;
        Block7.renderWithRotation(0.0625F);

        Block8.rotateAngleX = 0F;
        Block8.rotateAngleY = 0F;
        Block8.rotateAngleZ = 0F;
        Block8.renderWithRotation(0.0625F);

        Block9.rotateAngleX = 0F;
        Block9.rotateAngleY = 0F;
        Block9.rotateAngleZ = 0F;
        Block9.renderWithRotation(0.0625F);

        grille1.rotateAngleX = 0F;
        grille1.rotateAngleY = 0F;
        grille1.rotateAngleZ = 0F;
        grille1.renderWithRotation(0.0625F);

        grille2.rotateAngleX = 0F;
        grille2.rotateAngleY = 0F;
        grille2.rotateAngleZ = 0F;
        grille2.renderWithRotation(0.0625F);

        grille3.rotateAngleX = 0F;
        grille3.rotateAngleY = 0F;
        grille3.rotateAngleZ = 0F;
        grille3.renderWithRotation(0.0625F);

        grille4.rotateAngleX = 0F;
        grille4.rotateAngleY = 0F;
        grille4.rotateAngleZ = 0F;
        grille4.renderWithRotation(0.0625F);

        grille5.rotateAngleX = 0F;
        grille5.rotateAngleY = 0F;
        grille5.rotateAngleZ = 0F;
        grille5.renderWithRotation(0.0625F);

        Block10.rotateAngleX = 0F;
        Block10.rotateAngleY = 0F;
        Block10.rotateAngleZ = 0F;
        Block10.renderWithRotation(0.0625F);

        Block101.rotateAngleX = 0F;
        Block101.rotateAngleY = 0F;
        Block101.rotateAngleZ = 0F;
        Block101.renderWithRotation(0.0625F);

        Block102.rotateAngleX = 0F;
        Block102.rotateAngleY = 0F;
        Block102.rotateAngleZ = 0F;
        Block102.renderWithRotation(0.0625F);

        Block103.rotateAngleX = 0F;
        Block103.rotateAngleY = 0F;
        Block103.rotateAngleZ = 0F;
        Block103.renderWithRotation(0.0625F);

        Block150.rotateAngleX = 0F;
        Block150.rotateAngleY = 0F;
        Block150.rotateAngleZ = 0F;
        Block150.renderWithRotation(0.0625F);

    }

}
