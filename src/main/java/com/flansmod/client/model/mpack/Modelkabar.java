/*     */ package com.flansmod.client.model.mpack;
/*     */ 
/*     */ import com.flansmod.client.model.ModelGun;
/*     */ import com.flansmod.client.tmt.ModelRendererTurbo;
/*     */ import com.flansmod.common.vector.Vector3f;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelkabar
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelkabar()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[122];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 449, 73, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 289, 81, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 41, 89, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*     */     
/* 145 */     this.gunModel[0].addShapeBox(8.0F, -34.0F, -3.0F, 1, 33, 5, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 146 */     this.gunModel[0].setRotationPoint(0.0F, -32.0F, 0.5F);
/*     */     
/* 148 */     this.gunModel[1].addShapeBox(8.0F, -34.0F, -3.0F, 3, 3, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 149 */     this.gunModel[1].setRotationPoint(-4.0F, -2.5F, 0.5F);
/*     */     
/* 151 */     this.gunModel[2].addShapeBox(8.0F, -34.0F, -3.0F, 1, 32, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 152 */     this.gunModel[2].setRotationPoint(-5.0F, -31.5F, 0.5F);
/*     */     
/* 154 */     this.gunModel[3].addShapeBox(8.0F, -34.0F, -3.0F, 11, 5, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 155 */     this.gunModel[3].setRotationPoint(-5.0F, 1.0F, 0.5F);
/*     */     
/* 157 */     this.gunModel[4].addShapeBox(8.0F, -34.0F, -3.0F, 3, 4, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 158 */     this.gunModel[4].setRotationPoint(-4.0F, -31.5F, 0.5F);
/*     */     
/* 160 */     this.gunModel[5].addShapeBox(8.0F, -34.0F, -3.0F, 3, 47, 5, 0.0F, 0.75F, -0.5F, 0.0F, 1.0F, -0.5F, -2.25F, 1.0F, -0.5F, -2.25F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, -2.25F, 1.0F, 0.0F, -2.25F, 0.75F, 0.0F, 0.0F);
/* 161 */     this.gunModel[5].setRotationPoint(2.0F, -47.0F, 0.5F);
/*     */     
/* 163 */     this.gunModel[6].addShapeBox(8.0F, -34.0F, -3.0F, 5, 2, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 164 */     this.gunModel[6].setRotationPoint(-4.0F, -33.5F, 0.5F);
/*     */     
/* 166 */     this.gunModel[7].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 5, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 167 */     this.gunModel[7].setRotationPoint(-3.0F, -35.5F, 0.5F);
/*     */     
/* 169 */     this.gunModel[8].addShapeBox(8.0F, -34.0F, -3.0F, 3, 2, 5, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 170 */     this.gunModel[8].setRotationPoint(-2.0F, -37.5F, 0.5F);
/*     */     
/* 172 */     this.gunModel[9].addShapeBox(8.0F, -34.0F, -3.0F, 2, 2, 5, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 173 */     this.gunModel[9].setRotationPoint(-1.0F, -39.5F, 0.5F);
/*     */     
/* 175 */     this.gunModel[10].addShapeBox(8.0F, -34.0F, -3.0F, 1, 4, 5, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 176 */     this.gunModel[10].setRotationPoint(0.0F, -43.5F, 0.5F);
/*     */     
/* 178 */     this.gunModel[11].addShapeBox(8.0F, -34.0F, -3.0F, 1, 3, 5, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 179 */     this.gunModel[11].setRotationPoint(0.0F, -46.5F, 0.5F);
/*     */     
/* 181 */     this.gunModel[12].addShapeBox(8.0F, -34.0F, -3.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 182 */     this.gunModel[12].setRotationPoint(-1.0F, -49.5F, 0.5F);
/*     */     
/* 184 */     this.gunModel[13].addShapeBox(8.0F, -34.0F, -3.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 185 */     this.gunModel[13].setRotationPoint(-1.0F, -52.5F, 0.5F);
/*     */     
/* 187 */     this.gunModel[14].addShapeBox(8.0F, -34.0F, -3.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 188 */     this.gunModel[14].setRotationPoint(-1.0F, -54.5F, 0.5F);
/*     */     
/* 190 */     this.gunModel[15].addShapeBox(8.0F, -34.0F, -3.0F, 3, 4, 5, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, -0.5F, -2.25F, 0.5F, -0.5F, -2.25F, 1.25F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.0F, -0.5F, -2.25F, 1.0F, -0.5F, -2.25F, 0.75F, -0.5F, 0.0F);
/* 191 */     this.gunModel[15].setRotationPoint(2.0F, -50.0F, 0.5F);
/*     */     
/* 193 */     this.gunModel[16].addShapeBox(8.0F, -34.0F, -3.0F, 3, 4, 5, 0.0F, 1.75F, -0.5F, 0.0F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 1.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.0F, -0.5F, -2.25F, 1.0F, -0.5F, -2.25F, 0.75F, -0.5F, 0.0F);
/* 194 */     this.gunModel[16].setRotationPoint(1.5F, -53.0F, 0.5F);
/*     */     
/* 196 */     this.gunModel[17].addShapeBox(8.0F, -34.0F, -3.0F, 3, 3, 5, 0.0F, 1.5F, -0.5F, 0.0F, 0.25F, -0.5F, -2.25F, 0.25F, -0.5F, -2.25F, 1.5F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 1.0F, -0.5F, -2.25F, 1.0F, -0.5F, -2.25F, 0.75F, -0.5F, 0.0F);
/* 197 */     this.gunModel[17].setRotationPoint(0.5F, -55.0F, 0.5F);
/*     */     
/* 199 */     this.gunModel[18].addShapeBox(8.0F, -34.0F, -3.0F, 3, 4, 5, 0.0F, 1.5F, -0.5F, 0.0F, -0.5F, -0.5F, -2.25F, -0.5F, -0.5F, -2.25F, 1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.25F, -0.5F, -2.25F, 1.25F, -0.5F, -2.25F, 0.5F, -0.5F, 0.0F);
/* 200 */     this.gunModel[18].setRotationPoint(-0.5F, -58.0F, 0.5F);
/*     */     
/* 202 */     this.gunModel[19].addShapeBox(8.0F, -34.0F, -3.0F, 2, 4, 5, 0.0F, 1.5F, -0.5F, 0.0F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.5F, -0.5F, -2.25F, 1.5F, -0.5F, -2.25F, 0.5F, -0.5F, 0.0F);
/* 203 */     this.gunModel[19].setRotationPoint(-1.5F, -61.0F, 0.5F);
/*     */     
/* 205 */     this.gunModel[20].addShapeBox(8.0F, -34.0F, -3.0F, 1, 3, 5, 0.0F, 1.5F, -0.5F, -0.75F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 1.5F, -0.5F, -0.75F, 0.5F, -0.5F, 0.0F, 1.0F, -0.5F, -2.25F, 1.0F, -0.5F, -2.25F, 0.5F, -0.5F, 0.0F);
/* 206 */     this.gunModel[20].setRotationPoint(-2.5F, -63.0F, 0.5F);
/*     */     
/* 208 */     this.gunModel[21].addShapeBox(8.0F, -34.0F, -3.0F, 1, 2, 5, 0.0F, 0.5F, -0.5F, -2.25F, -1.0F, -0.5F, -2.5F, -1.0F, -0.5F, -2.5F, 0.5F, -0.5F, -2.25F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.5F, -0.5F, -0.75F);
/* 209 */     this.gunModel[21].setRotationPoint(-3.5F, -64.0F, 0.5F);
/*     */     
/* 211 */     this.gunModel[22].addShapeBox(8.0F, -34.0F, -3.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 212 */     this.gunModel[22].setRotationPoint(-5.25F, -33.5F, 0.5F);
/*     */     
/* 214 */     this.gunModel[23].addShapeBox(8.0F, -34.0F, -3.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F);
/* 215 */     this.gunModel[23].setRotationPoint(-5.25F, -35.5F, 0.5F);
/*     */     
/* 217 */     this.gunModel[24].addShapeBox(8.0F, -34.0F, -3.0F, 3, 2, 5, 0.0F, 0.0F, 0.0F, -2.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F);
/* 218 */     this.gunModel[24].setRotationPoint(-5.25F, -37.5F, 0.5F);
/*     */     
/* 220 */     this.gunModel[25].addShapeBox(8.0F, -34.0F, -3.0F, 3, 2, 5, 0.0F, 0.0F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F);
/* 221 */     this.gunModel[25].setRotationPoint(-5.25F, -39.5F, 0.5F);
/*     */     
/* 223 */     this.gunModel[26].addShapeBox(8.0F, -34.0F, -3.0F, 3, 4, 5, 0.0F, -0.25F, 0.0F, -2.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F);
/* 224 */     this.gunModel[26].setRotationPoint(-5.25F, -43.5F, 0.5F);
/*     */     
/* 226 */     this.gunModel[27].addShapeBox(8.0F, -34.0F, -3.0F, 3, 3, 5, 0.0F, -0.5F, 0.0F, -2.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -2.25F);
/* 227 */     this.gunModel[27].setRotationPoint(-5.25F, -46.5F, 0.5F);
/*     */     
/* 229 */     this.gunModel[28].addShapeBox(8.0F, -34.0F, -3.0F, 3, 8, 5, 0.0F, -1.25F, 0.0F, -2.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F);
/* 230 */     this.gunModel[28].setRotationPoint(-5.25F, -54.5F, 0.5F);
/*     */     
/* 232 */     this.gunModel[29].addShapeBox(8.0F, -34.0F, -3.0F, 3, 3, 5, 0.0F, -1.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.25F, -1.25F, 0.0F, -2.25F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.25F);
/* 233 */     this.gunModel[29].setRotationPoint(-5.25F, -57.5F, 0.5F);
/*     */     
/* 235 */     this.gunModel[30].addShapeBox(8.0F, -34.0F, -3.0F, 3, 3, 5, 0.0F, -1.25F, 0.0F, -2.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, -2.25F, -1.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.25F);
/* 236 */     this.gunModel[30].setRotationPoint(-5.25F, -60.5F, 0.5F);
/*     */     
/* 238 */     this.gunModel[31].addShapeBox(8.0F, -34.0F, -3.0F, 2, 2, 5, 0.0F, -1.25F, 0.0F, -2.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -1.25F, 0.0F, -2.25F, -1.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.25F);
/* 239 */     this.gunModel[31].setRotationPoint(-5.25F, -62.5F, 0.5F);
/*     */     
/* 241 */     this.gunModel[32].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 5, 0.0F, 0.75F, -1.0F, 0.0F, 0.0F, -1.0F, -2.25F, 0.0F, -1.0F, -2.25F, 0.75F, -1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 242 */     this.gunModel[32].setRotationPoint(2.0F, -1.0F, 0.5F);
/*     */     
/* 244 */     this.gunModel[33].addShapeBox(8.0F, -34.0F, -3.0F, 3, 25, 4, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 245 */     this.gunModel[33].setRotationPoint(-4.0F, -27.5F, 1.0F);
/*     */     
/* 247 */     this.gunModel[34].addShapeBox(8.0F, -34.0F, -3.0F, 1, 1, 5, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.0F, 0.0F);
/* 248 */     this.gunModel[34].setRotationPoint(-1.25F, -27.5F, 0.5F);
/*     */     
/* 250 */     this.gunModel[35].addShapeBox(8.0F, -34.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 251 */     this.gunModel[35].setRotationPoint(-4.25F, -27.5F, 0.5F);
/*     */     
/* 253 */     this.gunModel[36].addShapeBox(8.0F, -34.0F, -3.0F, 1, 1, 5, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 254 */     this.gunModel[36].setRotationPoint(-1.25F, -3.5F, 0.5F);
/*     */     
/* 256 */     this.gunModel[37].addShapeBox(8.0F, -34.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 257 */     this.gunModel[37].setRotationPoint(-4.25F, -3.5F, 0.5F);
/*     */     
/* 259 */     this.gunModel[38].addShapeBox(8.0F, -34.0F, -3.0F, 13, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 260 */     this.gunModel[38].setRotationPoint(-6.5F, 6.0F, -4.5F);
/*     */     
/* 262 */     this.gunModel[39].addShapeBox(8.0F, -34.0F, -3.0F, 3, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 263 */     this.gunModel[39].setRotationPoint(6.5F, 6.0F, -4.5F);
/*     */     
/* 265 */     this.gunModel[40].addShapeBox(8.0F, -34.0F, -3.0F, 2, 1, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.75F, -2.0F, 0.5F, -0.75F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 266 */     this.gunModel[40].setRotationPoint(9.5F, 6.5F, -3.5F);
/*     */     
/* 268 */     this.gunModel[41].addShapeBox(8.0F, -34.0F, -3.0F, 3, 1, 15, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F);
/* 269 */     this.gunModel[41].setRotationPoint(-9.5F, 6.0F, -4.5F);
/*     */     
/* 271 */     this.gunModel[42].addShapeBox(8.0F, -34.0F, -3.0F, 2, 1, 15, 0.0F, 0.0F, -0.75F, -1.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -1.5F);
/* 272 */     this.gunModel[42].setRotationPoint(-11.5F, 6.25F, -4.5F);
/*     */     
/* 274 */     this.gunModel[43].addShapeBox(8.0F, -34.0F, -3.0F, 1, 1, 15, 0.0F, 0.0F, -0.85F, -2.5F, -0.5F, -0.75F, -1.5F, -0.5F, -0.75F, -1.5F, 0.0F, -0.85F, -2.5F, 0.0F, 0.35F, -2.5F, -0.5F, 0.25F, -1.5F, -0.5F, 0.25F, -1.5F, 0.0F, 0.35F, -2.5F);
/* 275 */     this.gunModel[43].setRotationPoint(-12.0F, 6.25F, -4.5F);
/*     */     
/* 277 */     this.gunModel[44].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 278 */     this.gunModel[44].setRotationPoint(-2.0F, 12.5F, -3.0F);
/*     */     
/* 280 */     this.gunModel[45].addShapeBox(8.0F, -34.0F, -3.0F, 8, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F);
/* 281 */     this.gunModel[45].setRotationPoint(-5.0F, 8.5F, -3.0F);
/*     */     
/* 283 */     this.gunModel[46].addShapeBox(8.0F, -34.0F, -3.0F, 8, 2, 12, 0.0F, -1.25F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F);
/* 284 */     this.gunModel[46].setRotationPoint(-5.0F, 9.5F, -3.0F);
/*     */     
/* 286 */     this.gunModel[47].addShapeBox(8.0F, -34.0F, -3.0F, 6, 1, 12, 0.0F, -1.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F);
/* 287 */     this.gunModel[47].setRotationPoint(-4.0F, 11.5F, -3.0F);
/*     */     
/* 289 */     this.gunModel[48].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 290 */     this.gunModel[48].setRotationPoint(-6.0F, 12.5F, -3.0F);
/*     */     
/* 292 */     this.gunModel[49].addShapeBox(8.0F, -34.0F, -3.0F, 4, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 293 */     this.gunModel[49].setRotationPoint(2.0F, 9.5F, -3.0F);
/*     */     
/* 295 */     this.gunModel[50].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, -3.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F);
/* 296 */     this.gunModel[50].setRotationPoint(-2.0F, 9.5F, -3.0F);
/*     */     
/* 298 */     this.gunModel[51].addShapeBox(8.0F, -34.0F, -3.0F, 4, 1, 12, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 299 */     this.gunModel[51].setRotationPoint(-2.0F, 11.5F, -3.0F);
/*     */     
/* 301 */     this.gunModel[52].addShapeBox(8.0F, -34.0F, -3.0F, 1, 1, 12, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 302 */     this.gunModel[52].setRotationPoint(-2.0F, 11.5F, -3.0F);
/*     */     
/* 304 */     this.gunModel[53].addShapeBox(8.0F, -34.0F, -3.0F, 4, 1, 12, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, -3.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F);
/* 305 */     this.gunModel[53].setRotationPoint(-2.0F, 8.5F, -3.0F);
/*     */     
/* 307 */     this.gunModel[54].addShapeBox(8.0F, -34.0F, -3.0F, 4, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 308 */     this.gunModel[54].setRotationPoint(2.0F, 8.5F, -3.0F);
/*     */     
/* 310 */     this.gunModel[55].addShapeBox(8.0F, -34.0F, -3.0F, 4, 1, 12, 0.0F, 0.0F, -0.5F, -4.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 311 */     this.gunModel[55].setRotationPoint(-6.0F, 11.5F, -3.0F);
/*     */     
/* 313 */     this.gunModel[56].addShapeBox(8.0F, -34.0F, -3.0F, 4, 1, 12, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 314 */     this.gunModel[56].setRotationPoint(-6.0F, 12.0F, -3.0F);
/*     */     
/* 316 */     this.gunModel[57].addShapeBox(8.0F, -34.0F, -3.0F, 4, 3, 12, 0.0F, 0.0F, -0.5F, -4.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F);
/* 317 */     this.gunModel[57].setRotationPoint(-6.0F, 9.5F, -3.0F);
/*     */     
/* 319 */     this.gunModel[58].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.0F, 0.0F, -4.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -0.5F, -4.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F);
/* 320 */     this.gunModel[58].setRotationPoint(-6.0F, 8.5F, -3.0F);
/*     */     
/* 322 */     this.gunModel[59].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 323 */     this.gunModel[59].setRotationPoint(-2.0F, 15.5F, -3.0F);
/*     */     
/* 325 */     this.gunModel[60].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 326 */     this.gunModel[60].setRotationPoint(-6.0F, 15.5F, -3.0F);
/*     */     
/* 328 */     this.gunModel[61].addShapeBox(8.0F, -34.0F, -3.0F, 4, 6, 12, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 329 */     this.gunModel[61].setRotationPoint(2.0F, 16.5F, -3.0F);
/*     */     
/* 331 */     this.gunModel[62].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 332 */     this.gunModel[62].setRotationPoint(-2.0F, 23.0F, -3.0F);
/*     */     
/* 334 */     this.gunModel[63].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 335 */     this.gunModel[63].setRotationPoint(-6.0F, 23.0F, -3.0F);
/*     */     
/* 337 */     this.gunModel[64].addShapeBox(8.0F, -34.0F, -3.0F, 4, 6, 12, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 338 */     this.gunModel[64].setRotationPoint(2.0F, 24.0F, -3.0F);
/*     */     
/* 340 */     this.gunModel[65].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 341 */     this.gunModel[65].setRotationPoint(-2.0F, 30.5F, -3.0F);
/*     */     
/* 343 */     this.gunModel[66].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 344 */     this.gunModel[66].setRotationPoint(-6.0F, 30.5F, -3.0F);
/*     */     
/* 346 */     this.gunModel[67].addShapeBox(8.0F, -34.0F, -3.0F, 4, 6, 12, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 347 */     this.gunModel[67].setRotationPoint(2.0F, 31.5F, -3.0F);
/*     */     
/* 349 */     this.gunModel[68].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 350 */     this.gunModel[68].setRotationPoint(-2.0F, 38.0F, -3.0F);
/*     */     
/* 352 */     this.gunModel[69].addShapeBox(8.0F, -34.0F, -3.0F, 4, 7, 12, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 353 */     this.gunModel[69].setRotationPoint(-6.0F, 38.0F, -3.0F);
/*     */     
/* 355 */     this.gunModel[70].addShapeBox(8.0F, -34.0F, -3.0F, 4, 6, 12, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 356 */     this.gunModel[70].setRotationPoint(2.0F, 39.0F, -3.0F);
/*     */     
/* 358 */     this.gunModel[71].addShapeBox(8.0F, -34.0F, -3.0F, 4, 6, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 359 */     this.gunModel[71].setRotationPoint(-2.0F, 46.0F, -3.0F);
/*     */     
/* 361 */     this.gunModel[72].addShapeBox(8.0F, -34.0F, -3.0F, 4, 6, 12, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 362 */     this.gunModel[72].setRotationPoint(-6.0F, 46.0F, -3.0F);
/*     */     
/* 364 */     this.gunModel[73].addShapeBox(8.0F, -34.0F, -3.0F, 4, 5, 12, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/* 365 */     this.gunModel[73].setRotationPoint(2.0F, 47.0F, -3.0F);
/*     */     
/* 367 */     this.gunModel[74].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 368 */     this.gunModel[74].setRotationPoint(-5.5F, 15.5F, 1.0F);
/*     */     
/* 370 */     this.gunModel[75].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 371 */     this.gunModel[75].setRotationPoint(-5.5F, 15.5F, -2.5F);
/*     */     
/* 373 */     this.gunModel[76].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 374 */     this.gunModel[76].setRotationPoint(-5.5F, 15.5F, 4.5F);
/*     */     
/* 376 */     this.gunModel[77].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 377 */     this.gunModel[77].setRotationPoint(-5.5F, 14.5F, 1.0F);
/*     */     
/* 379 */     this.gunModel[78].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 380 */     this.gunModel[78].setRotationPoint(-5.5F, 14.5F, -2.5F);
/*     */     
/* 382 */     this.gunModel[79].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 383 */     this.gunModel[79].setRotationPoint(-5.5F, 14.5F, 4.5F);
/*     */     
/* 385 */     this.gunModel[80].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 386 */     this.gunModel[80].setRotationPoint(-5.5F, 15.0F, -2.5F);
/*     */     
/* 388 */     this.gunModel[81].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 389 */     this.gunModel[81].setRotationPoint(-5.5F, 15.0F, 4.5F);
/*     */     
/* 391 */     this.gunModel[82].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 392 */     this.gunModel[82].setRotationPoint(-5.5F, 15.0F, 1.0F);
/*     */     
/* 394 */     this.gunModel[83].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 395 */     this.gunModel[83].setRotationPoint(-5.5F, 23.0F, 1.0F);
/*     */     
/* 397 */     this.gunModel[84].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 398 */     this.gunModel[84].setRotationPoint(-5.5F, 23.0F, -2.5F);
/*     */     
/* 400 */     this.gunModel[85].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 401 */     this.gunModel[85].setRotationPoint(-5.5F, 23.0F, 4.5F);
/*     */     
/* 403 */     this.gunModel[86].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 404 */     this.gunModel[86].setRotationPoint(-5.5F, 22.5F, 1.0F);
/*     */     
/* 406 */     this.gunModel[87].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 407 */     this.gunModel[87].setRotationPoint(-5.5F, 22.5F, -2.5F);
/*     */     
/* 409 */     this.gunModel[88].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 410 */     this.gunModel[88].setRotationPoint(-5.5F, 22.5F, 4.5F);
/*     */     
/* 412 */     this.gunModel[89].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 413 */     this.gunModel[89].setRotationPoint(-5.5F, 46.0F, 4.5F);
/*     */     
/* 415 */     this.gunModel[90].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 416 */     this.gunModel[90].setRotationPoint(-5.5F, 45.0F, 4.5F);
/*     */     
/* 418 */     this.gunModel[91].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 419 */     this.gunModel[91].setRotationPoint(-5.5F, 45.5F, 4.5F);
/*     */     
/* 421 */     this.gunModel[92].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 422 */     this.gunModel[92].setRotationPoint(-5.5F, 30.5F, 4.5F);
/*     */     
/* 424 */     this.gunModel[93].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 425 */     this.gunModel[93].setRotationPoint(-5.5F, 30.0F, 4.5F);
/*     */     
/* 427 */     this.gunModel[94].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 428 */     this.gunModel[94].setRotationPoint(-5.5F, 38.0F, 4.5F);
/*     */     
/* 430 */     this.gunModel[95].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F);
/* 431 */     this.gunModel[95].setRotationPoint(-5.5F, 37.5F, 4.5F);
/*     */     
/* 433 */     this.gunModel[96].addShapeBox(8.0F, -34.0F, -3.0F, 8, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 434 */     this.gunModel[96].setRotationPoint(-5.0F, 7.0F, -3.0F);
/*     */     
/* 436 */     this.gunModel[97].addShapeBox(8.0F, -34.0F, -3.0F, 4, 1, 12, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.5F, -4.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F);
/* 437 */     this.gunModel[97].setRotationPoint(2.0F, 7.5F, -3.0F);
/*     */     
/* 439 */     this.gunModel[98].addShapeBox(8.0F, -34.0F, -3.0F, 2, 1, 12, 0.0F, 0.0F, 0.5F, -4.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, -4.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
/* 440 */     this.gunModel[98].setRotationPoint(-6.0F, 7.5F, -3.0F);
/*     */     
/* 442 */     this.gunModel[99].addShapeBox(8.0F, -34.0F, -3.0F, 4, 3, 12, 0.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 443 */     this.gunModel[99].setRotationPoint(-2.0F, 53.0F, -3.0F);
/*     */     
/* 445 */     this.gunModel[100].addShapeBox(8.0F, -34.0F, -3.0F, 4, 3, 12, 0.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, -3.5F, 0.25F, -0.5F, -3.5F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F);
/* 446 */     this.gunModel[100].setRotationPoint(2.5F, 53.0F, -3.0F);
/*     */     
/* 448 */     this.gunModel[101].addShapeBox(8.0F, -34.0F, -3.0F, 4, 3, 12, 0.0F, 0.25F, -0.5F, -3.5F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, -3.5F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F);
/* 449 */     this.gunModel[101].setRotationPoint(-6.5F, 53.0F, -3.0F);
/*     */     
/* 451 */     this.gunModel[102].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F);
/* 452 */     this.gunModel[102].setRotationPoint(-2.0F, 51.5F, -3.0F);
/*     */     
/* 454 */     this.gunModel[103].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -4.0F, -0.5F, -0.5F, -4.0F, 0.5F, -0.5F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F);
/* 455 */     this.gunModel[103].setRotationPoint(2.5F, 51.5F, -3.0F);
/*     */     
/* 457 */     this.gunModel[104].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, -0.5F, -0.5F, -4.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -4.0F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F);
/* 458 */     this.gunModel[104].setRotationPoint(-6.5F, 51.5F, -3.0F);
/*     */     
/* 460 */     this.gunModel[105].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 461 */     this.gunModel[105].setRotationPoint(-2.0F, 56.0F, -3.0F);
/*     */     
/* 463 */     this.gunModel[106].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -4.0F, -0.5F, -0.5F, -4.0F, 0.5F, -0.5F, 0.0F);
/* 464 */     this.gunModel[106].setRotationPoint(2.5F, 56.0F, -3.0F);
/*     */     
/* 466 */     this.gunModel[107].addShapeBox(8.0F, -34.0F, -3.0F, 4, 2, 12, 0.0F, 0.25F, 0.0F, -3.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -3.5F, -0.5F, -0.5F, -4.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -4.0F);
/* 467 */     this.gunModel[107].setRotationPoint(-6.5F, 56.0F, -3.0F);
/*     */     
/* 469 */     this.gunModel[108].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 470 */     this.gunModel[108].setRotationPoint(-5.5F, 30.5F, 1.0F);
/*     */     
/* 472 */     this.gunModel[109].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 473 */     this.gunModel[109].setRotationPoint(-5.5F, 30.5F, -2.5F);
/*     */     
/* 475 */     this.gunModel[110].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 476 */     this.gunModel[110].setRotationPoint(-5.5F, 30.0F, 1.0F);
/*     */     
/* 478 */     this.gunModel[111].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 479 */     this.gunModel[111].setRotationPoint(-5.5F, 30.0F, -2.5F);
/*     */     
/* 481 */     this.gunModel[112].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 482 */     this.gunModel[112].setRotationPoint(-5.5F, 38.0F, 1.0F);
/*     */     
/* 484 */     this.gunModel[113].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 485 */     this.gunModel[113].setRotationPoint(-5.5F, 38.0F, -2.5F);
/*     */     
/* 487 */     this.gunModel[114].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 488 */     this.gunModel[114].setRotationPoint(-5.5F, 37.5F, 1.0F);
/*     */     
/* 490 */     this.gunModel[115].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 491 */     this.gunModel[115].setRotationPoint(-5.5F, 37.5F, -2.5F);
/*     */     
/* 493 */     this.gunModel[116].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 494 */     this.gunModel[116].setRotationPoint(-5.5F, 46.0F, 1.0F);
/*     */     
/* 496 */     this.gunModel[117].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F);
/* 497 */     this.gunModel[117].setRotationPoint(-5.5F, 46.0F, -2.5F);
/*     */     
/* 499 */     this.gunModel[118].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 500 */     this.gunModel[118].setRotationPoint(-5.5F, 45.0F, 1.0F);
/*     */     
/* 502 */     this.gunModel[119].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 503 */     this.gunModel[119].setRotationPoint(-5.5F, 45.0F, -2.5F);
/*     */     
/* 505 */     this.gunModel[120].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -3.75F, -0.5F, -0.25F, -3.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 506 */     this.gunModel[120].setRotationPoint(-5.5F, 45.5F, -2.5F);
/*     */     
/* 508 */     this.gunModel[121].addShapeBox(8.0F, -34.0F, -3.0F, 11, 1, 4, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F);
/* 509 */     this.gunModel[121].setRotationPoint(-5.5F, 45.5F, 1.0F);
/*     */     
/*     */ 
/*     */ 
/* 513 */     translateAll(0.0F, -12.0F, 0.5F);
/* 514 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*     */     
/* 516 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelkabar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */