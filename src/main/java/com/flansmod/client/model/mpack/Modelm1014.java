/*     */ package com.flansmod.client.model.mpack;
/*     */ 
/*     */ import com.flansmod.client.model.EnumAnimationType;
/*     */ import com.flansmod.client.model.ModelGun;
/*     */ import com.flansmod.client.tmt.ModelRendererTurbo;
/*     */ import com.flansmod.common.vector.Vector3f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelm1014
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm1014()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[35];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*     */     
/*  58 */     this.gunModel[0].addBox(30.0F, -9.0F, 0.0F, 23, 2, 3, 0.0F);
/*  59 */     this.gunModel[0].setRotationPoint(-31.0F, 3.0F, -1.5F);
/*     */     
/*  61 */     this.gunModel[1].addBox(30.0F, -6.0F, 0.0F, 36, 2, 2, 0.0F);
/*  62 */     this.gunModel[1].setRotationPoint(-8.0F, -2.75F, -1.0F);
/*     */     
/*  64 */     this.gunModel[2].addBox(30.0F, -6.0F, 0.0F, 25, 2, 2, 0.0F);
/*  65 */     this.gunModel[2].setRotationPoint(-8.0F, -0.25F, -1.0F);
/*     */     
/*  67 */     this.gunModel[3].addBox(30.0F, -6.0F, 0.0F, 2, 5, 3, 0.0F);
/*  68 */     this.gunModel[3].setRotationPoint(24.0F, -3.0F, -1.5F);
/*     */     
/*  70 */     this.gunModel[4].addBox(30.0F, -6.0F, 0.0F, 3, 3, 3, 0.0F);
/*  71 */     this.gunModel[4].setRotationPoint(-11.0F, -3.0F, -1.5F);
/*     */     
/*  73 */     this.gunModel[5].addBox(30.0F, -6.0F, 0.0F, 10, 2, 2, 0.0F);
/*  74 */     this.gunModel[5].setRotationPoint(-27.0F, -2.0F, -0.5F);
/*     */     
/*  76 */     this.gunModel[6].addBox(30.0F, -6.0F, 0.0F, 5, 1, 3, 0.0F);
/*  77 */     this.gunModel[6].setRotationPoint(-16.0F, -3.0F, -1.5F);
/*     */     
/*  79 */     this.gunModel[7].addFlexBox(30.0F, -6.0F, 0.0F, 4, 2, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 4);
/*  80 */     this.gunModel[7].setRotationPoint(-31.0F, -3.0F, -1.5F);
/*     */     
/*  82 */     this.gunModel[8].addFlexBox(30.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  83 */     this.gunModel[8].setRotationPoint(-30.0F, 2.0F, -0.5F);
/*     */     
/*  85 */     this.gunModel[9].addFlexBox(30.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  86 */     this.gunModel[9].setRotationPoint(-28.0F, 1.5F, 0.0F);
/*     */     
/*  88 */     this.gunModel[10].addBox(30.0F, -6.0F, 0.0F, 17, 4, 4, 0.0F);
/*  89 */     this.gunModel[10].setRotationPoint(-8.0F, -1.25F, -2.0F);
/*     */     
/*  91 */     this.gunModel[11].addBox(30.0F, -6.0F, 0.0F, 6, 2, 1, 0.0F);
/*  92 */     this.gunModel[11].setRotationPoint(-17.0F, -2.0F, 0.5F);
/*     */     
/*  94 */     this.gunModel[12].addBox(30.0F, -6.0F, 0.0F, 11, 1, 3, 0.0F);
/*  95 */     this.gunModel[12].setRotationPoint(-27.0F, -3.0F, -1.5F);
/*     */     
/*  97 */     this.gunModel[13].addFlexBox(30.0F, -6.0F, 0.0F, 2, 1, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 4);
/*  98 */     this.gunModel[13].setRotationPoint(-33.0F, -1.0F, -1.5F);
/*     */     
/* 100 */     this.gunModel[14].addFlexBox(30.0F, -6.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 101 */     this.gunModel[14].setRotationPoint(-33.0F, 0.0F, -1.5F);
/*     */     
/* 103 */     this.gunModel[15].addShapeBox(30.0F, -6.0F, 0.0F, 4, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 104 */     this.gunModel[15].setRotationPoint(-33.0F, 2.0F, -1.5F);
/*     */     
/* 106 */     this.gunModel[16].addShapeBox(30.0F, -6.0F, 0.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 107 */     this.gunModel[16].setRotationPoint(-35.0F, 8.0F, -1.5F);
/*     */     
/* 109 */     this.gunModel[17].addFlexBox(30.0F, -6.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 110 */     this.gunModel[17].setRotationPoint(-29.0F, 4.0F, -0.5F);
/*     */     
/* 112 */     this.gunModel[18].addShapeBox(30.0F, -6.0F, 0.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 113 */     this.gunModel[18].setRotationPoint(-25.0F, 2.0F, -0.5F);
/*     */     
/* 115 */     this.gunModel[19].addShapeBox(30.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 116 */     this.gunModel[19].setRotationPoint(-30.0F, 4.0F, -0.5F);
/*     */     
/* 118 */     this.gunModel[20].addShapeBox(30.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 119 */     this.gunModel[20].setRotationPoint(-26.0F, 2.0F, -0.5F);
/*     */     
/* 121 */     this.gunModel[21].addFlexBox(30.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 122 */     this.gunModel[21].setRotationPoint(-26.0F, 3.0F, -0.5F);
/*     */     
/* 124 */     this.gunModel[22].addBox(30.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 125 */     this.gunModel[22].setRotationPoint(24.5F, -4.0F, -0.5F);
/*     */     
/* 127 */     this.gunModel[23].addBox(30.0F, -6.0F, 0.0F, 13, 1, 2, 0.0F);
/* 128 */     this.gunModel[23].setRotationPoint(-21.0F, -3.5F, -1.0F);
/*     */     
/* 130 */     this.gunModel[24].addBox(30.0F, -6.0F, 0.0F, 21, 1, 1, 0.0F);
/* 131 */     this.gunModel[24].setRotationPoint(1.0F, 0.25F, -0.5F);
/*     */     
/* 133 */     this.gunModel[25].addBox(30.0F, -6.0F, 0.0F, 1, 2, 2, 0.0F);
/* 134 */     this.gunModel[25].setRotationPoint(18.0F, -0.25F, -1.0F);
/*     */     
/* 136 */     this.gunModel[26].addBox(30.0F, -6.0F, 0.0F, 1, 2, 2, 0.0F);
/* 137 */     this.gunModel[26].setRotationPoint(20.0F, -0.25F, -1.0F);
/*     */     
/* 139 */     this.gunModel[27].addBox(30.0F, -6.0F, 0.0F, 6, 2, 2, 0.0F);
/* 140 */     this.gunModel[27].setRotationPoint(22.0F, -0.25F, -1.0F);
/*     */     
/* 142 */     this.gunModel[28].addBox(30.0F, -6.0F, 0.0F, 10, 1, 1, 0.0F);
/* 143 */     this.gunModel[28].setRotationPoint(-27.0F, -2.0F, -1.5F);
/*     */     
/* 145 */     this.gunModel[29].addBox(30.0F, -6.0F, 0.0F, 6, 1, 1, 0.0F);
/* 146 */     this.gunModel[29].setRotationPoint(-27.0F, -1.0F, -1.5F);
/*     */     
/* 148 */     this.gunModel[30].addBox(30.0F, -6.0F, 0.0F, 4, 1, 3, 0.0F);
/* 149 */     this.gunModel[30].setRotationPoint(-31.0F, -1.0F, -1.5F);
/*     */     
/* 151 */     this.gunModel[31].addBox(30.0F, -6.0F, 0.0F, 26, 1, 1, 0.0F);
/* 152 */     this.gunModel[31].setRotationPoint(-54.0F, 11.5F, -0.5F);
/* 153 */     this.gunModel[31].rotateAngleZ = 0.20943952F;
/*     */     
/* 155 */     this.gunModel[32].addShapeBox(30.0F, -6.0F, 0.0F, 14, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 156 */     this.gunModel[32].setRotationPoint(-51.0F, 6.0F, -1.5F);
/* 157 */     this.gunModel[32].rotateAngleZ = 0.15707964F;
/*     */     
/* 159 */     this.gunModel[33].addFlexBox(30.0F, -6.0F, 0.0F, 3, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 160 */     this.gunModel[33].setRotationPoint(-58.5F, 1.0F, -1.5F);
/*     */     
/* 162 */     this.gunModel[34].addBox(30.0F, -6.0F, 0.0F, 17, 2, 2, 0.0F);
/* 163 */     this.gunModel[34].setRotationPoint(-54.0F, 11.0F, -1.0F);
/* 164 */     this.gunModel[34].rotateAngleZ = 0.20943952F;
/*     */     
/*     */ 
/* 167 */     this.ammoModel = new ModelRendererTurbo[1];
/* 168 */     this.ammoModel[0] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*     */     
/* 170 */     this.ammoModel[0].addBox(0.0F, 4.0F, 0.0F, 7, 2, 2, 0.0F);
/* 171 */     this.ammoModel[0].setRotationPoint(13.0F, -11.5F, -0.52F);
/*     */     
/*     */ 
/* 174 */     this.slideModel = new ModelRendererTurbo[2];
/* 175 */     this.slideModel[0] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 176 */     this.slideModel[1] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*     */     
/* 178 */     this.slideModel[0].addBox(30.0F, -6.0F, 0.0F, 1, 1, 2, 0.0F);
/* 179 */     this.slideModel[0].setRotationPoint(-13.0F, -1.0F, -3.0F);
/*     */     
/* 181 */     this.slideModel[1].addBox(30.0F, -6.0F, 0.0F, 6, 2, 1, 0.0F);
/* 182 */     this.slideModel[1].setRotationPoint(-17.0F, -2.0F, -1.0F);
/*     */     
/*     */ 
/*     */ 
/* 186 */     this.barrelAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
/* 187 */     this.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
/* 188 */     this.scopeAttachPoint = new Vector3f(0.9375F, 1.125F, 0.0F);
/* 189 */     this.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
/*     */     
/* 191 */     translateAll(-3.0F, -9.0F, 0.0F);
/* 192 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 194 */     this.gunSlideDistance = 0.5F;
/* 195 */     this.animationType = EnumAnimationType.SHOTGUN;
/* 196 */     this.pumpDelayAfterReload = 115;
/* 197 */     this.numBulletsInReloadAnimation = 7.0F;
/* 198 */     this.tiltGunTime = 0.1F;
/* 199 */     this.unloadClipTime = 0.0F;
/* 200 */     this.loadClipTime = 0.985F;
/* 201 */     this.untiltGunTime = 0.186F;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 206 */     translateAll(0.0F, 0.0F, 0.0F);
/*     */     
/*     */ 
/* 209 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm1014.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */