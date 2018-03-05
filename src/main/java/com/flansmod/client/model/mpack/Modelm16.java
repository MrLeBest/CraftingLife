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
/*     */ public class Modelm16
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm16()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[72];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*     */     
/*  95 */     this.gunModel[0].addShapeBox(0.0F, -2.0F, -1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  96 */     this.gunModel[0].setRotationPoint(0.0F, -1.0F, 0.0F);
/*     */     
/*  98 */     this.gunModel[1].addShapeBox(0.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  99 */     this.gunModel[1].setRotationPoint(4.0F, 1.0F, 0.0F);
/*     */     
/* 101 */     this.gunModel[2].addShapeBox(0.0F, -2.0F, -1.0F, 5, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 102 */     this.gunModel[2].setRotationPoint(6.0F, -5.0F, 0.0F);
/*     */     
/* 104 */     this.gunModel[3].addShapeBox(0.0F, -2.0F, -1.0F, 8, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 105 */     this.gunModel[3].setRotationPoint(-2.0F, -5.0F, 0.0F);
/*     */     
/* 107 */     this.gunModel[4].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 108 */     this.gunModel[4].setRotationPoint(-1.0F, -1.0F, 0.0F);
/*     */     
/* 110 */     this.gunModel[5].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 111 */     this.gunModel[5].setRotationPoint(-2.0F, -1.0F, 0.0F);
/*     */     
/* 113 */     this.gunModel[6].addShapeBox(0.0F, -2.0F, -1.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 114 */     this.gunModel[6].setRotationPoint(-2.0F, -2.5F, 2.0F);
/*     */     
/* 116 */     this.gunModel[7].addShapeBox(0.0F, -2.0F, -1.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 117 */     this.gunModel[7].setRotationPoint(-2.0F, -3.5F, 2.0F);
/*     */     
/* 119 */     this.gunModel[8].addShapeBox(0.0F, -2.0F, -1.0F, 14, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 120 */     this.gunModel[8].setRotationPoint(-2.0F, -4.5F, 2.0F);
/*     */     
/* 122 */     this.gunModel[9].addShapeBox(0.0F, -2.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[9].setRotationPoint(2.0F, -3.5F, -1.0F);
/*     */     
/* 125 */     this.gunModel[10].addShapeBox(0.0F, -2.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 126 */     this.gunModel[10].setRotationPoint(2.0F, -4.5F, -1.0F);
/*     */     
/* 128 */     this.gunModel[11].addShapeBox(0.0F, -2.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 129 */     this.gunModel[11].setRotationPoint(2.0F, -2.5F, -1.0F);
/*     */     
/* 131 */     this.gunModel[12].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 132 */     this.gunModel[12].setRotationPoint(12.0F, -2.25F, -0.75F);
/*     */     
/* 134 */     this.gunModel[13].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 135 */     this.gunModel[13].setRotationPoint(12.0F, -3.75F, -0.75F);
/*     */     
/* 137 */     this.gunModel[14].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 138 */     this.gunModel[14].setRotationPoint(12.0F, -4.75F, -0.75F);
/*     */     
/* 140 */     this.gunModel[15].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 141 */     this.gunModel[15].setRotationPoint(12.0F, -2.25F, 1.75F);
/*     */     
/* 143 */     this.gunModel[16].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 144 */     this.gunModel[16].setRotationPoint(12.0F, -4.75F, 1.75F);
/*     */     
/* 146 */     this.gunModel[17].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 147 */     this.gunModel[17].setRotationPoint(12.0F, -4.25F, 0.25F);
/*     */     
/* 149 */     this.gunModel[18].addShapeBox(0.0F, -2.0F, -1.0F, 5, 1, 2, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 150 */     this.gunModel[18].setRotationPoint(-1.0F, -6.0F, 0.0F);
/*     */     
/* 152 */     this.gunModel[19].addShapeBox(0.0F, -2.0F, -1.0F, 19, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 153 */     this.gunModel[19].setRotationPoint(13.0F, -2.25F, -0.75F);
/*     */     
/* 155 */     this.gunModel[20].addShapeBox(0.0F, -2.0F, -1.0F, 19, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 156 */     this.gunModel[20].setRotationPoint(13.0F, -4.75F, -0.75F);
/*     */     
/* 158 */     this.gunModel[21].addShapeBox(0.0F, -2.0F, -1.0F, 19, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F);
/* 159 */     this.gunModel[21].setRotationPoint(13.0F, -2.25F, 1.75F);
/*     */     
/* 161 */     this.gunModel[22].addShapeBox(0.0F, -2.0F, -1.0F, 19, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 162 */     this.gunModel[22].setRotationPoint(13.0F, -4.75F, 1.75F);
/*     */     
/* 164 */     this.gunModel[23].addShapeBox(0.0F, -2.0F, -1.0F, 19, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F);
/* 165 */     this.gunModel[23].setRotationPoint(13.0F, -3.75F, -0.5F);
/*     */     
/* 167 */     this.gunModel[24].addShapeBox(0.0F, -2.0F, -1.0F, 19, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 168 */     this.gunModel[24].setRotationPoint(13.0F, -4.75F, 0.75F);
/*     */     
/* 170 */     this.gunModel[25].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 171 */     this.gunModel[25].setRotationPoint(12.0F, -3.75F, 1.25F);
/*     */     
/* 173 */     this.gunModel[26].addShapeBox(0.0F, -2.0F, -1.0F, 19, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 174 */     this.gunModel[26].setRotationPoint(13.0F, -2.25F, 0.75F);
/*     */     
/* 176 */     this.gunModel[27].addShapeBox(0.0F, -2.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 177 */     this.gunModel[27].setRotationPoint(32.0F, -3.25F, 0.75F);
/*     */     
/* 179 */     this.gunModel[28].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, -1.0F, 2.0F, 0.5F, 0.5F, 2.0F, 0.5F, 0.5F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 180 */     this.gunModel[28].setRotationPoint(32.0F, -5.75F, 0.75F);
/*     */     
/* 182 */     this.gunModel[29].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 2.0F, 0.5F, -0.5F, 2.0F, 0.5F, -0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 183 */     this.gunModel[29].setRotationPoint(33.5F, -5.75F, 0.75F);
/*     */     
/* 185 */     this.gunModel[30].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 186 */     this.gunModel[30].setRotationPoint(33.0F, -7.75F, -0.5F);
/*     */     
/* 188 */     this.gunModel[31].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 189 */     this.gunModel[31].setRotationPoint(33.0F, -8.25F, 0.75F);
/*     */     
/* 191 */     this.gunModel[32].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 192 */     this.gunModel[32].setRotationPoint(33.0F, -8.25F, 0.1F);
/*     */     
/* 194 */     this.gunModel[33].addShapeBox(0.0F, -2.0F, -1.0F, 18, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 195 */     this.gunModel[33].setRotationPoint(-20.0F, -4.0F, 0.0F);
/*     */     
/* 197 */     this.gunModel[34].addShapeBox(0.0F, -2.0F, -1.0F, 18, 4, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.05F, 0.0F, -3.0F, -0.05F, 0.0F, -3.0F, -0.05F, 0.0F, 0.0F, -0.05F);
/* 198 */     this.gunModel[34].setRotationPoint(-20.0F, -1.5F, 0.0F);
/*     */     
/* 200 */     this.gunModel[35].addShapeBox(0.0F, -2.0F, -1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 201 */     this.gunModel[35].setRotationPoint(3.0F, -1.0F, 0.0F);
/*     */     
/* 203 */     this.gunModel[36].addShapeBox(0.0F, -2.0F, -1.0F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 204 */     this.gunModel[36].setRotationPoint(-2.0F, -2.0F, 0.0F);
/*     */     
/* 206 */     this.gunModel[37].addShapeBox(0.0F, -2.0F, -1.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 207 */     this.gunModel[37].setRotationPoint(11.0F, -5.0F, 0.0F);
/*     */     
/* 209 */     this.gunModel[38].addShapeBox(0.0F, -2.0F, -1.0F, 5, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 210 */     this.gunModel[38].setRotationPoint(-2.0F, 2.0F, 0.0F);
/*     */     
/* 212 */     this.gunModel[39].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[39].setRotationPoint(3.0F, 1.0F, 0.0F);
/*     */     
/* 215 */     this.gunModel[40].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 216 */     this.gunModel[40].setRotationPoint(3.0F, 0.0F, 0.0F);
/*     */     
/* 218 */     this.gunModel[41].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 219 */     this.gunModel[41].setRotationPoint(3.35F, -0.5F, 0.5F);
/*     */     
/* 221 */     this.gunModel[42].addShapeBox(0.0F, -2.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 222 */     this.gunModel[42].setRotationPoint(6.0F, 0.0F, 2.0F);
/*     */     
/* 224 */     this.gunModel[43].addShapeBox(0.0F, -2.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 225 */     this.gunModel[43].setRotationPoint(6.0F, 0.0F, -0.15F);
/*     */     
/* 227 */     this.gunModel[44].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.9F, 0.45F, -0.9F, -0.9F, 0.45F, -0.9F, -0.9F, -0.15F, 0.0F, -0.9F, -0.15F, 0.0F, 0.0F, 0.45F, -0.9F, 0.0F, 0.45F, -0.9F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 228 */     this.gunModel[44].setRotationPoint(11.0F, 0.0F, 0.3F);
/*     */     
/* 230 */     this.gunModel[45].addShapeBox(0.0F, -2.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 231 */     this.gunModel[45].setRotationPoint(-1.0F, -3.5F, -1.0F);
/*     */     
/* 233 */     this.gunModel[46].addShapeBox(0.0F, -2.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 234 */     this.gunModel[46].setRotationPoint(-1.0F, -4.5F, -1.0F);
/*     */     
/* 236 */     this.gunModel[47].addShapeBox(0.0F, -2.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 237 */     this.gunModel[47].setRotationPoint(-1.0F, -2.5F, -1.0F);
/*     */     
/* 239 */     this.gunModel[48].addShapeBox(0.0F, -2.0F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 240 */     this.gunModel[48].setRotationPoint(7.0F, -4.0F, -1.0F);
/*     */     
/* 242 */     this.gunModel[49].addShapeBox(0.0F, -2.0F, -1.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, -0.55F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.95F, 0.0F, -0.55F, -0.95F);
/* 243 */     this.gunModel[49].setRotationPoint(7.0F, -2.0F, 2.0F);
/*     */     
/* 245 */     this.gunModel[50].addShapeBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 246 */     this.gunModel[50].setRotationPoint(-1.5F, -9.5F, -0.5F);
/*     */     
/* 248 */     this.gunModel[51].addShapeBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 249 */     this.gunModel[51].setRotationPoint(-2.25F, -9.5F, -0.5F);
/*     */     
/* 251 */     this.gunModel[52].addShapeBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 252 */     this.gunModel[52].setRotationPoint(-2.25F, -9.5F, -1.5F);
/*     */     
/* 254 */     this.gunModel[53].addShapeBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F);
/* 255 */     this.gunModel[53].setRotationPoint(-2.25F, -9.5F, 0.5F);
/*     */     
/* 257 */     this.gunModel[54].addShapeBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 258 */     this.gunModel[54].setRotationPoint(-2.75F, -9.5F, -1.5F);
/*     */     
/* 260 */     this.gunModel[55].addShapeBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 261 */     this.gunModel[55].setRotationPoint(-2.75F, -9.5F, 0.5F);
/*     */     
/* 263 */     this.gunModel[56].addShapeBox(0.0F, -2.0F, -1.0F, 18, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 264 */     this.gunModel[56].setRotationPoint(-20.0F, -5.0F, 0.0F);
/*     */     
/* 266 */     this.gunModel[57].addBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F);
/* 267 */     this.gunModel[57].setRotationPoint(-1.6F, -7.5F, -2.35F);
/* 268 */     this.gunModel[57].rotateAngleY = 0.27925268F;
/*     */     
/* 270 */     this.gunModel[58].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 271 */     this.gunModel[58].setRotationPoint(4.15F, 0.5F, 0.5F);
/*     */     
/* 273 */     this.gunModel[59].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F);
/* 274 */     this.gunModel[59].setRotationPoint(3.35F, 0.5F, 0.5F);
/*     */     
/* 276 */     this.gunModel[60].addShapeBox(0.0F, -2.0F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -1.75F, -0.85F, 0.0F, -1.75F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 277 */     this.gunModel[60].setRotationPoint(7.0F, -4.0F, -1.4F);
/*     */     
/* 279 */     this.gunModel[61].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 280 */     this.gunModel[61].setRotationPoint(1.5F, -1.5F, 2.0F);
/*     */     
/* 282 */     this.gunModel[62].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 283 */     this.gunModel[62].setRotationPoint(1.75F, -1.5F, 2.0F);
/*     */     
/* 285 */     this.gunModel[63].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -1.0F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 286 */     this.gunModel[63].setRotationPoint(1.25F, -1.5F, 2.0F);
/*     */     
/* 288 */     this.gunModel[64].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 289 */     this.gunModel[64].setRotationPoint(1.5F, -1.25F, 2.0F);
/*     */     
/* 291 */     this.gunModel[65].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 292 */     this.gunModel[65].setRotationPoint(1.75F, -1.25F, 2.0F);
/*     */     
/* 294 */     this.gunModel[66].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 295 */     this.gunModel[66].setRotationPoint(1.25F, -1.25F, 2.0F);
/*     */     
/* 297 */     this.gunModel[67].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, -0.25F, -0.9F);
/* 298 */     this.gunModel[67].setRotationPoint(1.25F, -1.0F, 2.0F);
/*     */     
/* 300 */     this.gunModel[68].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.8F, 0.0F, -0.75F, -0.8F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.8F, 0.0F, -0.5F, -0.8F);
/* 301 */     this.gunModel[68].setRotationPoint(1.5F, -1.0F, 2.0F);
/*     */     
/* 303 */     this.gunModel[69].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 304 */     this.gunModel[69].setRotationPoint(1.75F, -1.0F, 2.0F);
/*     */     
/* 306 */     this.gunModel[70].addShapeBox(0.0F, 2.0F, 0.0F, 1, 1, 1, 0.0F, -0.8F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F);
/* 307 */     this.gunModel[70].setRotationPoint(-2.55F, -7.5F, -2.65F);
/* 308 */     this.gunModel[70].rotateAngleY = 0.27925268F;
/*     */     
/* 310 */     this.gunModel[71].addShapeBox(0.0F, -2.0F, -1.0F, 8, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 311 */     this.gunModel[71].setRotationPoint(3.0F, -6.0F, 0.25F);
/*     */     
/*     */ 
/* 314 */     this.defaultScopeModel = new ModelRendererTurbo[16];
/* 315 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 316 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 317 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 318 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 319 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 320 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 321 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 322 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 323 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 324 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 325 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 326 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 327 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/* 328 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 329 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 330 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*     */     
/* 332 */     this.defaultScopeModel[0].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 333 */     this.defaultScopeModel[0].setRotationPoint(10.5F, -6.0F, 0.0F);
/*     */     
/* 335 */     this.defaultScopeModel[1].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 336 */     this.defaultScopeModel[1].setRotationPoint(11.0F, -7.0F, 0.0F);
/*     */     
/* 338 */     this.defaultScopeModel[2].addShapeBox(0.0F, -2.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 339 */     this.defaultScopeModel[2].setRotationPoint(2.0F, -8.0F, 1.5F);
/*     */     
/* 341 */     this.defaultScopeModel[3].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 342 */     this.defaultScopeModel[3].setRotationPoint(11.75F, -8.0F, 0.0F);
/*     */     
/* 344 */     this.defaultScopeModel[4].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 345 */     this.defaultScopeModel[4].setRotationPoint(1.0F, -8.0F, 1.5F);
/*     */     
/* 347 */     this.defaultScopeModel[5].addShapeBox(0.0F, -2.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 348 */     this.defaultScopeModel[5].setRotationPoint(2.0F, -8.0F, 0.0F);
/*     */     
/* 350 */     this.defaultScopeModel[6].addShapeBox(0.0F, -2.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 351 */     this.defaultScopeModel[6].setRotationPoint(2.0F, -8.0F, 0.5F);
/*     */     
/* 353 */     this.defaultScopeModel[7].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 354 */     this.defaultScopeModel[7].setRotationPoint(0.0F, -8.0F, 1.5F);
/*     */     
/* 356 */     this.defaultScopeModel[8].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 357 */     this.defaultScopeModel[8].setRotationPoint(1.0F, -8.0F, 0.0F);
/*     */     
/* 359 */     this.defaultScopeModel[9].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 360 */     this.defaultScopeModel[9].setRotationPoint(0.0F, -8.0F, 0.0F);
/*     */     
/* 362 */     this.defaultScopeModel[10].addShapeBox(0.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 363 */     this.defaultScopeModel[10].setRotationPoint(0.0F, -8.0F, 0.5F);
/*     */     
/* 365 */     this.defaultScopeModel[11].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 366 */     this.defaultScopeModel[11].setRotationPoint(0.0F, -8.5F, -0.25F);
/*     */     
/* 368 */     this.defaultScopeModel[12].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 369 */     this.defaultScopeModel[12].setRotationPoint(0.0F, -8.5F, 0.5F);
/*     */     
/* 371 */     this.defaultScopeModel[13].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/* 372 */     this.defaultScopeModel[13].setRotationPoint(0.0F, -8.5F, 0.25F);
/*     */     
/* 374 */     this.defaultScopeModel[14].addShapeBox(0.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/* 375 */     this.defaultScopeModel[14].setRotationPoint(0.0F, -7.65F, 0.25F);
/*     */     
/* 377 */     this.defaultScopeModel[15].addShapeBox(0.0F, -2.0F, -1.0F, 5, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 378 */     this.defaultScopeModel[15].setRotationPoint(-1.0F, -7.0F, 0.0F);
/*     */     
/*     */ 
/* 381 */     this.ammoModel = new ModelRendererTurbo[27];
/* 382 */     this.ammoModel[0] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/* 383 */     this.ammoModel[1] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/* 384 */     this.ammoModel[2] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/* 385 */     this.ammoModel[3] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/* 386 */     this.ammoModel[4] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 387 */     this.ammoModel[5] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/* 388 */     this.ammoModel[6] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 389 */     this.ammoModel[7] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 390 */     this.ammoModel[8] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/* 391 */     this.ammoModel[9] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/* 392 */     this.ammoModel[10] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 393 */     this.ammoModel[11] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 394 */     this.ammoModel[12] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 395 */     this.ammoModel[13] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 396 */     this.ammoModel[14] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 397 */     this.ammoModel[15] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/* 398 */     this.ammoModel[16] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 399 */     this.ammoModel[17] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/* 400 */     this.ammoModel[18] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/* 401 */     this.ammoModel[19] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/* 402 */     this.ammoModel[20] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 403 */     this.ammoModel[21] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/* 404 */     this.ammoModel[22] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/* 405 */     this.ammoModel[23] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 406 */     this.ammoModel[24] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/* 407 */     this.ammoModel[25] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/* 408 */     this.ammoModel[26] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*     */     
/* 410 */     this.ammoModel[0].addShapeBox(0.0F, -2.0F, -1.0F, 5, 3, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F);
/* 411 */     this.ammoModel[0].setRotationPoint(6.0F, -0.5F, 0.2F);
/*     */     
/* 413 */     this.ammoModel[1].addShapeBox(0.0F, -2.0F, -1.0F, 5, 3, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F, -0.6F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.6F, -0.6F, 0.0F, 0.6F);
/* 414 */     this.ammoModel[1].setRotationPoint(6.0F, 2.5F, 0.2F);
/*     */     
/* 416 */     this.ammoModel[2].addShapeBox(0.0F, -2.0F, -1.0F, 5, 3, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F, -1.6F, 0.0F, 0.0F, 0.9F, -1.5F, 0.0F, 0.9F, -1.5F, 0.6F, -1.6F, 0.0F, 0.6F);
/* 417 */     this.ammoModel[2].setRotationPoint(6.5F, 5.5F, 0.2F);
/*     */     
/* 419 */     this.ammoModel[3].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 420 */     this.ammoModel[3].setRotationPoint(10.0F, 2.5F, 0.15F);
/*     */     
/* 422 */     this.ammoModel[4].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 423 */     this.ammoModel[4].setRotationPoint(8.85F, 2.5F, 0.15F);
/*     */     
/* 425 */     this.ammoModel[5].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 426 */     this.ammoModel[5].setRotationPoint(7.4F, 2.5F, 0.15F);
/*     */     
/* 428 */     this.ammoModel[6].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.6F, 0.0F, 0.1F, 0.6F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 429 */     this.ammoModel[6].setRotationPoint(6.0F, 2.5F, 0.15F);
/*     */     
/* 431 */     this.ammoModel[7].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 432 */     this.ammoModel[7].setRotationPoint(10.0F, 2.5F, 1.9F);
/*     */     
/* 434 */     this.ammoModel[8].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 435 */     this.ammoModel[8].setRotationPoint(8.85F, 2.5F, 1.9F);
/*     */     
/* 437 */     this.ammoModel[9].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.6F, 0.0F, 0.1F, 0.6F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 438 */     this.ammoModel[9].setRotationPoint(6.0F, 2.5F, 1.9F);
/*     */     
/* 440 */     this.ammoModel[10].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 441 */     this.ammoModel[10].setRotationPoint(7.4F, 2.5F, 1.9F);
/*     */     
/* 443 */     this.ammoModel[11].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 444 */     this.ammoModel[11].setRotationPoint(9.5F, -0.5F, 0.15F);
/*     */     
/* 446 */     this.ammoModel[12].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.7F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.7F, 0.0F, -0.95F);
/* 447 */     this.ammoModel[12].setRotationPoint(8.3F, -0.5F, 0.15F);
/*     */     
/* 449 */     this.ammoModel[13].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 450 */     this.ammoModel[13].setRotationPoint(7.0F, -0.5F, 0.15F);
/*     */     
/* 452 */     this.ammoModel[14].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 453 */     this.ammoModel[14].setRotationPoint(5.5F, -0.5F, 0.15F);
/*     */     
/* 455 */     this.ammoModel[15].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 456 */     this.ammoModel[15].setRotationPoint(9.5F, -0.5F, 1.9F);
/*     */     
/* 458 */     this.ammoModel[16].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.7F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.7F, 0.0F, -0.95F);
/* 459 */     this.ammoModel[16].setRotationPoint(8.3F, -0.5F, 1.9F);
/*     */     
/* 461 */     this.ammoModel[17].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 462 */     this.ammoModel[17].setRotationPoint(7.0F, -0.5F, 1.9F);
/*     */     
/* 464 */     this.ammoModel[18].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 465 */     this.ammoModel[18].setRotationPoint(5.5F, -0.5F, 1.9F);
/*     */     
/* 467 */     this.ammoModel[19].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.9F, -0.15F, 0.1F, 0.89F, -0.5F, 0.1F, 0.89F, -0.5F, -0.95F, -0.95F, -0.15F, -0.95F);
/* 468 */     this.ammoModel[19].setRotationPoint(10.5F, 5.5F, 1.9F);
/*     */     
/* 470 */     this.ammoModel[20].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.8F, 0.3F, 0.1F, 0.5F, 0.0F, 0.1F, 0.5F, 0.0F, -0.95F, -0.8F, 0.3F, -0.95F);
/* 471 */     this.ammoModel[20].setRotationPoint(9.35F, 5.5F, 0.15F);
/*     */     
/* 473 */     this.ammoModel[21].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -1.25F, -0.35F, 0.1F, 0.75F, -0.5F, 0.1F, 0.75F, -0.5F, -0.95F, -1.25F, -0.35F, -0.95F);
/* 474 */     this.ammoModel[21].setRotationPoint(7.8F, 5.5F, 0.15F);
/*     */     
/* 476 */     this.ammoModel[22].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -1.25F, -0.35F, 0.1F, 0.75F, -0.5F, 0.1F, 0.75F, -0.5F, -0.95F, -1.25F, -0.35F, -0.95F);
/* 477 */     this.ammoModel[22].setRotationPoint(7.8F, 5.5F, 1.9F);
/*     */     
/* 479 */     this.ammoModel[23].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -1.6F, 0.02F, 0.1F, 1.0F, -0.15F, 0.1F, 1.0F, -0.15F, -0.95F, -1.6F, 0.02F, -0.95F);
/* 480 */     this.ammoModel[23].setRotationPoint(6.5F, 5.5F, 1.9F);
/*     */     
/* 482 */     this.ammoModel[24].addShapeBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -1.6F, 0.02F, 0.1F, 1.0F, -0.15F, 0.1F, 1.0F, -0.15F, -0.95F, -1.6F, 0.02F, -0.95F);
/* 483 */     this.ammoModel[24].setRotationPoint(6.5F, 5.5F, 0.15F);
/*     */     
/* 485 */     this.ammoModel[25].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.9F, -0.15F, 0.1F, 0.89F, -0.5F, 0.1F, 0.89F, -0.5F, -0.95F, -0.95F, -0.15F, -0.95F);
/* 486 */     this.ammoModel[25].setRotationPoint(10.5F, 5.5F, 0.15F);
/*     */     
/* 488 */     this.ammoModel[26].addShapeBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.8F, 0.3F, 0.1F, 0.5F, 0.0F, 0.1F, 0.5F, 0.0F, -0.95F, -0.8F, 0.3F, -0.95F);
/* 489 */     this.ammoModel[26].setRotationPoint(9.35F, 5.5F, 1.9F);
/*     */     
/*     */ 
/*     */ 
/* 493 */     this.scopeAttachPoint = new Vector3f(0.4375F, 0.78125F, 0.0F);
/*     */     
/* 495 */     translateAll(0.0F, -5.0F, 0.0F);
/* 496 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 498 */     this.gunSlideDistance = 0.0F;
/* 499 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 502 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */