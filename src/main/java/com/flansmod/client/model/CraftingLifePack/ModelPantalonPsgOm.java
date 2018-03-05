/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  com.flansmod.client.model.ModelCustomArmour
 *  com.flansmod.client.tmt.ModelRendererTurbo
 *  net.minecraft.client.model.ModelBase
 */
package com.flansmod.client.model.CraftingLifePack;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelPantalonPsgOm
extends ModelCustomArmour {
    int textureX = 1024;
    int textureY = 1024;

    public ModelPantalonPsgOm() {
        this.leftLegModel = new ModelRendererTurbo[4];
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 168, 799, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 250, 18, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 250, 18, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 9, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.1f);
        this.leftLegModel[1].addShapeBox(-3.7f, 0.5f, 2.3f, 230, 220, 0, 0.0f, 0.0f, 0.0f, 0.0f, -232.0f, 0.0f, 0.0f, -232.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -218.0f, 0.0f, -232.0f, -218.0f, 0.0f, -232.0f, -218.0f, 0.0f, 0.0f, -218.0f, 0.0f);
        this.leftLegModel[1].rotateAngleY = -3.1415927f;
        this.leftLegModel[2].addShapeBox(1.2f, 0.0f, -1.5f, 1, 9, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[3].addShapeBox(1.2f, 0.0f, 0.2f, 1, 9, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel = new ModelRendererTurbo[3];
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 98, 397, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 250, 18, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 9, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[1].addShapeBox(-1.7f, 0.5f, -2.3f, 400, 367, 0, 0.0f, 0.0f, 0.0f, 0.0f, -398.0f, 0.0f, 0.0f, -398.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -365.0f, 0.0f, -398.0f, -365.0f, 0.0f, -398.0f, -365.0f, 0.0f, 0.0f, -365.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.3f, 0.0f, -0.5f, 1, 9, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
    }
}

