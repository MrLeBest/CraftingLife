package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPerce extends ModelBase
{
    ModelRenderer Block_base_1;
    ModelRenderer Blockbase2;
    ModelRenderer Blockbase3;
    ModelRenderer Block_base_4;
    ModelRenderer Block_base_5;
    ModelRenderer Block_perce1;
    ModelRenderer Block_perce2;
    ModelRenderer Block_perce3;
    ModelRenderer Block_perce4;
    ModelRenderer Block_perce5;
    ModelRenderer Block_perce6;
    ModelRenderer Blockbase6;
    ModelRenderer Blocksoutien1;
    ModelRenderer Blocksoutien2;
    ModelRenderer Blockordinateur1;
    ModelRenderer cable1;
    ModelRenderer Blockordinateur2;
    ModelRenderer Blockordinateur3;
    ModelRenderer Blockordinateur4;
    ModelRenderer Blockordinateur5;
    ModelRenderer Blockordinateur6;
    ModelRenderer Blockordinateur10;
    ModelRenderer Blockordinateur7;
    ModelRenderer Blocktige1;
    ModelRenderer Blocktige;
    ModelRenderer Blockbase20;

    public ModelPerce()
    {
        this( 0.0f );
    }

    public ModelPerce( float par1 )
    {
        Block_base_1 = new ModelRenderer( this, 2, 38 );
        Block_base_1.setTextureSize( 1024, 512 );
        Block_base_1.addBox( -8F, -1F, -8F, 16, 2, 16);
        Block_base_1.setRotationPoint( 0F, 23F, 0F );
        Blockbase2 = new ModelRenderer( this, 10, 35 );
        Blockbase2.setTextureSize( 1024, 512 );
        Blockbase2.addBox( -1F, -8F, -0.5F, 2, 16, 1);
        Blockbase2.setRotationPoint( -6F, 16F, 2F );
        Blockbase3 = new ModelRenderer( this, 3, 35 );
        Blockbase3.setTextureSize( 1024, 512 );
        Blockbase3.addBox( -1F, -8F, -0.5F, 2, 16, 1);
        Blockbase3.setRotationPoint( 6F, 16F, 2F );
        Block_base_4 = new ModelRenderer( this, 6, 61 );
        Block_base_4.setTextureSize( 1024, 512 );
        Block_base_4.addBox( -8F, -0.5F, -1.5F, 16, 1, 3);
        Block_base_4.setRotationPoint( 0F, 10F, -4F );
        Block_base_5 = new ModelRenderer( this, 1, 74 );
        Block_base_5.setTextureSize( 1024, 512 );
        Block_base_5.addBox( -2F, -0.5F, -10F, 4, 1, 20);
        Block_base_5.setRotationPoint( 0F, 10F, -2F );
        Block_perce1 = new ModelRenderer( this, 13, 107 );
        Block_perce1.setTextureSize( 1024, 512 );
        Block_perce1.addBox( -1.5F, -0.5F, -2F, 3, 1, 4);
        Block_perce1.setRotationPoint( 0F, 9F, -8F );
        Block_perce2 = new ModelRenderer( this, 9, 131 );
        Block_perce2.setTextureSize( 1024, 512 );
        Block_perce2.addBox( -2F, -2F, -6F, 4, 4, 12);
        Block_perce2.setRotationPoint( 0F, 6F, -8F );
        Block_perce3 = new ModelRenderer( this, 42, 1 );
        Block_perce3.setTextureSize( 1024, 512 );
        Block_perce3.addBox( -0.5F, -1.5F, -6F, 1, 3, 12);
        Block_perce3.setRotationPoint( 2F, 6F, -7F );
        Block_perce4 = new ModelRenderer( this, 67, 1 );
        Block_perce4.setTextureSize( 1024, 512 );
        Block_perce4.addBox( -0.5F, -1.5F, -6F, 1, 3, 12);
        Block_perce4.setRotationPoint( -2F, 6F, -7F );
        Block_perce5 = new ModelRenderer( this, 57, 16 );
        Block_perce5.setTextureSize( 1024, 512 );
        Block_perce5.addBox( -1.5F, -0.5F, -6F, 3, 1, 12);
        Block_perce5.setRotationPoint( 0F, 4F, -7F );
        Block_perce6 = new ModelRenderer( this, 41, 13 );
        Block_perce6.setTextureSize( 1024, 512 );
        Block_perce6.addBox( -1.5F, -0.5F, -6F, 3, 1, 12);
        Block_perce6.setRotationPoint( 0F, 8F, -7F );
        Blockbase6 = new ModelRenderer( this, 53, 67 );
        Blockbase6.setTextureSize( 1024, 512 );
        Blockbase6.addBox( -1F, -8F, -0.5F, 2, 16, 1);
        Blockbase6.setRotationPoint( 0F, 16F, -5F );
        Blocksoutien1 = new ModelRenderer( this, 68, 78 );
        Blocksoutien1.setTextureSize( 1024, 512 );
        Blocksoutien1.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        Blocksoutien1.setRotationPoint( -3F, 8F, -4F );
        Blocksoutien2 = new ModelRenderer( this, 110, 135 );
        Blocksoutien2.setTextureSize( 1024, 512 );
        Blocksoutien2.addBox( -0.5F, -2F, -0.5F, 1, 4, 1);
        Blocksoutien2.setRotationPoint( 3F, 8F, -4F );
        Blockordinateur1 = new ModelRenderer( this, 79, 183 );
        Blockordinateur1.setTextureSize( 1024, 512 );
        Blockordinateur1.addBox( -3F, -3F, -3.5F, 6, 6, 7);
        Blockordinateur1.setRotationPoint( -12F, 21F, -3F );
        cable1 = new ModelRenderer( this, 78, 154 );
        cable1.setTextureSize( 1024, 512 );
        cable1.addBox( -1.5F, -0.5F, -0.5F, 3, 1, 1);
        cable1.setRotationPoint( -8F, 23F, -2F );
        Blockordinateur2 = new ModelRenderer( this, 107, 157 );
        Blockordinateur2.setTextureSize( 1024, 512 );
        Blockordinateur2.addBox( -2.5F, -2F, -0.5F, 5, 4, 1);
        Blockordinateur2.setRotationPoint( -12F, 17F, -5F );
        Blockordinateur3 = new ModelRenderer( this, 10, 184 );
        Blockordinateur3.setTextureSize( 1024, 512 );
        Blockordinateur3.addBox( -0.5F, -2.5F, -2.5F, 1, 5, 5);
        Blockordinateur3.setRotationPoint( -14.8F, 21F, -3F );
        Blockordinateur4 = new ModelRenderer( this, 54, 113 );
        Blockordinateur4.setTextureSize( 1024, 512 );
        Blockordinateur4.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        Blockordinateur4.setRotationPoint( -10F, 19F, -6.2F );
        Blockordinateur5 = new ModelRenderer( this, 63, 107 );
        Blockordinateur5.setTextureSize( 1024, 512 );
        Blockordinateur5.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        Blockordinateur5.setRotationPoint( -11.5F, 19F, -6.2F );
        Blockordinateur6 = new ModelRenderer( this, 15, 15 );
        Blockordinateur6.setTextureSize( 1024, 512 );
        Blockordinateur6.addBox( -2.5F, -1.5F, -0.5F, 5, 3, 1);
        Blockordinateur6.setRotationPoint( -12F, 22F, -6.2F );
        Blockordinateur10 = new ModelRenderer( this, 54, 113 );
        Blockordinateur10.setTextureSize( 1024, 512 );
        Blockordinateur10.addBox( -0.5F, -0.5F, -0.5F, 1, 1, 1);
        Blockordinateur10.setRotationPoint( 1F, 5F, -14F );
        Blockordinateur7 = new ModelRenderer( this, 15, 15 );
        Blockordinateur7.setTextureSize( 1024, 512 );
        Blockordinateur7.addBox( -1.5F, -0.5F, -0.5F, 3, 1, 1);
        Blockordinateur7.setRotationPoint( -13F, 20.5F, -6.2F );
        Blocktige1 = new ModelRenderer( this, 125, 98 );
        Blocktige1.setTextureSize( 1024, 512 );
        Blocktige1.addBox( -1F, -1F, -0.5F, 2, 2, 1);
        Blocktige1.setRotationPoint( 0F, 6F, -1F );
        Blocktige = new ModelRenderer( this, 103, 69 );
        Blocktige.setTextureSize( 1024, 512 );
        Blocktige.addBox( -0.5F, -0.5F, -8F, 1, 1, 16);
        Blocktige.setRotationPoint( 0F, 6F, 7F );
        Blockbase20 = new ModelRenderer( this, 53, 67 );
        Blockbase20.setTextureSize( 1024, 512 );
        Blockbase20.addBox( -1F, -8F, -0.5F, 2, 16, 1);
        Blockbase20.setRotationPoint( 0F, 16F, -2F );
    }

   public void renderAll()
   {
        Block_base_1.rotateAngleX = 0F;
        Block_base_1.rotateAngleY = 0F;
        Block_base_1.rotateAngleZ = 0F;
        Block_base_1.renderWithRotation(0.0625F);

        Blockbase2.rotateAngleX = 0.6622648F;
        Blockbase2.rotateAngleY = 0F;
        Blockbase2.rotateAngleZ = 0F;
        Blockbase2.renderWithRotation(0.0625F);

        Blockbase3.rotateAngleX = 0.6622648F;
        Blockbase3.rotateAngleY = 0F;
        Blockbase3.rotateAngleZ = 0F;
        Blockbase3.renderWithRotation(0.0625F);

        Block_base_4.rotateAngleX = 0F;
        Block_base_4.rotateAngleY = 0F;
        Block_base_4.rotateAngleZ = 0F;
        Block_base_4.renderWithRotation(0.0625F);

        Block_base_5.rotateAngleX = 0F;
        Block_base_5.rotateAngleY = 0F;
        Block_base_5.rotateAngleZ = 0F;
        Block_base_5.renderWithRotation(0.0625F);

        Block_perce1.rotateAngleX = 0F;
        Block_perce1.rotateAngleY = 0F;
        Block_perce1.rotateAngleZ = 0F;
        Block_perce1.renderWithRotation(0.0625F);

        Block_perce2.rotateAngleX = 0F;
        Block_perce2.rotateAngleY = 0F;
        Block_perce2.rotateAngleZ = 0F;
        Block_perce2.renderWithRotation(0.0625F);

        Block_perce3.rotateAngleX = 0F;
        Block_perce3.rotateAngleY = 0F;
        Block_perce3.rotateAngleZ = 0F;
        Block_perce3.renderWithRotation(0.0625F);

        Block_perce4.rotateAngleX = 0F;
        Block_perce4.rotateAngleY = 0F;
        Block_perce4.rotateAngleZ = 0F;
        Block_perce4.renderWithRotation(0.0625F);

        Block_perce5.rotateAngleX = 0F;
        Block_perce5.rotateAngleY = 0F;
        Block_perce5.rotateAngleZ = 0F;
        Block_perce5.renderWithRotation(0.0625F);

        Block_perce6.rotateAngleX = 0F;
        Block_perce6.rotateAngleY = 0F;
        Block_perce6.rotateAngleZ = 0F;
        Block_perce6.renderWithRotation(0.0625F);

        Blockbase6.rotateAngleX = 0.6622648F;
        Blockbase6.rotateAngleY = 0F;
        Blockbase6.rotateAngleZ = 0F;
        Blockbase6.renderWithRotation(0.0625F);

        Blocksoutien1.rotateAngleX = 0F;
        Blocksoutien1.rotateAngleY = 0F;
        Blocksoutien1.rotateAngleZ = 0F;
        Blocksoutien1.renderWithRotation(0.0625F);

        Blocksoutien2.rotateAngleX = 0F;
        Blocksoutien2.rotateAngleY = 0F;
        Blocksoutien2.rotateAngleZ = 0F;
        Blocksoutien2.renderWithRotation(0.0625F);

        Blockordinateur1.rotateAngleX = 0F;
        Blockordinateur1.rotateAngleY = 0F;
        Blockordinateur1.rotateAngleZ = 0F;
        Blockordinateur1.renderWithRotation(0.0625F);

        cable1.rotateAngleX = 0F;
        cable1.rotateAngleY = 0F;
        cable1.rotateAngleZ = 0F;
        cable1.renderWithRotation(0.0625F);

        Blockordinateur2.rotateAngleX = -0.3379304F;
        Blockordinateur2.rotateAngleY = 0F;
        Blockordinateur2.rotateAngleZ = 0F;
        Blockordinateur2.renderWithRotation(0.0625F);

        Blockordinateur3.rotateAngleX = 0F;
        Blockordinateur3.rotateAngleY = 0F;
        Blockordinateur3.rotateAngleZ = 0F;
        Blockordinateur3.renderWithRotation(0.0625F);

        Blockordinateur4.rotateAngleX = 0F;
        Blockordinateur4.rotateAngleY = 0F;
        Blockordinateur4.rotateAngleZ = 0F;
        Blockordinateur4.renderWithRotation(0.0625F);

        Blockordinateur5.rotateAngleX = 0F;
        Blockordinateur5.rotateAngleY = 0F;
        Blockordinateur5.rotateAngleZ = 0F;
        Blockordinateur5.renderWithRotation(0.0625F);

        Blockordinateur6.rotateAngleX = 0F;
        Blockordinateur6.rotateAngleY = 0F;
        Blockordinateur6.rotateAngleZ = 0F;
        Blockordinateur6.renderWithRotation(0.0625F);

        Blockordinateur10.rotateAngleX = 0F;
        Blockordinateur10.rotateAngleY = 0F;
        Blockordinateur10.rotateAngleZ = 0F;
        Blockordinateur10.renderWithRotation(0.0625F);

        Blockordinateur7.rotateAngleX = 0F;
        Blockordinateur7.rotateAngleY = 0F;
        Blockordinateur7.rotateAngleZ = 0F;
        Blockordinateur7.renderWithRotation(0.0625F);

        Blocktige1.rotateAngleX = 0F;
        Blocktige1.rotateAngleY = 0F;
        Blocktige1.rotateAngleZ = 0F;
        Blocktige1.renderWithRotation(0.0625F);

        Blocktige.rotateAngleX = 0F;
        Blocktige.rotateAngleY = 0F;
        Blocktige.rotateAngleZ = 0F;
        Blocktige.renderWithRotation(0.0625F);

        Blockbase20.rotateAngleX = -0.6890476F;
        Blockbase20.rotateAngleY = 0F;
        Blockbase20.rotateAngleZ = 0F;
        Blockbase20.renderWithRotation(0.0625F);

    }

}
