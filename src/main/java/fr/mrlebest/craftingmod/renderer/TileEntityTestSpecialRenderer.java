package fr.mrlebest.craftingmod.renderer;




import org.lwjgl.opengl.GL11;

import GLLoader.GLModel;
import fr.mrlebest.craftingmod.glutils.TessellatorModel;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class TileEntityTestSpecialRenderer implements IItemRenderer
{
    private GLModel model;
    private double bladeAngle;
    private int direction;

    public TileEntityTestSpecialRenderer()
    {
        model = new GLModel("/assets/obj/Extinguisher.obj");
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
        switch(type)
        {
            case ENTITY:
            {
                GL11.glPushMatrix();
                GL11.glScalef(0.2f, 0.2f, 0.2f);
                //GL11.glTranslatef(-10f, 5f, 0.0f);
                GL11.glRotatef(90, 0.0f, 1.0f, 0.0f);
                model.render();
                GL11.glPopMatrix();
                break;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                GL11.glPushMatrix();
                GL11.glTranslatef(0.2f, 0.0f, 0.0f);
                GL11.glRotatef(100, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(-30, 1.0f, 0.0f, 0.0f);
                GL11.glScalef(0.2f, 0.2f, 0.2f);
                model.render();
                GL11.glPopMatrix();
            }
            case EQUIPPED:
            {
                GL11.glPushMatrix();
                GL11.glTranslatef(1.5f, 0.5f, 1f);
                GL11.glRotatef(50, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(00, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-35, 1.0f, 0.0f, 0.0f);
                GL11.glScalef(0.2f, 0.2f, 0.2f);
                model.render();
                
                GL11.glPopMatrix();
            }
            default:
                break;
        }
    }

}
