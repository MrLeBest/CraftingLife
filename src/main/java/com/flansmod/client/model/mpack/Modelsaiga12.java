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
/*     */ public class Modelsaiga12
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelsaiga12()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo['Ô'];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 281, 97, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 417, 97, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 465, 113, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 305, 121, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 353, 121, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 401, 89, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 25, 129, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 185, 137, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 281, 145, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 401, 129, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 441, 137, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 65, 145, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 465, 145, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 25, 153, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 409, 153, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 49, 169, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 105, 169, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 177, 177, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 433, 177, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 41, 185, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 105, 193, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 241, 193, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 313, 193, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 385, 193, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 449, 193, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 41, 201, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 41, 217, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 449, 169, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 209, 209, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 385, 209, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 217, 233, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 329, 233, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 377, 233, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 457, 209, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 185, 257, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 185, 265, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 249, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 257, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 209, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 241, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 273, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 241, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/* 176 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 177 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/* 178 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/* 179 */     this.gunModel[''] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/* 180 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/* 181 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/* 182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/* 185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/* 187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/* 189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/* 190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/* 192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/* 193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 193, 249, this.textureX, this.textureY);
/* 195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 241, 249, this.textureX, this.textureY);
/* 196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 145, 121, this.textureX, this.textureY);
/* 197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 417, 249, this.textureX, this.textureY);
/* 198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/* 202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/* 203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/* 208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/* 209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/* 210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/* 211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/* 212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/* 213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/* 214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 281, 97, this.textureX, this.textureY);
/* 215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/* 216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 65, 129, this.textureX, this.textureY);
/* 217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/* 218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/* 220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/* 222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/* 223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/* 225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 265, 137, this.textureX, this.textureY);
/* 226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 177, 105, this.textureX, this.textureY);
/* 227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 257, 289, this.textureX, this.textureY);
/* 228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 73, 297, this.textureX, this.textureY);
/* 229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 313, 297, this.textureX, this.textureY);
/* 230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 433, 297, this.textureX, this.textureY);
/* 231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 81, 305, this.textureX, this.textureY);
/* 232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 305, 305, this.textureX, this.textureY);
/* 233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 361, 305, this.textureX, this.textureY);
/*     */     
/* 235 */     this.gunModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -2.25F, 2.0F);
/* 236 */     this.gunModel[0].setRotationPoint(22.5F, -10.0F, -13.0F);
/*     */     
/* 238 */     this.gunModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F);
/* 239 */     this.gunModel[1].setRotationPoint(25.5F, -10.0F, -13.0F);
/*     */     
/* 241 */     this.gunModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 15, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 242 */     this.gunModel[2].setRotationPoint(22.5F, -25.0F, -15.0F);
/*     */     
/* 244 */     this.gunModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 5, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 245 */     this.gunModel[3].setRotationPoint(37.5F, -16.0F, -15.0F);
/*     */     
/* 247 */     this.gunModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 34, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F);
/* 248 */     this.gunModel[4].setRotationPoint(42.5F, -16.0F, -15.0F);
/*     */     
/* 250 */     this.gunModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 3, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.75F, -2.0F);
/* 251 */     this.gunModel[5].setRotationPoint(76.5F, -16.0F, -15.0F);
/*     */     
/* 253 */     this.gunModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 254 */     this.gunModel[6].setRotationPoint(79.5F, -16.0F, -15.0F);
/*     */     
/* 256 */     this.gunModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 6, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 257 */     this.gunModel[7].setRotationPoint(37.5F, -25.0F, -15.0F);
/*     */     
/* 259 */     this.gunModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 2, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 260 */     this.gunModel[8].setRotationPoint(43.5F, -25.0F, -15.0F);
/*     */     
/* 262 */     this.gunModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 35, 8, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 263 */     this.gunModel[9].setRotationPoint(45.5F, -24.0F, -15.0F);
/*     */     
/* 265 */     this.gunModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 266 */     this.gunModel[10].setRotationPoint(53.5F, -25.0F, -15.0F);
/*     */     
/* 268 */     this.gunModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 16, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 269 */     this.gunModel[11].setRotationPoint(55.5F, -25.0F, -15.0F);
/*     */     
/* 271 */     this.gunModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 272 */     this.gunModel[12].setRotationPoint(73.5F, -25.0F, -15.0F);
/*     */     
/* 274 */     this.gunModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 16, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 275 */     this.gunModel[13].setRotationPoint(75.5F, -25.0F, -15.0F);
/*     */     
/* 277 */     this.gunModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 16, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 278 */     this.gunModel[14].setRotationPoint(75.5F, -26.75F, -15.0F);
/*     */     
/* 280 */     this.gunModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 39, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 281 */     this.gunModel[15].setRotationPoint(41.5F, -28.75F, -15.0F);
/*     */     
/* 283 */     this.gunModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 16, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 284 */     this.gunModel[16].setRotationPoint(56.0F, -26.75F, -15.0F);
/*     */     
/* 286 */     this.gunModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 287 */     this.gunModel[17].setRotationPoint(41.5F, -26.75F, -15.0F);
/*     */     
/* 289 */     this.gunModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 290 */     this.gunModel[18].setRotationPoint(41.5F, -36.75F, -13.0F);
/*     */     
/* 292 */     this.gunModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 33, 3, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 293 */     this.gunModel[19].setRotationPoint(42.5F, -36.75F, -13.0F);
/*     */     
/* 295 */     this.gunModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 296 */     this.gunModel[20].setRotationPoint(75.5F, -35.75F, -13.0F);
/*     */     
/* 298 */     this.gunModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 17, 11, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 299 */     this.gunModel[21].setRotationPoint(20.5F, -35.75F, -13.0F);
/*     */     
/* 301 */     this.gunModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 10, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 302 */     this.gunModel[22].setRotationPoint(10.5F, -35.75F, -13.0F);
/*     */     
/* 304 */     this.gunModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 39, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 305 */     this.gunModel[23].setRotationPoint(41.5F, -33.75F, -15.0F);
/*     */     
/* 307 */     this.gunModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 15, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 308 */     this.gunModel[24].setRotationPoint(22.5F, -16.0F, -15.0F);
/*     */     
/* 310 */     this.gunModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 311 */     this.gunModel[25].setRotationPoint(39.5F, -28.75F, -15.0F);
/*     */     
/* 313 */     this.gunModel[26].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 314 */     this.gunModel[26].setRotationPoint(39.5F, -33.75F, -15.0F);
/*     */     
/* 316 */     this.gunModel[27].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 317 */     this.gunModel[27].setRotationPoint(39.5F, -35.75F, -13.0F);
/*     */     
/* 319 */     this.gunModel[28].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 320 */     this.gunModel[28].setRotationPoint(37.5F, -35.25F, -11.5F);
/*     */     
/* 322 */     this.gunModel[29].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 323 */     this.gunModel[29].setRotationPoint(37.5F, -29.25F, -11.5F);
/*     */     
/* 325 */     this.gunModel[30].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 326 */     this.gunModel[30].setRotationPoint(37.5F, -32.25F, -11.5F);
/*     */     
/* 328 */     this.gunModel[31].addShapeBox(59.0F, -19.0F, 7.0F, 48, 15, 16, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 329 */     this.gunModel[31].setRotationPoint(-84.5F, -20.75F, -15.0F);
/*     */     
/* 331 */     this.gunModel[32].addShapeBox(59.0F, -19.0F, 7.0F, 44, 4, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.75F, 0.0F, 0.25F, -3.75F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 332 */     this.gunModel[32].setRotationPoint(-24.5F, -9.75F, -15.0F);
/*     */     
/* 334 */     this.gunModel[33].addShapeBox(59.0F, -19.0F, 7.0F, 2, 18, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.75F, 0.0F, 0.75F, -2.5F, 0.0F, 0.75F, -2.5F, 0.0F, 0.0F, -3.75F, 0.0F);
/* 335 */     this.gunModel[33].setRotationPoint(19.75F, -23.75F, -15.0F);
/*     */     
/* 337 */     this.gunModel[34].addShapeBox(59.0F, -19.0F, 7.0F, 12, 15, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 338 */     this.gunModel[34].setRotationPoint(-36.5F, -20.75F, -15.0F);
/*     */     
/* 340 */     this.gunModel[35].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 341 */     this.gunModel[35].setRotationPoint(-36.5F, -7.75F, -15.0F);
/*     */     
/* 343 */     this.gunModel[36].addShapeBox(59.0F, -19.0F, 7.0F, 8, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 344 */     this.gunModel[36].setRotationPoint(-35.5F, -5.75F, -11.0F);
/*     */     
/* 346 */     this.gunModel[37].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 347 */     this.gunModel[37].setRotationPoint(-27.5F, -7.75F, -15.0F);
/*     */     
/* 349 */     this.gunModel[38].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 350 */     this.gunModel[38].setRotationPoint(-26.5F, -7.75F, -15.0F);
/*     */     
/* 352 */     this.gunModel[39].addShapeBox(59.0F, -19.0F, 7.0F, 30, 6, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 353 */     this.gunModel[39].setRotationPoint(-12.5F, -20.75F, -15.0F);
/*     */     
/* 355 */     this.gunModel[40].addShapeBox(59.0F, -19.0F, 7.0F, 30, 3, 16, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 356 */     this.gunModel[40].setRotationPoint(-12.5F, -13.75F, -15.0F);
/*     */     
/* 358 */     this.gunModel[41].addShapeBox(59.0F, -19.0F, 7.0F, 2, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 359 */     this.gunModel[41].setRotationPoint(17.75F, -20.75F, -15.0F);
/*     */     
/* 361 */     this.gunModel[42].addShapeBox(59.0F, -19.0F, 7.0F, 12, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 362 */     this.gunModel[42].setRotationPoint(-24.5F, -20.75F, -15.0F);
/*     */     
/* 364 */     this.gunModel[43].addShapeBox(59.0F, -19.0F, 7.0F, 30, 7, 15, 0.0F, 0.0F, -3.0F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F);
/* 365 */     this.gunModel[43].setRotationPoint(-12.5F, -19.75F, -14.5F);
/*     */     
/* 367 */     this.gunModel[44].addBox(59.0F, -19.0F, 7.0F, 41, 7, 7, 0.0F);
/* 368 */     this.gunModel[44].setRotationPoint(85.0F, -23.25F, -10.5F);
/*     */     
/* 370 */     this.gunModel[45].addBox(59.0F, -19.0F, 7.0F, 3, 8, 9, 0.0F);
/* 371 */     this.gunModel[45].setRotationPoint(82.0F, -24.25F, -11.5F);
/*     */     
/* 373 */     this.gunModel[46].addShapeBox(59.0F, -19.0F, 7.0F, 2, 10, 16, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 374 */     this.gunModel[46].setRotationPoint(80.0F, -25.75F, -15.0F);
/*     */     
/* 376 */     this.gunModel[47].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 16, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, -0.5F, -0.25F, -2.0F);
/* 377 */     this.gunModel[47].setRotationPoint(80.0F, -15.75F, -15.0F);
/*     */     
/* 379 */     this.gunModel[48].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 380 */     this.gunModel[48].setRotationPoint(80.0F, -28.75F, -15.0F);
/*     */     
/* 382 */     this.gunModel[49].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 383 */     this.gunModel[49].setRotationPoint(80.0F, -33.75F, -15.0F);
/*     */     
/* 385 */     this.gunModel[50].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 12, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 386 */     this.gunModel[50].setRotationPoint(80.0F, -34.75F, -13.0F);
/*     */     
/* 388 */     this.gunModel[51].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F);
/* 389 */     this.gunModel[51].setRotationPoint(82.0F, -16.25F, -11.5F);
/*     */     
/* 391 */     this.gunModel[52].addBox(59.0F, -19.0F, 7.0F, 20, 7, 7, 0.0F);
/* 392 */     this.gunModel[52].setRotationPoint(126.0F, -23.25F, -10.5F);
/*     */     
/* 394 */     this.gunModel[53].addShapeBox(59.0F, -19.0F, 7.0F, 21, 5, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 395 */     this.gunModel[53].setRotationPoint(85.0F, -23.75F, -11.0F);
/*     */     
/* 397 */     this.gunModel[54].addShapeBox(59.0F, -19.0F, 7.0F, 14, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 398 */     this.gunModel[54].setRotationPoint(146.0F, -23.75F, -11.0F);
/*     */     
/* 400 */     this.gunModel[55].addBox(59.0F, -19.0F, 7.0F, 2, 7, 7, 0.0F);
/* 401 */     this.gunModel[55].setRotationPoint(160.0F, -23.75F, -10.5F);
/*     */     
/* 403 */     this.gunModel[56].addShapeBox(59.0F, -19.0F, 7.0F, 4, 6, 8, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 404 */     this.gunModel[56].setRotationPoint(148.75F, -29.75F, -11.0F);
/*     */     
/* 406 */     this.gunModel[57].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 407 */     this.gunModel[57].setRotationPoint(158.25F, -29.75F, -11.0F);
/*     */     
/* 409 */     this.gunModel[58].addShapeBox(59.0F, -19.0F, 7.0F, 7, 5, 8, 0.0F, -2.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 410 */     this.gunModel[58].setRotationPoint(152.25F, -34.75F, -11.0F);
/*     */     
/* 412 */     this.gunModel[59].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/* 413 */     this.gunModel[59].setRotationPoint(154.25F, -37.25F, -11.0F);
/*     */     
/* 415 */     this.gunModel[60].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/* 416 */     this.gunModel[60].setRotationPoint(154.25F, -37.25F, -4.5F);
/*     */     
/* 418 */     this.gunModel[61].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 419 */     this.gunModel[61].setRotationPoint(154.25F, -37.25F, -7.5F);
/*     */     
/* 421 */     this.gunModel[62].addBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F);
/* 422 */     this.gunModel[62].setRotationPoint(82.0F, -32.25F, -11.5F);
/*     */     
/* 424 */     this.gunModel[63].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 425 */     this.gunModel[63].setRotationPoint(82.0F, -34.25F, -11.5F);
/*     */     
/* 427 */     this.gunModel[64].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 428 */     this.gunModel[64].setRotationPoint(82.0F, -28.25F, -11.5F);
/*     */     
/* 430 */     this.gunModel[65].addShapeBox(59.0F, -19.0F, 7.0F, 22, 3, 3, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 431 */     this.gunModel[65].setRotationPoint(85.0F, -33.5F, -10.5F);
/*     */     
/* 433 */     this.gunModel[66].addShapeBox(59.0F, -19.0F, 7.0F, 22, 15, 6, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 434 */     this.gunModel[66].setRotationPoint(83.0F, -29.25F, -10.0F);
/*     */     
/* 436 */     this.gunModel[67].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 437 */     this.gunModel[67].setRotationPoint(148.0F, -16.25F, -9.5F);
/*     */     
/* 439 */     this.gunModel[68].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 440 */     this.gunModel[68].setRotationPoint(-35.5F, -0.75F, -11.0F);
/*     */     
/* 442 */     this.gunModel[69].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 443 */     this.gunModel[69].setRotationPoint(-35.5F, 1.25F, -11.0F);
/*     */     
/* 445 */     this.gunModel[70].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 446 */     this.gunModel[70].setRotationPoint(-35.5F, -7.75F, -15.0F);
/*     */     
/* 448 */     this.gunModel[71].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 449 */     this.gunModel[71].setRotationPoint(-29.5F, -0.75F, -9.0F);
/*     */     
/* 451 */     this.gunModel[72].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 452 */     this.gunModel[72].setRotationPoint(-30.0F, 1.25F, -9.0F);
/*     */     
/* 454 */     this.gunModel[73].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 455 */     this.gunModel[73].setRotationPoint(-30.0F, 2.25F, -9.0F);
/*     */     
/* 457 */     this.gunModel[74].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 458 */     this.gunModel[74].setRotationPoint(-28.0F, 3.25F, -9.0F);
/*     */     
/* 460 */     this.gunModel[75].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 461 */     this.gunModel[75].setRotationPoint(-28.0F, 4.25F, -9.0F);
/*     */     
/* 463 */     this.gunModel[76].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 464 */     this.gunModel[76].setRotationPoint(-28.0F, -6.75F, -9.0F);
/*     */     
/* 466 */     this.gunModel[77].addShapeBox(59.0F, -19.0F, 7.0F, 1, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 467 */     this.gunModel[77].setRotationPoint(-36.0F, -6.75F, -9.5F);
/*     */     
/* 469 */     this.gunModel[78].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 470 */     this.gunModel[78].setRotationPoint(-36.0F, 5.25F, -9.5F);
/*     */     
/* 472 */     this.gunModel[79].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 5, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 473 */     this.gunModel[79].setRotationPoint(-53.75F, 7.25F, -9.5F);
/*     */     
/* 475 */     this.gunModel[80].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 476 */     this.gunModel[80].setRotationPoint(-55.5F, 5.25F, -9.5F);
/*     */     
/* 478 */     this.gunModel[81].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 479 */     this.gunModel[81].setRotationPoint(-55.75F, 1.25F, -9.5F);
/*     */     
/* 481 */     this.gunModel[82].addShapeBox(59.0F, -19.0F, 7.0F, 28, 17, 16, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -1.0F, 0.0F, 8.5F, -1.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 8.5F, -1.0F);
/* 482 */     this.gunModel[82].setRotationPoint(-114.5F, -21.25F, -15.0F);
/*     */     
/* 484 */     this.gunModel[83].addShapeBox(59.0F, -19.0F, 7.0F, 49, 28, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 8.5F, -1.0F, 0.0F, -8.5F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, 8.5F, -1.0F);
/* 485 */     this.gunModel[83].setRotationPoint(-163.5F, -15.25F, -14.0F);
/*     */     
/* 487 */     this.gunModel[84].addShapeBox(59.0F, -19.0F, 7.0F, 10, 4, 14, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F);
/* 488 */     this.gunModel[84].setRotationPoint(-124.5F, -20.25F, -14.0F);
/*     */     
/* 490 */     this.gunModel[85].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.2F, 0.0F, 1.0F, -0.2F, 0.0F, 1.0F, -0.25F);
/* 491 */     this.gunModel[85].setRotationPoint(-126.5F, -20.25F, -14.0F);
/*     */     
/* 493 */     this.gunModel[86].addShapeBox(59.0F, -19.0F, 7.0F, 42, 5, 14, 0.0F, 0.0F, -4.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -4.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F);
/* 494 */     this.gunModel[86].setRotationPoint(-168.5F, -20.25F, -14.0F);
/*     */     
/* 496 */     this.gunModel[87].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 497 */     this.gunModel[87].setRotationPoint(-172.5F, -17.25F, -13.0F);
/*     */     
/* 499 */     this.gunModel[88].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 500 */     this.gunModel[88].setRotationPoint(-172.5F, -13.25F, -13.0F);
/*     */     
/* 502 */     this.gunModel[89].addShapeBox(59.0F, -19.0F, 7.0F, 4, 13, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 503 */     this.gunModel[89].setRotationPoint(-172.5F, -9.25F, -13.0F);
/*     */     
/* 505 */     this.gunModel[90].addShapeBox(59.0F, -19.0F, 7.0F, 4, 17, 12, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 506 */     this.gunModel[90].setRotationPoint(-172.5F, 3.75F, -13.0F);
/*     */     
/* 508 */     this.gunModel[91].addShapeBox(59.0F, -19.0F, 7.0F, 4, 38, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F);
/* 509 */     this.gunModel[91].setRotationPoint(-168.0F, -15.25F, -13.0F);
/*     */     
/* 511 */     this.gunModel[92].addShapeBox(59.0F, -19.0F, 7.0F, 10, 1, 14, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F);
/* 512 */     this.gunModel[92].setRotationPoint(-124.5F, -16.25F, -14.0F);
/*     */     
/* 514 */     this.gunModel[93].addShapeBox(59.0F, -19.0F, 7.0F, 26, 5, 13, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 515 */     this.gunModel[93].setRotationPoint(-80.5F, -6.75F, -13.5F);
/*     */     
/* 517 */     this.gunModel[94].addShapeBox(59.0F, -19.0F, 7.0F, 24, 3, 13, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 518 */     this.gunModel[94].setRotationPoint(-79.5F, -1.75F, -13.5F);
/*     */     
/* 520 */     this.gunModel[95].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/* 521 */     this.gunModel[95].setRotationPoint(-79.5F, 1.25F, -13.5F);
/*     */     
/* 523 */     this.gunModel[96].addShapeBox(59.0F, -19.0F, 7.0F, 24, 1, 13, 0.0F, -1.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/* 524 */     this.gunModel[96].setRotationPoint(-79.5F, 3.25F, -13.5F);
/*     */     
/* 526 */     this.gunModel[97].addShapeBox(59.0F, -19.0F, 7.0F, 22, 1, 13, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 527 */     this.gunModel[97].setRotationPoint(-79.5F, 4.25F, -13.5F);
/*     */     
/* 529 */     this.gunModel[98].addShapeBox(59.0F, -19.0F, 7.0F, 22, 2, 13, 0.0F, -1.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/* 530 */     this.gunModel[98].setRotationPoint(-79.5F, 5.25F, -13.5F);
/*     */     
/* 532 */     this.gunModel[99].addShapeBox(59.0F, -19.0F, 7.0F, 22, 21, 13, 0.0F, -1.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 6.0F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, 6.0F, -0.25F, 0.0F);
/* 533 */     this.gunModel[99].setRotationPoint(-79.5F, 7.25F, -13.5F);
/*     */     
/* 535 */     this.gunModel[100].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 13, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/* 536 */     this.gunModel[100].setRotationPoint(-87.0F, 28.25F, -13.5F);
/*     */     
/* 538 */     this.gunModel[101].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 13, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F);
/* 539 */     this.gunModel[101].setRotationPoint(-87.0F, 30.25F, -13.5F);
/*     */     
/* 541 */     this.gunModel[102].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 13, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/* 542 */     this.gunModel[102].setRotationPoint(-87.0F, 32.25F, -13.5F);
/*     */     
/* 544 */     this.gunModel[103].addShapeBox(59.0F, -19.0F, 7.0F, 15, 1, 13, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/* 545 */     this.gunModel[103].setRotationPoint(-84.0F, 34.25F, -13.5F);
/*     */     
/* 547 */     this.gunModel[104].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 548 */     this.gunModel[104].setRotationPoint(-53.0F, -6.75F, -8.5F);
/*     */     
/* 550 */     this.gunModel[105].addShapeBox(59.0F, -19.0F, 7.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 551 */     this.gunModel[105].setRotationPoint(-53.0F, -5.75F, -8.5F);
/*     */     
/* 553 */     this.gunModel[106].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 554 */     this.gunModel[106].setRotationPoint(-52.75F, -4.75F, -8.5F);
/*     */     
/* 556 */     this.gunModel[107].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 557 */     this.gunModel[107].setRotationPoint(-52.75F, -3.75F, -8.5F);
/*     */     
/* 559 */     this.gunModel[108].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 560 */     this.gunModel[108].setRotationPoint(-52.75F, -2.75F, -8.5F);
/*     */     
/* 562 */     this.gunModel[109].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 563 */     this.gunModel[109].setRotationPoint(-52.75F, -1.75F, -8.5F);
/*     */     
/* 565 */     this.gunModel[110].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 3, 0.0F, -1.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/* 566 */     this.gunModel[110].setRotationPoint(-52.75F, 0.25F, -8.5F);
/*     */     
/* 568 */     this.gunModel[111].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 3, 0.0F, -2.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -5.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F);
/* 569 */     this.gunModel[111].setRotationPoint(-51.75F, 3.25F, -8.5F);
/*     */     
/* 571 */     this.gunModel[112].addShapeBox(59.0F, -19.0F, 7.0F, 83, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 572 */     this.gunModel[112].setRotationPoint(-86.5F, -21.75F, 1.0F);
/*     */     
/* 574 */     this.gunModel[113].addShapeBox(59.0F, -19.0F, 7.0F, 83, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 575 */     this.gunModel[113].setRotationPoint(-86.5F, -24.75F, 1.0F);
/*     */     
/* 577 */     this.gunModel[114].addShapeBox(59.0F, -19.0F, 7.0F, 23, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 578 */     this.gunModel[114].setRotationPoint(-3.5F, -24.75F, 0.0F);
/*     */     
/* 580 */     this.gunModel[115].addShapeBox(59.0F, -19.0F, 7.0F, 28, 3, 17, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 581 */     this.gunModel[115].setRotationPoint(-86.5F, -24.75F, -16.0F);
/*     */     
/* 583 */     this.gunModel[116].addShapeBox(59.0F, -19.0F, 7.0F, 27, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 584 */     this.gunModel[116].setRotationPoint(-86.5F, -21.75F, -16.0F);
/*     */     
/* 586 */     this.gunModel[117].addShapeBox(59.0F, -19.0F, 7.0F, 103, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 587 */     this.gunModel[117].setRotationPoint(-83.5F, -26.75F, 0.0F);
/*     */     
/* 589 */     this.gunModel[118].addShapeBox(59.0F, -19.0F, 7.0F, 59, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 590 */     this.gunModel[118].setRotationPoint(-83.5F, -26.75F, -16.0F);
/*     */     
/* 592 */     this.gunModel[119].addShapeBox(59.0F, -19.0F, 7.0F, 14, 2, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 593 */     this.gunModel[119].setRotationPoint(-83.5F, -26.75F, -14.0F);
/*     */     
/* 595 */     this.gunModel[120].addShapeBox(59.0F, -19.0F, 7.0F, 92, 5, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 596 */     this.gunModel[120].setRotationPoint(-81.5F, -31.75F, -3.0F);
/*     */     
/* 598 */     this.gunModel[121].addShapeBox(59.0F, -19.0F, 7.0F, 56, 5, 3, 0.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 599 */     this.gunModel[121].setRotationPoint(-81.5F, -31.75F, -14.0F);
/*     */     
/* 601 */     this.gunModel[122].addShapeBox(59.0F, -19.0F, 7.0F, 12, 5, 8, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 602 */     this.gunModel[122].setRotationPoint(-81.5F, -31.75F, -11.0F);
/*     */     
/* 604 */     this.gunModel[123].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 605 */     this.gunModel[123].setRotationPoint(-77.5F, -34.75F, -5.0F);
/*     */     
/* 607 */     this.gunModel[124].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 608 */     this.gunModel[124].setRotationPoint(-77.5F, -34.75F, -12.0F);
/*     */     
/* 610 */     this.gunModel[125].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 4, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 611 */     this.gunModel[125].setRotationPoint(-77.5F, -34.75F, -9.0F);
/*     */     
/* 613 */     this.gunModel[126].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 614 */     this.gunModel[126].setRotationPoint(-74.5F, -35.75F, -9.0F);
/*     */     
/* 616 */     this.gunModel[127].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 617 */     this.gunModel[127].setRotationPoint(-74.5F, -35.75F, -7.0F);
/*     */     
/* 619 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 10, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 620 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -13.0F);
/*     */     
/* 622 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 623 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -1.0F);
/*     */     
/* 625 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 5, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 626 */     this.gunModel[''].setRotationPoint(14.5F, -29.25F, -1.0F);
/*     */     
/* 628 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 35, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 629 */     this.gunModel[''].setRotationPoint(-59.5F, -24.75F, -15.0F);
/*     */     
/* 631 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 632 */     this.gunModel[''].setRotationPoint(-57.5F, -24.75F, -17.0F);
/*     */     
/* 634 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 635 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -17.0F);
/*     */     
/* 637 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 638 */     this.gunModel[''].setRotationPoint(-67.5F, -14.75F, -15.75F);
/*     */     
/* 640 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 641 */     this.gunModel[''].setRotationPoint(-64.5F, -17.75F, -15.75F);
/*     */     
/* 643 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 644 */     this.gunModel[''].setRotationPoint(-67.5F, -17.75F, -15.75F);
/*     */     
/* 646 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 647 */     this.gunModel[''].setRotationPoint(-67.5F, -11.75F, -15.75F);
/*     */     
/* 649 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 650 */     this.gunModel[''].setRotationPoint(-64.5F, -11.75F, -15.75F);
/*     */     
/* 652 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 653 */     this.gunModel[''].setRotationPoint(-61.5F, -11.75F, -15.75F);
/*     */     
/* 655 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 656 */     this.gunModel[''].setRotationPoint(-61.5F, -14.75F, -15.75F);
/*     */     
/* 658 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 21, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 659 */     this.gunModel[''].setRotationPoint(-58.5F, -16.75F, -15.75F);
/*     */     
/* 661 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 662 */     this.gunModel[''].setRotationPoint(-61.5F, -17.75F, -15.75F);
/*     */     
/* 664 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 665 */     this.gunModel[''].setRotationPoint(-65.0F, -14.25F, -16.0F);
/*     */     
/* 667 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 668 */     this.gunModel[''].setRotationPoint(-65.0F, -15.25F, -16.0F);
/*     */     
/* 670 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 671 */     this.gunModel[''].setRotationPoint(-65.0F, -12.75F, -16.0F);
/*     */     
/* 673 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 674 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -15.0F);
/*     */     
/* 676 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 8, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 677 */     this.gunModel[''].setRotationPoint(14.5F, -29.25F, -15.0F);
/*     */     
/* 679 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, -1.2F, 1.0F, 0.0F, -1.2F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 680 */     this.gunModel[''].setRotationPoint(-25.5F, -29.75F, -14.0F);
/*     */     
/* 682 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 683 */     this.gunModel[''].setRotationPoint(-25.5F, -31.75F, -13.0F);
/*     */     
/* 685 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 57, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 686 */     this.gunModel[''].setRotationPoint(-81.5F, -26.75F, -14.0F);
/*     */     
/* 688 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 689 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -16.0F);
/*     */     
/* 691 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/* 692 */     this.gunModel[''].setRotationPoint(33.5F, -35.75F, -14.0F);
/*     */     
/* 694 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 695 */     this.gunModel[''].setRotationPoint(33.5F, -37.75F, -14.0F);
/*     */     
/* 697 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 698 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -14.0F);
/*     */     
/* 700 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 701 */     this.gunModel[''].setRotationPoint(38.5F, -37.75F, -14.0F);
/*     */     
/* 703 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 704 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -1.0F);
/*     */     
/* 706 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 707 */     this.gunModel[''].setRotationPoint(38.5F, -37.75F, -1.0F);
/*     */     
/* 709 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 710 */     this.gunModel[''].setRotationPoint(28.5F, -37.75F, -3.0F);
/*     */     
/* 712 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/* 713 */     this.gunModel[''].setRotationPoint(23.5F, -37.75F, -2.0F);
/*     */     
/* 715 */     this.gunModel[' '].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 716 */     this.gunModel[' '].setRotationPoint(27.5F, -37.75F, -3.0F);
/*     */     
/* 718 */     this.gunModel['¡'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 719 */     this.gunModel['¡'].setRotationPoint(28.5F, -37.75F, -13.0F);
/*     */     
/* 721 */     this.gunModel['¢'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/* 722 */     this.gunModel['¢'].setRotationPoint(23.5F, -37.75F, -13.0F);
/*     */     
/* 724 */     this.gunModel['£'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 725 */     this.gunModel['£'].setRotationPoint(27.5F, -37.75F, -12.0F);
/*     */     
/* 727 */     this.gunModel['¤'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 728 */     this.gunModel['¤'].setRotationPoint(29.0F, -38.75F, -3.0F);
/*     */     
/* 730 */     this.gunModel['¥'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 731 */     this.gunModel['¥'].setRotationPoint(29.0F, -38.75F, -13.0F);
/*     */     
/* 733 */     this.gunModel['¦'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 734 */     this.gunModel['¦'].setRotationPoint(13.0F, -37.75F, -4.0F);
/*     */     
/* 736 */     this.gunModel['§'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 737 */     this.gunModel['§'].setRotationPoint(13.0F, -36.75F, -4.0F);
/*     */     
/* 739 */     this.gunModel['¨'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 740 */     this.gunModel['¨'].setRotationPoint(13.0F, -35.75F, -1.0F);
/*     */     
/* 742 */     this.gunModel['©'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 743 */     this.gunModel['©'].setRotationPoint(13.0F, -37.75F, -15.0F);
/*     */     
/* 745 */     this.gunModel['ª'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 746 */     this.gunModel['ª'].setRotationPoint(13.0F, -36.75F, -15.0F);
/*     */     
/* 748 */     this.gunModel['«'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 749 */     this.gunModel['«'].setRotationPoint(13.0F, -35.75F, -15.0F);
/*     */     
/* 751 */     this.gunModel['¬'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 752 */     this.gunModel['¬'].setRotationPoint(13.5F, -37.75F, -11.0F);
/*     */     
/* 754 */     this.gunModel['­'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 755 */     this.gunModel['­'].setRotationPoint(13.5F, -37.75F, -6.0F);
/*     */     
/* 757 */     this.gunModel['®'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 758 */     this.gunModel['®'].setRotationPoint(33.5F, -37.75F, -6.0F);
/*     */     
/* 760 */     this.gunModel['¯'].addShapeBox(59.0F, -19.0F, 7.0F, 23, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 761 */     this.gunModel['¯'].setRotationPoint(13.5F, -37.75F, -8.0F);
/*     */     
/* 763 */     this.gunModel['°'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/* 764 */     this.gunModel['°'].setRotationPoint(33.5F, -35.75F, -1.0F);
/*     */     
/* 766 */     this.gunModel['±'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 767 */     this.gunModel['±'].setRotationPoint(-6.5F, -31.75F, -3.0F);
/*     */     
/* 769 */     this.gunModel['²'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 770 */     this.gunModel['²'].setRotationPoint(-6.5F, -34.75F, -4.5F);
/*     */     
/* 772 */     this.gunModel['³'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 773 */     this.gunModel['³'].setRotationPoint(-6.5F, -35.75F, -7.0F);
/*     */     
/* 775 */     this.gunModel['´'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 776 */     this.gunModel['´'].setRotationPoint(-6.5F, -35.75F, -9.0F);
/*     */     
/* 778 */     this.gunModel['µ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 779 */     this.gunModel['µ'].setRotationPoint(-6.5F, -34.75F, -12.5F);
/*     */     
/* 781 */     this.gunModel['¶'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 782 */     this.gunModel['¶'].setRotationPoint(-31.5F, -31.75F, -3.0F);
/*     */     
/* 784 */     this.gunModel['·'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 785 */     this.gunModel['·'].setRotationPoint(-31.5F, -34.75F, -4.5F);
/*     */     
/* 787 */     this.gunModel['¸'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 788 */     this.gunModel['¸'].setRotationPoint(-31.5F, -35.75F, -7.0F);
/*     */     
/* 790 */     this.gunModel['¹'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 791 */     this.gunModel['¹'].setRotationPoint(-31.5F, -35.75F, -9.0F);
/*     */     
/* 793 */     this.gunModel['º'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 794 */     this.gunModel['º'].setRotationPoint(-31.5F, -34.75F, -12.5F);
/*     */     
/* 796 */     this.gunModel['»'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 797 */     this.gunModel['»'].setRotationPoint(-59.5F, -31.75F, -3.0F);
/*     */     
/* 799 */     this.gunModel['¼'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 800 */     this.gunModel['¼'].setRotationPoint(-59.5F, -34.75F, -4.5F);
/*     */     
/* 802 */     this.gunModel['½'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 803 */     this.gunModel['½'].setRotationPoint(-59.5F, -35.75F, -7.0F);
/*     */     
/* 805 */     this.gunModel['¾'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 806 */     this.gunModel['¾'].setRotationPoint(-59.5F, -35.75F, -9.0F);
/*     */     
/* 808 */     this.gunModel['¿'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 809 */     this.gunModel['¿'].setRotationPoint(-59.5F, -34.75F, -12.5F);
/*     */     
/* 811 */     this.gunModel['À'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 812 */     this.gunModel['À'].setRotationPoint(-31.5F, -31.75F, -14.0F);
/*     */     
/* 814 */     this.gunModel['Á'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 815 */     this.gunModel['Á'].setRotationPoint(-59.5F, -31.75F, -14.0F);
/*     */     
/* 817 */     this.gunModel['Â'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 3, 4, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 818 */     this.gunModel['Â'].setRotationPoint(-84.0F, -29.75F, -9.0F);
/*     */     
/* 820 */     this.gunModel['Ã'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 821 */     this.gunModel['Ã'].setRotationPoint(-79.5F, -16.75F, 0.5F);
/*     */     
/* 823 */     this.gunModel['Ä'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 824 */     this.gunModel['Ä'].setRotationPoint(-45.5F, -12.75F, 0.5F);
/*     */     
/* 826 */     this.gunModel['Å'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 827 */     this.gunModel['Å'].setRotationPoint(-28.5F, -12.75F, 0.5F);
/*     */     
/* 829 */     this.gunModel['Æ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 830 */     this.gunModel['Æ'].setRotationPoint(-15.5F, -18.75F, 0.5F);
/*     */     
/* 832 */     this.gunModel['Ç'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 833 */     this.gunModel['Ç'].setRotationPoint(-77.5F, -16.75F, -15.5F);
/*     */     
/* 835 */     this.gunModel['È'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 836 */     this.gunModel['È'].setRotationPoint(-67.5F, -8.75F, -15.5F);
/*     */     
/* 838 */     this.gunModel['É'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 839 */     this.gunModel['É'].setRotationPoint(-33.5F, -12.75F, -15.5F);
/*     */     
/* 841 */     this.gunModel['Ê'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 842 */     this.gunModel['Ê'].setRotationPoint(-33.5F, -17.75F, -15.5F);
/*     */     
/* 844 */     this.gunModel['Ë'].addShapeBox(59.0F, -19.0F, 7.0F, 18, 4, 1, 0.0F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 845 */     this.gunModel['Ë'].setRotationPoint(-55.5F, -20.75F, -16.0F);
/*     */     
/* 847 */     this.gunModel['Ì'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, -2.0F, -0.5F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 848 */     this.gunModel['Ì'].setRotationPoint(-37.5F, -20.75F, -16.0F);
/*     */     
/* 850 */     this.gunModel['Í'].addShapeBox(59.0F, -19.0F, 7.0F, 17, 8, 8, 0.0F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, 0.75F, 0.75F);
/* 851 */     this.gunModel['Í'].setRotationPoint(160.0F, -23.75F, -11.0F);
/*     */     
/* 853 */     this.gunModel['Î'].addShapeBox(59.0F, -19.0F, 7.0F, 22, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 854 */     this.gunModel['Î'].setRotationPoint(85.0F, -33.5F, -7.5F);
/*     */     
/* 856 */     this.gunModel['Ï'].addShapeBox(59.0F, -19.0F, 7.0F, 22, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 857 */     this.gunModel['Ï'].setRotationPoint(85.0F, -33.5F, -4.5F);
/*     */     
/* 859 */     this.gunModel['Ð'].addShapeBox(59.0F, -19.0F, 7.0F, 22, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 860 */     this.gunModel['Ð'].setRotationPoint(85.0F, -30.5F, -10.5F);
/*     */     
/* 862 */     this.gunModel['Ñ'].addShapeBox(59.0F, -19.0F, 7.0F, 21, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 863 */     this.gunModel['Ñ'].setRotationPoint(85.0F, -18.5F, -5.75F);
/*     */     
/* 865 */     this.gunModel['Ò'].addShapeBox(59.0F, -19.0F, 7.0F, 22, 3, 3, 0.0F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 866 */     this.gunModel['Ò'].setRotationPoint(85.0F, -18.5F, -7.5F);
/*     */     
/* 868 */     this.gunModel['Ó'].addShapeBox(59.0F, -19.0F, 7.0F, 21, 3, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 869 */     this.gunModel['Ó'].setRotationPoint(85.0F, -18.5F, -11.25F);
/*     */     
/*     */ 
/* 872 */     this.ammoModel = new ModelRendererTurbo[5];
/* 873 */     this.ammoModel[0] = new ModelRendererTurbo(this, 177, 289, this.textureX, this.textureY);
/* 874 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1, 297, this.textureX, this.textureY);
/* 875 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1, 313, this.textureX, this.textureY);
/* 876 */     this.ammoModel[3] = new ModelRendererTurbo(this, 81, 313, this.textureX, this.textureY);
/* 877 */     this.ammoModel[4] = new ModelRendererTurbo(this, 161, 313, this.textureX, this.textureY);
/*     */     
/* 879 */     this.ammoModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 27, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 880 */     this.ammoModel[0].setRotationPoint(-25.5F, -11.75F, -13.5F);
/*     */     
/* 882 */     this.ammoModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 27, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 883 */     this.ammoModel[1].setRotationPoint(-25.5F, -7.75F, -13.5F);
/*     */     
/* 885 */     this.ammoModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 27, 33, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F);
/* 886 */     this.ammoModel[2].setRotationPoint(-25.5F, -5.75F, -13.5F);
/*     */     
/* 888 */     this.ammoModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 27, 8, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 889 */     this.ammoModel[3].setRotationPoint(-17.5F, 27.25F, -13.5F);
/*     */     
/* 891 */     this.ammoModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 27, 7, 13, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -4.5F, 1.0F, 0.0F, 2.25F, -3.0F, 0.0F, 2.25F, -3.0F, 0.0F, -4.5F, 1.0F, 0.0F);
/* 892 */     this.ammoModel[4].setRotationPoint(-14.25F, 35.25F, -13.5F);
/*     */     
/*     */ 
/* 895 */     this.slideModel = new ModelRendererTurbo[9];
/* 896 */     this.slideModel[0] = new ModelRendererTurbo(this, 313, 273, this.textureX, this.textureY);
/* 897 */     this.slideModel[1] = new ModelRendererTurbo(this, 1, 281, this.textureX, this.textureY);
/* 898 */     this.slideModel[2] = new ModelRendererTurbo(this, 65, 281, this.textureX, this.textureY);
/* 899 */     this.slideModel[3] = new ModelRendererTurbo(this, 369, 281, this.textureX, this.textureY);
/* 900 */     this.slideModel[4] = new ModelRendererTurbo(this, 441, 281, this.textureX, this.textureY);
/* 901 */     this.slideModel[5] = new ModelRendererTurbo(this, 145, 289, this.textureX, this.textureY);
/* 902 */     this.slideModel[6] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/* 903 */     this.slideModel[7] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 904 */     this.slideModel[8] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*     */     
/* 906 */     this.slideModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 17, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 907 */     this.slideModel[0].setRotationPoint(-24.5F, -24.75F, -14.0F);
/*     */     
/* 909 */     this.slideModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 910 */     this.slideModel[1].setRotationPoint(-24.5F, -25.75F, -13.0F);
/*     */     
/* 912 */     this.slideModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 35, 5, 9, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 913 */     this.slideModel[2].setRotationPoint(-24.5F, -30.75F, -12.0F);
/*     */     
/* 915 */     this.slideModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 18, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 916 */     this.slideModel[3].setRotationPoint(-7.5F, -24.75F, -14.0F);
/*     */     
/* 918 */     this.slideModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 919 */     this.slideModel[4].setRotationPoint(-7.5F, -25.75F, -13.0F);
/*     */     
/* 921 */     this.slideModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 12, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 922 */     this.slideModel[5].setRotationPoint(7.5F, -25.75F, -20.0F);
/*     */     
/* 924 */     this.slideModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 925 */     this.slideModel[6].setRotationPoint(8.5F, -25.75F, -15.0F);
/*     */     
/* 927 */     this.slideModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 928 */     this.slideModel[7].setRotationPoint(8.5F, -25.75F, -16.0F);
/*     */     
/* 930 */     this.slideModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 931 */     this.slideModel[8].setRotationPoint(8.5F, -25.75F, -18.0F);
/*     */     
/*     */ 
/*     */ 
/* 935 */     translateAll(0.0F, -32.75F, 0.0F);
/* 936 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*     */     
/* 938 */     this.gunSlideDistance = 0.75F;
/* 939 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/*     */ 
/* 943 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelsaiga12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */