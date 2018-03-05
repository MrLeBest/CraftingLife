package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.mrlebest.craftingmod.block.Blocks;
import fr.mrlebest.craftingmod.proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class TESRInventoryRenderer implements ISimpleBlockRenderingHandler
{

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
    {
        if(block == Blocks.blockFeu && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glRotatef(0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -2.0F, 0.0F);
            TESRFeu.model.render();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockCasier && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.5F, -0.25F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TESRCasier.texture);
            TESRCasier.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockGrapePress && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.5F, -1.2F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TESRGrapePress.texture);
            TESRGrapePress.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockFeuG2 && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glRotatef(0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -2.0F, 0.0F);
            TESRFeuG2.modeli.render();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockCaisse && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityCaisseSpecialRenderer.texture);
            TileEntityCaisseSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockPerceuse && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityPerceuseSpecialRenderer.texture);
            TileEntityPerceuseSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockAeration && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.9F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityAerationSpecialRenderer.texture);
            TileEntityAerationSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockCamera && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityCameraSpecialRenderer.texture);
            TileEntityCameraSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockGarage && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.8, 0.8, 0.8);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityGarageSpecialRenderer.texture);
            TileEntityGarageSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockStand && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.8, 0.8, 0.8);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityStandSpecialRenderer.texture);
            TileEntityStandSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockFoot && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.4, 0.4, 0.4);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-1.5F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityFootSpecialRenderer.texture);
            TileEntityFootSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockCompteur && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.5F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityCompteurSpecialRenderer.texture);
            TileEntityCompteurSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockBarrier && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.8, 0.8, 0.8);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityBarrierSpecialRenderer.texture);
            TileEntityBarrierSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockCafe && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.4, 0.4, 0.4);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, 1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityCafeSpecialRenderer.texture);
            TileEntityCafeSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockEssence && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.6, 0.6, 0.6);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.2F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityEssenceSpecialRenderer.texture);
            TileEntityEssenceSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        if(block == Blocks.blockCoca && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.7, 0.7, 0.7);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -0.5F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityCocaSpecialRenderer.texture);
            TileEntityCocaSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        if(block == Blocks.blockEtalage && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.4, 0.4, 0.4);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityEtalageSpecialRenderer.texture);
            TileEntityEtalageSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockTrash && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.42, 0.42, 0.42);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.5F, 0.0F);
            TileEntityTrashSpecialRenderer.model.render();
            GL11.glPopMatrix();
        }
        
        
        if(block == Blocks.blockFeux && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(0.4, 0.4, 0.4);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.5F, 0.0F);
            TileEntityFeuxSpecialRenderer.model.render();
            GL11.glPopMatrix();
        }
        
        if(block == Blocks.blockGas && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScaled(1.5, 1.5, 1.5);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -0.5F, 0.0F);
            TileEntityGasSpecialRenderer.model.render();
            GL11.glPopMatrix();
        }
        if(block == Blocks.blockPanderie && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -0.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityPanderieSpecialRenderer.texture);
            TileEntityPanderieSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        if(block == Blocks.blockPhone && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScalef(3F, 3F, 3F);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.3F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityPhoneFixSpecialRenderer.texture);
            TileEntityPhoneFixSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        if(block == Blocks.blockBureauD && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.5F, -0.3F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityBureauDSpecialRenderer.texture);
            TileEntityBureauDSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
        if(block == Blocks.blockBouton && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glScalef(3F, 3F, 3F);
            GL11.glRotatef(180F, 90.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.5F, -0.6F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityBoutonSpecialRenderer.texture);
            TileEntityBoutonSpecialRenderer.model.renderAll(false);
            GL11.glPopMatrix();
        }
    }
    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
    {
        return false;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId)
    {
        return true;
    }

    @Override
    public int getRenderId()
    {
        return ClientProxy.tesrRenderId;
    }

}
