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
/*     */ public class Modelg3
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelg3()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[''];
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
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 281, 65, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*     */     
/* 172 */     this.gunModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 13, 4, 3, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 173 */     this.gunModel[0].setRotationPoint(2.0F, -15.0F, 0.0F);
/*     */     
/* 175 */     this.gunModel[1].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 3, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 176 */     this.gunModel[1].setRotationPoint(0.0F, -13.75F, 0.0F);
/*     */     
/* 178 */     this.gunModel[2].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 179 */     this.gunModel[2].setRotationPoint(-1.0F, -13.75F, 0.0F);
/*     */     
/* 181 */     this.gunModel[3].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 3, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 182 */     this.gunModel[3].setRotationPoint(-2.0F, -13.75F, 0.0F);
/*     */     
/* 184 */     this.gunModel[4].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 7, 1, 0.0F, -2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 185 */     this.gunModel[4].setRotationPoint(-1.0F, -10.0F, 1.0F);
/*     */     
/* 187 */     this.gunModel[5].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 7, 1, 0.0F, -1.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, -0.5F, -1.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.5F, 0.0F);
/* 188 */     this.gunModel[5].setRotationPoint(2.0F, -10.0F, 2.0F);
/*     */     
/* 190 */     this.gunModel[6].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 7, 1, 0.0F, -1.5F, 1.0F, 0.0F, 2.5F, 1.0F, -0.5F, 2.5F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 191 */     this.gunModel[6].setRotationPoint(2.0F, -10.0F, 0.0F);
/*     */     
/* 193 */     this.gunModel[7].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 7, 1, 0.0F, -2.5F, 1.0F, -0.5F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 194 */     this.gunModel[7].setRotationPoint(-1.0F, -10.0F, 0.0F);
/*     */     
/* 196 */     this.gunModel[8].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 7, 1, 0.0F, -2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, 2.5F, 1.0F, 0.0F, -2.5F, 1.0F, -0.5F, 0.0F, 0.25F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.25F, -0.5F);
/* 197 */     this.gunModel[8].setRotationPoint(-1.0F, -10.0F, 2.0F);
/*     */     
/* 199 */     this.gunModel[9].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 200 */     this.gunModel[9].setRotationPoint(13.0F, -11.0F, 0.5F);
/*     */     
/* 202 */     this.gunModel[10].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 203 */     this.gunModel[10].setRotationPoint(12.75F, -10.0F, 0.5F);
/*     */     
/* 205 */     this.gunModel[11].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 206 */     this.gunModel[11].setRotationPoint(8.25F, -8.0F, 0.5F);
/*     */     
/* 208 */     this.gunModel[12].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -1.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -1.5F, 0.0F);
/* 209 */     this.gunModel[12].setRotationPoint(6.25F, -8.0F, 0.5F);
/*     */     
/* 211 */     this.gunModel[13].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 212 */     this.gunModel[13].setRotationPoint(6.25F, -9.0F, 0.5F);
/*     */     
/* 214 */     this.gunModel[14].addShapeBox(-3.0F, 5.0F, -1.5F, 21, 1, 3, 0.0F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 215 */     this.gunModel[14].setRotationPoint(-6.0F, -16.5F, 0.0F);
/*     */     
/* 217 */     this.gunModel[15].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 218 */     this.gunModel[15].setRotationPoint(15.0F, -15.0F, 0.0F);
/*     */     
/* 220 */     this.gunModel[16].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 221 */     this.gunModel[16].setRotationPoint(15.0F, -12.0F, 0.0F);
/*     */     
/* 223 */     this.gunModel[17].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 224 */     this.gunModel[17].setRotationPoint(15.0F, -12.5F, 0.0F);
/*     */     
/* 226 */     this.gunModel[18].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 227 */     this.gunModel[18].setRotationPoint(15.75F, -12.0F, 0.0F);
/*     */     
/* 229 */     this.gunModel[19].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, -0.75F, 0.0F, -1.75F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 230 */     this.gunModel[19].setRotationPoint(15.75F, -12.75F, 0.0F);
/*     */     
/* 232 */     this.gunModel[20].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.6F, 0.0F, -1.85F, -0.6F, 0.0F, -1.85F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -1.85F, -0.4F, 0.0F, -1.85F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 233 */     this.gunModel[20].setRotationPoint(16.0F, -12.25F, 0.0F);
/*     */     
/* 235 */     this.gunModel[21].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.75F, 0.0F, -1.85F, -1.1F, 0.0F, -1.85F, -1.1F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, 0.0F, -1.85F, 0.1F, 0.0F, -1.85F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F);
/* 236 */     this.gunModel[21].setRotationPoint(16.0F, -12.75F, 0.0F);
/*     */     
/* 238 */     this.gunModel[22].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 2, 3, 0.0F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F);
/* 239 */     this.gunModel[22].setRotationPoint(15.0F, -16.5F, 0.0F);
/*     */     
/* 241 */     this.gunModel[23].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 2, 3, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 1.5F, -0.25F, -0.75F, 1.5F, -0.25F, -0.75F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F);
/* 242 */     this.gunModel[23].setRotationPoint(15.0F, -14.5F, 0.0F);
/*     */     
/* 244 */     this.gunModel[24].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 245 */     this.gunModel[24].setRotationPoint(15.5F, -13.45F, 0.0F);
/*     */     
/* 247 */     this.gunModel[25].addShapeBox(-3.0F, 5.0F, -1.5F, 11, 4, 3, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 248 */     this.gunModel[25].setRotationPoint(17.5F, -15.0F, 0.0F);
/*     */     
/* 250 */     this.gunModel[26].addShapeBox(-3.0F, 5.0F, -1.5F, 33, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.65F, 0.0F, 0.25F, 0.65F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 251 */     this.gunModel[26].setRotationPoint(-5.0F, -16.75F, 2.15F);
/*     */     
/* 253 */     this.gunModel[27].addShapeBox(-3.0F, 5.0F, -1.5F, 34, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 254 */     this.gunModel[27].setRotationPoint(-5.0F, -18.75F, 2.15F);
/*     */     
/* 256 */     this.gunModel[28].addShapeBox(-3.0F, 5.0F, -1.5F, 33, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F);
/* 257 */     this.gunModel[28].setRotationPoint(-5.0F, -19.25F, 2.15F);
/*     */     
/* 259 */     this.gunModel[29].addShapeBox(-3.0F, 5.0F, -1.5F, 34, 1, 1, 0.0F, 0.0F, -0.65F, -0.2F, 0.0F, -0.65F, -0.2F, 0.0F, -1.0F, -0.15F, 0.0F, -1.0F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 260 */     this.gunModel[29].setRotationPoint(-5.0F, -20.5F, 2.15F);
/*     */     
/* 262 */     this.gunModel[30].addShapeBox(-3.0F, 5.0F, -1.5F, 34, 1, 2, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 263 */     this.gunModel[30].setRotationPoint(-5.0F, -20.75F, 0.5F);
/*     */     
/* 265 */     this.gunModel[31].addShapeBox(-3.0F, 5.0F, -1.5F, 34, 1, 1, 0.0F, 0.0F, 0.25F, 0.65F, -0.5F, 0.25F, 0.65F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.15F, -0.5F, 0.0F, -0.15F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 266 */     this.gunModel[31].setRotationPoint(-5.0F, -16.75F, -0.15F);
/*     */     
/* 268 */     this.gunModel[32].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 269 */     this.gunModel[32].setRotationPoint(-5.0F, -19.25F, -0.15F);
/*     */     
/* 271 */     this.gunModel[33].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 272 */     this.gunModel[33].setRotationPoint(-5.0F, -20.5F, -0.2F);
/*     */     
/* 274 */     this.gunModel[34].addShapeBox(-3.0F, 5.0F, -1.5F, 34, 2, 1, 0.0F, 0.0F, -0.5F, -0.05F, 0.02F, -0.5F, -0.05F, 0.02F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.05F, 0.02F, -0.25F, -0.05F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 275 */     this.gunModel[34].setRotationPoint(-5.0F, -20.0F, 0.8F);
/*     */     
/* 277 */     this.gunModel[35].addShapeBox(-3.0F, 5.0F, -1.5F, 31, 2, 1, 0.0F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, -0.05F, 0.0F, -0.5F, 0.35F, 0.0F, -0.5F, 0.35F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.02F, -0.25F, 0.35F, 0.0F, -0.25F, 0.35F);
/* 278 */     this.gunModel[35].setRotationPoint(-3.0F, -17.5F, 0.8F);
/*     */     
/* 280 */     this.gunModel[36].addShapeBox(-3.0F, 5.0F, -1.5F, 34, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.3F, 0.0F, -0.5F, 1.3F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.3F, 0.0F, -0.25F, 1.3F);
/* 281 */     this.gunModel[36].setRotationPoint(-5.0F, -18.75F, -0.15F);
/*     */     
/* 283 */     this.gunModel[37].addShapeBox(-3.0F, 5.0F, -1.5F, 28, 1, 4, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 284 */     this.gunModel[37].setRotationPoint(4.0F, -21.95F, -0.85F);
/*     */     
/* 286 */     this.gunModel[38].addShapeBox(-3.0F, 5.0F, -1.5F, 28, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 287 */     this.gunModel[38].setRotationPoint(4.0F, -23.05F, 2.15F);
/*     */     
/* 289 */     this.gunModel[39].addShapeBox(-3.0F, 5.0F, -1.5F, 38, 1, 1, 0.0F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 290 */     this.gunModel[39].setRotationPoint(10.0F, -23.05F, -0.15F);
/*     */     
/* 292 */     this.gunModel[40].addShapeBox(-3.0F, 5.0F, -1.5F, 44, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 293 */     this.gunModel[40].setRotationPoint(4.0F, -23.05F, 0.85F);
/*     */     
/* 295 */     this.gunModel[41].addShapeBox(-3.0F, 5.0F, -1.5F, 25, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 296 */     this.gunModel[41].setRotationPoint(-5.0F, -21.35F, 0.85F);
/*     */     
/* 298 */     this.gunModel[42].addShapeBox(-3.0F, 5.0F, -1.5F, 47, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 299 */     this.gunModel[42].setRotationPoint(13.5F, -23.65F, 0.3F);
/*     */     
/* 301 */     this.gunModel[43].addShapeBox(-3.0F, 5.0F, -1.5F, 57, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, -0.5F, -1.1F, -0.4F, -0.5F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, -0.5F, 0.25F, -0.4F, -0.5F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 302 */     this.gunModel[43].setRotationPoint(4.0F, -23.65F, 1.45F);
/*     */     
/* 304 */     this.gunModel[44].addShapeBox(-3.0F, 5.0F, -1.5F, 50, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 305 */     this.gunModel[44].setRotationPoint(11.0F, -23.65F, 0.75F);
/*     */     
/* 307 */     this.gunModel[45].addShapeBox(-3.0F, 5.0F, -1.5F, 21, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 308 */     this.gunModel[45].setRotationPoint(-1.0F, -21.25F, -0.15F);
/*     */     
/* 310 */     this.gunModel[46].addShapeBox(-3.0F, 5.0F, -1.5F, 43, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.15F, 0.0F, -0.35F, -0.15F);
/* 311 */     this.gunModel[46].setRotationPoint(-1.0F, -21.25F, 1.9F);
/*     */     
/* 313 */     this.gunModel[47].addShapeBox(-3.0F, 5.0F, -1.5F, 47, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 314 */     this.gunModel[47].setRotationPoint(-5.0F, -21.25F, 0.85F);
/*     */     
/* 316 */     this.gunModel[48].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 317 */     this.gunModel[48].setRotationPoint(26.0F, -21.35F, 0.85F);
/*     */     
/* 319 */     this.gunModel[49].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 1, 3, 0.0F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 320 */     this.gunModel[49].setRotationPoint(29.0F, -20.95F, -0.85F);
/*     */     
/* 322 */     this.gunModel[50].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 323 */     this.gunModel[50].setRotationPoint(4.0F, -23.8F, 0.75F);
/*     */     
/* 325 */     this.gunModel[51].addShapeBox(-3.0F, 5.0F, -1.5F, 15, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 326 */     this.gunModel[51].setRotationPoint(14.0F, -23.8F, 0.75F);
/*     */     
/* 328 */     this.gunModel[52].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, -0.4F, 0.0F, -0.95F, 0.1F, 0.0F, -0.95F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 329 */     this.gunModel[52].setRotationPoint(12.5F, -23.8F, 0.75F);
/*     */     
/* 331 */     this.gunModel[53].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.85F, -0.4F, 0.0F, -0.85F, -0.4F, 0.0F, -0.85F, 0.1F, -0.75F, -0.85F, 0.1F, -0.75F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F);
/* 332 */     this.gunModel[53].setRotationPoint(11.5F, -23.8F, 0.75F);
/*     */     
/* 334 */     this.gunModel[54].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, -0.75F, -0.85F, -0.4F, 0.0F, -0.85F, -0.4F, 0.0F, -0.85F, 0.1F, -0.75F, -0.85F, 0.1F, -0.75F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F);
/* 335 */     this.gunModel[54].setRotationPoint(12.75F, -23.8F, 0.75F);
/*     */     
/* 337 */     this.gunModel[55].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 338 */     this.gunModel[55].setRotationPoint(26.0F, -21.25F, -0.15F);
/*     */     
/* 340 */     this.gunModel[56].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 341 */     this.gunModel[56].setRotationPoint(26.0F, -20.5F, -0.2F);
/*     */     
/* 343 */     this.gunModel[57].addShapeBox(-3.0F, 5.0F, -1.5F, 9, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 1.05F, 0.0F, -0.25F, 1.05F);
/* 344 */     this.gunModel[57].setRotationPoint(14.0F, -21.35F, 0.85F);
/*     */     
/* 346 */     this.gunModel[58].addShapeBox(-3.0F, 5.0F, -1.5F, 45, 2, 1, 0.0F, 0.0F, 0.0F, 0.45F, 0.02F, 0.0F, 0.45F, 0.02F, 0.0F, 0.85F, 0.0F, 0.0F, 0.85F, 0.0F, 0.25F, 0.45F, 0.02F, 0.25F, 0.45F, 0.02F, 0.25F, 0.85F, 0.0F, 0.25F, 0.85F);
/* 347 */     this.gunModel[58].setRotationPoint(29.5F, -18.75F, 0.8F);
/*     */     
/* 349 */     this.gunModel[59].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, -0.5F, 0.25F, -0.15F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.65F, -0.5F, 0.0F, 0.65F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 350 */     this.gunModel[59].setRotationPoint(26.0F, -19.25F, -0.15F);
/*     */     
/* 352 */     this.gunModel[60].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 353 */     this.gunModel[60].setRotationPoint(20.0F, -19.25F, -0.15F);
/*     */     
/* 355 */     this.gunModel[61].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 356 */     this.gunModel[61].setRotationPoint(14.0F, -19.5F, -0.2F);
/*     */     
/* 358 */     this.gunModel[62].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 1.05F, 0.0F, 0.25F, 1.05F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 1.05F, 0.0F, -0.75F, 1.05F);
/* 359 */     this.gunModel[62].setRotationPoint(20.0F, -21.35F, 0.85F);
/*     */     
/* 361 */     this.gunModel[63].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 362 */     this.gunModel[63].setRotationPoint(47.0F, -20.95F, 0.15F);
/*     */     
/* 364 */     this.gunModel[64].addShapeBox(-3.0F, 5.0F, -1.5F, 9, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 365 */     this.gunModel[64].setRotationPoint(23.0F, -20.95F, 0.15F);
/*     */     
/* 367 */     this.gunModel[65].addShapeBox(-3.0F, 5.0F, -1.5F, 14, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 368 */     this.gunModel[65].setRotationPoint(34.0F, -23.05F, 2.15F);
/*     */     
/* 370 */     this.gunModel[66].addShapeBox(-3.0F, 5.0F, -1.5F, 14, 1, 4, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 371 */     this.gunModel[66].setRotationPoint(34.0F, -21.95F, -0.85F);
/*     */     
/* 373 */     this.gunModel[67].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, 0.35F, 0.0F, -0.65F, 0.35F);
/* 374 */     this.gunModel[67].setRotationPoint(32.0F, -21.95F, -0.85F);
/*     */     
/* 376 */     this.gunModel[68].addShapeBox(-3.0F, 5.0F, -1.5F, 15, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.65F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F);
/* 377 */     this.gunModel[68].setRotationPoint(32.0F, -20.95F, 0.15F);
/*     */     
/* 379 */     this.gunModel[69].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 380 */     this.gunModel[69].setRotationPoint(47.35F, -21.7F, 2.3F);
/*     */     
/* 382 */     this.gunModel[70].addShapeBox(-3.0F, 5.0F, -1.5F, 32, 5, 2, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.8F, 0.0F, -0.5F, 0.8F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 383 */     this.gunModel[70].setRotationPoint(28.5F, -20.75F, 2.3F);
/*     */     
/* 385 */     this.gunModel[71].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.5F, -0.55F, 0.02F, 0.5F, -0.55F, 0.02F, 0.5F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.25F, -0.55F, 0.02F, 0.25F, -0.55F, 0.02F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 386 */     this.gunModel[71].setRotationPoint(60.5F, -20.0F, 0.3F);
/*     */     
/* 388 */     this.gunModel[72].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.8F, 0.02F, 0.0F, -0.8F, 0.02F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.8F, 0.02F, -0.5F, -0.8F, 0.02F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F);
/* 389 */     this.gunModel[72].setRotationPoint(60.5F, -21.75F, -0.2F);
/*     */     
/* 391 */     this.gunModel[73].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.65F, 0.0F, -1.2F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.4F);
/* 392 */     this.gunModel[73].setRotationPoint(48.0F, -23.05F, 2.15F);
/*     */     
/* 394 */     this.gunModel[74].addShapeBox(-3.0F, 5.0F, -1.5F, 13, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 395 */     this.gunModel[74].setRotationPoint(47.5F, -23.05F, 0.85F);
/*     */     
/* 397 */     this.gunModel[75].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.4F);
/* 398 */     this.gunModel[75].setRotationPoint(48.0F, -20.95F, 0.15F);
/*     */     
/* 400 */     this.gunModel[76].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.65F, -1.1F, 0.0F, 0.65F, -1.35F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 401 */     this.gunModel[76].setRotationPoint(48.0F, -20.95F, -0.85F);
/*     */     
/* 403 */     this.gunModel[77].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 404 */     this.gunModel[77].setRotationPoint(42.0F, -21.25F, 0.85F);
/*     */     
/* 406 */     this.gunModel[78].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.15F);
/* 407 */     this.gunModel[78].setRotationPoint(42.0F, -21.25F, 1.9F);
/*     */     
/* 409 */     this.gunModel[79].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 410 */     this.gunModel[79].setRotationPoint(42.0F, -21.25F, -0.15F);
/*     */     
/* 412 */     this.gunModel[80].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -1.2F, -0.4F, 0.0F, -1.2F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 413 */     this.gunModel[80].setRotationPoint(48.0F, -23.05F, -0.15F);
/*     */     
/* 415 */     this.gunModel[81].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, -0.15F, -1.1F, 0.0F, -0.15F, -1.35F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.1F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 416 */     this.gunModel[81].setRotationPoint(48.0F, -21.95F, -0.85F);
/*     */     
/* 418 */     this.gunModel[82].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.65F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.4F);
/* 419 */     this.gunModel[82].setRotationPoint(48.0F, -21.95F, 1.15F);
/*     */     
/* 421 */     this.gunModel[83].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 422 */     this.gunModel[83].setRotationPoint(43.0F, -21.25F, 0.85F);
/*     */     
/* 424 */     this.gunModel[84].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 1, 0.0F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, -0.35F, -0.4F, 0.0F, -0.35F, -0.4F);
/* 425 */     this.gunModel[84].setRotationPoint(43.0F, -21.25F, 1.9F);
/*     */     
/* 427 */     this.gunModel[85].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.65F, 0.0F, 0.65F, -0.65F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F);
/* 428 */     this.gunModel[85].setRotationPoint(48.5F, -20.95F, 0.15F);
/*     */     
/* 430 */     this.gunModel[86].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 2, 0.0F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.6F, 0.0F, -0.15F, -0.65F, 0.0F, -0.15F, -0.65F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.6F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F);
/* 431 */     this.gunModel[86].setRotationPoint(48.5F, -21.95F, 1.15F);
/*     */     
/* 433 */     this.gunModel[87].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.65F, 0.0F, -1.2F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.65F);
/* 434 */     this.gunModel[87].setRotationPoint(48.5F, -23.05F, 2.15F);
/*     */     
/* 436 */     this.gunModel[88].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 1, 0.0F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -0.35F, -0.65F, 0.0F, -0.35F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 437 */     this.gunModel[88].setRotationPoint(43.0F, -21.25F, -0.15F);
/*     */     
/* 439 */     this.gunModel[89].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 3, 0.0F, 0.0F, 0.65F, -1.35F, 0.0F, 0.65F, -1.35F, 0.0F, 0.65F, -0.4F, 0.0F, 0.65F, -0.4F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 440 */     this.gunModel[89].setRotationPoint(48.5F, -20.95F, -0.85F);
/*     */     
/* 442 */     this.gunModel[90].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 3, 0.0F, 0.0F, -0.15F, -1.35F, 0.0F, -0.15F, -1.35F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -1.35F, 0.0F, -0.65F, -0.4F, 0.0F, -0.65F, -0.4F);
/* 443 */     this.gunModel[90].setRotationPoint(48.5F, -21.95F, -0.85F);
/*     */     
/* 445 */     this.gunModel[91].addShapeBox(-3.0F, 5.0F, -1.5F, 12, 1, 1, 0.0F, 0.0F, -1.2F, -0.65F, 0.0F, -1.2F, -0.65F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.65F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 446 */     this.gunModel[91].setRotationPoint(48.5F, -23.05F, -0.15F);
/*     */     
/* 448 */     this.gunModel[92].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 449 */     this.gunModel[92].setRotationPoint(60.5F, -23.5F, 1.0F);
/*     */     
/* 451 */     this.gunModel[93].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.6F, 0.02F, -0.75F, -0.6F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.02F, -0.25F, -0.6F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 452 */     this.gunModel[93].setRotationPoint(60.5F, -22.5F, 0.0F);
/*     */     
/* 454 */     this.gunModel[94].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, -0.75F, -0.6F, 0.0F, -0.75F, -0.6F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F);
/* 455 */     this.gunModel[94].setRotationPoint(60.5F, -22.5F, 2.0F);
/*     */     
/* 457 */     this.gunModel[95].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, 0.02F, 0.0F, -0.6F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.6F, 0.02F, -1.0F, -0.6F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 458 */     this.gunModel[95].setRotationPoint(60.5F, -21.25F, 0.0F);
/*     */     
/* 460 */     this.gunModel[96].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.02F, 0.0F, -0.5F, 0.02F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.25F, -0.5F, 0.02F, -0.25F, -0.5F, 0.02F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F);
/* 461 */     this.gunModel[96].setRotationPoint(60.5F, -21.25F, 1.5F);
/*     */     
/* 463 */     this.gunModel[97].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 464 */     this.gunModel[97].setRotationPoint(60.5F, -21.25F, 1.0F);
/*     */     
/* 466 */     this.gunModel[98].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.02F, 0.25F, 0.0F, 0.02F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 467 */     this.gunModel[98].setRotationPoint(60.5F, -17.0F, 1.0F);
/*     */     
/* 469 */     this.gunModel[99].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.25F, 0.0F, 0.02F, 0.25F, 0.0F, 0.02F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F);
/* 470 */     this.gunModel[99].setRotationPoint(60.5F, -17.0F, 2.0F);
/*     */     
/* 472 */     this.gunModel[100].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.3F, 0.02F, 0.0F, -0.3F, 0.02F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.3F, 0.02F, 0.0F, -0.3F, 0.02F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 473 */     this.gunModel[100].setRotationPoint(60.5F, -18.0F, -0.2F);
/*     */     
/* 475 */     this.gunModel[101].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.02F, 0.0F, 0.0F, 0.02F, -1.25F, -0.1F, 0.0F, -1.25F, -0.1F, 0.0F, 0.25F, 0.0F, 0.02F, 0.25F, 0.0F, 0.02F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F);
/* 476 */     this.gunModel[101].setRotationPoint(60.5F, -19.25F, 2.0F);
/*     */     
/* 478 */     this.gunModel[102].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.02F, -1.0F, 0.0F, 0.02F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 479 */     this.gunModel[102].setRotationPoint(60.5F, -19.75F, 1.0F);
/*     */     
/* 481 */     this.gunModel[103].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.1F, 0.02F, -0.75F, -0.1F, 0.02F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, -0.1F, 0.02F, -0.25F, -0.1F, 0.02F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 482 */     this.gunModel[103].setRotationPoint(60.5F, -18.75F, 0.0F);
/*     */     
/* 484 */     this.gunModel[104].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.02F, 0.0F, -0.1F, 0.02F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.1F, 0.02F, -1.0F, -0.1F, 0.02F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 485 */     this.gunModel[104].setRotationPoint(60.5F, -17.0F, 0.0F);
/*     */     
/* 487 */     this.gunModel[105].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.02F, -0.25F, 0.0F, 0.02F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 488 */     this.gunModel[105].setRotationPoint(60.5F, -24.0F, 1.38F);
/*     */     
/* 490 */     this.gunModel[106].addShapeBox(-3.0F, 5.0F, -1.5F, 32, 5, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.8F, 0.0F, 0.5F, 0.8F);
/* 491 */     this.gunModel[106].setRotationPoint(28.5F, -20.75F, -1.3F);
/*     */     
/* 493 */     this.gunModel[107].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 1.0F, 0.5F, -1.0F, 1.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 1.0F, -0.65F, -1.0F, 1.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 494 */     this.gunModel[107].setRotationPoint(-1.0F, -21.95F, -0.85F);
/*     */     
/* 496 */     this.gunModel[108].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 1.0F, -0.25F, -1.0F, 1.0F, -0.25F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 1.0F, -0.65F, -1.0F, 1.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 497 */     this.gunModel[108].setRotationPoint(1.0F, -22.8F, -0.85F);
/*     */     
/* 499 */     this.gunModel[109].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 4, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -1.0F, 0.0F, -0.65F, -0.3F, 0.0F, -0.65F, -0.3F);
/* 500 */     this.gunModel[109].setRotationPoint(-1.0F, -22.8F, -0.85F);
/*     */     
/* 502 */     this.gunModel[110].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, 0.0F, -0.9F, -0.55F);
/* 503 */     this.gunModel[110].setRotationPoint(-1.0F, -23.4F, 1.37F);
/*     */     
/* 505 */     this.gunModel[111].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -1.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -1.25F, 0.25F, -0.55F, -0.5F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, -0.5F, -0.9F, -0.55F);
/* 506 */     this.gunModel[111].setRotationPoint(-1.0F, -23.75F, 1.37F);
/*     */     
/* 508 */     this.gunModel[112].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -0.5F, 0.25F, -0.55F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, 0.0F, -0.9F, -0.55F);
/* 509 */     this.gunModel[112].setRotationPoint(-1.0F, -23.4F, -0.85F);
/*     */     
/* 511 */     this.gunModel[113].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F, -1.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.55F, -1.25F, 0.25F, -0.55F, -0.5F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -0.55F, -0.5F, -0.9F, -0.55F);
/* 512 */     this.gunModel[113].setRotationPoint(-1.0F, -23.75F, -0.85F);
/*     */     
/* 514 */     this.gunModel[114].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 4, 0.0F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -1.05F, 0.0F, -0.15F, -0.35F, 0.0F, -0.15F, -0.35F, 0.0F, -0.65F, -1.05F, 0.0F, -0.65F, -1.05F, 0.0F, -0.65F, -0.35F, 0.0F, -0.65F, -0.35F);
/* 515 */     this.gunModel[114].setRotationPoint(-5.0F, -21.95F, -0.85F);
/*     */     
/* 517 */     this.gunModel[115].addBox(-3.0F, 5.0F, -1.5F, 2, 1, 2, 0.0F);
/* 518 */     this.gunModel[115].setRotationPoint(1.5F, -23.5F, 0.5F);
/*     */     
/* 520 */     this.gunModel[116].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 521 */     this.gunModel[116].setRotationPoint(1.5F, -24.5F, 0.5F);
/*     */     
/* 523 */     this.gunModel[117].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 524 */     this.gunModel[117].setRotationPoint(1.5F, -24.5F, 2.0F);
/*     */     
/* 526 */     this.gunModel[118].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 2, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 527 */     this.gunModel[118].setRotationPoint(16.5F, -11.75F, 0.5F);
/* 528 */     this.gunModel[118].rotateAngleZ = -0.12217305F;
/*     */     
/* 530 */     this.gunModel[119].addShapeBox(-3.0F, 5.0F, -1.5F, 3, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 531 */     this.gunModel[119].setRotationPoint(-2.0F, -17.5F, 2.15F);
/*     */     
/* 533 */     this.gunModel[120].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.45F, 0.0F, -0.65F, 0.45F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F);
/* 534 */     this.gunModel[120].setRotationPoint(-5.0F, -23.55F, 0.85F);
/*     */     
/* 536 */     this.gunModel[121].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, -0.475F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.475F, 0.15F);
/* 537 */     this.gunModel[121].setRotationPoint(-19.0F, -14.5F, 2.0F);
/*     */     
/* 539 */     this.gunModel[122].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 540 */     this.gunModel[122].setRotationPoint(8.5F, -11.0F, 1.0F);
/*     */     
/* 542 */     this.gunModel[123].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 543 */     this.gunModel[123].setRotationPoint(60.5F, -23.75F, 2.0F);
/*     */     
/* 545 */     this.gunModel[124].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -2.0F, 0.0F, -0.15F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.55F, 0.0F, 0.0F, -1.55F);
/* 546 */     this.gunModel[124].setRotationPoint(60.5F, -24.6F, 2.0F);
/*     */     
/* 548 */     this.gunModel[125].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 549 */     this.gunModel[125].setRotationPoint(60.5F, -24.45F, 1.0F);
/*     */     
/* 551 */     this.gunModel[126].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 552 */     this.gunModel[126].setRotationPoint(60.5F, -23.75F, -1.0F);
/*     */     
/* 554 */     this.gunModel[127].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, -1.55F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F);
/* 555 */     this.gunModel[127].setRotationPoint(60.5F, -24.45F, -1.0F);
/*     */     
/* 557 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 558 */     this.gunModel[''].setRotationPoint(60.5F, -24.7F, 1.0F);
/*     */     
/* 560 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 561 */     this.gunModel[''].setRotationPoint(60.5F, -24.7F, 0.5F);
/*     */     
/* 563 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.8F, 0.0F, 0.0F, 1.55F);
/* 564 */     this.gunModel[''].setRotationPoint(28.5F, -15.25F, -1.3F);
/*     */     
/* 566 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 567 */     this.gunModel[''].setRotationPoint(28.5F, -15.25F, 1.5F);
/*     */     
/* 569 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.7F, 0.0F, -0.5F, -0.7F);
/* 570 */     this.gunModel[''].setRotationPoint(28.5F, -14.25F, 1.5F);
/*     */     
/* 572 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.25F, 0.8F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.7F, 0.0F, -0.75F, -0.7F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 573 */     this.gunModel[''].setRotationPoint(28.5F, -14.25F, 0.5F);
/*     */     
/* 575 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 2, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, -0.15F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.2F, 0.0F, 0.0F, -0.2F);
/* 576 */     this.gunModel[''].setRotationPoint(55.5F, -16.25F, 1.5F);
/*     */     
/* 578 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, -0.5F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, -0.7F, 0.0F, -0.5F, -0.7F);
/* 579 */     this.gunModel[''].setRotationPoint(55.5F, -15.25F, 1.5F);
/*     */     
/* 581 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 1, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.3F, 0.0F, 0.25F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.7F, 0.0F, 0.0F, -0.7F);
/* 582 */     this.gunModel[''].setRotationPoint(36.5F, -15.25F, 1.5F);
/*     */     
/* 584 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 1, 2, 0.0F, 0.0F, 0.25F, 0.3F, 0.0F, 1.0F, 0.3F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, -1.0F, -0.7F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 585 */     this.gunModel[''].setRotationPoint(36.5F, -15.25F, -0.5F);
/*     */     
/* 587 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.7F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -1.65F, -0.9F, 0.0F, -0.7F, -0.9F);
/* 588 */     this.gunModel[''].setRotationPoint(36.5F, -14.25F, 1.5F);
/*     */     
/* 590 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 19, 1, 1, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 1.0F, 0.3F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, -0.9F, 0.0F, -1.65F, -0.9F, 0.0F, -1.65F, 0.0F, 0.0F, -0.7F, 0.0F);
/* 591 */     this.gunModel[''].setRotationPoint(36.5F, -14.25F, 0.5F);
/*     */     
/* 593 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 2, 0.0F, 0.0F, -0.15F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, -0.15F, -0.2F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 594 */     this.gunModel[''].setRotationPoint(55.5F, -16.25F, -0.5F);
/*     */     
/* 596 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.15F, 0.8F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.7F, 0.0F, -0.65F, -0.7F, 0.0F, -0.65F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 597 */     this.gunModel[''].setRotationPoint(55.5F, -15.25F, 0.5F);
/*     */     
/* 599 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -1.6F, 0.0F, 0.65F, -0.4F, -0.75F, 0.65F, -0.4F, 0.0F, -0.65F, -2.35F, 0.0F, -0.65F, -1.6F, 0.0F, -0.65F, -0.4F, -0.75F, -0.65F, -0.4F);
/* 600 */     this.gunModel[''].setRotationPoint(46.0F, -20.95F, 0.65F);
/*     */     
/* 602 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.4F, 0.9F, 0.0F, 0.4F, 0.9F, 0.0F, 0.4F, 1.15F, 0.0F, 0.4F, 1.15F, 0.0F, -0.15F, 0.9F, 0.0F, -0.15F, 0.9F, 0.0F, -0.15F, 1.15F, 0.0F, -0.15F, 1.15F);
/* 603 */     this.gunModel[''].setRotationPoint(-5.0F, -20.35F, 0.85F);
/*     */     
/* 605 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 2, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.6F, 0.0F, -0.5F, 0.6F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, 0.6F);
/* 606 */     this.gunModel[''].setRotationPoint(-5.0F, -18.75F, -0.8F);
/*     */     
/* 608 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 4, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.6F, 0.0F, -0.5F, -0.05F, 0.0F, -0.25F, -0.65F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, -0.05F);
/* 609 */     this.gunModel[''].setRotationPoint(-6.0F, -18.75F, -0.8F);
/*     */     
/* 611 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.65F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.15F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 612 */     this.gunModel[''].setRotationPoint(-6.0F, -16.75F, -0.15F);
/*     */     
/* 614 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.65F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F);
/* 615 */     this.gunModel[''].setRotationPoint(-6.0F, -16.75F, 2.15F);
/*     */     
/* 617 */     this.gunModel[''].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 2, 4, 0.0F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.25F, -0.65F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.6F, 0.0F, -0.25F, -0.05F);
/* 618 */     this.gunModel[''].setRotationPoint(-6.0F, -20.0F, -0.8F);
/*     */     
/*     */ 
/* 621 */     this.defaultStockModel = new ModelRendererTurbo[36];
/* 622 */     this.defaultStockModel[0] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/* 623 */     this.defaultStockModel[1] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/* 624 */     this.defaultStockModel[2] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/* 625 */     this.defaultStockModel[3] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/* 626 */     this.defaultStockModel[4] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/* 627 */     this.defaultStockModel[5] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/* 628 */     this.defaultStockModel[6] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/* 629 */     this.defaultStockModel[7] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 630 */     this.defaultStockModel[8] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 631 */     this.defaultStockModel[9] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/* 632 */     this.defaultStockModel[10] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/* 633 */     this.defaultStockModel[11] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/* 634 */     this.defaultStockModel[12] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/* 635 */     this.defaultStockModel[13] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/* 636 */     this.defaultStockModel[14] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/* 637 */     this.defaultStockModel[15] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/* 638 */     this.defaultStockModel[16] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 639 */     this.defaultStockModel[17] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 640 */     this.defaultStockModel[18] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/* 641 */     this.defaultStockModel[19] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/* 642 */     this.defaultStockModel[20] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/* 643 */     this.defaultStockModel[21] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/* 644 */     this.defaultStockModel[22] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 645 */     this.defaultStockModel[23] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/* 646 */     this.defaultStockModel[24] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/* 647 */     this.defaultStockModel[25] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/* 648 */     this.defaultStockModel[26] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 649 */     this.defaultStockModel[27] = new ModelRendererTurbo(this, 17, 65, this.textureX, this.textureY);
/* 650 */     this.defaultStockModel[28] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/* 651 */     this.defaultStockModel[29] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/* 652 */     this.defaultStockModel[30] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/* 653 */     this.defaultStockModel[31] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/* 654 */     this.defaultStockModel[32] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/* 655 */     this.defaultStockModel[33] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/* 656 */     this.defaultStockModel[34] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/* 657 */     this.defaultStockModel[35] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*     */     
/* 659 */     this.defaultStockModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.25F, 0.0F, -1.2F, -0.25F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F);
/* 660 */     this.defaultStockModel[0].setRotationPoint(-5.0F, -23.55F, 2.15F);
/*     */     
/* 662 */     this.defaultStockModel[1].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 663 */     this.defaultStockModel[1].setRotationPoint(-5.0F, -24.15F, 0.75F);
/*     */     
/* 665 */     this.defaultStockModel[2].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 666 */     this.defaultStockModel[2].setRotationPoint(-5.0F, -24.15F, 0.3F);
/*     */     
/* 668 */     this.defaultStockModel[3].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.2F, -0.3F, 0.0F, -1.2F, -0.3F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 669 */     this.defaultStockModel[3].setRotationPoint(-5.0F, -23.55F, -0.15F);
/*     */     
/* 671 */     this.defaultStockModel[4].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 672 */     this.defaultStockModel[4].setRotationPoint(-5.0F, -24.15F, 1.45F);
/*     */     
/* 674 */     this.defaultStockModel[5].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 4, 1, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, -1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F);
/* 675 */     this.defaultStockModel[5].setRotationPoint(-5.0F, -22.25F, 2.8F);
/*     */     
/* 677 */     this.defaultStockModel[6].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 2, 3, 0.0F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 678 */     this.defaultStockModel[6].setRotationPoint(-6.0F, -15.0F, 0.0F);
/*     */     
/* 680 */     this.defaultStockModel[7].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 2, 1, 0.0F, 0.0F, -5.15F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -5.3F, -0.15F, 0.0F, 3.3F, -0.4F, 0.0F, 0.75F, -0.4F, 0.0F, 0.75F, -0.15F, 0.0F, 3.3F, -0.15F);
/* 681 */     this.defaultStockModel[7].setRotationPoint(-13.0F, -24.15F, 1.45F);
/*     */     
/* 683 */     this.defaultStockModel[8].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 2, 1, 0.0F, 0.0F, -5.15F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -5.15F, 0.1F, 0.0F, 3.25F, -0.4F, 0.0F, 0.75F, -0.4F, 0.0F, 0.75F, 0.1F, 0.0F, 3.25F, 0.1F);
/* 684 */     this.defaultStockModel[8].setRotationPoint(-13.0F, -24.15F, 0.75F);
/*     */     
/* 686 */     this.defaultStockModel[9].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 2, 1, 0.0F, 0.0F, -5.3F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -5.15F, -0.15F, 0.0F, 3.3F, -0.4F, 0.0F, 0.75F, -0.4F, 0.0F, 0.75F, -0.15F, 0.0F, 3.3F, -0.15F);
/* 687 */     this.defaultStockModel[9].setRotationPoint(-13.0F, -24.15F, 0.3F);
/*     */     
/* 689 */     this.defaultStockModel[10].addShapeBox(-3.0F, 5.0F, -1.5F, 23, 10, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.35F, 0.15F, 0.0F, -5.5F, 0.15F, 0.0F, -5.5F, 0.15F, 0.0F, 0.35F, 0.15F);
/* 690 */     this.defaultStockModel[10].setRotationPoint(-29.0F, -18.5F, 1.0F);
/*     */     
/* 692 */     this.defaultStockModel[11].addShapeBox(-3.0F, 5.0F, -1.5F, 21, 5, 1, 0.0F, 0.0F, 0.2F, -0.15F, 0.0F, 0.2F, -0.15F, 0.0F, 0.2F, 0.15F, 0.0F, 0.25F, 0.15F, 0.0F, 0.6F, -0.15F, 0.0F, -4.75F, -0.15F, 0.0F, -4.75F, -0.35F, 0.0F, 0.6F, -0.35F);
/* 693 */     this.defaultStockModel[11].setRotationPoint(-29.0F, -13.75F, 2.0F);
/*     */     
/* 695 */     this.defaultStockModel[12].addShapeBox(-3.0F, 5.0F, -1.5F, 9, 4, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.775F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.525F, 0.15F);
/* 696 */     this.defaultStockModel[12].setRotationPoint(-15.0F, -18.5F, 2.0F);
/*     */     
/* 698 */     this.defaultStockModel[13].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.25F, -0.15F, 0.0F, -1.25F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 699 */     this.defaultStockModel[13].setRotationPoint(-29.0F, -20.1F, 1.45F);
/*     */     
/* 701 */     this.defaultStockModel[14].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, -0.4F, 0.0F, -1.1F, 0.1F, 0.0F, -1.1F, 0.1F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F);
/* 702 */     this.defaultStockModel[14].setRotationPoint(-29.0F, -20.1F, 0.75F);
/*     */     
/* 704 */     this.defaultStockModel[15].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.25F, -0.4F, 0.0F, -1.25F, -0.4F, 0.0F, -1.1F, -0.15F, 0.0F, -1.1F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 705 */     this.defaultStockModel[15].setRotationPoint(-29.0F, -20.1F, 0.3F);
/*     */     
/* 707 */     this.defaultStockModel[16].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.05F);
/* 708 */     this.defaultStockModel[16].setRotationPoint(-29.0F, -19.5F, 2.15F);
/*     */     
/* 710 */     this.defaultStockModel[17].addShapeBox(-3.0F, 5.0F, -1.5F, 16, 1, 1, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.4F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 711 */     this.defaultStockModel[17].setRotationPoint(-29.0F, -19.5F, -0.15F);
/*     */     
/* 713 */     this.defaultStockModel[18].addShapeBox(-3.0F, 5.0F, -1.5F, 14, 2, 1, 0.0F, 0.0F, 0.85F, 0.3F, 0.0F, 0.85F, 0.3F, 0.0F, 0.85F, 0.3F, 0.0F, 0.85F, 0.3F, 0.0F, -2.25F, 0.3F, 0.0F, -2.25F, 0.3F, 0.0F, -2.25F, 0.3F, 0.0F, -2.25F, 0.3F);
/* 714 */     this.defaultStockModel[18].setRotationPoint(-29.0F, -18.0F, 1.0F);
/*     */     
/* 716 */     this.defaultStockModel[19].addShapeBox(-3.0F, 5.0F, -1.5F, 10, 4, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.525F, -0.15F, 0.0F, 0.5F, -0.15F, 0.0F, 0.5F, 0.15F, 0.0F, 0.525F, 0.15F);
/* 717 */     this.defaultStockModel[19].setRotationPoint(-29.0F, -18.5F, 2.0F);
/*     */     
/* 719 */     this.defaultStockModel[20].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, 0.15F, 0.0F, 0.775F, 0.15F);
/* 720 */     this.defaultStockModel[20].setRotationPoint(-19.0F, -18.5F, 2.0F);
/*     */     
/* 722 */     this.defaultStockModel[21].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.775F, -0.15F);
/* 723 */     this.defaultStockModel[21].setRotationPoint(-19.0F, -16.5F, 2.0F);
/*     */     
/* 725 */     this.defaultStockModel[22].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, -2.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.7F, -2.0F, 0.775F, -0.7F);
/* 726 */     this.defaultStockModel[22].setRotationPoint(-21.0F, -16.0F, 3.0F);
/*     */     
/* 728 */     this.defaultStockModel[23].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, -2.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, -2.0F, -0.25F, -0.7F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.7F, 0.0F, 0.775F, -0.7F);
/* 729 */     this.defaultStockModel[23].setRotationPoint(-21.0F, -17.5F, 3.0F);
/*     */     
/* 731 */     this.defaultStockModel[24].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, 0.775F, -0.15F, -2.0F, 0.75F, -0.15F, -2.0F, 0.75F, -0.7F, 0.0F, 0.775F, -0.7F);
/* 732 */     this.defaultStockModel[24].setRotationPoint(-15.0F, -16.0F, 3.0F);
/*     */     
/* 734 */     this.defaultStockModel[25].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, -2.0F, -0.25F, -0.15F, -2.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, 0.775F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.7F, 0.0F, 0.775F, -0.7F);
/* 735 */     this.defaultStockModel[25].setRotationPoint(-15.0F, -17.5F, 3.0F);
/*     */     
/* 737 */     this.defaultStockModel[26].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.7F);
/* 738 */     this.defaultStockModel[26].setRotationPoint(-19.0F, -17.5F, 3.0F);
/*     */     
/* 740 */     this.defaultStockModel[27].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 1, 1, 0.0F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, 0.0F, -0.225F, -0.7F);
/* 741 */     this.defaultStockModel[27].setRotationPoint(-19.0F, -15.0F, 3.0F);
/*     */     
/* 743 */     this.defaultStockModel[28].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 3, 1, 0.0F, -0.5F, -0.75F, 0.35F, 0.0F, -0.75F, -0.15F, 0.0F, -0.75F, -0.7F, -0.5F, -0.75F, -0.7F, -0.5F, -0.225F, -0.15F, 0.0F, -0.25F, -0.15F, 0.0F, -0.25F, -0.7F, -0.5F, -0.225F, -0.7F);
/* 744 */     this.defaultStockModel[28].setRotationPoint(-17.75F, -17.5F, 3.0F);
/*     */     
/* 746 */     this.defaultStockModel[29].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, -5.3F, 0.0F, 0.0F, -1.2F, -0.2F, 0.0F, -0.65F, -0.15F, 0.0F, -4.7F, -0.15F, 0.0F, 4.3F, 0.0F, 0.0F, 4.3F, 0.0F, 0.0F, 4.3F, -0.15F, 0.0F, 4.3F, -0.15F);
/* 747 */     this.defaultStockModel[29].setRotationPoint(-13.0F, -23.55F, -0.15F);
/*     */     
/* 749 */     this.defaultStockModel[30].addShapeBox(-3.0F, 5.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, -4.7F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, -1.2F, -0.25F, 0.0F, -5.2F, -0.1F, 0.0F, 4.3F, -0.15F, 0.0F, 4.3F, -0.15F, 0.0F, 4.3F, 0.0F, 0.0F, 4.3F, 0.0F);
/* 750 */     this.defaultStockModel[30].setRotationPoint(-13.0F, -23.55F, 2.15F);
/*     */     
/* 752 */     this.defaultStockModel[31].addShapeBox(-3.0F, 5.0F, -1.5F, 4, 4, 1, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F);
/* 753 */     this.defaultStockModel[31].setRotationPoint(-5.0F, -22.25F, -0.1F);
/*     */     
/* 755 */     this.defaultStockModel[32].addShapeBox(-3.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 756 */     this.defaultStockModel[32].setRotationPoint(-8.0F, -14.0F, 0.15F);
/*     */     
/* 758 */     this.defaultStockModel[33].addShapeBox(-3.0F, 5.0F, -1.5F, 23, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 759 */     this.defaultStockModel[33].setRotationPoint(-29.0F, -18.25F, -0.15F);
/*     */     
/* 761 */     this.defaultStockModel[34].addShapeBox(-3.0F, 5.0F, -1.5F, 21, 5, 1, 0.0F, 0.0F, 0.25F, 0.05F, 0.0F, 0.25F, 0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.25F, -0.05F, 0.0F, 0.6F, -0.35F, 0.0F, -4.75F, -0.35F, 0.0F, -4.75F, 0.0F, 0.0F, 0.6F, 0.0F);
/* 762 */     this.defaultStockModel[34].setRotationPoint(-29.0F, -13.75F, -0.1F);
/*     */     
/* 764 */     this.defaultStockModel[35].addShapeBox(-3.0F, 5.0F, -1.5F, 1, 1, 5, 0.0F, 0.0F, -1.25F, -0.85F, 0.0F, -1.25F, -0.85F, 0.0F, -1.25F, -0.85F, 0.0F, -1.25F, -0.85F, 0.0F, 0.75F, -0.85F, 0.0F, 0.75F, -0.85F, 0.0F, 0.75F, -0.85F, 0.0F, 0.75F, -0.85F);
/* 765 */     this.defaultStockModel[35].setRotationPoint(-6.0F, -17.0F, -1.0F);
/*     */     
/*     */ 
/* 768 */     this.ammoModel = new ModelRendererTurbo[1];
/* 769 */     this.ammoModel[0] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*     */     
/* 771 */     this.ammoModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 10, 15, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 772 */     this.ammoModel[0].setRotationPoint(17.0F, -15.0F, 0.0F);
/* 773 */     this.ammoModel[0].rotateAngleZ = 0.08726646F;
/*     */     
/*     */ 
/* 776 */     this.slideModel = new ModelRendererTurbo[4];
/* 777 */     this.slideModel[0] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/* 778 */     this.slideModel[1] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/* 779 */     this.slideModel[2] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/* 780 */     this.slideModel[3] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*     */     
/* 782 */     this.slideModel[0].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.45F, 0.0F, 0.25F, 0.45F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, 0.25F, 0.0F, -0.4F, 0.45F, 0.0F, -0.4F, 0.45F);
/* 783 */     this.slideModel[0].setRotationPoint(20.0F, -20.35F, 0.85F);
/*     */     
/* 785 */     this.slideModel[1].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, -1.0F, -0.35F, 0.0F, -1.0F, -0.35F, 0.0F, -0.65F, -0.15F, 0.0F, -0.65F, -0.15F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 786 */     this.slideModel[1].setRotationPoint(20.0F, -20.5F, -0.2F);
/*     */     
/* 788 */     this.slideModel[2].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, -0.3F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.45F, 0.0F, -0.25F, 0.45F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 789 */     this.slideModel[2].setRotationPoint(20.0F, -19.25F, -0.15F);
/*     */     
/* 791 */     this.slideModel[3].addShapeBox(-3.0F, 5.0F, -1.5F, 6, 1, 1, 0.0F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F, 0.85F, 0.0F, 0.25F, 0.85F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.85F, 0.0F, -0.25F, 0.85F);
/* 792 */     this.slideModel[3].setRotationPoint(20.0F, -21.35F, 0.85F);
/*     */     
/*     */ 
/*     */ 
/* 796 */     translateAll(0.0F, -5.0F, 0.0F);
/* 797 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.09F, 0.0F);
/*     */     
/*     */ 
/* 800 */     this.gunSlideDistance = 0.0F;
/* 801 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/*     */ 
/* 805 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelg3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */