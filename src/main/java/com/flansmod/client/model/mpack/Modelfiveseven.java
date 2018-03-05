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
/*     */ public class Modelfiveseven
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelfiveseven()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[123];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 393, 121, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 169, 153, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 353, 153, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 353, 169, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 473, 81, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 441, 153, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 121, 177, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 233, 177, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 273, 185, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 321, 185, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 441, 185, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 345, 193, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 393, 193, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 465, 193, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 57, 201, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 97, 201, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 137, 201, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 177, 201, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 417, 201, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 201, 217, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 33, 201, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 321, 217, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 369, 217, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 449, 217, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 41, 225, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 81, 225, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 129, 225, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 161, 225, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 273, 153, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 377, 193, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 409, 233, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 305, 241, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 1, 249, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 89, 249, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 153, 249, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 209, 249, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 105, 177, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 225, 177, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 369, 257, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 81, 201, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 457, 257, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 121, 201, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 297, 273, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 369, 273, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 401, 273, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 441, 281, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 161, 201, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 73, 249, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 129, 249, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 49, 289, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 193, 249, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 297, 297, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 1, 321, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 97, 305, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 313, 313, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 201, 201, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 489, 145, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 25, 225, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 73, 225, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 113, 345, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 185, 345, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 113, 353, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 185, 353, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 257, 353, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 449, 313, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 185, 65, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 81, 361, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 137, 361, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 233, 345, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 257, 361, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 337, 361, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 113, 369, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 169, 369, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 217, 369, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 361, 377, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 417, 377, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 465, 377, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 81, 385, this.textureX, this.textureY);
/*     */     
/* 146 */     this.gunModel[0].addShapeBox(-12.0F, -67.0F, -9.5F, 83, 8, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 147 */     this.gunModel[0].setRotationPoint(47.0F, 4.5F, 5.5F);
/*     */     
/* 149 */     this.gunModel[1].addShapeBox(-12.0F, -67.0F, -9.5F, 40, 3, 17, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 150 */     this.gunModel[1].setRotationPoint(82.0F, 16.75F, 0.5F);
/*     */     
/* 152 */     this.gunModel[2].addShapeBox(-12.0F, -67.0F, -9.5F, 41, 3, 17, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.25F, -0.5F, -3.0F);
/* 153 */     this.gunModel[2].setRotationPoint(81.0F, 19.75F, 0.5F);
/*     */     
/* 155 */     this.gunModel[3].addShapeBox(-12.0F, -67.0F, -9.5F, 22, 9, 18, 0.0F, 0.0F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -2.1F, -0.5F, 0.0F, -2.1F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 156 */     this.gunModel[3].setRotationPoint(60.9F, 16.75F, 0.0F);
/*     */     
/* 158 */     this.gunModel[4].addShapeBox(-12.0F, -67.0F, -9.5F, 36, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 159 */     this.gunModel[4].setRotationPoint(80.0F, 22.25F, 4.0F);
/*     */     
/* 161 */     this.gunModel[5].addShapeBox(-12.0F, -67.0F, -9.5F, 39, 1, 13, 0.0F, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 162 */     this.gunModel[5].setRotationPoint(77.0F, 26.25F, 2.5F);
/*     */     
/* 164 */     this.gunModel[6].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 165 */     this.gunModel[6].setRotationPoint(111.0F, 27.25F, 2.5F);
/*     */     
/* 167 */     this.gunModel[7].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 168 */     this.gunModel[7].setRotationPoint(104.5F, 27.25F, 2.5F);
/*     */     
/* 170 */     this.gunModel[8].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 171 */     this.gunModel[8].setRotationPoint(97.5F, 27.25F, 2.5F);
/*     */     
/* 173 */     this.gunModel[9].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 174 */     this.gunModel[9].setRotationPoint(91.5F, 27.25F, 2.5F);
/*     */     
/* 176 */     this.gunModel[10].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 177 */     this.gunModel[10].setRotationPoint(84.5F, 27.25F, 2.5F);
/*     */     
/* 179 */     this.gunModel[11].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 180 */     this.gunModel[11].setRotationPoint(77.0F, 27.25F, 2.5F);
/*     */     
/* 182 */     this.gunModel[12].addShapeBox(-12.0F, -67.0F, -9.5F, 34, 4, 18, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F);
/* 183 */     this.gunModel[12].setRotationPoint(38.9F, 25.75F, 0.0F);
/*     */     
/* 185 */     this.gunModel[13].addShapeBox(-12.0F, -67.0F, -9.5F, 8, 4, 9, 0.0F, 0.25F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -7.1F, 0.0F, 0.0F, -7.1F, 0.0F, -6.0F, 0.25F, 0.0F, -3.0F);
/* 186 */     this.gunModel[13].setRotationPoint(72.9F, 25.75F, 9.0F);
/*     */     
/* 188 */     this.gunModel[14].addShapeBox(-12.0F, -67.0F, -9.5F, 8, 4, 9, 0.0F, 0.25F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, -0.1F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, -3.0F, -7.1F, 0.0F, -6.0F, -7.1F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 189 */     this.gunModel[14].setRotationPoint(72.9F, 25.75F, 0.0F);
/*     */     
/* 191 */     this.gunModel[15].addShapeBox(-12.0F, -67.0F, -9.5F, 14, 9, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 192 */     this.gunModel[15].setRotationPoint(45.9F, 16.25F, 0.0F);
/*     */     
/* 194 */     this.gunModel[16].addShapeBox(-12.0F, -67.0F, -9.5F, 44, 8, 15, 0.0F, -0.5F, 0.95F, 0.0F, 0.5F, 0.95F, 0.0F, 0.5F, 0.95F, 0.0F, -0.5F, 0.95F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 195 */     this.gunModel[16].setRotationPoint(18.9F, 12.25F, 1.0F);
/*     */     
/* 197 */     this.gunModel[17].addShapeBox(-12.0F, -67.0F, -9.5F, 41, 9, 14, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 198 */     this.gunModel[17].setRotationPoint(-7.1F, 16.25F, 4.0F);
/*     */     
/* 200 */     this.gunModel[18].addShapeBox(-12.0F, -67.0F, -9.5F, 8, 7, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 201 */     this.gunModel[18].setRotationPoint(37.9F, 16.25F, 0.0F);
/*     */     
/* 203 */     this.gunModel[19].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 204 */     this.gunModel[19].setRotationPoint(37.9F, 22.75F, 0.0F);
/*     */     
/* 206 */     this.gunModel[20].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 207 */     this.gunModel[20].setRotationPoint(38.9F, 23.75F, 0.0F);
/*     */     
/* 209 */     this.gunModel[21].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 210 */     this.gunModel[21].setRotationPoint(38.9F, 22.75F, 0.0F);
/*     */     
/* 212 */     this.gunModel[22].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 1, 18, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[22].setRotationPoint(42.9F, 22.75F, 0.0F);
/*     */     
/* 215 */     this.gunModel[23].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[23].setRotationPoint(43.9F, 23.75F, 0.0F);
/*     */     
/* 218 */     this.gunModel[24].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 219 */     this.gunModel[24].setRotationPoint(41.9F, 23.35F, 0.0F);
/*     */     
/* 221 */     this.gunModel[25].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F);
/* 222 */     this.gunModel[25].setRotationPoint(40.9F, 23.35F, 0.0F);
/*     */     
/* 224 */     this.gunModel[26].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 18, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 225 */     this.gunModel[26].setRotationPoint(38.9F, 24.35F, 0.0F);
/*     */     
/* 227 */     this.gunModel[27].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 228 */     this.gunModel[27].setRotationPoint(43.9F, 24.35F, 0.0F);
/*     */     
/* 230 */     this.gunModel[28].addShapeBox(-12.0F, -67.0F, -9.5F, 6, 2, 18, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 231 */     this.gunModel[28].setRotationPoint(38.9F, 25.35F, 0.0F);
/*     */     
/* 233 */     this.gunModel[29].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 18, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 234 */     this.gunModel[29].setRotationPoint(38.9F, 27.35F, 0.0F);
/*     */     
/* 236 */     this.gunModel[30].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 237 */     this.gunModel[30].setRotationPoint(43.9F, 27.35F, 0.0F);
/*     */     
/* 239 */     this.gunModel[31].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 240 */     this.gunModel[31].setRotationPoint(41.9F, 28.35F, 0.0F);
/*     */     
/* 242 */     this.gunModel[32].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 18, 0.0F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 243 */     this.gunModel[32].setRotationPoint(40.9F, 28.35F, 0.0F);
/*     */     
/* 245 */     this.gunModel[33].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 9, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 246 */     this.gunModel[33].setRotationPoint(35.9F, 16.25F, 0.0F);
/*     */     
/* 248 */     this.gunModel[34].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 249 */     this.gunModel[34].setRotationPoint(44.9F, 22.75F, 0.0F);
/*     */     
/* 251 */     this.gunModel[35].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 8, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 252 */     this.gunModel[35].setRotationPoint(34.9F, 16.75F, 2.0F);
/*     */     
/* 254 */     this.gunModel[36].addShapeBox(-12.0F, -67.0F, -9.5F, 42, 9, 16, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 255 */     this.gunModel[36].setRotationPoint(-7.1F, 15.75F, 0.0F);
/*     */     
/* 257 */     this.gunModel[37].addShapeBox(-12.0F, -67.0F, -9.5F, 17, 14, 3, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -6.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -4.5F, 0.0F);
/* 258 */     this.gunModel[37].setRotationPoint(-24.1F, 15.75F, 0.0F);
/*     */     
/* 260 */     this.gunModel[38].addShapeBox(-12.0F, -67.0F, -9.5F, 17, 14, 3, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -4.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -1.0F, -6.5F, 0.0F);
/* 261 */     this.gunModel[38].setRotationPoint(-24.1F, 15.75F, 15.0F);
/*     */     
/* 263 */     this.gunModel[39].addShapeBox(-12.0F, -67.0F, -9.5F, 16, 14, 12, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -4.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -4.25F, 0.0F);
/* 264 */     this.gunModel[39].setRotationPoint(-23.1F, 15.75F, 3.0F);
/*     */     
/* 266 */     this.gunModel[40].addShapeBox(-12.0F, -67.0F, -9.5F, 18, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 267 */     this.gunModel[40].setRotationPoint(-24.1F, 15.25F, 3.5F);
/*     */     
/* 269 */     this.gunModel[41].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 4, 12, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 270 */     this.gunModel[41].setRotationPoint(-7.1F, 30.25F, 3.0F);
/*     */     
/* 272 */     this.gunModel[42].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 2, 12, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 273 */     this.gunModel[42].setRotationPoint(-5.1F, 34.25F, 3.0F);
/*     */     
/* 275 */     this.gunModel[43].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 12, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 276 */     this.gunModel[43].setRotationPoint(-3.1F, 36.25F, 3.0F);
/*     */     
/* 278 */     this.gunModel[44].addShapeBox(-12.0F, -67.0F, -9.5F, 6, 10, 12, 0.0F, -4.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 279 */     this.gunModel[44].setRotationPoint(-8.1F, 37.25F, 3.0F);
/*     */     
/* 281 */     this.gunModel[45].addShapeBox(-12.0F, -67.0F, -9.5F, 11, 11, 12, 0.0F, -5.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 282 */     this.gunModel[45].setRotationPoint(-13.1F, 47.25F, 3.0F);
/*     */     
/* 284 */     this.gunModel[46].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 3, 12, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -2.75F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.75F, 1.0F, 0.0F);
/* 285 */     this.gunModel[46].setRotationPoint(-12.1F, 83.25F, 3.0F);
/*     */     
/* 287 */     this.gunModel[47].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 288 */     this.gunModel[47].setRotationPoint(-24.1F, 16.25F, 3.0F);
/*     */     
/* 290 */     this.gunModel[48].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 2, 18, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 4.0F, -3.0F, -0.25F, 2.0F, -3.0F, -0.25F, 2.0F, -3.0F, 0.25F, 4.0F, -3.0F);
/* 291 */     this.gunModel[48].setRotationPoint(33.9F, 25.75F, 0.0F);
/*     */     
/* 293 */     this.gunModel[49].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 4, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -2.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, -2.0F);
/* 294 */     this.gunModel[49].setRotationPoint(-7.1F, 30.25F, 15.0F);
/*     */     
/* 296 */     this.gunModel[50].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 2, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, -2.0F);
/* 297 */     this.gunModel[50].setRotationPoint(-5.1F, 34.25F, 15.0F);
/*     */     
/* 299 */     this.gunModel[51].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F);
/* 300 */     this.gunModel[51].setRotationPoint(-3.1F, 36.25F, 15.0F);
/*     */     
/* 302 */     this.gunModel[52].addShapeBox(-12.0F, -67.0F, -9.5F, 6, 10, 3, 0.0F, -4.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F);
/* 303 */     this.gunModel[52].setRotationPoint(-8.1F, 37.25F, 15.0F);
/*     */     
/* 305 */     this.gunModel[53].addShapeBox(-12.0F, -67.0F, -9.5F, 11, 11, 3, 0.0F, -5.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.25F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -2.0F);
/* 306 */     this.gunModel[53].setRotationPoint(-13.1F, 47.25F, 15.0F);
/*     */     
/* 308 */     this.gunModel[54].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 3, 3, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, -2.0F, -2.75F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.75F, 1.0F, -2.0F);
/* 309 */     this.gunModel[54].setRotationPoint(-12.1F, 86.25F, 15.0F);
/*     */     
/* 311 */     this.gunModel[55].addShapeBox(-12.0F, -67.0F, -9.5F, 11, 11, 3, 0.0F, -5.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.25F, 0.0F, 0.0F, -1.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 312 */     this.gunModel[55].setRotationPoint(-13.1F, 47.25F, 0.0F);
/*     */     
/* 314 */     this.gunModel[56].addShapeBox(-12.0F, -67.0F, -9.5F, 6, 10, 3, 0.0F, -4.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 315 */     this.gunModel[56].setRotationPoint(-8.1F, 37.25F, 0.0F);
/*     */     
/* 317 */     this.gunModel[57].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 3, 0.0F, 0.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 318 */     this.gunModel[57].setRotationPoint(-3.1F, 36.25F, 0.0F);
/*     */     
/* 320 */     this.gunModel[58].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 2, 3, 0.0F, -0.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 321 */     this.gunModel[58].setRotationPoint(-5.1F, 34.25F, 0.0F);
/*     */     
/* 323 */     this.gunModel[59].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 4, 3, 0.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 324 */     this.gunModel[59].setRotationPoint(-7.1F, 30.25F, 0.0F);
/*     */     
/* 326 */     this.gunModel[60].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 3, 3, 0.0F, 3.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -2.75F, 1.0F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.75F, 1.0F, 0.0F);
/* 327 */     this.gunModel[60].setRotationPoint(-12.1F, 86.25F, 0.0F);
/*     */     
/* 329 */     this.gunModel[61].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 330 */     this.gunModel[61].setRotationPoint(-7.35F, 25.25F, 0.0F);
/*     */     
/* 332 */     this.gunModel[62].addShapeBox(-12.0F, -67.0F, -9.5F, 12, 7, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.5F, 0.0F);
/* 333 */     this.gunModel[62].setRotationPoint(21.65F, 25.25F, 0.0F);
/*     */     
/* 335 */     this.gunModel[63].addShapeBox(-12.0F, -67.0F, -9.5F, 24, 5, 18, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 336 */     this.gunModel[63].setRotationPoint(-2.35F, 30.25F, 0.0F);
/*     */     
/* 338 */     this.gunModel[64].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 18, 18, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -3.0F, 2.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, -3.0F, -2.0F, -0.5F, -3.0F, 0.0F, 0.5F, 0.0F);
/* 339 */     this.gunModel[64].setRotationPoint(21.65F, 31.75F, 0.0F);
/*     */     
/* 341 */     this.gunModel[65].addShapeBox(-12.0F, -67.0F, -9.5F, 8, 37, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -7.0F, -0.5F, -3.0F, -7.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F);
/* 342 */     this.gunModel[65].setRotationPoint(21.65F, 49.25F, 0.0F);
/*     */     
/* 344 */     this.gunModel[66].addShapeBox(-12.0F, -67.0F, -9.5F, 24, 51, 18, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 345 */     this.gunModel[66].setRotationPoint(-2.35F, 35.75F, 0.0F);
/*     */     
/* 347 */     this.gunModel[67].addBox(-12.0F, -67.0F, -9.5F, 4, 3, 8, 0.0F);
/* 348 */     this.gunModel[67].setRotationPoint(29.0F, 49.0F, 5.0F);
/*     */     
/* 350 */     this.gunModel[68].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 3, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 3.0F, 0.0F);
/* 351 */     this.gunModel[68].setRotationPoint(28.0F, 52.0F, 5.0F);
/*     */     
/* 353 */     this.gunModel[69].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 354 */     this.gunModel[69].setRotationPoint(31.0F, 52.0F, 5.0F);
/*     */     
/* 356 */     this.gunModel[70].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 2, 8, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 357 */     this.gunModel[70].setRotationPoint(29.0F, 47.0F, 5.0F);
/*     */     
/* 359 */     this.gunModel[71].addShapeBox(-12.0F, -67.0F, -9.5F, 33, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 360 */     this.gunModel[71].setRotationPoint(33.0F, 49.0F, 5.0F);
/*     */     
/* 362 */     this.gunModel[72].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 363 */     this.gunModel[72].setRotationPoint(66.0F, 47.0F, 5.0F);
/*     */     
/* 365 */     this.gunModel[73].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 15, 8, 0.0F, -2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 366 */     this.gunModel[73].setRotationPoint(66.0F, 32.0F, 5.0F);
/*     */     
/* 368 */     this.gunModel[74].addShapeBox(-12.0F, -67.0F, -9.5F, 8, 2, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/* 369 */     this.gunModel[74].setRotationPoint(66.0F, 30.0F, 5.0F);
/*     */     
/* 371 */     this.gunModel[75].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 4, 18, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 372 */     this.gunModel[75].setRotationPoint(-2.35F, 86.0F, 0.0F);
/*     */     
/* 374 */     this.gunModel[76].addShapeBox(-12.0F, -67.0F, -9.5F, 14, 2, 18, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 375 */     this.gunModel[76].setRotationPoint(7.65F, 86.0F, 0.0F);
/*     */     
/* 377 */     this.gunModel[77].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 7, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 378 */     this.gunModel[77].setRotationPoint(26.35F, 56.25F, 3.0F);
/*     */     
/* 380 */     this.gunModel[78].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 381 */     this.gunModel[78].setRotationPoint(24.35F, 63.25F, 3.0F);
/*     */     
/* 383 */     this.gunModel[79].addBox(-12.0F, -67.0F, -9.5F, 5, 5, 4, 0.0F);
/* 384 */     this.gunModel[79].setRotationPoint(24.5F, 48.0F, 13.0F);
/*     */     
/* 386 */     this.gunModel[80].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 387 */     this.gunModel[80].setRotationPoint(29.5F, 48.0F, 13.0F);
/*     */     
/* 389 */     this.gunModel[81].addShapeBox(-12.0F, -67.0F, -9.5F, 6, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 390 */     this.gunModel[81].setRotationPoint(23.5F, 48.0F, 17.0F);
/*     */     
/* 392 */     this.gunModel[82].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 14, 12, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 393 */     this.gunModel[82].setRotationPoint(-12.1F, 58.25F, 3.0F);
/*     */     
/* 395 */     this.gunModel[83].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 14, 3, 0.0F, -0.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 396 */     this.gunModel[83].setRotationPoint(-12.1F, 58.25F, 0.0F);
/*     */     
/* 398 */     this.gunModel[84].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 14, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F);
/* 399 */     this.gunModel[84].setRotationPoint(-12.1F, 58.25F, 15.0F);
/*     */     
/* 401 */     this.gunModel[85].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 14, 3, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, -2.0F);
/* 402 */     this.gunModel[85].setRotationPoint(-12.1F, 72.25F, 15.0F);
/*     */     
/* 404 */     this.gunModel[86].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 14, 12, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F);
/* 405 */     this.gunModel[86].setRotationPoint(-12.1F, 72.25F, 3.0F);
/*     */     
/* 407 */     this.gunModel[87].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 14, 3, 0.0F, 2.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 3.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F);
/* 408 */     this.gunModel[87].setRotationPoint(-12.1F, 72.25F, 0.0F);
/*     */     
/* 410 */     this.gunModel[88].addShapeBox(-12.0F, -67.0F, -9.5F, 69, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 411 */     this.gunModel[88].setRotationPoint(-7.35F, 16.25F, 16.0F);
/*     */     
/* 413 */     this.gunModel[89].addShapeBox(-12.0F, -67.0F, -9.5F, 145, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 414 */     this.gunModel[89].setRotationPoint(-23.1F, 15.75F, 1.0F);
/*     */     
/* 416 */     this.gunModel[90].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 417 */     this.gunModel[90].setRotationPoint(32.9F, 16.25F, 16.0F);
/*     */     
/* 419 */     this.gunModel[91].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 420 */     this.gunModel[91].setRotationPoint(32.9F, 16.25F, 0.5F);
/*     */     
/* 422 */     this.gunModel[92].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 423 */     this.gunModel[92].setRotationPoint(25.5F, 48.0F, 2.0F);
/*     */     
/* 425 */     this.gunModel[93].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 426 */     this.gunModel[93].setRotationPoint(42.0F, 33.75F, 5.5F);
/*     */     
/* 428 */     this.gunModel[94].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 429 */     this.gunModel[94].setRotationPoint(37.0F, 29.5F, 5.5F);
/*     */     
/* 431 */     this.gunModel[95].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/* 432 */     this.gunModel[95].setRotationPoint(40.0F, 33.5F, 5.5F);
/*     */     
/* 434 */     this.gunModel[96].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 435 */     this.gunModel[96].setRotationPoint(41.0F, 37.75F, 5.5F);
/*     */     
/* 437 */     this.gunModel[97].addShapeBox(-12.0F, -67.0F, -9.5F, 6, 1, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 2.0F, 1.5F, 0.0F, 2.0F, 1.5F, 0.0F, -2.0F, 0.5F, 0.0F);
/* 438 */     this.gunModel[97].setRotationPoint(42.0F, 40.75F, 5.5F);
/*     */     
/* 440 */     this.gunModel[98].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 441 */     this.gunModel[98].setRotationPoint(42.0F, 28.75F, 5.5F);
/*     */     
/* 443 */     this.gunModel[99].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 444 */     this.gunModel[99].setRotationPoint(42.0F, 32.75F, 5.5F);
/*     */     
/* 446 */     this.gunModel[100].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 447 */     this.gunModel[100].setRotationPoint(36.0F, -1.5F, 6.0F);
/*     */     
/* 449 */     this.gunModel[101].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 450 */     this.gunModel[101].setRotationPoint(36.0F, 6.5F, 6.0F);
/*     */     
/* 452 */     this.gunModel[102].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 453 */     this.gunModel[102].setRotationPoint(36.0F, 12.5F, 6.0F);
/*     */     
/* 455 */     this.gunModel[103].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 4, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 456 */     this.gunModel[103].setRotationPoint(36.0F, 0.5F, 2.0F);
/*     */     
/* 458 */     this.gunModel[104].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 459 */     this.gunModel[104].setRotationPoint(36.0F, 4.5F, 2.0F);
/*     */     
/* 461 */     this.gunModel[105].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 462 */     this.gunModel[105].setRotationPoint(36.0F, -0.5F, 5.0F);
/*     */     
/* 464 */     this.gunModel[106].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 465 */     this.gunModel[106].setRotationPoint(6.5F, 24.0F, 17.5F);
/*     */     
/* 467 */     this.gunModel[107].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 468 */     this.gunModel[107].setRotationPoint(12.5F, 24.0F, 17.5F);
/*     */     
/* 470 */     this.gunModel[108].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 471 */     this.gunModel[108].setRotationPoint(8.5F, 24.0F, 17.5F);
/*     */     
/* 473 */     this.gunModel[109].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 2, 3, 0.0F, 0.0F, 2.0F, -0.5F, 2.0F, 2.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 474 */     this.gunModel[109].setRotationPoint(5.5F, 22.0F, 17.5F);
/*     */     
/* 476 */     this.gunModel[110].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 3, 0.0F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.0F, -1.5F, -1.0F);
/* 477 */     this.gunModel[110].setRotationPoint(3.5F, 22.0F, 17.5F);
/*     */     
/* 479 */     this.gunModel[111].addShapeBox(-12.0F, -67.0F, -9.5F, 6, 2, 19, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 480 */     this.gunModel[111].setRotationPoint(51.9F, 19.35F, -0.5F);
/*     */     
/* 482 */     this.gunModel[112].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 19, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 483 */     this.gunModel[112].setRotationPoint(51.9F, 21.35F, -0.5F);
/*     */     
/* 485 */     this.gunModel[113].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 19, 0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 486 */     this.gunModel[113].setRotationPoint(54.9F, 22.35F, -0.5F);
/*     */     
/* 488 */     this.gunModel[114].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 19, 0.0F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 489 */     this.gunModel[114].setRotationPoint(53.9F, 22.35F, -0.5F);
/*     */     
/* 491 */     this.gunModel[115].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 19, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 492 */     this.gunModel[115].setRotationPoint(56.9F, 21.35F, -0.5F);
/*     */     
/* 494 */     this.gunModel[116].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 19, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 495 */     this.gunModel[116].setRotationPoint(56.9F, 18.35F, -0.5F);
/*     */     
/* 497 */     this.gunModel[117].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 19, 0.0F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 498 */     this.gunModel[117].setRotationPoint(54.9F, 17.35F, -0.5F);
/*     */     
/* 500 */     this.gunModel[118].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 19, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F);
/* 501 */     this.gunModel[118].setRotationPoint(53.9F, 17.35F, -0.5F);
/*     */     
/* 503 */     this.gunModel[119].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 19, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 504 */     this.gunModel[119].setRotationPoint(51.9F, 18.35F, -0.5F);
/*     */     
/* 506 */     this.gunModel[120].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 2, 18, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 507 */     this.gunModel[120].setRotationPoint(55.9F, 20.35F, 0.0F);
/*     */     
/* 509 */     this.gunModel[121].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 6, 14, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 510 */     this.gunModel[121].setRotationPoint(76.5F, 17.35F, 4.0F);
/*     */     
/* 512 */     this.gunModel[122].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 6, 14, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 513 */     this.gunModel[122].setRotationPoint(78.9F, 17.35F, 4.0F);
/*     */     
/*     */ 
/* 516 */     this.defaultScopeModel = new ModelRendererTurbo[16];
/* 517 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/* 518 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 519 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 520 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 521 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/* 522 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 523 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 524 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/* 525 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/* 526 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 527 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/* 528 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/* 529 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 530 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/* 531 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/* 532 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*     */     
/* 534 */     this.defaultScopeModel[0].addBox(-12.0F, -67.0F, -9.5F, 3, 3, 16, 0.0F);
/* 535 */     this.defaultScopeModel[0].setRotationPoint(-19.9F, -5.5F, 1.0F);
/*     */     
/* 537 */     this.defaultScopeModel[1].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 538 */     this.defaultScopeModel[1].setRotationPoint(-19.9F, -8.5F, 2.0F);
/*     */     
/* 540 */     this.defaultScopeModel[2].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 541 */     this.defaultScopeModel[2].setRotationPoint(-19.9F, -8.5F, 11.0F);
/*     */     
/* 543 */     this.defaultScopeModel[3].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 544 */     this.defaultScopeModel[3].setRotationPoint(-20.15F, -7.75F, 4.0F);
/*     */     
/* 546 */     this.defaultScopeModel[4].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 547 */     this.defaultScopeModel[4].setRotationPoint(-20.15F, -7.75F, 12.0F);
/*     */     
/* 549 */     this.defaultScopeModel[5].addBox(-12.0F, -67.0F, -9.5F, 5, 3, 15, 0.0F);
/* 550 */     this.defaultScopeModel[5].setRotationPoint(-16.9F, -5.5F, 1.5F);
/*     */     
/* 552 */     this.defaultScopeModel[6].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 553 */     this.defaultScopeModel[6].setRotationPoint(-16.9F, -6.5F, 1.5F);
/*     */     
/* 555 */     this.defaultScopeModel[7].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 556 */     this.defaultScopeModel[7].setRotationPoint(-16.9F, -6.5F, 10.5F);
/*     */     
/* 558 */     this.defaultScopeModel[8].addBox(-12.0F, -67.0F, -9.5F, 16, 2, 13, 0.0F);
/* 559 */     this.defaultScopeModel[8].setRotationPoint(-11.9F, -4.5F, 2.5F);
/*     */     
/* 561 */     this.defaultScopeModel[9].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 562 */     this.defaultScopeModel[9].setRotationPoint(117.0F, -4.5F, 7.5F);
/*     */     
/* 564 */     this.defaultScopeModel[10].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 6, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 565 */     this.defaultScopeModel[10].setRotationPoint(114.0F, -7.5F, 7.5F);
/*     */     
/* 567 */     this.defaultScopeModel[11].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 568 */     this.defaultScopeModel[11].setRotationPoint(117.0F, -5.5F, 7.5F);
/*     */     
/* 570 */     this.defaultScopeModel[12].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 571 */     this.defaultScopeModel[12].setRotationPoint(117.0F, -7.5F, 7.5F);
/*     */     
/* 573 */     this.defaultScopeModel[13].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 574 */     this.defaultScopeModel[13].setRotationPoint(-19.9F, -8.5F, 1.0F);
/*     */     
/* 576 */     this.defaultScopeModel[14].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 577 */     this.defaultScopeModel[14].setRotationPoint(-19.9F, -8.5F, 16.0F);
/*     */     
/* 579 */     this.defaultScopeModel[15].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 1, 0.0F, -0.2F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, 0.3F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.3F, 0.25F, 0.25F);
/* 580 */     this.defaultScopeModel[15].setRotationPoint(115.6F, -7.0F, 8.5F);
/*     */     
/*     */ 
/* 583 */     this.ammoModel = new ModelRendererTurbo[5];
/* 584 */     this.ammoModel[0] = new ModelRendererTurbo(this, 385, 345, this.textureX, this.textureY);
/* 585 */     this.ammoModel[1] = new ModelRendererTurbo(this, 305, 353, this.textureX, this.textureY);
/* 586 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/* 587 */     this.ammoModel[3] = new ModelRendererTurbo(this, 433, 353, this.textureX, this.textureY);
/* 588 */     this.ammoModel[4] = new ModelRendererTurbo(this, 1, 361, this.textureX, this.textureY);
/*     */     
/* 590 */     this.ammoModel[0].addShapeBox(-12.0F, -67.0F, -9.5F, 14, 5, 19, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 591 */     this.ammoModel[0].setRotationPoint(7.65F, 86.0F, -0.5F);
/*     */     
/* 593 */     this.ammoModel[1].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 5, 19, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -6.0F, -4.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -6.0F, 0.0F, -0.25F, -6.0F, 0.0F, -0.25F, 0.0F);
/* 594 */     this.ammoModel[1].setRotationPoint(21.65F, 86.0F, -0.5F);
/*     */     
/* 596 */     this.ammoModel[2].addShapeBox(-12.0F, -67.0F, -9.5F, 10, 4, 19, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 597 */     this.ammoModel[2].setRotationPoint(-2.35F, 87.0F, -0.5F);
/*     */     
/* 599 */     this.ammoModel[3].addShapeBox(-12.0F, -67.0F, -9.5F, 13, 4, 19, 0.0F, 0.25F, 1.0F, -2.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, 1.0F, -2.0F, 0.5F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, -2.0F);
/* 600 */     this.ammoModel[3].setRotationPoint(-15.35F, 87.0F, -0.5F);
/*     */     
/* 602 */     this.ammoModel[4].addShapeBox(-12.0F, -67.0F, -9.5F, 26, 50, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 603 */     this.ammoModel[4].setRotationPoint(-4.35F, 41.0F, 3.5F);
/*     */     
/*     */ 
/* 606 */     this.slideModel = new ModelRendererTurbo[62];
/* 607 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 608 */     this.slideModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/* 609 */     this.slideModel[2] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/* 610 */     this.slideModel[3] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/* 611 */     this.slideModel[4] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/* 612 */     this.slideModel[5] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/* 613 */     this.slideModel[6] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 614 */     this.slideModel[7] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 615 */     this.slideModel[8] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/* 616 */     this.slideModel[9] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/* 617 */     this.slideModel[10] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/* 618 */     this.slideModel[11] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/* 619 */     this.slideModel[12] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/* 620 */     this.slideModel[13] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 621 */     this.slideModel[14] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 622 */     this.slideModel[15] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/* 623 */     this.slideModel[16] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/* 624 */     this.slideModel[17] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/* 625 */     this.slideModel[18] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/* 626 */     this.slideModel[19] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/* 627 */     this.slideModel[20] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/* 628 */     this.slideModel[21] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/* 629 */     this.slideModel[22] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 630 */     this.slideModel[23] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/* 631 */     this.slideModel[24] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/* 632 */     this.slideModel[25] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/* 633 */     this.slideModel[26] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/* 634 */     this.slideModel[27] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/* 635 */     this.slideModel[28] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 636 */     this.slideModel[29] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/* 637 */     this.slideModel[30] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/* 638 */     this.slideModel[31] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 639 */     this.slideModel[32] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/* 640 */     this.slideModel[33] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/* 641 */     this.slideModel[34] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/* 642 */     this.slideModel[35] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/* 643 */     this.slideModel[36] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 644 */     this.slideModel[37] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/* 645 */     this.slideModel[38] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/* 646 */     this.slideModel[39] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 647 */     this.slideModel[40] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/* 648 */     this.slideModel[41] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/* 649 */     this.slideModel[42] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/* 650 */     this.slideModel[43] = new ModelRendererTurbo(this, 265, 89, this.textureX, this.textureY);
/* 651 */     this.slideModel[44] = new ModelRendererTurbo(this, 145, 105, this.textureX, this.textureY);
/* 652 */     this.slideModel[45] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/* 653 */     this.slideModel[46] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 654 */     this.slideModel[47] = new ModelRendererTurbo(this, 233, 145, this.textureX, this.textureY);
/* 655 */     this.slideModel[48] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 656 */     this.slideModel[49] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/* 657 */     this.slideModel[50] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 658 */     this.slideModel[51] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 659 */     this.slideModel[52] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/* 660 */     this.slideModel[53] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 661 */     this.slideModel[54] = new ModelRendererTurbo(this, 377, 313, this.textureX, this.textureY);
/* 662 */     this.slideModel[55] = new ModelRendererTurbo(this, 313, 329, this.textureX, this.textureY);
/* 663 */     this.slideModel[56] = new ModelRendererTurbo(this, 441, 321, this.textureX, this.textureY);
/* 664 */     this.slideModel[57] = new ModelRendererTurbo(this, 1, 345, this.textureX, this.textureY);
/* 665 */     this.slideModel[58] = new ModelRendererTurbo(this, 361, 337, this.textureX, this.textureY);
/* 666 */     this.slideModel[59] = new ModelRendererTurbo(this, 89, 289, this.textureX, this.textureY);
/* 667 */     this.slideModel[60] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/* 668 */     this.slideModel[61] = new ModelRendererTurbo(this, 233, 209, this.textureX, this.textureY);
/*     */     
/* 670 */     this.slideModel[0].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 12, 18, 0.0F, -1.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.6F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 671 */     this.slideModel[0].setRotationPoint(-24.4F, 2.0F, 0.0F);
/*     */     
/* 673 */     this.slideModel[1].addShapeBox(-12.0F, -67.0F, -9.5F, 107, 1, 7, 0.0F, -0.3F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 674 */     this.slideModel[1].setRotationPoint(-24.4F, 14.0F, 11.0F);
/*     */     
/* 676 */     this.slideModel[2].addShapeBox(-12.0F, -67.0F, -9.5F, 108, 1, 3, 0.0F, -0.15F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 677 */     this.slideModel[2].setRotationPoint(-24.4F, 15.0F, 15.0F);
/*     */     
/* 679 */     this.slideModel[3].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 3, 18, 0.0F, -1.6F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 680 */     this.slideModel[3].setRotationPoint(-23.1F, -1.0F, 0.0F);
/*     */     
/* 682 */     this.slideModel[4].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 17, 0.0F, -1.9F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, -1.9F, 0.5F, -0.5F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 683 */     this.slideModel[4].setRotationPoint(-21.8F, -2.0F, 0.5F);
/*     */     
/* 685 */     this.slideModel[5].addShapeBox(-12.0F, -67.0F, -9.5F, 3, 12, 18, 0.0F, -0.4F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 686 */     this.slideModel[5].setRotationPoint(-22.8F, 2.0F, 0.0F);
/*     */     
/* 688 */     this.slideModel[6].addShapeBox(-12.0F, -67.0F, -9.5F, 41, 3, 18, 0.0F, -0.7F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
/* 689 */     this.slideModel[6].setRotationPoint(-21.8F, -1.0F, 0.0F);
/*     */     
/* 691 */     this.slideModel[7].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 3, 4, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.4F, 0.0F, -2.5F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.4F, 0.0F, -1.0F);
/* 692 */     this.slideModel[7].setRotationPoint(-21.8F, -1.0F, 16.5F);
/*     */     
/* 694 */     this.slideModel[8].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 3, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.4F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F);
/* 695 */     this.slideModel[8].setRotationPoint(-21.8F, 2.0F, 17.5F);
/*     */     
/* 697 */     this.slideModel[9].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 6, 3, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F);
/* 698 */     this.slideModel[9].setRotationPoint(-21.8F, 4.0F, 17.5F);
/*     */     
/* 700 */     this.slideModel[10].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 1, 17, 0.0F, -0.3F, 0.5F, -0.5F, -0.6F, 0.5F, -0.5F, -0.6F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
/* 701 */     this.slideModel[10].setRotationPoint(-12.2F, -2.0F, 0.5F);
/*     */     
/* 703 */     this.slideModel[11].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 1, 17, 0.0F, -0.4F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F, -0.4F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F);
/* 704 */     this.slideModel[11].setRotationPoint(-17.2F, -2.0F, 0.5F);
/*     */     
/* 706 */     this.slideModel[12].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 3, 3, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.4F, 0.0F, -1.0F);
/* 707 */     this.slideModel[12].setRotationPoint(-21.8F, 10.0F, 17.5F);
/*     */     
/* 709 */     this.slideModel[13].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 2, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.4F, 0.0F, -1.0F);
/* 710 */     this.slideModel[13].setRotationPoint(-21.8F, 13.0F, 17.5F);
/*     */     
/* 712 */     this.slideModel[14].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 3, 4, 0.0F, -0.4F, 0.0F, -2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 713 */     this.slideModel[14].setRotationPoint(-21.8F, -1.0F, -2.5F);
/*     */     
/* 715 */     this.slideModel[15].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 2, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 716 */     this.slideModel[15].setRotationPoint(-21.8F, 13.0F, -1.5F);
/*     */     
/* 718 */     this.slideModel[16].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 3, 3, 0.0F, -0.4F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 719 */     this.slideModel[16].setRotationPoint(-21.8F, 10.0F, -2.5F);
/*     */     
/* 721 */     this.slideModel[17].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 3, 0.0F, -0.4F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 722 */     this.slideModel[17].setRotationPoint(-21.8F, 2.0F, -2.5F);
/*     */     
/* 724 */     this.slideModel[18].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 6, 3, 0.0F, -0.4F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 725 */     this.slideModel[18].setRotationPoint(-21.8F, 4.0F, -2.5F);
/*     */     
/* 727 */     this.slideModel[19].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 12, 18, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F);
/* 728 */     this.slideModel[19].setRotationPoint(-19.5F, 2.0F, 0.0F);
/*     */     
/* 730 */     this.slideModel[20].addShapeBox(-12.0F, -67.0F, -9.5F, 12, 2, 18, 0.0F, 3.05F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 3.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 1.65F, 0.0F, 0.0F, 1.65F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F);
/* 731 */     this.slideModel[20].setRotationPoint(9.1F, 2.0F, 0.0F);
/*     */     
/* 733 */     this.slideModel[21].addShapeBox(-12.0F, -67.0F, -9.5F, 35, 12, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 734 */     this.slideModel[21].setRotationPoint(-19.5F, 2.0F, 0.5F);
/*     */     
/* 736 */     this.slideModel[22].addShapeBox(-12.0F, -67.0F, -9.5F, 5, 5, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/* 737 */     this.slideModel[22].setRotationPoint(9.0F, 4.0F, 0.0F);
/*     */     
/* 739 */     this.slideModel[23].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 3, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -3.0F, 0.0F);
/* 740 */     this.slideModel[23].setRotationPoint(13.5F, 9.0F, 0.0F);
/*     */     
/* 742 */     this.slideModel[24].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 3, 18, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 743 */     this.slideModel[24].setRotationPoint(13.5F, 11.0F, 0.0F);
/*     */     
/* 745 */     this.slideModel[25].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 5, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 746 */     this.slideModel[25].setRotationPoint(13.5F, 4.0F, 0.0F);
/*     */     
/* 748 */     this.slideModel[26].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 749 */     this.slideModel[26].setRotationPoint(-17.5F, 2.5F, 0.0F);
/*     */     
/* 751 */     this.slideModel[27].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 752 */     this.slideModel[27].setRotationPoint(-14.5F, 2.5F, 0.0F);
/*     */     
/* 754 */     this.slideModel[28].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 755 */     this.slideModel[28].setRotationPoint(-8.5F, 2.5F, 0.0F);
/*     */     
/* 757 */     this.slideModel[29].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 758 */     this.slideModel[29].setRotationPoint(-11.5F, 2.5F, 0.0F);
/*     */     
/* 760 */     this.slideModel[30].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 761 */     this.slideModel[30].setRotationPoint(-5.5F, 2.5F, 0.0F);
/*     */     
/* 763 */     this.slideModel[31].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 764 */     this.slideModel[31].setRotationPoint(-2.5F, 2.5F, 0.0F);
/*     */     
/* 766 */     this.slideModel[32].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 767 */     this.slideModel[32].setRotationPoint(0.5F, 2.5F, 0.0F);
/*     */     
/* 769 */     this.slideModel[33].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 11, 18, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 770 */     this.slideModel[33].setRotationPoint(3.5F, 2.5F, 0.0F);
/*     */     
/* 772 */     this.slideModel[34].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 10, 18, 0.0F, -1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 773 */     this.slideModel[34].setRotationPoint(6.5F, 3.5F, 0.0F);
/*     */     
/* 775 */     this.slideModel[35].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 6, 18, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 776 */     this.slideModel[35].setRotationPoint(9.5F, 7.5F, 0.0F);
/*     */     
/* 778 */     this.slideModel[36].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 4, 18, 0.0F, -0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 779 */     this.slideModel[36].setRotationPoint(12.3F, 9.5F, 0.0F);
/*     */     
/* 781 */     this.slideModel[37].addShapeBox(-12.0F, -67.0F, -9.5F, 7, 2, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 782 */     this.slideModel[37].setRotationPoint(15.0F, 4.0F, 0.0F);
/*     */     
/* 784 */     this.slideModel[38].addShapeBox(-12.0F, -67.0F, -9.5F, 7, 7, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 785 */     this.slideModel[38].setRotationPoint(15.0F, 6.5F, 0.0F);
/*     */     
/* 787 */     this.slideModel[39].addShapeBox(-12.0F, -67.0F, -9.5F, 61, 7, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F);
/* 788 */     this.slideModel[39].setRotationPoint(23.0F, 6.5F, 0.0F);
/*     */     
/* 790 */     this.slideModel[40].addShapeBox(-12.0F, -67.0F, -9.5F, 17, 6, 18, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 791 */     this.slideModel[40].setRotationPoint(67.0F, 0.0F, 0.0F);
/*     */     
/* 793 */     this.slideModel[41].addShapeBox(-12.0F, -67.0F, -9.5F, 7, 2, 14, 0.0F, -0.2F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -0.2F, 0.0F, -3.0F, -3.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.75F, 0.5F, 0.0F);
/* 794 */     this.slideModel[41].setRotationPoint(16.0F, -2.5F, 2.0F);
/*     */     
/* 796 */     this.slideModel[42].addShapeBox(-12.0F, -67.0F, -9.5F, 4, 3, 18, 0.0F, -0.75F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, -2.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.9F, -4.0F, 0.5F, -0.9F);
/* 797 */     this.slideModel[42].setRotationPoint(19.0F, 0.0F, 0.0F);
/*     */     
/* 799 */     this.slideModel[43].addShapeBox(-12.0F, -67.0F, -9.5F, 9, 16, 8, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 800 */     this.slideModel[43].setRotationPoint(15.0F, -2.0F, 5.0F);
/*     */     
/* 802 */     this.slideModel[44].addShapeBox(-12.0F, -67.0F, -9.5F, 42, 11, 17, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 803 */     this.slideModel[44].setRotationPoint(81.0F, 5.5F, 0.5F);
/*     */     
/* 805 */     this.slideModel[45].addShapeBox(-12.0F, -67.0F, -9.5F, 42, 7, 17, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 806 */     this.slideModel[45].setRotationPoint(81.0F, -1.5F, 0.5F);
/*     */     
/* 808 */     this.slideModel[46].addShapeBox(-12.0F, -67.0F, -9.5F, 107, 1, 7, 0.0F, -0.3F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F);
/* 809 */     this.slideModel[46].setRotationPoint(-24.4F, 14.0F, 0.0F);
/*     */     
/* 811 */     this.slideModel[47].addShapeBox(-12.0F, -67.0F, -9.5F, 108, 1, 3, 0.0F, -0.15F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 812 */     this.slideModel[47].setRotationPoint(-24.4F, 15.0F, 0.0F);
/*     */     
/* 814 */     this.slideModel[48].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 815 */     this.slideModel[48].setRotationPoint(122.0F, 16.5F, 0.5F);
/*     */     
/* 817 */     this.slideModel[49].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 2, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 818 */     this.slideModel[49].setRotationPoint(122.0F, 17.5F, 1.5F);
/*     */     
/* 820 */     this.slideModel[50].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 821 */     this.slideModel[50].setRotationPoint(122.0F, 19.5F, 2.5F);
/*     */     
/* 823 */     this.slideModel[51].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 824 */     this.slideModel[51].setRotationPoint(122.0F, 16.5F, 12.5F);
/*     */     
/* 826 */     this.slideModel[52].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 2, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 827 */     this.slideModel[52].setRotationPoint(122.0F, 17.5F, 12.5F);
/*     */     
/* 829 */     this.slideModel[53].addShapeBox(-12.0F, -67.0F, -9.5F, 1, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F);
/* 830 */     this.slideModel[53].setRotationPoint(122.0F, 19.5F, 12.5F);
/*     */     
/* 832 */     this.slideModel[54].addShapeBox(-12.0F, -67.0F, -9.5F, 28, 6, 12, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 833 */     this.slideModel[54].setRotationPoint(37.0F, 0.0F, 6.0F);
/*     */     
/* 835 */     this.slideModel[55].addShapeBox(-12.0F, -67.0F, -9.5F, 18, 2, 14, 0.0F, -3.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F);
/* 836 */     this.slideModel[55].setRotationPoint(19.0F, -2.5F, 2.0F);
/*     */     
/* 838 */     this.slideModel[56].addShapeBox(-12.0F, -67.0F, -9.5F, 14, 6, 18, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 839 */     this.slideModel[56].setRotationPoint(23.0F, 0.0F, 0.0F);
/*     */     
/* 841 */     this.slideModel[57].addShapeBox(-12.0F, -67.0F, -9.5F, 49, 2, 8, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F);
/* 842 */     this.slideModel[57].setRotationPoint(33.0F, -2.5F, 8.0F);
/*     */     
/* 844 */     this.slideModel[58].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 6, 18, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 845 */     this.slideModel[58].setRotationPoint(65.0F, 0.0F, 0.0F);
/*     */     
/* 847 */     this.slideModel[59].addShapeBox(-12.0F, -67.0F, -9.5F, 19, 2, 6, 0.0F, -4.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -4.0F, 0.5F, 0.0F);
/* 848 */     this.slideModel[59].setRotationPoint(63.0F, -2.5F, 2.0F);
/*     */     
/* 850 */     this.slideModel[60].addShapeBox(-12.0F, -67.0F, -9.5F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 851 */     this.slideModel[60].setRotationPoint(65.0F, -2.5F, 4.0F);
/*     */     
/* 853 */     this.slideModel[61].addShapeBox(-12.0F, -67.0F, -9.5F, 29, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 854 */     this.slideModel[61].setRotationPoint(36.0F, -2.5F, 6.0F);
/*     */     
/*     */ 
/*     */ 
/* 858 */     this.scopeAttachPoint = new Vector3f(-0.375F, 7.8125F, 0.0F);
/*     */     
/*     */ 
/* 861 */     translateAll(0.0F, -54.0F, 0.0F);
/* 862 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/*     */ 
/* 865 */     this.gunSlideDistance = 2.5F;
/* 866 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 868 */     this.tiltGun = 4.0F;
/* 869 */     this.rotateGunVertical = 12.0F;
/* 870 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 872 */     this.rotateClipVertical = 13.0F;
/* 873 */     this.translateClip = new Vector3f(0.0F, -16.0F, 0.0F);
/*     */     
/* 875 */     this.scopeIsOnSlide = true;
/*     */     
/*     */ 
/*     */ 
/* 879 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelfiveseven.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */