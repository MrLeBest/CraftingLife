package fr.mrlebest.craftingmod.renderer;

import fr.mrlebest.craftingmod.client.gui.GuiScreenConcessAdmin;
import fr.mrlebest.craftingmod.client.gui.GuiScreenPng;
import fr.mrlebest.craftingmod.common.entity.EntityConcessionnaire;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderConcessionnaireEntity extends RenderBiped {
	
	public ResourceLocation texture = new ResourceLocation("craftingmod", "textures/entity/skindon.png"); 
	public final ResourceLocation defaultTexture = new ResourceLocation("craftingmod", "textures/entity/skindon.png"); 

	public RenderConcessionnaireEntity(ModelBiped model, float shadow) {
		super(model, shadow);

	}
	
	protected ResourceLocation getEntityTexture(EntityLiving living)
	{
		return this.getEntityTexture((EntityConcessionnaire)living);
	}

	protected ResourceLocation getEntityTexture(EntityConcessionnaire entityConcess)
	{
		switch(entityConcess.getTameSkin()){
		case 1:
			texture = new ResourceLocation("craftingmod", "textures/entity/police.png"); 
			return texture;
			
		case 2:
			texture = new ResourceLocation("craftingmod", "textures/entity/pompier.png"); 
			return texture;
			
		case 3:
			texture = new ResourceLocation("craftingmod", "textures/entity/" + GuiScreenPng.texture.getText() + ".png"); 
			return texture;
			
		case 4:
			texture = new ResourceLocation("craftingmod", "textures/entity/" + GuiScreenPng.texture.getText() + ".png"); 
			return texture;
			
		case 5:
			texture = new ResourceLocation("craftingmod", "textures/entity/" + GuiScreenPng.texture.getText() + ".png"); 
			return texture;
		}
		return defaultTexture;
	}

}

