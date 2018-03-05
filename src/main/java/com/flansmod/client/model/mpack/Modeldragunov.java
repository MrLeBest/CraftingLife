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
/*     */ public class Modeldragunov
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modeldragunov()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[88];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 241, 25, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*     */     
/* 111 */     this.gunModel[0].addShapeBox(0.0F, -5.0F, -1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 112 */     this.gunModel[0].setRotationPoint(0.0F, -1.0F, 0.0F);
/*     */     
/* 114 */     this.gunModel[1].addShapeBox(0.0F, -5.0F, -1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 115 */     this.gunModel[1].setRotationPoint(0.0F, -1.0F, 0.5F);
/*     */     
/* 117 */     this.gunModel[2].addShapeBox(0.0F, -5.0F, -1.0F, 11, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 118 */     this.gunModel[2].setRotationPoint(0.0F, -0.25F, 1.0F);
/*     */     
/* 120 */     this.gunModel[3].addShapeBox(0.0F, -5.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 121 */     this.gunModel[3].setRotationPoint(-1.0F, -0.25F, 0.5F);
/*     */     
/* 123 */     this.gunModel[4].addShapeBox(0.0F, -5.0F, -1.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 124 */     this.gunModel[4].setRotationPoint(-1.0F, 0.75F, 0.0F);
/*     */     
/* 126 */     this.gunModel[5].addShapeBox(0.0F, -5.0F, -1.0F, 4, 1, 1, 0.0F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 127 */     this.gunModel[5].setRotationPoint(0.0F, -0.25F, -0.5F);
/*     */     
/* 129 */     this.gunModel[6].addShapeBox(0.0F, -5.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 130 */     this.gunModel[6].setRotationPoint(0.0F, -0.75F, 1.0F);
/*     */     
/* 132 */     this.gunModel[7].addShapeBox(0.0F, -5.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F);
/* 133 */     this.gunModel[7].setRotationPoint(0.0F, -0.75F, -0.5F);
/*     */     
/* 135 */     this.gunModel[8].addBox(0.0F, -5.0F, -1.0F, 5, 1, 1, 0.0F);
/* 136 */     this.gunModel[8].setRotationPoint(22.0F, -0.85F, 0.5F);
/*     */     
/* 138 */     this.gunModel[9].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 139 */     this.gunModel[9].setRotationPoint(27.0F, -0.85F, 0.5F);
/*     */     
/* 141 */     this.gunModel[10].addBox(0.0F, -5.0F, -1.0F, 13, 1, 1, 0.0F);
/* 142 */     this.gunModel[10].setRotationPoint(22.0F, 0.65F, 0.5F);
/*     */     
/* 144 */     this.gunModel[11].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 145 */     this.gunModel[11].setRotationPoint(34.0F, -0.35F, 0.5F);
/*     */     
/* 147 */     this.gunModel[12].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 148 */     this.gunModel[12].setRotationPoint(33.5F, -0.35F, 0.5F);
/*     */     
/* 150 */     this.gunModel[13].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.4F, -1.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 151 */     this.gunModel[13].setRotationPoint(-1.0F, -1.0F, 0.5F);
/*     */     
/* 153 */     this.gunModel[14].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 154 */     this.gunModel[14].setRotationPoint(-1.0F, -1.0F, 0.0F);
/*     */     
/* 156 */     this.gunModel[15].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 157 */     this.gunModel[15].setRotationPoint(-1.0F, -0.75F, 1.0F);
/*     */     
/* 159 */     this.gunModel[16].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 160 */     this.gunModel[16].setRotationPoint(-1.0F, -0.25F, 1.0F);
/*     */     
/* 162 */     this.gunModel[17].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 163 */     this.gunModel[17].setRotationPoint(-1.0F, -0.25F, -0.5F);
/*     */     
/* 165 */     this.gunModel[18].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 166 */     this.gunModel[18].setRotationPoint(-1.0F, -0.75F, -0.5F);
/*     */     
/* 168 */     this.gunModel[19].addShapeBox(0.0F, -5.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 169 */     this.gunModel[19].setRotationPoint(-1.0F, 2.25F, 0.0F);
/*     */     
/* 171 */     this.gunModel[20].addShapeBox(0.0F, -5.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[20].setRotationPoint(-1.0F, 3.0F, 0.0F);
/*     */     
/* 174 */     this.gunModel[21].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 175 */     this.gunModel[21].setRotationPoint(1.0F, 2.25F, 0.5F);
/*     */     
/* 177 */     this.gunModel[22].addShapeBox(0.0F, -5.0F, -1.0F, 2, 1, 1, 0.0F, 0.5F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 178 */     this.gunModel[22].setRotationPoint(1.75F, 2.5F, 0.5F);
/*     */     
/* 180 */     this.gunModel[23].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 181 */     this.gunModel[23].setRotationPoint(3.0F, 2.25F, 0.5F);
/*     */     
/* 183 */     this.gunModel[24].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 184 */     this.gunModel[24].setRotationPoint(1.75F, 1.75F, 0.5F);
/*     */     
/* 186 */     this.gunModel[25].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 187 */     this.gunModel[25].setRotationPoint(2.0F, 2.0F, 0.5F);
/*     */     
/* 189 */     this.gunModel[26].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.8F, 0.0F, -0.65F, -0.8F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 190 */     this.gunModel[26].setRotationPoint(33.5F, -6.35F, -0.5F);
/*     */     
/* 192 */     this.gunModel[27].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.8F, 0.0F, -0.65F, -0.8F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 193 */     this.gunModel[27].setRotationPoint(33.5F, -6.35F, -1.25F);
/*     */     
/* 195 */     this.gunModel[28].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.8F, -0.5F, -0.65F, -0.8F, -0.5F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 196 */     this.gunModel[28].setRotationPoint(33.75F, -6.35F, -0.88F);
/*     */     
/* 198 */     this.gunModel[29].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 199 */     this.gunModel[29].setRotationPoint(26.0F, 0.15F, 0.5F);
/*     */     
/* 201 */     this.gunModel[30].addShapeBox(0.0F, -5.0F, 0.0F, 9, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 202 */     this.gunModel[30].setRotationPoint(-10.0F, 4.0F, -1.0F);
/*     */     
/* 204 */     this.gunModel[31].addShapeBox(0.0F, -5.0F, 0.0F, 2, 5, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 205 */     this.gunModel[31].setRotationPoint(-12.0F, 0.5F, -1.0F);
/*     */     
/* 207 */     this.gunModel[32].addShapeBox(0.0F, -5.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 208 */     this.gunModel[32].setRotationPoint(-7.5F, 2.0F, -0.75F);
/*     */     
/* 210 */     this.gunModel[33].addShapeBox(0.0F, -5.0F, -1.0F, 9, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 211 */     this.gunModel[33].setRotationPoint(-10.0F, 0.25F, 0.0F);
/*     */     
/* 213 */     this.gunModel[34].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, -0.5F, -0.8F, -1.0F, -0.5F, -0.8F, -1.0F, 0.0F, 0.0F, -0.8F, 0.0F);
/* 214 */     this.gunModel[34].setRotationPoint(-5.5F, 1.5F, -1.25F);
/*     */     
/* 216 */     this.gunModel[35].addShapeBox(0.0F, -5.0F, -1.0F, 7, 1, 2, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 217 */     this.gunModel[35].setRotationPoint(-9.0F, -0.25F, 0.0F);
/*     */     
/* 219 */     this.gunModel[36].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 2, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 220 */     this.gunModel[36].setRotationPoint(-2.0F, 3.0F, 0.0F);
/*     */     
/* 222 */     this.gunModel[37].addShapeBox(0.0F, -5.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -0.65F, 0.0F, -0.25F, -0.65F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 223 */     this.gunModel[37].setRotationPoint(-1.0F, 5.0F, -1.0F);
/*     */     
/* 225 */     this.gunModel[38].addShapeBox(0.0F, -5.0F, -1.0F, 4, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 226 */     this.gunModel[38].setRotationPoint(3.0F, -0.75F, 1.0F);
/*     */     
/* 228 */     this.gunModel[39].addShapeBox(0.0F, -5.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 229 */     this.gunModel[39].setRotationPoint(8.0F, -0.75F, 1.0F);
/*     */     
/* 231 */     this.gunModel[40].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 232 */     this.gunModel[40].setRotationPoint(8.0F, -4.5F, -0.5F);
/*     */     
/* 234 */     this.gunModel[41].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 235 */     this.gunModel[41].setRotationPoint(8.0F, -2.5F, -0.5F);
/*     */     
/* 237 */     this.gunModel[42].addShapeBox(0.0F, -5.0F, 0.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 238 */     this.gunModel[42].setRotationPoint(-10.5F, 3.5F, -0.75F);
/*     */     
/* 240 */     this.gunModel[43].addShapeBox(0.0F, -5.0F, 0.0F, 3, 1, 2, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 241 */     this.gunModel[43].setRotationPoint(-10.5F, 1.5F, -0.75F);
/*     */     
/* 243 */     this.gunModel[44].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 244 */     this.gunModel[44].setRotationPoint(-9.5F, 2.0F, -0.75F);
/*     */     
/* 246 */     this.gunModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 247 */     this.gunModel[45].setRotationPoint(11.0F, -3.75F, -1.0F);
/*     */     
/* 249 */     this.gunModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 250 */     this.gunModel[46].setRotationPoint(11.0F, -5.75F, -1.0F);
/*     */     
/* 252 */     this.gunModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 253 */     this.gunModel[47].setRotationPoint(15.0F, -3.75F, -1.0F);
/*     */     
/* 255 */     this.gunModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 256 */     this.gunModel[48].setRotationPoint(11.0F, -5.75F, 0.0F);
/*     */     
/* 258 */     this.gunModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 259 */     this.gunModel[49].setRotationPoint(15.0F, -3.75F, 0.0F);
/*     */     
/* 261 */     this.gunModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 262 */     this.gunModel[50].setRotationPoint(11.0F, -3.75F, 0.0F);
/*     */     
/* 264 */     this.gunModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 265 */     this.gunModel[51].setRotationPoint(11.0F, -6.75F, -1.0F);
/*     */     
/* 267 */     this.gunModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 268 */     this.gunModel[52].setRotationPoint(11.0F, -6.75F, -0.5F);
/*     */     
/* 270 */     this.gunModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 271 */     this.gunModel[53].setRotationPoint(13.0F, -4.75F, 0.0F);
/*     */     
/* 273 */     this.gunModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 274 */     this.gunModel[54].setRotationPoint(13.0F, -5.5F, 0.0F);
/*     */     
/* 276 */     this.gunModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F);
/* 277 */     this.gunModel[55].setRotationPoint(13.0F, -6.25F, 0.0F);
/*     */     
/* 279 */     this.gunModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.2F, 0.0F, -0.75F, -0.2F);
/* 280 */     this.gunModel[56].setRotationPoint(20.5F, -4.75F, 0.0F);
/*     */     
/* 282 */     this.gunModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.2F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, -0.15F, 0.2F, -0.5F, -0.15F, 0.2F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, -0.2F, 0.2F, -0.75F, -0.2F);
/* 283 */     this.gunModel[57].setRotationPoint(19.0F, -4.75F, 0.0F);
/*     */     
/* 285 */     this.gunModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, -0.2F, 0.0F, -0.75F, -0.2F);
/* 286 */     this.gunModel[58].setRotationPoint(17.0F, -4.75F, 0.0F);
/*     */     
/* 288 */     this.gunModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, -0.2F, 0.0F, -0.75F, -0.2F);
/* 289 */     this.gunModel[59].setRotationPoint(13.0F, -4.75F, 0.0F);
/*     */     
/* 291 */     this.gunModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 292 */     this.gunModel[60].setRotationPoint(13.0F, -5.5F, -1.0F);
/*     */     
/* 294 */     this.gunModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 295 */     this.gunModel[61].setRotationPoint(13.0F, -4.75F, -1.0F);
/*     */     
/* 297 */     this.gunModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 298 */     this.gunModel[62].setRotationPoint(11.0F, -5.75F, -1.0F);
/*     */     
/* 300 */     this.gunModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.1F, -0.5F, -0.15F, -0.6F, -0.5F, -0.15F, -0.6F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.75F, -0.2F, -0.6F, -0.75F, -0.2F, -0.6F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F);
/* 301 */     this.gunModel[63].setRotationPoint(20.5F, -4.75F, -1.0F);
/*     */     
/* 303 */     this.gunModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.1F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F);
/* 304 */     this.gunModel[64].setRotationPoint(19.0F, -4.75F, -1.0F);
/*     */     
/* 306 */     this.gunModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 307 */     this.gunModel[65].setRotationPoint(17.0F, -4.75F, -1.0F);
/*     */     
/* 309 */     this.gunModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.2F, -0.4F, -0.75F, -0.2F, -0.4F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 310 */     this.gunModel[66].setRotationPoint(15.0F, -4.75F, -1.0F);
/*     */     
/* 312 */     this.gunModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.4F, 0.5F, -0.75F, -0.4F);
/* 313 */     this.gunModel[67].setRotationPoint(21.5F, -5.5F, 0.0F);
/*     */     
/* 315 */     this.gunModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.4F, -0.5F, -0.75F, -0.4F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 316 */     this.gunModel[68].setRotationPoint(21.5F, -5.5F, -1.0F);
/*     */     
/* 318 */     this.gunModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 319 */     this.gunModel[69].setRotationPoint(20.0F, -5.5F, -1.0F);
/*     */     
/* 321 */     this.gunModel[70].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 322 */     this.gunModel[70].setRotationPoint(16.0F, -5.5F, -1.0F);
/*     */     
/* 324 */     this.gunModel[71].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 325 */     this.gunModel[71].setRotationPoint(18.0F, -5.5F, -1.0F);
/*     */     
/* 327 */     this.gunModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.4F, -0.5F, -0.75F, -0.4F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 328 */     this.gunModel[72].setRotationPoint(13.0F, -5.5F, -1.0F);
/*     */     
/* 330 */     this.gunModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 331 */     this.gunModel[73].setRotationPoint(13.0F, -5.5F, -0.5F);
/*     */     
/* 333 */     this.gunModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.15F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 334 */     this.gunModel[74].setRotationPoint(13.0F, -4.75F, -1.0F);
/*     */     
/* 336 */     this.gunModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, -0.2F, 0.0F, -0.75F, -0.2F);
/* 337 */     this.gunModel[75].setRotationPoint(15.0F, -4.75F, 0.0F);
/*     */     
/* 339 */     this.gunModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, -0.4F, 0.0F, -0.75F, -0.4F);
/* 340 */     this.gunModel[76].setRotationPoint(13.0F, -5.5F, 0.0F);
/*     */     
/* 342 */     this.gunModel[77].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, -0.4F, 0.0F, -0.75F, -0.4F);
/* 343 */     this.gunModel[77].setRotationPoint(15.75F, -5.5F, 0.0F);
/*     */     
/* 345 */     this.gunModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, -0.4F, 0.0F, -0.75F, -0.4F);
/* 346 */     this.gunModel[78].setRotationPoint(17.5F, -5.5F, 0.0F);
/*     */     
/* 348 */     this.gunModel[79].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, -0.4F, 0.0F, -0.75F, -0.4F);
/* 349 */     this.gunModel[79].setRotationPoint(19.25F, -5.5F, 0.0F);
/*     */     
/* 351 */     this.gunModel[80].addShapeBox(0.0F, -5.0F, -1.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 352 */     this.gunModel[80].setRotationPoint(-1.0F, -0.5F, 0.5F);
/*     */     
/* 354 */     this.gunModel[81].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 355 */     this.gunModel[81].setRotationPoint(10.0F, -0.25F, -0.5F);
/*     */     
/* 357 */     this.gunModel[82].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 358 */     this.gunModel[82].setRotationPoint(10.0F, -0.75F, -0.5F);
/*     */     
/* 360 */     this.gunModel[83].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.2F, 0.0F, -1.0F, -0.2F);
/* 361 */     this.gunModel[83].setRotationPoint(9.0F, -0.5F, 0.5F);
/*     */     
/* 363 */     this.gunModel[84].addShapeBox(0.0F, -5.0F, -1.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 364 */     this.gunModel[84].setRotationPoint(6.0F, -0.5F, 0.5F);
/*     */     
/* 366 */     this.gunModel[85].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 367 */     this.gunModel[85].setRotationPoint(10.0F, -0.25F, 0.5F);
/*     */     
/* 369 */     this.gunModel[86].addShapeBox(0.0F, -5.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 370 */     this.gunModel[86].setRotationPoint(4.0F, -0.25F, 0.5F);
/*     */     
/* 372 */     this.gunModel[87].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 373 */     this.gunModel[87].setRotationPoint(10.0F, -0.5F, 0.5F);
/*     */     
/*     */ 
/* 376 */     this.defaultScopeModel = new ModelRendererTurbo[31];
/* 377 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 378 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/* 379 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/* 380 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/* 381 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/* 382 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/* 383 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/* 384 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/* 385 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 386 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 387 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/* 388 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/* 389 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/* 390 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/* 391 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 392 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/* 393 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/* 394 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/* 395 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/* 396 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/* 397 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/* 398 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/* 399 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/* 400 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 401 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/* 402 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/* 403 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/* 404 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 405 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/* 406 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/* 407 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*     */     
/* 409 */     this.defaultScopeModel[0].addShapeBox(0.0F, -5.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 410 */     this.defaultScopeModel[0].setRotationPoint(7.0F, -2.0F, 0.0F);
/*     */     
/* 412 */     this.defaultScopeModel[1].addShapeBox(0.0F, -5.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 413 */     this.defaultScopeModel[1].setRotationPoint(2.0F, -2.0F, 0.0F);
/*     */     
/* 415 */     this.defaultScopeModel[2].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 416 */     this.defaultScopeModel[2].setRotationPoint(7.0F, -2.0F, 0.5F);
/*     */     
/* 418 */     this.defaultScopeModel[3].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 419 */     this.defaultScopeModel[3].setRotationPoint(7.0F, -2.5F, 0.5F);
/*     */     
/* 421 */     this.defaultScopeModel[4].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 422 */     this.defaultScopeModel[4].setRotationPoint(7.0F, -3.0F, 0.0F);
/*     */     
/* 424 */     this.defaultScopeModel[5].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 425 */     this.defaultScopeModel[5].setRotationPoint(2.0F, -3.0F, 0.0F);
/*     */     
/* 427 */     this.defaultScopeModel[6].addShapeBox(0.0F, -5.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 428 */     this.defaultScopeModel[6].setRotationPoint(3.0F, -3.0F, 0.0F);
/*     */     
/* 430 */     this.defaultScopeModel[7].addShapeBox(0.0F, -5.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 431 */     this.defaultScopeModel[7].setRotationPoint(2.0F, -2.5F, -0.5F);
/*     */     
/* 433 */     this.defaultScopeModel[8].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 434 */     this.defaultScopeModel[8].setRotationPoint(2.0F, -2.0F, 0.5F);
/*     */     
/* 436 */     this.defaultScopeModel[9].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 437 */     this.defaultScopeModel[9].setRotationPoint(2.0F, -2.5F, 0.5F);
/*     */     
/* 439 */     this.defaultScopeModel[10].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 440 */     this.defaultScopeModel[10].setRotationPoint(2.0F, -2.0F, 0.0F);
/*     */     
/* 442 */     this.defaultScopeModel[11].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 443 */     this.defaultScopeModel[11].setRotationPoint(2.0F, -2.5F, 0.0F);
/*     */     
/* 445 */     this.defaultScopeModel[12].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 446 */     this.defaultScopeModel[12].setRotationPoint(7.0F, -2.5F, 0.0F);
/*     */     
/* 448 */     this.defaultScopeModel[13].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 449 */     this.defaultScopeModel[13].setRotationPoint(7.0F, -2.0F, 0.0F);
/*     */     
/* 451 */     this.defaultScopeModel[14].addBox(0.0F, -5.0F, 0.0F, 6, 1, 1, 0.0F);
/* 452 */     this.defaultScopeModel[14].setRotationPoint(2.0F, -3.5F, -0.5F);
/*     */     
/* 454 */     this.defaultScopeModel[15].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 455 */     this.defaultScopeModel[15].setRotationPoint(1.0F, -3.5F, 0.5F);
/*     */     
/* 457 */     this.defaultScopeModel[16].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 458 */     this.defaultScopeModel[16].setRotationPoint(1.0F, -4.5F, 0.5F);
/*     */     
/* 460 */     this.defaultScopeModel[17].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 461 */     this.defaultScopeModel[17].setRotationPoint(1.0F, -4.5F, -0.5F);
/*     */     
/* 463 */     this.defaultScopeModel[18].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 464 */     this.defaultScopeModel[18].setRotationPoint(1.0F, -4.5F, -1.5F);
/*     */     
/* 466 */     this.defaultScopeModel[19].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 467 */     this.defaultScopeModel[19].setRotationPoint(1.0F, -3.5F, -1.5F);
/*     */     
/* 469 */     this.defaultScopeModel[20].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 470 */     this.defaultScopeModel[20].setRotationPoint(1.0F, -2.5F, -1.5F);
/*     */     
/* 472 */     this.defaultScopeModel[21].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 473 */     this.defaultScopeModel[21].setRotationPoint(1.0F, -2.5F, -0.5F);
/*     */     
/* 475 */     this.defaultScopeModel[22].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F);
/* 476 */     this.defaultScopeModel[22].setRotationPoint(1.0F, -2.5F, 0.5F);
/*     */     
/* 478 */     this.defaultScopeModel[23].addBox(0.0F, -5.0F, 0.0F, 2, 2, 2, 0.0F);
/* 479 */     this.defaultScopeModel[23].setRotationPoint(-1.0F, -4.0F, -1.0F);
/*     */     
/* 481 */     this.defaultScopeModel[24].addBox(0.0F, -5.0F, 0.0F, 3, 2, 2, 0.0F);
/* 482 */     this.defaultScopeModel[24].setRotationPoint(9.0F, -4.0F, -1.0F);
/*     */     
/* 484 */     this.defaultScopeModel[25].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 485 */     this.defaultScopeModel[25].setRotationPoint(8.0F, -4.5F, 0.5F);
/*     */     
/* 487 */     this.defaultScopeModel[26].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 488 */     this.defaultScopeModel[26].setRotationPoint(8.0F, -3.5F, 0.5F);
/*     */     
/* 490 */     this.defaultScopeModel[27].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F);
/* 491 */     this.defaultScopeModel[27].setRotationPoint(8.0F, -2.5F, 0.5F);
/*     */     
/* 493 */     this.defaultScopeModel[28].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 494 */     this.defaultScopeModel[28].setRotationPoint(8.0F, -2.5F, -1.5F);
/*     */     
/* 496 */     this.defaultScopeModel[29].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 497 */     this.defaultScopeModel[29].setRotationPoint(8.0F, -3.5F, -1.5F);
/*     */     
/* 499 */     this.defaultScopeModel[30].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 500 */     this.defaultScopeModel[30].setRotationPoint(8.0F, -4.5F, -1.5F);
/*     */     
/*     */ 
/* 503 */     this.ammoModel = new ModelRendererTurbo[32];
/* 504 */     this.ammoModel[0] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/* 505 */     this.ammoModel[1] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/* 506 */     this.ammoModel[2] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/* 507 */     this.ammoModel[3] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 508 */     this.ammoModel[4] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 509 */     this.ammoModel[5] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/* 510 */     this.ammoModel[6] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 511 */     this.ammoModel[7] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/* 512 */     this.ammoModel[8] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 513 */     this.ammoModel[9] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/* 514 */     this.ammoModel[10] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 515 */     this.ammoModel[11] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 516 */     this.ammoModel[12] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 517 */     this.ammoModel[13] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 518 */     this.ammoModel[14] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/* 519 */     this.ammoModel[15] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/* 520 */     this.ammoModel[16] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/* 521 */     this.ammoModel[17] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/* 522 */     this.ammoModel[18] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/* 523 */     this.ammoModel[19] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 524 */     this.ammoModel[20] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/* 525 */     this.ammoModel[21] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/* 526 */     this.ammoModel[22] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 527 */     this.ammoModel[23] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/* 528 */     this.ammoModel[24] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/* 529 */     this.ammoModel[25] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/* 530 */     this.ammoModel[26] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/* 531 */     this.ammoModel[27] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/* 532 */     this.ammoModel[28] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/* 533 */     this.ammoModel[29] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/* 534 */     this.ammoModel[30] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/* 535 */     this.ammoModel[31] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/*     */     
/* 537 */     this.ammoModel[0].addShapeBox(0.0F, -5.0F, 0.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
/* 538 */     this.ammoModel[0].setRotationPoint(5.0F, 2.25F, -0.85F);
/*     */     
/* 540 */     this.ammoModel[1].addShapeBox(0.0F, -5.0F, 0.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.25F, 0.0F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.3F, -0.25F, 0.0F, -0.3F);
/* 541 */     this.ammoModel[1].setRotationPoint(5.0F, 4.25F, -0.85F);
/*     */     
/* 543 */     this.ammoModel[2].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 544 */     this.ammoModel[2].setRotationPoint(6.25F, 2.25F, 0.85F);
/*     */     
/* 546 */     this.ammoModel[3].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 547 */     this.ammoModel[3].setRotationPoint(7.25F, 2.25F, 0.85F);
/*     */     
/* 549 */     this.ammoModel[4].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 550 */     this.ammoModel[4].setRotationPoint(8.25F, 2.25F, 0.85F);
/*     */     
/* 552 */     this.ammoModel[5].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 553 */     this.ammoModel[5].setRotationPoint(5.25F, 2.25F, 0.85F);
/*     */     
/* 555 */     this.ammoModel[6].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 556 */     this.ammoModel[6].setRotationPoint(5.75F, 3.5F, 0.85F);
/*     */     
/* 558 */     this.ammoModel[7].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 559 */     this.ammoModel[7].setRotationPoint(6.75F, 3.5F, 0.85F);
/*     */     
/* 561 */     this.ammoModel[8].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 562 */     this.ammoModel[8].setRotationPoint(7.75F, 3.5F, 0.85F);
/*     */     
/* 564 */     this.ammoModel[9].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 565 */     this.ammoModel[9].setRotationPoint(8.75F, 3.5F, 0.85F);
/*     */     
/* 567 */     this.ammoModel[10].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 568 */     this.ammoModel[10].setRotationPoint(5.0F, 3.5F, 0.85F);
/*     */     
/* 570 */     this.ammoModel[11].addShapeBox(0.0F, -5.0F, 0.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, -0.25F, 0.0F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -1.1F, -0.25F, 0.0F, -1.1F);
/* 571 */     this.ammoModel[11].setRotationPoint(5.0F, 4.25F, 0.85F);
/*     */     
/* 573 */     this.ammoModel[12].addShapeBox(0.0F, -5.0F, 0.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, -0.25F, 0.0F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -1.1F, -0.25F, 0.0F, -1.1F);
/* 574 */     this.ammoModel[12].setRotationPoint(5.0F, 4.25F, -0.85F);
/*     */     
/* 576 */     this.ammoModel[13].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 577 */     this.ammoModel[13].setRotationPoint(8.25F, 2.25F, -0.85F);
/*     */     
/* 579 */     this.ammoModel[14].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 580 */     this.ammoModel[14].setRotationPoint(8.75F, 3.5F, -0.85F);
/*     */     
/* 582 */     this.ammoModel[15].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 583 */     this.ammoModel[15].setRotationPoint(7.75F, 3.5F, -0.85F);
/*     */     
/* 585 */     this.ammoModel[16].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 586 */     this.ammoModel[16].setRotationPoint(7.25F, 2.25F, -0.85F);
/*     */     
/* 588 */     this.ammoModel[17].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 589 */     this.ammoModel[17].setRotationPoint(6.75F, 3.5F, -0.85F);
/*     */     
/* 591 */     this.ammoModel[18].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 592 */     this.ammoModel[18].setRotationPoint(6.25F, 2.25F, -0.85F);
/*     */     
/* 594 */     this.ammoModel[19].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 595 */     this.ammoModel[19].setRotationPoint(5.75F, 3.5F, -0.85F);
/*     */     
/* 597 */     this.ammoModel[20].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F);
/* 598 */     this.ammoModel[20].setRotationPoint(5.25F, 2.25F, -0.85F);
/*     */     
/* 600 */     this.ammoModel[21].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 601 */     this.ammoModel[21].setRotationPoint(5.0F, 3.5F, -0.85F);
/*     */     
/* 603 */     this.ammoModel[22].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 604 */     this.ammoModel[22].setRotationPoint(6.75F, 2.5F, -0.85F);
/*     */     
/* 606 */     this.ammoModel[23].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 607 */     this.ammoModel[23].setRotationPoint(7.75F, 2.5F, -0.85F);
/*     */     
/* 609 */     this.ammoModel[24].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 610 */     this.ammoModel[24].setRotationPoint(8.75F, 2.5F, -0.85F);
/*     */     
/* 612 */     this.ammoModel[25].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 613 */     this.ammoModel[25].setRotationPoint(5.75F, 2.5F, -0.85F);
/*     */     
/* 615 */     this.ammoModel[26].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 616 */     this.ammoModel[26].setRotationPoint(5.0F, 2.5F, -0.85F);
/*     */     
/* 618 */     this.ammoModel[27].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 619 */     this.ammoModel[27].setRotationPoint(6.75F, 2.5F, 0.85F);
/*     */     
/* 621 */     this.ammoModel[28].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 622 */     this.ammoModel[28].setRotationPoint(7.75F, 2.5F, 0.85F);
/*     */     
/* 624 */     this.ammoModel[29].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 625 */     this.ammoModel[29].setRotationPoint(8.75F, 2.5F, 0.85F);
/*     */     
/* 627 */     this.ammoModel[30].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 628 */     this.ammoModel[30].setRotationPoint(5.75F, 2.5F, 0.85F);
/*     */     
/* 630 */     this.ammoModel[31].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, -0.5F, -0.1F, -0.75F, -0.5F, -0.1F, -0.75F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F);
/* 631 */     this.ammoModel[31].setRotationPoint(5.0F, 2.5F, 0.85F);
/*     */     
/*     */ 
/* 634 */     this.slideModel = new ModelRendererTurbo[1];
/* 635 */     this.slideModel[0] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*     */     
/* 637 */     this.slideModel[0].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 638 */     this.slideModel[0].setRotationPoint(9.0F, 0.25F, -2.0F);
/*     */     
/* 640 */     translateAll(-2.25F, -4.0F, 0.0F);
/* 641 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/*     */ 
/* 644 */     this.gunSlideDistance = 0.1F;
/* 645 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/*     */ 
/* 649 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modeldragunov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */