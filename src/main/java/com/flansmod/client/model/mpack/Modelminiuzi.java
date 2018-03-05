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
/*     */ public class Modelminiuzi
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelminiuzi()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo['Ä'];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 33, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 33, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
/* 176 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/* 177 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
/* 178 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 179 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/* 180 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/* 181 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/* 182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/* 184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/* 185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/* 186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/* 187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/* 188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/* 189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/* 190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/* 191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/* 192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/* 193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/* 194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/* 195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/* 196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/* 197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/* 198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 137, 41, this.textureX, this.textureY);
/* 199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/* 200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/* 201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/* 202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/* 203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/* 204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/* 205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/* 206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/* 207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/* 208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
/* 209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/* 210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
/* 212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/* 213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/* 214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/* 215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/* 216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*     */     
/* 219 */     this.gunModel[0].addBox(-4.0F, 1.0F, -3.0F, 5, 12, 5, 0.0F);
/* 220 */     this.gunModel[0].setRotationPoint(0.0F, -7.5F, 0.5F);
/*     */     
/* 222 */     this.gunModel[1].addBox(-4.0F, 1.0F, -3.0F, 1, 12, 3, 0.0F);
/* 223 */     this.gunModel[1].setRotationPoint(5.0F, -7.5F, 1.5F);
/*     */     
/* 225 */     this.gunModel[2].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F);
/* 226 */     this.gunModel[2].setRotationPoint(-1.0F, 3.5F, 0.5F);
/*     */     
/* 228 */     this.gunModel[3].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 229 */     this.gunModel[3].setRotationPoint(-1.0F, 2.5F, 0.5F);
/*     */     
/* 231 */     this.gunModel[4].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 232 */     this.gunModel[4].setRotationPoint(-2.0F, -1.5F, 1.0F);
/*     */     
/* 234 */     this.gunModel[5].addFlexBox(-4.0F, 1.0F, -3.0F, 0, 1, 5, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 235 */     this.gunModel[5].setRotationPoint(0.0F, -6.5F, 0.5F);
/*     */     
/* 237 */     this.gunModel[6].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 238 */     this.gunModel[6].setRotationPoint(-2.0F, -7.5F, 0.5F);
/*     */     
/* 240 */     this.gunModel[7].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F);
/* 241 */     this.gunModel[7].setRotationPoint(-2.0F, 2.5F, 1.0F);
/*     */     
/* 243 */     this.gunModel[8].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 244 */     this.gunModel[8].setRotationPoint(-2.0F, -0.5F, 0.5F);
/*     */     
/* 246 */     this.gunModel[9].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 247 */     this.gunModel[9].setRotationPoint(-1.0F, -1.5F, 0.5F);
/*     */     
/* 249 */     this.gunModel[10].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 250 */     this.gunModel[10].setRotationPoint(-1.0F, -2.5F, 0.5F);
/*     */     
/* 252 */     this.gunModel[11].addBox(-4.0F, 1.0F, -3.0F, 1, 1, 5, 0.0F);
/* 253 */     this.gunModel[11].setRotationPoint(-1.0F, -7.5F, 0.5F);
/*     */     
/* 255 */     this.gunModel[12].addFlexBox(-4.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4);
/* 256 */     this.gunModel[12].setRotationPoint(-1.0F, -6.5F, 1.5F);
/*     */     
/* 258 */     this.gunModel[13].addBox(-4.0F, 1.0F, -3.0F, 1, 3, 3, 0.0F);
/* 259 */     this.gunModel[13].setRotationPoint(-1.0F, -5.5F, 1.5F);
/*     */     
/* 261 */     this.gunModel[14].addFlexBox(-4.0F, 1.0F, -3.0F, 0, 1, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4);
/* 262 */     this.gunModel[14].setRotationPoint(-1.0F, -2.5F, 1.5F);
/*     */     
/* 264 */     this.gunModel[15].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 265 */     this.gunModel[15].setRotationPoint(6.0F, 3.5F, 1.5F);
/*     */     
/* 267 */     this.gunModel[16].addBox(-4.0F, 1.0F, -3.0F, 13, 6, 5, 0.0F);
/* 268 */     this.gunModel[16].setRotationPoint(-12.0F, -16.0F, 1.0F);
/*     */     
/* 270 */     this.gunModel[17].addShapeBox(-4.0F, 1.0F, -3.0F, 18, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 271 */     this.gunModel[17].setRotationPoint(-3.0F, -12.0F, 5.25F);
/*     */     
/* 273 */     this.gunModel[18].addShapeBox(-4.0F, 1.0F, -3.0F, 18, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 274 */     this.gunModel[18].setRotationPoint(-3.0F, -14.0F, 5.25F);
/*     */     
/* 276 */     this.gunModel[19].addShapeBox(-4.0F, 1.0F, -3.0F, 18, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 277 */     this.gunModel[19].setRotationPoint(-3.0F, -12.0F, -1.0F);
/*     */     
/* 279 */     this.gunModel[20].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 280 */     this.gunModel[20].setRotationPoint(-10.0F, -14.0F, 5.25F);
/*     */     
/* 282 */     this.gunModel[21].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 283 */     this.gunModel[21].setRotationPoint(-10.0F, -12.0F, -1.0F);
/*     */     
/* 285 */     this.gunModel[22].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 286 */     this.gunModel[22].setRotationPoint(-10.0F, -14.0F, -1.0F);
/*     */     
/* 288 */     this.gunModel[23].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 289 */     this.gunModel[23].setRotationPoint(-1.0F, -13.0F, -1.0F);
/*     */     
/* 291 */     this.gunModel[24].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 292 */     this.gunModel[24].setRotationPoint(-3.0F, -14.0F, -1.0F);
/*     */     
/* 294 */     this.gunModel[25].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 295 */     this.gunModel[25].setRotationPoint(0.0F, -14.0F, -1.0F);
/*     */     
/* 297 */     this.gunModel[26].addBox(-4.0F, 1.0F, -3.0F, 13, 6, 1, 0.0F);
/* 298 */     this.gunModel[26].setRotationPoint(-12.0F, -16.0F, 0.0F);
/*     */     
/* 300 */     this.gunModel[27].addBox(-4.0F, 1.0F, -3.0F, 8, 6, 1, 0.0F);
/* 301 */     this.gunModel[27].setRotationPoint(9.0F, -16.0F, 0.0F);
/*     */     
/* 303 */     this.gunModel[28].addBox(-4.0F, 1.0F, -3.0F, 8, 2, 1, 0.0F);
/* 304 */     this.gunModel[28].setRotationPoint(1.0F, -12.0F, 0.0F);
/*     */     
/* 306 */     this.gunModel[29].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 307 */     this.gunModel[29].setRotationPoint(9.0F, -13.0F, -1.0F);
/*     */     
/* 309 */     this.gunModel[30].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 310 */     this.gunModel[30].setRotationPoint(10.0F, -14.0F, -1.0F);
/*     */     
/* 312 */     this.gunModel[31].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 313 */     this.gunModel[31].setRotationPoint(9.0F, -14.0F, -1.0F);
/*     */     
/* 315 */     this.gunModel[32].addShapeBox(-4.0F, 1.0F, -3.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 316 */     this.gunModel[32].setRotationPoint(-7.0F, -16.0F, -1.0F);
/*     */     
/* 318 */     this.gunModel[33].addShapeBox(-4.0F, 1.0F, -3.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 319 */     this.gunModel[33].setRotationPoint(9.0F, -16.0F, -1.0F);
/*     */     
/* 321 */     this.gunModel[34].addShapeBox(-4.0F, 1.0F, -3.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 322 */     this.gunModel[34].setRotationPoint(1.0F, -17.0F, -1.0F);
/*     */     
/* 324 */     this.gunModel[35].addShapeBox(-4.0F, 1.0F, -3.0F, 6, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 325 */     this.gunModel[35].setRotationPoint(-5.0F, -17.0F, -1.0F);
/*     */     
/* 327 */     this.gunModel[36].addShapeBox(-4.0F, 1.0F, -3.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 328 */     this.gunModel[36].setRotationPoint(9.0F, -17.0F, -1.0F);
/*     */     
/* 330 */     this.gunModel[37].addShapeBox(-4.0F, 1.0F, -3.0F, 23, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 331 */     this.gunModel[37].setRotationPoint(-3.0F, -17.0F, 0.0F);
/*     */     
/* 333 */     this.gunModel[38].addShapeBox(-4.0F, 1.0F, -3.0F, 24, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 334 */     this.gunModel[38].setRotationPoint(-7.0F, -16.0F, 5.5F);
/*     */     
/* 336 */     this.gunModel[39].addShapeBox(-4.0F, 1.0F, -3.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 337 */     this.gunModel[39].setRotationPoint(9.0F, -17.0F, 5.5F);
/*     */     
/* 339 */     this.gunModel[40].addShapeBox(-4.0F, 1.0F, -3.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 340 */     this.gunModel[40].setRotationPoint(1.0F, -17.0F, 5.5F);
/*     */     
/* 342 */     this.gunModel[41].addShapeBox(-4.0F, 1.0F, -3.0F, 6, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 343 */     this.gunModel[41].setRotationPoint(-5.0F, -17.0F, 5.5F);
/*     */     
/* 345 */     this.gunModel[42].addShapeBox(-4.0F, 1.0F, -3.0F, 23, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 346 */     this.gunModel[42].setRotationPoint(-3.0F, -17.0F, 5.0F);
/*     */     
/* 348 */     this.gunModel[43].addShapeBox(-4.0F, 1.0F, -3.0F, 20, 1, 2, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 349 */     this.gunModel[43].setRotationPoint(-3.0F, -17.0F, 2.0F);
/*     */     
/* 351 */     this.gunModel[44].addShapeBox(-4.0F, 1.0F, -3.0F, 20, 1, 3, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 352 */     this.gunModel[44].setRotationPoint(-3.0F, -17.35F, 1.25F);
/*     */     
/* 354 */     this.gunModel[45].addBox(-4.0F, 1.0F, -3.0F, 2, 1, 2, 0.0F);
/* 355 */     this.gunModel[45].setRotationPoint(12.0F, -17.5F, 2.0F);
/*     */     
/* 357 */     this.gunModel[46].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 358 */     this.gunModel[46].setRotationPoint(12.0F, -18.5F, 1.0F);
/*     */     
/* 360 */     this.gunModel[47].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 361 */     this.gunModel[47].setRotationPoint(12.0F, -18.5F, 3.5F);
/*     */     
/* 363 */     this.gunModel[48].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 364 */     this.gunModel[48].setRotationPoint(12.0F, -18.5F, 2.0F);
/*     */     
/* 366 */     this.gunModel[49].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 367 */     this.gunModel[49].setRotationPoint(12.0F, -20.0F, 1.5F);
/*     */     
/* 369 */     this.gunModel[50].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 370 */     this.gunModel[50].setRotationPoint(12.0F, -18.5F, 3.5F);
/*     */     
/* 372 */     this.gunModel[51].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 373 */     this.gunModel[51].setRotationPoint(12.0F, -20.0F, 4.0F);
/*     */     
/* 375 */     this.gunModel[52].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 376 */     this.gunModel[52].setRotationPoint(-12.0F, -17.0F, 0.5F);
/*     */     
/* 378 */     this.gunModel[53].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 379 */     this.gunModel[53].setRotationPoint(-11.0F, -18.0F, 0.5F);
/*     */     
/* 381 */     this.gunModel[54].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 382 */     this.gunModel[54].setRotationPoint(-10.0F, -19.5F, 0.5F);
/*     */     
/* 384 */     this.gunModel[55].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 385 */     this.gunModel[55].setRotationPoint(-10.0F, -19.0F, 0.5F);
/*     */     
/* 387 */     this.gunModel[56].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 388 */     this.gunModel[56].setRotationPoint(-7.0F, -19.0F, 0.0F);
/*     */     
/* 390 */     this.gunModel[57].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 391 */     this.gunModel[57].setRotationPoint(-11.0F, -19.0F, 0.0F);
/*     */     
/* 393 */     this.gunModel[58].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 394 */     this.gunModel[58].setRotationPoint(-8.0F, -19.5F, 0.5F);
/*     */     
/* 396 */     this.gunModel[59].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 397 */     this.gunModel[59].setRotationPoint(-9.0F, -19.5F, 0.5F);
/*     */     
/* 399 */     this.gunModel[60].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 400 */     this.gunModel[60].setRotationPoint(-11.5F, -17.75F, 0.5F);
/*     */     
/* 402 */     this.gunModel[61].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 403 */     this.gunModel[61].setRotationPoint(-12.0F, -17.0F, 0.5F);
/*     */     
/* 405 */     this.gunModel[62].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 406 */     this.gunModel[62].setRotationPoint(-9.0F, -19.5F, 5.0F);
/*     */     
/* 408 */     this.gunModel[63].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 409 */     this.gunModel[63].setRotationPoint(-8.0F, -19.5F, 5.0F);
/*     */     
/* 411 */     this.gunModel[64].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 412 */     this.gunModel[64].setRotationPoint(-10.0F, -19.0F, 5.0F);
/*     */     
/* 414 */     this.gunModel[65].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 415 */     this.gunModel[65].setRotationPoint(-7.0F, -19.0F, 4.5F);
/*     */     
/* 417 */     this.gunModel[66].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 418 */     this.gunModel[66].setRotationPoint(-11.0F, -18.0F, 5.0F);
/*     */     
/* 420 */     this.gunModel[67].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 421 */     this.gunModel[67].setRotationPoint(-11.0F, -19.0F, 4.5F);
/*     */     
/* 423 */     this.gunModel[68].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 424 */     this.gunModel[68].setRotationPoint(-11.5F, -17.75F, 5.0F);
/*     */     
/* 426 */     this.gunModel[69].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 427 */     this.gunModel[69].setRotationPoint(-12.0F, -17.0F, 5.0F);
/*     */     
/* 429 */     this.gunModel[70].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 430 */     this.gunModel[70].setRotationPoint(-12.0F, -17.0F, 5.0F);
/*     */     
/* 432 */     this.gunModel[71].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 433 */     this.gunModel[71].setRotationPoint(-10.0F, -19.5F, 5.0F);
/*     */     
/* 435 */     this.gunModel[72].addShapeBox(-4.0F, 1.0F, -3.0F, 16, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 436 */     this.gunModel[72].setRotationPoint(-1.0F, -11.0F, -1.0F);
/*     */     
/* 438 */     this.gunModel[73].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 439 */     this.gunModel[73].setRotationPoint(-2.0F, -11.0F, 6.0F);
/*     */     
/* 441 */     this.gunModel[74].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 442 */     this.gunModel[74].setRotationPoint(-2.0F, -11.0F, -0.5F);
/*     */     
/* 444 */     this.gunModel[75].addShapeBox(-4.0F, 1.0F, -3.0F, 16, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 445 */     this.gunModel[75].setRotationPoint(-1.0F, -11.0F, 5.5F);
/*     */     
/* 447 */     this.gunModel[76].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 448 */     this.gunModel[76].setRotationPoint(17.0F, -15.0F, 0.0F);
/*     */     
/* 450 */     this.gunModel[77].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 451 */     this.gunModel[77].setRotationPoint(17.0F, -17.0F, -1.0F);
/*     */     
/* 453 */     this.gunModel[78].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 454 */     this.gunModel[78].setRotationPoint(15.0F, -11.0F, -1.0F);
/*     */     
/* 456 */     this.gunModel[79].addShapeBox(-4.0F, 1.0F, -3.0F, 18, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 457 */     this.gunModel[79].setRotationPoint(-2.0F, -8.5F, -0.5F);
/*     */     
/* 459 */     this.gunModel[80].addBox(-4.0F, 1.0F, -3.0F, 3, 1, 7, 0.0F);
/* 460 */     this.gunModel[80].setRotationPoint(-2.0F, -9.5F, -0.5F);
/*     */     
/* 462 */     this.gunModel[81].addBox(-4.0F, 1.0F, -3.0F, 4, 1, 7, 0.0F);
/* 463 */     this.gunModel[81].setRotationPoint(12.0F, -9.5F, -0.5F);
/*     */     
/* 465 */     this.gunModel[82].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 466 */     this.gunModel[82].setRotationPoint(15.0F, -11.0F, 5.5F);
/*     */     
/* 468 */     this.gunModel[83].addShapeBox(-4.0F, 1.0F, -3.0F, 11, 1, 7, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 469 */     this.gunModel[83].setRotationPoint(1.0F, -9.5F, -0.5F);
/*     */     
/* 471 */     this.gunModel[84].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 472 */     this.gunModel[84].setRotationPoint(-2.0F, -10.5F, -0.5F);
/*     */     
/* 474 */     this.gunModel[85].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 475 */     this.gunModel[85].setRotationPoint(15.0F, -10.5F, -0.5F);
/*     */     
/* 477 */     this.gunModel[86].addBox(-4.0F, 1.0F, -3.0F, 1, 7, 3, 0.0F);
/* 478 */     this.gunModel[86].setRotationPoint(16.0F, -10.0F, 1.5F);
/*     */     
/* 480 */     this.gunModel[87].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 6, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 481 */     this.gunModel[87].setRotationPoint(17.0F, -14.0F, -1.0F);
/*     */     
/* 483 */     this.gunModel[88].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 6, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 484 */     this.gunModel[88].setRotationPoint(18.0F, -14.0F, -1.0F);
/*     */     
/* 486 */     this.gunModel[89].addBox(-4.0F, 1.0F, -3.0F, 3, 1, 5, 0.0F);
/* 487 */     this.gunModel[89].setRotationPoint(17.0F, -13.0F, 0.5F);
/*     */     
/* 489 */     this.gunModel[90].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 490 */     this.gunModel[90].setRotationPoint(17.0F, -17.0F, 6.0F);
/*     */     
/* 492 */     this.gunModel[91].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 493 */     this.gunModel[91].setRotationPoint(17.0F, -15.0F, 5.0F);
/*     */     
/* 495 */     this.gunModel[92].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F);
/* 496 */     this.gunModel[92].setRotationPoint(17.0F, -14.0F, 6.0F);
/*     */     
/* 498 */     this.gunModel[93].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 499 */     this.gunModel[93].setRotationPoint(18.0F, -14.0F, 6.0F);
/*     */     
/* 501 */     this.gunModel[94].addBox(-4.0F, 1.0F, -3.0F, 13, 3, 3, 0.0F);
/* 502 */     this.gunModel[94].setRotationPoint(17.0F, -16.0F, 1.5F);
/*     */     
/* 504 */     this.gunModel[95].addBox(-4.0F, 1.0F, -3.0F, 3, 1, 1, 0.0F);
/* 505 */     this.gunModel[95].setRotationPoint(17.0F, -16.0F, 0.0F);
/*     */     
/* 507 */     this.gunModel[96].addBox(-4.0F, 1.0F, -3.0F, 3, 1, 1, 0.0F);
/* 508 */     this.gunModel[96].setRotationPoint(17.0F, -16.0F, 5.0F);
/*     */     
/* 510 */     this.gunModel[97].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 511 */     this.gunModel[97].setRotationPoint(20.0F, -13.0F, -1.0F);
/*     */     
/* 513 */     this.gunModel[98].addShapeBox(-4.0F, 1.0F, -3.0F, 9, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 514 */     this.gunModel[98].setRotationPoint(20.0F, -13.5F, 0.0F);
/*     */     
/* 516 */     this.gunModel[99].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 6, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 517 */     this.gunModel[99].setRotationPoint(19.0F, -14.0F, -1.0F);
/*     */     
/* 519 */     this.gunModel[100].addShapeBox(-4.0F, 1.0F, -3.0F, 7, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 520 */     this.gunModel[100].setRotationPoint(22.0F, -13.0F, -1.0F);
/*     */     
/* 522 */     this.gunModel[101].addShapeBox(-4.0F, 1.0F, -3.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 523 */     this.gunModel[101].setRotationPoint(20.0F, -17.0F, -0.5F);
/*     */     
/* 525 */     this.gunModel[102].addShapeBox(-4.0F, 1.0F, -3.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 526 */     this.gunModel[102].setRotationPoint(24.0F, -15.0F, -0.5F);
/*     */     
/* 528 */     this.gunModel[103].addShapeBox(-4.0F, 1.0F, -3.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 529 */     this.gunModel[103].setRotationPoint(20.0F, -15.0F, -0.5F);
/*     */     
/* 531 */     this.gunModel[104].addShapeBox(-4.0F, 1.0F, -3.0F, 12, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 532 */     this.gunModel[104].setRotationPoint(17.0F, -9.0F, 0.0F);
/*     */     
/* 534 */     this.gunModel[105].addBox(-4.0F, 1.0F, -3.0F, 10, 1, 1, 0.0F);
/* 535 */     this.gunModel[105].setRotationPoint(20.0F, -14.0F, 0.5F);
/*     */     
/* 537 */     this.gunModel[106].addShapeBox(-4.0F, 1.0F, -3.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 538 */     this.gunModel[106].setRotationPoint(20.0F, -15.0F, 0.5F);
/*     */     
/* 540 */     this.gunModel[107].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 541 */     this.gunModel[107].setRotationPoint(29.0F, -13.0F, -1.0F);
/*     */     
/* 543 */     this.gunModel[108].addShapeBox(-4.0F, 1.0F, -3.0F, 10, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 544 */     this.gunModel[108].setRotationPoint(20.0F, -17.0F, 4.5F);
/*     */     
/* 546 */     this.gunModel[109].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 547 */     this.gunModel[109].setRotationPoint(17.0F, -16.0F, 0.5F);
/*     */     
/* 549 */     this.gunModel[110].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 550 */     this.gunModel[110].setRotationPoint(19.0F, -14.0F, 6.0F);
/*     */     
/* 552 */     this.gunModel[111].addShapeBox(-4.0F, 1.0F, -3.0F, 7, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 553 */     this.gunModel[111].setRotationPoint(22.0F, -13.0F, 6.0F);
/*     */     
/* 555 */     this.gunModel[112].addShapeBox(-4.0F, 1.0F, -3.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 556 */     this.gunModel[112].setRotationPoint(24.0F, -15.0F, 4.5F);
/*     */     
/* 558 */     this.gunModel[113].addShapeBox(-4.0F, 1.0F, -3.0F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 559 */     this.gunModel[113].setRotationPoint(17.0F, -16.0F, 4.0F);
/*     */     
/* 561 */     this.gunModel[114].addBox(-4.0F, 1.0F, -3.0F, 10, 1, 1, 0.0F);
/* 562 */     this.gunModel[114].setRotationPoint(20.0F, -14.0F, 4.5F);
/*     */     
/* 564 */     this.gunModel[115].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 5, 1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 565 */     this.gunModel[115].setRotationPoint(20.0F, -13.0F, 6.0F);
/*     */     
/* 567 */     this.gunModel[116].addShapeBox(-4.0F, 1.0F, -3.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 568 */     this.gunModel[116].setRotationPoint(20.0F, -13.5F, 5.5F);
/*     */     
/* 570 */     this.gunModel[117].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F);
/* 571 */     this.gunModel[117].setRotationPoint(29.0F, -13.0F, 6.0F);
/*     */     
/* 573 */     this.gunModel[118].addShapeBox(-4.0F, 1.0F, -3.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 574 */     this.gunModel[118].setRotationPoint(20.0F, -15.0F, 4.5F);
/*     */     
/* 576 */     this.gunModel[119].addShapeBox(-4.0F, 1.0F, -3.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 577 */     this.gunModel[119].setRotationPoint(20.0F, -15.0F, 4.5F);
/*     */     
/* 579 */     this.gunModel[120].addShapeBox(-4.0F, 1.0F, -3.0F, 13, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 580 */     this.gunModel[120].setRotationPoint(17.0F, -8.0F, 2.0F);
/*     */     
/* 582 */     this.gunModel[121].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 583 */     this.gunModel[121].setRotationPoint(29.0F, -12.0F, 0.0F);
/*     */     
/* 585 */     this.gunModel[122].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 586 */     this.gunModel[122].setRotationPoint(30.0F, -12.0F, 1.0F);
/*     */     
/* 588 */     this.gunModel[123].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 589 */     this.gunModel[123].setRotationPoint(30.0F, -10.0F, 1.0F);
/*     */     
/* 591 */     this.gunModel[124].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 592 */     this.gunModel[124].setRotationPoint(30.0F, -13.0F, 1.0F);
/*     */     
/* 594 */     this.gunModel[125].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 595 */     this.gunModel[125].setRotationPoint(29.0F, -13.0F, 0.0F);
/*     */     
/* 597 */     this.gunModel[126].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 598 */     this.gunModel[126].setRotationPoint(29.0F, -13.5F, 0.5F);
/*     */     
/* 600 */     this.gunModel[127].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 601 */     this.gunModel[127].setRotationPoint(30.0F, -10.0F, 4.0F);
/*     */     
/* 603 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 604 */     this.gunModel[''].setRotationPoint(30.0F, -10.0F, 2.0F);
/*     */     
/* 606 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 607 */     this.gunModel[''].setRotationPoint(30.0F, -13.0F, 2.0F);
/*     */     
/* 609 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 610 */     this.gunModel[''].setRotationPoint(30.0F, -13.0F, 4.0F);
/*     */     
/* 612 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 613 */     this.gunModel[''].setRotationPoint(35.0F, -12.0F, 2.0F);
/*     */     
/* 615 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 616 */     this.gunModel[''].setRotationPoint(27.0F, -19.0F, 0.5F);
/*     */     
/* 618 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 619 */     this.gunModel[''].setRotationPoint(27.0F, -19.0F, 5.5F);
/*     */     
/* 621 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 622 */     this.gunModel[''].setRotationPoint(27.0F, -20.0F, 0.0F);
/*     */     
/* 624 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 625 */     this.gunModel[''].setRotationPoint(29.0F, -20.0F, 0.0F);
/*     */     
/* 627 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 628 */     this.gunModel[''].setRotationPoint(29.0F, -20.0F, 5.0F);
/*     */     
/* 630 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 631 */     this.gunModel[''].setRotationPoint(27.0F, -20.0F, 5.0F);
/*     */     
/* 633 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 634 */     this.gunModel[''].setRotationPoint(28.0F, -20.0F, 0.5F);
/*     */     
/* 636 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 637 */     this.gunModel[''].setRotationPoint(28.0F, -20.0F, 5.5F);
/*     */     
/* 639 */     this.gunModel[''].addBox(-4.0F, 1.0F, -3.0F, 2, 1, 2, 0.0F);
/* 640 */     this.gunModel[''].setRotationPoint(30.0F, -14.25F, 2.0F);
/*     */     
/* 642 */     this.gunModel[''].addBox(-4.0F, 1.0F, -3.0F, 1, 2, 2, 0.0F);
/* 643 */     this.gunModel[''].setRotationPoint(31.0F, -16.25F, 2.0F);
/*     */     
/* 645 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 646 */     this.gunModel[''].setRotationPoint(28.0F, -19.0F, 2.5F);
/*     */     
/* 648 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 649 */     this.gunModel[''].setRotationPoint(27.0F, -18.0F, 5.0F);
/*     */     
/* 651 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 652 */     this.gunModel[''].setRotationPoint(27.0F, -19.0F, 4.5F);
/*     */     
/* 654 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 655 */     this.gunModel[''].setRotationPoint(28.0F, -19.0F, 5.0F);
/*     */     
/* 657 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 658 */     this.gunModel[''].setRotationPoint(29.0F, -19.0F, 4.5F);
/*     */     
/* 660 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 661 */     this.gunModel[''].setRotationPoint(27.0F, -18.0F, 1.0F);
/*     */     
/* 663 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 664 */     this.gunModel[''].setRotationPoint(27.0F, -19.0F, 0.5F);
/*     */     
/* 666 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 667 */     this.gunModel[''].setRotationPoint(28.0F, -19.0F, 1.0F);
/*     */     
/* 669 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 670 */     this.gunModel[''].setRotationPoint(29.0F, -19.0F, 0.5F);
/*     */     
/* 672 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 673 */     this.gunModel[''].setRotationPoint(4.0F, -7.5F, 5.5F);
/*     */     
/* 675 */     this.gunModel[''].addBox(-4.0F, 1.0F, -3.0F, 1, 2, 1, 0.0F);
/* 676 */     this.gunModel[''].setRotationPoint(3.0F, -7.5F, 5.5F);
/*     */     
/* 678 */     this.gunModel[''].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 679 */     this.gunModel[''].setRotationPoint(2.0F, -7.5F, 5.5F);
/*     */     
/* 681 */     this.gunModel[''].addFlexBox(-4.0F, 1.0F, -3.0F, 0, 1, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 4);
/* 682 */     this.gunModel[''].setRotationPoint(16.0F, -3.0F, 1.5F);
/*     */     
/* 684 */     this.gunModel[''].addBox(-4.0F, 1.0F, -3.0F, 7, 1, 3, 0.0F);
/* 685 */     this.gunModel[''].setRotationPoint(9.0F, -3.0F, 1.5F);
/*     */     
/* 687 */     this.gunModel[''].addBox(-4.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F);
/* 688 */     this.gunModel[''].setRotationPoint(8.0F, -4.0F, 1.5F);
/*     */     
/* 690 */     this.gunModel[''].addBox(-4.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F);
/* 691 */     this.gunModel[''].setRotationPoint(7.0F, -5.0F, 1.5F);
/*     */     
/* 693 */     this.gunModel[''].addBox(-4.0F, 1.0F, -3.0F, 1, 4, 3, 0.0F);
/* 694 */     this.gunModel[''].setRotationPoint(6.0F, -8.0F, 1.5F);
/*     */     
/* 696 */     this.gunModel[''].addFlexBox(-4.0F, 1.0F, -3.0F, 0, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 697 */     this.gunModel[''].setRotationPoint(9.0F, -3.0F, 1.5F);
/*     */     
/* 699 */     this.gunModel[' '].addFlexBox(-4.0F, 1.0F, -3.0F, 0, 1, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 700 */     this.gunModel[' '].setRotationPoint(8.0F, -4.0F, 1.5F);
/*     */     
/* 702 */     this.gunModel['¡'].addFlexBox(-4.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4);
/* 703 */     this.gunModel['¡'].setRotationPoint(8.0F, -5.0F, 1.5F);
/*     */     
/* 705 */     this.gunModel['¢'].addFlexBox(-4.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4);
/* 706 */     this.gunModel['¢'].setRotationPoint(9.0F, -4.0F, 1.5F);
/*     */     
/* 708 */     this.gunModel['£'].addFlexBox(-4.0F, 1.0F, -3.0F, 1, 1, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4);
/* 709 */     this.gunModel['£'].setRotationPoint(7.0F, -6.0F, 1.5F);
/*     */     
/* 711 */     this.gunModel['¤'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 712 */     this.gunModel['¤'].setRotationPoint(29.0F, -14.0F, -0.5F);
/*     */     
/* 714 */     this.gunModel['¥'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 715 */     this.gunModel['¥'].setRotationPoint(29.0F, -14.0F, 5.0F);
/*     */     
/* 717 */     this.gunModel['¦'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 718 */     this.gunModel['¦'].setRotationPoint(-9.0F, -17.5F, 1.5F);
/*     */     
/* 720 */     this.gunModel['§'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 721 */     this.gunModel['§'].setRotationPoint(-9.0F, -17.5F, 1.0F);
/*     */     
/* 723 */     this.gunModel['¨'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 724 */     this.gunModel['¨'].setRotationPoint(-9.0F, -17.5F, 2.0F);
/*     */     
/* 726 */     this.gunModel['©'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 727 */     this.gunModel['©'].setRotationPoint(-9.0F, -17.5F, 2.5F);
/*     */     
/* 729 */     this.gunModel['ª'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 730 */     this.gunModel['ª'].setRotationPoint(-9.0F, -17.5F, 3.0F);
/*     */     
/* 732 */     this.gunModel['«'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 733 */     this.gunModel['«'].setRotationPoint(-9.0F, -17.5F, 3.5F);
/*     */     
/* 735 */     this.gunModel['¬'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 736 */     this.gunModel['¬'].setRotationPoint(-9.0F, -17.5F, 4.0F);
/*     */     
/* 738 */     this.gunModel['­'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 739 */     this.gunModel['­'].setRotationPoint(-9.0F, -17.5F, 4.5F);
/*     */     
/* 741 */     this.gunModel['®'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 742 */     this.gunModel['®'].setRotationPoint(-9.0F, -18.0F, 3.0F);
/*     */     
/* 744 */     this.gunModel['¯'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 745 */     this.gunModel['¯'].setRotationPoint(-9.0F, -18.0F, 2.5F);
/*     */     
/* 747 */     this.gunModel['°'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 748 */     this.gunModel['°'].setRotationPoint(-9.0F, -18.5F, 2.5F);
/*     */     
/* 750 */     this.gunModel['±'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 751 */     this.gunModel['±'].setRotationPoint(-9.0F, -18.5F, 3.0F);
/*     */     
/* 753 */     this.gunModel['²'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 754 */     this.gunModel['²'].setRotationPoint(-9.0F, -19.0F, 3.0F);
/*     */     
/* 756 */     this.gunModel['³'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 757 */     this.gunModel['³'].setRotationPoint(-9.0F, -19.0F, 2.5F);
/*     */     
/* 759 */     this.gunModel['´'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 760 */     this.gunModel['´'].setRotationPoint(-9.0F, -19.5F, 3.0F);
/*     */     
/* 762 */     this.gunModel['µ'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 763 */     this.gunModel['µ'].setRotationPoint(-9.0F, -19.5F, 2.5F);
/*     */     
/* 765 */     this.gunModel['¶'].addBox(-4.0F, 1.0F, -3.0F, 2, 2, 2, 0.0F);
/* 766 */     this.gunModel['¶'].setRotationPoint(-14.0F, -16.0F, 0.0F);
/*     */     
/* 768 */     this.gunModel['·'].addBox(-4.0F, 1.0F, -3.0F, 2, 2, 2, 0.0F);
/* 769 */     this.gunModel['·'].setRotationPoint(-14.0F, -14.0F, 0.0F);
/*     */     
/* 771 */     this.gunModel['¸'].addShapeBox(-4.0F, 1.0F, -3.0F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 772 */     this.gunModel['¸'].setRotationPoint(-14.25F, -12.0F, -0.25F);
/*     */     
/* 774 */     this.gunModel['¹'].addBox(-4.0F, 1.0F, -3.0F, 2, 1, 2, 0.0F);
/* 775 */     this.gunModel['¹'].setRotationPoint(-14.0F, -11.0F, 0.0F);
/*     */     
/* 777 */     this.gunModel['º'].addShapeBox(-4.0F, 1.0F, -3.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 778 */     this.gunModel['º'].setRotationPoint(-14.0F, -14.0F, -1.0F);
/*     */     
/* 780 */     this.gunModel['»'].addShapeBox(-4.0F, 1.0F, -3.0F, 9, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 781 */     this.gunModel['»'].setRotationPoint(-10.0F, -14.0F, -1.5F);
/*     */     
/* 783 */     this.gunModel['¼'].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 2, 1, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 784 */     this.gunModel['¼'].setRotationPoint(-1.0F, -12.5F, -1.5F);
/*     */     
/* 786 */     this.gunModel['½'].addShapeBox(-4.0F, 1.0F, -3.0F, 19, 2, 1, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 787 */     this.gunModel['½'].setRotationPoint(4.0F, -8.5F, -1.5F);
/*     */     
/* 789 */     this.gunModel['¾'].addBox(-4.0F, 1.0F, -3.0F, 2, 10, 3, 0.0F);
/* 790 */     this.gunModel['¾'].setRotationPoint(23.0F, -7.5F, -1.5F);
/*     */     
/* 792 */     this.gunModel['¿'].addBox(-4.0F, 1.0F, -3.0F, 1, 2, 1, 0.0F);
/* 793 */     this.gunModel['¿'].setRotationPoint(10.0F, -7.5F, 2.0F);
/*     */     
/* 795 */     this.gunModel['À'].addShapeBox(-4.0F, 1.0F, -3.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 796 */     this.gunModel['À'].setRotationPoint(10.0F, -5.5F, 2.0F);
/*     */     
/* 798 */     this.gunModel['Á'].addBox(-4.0F, 1.0F, -3.0F, 11, 6, 5, 0.0F);
/* 799 */     this.gunModel['Á'].setRotationPoint(9.0F, -16.0F, 1.0F);
/*     */     
/* 801 */     this.gunModel['Â'].addShapeBox(-4.0F, 1.0F, -3.0F, 12, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 802 */     this.gunModel['Â'].setRotationPoint(1.0F, -16.0F, 1.0F);
/*     */     
/* 804 */     this.gunModel['Ã'].addBox(-4.0F, 1.0F, -3.0F, 11, 6, 4, 0.0F);
/* 805 */     this.gunModel['Ã'].setRotationPoint(1.0F, -16.0F, 2.0F);
/*     */     
/*     */ 
/* 808 */     this.ammoModel = new ModelRendererTurbo[3];
/* 809 */     this.ammoModel[0] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/* 810 */     this.ammoModel[1] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/* 811 */     this.ammoModel[2] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*     */     
/* 813 */     this.ammoModel[0].addShapeBox(-4.0F, 1.0F, -3.0F, 4, 15, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 814 */     this.ammoModel[0].setRotationPoint(0.5F, -3.5F, 1.0F);
/*     */     
/* 816 */     this.ammoModel[1].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 817 */     this.ammoModel[1].setRotationPoint(0.5F, 10.5F, 0.0F);
/*     */     
/* 819 */     this.ammoModel[2].addShapeBox(-4.0F, 1.0F, -3.0F, 5, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 820 */     this.ammoModel[2].setRotationPoint(0.5F, 10.5F, 4.5F);
/*     */     
/*     */ 
/* 823 */     this.slideModel = new ModelRendererTurbo[1];
/* 824 */     this.slideModel[0] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/*     */     
/* 826 */     this.slideModel[0].addShapeBox(-4.0F, 1.0F, -3.0F, 8, 4, 1, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, -0.5F, 0.0F, -0.05F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 827 */     this.slideModel[0].setRotationPoint(1.0F, -16.0F, 0.5F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 832 */     translateAll(0.0F, -10.0F, 0.0F);
/* 833 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.14F, 0.0F);
/*     */     
/* 835 */     this.gunSlideDistance = 0.6F;
/* 836 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 838 */     this.tiltGun = 7.0F;
/* 839 */     this.rotateGunVertical = 3.0F;
/* 840 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 842 */     this.rotateClipVertical = 5.0F;
/* 843 */     this.translateClip = new Vector3f(0.0F, -4.0F, 0.0F);
/*     */     
/*     */ 
/*     */ 
/* 847 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelminiuzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */