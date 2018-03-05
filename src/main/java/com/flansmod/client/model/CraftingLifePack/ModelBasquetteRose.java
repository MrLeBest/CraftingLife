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

public class ModelBasquetteRose
extends ModelCustomArmour {
    int textureX = 1024;
    int textureY = 1024;

    public ModelBasquetteRose() {
        this.leftLegModel = new ModelRendererTurbo[2];
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 184, 24, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 169, 28, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 9.0f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f);
        this.leftLegModel[1].addShapeBox(-2.0f, 10.0f, -5.0f, 4, 2, 3, 0.0f, -0.8f, 0.0f, -0.8f, -0.8f, 0.0f, -0.8f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.rightLegModel = new ModelRendererTurbo[2];
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 184, 24, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 169, 28, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 9.0f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f);
        this.rightLegModel[1].addShapeBox(-2.0f, 10.0f, -5.0f, 4, 2, 3, 0.0f, -0.8f, 0.0f, -0.8f, -0.8f, 0.0f, -0.8f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
    }
}

