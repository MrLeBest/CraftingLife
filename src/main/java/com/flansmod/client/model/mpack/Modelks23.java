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
/*     */ public class Modelks23
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelks23()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[36];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*     */     
/*  59 */     this.gunModel[0].addBox(24.0F, -8.5F, -2.0F, 26, 4, 4, 0.0F);
/*  60 */     this.gunModel[0].setRotationPoint(-24.0F, -0.25F, 0.0F);
/*     */     
/*  62 */     this.gunModel[1].addBox(34.0F, -8.5F, -2.0F, 55, 3, 3, 0.0F);
/*  63 */     this.gunModel[1].setRotationPoint(-8.0F, -3.75F, 0.5F);
/*     */     
/*  65 */     this.gunModel[2].addBox(34.0F, -8.5F, -2.0F, 36, 3, 3, 0.0F);
/*  66 */     this.gunModel[2].setRotationPoint(-8.0F, 0.25F, 0.5F);
/*     */     
/*  68 */     this.gunModel[3].addBox(34.0F, -8.5F, -2.0F, 2, 8, 4, 0.0F);
/*  69 */     this.gunModel[3].setRotationPoint(25.0F, -4.25F, 0.0F);
/*     */     
/*  71 */     this.gunModel[4].addBox(34.0F, -8.5F, -2.0F, 3, 4, 4, 0.0F);
/*  72 */     this.gunModel[4].setRotationPoint(-11.0F, -4.25F, 0.0F);
/*     */     
/*  74 */     this.gunModel[5].addBox(34.0F, -8.5F, -2.0F, 1, 3, 4, 0.0F);
/*  75 */     this.gunModel[5].setRotationPoint(-34.0F, -3.25F, 0.0F);
/*     */     
/*  77 */     this.gunModel[6].addBox(34.0F, -8.5F, -2.0F, 13, 3, 4, 0.0F);
/*  78 */     this.gunModel[6].setRotationPoint(-33.0F, -3.25F, 0.0F);
/*     */     
/*  80 */     this.gunModel[7].addBox(34.0F, -8.5F, -2.0F, 5, 1, 4, 0.0F);
/*  81 */     this.gunModel[7].setRotationPoint(-16.0F, -4.25F, 0.0F);
/*     */     
/*  83 */     this.gunModel[8].addFlexBox(34.0F, -8.5F, -2.0F, 4, 1, 4, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 4);
/*  84 */     this.gunModel[8].setRotationPoint(-34.0F, -4.25F, 0.0F);
/*     */     
/*  86 */     this.gunModel[9].addFlexBox(34.0F, -8.5F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  87 */     this.gunModel[9].setRotationPoint(-34.0F, 3.75F, 1.0F);
/*     */     
/*  89 */     this.gunModel[10].addFlexBox(34.0F, -8.5F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  90 */     this.gunModel[10].setRotationPoint(-31.0F, 3.25F, 1.5F);
/*     */     
/*  92 */     this.gunModel[11].addBox(34.0F, -8.5F, -2.0F, 9, 3, 1, 0.0F);
/*  93 */     this.gunModel[11].setRotationPoint(-20.0F, -3.25F, 3.0F);
/*     */     
/*  95 */     this.gunModel[12].addBox(34.0F, -8.5F, -2.0F, 9, 3, 1, 0.0F);
/*  96 */     this.gunModel[12].setRotationPoint(-20.0F, -3.25F, 0.5F);
/*     */     
/*  98 */     this.gunModel[13].addBox(34.0F, -8.5F, -2.0F, 14, 1, 4, 0.0F);
/*  99 */     this.gunModel[13].setRotationPoint(-30.0F, -4.25F, 0.0F);
/*     */     
/* 101 */     this.gunModel[14].addShapeBox(34.0F, -8.5F, -2.0F, 7, 5, 4, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 102 */     this.gunModel[14].setRotationPoint(-41.0F, -3.25F, 0.0F);
/*     */     
/* 104 */     this.gunModel[15].addFlexBox(34.0F, -8.5F, -2.0F, 11, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 105 */     this.gunModel[15].setRotationPoint(-45.0F, 1.75F, 0.0F);
/*     */     
/* 107 */     this.gunModel[16].addShapeBox(34.0F, -8.5F, -2.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 108 */     this.gunModel[16].setRotationPoint(-40.0F, 3.75F, 0.0F);
/*     */     
/* 110 */     this.gunModel[17].addShapeBox(34.0F, -8.5F, -2.0F, 3, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 111 */     this.gunModel[17].setRotationPoint(-43.0F, 6.75F, 0.0F);
/*     */     
/* 113 */     this.gunModel[18].addFlexBox(34.0F, -8.5F, -2.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 114 */     this.gunModel[18].setRotationPoint(-43.0F, 3.75F, 0.0F);
/*     */     
/* 116 */     this.gunModel[19].addFlexBox(34.0F, -8.5F, -2.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4);
/* 117 */     this.gunModel[19].setRotationPoint(-45.0F, 0.75F, 0.0F);
/*     */     
/* 119 */     this.gunModel[20].addShapeBox(34.0F, -8.5F, -2.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[20].setRotationPoint(-47.0F, 9.75F, 0.0F);
/*     */     
/* 122 */     this.gunModel[21].addShapeBox(34.0F, -8.5F, -2.0F, 25, 2, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[21].setRotationPoint(-70.0F, 0.75F, 0.0F);
/*     */     
/* 125 */     this.gunModel[22].addFlexBox(34.0F, -8.5F, -2.0F, 2, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 126 */     this.gunModel[22].setRotationPoint(-45.0F, 3.75F, 0.0F);
/*     */     
/* 128 */     this.gunModel[23].addShapeBox(34.0F, -8.5F, -2.0F, 23, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 129 */     this.gunModel[23].setRotationPoint(-70.0F, 9.75F, 0.0F);
/*     */     
/* 131 */     this.gunModel[24].addFlexBox(34.0F, -8.5F, -2.0F, 25, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 132 */     this.gunModel[24].setRotationPoint(-70.0F, 2.75F, 0.0F);
/*     */     
/* 134 */     this.gunModel[25].addFlexBox(34.0F, -8.5F, -2.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 135 */     this.gunModel[25].setRotationPoint(-33.0F, 6.75F, 1.0F);
/*     */     
/* 137 */     this.gunModel[26].addShapeBox(34.0F, -8.5F, -2.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 138 */     this.gunModel[26].setRotationPoint(-26.0F, 3.75F, 1.0F);
/*     */     
/* 140 */     this.gunModel[27].addShapeBox(34.0F, -8.5F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 141 */     this.gunModel[27].setRotationPoint(-34.0F, 6.75F, 1.0F);
/*     */     
/* 143 */     this.gunModel[28].addFlexBox(34.0F, -8.5F, -2.0F, 0, 1, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 144 */     this.gunModel[28].setRotationPoint(-26.0F, 3.75F, 1.0F);
/*     */     
/* 146 */     this.gunModel[29].addFlexBox(34.0F, -8.5F, -2.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 147 */     this.gunModel[29].setRotationPoint(-27.0F, 5.75F, 1.0F);
/*     */     
/* 149 */     this.gunModel[30].addBox(24.0F, -8.5F, -2.0F, 22, 2, 5, 0.0F);
/* 150 */     this.gunModel[30].setRotationPoint(-20.5F, 0.75F, -0.5F);
/*     */     
/* 152 */     this.gunModel[31].addShapeBox(34.0F, -8.5F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 153 */     this.gunModel[31].setRotationPoint(47.0F, -5.25F, 1.5F);
/*     */     
/* 155 */     this.gunModel[32].addBox(34.0F, -8.5F, -2.0F, 3, 4, 4, 0.0F);
/* 156 */     this.gunModel[32].setRotationPoint(47.0F, -4.25F, 0.0F);
/*     */     
/* 158 */     this.gunModel[33].addShapeBox(34.0F, -8.5F, -2.0F, 3, 1, 1, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 159 */     this.gunModel[33].setRotationPoint(44.0F, -5.25F, 1.5F);
/*     */     
/* 161 */     this.gunModel[34].addShapeBox(34.0F, -8.5F, -2.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 162 */     this.gunModel[34].setRotationPoint(47.0F, -6.25F, 1.5F);
/*     */     
/* 164 */     this.gunModel[35].addShapeBox(34.0F, -8.5F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 165 */     this.gunModel[35].setRotationPoint(44.0F, -4.25F, 1.5F);
/*     */     
/*     */ 
/* 168 */     this.ammoModel = new ModelRendererTurbo[1];
/* 169 */     this.ammoModel[0] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/*     */     
/* 171 */     this.ammoModel[0].addBox(34.0F, -7.5F, -2.0F, 9, 3, 3, 0.0F);
/* 172 */     this.ammoModel[0].setRotationPoint(-20.0F, -0.45F, 0.5F);
/*     */     
/*     */ 
/* 175 */     this.pumpModel = new ModelRendererTurbo[21];
/* 176 */     this.pumpModel[0] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 177 */     this.pumpModel[1] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/* 178 */     this.pumpModel[2] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/* 179 */     this.pumpModel[3] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 180 */     this.pumpModel[4] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/* 181 */     this.pumpModel[5] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/* 182 */     this.pumpModel[6] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/* 183 */     this.pumpModel[7] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/* 184 */     this.pumpModel[8] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/* 185 */     this.pumpModel[9] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 186 */     this.pumpModel[10] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/* 187 */     this.pumpModel[11] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/* 188 */     this.pumpModel[12] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/* 189 */     this.pumpModel[13] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 190 */     this.pumpModel[14] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 191 */     this.pumpModel[15] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 192 */     this.pumpModel[16] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 193 */     this.pumpModel[17] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/* 194 */     this.pumpModel[18] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/* 195 */     this.pumpModel[19] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 196 */     this.pumpModel[20] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*     */     
/* 198 */     this.pumpModel[0].addBox(34.0F, -8.5F, -2.0F, 2, 6, 6, 0.0F);
/* 199 */     this.pumpModel[0].setRotationPoint(-7.5F, -1.0F, -1.0F);
/*     */     
/* 201 */     this.pumpModel[1].addBox(34.0F, -8.5F, -2.0F, 2, 5, 5, 0.0F);
/* 202 */     this.pumpModel[1].setRotationPoint(-5.5F, -1.0F, -0.5F);
/*     */     
/* 204 */     this.pumpModel[2].addBox(34.0F, -8.5F, -2.0F, 1, 6, 6, 0.0F);
/* 205 */     this.pumpModel[2].setRotationPoint(-3.5F, -1.0F, -1.0F);
/*     */     
/* 207 */     this.pumpModel[3].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 208 */     this.pumpModel[3].setRotationPoint(-2.5F, -1.0F, -0.5F);
/*     */     
/* 210 */     this.pumpModel[4].addBox(34.0F, -8.5F, -2.0F, 1, 6, 6, 0.0F);
/* 211 */     this.pumpModel[4].setRotationPoint(-1.5F, -1.0F, -1.0F);
/*     */     
/* 213 */     this.pumpModel[5].addBox(34.0F, -8.5F, -2.0F, 1, 5, 6, 0.0F);
/* 214 */     this.pumpModel[5].setRotationPoint(0.5F, -1.0F, -1.0F);
/*     */     
/* 216 */     this.pumpModel[6].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 217 */     this.pumpModel[6].setRotationPoint(-0.5F, -1.0F, -0.5F);
/*     */     
/* 219 */     this.pumpModel[7].addBox(34.0F, -8.5F, -2.0F, 1, 5, 6, 0.0F);
/* 220 */     this.pumpModel[7].setRotationPoint(2.5F, -1.0F, -1.0F);
/*     */     
/* 222 */     this.pumpModel[8].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 223 */     this.pumpModel[8].setRotationPoint(1.5F, -1.0F, -0.5F);
/*     */     
/* 225 */     this.pumpModel[9].addBox(34.0F, -8.5F, -2.0F, 1, 5, 6, 0.0F);
/* 226 */     this.pumpModel[9].setRotationPoint(4.5F, -1.0F, -1.0F);
/*     */     
/* 228 */     this.pumpModel[10].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 229 */     this.pumpModel[10].setRotationPoint(3.5F, -1.0F, -0.5F);
/*     */     
/* 231 */     this.pumpModel[11].addBox(34.0F, -8.5F, -2.0F, 1, 5, 6, 0.0F);
/* 232 */     this.pumpModel[11].setRotationPoint(6.5F, -1.0F, -1.0F);
/*     */     
/* 234 */     this.pumpModel[12].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 235 */     this.pumpModel[12].setRotationPoint(5.5F, -1.0F, -0.5F);
/*     */     
/* 237 */     this.pumpModel[13].addBox(34.0F, -8.5F, -2.0F, 3, 5, 5, 0.0F);
/* 238 */     this.pumpModel[13].setRotationPoint(13.5F, -1.0F, -0.5F);
/*     */     
/* 240 */     this.pumpModel[14].addBox(34.0F, -8.5F, -2.0F, 8, 5, 4, 0.0F);
/* 241 */     this.pumpModel[14].setRotationPoint(16.5F, -1.25F, 0.0F);
/*     */     
/* 243 */     this.pumpModel[15].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 244 */     this.pumpModel[15].setRotationPoint(7.5F, -1.0F, -0.5F);
/*     */     
/* 246 */     this.pumpModel[16].addBox(34.0F, -8.5F, -2.0F, 1, 5, 6, 0.0F);
/* 247 */     this.pumpModel[16].setRotationPoint(8.5F, -1.0F, -1.0F);
/*     */     
/* 249 */     this.pumpModel[17].addBox(34.0F, -8.5F, -2.0F, 1, 5, 6, 0.0F);
/* 250 */     this.pumpModel[17].setRotationPoint(12.5F, -1.0F, -1.0F);
/*     */     
/* 252 */     this.pumpModel[18].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 253 */     this.pumpModel[18].setRotationPoint(11.5F, -1.0F, -0.5F);
/*     */     
/* 255 */     this.pumpModel[19].addBox(34.0F, -8.5F, -2.0F, 1, 5, 6, 0.0F);
/* 256 */     this.pumpModel[19].setRotationPoint(10.5F, -1.0F, -1.0F);
/*     */     
/* 258 */     this.pumpModel[20].addBox(34.0F, -8.5F, -2.0F, 1, 5, 5, 0.0F);
/* 259 */     this.pumpModel[20].setRotationPoint(9.5F, -1.0F, -0.5F);
/*     */     
/*     */ 
/* 262 */     translateAll(0.0F, -8.0F, 0.0F);
/* 263 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/*     */ 
/* 266 */     this.gunSlideDistance = 0.0F;
/* 267 */     this.animationType = EnumAnimationType.SHOTGUN;
/* 268 */     this.pumpDelayAfterReload = 105;
/* 269 */     this.pumpDelay = 7;
/* 270 */     this.pumpTime = 20;
/* 271 */     this.gripIsOnPump = true;
/* 272 */     this.pumpHandleDistance = 0.5F;
/* 273 */     this.numBulletsInReloadAnimation = 3.0F;
/* 274 */     this.tiltGunTime = 0.159F;
/* 275 */     this.unloadClipTime = 0.0F;
/* 276 */     this.loadClipTime = 0.55F;
/* 277 */     this.untiltGunTime = 0.133F;
/*     */     
/*     */ 
/*     */ 
/* 281 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelks23.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */