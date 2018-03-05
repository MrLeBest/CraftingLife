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
/*     */ public class Modelm4a1
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm4a1()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[''];
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
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*     */     
/* 163 */     this.gunModel[0].addShapeBox(0.0F, -4.0F, -1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 164 */     this.gunModel[0].setRotationPoint(0.0F, -1.0F, 0.0F);
/*     */     
/* 166 */     this.gunModel[1].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 167 */     this.gunModel[1].setRotationPoint(4.0F, 1.0F, 0.0F);
/*     */     
/* 169 */     this.gunModel[2].addShapeBox(0.0F, -4.0F, -1.0F, 5, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 170 */     this.gunModel[2].setRotationPoint(6.0F, -5.0F, 0.0F);
/*     */     
/* 172 */     this.gunModel[3].addShapeBox(0.0F, -4.0F, -1.0F, 8, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 173 */     this.gunModel[3].setRotationPoint(-2.0F, -5.0F, 0.0F);
/*     */     
/* 175 */     this.gunModel[4].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 176 */     this.gunModel[4].setRotationPoint(-1.0F, -1.0F, 0.0F);
/*     */     
/* 178 */     this.gunModel[5].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 179 */     this.gunModel[5].setRotationPoint(-2.0F, -1.0F, 0.0F);
/*     */     
/* 181 */     this.gunModel[6].addShapeBox(0.0F, -4.0F, -1.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 182 */     this.gunModel[6].setRotationPoint(-2.0F, -2.5F, 2.0F);
/*     */     
/* 184 */     this.gunModel[7].addShapeBox(0.0F, -4.0F, -1.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 185 */     this.gunModel[7].setRotationPoint(-2.0F, -3.5F, 2.0F);
/*     */     
/* 187 */     this.gunModel[8].addShapeBox(0.0F, -4.0F, -1.0F, 14, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 188 */     this.gunModel[8].setRotationPoint(-2.0F, -4.5F, 2.0F);
/*     */     
/* 190 */     this.gunModel[9].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 191 */     this.gunModel[9].setRotationPoint(2.0F, -3.5F, -1.0F);
/*     */     
/* 193 */     this.gunModel[10].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 194 */     this.gunModel[10].setRotationPoint(2.0F, -4.5F, -1.0F);
/*     */     
/* 196 */     this.gunModel[11].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 197 */     this.gunModel[11].setRotationPoint(2.0F, -2.5F, -1.0F);
/*     */     
/* 199 */     this.gunModel[12].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 200 */     this.gunModel[12].setRotationPoint(12.0F, -2.25F, -0.75F);
/*     */     
/* 202 */     this.gunModel[13].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 203 */     this.gunModel[13].setRotationPoint(12.0F, -3.75F, -0.75F);
/*     */     
/* 205 */     this.gunModel[14].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 206 */     this.gunModel[14].setRotationPoint(12.0F, -4.75F, -0.75F);
/*     */     
/* 208 */     this.gunModel[15].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 209 */     this.gunModel[15].setRotationPoint(12.0F, -2.25F, 1.75F);
/*     */     
/* 211 */     this.gunModel[16].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 212 */     this.gunModel[16].setRotationPoint(12.0F, -4.75F, 1.75F);
/*     */     
/* 214 */     this.gunModel[17].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 215 */     this.gunModel[17].setRotationPoint(12.0F, -4.25F, 0.25F);
/*     */     
/* 217 */     this.gunModel[18].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 2, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 218 */     this.gunModel[18].setRotationPoint(-1.0F, -6.0F, 0.0F);
/*     */     
/* 220 */     this.gunModel[19].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 221 */     this.gunModel[19].setRotationPoint(12.0F, -3.75F, 1.25F);
/*     */     
/* 223 */     this.gunModel[20].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 224 */     this.gunModel[20].setRotationPoint(26.0F, -3.25F, 0.75F);
/*     */     
/* 226 */     this.gunModel[21].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, -1.0F, 1.5F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 227 */     this.gunModel[21].setRotationPoint(26.0F, -5.75F, 0.75F);
/*     */     
/* 229 */     this.gunModel[22].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 230 */     this.gunModel[22].setRotationPoint(27.5F, -5.75F, 0.75F);
/*     */     
/* 232 */     this.gunModel[23].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 233 */     this.gunModel[23].setRotationPoint(27.0F, -7.75F, -0.5F);
/*     */     
/* 235 */     this.gunModel[24].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 236 */     this.gunModel[24].setRotationPoint(27.0F, -7.75F, 0.75F);
/*     */     
/* 238 */     this.gunModel[25].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 239 */     this.gunModel[25].setRotationPoint(27.0F, -7.75F, 0.1F);
/*     */     
/* 241 */     this.gunModel[26].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 242 */     this.gunModel[26].setRotationPoint(3.0F, -1.0F, 0.0F);
/*     */     
/* 244 */     this.gunModel[27].addShapeBox(0.0F, -4.0F, -1.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 245 */     this.gunModel[27].setRotationPoint(11.0F, -5.0F, 0.0F);
/*     */     
/* 247 */     this.gunModel[28].addShapeBox(0.0F, -4.0F, -1.0F, 5, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 248 */     this.gunModel[28].setRotationPoint(-2.0F, 2.0F, 0.0F);
/*     */     
/* 250 */     this.gunModel[29].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 251 */     this.gunModel[29].setRotationPoint(3.0F, 1.0F, 0.0F);
/*     */     
/* 253 */     this.gunModel[30].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 254 */     this.gunModel[30].setRotationPoint(3.0F, 0.0F, 0.0F);
/*     */     
/* 256 */     this.gunModel[31].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 257 */     this.gunModel[31].setRotationPoint(3.35F, -0.5F, 0.5F);
/*     */     
/* 259 */     this.gunModel[32].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 260 */     this.gunModel[32].setRotationPoint(6.0F, 0.0F, 2.0F);
/*     */     
/* 262 */     this.gunModel[33].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 263 */     this.gunModel[33].setRotationPoint(6.0F, 0.0F, -0.15F);
/*     */     
/* 265 */     this.gunModel[34].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.9F, 0.45F, -0.9F, -0.9F, 0.45F, -0.9F, -0.9F, -0.15F, 0.0F, -0.9F, -0.15F, 0.0F, 0.0F, 0.45F, -0.9F, 0.0F, 0.45F, -0.9F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 266 */     this.gunModel[34].setRotationPoint(11.0F, 0.0F, 0.3F);
/*     */     
/* 268 */     this.gunModel[35].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 269 */     this.gunModel[35].setRotationPoint(-1.0F, -3.5F, -1.0F);
/*     */     
/* 271 */     this.gunModel[36].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 272 */     this.gunModel[36].setRotationPoint(-1.0F, -4.5F, -1.0F);
/*     */     
/* 274 */     this.gunModel[37].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 275 */     this.gunModel[37].setRotationPoint(-1.0F, -2.5F, -1.0F);
/*     */     
/* 277 */     this.gunModel[38].addShapeBox(0.0F, -4.0F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 278 */     this.gunModel[38].setRotationPoint(7.0F, -4.0F, -1.0F);
/*     */     
/* 280 */     this.gunModel[39].addShapeBox(0.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, -0.55F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.95F, 0.0F, -0.55F, -0.95F);
/* 281 */     this.gunModel[39].setRotationPoint(7.0F, -2.0F, 2.0F);
/*     */     
/* 283 */     this.gunModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 284 */     this.gunModel[40].setRotationPoint(-1.5F, -9.5F, -0.5F);
/*     */     
/* 286 */     this.gunModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 287 */     this.gunModel[41].setRotationPoint(-2.25F, -9.5F, -0.5F);
/*     */     
/* 289 */     this.gunModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 290 */     this.gunModel[42].setRotationPoint(-2.25F, -9.5F, -1.5F);
/*     */     
/* 292 */     this.gunModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F);
/* 293 */     this.gunModel[43].setRotationPoint(-2.25F, -9.5F, 0.5F);
/*     */     
/* 295 */     this.gunModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 296 */     this.gunModel[44].setRotationPoint(-2.75F, -9.5F, -1.5F);
/*     */     
/* 298 */     this.gunModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 299 */     this.gunModel[45].setRotationPoint(-2.75F, -9.5F, 0.5F);
/*     */     
/* 301 */     this.gunModel[46].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 302 */     this.gunModel[46].setRotationPoint(-1.6F, -7.5F, -2.35F);
/* 303 */     this.gunModel[46].rotateAngleY = 0.27925268F;
/*     */     
/* 305 */     this.gunModel[47].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 306 */     this.gunModel[47].setRotationPoint(4.15F, 0.5F, 0.5F);
/*     */     
/* 308 */     this.gunModel[48].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F);
/* 309 */     this.gunModel[48].setRotationPoint(3.35F, 0.5F, 0.5F);
/*     */     
/* 311 */     this.gunModel[49].addShapeBox(0.0F, -4.0F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -1.75F, -0.85F, 0.0F, -1.75F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 312 */     this.gunModel[49].setRotationPoint(7.0F, -4.0F, -1.4F);
/*     */     
/* 314 */     this.gunModel[50].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 315 */     this.gunModel[50].setRotationPoint(1.5F, -1.25F, 2.0F);
/*     */     
/* 317 */     this.gunModel[51].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 318 */     this.gunModel[51].setRotationPoint(1.75F, -1.25F, 2.0F);
/*     */     
/* 320 */     this.gunModel[52].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -1.0F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 321 */     this.gunModel[52].setRotationPoint(1.25F, -1.25F, 2.0F);
/*     */     
/* 323 */     this.gunModel[53].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 324 */     this.gunModel[53].setRotationPoint(1.5F, -1.0F, 2.0F);
/*     */     
/* 326 */     this.gunModel[54].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 327 */     this.gunModel[54].setRotationPoint(1.25F, -1.0F, 2.0F);
/*     */     
/* 329 */     this.gunModel[55].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.5F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.8F, 0.5F, -0.75F, -0.8F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.8F, 0.5F, 0.0F, -0.8F);
/* 330 */     this.gunModel[55].setRotationPoint(2.25F, -1.0F, 2.0F);
/*     */     
/* 332 */     this.gunModel[56].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, -0.25F, -0.9F);
/* 333 */     this.gunModel[56].setRotationPoint(1.25F, -0.75F, 2.0F);
/*     */     
/* 335 */     this.gunModel[57].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 336 */     this.gunModel[57].setRotationPoint(1.75F, -0.75F, 2.0F);
/*     */     
/* 338 */     this.gunModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.8F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F);
/* 339 */     this.gunModel[58].setRotationPoint(-2.55F, -7.5F, -2.65F);
/* 340 */     this.gunModel[58].rotateAngleY = 0.27925268F;
/*     */     
/* 342 */     this.gunModel[59].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 343 */     this.gunModel[59].setRotationPoint(3.0F, -6.0F, 0.25F);
/*     */     
/* 345 */     this.gunModel[60].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 346 */     this.gunModel[60].setRotationPoint(1.5F, -0.75F, 2.0F);
/*     */     
/* 348 */     this.gunModel[61].addShapeBox(0.0F, -4.0F, -1.0F, 13, 2, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.5F, 0.0F, 1.25F, 0.5F);
/* 349 */     this.gunModel[61].setRotationPoint(13.0F, -4.25F, 0.25F);
/*     */     
/* 351 */     this.gunModel[62].addShapeBox(0.0F, -4.0F, -1.0F, 13, 1, 1, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 352 */     this.gunModel[62].setRotationPoint(13.0F, -3.25F, -0.75F);
/*     */     
/* 354 */     this.gunModel[63].addShapeBox(0.0F, -4.0F, -1.0F, 13, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 355 */     this.gunModel[63].setRotationPoint(13.0F, -3.75F, 0.75F);
/*     */     
/* 357 */     this.gunModel[64].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 358 */     this.gunModel[64].setRotationPoint(13.0F, -2.25F, -0.75F);
/*     */     
/* 360 */     this.gunModel[65].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 361 */     this.gunModel[65].setRotationPoint(16.0F, -2.25F, -0.75F);
/*     */     
/* 363 */     this.gunModel[66].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 364 */     this.gunModel[66].setRotationPoint(20.0F, -2.25F, -0.75F);
/*     */     
/* 366 */     this.gunModel[67].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 367 */     this.gunModel[67].setRotationPoint(18.0F, -2.25F, -0.75F);
/*     */     
/* 369 */     this.gunModel[68].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 370 */     this.gunModel[68].setRotationPoint(22.0F, -2.25F, -0.75F);
/*     */     
/* 372 */     this.gunModel[69].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 373 */     this.gunModel[69].setRotationPoint(20.0F, -4.75F, -0.75F);
/*     */     
/* 375 */     this.gunModel[70].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 376 */     this.gunModel[70].setRotationPoint(22.0F, -4.75F, -0.75F);
/*     */     
/* 378 */     this.gunModel[71].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 379 */     this.gunModel[71].setRotationPoint(13.0F, -4.75F, -0.75F);
/*     */     
/* 381 */     this.gunModel[72].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 382 */     this.gunModel[72].setRotationPoint(18.0F, -2.25F, 1.75F);
/*     */     
/* 384 */     this.gunModel[73].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 385 */     this.gunModel[73].setRotationPoint(20.0F, -2.25F, 1.75F);
/*     */     
/* 387 */     this.gunModel[74].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 388 */     this.gunModel[74].setRotationPoint(22.0F, -2.25F, 1.75F);
/*     */     
/* 390 */     this.gunModel[75].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 391 */     this.gunModel[75].setRotationPoint(13.0F, -2.25F, 1.75F);
/*     */     
/* 393 */     this.gunModel[76].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 394 */     this.gunModel[76].setRotationPoint(16.0F, -2.25F, 1.75F);
/*     */     
/* 396 */     this.gunModel[77].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 397 */     this.gunModel[77].setRotationPoint(22.0F, -4.75F, 1.75F);
/*     */     
/* 399 */     this.gunModel[78].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 400 */     this.gunModel[78].setRotationPoint(18.0F, -4.75F, 1.75F);
/*     */     
/* 402 */     this.gunModel[79].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 403 */     this.gunModel[79].setRotationPoint(20.0F, -4.75F, 1.75F);
/*     */     
/* 405 */     this.gunModel[80].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 406 */     this.gunModel[80].setRotationPoint(16.0F, -4.75F, 1.75F);
/*     */     
/* 408 */     this.gunModel[81].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 409 */     this.gunModel[81].setRotationPoint(13.0F, -4.75F, 1.75F);
/*     */     
/* 411 */     this.gunModel[82].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 412 */     this.gunModel[82].setRotationPoint(16.0F, -4.75F, -0.75F);
/*     */     
/* 414 */     this.gunModel[83].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 415 */     this.gunModel[83].setRotationPoint(18.0F, -4.75F, -0.75F);
/*     */     
/* 417 */     this.gunModel[84].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 418 */     this.gunModel[84].setRotationPoint(24.0F, -2.25F, 1.75F);
/*     */     
/* 420 */     this.gunModel[85].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 421 */     this.gunModel[85].setRotationPoint(24.0F, -4.75F, 1.75F);
/*     */     
/* 423 */     this.gunModel[86].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 424 */     this.gunModel[86].setRotationPoint(24.0F, -2.25F, -0.75F);
/*     */     
/* 426 */     this.gunModel[87].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 427 */     this.gunModel[87].setRotationPoint(24.0F, -4.75F, -0.75F);
/*     */     
/* 429 */     this.gunModel[88].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 430 */     this.gunModel[88].setRotationPoint(-7.0F, -3.5F, 1.25F);
/*     */     
/* 432 */     this.gunModel[89].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 433 */     this.gunModel[89].setRotationPoint(-7.0F, -4.2F, 1.25F);
/*     */     
/* 435 */     this.gunModel[90].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F);
/* 436 */     this.gunModel[90].setRotationPoint(-7.0F, -2.8F, 1.25F);
/*     */     
/* 438 */     this.gunModel[91].addShapeBox(0.0F, -4.0F, -1.0F, 3, 2, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 439 */     this.gunModel[91].setRotationPoint(-7.0F, -4.2F, 0.55F);
/*     */     
/* 441 */     this.gunModel[92].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 442 */     this.gunModel[92].setRotationPoint(-7.0F, -4.2F, -0.15F);
/*     */     
/* 444 */     this.gunModel[93].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 445 */     this.gunModel[93].setRotationPoint(-7.0F, -3.5F, -0.15F);
/*     */     
/* 447 */     this.gunModel[94].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 448 */     this.gunModel[94].setRotationPoint(-7.0F, -2.8F, -0.15F);
/*     */     
/* 450 */     this.gunModel[95].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 451 */     this.gunModel[95].setRotationPoint(-3.0F, -4.4F, 1.45F);
/*     */     
/* 453 */     this.gunModel[96].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F);
/* 454 */     this.gunModel[96].setRotationPoint(-3.0F, -4.4F, 0.55F);
/*     */     
/* 456 */     this.gunModel[97].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 457 */     this.gunModel[97].setRotationPoint(-3.0F, -4.4F, -0.35F);
/*     */     
/* 459 */     this.gunModel[98].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 460 */     this.gunModel[98].setRotationPoint(-3.0F, -3.5F, 1.45F);
/*     */     
/* 462 */     this.gunModel[99].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F);
/* 463 */     this.gunModel[99].setRotationPoint(-3.0F, -2.6F, 1.45F);
/*     */     
/* 465 */     this.gunModel[100].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 466 */     this.gunModel[100].setRotationPoint(-3.0F, -3.5F, -0.35F);
/*     */     
/* 468 */     this.gunModel[101].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 469 */     this.gunModel[101].setRotationPoint(-3.0F, -2.6F, -0.35F);
/*     */     
/* 471 */     this.gunModel[102].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F);
/* 472 */     this.gunModel[102].setRotationPoint(-4.0F, -3.5F, 1.25F);
/*     */     
/* 474 */     this.gunModel[103].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.45F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F);
/* 475 */     this.gunModel[103].setRotationPoint(-4.0F, -4.2F, 1.25F);
/*     */     
/* 477 */     this.gunModel[104].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.85F, -0.15F);
/* 478 */     this.gunModel[104].setRotationPoint(-4.0F, -2.8F, 1.25F);
/*     */     
/* 480 */     this.gunModel[105].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.55F, -0.15F, 0.0F, 0.55F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 481 */     this.gunModel[105].setRotationPoint(-4.0F, -4.2F, 0.55F);
/*     */     
/* 483 */     this.gunModel[106].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.15F, 0.0F, -0.45F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 484 */     this.gunModel[106].setRotationPoint(-4.0F, -4.2F, -0.15F);
/*     */     
/* 486 */     this.gunModel[107].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 487 */     this.gunModel[107].setRotationPoint(-4.0F, -3.5F, -0.15F);
/*     */     
/* 489 */     this.gunModel[108].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.45F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 490 */     this.gunModel[108].setRotationPoint(-4.0F, -2.8F, -0.15F);
/*     */     
/* 492 */     this.gunModel[109].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 493 */     this.gunModel[109].setRotationPoint(-15.0F, -4.15F, 1.45F);
/*     */     
/* 495 */     this.gunModel[110].addShapeBox(0.0F, -4.0F, -1.0F, 8, 3, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F);
/* 496 */     this.gunModel[110].setRotationPoint(-15.0F, -4.15F, 0.55F);
/*     */     
/* 498 */     this.gunModel[111].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 499 */     this.gunModel[111].setRotationPoint(-15.0F, -4.15F, -0.35F);
/*     */     
/* 501 */     this.gunModel[112].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F);
/* 502 */     this.gunModel[112].setRotationPoint(-15.0F, -3.25F, 1.45F);
/*     */     
/* 504 */     this.gunModel[113].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F);
/* 505 */     this.gunModel[113].setRotationPoint(-15.0F, -2.85F, 1.45F);
/*     */     
/* 507 */     this.gunModel[114].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F);
/* 508 */     this.gunModel[114].setRotationPoint(-15.0F, -3.25F, -0.35F);
/*     */     
/* 510 */     this.gunModel[115].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 511 */     this.gunModel[115].setRotationPoint(-15.0F, -2.85F, -0.35F);
/*     */     
/* 513 */     this.gunModel[116].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.95F, -0.55F, 0.0F, -0.95F, -0.55F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, -0.55F, 0.0F, -0.05F, -0.55F);
/* 514 */     this.gunModel[116].setRotationPoint(-15.0F, -5.05F, 1.05F);
/*     */     
/* 516 */     this.gunModel[117].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.5F, 0.0F, -0.05F, -0.5F);
/* 517 */     this.gunModel[117].setRotationPoint(-15.0F, -5.05F, 0.55F);
/*     */     
/* 519 */     this.gunModel[118].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.25F, -0.15F, -0.75F, -0.25F, -0.15F, -0.75F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F);
/* 520 */     this.gunModel[118].setRotationPoint(-7.0F, -2.2F, 0.55F);
/*     */     
/* 522 */     this.gunModel[119].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 523 */     this.gunModel[119].setRotationPoint(-15.0F, -1.95F, 1.45F);
/*     */     
/* 525 */     this.gunModel[120].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 526 */     this.gunModel[120].setRotationPoint(-15.0F, -1.95F, 0.35F);
/*     */     
/* 528 */     this.gunModel[121].addShapeBox(0.0F, -4.0F, -1.0F, 7, 1, 1, 0.0F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F);
/* 529 */     this.gunModel[121].setRotationPoint(-14.0F, -2.15F, 0.55F);
/*     */     
/* 531 */     this.gunModel[122].addShapeBox(0.0F, -4.0F, -1.0F, 7, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 532 */     this.gunModel[122].setRotationPoint(-14.0F, -1.95F, 1.45F);
/*     */     
/* 534 */     this.gunModel[123].addShapeBox(0.0F, -4.0F, -1.0F, 7, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 535 */     this.gunModel[123].setRotationPoint(-14.0F, -1.95F, 0.35F);
/*     */     
/* 537 */     this.gunModel[124].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.05F, 0.15F, -0.75F, -0.05F, 0.15F, -0.75F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 538 */     this.gunModel[124].setRotationPoint(-10.0F, -1.65F, 0.55F);
/*     */     
/* 540 */     this.gunModel[125].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.25F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.05F, 0.15F, -0.5F, -0.05F, 0.15F, -0.5F, -0.05F, 0.15F, 0.25F, -0.05F, 0.15F);
/* 541 */     this.gunModel[125].setRotationPoint(-9.75F, -0.95F, 0.55F);
/*     */     
/* 543 */     this.gunModel[126].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 544 */     this.gunModel[126].setRotationPoint(-15.0F, -0.95F, 0.55F);
/*     */     
/* 546 */     this.gunModel[127].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.45F, 0.15F, -0.25F, -0.75F, 0.15F, -0.25F, -0.75F, 0.15F, 0.0F, 0.45F, 0.15F);
/* 547 */     this.gunModel[127].setRotationPoint(-15.0F, -0.25F, 0.55F);
/*     */     
/* 549 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, 0.2F, 0.4F, -0.5F, -1.0F, 0.4F, -0.5F, -1.0F, 0.4F, 0.0F, 0.2F, 0.4F);
/* 550 */     this.gunModel[''].setRotationPoint(-15.0F, -0.25F, 0.55F);
/*     */     
/* 552 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 553 */     this.gunModel[''].setRotationPoint(-13.0F, -1.65F, 0.55F);
/*     */     
/* 555 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.15F, -0.75F, -0.5F, 0.15F, -0.75F, -0.5F, 0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.3F, 0.15F, -0.75F, -0.3F, 0.15F, -0.75F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F);
/* 556 */     this.gunModel[''].setRotationPoint(-15.0F, -1.9F, 0.55F);
/*     */     
/* 558 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, 0.0F, -1.0F, 0.4F);
/* 559 */     this.gunModel[''].setRotationPoint(-11.0F, -0.75F, 0.55F);
/*     */     
/* 561 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, -0.75F, 0.4F, -0.5F, -0.75F, 0.4F, -0.5F, -0.75F, 0.4F, 0.0F, -0.75F, 0.4F, 0.0F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, 0.0F, -1.0F, 0.4F);
/* 562 */     this.gunModel[''].setRotationPoint(-11.0F, -1.25F, 0.55F);
/*     */     
/* 564 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, -1.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, 0.0F, -1.25F, 0.4F, 0.0F, -1.0F, 0.4F, -0.25F, -2.0F, 0.4F, -0.25F, -2.0F, 0.4F, 0.0F, -1.0F, 0.4F);
/* 565 */     this.gunModel[''].setRotationPoint(-12.75F, -0.75F, 0.55F);
/*     */     
/* 567 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 1, 6, 1, 0.0F, -0.5F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 568 */     this.gunModel[''].setRotationPoint(-16.0F, -4.15F, 0.55F);
/*     */     
/* 570 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 1, 6, 1, 0.0F, -0.5F, -0.8F, -0.05F, 0.0F, -0.8F, -0.05F, 0.0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, 0.1F, -0.55F, 0.0F, 0.1F, -0.55F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 571 */     this.gunModel[''].setRotationPoint(-16.0F, -4.15F, -0.35F);
/*     */     
/* 573 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.45F, 0.15F, 0.0F, -0.45F, 0.15F, 0.0F, -0.45F, 0.15F, 0.0F, -0.45F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 574 */     this.gunModel[''].setRotationPoint(-15.0F, -1.65F, 0.55F);
/*     */     
/* 576 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 1, 6, 1, 0.0F, -0.5F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.8F, -0.05F, -0.5F, -0.8F, -0.05F, -0.5F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, 0.0F, 0.1F, -0.55F, -0.5F, 0.1F, -0.55F);
/* 577 */     this.gunModel[''].setRotationPoint(-16.0F, -4.15F, 1.45F);
/*     */     
/* 579 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, -0.5F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -1.1F, -0.05F, -0.5F, -1.1F, -0.05F, -0.5F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 580 */     this.gunModel[''].setRotationPoint(-16.0F, -5.2F, 0.55F);
/*     */     
/* 582 */     this.gunModel[''].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, -0.5F, -1.1F, -0.5F, 0.0F, -1.1F, -0.5F, 0.0F, -0.85F, -0.05F, -0.5F, -0.85F, -0.05F, -0.5F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 583 */     this.gunModel[''].setRotationPoint(-16.0F, -5.2F, 0.1F);
/*     */     
/*     */ 
/* 586 */     this.defaultScopeModel = new ModelRendererTurbo[16];
/* 587 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 588 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 589 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 590 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 591 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 592 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 593 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 594 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 595 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 596 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 597 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 598 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 599 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 600 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/* 601 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/* 602 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*     */     
/* 604 */     this.defaultScopeModel[0].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 605 */     this.defaultScopeModel[0].setRotationPoint(10.5F, -6.0F, 0.0F);
/*     */     
/* 607 */     this.defaultScopeModel[1].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 608 */     this.defaultScopeModel[1].setRotationPoint(11.0F, -7.0F, 0.0F);
/*     */     
/* 610 */     this.defaultScopeModel[2].addShapeBox(0.0F, -4.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 611 */     this.defaultScopeModel[2].setRotationPoint(2.0F, -8.0F, 1.5F);
/*     */     
/* 613 */     this.defaultScopeModel[3].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 614 */     this.defaultScopeModel[3].setRotationPoint(11.75F, -8.0F, 0.0F);
/*     */     
/* 616 */     this.defaultScopeModel[4].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 617 */     this.defaultScopeModel[4].setRotationPoint(1.0F, -8.0F, 1.5F);
/*     */     
/* 619 */     this.defaultScopeModel[5].addShapeBox(0.0F, -4.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 620 */     this.defaultScopeModel[5].setRotationPoint(2.0F, -8.0F, 0.0F);
/*     */     
/* 622 */     this.defaultScopeModel[6].addShapeBox(0.0F, -4.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 623 */     this.defaultScopeModel[6].setRotationPoint(2.0F, -8.0F, 0.5F);
/*     */     
/* 625 */     this.defaultScopeModel[7].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 626 */     this.defaultScopeModel[7].setRotationPoint(0.0F, -8.0F, 1.5F);
/*     */     
/* 628 */     this.defaultScopeModel[8].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 629 */     this.defaultScopeModel[8].setRotationPoint(1.0F, -8.0F, 0.0F);
/*     */     
/* 631 */     this.defaultScopeModel[9].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 632 */     this.defaultScopeModel[9].setRotationPoint(0.0F, -8.0F, 0.0F);
/*     */     
/* 634 */     this.defaultScopeModel[10].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 635 */     this.defaultScopeModel[10].setRotationPoint(0.0F, -8.0F, 0.5F);
/*     */     
/* 637 */     this.defaultScopeModel[11].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 638 */     this.defaultScopeModel[11].setRotationPoint(0.0F, -8.5F, -0.25F);
/*     */     
/* 640 */     this.defaultScopeModel[12].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 641 */     this.defaultScopeModel[12].setRotationPoint(0.0F, -8.5F, 0.5F);
/*     */     
/* 643 */     this.defaultScopeModel[13].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/* 644 */     this.defaultScopeModel[13].setRotationPoint(0.0F, -8.5F, 0.25F);
/*     */     
/* 646 */     this.defaultScopeModel[14].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/* 647 */     this.defaultScopeModel[14].setRotationPoint(0.0F, -7.65F, 0.25F);
/*     */     
/* 649 */     this.defaultScopeModel[15].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 2, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 650 */     this.defaultScopeModel[15].setRotationPoint(-0.75F, -7.0F, 0.0F);
/*     */     
/*     */ 
/* 653 */     this.ammoModel = new ModelRendererTurbo[27];
/* 654 */     this.ammoModel[0] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/* 655 */     this.ammoModel[1] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/* 656 */     this.ammoModel[2] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/* 657 */     this.ammoModel[3] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/* 658 */     this.ammoModel[4] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/* 659 */     this.ammoModel[5] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/* 660 */     this.ammoModel[6] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 661 */     this.ammoModel[7] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/* 662 */     this.ammoModel[8] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/* 663 */     this.ammoModel[9] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/* 664 */     this.ammoModel[10] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 665 */     this.ammoModel[11] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/* 666 */     this.ammoModel[12] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 667 */     this.ammoModel[13] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 668 */     this.ammoModel[14] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/* 669 */     this.ammoModel[15] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/* 670 */     this.ammoModel[16] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/* 671 */     this.ammoModel[17] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/* 672 */     this.ammoModel[18] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/* 673 */     this.ammoModel[19] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/* 674 */     this.ammoModel[20] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/* 675 */     this.ammoModel[21] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/* 676 */     this.ammoModel[22] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/* 677 */     this.ammoModel[23] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/* 678 */     this.ammoModel[24] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/* 679 */     this.ammoModel[25] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/* 680 */     this.ammoModel[26] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*     */     
/* 682 */     this.ammoModel[0].addShapeBox(0.0F, -4.0F, -1.0F, 5, 3, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F);
/* 683 */     this.ammoModel[0].setRotationPoint(6.0F, -0.5F, 0.2F);
/*     */     
/* 685 */     this.ammoModel[1].addShapeBox(0.0F, -4.0F, -1.0F, 5, 3, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F, -0.6F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.6F, -0.6F, 0.0F, 0.6F);
/* 686 */     this.ammoModel[1].setRotationPoint(6.0F, 2.5F, 0.2F);
/*     */     
/* 688 */     this.ammoModel[2].addShapeBox(0.0F, -4.0F, -1.0F, 5, 3, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.6F, -0.1F, 0.0F, 0.6F, -1.6F, 0.0F, 0.0F, 0.9F, -1.5F, 0.0F, 0.9F, -1.5F, 0.6F, -1.6F, 0.0F, 0.6F);
/* 689 */     this.ammoModel[2].setRotationPoint(6.5F, 5.5F, 0.2F);
/*     */     
/* 691 */     this.ammoModel[3].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 692 */     this.ammoModel[3].setRotationPoint(10.0F, 2.5F, 0.15F);
/*     */     
/* 694 */     this.ammoModel[4].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 695 */     this.ammoModel[4].setRotationPoint(8.85F, 2.5F, 0.15F);
/*     */     
/* 697 */     this.ammoModel[5].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 698 */     this.ammoModel[5].setRotationPoint(7.4F, 2.5F, 0.15F);
/*     */     
/* 700 */     this.ammoModel[6].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.6F, 0.0F, 0.1F, 0.6F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 701 */     this.ammoModel[6].setRotationPoint(6.0F, 2.5F, 0.15F);
/*     */     
/* 703 */     this.ammoModel[7].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 704 */     this.ammoModel[7].setRotationPoint(10.0F, 2.5F, 1.9F);
/*     */     
/* 706 */     this.ammoModel[8].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 707 */     this.ammoModel[8].setRotationPoint(8.85F, 2.5F, 1.9F);
/*     */     
/* 709 */     this.ammoModel[9].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.2F, 0.0F, 0.1F, 0.2F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.6F, 0.0F, 0.1F, 0.6F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 710 */     this.ammoModel[9].setRotationPoint(6.0F, 2.5F, 1.9F);
/*     */     
/* 712 */     this.ammoModel[10].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 713 */     this.ammoModel[10].setRotationPoint(7.4F, 2.5F, 1.9F);
/*     */     
/* 715 */     this.ammoModel[11].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 716 */     this.ammoModel[11].setRotationPoint(9.5F, -0.5F, 0.15F);
/*     */     
/* 718 */     this.ammoModel[12].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.7F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.7F, 0.0F, -0.95F);
/* 719 */     this.ammoModel[12].setRotationPoint(8.3F, -0.5F, 0.15F);
/*     */     
/* 721 */     this.ammoModel[13].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 722 */     this.ammoModel[13].setRotationPoint(7.0F, -0.5F, 0.15F);
/*     */     
/* 724 */     this.ammoModel[14].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 725 */     this.ammoModel[14].setRotationPoint(5.5F, -0.5F, 0.15F);
/*     */     
/* 727 */     this.ammoModel[15].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 728 */     this.ammoModel[15].setRotationPoint(9.5F, -0.5F, 1.9F);
/*     */     
/* 730 */     this.ammoModel[16].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.7F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, -0.95F, -0.7F, 0.0F, -0.95F);
/* 731 */     this.ammoModel[16].setRotationPoint(8.3F, -0.5F, 1.9F);
/*     */     
/* 733 */     this.ammoModel[17].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F, -0.8F, 0.0F, 0.1F, 0.3F, 0.0F, 0.1F, 0.3F, 0.0F, -0.95F, -0.8F, 0.0F, -0.95F);
/* 734 */     this.ammoModel[17].setRotationPoint(7.0F, -0.5F, 1.9F);
/*     */     
/* 736 */     this.ammoModel[18].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F, -0.6F, 0.0F, 0.1F, 0.7F, 0.0F, 0.1F, 0.7F, 0.0F, -0.95F, -0.6F, 0.0F, -0.95F);
/* 737 */     this.ammoModel[18].setRotationPoint(5.5F, -0.5F, 1.9F);
/*     */     
/* 739 */     this.ammoModel[19].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.9F, -0.15F, 0.1F, 0.89F, -0.5F, 0.1F, 0.89F, -0.5F, -0.95F, -0.95F, -0.15F, -0.95F);
/* 740 */     this.ammoModel[19].setRotationPoint(10.5F, 5.5F, 1.9F);
/*     */     
/* 742 */     this.ammoModel[20].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.8F, 0.3F, 0.1F, 0.5F, 0.0F, 0.1F, 0.5F, 0.0F, -0.95F, -0.8F, 0.3F, -0.95F);
/* 743 */     this.ammoModel[20].setRotationPoint(9.35F, 5.5F, 0.15F);
/*     */     
/* 745 */     this.ammoModel[21].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -1.25F, -0.35F, 0.1F, 0.75F, -0.5F, 0.1F, 0.75F, -0.5F, -0.95F, -1.25F, -0.35F, -0.95F);
/* 746 */     this.ammoModel[21].setRotationPoint(7.8F, 5.5F, 0.15F);
/*     */     
/* 748 */     this.ammoModel[22].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.4F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -1.25F, -0.35F, 0.1F, 0.75F, -0.5F, 0.1F, 0.75F, -0.5F, -0.95F, -1.25F, -0.35F, -0.95F);
/* 749 */     this.ammoModel[22].setRotationPoint(7.8F, 5.5F, 1.9F);
/*     */     
/* 751 */     this.ammoModel[23].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -1.6F, 0.02F, 0.1F, 1.0F, -0.15F, 0.1F, 1.0F, -0.15F, -0.95F, -1.6F, 0.02F, -0.95F);
/* 752 */     this.ammoModel[23].setRotationPoint(6.5F, 5.5F, 1.9F);
/*     */     
/* 754 */     this.ammoModel[24].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, -0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -1.6F, 0.02F, 0.1F, 1.0F, -0.15F, 0.1F, 1.0F, -0.15F, -0.95F, -1.6F, 0.02F, -0.95F);
/* 755 */     this.ammoModel[24].setRotationPoint(6.5F, 5.5F, 0.15F);
/*     */     
/* 757 */     this.ammoModel[25].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, 0.1F, -0.1F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.9F, -0.15F, 0.1F, 0.89F, -0.5F, 0.1F, 0.89F, -0.5F, -0.95F, -0.95F, -0.15F, -0.95F);
/* 758 */     this.ammoModel[25].setRotationPoint(10.5F, 5.5F, 0.15F);
/*     */     
/* 760 */     this.ammoModel[26].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, -0.95F, -0.1F, 0.0F, -0.95F, -0.8F, 0.3F, 0.1F, 0.5F, 0.0F, 0.1F, 0.5F, 0.0F, -0.95F, -0.8F, 0.3F, -0.95F);
/* 761 */     this.ammoModel[26].setRotationPoint(9.35F, 5.5F, 1.9F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 766 */     this.scopeAttachPoint = new Vector3f(0.4375F, 0.625F, 0.0F);
/* 767 */     this.gripAttachPoint = new Vector3f(1.1875F, 0.375F, 0.0F);
/*     */     
/*     */ 
/* 770 */     translateAll(0.0F, -1.0F, 0.0F);
/* 771 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*     */     
/* 773 */     this.gunSlideDistance = 0.0F;
/* 774 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 777 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm4a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */