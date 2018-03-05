package fr.mrlebest.craftingmod.renderer;

import java.awt.Color;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import fr.aymericred.newinventory.client.ClientEventHandler;
import fr.mrlebest.craftingmod.common.entity.EntityItem;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

public class RenderItem extends Render
{
    
    private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private static final ItemRenderer renderItem = new ItemRenderer(Minecraft.getMinecraft());
    private static final RenderBlocks renderBlocksIr = new RenderBlocks();
    public static EntityItem hoveredEntity;
    
    @Override
    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        ItemStack s = ((EntityItem)entity).getEntityItem();
        if(s != null)
        {

            double adjustY = ((double)((EntityItem)entity).getRandomRotation())/1800;
            
            GL11.glPushMatrix();
            GL11.glTranslated(x, (double) (y+0.035D-adjustY), z);
            GL11.glRotated(2*((EntityItem)entity).getRandomRotation(), 0, 1, 0);
            GL11.glRotated(90, 1, 0, 0);
            GL11.glScaled(0.60, 0.60, 0.60);
            renderItem(s, hoveredEntity==entity?Color.GREEN.getRGB():-1);
            GL11.glPopMatrix();
            
            renderName((EntityItem) entity, x, y, z);
            
        }
    }
    @Override
    protected ResourceLocation getEntityTexture(Entity entity) 
    {
        return TextureMap.locationBlocksTexture;
    }
    protected void renderName(EntityItem entity, double x, double y, double z) {
       // System.out.println(hoveredEntity);
        if(entity == hoveredEntity) {
            //System.out.println("Test2");
            func_147906_a(entity, entity.getEntityItem().getDisplayName(), x, y, z, 10);
        }
    }
    private void renderItem(ItemStack itemstack, int color)
    {
        int pass = 0;
        
        GL11.glPushMatrix();
        TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
        Item item = itemstack.getItem();
        Block block = Block.getBlockFromItem(item);

        if (itemstack != null && block != null && block.getRenderBlockPass() != 0)
        {
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_CULL_FACE);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        }
        if (itemstack.getItemSpriteNumber() == 0 && item instanceof ItemBlock && RenderBlocks.renderItemIn3d(block.getRenderType()))
        {
            texturemanager.bindTexture(texturemanager.getResourceLocation(0));

            if (itemstack != null && block != null && block.getRenderBlockPass() != 0)
            {
                GL11.glDepthMask(false);
                renderBlocksIr.renderBlockAsItem(block, itemstack.getItemDamage(), 1.0F);
                GL11.glDepthMask(true);
            }
            else
            {
                renderBlocksIr.renderBlockAsItem(block, itemstack.getItemDamage(), 1.0F);
            }
        }
        else
        {
            IIcon iicon = itemstack.getItem().requiresMultipleRenderPasses() ? itemstack.getItem().getIconFromDamageForRenderPass(itemstack.getItemDamage(), pass) : itemstack.getIconIndex();

            if (iicon == null)
            {
                GL11.glPopMatrix();
                return;
            }

            texturemanager.bindTexture(texturemanager.getResourceLocation(itemstack.getItemSpriteNumber()));
            TextureUtil.func_152777_a(false, false, 1.0F);
            Tessellator tessellator = Tessellator.instance;
            float f = iicon.getMinU();
            float f1 = iicon.getMaxU();
            float f2 = iicon.getMinV();
            float f3 = iicon.getMaxV();
            float f4 = 0.0F;
            float f5 = 0.3F;
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glTranslatef(-f4, -f5, 0.0F);
            //float f6 = 1.5F;
            //GL11.glScalef(f6, f6, f6);
            //GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
            //GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
            renderItem.renderItemIn2D(tessellator, f1, f2, f, f3, iicon.getIconWidth(), iicon.getIconHeight(), 0.0625F);

            if (itemstack.hasEffect(pass))
            {
                GL11.glDepthFunc(GL11.GL_EQUAL);
                GL11.glDisable(GL11.GL_LIGHTING);
                texturemanager.bindTexture(RES_ITEM_GLINT);
                GL11.glEnable(GL11.GL_BLEND);
                OpenGlHelper.glBlendFunc(768, 1, 1, 0);
                float f7 = 0.76F;
                GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
                GL11.glMatrixMode(GL11.GL_TEXTURE);
                GL11.glPushMatrix();
                float f8 = 0.125F;
                GL11.glScalef(f8, f8, f8);
                float f9 = (float)(Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
                GL11.glTranslatef(f9, 0.0F, 0.0F);
                GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
                renderItem.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef(f8, f8, f8);
                f9 = (float)(Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
                GL11.glTranslatef(-f9, 0.0F, 0.0F);
                GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
                renderItem.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
                GL11.glPopMatrix();
                GL11.glMatrixMode(GL11.GL_MODELVIEW);
                GL11.glDisable(GL11.GL_BLEND);
                GL11.glEnable(GL11.GL_LIGHTING);
                GL11.glDepthFunc(GL11.GL_LEQUAL);
            }

            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            texturemanager.bindTexture(texturemanager.getResourceLocation(itemstack.getItemSpriteNumber()));
            TextureUtil.func_147945_b();
        }

        if (itemstack != null && block != null && block.getRenderBlockPass() != 0)
        {
            GL11.glDisable(GL11.GL_BLEND);
        }

        GL11.glPopMatrix();
    }

}
