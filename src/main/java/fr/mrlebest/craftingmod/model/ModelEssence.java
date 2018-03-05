package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelEssence extends ModelBase
{
    ModelRenderer Blocktest;
    ModelRenderer Block1;
    ModelRenderer pompe1;
    ModelRenderer pompe2;
    ModelRenderer pompe3;
    ModelRenderer pompe4;
    ModelRenderer pompe5;
    ModelRenderer pompe6;
    ModelRenderer pompe7;
    ModelRenderer mAIN1;
    ModelRenderer pompe8;
    ModelRenderer pompe2_1;
    ModelRenderer pompe2_2;
    ModelRenderer pompe3_3;
    ModelRenderer pompe4_4;
    ModelRenderer pompe5_5;
    ModelRenderer pompe6_6;
    ModelRenderer pompe7_7;
    ModelRenderer pompe8_8;
    ModelRenderer mAIN2;
    ModelRenderer pompe2_1_2;
    ModelRenderer pompe2_2_2;
    ModelRenderer pompe3_3_3;
    ModelRenderer pompe4_4_4;
    ModelRenderer pompe5_5_5;
    ModelRenderer pompe6_6_6;
    ModelRenderer pompe7_7_7;
    ModelRenderer mAIN3;
    ModelRenderer Block_soutien1;
    ModelRenderer Block_soutien2;
    ModelRenderer Block_soutien3;
    ModelRenderer Block_soutien4;
    ModelRenderer Block_soutien5;
    ModelRenderer Block_soutien6;
    ModelRenderer Ecran;
    ModelRenderer Blockwtf;
    ModelRenderer Blockwtf2;
    ModelRenderer Blockecran2;
    ModelRenderer Block_20;
    ModelRenderer Block_22;
    ModelRenderer Block_23;
    ModelRenderer Block_24;
    ModelRenderer Block_26;
    ModelRenderer bouton;
    ModelRenderer PAPIER;
    ModelRenderer Bloc45;
    ModelRenderer Blockwtf55;
    ModelRenderer Blockwtf59;
    ModelRenderer Block_pilier;
    ModelRenderer Block_pilier2;
    ModelRenderer Block_poubelle;
    ModelRenderer Block_poubelle2;
    ModelRenderer Block_poubelle3;
    ModelRenderer Block_poubelle4;

    public ModelEssence()
    {
        this( 0.0f );
    }

    public ModelEssence( float par1 )
    {
        Blocktest = new ModelRenderer( this, 36, 15 );
        Blocktest.setTextureSize( 512, 512 );
        Blocktest.addBox( -6F, -8F, -7F, 12, 16, 14);
        Blocktest.setRotationPoint( 14F, 17F, 0F );
        Block1 = new ModelRenderer( this, 8, 83 );
        Block1.setTextureSize( 512, 512 );
        Block1.addBox( -8F, -16F, -7F, 16, 32, 14);
        Block1.setRotationPoint( 0F, 9F, 0F );
        pompe1 = new ModelRenderer( this, 91, 75 );
        pompe1.setTextureSize( 512, 512 );
        pompe1.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        pompe1.setRotationPoint( -4F, 20F, -7F );
        pompe2 = new ModelRenderer( this, 91, 75 );
        pompe2.setTextureSize( 512, 512 );
        pompe2.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        pompe2.setRotationPoint( -4F, 17F, -7.5F );
        pompe3 = new ModelRenderer( this, 91, 75 );
        pompe3.setTextureSize( 512, 512 );
        pompe3.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe3.setRotationPoint( -4F, 15F, -7.7F );
        pompe4 = new ModelRenderer( this, 91, 75 );
        pompe4.setTextureSize( 512, 512 );
        pompe4.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        pompe4.setRotationPoint( -4F, 14F, -7.9F );
        pompe5 = new ModelRenderer( this, 91, 75 );
        pompe5.setTextureSize( 512, 512 );
        pompe5.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe5.setRotationPoint( -4F, 13F, -8F );
        pompe6 = new ModelRenderer( this, 92, 83 );
        pompe6.setTextureSize( 512, 512 );
        pompe6.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe6.setRotationPoint( -4F, 10F, -7.9F );
        pompe7 = new ModelRenderer( this, 91, 75 );
        pompe7.setTextureSize( 512, 512 );
        pompe7.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe7.setRotationPoint( -4F, 12F, -8F );
        mAIN1 = new ModelRenderer( this, 97, 75 );
        mAIN1.setTextureSize( 512, 512 );
        mAIN1.addBox( -0.5F, -1.5F, -1F, 1, 3, 2);
        mAIN1.setRotationPoint( -4F, 8F, -7.5F );
        pompe8 = new ModelRenderer( this, 91, 75 );
        pompe8.setTextureSize( 512, 512 );
        pompe8.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe8.setRotationPoint( -4F, 11F, -7.9F );
        pompe2_1 = new ModelRenderer( this, 91, 75 );
        pompe2_1.setTextureSize( 512, 512 );
        pompe2_1.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        pompe2_1.setRotationPoint( 0F, 20F, -7F );
        pompe2_2 = new ModelRenderer( this, 91, 75 );
        pompe2_2.setTextureSize( 512, 512 );
        pompe2_2.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        pompe2_2.setRotationPoint( 0F, 17F, -7.5F );
        pompe3_3 = new ModelRenderer( this, 91, 75 );
        pompe3_3.setTextureSize( 512, 512 );
        pompe3_3.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe3_3.setRotationPoint( 0F, 15F, -7.7F );
        pompe4_4 = new ModelRenderer( this, 91, 75 );
        pompe4_4.setTextureSize( 512, 512 );
        pompe4_4.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        pompe4_4.setRotationPoint( 0F, 14F, -7.9F );
        pompe5_5 = new ModelRenderer( this, 91, 75 );
        pompe5_5.setTextureSize( 512, 512 );
        pompe5_5.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe5_5.setRotationPoint( 0F, 13F, -8F );
        pompe6_6 = new ModelRenderer( this, 97, 83 );
        pompe6_6.setTextureSize( 512, 512 );
        pompe6_6.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe6_6.setRotationPoint( 0F, 10F, -7.9F );
        pompe7_7 = new ModelRenderer( this, 91, 75 );
        pompe7_7.setTextureSize( 512, 512 );
        pompe7_7.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe7_7.setRotationPoint( 0F, 12F, -8F );
        pompe8_8 = new ModelRenderer( this, 91, 75 );
        pompe8_8.setTextureSize( 512, 512 );
        pompe8_8.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe8_8.setRotationPoint( -4F, 11F, -7.9F );
        mAIN2 = new ModelRenderer( this, 104, 75 );
        mAIN2.setTextureSize( 512, 512 );
        mAIN2.addBox( -0.5F, -1.5F, -1F, 1, 3, 2);
        mAIN2.setRotationPoint( 0F, 8F, -7.5F );
        pompe2_1_2 = new ModelRenderer( this, 91, 75 );
        pompe2_1_2.setTextureSize( 512, 512 );
        pompe2_1_2.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        pompe2_1_2.setRotationPoint( 4F, 20F, -7F );
        pompe2_2_2 = new ModelRenderer( this, 91, 75 );
        pompe2_2_2.setTextureSize( 512, 512 );
        pompe2_2_2.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        pompe2_2_2.setRotationPoint( 4F, 17F, -7.5F );
        pompe3_3_3 = new ModelRenderer( this, 91, 75 );
        pompe3_3_3.setTextureSize( 512, 512 );
        pompe3_3_3.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe3_3_3.setRotationPoint( 4F, 15F, -7.7F );
        pompe4_4_4 = new ModelRenderer( this, 91, 75 );
        pompe4_4_4.setTextureSize( 512, 512 );
        pompe4_4_4.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        pompe4_4_4.setRotationPoint( 4F, 14F, -7.9F );
        pompe5_5_5 = new ModelRenderer( this, 91, 75 );
        pompe5_5_5.setTextureSize( 512, 512 );
        pompe5_5_5.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe5_5_5.setRotationPoint( 4F, 13F, -8F );
        pompe6_6_6 = new ModelRenderer( this, 103, 83 );
        pompe6_6_6.setTextureSize( 512, 512 );
        pompe6_6_6.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe6_6_6.setRotationPoint( 4F, 10F, -7.9F );
        pompe7_7_7 = new ModelRenderer( this, 91, 75 );
        pompe7_7_7.setTextureSize( 512, 512 );
        pompe7_7_7.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        pompe7_7_7.setRotationPoint( 4F, 12F, -8F );
        mAIN3 = new ModelRenderer( this, 108, 81 );
        mAIN3.setTextureSize( 512, 512 );
        mAIN3.addBox( -0.5F, -1.5F, -1F, 1, 3, 2);
        mAIN3.setRotationPoint( 4F, 8F, -7.5F );
        Block_soutien1 = new ModelRenderer( this, 91, 50 );
        Block_soutien1.setTextureSize( 512, 512 );
        Block_soutien1.addBox( -1F, -9F, -0.5F, 2, 18, 1);
        Block_soutien1.setRotationPoint( -6F, 15F, -7F );
        Block_soutien2 = new ModelRenderer( this, 91, 50 );
        Block_soutien2.setTextureSize( 512, 512 );
        Block_soutien2.addBox( -1F, -9F, -0.5F, 2, 18, 1);
        Block_soutien2.setRotationPoint( 6F, 15F, -7F );
        Block_soutien3 = new ModelRenderer( this, 91, 50 );
        Block_soutien3.setTextureSize( 512, 512 );
        Block_soutien3.addBox( -1F, -9F, -0.5F, 2, 18, 1);
        Block_soutien3.setRotationPoint( -2F, 15F, -7F );
        Block_soutien4 = new ModelRenderer( this, 91, 50 );
        Block_soutien4.setTextureSize( 512, 512 );
        Block_soutien4.addBox( -1F, -9F, -0.5F, 2, 18, 1);
        Block_soutien4.setRotationPoint( 2F, 15F, -7F );
        Block_soutien5 = new ModelRenderer( this, 91, 50 );
        Block_soutien5.setTextureSize( 512, 512 );
        Block_soutien5.addBox( -1F, -5F, -0.5F, 2, 10, 1);
        Block_soutien5.setRotationPoint( 0F, 23F, -7F );
        Block_soutien6 = new ModelRenderer( this, 91, 50 );
        Block_soutien6.setTextureSize( 512, 512 );
        Block_soutien6.addBox( -1F, -7F, -0.5F, 2, 14, 1);
        Block_soutien6.setRotationPoint( 0F, 5F, -7F );
        Ecran = new ModelRenderer( this, 103, 26 );
        Ecran.setTextureSize( 512, 512 );
        Ecran.addBox( -4F, -6.5F, -0.5F, 8, 13, 1);
        Ecran.setRotationPoint( 0F, -1F, -7F );
        Blockwtf = new ModelRenderer( this, 9, 9 );
        Blockwtf.setTextureSize( 512, 512 );
        Blockwtf.addBox( -4F, -4F, -3.5F, 8, 8, 7);
        Blockwtf.setRotationPoint( 12F, 0F, -3F );
        Blockwtf2 = new ModelRenderer( this, 10, 53 );
        Blockwtf2.setTextureSize( 512, 512 );
        Blockwtf2.addBox( -3.5F, -3.5F, -0.5F, 7, 7, 1);
        Blockwtf2.setRotationPoint( 12F, 0F, -6.5F );
        Blockecran2 = new ModelRenderer( this, 8, 63 );
        Blockecran2.setTextureSize( 512, 512 );
        Blockecran2.addBox( -3F, -2.5F, -0.5F, 6, 5, 1);
        Blockecran2.setRotationPoint( 12F, -0.5F, -6.6F );
        Block_20 = new ModelRenderer( this, 87, 116 );
        Block_20.setTextureSize( 512, 512 );
        Block_20.addBox( -1F, -7F, -0.5F, 2, 14, 1);
        Block_20.setRotationPoint( 14F, 24F, -7F );
        Block_22 = new ModelRenderer( this, 87, 116 );
        Block_22.setTextureSize( 512, 512 );
        Block_22.addBox( -1F, -15F, -0.5F, 2, 30, 1);
        Block_22.setRotationPoint( 6F, 24F, 7F );
        Block_23 = new ModelRenderer( this, 86, 115 );
        Block_23.setTextureSize( 512, 512 );
        Block_23.addBox( -1F, -6.5F, -1F, 2, 13, 2);
        Block_23.setRotationPoint( 21F, 24F, 0F );
        Block_24 = new ModelRenderer( this, 85, 114 );
        Block_24.setTextureSize( 512, 512 );
        Block_24.addBox( -1F, -1F, -1.5F, 2, 2, 3);
        Block_24.setRotationPoint( -8F, 24F, -6F );
        Block_26 = new ModelRenderer( this, 86, 115 );
        Block_26.setTextureSize( 512, 512 );
        Block_26.addBox( -1F, -7F, -1F, 2, 14, 2);
        Block_26.setRotationPoint( -8F, 24F, 0F );
        bouton = new ModelRenderer( this, 57, 52 );
        bouton.setTextureSize( 512, 512 );
        bouton.addBox( -0.5F, -0.5F, -1F, 1, 1, 2);
        bouton.setRotationPoint( 14F, 12F, -6.3F );
        PAPIER = new ModelRenderer( this, 20, 32 );
        PAPIER.setTextureSize( 512, 512 );
        PAPIER.addBox( -0.5F, -3F, -2F, 1, 6, 4);
        PAPIER.setRotationPoint( 21F, 0F, 0F );
        Bloc45 = new ModelRenderer( this, 24, 65 );
        Bloc45.setTextureSize( 512, 512 );
        Bloc45.addBox( -4F, -3F, -3.5F, 8, 6, 7);
        Bloc45.setRotationPoint( 12F, 6F, -3F );
        Blockwtf55 = new ModelRenderer( this, 10, 53 );
        Blockwtf55.setTextureSize( 512, 512 );
        Blockwtf55.addBox( -2.5F, -2F, -0.5F, 5, 4, 1);
        Blockwtf55.setRotationPoint( 11F, 6F, -6.5F );
        Blockwtf59 = new ModelRenderer( this, 10, 53 );
        Blockwtf59.setTextureSize( 512, 512 );
        Blockwtf59.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        Blockwtf59.setRotationPoint( 15F, 6F, -6.5F );
        Block_pilier = new ModelRenderer( this, 28, 242 );
        Block_pilier.setTextureSize( 512, 512 );
        Block_pilier.addBox( -1F, -14.5F, -6F, 2, 29, 12);
        Block_pilier.setRotationPoint( 20F, 9F, 0F );
        Block_pilier2 = new ModelRenderer( this, 26, 240 );
        Block_pilier2.setTextureSize( 512, 512 );
        Block_pilier2.addBox( -1F, -14.5F, -7F, 2, 29, 14);
        Block_pilier2.setRotationPoint( 7F, -6F, 0F );
        Block_poubelle = new ModelRenderer( this, 99, 206 );
        Block_poubelle.setTextureSize( 512, 512 );
        Block_poubelle.addBox( -0.5F, -6F, -3F, 1, 12, 6);
        Block_poubelle.setRotationPoint( 23F, 16F, 0F );
        Block_poubelle2 = new ModelRenderer( this, 81, 223 );
        Block_poubelle2.setTextureSize( 512, 512 );
        Block_poubelle2.addBox( -0.5F, -6F, -3F, 1, 12, 6);
        Block_poubelle2.setRotationPoint( 20F, 16F, -3F );
        Block_poubelle3 = new ModelRenderer( this, 81, 223 );
        Block_poubelle3.setTextureSize( 512, 512 );
        Block_poubelle3.addBox( -0.5F, -6F, -3F, 1, 12, 6);
        Block_poubelle3.setRotationPoint( 20F, 16F, 3F );
        Block_poubelle4 = new ModelRenderer( this, 99, 206 );
        Block_poubelle4.setTextureSize( 512, 512 );
        Block_poubelle4.addBox( -0.5F, -6F, -3F, 1, 12, 6);
        Block_poubelle4.setRotationPoint( 17F, 22F, 0F );
    }

   public void renderAll()
   {
        Blocktest.rotateAngleX = 0F;
        Blocktest.rotateAngleY = 0F;
        Blocktest.rotateAngleZ = 0F;
        Blocktest.renderWithRotation(0.0625F);

        Block1.rotateAngleX = 0F;
        Block1.rotateAngleY = 0F;
        Block1.rotateAngleZ = 0F;
        Block1.renderWithRotation(0.0625F);

        pompe1.rotateAngleX = 0.2094997F;
        pompe1.rotateAngleY = 0F;
        pompe1.rotateAngleZ = 0F;
        pompe1.renderWithRotation(0.0625F);

        pompe2.rotateAngleX = 0.08430472F;
        pompe2.rotateAngleY = 0F;
        pompe2.rotateAngleZ = 0F;
        pompe2.renderWithRotation(0.0625F);

        pompe3.rotateAngleX = 0.200196F;
        pompe3.rotateAngleY = 0F;
        pompe3.rotateAngleZ = 0F;
        pompe3.renderWithRotation(0.0625F);

        pompe4.rotateAngleX = 0.102852F;
        pompe4.rotateAngleY = 0F;
        pompe4.rotateAngleZ = 0F;
        pompe4.renderWithRotation(0.0625F);

        pompe5.rotateAngleX = 0.07026547F;
        pompe5.rotateAngleY = 0F;
        pompe5.rotateAngleZ = 0F;
        pompe5.renderWithRotation(0.0625F);

        pompe6.rotateAngleX = -0.09752459F;
        pompe6.rotateAngleY = 0F;
        pompe6.rotateAngleZ = 0F;
        pompe6.renderWithRotation(0.0625F);

        pompe7.rotateAngleX = -0.03134474F;
        pompe7.rotateAngleY = 0F;
        pompe7.rotateAngleZ = 0F;
        pompe7.renderWithRotation(0.0625F);

        mAIN1.rotateAngleX = -0.3526925F;
        mAIN1.rotateAngleY = 0F;
        mAIN1.rotateAngleZ = 0F;
        mAIN1.renderWithRotation(0.0625F);

        pompe8.rotateAngleX = -0.09752459F;
        pompe8.rotateAngleY = 0F;
        pompe8.rotateAngleZ = 0F;
        pompe8.renderWithRotation(0.0625F);

        pompe2_1.rotateAngleX = 0.2094997F;
        pompe2_1.rotateAngleY = 0F;
        pompe2_1.rotateAngleZ = 0F;
        pompe2_1.renderWithRotation(0.0625F);

        pompe2_2.rotateAngleX = 0.08430472F;
        pompe2_2.rotateAngleY = 0F;
        pompe2_2.rotateAngleZ = 0F;
        pompe2_2.renderWithRotation(0.0625F);

        pompe3_3.rotateAngleX = 0.200196F;
        pompe3_3.rotateAngleY = 0F;
        pompe3_3.rotateAngleZ = 0F;
        pompe3_3.renderWithRotation(0.0625F);

        pompe4_4.rotateAngleX = 0.102852F;
        pompe4_4.rotateAngleY = 0F;
        pompe4_4.rotateAngleZ = 0F;
        pompe4_4.renderWithRotation(0.0625F);

        pompe5_5.rotateAngleX = 0.07026547F;
        pompe5_5.rotateAngleY = 0F;
        pompe5_5.rotateAngleZ = 0F;
        pompe5_5.renderWithRotation(0.0625F);

        pompe6_6.rotateAngleX = -0.09752459F;
        pompe6_6.rotateAngleY = 0F;
        pompe6_6.rotateAngleZ = 0F;
        pompe6_6.renderWithRotation(0.0625F);

        pompe7_7.rotateAngleX = -0.03134474F;
        pompe7_7.rotateAngleY = 0F;
        pompe7_7.rotateAngleZ = 0F;
        pompe7_7.renderWithRotation(0.0625F);

        pompe8_8.rotateAngleX = -0.09752459F;
        pompe8_8.rotateAngleY = 0F;
        pompe8_8.rotateAngleZ = 0F;
        pompe8_8.renderWithRotation(0.0625F);

        mAIN2.rotateAngleX = -0.3526925F;
        mAIN2.rotateAngleY = 0F;
        mAIN2.rotateAngleZ = 0F;
        mAIN2.renderWithRotation(0.0625F);

        pompe2_1_2.rotateAngleX = 0.2094997F;
        pompe2_1_2.rotateAngleY = 0F;
        pompe2_1_2.rotateAngleZ = 0F;
        pompe2_1_2.renderWithRotation(0.0625F);

        pompe2_2_2.rotateAngleX = 0.08430472F;
        pompe2_2_2.rotateAngleY = 0F;
        pompe2_2_2.rotateAngleZ = 0F;
        pompe2_2_2.renderWithRotation(0.0625F);

        pompe3_3_3.rotateAngleX = 0.200196F;
        pompe3_3_3.rotateAngleY = 0F;
        pompe3_3_3.rotateAngleZ = 0F;
        pompe3_3_3.renderWithRotation(0.0625F);

        pompe4_4_4.rotateAngleX = 0.102852F;
        pompe4_4_4.rotateAngleY = 0F;
        pompe4_4_4.rotateAngleZ = 0F;
        pompe4_4_4.renderWithRotation(0.0625F);

        pompe5_5_5.rotateAngleX = 0.07026547F;
        pompe5_5_5.rotateAngleY = 0F;
        pompe5_5_5.rotateAngleZ = 0F;
        pompe5_5_5.renderWithRotation(0.0625F);

        pompe6_6_6.rotateAngleX = -0.09752459F;
        pompe6_6_6.rotateAngleY = 0F;
        pompe6_6_6.rotateAngleZ = 0F;
        pompe6_6_6.renderWithRotation(0.0625F);

        pompe7_7_7.rotateAngleX = -0.03134474F;
        pompe7_7_7.rotateAngleY = 0F;
        pompe7_7_7.rotateAngleZ = 0F;
        pompe7_7_7.renderWithRotation(0.0625F);

        mAIN3.rotateAngleX = -0.3526925F;
        mAIN3.rotateAngleY = 0F;
        mAIN3.rotateAngleZ = 0F;
        mAIN3.renderWithRotation(0.0625F);

        Block_soutien1.rotateAngleX = 0F;
        Block_soutien1.rotateAngleY = 0F;
        Block_soutien1.rotateAngleZ = 0F;
        Block_soutien1.renderWithRotation(0.0625F);

        Block_soutien2.rotateAngleX = 0F;
        Block_soutien2.rotateAngleY = 0F;
        Block_soutien2.rotateAngleZ = 0F;
        Block_soutien2.renderWithRotation(0.0625F);

        Block_soutien3.rotateAngleX = 0F;
        Block_soutien3.rotateAngleY = 0F;
        Block_soutien3.rotateAngleZ = 0F;
        Block_soutien3.renderWithRotation(0.0625F);

        Block_soutien4.rotateAngleX = 0F;
        Block_soutien4.rotateAngleY = 0F;
        Block_soutien4.rotateAngleZ = 0F;
        Block_soutien4.renderWithRotation(0.0625F);

        Block_soutien5.rotateAngleX = 0F;
        Block_soutien5.rotateAngleY = 0F;
        Block_soutien5.rotateAngleZ = 1.570796F;
        Block_soutien5.renderWithRotation(0.0625F);

        Block_soutien6.rotateAngleX = 0F;
        Block_soutien6.rotateAngleY = 0F;
        Block_soutien6.rotateAngleZ = 1.570796F;
        Block_soutien6.renderWithRotation(0.0625F);

        Ecran.rotateAngleX = 0F;
        Ecran.rotateAngleY = 0F;
        Ecran.rotateAngleZ = 1.570796F;
        Ecran.renderWithRotation(0.0625F);

        Blockwtf.rotateAngleX = 0F;
        Blockwtf.rotateAngleY = 0F;
        Blockwtf.rotateAngleZ = 0F;
        Blockwtf.renderWithRotation(0.0625F);

        Blockwtf2.rotateAngleX = 0F;
        Blockwtf2.rotateAngleY = 0F;
        Blockwtf2.rotateAngleZ = 0F;
        Blockwtf2.renderWithRotation(0.0625F);

        Blockecran2.rotateAngleX = 0F;
        Blockecran2.rotateAngleY = 0F;
        Blockecran2.rotateAngleZ = 0F;
        Blockecran2.renderWithRotation(0.0625F);

        Block_20.rotateAngleX = 0F;
        Block_20.rotateAngleY = 0F;
        Block_20.rotateAngleZ = 1.570796F;
        Block_20.renderWithRotation(0.0625F);

        Block_22.rotateAngleX = 0F;
        Block_22.rotateAngleY = 0F;
        Block_22.rotateAngleZ = 1.570796F;
        Block_22.renderWithRotation(0.0625F);

        Block_23.rotateAngleX = 0F;
        Block_23.rotateAngleY = -1.570796F;
        Block_23.rotateAngleZ = 1.570796F;
        Block_23.renderWithRotation(0.0625F);

        Block_24.rotateAngleX = 0F;
        Block_24.rotateAngleY = 0F;
        Block_24.rotateAngleZ = 1.570796F;
        Block_24.renderWithRotation(0.0625F);

        Block_26.rotateAngleX = 1.570796F;
        Block_26.rotateAngleY = -3.141593F;
        Block_26.rotateAngleZ = 0F;
        Block_26.renderWithRotation(0.0625F);

        bouton.rotateAngleX = 0F;
        bouton.rotateAngleY = 0F;
        bouton.rotateAngleZ = 0F;
        bouton.renderWithRotation(0.0625F);

        PAPIER.rotateAngleX = 0F;
        PAPIER.rotateAngleY = 0F;
        PAPIER.rotateAngleZ = 0F;
        PAPIER.renderWithRotation(0.0625F);

        Bloc45.rotateAngleX = 0F;
        Bloc45.rotateAngleY = 0F;
        Bloc45.rotateAngleZ = 0F;
        Bloc45.renderWithRotation(0.0625F);

        Blockwtf55.rotateAngleX = 0F;
        Blockwtf55.rotateAngleY = 0F;
        Blockwtf55.rotateAngleZ = 0F;
        Blockwtf55.renderWithRotation(0.0625F);

        Blockwtf59.rotateAngleX = 0F;
        Blockwtf59.rotateAngleY = 0F;
        Blockwtf59.rotateAngleZ = 0F;
        Blockwtf59.renderWithRotation(0.0625F);

        Block_pilier.rotateAngleX = 0F;
        Block_pilier.rotateAngleY = 0F;
        Block_pilier.rotateAngleZ = 0F;
        Block_pilier.renderWithRotation(0.0625F);

        Block_pilier2.rotateAngleX = 0F;
        Block_pilier2.rotateAngleY = 0F;
        Block_pilier2.rotateAngleZ = -1.570796F;
        Block_pilier2.renderWithRotation(0.0625F);

        Block_poubelle.rotateAngleX = 0F;
        Block_poubelle.rotateAngleY = 0F;
        Block_poubelle.rotateAngleZ = 0F;
        Block_poubelle.renderWithRotation(0.0625F);

        Block_poubelle2.rotateAngleX = 0F;
        Block_poubelle2.rotateAngleY = -1.570796F;
        Block_poubelle2.rotateAngleZ = 0F;
        Block_poubelle2.renderWithRotation(0.0625F);

        Block_poubelle3.rotateAngleX = 0F;
        Block_poubelle3.rotateAngleY = -1.570796F;
        Block_poubelle3.rotateAngleZ = 0F;
        Block_poubelle3.renderWithRotation(0.0625F);

        Block_poubelle4.rotateAngleX = 0F;
        Block_poubelle4.rotateAngleY = 0F;
        Block_poubelle4.rotateAngleZ = -1.570796F;
        Block_poubelle4.renderWithRotation(0.0625F);

    }

}
