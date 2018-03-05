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
/*     */ public class Modell85
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modell85()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[98];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*     */     
/* 121 */     this.gunModel[0].addShapeBox(4.0F, -9.0F, 1.5F, 19, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 122 */     this.gunModel[0].setRotationPoint(-19.0F, 3.0F, -2.5F);
/*     */     
/* 124 */     this.gunModel[1].addBox(4.0F, -9.0F, 1.5F, 6, 1, 1, 0.0F);
/* 125 */     this.gunModel[1].setRotationPoint(10.0F, 2.35F, -2.0F);
/*     */     
/* 127 */     this.gunModel[2].addShapeBox(4.0F, -9.0F, 1.5F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 128 */     this.gunModel[2].setRotationPoint(16.0F, 2.5F, -2.15F);
/*     */     
/* 130 */     this.gunModel[3].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 131 */     this.gunModel[3].setRotationPoint(14.0F, 2.5F, -2.15F);
/*     */     
/* 133 */     this.gunModel[4].addShapeBox(4.0F, -9.0F, 1.5F, 4, 2, 2, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 134 */     this.gunModel[4].setRotationPoint(-13.0F, 5.0F, -2.5F);
/*     */     
/* 136 */     this.gunModel[5].addShapeBox(4.0F, -9.0F, 1.5F, 15, 1, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 137 */     this.gunModel[5].setRotationPoint(-15.0F, 3.0F, -0.5F);
/*     */     
/* 139 */     this.gunModel[6].addShapeBox(4.0F, -9.0F, 1.5F, 15, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F);
/* 140 */     this.gunModel[6].setRotationPoint(-15.0F, 3.0F, -2.75F);
/*     */     
/* 142 */     this.gunModel[7].addShapeBox(4.0F, -9.0F, 1.5F, 11, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 143 */     this.gunModel[7].setRotationPoint(-19.0F, 1.0F, -2.5F);
/*     */     
/* 145 */     this.gunModel[8].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 146 */     this.gunModel[8].setRotationPoint(-0.5F, 1.0F, -2.5F);
/*     */     
/* 148 */     this.gunModel[9].addShapeBox(4.0F, -9.0F, 1.5F, 7, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 149 */     this.gunModel[9].setRotationPoint(-8.0F, 1.0F, -2.5F);
/*     */     
/* 151 */     this.gunModel[10].addShapeBox(4.0F, -9.0F, 1.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 152 */     this.gunModel[10].setRotationPoint(-8.0F, 1.75F, -2.5F);
/*     */     
/* 154 */     this.gunModel[11].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 155 */     this.gunModel[11].setRotationPoint(-6.0F, 1.5F, -2.5F);
/*     */     
/* 157 */     this.gunModel[12].addShapeBox(4.0F, -9.0F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 158 */     this.gunModel[12].setRotationPoint(-8.0F, 1.5F, -2.5F);
/*     */     
/* 160 */     this.gunModel[13].addShapeBox(4.0F, -9.0F, 1.5F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 161 */     this.gunModel[13].setRotationPoint(-7.0F, 2.0F, -2.75F);
/*     */     
/* 163 */     this.gunModel[14].addShapeBox(4.0F, -9.0F, 1.5F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 164 */     this.gunModel[14].setRotationPoint(-7.0F, 2.0F, -0.5F);
/*     */     
/* 166 */     this.gunModel[15].addShapeBox(4.0F, -9.0F, 1.5F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 167 */     this.gunModel[15].setRotationPoint(-8.0F, 2.0F, -2.5F);
/*     */     
/* 169 */     this.gunModel[16].addShapeBox(4.0F, -9.0F, 1.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 170 */     this.gunModel[16].setRotationPoint(-19.0F, 2.0F, -2.5F);
/*     */     
/* 172 */     this.gunModel[17].addShapeBox(4.0F, -9.0F, 1.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/* 173 */     this.gunModel[17].setRotationPoint(-12.0F, 2.0F, -2.0F);
/*     */     
/* 175 */     this.gunModel[18].addShapeBox(4.0F, -9.0F, 1.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 176 */     this.gunModel[18].setRotationPoint(-12.0F, 2.25F, -1.5F);
/*     */     
/* 178 */     this.gunModel[19].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 179 */     this.gunModel[19].setRotationPoint(-9.0F, 2.25F, -4.0F);
/*     */     
/* 181 */     this.gunModel[20].addShapeBox(4.0F, -9.0F, 1.5F, 3, 1, 3, 0.0F, 0.0F, -0.3F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.3F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 182 */     this.gunModel[20].setRotationPoint(-5.0F, 4.5F, -3.0F);
/*     */     
/* 184 */     this.gunModel[21].addShapeBox(4.0F, -9.0F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 185 */     this.gunModel[21].setRotationPoint(-4.0F, 5.5F, -2.25F);
/*     */     
/* 187 */     this.gunModel[22].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 188 */     this.gunModel[22].setRotationPoint(-5.0F, 5.5F, -2.25F);
/*     */     
/* 190 */     this.gunModel[23].addShapeBox(4.0F, -9.0F, 1.5F, 2, 3, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 191 */     this.gunModel[23].setRotationPoint(-4.5F, 6.5F, -2.25F);
/*     */     
/* 193 */     this.gunModel[24].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.05F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.5F, 0.05F, -0.8F, 0.5F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F);
/* 194 */     this.gunModel[24].setRotationPoint(-2.2F, 5.7F, -2.0F);
/*     */     
/* 196 */     this.gunModel[25].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.5F, 0.0F, -0.8F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 197 */     this.gunModel[25].setRotationPoint(-1.2F, 5.7F, -2.0F);
/*     */     
/* 199 */     this.gunModel[26].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -0.8F, 0.25F, 0.0F, -0.8F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 200 */     this.gunModel[26].setRotationPoint(-0.2F, 5.3F, -2.0F);
/*     */     
/* 202 */     this.gunModel[27].addShapeBox(4.0F, -9.0F, 1.5F, 2, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 203 */     this.gunModel[27].setRotationPoint(0.0F, 1.1F, -0.75F);
/*     */     
/* 205 */     this.gunModel[28].addShapeBox(4.0F, -9.0F, 1.5F, 2, 3, 1, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 206 */     this.gunModel[28].setRotationPoint(8.0F, 1.1F, -3.25F);
/*     */     
/* 208 */     this.gunModel[29].addShapeBox(4.0F, -9.0F, 1.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 209 */     this.gunModel[29].setRotationPoint(1.0F, 4.1F, -0.75F);
/*     */     
/* 211 */     this.gunModel[30].addShapeBox(4.0F, -9.0F, 1.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 212 */     this.gunModel[30].setRotationPoint(1.0F, 4.1F, -3.25F);
/*     */     
/* 214 */     this.gunModel[31].addShapeBox(4.0F, -9.0F, 1.5F, 10, 3, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 215 */     this.gunModel[31].setRotationPoint(0.0F, 1.1F, -1.75F);
/*     */     
/* 217 */     this.gunModel[32].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 218 */     this.gunModel[32].setRotationPoint(1.0F, 0.6F, -2.25F);
/*     */     
/* 220 */     this.gunModel[33].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 221 */     this.gunModel[33].setRotationPoint(-5.0F, 1.5F, -2.5F);
/*     */     
/* 223 */     this.gunModel[34].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 224 */     this.gunModel[34].setRotationPoint(-4.0F, 1.5F, -2.5F);
/*     */     
/* 226 */     this.gunModel[35].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 227 */     this.gunModel[35].setRotationPoint(-3.0F, 1.5F, -2.5F);
/*     */     
/* 229 */     this.gunModel[36].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 230 */     this.gunModel[36].setRotationPoint(-2.0F, 1.5F, -2.5F);
/*     */     
/* 232 */     this.gunModel[37].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 233 */     this.gunModel[37].setRotationPoint(0.0F, 4.1F, -3.25F);
/*     */     
/* 235 */     this.gunModel[38].addShapeBox(4.0F, -9.0F, 1.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 236 */     this.gunModel[38].setRotationPoint(1.0F, 4.1F, -1.75F);
/*     */     
/* 238 */     this.gunModel[39].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 239 */     this.gunModel[39].setRotationPoint(0.0F, 4.1F, -0.75F);
/*     */     
/* 241 */     this.gunModel[40].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 242 */     this.gunModel[40].setRotationPoint(0.0F, 4.1F, -1.75F);
/*     */     
/* 244 */     this.gunModel[41].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 245 */     this.gunModel[41].setRotationPoint(7.5F, 0.6F, -1.75F);
/*     */     
/* 247 */     this.gunModel[42].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 248 */     this.gunModel[42].setRotationPoint(5.5F, 0.6F, -1.75F);
/*     */     
/* 250 */     this.gunModel[43].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 251 */     this.gunModel[43].setRotationPoint(4.0F, 0.6F, -1.75F);
/*     */     
/* 253 */     this.gunModel[44].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 254 */     this.gunModel[44].setRotationPoint(2.5F, 0.6F, -1.75F);
/*     */     
/* 256 */     this.gunModel[45].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 257 */     this.gunModel[45].setRotationPoint(1.0F, 0.6F, -1.75F);
/*     */     
/* 259 */     this.gunModel[46].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 260 */     this.gunModel[46].setRotationPoint(0.5F, 0.6F, -1.75F);
/*     */     
/* 262 */     this.gunModel[47].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.33F);
/* 263 */     this.gunModel[47].setRotationPoint(5.0F, 0.6F, -1.75F);
/*     */     
/* 265 */     this.gunModel[48].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.33F);
/* 266 */     this.gunModel[48].setRotationPoint(3.5F, 0.6F, -1.75F);
/*     */     
/* 268 */     this.gunModel[49].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.33F);
/* 269 */     this.gunModel[49].setRotationPoint(2.0F, 0.6F, -1.75F);
/*     */     
/* 271 */     this.gunModel[50].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.33F);
/* 272 */     this.gunModel[50].setRotationPoint(6.5F, 0.6F, -1.75F);
/*     */     
/* 274 */     this.gunModel[51].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 275 */     this.gunModel[51].setRotationPoint(0.0F, 0.6F, -1.75F);
/*     */     
/* 277 */     this.gunModel[52].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 278 */     this.gunModel[52].setRotationPoint(0.0F, 0.6F, -2.25F);
/*     */     
/* 280 */     this.gunModel[53].addShapeBox(4.0F, -9.0F, 1.5F, 2, 3, 1, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 281 */     this.gunModel[53].setRotationPoint(8.0F, 1.1F, -0.75F);
/*     */     
/* 283 */     this.gunModel[54].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 284 */     this.gunModel[54].setRotationPoint(5.5F, 1.1F, -0.75F);
/*     */     
/* 286 */     this.gunModel[55].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 287 */     this.gunModel[55].setRotationPoint(4.0F, 1.1F, -0.75F);
/*     */     
/* 289 */     this.gunModel[56].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 290 */     this.gunModel[56].setRotationPoint(2.5F, 1.1F, -0.75F);
/*     */     
/* 292 */     this.gunModel[57].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 293 */     this.gunModel[57].setRotationPoint(2.0F, 1.1F, -0.75F);
/*     */     
/* 295 */     this.gunModel[58].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 296 */     this.gunModel[58].setRotationPoint(3.5F, 1.1F, -0.75F);
/*     */     
/* 298 */     this.gunModel[59].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 299 */     this.gunModel[59].setRotationPoint(5.0F, 1.1F, -0.75F);
/*     */     
/* 301 */     this.gunModel[60].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 302 */     this.gunModel[60].setRotationPoint(6.5F, 1.1F, -0.75F);
/*     */     
/* 304 */     this.gunModel[61].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 305 */     this.gunModel[61].setRotationPoint(6.5F, 0.85F, -0.75F);
/*     */     
/* 307 */     this.gunModel[62].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 308 */     this.gunModel[62].setRotationPoint(5.0F, 0.85F, -0.75F);
/*     */     
/* 310 */     this.gunModel[63].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 311 */     this.gunModel[63].setRotationPoint(3.5F, 0.85F, -0.75F);
/*     */     
/* 313 */     this.gunModel[64].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 314 */     this.gunModel[64].setRotationPoint(2.0F, 0.85F, -0.75F);
/*     */     
/* 316 */     this.gunModel[65].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 317 */     this.gunModel[65].setRotationPoint(3.0F, 0.6F, -2.25F);
/*     */     
/* 319 */     this.gunModel[66].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 320 */     this.gunModel[66].setRotationPoint(4.5F, 0.6F, -2.25F);
/*     */     
/* 322 */     this.gunModel[67].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 323 */     this.gunModel[67].setRotationPoint(6.0F, 0.6F, -2.25F);
/*     */     
/* 325 */     this.gunModel[68].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 326 */     this.gunModel[68].setRotationPoint(7.5F, 0.6F, -2.25F);
/*     */     
/* 328 */     this.gunModel[69].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.33F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 329 */     this.gunModel[69].setRotationPoint(6.5F, 0.6F, -2.25F);
/*     */     
/* 331 */     this.gunModel[70].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.33F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 332 */     this.gunModel[70].setRotationPoint(5.0F, 0.6F, -2.25F);
/*     */     
/* 334 */     this.gunModel[71].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.33F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 335 */     this.gunModel[71].setRotationPoint(2.0F, 0.6F, -2.25F);
/*     */     
/* 337 */     this.gunModel[72].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.33F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 338 */     this.gunModel[72].setRotationPoint(3.5F, 0.6F, -2.25F);
/*     */     
/* 340 */     this.gunModel[73].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 341 */     this.gunModel[73].setRotationPoint(6.5F, 0.85F, -3.25F);
/*     */     
/* 343 */     this.gunModel[74].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 344 */     this.gunModel[74].setRotationPoint(5.5F, 1.1F, -3.25F);
/*     */     
/* 346 */     this.gunModel[75].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 347 */     this.gunModel[75].setRotationPoint(4.0F, 1.1F, -3.25F);
/*     */     
/* 349 */     this.gunModel[76].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 350 */     this.gunModel[76].setRotationPoint(5.0F, 1.1F, -3.25F);
/*     */     
/* 352 */     this.gunModel[77].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 353 */     this.gunModel[77].setRotationPoint(2.5F, 1.1F, -3.25F);
/*     */     
/* 355 */     this.gunModel[78].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 356 */     this.gunModel[78].setRotationPoint(3.5F, 1.1F, -3.25F);
/*     */     
/* 358 */     this.gunModel[79].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 359 */     this.gunModel[79].setRotationPoint(1.0F, 1.1F, -3.25F);
/*     */     
/* 361 */     this.gunModel[80].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 362 */     this.gunModel[80].setRotationPoint(2.0F, 1.1F, -3.25F);
/*     */     
/* 364 */     this.gunModel[81].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 365 */     this.gunModel[81].setRotationPoint(0.5F, 1.1F, -3.25F);
/*     */     
/* 367 */     this.gunModel[82].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 368 */     this.gunModel[82].setRotationPoint(6.5F, 1.1F, -3.25F);
/*     */     
/* 370 */     this.gunModel[83].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 371 */     this.gunModel[83].setRotationPoint(5.0F, 0.85F, -3.25F);
/*     */     
/* 373 */     this.gunModel[84].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 374 */     this.gunModel[84].setRotationPoint(3.5F, 0.85F, -3.25F);
/*     */     
/* 376 */     this.gunModel[85].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 377 */     this.gunModel[85].setRotationPoint(2.0F, 0.85F, -3.25F);
/*     */     
/* 379 */     this.gunModel[86].addShapeBox(4.0F, -9.0F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 380 */     this.gunModel[86].setRotationPoint(-19.0F, 6.0F, -2.5F);
/*     */     
/* 382 */     this.gunModel[87].addShapeBox(4.0F, -9.0F, 1.5F, 6, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 383 */     this.gunModel[87].setRotationPoint(-16.5F, 1.0F, -2.75F);
/*     */     
/* 385 */     this.gunModel[88].addShapeBox(4.0F, -9.0F, 1.5F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 386 */     this.gunModel[88].setRotationPoint(-15.5F, 2.0F, -2.75F);
/*     */     
/* 388 */     this.gunModel[89].addShapeBox(4.0F, -9.0F, 1.5F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 389 */     this.gunModel[89].setRotationPoint(-16.5F, 1.25F, -2.75F);
/*     */     
/* 391 */     this.gunModel[90].addShapeBox(4.0F, -9.0F, 1.5F, 1, 3, 2, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 392 */     this.gunModel[90].setRotationPoint(-20.0F, 4.0F, -2.5F);
/*     */     
/* 394 */     this.gunModel[91].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 395 */     this.gunModel[91].setRotationPoint(-20.0F, 1.75F, -2.5F);
/*     */     
/* 397 */     this.gunModel[92].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F);
/* 398 */     this.gunModel[92].setRotationPoint(-8.0F, -1.25F, -2.25F);
/*     */     
/* 400 */     this.gunModel[93].addShapeBox(4.0F, -9.0F, 1.5F, 1, 2, 1, 0.0F, 0.0F, 0.65F, 0.0F, -0.5F, 0.65F, 0.0F, -0.5F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 401 */     this.gunModel[93].setRotationPoint(8.5F, -0.35F, -2.0F);
/*     */     
/* 403 */     this.gunModel[94].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F);
/* 404 */     this.gunModel[94].setRotationPoint(8.5F, -1.75F, -2.0F);
/*     */     
/* 406 */     this.gunModel[95].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F);
/* 407 */     this.gunModel[95].setRotationPoint(8.5F, -1.75F, -1.15F);
/*     */     
/* 409 */     this.gunModel[96].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 410 */     this.gunModel[96].setRotationPoint(8.5F, -1.75F, -1.63F);
/*     */     
/* 412 */     this.gunModel[97].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 413 */     this.gunModel[97].setRotationPoint(-1.5F, 5.0F, -1.5F);
/*     */     
/*     */ 
/* 416 */     this.defaultScopeModel = new ModelRendererTurbo[12];
/* 417 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/* 418 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 419 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/* 420 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/* 421 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/* 422 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 423 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 424 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/* 425 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/* 426 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 427 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/* 428 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*     */     
/* 430 */     this.defaultScopeModel[0].addShapeBox(4.0F, -9.0F, 1.5F, 6, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 431 */     this.defaultScopeModel[0].setRotationPoint(-8.0F, 0.25F, -2.25F);
/*     */     
/* 433 */     this.defaultScopeModel[1].addShapeBox(4.0F, -9.0F, 1.5F, 1, 2, 2, 0.0F, -0.5F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, -0.15F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, 0.0F, -0.05F, 0.0F, -0.7F, -0.05F, 0.0F, -0.7F, -0.05F, -0.5F, 0.0F, -0.05F, -0.5F);
/* 434 */     this.defaultScopeModel[1].setRotationPoint(-2.35F, -0.95F, -2.25F);
/*     */     
/* 436 */     this.defaultScopeModel[2].addShapeBox(4.0F, -9.0F, 1.5F, 1, 2, 2, 0.0F, 0.0F, -0.1F, 0.0F, -0.15F, -0.1F, 0.0F, -0.15F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.05F, 0.0F, -0.15F, -0.05F, 0.0F, -0.15F, -0.05F, -0.5F, 0.0F, -0.05F, -0.5F);
/* 437 */     this.defaultScopeModel[2].setRotationPoint(-8.0F, -0.95F, -2.25F);
/*     */     
/* 439 */     this.defaultScopeModel[3].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 440 */     this.defaultScopeModel[3].setRotationPoint(-7.1F, -0.85F, -2.75F);
/*     */     
/* 442 */     this.defaultScopeModel[4].addShapeBox(4.0F, -9.0F, 1.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F);
/* 443 */     this.defaultScopeModel[4].setRotationPoint(-7.0F, -1.25F, -2.25F);
/*     */     
/* 445 */     this.defaultScopeModel[5].addShapeBox(4.0F, -9.0F, 1.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F);
/* 446 */     this.defaultScopeModel[5].setRotationPoint(-7.0F, -1.25F, -1.25F);
/*     */     
/* 448 */     this.defaultScopeModel[6].addShapeBox(4.0F, -9.0F, 1.5F, 6, 1, 1, 0.0F, 0.0F, -0.1F, 0.0F, 0.5F, -0.35F, 0.0F, 0.5F, -0.35F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F);
/* 449 */     this.defaultScopeModel[6].setRotationPoint(-8.0F, -1.25F, -1.75F);
/*     */     
/* 451 */     this.defaultScopeModel[7].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F);
/* 452 */     this.defaultScopeModel[7].setRotationPoint(-8.0F, -1.25F, -1.25F);
/*     */     
/* 454 */     this.defaultScopeModel[8].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F);
/* 455 */     this.defaultScopeModel[8].setRotationPoint(-8.0F, -1.65F, -1.25F);
/*     */     
/* 457 */     this.defaultScopeModel[9].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F);
/* 458 */     this.defaultScopeModel[9].setRotationPoint(-8.5F, -1.65F, -1.25F);
/*     */     
/* 460 */     this.defaultScopeModel[10].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F);
/* 461 */     this.defaultScopeModel[10].setRotationPoint(-8.5F, -1.65F, -2.25F);
/*     */     
/* 463 */     this.defaultScopeModel[11].addShapeBox(4.0F, -9.0F, 1.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F);
/* 464 */     this.defaultScopeModel[11].setRotationPoint(-8.0F, -1.65F, -2.25F);
/*     */     
/*     */ 
/* 467 */     this.ammoModel = new ModelRendererTurbo[2];
/* 468 */     this.ammoModel[0] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/* 469 */     this.ammoModel[1] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*     */     
/* 471 */     this.ammoModel[0].addShapeBox(4.0F, -9.0F, 1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.8F, -0.25F, 0.0F, 0.8F);
/* 472 */     this.ammoModel[0].setRotationPoint(-13.0F, 7.0F, -2.38F);
/*     */     
/* 474 */     this.ammoModel[1].addShapeBox(4.0F, -9.0F, 1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.8F, -1.0F, 0.0F, 0.8F);
/* 475 */     this.ammoModel[1].setRotationPoint(-12.75F, 9.0F, -2.38F);
/*     */     
/* 477 */     translateAll(0.0F, -1.25F, 0.0F);
/* 478 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 480 */     this.gunSlideDistance = 0.0F;
/* 481 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 483 */     this.tiltGun = 10.0F;
/* 484 */     this.rotateGunVertical = 3.0F;
/* 485 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 487 */     this.rotateClipVertical = 5.0F;
/* 488 */     this.translateClip = new Vector3f(0.0F, -3.0F, 0.0F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 494 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modell85.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */