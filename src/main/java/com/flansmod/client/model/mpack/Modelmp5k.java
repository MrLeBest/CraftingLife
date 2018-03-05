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
/*     */ public class Modelmp5k
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelmp5k()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[''];
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
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 41, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*     */     
/* 177 */     this.gunModel[0].addShapeBox(-5.0F, 7.0F, -1.5F, 13, 4, 3, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 178 */     this.gunModel[0].setRotationPoint(2.0F, -15.0F, 0.0F);
/*     */     
/* 180 */     this.gunModel[1].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 3, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 181 */     this.gunModel[1].setRotationPoint(0.0F, -13.75F, 0.0F);
/*     */     
/* 183 */     this.gunModel[2].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 184 */     this.gunModel[2].setRotationPoint(-1.0F, -13.75F, 0.0F);
/*     */     
/* 186 */     this.gunModel[3].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 187 */     this.gunModel[3].setRotationPoint(-2.0F, -13.75F, 0.0F);
/*     */     
/* 189 */     this.gunModel[4].addShapeBox(-5.0F, 7.0F, -1.5F, 6, 7, 1, 0.0F, -2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 190 */     this.gunModel[4].setRotationPoint(-1.0F, -10.0F, 1.0F);
/*     */     
/* 192 */     this.gunModel[5].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 7, 1, 0.0F, -1.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, -0.5F, -1.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.5F, 0.0F);
/* 193 */     this.gunModel[5].setRotationPoint(2.0F, -10.0F, 2.0F);
/*     */     
/* 195 */     this.gunModel[6].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 7, 1, 0.0F, -1.5F, 1.0F, 0.0F, 2.5F, 1.0F, -0.5F, 2.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 196 */     this.gunModel[6].setRotationPoint(2.0F, -10.0F, 0.0F);
/*     */     
/* 198 */     this.gunModel[7].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 7, 1, 0.0F, -2.5F, 1.0F, -0.5F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 199 */     this.gunModel[7].setRotationPoint(-1.0F, -10.0F, 0.0F);
/*     */     
/* 201 */     this.gunModel[8].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 7, 1, 0.0F, -2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.25F, -0.5F);
/* 202 */     this.gunModel[8].setRotationPoint(-1.0F, -10.0F, 2.0F);
/*     */     
/* 204 */     this.gunModel[9].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 205 */     this.gunModel[9].setRotationPoint(13.0F, -11.0F, 0.5F);
/*     */     
/* 207 */     this.gunModel[10].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 208 */     this.gunModel[10].setRotationPoint(12.75F, -10.0F, 0.5F);
/*     */     
/* 210 */     this.gunModel[11].addShapeBox(-5.0F, 7.0F, -1.5F, 5, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 211 */     this.gunModel[11].setRotationPoint(8.25F, -8.0F, 0.5F);
/*     */     
/* 213 */     this.gunModel[12].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 2, 0.0F, -1.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -1.5F, 0.0F);
/* 214 */     this.gunModel[12].setRotationPoint(6.25F, -8.0F, 0.5F);
/*     */     
/* 216 */     this.gunModel[13].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 217 */     this.gunModel[13].setRotationPoint(6.25F, -9.0F, 0.5F);
/*     */     
/* 219 */     this.gunModel[14].addShapeBox(-5.0F, 7.0F, -1.5F, 17, 1, 3, 0.0F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 220 */     this.gunModel[14].setRotationPoint(-2.0F, -16.5F, 0.0F);
/*     */     
/* 222 */     this.gunModel[15].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 223 */     this.gunModel[15].setRotationPoint(15.0F, -15.0F, 0.0F);
/*     */     
/* 225 */     this.gunModel[16].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 226 */     this.gunModel[16].setRotationPoint(15.0F, -12.0F, 0.0F);
/*     */     
/* 228 */     this.gunModel[17].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 229 */     this.gunModel[17].setRotationPoint(15.0F, -12.5F, 0.0F);
/*     */     
/* 231 */     this.gunModel[18].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 232 */     this.gunModel[18].setRotationPoint(15.75F, -12.0F, 0.0F);
/*     */     
/* 234 */     this.gunModel[19].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, -0.75F, 0.0F, -1.75F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 235 */     this.gunModel[19].setRotationPoint(15.75F, -12.75F, 0.0F);
/*     */     
/* 237 */     this.gunModel[20].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.6F, 0.0F, -1.85F, -0.6F, 0.0F, -1.85F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -1.85F, -0.4F, 0.0F, -1.85F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 238 */     this.gunModel[20].setRotationPoint(16.0F, -12.25F, 0.0F);
/*     */     
/* 240 */     this.gunModel[21].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.75F, 0.0F, -1.85F, -1.1F, 0.0F, -1.85F, -1.1F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, 0.0F, -1.85F, 0.1F, 0.0F, -1.85F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F);
/* 241 */     this.gunModel[21].setRotationPoint(16.0F, -12.75F, 0.0F);
/*     */     
/* 243 */     this.gunModel[22].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 2, 3, 0.0F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F);
/* 244 */     this.gunModel[22].setRotationPoint(15.0F, -16.5F, 0.0F);
/*     */     
/* 246 */     this.gunModel[23].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 2, 3, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, -0.75F, 1.5F, -0.25F, -0.75F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F);
/* 247 */     this.gunModel[23].setRotationPoint(15.0F, -14.5F, 0.0F);
/*     */     
/* 249 */     this.gunModel[24].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 250 */     this.gunModel[24].setRotationPoint(15.5F, -13.45F, 0.0F);
/*     */     
/* 252 */     this.gunModel[25].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 4, 3, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 253 */     this.gunModel[25].setRotationPoint(17.5F, -15.0F, 0.0F);
/*     */     
/* 255 */     this.gunModel[26].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 256 */     this.gunModel[26].setRotationPoint(21.5F, -15.0F, 0.0F);
/*     */     
/* 258 */     this.gunModel[27].addShapeBox(-5.0F, 7.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 259 */     this.gunModel[27].setRotationPoint(-2.0F, -16.75F, 2.15F);
/*     */     
/* 261 */     this.gunModel[28].addShapeBox(-5.0F, 7.0F, -1.5F, 20, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 262 */     this.gunModel[28].setRotationPoint(-2.0F, -18.75F, 2.15F);
/*     */     
/* 264 */     this.gunModel[29].addShapeBox(-5.0F, 7.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F);
/* 265 */     this.gunModel[29].setRotationPoint(-2.0F, -19.25F, 2.15F);
/*     */     
/* 267 */     this.gunModel[30].addShapeBox(-5.0F, 7.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, -0.65F, -0.2F, 0.0F, -0.65F, -0.2F, 0.0F, -1.0F, -0.15F, 0.0F, -1.0F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 268 */     this.gunModel[30].setRotationPoint(-2.0F, -20.5F, 2.15F);
/*     */     
/* 270 */     this.gunModel[31].addShapeBox(-5.0F, 7.0F, -1.5F, 5, 2, 4, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.65F, 0.0F, -0.5F, 0.65F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, 0.65F, 0.0F, -0.25F, 0.65F);
/* 271 */     this.gunModel[31].setRotationPoint(18.0F, -18.75F, -0.85F);
/*     */     
/* 273 */     this.gunModel[32].addShapeBox(-5.0F, 7.0F, -1.5F, 25, 1, 2, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 274 */     this.gunModel[32].setRotationPoint(-2.0F, -20.75F, 0.5F);
/*     */     
/* 276 */     this.gunModel[33].addShapeBox(-5.0F, 7.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 277 */     this.gunModel[33].setRotationPoint(-2.0F, -16.75F, -0.15F);
/*     */     
/* 279 */     this.gunModel[34].addShapeBox(-5.0F, 7.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 280 */     this.gunModel[34].setRotationPoint(-2.0F, -19.25F, -0.15F);
/*     */     
/* 282 */     this.gunModel[35].addShapeBox(-5.0F, 7.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 283 */     this.gunModel[35].setRotationPoint(-2.0F, -20.5F, -0.2F);
/*     */     
/* 285 */     this.gunModel[36].addShapeBox(-5.0F, 7.0F, -1.5F, 25, 2, 1, 0.0F, 0.0F, -0.5F, -0.05F, 0.02F, -0.5F, -0.05F, 0.02F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.05F, 0.02F, -0.25F, -0.05F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 286 */     this.gunModel[36].setRotationPoint(-2.0F, -20.0F, 0.8F);
/*     */     
/* 288 */     this.gunModel[37].addShapeBox(-5.0F, 7.0F, -1.5F, 25, 2, 1, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 289 */     this.gunModel[37].setRotationPoint(-2.0F, -17.5F, 0.8F);
/*     */     
/* 291 */     this.gunModel[38].addShapeBox(-5.0F, 7.0F, -1.5F, 20, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.3F, 0.0F, -0.5F, 1.3F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.3F, 0.0F, -0.25F, 1.3F);
/* 292 */     this.gunModel[38].setRotationPoint(-2.0F, -18.75F, -0.15F);
/*     */     
/* 294 */     this.gunModel[39].addShapeBox(-5.0F, 7.0F, -1.5F, 22, 1, 4, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 295 */     this.gunModel[39].setRotationPoint(4.0F, -21.95F, -0.85F);
/*     */     
/* 297 */     this.gunModel[40].addShapeBox(-5.0F, 7.0F, -1.5F, 22, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 298 */     this.gunModel[40].setRotationPoint(4.0F, -23.05F, 2.15F);
/*     */     
/* 300 */     this.gunModel[41].addShapeBox(-5.0F, 7.0F, -1.5F, 29, 1, 1, 0.0F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 301 */     this.gunModel[41].setRotationPoint(4.0F, -23.05F, -0.15F);
/*     */     
/* 303 */     this.gunModel[42].addShapeBox(-5.0F, 7.0F, -1.5F, 30, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 304 */     this.gunModel[42].setRotationPoint(3.0F, -23.05F, 0.85F);
/*     */     
/* 306 */     this.gunModel[43].addShapeBox(-5.0F, 7.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 307 */     this.gunModel[43].setRotationPoint(-2.0F, -21.35F, 0.85F);
/*     */     
/* 309 */     this.gunModel[44].addShapeBox(-5.0F, 7.0F, -1.5F, 30, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 310 */     this.gunModel[44].setRotationPoint(4.0F, -23.65F, 0.3F);
/*     */     
/* 312 */     this.gunModel[45].addShapeBox(-5.0F, 7.0F, -1.5F, 31, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 313 */     this.gunModel[45].setRotationPoint(3.0F, -23.65F, 1.45F);
/*     */     
/* 315 */     this.gunModel[46].addShapeBox(-5.0F, 7.0F, -1.5F, 30, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 316 */     this.gunModel[46].setRotationPoint(4.0F, -23.65F, 0.75F);
/*     */     
/* 318 */     this.gunModel[47].addShapeBox(-5.0F, 7.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 319 */     this.gunModel[47].setRotationPoint(-2.0F, -21.25F, -0.15F);
/*     */     
/* 321 */     this.gunModel[48].addShapeBox(-5.0F, 7.0F, -1.5F, 35, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.15F, 0.0F, -0.35F, -0.15F);
/* 322 */     this.gunModel[48].setRotationPoint(-2.0F, -21.25F, 1.9F);
/*     */     
/* 324 */     this.gunModel[49].addShapeBox(-5.0F, 7.0F, -1.5F, 35, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 325 */     this.gunModel[49].setRotationPoint(-2.0F, -21.25F, 0.85F);
/*     */     
/* 327 */     this.gunModel[50].addShapeBox(-5.0F, 7.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 328 */     this.gunModel[50].setRotationPoint(18.0F, -21.35F, 0.85F);
/*     */     
/* 330 */     this.gunModel[51].addShapeBox(-5.0F, 7.0F, -1.5F, 10, 1, 3, 0.0F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 331 */     this.gunModel[51].setRotationPoint(23.0F, -20.95F, -0.85F);
/*     */     
/* 333 */     this.gunModel[52].addShapeBox(-5.0F, 7.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 334 */     this.gunModel[52].setRotationPoint(4.0F, -23.8F, 0.75F);
/*     */     
/* 336 */     this.gunModel[53].addShapeBox(-5.0F, 7.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 337 */     this.gunModel[53].setRotationPoint(14.0F, -23.8F, 0.75F);
/*     */     
/* 339 */     this.gunModel[54].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, 0.1F, 0.0F, -0.95F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 340 */     this.gunModel[54].setRotationPoint(12.5F, -23.8F, 0.75F);
/*     */     
/* 342 */     this.gunModel[55].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.85F, -0.4F, 0.0F, -0.85F, -0.4F, 0.0F, -0.85F, 0.1F, -0.75F, -0.85F, 0.1F, -0.75F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F);
/* 343 */     this.gunModel[55].setRotationPoint(11.5F, -23.8F, 0.75F);
/*     */     
/* 345 */     this.gunModel[56].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.85F, -0.4F, 0.0F, -0.85F, -0.4F, 0.0F, -0.85F, 0.1F, -0.75F, -0.85F, 0.1F, -0.75F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F);
/* 346 */     this.gunModel[56].setRotationPoint(12.75F, -23.8F, 0.75F);
/*     */     
/* 348 */     this.gunModel[57].addShapeBox(-5.0F, 7.0F, -1.5F, 15, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 349 */     this.gunModel[57].setRotationPoint(18.0F, -21.25F, -0.15F);
/*     */     
/* 351 */     this.gunModel[58].addShapeBox(-5.0F, 7.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 352 */     this.gunModel[58].setRotationPoint(18.0F, -20.5F, -0.2F);
/*     */     
/* 354 */     this.gunModel[59].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 355 */     this.gunModel[59].setRotationPoint(14.0F, -21.35F, 0.85F);
/*     */     
/* 357 */     this.gunModel[60].addShapeBox(-5.0F, 7.0F, -1.5F, 13, 2, 1, 0.0F, 0.0F, -0.25F, 0.2F, 0.02F, -0.25F, 0.2F, 0.02F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F, 0.0F, 0.0F, 0.2F, 0.02F, 0.0F, 0.2F, 0.02F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F);
/* 358 */     this.gunModel[60].setRotationPoint(23.0F, -18.75F, 0.8F);
/*     */     
/* 360 */     this.gunModel[61].addShapeBox(-5.0F, 7.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 361 */     this.gunModel[61].setRotationPoint(18.0F, -19.25F, -0.15F);
/*     */     
/* 363 */     this.gunModel[62].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 364 */     this.gunModel[62].setRotationPoint(14.0F, -19.25F, -0.15F);
/*     */     
/* 366 */     this.gunModel[63].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 367 */     this.gunModel[63].setRotationPoint(14.0F, -19.5F, -0.2F);
/*     */     
/* 369 */     this.gunModel[64].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 1.05F, 0.0F, -0.75F, 1.05F);
/* 370 */     this.gunModel[64].setRotationPoint(14.0F, -21.35F, 0.85F);
/*     */     
/* 372 */     this.gunModel[65].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 373 */     this.gunModel[65].setRotationPoint(32.0F, -20.95F, 0.15F);
/*     */     
/* 375 */     this.gunModel[66].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 376 */     this.gunModel[66].setRotationPoint(23.0F, -20.95F, 0.15F);
/*     */     
/* 378 */     this.gunModel[67].addShapeBox(-5.0F, 7.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 379 */     this.gunModel[67].setRotationPoint(28.0F, -23.05F, 2.15F);
/*     */     
/* 381 */     this.gunModel[68].addShapeBox(-5.0F, 7.0F, -1.5F, 5, 1, 4, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 382 */     this.gunModel[68].setRotationPoint(28.0F, -21.95F, -0.85F);
/*     */     
/* 384 */     this.gunModel[69].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, 0.35F, 0.0F, -0.65F, 0.35F);
/* 385 */     this.gunModel[69].setRotationPoint(26.0F, -21.95F, -0.85F);
/*     */     
/* 387 */     this.gunModel[70].addShapeBox(-5.0F, 7.0F, -1.5F, 7, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.65F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F);
/* 388 */     this.gunModel[70].setRotationPoint(26.0F, -20.95F, 0.15F);
/*     */     
/* 390 */     this.gunModel[71].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.65F, -1.6F, -0.6F, 0.65F, -1.6F, -0.1F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, -0.6F, -0.65F, -1.6F, -0.1F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 391 */     this.gunModel[71].setRotationPoint(32.35F, -20.9F, 0.3F);
/* 392 */     this.gunModel[71].rotateAngleX = 0.13962634F;
/*     */     
/* 394 */     this.gunModel[72].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, -0.5F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, -0.25F, 0.65F, -0.4F, -0.5F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, -0.25F, -0.65F, -0.4F);
/* 395 */     this.gunModel[72].setRotationPoint(31.35F, -20.9F, 0.3F);
/* 396 */     this.gunModel[72].rotateAngleX = 0.13962634F;
/*     */     
/* 398 */     this.gunModel[73].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, -0.25F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, -0.75F, 0.65F, -0.4F, -0.25F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F);
/* 399 */     this.gunModel[73].setRotationPoint(31.35F, -21.04F, 1.3F);
/* 400 */     this.gunModel[73].rotateAngleX = 0.13962634F;
/*     */     
/* 402 */     this.gunModel[74].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.5F, -0.55F, 0.02F, 0.5F, -0.55F, 0.02F, 0.5F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.25F, -0.55F, 0.02F, 0.25F, -0.55F, 0.02F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 403 */     this.gunModel[74].setRotationPoint(34.0F, -20.0F, 0.3F);
/*     */     
/* 405 */     this.gunModel[75].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.8F, 0.02F, 0.0F, -0.8F, 0.02F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.8F, 0.02F, -0.5F, -0.8F, 0.02F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F);
/* 406 */     this.gunModel[75].setRotationPoint(34.0F, -21.75F, -0.2F);
/*     */     
/* 408 */     this.gunModel[76].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.65F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.4F);
/* 409 */     this.gunModel[76].setRotationPoint(33.0F, -23.05F, 2.15F);
/*     */     
/* 411 */     this.gunModel[77].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 412 */     this.gunModel[77].setRotationPoint(33.0F, -23.05F, 0.85F);
/*     */     
/* 414 */     this.gunModel[78].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.4F);
/* 415 */     this.gunModel[78].setRotationPoint(33.0F, -20.95F, 0.15F);
/*     */     
/* 417 */     this.gunModel[79].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -1.35F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 418 */     this.gunModel[79].setRotationPoint(33.0F, -20.95F, -0.85F);
/*     */     
/* 420 */     this.gunModel[80].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 421 */     this.gunModel[80].setRotationPoint(33.0F, -23.25F, 0.85F);
/*     */     
/* 423 */     this.gunModel[81].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.15F);
/* 424 */     this.gunModel[81].setRotationPoint(33.0F, -21.25F, 1.9F);
/*     */     
/* 426 */     this.gunModel[82].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 427 */     this.gunModel[82].setRotationPoint(33.0F, -21.25F, -0.15F);
/*     */     
/* 429 */     this.gunModel[83].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 430 */     this.gunModel[83].setRotationPoint(33.0F, -23.05F, -0.15F);
/*     */     
/* 432 */     this.gunModel[84].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.35F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 433 */     this.gunModel[84].setRotationPoint(33.0F, -21.95F, -0.85F);
/*     */     
/* 435 */     this.gunModel[85].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.65F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.4F);
/* 436 */     this.gunModel[85].setRotationPoint(33.0F, -21.95F, 1.15F);
/*     */     
/* 438 */     this.gunModel[86].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 439 */     this.gunModel[86].setRotationPoint(34.0F, -23.5F, 1.0F);
/*     */     
/* 441 */     this.gunModel[87].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.6F, 0.02F, -0.75F, -0.6F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.02F, -0.25F, -0.6F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 442 */     this.gunModel[87].setRotationPoint(34.0F, -22.5F, 0.0F);
/*     */     
/* 444 */     this.gunModel[88].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F);
/* 445 */     this.gunModel[88].setRotationPoint(34.0F, -22.5F, 2.0F);
/*     */     
/* 447 */     this.gunModel[89].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, 0.02F, 0.0F, -0.6F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.6F, 0.02F, -1.0F, -0.6F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 448 */     this.gunModel[89].setRotationPoint(34.0F, -21.25F, 0.0F);
/*     */     
/* 450 */     this.gunModel[90].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.02F, 0.0F, -0.5F, 0.02F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.25F, -0.5F, 0.02F, -0.25F, -0.5F, 0.02F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F);
/* 451 */     this.gunModel[90].setRotationPoint(34.0F, -21.25F, 1.5F);
/*     */     
/* 453 */     this.gunModel[91].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 454 */     this.gunModel[91].setRotationPoint(34.0F, -21.25F, 1.0F);
/*     */     
/* 456 */     this.gunModel[92].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 457 */     this.gunModel[92].setRotationPoint(34.0F, -17.0F, 1.0F);
/*     */     
/* 459 */     this.gunModel[93].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F);
/* 460 */     this.gunModel[93].setRotationPoint(34.0F, -17.0F, 2.0F);
/*     */     
/* 462 */     this.gunModel[94].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.3F, 0.02F, 0.0F, -0.3F, 0.02F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.3F, 0.02F, 0.0F, -0.3F, 0.02F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 463 */     this.gunModel[94].setRotationPoint(34.0F, -18.0F, -0.2F);
/*     */     
/* 465 */     this.gunModel[95].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, -0.75F, -0.1F, 0.0F, -0.75F, -0.1F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.1F, 0.0F, -0.25F, -0.1F);
/* 466 */     this.gunModel[95].setRotationPoint(34.0F, -18.75F, 2.0F);
/*     */     
/* 468 */     this.gunModel[96].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.02F, -1.0F, 0.0F, 0.02F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 469 */     this.gunModel[96].setRotationPoint(34.0F, -19.75F, 1.0F);
/*     */     
/* 471 */     this.gunModel[97].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.1F, 0.02F, -0.75F, -0.1F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.1F, 0.02F, -0.25F, -0.1F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 472 */     this.gunModel[97].setRotationPoint(34.0F, -18.75F, 0.0F);
/*     */     
/* 474 */     this.gunModel[98].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.02F, 0.0F, -0.1F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.1F, 0.02F, -1.0F, -0.1F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 475 */     this.gunModel[98].setRotationPoint(34.0F, -17.0F, 0.0F);
/*     */     
/* 477 */     this.gunModel[99].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 478 */     this.gunModel[99].setRotationPoint(34.0F, -24.0F, 1.38F);
/*     */     
/* 480 */     this.gunModel[100].addShapeBox(-5.0F, 7.0F, -1.5F, 11, 1, 2, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F);
/* 481 */     this.gunModel[100].setRotationPoint(23.0F, -16.75F, 0.5F);
/*     */     
/* 483 */     this.gunModel[101].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 1.0F, 0.5F, -1.0F, 1.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 1.0F, -0.65F, -1.0F, 1.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 484 */     this.gunModel[101].setRotationPoint(-1.0F, -21.95F, -0.85F);
/*     */     
/* 486 */     this.gunModel[102].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 1.0F, -0.25F, -1.0F, 1.0F, -0.25F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 1.0F, -0.65F, -1.0F, 1.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 487 */     this.gunModel[102].setRotationPoint(1.0F, -22.8F, -0.85F);
/*     */     
/* 489 */     this.gunModel[103].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 490 */     this.gunModel[103].setRotationPoint(-1.0F, -22.8F, -0.85F);
/*     */     
/* 492 */     this.gunModel[104].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, 0.0F, -0.9F, -0.55F);
/* 493 */     this.gunModel[104].setRotationPoint(-1.0F, -23.4F, 1.37F);
/*     */     
/* 495 */     this.gunModel[105].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 2, 0.0F, -1.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -1.25F, 0.25F, -0.55F, -0.5F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, -0.5F, -0.9F, -0.55F);
/* 496 */     this.gunModel[105].setRotationPoint(-1.0F, -23.75F, 1.37F);
/*     */     
/* 498 */     this.gunModel[106].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, 0.0F, -0.9F, -0.55F);
/* 499 */     this.gunModel[106].setRotationPoint(-1.0F, -23.4F, -0.85F);
/*     */     
/* 501 */     this.gunModel[107].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 2, 0.0F, -1.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -1.25F, 0.25F, -0.55F, -0.5F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, -0.5F, -0.9F, -0.55F);
/* 502 */     this.gunModel[107].setRotationPoint(-1.0F, -23.75F, -0.85F);
/*     */     
/* 504 */     this.gunModel[108].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.65F, -1.05F, 0.0F, -0.65F, -1.05F, 0.0F, -0.65F, -0.35F, 0.0F, -0.65F, -0.35F);
/* 505 */     this.gunModel[108].setRotationPoint(-2.0F, -21.95F, -0.85F);
/*     */     
/* 507 */     this.gunModel[109].addBox(-5.0F, 7.0F, -1.5F, 2, 1, 2, 0.0F);
/* 508 */     this.gunModel[109].setRotationPoint(1.5F, -23.5F, 0.5F);
/*     */     
/* 510 */     this.gunModel[110].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 511 */     this.gunModel[110].setRotationPoint(1.5F, -24.5F, 0.5F);
/*     */     
/* 513 */     this.gunModel[111].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 514 */     this.gunModel[111].setRotationPoint(1.5F, -24.5F, 2.0F);
/*     */     
/* 516 */     this.gunModel[112].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 2, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 517 */     this.gunModel[112].setRotationPoint(16.5F, -11.75F, 0.5F);
/* 518 */     this.gunModel[112].rotateAngleZ = -0.12217305F;
/*     */     
/* 520 */     this.gunModel[113].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 521 */     this.gunModel[113].setRotationPoint(8.5F, -11.0F, 1.0F);
/*     */     
/* 523 */     this.gunModel[114].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 524 */     this.gunModel[114].setRotationPoint(34.0F, -23.75F, 2.0F);
/*     */     
/* 526 */     this.gunModel[115].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -2.0F, 0.0F, -0.15F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.55F, 0.0F, 0.0F, -1.55F);
/* 527 */     this.gunModel[115].setRotationPoint(34.0F, -24.6F, 2.0F);
/*     */     
/* 529 */     this.gunModel[116].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 530 */     this.gunModel[116].setRotationPoint(34.0F, -24.45F, 1.0F);
/*     */     
/* 532 */     this.gunModel[117].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 533 */     this.gunModel[117].setRotationPoint(34.0F, -23.75F, -1.0F);
/*     */     
/* 535 */     this.gunModel[118].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F);
/* 536 */     this.gunModel[118].setRotationPoint(34.0F, -24.45F, -1.0F);
/*     */     
/* 538 */     this.gunModel[119].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 539 */     this.gunModel[119].setRotationPoint(34.0F, -24.7F, 1.0F);
/*     */     
/* 541 */     this.gunModel[120].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 542 */     this.gunModel[120].setRotationPoint(34.0F, -24.7F, 0.5F);
/*     */     
/* 544 */     this.gunModel[121].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 545 */     this.gunModel[121].setRotationPoint(-2.0F, -18.75F, -1.5F);
/*     */     
/* 547 */     this.gunModel[122].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 2, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 548 */     this.gunModel[122].setRotationPoint(-2.0F, -18.75F, 2.4F);
/*     */     
/* 550 */     this.gunModel[123].addShapeBox(-5.0F, 7.0F, -1.5F, 11, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 551 */     this.gunModel[123].setRotationPoint(23.0F, -16.75F, 2.15F);
/*     */     
/* 553 */     this.gunModel[124].addShapeBox(-5.0F, 7.0F, -1.5F, 10, 2, 4, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.65F, 0.0F, -0.5F, 0.65F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, 0.65F, 0.0F, -0.25F, 0.65F);
/* 554 */     this.gunModel[124].setRotationPoint(23.0F, -18.75F, -0.85F);
/*     */     
/* 556 */     this.gunModel[125].addShapeBox(-5.0F, 7.0F, -1.5F, 9, 2, 4, 0.0F, 0.0F, 0.5F, -1.05F, 0.0F, 0.5F, -1.05F, 0.0F, 0.5F, -0.35F, 0.0F, 0.5F, -0.35F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, 0.65F, 0.0F, -0.25F, 0.65F);
/* 557 */     this.gunModel[125].setRotationPoint(23.0F, -20.0F, -0.85F);
/*     */     
/* 559 */     this.gunModel[126].addShapeBox(-5.0F, 7.0F, -1.5F, 11, 1, 1, 0.0F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 560 */     this.gunModel[126].setRotationPoint(23.0F, -16.75F, -0.15F);
/*     */     
/* 562 */     this.gunModel[127].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 3, 1, 0.0F, 0.0F, -0.25F, 0.2F, 0.02F, -0.25F, 0.2F, 0.02F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F, 0.0F, 0.0F, 0.2F, 0.02F, 0.0F, 0.2F, 0.02F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F);
/* 563 */     this.gunModel[127].setRotationPoint(30.0F, -21.5F, 0.8F);
/*     */     
/* 565 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 566 */     this.gunModel[''].setRotationPoint(29.5F, -15.75F, 0.75F);
/*     */     
/* 568 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 569 */     this.gunModel[''].setRotationPoint(26.25F, -15.75F, 0.75F);
/*     */     
/* 571 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 572 */     this.gunModel[''].setRotationPoint(27.0F, -15.75F, 0.75F);
/*     */     
/* 574 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 5, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 575 */     this.gunModel[''].setRotationPoint(27.0F, -15.75F, -0.25F);
/*     */     
/* 577 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/* 578 */     this.gunModel[''].setRotationPoint(27.0F, -15.75F, 1.75F);
/*     */     
/* 580 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 581 */     this.gunModel[''].setRotationPoint(27.0F, -8.75F, 0.75F);
/*     */     
/* 583 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 584 */     this.gunModel[''].setRotationPoint(27.0F, -8.75F, -0.25F);
/*     */     
/* 586 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 587 */     this.gunModel[''].setRotationPoint(27.0F, -8.75F, 1.75F);
/*     */     
/* 589 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 3, 3, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 590 */     this.gunModel[''].setRotationPoint(27.85F, -11.25F, -0.15F);
/*     */     
/* 592 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F);
/* 593 */     this.gunModel[''].setRotationPoint(28.85F, -10.75F, -0.15F);
/*     */     
/* 595 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 3, 3, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -1.25F);
/* 596 */     this.gunModel[''].setRotationPoint(27.1F, -11.25F, -0.15F);
/*     */     
/* 598 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 599 */     this.gunModel[''].setRotationPoint(27.0F, -9.25F, 0.75F);
/*     */     
/* 601 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 602 */     this.gunModel[''].setRotationPoint(27.0F, -9.25F, -0.25F);
/*     */     
/* 604 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F);
/* 605 */     this.gunModel[''].setRotationPoint(27.0F, -9.25F, 1.75F);
/*     */     
/* 607 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 608 */     this.gunModel[''].setRotationPoint(27.0F, -9.75F, 0.75F);
/*     */     
/* 610 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 611 */     this.gunModel[''].setRotationPoint(27.0F, -9.75F, -0.25F);
/*     */     
/* 613 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F);
/* 614 */     this.gunModel[''].setRotationPoint(27.0F, -9.75F, 1.75F);
/*     */     
/* 616 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 617 */     this.gunModel[''].setRotationPoint(27.0F, -10.25F, 0.75F);
/*     */     
/* 619 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 620 */     this.gunModel[''].setRotationPoint(27.0F, -10.25F, -0.25F);
/*     */     
/* 622 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F);
/* 623 */     this.gunModel[''].setRotationPoint(27.0F, -10.25F, 1.75F);
/*     */     
/* 625 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 626 */     this.gunModel[''].setRotationPoint(-2.0F, -23.05F, 2.15F);
/*     */     
/* 628 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 629 */     this.gunModel[''].setRotationPoint(-2.0F, -23.05F, -0.15F);
/*     */     
/* 631 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 632 */     this.gunModel[''].setRotationPoint(-2.0F, -23.65F, 0.3F);
/*     */     
/* 634 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 635 */     this.gunModel[''].setRotationPoint(-2.0F, -23.65F, 1.45F);
/*     */     
/* 637 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 638 */     this.gunModel[''].setRotationPoint(-2.0F, -23.65F, 0.75F);
/*     */     
/* 640 */     this.gunModel[''].addShapeBox(-5.0F, 7.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 641 */     this.gunModel[''].setRotationPoint(-2.0F, -23.05F, 0.85F);
/*     */     
/*     */ 
/* 644 */     this.ammoModel = new ModelRendererTurbo[3];
/* 645 */     this.ammoModel[0] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/* 646 */     this.ammoModel[1] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/* 647 */     this.ammoModel[2] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*     */     
/* 649 */     this.ammoModel[0].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 4, 3, 0.0F, 0.35F, 0.75F, -0.1F, -0.275F, 0.75F, -0.1F, -0.275F, 0.75F, -0.1F, 0.35F, 0.75F, -0.1F, -0.35F, 0.5F, -0.1F, 0.425F, 0.5F, -0.1F, 0.425F, 0.5F, -0.1F, -0.35F, 0.5F, -0.1F);
/* 650 */     this.ammoModel[0].setRotationPoint(17.5F, -12.0F, 0.0F);
/*     */     
/* 652 */     this.ammoModel[1].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 3, 3, 0.0F, 0.25F, 0.75F, -0.1F, -0.175F, 0.75F, -0.1F, -0.175F, 0.75F, -0.1F, 0.25F, 0.75F, -0.1F, -0.95F, 0.0F, -0.1F, 0.975F, 0.0F, -0.1F, 0.975F, 0.0F, -0.1F, -0.95F, 0.0F, -0.1F);
/* 653 */     this.ammoModel[1].setRotationPoint(18.1F, -6.75F, 0.0F);
/*     */     
/* 655 */     this.ammoModel[2].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 2, 3, 0.0F, 0.2F, 0.75F, -0.1F, -0.175F, 0.75F, -0.1F, -0.175F, 0.75F, -0.1F, 0.2F, 0.75F, -0.1F, -0.5F, -1.25F, -0.1F, -3.525F, -1.25F, -0.1F, -3.525F, -1.25F, -0.1F, -0.5F, -1.25F, -0.1F);
/* 656 */     this.ammoModel[2].setRotationPoint(19.25F, -3.0F, 0.0F);
/*     */     
/*     */ 
/* 659 */     this.slideModel = new ModelRendererTurbo[4];
/* 660 */     this.slideModel[0] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/* 661 */     this.slideModel[1] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 662 */     this.slideModel[2] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 663 */     this.slideModel[3] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*     */     
/* 665 */     this.slideModel[0].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, 0.45F, 0.0F, -0.4F, 0.45F);
/* 666 */     this.slideModel[0].setRotationPoint(14.0F, -20.35F, 0.85F);
/*     */     
/* 668 */     this.slideModel[1].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.0F, -0.35F, 0.0F, -1.0F, -0.35F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 669 */     this.slideModel[1].setRotationPoint(14.0F, -20.5F, -0.2F);
/*     */     
/* 671 */     this.slideModel[2].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.45F, 0.0F, -0.25F, 0.45F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 672 */     this.slideModel[2].setRotationPoint(14.0F, -19.25F, -0.15F);
/*     */     
/* 674 */     this.slideModel[3].addShapeBox(-5.0F, 7.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.85F, 0.0F, 0.25F, 0.85F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.85F, 0.0F, -0.25F, 0.85F);
/* 675 */     this.slideModel[3].setRotationPoint(14.0F, -21.35F, 0.85F);
/*     */     
/*     */ 
/* 678 */     translateAll(0.0F, -5.5F, 0.0F);
/* 679 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.13F, 0.0F);
/*     */     
/*     */ 
/* 682 */     this.gunSlideDistance = 0.0F;
/* 683 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 686 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmp5k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */