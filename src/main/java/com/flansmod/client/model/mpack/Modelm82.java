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
/*     */ public class Modelm82
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm82()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo['º'];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 289, 41, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 385, 41, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 17, 49, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 57, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/* 176 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/* 177 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/* 178 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/* 179 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/* 180 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/* 181 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/* 183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/* 184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/* 185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/* 186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/* 187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/* 189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/* 190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/* 192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/* 193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/* 194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/* 195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/* 196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/* 197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/* 198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/* 199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/* 200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 281, 65, this.textureX, this.textureY);
/* 201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/* 202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/* 203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/* 205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/* 206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/* 207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/*     */     
/* 209 */     this.gunModel[0].addShapeBox(73.0F, -6.0F, -3.0F, 38, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 210 */     this.gunModel[0].setRotationPoint(11.0F, -8.0F, 1.0F);
/*     */     
/* 212 */     this.gunModel[1].addShapeBox(73.0F, -6.0F, -3.0F, 85, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[1].setRotationPoint(-109.0F, -10.0F, 4.5F);
/*     */     
/* 215 */     this.gunModel[2].addShapeBox(73.0F, -6.0F, -3.0F, 40, 4, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[2].setRotationPoint(-109.0F, -10.0F, -1.5F);
/*     */     
/* 218 */     this.gunModel[3].addBox(73.0F, -6.0F, -3.0F, 120, 7, 4, 0.0F);
/* 219 */     this.gunModel[3].setRotationPoint(-109.0F, -10.0F, 0.5F);
/*     */     
/* 221 */     this.gunModel[4].addShapeBox(73.0F, -6.0F, -3.0F, 85, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 222 */     this.gunModel[4].setRotationPoint(-109.0F, -6.0F, 4.5F);
/*     */     
/* 224 */     this.gunModel[5].addShapeBox(73.0F, -6.0F, -3.0F, 85, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 225 */     this.gunModel[5].setRotationPoint(-109.0F, -6.0F, -1.5F);
/*     */     
/* 227 */     this.gunModel[6].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 228 */     this.gunModel[6].setRotationPoint(47.0F, -8.0F, 4.0F);
/*     */     
/* 230 */     this.gunModel[7].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 231 */     this.gunModel[7].setRotationPoint(47.0F, -8.0F, -1.0F);
/*     */     
/* 233 */     this.gunModel[8].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 234 */     this.gunModel[8].setRotationPoint(50.0F, -8.0F, -1.0F);
/*     */     
/* 236 */     this.gunModel[9].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 237 */     this.gunModel[9].setRotationPoint(50.0F, -8.0F, 4.0F);
/*     */     
/* 239 */     this.gunModel[10].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 240 */     this.gunModel[10].setRotationPoint(53.0F, -8.0F, -1.0F);
/*     */     
/* 242 */     this.gunModel[11].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 243 */     this.gunModel[11].setRotationPoint(53.0F, -8.0F, 4.0F);
/*     */     
/* 245 */     this.gunModel[12].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 246 */     this.gunModel[12].setRotationPoint(47.0F, -9.0F, 4.0F);
/*     */     
/* 248 */     this.gunModel[13].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 249 */     this.gunModel[13].setRotationPoint(47.0F, -9.0F, -1.0F);
/*     */     
/* 251 */     this.gunModel[14].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 252 */     this.gunModel[14].setRotationPoint(47.0F, -5.0F, -1.0F);
/*     */     
/* 254 */     this.gunModel[15].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 255 */     this.gunModel[15].setRotationPoint(47.0F, -5.0F, 4.0F);
/*     */     
/* 257 */     this.gunModel[16].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 258 */     this.gunModel[16].setRotationPoint(48.5F, -9.0F, 1.0F);
/*     */     
/* 260 */     this.gunModel[17].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 261 */     this.gunModel[17].setRotationPoint(48.5F, -9.0F, 2.0F);
/*     */     
/* 263 */     this.gunModel[18].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 264 */     this.gunModel[18].setRotationPoint(48.5F, -5.0F, 1.0F);
/*     */     
/* 266 */     this.gunModel[19].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 267 */     this.gunModel[19].setRotationPoint(48.5F, -5.0F, 2.0F);
/*     */     
/* 269 */     this.gunModel[20].addBox(73.0F, -6.0F, -3.0F, 2, 3, 3, 0.0F);
/* 270 */     this.gunModel[20].setRotationPoint(53.75F, -8.0F, 1.0F);
/*     */     
/* 272 */     this.gunModel[21].addShapeBox(73.0F, -6.0F, -3.0F, 23, 9, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 273 */     this.gunModel[21].setRotationPoint(-58.0F, -5.0F, -0.5F);
/*     */     
/* 275 */     this.gunModel[22].addShapeBox(73.0F, -6.0F, -3.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 276 */     this.gunModel[22].setRotationPoint(-35.0F, -5.0F, -0.5F);
/*     */     
/* 278 */     this.gunModel[23].addShapeBox(73.0F, -6.0F, -3.0F, 16, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 279 */     this.gunModel[23].setRotationPoint(-74.0F, -3.0F, 0.5F);
/*     */     
/* 281 */     this.gunModel[24].addShapeBox(73.0F, -6.0F, -3.0F, 6, 9, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 282 */     this.gunModel[24].setRotationPoint(-71.0F, 3.0F, 0.5F);
/*     */     
/* 284 */     this.gunModel[25].addShapeBox(73.0F, -6.0F, -3.0F, 3, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 285 */     this.gunModel[25].setRotationPoint(-61.0F, 3.0F, 0.5F);
/*     */     
/* 287 */     this.gunModel[26].addShapeBox(73.0F, -6.0F, -3.0F, 6, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 288 */     this.gunModel[26].setRotationPoint(-71.0F, 0.0F, 0.5F);
/*     */     
/* 290 */     this.gunModel[27].addShapeBox(73.0F, -6.0F, -3.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 291 */     this.gunModel[27].setRotationPoint(-65.0F, 3.0F, 0.5F);
/*     */     
/* 293 */     this.gunModel[28].addBox(73.0F, -6.0F, -3.0F, 1, 1, 4, 0.0F);
/* 294 */     this.gunModel[28].setRotationPoint(-62.0F, 4.0F, 0.5F);
/*     */     
/* 296 */     this.gunModel[29].addBox(73.0F, -6.0F, -3.0F, 1, 1, 2, 0.0F);
/* 297 */     this.gunModel[29].setRotationPoint(-63.0F, 0.0F, 1.5F);
/*     */     
/* 299 */     this.gunModel[30].addShapeBox(73.0F, -6.0F, -3.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 300 */     this.gunModel[30].setRotationPoint(-63.0F, 1.0F, 1.5F);
/*     */     
/* 302 */     this.gunModel[31].addShapeBox(73.0F, -6.0F, -3.0F, 3, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 303 */     this.gunModel[31].setRotationPoint(-91.0F, -3.0F, 0.5F);
/*     */     
/* 305 */     this.gunModel[32].addShapeBox(73.0F, -6.0F, -3.0F, 16, 4, 4, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 2.0F, 0.0F);
/* 306 */     this.gunModel[32].setRotationPoint(-108.5F, 3.0F, 0.5F);
/*     */     
/* 308 */     this.gunModel[33].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 309 */     this.gunModel[33].setRotationPoint(-92.5F, 3.0F, 0.5F);
/*     */     
/* 311 */     this.gunModel[34].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 312 */     this.gunModel[34].setRotationPoint(-92.5F, 5.0F, 0.5F);
/*     */     
/* 314 */     this.gunModel[35].addShapeBox(73.0F, -6.0F, -3.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 315 */     this.gunModel[35].setRotationPoint(-109.0F, -3.0F, 1.5F);
/*     */     
/* 317 */     this.gunModel[36].addShapeBox(73.0F, -6.0F, -3.0F, 4, 18, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 318 */     this.gunModel[36].setRotationPoint(-113.0F, -9.0F, 0.5F);
/*     */     
/* 320 */     this.gunModel[37].addShapeBox(73.0F, -6.0F, -3.0F, 83, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 321 */     this.gunModel[37].setRotationPoint(-72.0F, -11.0F, 1.5F);
/*     */     
/* 323 */     this.gunModel[38].addBox(73.0F, -6.0F, -3.0F, 35, 1, 2, 0.0F);
/* 324 */     this.gunModel[38].setRotationPoint(-24.0F, -7.0F, 4.5F);
/*     */     
/* 326 */     this.gunModel[39].addBox(73.0F, -6.0F, -3.0F, 35, 1, 2, 0.0F);
/* 327 */     this.gunModel[39].setRotationPoint(-24.0F, -7.0F, -1.5F);
/*     */     
/* 329 */     this.gunModel[40].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 330 */     this.gunModel[40].setRotationPoint(-14.0F, -10.0F, -1.5F);
/*     */     
/* 332 */     this.gunModel[41].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 333 */     this.gunModel[41].setRotationPoint(-10.0F, -10.0F, -1.5F);
/*     */     
/* 335 */     this.gunModel[42].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 336 */     this.gunModel[42].setRotationPoint(-16.0F, -10.0F, -0.5F);
/*     */     
/* 338 */     this.gunModel[43].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 339 */     this.gunModel[43].setRotationPoint(-12.0F, -10.0F, -0.5F);
/*     */     
/* 341 */     this.gunModel[44].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
/* 342 */     this.gunModel[44].setRotationPoint(-12.0F, -8.0F, -1.5F);
/*     */     
/* 344 */     this.gunModel[45].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 345 */     this.gunModel[45].setRotationPoint(-16.0F, -8.0F, -1.5F);
/*     */     
/* 347 */     this.gunModel[46].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
/* 348 */     this.gunModel[46].setRotationPoint(-4.0F, -8.0F, -1.5F);
/*     */     
/* 350 */     this.gunModel[47].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 351 */     this.gunModel[47].setRotationPoint(-2.0F, -10.0F, -1.5F);
/*     */     
/* 353 */     this.gunModel[48].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 354 */     this.gunModel[48].setRotationPoint(-6.0F, -10.0F, -1.5F);
/*     */     
/* 356 */     this.gunModel[49].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 357 */     this.gunModel[49].setRotationPoint(-8.0F, -8.0F, -1.5F);
/*     */     
/* 359 */     this.gunModel[50].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 360 */     this.gunModel[50].setRotationPoint(-8.0F, -10.0F, -0.5F);
/*     */     
/* 362 */     this.gunModel[51].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
/* 363 */     this.gunModel[51].setRotationPoint(4.0F, -8.0F, -1.5F);
/*     */     
/* 365 */     this.gunModel[52].addShapeBox(73.0F, -6.0F, -3.0F, 5, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 366 */     this.gunModel[52].setRotationPoint(6.0F, -10.0F, -1.5F);
/*     */     
/* 368 */     this.gunModel[53].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 369 */     this.gunModel[53].setRotationPoint(2.0F, -10.0F, -1.5F);
/*     */     
/* 371 */     this.gunModel[54].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 372 */     this.gunModel[54].setRotationPoint(0.0F, -8.0F, -1.5F);
/*     */     
/* 374 */     this.gunModel[55].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 375 */     this.gunModel[55].setRotationPoint(0.0F, -10.0F, -0.5F);
/*     */     
/* 377 */     this.gunModel[56].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 378 */     this.gunModel[56].setRotationPoint(-4.0F, -10.0F, -0.5F);
/*     */     
/* 380 */     this.gunModel[57].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 381 */     this.gunModel[57].setRotationPoint(4.0F, -10.0F, -0.5F);
/*     */     
/* 383 */     this.gunModel[58].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 384 */     this.gunModel[58].setRotationPoint(-14.0F, -10.0F, 4.5F);
/*     */     
/* 386 */     this.gunModel[59].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 387 */     this.gunModel[59].setRotationPoint(-16.0F, -8.0F, 6.15F);
/*     */     
/* 389 */     this.gunModel[60].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 390 */     this.gunModel[60].setRotationPoint(-16.0F, -10.0F, 4.5F);
/*     */     
/* 392 */     this.gunModel[61].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 393 */     this.gunModel[61].setRotationPoint(-12.0F, -10.0F, 4.5F);
/*     */     
/* 395 */     this.gunModel[62].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 396 */     this.gunModel[62].setRotationPoint(-12.0F, -8.0F, 6.15F);
/*     */     
/* 398 */     this.gunModel[63].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 399 */     this.gunModel[63].setRotationPoint(-10.0F, -10.0F, 4.5F);
/*     */     
/* 401 */     this.gunModel[64].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 402 */     this.gunModel[64].setRotationPoint(-4.0F, -10.0F, 4.5F);
/*     */     
/* 404 */     this.gunModel[65].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 405 */     this.gunModel[65].setRotationPoint(-4.0F, -8.0F, 6.15F);
/*     */     
/* 407 */     this.gunModel[66].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 408 */     this.gunModel[66].setRotationPoint(-2.0F, -10.0F, 4.5F);
/*     */     
/* 410 */     this.gunModel[67].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 411 */     this.gunModel[67].setRotationPoint(-6.0F, -10.0F, 4.5F);
/*     */     
/* 413 */     this.gunModel[68].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 414 */     this.gunModel[68].setRotationPoint(-8.0F, -10.0F, 4.5F);
/*     */     
/* 416 */     this.gunModel[69].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 417 */     this.gunModel[69].setRotationPoint(-8.0F, -8.0F, 6.15F);
/*     */     
/* 419 */     this.gunModel[70].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 420 */     this.gunModel[70].setRotationPoint(4.0F, -10.0F, 4.5F);
/*     */     
/* 422 */     this.gunModel[71].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 423 */     this.gunModel[71].setRotationPoint(4.0F, -8.0F, 6.15F);
/*     */     
/* 425 */     this.gunModel[72].addShapeBox(73.0F, -6.0F, -3.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 426 */     this.gunModel[72].setRotationPoint(6.0F, -10.0F, 4.5F);
/*     */     
/* 428 */     this.gunModel[73].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 429 */     this.gunModel[73].setRotationPoint(2.0F, -10.0F, 4.5F);
/*     */     
/* 431 */     this.gunModel[74].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 432 */     this.gunModel[74].setRotationPoint(0.0F, -10.0F, 4.5F);
/*     */     
/* 434 */     this.gunModel[75].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 435 */     this.gunModel[75].setRotationPoint(0.0F, -8.0F, 6.15F);
/*     */     
/* 437 */     this.gunModel[76].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 438 */     this.gunModel[76].setRotationPoint(-14.0F, -6.0F, -1.5F);
/*     */     
/* 440 */     this.gunModel[77].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 441 */     this.gunModel[77].setRotationPoint(-16.0F, -5.0F, -0.5F);
/*     */     
/* 443 */     this.gunModel[78].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 444 */     this.gunModel[78].setRotationPoint(-16.0F, -6.0F, -1.5F);
/*     */     
/* 446 */     this.gunModel[79].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 447 */     this.gunModel[79].setRotationPoint(-12.0F, -6.0F, -1.5F);
/*     */     
/* 449 */     this.gunModel[80].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 450 */     this.gunModel[80].setRotationPoint(-12.0F, -5.0F, -0.5F);
/*     */     
/* 452 */     this.gunModel[81].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 453 */     this.gunModel[81].setRotationPoint(-10.0F, -6.0F, -1.5F);
/*     */     
/* 455 */     this.gunModel[82].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 456 */     this.gunModel[82].setRotationPoint(-4.0F, -6.0F, -1.5F);
/*     */     
/* 458 */     this.gunModel[83].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 459 */     this.gunModel[83].setRotationPoint(-4.0F, -5.0F, -0.5F);
/*     */     
/* 461 */     this.gunModel[84].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 462 */     this.gunModel[84].setRotationPoint(-2.0F, -6.0F, -1.5F);
/*     */     
/* 464 */     this.gunModel[85].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 465 */     this.gunModel[85].setRotationPoint(-6.0F, -6.0F, -1.5F);
/*     */     
/* 467 */     this.gunModel[86].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 468 */     this.gunModel[86].setRotationPoint(-8.0F, -5.0F, -0.5F);
/*     */     
/* 470 */     this.gunModel[87].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 471 */     this.gunModel[87].setRotationPoint(-8.0F, -6.0F, -1.5F);
/*     */     
/* 473 */     this.gunModel[88].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 474 */     this.gunModel[88].setRotationPoint(4.0F, -6.0F, -1.5F);
/*     */     
/* 476 */     this.gunModel[89].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 477 */     this.gunModel[89].setRotationPoint(4.0F, -5.0F, -0.5F);
/*     */     
/* 479 */     this.gunModel[90].addShapeBox(73.0F, -6.0F, -3.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 480 */     this.gunModel[90].setRotationPoint(6.0F, -6.0F, -1.5F);
/*     */     
/* 482 */     this.gunModel[91].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 483 */     this.gunModel[91].setRotationPoint(2.0F, -6.0F, -1.5F);
/*     */     
/* 485 */     this.gunModel[92].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 486 */     this.gunModel[92].setRotationPoint(0.0F, -5.0F, -0.5F);
/*     */     
/* 488 */     this.gunModel[93].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 489 */     this.gunModel[93].setRotationPoint(0.0F, -6.0F, -1.5F);
/*     */     
/* 491 */     this.gunModel[94].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 492 */     this.gunModel[94].setRotationPoint(-14.0F, -6.0F, 4.5F);
/*     */     
/* 494 */     this.gunModel[95].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 495 */     this.gunModel[95].setRotationPoint(-16.0F, -6.0F, 6.15F);
/*     */     
/* 497 */     this.gunModel[96].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 498 */     this.gunModel[96].setRotationPoint(-16.0F, -5.0F, 4.5F);
/*     */     
/* 500 */     this.gunModel[97].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 501 */     this.gunModel[97].setRotationPoint(-10.0F, -6.0F, 4.5F);
/*     */     
/* 503 */     this.gunModel[98].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 504 */     this.gunModel[98].setRotationPoint(-12.0F, -6.0F, 6.15F);
/*     */     
/* 506 */     this.gunModel[99].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 507 */     this.gunModel[99].setRotationPoint(-12.0F, -5.0F, 4.5F);
/*     */     
/* 509 */     this.gunModel[100].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 510 */     this.gunModel[100].setRotationPoint(-2.0F, -6.0F, 4.5F);
/*     */     
/* 512 */     this.gunModel[101].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 513 */     this.gunModel[101].setRotationPoint(-4.0F, -6.0F, 6.15F);
/*     */     
/* 515 */     this.gunModel[102].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 516 */     this.gunModel[102].setRotationPoint(-4.0F, -5.0F, 4.5F);
/*     */     
/* 518 */     this.gunModel[103].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 519 */     this.gunModel[103].setRotationPoint(-6.0F, -6.0F, 4.5F);
/*     */     
/* 521 */     this.gunModel[104].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 522 */     this.gunModel[104].setRotationPoint(-8.0F, -5.0F, 4.5F);
/*     */     
/* 524 */     this.gunModel[105].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 525 */     this.gunModel[105].setRotationPoint(-8.0F, -6.0F, 6.15F);
/*     */     
/* 527 */     this.gunModel[106].addShapeBox(73.0F, -6.0F, -3.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 528 */     this.gunModel[106].setRotationPoint(6.0F, -6.0F, 4.5F);
/*     */     
/* 530 */     this.gunModel[107].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 531 */     this.gunModel[107].setRotationPoint(4.0F, -6.0F, 6.15F);
/*     */     
/* 533 */     this.gunModel[108].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 534 */     this.gunModel[108].setRotationPoint(4.0F, -5.0F, 4.5F);
/*     */     
/* 536 */     this.gunModel[109].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 537 */     this.gunModel[109].setRotationPoint(2.0F, -6.0F, 4.5F);
/*     */     
/* 539 */     this.gunModel[110].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 540 */     this.gunModel[110].setRotationPoint(0.0F, -5.0F, 4.5F);
/*     */     
/* 542 */     this.gunModel[111].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 543 */     this.gunModel[111].setRotationPoint(0.0F, -6.0F, 6.15F);
/*     */     
/* 545 */     this.gunModel[112].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 546 */     this.gunModel[112].setRotationPoint(-18.0F, -10.0F, -1.5F);
/*     */     
/* 548 */     this.gunModel[113].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 549 */     this.gunModel[113].setRotationPoint(-20.0F, -8.0F, -1.5F);
/*     */     
/* 551 */     this.gunModel[114].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 552 */     this.gunModel[114].setRotationPoint(-20.0F, -10.0F, -0.5F);
/*     */     
/* 554 */     this.gunModel[115].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 555 */     this.gunModel[115].setRotationPoint(-22.0F, -10.0F, -1.5F);
/*     */     
/* 557 */     this.gunModel[116].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 558 */     this.gunModel[116].setRotationPoint(-24.0F, -8.0F, -1.5F);
/*     */     
/* 560 */     this.gunModel[117].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 561 */     this.gunModel[117].setRotationPoint(-24.0F, -10.0F, -0.5F);
/*     */     
/* 563 */     this.gunModel[118].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 564 */     this.gunModel[118].setRotationPoint(-20.0F, -10.0F, 4.5F);
/*     */     
/* 566 */     this.gunModel[119].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 567 */     this.gunModel[119].setRotationPoint(-18.0F, -10.0F, 4.5F);
/*     */     
/* 569 */     this.gunModel[120].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 570 */     this.gunModel[120].setRotationPoint(-20.0F, -8.0F, 6.15F);
/*     */     
/* 572 */     this.gunModel[121].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 573 */     this.gunModel[121].setRotationPoint(-20.0F, -6.0F, 6.15F);
/*     */     
/* 575 */     this.gunModel[122].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 576 */     this.gunModel[122].setRotationPoint(-18.0F, -6.0F, 4.5F);
/*     */     
/* 578 */     this.gunModel[123].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 579 */     this.gunModel[123].setRotationPoint(-20.0F, -5.0F, 4.5F);
/*     */     
/* 581 */     this.gunModel[124].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 582 */     this.gunModel[124].setRotationPoint(-20.0F, -6.0F, -1.5F);
/*     */     
/* 584 */     this.gunModel[125].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 585 */     this.gunModel[125].setRotationPoint(-18.0F, -6.0F, -1.5F);
/*     */     
/* 587 */     this.gunModel[126].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 588 */     this.gunModel[126].setRotationPoint(-20.0F, -5.0F, -0.5F);
/*     */     
/* 590 */     this.gunModel[127].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 591 */     this.gunModel[127].setRotationPoint(-24.0F, -10.0F, 4.5F);
/*     */     
/* 593 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 594 */     this.gunModel[''].setRotationPoint(-22.0F, -10.0F, 4.5F);
/*     */     
/* 596 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 597 */     this.gunModel[''].setRotationPoint(-24.0F, -8.0F, 6.15F);
/*     */     
/* 599 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, -0.65F);
/* 600 */     this.gunModel[''].setRotationPoint(-24.0F, -6.0F, 6.15F);
/*     */     
/* 602 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 603 */     this.gunModel[''].setRotationPoint(-22.0F, -6.0F, 4.5F);
/*     */     
/* 605 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 606 */     this.gunModel[''].setRotationPoint(-24.0F, -5.0F, 4.5F);
/*     */     
/* 608 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F);
/* 609 */     this.gunModel[''].setRotationPoint(-24.0F, -6.0F, -1.5F);
/*     */     
/* 611 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 612 */     this.gunModel[''].setRotationPoint(-22.0F, -6.0F, -1.5F);
/*     */     
/* 614 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 615 */     this.gunModel[''].setRotationPoint(-24.0F, -5.0F, -0.5F);
/*     */     
/* 617 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 7, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 618 */     this.gunModel[''].setRotationPoint(-69.0F, -10.0F, -1.5F);
/*     */     
/* 620 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 4, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 1.0F, 0.0F, 0.0F, 0.0F);
/* 621 */     this.gunModel[''].setRotationPoint(-62.0F, -10.0F, -1.5F);
/*     */     
/* 623 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 14, 4, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 624 */     this.gunModel[''].setRotationPoint(-38.0F, -10.0F, -1.5F);
/*     */     
/* 626 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 20, 2, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 627 */     this.gunModel[''].setRotationPoint(-58.0F, -10.0F, -0.5F);
/*     */     
/* 629 */     this.gunModel[''].addBox(73.0F, -6.0F, -3.0F, 2, 28, 2, 0.0F);
/* 630 */     this.gunModel[''].setRotationPoint(-1.0F, -6.5F, 3.5F);
/* 631 */     this.gunModel[''].rotateAngleX = 0.34906584F;
/*     */     
/* 633 */     this.gunModel[''].addBox(73.0F, -6.0F, -6.0F, 2, 28, 2, 0.0F);
/* 634 */     this.gunModel[''].setRotationPoint(-1.0F, -4.5F, 2.5F);
/* 635 */     this.gunModel[''].rotateAngleX = -0.34906584F;
/*     */     
/* 637 */     this.gunModel[''].addBox(73.0F, -6.0F, -3.0F, 15, 1, 3, 0.0F);
/* 638 */     this.gunModel[''].setRotationPoint(-63.0F, -12.0F, 1.0F);
/*     */     
/* 640 */     this.gunModel[''].addBox(73.0F, -6.0F, -3.0F, 3, 1, 3, 0.0F);
/* 641 */     this.gunModel[''].setRotationPoint(-62.0F, -13.0F, 1.0F);
/*     */     
/* 643 */     this.gunModel[''].addBox(73.0F, -6.0F, -3.0F, 3, 1, 3, 0.0F);
/* 644 */     this.gunModel[''].setRotationPoint(-52.0F, -13.0F, 1.0F);
/*     */     
/* 646 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 647 */     this.gunModel[''].setRotationPoint(-62.0F, -15.0F, 0.0F);
/*     */     
/* 649 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 650 */     this.gunModel[''].setRotationPoint(-52.0F, -15.0F, 0.0F);
/*     */     
/* 652 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 653 */     this.gunModel[''].setRotationPoint(-52.0F, -17.0F, 0.0F);
/*     */     
/* 655 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 656 */     this.gunModel[''].setRotationPoint(-62.0F, -17.0F, 0.0F);
/*     */     
/* 658 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 659 */     this.gunModel[''].setRotationPoint(-62.0F, -15.0F, 4.0F);
/*     */     
/* 661 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 662 */     this.gunModel[''].setRotationPoint(-62.0F, -17.0F, 4.0F);
/*     */     
/* 664 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 665 */     this.gunModel[''].setRotationPoint(-52.0F, -17.0F, 4.0F);
/*     */     
/* 667 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 668 */     this.gunModel[''].setRotationPoint(-52.0F, -15.0F, 4.0F);
/*     */     
/* 670 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 671 */     this.gunModel[''].setRotationPoint(-52.0F, -18.0F, 2.5F);
/*     */     
/* 673 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 674 */     this.gunModel[''].setRotationPoint(-52.0F, -18.0F, 1.5F);
/*     */     
/* 676 */     this.gunModel[''].addBox(73.0F, -6.0F, -3.0F, 18, 3, 3, 0.0F);
/* 677 */     this.gunModel[''].setRotationPoint(-64.0F, -17.0F, 1.0F);
/*     */     
/* 679 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 680 */     this.gunModel[''].setRotationPoint(-62.0F, -18.0F, 1.5F);
/*     */     
/* 682 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 683 */     this.gunModel[''].setRotationPoint(-62.0F, -18.0F, 2.5F);
/*     */     
/* 685 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 686 */     this.gunModel[''].setRotationPoint(-45.0F, -14.0F, 0.0F);
/*     */     
/* 688 */     this.gunModel[''].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 689 */     this.gunModel[''].setRotationPoint(-45.0F, -18.0F, 0.0F);
/*     */     
/* 691 */     this.gunModel[' '].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 692 */     this.gunModel[' '].setRotationPoint(-45.0F, -18.0F, 4.0F);
/*     */     
/* 694 */     this.gunModel['¡'].addShapeBox(73.0F, -6.0F, -3.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 695 */     this.gunModel['¡'].setRotationPoint(-45.0F, -14.0F, 4.0F);
/*     */     
/* 697 */     this.gunModel['¢'].addBox(73.0F, -6.0F, -3.0F, 7, 5, 3, 0.0F);
/* 698 */     this.gunModel['¢'].setRotationPoint(-45.0F, -18.0F, 1.0F);
/*     */     
/* 700 */     this.gunModel['£'].addBox(73.0F, -6.0F, -3.0F, 7, 3, 1, 0.0F);
/* 701 */     this.gunModel['£'].setRotationPoint(-45.0F, -17.0F, 0.0F);
/*     */     
/* 703 */     this.gunModel['¤'].addBox(73.0F, -6.0F, -3.0F, 7, 3, 1, 0.0F);
/* 704 */     this.gunModel['¤'].setRotationPoint(-45.0F, -17.0F, 4.0F);
/*     */     
/* 706 */     this.gunModel['¥'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 707 */     this.gunModel['¥'].setRotationPoint(-46.0F, -17.0F, 0.0F);
/*     */     
/* 709 */     this.gunModel['¦'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 710 */     this.gunModel['¦'].setRotationPoint(-46.0F, -18.0F, 0.0F);
/*     */     
/* 712 */     this.gunModel['§'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 713 */     this.gunModel['§'].setRotationPoint(-46.0F, -14.0F, 0.0F);
/*     */     
/* 715 */     this.gunModel['¨'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 5, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 716 */     this.gunModel['¨'].setRotationPoint(-46.0F, -18.0F, 1.0F);
/*     */     
/* 718 */     this.gunModel['©'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 719 */     this.gunModel['©'].setRotationPoint(-46.0F, -18.0F, 4.0F);
/*     */     
/* 721 */     this.gunModel['ª'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 722 */     this.gunModel['ª'].setRotationPoint(-46.0F, -17.0F, 4.0F);
/*     */     
/* 724 */     this.gunModel['«'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F);
/* 725 */     this.gunModel['«'].setRotationPoint(-46.0F, -14.0F, 4.0F);
/*     */     
/* 727 */     this.gunModel['¬'].addShapeBox(73.0F, -6.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 728 */     this.gunModel['¬'].setRotationPoint(-70.0F, -18.0F, 0.0F);
/*     */     
/* 730 */     this.gunModel['­'].addBox(73.0F, -6.0F, -3.0F, 5, 3, 1, 0.0F);
/* 731 */     this.gunModel['­'].setRotationPoint(-70.0F, -17.0F, 0.0F);
/*     */     
/* 733 */     this.gunModel['®'].addShapeBox(73.0F, -6.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 734 */     this.gunModel['®'].setRotationPoint(-70.0F, -14.0F, 0.0F);
/*     */     
/* 736 */     this.gunModel['¯'].addBox(73.0F, -6.0F, -3.0F, 5, 5, 3, 0.0F);
/* 737 */     this.gunModel['¯'].setRotationPoint(-70.0F, -18.0F, 1.0F);
/*     */     
/* 739 */     this.gunModel['°'].addBox(73.0F, -6.0F, -3.0F, 5, 3, 1, 0.0F);
/* 740 */     this.gunModel['°'].setRotationPoint(-70.0F, -17.0F, 4.0F);
/*     */     
/* 742 */     this.gunModel['±'].addShapeBox(73.0F, -6.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 743 */     this.gunModel['±'].setRotationPoint(-70.0F, -18.0F, 4.0F);
/*     */     
/* 745 */     this.gunModel['²'].addShapeBox(73.0F, -6.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 746 */     this.gunModel['²'].setRotationPoint(-70.0F, -14.0F, 4.0F);
/*     */     
/* 748 */     this.gunModel['³'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 749 */     this.gunModel['³'].setRotationPoint(-65.0F, -18.0F, 0.0F);
/*     */     
/* 751 */     this.gunModel['´'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 752 */     this.gunModel['´'].setRotationPoint(-65.0F, -17.0F, 0.0F);
/*     */     
/* 754 */     this.gunModel['µ'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 755 */     this.gunModel['µ'].setRotationPoint(-65.0F, -14.0F, 0.0F);
/*     */     
/* 757 */     this.gunModel['¶'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 758 */     this.gunModel['¶'].setRotationPoint(-65.0F, -18.0F, 1.0F);
/*     */     
/* 760 */     this.gunModel['·'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 761 */     this.gunModel['·'].setRotationPoint(-65.0F, -17.0F, 4.0F);
/*     */     
/* 763 */     this.gunModel['¸'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 764 */     this.gunModel['¸'].setRotationPoint(-65.0F, -18.0F, 4.0F);
/*     */     
/* 766 */     this.gunModel['¹'].addShapeBox(73.0F, -6.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F);
/* 767 */     this.gunModel['¹'].setRotationPoint(-65.0F, -14.0F, 4.0F);
/*     */     
/*     */ 
/* 770 */     this.ammoModel = new ModelRendererTurbo[1];
/* 771 */     this.ammoModel[0] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*     */     
/* 773 */     this.ammoModel[0].addShapeBox(73.0F, -6.0F, -3.0F, 19, 15, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 774 */     this.ammoModel[0].setRotationPoint(-57.0F, -2.0F, 0.0F);
/*     */     
/*     */ 
/* 777 */     this.slideModel = new ModelRendererTurbo[2];
/* 778 */     this.slideModel[0] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/* 779 */     this.slideModel[1] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*     */     
/* 781 */     this.slideModel[0].addShapeBox(73.0F, -6.0F, -3.0F, 31, 3, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 782 */     this.slideModel[0].setRotationPoint(-69.0F, -9.0F, -1.0F);
/*     */     
/* 784 */     this.slideModel[1].addBox(73.0F, -6.0F, -3.0F, 1, 1, 3, 0.0F);
/* 785 */     this.slideModel[1].setRotationPoint(-39.0F, -7.5F, -3.0F);
/*     */     
/*     */ 
/*     */ 
/* 789 */     translateAll(0.0F, -9.0F, 0.0F);
/* 790 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*     */     
/* 792 */     this.gunSlideDistance = 0.0F;
/* 793 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/*     */ 
/* 797 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */