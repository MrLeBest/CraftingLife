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
/*     */ public class Modelnegev
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelnegev()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[54];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*     */     
/*  77 */     this.gunModel[0].addBox(7.0F, -6.0F, 0.0F, 20, 1, 3, 0.0F);
/*  78 */     this.gunModel[0].setRotationPoint(-12.0F, 0.0F, -1.5F);
/*     */     
/*  80 */     this.gunModel[1].addBox(7.0F, -6.0F, 0.0F, 32, 2, 2, 0.0F);
/*  81 */     this.gunModel[1].setRotationPoint(8.0F, -3.0F, -1.0F);
/*     */     
/*  83 */     this.gunModel[2].addShapeBox(7.0F, -6.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  84 */     this.gunModel[2].setRotationPoint(23.0F, -1.0F, -1.0F);
/*     */     
/*  86 */     this.gunModel[3].addBox(7.0F, -6.0F, 0.0F, 2, 1, 2, 0.0F);
/*  87 */     this.gunModel[3].setRotationPoint(23.0F, -4.0F, -1.0F);
/*     */     
/*  89 */     this.gunModel[4].addBox(7.0F, -6.0F, 0.0F, 2, 2, 2, 0.0F);
/*  90 */     this.gunModel[4].setRotationPoint(24.0F, 1.0F, -1.0F);
/*     */     
/*  92 */     this.gunModel[5].addBox(7.0F, -6.0F, 0.0F, 1, 14, 1, 0.0F);
/*  93 */     this.gunModel[5].setRotationPoint(24.5F, 2.5F, -2.0F);
/*  94 */     this.gunModel[5].rotateAngleX = -0.2617994F;
/*     */     
/*  96 */     this.gunModel[6].addBox(7.0F, -6.0F, 0.0F, 1, 14, 1, 0.0F);
/*  97 */     this.gunModel[6].setRotationPoint(24.5F, 2.5F, 1.0F);
/*  98 */     this.gunModel[6].rotateAngleX = 0.2617994F;
/*     */     
/* 100 */     this.gunModel[7].addBox(7.0F, -6.0F, 0.0F, 2, 3, 3, 0.0F);
/* 101 */     this.gunModel[7].setRotationPoint(6.0F, -3.0F, -1.5F);
/*     */     
/* 103 */     this.gunModel[8].addBox(7.0F, -6.0F, 0.0F, 13, 3, 3, 0.0F);
/* 104 */     this.gunModel[8].setRotationPoint(-12.0F, -3.0F, -1.5F);
/*     */     
/* 106 */     this.gunModel[9].addShapeBox(7.0F, -6.0F, 0.0F, 6, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 107 */     this.gunModel[9].setRotationPoint(0.5F, -4.5F, -1.5F);
/*     */     
/* 109 */     this.gunModel[10].addShapeBox(7.0F, -6.0F, 0.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 110 */     this.gunModel[10].setRotationPoint(-9.0F, 2.0F, -1.0F);
/*     */     
/* 112 */     this.gunModel[11].addFlexBox(7.0F, -6.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 113 */     this.gunModel[11].setRotationPoint(-8.0F, 4.0F, -0.5F);
/*     */     
/* 115 */     this.gunModel[12].addFlexBox(7.0F, -6.0F, 0.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 116 */     this.gunModel[12].setRotationPoint(-9.0F, 1.0F, -1.0F);
/*     */     
/* 118 */     this.gunModel[13].addFlexBox(7.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 119 */     this.gunModel[13].setRotationPoint(-3.0F, 2.0F, -0.5F);
/*     */     
/* 121 */     this.gunModel[14].addFlexBox(7.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 122 */     this.gunModel[14].setRotationPoint(-5.0F, 1.5F, -0.5F);
/*     */     
/* 124 */     this.gunModel[15].addShapeBox(7.0F, -6.0F, 0.0F, 5, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 125 */     this.gunModel[15].setRotationPoint(1.0F, -4.0F, -1.5F);
/*     */     
/* 127 */     this.gunModel[16].addBox(7.0F, -6.0F, 0.0F, 1, 1, 4, 0.0F);
/* 128 */     this.gunModel[16].setRotationPoint(0.0F, -1.0F, -3.5F);
/*     */     
/* 130 */     this.gunModel[17].addBox(7.0F, -6.0F, 0.0F, 12, 4, 4, 0.0F);
/* 131 */     this.gunModel[17].setRotationPoint(8.0F, -2.5F, -2.0F);
/*     */     
/* 133 */     this.gunModel[18].addBox(7.0F, -6.0F, 0.0F, 5, 2, 1, 0.0F);
/* 134 */     this.gunModel[18].setRotationPoint(1.0F, -2.0F, 0.5F);
/*     */     
/* 136 */     this.gunModel[19].addShapeBox(7.0F, -6.0F, 0.0F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 137 */     this.gunModel[19].setRotationPoint(20.0F, -2.5F, -1.5F);
/*     */     
/* 139 */     this.gunModel[20].addShapeBox(7.0F, -6.0F, -1.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 140 */     this.gunModel[20].setRotationPoint(0.0F, -4.0F, -0.5F);
/*     */     
/* 142 */     this.gunModel[21].addShapeBox(7.0F, -6.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 143 */     this.gunModel[21].setRotationPoint(0.5F, -3.0F, 1.5F);
/*     */     
/* 145 */     this.gunModel[22].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 146 */     this.gunModel[22].setRotationPoint(0.5F, -3.5F, 1.5F);
/*     */     
/* 148 */     this.gunModel[23].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 149 */     this.gunModel[23].setRotationPoint(6.0F, -3.5F, 1.5F);
/*     */     
/* 151 */     this.gunModel[24].addShapeBox(7.0F, -7.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 152 */     this.gunModel[24].setRotationPoint(6.5F, -3.5F, -1.5F);
/*     */     
/* 154 */     this.gunModel[25].addShapeBox(7.0F, -6.0F, -1.0F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 155 */     this.gunModel[25].setRotationPoint(8.0F, -4.0F, -0.25F);
/*     */     
/* 157 */     this.gunModel[26].addShapeBox(7.0F, -6.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 158 */     this.gunModel[26].setRotationPoint(10.0F, -3.0F, -0.25F);
/*     */     
/* 160 */     this.gunModel[27].addShapeBox(7.0F, -6.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 161 */     this.gunModel[27].setRotationPoint(10.0F, -3.0F, 1.75F);
/*     */     
/* 163 */     this.gunModel[28].addBox(7.0F, -6.0F, 0.0F, 12, 1, 1, 0.0F);
/* 164 */     this.gunModel[28].setRotationPoint(-27.0F, -2.0F, -0.5F);
/*     */     
/* 166 */     this.gunModel[29].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 167 */     this.gunModel[29].setRotationPoint(-20.0F, -0.5F, -0.5F);
/*     */     
/* 169 */     this.gunModel[30].addShapeBox(7.0F, -6.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 170 */     this.gunModel[30].setRotationPoint(-29.0F, -0.5F, -0.5F);
/*     */     
/* 172 */     this.gunModel[31].addBox(7.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F);
/* 173 */     this.gunModel[31].setRotationPoint(-29.0F, -2.5F, -0.5F);
/*     */     
/* 175 */     this.gunModel[32].addShapeBox(7.0F, -6.0F, 0.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 176 */     this.gunModel[32].setRotationPoint(-15.5F, -3.0F, 0.5F);
/*     */     
/* 178 */     this.gunModel[33].addShapeBox(7.0F, -6.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 179 */     this.gunModel[33].setRotationPoint(-15.0F, -3.0F, -1.0F);
/*     */     
/* 181 */     this.gunModel[34].addShapeBox(7.0F, -6.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 182 */     this.gunModel[34].setRotationPoint(-15.0F, 0.0F, -1.0F);
/*     */     
/* 184 */     this.gunModel[35].addShapeBox(7.0F, -6.0F, 0.0F, 1, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 185 */     this.gunModel[35].setRotationPoint(-15.0F, -2.5F, -1.0F);
/*     */     
/* 187 */     this.gunModel[36].addShapeBox(7.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 188 */     this.gunModel[36].setRotationPoint(23.0F, -6.0F, -1.0F);
/*     */     
/* 190 */     this.gunModel[37].addShapeBox(7.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 191 */     this.gunModel[37].setRotationPoint(23.0F, -6.0F, 0.5F);
/*     */     
/* 193 */     this.gunModel[38].addShapeBox(7.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 194 */     this.gunModel[38].setRotationPoint(24.0F, -6.0F, 0.5F);
/*     */     
/* 196 */     this.gunModel[39].addShapeBox(7.0F, -6.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 197 */     this.gunModel[39].setRotationPoint(24.0F, -6.0F, -1.0F);
/*     */     
/* 199 */     this.gunModel[40].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 200 */     this.gunModel[40].setRotationPoint(24.0F, -5.0F, -0.25F);
/*     */     
/* 202 */     this.gunModel[41].addShapeBox(7.0F, -6.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 203 */     this.gunModel[41].setRotationPoint(-11.0F, -4.0F, 0.0F);
/*     */     
/* 205 */     this.gunModel[42].addShapeBox(7.0F, -6.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 206 */     this.gunModel[42].setRotationPoint(-11.0F, -4.0F, -1.5F);
/*     */     
/* 208 */     this.gunModel[43].addShapeBox(7.0F, -6.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 209 */     this.gunModel[43].setRotationPoint(-11.0F, -4.5F, 0.0F);
/*     */     
/* 211 */     this.gunModel[44].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 212 */     this.gunModel[44].setRotationPoint(-9.0F, -4.5F, -1.5F);
/*     */     
/* 214 */     this.gunModel[45].addShapeBox(7.0F, -6.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 215 */     this.gunModel[45].setRotationPoint(-11.0F, -4.5F, -1.5F);
/*     */     
/* 217 */     this.gunModel[46].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 218 */     this.gunModel[46].setRotationPoint(-9.0F, -4.5F, 0.0F);
/*     */     
/* 220 */     this.gunModel[47].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 221 */     this.gunModel[47].setRotationPoint(-10.0F, -5.0F, 0.0F);
/*     */     
/* 223 */     this.gunModel[48].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 224 */     this.gunModel[48].setRotationPoint(-10.0F, -5.0F, -1.5F);
/*     */     
/* 226 */     this.gunModel[49].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 227 */     this.gunModel[49].setRotationPoint(-11.0F, -5.0F, -1.5F);
/*     */     
/* 229 */     this.gunModel[50].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 230 */     this.gunModel[50].setRotationPoint(-11.0F, -5.0F, 0.0F);
/*     */     
/* 232 */     this.gunModel[51].addShapeBox(7.0F, -6.0F, -1.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 233 */     this.gunModel[51].setRotationPoint(6.0F, -4.0F, -0.5F);
/*     */     
/* 235 */     this.gunModel[52].addShapeBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 236 */     this.gunModel[52].setRotationPoint(1.0F, -4.0F, 0.5F);
/*     */     
/* 238 */     this.gunModel[53].addShapeBox(7.0F, -6.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 239 */     this.gunModel[53].setRotationPoint(0.5F, -4.5F, 1.5F);
/*     */     
/*     */ 
/* 242 */     this.ammoModel = new ModelRendererTurbo[31];
/* 243 */     this.ammoModel[0] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/* 244 */     this.ammoModel[1] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 245 */     this.ammoModel[2] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 246 */     this.ammoModel[3] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/* 247 */     this.ammoModel[4] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/* 248 */     this.ammoModel[5] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/* 249 */     this.ammoModel[6] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 250 */     this.ammoModel[7] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 251 */     this.ammoModel[8] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 252 */     this.ammoModel[9] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 253 */     this.ammoModel[10] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/* 254 */     this.ammoModel[11] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/* 255 */     this.ammoModel[12] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/* 256 */     this.ammoModel[13] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 257 */     this.ammoModel[14] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 258 */     this.ammoModel[15] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/* 259 */     this.ammoModel[16] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/* 260 */     this.ammoModel[17] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/* 261 */     this.ammoModel[18] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/* 262 */     this.ammoModel[19] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/* 263 */     this.ammoModel[20] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 264 */     this.ammoModel[21] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 265 */     this.ammoModel[22] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/* 266 */     this.ammoModel[23] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/* 267 */     this.ammoModel[24] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/* 268 */     this.ammoModel[25] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 269 */     this.ammoModel[26] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 270 */     this.ammoModel[27] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/* 271 */     this.ammoModel[28] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/* 272 */     this.ammoModel[29] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/* 273 */     this.ammoModel[30] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*     */     
/* 275 */     this.ammoModel[0].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 276 */     this.ammoModel[0].setRotationPoint(0.0F, 6.0F, 0.5F);
/*     */     
/* 278 */     this.ammoModel[1].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 279 */     this.ammoModel[1].setRotationPoint(1.0F, -1.5F, 3.0F);
/*     */     
/* 281 */     this.ammoModel[2].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 282 */     this.ammoModel[2].setRotationPoint(1.0F, -2.5F, 2.5F);
/*     */     
/* 284 */     this.ammoModel[3].addBox(7.0F, -6.0F, -1.0F, 5, 1, 1, 0.0F);
/* 285 */     this.ammoModel[3].setRotationPoint(1.0F, -3.5F, 2.5F);
/*     */     
/* 287 */     this.ammoModel[4].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 288 */     this.ammoModel[4].setRotationPoint(2.0F, -2.7F, 2.75F);
/*     */     
/* 290 */     this.ammoModel[5].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 291 */     this.ammoModel[5].setRotationPoint(2.0F, -1.75F, 3.25F);
/*     */     
/* 293 */     this.ammoModel[6].addShapeBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 294 */     this.ammoModel[6].setRotationPoint(2.0F, -3.5F, 1.75F);
/*     */     
/* 296 */     this.ammoModel[7].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 297 */     this.ammoModel[7].setRotationPoint(1.0F, -0.5F, 3.5F);
/*     */     
/* 299 */     this.ammoModel[8].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 300 */     this.ammoModel[8].setRotationPoint(1.0F, 0.5F, 3.35F);
/*     */     
/* 302 */     this.ammoModel[9].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 303 */     this.ammoModel[9].setRotationPoint(2.0F, -0.75F, 3.75F);
/*     */     
/* 305 */     this.ammoModel[10].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 306 */     this.ammoModel[10].setRotationPoint(2.0F, 0.25F, 3.6F);
/*     */     
/* 308 */     this.ammoModel[11].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 309 */     this.ammoModel[11].setRotationPoint(1.0F, 1.5F, 3.5F);
/*     */     
/* 311 */     this.ammoModel[12].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 312 */     this.ammoModel[12].setRotationPoint(2.0F, 1.25F, 3.75F);
/*     */     
/* 314 */     this.ammoModel[13].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 315 */     this.ammoModel[13].setRotationPoint(2.0F, 5.25F, 3.15F);
/*     */     
/* 317 */     this.ammoModel[14].addBox(7.0F, -6.0F, 0.0F, 5, 3, 2, 0.0F);
/* 318 */     this.ammoModel[14].setRotationPoint(1.0F, 1.0F, -1.0F);
/*     */     
/* 320 */     this.ammoModel[15].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 321 */     this.ammoModel[15].setRotationPoint(0.0F, 4.0F, 0.5F);
/*     */     
/* 323 */     this.ammoModel[16].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 324 */     this.ammoModel[16].setRotationPoint(0.0F, 4.0F, 2.5F);
/*     */     
/* 326 */     this.ammoModel[17].addShapeBox(7.0F, -6.0F, 0.0F, 7, 8, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 327 */     this.ammoModel[17].setRotationPoint(0.0F, 3.0F, -0.5F);
/*     */     
/* 329 */     this.ammoModel[18].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 330 */     this.ammoModel[18].setRotationPoint(0.0F, 4.0F, -2.5F);
/*     */     
/* 332 */     this.ammoModel[19].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 333 */     this.ammoModel[19].setRotationPoint(0.0F, 4.0F, -4.5F);
/*     */     
/* 335 */     this.ammoModel[20].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 336 */     this.ammoModel[20].setRotationPoint(0.0F, 6.0F, -4.5F);
/*     */     
/* 338 */     this.ammoModel[21].addShapeBox(7.0F, -6.0F, 0.0F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 339 */     this.ammoModel[21].setRotationPoint(0.0F, 8.0F, 0.5F);
/*     */     
/* 341 */     this.ammoModel[22].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 342 */     this.ammoModel[22].setRotationPoint(0.0F, 9.0F, 0.5F);
/*     */     
/* 344 */     this.ammoModel[23].addShapeBox(7.0F, -6.0F, 0.5F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 345 */     this.ammoModel[23].setRotationPoint(0.0F, 8.0F, -5.5F);
/*     */     
/* 347 */     this.ammoModel[24].addShapeBox(7.0F, -6.0F, 0.0F, 7, 2, 4, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 348 */     this.ammoModel[24].setRotationPoint(0.0F, 9.0F, -4.5F);
/*     */     
/* 350 */     this.ammoModel[25].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 351 */     this.ammoModel[25].setRotationPoint(1.0F, 2.5F, 3.3F);
/*     */     
/* 353 */     this.ammoModel[26].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 354 */     this.ammoModel[26].setRotationPoint(2.0F, 2.25F, 3.55F);
/*     */     
/* 356 */     this.ammoModel[27].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 357 */     this.ammoModel[27].setRotationPoint(1.0F, 3.5F, 3.15F);
/*     */     
/* 359 */     this.ammoModel[28].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 360 */     this.ammoModel[28].setRotationPoint(2.0F, 3.25F, 3.4F);
/*     */     
/* 362 */     this.ammoModel[29].addBox(7.0F, -6.0F, 0.0F, 5, 1, 1, 0.0F);
/* 363 */     this.ammoModel[29].setRotationPoint(1.0F, 4.5F, 3.0F);
/*     */     
/* 365 */     this.ammoModel[30].addBox(7.0F, -6.0F, 0.0F, 1, 1, 1, 0.0F);
/* 366 */     this.ammoModel[30].setRotationPoint(2.0F, 4.25F, 3.25F);
/*     */     
/*     */ 
/*     */ 
/* 370 */     translateAll(0.0F, -5.5F, 0.0F);
/* 371 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.13F, 0.0F);
/*     */     
/*     */ 
/* 374 */     this.gunSlideDistance = 0.0F;
/* 375 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 378 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelnegev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */