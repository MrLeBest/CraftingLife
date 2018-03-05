package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCamera extends ModelBase
{
    ModelRenderer Block6;
    ModelRenderer trepieds2;
    ModelRenderer trepieds1;
    ModelRenderer BOuton_3;
    ModelRenderer BOuton_2;
    ModelRenderer BOuton;
    ModelRenderer micro_3;
    ModelRenderer micro_2;
    ModelRenderer micro_1;
    ModelRenderer Objectif;
    ModelRenderer Objectif_2;
    ModelRenderer Block3;
    ModelRenderer Block;
    ModelRenderer Block2;
    ModelRenderer trepieds3;
    ModelRenderer Poignier_1;
    ModelRenderer Poignier_2;
    ModelRenderer retour_1;
    ModelRenderer retour_2;

    public ModelCamera()
    {
        this( 0.0f );
    }

    public ModelCamera( float par1 )
    {
        Block6 = new ModelRenderer( this, 9, 155 );
        Block6.setTextureSize( 256, 256 );
        Block6.addBox( -1F, -0.5F, -4.5F, 2, 1, 9);
        Block6.setRotationPoint( -1F, 5F, 8F );
        trepieds2 = new ModelRenderer( this, 15, 15 );
        trepieds2.setTextureSize( 256, 256 );
        trepieds2.addBox( -0.5F, -11.5F, -0.5F, 1, 23, 1);
        trepieds2.setRotationPoint( 1F, 13F, 7F );
        trepieds1 = new ModelRenderer( this, 15, 15 );
        trepieds1.setTextureSize( 256, 256 );
        trepieds1.addBox( -0.5F, -11.5F, -0.5F, 1, 23, 1);
        trepieds1.setRotationPoint( -3F, 13F, 7F );
        BOuton_3 = new ModelRenderer( this, 9, 43 );
        BOuton_3.setTextureSize( 256, 256 );
        BOuton_3.addBox( -1.5F, -2F, -0.5F, 3, 4, 1);
        BOuton_3.setRotationPoint( 0F, 2F, 13.7F );
        BOuton_2 = new ModelRenderer( this, 8, 39 );
        BOuton_2.setTextureSize( 256, 256 );
        BOuton_2.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        BOuton_2.setRotationPoint( -3F, 2F, 13.7F );
        BOuton = new ModelRenderer( this, 8, 36 );
        BOuton.setTextureSize( 256, 256 );
        BOuton.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        BOuton.setRotationPoint( -3F, 0F, 14F );
        micro_3 = new ModelRenderer( this, 5, 6 );
        micro_3.setTextureSize( 256, 256 );
        micro_3.addBox( -0.5F, -0.5F, -1F, 1, 1, 2);
        micro_3.setRotationPoint( -3.5F, -1F, 6.5F );
        micro_2 = new ModelRenderer( this, 36, 10 );
        micro_2.setTextureSize( 256, 256 );
        micro_2.addBox( -0.5F, -0.5F, -2F, 1, 1, 4);
        micro_2.setRotationPoint( -3.5F, -1.900002F, 4F );
        micro_1 = new ModelRenderer( this, 23, 11 );
        micro_1.setTextureSize( 256, 256 );
        micro_1.addBox( -1F, -0.5F, -1F, 2, 1, 2);
        micro_1.setRotationPoint( -3.5F, -1F, 7F );
        Objectif = new ModelRenderer( this, 24, 71 );
        Objectif.setTextureSize( 256, 256 );
        Objectif.addBox( -2F, -2F, -2F, 4, 4, 4);
        Objectif.setRotationPoint( -1F, 2F, 1F );
        Objectif_2 = new ModelRenderer( this, 26, 60 );
        Objectif_2.setTextureSize( 256, 256 );
        Objectif_2.addBox( -3F, -2.5F, -0.5F, 6, 5, 1);
        Objectif_2.setRotationPoint( -1F, 2F, -1F );
        Block3 = new ModelRenderer( this, 17, 114 );
        Block3.setTextureSize( 256, 256 );
        Block3.addBox( -0.5F, -2.5F, -5.5F, 1, 5, 11);
        Block3.setRotationPoint( -4F, 2F, 8F );
        Block = new ModelRenderer( this, 10, 88 );
        Block.setTextureSize( 256, 256 );
        Block.addBox( -3F, -3F, -6F, 6, 6, 12);
        Block.setRotationPoint( -1F, 2F, 8F );
        Block2 = new ModelRenderer( this, 43, 80 );
        Block2.setTextureSize( 256, 256 );
        Block2.addBox( -0.5F, -2.5F, -5.5F, 1, 5, 11);
        Block2.setRotationPoint( 2F, 2F, 8F );
        trepieds3 = new ModelRenderer( this, 15, 15 );
        trepieds3.setTextureSize( 256, 256 );
        trepieds3.addBox( -0.5F, -11.5F, -0.5F, 1, 23, 1);
        trepieds3.setRotationPoint( -1F, 13F, 4F );
        Poignier_1 = new ModelRenderer( this, 28, 41 );
        Poignier_1.setTextureSize( 256, 256 );
        Poignier_1.addBox( -0.5F, -0.5F, -2F, 1, 1, 4);
        Poignier_1.setRotationPoint( -1F, -1F, 5F );
        Poignier_2 = new ModelRenderer( this, 25, 24 );
        Poignier_2.setTextureSize( 256, 256 );
        Poignier_2.addBox( -0.5F, -0.5F, -2.5F, 1, 1, 5);
        Poignier_2.setRotationPoint( -1F, -1.852516F, 8.989138F );
        retour_1 = new ModelRenderer( this, 8, 28 );
        retour_1.setTextureSize( 256, 256 );
        retour_1.addBox( -0.5F, -1F, -0.5F, 1, 2, 1);
        retour_1.setRotationPoint( 2.5F, 2F, 6F );
        retour_2 = new ModelRenderer( this, 6, 14 );
        retour_2.setTextureSize( 256, 256 );
        retour_2.addBox( -2F, -1.5F, -0.5F, 4, 3, 1);
        retour_2.setRotationPoint( 5F, 2F, 6F );
    }

   public void renderAll()
   {
        Block6.rotateAngleX = 0F;
        Block6.rotateAngleY = 0F;
        Block6.rotateAngleZ = 0F;
        Block6.renderWithRotation(0.0625F);

        trepieds2.rotateAngleX = 0.1540142F;
        trepieds2.rotateAngleY = -0.0331741F;
        trepieds2.rotateAngleZ = -0.2130466F;
        trepieds2.renderWithRotation(0.0625F);

        trepieds1.rotateAngleX = 0.1079377F;
        trepieds1.rotateAngleY = 0.02314462F;
        trepieds1.rotateAngleZ = 0.2116623F;
        trepieds1.renderWithRotation(0.0625F);

        BOuton_3.rotateAngleX = 0F;
        BOuton_3.rotateAngleY = 0F;
        BOuton_3.rotateAngleZ = 0F;
        BOuton_3.renderWithRotation(0.0625F);

        BOuton_2.rotateAngleX = 0F;
        BOuton_2.rotateAngleY = 0F;
        BOuton_2.rotateAngleZ = 0F;
        BOuton_2.renderWithRotation(0.0625F);

        BOuton.rotateAngleX = 0F;
        BOuton.rotateAngleY = 0F;
        BOuton.rotateAngleZ = 0F;
        BOuton.renderWithRotation(0.0625F);

        micro_3.rotateAngleX = -1.545731F;
        micro_3.rotateAngleY = -3.141593F;
        micro_3.rotateAngleZ = -3.141593F;
        micro_3.renderWithRotation(0.0625F);

        micro_2.rotateAngleX = 0F;
        micro_2.rotateAngleY = 0F;
        micro_2.rotateAngleZ = 0F;
        micro_2.renderWithRotation(0.0625F);

        micro_1.rotateAngleX = 0F;
        micro_1.rotateAngleY = 0F;
        micro_1.rotateAngleZ = 0F;
        micro_1.renderWithRotation(0.0625F);

        Objectif.rotateAngleX = 0F;
        Objectif.rotateAngleY = 0F;
        Objectif.rotateAngleZ = 0F;
        Objectif.renderWithRotation(0.0625F);

        Objectif_2.rotateAngleX = 0F;
        Objectif_2.rotateAngleY = 0F;
        Objectif_2.rotateAngleZ = 0F;
        Objectif_2.renderWithRotation(0.0625F);

        Block3.rotateAngleX = 0F;
        Block3.rotateAngleY = 0F;
        Block3.rotateAngleZ = 0F;
        Block3.renderWithRotation(0.0625F);

        Block.rotateAngleX = 0F;
        Block.rotateAngleY = 0F;
        Block.rotateAngleZ = 0F;
        Block.renderWithRotation(0.0625F);

        Block2.rotateAngleX = 0F;
        Block2.rotateAngleY = 0F;
        Block2.rotateAngleZ = 0F;
        Block2.renderWithRotation(0.0625F);

        trepieds3.rotateAngleX = -0.2103122F;
        trepieds3.rotateAngleY = 0F;
        trepieds3.rotateAngleZ = 0F;
        trepieds3.renderWithRotation(0.0625F);

        Poignier_1.rotateAngleX = 0.4079376F;
        Poignier_1.rotateAngleY = 0F;
        Poignier_1.rotateAngleZ = 0F;
        Poignier_1.renderWithRotation(0.0625F);

        Poignier_2.rotateAngleX = 0.00667174F;
        Poignier_2.rotateAngleY = 0F;
        Poignier_2.rotateAngleZ = 0F;
        Poignier_2.renderWithRotation(0.0625F);

        retour_1.rotateAngleX = 0F;
        retour_1.rotateAngleY = 0F;
        retour_1.rotateAngleZ = 0F;
        retour_1.renderWithRotation(0.0625F);

        retour_2.rotateAngleX = 0F;
        retour_2.rotateAngleY = 0F;
        retour_2.rotateAngleZ = 0F;
        retour_2.renderWithRotation(0.0625F);

    }

}
