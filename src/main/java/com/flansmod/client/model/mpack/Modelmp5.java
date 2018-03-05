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
/*     */ public class Modelmp5
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelmp5()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[''];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 289, 33, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 385, 41, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/*     */     
/* 161 */     this.gunModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 13, 4, 3, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 162 */     this.gunModel[0].setRotationPoint(2.0F, -15.0F, 0.0F);
/*     */     
/* 164 */     this.gunModel[1].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 3, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 165 */     this.gunModel[1].setRotationPoint(0.0F, -13.75F, 0.0F);
/*     */     
/* 167 */     this.gunModel[2].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 168 */     this.gunModel[2].setRotationPoint(-1.0F, -13.75F, 0.0F);
/*     */     
/* 170 */     this.gunModel[3].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 171 */     this.gunModel[3].setRotationPoint(-2.0F, -13.75F, 0.0F);
/*     */     
/* 173 */     this.gunModel[4].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 7, 1, 0.0F, -2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 174 */     this.gunModel[4].setRotationPoint(-1.0F, -10.0F, 1.0F);
/*     */     
/* 176 */     this.gunModel[5].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 7, 1, 0.0F, -1.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, -0.5F, -1.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.5F, 0.0F);
/* 177 */     this.gunModel[5].setRotationPoint(2.0F, -10.0F, 2.0F);
/*     */     
/* 179 */     this.gunModel[6].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 7, 1, 0.0F, -1.5F, 1.0F, 0.0F, 2.5F, 1.0F, -0.5F, 2.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 180 */     this.gunModel[6].setRotationPoint(2.0F, -10.0F, 0.0F);
/*     */     
/* 182 */     this.gunModel[7].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 7, 1, 0.0F, -2.5F, 1.0F, -0.5F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 183 */     this.gunModel[7].setRotationPoint(-1.0F, -10.0F, 0.0F);
/*     */     
/* 185 */     this.gunModel[8].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 7, 1, 0.0F, -2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.25F, -0.5F);
/* 186 */     this.gunModel[8].setRotationPoint(-1.0F, -10.0F, 2.0F);
/*     */     
/* 188 */     this.gunModel[9].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 189 */     this.gunModel[9].setRotationPoint(13.0F, -11.0F, 0.5F);
/*     */     
/* 191 */     this.gunModel[10].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 192 */     this.gunModel[10].setRotationPoint(12.75F, -10.0F, 0.5F);
/*     */     
/* 194 */     this.gunModel[11].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 195 */     this.gunModel[11].setRotationPoint(8.25F, -8.0F, 0.5F);
/*     */     
/* 197 */     this.gunModel[12].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -1.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -1.5F, 0.0F);
/* 198 */     this.gunModel[12].setRotationPoint(6.25F, -8.0F, 0.5F);
/*     */     
/* 200 */     this.gunModel[13].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 201 */     this.gunModel[13].setRotationPoint(6.25F, -9.0F, 0.5F);
/*     */     
/* 203 */     this.gunModel[14].addShapeBox(-3.0F, 5.0F, -1.5F, 17, 1, 3, 0.0F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 204 */     this.gunModel[14].setRotationPoint(-2.0F, -16.5F, 0.0F);
/*     */     
/* 206 */     this.gunModel[15].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 207 */     this.gunModel[15].setRotationPoint(15.0F, -15.0F, 0.0F);
/*     */     
/* 209 */     this.gunModel[16].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 210 */     this.gunModel[16].setRotationPoint(15.0F, -12.0F, 0.0F);
/*     */     
/* 212 */     this.gunModel[17].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[17].setRotationPoint(15.0F, -12.5F, 0.0F);
/*     */     
/* 215 */     this.gunModel[18].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[18].setRotationPoint(15.75F, -12.0F, 0.0F);
/*     */     
/* 218 */     this.gunModel[19].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, -0.75F, 0.0F, -1.75F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 219 */     this.gunModel[19].setRotationPoint(15.75F, -12.75F, 0.0F);
/*     */     
/* 221 */     this.gunModel[20].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.6F, 0.0F, -1.85F, -0.6F, 0.0F, -1.85F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -1.85F, -0.4F, 0.0F, -1.85F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 222 */     this.gunModel[20].setRotationPoint(16.0F, -12.25F, 0.0F);
/*     */     
/* 224 */     this.gunModel[21].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.75F, 0.0F, -1.85F, -1.1F, 0.0F, -1.85F, -1.1F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, 0.0F, -1.85F, 0.1F, 0.0F, -1.85F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F);
/* 225 */     this.gunModel[21].setRotationPoint(16.0F, -12.75F, 0.0F);
/*     */     
/* 227 */     this.gunModel[22].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 2, 3, 0.0F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F);
/* 228 */     this.gunModel[22].setRotationPoint(15.0F, -16.5F, 0.0F);
/*     */     
/* 230 */     this.gunModel[23].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 2, 3, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, -0.75F, 1.5F, -0.25F, -0.75F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F);
/* 231 */     this.gunModel[23].setRotationPoint(15.0F, -14.5F, 0.0F);
/*     */     
/* 233 */     this.gunModel[24].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 234 */     this.gunModel[24].setRotationPoint(15.5F, -13.45F, 0.0F);
/*     */     
/* 236 */     this.gunModel[25].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 4, 3, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 237 */     this.gunModel[25].setRotationPoint(17.5F, -15.0F, 0.0F);
/*     */     
/* 239 */     this.gunModel[26].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 240 */     this.gunModel[26].setRotationPoint(21.5F, -15.0F, 0.0F);
/*     */     
/* 242 */     this.gunModel[27].addShapeBox(-3.0F, 5.0F, -1.5F, 23, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 243 */     this.gunModel[27].setRotationPoint(0.0F, -16.75F, 2.15F);
/*     */     
/* 245 */     this.gunModel[28].addShapeBox(-3.0F, 5.0F, -1.5F, 20, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 246 */     this.gunModel[28].setRotationPoint(-2.0F, -18.75F, 2.15F);
/*     */     
/* 248 */     this.gunModel[29].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F);
/* 249 */     this.gunModel[29].setRotationPoint(-2.0F, -19.25F, 2.15F);
/*     */     
/* 251 */     this.gunModel[30].addShapeBox(-3.0F, 5.0F, -1.5F, 24, 1, 1, 0.0F, 0.0F, -0.65F, -0.2F, 0.0F, -0.65F, -0.2F, 0.0F, -1.0F, -0.15F, 0.0F, -1.0F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 252 */     this.gunModel[30].setRotationPoint(-1.0F, -20.5F, 2.15F);
/*     */     
/* 254 */     this.gunModel[31].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 2, 4, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.65F, 0.0F, -0.5F, 0.65F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, 0.65F, 0.0F, -0.25F, 0.65F);
/* 255 */     this.gunModel[31].setRotationPoint(18.0F, -18.75F, -0.85F);
/*     */     
/* 257 */     this.gunModel[32].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 1, 2, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 258 */     this.gunModel[32].setRotationPoint(-2.0F, -20.75F, 0.5F);
/*     */     
/* 260 */     this.gunModel[33].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 261 */     this.gunModel[33].setRotationPoint(-2.0F, -16.75F, -0.15F);
/*     */     
/* 263 */     this.gunModel[34].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 264 */     this.gunModel[34].setRotationPoint(-2.0F, -19.25F, -0.15F);
/*     */     
/* 266 */     this.gunModel[35].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 267 */     this.gunModel[35].setRotationPoint(-2.0F, -20.5F, -0.2F);
/*     */     
/* 269 */     this.gunModel[36].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 2, 1, 0.0F, 0.0F, -0.5F, -0.05F, 0.02F, -0.5F, -0.05F, 0.02F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.05F, 0.02F, -0.25F, -0.05F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 270 */     this.gunModel[36].setRotationPoint(-2.0F, -20.0F, 0.8F);
/*     */     
/* 272 */     this.gunModel[37].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 2, 1, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 273 */     this.gunModel[37].setRotationPoint(-2.0F, -17.5F, 0.8F);
/*     */     
/* 275 */     this.gunModel[38].addShapeBox(-3.0F, 5.0F, -1.5F, 20, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.3F, 0.0F, -0.5F, 1.3F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.3F, 0.0F, -0.25F, 1.3F);
/* 276 */     this.gunModel[38].setRotationPoint(-2.0F, -18.75F, -0.15F);
/*     */     
/* 278 */     this.gunModel[39].addShapeBox(-3.0F, 5.0F, -1.5F, 22, 1, 4, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 279 */     this.gunModel[39].setRotationPoint(4.0F, -21.95F, -0.85F);
/*     */     
/* 281 */     this.gunModel[40].addShapeBox(-3.0F, 5.0F, -1.5F, 22, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 282 */     this.gunModel[40].setRotationPoint(4.0F, -23.05F, 2.15F);
/*     */     
/* 284 */     this.gunModel[41].addShapeBox(-3.0F, 5.0F, -1.5F, 38, 1, 1, 0.0F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 285 */     this.gunModel[41].setRotationPoint(4.0F, -23.05F, -0.15F);
/*     */     
/* 287 */     this.gunModel[42].addShapeBox(-3.0F, 5.0F, -1.5F, 36, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 288 */     this.gunModel[42].setRotationPoint(3.0F, -23.05F, 0.85F);
/*     */     
/* 290 */     this.gunModel[43].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 291 */     this.gunModel[43].setRotationPoint(-5.0F, -21.35F, 0.85F);
/*     */     
/* 293 */     this.gunModel[44].addShapeBox(-3.0F, 5.0F, -1.5F, 38, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 294 */     this.gunModel[44].setRotationPoint(4.0F, -23.65F, 0.3F);
/*     */     
/* 296 */     this.gunModel[45].addShapeBox(-3.0F, 5.0F, -1.5F, 39, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 297 */     this.gunModel[45].setRotationPoint(3.0F, -23.65F, 1.45F);
/*     */     
/* 299 */     this.gunModel[46].addShapeBox(-3.0F, 5.0F, -1.5F, 38, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 300 */     this.gunModel[46].setRotationPoint(4.0F, -23.65F, 0.75F);
/*     */     
/* 302 */     this.gunModel[47].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 303 */     this.gunModel[47].setRotationPoint(-2.0F, -21.25F, -0.15F);
/*     */     
/* 305 */     this.gunModel[48].addShapeBox(-3.0F, 5.0F, -1.5F, 40, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.15F, 0.0F, -0.35F, -0.15F);
/* 306 */     this.gunModel[48].setRotationPoint(-1.0F, -21.25F, 1.9F);
/*     */     
/* 308 */     this.gunModel[49].addShapeBox(-3.0F, 5.0F, -1.5F, 41, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 309 */     this.gunModel[49].setRotationPoint(-2.0F, -21.25F, 0.85F);
/*     */     
/* 311 */     this.gunModel[50].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 312 */     this.gunModel[50].setRotationPoint(18.0F, -21.35F, 0.85F);
/*     */     
/* 314 */     this.gunModel[51].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 3, 0.0F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 315 */     this.gunModel[51].setRotationPoint(23.0F, -20.95F, -0.85F);
/*     */     
/* 317 */     this.gunModel[52].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 318 */     this.gunModel[52].setRotationPoint(4.0F, -23.8F, 0.75F);
/*     */     
/* 320 */     this.gunModel[53].addShapeBox(-3.0F, 5.0F, -1.5F, 10, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 321 */     this.gunModel[53].setRotationPoint(14.0F, -23.8F, 0.75F);
/*     */     
/* 323 */     this.gunModel[54].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, 0.1F, 0.0F, -0.95F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 324 */     this.gunModel[54].setRotationPoint(12.5F, -23.8F, 0.75F);
/*     */     
/* 326 */     this.gunModel[55].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.85F, -0.4F, 0.0F, -0.85F, -0.4F, 0.0F, -0.85F, 0.1F, -0.75F, -0.85F, 0.1F, -0.75F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F);
/* 327 */     this.gunModel[55].setRotationPoint(11.5F, -23.8F, 0.75F);
/*     */     
/* 329 */     this.gunModel[56].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.85F, -0.4F, 0.0F, -0.85F, -0.4F, 0.0F, -0.85F, 0.1F, -0.75F, -0.85F, 0.1F, -0.75F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F);
/* 330 */     this.gunModel[56].setRotationPoint(12.75F, -23.8F, 0.75F);
/*     */     
/* 332 */     this.gunModel[57].addShapeBox(-3.0F, 5.0F, -1.5F, 21, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 333 */     this.gunModel[57].setRotationPoint(18.0F, -21.25F, -0.15F);
/*     */     
/* 335 */     this.gunModel[58].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 336 */     this.gunModel[58].setRotationPoint(18.0F, -20.5F, -0.2F);
/*     */     
/* 338 */     this.gunModel[59].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 339 */     this.gunModel[59].setRotationPoint(14.0F, -21.35F, 0.85F);
/*     */     
/* 341 */     this.gunModel[60].addShapeBox(-3.0F, 5.0F, -1.5F, 23, 2, 1, 0.0F, 0.0F, -0.25F, 0.2F, 0.02F, -0.25F, 0.2F, 0.02F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F, 0.0F, 0.0F, 0.2F, 0.02F, 0.0F, 0.2F, 0.02F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F);
/* 342 */     this.gunModel[60].setRotationPoint(24.0F, -18.75F, 0.8F);
/*     */     
/* 344 */     this.gunModel[61].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 345 */     this.gunModel[61].setRotationPoint(18.0F, -19.25F, -0.15F);
/*     */     
/* 347 */     this.gunModel[62].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 348 */     this.gunModel[62].setRotationPoint(14.0F, -19.25F, -0.15F);
/*     */     
/* 350 */     this.gunModel[63].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 351 */     this.gunModel[63].setRotationPoint(14.0F, -19.5F, -0.2F);
/*     */     
/* 353 */     this.gunModel[64].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 1.05F, 0.0F, -0.75F, 1.05F);
/* 354 */     this.gunModel[64].setRotationPoint(14.0F, -21.35F, 0.85F);
/*     */     
/* 356 */     this.gunModel[65].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 357 */     this.gunModel[65].setRotationPoint(38.0F, -20.95F, 0.15F);
/*     */     
/* 359 */     this.gunModel[66].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 360 */     this.gunModel[66].setRotationPoint(23.0F, -20.95F, 0.15F);
/*     */     
/* 362 */     this.gunModel[67].addShapeBox(-3.0F, 5.0F, -1.5F, 11, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 363 */     this.gunModel[67].setRotationPoint(28.0F, -23.05F, 2.15F);
/*     */     
/* 365 */     this.gunModel[68].addShapeBox(-3.0F, 5.0F, -1.5F, 11, 1, 4, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 366 */     this.gunModel[68].setRotationPoint(28.0F, -21.95F, -0.85F);
/*     */     
/* 368 */     this.gunModel[69].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, 0.35F, 0.0F, -0.65F, 0.35F);
/* 369 */     this.gunModel[69].setRotationPoint(26.0F, -21.95F, -0.85F);
/*     */     
/* 371 */     this.gunModel[70].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.65F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F);
/* 372 */     this.gunModel[70].setRotationPoint(26.0F, -20.95F, 0.15F);
/*     */     
/* 374 */     this.gunModel[71].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.65F, -1.6F, -0.6F, 0.65F, -1.6F, -0.1F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, -0.6F, -0.65F, -1.6F, -0.1F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 375 */     this.gunModel[71].setRotationPoint(37.35F, -20.9F, 0.3F);
/* 376 */     this.gunModel[71].rotateAngleX = 0.13962634F;
/*     */     
/* 378 */     this.gunModel[72].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, -0.5F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, -0.25F, 0.65F, -0.4F, -0.5F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, -0.25F, -0.65F, -0.4F);
/* 379 */     this.gunModel[72].setRotationPoint(36.35F, -20.9F, 0.3F);
/* 380 */     this.gunModel[72].rotateAngleX = 0.13962634F;
/*     */     
/* 382 */     this.gunModel[73].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, -0.25F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, -0.75F, 0.65F, -0.4F, -0.25F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F);
/* 383 */     this.gunModel[73].setRotationPoint(36.35F, -21.04F, 1.3F);
/* 384 */     this.gunModel[73].rotateAngleX = 0.13962634F;
/*     */     
/* 386 */     this.gunModel[74].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 5, 3, 0.0F, 0.0F, -0.5F, -0.05F, 0.02F, -0.5F, -0.05F, 0.02F, -0.5F, -1.9F, 0.0F, -0.5F, -1.4F, 0.0F, 0.5F, -0.05F, 0.02F, -1.0F, -0.05F, 0.02F, -1.0F, -0.15F, 0.0F, 0.5F, 0.35F);
/* 387 */     this.gunModel[74].setRotationPoint(23.0F, -20.75F, 1.3F);
/*     */     
/* 389 */     this.gunModel[75].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 2, 2, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 2.0F, 0.25F, 0.0F, 2.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.25F, 0.0F, -3.25F, 0.25F, 0.0F, -3.75F, -0.5F, 0.0F, -2.25F, 0.0F);
/* 390 */     this.gunModel[75].setRotationPoint(23.0F, -14.75F, 2.65F);
/*     */     
/* 392 */     this.gunModel[76].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.5F, -0.55F, 0.02F, 0.5F, -0.55F, 0.02F, 0.5F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.25F, -0.55F, 0.02F, 0.25F, -0.55F, 0.02F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 393 */     this.gunModel[76].setRotationPoint(42.0F, -20.0F, 0.3F);
/*     */     
/* 395 */     this.gunModel[77].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.8F, 0.02F, 0.0F, -0.8F, 0.02F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.8F, 0.02F, -0.5F, -0.8F, 0.02F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F);
/* 396 */     this.gunModel[77].setRotationPoint(42.0F, -21.75F, -0.2F);
/*     */     
/* 398 */     this.gunModel[78].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.65F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.4F);
/* 399 */     this.gunModel[78].setRotationPoint(39.0F, -23.05F, 2.15F);
/*     */     
/* 401 */     this.gunModel[79].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 402 */     this.gunModel[79].setRotationPoint(39.0F, -23.05F, 0.85F);
/*     */     
/* 404 */     this.gunModel[80].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.4F);
/* 405 */     this.gunModel[80].setRotationPoint(39.0F, -20.95F, 0.15F);
/*     */     
/* 407 */     this.gunModel[81].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -1.35F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 408 */     this.gunModel[81].setRotationPoint(39.0F, -20.95F, -0.85F);
/*     */     
/* 410 */     this.gunModel[82].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 411 */     this.gunModel[82].setRotationPoint(39.0F, -21.25F, 0.85F);
/*     */     
/* 413 */     this.gunModel[83].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.15F);
/* 414 */     this.gunModel[83].setRotationPoint(39.0F, -21.25F, 1.9F);
/*     */     
/* 416 */     this.gunModel[84].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 417 */     this.gunModel[84].setRotationPoint(39.0F, -21.25F, -0.15F);
/*     */     
/* 419 */     this.gunModel[85].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 420 */     this.gunModel[85].setRotationPoint(39.0F, -23.05F, -0.15F);
/*     */     
/* 422 */     this.gunModel[86].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.35F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 423 */     this.gunModel[86].setRotationPoint(39.0F, -21.95F, -0.85F);
/*     */     
/* 425 */     this.gunModel[87].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.65F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.4F);
/* 426 */     this.gunModel[87].setRotationPoint(39.0F, -21.95F, 1.15F);
/*     */     
/* 428 */     this.gunModel[88].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 429 */     this.gunModel[88].setRotationPoint(40.0F, -21.25F, 0.85F);
/*     */     
/* 431 */     this.gunModel[89].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F);
/* 432 */     this.gunModel[89].setRotationPoint(40.0F, -21.25F, 1.9F);
/*     */     
/* 434 */     this.gunModel[90].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.65F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F);
/* 435 */     this.gunModel[90].setRotationPoint(40.0F, -20.95F, 0.15F);
/*     */     
/* 437 */     this.gunModel[91].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.65F, 0.0F, -0.15F, -0.65F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F);
/* 438 */     this.gunModel[91].setRotationPoint(40.0F, -21.95F, 1.15F);
/*     */     
/* 440 */     this.gunModel[92].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.65F, 0.0F, -1.2F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.65F);
/* 441 */     this.gunModel[92].setRotationPoint(40.0F, -23.05F, 2.15F);
/*     */     
/* 443 */     this.gunModel[93].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.65F, 0.0F, -0.35F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 444 */     this.gunModel[93].setRotationPoint(40.0F, -21.25F, -0.15F);
/*     */     
/* 446 */     this.gunModel[94].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.65F, -1.35F, 0.0F, 0.65F, -1.35F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 447 */     this.gunModel[94].setRotationPoint(40.0F, -20.95F, -0.85F);
/*     */     
/* 449 */     this.gunModel[95].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.15F, -1.35F, 0.0F, -0.15F, -1.35F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 450 */     this.gunModel[95].setRotationPoint(40.0F, -21.95F, -0.85F);
/*     */     
/* 452 */     this.gunModel[96].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.2F, -0.65F, 0.0F, -1.2F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 453 */     this.gunModel[96].setRotationPoint(40.0F, -23.05F, -0.15F);
/*     */     
/* 455 */     this.gunModel[97].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 456 */     this.gunModel[97].setRotationPoint(42.0F, -23.5F, 1.0F);
/*     */     
/* 458 */     this.gunModel[98].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.6F, 0.02F, -0.75F, -0.6F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.02F, -0.25F, -0.6F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 459 */     this.gunModel[98].setRotationPoint(42.0F, -22.5F, 0.0F);
/*     */     
/* 461 */     this.gunModel[99].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F);
/* 462 */     this.gunModel[99].setRotationPoint(42.0F, -22.5F, 2.0F);
/*     */     
/* 464 */     this.gunModel[100].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, 0.02F, 0.0F, -0.6F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.6F, 0.02F, -1.0F, -0.6F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 465 */     this.gunModel[100].setRotationPoint(42.0F, -21.25F, 0.0F);
/*     */     
/* 467 */     this.gunModel[101].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.02F, 0.0F, -0.5F, 0.02F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.25F, -0.5F, 0.02F, -0.25F, -0.5F, 0.02F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F);
/* 468 */     this.gunModel[101].setRotationPoint(42.0F, -21.25F, 1.5F);
/*     */     
/* 470 */     this.gunModel[102].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 471 */     this.gunModel[102].setRotationPoint(42.0F, -21.25F, 1.0F);
/*     */     
/* 473 */     this.gunModel[103].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 474 */     this.gunModel[103].setRotationPoint(42.0F, -17.0F, 1.0F);
/*     */     
/* 476 */     this.gunModel[104].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F);
/* 477 */     this.gunModel[104].setRotationPoint(42.0F, -17.0F, 2.0F);
/*     */     
/* 479 */     this.gunModel[105].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.3F, 0.02F, 0.0F, -0.3F, 0.02F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.3F, 0.02F, 0.0F, -0.3F, 0.02F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 480 */     this.gunModel[105].setRotationPoint(42.0F, -18.0F, -0.2F);
/*     */     
/* 482 */     this.gunModel[106].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, -0.75F, -0.1F, 0.0F, -0.75F, -0.1F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F);
/* 483 */     this.gunModel[106].setRotationPoint(42.0F, -18.75F, 2.0F);
/*     */     
/* 485 */     this.gunModel[107].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.02F, -1.0F, 0.0F, 0.02F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 486 */     this.gunModel[107].setRotationPoint(42.0F, -19.75F, 1.0F);
/*     */     
/* 488 */     this.gunModel[108].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.1F, 0.02F, -0.75F, -0.1F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.1F, 0.02F, -0.25F, -0.1F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 489 */     this.gunModel[108].setRotationPoint(42.0F, -18.75F, 0.0F);
/*     */     
/* 491 */     this.gunModel[109].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.02F, 0.0F, -0.1F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.1F, 0.02F, -1.0F, -0.1F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 492 */     this.gunModel[109].setRotationPoint(42.0F, -17.0F, 0.0F);
/*     */     
/* 494 */     this.gunModel[110].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 495 */     this.gunModel[110].setRotationPoint(42.0F, -24.0F, 1.38F);
/*     */     
/* 497 */     this.gunModel[111].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 5, 3, 0.0F, 0.0F, -0.5F, -1.4F, 0.02F, -0.5F, -1.9F, 0.02F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, 0.5F, 0.35F, 0.02F, -1.0F, -0.15F, 0.02F, -1.0F, -0.3F, 0.0F, 0.5F, -0.3F);
/* 498 */     this.gunModel[111].setRotationPoint(23.0F, -20.75F, -1.3F);
/*     */     
/* 500 */     this.gunModel[112].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 2, 2, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, 0.15F, 0.0F, 0.5F, 0.65F, 0.0F, -2.25F, 0.25F, 0.0F, -3.75F, -0.25F, 0.0F, -3.25F, 0.15F, 0.0F, -1.75F, 0.65F);
/* 501 */     this.gunModel[112].setRotationPoint(23.0F, -14.75F, -1.4F);
/*     */     
/* 503 */     this.gunModel[113].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.35F, 0.0F, 0.25F, -0.35F);
/* 504 */     this.gunModel[113].setRotationPoint(23.0F, -16.75F, 0.75F);
/*     */     
/* 506 */     this.gunModel[114].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 1.0F, 0.5F, -1.0F, 1.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 1.0F, -0.65F, -1.0F, 1.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 507 */     this.gunModel[114].setRotationPoint(-1.0F, -21.95F, -0.85F);
/*     */     
/* 509 */     this.gunModel[115].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 1.0F, -0.25F, -1.0F, 1.0F, -0.25F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 1.0F, -0.65F, -1.0F, 1.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 510 */     this.gunModel[115].setRotationPoint(1.0F, -22.8F, -0.85F);
/*     */     
/* 512 */     this.gunModel[116].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 513 */     this.gunModel[116].setRotationPoint(-1.0F, -22.8F, -0.85F);
/*     */     
/* 515 */     this.gunModel[117].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, 0.0F, -0.9F, -0.55F);
/* 516 */     this.gunModel[117].setRotationPoint(-1.0F, -23.4F, 1.37F);
/*     */     
/* 518 */     this.gunModel[118].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -1.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -1.25F, 0.25F, -0.55F, -0.5F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, -0.5F, -0.9F, -0.55F);
/* 519 */     this.gunModel[118].setRotationPoint(-1.0F, -23.75F, 1.37F);
/*     */     
/* 521 */     this.gunModel[119].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, 0.0F, -0.9F, -0.55F);
/* 522 */     this.gunModel[119].setRotationPoint(-1.0F, -23.4F, -0.85F);
/*     */     
/* 524 */     this.gunModel[120].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -1.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -1.25F, 0.25F, -0.55F, -0.5F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, -0.5F, -0.9F, -0.55F);
/* 525 */     this.gunModel[120].setRotationPoint(-1.0F, -23.75F, -0.85F);
/*     */     
/* 527 */     this.gunModel[121].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 4, 0.0F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.65F, -1.05F, 0.0F, -0.65F, -1.05F, 0.0F, -0.65F, -0.35F, 0.0F, -0.65F, -0.35F);
/* 528 */     this.gunModel[121].setRotationPoint(-5.0F, -21.95F, -0.85F);
/*     */     
/* 530 */     this.gunModel[122].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 3, 2, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.4F, 0.0F, -0.75F, 0.4F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.4F);
/* 531 */     this.gunModel[122].setRotationPoint(-5.0F, -23.05F, 0.4F);
/*     */     
/* 533 */     this.gunModel[123].addBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F);
/* 534 */     this.gunModel[123].setRotationPoint(1.5F, -23.5F, 0.5F);
/*     */     
/* 536 */     this.gunModel[124].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 537 */     this.gunModel[124].setRotationPoint(1.5F, -24.5F, 0.5F);
/*     */     
/* 539 */     this.gunModel[125].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 540 */     this.gunModel[125].setRotationPoint(1.5F, -24.5F, 2.0F);
/*     */     
/* 542 */     this.gunModel[126].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 2, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 543 */     this.gunModel[126].setRotationPoint(16.5F, -11.75F, 0.5F);
/* 544 */     this.gunModel[126].rotateAngleZ = -0.12217305F;
/*     */     
/* 546 */     this.gunModel[127].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 547 */     this.gunModel[127].setRotationPoint(-2.0F, -17.5F, 2.15F);
/*     */     
/* 549 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 550 */     this.gunModel[''].setRotationPoint(-5.0F, -23.55F, 0.85F);
/*     */     
/* 552 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, -0.475F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.475F, 0.15F);
/* 553 */     this.gunModel[''].setRotationPoint(-19.0F, -14.5F, 2.0F);
/*     */     
/* 555 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 556 */     this.gunModel[''].setRotationPoint(8.5F, -11.0F, 1.0F);
/*     */     
/* 558 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 559 */     this.gunModel[''].setRotationPoint(42.0F, -23.75F, 2.0F);
/*     */     
/* 561 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -2.0F, 0.0F, -0.15F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.55F, 0.0F, 0.0F, -1.55F);
/* 562 */     this.gunModel[''].setRotationPoint(42.0F, -24.6F, 2.0F);
/*     */     
/* 564 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 565 */     this.gunModel[''].setRotationPoint(42.0F, -24.45F, 1.0F);
/*     */     
/* 567 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 568 */     this.gunModel[''].setRotationPoint(42.0F, -23.75F, -1.0F);
/*     */     
/* 570 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F);
/* 571 */     this.gunModel[''].setRotationPoint(42.0F, -24.45F, -1.0F);
/*     */     
/* 573 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 574 */     this.gunModel[''].setRotationPoint(42.0F, -24.7F, 1.0F);
/*     */     
/* 576 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 577 */     this.gunModel[''].setRotationPoint(42.0F, -24.7F, 0.5F);
/*     */     
/*     */ 
/* 580 */     this.defaultStockModel = new ModelRendererTurbo[50];
/* 581 */     this.defaultStockModel[0] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
/* 582 */     this.defaultStockModel[1] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/* 583 */     this.defaultStockModel[2] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/* 584 */     this.defaultStockModel[3] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/* 585 */     this.defaultStockModel[4] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/* 586 */     this.defaultStockModel[5] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/* 587 */     this.defaultStockModel[6] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/* 588 */     this.defaultStockModel[7] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/* 589 */     this.defaultStockModel[8] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/* 590 */     this.defaultStockModel[9] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/* 591 */     this.defaultStockModel[10] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/* 592 */     this.defaultStockModel[11] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 593 */     this.defaultStockModel[12] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/* 594 */     this.defaultStockModel[13] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 595 */     this.defaultStockModel[14] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/* 596 */     this.defaultStockModel[15] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/* 597 */     this.defaultStockModel[16] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/* 598 */     this.defaultStockModel[17] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/* 599 */     this.defaultStockModel[18] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/* 600 */     this.defaultStockModel[19] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/* 601 */     this.defaultStockModel[20] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/* 602 */     this.defaultStockModel[21] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/* 603 */     this.defaultStockModel[22] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/* 604 */     this.defaultStockModel[23] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/* 605 */     this.defaultStockModel[24] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/* 606 */     this.defaultStockModel[25] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/* 607 */     this.defaultStockModel[26] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 608 */     this.defaultStockModel[27] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/* 609 */     this.defaultStockModel[28] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/* 610 */     this.defaultStockModel[29] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/* 611 */     this.defaultStockModel[30] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/* 612 */     this.defaultStockModel[31] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 613 */     this.defaultStockModel[32] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/* 614 */     this.defaultStockModel[33] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/* 615 */     this.defaultStockModel[34] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 616 */     this.defaultStockModel[35] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/* 617 */     this.defaultStockModel[36] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/* 618 */     this.defaultStockModel[37] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/* 619 */     this.defaultStockModel[38] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/* 620 */     this.defaultStockModel[39] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/* 621 */     this.defaultStockModel[40] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/* 622 */     this.defaultStockModel[41] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/* 623 */     this.defaultStockModel[42] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 624 */     this.defaultStockModel[43] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/* 625 */     this.defaultStockModel[44] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 626 */     this.defaultStockModel[45] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/* 627 */     this.defaultStockModel[46] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/* 628 */     this.defaultStockModel[47] = new ModelRendererTurbo(this, 289, 41, this.textureX, this.textureY);
/* 629 */     this.defaultStockModel[48] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 630 */     this.defaultStockModel[49] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*     */     
/* 632 */     this.defaultStockModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.25F, 0.0F, -1.2F, -0.25F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 633 */     this.defaultStockModel[0].setRotationPoint(-5.0F, -23.55F, 2.15F);
/*     */     
/* 635 */     this.defaultStockModel[1].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 636 */     this.defaultStockModel[1].setRotationPoint(-5.0F, -24.15F, 0.75F);
/*     */     
/* 638 */     this.defaultStockModel[2].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 639 */     this.defaultStockModel[2].setRotationPoint(-5.0F, -24.15F, 0.3F);
/*     */     
/* 641 */     this.defaultStockModel[3].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.2F, -0.3F, 0.0F, -1.2F, -0.3F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 642 */     this.defaultStockModel[3].setRotationPoint(-5.0F, -23.55F, -0.15F);
/*     */     
/* 644 */     this.defaultStockModel[4].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 645 */     this.defaultStockModel[4].setRotationPoint(-5.0F, -24.15F, 1.45F);
/*     */     
/* 647 */     this.defaultStockModel[5].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 3, 1, 0.0F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -1.5F, -0.05F, 0.0F, -1.5F, -0.05F);
/* 648 */     this.defaultStockModel[5].setRotationPoint(-5.0F, -18.25F, 3.1F);
/*     */     
/* 650 */     this.defaultStockModel[6].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 651 */     this.defaultStockModel[6].setRotationPoint(-6.0F, -17.5F, 2.15F);
/*     */     
/* 653 */     this.defaultStockModel[7].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 3, 1, 0.0F, 3.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.0F, 3.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.05F);
/* 654 */     this.defaultStockModel[7].setRotationPoint(-5.0F, -19.25F, 3.1F);
/*     */     
/* 656 */     this.defaultStockModel[8].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 3, 1, 0.0F, 0.0F, 0.5F, 0.05F, 0.0F, 0.5F, 0.05F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 657 */     this.defaultStockModel[8].setRotationPoint(-5.0F, -20.25F, 3.1F);
/*     */     
/* 659 */     this.defaultStockModel[9].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 3, 1, 0.0F, 0.0F, 0.5F, 0.05F, -1.0F, 0.5F, 0.05F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 660 */     this.defaultStockModel[9].setRotationPoint(-1.0F, -20.25F, 3.1F);
/*     */     
/* 662 */     this.defaultStockModel[10].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 4, 1, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F);
/* 663 */     this.defaultStockModel[10].setRotationPoint(-5.0F, -22.25F, 2.8F);
/*     */     
/* 665 */     this.defaultStockModel[11].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 2, 3, 0.0F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 666 */     this.defaultStockModel[11].setRotationPoint(-6.0F, -15.0F, 0.0F);
/*     */     
/* 668 */     this.defaultStockModel[12].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 3, 1, 0.0F, 0.0F, -1.0F, 0.05F, 0.0F, 0.5F, 0.05F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.05F, 0.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.05F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.05F);
/* 669 */     this.defaultStockModel[12].setRotationPoint(-8.0F, -20.25F, 3.1F);
/*     */     
/* 671 */     this.defaultStockModel[13].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 3, 1, 0.0F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -1.05F, 0.0F, -1.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -1.5F, -0.05F, 0.0F, -1.5F, -1.05F);
/* 672 */     this.defaultStockModel[13].setRotationPoint(-8.0F, -18.25F, 3.1F);
/*     */     
/* 674 */     this.defaultStockModel[14].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 2, 1, 0.0F, 0.0F, -5.15F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -5.3F, -0.15F, 0.0F, 3.3F, -0.4F, 0.0F, 0.75F, -0.4F, 0.0F, 0.75F, -0.15F, 0.0F, 3.3F, -0.15F);
/* 675 */     this.defaultStockModel[14].setRotationPoint(-13.0F, -24.15F, 1.45F);
/*     */     
/* 677 */     this.defaultStockModel[15].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 2, 1, 0.0F, 0.0F, -5.15F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -5.15F, 0.1F, 0.0F, 3.25F, -0.4F, 0.0F, 0.75F, -0.4F, 0.0F, 0.75F, 0.1F, 0.0F, 3.25F, 0.1F);
/* 678 */     this.defaultStockModel[15].setRotationPoint(-13.0F, -24.15F, 0.75F);
/*     */     
/* 680 */     this.defaultStockModel[16].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 2, 1, 0.0F, 0.0F, -5.3F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -5.15F, -0.15F, 0.0F, 3.3F, -0.4F, 0.0F, 0.75F, -0.4F, 0.0F, 0.75F, -0.15F, 0.0F, 3.3F, -0.15F);
/* 681 */     this.defaultStockModel[16].setRotationPoint(-13.0F, -24.15F, 0.3F);
/*     */     
/* 683 */     this.defaultStockModel[17].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 3, 3, 0.0F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 684 */     this.defaultStockModel[17].setRotationPoint(-1.0F, -20.25F, 0.15F);
/*     */     
/* 686 */     this.defaultStockModel[18].addShapeBox(-3.0F, 5.0F, -1.5F, 23, 10, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.35F, 0.15F, 0.0F, -5.5F, 0.15F, 0.0F, -5.5F, 0.15F, 0.0F, 0.35F, 0.15F);
/* 687 */     this.defaultStockModel[18].setRotationPoint(-29.0F, -18.5F, 1.0F);
/*     */     
/* 689 */     this.defaultStockModel[19].addShapeBox(-3.0F, 5.0F, -1.5F, 21, 5, 1, 0.0F, 0.0F, 0.2F, -0.15F, 0.0F, 0.2F, -0.15F, 0.0F, 0.2F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.6F, -0.15F, 0.0F, -4.75F, -0.15F, 0.0F, -4.75F, -0.35F, 0.0F, 0.6F, -0.35F);
/* 690 */     this.defaultStockModel[19].setRotationPoint(-29.0F, -13.75F, 2.0F);
/*     */     
/* 692 */     this.defaultStockModel[20].addShapeBox(-3.0F, 5.0F, -1.5F, 9, 4, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.775F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.525F, 0.15F);
/* 693 */     this.defaultStockModel[20].setRotationPoint(-15.0F, -18.5F, 2.0F);
/*     */     
/* 695 */     this.defaultStockModel[21].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 696 */     this.defaultStockModel[21].setRotationPoint(-29.0F, -20.1F, 1.45F);
/*     */     
/* 698 */     this.defaultStockModel[22].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 699 */     this.defaultStockModel[22].setRotationPoint(-29.0F, -20.1F, 0.75F);
/*     */     
/* 701 */     this.defaultStockModel[23].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 702 */     this.defaultStockModel[23].setRotationPoint(-29.0F, -20.1F, 0.3F);
/*     */     
/* 704 */     this.defaultStockModel[24].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.05F);
/* 705 */     this.defaultStockModel[24].setRotationPoint(-29.0F, -19.5F, 2.15F);
/*     */     
/* 707 */     this.defaultStockModel[25].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 708 */     this.defaultStockModel[25].setRotationPoint(-29.0F, -19.5F, -0.15F);
/*     */     
/* 710 */     this.defaultStockModel[26].addShapeBox(-3.0F, 5.0F, -1.5F, 14, 2, 1, 0.0F, 0.0F, 0.85F, 0.3F, 0.0F, 0.85F, 0.3F, 0.0F, 0.85F, 0.3F, 0.0F, 0.85F, 0.3F, 0.0F, -2.25F, 0.3F, 0.0F, -2.25F, 0.3F, 0.0F, -2.25F, 0.3F, 0.0F, -2.25F, 0.3F);
/* 711 */     this.defaultStockModel[26].setRotationPoint(-29.0F, -18.0F, 1.0F);
/*     */     
/* 713 */     this.defaultStockModel[27].addShapeBox(-3.0F, 5.0F, -1.5F, 10, 4, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.525F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.525F, 0.15F);
/* 714 */     this.defaultStockModel[27].setRotationPoint(-29.0F, -18.5F, 2.0F);
/*     */     
/* 716 */     this.defaultStockModel[28].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, 0.15F, 0.0F, 0.775F, 0.15F);
/* 717 */     this.defaultStockModel[28].setRotationPoint(-19.0F, -18.5F, 2.0F);
/*     */     
/* 719 */     this.defaultStockModel[29].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.775F, -0.15F);
/* 720 */     this.defaultStockModel[29].setRotationPoint(-19.0F, -16.5F, 2.0F);
/*     */     
/* 722 */     this.defaultStockModel[30].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, -2.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.7F, -2.0F, 0.775F, -0.7F);
/* 723 */     this.defaultStockModel[30].setRotationPoint(-21.0F, -16.0F, 3.0F);
/*     */     
/* 725 */     this.defaultStockModel[31].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, -2.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, -2.0F, -0.25F, -0.7F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.7F, 0.0F, 0.775F, -0.7F);
/* 726 */     this.defaultStockModel[31].setRotationPoint(-21.0F, -17.5F, 3.0F);
/*     */     
/* 728 */     this.defaultStockModel[32].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, 0.775F, -0.15F, -2.0F, 0.75F, -0.15F, -2.0F, 0.75F, -0.7F, 0.0F, 0.775F, -0.7F);
/* 729 */     this.defaultStockModel[32].setRotationPoint(-15.0F, -16.0F, 3.0F);
/*     */     
/* 731 */     this.defaultStockModel[33].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, -2.0F, -0.25F, -0.15F, -2.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.7F, 0.0F, 0.775F, -0.7F);
/* 732 */     this.defaultStockModel[33].setRotationPoint(-15.0F, -17.5F, 3.0F);
/*     */     
/* 734 */     this.defaultStockModel[34].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.7F);
/* 735 */     this.defaultStockModel[34].setRotationPoint(-19.0F, -17.5F, 3.0F);
/*     */     
/* 737 */     this.defaultStockModel[35].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.7F);
/* 738 */     this.defaultStockModel[35].setRotationPoint(-19.0F, -15.0F, 3.0F);
/*     */     
/* 740 */     this.defaultStockModel[36].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 3, 1, 0.0F, -0.5F, -0.75F, 0.35F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, -0.225F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, -0.5F, -0.225F, -0.7F);
/* 741 */     this.defaultStockModel[36].setRotationPoint(-17.75F, -17.5F, 3.0F);
/*     */     
/* 743 */     this.defaultStockModel[37].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 3.0F, -1.5F, 0.0F);
/* 744 */     this.defaultStockModel[37].setRotationPoint(-5.0F, -19.25F, -1.05F);
/*     */     
/* 746 */     this.defaultStockModel[38].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 747 */     this.defaultStockModel[38].setRotationPoint(-5.0F, -18.25F, -1.05F);
/*     */     
/* 749 */     this.defaultStockModel[39].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 2, 1, 0.0F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, -0.8F, 0.0F, 0.25F, -0.8F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 750 */     this.defaultStockModel[39].setRotationPoint(-6.0F, -17.5F, -1.0F);
/*     */     
/* 752 */     this.defaultStockModel[40].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 753 */     this.defaultStockModel[40].setRotationPoint(-5.0F, -20.25F, -1.05F);
/*     */     
/* 755 */     this.defaultStockModel[41].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 3, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.45F, 0.0F);
/* 756 */     this.defaultStockModel[41].setRotationPoint(-8.0F, -18.25F, -1.05F);
/*     */     
/* 758 */     this.defaultStockModel[42].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 3, 1, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 759 */     this.defaultStockModel[42].setRotationPoint(-8.0F, -20.25F, -1.05F);
/*     */     
/* 761 */     this.defaultStockModel[43].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, -5.3F, 0.0F, 0.0F, -1.2F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -4.7F, -0.15F, 0.0F, 4.3F, 0.0F, 0.0F, 4.3F, 0.0F, 0.0F, 4.3F, -0.15F, 0.0F, 4.3F, -0.15F);
/* 762 */     this.defaultStockModel[43].setRotationPoint(-13.0F, -23.55F, -0.15F);
/*     */     
/* 764 */     this.defaultStockModel[44].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, -4.7F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.25F, 0.0F, -5.2F, -0.1F, 0.0F, 4.3F, -0.15F, 0.0F, 4.3F, -0.15F, 0.0F, 4.3F, 0.0F, 0.0F, 4.3F, 0.0F);
/* 765 */     this.defaultStockModel[44].setRotationPoint(-13.0F, -23.55F, 2.15F);
/*     */     
/* 767 */     this.defaultStockModel[45].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 3, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 768 */     this.defaultStockModel[45].setRotationPoint(-1.0F, -20.25F, -1.05F);
/*     */     
/* 770 */     this.defaultStockModel[46].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 4, 1, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F);
/* 771 */     this.defaultStockModel[46].setRotationPoint(-5.0F, -22.25F, -0.1F);
/*     */     
/* 773 */     this.defaultStockModel[47].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 774 */     this.defaultStockModel[47].setRotationPoint(-8.0F, -14.0F, 0.15F);
/*     */     
/* 776 */     this.defaultStockModel[48].addShapeBox(-3.0F, 5.0F, -1.5F, 23, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 777 */     this.defaultStockModel[48].setRotationPoint(-29.0F, -18.25F, -0.15F);
/*     */     
/* 779 */     this.defaultStockModel[49].addShapeBox(-3.0F, 5.0F, -1.5F, 21, 5, 1, 0.0F, 0.0F, 0.25F, 0.05F, 0.0F, 0.25F, 0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.6F, -0.35F, 0.0F, -4.75F, -0.35F, 0.0F, -4.75F, 0.0F, 0.0F, 0.6F, 0.0F);
/* 780 */     this.defaultStockModel[49].setRotationPoint(-29.0F, -13.75F, -0.1F);
/*     */     
/*     */ 
/* 783 */     this.ammoModel = new ModelRendererTurbo[5];
/* 784 */     this.ammoModel[0] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/* 785 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 786 */     this.ammoModel[2] = new ModelRendererTurbo(this, 17, 65, this.textureX, this.textureY);
/* 787 */     this.ammoModel[3] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/* 788 */     this.ammoModel[4] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/*     */     
/* 790 */     this.ammoModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 3, 3, 0.0F, 0.35F, 0.75F, -0.1F, -0.275F, 0.75F, -0.1F, -0.275F, 0.75F, -0.1F, 0.35F, 0.75F, -0.1F, -0.35F, 0.5F, -0.1F, 0.425F, 0.5F, -0.1F, 0.425F, 0.5F, -0.1F, -0.35F, 0.5F, -0.1F);
/* 791 */     this.ammoModel[0].setRotationPoint(17.5F, -12.0F, 0.0F);
/*     */     
/* 793 */     this.ammoModel[1].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 2, 3, 0.0F, 0.35F, 1.25F, -0.1F, -0.275F, 1.25F, -0.1F, -0.275F, 1.25F, -0.1F, 0.35F, 1.25F, -0.1F, -0.55F, 0.0F, -0.1F, 0.725F, 0.0F, -0.1F, 0.725F, 0.0F, -0.1F, -0.55F, 0.0F, -0.1F);
/* 794 */     this.ammoModel[1].setRotationPoint(18.2F, -7.25F, 0.0F);
/*     */     
/* 796 */     this.ammoModel[2].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 2, 3, 0.0F, 0.35F, 0.75F, -0.1F, -0.175F, 0.75F, -0.1F, -0.175F, 0.75F, -0.1F, 0.35F, 0.75F, -0.1F, -0.85F, 0.0F, -0.1F, 0.975F, 0.0F, -0.1F, 0.975F, 0.0F, -0.1F, -0.85F, 0.0F, -0.1F);
/* 797 */     this.ammoModel[2].setRotationPoint(19.1F, -4.5F, 0.0F);
/*     */     
/* 799 */     this.ammoModel[3].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 2, 3, 0.0F, 0.55F, 0.75F, -0.1F, -0.075F, 0.75F, -0.1F, -0.075F, 0.75F, -0.1F, 0.55F, 0.75F, -0.1F, -0.5F, -1.25F, -0.1F, -3.525F, -1.25F, -0.1F, -3.525F, -1.25F, -0.1F, -0.5F, -1.25F, -0.1F);
/* 800 */     this.ammoModel[3].setRotationPoint(22.0F, 1.0F, 0.0F);
/*     */     
/* 802 */     this.ammoModel[4].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 2, 3, 0.0F, 0.45F, 0.75F, -0.1F, -0.325F, 0.75F, -0.1F, -0.325F, 0.75F, -0.1F, 0.45F, 0.75F, -0.1F, -1.05F, 0.0F, -0.1F, 1.525F, 0.0F, -0.1F, 1.525F, 0.0F, -0.1F, -1.05F, 0.0F, -0.1F);
/* 803 */     this.ammoModel[4].setRotationPoint(20.4F, -1.75F, 0.0F);
/*     */     
/*     */ 
/* 806 */     this.slideModel = new ModelRendererTurbo[4];
/* 807 */     this.slideModel[0] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/* 808 */     this.slideModel[1] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 809 */     this.slideModel[2] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 810 */     this.slideModel[3] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*     */     
/* 812 */     this.slideModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, 0.45F, 0.0F, -0.4F, 0.45F);
/* 813 */     this.slideModel[0].setRotationPoint(14.0F, -20.35F, 0.85F);
/*     */     
/* 815 */     this.slideModel[1].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.0F, -0.35F, 0.0F, -1.0F, -0.35F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 816 */     this.slideModel[1].setRotationPoint(14.0F, -20.5F, -0.2F);
/*     */     
/* 818 */     this.slideModel[2].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.45F, 0.0F, -0.25F, 0.45F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 819 */     this.slideModel[2].setRotationPoint(14.0F, -19.25F, -0.15F);
/*     */     
/* 821 */     this.slideModel[3].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.85F, 0.0F, 0.25F, 0.85F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.85F, 0.0F, -0.25F, 0.85F);
/* 822 */     this.slideModel[3].setRotationPoint(14.0F, -21.35F, 0.85F);
/*     */     
/*     */ 
/*     */ 
/* 826 */     translateAll(0.0F, -7.0F, 0.0F);
/* 827 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.13F, 0.0F);
/*     */     
/*     */ 
/* 830 */     this.gunSlideDistance = 0.0F;
/* 831 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 834 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmp5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */