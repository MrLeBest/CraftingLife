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
/*     */ public class Modelp90
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelp90()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[''];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*     */     
/* 153 */     this.gunModel[0].addShapeBox(5.0F, -9.75F, 1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 154 */     this.gunModel[0].setRotationPoint(-28.0F, 1.0F, -1.0F);
/*     */     
/* 156 */     this.gunModel[1].addShapeBox(5.0F, -9.75F, 1.5F, 14, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 157 */     this.gunModel[1].setRotationPoint(-28.0F, 1.0F, -2.0F);
/*     */     
/* 159 */     this.gunModel[2].addShapeBox(5.0F, -9.75F, 1.5F, 4, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 160 */     this.gunModel[2].setRotationPoint(-28.0F, 1.0F, -3.0F);
/*     */     
/* 162 */     this.gunModel[3].addShapeBox(5.0F, -9.75F, 1.5F, 23, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 163 */     this.gunModel[3].setRotationPoint(-28.0F, 3.0F, -2.75F);
/*     */     
/* 165 */     this.gunModel[4].addShapeBox(5.0F, -9.75F, 1.5F, 11, 4, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 166 */     this.gunModel[4].setRotationPoint(-28.0F, 5.0F, -2.75F);
/*     */     
/* 168 */     this.gunModel[5].addShapeBox(5.0F, -9.75F, 1.5F, 11, 1, 0, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 169 */     this.gunModel[5].setRotationPoint(-28.0F, 9.0F, -2.75F);
/*     */     
/* 171 */     this.gunModel[6].addShapeBox(5.0F, -9.75F, 1.5F, 11, 1, 0, 0.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[6].setRotationPoint(-28.0F, 9.0F, -0.75F);
/*     */     
/* 174 */     this.gunModel[7].addShapeBox(5.0F, -9.75F, 1.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 175 */     this.gunModel[7].setRotationPoint(-28.0F, 10.0F, -2.25F);
/*     */     
/* 177 */     this.gunModel[8].addShapeBox(5.0F, -9.75F, 1.5F, 20, 2, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 178 */     this.gunModel[8].setRotationPoint(-28.0F, 3.0F, -3.75F);
/*     */     
/* 180 */     this.gunModel[9].addShapeBox(5.0F, -9.75F, 1.5F, 20, 2, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 181 */     this.gunModel[9].setRotationPoint(-28.0F, 3.0F, -1.0F);
/*     */     
/* 183 */     this.gunModel[10].addShapeBox(5.0F, -9.75F, 1.5F, 23, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 184 */     this.gunModel[10].setRotationPoint(-28.0F, 5.0F, -2.75F);
/*     */     
/* 186 */     this.gunModel[11].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 187 */     this.gunModel[11].setRotationPoint(-8.0F, 4.0F, -1.0F);
/*     */     
/* 189 */     this.gunModel[12].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 190 */     this.gunModel[12].setRotationPoint(-8.0F, 4.0F, -3.75F);
/*     */     
/* 192 */     this.gunModel[13].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 193 */     this.gunModel[13].setRotationPoint(-13.5F, 3.0F, -4.0F);
/*     */     
/* 195 */     this.gunModel[14].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 196 */     this.gunModel[14].setRotationPoint(-12.0F, 3.0F, -4.0F);
/*     */     
/* 198 */     this.gunModel[15].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 199 */     this.gunModel[15].setRotationPoint(-13.5F, 3.0F, -0.75F);
/*     */     
/* 201 */     this.gunModel[16].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 202 */     this.gunModel[16].setRotationPoint(-12.0F, 3.0F, -0.75F);
/*     */     
/* 204 */     this.gunModel[17].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 205 */     this.gunModel[17].setRotationPoint(-13.0F, 3.0F, -4.0F);
/*     */     
/* 207 */     this.gunModel[18].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 208 */     this.gunModel[18].setRotationPoint(-13.0F, 3.0F, -0.75F);
/*     */     
/* 210 */     this.gunModel[19].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, -0.02F, 0.0F, 0.0F, -0.02F, 0.0F, 0.0F, -0.02F, 0.0F, 0.0F, -0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 211 */     this.gunModel[19].setRotationPoint(-15.0F, 1.0F, -1.0F);
/*     */     
/* 213 */     this.gunModel[20].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.02F, 0.0F, 0.0F, -0.02F, 0.0F, 0.0F, -0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 214 */     this.gunModel[20].setRotationPoint(-15.0F, 1.0F, -3.0F);
/*     */     
/* 216 */     this.gunModel[21].addShapeBox(5.0F, -9.75F, 1.5F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 217 */     this.gunModel[21].setRotationPoint(-17.5F, 5.0F, -2.75F);
/*     */     
/* 219 */     this.gunModel[22].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 220 */     this.gunModel[22].setRotationPoint(-17.5F, 9.0F, -2.75F);
/*     */     
/* 222 */     this.gunModel[23].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 223 */     this.gunModel[23].setRotationPoint(-17.5F, 9.0F, -0.75F);
/*     */     
/* 225 */     this.gunModel[24].addShapeBox(5.0F, -9.75F, 1.5F, 6, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 226 */     this.gunModel[24].setRotationPoint(-24.0F, 1.0F, -3.0F);
/*     */     
/* 228 */     this.gunModel[25].addShapeBox(5.0F, -9.75F, 1.5F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 229 */     this.gunModel[25].setRotationPoint(-24.0F, 1.0F, -1.0F);
/*     */     
/* 231 */     this.gunModel[26].addShapeBox(5.0F, -9.75F, 1.5F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 232 */     this.gunModel[26].setRotationPoint(-18.0F, 1.0F, -1.0F);
/*     */     
/* 234 */     this.gunModel[27].addShapeBox(5.0F, -9.75F, 1.5F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 235 */     this.gunModel[27].setRotationPoint(-18.0F, 1.0F, -3.0F);
/*     */     
/* 237 */     this.gunModel[28].addShapeBox(5.0F, -9.75F, 1.5F, 5, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 238 */     this.gunModel[28].setRotationPoint(-17.0F, 5.0F, -2.5F);
/*     */     
/* 240 */     this.gunModel[29].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 241 */     this.gunModel[29].setRotationPoint(-12.5F, 7.5F, -2.5F);
/*     */     
/* 243 */     this.gunModel[30].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 244 */     this.gunModel[30].setRotationPoint(-12.0F, 8.0F, -2.5F);
/*     */     
/* 246 */     this.gunModel[31].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.15F, 0.0F, -0.5F, -1.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 247 */     this.gunModel[31].setRotationPoint(-11.0F, 8.0F, -2.5F);
/*     */     
/* 249 */     this.gunModel[32].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 250 */     this.gunModel[32].setRotationPoint(-12.5F, 5.5F, -2.5F);
/*     */     
/* 252 */     this.gunModel[33].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 253 */     this.gunModel[33].setRotationPoint(-12.0F, 5.5F, -2.5F);
/*     */     
/* 255 */     this.gunModel[34].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 2, 0.0F, 0.0F, -1.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.5F, 0.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 256 */     this.gunModel[34].setRotationPoint(-10.5F, 8.0F, -2.5F);
/*     */     
/* 258 */     this.gunModel[35].addShapeBox(5.0F, -9.75F, 1.5F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 259 */     this.gunModel[35].setRotationPoint(-6.5F, 5.5F, -2.5F);
/*     */     
/* 261 */     this.gunModel[36].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, 0.0F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 262 */     this.gunModel[36].setRotationPoint(-7.0F, 7.0F, -2.5F);
/*     */     
/* 264 */     this.gunModel[37].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 265 */     this.gunModel[37].setRotationPoint(-12.5F, 9.5F, -2.5F);
/*     */     
/* 267 */     this.gunModel[38].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 268 */     this.gunModel[38].setRotationPoint(-12.5F, 10.5F, -2.5F);
/*     */     
/* 270 */     this.gunModel[39].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 271 */     this.gunModel[39].setRotationPoint(-8.5F, 10.0F, -2.5F);
/*     */     
/* 273 */     this.gunModel[40].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F);
/* 274 */     this.gunModel[40].setRotationPoint(-8.5F, 10.5F, -2.5F);
/*     */     
/* 276 */     this.gunModel[41].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 277 */     this.gunModel[41].setRotationPoint(-6.5F, 9.0F, -2.5F);
/*     */     
/* 279 */     this.gunModel[42].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 280 */     this.gunModel[42].setRotationPoint(-5.5F, 9.0F, -2.5F);
/*     */     
/* 282 */     this.gunModel[43].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 283 */     this.gunModel[43].setRotationPoint(-7.25F, 5.75F, -2.5F);
/*     */     
/* 285 */     this.gunModel[44].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 286 */     this.gunModel[44].setRotationPoint(-7.5F, 5.0F, -2.5F);
/*     */     
/* 288 */     this.gunModel[45].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 289 */     this.gunModel[45].setRotationPoint(-7.25F, 5.0F, -2.5F);
/*     */     
/* 291 */     this.gunModel[46].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 292 */     this.gunModel[46].setRotationPoint(-4.0F, 7.5F, -2.5F);
/*     */     
/* 294 */     this.gunModel[47].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 295 */     this.gunModel[47].setRotationPoint(-2.5F, 9.0F, -2.5F);
/*     */     
/* 297 */     this.gunModel[48].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 298 */     this.gunModel[48].setRotationPoint(-2.5F, 10.0F, -2.5F);
/*     */     
/* 300 */     this.gunModel[49].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 301 */     this.gunModel[49].setRotationPoint(-2.0F, 9.0F, -2.5F);
/*     */     
/* 303 */     this.gunModel[50].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 304 */     this.gunModel[50].setRotationPoint(-0.5F, 10.0F, -2.5F);
/*     */     
/* 306 */     this.gunModel[51].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 307 */     this.gunModel[51].setRotationPoint(0.5F, 9.25F, -2.5F);
/*     */     
/* 309 */     this.gunModel[52].addShapeBox(5.0F, -9.75F, 1.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 310 */     this.gunModel[52].setRotationPoint(-1.0F, 8.5F, -2.5F);
/*     */     
/* 312 */     this.gunModel[53].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 313 */     this.gunModel[53].setRotationPoint(-3.0F, 7.5F, -2.5F);
/*     */     
/* 315 */     this.gunModel[54].addShapeBox(5.0F, -9.75F, 1.5F, 2, 2, 2, 0.0F, 0.0F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 316 */     this.gunModel[54].setRotationPoint(0.5F, 7.75F, -2.5F);
/*     */     
/* 318 */     this.gunModel[55].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 319 */     this.gunModel[55].setRotationPoint(-1.5F, 7.0F, -2.5F);
/*     */     
/* 321 */     this.gunModel[56].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 322 */     this.gunModel[56].setRotationPoint(-1.25F, 7.0F, -2.5F);
/*     */     
/* 324 */     this.gunModel[57].addShapeBox(5.0F, -9.75F, 1.5F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 325 */     this.gunModel[57].setRotationPoint(-5.0F, 3.0F, -2.5F);
/*     */     
/* 327 */     this.gunModel[58].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 328 */     this.gunModel[58].setRotationPoint(-4.0F, 5.5F, -2.5F);
/*     */     
/* 330 */     this.gunModel[59].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 331 */     this.gunModel[59].setRotationPoint(-4.0F, 7.0F, -2.5F);
/*     */     
/* 333 */     this.gunModel[60].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 334 */     this.gunModel[60].setRotationPoint(-4.0F, 5.5F, -2.0F);
/*     */     
/* 336 */     this.gunModel[61].addShapeBox(5.0F, -9.75F, 1.5F, 5, 2, 2, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 337 */     this.gunModel[61].setRotationPoint(0.5F, 5.25F, -2.5F);
/*     */     
/* 339 */     this.gunModel[62].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 340 */     this.gunModel[62].setRotationPoint(-0.5F, 7.25F, -2.5F);
/*     */     
/* 342 */     this.gunModel[63].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 343 */     this.gunModel[63].setRotationPoint(-3.0F, 7.5F, -2.5F);
/*     */     
/* 345 */     this.gunModel[64].addShapeBox(5.0F, -9.75F, 1.5F, 2, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 346 */     this.gunModel[64].setRotationPoint(1.25F, 6.75F, -2.5F);
/*     */     
/* 348 */     this.gunModel[65].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 349 */     this.gunModel[65].setRotationPoint(-0.75F, 6.25F, -2.5F);
/*     */     
/* 351 */     this.gunModel[66].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 352 */     this.gunModel[66].setRotationPoint(-0.75F, 5.5F, -2.5F);
/*     */     
/* 354 */     this.gunModel[67].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 355 */     this.gunModel[67].setRotationPoint(-2.0F, 7.5F, -2.5F);
/*     */     
/* 357 */     this.gunModel[68].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 358 */     this.gunModel[68].setRotationPoint(-1.0F, 10.0F, -2.5F);
/*     */     
/* 360 */     this.gunModel[69].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.35F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, -1.35F, 0.0F);
/* 361 */     this.gunModel[69].setRotationPoint(-3.0F, 11.5F, -2.5F);
/*     */     
/* 363 */     this.gunModel[70].addShapeBox(5.0F, -9.75F, 1.5F, 3, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 364 */     this.gunModel[70].setRotationPoint(3.5F, 7.5F, -1.5F);
/*     */     
/* 366 */     this.gunModel[71].addShapeBox(5.0F, -9.75F, 1.5F, 3, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, -2.25F, 0.0F, -0.75F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 367 */     this.gunModel[71].setRotationPoint(3.5F, 7.5F, -2.5F);
/*     */     
/* 369 */     this.gunModel[72].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 370 */     this.gunModel[72].setRotationPoint(3.5F, 7.0F, -2.5F);
/*     */     
/* 372 */     this.gunModel[73].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 373 */     this.gunModel[73].setRotationPoint(4.5F, 6.25F, -2.0F);
/*     */     
/* 375 */     this.gunModel[74].addShapeBox(5.0F, -9.75F, 1.5F, 2, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, -2.5F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F);
/* 376 */     this.gunModel[74].setRotationPoint(5.0F, 5.25F, -2.5F);
/*     */     
/* 378 */     this.gunModel[75].addShapeBox(5.0F, -9.75F, 1.5F, 2, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, -1.0F, 0.0F, -2.5F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F);
/* 379 */     this.gunModel[75].setRotationPoint(5.0F, 5.25F, -1.0F);
/*     */     
/* 381 */     this.gunModel[76].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 382 */     this.gunModel[76].setRotationPoint(3.0F, 7.0F, -2.5F);
/*     */     
/* 384 */     this.gunModel[77].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 385 */     this.gunModel[77].setRotationPoint(-1.25F, 5.0F, -2.5F);
/*     */     
/* 387 */     this.gunModel[78].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 388 */     this.gunModel[78].setRotationPoint(0.0F, 4.0F, -2.5F);
/*     */     
/* 390 */     this.gunModel[79].addShapeBox(5.0F, -9.75F, 1.5F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 391 */     this.gunModel[79].setRotationPoint(2.0F, 3.0F, -2.5F);
/*     */     
/* 393 */     this.gunModel[80].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 394 */     this.gunModel[80].setRotationPoint(3.0F, 1.5F, -2.5F);
/*     */     
/* 396 */     this.gunModel[81].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 397 */     this.gunModel[81].setRotationPoint(1.25F, 1.5F, -2.5F);
/*     */     
/* 399 */     this.gunModel[82].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 400 */     this.gunModel[82].setRotationPoint(2.25F, 1.5F, -2.0F);
/*     */     
/* 402 */     this.gunModel[83].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 403 */     this.gunModel[83].setRotationPoint(1.0F, 4.0F, -2.5F);
/*     */     
/* 405 */     this.gunModel[84].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 406 */     this.gunModel[84].setRotationPoint(4.0F, 3.5F, -2.0F);
/*     */     
/* 408 */     this.gunModel[85].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 409 */     this.gunModel[85].setRotationPoint(-8.0F, 2.0F, -0.5F);
/*     */     
/* 411 */     this.gunModel[86].addShapeBox(5.0F, -9.75F, 1.5F, 3, 2, 1, 0.0F, -1.0F, -0.75F, -0.25F, 1.0F, -0.75F, -0.25F, 1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 412 */     this.gunModel[86].setRotationPoint(-8.0F, -0.5F, -0.5F);
/*     */     
/* 414 */     this.gunModel[87].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 415 */     this.gunModel[87].setRotationPoint(-8.0F, 2.0F, -3.5F);
/*     */     
/* 417 */     this.gunModel[88].addShapeBox(5.0F, -9.75F, 1.5F, 3, 2, 1, 0.0F, -1.0F, -0.75F, -0.25F, 1.0F, -0.75F, -0.25F, 1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 418 */     this.gunModel[88].setRotationPoint(-8.0F, -0.5F, -3.5F);
/*     */     
/* 420 */     this.gunModel[89].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -1.5F, 0.0F, -0.7F, -1.5F);
/* 421 */     this.gunModel[89].setRotationPoint(-7.0F, 0.0F, -2.75F);
/*     */     
/* 423 */     this.gunModel[90].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 424 */     this.gunModel[90].setRotationPoint(2.0F, 1.0F, -2.5F);
/*     */     
/* 426 */     this.gunModel[91].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.7F, -1.5F);
/* 427 */     this.gunModel[91].setRotationPoint(-4.0F, 0.0F, -2.75F);
/*     */     
/* 429 */     this.gunModel[92].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F);
/* 430 */     this.gunModel[92].setRotationPoint(0.0F, 0.0F, -3.25F);
/*     */     
/* 432 */     this.gunModel[93].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 433 */     this.gunModel[93].setRotationPoint(1.0F, 2.75F, -2.25F);
/*     */     
/* 435 */     this.gunModel[94].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.5F, 0.0F, -0.2F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 436 */     this.gunModel[94].setRotationPoint(0.0F, 2.75F, -2.25F);
/*     */     
/* 438 */     this.gunModel[95].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F);
/* 439 */     this.gunModel[95].setRotationPoint(1.0F, 1.25F, -2.25F);
/*     */     
/* 441 */     this.gunModel[96].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, -0.25F, -1.0F, -0.25F);
/* 442 */     this.gunModel[96].setRotationPoint(1.0F, 0.75F, -2.25F);
/*     */     
/* 444 */     this.gunModel[97].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 445 */     this.gunModel[97].setRotationPoint(1.0F, 2.25F, -2.25F);
/*     */     
/* 447 */     this.gunModel[98].addShapeBox(5.0F, -9.75F, 1.5F, 1, 3, 1, 0.0F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/* 448 */     this.gunModel[98].setRotationPoint(3.5F, -2.0F, -1.5F);
/*     */     
/* 450 */     this.gunModel[99].addShapeBox(5.0F, -9.75F, 1.5F, 1, 3, 1, 0.0F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/* 451 */     this.gunModel[99].setRotationPoint(3.5F, -2.0F, -3.0F);
/*     */     
/* 453 */     this.gunModel[100].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/* 454 */     this.gunModel[100].setRotationPoint(3.5F, -2.5F, -1.5F);
/*     */     
/* 456 */     this.gunModel[101].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F);
/* 457 */     this.gunModel[101].setRotationPoint(3.5F, -2.5F, -3.0F);
/*     */     
/* 459 */     this.gunModel[102].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 1.5F, -1.5F, -0.5F, -1.5F, -1.5F, -0.5F, -1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F);
/* 460 */     this.gunModel[102].setRotationPoint(2.5F, -2.0F, -1.25F);
/*     */     
/* 462 */     this.gunModel[103].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.5F, 0.0F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, -1.5F, -0.75F, -1.5F, -1.5F, -0.75F, -1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F);
/* 463 */     this.gunModel[103].setRotationPoint(2.5F, -2.0F, -3.25F);
/*     */     
/* 465 */     this.gunModel[104].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 466 */     this.gunModel[104].setRotationPoint(0.0F, -1.0F, -2.75F);
/*     */     
/* 468 */     this.gunModel[105].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 1, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.8F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 469 */     this.gunModel[105].setRotationPoint(-4.0F, -1.0F, -2.75F);
/*     */     
/* 471 */     this.gunModel[106].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 1, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.8F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 472 */     this.gunModel[106].setRotationPoint(-4.0F, -1.0F, -1.0F);
/*     */     
/* 474 */     this.gunModel[107].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 4, 0.0F, -1.0F, -0.65F, -0.25F, 0.25F, -0.65F, -0.25F, 0.25F, -0.65F, -1.25F, -1.0F, -0.65F, -1.25F, 0.0F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F);
/* 475 */     this.gunModel[107].setRotationPoint(-7.0F, -2.5F, -3.0F);
/*     */     
/* 477 */     this.gunModel[108].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 4, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, -0.25F, 0.5F, -1.5F, -0.1F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -1.5F, -0.1F, -1.25F, -1.5F);
/* 478 */     this.gunModel[108].setRotationPoint(-6.0F, -1.35F, -2.75F);
/*     */     
/* 480 */     this.gunModel[109].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.45F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.45F, -0.25F, 0.5F);
/* 481 */     this.gunModel[109].setRotationPoint(-6.0F, -1.6F, -1.75F);
/*     */     
/* 483 */     this.gunModel[110].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 1, 0.0F, -0.25F, -1.25F, -0.25F, 0.25F, -1.25F, -0.25F, 0.25F, -1.25F, -0.75F, -0.25F, -1.25F, -0.75F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 484 */     this.gunModel[110].setRotationPoint(-7.0F, -1.25F, -0.5F);
/*     */     
/* 486 */     this.gunModel[111].addShapeBox(5.0F, -9.75F, 1.5F, 3, 1, 1, 0.0F, -0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 487 */     this.gunModel[111].setRotationPoint(-7.0F, -1.25F, -3.5F);
/*     */     
/* 489 */     this.gunModel[112].addShapeBox(5.0F, -9.75F, 1.5F, 2, 2, 3, 0.0F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -0.25F, 0.0F, 0.15F, -1.0F, 0.0F, 0.15F, -1.0F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F);
/* 490 */     this.gunModel[112].setRotationPoint(0.0F, -1.35F, -2.25F);
/*     */     
/* 492 */     this.gunModel[113].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 1, 0.0F, 0.0F, 1.75F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 493 */     this.gunModel[113].setRotationPoint(-3.0F, -1.5F, -2.5F);
/*     */     
/* 495 */     this.gunModel[114].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F, 1.75F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 496 */     this.gunModel[114].setRotationPoint(-4.0F, -1.5F, -1.25F);
/*     */     
/* 498 */     this.gunModel[115].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -1.15F, -0.25F, 0.0F, -1.15F, -0.25F, 0.0F, -1.15F, -0.5F, 0.0F, -1.15F, -0.5F);
/* 499 */     this.gunModel[115].setRotationPoint(-5.0F, -1.5F, -1.25F);
/*     */     
/* 501 */     this.gunModel[116].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 1.0F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F, 1.75F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 502 */     this.gunModel[116].setRotationPoint(-4.0F, -1.5F, -2.5F);
/*     */     
/* 504 */     this.gunModel[117].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -1.15F, -0.25F, 0.0F, -1.15F, -0.25F, 0.0F, -1.15F, -0.5F, 0.0F, -1.15F, -0.5F);
/* 505 */     this.gunModel[117].setRotationPoint(-5.0F, -1.5F, -2.5F);
/*     */     
/* 507 */     this.gunModel[118].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.4F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F);
/* 508 */     this.gunModel[118].setRotationPoint(1.0F, -1.5F, -1.0F);
/*     */     
/* 510 */     this.gunModel[119].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 1, 0.0F, 0.0F, 1.75F, -0.25F, 0.0F, 1.75F, -0.25F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 511 */     this.gunModel[119].setRotationPoint(-3.0F, -1.5F, -1.25F);
/*     */     
/* 513 */     this.gunModel[120].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 2, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, -2.4F, -0.25F, 0.0F, -2.4F, -0.25F, 0.0F, -2.4F, -0.75F, 0.0F, -2.4F, -0.75F);
/* 514 */     this.gunModel[120].setRotationPoint(-3.0F, -1.75F, -2.25F);
/*     */     
/* 516 */     this.gunModel[121].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 2, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, -1.0F, 0.0F, 1.4F, -1.0F, 0.0F, -2.15F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, -2.15F, -1.0F, 0.0F, -2.15F, -1.0F);
/* 517 */     this.gunModel[121].setRotationPoint(-3.0F, -1.75F, -2.0F);
/*     */     
/* 519 */     this.gunModel[122].addShapeBox(5.0F, -9.75F, 1.5F, 4, 1, 2, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, -1.0F, 0.0F, 1.55F, -1.0F, 0.0F, -2.15F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, -2.15F, -1.0F, 0.0F, -2.15F, -1.0F);
/* 520 */     this.gunModel[122].setRotationPoint(-3.0F, -0.55F, -2.0F);
/*     */     
/* 522 */     this.gunModel[123].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 1.55F, -0.5F, 0.0F, 1.55F, -0.5F, 0.0F, 1.55F, -1.0F, 0.0F, 1.55F, -1.0F, 0.0F, -2.15F, -0.5F, 0.0F, -2.15F, -0.5F, 0.0F, -2.15F, -1.0F, 0.0F, -2.15F, -1.0F);
/* 523 */     this.gunModel[123].setRotationPoint(0.0F, -0.15F, -2.25F);
/*     */     
/* 525 */     this.gunModel[124].addShapeBox(5.0F, -9.75F, 1.5F, 1, 1, 2, 0.0F, 0.0F, 1.45F, -0.9F, 0.0F, 1.45F, -0.9F, 0.0F, 1.45F, -0.9F, 0.0F, 1.45F, -0.9F, 0.0F, -2.25F, -0.9F, 0.0F, -2.25F, -0.9F, 0.0F, -2.25F, -0.9F, 0.0F, -2.25F, -0.9F);
/* 526 */     this.gunModel[124].setRotationPoint(-1.5F, -1.15F, -2.5F);
/*     */     
/* 528 */     this.gunModel[125].addShapeBox(5.0F, -9.75F, 1.5F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 529 */     this.gunModel[125].setRotationPoint(-5.0F, 3.75F, -1.0F);
/*     */     
/* 531 */     this.gunModel[126].addShapeBox(5.0F, -9.75F, 1.5F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 532 */     this.gunModel[126].setRotationPoint(-5.0F, 3.75F, -3.5F);
/*     */     
/* 534 */     this.gunModel[127].addShapeBox(5.0F, -9.75F, 1.5F, 4, 2, 3, 0.0F, 0.0F, 0.45F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -1.25F, 0.0F, 0.45F, -1.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.25F);
/* 535 */     this.gunModel[127].setRotationPoint(-4.0F, -1.35F, -2.75F);
/*     */     
/* 537 */     this.gunModel[''].addShapeBox(5.0F, -9.75F, 1.5F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 538 */     this.gunModel[''].setRotationPoint(2.0F, 0.0F, -2.0F);
/*     */     
/* 540 */     this.gunModel[''].addShapeBox(5.0F, -9.75F, 1.5F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 541 */     this.gunModel[''].setRotationPoint(-28.0F, 10.0F, -1.5F);
/*     */     
/*     */ 
/* 544 */     this.ammoModel = new ModelRendererTurbo[14];
/* 545 */     this.ammoModel[0] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/* 546 */     this.ammoModel[1] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 547 */     this.ammoModel[2] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 548 */     this.ammoModel[3] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 549 */     this.ammoModel[4] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 550 */     this.ammoModel[5] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 551 */     this.ammoModel[6] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/* 552 */     this.ammoModel[7] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/* 553 */     this.ammoModel[8] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/* 554 */     this.ammoModel[9] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/* 555 */     this.ammoModel[10] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/* 556 */     this.ammoModel[11] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/* 557 */     this.ammoModel[12] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/* 558 */     this.ammoModel[13] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*     */     
/* 560 */     this.ammoModel[0].addShapeBox(5.0F, -9.75F, 1.5F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 561 */     this.ammoModel[0].setRotationPoint(-14.0F, 1.0F, -2.5F);
/*     */     
/* 563 */     this.ammoModel[1].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F);
/* 564 */     this.ammoModel[1].setRotationPoint(-14.0F, 1.0F, -0.5F);
/*     */     
/* 566 */     this.ammoModel[2].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 567 */     this.ammoModel[2].setRotationPoint(-13.0F, 1.0F, -0.5F);
/*     */     
/* 569 */     this.ammoModel[3].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, -0.24F, 0.0F, 0.0F, -0.24F, 0.0F, -0.75F, -0.24F, -0.75F, 0.0F, -0.24F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 570 */     this.ammoModel[3].setRotationPoint(-12.0F, 0.88F, -0.5F);
/*     */     
/* 572 */     this.ammoModel[4].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 573 */     this.ammoModel[4].setRotationPoint(-14.0F, 1.0F, -3.5F);
/*     */     
/* 575 */     this.ammoModel[5].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 576 */     this.ammoModel[5].setRotationPoint(-13.0F, 1.0F, -3.5F);
/*     */     
/* 578 */     this.ammoModel[6].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, 0.0F, -0.24F, -0.75F, -0.75F, -0.24F, -0.75F, 0.0F, -0.24F, 0.0F, 0.0F, -0.24F, 0.0F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 579 */     this.ammoModel[6].setRotationPoint(-12.0F, 0.88F, -3.5F);
/*     */     
/* 581 */     this.ammoModel[7].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, -0.5F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -1.0F, -0.02F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 582 */     this.ammoModel[7].setRotationPoint(-15.0F, 1.0F, -1.5F);
/*     */     
/* 584 */     this.ammoModel[8].addShapeBox(5.0F, -9.75F, 1.5F, 1, 2, 1, 0.0F, -1.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 585 */     this.ammoModel[8].setRotationPoint(-15.0F, 1.0F, -2.5F);
/*     */     
/* 587 */     this.ammoModel[9].addShapeBox(5.0F, -9.75F, 1.5F, 14, 1, 1, 0.0F, 0.0F, -0.64F, 0.0F, -0.65F, -0.64F, 0.0F, -0.65F, -0.64F, -0.85F, 0.0F, -0.64F, -0.85F, 0.0F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F);
/* 588 */     this.ammoModel[9].setRotationPoint(-12.0F, 0.36F, -0.5F);
/*     */     
/* 590 */     this.ammoModel[10].addShapeBox(5.0F, -9.75F, 1.5F, 14, 1, 1, 0.0F, 0.0F, -0.64F, 0.0F, -0.65F, -0.64F, 0.0F, -0.65F, -0.64F, -0.85F, 0.0F, -0.64F, -0.85F, 0.0F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F);
/* 591 */     this.ammoModel[10].setRotationPoint(-12.0F, 2.0F, -0.5F);
/*     */     
/* 593 */     this.ammoModel[11].addShapeBox(5.0F, -9.75F, 1.5F, 14, 1, 1, 0.0F, 0.0F, -0.64F, 0.0F, -0.65F, -0.64F, 0.0F, -0.65F, -0.64F, -0.85F, 0.0F, -0.64F, -0.85F, 0.0F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F);
/* 594 */     this.ammoModel[11].setRotationPoint(-12.0F, 0.36F, -2.65F);
/*     */     
/* 596 */     this.ammoModel[12].addShapeBox(5.0F, -9.75F, 1.5F, 14, 1, 1, 0.0F, 0.0F, -0.64F, 0.0F, -0.65F, -0.64F, 0.0F, -0.65F, -0.64F, -0.85F, 0.0F, -0.64F, -0.85F, 0.0F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F);
/* 597 */     this.ammoModel[12].setRotationPoint(-12.0F, 2.0F, -2.65F);
/*     */     
/* 599 */     this.ammoModel[13].addShapeBox(5.0F, -9.75F, 1.5F, 13, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 600 */     this.ammoModel[13].setRotationPoint(-11.0F, 1.0F, -2.5F);
/*     */     
/*     */ 
/* 603 */     translateAll(0.0F, -4.0F, 0.0F);
/* 604 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 606 */     this.gunSlideDistance = 0.0F;
/* 607 */     this.animationType = EnumAnimationType.P90;
/*     */     
/*     */ 
/* 610 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelp90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */