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
/*     */ public class ModelAA12
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public ModelAA12()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo['±'];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 17, 81, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 289, 81, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 473, 81, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 41, 89, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 105, 89, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 321, 89, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 369, 89, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 65, 97, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 121, 97, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 105, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 105, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/* 176 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/* 177 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 178 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/* 179 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/* 180 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/* 181 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/* 182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/* 184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 401, 121, this.textureX, this.textureY);
/* 185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/* 186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 201, 97, this.textureX, this.textureY);
/* 188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/* 189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 41, 89, this.textureX, this.textureY);
/* 190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/* 193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/* 194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/* 195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 97, 105, this.textureX, this.textureY);
/* 196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 305, 113, this.textureX, this.textureY);
/* 197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/* 198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 337, 129, this.textureX, this.textureY);
/*     */     
/* 200 */     this.gunModel[0].addShapeBox(37.0F, -19.0F, -5.5F, 3, 3, 9, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 201 */     this.gunModel[0].setRotationPoint(-41.0F, 13.0F, 1.0F);
/*     */     
/* 203 */     this.gunModel[1].addShapeBox(37.0F, -19.0F, -5.5F, 5, 3, 9, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 204 */     this.gunModel[1].setRotationPoint(-43.0F, 16.0F, 1.0F);
/*     */     
/* 206 */     this.gunModel[2].addShapeBox(37.0F, -19.0F, -5.5F, 7, 3, 9, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 207 */     this.gunModel[2].setRotationPoint(-45.0F, 19.0F, 1.0F);
/*     */     
/* 209 */     this.gunModel[3].addShapeBox(37.0F, -19.0F, -5.5F, 9, 3, 9, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 210 */     this.gunModel[3].setRotationPoint(-47.0F, 22.0F, 1.0F);
/*     */     
/* 212 */     this.gunModel[4].addShapeBox(37.0F, -19.0F, -5.5F, 10, 4, 9, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[4].setRotationPoint(-48.0F, 25.0F, 1.0F);
/*     */     
/* 215 */     this.gunModel[5].addShapeBox(37.0F, -19.0F, -5.5F, 9, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[5].setRotationPoint(-47.0F, 29.0F, 1.0F);
/*     */     
/* 218 */     this.gunModel[6].addShapeBox(37.0F, -19.0F, -5.5F, 9, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 219 */     this.gunModel[6].setRotationPoint(-47.0F, 31.0F, 1.0F);
/*     */     
/* 221 */     this.gunModel[7].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 9, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 222 */     this.gunModel[7].setRotationPoint(-41.0F, 11.0F, 1.0F);
/*     */     
/* 224 */     this.gunModel[8].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 225 */     this.gunModel[8].setRotationPoint(-41.0F, 9.0F, 1.0F);
/*     */     
/* 227 */     this.gunModel[9].addShapeBox(37.0F, -19.0F, -5.5F, 5, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 228 */     this.gunModel[9].setRotationPoint(-43.0F, 8.0F, 1.0F);
/*     */     
/* 230 */     this.gunModel[10].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 9, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 231 */     this.gunModel[10].setRotationPoint(-31.0F, 11.0F, 1.0F);
/*     */     
/* 233 */     this.gunModel[11].addShapeBox(37.0F, -19.0F, -5.5F, 2, 6, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 234 */     this.gunModel[11].setRotationPoint(-31.25F, 11.0F, 1.0F);
/*     */     
/* 236 */     this.gunModel[12].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 9, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 237 */     this.gunModel[12].setRotationPoint(-31.0F, 15.0F, 1.0F);
/*     */     
/* 239 */     this.gunModel[13].addShapeBox(37.0F, -19.0F, -5.5F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 240 */     this.gunModel[13].setRotationPoint(-38.0F, 29.0F, 1.0F);
/*     */     
/* 242 */     this.gunModel[14].addShapeBox(37.0F, -19.0F, -5.5F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 243 */     this.gunModel[14].setRotationPoint(-38.0F, 26.0F, 1.0F);
/*     */     
/* 245 */     this.gunModel[15].addShapeBox(37.0F, -19.0F, -5.5F, 6, 8, 9, 0.0F, 0.0F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 246 */     this.gunModel[15].setRotationPoint(-38.0F, 18.0F, 1.0F);
/*     */     
/* 248 */     this.gunModel[16].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 9, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.75F, -0.5F, 0.0F);
/* 249 */     this.gunModel[16].setRotationPoint(-31.0F, 17.0F, 1.0F);
/*     */     
/* 251 */     this.gunModel[17].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 252 */     this.gunModel[17].setRotationPoint(-31.25F, 17.0F, 1.0F);
/*     */     
/* 254 */     this.gunModel[18].addShapeBox(37.0F, -19.0F, -5.5F, 7, 8, 9, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 255 */     this.gunModel[18].setRotationPoint(-38.25F, 11.0F, 1.0F);
/*     */     
/* 257 */     this.gunModel[19].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 8, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.25F, 1.0F, 0.0F);
/* 258 */     this.gunModel[19].setRotationPoint(-29.0F, 16.5F, 1.5F);
/*     */     
/* 260 */     this.gunModel[20].addShapeBox(37.0F, -19.0F, -5.5F, 2, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 261 */     this.gunModel[20].setRotationPoint(-27.0F, 16.5F, 1.5F);
/*     */     
/* 263 */     this.gunModel[21].addShapeBox(37.0F, -19.0F, -5.5F, 8, 3, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.35F, -0.5F, 0.0F, 0.35F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.45F, -0.75F, 0.0F, 0.45F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 264 */     this.gunModel[21].setRotationPoint(-25.0F, 16.5F, 1.5F);
/*     */     
/* 266 */     this.gunModel[22].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 267 */     this.gunModel[22].setRotationPoint(-24.25F, 18.75F, 1.5F);
/*     */     
/* 269 */     this.gunModel[23].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 270 */     this.gunModel[23].setRotationPoint(-24.25F, 19.75F, 1.5F);
/*     */     
/* 272 */     this.gunModel[24].addShapeBox(37.0F, -19.0F, -5.5F, 23, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 273 */     this.gunModel[24].setRotationPoint(-38.0F, 8.0F, 1.0F);
/*     */     
/* 275 */     this.gunModel[25].addShapeBox(37.0F, -19.0F, -5.5F, 27, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 276 */     this.gunModel[25].setRotationPoint(-42.5F, 5.0F, 0.0F);
/*     */     
/* 278 */     this.gunModel[26].addShapeBox(37.0F, -19.0F, -5.5F, 2, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 279 */     this.gunModel[26].setRotationPoint(-44.5F, 5.0F, 0.0F);
/*     */     
/* 281 */     this.gunModel[27].addShapeBox(37.0F, -19.0F, -5.5F, 58, 4, 11, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.5F, -2.0F);
/* 282 */     this.gunModel[27].setRotationPoint(-1.0F, 3.0F, 0.0F);
/*     */     
/* 284 */     this.gunModel[28].addShapeBox(37.0F, -19.0F, -5.5F, 58, 9, 11, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 285 */     this.gunModel[28].setRotationPoint(-1.0F, -6.0F, 0.0F);
/*     */     
/* 287 */     this.gunModel[29].addShapeBox(37.0F, -19.0F, -5.5F, 58, 4, 2, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 288 */     this.gunModel[29].setRotationPoint(-1.0F, -10.0F, 0.0F);
/*     */     
/* 290 */     this.gunModel[30].addShapeBox(37.0F, -19.0F, -5.5F, 41, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 291 */     this.gunModel[30].setRotationPoint(-42.5F, 3.0F, 0.0F);
/*     */     
/* 293 */     this.gunModel[31].addShapeBox(37.0F, -19.0F, -5.5F, 41, 10, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 294 */     this.gunModel[31].setRotationPoint(-42.5F, -7.0F, 3.0F);
/*     */     
/* 296 */     this.gunModel[32].addShapeBox(37.0F, -19.0F, -5.5F, 49, 3, 2, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 297 */     this.gunModel[32].setRotationPoint(-50.5F, -10.5F, 0.0F);
/*     */     
/* 299 */     this.gunModel[33].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 300 */     this.gunModel[33].setRotationPoint(-46.5F, 5.0F, 0.0F);
/*     */     
/* 302 */     this.gunModel[34].addShapeBox(37.0F, -19.0F, -5.5F, 4, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 303 */     this.gunModel[34].setRotationPoint(-50.5F, 5.0F, 0.0F);
/*     */     
/* 305 */     this.gunModel[35].addShapeBox(37.0F, -19.0F, -5.5F, 45, 2, 11, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.5F, 0.0F);
/* 306 */     this.gunModel[35].setRotationPoint(-95.5F, 5.0F, 0.0F);
/*     */     
/* 308 */     this.gunModel[36].addShapeBox(37.0F, -19.0F, -5.5F, 44, 13, 11, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 10.28F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.28F, 0.0F);
/* 309 */     this.gunModel[36].setRotationPoint(-94.5F, -8.0F, 0.0F);
/*     */     
/* 311 */     this.gunModel[37].addShapeBox(37.0F, -19.0F, -5.5F, 1, 15, 11, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 10.5F, 0.0F, 0.0F, 10.28F, 0.0F, 0.0F, 10.28F, 0.0F, 0.0F, 10.5F, 0.0F);
/* 312 */     this.gunModel[37].setRotationPoint(-95.5F, -10.0F, 0.0F);
/*     */     
/* 314 */     this.gunModel[38].addShapeBox(37.0F, -19.0F, -5.5F, 8, 12, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 315 */     this.gunModel[38].setRotationPoint(-50.5F, -7.5F, 0.0F);
/*     */     
/* 317 */     this.gunModel[39].addShapeBox(37.0F, -19.0F, -5.5F, 44, 3, 11, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 318 */     this.gunModel[39].setRotationPoint(-94.5F, -10.5F, 0.0F);
/*     */     
/* 320 */     this.gunModel[40].addShapeBox(37.0F, -19.0F, -5.5F, 34, 6, 10, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 321 */     this.gunModel[40].setRotationPoint(12.0F, -5.0F, 1.5F);
/*     */     
/* 323 */     this.gunModel[41].addShapeBox(37.0F, -19.0F, -5.5F, 2, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 324 */     this.gunModel[41].setRotationPoint(10.0F, -5.0F, 1.5F);
/*     */     
/* 326 */     this.gunModel[42].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 10, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 327 */     this.gunModel[42].setRotationPoint(46.0F, -3.5F, 1.5F);
/*     */     
/* 329 */     this.gunModel[43].addShapeBox(37.0F, -19.0F, -5.5F, 2, 8, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 330 */     this.gunModel[43].setRotationPoint(57.0F, -5.5F, 1.0F);
/*     */     
/* 332 */     this.gunModel[44].addShapeBox(37.0F, -19.0F, -5.5F, 38, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 333 */     this.gunModel[44].setRotationPoint(58.5F, -2.0F, 3.0F);
/*     */     
/* 335 */     this.gunModel[45].addShapeBox(37.0F, -19.0F, -5.5F, 21, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 336 */     this.gunModel[45].setRotationPoint(76.0F, -2.5F, 2.5F);
/*     */     
/* 338 */     this.gunModel[46].addShapeBox(37.0F, -19.0F, -5.5F, 2, 28, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, 1.5F, -0.75F, 0.0F, -1.5F, -0.75F, 0.0F);
/* 339 */     this.gunModel[46].setRotationPoint(-17.0F, 10.5F, 1.0F);
/*     */     
/* 341 */     this.gunModel[47].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 342 */     this.gunModel[47].setRotationPoint(-38.0F, 32.0F, 1.0F);
/*     */     
/* 344 */     this.gunModel[48].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 345 */     this.gunModel[48].setRotationPoint(-38.0F, 33.0F, 1.0F);
/*     */     
/* 347 */     this.gunModel[49].addShapeBox(37.0F, -19.0F, -5.5F, 13, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F);
/* 348 */     this.gunModel[49].setRotationPoint(-35.0F, 34.0F, 1.0F);
/*     */     
/* 350 */     this.gunModel[50].addShapeBox(37.0F, -19.0F, -5.5F, 6, 1, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 351 */     this.gunModel[50].setRotationPoint(-44.0F, 33.0F, 1.0F);
/*     */     
/* 353 */     this.gunModel[51].addShapeBox(37.0F, -19.0F, -5.5F, 6, 2, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F);
/* 354 */     this.gunModel[51].setRotationPoint(-41.0F, 34.0F, 1.5F);
/*     */     
/* 356 */     this.gunModel[52].addShapeBox(37.0F, -19.0F, -5.5F, 7, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F);
/* 357 */     this.gunModel[52].setRotationPoint(-35.0F, 36.0F, 1.0F);
/*     */     
/* 359 */     this.gunModel[53].addShapeBox(37.0F, -19.0F, -5.5F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 360 */     this.gunModel[53].setRotationPoint(-28.0F, 38.0F, 1.0F);
/*     */     
/* 362 */     this.gunModel[54].addShapeBox(37.0F, -19.0F, -5.5F, 6, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 363 */     this.gunModel[54].setRotationPoint(-22.0F, 36.0F, 1.0F);
/*     */     
/* 365 */     this.gunModel[55].addShapeBox(37.0F, -19.0F, -5.5F, 6, 2, 9, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 366 */     this.gunModel[55].setRotationPoint(-28.0F, 36.0F, 1.0F);
/*     */     
/* 368 */     this.gunModel[56].addShapeBox(37.0F, -19.0F, -5.5F, 7, 1, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 369 */     this.gunModel[56].setRotationPoint(-35.0F, 35.0F, 1.0F);
/*     */     
/* 371 */     this.gunModel[57].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 372 */     this.gunModel[57].setRotationPoint(-27.5F, 11.0F, 3.0F);
/*     */     
/* 374 */     this.gunModel[58].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 375 */     this.gunModel[58].setRotationPoint(-27.5F, 12.0F, 3.0F);
/*     */     
/* 377 */     this.gunModel[59].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 378 */     this.gunModel[59].setRotationPoint(-27.25F, 14.0F, 3.0F);
/*     */     
/* 380 */     this.gunModel[60].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 381 */     this.gunModel[60].setRotationPoint(-26.5F, 16.0F, 3.0F);
/*     */     
/* 383 */     this.gunModel[61].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 384 */     this.gunModel[61].setRotationPoint(-16.0F, 38.0F, 1.0F);
/*     */     
/* 386 */     this.gunModel[62].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 9, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 387 */     this.gunModel[62].setRotationPoint(-14.0F, 37.25F, 1.0F);
/*     */     
/* 389 */     this.gunModel[63].addShapeBox(37.0F, -19.0F, -5.5F, 2, 8, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 390 */     this.gunModel[63].setRotationPoint(-36.5F, -17.0F, 2.0F);
/*     */     
/* 392 */     this.gunModel[64].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 393 */     this.gunModel[64].setRotationPoint(-36.5F, -18.0F, 2.0F);
/*     */     
/* 395 */     this.gunModel[65].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 396 */     this.gunModel[65].setRotationPoint(-36.5F, -19.0F, 2.0F);
/*     */     
/* 398 */     this.gunModel[66].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 399 */     this.gunModel[66].setRotationPoint(-36.5F, -19.5F, 2.0F);
/*     */     
/* 401 */     this.gunModel[67].addShapeBox(37.0F, -19.0F, -5.5F, 4, 5, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.25F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.25F, -1.5F, 0.0F);
/* 402 */     this.gunModel[67].setRotationPoint(-38.5F, -23.5F, 2.0F);
/*     */     
/* 404 */     this.gunModel[68].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 405 */     this.gunModel[68].setRotationPoint(-35.5F, -24.5F, 2.0F);
/*     */     
/* 407 */     this.gunModel[69].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F);
/* 408 */     this.gunModel[69].setRotationPoint(-37.5F, -24.5F, 2.0F);
/*     */     
/* 410 */     this.gunModel[70].addShapeBox(37.0F, -19.0F, -5.5F, 2, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F);
/* 411 */     this.gunModel[70].setRotationPoint(-39.75F, -20.0F, 2.0F);
/*     */     
/* 413 */     this.gunModel[71].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 414 */     this.gunModel[71].setRotationPoint(-42.75F, -11.5F, 2.0F);
/*     */     
/* 416 */     this.gunModel[72].addShapeBox(37.0F, -19.0F, -5.5F, 2, 10, 1, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 417 */     this.gunModel[72].setRotationPoint(52.5F, -19.0F, 2.0F);
/*     */     
/* 419 */     this.gunModel[73].addShapeBox(37.0F, -19.0F, -5.5F, 2, 4, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 420 */     this.gunModel[73].setRotationPoint(53.5F, -22.0F, 2.0F);
/*     */     
/* 422 */     this.gunModel[74].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 423 */     this.gunModel[74].setRotationPoint(55.5F, -22.5F, 2.0F);
/*     */     
/* 425 */     this.gunModel[75].addShapeBox(37.0F, -19.0F, -5.5F, 1, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 426 */     this.gunModel[75].setRotationPoint(57.0F, -20.5F, 2.0F);
/*     */     
/* 428 */     this.gunModel[76].addShapeBox(37.0F, -19.0F, -5.5F, 1, 9, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 429 */     this.gunModel[76].setRotationPoint(54.5F, -19.5F, 2.5F);
/*     */     
/* 431 */     this.gunModel[77].addShapeBox(37.0F, -19.0F, -5.5F, 1, 5, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 432 */     this.gunModel[77].setRotationPoint(55.5F, -15.5F, 2.5F);
/*     */     
/* 434 */     this.gunModel[78].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 435 */     this.gunModel[78].setRotationPoint(55.5F, -18.0F, 2.5F);
/*     */     
/* 437 */     this.gunModel[79].addShapeBox(37.0F, -19.0F, -5.5F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 438 */     this.gunModel[79].setRotationPoint(3.0F, -12.0F, 4.0F);
/*     */     
/* 440 */     this.gunModel[80].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 3, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 441 */     this.gunModel[80].setRotationPoint(9.0F, -12.0F, 4.0F);
/*     */     
/* 443 */     this.gunModel[81].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 444 */     this.gunModel[81].setRotationPoint(10.0F, -11.0F, 4.0F);
/*     */     
/* 446 */     this.gunModel[82].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 447 */     this.gunModel[82].setRotationPoint(7.0F, -11.0F, 4.0F);
/*     */     
/* 449 */     this.gunModel[83].addShapeBox(37.0F, -19.0F, -5.5F, 4, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 450 */     this.gunModel[83].setRotationPoint(3.0F, -11.0F, 4.0F);
/*     */     
/* 452 */     this.gunModel[84].addShapeBox(37.0F, -19.0F, -5.5F, 4, 1, 3, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 453 */     this.gunModel[84].setRotationPoint(3.0F, -11.5F, 4.0F);
/*     */     
/* 455 */     this.gunModel[85].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 3, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, -1.0F, 0.5F, 0.25F);
/* 456 */     this.gunModel[85].setRotationPoint(2.0F, -12.0F, 4.0F);
/*     */     
/* 458 */     this.gunModel[86].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 459 */     this.gunModel[86].setRotationPoint(3.0F, -14.0F, 4.5F);
/*     */     
/* 461 */     this.gunModel[87].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 2, 0.0F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 462 */     this.gunModel[87].setRotationPoint(3.5F, -16.0F, 4.5F);
/*     */     
/* 464 */     this.gunModel[88].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 2, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.5F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -1.5F, -0.75F, 0.25F);
/* 465 */     this.gunModel[88].setRotationPoint(5.5F, -16.0F, 4.5F);
/*     */     
/* 467 */     this.gunModel[89].addShapeBox(37.0F, -19.0F, -5.5F, 1, 4, 2, 0.0F, 2.0F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.25F, 2.0F, -0.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 468 */     this.gunModel[89].setRotationPoint(9.0F, -15.0F, 4.5F);
/*     */     
/* 470 */     this.gunModel[90].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 2, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 471 */     this.gunModel[90].setRotationPoint(4.5F, -18.0F, 4.5F);
/*     */     
/* 473 */     this.gunModel[91].addShapeBox(37.0F, -19.0F, -5.5F, 4, 1, 2, 0.0F, -2.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 474 */     this.gunModel[91].setRotationPoint(4.5F, -19.0F, 4.5F);
/*     */     
/* 476 */     this.gunModel[92].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 2, 0.0F, -1.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 477 */     this.gunModel[92].setRotationPoint(5.5F, -18.0F, 4.5F);
/*     */     
/* 479 */     this.gunModel[93].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 480 */     this.gunModel[93].setRotationPoint(5.5F, -17.0F, 4.5F);
/*     */     
/* 482 */     this.gunModel[94].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 2, 0.0F, -2.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F);
/* 483 */     this.gunModel[94].setRotationPoint(4.5F, -18.0F, 4.5F);
/*     */     
/* 485 */     this.gunModel[95].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 486 */     this.gunModel[95].setRotationPoint(55.5F, -23.25F, 5.0F);
/*     */     
/* 488 */     this.gunModel[96].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 489 */     this.gunModel[96].setRotationPoint(55.5F, -22.5F, 5.0F);
/*     */     
/* 491 */     this.gunModel[97].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 492 */     this.gunModel[97].setRotationPoint(55.5F, -23.75F, 5.0F);
/*     */     
/* 494 */     this.gunModel[98].addShapeBox(37.0F, -19.0F, -5.5F, 1, 13, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 495 */     this.gunModel[98].setRotationPoint(57.0F, -20.5F, 5.0F);
/*     */     
/* 497 */     this.gunModel[99].addShapeBox(37.0F, -19.0F, -5.5F, 1, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 498 */     this.gunModel[99].setRotationPoint(55.5F, -15.5F, 4.5F);
/*     */     
/* 500 */     this.gunModel[100].addShapeBox(37.0F, -19.0F, -5.5F, 1, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 501 */     this.gunModel[100].setRotationPoint(55.5F, -20.0F, 4.5F);
/*     */     
/* 503 */     this.gunModel[101].addShapeBox(37.0F, -19.0F, -5.5F, 3, 10, 1, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 504 */     this.gunModel[101].setRotationPoint(53.5F, -19.0F, 5.0F);
/*     */     
/* 506 */     this.gunModel[102].addShapeBox(37.0F, -19.0F, -5.5F, 1, 4, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 507 */     this.gunModel[102].setRotationPoint(54.5F, -22.0F, 5.0F);
/*     */     
/* 509 */     this.gunModel[103].addShapeBox(37.0F, -19.0F, -5.5F, 1, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 510 */     this.gunModel[103].setRotationPoint(57.0F, -20.5F, 8.0F);
/*     */     
/* 512 */     this.gunModel[104].addShapeBox(37.0F, -19.0F, -5.5F, 2, 10, 1, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 513 */     this.gunModel[104].setRotationPoint(52.5F, -19.0F, 8.0F);
/*     */     
/* 515 */     this.gunModel[105].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 516 */     this.gunModel[105].setRotationPoint(55.5F, -22.5F, 8.0F);
/*     */     
/* 518 */     this.gunModel[106].addShapeBox(37.0F, -19.0F, -5.5F, 2, 4, 1, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 519 */     this.gunModel[106].setRotationPoint(53.5F, -22.0F, 8.0F);
/*     */     
/* 521 */     this.gunModel[107].addShapeBox(37.0F, -19.0F, -5.5F, 2, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 522 */     this.gunModel[107].setRotationPoint(10.0F, -5.0F, -0.5F);
/*     */     
/* 524 */     this.gunModel[108].addShapeBox(37.0F, -19.0F, -5.5F, 34, 6, 10, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 525 */     this.gunModel[108].setRotationPoint(12.0F, -5.0F, -0.5F);
/*     */     
/* 527 */     this.gunModel[109].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 10, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 528 */     this.gunModel[109].setRotationPoint(46.0F, -3.5F, -0.5F);
/*     */     
/* 530 */     this.gunModel[110].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 11, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 531 */     this.gunModel[110].setRotationPoint(-95.5F, -9.5F, 0.0F);
/*     */     
/* 533 */     this.gunModel[111].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 5, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 534 */     this.gunModel[111].setRotationPoint(54.5F, -21.0F, 3.0F);
/*     */     
/* 536 */     this.gunModel[112].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 537 */     this.gunModel[112].setRotationPoint(-42.75F, -11.5F, 3.0F);
/*     */     
/* 539 */     this.gunModel[113].addShapeBox(37.0F, -19.0F, -5.5F, 2, 8, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 540 */     this.gunModel[113].setRotationPoint(-36.5F, -17.0F, 8.0F);
/*     */     
/* 542 */     this.gunModel[114].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 543 */     this.gunModel[114].setRotationPoint(-36.5F, -18.0F, 8.0F);
/*     */     
/* 545 */     this.gunModel[115].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 546 */     this.gunModel[115].setRotationPoint(-36.5F, -19.0F, 8.0F);
/*     */     
/* 548 */     this.gunModel[116].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 549 */     this.gunModel[116].setRotationPoint(-36.5F, -19.5F, 8.0F);
/*     */     
/* 551 */     this.gunModel[117].addShapeBox(37.0F, -19.0F, -5.5F, 2, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F);
/* 552 */     this.gunModel[117].setRotationPoint(-39.75F, -20.0F, 8.0F);
/*     */     
/* 554 */     this.gunModel[118].addShapeBox(37.0F, -19.0F, -5.5F, 4, 5, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.25F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.25F, -1.5F, 0.0F);
/* 555 */     this.gunModel[118].setRotationPoint(-38.5F, -23.5F, 8.0F);
/*     */     
/* 557 */     this.gunModel[119].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 558 */     this.gunModel[119].setRotationPoint(-35.5F, -24.5F, 8.0F);
/*     */     
/* 560 */     this.gunModel[120].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F);
/* 561 */     this.gunModel[120].setRotationPoint(-37.5F, -24.5F, 8.0F);
/*     */     
/* 563 */     this.gunModel[121].addShapeBox(37.0F, -19.0F, -5.5F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.5F, 0.5F, -3.0F, 0.5F, 0.5F, -3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F);
/* 564 */     this.gunModel[121].setRotationPoint(-38.75F, -20.0F, 7.0F);
/*     */     
/* 566 */     this.gunModel[122].addShapeBox(37.0F, -19.0F, -5.5F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.5F, 0.5F, -3.0F, 0.5F, 0.5F, -3.0F, 0.5F, 0.0F, 3.0F, 0.5F, 0.0F);
/* 567 */     this.gunModel[122].setRotationPoint(-38.75F, -20.0F, 3.5F);
/*     */     
/* 569 */     this.gunModel[123].addShapeBox(37.0F, -19.0F, -5.5F, 1, 8, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 570 */     this.gunModel[123].setRotationPoint(-36.5F, -17.0F, 7.0F);
/*     */     
/* 572 */     this.gunModel[124].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 573 */     this.gunModel[124].setRotationPoint(-36.5F, -18.0F, 7.0F);
/*     */     
/* 575 */     this.gunModel[125].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 576 */     this.gunModel[125].setRotationPoint(-36.5F, -19.0F, 7.0F);
/*     */     
/* 578 */     this.gunModel[126].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 579 */     this.gunModel[126].setRotationPoint(-36.5F, -19.5F, 7.0F);
/*     */     
/* 581 */     this.gunModel[127].addShapeBox(37.0F, -19.0F, -5.5F, 2, 5, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.25F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.25F, -1.5F, 0.0F);
/* 582 */     this.gunModel[127].setRotationPoint(-37.5F, -23.5F, 7.0F);
/*     */     
/* 584 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 2, 5, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.25F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.25F, -1.5F, 0.0F);
/* 585 */     this.gunModel[''].setRotationPoint(-37.5F, -23.5F, 3.0F);
/*     */     
/* 587 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 588 */     this.gunModel[''].setRotationPoint(-36.5F, -18.0F, 3.0F);
/*     */     
/* 590 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 591 */     this.gunModel[''].setRotationPoint(-36.5F, -19.0F, 3.0F);
/*     */     
/* 593 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F);
/* 594 */     this.gunModel[''].setRotationPoint(-36.5F, -19.5F, 3.0F);
/*     */     
/* 596 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 8, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 597 */     this.gunModel[''].setRotationPoint(-36.5F, -17.0F, 3.0F);
/*     */     
/* 599 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 13, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 600 */     this.gunModel[''].setRotationPoint(57.0F, -20.5F, 3.0F);
/*     */     
/* 602 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 13, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 603 */     this.gunModel[''].setRotationPoint(57.0F, -20.5F, 6.0F);
/*     */     
/* 605 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 58, 4, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 606 */     this.gunModel[''].setRotationPoint(-1.0F, -10.0F, 8.0F);
/*     */     
/* 608 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 45, 4, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 609 */     this.gunModel[''].setRotationPoint(12.0F, -10.0F, 2.0F);
/*     */     
/* 611 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 49, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 612 */     this.gunModel[''].setRotationPoint(-50.5F, -10.5F, 8.0F);
/*     */     
/* 614 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 17, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 615 */     this.gunModel[''].setRotationPoint(-50.5F, -10.5F, 2.0F);
/*     */     
/* 617 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 45, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 618 */     this.gunModel[''].setRotationPoint(-33.0F, -10.5F, 2.0F);
/*     */     
/* 620 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 45, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 621 */     this.gunModel[''].setRotationPoint(-33.0F, -10.5F, 7.0F);
/*     */     
/* 623 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 45, 3, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 624 */     this.gunModel[''].setRotationPoint(-33.0F, -10.5F, 3.0F);
/*     */     
/* 626 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 627 */     this.gunModel[''].setRotationPoint(-33.0F, -10.5F, 6.0F);
/*     */     
/* 629 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 630 */     this.gunModel[''].setRotationPoint(-33.0F, -10.5F, 4.0F);
/*     */     
/* 632 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 7, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 633 */     this.gunModel[''].setRotationPoint(56.5F, -20.5F, 2.0F);
/*     */     
/* 635 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 27, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F);
/* 636 */     this.gunModel[''].setRotationPoint(-42.5F, 8.0F, 10.0F);
/*     */     
/* 638 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 27, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 639 */     this.gunModel[''].setRotationPoint(-42.5F, 8.0F, 0.0F);
/*     */     
/* 641 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 9, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 642 */     this.gunModel[''].setRotationPoint(57.0F, -7.0F, 1.0F);
/*     */     
/* 644 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 645 */     this.gunModel[''].setRotationPoint(57.0F, -8.5F, 2.5F);
/*     */     
/* 647 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, -0.35F, 0.0F, 0.5F, -0.35F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F);
/* 648 */     this.gunModel[''].setRotationPoint(-38.75F, -20.0F, 5.0F);
/*     */     
/* 650 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 6, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 651 */     this.gunModel[''].setRotationPoint(3.75F, -10.5F, 4.0F);
/*     */     
/* 653 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.5F, 0.05F, 0.0F, 0.5F, 0.05F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, -0.3F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 654 */     this.gunModel[''].setRotationPoint(-40.25F, -16.0F, 5.0F);
/*     */     
/* 656 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 657 */     this.gunModel[''].setRotationPoint(57.0F, 1.5F, 1.0F);
/*     */     
/* 659 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 1, 0.0F, -0.65F, 0.0F, 0.5F, 0.6F, 0.0F, 0.5F, 0.6F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, 0.4F, 0.0F, 0.5F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, -1.0F, 0.4F, 0.0F, -1.0F);
/* 660 */     this.gunModel[''].setRotationPoint(-39.75F, -19.0F, 5.0F);
/*     */     
/* 662 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 3, 1, 0.0F, -0.65F, 0.0F, 0.5F, 0.6F, 0.0F, 0.5F, 0.6F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, 0.4F, 0.0F, 0.5F, -0.45F, 0.0F, 0.5F, -0.45F, 0.0F, -1.0F, 0.4F, 0.0F, -1.0F);
/* 663 */     this.gunModel[''].setRotationPoint(-39.75F, -19.0F, 6.5F);
/*     */     
/* 665 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 4, 1, 0.0F, -0.95F, 0.0F, 0.5F, 0.85F, 0.0F, 0.5F, 0.85F, 0.0F, -1.0F, -0.95F, 0.0F, -1.0F, 0.45F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.45F, 0.0F, -1.0F);
/* 666 */     this.gunModel[''].setRotationPoint(-41.45F, -15.0F, 5.0F);
/*     */     
/* 668 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 4, 1, 0.0F, -0.95F, 0.0F, 0.5F, 0.85F, 0.0F, 0.5F, 0.85F, 0.0F, -1.0F, -0.95F, 0.0F, -1.0F, 0.45F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.45F, 0.0F, -1.0F);
/* 669 */     this.gunModel[''].setRotationPoint(-41.45F, -15.0F, 6.5F);
/*     */     
/* 671 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 3, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 672 */     this.gunModel[''].setRotationPoint(-36.5F, -11.0F, 4.0F);
/*     */     
/* 674 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 3, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 675 */     this.gunModel[''].setRotationPoint(-36.5F, -19.0F, 4.0F);
/*     */     
/* 677 */     this.gunModel[''].addShapeBox(37.0F, -19.0F, -5.5F, 1, 8, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F);
/* 678 */     this.gunModel[''].setRotationPoint(-36.5F, -18.0F, 4.0F);
/*     */     
/* 680 */     this.gunModel[' '].addShapeBox(37.0F, -19.0F, -5.5F, 1, 8, 1, 0.0F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 681 */     this.gunModel[' '].setRotationPoint(-36.5F, -18.0F, 6.0F);
/*     */     
/* 683 */     this.gunModel['¡'].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 12, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 684 */     this.gunModel['¡'].setRotationPoint(52.5F, -3.0F, -0.5F);
/*     */     
/* 686 */     this.gunModel['¢'].addShapeBox(37.0F, -19.0F, -5.5F, 18, 10, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 687 */     this.gunModel['¢'].setRotationPoint(-42.5F, -7.0F, 0.0F);
/*     */     
/* 689 */     this.gunModel['£'].addShapeBox(37.0F, -19.0F, -5.5F, 23, 3, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 690 */     this.gunModel['£'].setRotationPoint(-24.0F, -7.0F, 0.0F);
/*     */     
/* 692 */     this.gunModel['¤'].addShapeBox(37.0F, -19.0F, -5.5F, 23, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 693 */     this.gunModel['¤'].setRotationPoint(-24.0F, 2.0F, 0.0F);
/*     */     
/* 695 */     this.gunModel['¥'].addShapeBox(37.0F, -19.0F, -5.5F, 2, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 696 */     this.gunModel['¥'].setRotationPoint(-3.0F, -4.0F, 0.0F);
/*     */     
/* 698 */     this.gunModel['¦'].addShapeBox(37.0F, -19.0F, -5.5F, 2, 2, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 699 */     this.gunModel['¦'].setRotationPoint(-91.75F, -11.5F, 4.0F);
/*     */     
/* 701 */     this.gunModel['§'].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 702 */     this.gunModel['§'].setRotationPoint(-43.75F, -11.5F, 4.5F);
/*     */     
/* 704 */     this.gunModel['¨'].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 705 */     this.gunModel['¨'].setRotationPoint(-37.75F, -21.25F, 4.0F);
/*     */     
/* 707 */     this.gunModel['©'].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 708 */     this.gunModel['©'].setRotationPoint(-37.75F, -23.25F, 4.0F);
/*     */     
/* 710 */     this.gunModel['ª'].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 711 */     this.gunModel['ª'].setRotationPoint(-37.75F, -23.25F, 6.0F);
/*     */     
/* 713 */     this.gunModel['«'].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 2, 0.0F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 714 */     this.gunModel['«'].setRotationPoint(57.0F, -5.5F, 4.5F);
/*     */     
/* 716 */     this.gunModel['¬'].addShapeBox(37.0F, -19.0F, -5.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 717 */     this.gunModel['¬'].setRotationPoint(57.0F, -4.5F, 4.5F);
/*     */     
/* 719 */     this.gunModel['­'].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 12, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F);
/* 720 */     this.gunModel['­'].setRotationPoint(53.5F, -4.0F, -0.5F);
/*     */     
/* 722 */     this.gunModel['®'].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 12, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 723 */     this.gunModel['®'].setRotationPoint(53.5F, -2.0F, -0.5F);
/*     */     
/* 725 */     this.gunModel['¯'].addShapeBox(37.0F, -19.0F, -5.5F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 726 */     this.gunModel['¯'].setRotationPoint(-2.0F, 5.5F, 0.0F);
/*     */     
/* 728 */     this.gunModel['°'].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 729 */     this.gunModel['°'].setRotationPoint(-2.0F, 5.0F, 0.0F);
/*     */     
/*     */ 
/* 732 */     this.ammoModel = new ModelRendererTurbo[12];
/* 733 */     this.ammoModel[0] = new ModelRendererTurbo(this, 337, 121, this.textureX, this.textureY);
/* 734 */     this.ammoModel[1] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/* 735 */     this.ammoModel[2] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/* 736 */     this.ammoModel[3] = new ModelRendererTurbo(this, 177, 129, this.textureX, this.textureY);
/* 737 */     this.ammoModel[4] = new ModelRendererTurbo(this, 209, 129, this.textureX, this.textureY);
/* 738 */     this.ammoModel[5] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/* 739 */     this.ammoModel[6] = new ModelRendererTurbo(this, 313, 129, this.textureX, this.textureY);
/* 740 */     this.ammoModel[7] = new ModelRendererTurbo(this, 449, 129, this.textureX, this.textureY);
/* 741 */     this.ammoModel[8] = new ModelRendererTurbo(this, 481, 129, this.textureX, this.textureY);
/* 742 */     this.ammoModel[9] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 743 */     this.ammoModel[10] = new ModelRendererTurbo(this, 49, 137, this.textureX, this.textureY);
/* 744 */     this.ammoModel[11] = new ModelRendererTurbo(this, 81, 137, this.textureX, this.textureY);
/*     */     
/* 746 */     this.ammoModel[0].addShapeBox(37.0F, -19.0F, -5.5F, 13, 8, 33, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 747 */     this.ammoModel[0].setRotationPoint(-14.75F, 8.0F, -12.0F);
/*     */     
/* 749 */     this.ammoModel[1].addShapeBox(37.0F, -19.0F, -5.5F, 13, 17, 33, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 750 */     this.ammoModel[1].setRotationPoint(-14.25F, 16.0F, -12.0F);
/*     */     
/* 752 */     this.ammoModel[2].addShapeBox(37.0F, -19.0F, -5.5F, 13, 8, 33, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -8.0F, 0.5F, 0.0F, -8.0F, 0.5F, 0.0F, -8.0F, -0.5F, 0.0F, -8.0F);
/* 753 */     this.ammoModel[2].setRotationPoint(-13.75F, 33.0F, -12.0F);
/*     */     
/* 755 */     this.ammoModel[3].addShapeBox(37.0F, -19.0F, -5.5F, 13, 8, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 756 */     this.ammoModel[3].setRotationPoint(-14.25F, 16.0F, -13.0F);
/*     */     
/* 758 */     this.ammoModel[4].addShapeBox(37.0F, -19.0F, -5.5F, 13, 8, 1, 0.0F, 0.25F, 0.5F, 1.0F, -0.25F, 0.5F, 1.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.05F, 0.0F, -1.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 759 */     this.ammoModel[4].setRotationPoint(-13.75F, 25.0F, -13.0F);
/*     */     
/* 761 */     this.ammoModel[5].addShapeBox(37.0F, -19.0F, -5.5F, 13, 1, 3, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/* 762 */     this.ammoModel[5].setRotationPoint(-15.25F, 7.0F, -3.0F);
/*     */     
/* 764 */     this.ammoModel[6].addShapeBox(37.0F, -19.0F, -5.5F, 13, 1, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F);
/* 765 */     this.ammoModel[6].setRotationPoint(-15.25F, 7.0F, 9.0F);
/*     */     
/* 767 */     this.ammoModel[7].addShapeBox(37.0F, -19.0F, -5.5F, 13, 8, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 768 */     this.ammoModel[7].setRotationPoint(-13.75F, 25.0F, 21.0F);
/*     */     
/* 770 */     this.ammoModel[8].addShapeBox(37.0F, -19.0F, -5.5F, 13, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 1.0F, -0.25F, 0.5F, 1.0F);
/* 771 */     this.ammoModel[8].setRotationPoint(-14.25F, 16.0F, 21.0F);
/*     */     
/* 773 */     this.ammoModel[9].addShapeBox(37.0F, -19.0F, -5.5F, 13, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -7.5F, -0.5F, 0.0F, -7.5F);
/* 774 */     this.ammoModel[9].setRotationPoint(-13.25F, 41.0F, 5.0F);
/*     */     
/* 776 */     this.ammoModel[10].addShapeBox(37.0F, -19.0F, -5.5F, 13, 1, 7, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, -7.5F, 0.5F, 0.0F, -7.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/* 777 */     this.ammoModel[10].setRotationPoint(-13.25F, 41.0F, -3.0F);
/*     */     
/* 779 */     this.ammoModel[11].addShapeBox(37.0F, -19.0F, -5.5F, 13, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 780 */     this.ammoModel[11].setRotationPoint(-14.75F, 5.0F, 0.5F);
/*     */     
/*     */ 
/* 783 */     this.slideModel = new ModelRendererTurbo[11];
/* 784 */     this.slideModel[0] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/* 785 */     this.slideModel[1] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/* 786 */     this.slideModel[2] = new ModelRendererTurbo(this, 57, 129, this.textureX, this.textureY);
/* 787 */     this.slideModel[3] = new ModelRendererTurbo(this, 473, 113, this.textureX, this.textureY);
/* 788 */     this.slideModel[4] = new ModelRendererTurbo(this, 105, 129, this.textureX, this.textureY);
/* 789 */     this.slideModel[5] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/* 790 */     this.slideModel[6] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/* 791 */     this.slideModel[7] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/* 792 */     this.slideModel[8] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/* 793 */     this.slideModel[9] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/* 794 */     this.slideModel[10] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/*     */     
/* 796 */     this.slideModel[0].addShapeBox(37.0F, -19.0F, -5.5F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 797 */     this.slideModel[0].setRotationPoint(-24.0F, -1.0F, 1.0F);
/*     */     
/* 799 */     this.slideModel[1].addShapeBox(37.0F, -19.0F, -5.5F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 800 */     this.slideModel[1].setRotationPoint(-24.0F, -4.0F, 2.0F);
/*     */     
/* 802 */     this.slideModel[2].addShapeBox(37.0F, -19.0F, -5.5F, 18, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 803 */     this.slideModel[2].setRotationPoint(-21.0F, -1.0F, 1.0F);
/*     */     
/* 805 */     this.slideModel[3].addShapeBox(37.0F, -19.0F, -5.5F, 18, 2, 1, 0.0F, 0.0F, 0.5F, 1.25F, 0.0F, 0.5F, 1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 806 */     this.slideModel[3].setRotationPoint(-21.0F, 0.0F, 2.0F);
/*     */     
/* 808 */     this.slideModel[4].addShapeBox(37.0F, -19.0F, -5.5F, 18, 3, 1, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 809 */     this.slideModel[4].setRotationPoint(-21.0F, -4.0F, 2.0F);
/*     */     
/* 811 */     this.slideModel[5].addShapeBox(37.0F, -19.0F, -5.5F, 5, 2, 2, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 812 */     this.slideModel[5].setRotationPoint(-21.0F, -3.0F, 1.0F);
/*     */     
/* 814 */     this.slideModel[6].addShapeBox(37.0F, -19.0F, -5.5F, 3, 2, 2, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 815 */     this.slideModel[6].setRotationPoint(-16.0F, -3.0F, 1.0F);
/*     */     
/* 817 */     this.slideModel[7].addShapeBox(37.0F, -19.0F, -5.5F, 5, 1, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 818 */     this.slideModel[7].setRotationPoint(-13.0F, -2.0F, 1.0F);
/*     */     
/* 820 */     this.slideModel[8].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 821 */     this.slideModel[8].setRotationPoint(-7.5F, -2.0F, 1.0F);
/*     */     
/* 823 */     this.slideModel[9].addShapeBox(37.0F, -19.0F, -5.5F, 1, 1, 2, 0.0F, 0.0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 824 */     this.slideModel[9].setRotationPoint(-8.0F, -2.0F, 1.0F);
/*     */     
/* 826 */     this.slideModel[10].addShapeBox(37.0F, -19.0F, -5.5F, 3, 1, 2, 0.0F, 0.0F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.1F, 0.5F, 0.4F, -0.1F, 0.5F, 0.4F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F);
/* 827 */     this.slideModel[10].setRotationPoint(-6.5F, -3.5F, 1.0F);
/*     */     
/*     */ 
/*     */ 
/* 831 */     translateAll(0.0F, -8.0F, 0.0F);
/* 832 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.06F, 0.0F);
/*     */     
/* 834 */     this.gunSlideDistance = 0.0F;
/* 835 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 838 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\ModelAA12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */