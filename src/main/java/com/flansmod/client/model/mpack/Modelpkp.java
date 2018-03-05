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
/*     */ public class Modelpkp
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelpkp()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[70];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*     */     
/*  93 */     this.gunModel[0].addBox(18.0F, -11.0F, -0.5F, 25, 4, 4, 0.0F);
/*  94 */     this.gunModel[0].setRotationPoint(-20.0F, 0.0F, -1.5F);
/*     */     
/*  96 */     this.gunModel[1].addBox(18.0F, -11.0F, -0.5F, 4, 4, 4, 0.0F);
/*  97 */     this.gunModel[1].setRotationPoint(5.0F, 0.0F, -1.5F);
/*     */     
/*  99 */     this.gunModel[2].addBox(18.0F, -11.0F, -0.5F, 38, 2, 2, 0.0F);
/* 100 */     this.gunModel[2].setRotationPoint(5.0F, -1.5F, -0.5F);
/*     */     
/* 102 */     this.gunModel[3].addBox(18.0F, -11.0F, -0.5F, 10, 2, 2, 0.0F);
/* 103 */     this.gunModel[3].setRotationPoint(15.0F, 1.5F, -0.5F);
/*     */     
/* 105 */     this.gunModel[4].addBox(18.0F, -11.0F, -0.5F, 2, 3, 3, 0.0F);
/* 106 */     this.gunModel[4].setRotationPoint(27.0F, -2.5F, -1.0F);
/*     */     
/* 108 */     this.gunModel[5].addBox(18.0F, -11.0F, -0.5F, 2, 3, 2, 0.0F);
/* 109 */     this.gunModel[5].setRotationPoint(27.0F, 0.5F, -0.5F);
/*     */     
/* 111 */     this.gunModel[6].addBox(18.0F, -11.0F, -0.5F, 2, 2, 2, 0.0F);
/* 112 */     this.gunModel[6].setRotationPoint(29.0F, 1.5F, -0.5F);
/*     */     
/* 114 */     this.gunModel[7].addBox(18.0F, -11.0F, -0.5F, 2, 1, 2, 0.0F);
/* 115 */     this.gunModel[7].setRotationPoint(38.0F, -2.5F, -0.5F);
/*     */     
/* 117 */     this.gunModel[8].addBox(18.0F, -11.0F, -0.5F, 2, 3, 3, 0.0F);
/* 118 */     this.gunModel[8].setRotationPoint(25.0F, 1.0F, -1.0F);
/*     */     
/* 120 */     this.gunModel[9].addBox(18.0F, -11.0F, -0.5F, 2, 14, 2, 0.0F);
/* 121 */     this.gunModel[9].setRotationPoint(25.0F, 2.5F, -3.0F);
/* 122 */     this.gunModel[9].rotateAngleX = -0.2617994F;
/*     */     
/* 124 */     this.gunModel[10].addBox(18.0F, -11.0F, -0.5F, 2, 14, 2, 0.0F);
/* 125 */     this.gunModel[10].setRotationPoint(25.0F, 2.5F, 2.0F);
/* 126 */     this.gunModel[10].rotateAngleX = 0.2617994F;
/*     */     
/* 128 */     this.gunModel[11].addBox(18.0F, -11.0F, -0.5F, 3, 2, 4, 0.0F);
/* 129 */     this.gunModel[11].setRotationPoint(2.0F, -2.0F, -1.5F);
/*     */     
/* 131 */     this.gunModel[12].addBox(18.0F, -11.0F, -0.5F, 1, 2, 4, 0.0F);
/* 132 */     this.gunModel[12].setRotationPoint(-20.0F, -2.0F, -1.5F);
/*     */     
/* 134 */     this.gunModel[13].addBox(18.0F, -11.0F, -0.5F, 15, 1, 4, 0.0F);
/* 135 */     this.gunModel[13].setRotationPoint(-19.0F, -3.0F, -1.5F);
/*     */     
/* 137 */     this.gunModel[14].addBox(18.0F, -11.0F, -0.5F, 14, 1, 4, 0.0F);
/* 138 */     this.gunModel[14].setRotationPoint(-10.0F, -4.0F, -1.5F);
/*     */     
/* 140 */     this.gunModel[15].addBox(18.0F, -11.0F, -0.5F, 12, 1, 2, 0.0F);
/* 141 */     this.gunModel[15].setRotationPoint(-9.0F, -5.0F, -0.5F);
/*     */     
/* 143 */     this.gunModel[16].addShapeBox(18.0F, -11.0F, -0.5F, 3, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 144 */     this.gunModel[16].setRotationPoint(-18.0F, 5.0F, -1.0F);
/*     */     
/* 146 */     this.gunModel[17].addFlexBox(18.0F, -11.0F, -0.5F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 147 */     this.gunModel[17].setRotationPoint(-16.0F, 7.0F, -0.5F);
/*     */     
/* 149 */     this.gunModel[18].addFlexBox(18.0F, -11.0F, -0.5F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 150 */     this.gunModel[18].setRotationPoint(-18.0F, 4.0F, -1.0F);
/*     */     
/* 152 */     this.gunModel[19].addFlexBox(18.0F, -11.0F, -0.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 153 */     this.gunModel[19].setRotationPoint(-12.0F, 5.0F, -0.5F);
/*     */     
/* 155 */     this.gunModel[20].addFlexBox(18.0F, -11.0F, -0.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 156 */     this.gunModel[20].setRotationPoint(-14.0F, 4.5F, 0.0F);
/*     */     
/* 158 */     this.gunModel[21].addBox(18.0F, -11.0F, -0.5F, 6, 3, 2, 0.0F);
/* 159 */     this.gunModel[21].setRotationPoint(-4.0F, -3.0F, 0.5F);
/*     */     
/* 161 */     this.gunModel[22].addBox(18.0F, -11.0F, -0.5F, 1, 1, 4, 0.0F);
/* 162 */     this.gunModel[22].setRotationPoint(4.0F, -4.0F, -1.5F);
/*     */     
/* 164 */     this.gunModel[23].addShapeBox(18.0F, -11.0F, -0.5F, 9, 1, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 165 */     this.gunModel[23].setRotationPoint(-5.0F, -4.0F, -3.5F);
/*     */     
/* 167 */     this.gunModel[24].addBox(18.0F, -11.0F, -0.5F, 6, 1, 1, 0.0F);
/* 168 */     this.gunModel[24].setRotationPoint(-4.0F, -1.0F, -1.5F);
/*     */     
/* 170 */     this.gunModel[25].addShapeBox(18.0F, -11.0F, -0.5F, 10, 3, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 171 */     this.gunModel[25].setRotationPoint(9.0F, 0.75F, -1.0F);
/*     */     
/* 173 */     this.gunModel[26].addBox(18.0F, -11.0F, -0.5F, 6, 2, 3, 0.0F);
/* 174 */     this.gunModel[26].setRotationPoint(-26.0F, 1.0F, -1.0F);
/*     */     
/* 176 */     this.gunModel[27].addShapeBox(18.0F, -11.0F, -0.5F, 6, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 177 */     this.gunModel[27].setRotationPoint(-26.0F, 0.0F, -1.5F);
/*     */     
/* 179 */     this.gunModel[28].addShapeBox(18.0F, -11.0F, -0.5F, 6, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 180 */     this.gunModel[28].setRotationPoint(-26.0F, 3.0F, -1.5F);
/*     */     
/* 182 */     this.gunModel[29].addBox(18.0F, -11.0F, -0.5F, 15, 2, 4, 0.0F);
/* 183 */     this.gunModel[29].setRotationPoint(-19.0F, -2.0F, -1.5F);
/*     */     
/* 185 */     this.gunModel[30].addBox(18.0F, -11.0F, -0.5F, 2, 1, 4, 0.0F);
/* 186 */     this.gunModel[30].setRotationPoint(2.0F, -3.0F, -1.5F);
/*     */     
/* 188 */     this.gunModel[31].addBox(18.0F, -11.0F, -0.5F, 1, 1, 4, 0.0F);
/* 189 */     this.gunModel[31].setRotationPoint(4.0F, -3.0F, -1.5F);
/*     */     
/* 191 */     this.gunModel[32].addShapeBox(18.0F, -11.0F, -0.5F, 10, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 192 */     this.gunModel[32].setRotationPoint(-37.0F, -1.0F, -1.0F);
/*     */     
/* 194 */     this.gunModel[33].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 195 */     this.gunModel[33].setRotationPoint(-27.0F, -1.0F, -1.0F);
/*     */     
/* 197 */     this.gunModel[34].addShapeBox(18.0F, -11.0F, -0.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 198 */     this.gunModel[34].setRotationPoint(-29.0F, 0.0F, -1.0F);
/*     */     
/* 200 */     this.gunModel[35].addBox(18.0F, -11.0F, -0.5F, 2, 3, 3, 0.0F);
/* 201 */     this.gunModel[35].setRotationPoint(-28.0F, 1.0F, -1.0F);
/*     */     
/* 203 */     this.gunModel[36].addShapeBox(18.0F, -11.0F, -0.5F, 3, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 204 */     this.gunModel[36].setRotationPoint(-29.0F, 4.0F, -1.0F);
/*     */     
/* 206 */     this.gunModel[37].addShapeBox(18.0F, -11.0F, -0.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 207 */     this.gunModel[37].setRotationPoint(-31.0F, 6.0F, -1.0F);
/*     */     
/* 209 */     this.gunModel[38].addShapeBox(18.0F, -11.0F, -0.5F, 8, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 210 */     this.gunModel[38].setRotationPoint(-37.0F, 5.0F, -1.0F);
/*     */     
/* 212 */     this.gunModel[39].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[39].setRotationPoint(-29.0F, 3.0F, -1.0F);
/*     */     
/* 215 */     this.gunModel[40].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[40].setRotationPoint(-30.0F, 4.0F, -1.0F);
/*     */     
/* 218 */     this.gunModel[41].addShapeBox(18.0F, -11.0F, -0.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 219 */     this.gunModel[41].setRotationPoint(-37.0F, 6.0F, -1.0F);
/*     */     
/* 221 */     this.gunModel[42].addBox(18.0F, -11.0F, -0.5F, 2, 9, 3, 0.0F);
/* 222 */     this.gunModel[42].setRotationPoint(-39.0F, -1.0F, -1.0F);
/*     */     
/* 224 */     this.gunModel[43].addShapeBox(18.0F, -11.0F, -0.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 225 */     this.gunModel[43].setRotationPoint(-37.0F, 0.0F, -1.0F);
/*     */     
/* 227 */     this.gunModel[44].addShapeBox(18.0F, -11.0F, -0.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 228 */     this.gunModel[44].setRotationPoint(-37.0F, 3.0F, -1.0F);
/*     */     
/* 230 */     this.gunModel[45].addShapeBox(18.0F, -11.0F, -0.5F, 9, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 231 */     this.gunModel[45].setRotationPoint(7.0F, -2.0F, 0.0F);
/*     */     
/* 233 */     this.gunModel[46].addShapeBox(18.0F, -11.0F, -0.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 234 */     this.gunModel[46].setRotationPoint(7.0F, -5.0F, -1.0F);
/*     */     
/* 236 */     this.gunModel[47].addShapeBox(18.0F, -11.0F, -0.5F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 237 */     this.gunModel[47].setRotationPoint(6.0F, -4.0F, 0.0F);
/*     */     
/* 239 */     this.gunModel[48].addBox(18.0F, -11.0F, -0.5F, 1, 2, 1, 0.0F);
/* 240 */     this.gunModel[48].setRotationPoint(15.0F, -4.0F, 0.0F);
/*     */     
/* 242 */     this.gunModel[49].addShapeBox(18.0F, -11.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 243 */     this.gunModel[49].setRotationPoint(16.0F, -5.0F, -1.0F);
/*     */     
/* 245 */     this.gunModel[50].addShapeBox(18.0F, -11.0F, -0.5F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 246 */     this.gunModel[50].setRotationPoint(7.0F, -5.0F, 0.0F);
/*     */     
/* 248 */     this.gunModel[51].addShapeBox(18.0F, -11.0F, -0.5F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 249 */     this.gunModel[51].setRotationPoint(7.0F, -5.0F, 1.0F);
/*     */     
/* 251 */     this.gunModel[52].addShapeBox(18.0F, -11.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 252 */     this.gunModel[52].setRotationPoint(16.0F, -5.0F, 0.0F);
/*     */     
/* 254 */     this.gunModel[53].addShapeBox(18.0F, -11.0F, -0.5F, 11, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 255 */     this.gunModel[53].setRotationPoint(16.0F, -5.0F, 1.0F);
/*     */     
/* 257 */     this.gunModel[54].addShapeBox(18.0F, -11.0F, -0.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 258 */     this.gunModel[54].setRotationPoint(6.0F, -4.0F, -1.0F);
/*     */     
/* 260 */     this.gunModel[55].addShapeBox(18.0F, -11.0F, -0.5F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 261 */     this.gunModel[55].setRotationPoint(6.0F, -4.0F, 1.0F);
/*     */     
/* 263 */     this.gunModel[56].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 1, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 264 */     this.gunModel[56].setRotationPoint(6.0F, -5.0F, 1.0F);
/*     */     
/* 266 */     this.gunModel[57].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 1, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 267 */     this.gunModel[57].setRotationPoint(6.0F, -5.0F, 0.0F);
/*     */     
/* 269 */     this.gunModel[58].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 270 */     this.gunModel[58].setRotationPoint(6.0F, -5.0F, -1.0F);
/*     */     
/* 272 */     this.gunModel[59].addShapeBox(18.0F, -11.0F, -0.5F, 10, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 273 */     this.gunModel[59].setRotationPoint(6.0F, -2.0F, 1.0F);
/*     */     
/* 275 */     this.gunModel[60].addShapeBox(18.0F, -11.0F, -0.5F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 276 */     this.gunModel[60].setRotationPoint(6.0F, -2.0F, -1.0F);
/*     */     
/* 278 */     this.gunModel[61].addShapeBox(18.0F, -11.0F, -0.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 279 */     this.gunModel[61].setRotationPoint(38.0F, -4.5F, -0.5F);
/*     */     
/* 281 */     this.gunModel[62].addBox(18.0F, -11.0F, -0.5F, 1, 1, 2, 0.0F);
/* 282 */     this.gunModel[62].setRotationPoint(-10.0F, -5.0F, -0.5F);
/*     */     
/* 284 */     this.gunModel[63].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 285 */     this.gunModel[63].setRotationPoint(-10.0F, -6.0F, -0.5F);
/*     */     
/* 287 */     this.gunModel[64].addShapeBox(18.0F, -11.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 288 */     this.gunModel[64].setRotationPoint(-10.0F, -6.0F, 1.0F);
/*     */     
/* 290 */     this.gunModel[65].addShapeBox(18.0F, -11.0F, -0.5F, 4, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 291 */     this.gunModel[65].setRotationPoint(-14.0F, -5.0F, -0.5F);
/*     */     
/* 293 */     this.gunModel[66].addShapeBox(18.0F, -11.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 294 */     this.gunModel[66].setRotationPoint(38.0F, -5.5F, -1.0F);
/*     */     
/* 296 */     this.gunModel[67].addShapeBox(18.0F, -11.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 297 */     this.gunModel[67].setRotationPoint(38.0F, -5.5F, 0.15F);
/*     */     
/* 299 */     this.gunModel[68].addShapeBox(18.0F, -11.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 300 */     this.gunModel[68].setRotationPoint(38.0F, -5.5F, -0.43F);
/*     */     
/* 302 */     this.gunModel[69].addBox(18.0F, -11.0F, -0.5F, 1, 1, 2, 0.0F);
/* 303 */     this.gunModel[69].setRotationPoint(-6.5F, 1.5F, -3.5F);
/*     */     
/*     */ 
/* 306 */     this.ammoModel = new ModelRendererTurbo[9];
/* 307 */     this.ammoModel[0] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 308 */     this.ammoModel[1] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/* 309 */     this.ammoModel[2] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/* 310 */     this.ammoModel[3] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 311 */     this.ammoModel[4] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/* 312 */     this.ammoModel[5] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/* 313 */     this.ammoModel[6] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 314 */     this.ammoModel[7] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/* 315 */     this.ammoModel[8] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*     */     
/* 317 */     this.ammoModel[0].addShapeBox(18.0F, -11.0F, -0.5F, 8, 10, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 318 */     this.ammoModel[0].setRotationPoint(-5.0F, 4.0F, -8.5F);
/*     */     
/* 320 */     this.ammoModel[1].addBox(18.0F, -11.0F, -0.5F, 6, 2, 2, 0.0F);
/* 321 */     this.ammoModel[1].setRotationPoint(-4.0F, 1.0F, -4.5F);
/*     */     
/* 323 */     this.ammoModel[2].addBox(18.0F, -11.0F, -0.5F, 6, 2, 2, 0.0F);
/* 324 */     this.ammoModel[2].setRotationPoint(-4.0F, -1.0F, -3.5F);
/*     */     
/* 326 */     this.ammoModel[3].addBox(18.0F, -11.0F, -1.5F, 6, 2, 2, 0.0F);
/* 327 */     this.ammoModel[3].setRotationPoint(-4.0F, -3.0F, -0.5F);
/*     */     
/* 329 */     this.ammoModel[4].addBox(18.0F, -11.0F, -0.5F, 1, 2, 2, 0.0F);
/* 330 */     this.ammoModel[4].setRotationPoint(-2.0F, -1.25F, -3.75F);
/*     */     
/* 332 */     this.ammoModel[5].addBox(18.0F, -11.0F, -0.5F, 1, 2, 2, 0.0F);
/* 333 */     this.ammoModel[5].setRotationPoint(-2.0F, 0.75F, -4.75F);
/*     */     
/* 335 */     this.ammoModel[6].addShapeBox(18.0F, -11.0F, -0.5F, 1, 2, 2, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 336 */     this.ammoModel[6].setRotationPoint(-2.0F, -3.0F, -1.75F);
/*     */     
/* 338 */     this.ammoModel[7].addBox(18.0F, -11.0F, -0.5F, 6, 2, 2, 0.0F);
/* 339 */     this.ammoModel[7].setRotationPoint(-4.0F, 3.0F, -5.5F);
/*     */     
/* 341 */     this.ammoModel[8].addBox(18.0F, -11.0F, -0.5F, 1, 2, 2, 0.0F);
/* 342 */     this.ammoModel[8].setRotationPoint(-2.0F, 2.75F, -5.75F);
/*     */     
/*     */ 
/*     */ 
/* 346 */     translateAll(0.0F, -1.0F, 0.0F);
/* 347 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.03F, 0.0F);
/*     */     
/*     */ 
/* 350 */     this.gunSlideDistance = 0.0F;
/* 351 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 354 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelpkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */