package fr.mrlebest.craftingmod.renderer;

import fr.mrlebest.craftingmod.common.entity.EntityTest;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderEntityTest extends Render {
    

    public RenderEntityTest(ModelBiped model, float shadow) {
        super();

    }
    
    protected ResourceLocation getEntityTexture(EntityLiving living)
    {
        return this.getEntityTexture((EntityTest)living);
    }

    @Override
    public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
