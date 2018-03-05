package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStand extends ModelBase
{
    ModelRenderer sel;
    ModelRenderer Block_coffre;
    ModelRenderer Block_imatricule;
    ModelRenderer Block_far_2;
    ModelRenderer Block_far;
    ModelRenderer Block_pencarte;
    ModelRenderer poivre;
    ModelRenderer cannette_2;
    ModelRenderer cannette_1;
    ModelRenderer Block_saucisse_2;
    ModelRenderer Block_pignier_saucisse;
    ModelRenderer Block_pignier_saucisse_2;
    ModelRenderer Block_saucisse;
    ModelRenderer Block_stand3;
    ModelRenderer Block_stand2;
    ModelRenderer Block_placard;
    ModelRenderer Block_stand1;
    ModelRenderer Bande_acroche_3;
    ModelRenderer Bande_acroche_1;
    ModelRenderer Block_acroche_4;
    ModelRenderer roue_2_2;
    ModelRenderer bande_4;
    ModelRenderer roue_2;
    ModelRenderer roue_1;
    ModelRenderer roue_1_2;
    ModelRenderer roue_1_1;
    ModelRenderer bande_2;
    ModelRenderer Block_Principal;
    ModelRenderer Block_2_2;
    ModelRenderer bande_3;
    ModelRenderer bande_1;
    ModelRenderer Block_2;
    ModelRenderer roue_2_3;
    ModelRenderer Block_poign__placard;
    ModelRenderer Bande_acroche_2;

    public ModelStand()
    {
        this( 0.0f );
    }

    public ModelStand( float par1 )
    {
        sel = new ModelRenderer( this, 18, 139 );
        sel.setTextureSize( 1024, 1024 );
        sel.addBox( -0.5F, -1.5F, -0.5F, 1, 3, 1);
        sel.setRotationPoint( 1F, 5F, -3F );
        Block_coffre = new ModelRenderer( this, 62, 82 );
        Block_coffre.setTextureSize( 1024, 1024 );
        Block_coffre.addBox( -0.5F, -4F, -3F, 1, 8, 6);
        Block_coffre.setRotationPoint( -16F, 12F, -4.5F );
        Block_imatricule = new ModelRenderer( this, 65, 70 );
        Block_imatricule.setTextureSize( 1024, 1024 );
        Block_imatricule.addBox( -0.5F, -1.5F, -4F, 1, 3, 8);
        Block_imatricule.setRotationPoint( -15.7F, 15F, 3F );
        Block_far_2 = new ModelRenderer( this, 64, 62 );
        Block_far_2.setTextureSize( 1024, 1024 );
        Block_far_2.addBox( -0.5F, -1.5F, -1F, 1, 3, 2);
        Block_far_2.setRotationPoint( -16F, 19F, 6F );
        Block_far = new ModelRenderer( this, 62, 70 );
        Block_far.setTextureSize( 1024, 1024 );
        Block_far.addBox( -0.5F, -1.5F, -1F, 1, 3, 2);
        Block_far.setRotationPoint( -16F, 19F, -6F );
        Block_pencarte = new ModelRenderer( this, 78, 25 );
        Block_pencarte.setTextureSize( 1024, 1024 );
        Block_pencarte.addBox( -5F, -6.5F, -1F, 10, 13, 2);
        Block_pencarte.setRotationPoint( 6F, 13F, -7.5F );
        poivre = new ModelRenderer( this, 23, 139 );
        poivre.setTextureSize( 1024, 1024 );
        poivre.addBox( -0.5F, -1.5F, -0.5F, 1, 3, 1);
        poivre.setRotationPoint( -0.5F, 5F, -2F );
        cannette_2 = new ModelRenderer( this, 18, 135 );
        cannette_2.setTextureSize( 1024, 1024 );
        cannette_2.addBox( -0.5F, -1.5F, -0.5F, 1, 3, 1);
        cannette_2.setRotationPoint( 5F, 5F, -1F );
        cannette_1 = new ModelRenderer( this, 12, 135 );
        cannette_1.setTextureSize( 1024, 1024 );
        cannette_1.addBox( -0.5F, -1.5F, -0.5F, 1, 3, 1);
        cannette_1.setRotationPoint( 3.5F, 5F, -3F );
        Block_saucisse_2 = new ModelRenderer( this, 2, 103 );
        Block_saucisse_2.setTextureSize( 1024, 1024 );
        Block_saucisse_2.addBox( -3F, -0.5F, -4F, 6, 1, 8);
        Block_saucisse_2.setRotationPoint( -5F, 6F, 3F );
        Block_pignier_saucisse = new ModelRenderer( this, 9, 119 );
        Block_pignier_saucisse.setTextureSize( 1024, 1024 );
        Block_pignier_saucisse.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        Block_pignier_saucisse.setRotationPoint( -5F, 5.5F, 0F );
        Block_pignier_saucisse_2 = new ModelRenderer( this, 8, 127 );
        Block_pignier_saucisse_2.setTextureSize( 1024, 1024 );
        Block_pignier_saucisse_2.addBox( -2F, -0.5F, -0.5F, 4, 1, 1);
        Block_pignier_saucisse_2.setRotationPoint( -12F, 5.5F, 0F );
        Block_saucisse = new ModelRenderer( this, 2, 87 );
        Block_saucisse.setTextureSize( 1024, 1024 );
        Block_saucisse.addBox( -3F, -0.5F, -4F, 6, 1, 8);
        Block_saucisse.setRotationPoint( -12F, 6F, 3F );
        Block_stand3 = new ModelRenderer( this, 12, 14 );
        Block_stand3.setTextureSize( 1024, 1024 );
        Block_stand3.addBox( -0.5F, -2.5F, -2F, 1, 5, 4);
        Block_stand3.setRotationPoint( 2F, 4F, -3.5F );
        Block_stand2 = new ModelRenderer( this, 9, 9 );
        Block_stand2.setTextureSize( 1024, 1024 );
        Block_stand2.addBox( -7.5F, -0.5F, -3.5F, 15, 1, 7);
        Block_stand2.setRotationPoint( 8F, 1F, -3.5F );
        Block_placard = new ModelRenderer( this, 8, 61 );
        Block_placard.setTextureSize( 1024, 1024 );
        Block_placard.addBox( -7F, -4.5F, -0.5F, 14, 9, 1);
        Block_placard.setRotationPoint( 6F, 14F, 8F );
        Block_stand1 = new ModelRenderer( this, 8, 8 );
        Block_stand1.setTextureSize( 1024, 1024 );
        Block_stand1.addBox( -0.5F, -3F, -4F, 1, 6, 8);
        Block_stand1.setRotationPoint( 15.5F, 3F, -3.5F );
        Bande_acroche_3 = new ModelRenderer( this, 4, 20 );
        Bande_acroche_3.setTextureSize( 1024, 1024 );
        Bande_acroche_3.addBox( -6F, -0.5F, -0.5F, 12, 1, 1);
        Bande_acroche_3.setRotationPoint( 20F, 21F, 4F );
        Bande_acroche_1 = new ModelRenderer( this, 4, 48 );
        Bande_acroche_1.setTextureSize( 1024, 1024 );
        Bande_acroche_1.addBox( -9F, -0.5F, -0.5F, 18, 1, 1);
        Bande_acroche_1.setRotationPoint( 22F, 21F, 0F );
        Block_acroche_4 = new ModelRenderer( this, 10, 4 );
        Block_acroche_4.setTextureSize( 1024, 1024 );
        Block_acroche_4.addBox( -0.5F, -2.5F, -0.5F, 1, 5, 1);
        Block_acroche_4.setRotationPoint( 24F, 22F, 0F );
        roue_2_2 = new ModelRenderer( this, 136, 82 );
        roue_2_2.setTextureSize( 1024, 1024 );
        roue_2_2.addBox( -0.5F, -2F, -1F, 1, 4, 2);
        roue_2_2.setRotationPoint( -9F, 22F, 8F );
        bande_4 = new ModelRenderer( this, 46, 114 );
        bande_4.setTextureSize( 1024, 1024 );
        bande_4.addBox( -8F, -0.5F, -0.5F, 16, 1, 1);
        bande_4.setRotationPoint( -16F, 21.5F, 0F );
        roue_2 = new ModelRenderer( this, 163, 25 );
        roue_2.setTextureSize( 1024, 1024 );
        roue_2.addBox( -2.5F, -2.5F, -1F, 5, 5, 2);
        roue_2.setRotationPoint( -6F, 22F, 8F );
        roue_1 = new ModelRenderer( this, 132, 28 );
        roue_1.setTextureSize( 1024, 1024 );
        roue_1.addBox( -2.5F, -2.5F, -1F, 5, 5, 2);
        roue_1.setRotationPoint( -6F, 22F, -8F );
        roue_1_2 = new ModelRenderer( this, 164, 47 );
        roue_1_2.setTextureSize( 1024, 1024 );
        roue_1_2.addBox( -0.5F, -2F, -1F, 1, 4, 2);
        roue_1_2.setRotationPoint( -3F, 22F, -8F );
        roue_1_1 = new ModelRenderer( this, 136, 52 );
        roue_1_1.setTextureSize( 1024, 1024 );
        roue_1_1.addBox( -0.5F, -2F, -1F, 1, 4, 2);
        roue_1_1.setRotationPoint( -9F, 22F, -8F );
        bande_2 = new ModelRenderer( this, 38, 129 );
        bande_2.setTextureSize( 1024, 1024 );
        bande_2.addBox( -16F, -0.5F, -0.5F, 32, 1, 1);
        bande_2.setRotationPoint( 0F, 21.5F, 8F );
        Block_Principal = new ModelRenderer( this, 22, 156 );
        Block_Principal.setTextureSize( 1024, 1024 );
        Block_Principal.addBox( -16F, -8F, -8F, 32, 16, 16);
        Block_Principal.setRotationPoint( 0F, 14F, 0F );
        Block_2_2 = new ModelRenderer( this, 47, 273 );
        Block_2_2.setTextureSize( 1024, 1024 );
        Block_2_2.addBox( -4F, -3.5F, -1.5F, 8, 7, 3);
        Block_2_2.setRotationPoint( -6F, 19F, 8F );
        bande_3 = new ModelRenderer( this, 46, 123 );
        bande_3.setTextureSize( 1024, 1024 );
        bande_3.addBox( -8F, -0.5F, -0.5F, 16, 1, 1);
        bande_3.setRotationPoint( 16F, 21.5F, 0F );
        bande_1 = new ModelRenderer( this, 35, 99 );
        bande_1.setTextureSize( 1024, 1024 );
        bande_1.addBox( -16F, -0.5F, -0.5F, 32, 1, 1);
        bande_1.setRotationPoint( 0F, 21.5F, -8F );
        Block_2 = new ModelRenderer( this, 56, 221 );
        Block_2.setTextureSize( 1024, 1024 );
        Block_2.addBox( -4F, -3.5F, -1.5F, 8, 7, 3);
        Block_2.setRotationPoint( -6F, 19F, -8F );
        roue_2_3 = new ModelRenderer( this, 164, 77 );
        roue_2_3.setTextureSize( 1024, 1024 );
        roue_2_3.addBox( -0.5F, -2F, -1F, 1, 4, 2);
        roue_2_3.setRotationPoint( -3F, 22F, 8F );
        Block_poign__placard = new ModelRenderer( this, 19, 78 );
        Block_poign__placard.setTextureSize( 1024, 1024 );
        Block_poign__placard.addBox( -0.5F, -1.5F, -0.5F, 1, 3, 1);
        Block_poign__placard.setRotationPoint( 0F, 13F, 8.5F );
        Bande_acroche_2 = new ModelRenderer( this, 5, 32 );
        Bande_acroche_2.setTextureSize( 1024, 1024 );
        Bande_acroche_2.addBox( -6F, -0.5F, -0.5F, 12, 1, 1);
        Bande_acroche_2.setRotationPoint( 20F, 21F, -4F );
    }

   public void renderAll()
   {
        sel.rotateAngleX = 0F;
        sel.rotateAngleY = 0F;
        sel.rotateAngleZ = 0F;
        sel.renderWithRotation(0.0625F);

        Block_coffre.rotateAngleX = 0F;
        Block_coffre.rotateAngleY = 0F;
        Block_coffre.rotateAngleZ = 0F;
        Block_coffre.renderWithRotation(0.0625F);

        Block_imatricule.rotateAngleX = 0F;
        Block_imatricule.rotateAngleY = 0F;
        Block_imatricule.rotateAngleZ = 0F;
        Block_imatricule.renderWithRotation(0.0625F);

        Block_far_2.rotateAngleX = 0F;
        Block_far_2.rotateAngleY = 0F;
        Block_far_2.rotateAngleZ = 0F;
        Block_far_2.renderWithRotation(0.0625F);

        Block_far.rotateAngleX = 0F;
        Block_far.rotateAngleY = 0F;
        Block_far.rotateAngleZ = 0F;
        Block_far.renderWithRotation(0.0625F);

        Block_pencarte.rotateAngleX = 0F;
        Block_pencarte.rotateAngleY = 0F;
        Block_pencarte.rotateAngleZ = 0F;
        Block_pencarte.renderWithRotation(0.0625F);

        poivre.rotateAngleX = 0F;
        poivre.rotateAngleY = 0F;
        poivre.rotateAngleZ = 0F;
        poivre.renderWithRotation(0.0625F);

        cannette_2.rotateAngleX = 0F;
        cannette_2.rotateAngleY = 0F;
        cannette_2.rotateAngleZ = 0F;
        cannette_2.renderWithRotation(0.0625F);

        cannette_1.rotateAngleX = 0F;
        cannette_1.rotateAngleY = 0F;
        cannette_1.rotateAngleZ = 0F;
        cannette_1.renderWithRotation(0.0625F);

        Block_saucisse_2.rotateAngleX = 0F;
        Block_saucisse_2.rotateAngleY = 0F;
        Block_saucisse_2.rotateAngleZ = 0F;
        Block_saucisse_2.renderWithRotation(0.0625F);

        Block_pignier_saucisse.rotateAngleX = 0F;
        Block_pignier_saucisse.rotateAngleY = 0F;
        Block_pignier_saucisse.rotateAngleZ = 0F;
        Block_pignier_saucisse.renderWithRotation(0.0625F);

        Block_pignier_saucisse_2.rotateAngleX = 0F;
        Block_pignier_saucisse_2.rotateAngleY = 0F;
        Block_pignier_saucisse_2.rotateAngleZ = 0F;
        Block_pignier_saucisse_2.renderWithRotation(0.0625F);

        Block_saucisse.rotateAngleX = 0F;
        Block_saucisse.rotateAngleY = 0F;
        Block_saucisse.rotateAngleZ = 0F;
        Block_saucisse.renderWithRotation(0.0625F);

        Block_stand3.rotateAngleX = 0F;
        Block_stand3.rotateAngleY = 0F;
        Block_stand3.rotateAngleZ = 0F;
        Block_stand3.renderWithRotation(0.0625F);

        Block_stand2.rotateAngleX = 0F;
        Block_stand2.rotateAngleY = 0F;
        Block_stand2.rotateAngleZ = 0F;
        Block_stand2.renderWithRotation(0.0625F);

        Block_placard.rotateAngleX = 0F;
        Block_placard.rotateAngleY = 0F;
        Block_placard.rotateAngleZ = 0F;
        Block_placard.renderWithRotation(0.0625F);

        Block_stand1.rotateAngleX = 0F;
        Block_stand1.rotateAngleY = 0F;
        Block_stand1.rotateAngleZ = 0F;
        Block_stand1.renderWithRotation(0.0625F);

        Bande_acroche_3.rotateAngleX = 0F;
        Bande_acroche_3.rotateAngleY = 0.6380924F;
        Bande_acroche_3.rotateAngleZ = 0F;
        Bande_acroche_3.renderWithRotation(0.0625F);

        Bande_acroche_1.rotateAngleX = 0F;
        Bande_acroche_1.rotateAngleY = 0F;
        Bande_acroche_1.rotateAngleZ = 0F;
        Bande_acroche_1.renderWithRotation(0.0625F);

        Block_acroche_4.rotateAngleX = 0F;
        Block_acroche_4.rotateAngleY = 0F;
        Block_acroche_4.rotateAngleZ = 0F;
        Block_acroche_4.renderWithRotation(0.0625F);

        roue_2_2.rotateAngleX = 0F;
        roue_2_2.rotateAngleY = 0F;
        roue_2_2.rotateAngleZ = 0F;
        roue_2_2.renderWithRotation(0.0625F);

        bande_4.rotateAngleX = 0F;
        bande_4.rotateAngleY = 1.570796F;
        bande_4.rotateAngleZ = 0F;
        bande_4.renderWithRotation(0.0625F);

        roue_2.rotateAngleX = 0F;
        roue_2.rotateAngleY = 0F;
        roue_2.rotateAngleZ = 0F;
        roue_2.renderWithRotation(0.0625F);

        roue_1.rotateAngleX = 0F;
        roue_1.rotateAngleY = 0F;
        roue_1.rotateAngleZ = 0F;
        roue_1.renderWithRotation(0.0625F);

        roue_1_2.rotateAngleX = 0F;
        roue_1_2.rotateAngleY = 0F;
        roue_1_2.rotateAngleZ = 0F;
        roue_1_2.renderWithRotation(0.0625F);

        roue_1_1.rotateAngleX = 0F;
        roue_1_1.rotateAngleY = 0F;
        roue_1_1.rotateAngleZ = 0F;
        roue_1_1.renderWithRotation(0.0625F);

        bande_2.rotateAngleX = 0F;
        bande_2.rotateAngleY = 0F;
        bande_2.rotateAngleZ = 0F;
        bande_2.renderWithRotation(0.0625F);

        Block_Principal.rotateAngleX = 0F;
        Block_Principal.rotateAngleY = 0F;
        Block_Principal.rotateAngleZ = 0F;
        Block_Principal.renderWithRotation(0.0625F);

        Block_2_2.rotateAngleX = 0F;
        Block_2_2.rotateAngleY = 0F;
        Block_2_2.rotateAngleZ = 0F;
        Block_2_2.renderWithRotation(0.0625F);

        bande_3.rotateAngleX = 0F;
        bande_3.rotateAngleY = 1.570796F;
        bande_3.rotateAngleZ = 0F;
        bande_3.renderWithRotation(0.0625F);

        bande_1.rotateAngleX = 0F;
        bande_1.rotateAngleY = 0F;
        bande_1.rotateAngleZ = 0F;
        bande_1.renderWithRotation(0.0625F);

        Block_2.rotateAngleX = 0F;
        Block_2.rotateAngleY = 0F;
        Block_2.rotateAngleZ = 0F;
        Block_2.renderWithRotation(0.0625F);

        roue_2_3.rotateAngleX = 0F;
        roue_2_3.rotateAngleY = 0F;
        roue_2_3.rotateAngleZ = 0F;
        roue_2_3.renderWithRotation(0.0625F);

        Block_poign__placard.rotateAngleX = 0F;
        Block_poign__placard.rotateAngleY = 0F;
        Block_poign__placard.rotateAngleZ = 0F;
        Block_poign__placard.renderWithRotation(0.0625F);

        Bande_acroche_2.rotateAngleX = 0F;
        Bande_acroche_2.rotateAngleY = -0.6380473F;
        Bande_acroche_2.rotateAngleZ = 0F;
        Bande_acroche_2.renderWithRotation(0.0625F);

    }

}
