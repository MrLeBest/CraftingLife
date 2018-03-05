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

public class ModelBobGameBoyColor
extends ModelCustomArmour {
    int textureX = 1024;
    int textureY = 1024;

    public ModelBobGameBoyColor() {
        this.headModel = new ModelRendererTurbo[4];
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 568, 228, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-5.0f, -9.0f, -5.0f, 10, 3, 10, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[1].addBox(-5.0f, -6.0f, -6.0f, 10, 1, 12, 0.0f);
        this.headModel[2].addBox(-6.0f, -6.0f, -5.0f, 12, 1, 10, 0.0f);
        this.headModel[3].addShapeBox(-5.5f, -8.5f, -5.2f, 400, 150, 0, 0.0f, 0.0f, 0.0f, -1.0f, -390.0f, 0.0f, -1.0f, -390.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -148.0f, 0.0f, -390.0f, -148.0f, 0.0f, -390.0f, -148.0f, 0.0f, 0.0f, -148.0f, 0.0f);
    }
}

