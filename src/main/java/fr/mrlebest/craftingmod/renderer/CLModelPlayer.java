package fr.mrlebest.craftingmod.renderer;

import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class CLModelPlayer extends ModelPlayerBase {
	public ExtPropCraftingLife anim;

	public CLModelPlayer(ModelPlayerAPI modelPlayerAPI) {
		super(modelPlayerAPI);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entity) {
		modelPlayer.bipedRightArm.rotateAngleX = 0;
		modelPlayer.bipedLeftArm.rotateAngleX = 0;
		modelPlayer.bipedRightArm.rotateAngleY = 0;
		modelPlayer.bipedLeftArm.rotateAngleY = 0;
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
		if (entity instanceof EntityPlayer && this.modelPlayer != null) {
			EntityPlayer player = (EntityPlayer) entity;
			anim = ExtPropCraftingLife.get(player);
			// System.out.println(player.getDisplayName() + " " + anim.getAnimId());
			switch (anim.getAnimId()) {
			case 1:
				modelPlayer.bipedRightArm.rotateAngleX = (float) anim.tickHand;
				modelPlayer.bipedLeftArm.rotateAngleX = (float) anim.tickHand;
				/*
				 * this.bipedRightArm.rotateAngleY = (float)anim.tickHand;
				 * this.bipedLeftArm.rotateAngleY = -5.8F;
				 */
				break;
			case 2:
				// .out.println("Tst");
				// if (player.inventory.armorItemInSlot(2).getItem() != null){
				// System.out.println(player.inventory.armorItemInSlot(2).getItem().getArmorModel(player,
				// player.inventory.armorItemInSlot(2), 2));
				modelPlayer.bipedRightArm.rotateAngleX = (float) anim.tickHand;
				modelPlayer.bipedLeftArm.rotateAngleX = (float) anim.tickHand;
				// }
				break;
			case 3:
				modelPlayer.bipedRightArm.rotateAngleX = (float) anim.tickHand;
				modelPlayer.bipedLeftArm.rotateAngleX = (float) anim.tickHand;
				break;
			case 4:
				modelPlayer.bipedRightArm.rotateAngleX = (float) anim.tickHand;
				modelPlayer.bipedLeftArm.rotateAngleX = (float) anim.tickHand;
				modelPlayer.bipedRightArm.rotateAngleY = (float) anim.tickRightHand;
				modelPlayer.bipedLeftArm.rotateAngleY = (float) anim.tickLeftHand;
				break;
			case 5:
				modelPlayer.bipedRightArm.rotateAngleX = (float) anim.tickHand;
				modelPlayer.bipedLeftArm.rotateAngleX = (float) anim.tickHand;
				modelPlayer.bipedRightArm.rotateAngleY = (float) anim.tickRightHand;
				modelPlayer.bipedLeftArm.rotateAngleY = (float) anim.tickLeftHand;
				break;
			}
		}
	}
}
