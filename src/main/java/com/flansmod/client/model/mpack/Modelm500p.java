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
/*     */ public class Modelm500p
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm500p()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[37];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*     */     
/*  60 */     this.gunModel[0].addBox(0.0F, -9.0F, -1.0F, 20, 2, 3, 0.0F);
/*  61 */     this.gunModel[0].setRotationPoint(1.0F, -4.0F, -0.5F);
/*     */     
/*  63 */     this.gunModel[1].addBox(0.0F, -9.0F, -1.0F, 36, 2, 2, 0.0F);
/*  64 */     this.gunModel[1].setRotationPoint(21.0F, -6.75F, 0.0F);
/*     */     
/*  66 */     this.gunModel[2].addBox(0.0F, -9.0F, -1.0F, 34, 2, 2, 0.0F);
/*  67 */     this.gunModel[2].setRotationPoint(21.0F, -4.25F, 0.0F);
/*     */     
/*  69 */     this.gunModel[3].addBox(0.0F, -9.0F, -1.0F, 2, 5, 3, 0.0F);
/*  70 */     this.gunModel[3].setRotationPoint(52.0F, -7.0F, -0.5F);
/*     */     
/*  72 */     this.gunModel[4].addShapeBox(0.0F, -9.0F, -1.0F, 3, 3, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  73 */     this.gunModel[4].setRotationPoint(18.0F, -7.0F, -0.5F);
/*     */     
/*  75 */     this.gunModel[5].addBox(0.0F, -9.0F, -1.0F, 1, 2, 3, 0.0F);
/*  76 */     this.gunModel[5].setRotationPoint(1.0F, -6.0F, -0.5F);
/*     */     
/*  78 */     this.gunModel[6].addBox(0.0F, -9.0F, -1.0F, 9, 2, 3, 0.0F);
/*  79 */     this.gunModel[6].setRotationPoint(2.0F, -6.0F, -0.5F);
/*     */     
/*  81 */     this.gunModel[7].addShapeBox(0.0F, -9.0F, -1.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  82 */     this.gunModel[7].setRotationPoint(13.0F, -7.0F, -0.5F);
/*     */     
/*  84 */     this.gunModel[8].addShapeBox(0.0F, -9.0F, -1.0F, 4, 1, 3, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  85 */     this.gunModel[8].setRotationPoint(1.0F, -7.0F, -0.5F);
/*     */     
/*  87 */     this.gunModel[9].addFlexBox(0.0F, -9.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  88 */     this.gunModel[9].setRotationPoint(4.0F, -2.5F, 1.0F);
/*     */     
/*  90 */     this.gunModel[10].addBox(0.0F, -9.0F, -1.0F, 7, 2, 1, 0.0F);
/*  91 */     this.gunModel[10].setRotationPoint(11.0F, -6.0F, 1.5F);
/*     */     
/*  93 */     this.gunModel[11].addShapeBox(0.0F, -9.0F, -1.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  94 */     this.gunModel[11].setRotationPoint(5.0F, -7.0F, -0.5F);
/*     */     
/*  96 */     this.gunModel[12].addShapeBox(0.0F, -9.0F, -1.0F, 4, 2, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  97 */     this.gunModel[12].setRotationPoint(-3.0F, -6.0F, -0.5F);
/*     */     
/*  99 */     this.gunModel[13].addShapeBox(0.0F, -9.0F, -1.0F, 4, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 100 */     this.gunModel[13].setRotationPoint(-3.0F, -2.0F, -0.5F);
/*     */     
/* 102 */     this.gunModel[14].addFlexBox(0.0F, -9.0F, -1.0F, 4, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 103 */     this.gunModel[14].setRotationPoint(-3.0F, -4.0F, -0.5F);
/*     */     
/* 105 */     this.gunModel[15].addFlexBox(0.0F, -9.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 106 */     this.gunModel[15].setRotationPoint(2.0F, 0.0F, 0.5F);
/*     */     
/* 108 */     this.gunModel[16].addShapeBox(0.0F, -9.0F, -1.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 109 */     this.gunModel[16].setRotationPoint(7.0F, -2.0F, 0.5F);
/*     */     
/* 111 */     this.gunModel[17].addFlexBox(0.0F, -9.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 112 */     this.gunModel[17].setRotationPoint(0.0F, -2.0F, 0.5F);
/*     */     
/* 114 */     this.gunModel[18].addShapeBox(0.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 115 */     this.gunModel[18].setRotationPoint(6.0F, -2.0F, 0.5F);
/*     */     
/* 117 */     this.gunModel[19].addFlexBox(0.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 118 */     this.gunModel[19].setRotationPoint(6.0F, -1.0F, 0.5F);
/*     */     
/* 120 */     this.gunModel[20].addBox(0.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F);
/* 121 */     this.gunModel[20].setRotationPoint(55.0F, -7.75F, 0.5F);
/*     */     
/* 123 */     this.gunModel[21].addFlexBox(0.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4);
/* 124 */     this.gunModel[21].setRotationPoint(2.0F, -1.0F, 0.5F);
/*     */     
/* 126 */     this.gunModel[22].addShapeBox(0.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 127 */     this.gunModel[22].setRotationPoint(2.0F, -2.0F, 0.5F);
/*     */     
/* 129 */     this.gunModel[23].addFlexBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 130 */     this.gunModel[23].setRotationPoint(1.5F, -6.5F, 0.5F);
/* 131 */     this.gunModel[23].rotateAngleZ = 0.2617994F;
/*     */     
/* 133 */     this.gunModel[24].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 134 */     this.gunModel[24].setRotationPoint(18.0F, -7.0F, -0.5F);
/*     */     
/* 136 */     this.gunModel[25].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 137 */     this.gunModel[25].setRotationPoint(18.0F, -8.0F, 0.0F);
/*     */     
/* 139 */     this.gunModel[26].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 140 */     this.gunModel[26].setRotationPoint(15.0F, -8.0F, 0.0F);
/*     */     
/* 142 */     this.gunModel[27].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 143 */     this.gunModel[27].setRotationPoint(12.0F, -8.0F, 0.0F);
/*     */     
/* 145 */     this.gunModel[28].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 146 */     this.gunModel[28].setRotationPoint(9.0F, -8.0F, 0.0F);
/*     */     
/* 148 */     this.gunModel[29].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 149 */     this.gunModel[29].setRotationPoint(6.0F, -8.0F, 0.0F);
/*     */     
/* 151 */     this.gunModel[30].addShapeBox(0.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 152 */     this.gunModel[30].setRotationPoint(5.0F, -8.0F, 0.0F);
/*     */     
/* 154 */     this.gunModel[31].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 155 */     this.gunModel[31].setRotationPoint(9.0F, -8.0F, 1.0F);
/*     */     
/* 157 */     this.gunModel[32].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 158 */     this.gunModel[32].setRotationPoint(12.0F, -8.0F, 1.0F);
/*     */     
/* 160 */     this.gunModel[33].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 161 */     this.gunModel[33].setRotationPoint(15.0F, -8.0F, 1.0F);
/*     */     
/* 163 */     this.gunModel[34].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 164 */     this.gunModel[34].setRotationPoint(18.0F, -8.0F, 1.0F);
/*     */     
/* 166 */     this.gunModel[35].addShapeBox(0.0F, -9.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 167 */     this.gunModel[35].setRotationPoint(6.0F, -8.0F, 1.0F);
/*     */     
/* 169 */     this.gunModel[36].addShapeBox(0.0F, -9.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 170 */     this.gunModel[36].setRotationPoint(5.0F, -8.0F, 1.0F);
/*     */     
/*     */ 
/* 173 */     this.ammoModel = new ModelRendererTurbo[1];
/* 174 */     this.ammoModel[0] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*     */     
/* 176 */     this.ammoModel[0].addBox(0.0F, -9.0F, -1.0F, 7, 2, 2, 0.0F);
/* 177 */     this.ammoModel[0].setRotationPoint(12.0F, -4.1F, 0.1F);
/*     */     
/*     */ 
/* 180 */     this.pumpModel = new ModelRendererTurbo[2];
/* 181 */     this.pumpModel[0] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 182 */     this.pumpModel[1] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*     */     
/* 184 */     this.pumpModel[0].addShapeBox(0.0F, -9.0F, -1.0F, 17, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 185 */     this.pumpModel[0].setRotationPoint(24.5F, -5.25F, -1.0F);
/*     */     
/* 187 */     this.pumpModel[1].addBox(0.0F, -9.0F, -1.0F, 7, 2, 1, 0.0F);
/* 188 */     this.pumpModel[1].setRotationPoint(11.0F, -6.0F, 0.0F);
/*     */     
/*     */ 
/*     */ 
/* 192 */     translateAll(0.0F, -0.5F, 0.0F);
/* 193 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 195 */     this.gunSlideDistance = 0.0F;
/* 196 */     this.animationType = EnumAnimationType.SHOTGUN;
/* 197 */     this.pumpDelayAfterReload = 115;this.pumpDelay = 6;
/* 198 */     this.pumpTime = 9;
/* 199 */     this.gripIsOnPump = true;
/* 200 */     this.pumpHandleDistance = 0.5F;
/* 201 */     this.numBulletsInReloadAnimation = 5.0F;
/* 202 */     this.tiltGunTime = 0.159F;
/* 203 */     this.unloadClipTime = 0.0F;
/* 204 */     this.loadClipTime = 0.75F;
/* 205 */     this.untiltGunTime = 0.15F;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 210 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm500p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */