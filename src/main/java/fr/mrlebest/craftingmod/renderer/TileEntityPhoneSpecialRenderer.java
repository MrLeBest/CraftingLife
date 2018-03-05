package fr.mrlebest.craftingmod.renderer;

import org.lwjgl.opengl.GL11;

import GLLoader.GLModel;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import fr.mrlebest.craftingmod.glutils.TessellatorModel;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class TileEntityPhoneSpecialRenderer implements IItemRenderer
{
    
    private GLModel model;
    private double bladeAngle;
    private int direction;

    public TileEntityPhoneSpecialRenderer()
    {
        model = new GLModel("/assets/obj/iphone.obj");
        model.regenerateNormals();
    }
    
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        switch(type)
        {
            case ENTITY:
                return true;
            case EQUIPPED_FIRST_PERSON:
                return true;
            case EQUIPPED:
                return true;
            case INVENTORY:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        if(type == ItemRenderType.INVENTORY && helper == ItemRendererHelper.INVENTORY_BLOCK)
            return true;
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        GL11.glScaled(0.05,0.05,0.05);
        switch(type)
        {
            case ENTITY:
            {
                GL11.glPushMatrix();
                GL11.glTranslated(0,0.1,0);
                GL11.glRotated(((Entity)data[1]).rotationYaw+=0.1, 0, 1, 0);
                GL11.glRotated(10, 0, 0, 1);
                GL11.glShadeModel(GL11.GL_SMOOTH);
                model.render();
                GL11.glPopMatrix();
                break;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                GL11.glPushMatrix();
                GL11.glTranslated(10,10.0,0.0);
                GL11.glRotated(200, 0, 1, 0);
                GL11.glRotated(-10, 1, 0, 0);

                GL11.glRotated(200, 0, 1, 0);
                GL11.glRotated(20, 1, 0, 0);
                GL11.glRotated(-10, 0, 0, 1);
                GL11.glRotated(25, 0, 1, 0);
                GL11.glRotated(10, 1, 0, 0);
                
                GL11.glRotated(180, 0, 1, 0);

                GL11.glShadeModel(GL11.GL_SMOOTH);
                model.render();
                GL11.glPopMatrix();
                break;
            }
            case EQUIPPED:
            {
                GL11.glPushMatrix();
                GL11.glTranslated(10,0.0,0.0);
                GL11.glRotated(200, 0, 1, 0);
                GL11.glRotated(-10, 1, 0, 0);
                GL11.glShadeModel(GL11.GL_SMOOTH);
                model.render();
                GL11.glPopMatrix();
                break;
            }
            case INVENTORY:
            {
                GL11.glPushMatrix();
                GL11.glTranslated(10, -10, 0);
                GL11.glRotated(90, 0, 1, 0);
                GL11.glRotated(-45, 1, 0, 0);
                GL11.glRotated(180, 0, 1, 0);
                GL11.glShadeModel(GL11.GL_SMOOTH);
                model.render();
                GL11.glDisable(GL11.GL_DEPTH_TEST);
                GL11.glPopMatrix();
                break;
            }
            default:
                break;
        }
    }

}
