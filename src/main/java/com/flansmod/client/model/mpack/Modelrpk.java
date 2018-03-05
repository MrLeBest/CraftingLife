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
/*     */ public class Modelrpk
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelrpk()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo['Û'];
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
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 465, 113, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 81, 121, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 321, 121, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 377, 121, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 193, 137, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 41, 129, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 425, 129, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 401, 89, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 273, 137, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 449, 137, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 297, 145, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 137, 145, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 201, 153, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 433, 161, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 121, 177, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 241, 185, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 321, 185, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 393, 185, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 241, 169, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 65, 193, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 121, 201, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 225, 201, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 273, 201, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 273, 209, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 225, 153, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 73, 217, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 169, 217, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 241, 217, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 241, 225, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 441, 209, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 265, 233, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 465, 185, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 121, 249, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 305, 249, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 257, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 257, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 257, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 161, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 185, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 265, this.textureX, this.textureY);
/* 176 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 185, this.textureX, this.textureY);
/* 177 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/* 178 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 113, this.textureX, this.textureY);
/* 179 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 180 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/* 181 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/* 182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/* 183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/* 184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/* 185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/* 188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/* 190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/* 191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/* 192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/* 193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/* 195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 177, 105, this.textureX, this.textureY);
/* 196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 385, 177, this.textureX, this.textureY);
/* 198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 449, 201, this.textureX, this.textureY);
/* 199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 489, 137, this.textureX, this.textureY);
/* 200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 65, 209, this.textureX, this.textureY);
/* 201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/* 205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/* 210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/* 211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/* 212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/* 213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/* 214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/* 215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/* 216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/* 217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/* 218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/* 219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 121, 137, this.textureX, this.textureY);
/* 220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/* 221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/* 224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/* 226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/* 228 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 129, 169, this.textureX, this.textureY);
/* 229 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/* 230 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 153, 217, this.textureX, this.textureY);
/* 231 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 377, 145, this.textureX, this.textureY);
/* 232 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 425, 281, this.textureX, this.textureY);
/* 233 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 489, 201, this.textureX, this.textureY);
/* 234 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 489, 249, this.textureX, this.textureY);
/* 235 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 465, 281, this.textureX, this.textureY);
/* 236 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 65, 289, this.textureX, this.textureY);
/* 237 */     this.gunModel['×'] = new ModelRendererTurbo(this, 105, 289, this.textureX, this.textureY);
/* 238 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 377, 345, this.textureX, this.textureY);
/* 239 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 129, 385, this.textureX, this.textureY);
/* 240 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 1, 393, this.textureX, this.textureY);
/*     */     
/* 242 */     this.gunModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 12, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -2.25F, 2.0F);
/* 243 */     this.gunModel[0].setRotationPoint(22.5F, -10.0F, -13.0F);
/*     */     
/* 245 */     this.gunModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 4, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -4.0F);
/* 246 */     this.gunModel[1].setRotationPoint(25.5F, -10.0F, -13.0F);
/*     */     
/* 248 */     this.gunModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 15, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 249 */     this.gunModel[2].setRotationPoint(22.5F, -25.0F, -15.0F);
/*     */     
/* 251 */     this.gunModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 5, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 252 */     this.gunModel[3].setRotationPoint(37.5F, -16.0F, -15.0F);
/*     */     
/* 254 */     this.gunModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 34, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F);
/* 255 */     this.gunModel[4].setRotationPoint(42.5F, -16.0F, -15.0F);
/*     */     
/* 257 */     this.gunModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 3, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.75F, -2.0F);
/* 258 */     this.gunModel[5].setRotationPoint(76.5F, -16.0F, -15.0F);
/*     */     
/* 260 */     this.gunModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 261 */     this.gunModel[6].setRotationPoint(79.5F, -16.0F, -15.0F);
/*     */     
/* 263 */     this.gunModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 6, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 264 */     this.gunModel[7].setRotationPoint(37.5F, -25.0F, -15.0F);
/*     */     
/* 266 */     this.gunModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 2, 9, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 267 */     this.gunModel[8].setRotationPoint(43.5F, -25.0F, -15.0F);
/*     */     
/* 269 */     this.gunModel[9].addShapeBox(59.0F, -19.0F, 7.0F, 35, 8, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 270 */     this.gunModel[9].setRotationPoint(45.5F, -24.0F, -15.0F);
/*     */     
/* 272 */     this.gunModel[10].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 273 */     this.gunModel[10].setRotationPoint(53.5F, -25.0F, -15.0F);
/*     */     
/* 275 */     this.gunModel[11].addShapeBox(59.0F, -19.0F, 7.0F, 8, 1, 16, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 276 */     this.gunModel[11].setRotationPoint(55.5F, -25.0F, -15.0F);
/*     */     
/* 278 */     this.gunModel[12].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 16, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 279 */     this.gunModel[12].setRotationPoint(73.5F, -25.0F, -15.0F);
/*     */     
/* 281 */     this.gunModel[13].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 16, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 282 */     this.gunModel[13].setRotationPoint(75.5F, -25.0F, -15.0F);
/*     */     
/* 284 */     this.gunModel[14].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 16, 0.0F, 1.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 285 */     this.gunModel[14].setRotationPoint(75.5F, -26.75F, -15.0F);
/*     */     
/* 287 */     this.gunModel[15].addShapeBox(59.0F, -19.0F, 7.0F, 39, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 288 */     this.gunModel[15].setRotationPoint(41.5F, -28.75F, -15.0F);
/*     */     
/* 290 */     this.gunModel[16].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 16, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 291 */     this.gunModel[16].setRotationPoint(56.0F, -26.75F, -15.0F);
/*     */     
/* 293 */     this.gunModel[17].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 16, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 294 */     this.gunModel[17].setRotationPoint(41.5F, -26.75F, -15.0F);
/*     */     
/* 296 */     this.gunModel[18].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 12, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 297 */     this.gunModel[18].setRotationPoint(41.5F, -36.75F, -13.0F);
/*     */     
/* 299 */     this.gunModel[19].addShapeBox(59.0F, -19.0F, 7.0F, 33, 3, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 300 */     this.gunModel[19].setRotationPoint(42.5F, -36.75F, -13.0F);
/*     */     
/* 302 */     this.gunModel[20].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 303 */     this.gunModel[20].setRotationPoint(75.5F, -35.75F, -13.0F);
/*     */     
/* 305 */     this.gunModel[21].addShapeBox(59.0F, -19.0F, 7.0F, 17, 11, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 306 */     this.gunModel[21].setRotationPoint(20.5F, -35.75F, -13.0F);
/*     */     
/* 308 */     this.gunModel[22].addShapeBox(59.0F, -19.0F, 7.0F, 10, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 309 */     this.gunModel[22].setRotationPoint(10.5F, -35.75F, -13.0F);
/*     */     
/* 311 */     this.gunModel[23].addShapeBox(59.0F, -19.0F, 7.0F, 39, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 312 */     this.gunModel[23].setRotationPoint(41.5F, -33.75F, -15.0F);
/*     */     
/* 314 */     this.gunModel[24].addShapeBox(59.0F, -19.0F, 7.0F, 15, 6, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 315 */     this.gunModel[24].setRotationPoint(22.5F, -16.0F, -15.0F);
/*     */     
/* 317 */     this.gunModel[25].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 318 */     this.gunModel[25].setRotationPoint(39.5F, -28.75F, -15.0F);
/*     */     
/* 320 */     this.gunModel[26].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 321 */     this.gunModel[26].setRotationPoint(39.5F, -33.75F, -15.0F);
/*     */     
/* 323 */     this.gunModel[27].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 12, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 324 */     this.gunModel[27].setRotationPoint(39.5F, -35.75F, -13.0F);
/*     */     
/* 326 */     this.gunModel[28].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 327 */     this.gunModel[28].setRotationPoint(37.5F, -35.25F, -11.5F);
/*     */     
/* 329 */     this.gunModel[29].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 330 */     this.gunModel[29].setRotationPoint(37.5F, -29.25F, -11.5F);
/*     */     
/* 332 */     this.gunModel[30].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 333 */     this.gunModel[30].setRotationPoint(37.5F, -32.25F, -11.5F);
/*     */     
/* 335 */     this.gunModel[31].addShapeBox(59.0F, -19.0F, 7.0F, 48, 15, 16, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 336 */     this.gunModel[31].setRotationPoint(-84.5F, -20.75F, -15.0F);
/*     */     
/* 338 */     this.gunModel[32].addShapeBox(59.0F, -19.0F, 7.0F, 44, 4, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.75F, 0.0F, 0.25F, -3.75F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 339 */     this.gunModel[32].setRotationPoint(-24.5F, -9.75F, -15.0F);
/*     */     
/* 341 */     this.gunModel[33].addShapeBox(59.0F, -19.0F, 7.0F, 2, 18, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.75F, 0.0F, 0.75F, -2.5F, 0.0F, 0.75F, -2.5F, 0.0F, 0.0F, -3.75F, 0.0F);
/* 342 */     this.gunModel[33].setRotationPoint(19.75F, -23.75F, -15.0F);
/*     */     
/* 344 */     this.gunModel[34].addShapeBox(59.0F, -19.0F, 7.0F, 12, 15, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 345 */     this.gunModel[34].setRotationPoint(-36.5F, -20.75F, -15.0F);
/*     */     
/* 347 */     this.gunModel[35].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 348 */     this.gunModel[35].setRotationPoint(-36.5F, -7.75F, -15.0F);
/*     */     
/* 350 */     this.gunModel[36].addShapeBox(59.0F, -19.0F, 7.0F, 8, 5, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 351 */     this.gunModel[36].setRotationPoint(-35.5F, -5.75F, -11.0F);
/*     */     
/* 353 */     this.gunModel[37].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 354 */     this.gunModel[37].setRotationPoint(-27.5F, -7.75F, -15.0F);
/*     */     
/* 356 */     this.gunModel[38].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 357 */     this.gunModel[38].setRotationPoint(-26.5F, -7.75F, -15.0F);
/*     */     
/* 359 */     this.gunModel[39].addShapeBox(59.0F, -19.0F, 7.0F, 30, 6, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 360 */     this.gunModel[39].setRotationPoint(-12.5F, -20.75F, -15.0F);
/*     */     
/* 362 */     this.gunModel[40].addShapeBox(59.0F, -19.0F, 7.0F, 30, 3, 16, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 363 */     this.gunModel[40].setRotationPoint(-12.5F, -13.75F, -15.0F);
/*     */     
/* 365 */     this.gunModel[41].addShapeBox(59.0F, -19.0F, 7.0F, 2, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 366 */     this.gunModel[41].setRotationPoint(17.75F, -20.75F, -15.0F);
/*     */     
/* 368 */     this.gunModel[42].addShapeBox(59.0F, -19.0F, 7.0F, 12, 11, 16, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 369 */     this.gunModel[42].setRotationPoint(-24.5F, -20.75F, -15.0F);
/*     */     
/* 371 */     this.gunModel[43].addShapeBox(59.0F, -19.0F, 7.0F, 30, 7, 15, 0.0F, 0.0F, -3.0F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F);
/* 372 */     this.gunModel[43].setRotationPoint(-12.5F, -19.75F, -14.5F);
/*     */     
/* 374 */     this.gunModel[44].addBox(59.0F, -19.0F, 7.0F, 25, 7, 7, 0.0F);
/* 375 */     this.gunModel[44].setRotationPoint(85.0F, -23.75F, -10.5F);
/*     */     
/* 377 */     this.gunModel[45].addBox(59.0F, -19.0F, 7.0F, 3, 8, 9, 0.0F);
/* 378 */     this.gunModel[45].setRotationPoint(82.0F, -24.25F, -11.5F);
/*     */     
/* 380 */     this.gunModel[46].addShapeBox(59.0F, -19.0F, 7.0F, 2, 10, 16, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 381 */     this.gunModel[46].setRotationPoint(80.0F, -25.75F, -15.0F);
/*     */     
/* 383 */     this.gunModel[47].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 16, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, -0.5F, -0.25F, -2.0F);
/* 384 */     this.gunModel[47].setRotationPoint(80.0F, -15.75F, -15.0F);
/*     */     
/* 386 */     this.gunModel[48].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 387 */     this.gunModel[48].setRotationPoint(80.0F, -28.75F, -15.0F);
/*     */     
/* 389 */     this.gunModel[49].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 16, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 390 */     this.gunModel[49].setRotationPoint(80.0F, -33.75F, -15.0F);
/*     */     
/* 392 */     this.gunModel[50].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 12, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 393 */     this.gunModel[50].setRotationPoint(80.0F, -34.75F, -13.0F);
/*     */     
/* 395 */     this.gunModel[51].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F);
/* 396 */     this.gunModel[51].setRotationPoint(82.0F, -16.25F, -11.5F);
/*     */     
/* 398 */     this.gunModel[52].addBox(59.0F, -19.0F, 7.0F, 60, 7, 7, 0.0F);
/* 399 */     this.gunModel[52].setRotationPoint(126.0F, -23.75F, -10.5F);
/*     */     
/* 401 */     this.gunModel[53].addShapeBox(59.0F, -19.0F, 7.0F, 16, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 402 */     this.gunModel[53].setRotationPoint(110.0F, -24.25F, -11.0F);
/*     */     
/* 404 */     this.gunModel[54].addShapeBox(59.0F, -19.0F, 7.0F, 14, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 405 */     this.gunModel[54].setRotationPoint(186.0F, -24.25F, -11.0F);
/*     */     
/* 407 */     this.gunModel[55].addBox(59.0F, -19.0F, 7.0F, 2, 7, 7, 0.0F);
/* 408 */     this.gunModel[55].setRotationPoint(200.0F, -23.75F, -10.5F);
/*     */     
/* 410 */     this.gunModel[56].addShapeBox(59.0F, -19.0F, 7.0F, 2, 7, 7, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 411 */     this.gunModel[56].setRotationPoint(202.0F, -23.75F, -10.5F);
/*     */     
/* 413 */     this.gunModel[57].addShapeBox(59.0F, -19.0F, 7.0F, 4, 6, 8, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 414 */     this.gunModel[57].setRotationPoint(186.75F, -30.25F, -11.0F);
/*     */     
/* 416 */     this.gunModel[58].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 417 */     this.gunModel[58].setRotationPoint(198.25F, -30.25F, -11.0F);
/*     */     
/* 419 */     this.gunModel[59].addShapeBox(59.0F, -19.0F, 7.0F, 9, 5, 8, 0.0F, -2.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.25F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 420 */     this.gunModel[59].setRotationPoint(190.25F, -35.25F, -11.0F);
/*     */     
/* 422 */     this.gunModel[60].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/* 423 */     this.gunModel[60].setRotationPoint(192.25F, -37.75F, -11.0F);
/*     */     
/* 425 */     this.gunModel[61].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 1, 0.0F, -1.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, -1.75F, 0.75F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F);
/* 426 */     this.gunModel[61].setRotationPoint(192.25F, -37.75F, -4.5F);
/*     */     
/* 428 */     this.gunModel[62].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 1, 0.0F, -1.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 429 */     this.gunModel[62].setRotationPoint(192.25F, -37.75F, -7.5F);
/*     */     
/* 431 */     this.gunModel[63].addBox(59.0F, -19.0F, 7.0F, 3, 4, 9, 0.0F);
/* 432 */     this.gunModel[63].setRotationPoint(82.0F, -32.25F, -11.5F);
/*     */     
/* 434 */     this.gunModel[64].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 435 */     this.gunModel[64].setRotationPoint(82.0F, -34.25F, -11.5F);
/*     */     
/* 437 */     this.gunModel[65].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 438 */     this.gunModel[65].setRotationPoint(82.0F, -28.25F, -11.5F);
/*     */     
/* 440 */     this.gunModel[66].addShapeBox(59.0F, -19.0F, 7.0F, 29, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 441 */     this.gunModel[66].setRotationPoint(85.0F, -34.25F, -10.5F);
/*     */     
/* 443 */     this.gunModel[67].addShapeBox(59.0F, -19.0F, 7.0F, 9, 2, 8, 0.0F, 0.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 444 */     this.gunModel[67].setRotationPoint(110.0F, -26.75F, -11.0F);
/*     */     
/* 446 */     this.gunModel[68].addShapeBox(59.0F, -19.0F, 7.0F, 9, 1, 8, 0.0F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 3.5F, -0.75F, 0.25F, 3.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 447 */     this.gunModel[68].setRotationPoint(110.0F, -24.75F, -11.0F);
/*     */     
/* 449 */     this.gunModel[69].addShapeBox(59.0F, -19.0F, 7.0F, 33, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 450 */     this.gunModel[69].setRotationPoint(85.0F, -14.75F, -8.5F);
/*     */     
/* 452 */     this.gunModel[70].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 453 */     this.gunModel[70].setRotationPoint(118.0F, -16.25F, -9.5F);
/*     */     
/* 455 */     this.gunModel[71].addShapeBox(59.0F, -19.0F, 7.0F, 70, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 456 */     this.gunModel[71].setRotationPoint(124.0F, -14.75F, -8.5F);
/*     */     
/* 458 */     this.gunModel[72].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 459 */     this.gunModel[72].setRotationPoint(194.0F, -16.25F, -9.5F);
/*     */     
/* 461 */     this.gunModel[73].addShapeBox(59.0F, -19.0F, 7.0F, 3, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F);
/* 462 */     this.gunModel[73].setRotationPoint(191.0F, -16.25F, -9.5F);
/*     */     
/* 464 */     this.gunModel[74].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 465 */     this.gunModel[74].setRotationPoint(188.0F, -16.25F, -9.5F);
/*     */     
/* 467 */     this.gunModel[75].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 468 */     this.gunModel[75].setRotationPoint(-35.5F, -0.75F, -11.0F);
/*     */     
/* 470 */     this.gunModel[76].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 471 */     this.gunModel[76].setRotationPoint(-35.5F, 1.25F, -11.0F);
/*     */     
/* 473 */     this.gunModel[77].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 474 */     this.gunModel[77].setRotationPoint(-35.5F, -7.75F, -15.0F);
/*     */     
/* 476 */     this.gunModel[78].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 477 */     this.gunModel[78].setRotationPoint(-29.5F, -0.75F, -9.0F);
/*     */     
/* 479 */     this.gunModel[79].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 480 */     this.gunModel[79].setRotationPoint(-30.0F, 1.25F, -9.0F);
/*     */     
/* 482 */     this.gunModel[80].addShapeBox(59.0F, -19.0F, 7.0F, 3, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 483 */     this.gunModel[80].setRotationPoint(-30.0F, 2.25F, -9.0F);
/*     */     
/* 485 */     this.gunModel[81].addShapeBox(59.0F, -19.0F, 7.0F, 1, 1, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 486 */     this.gunModel[81].setRotationPoint(-28.0F, 3.25F, -9.0F);
/*     */     
/* 488 */     this.gunModel[82].addShapeBox(59.0F, -19.0F, 7.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 489 */     this.gunModel[82].setRotationPoint(-28.0F, 4.25F, -9.0F);
/*     */     
/* 491 */     this.gunModel[83].addShapeBox(59.0F, -19.0F, 7.0F, 1, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 492 */     this.gunModel[83].setRotationPoint(-28.0F, -6.75F, -9.0F);
/*     */     
/* 494 */     this.gunModel[84].addShapeBox(59.0F, -19.0F, 7.0F, 1, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 495 */     this.gunModel[84].setRotationPoint(-36.0F, -6.75F, -9.5F);
/*     */     
/* 497 */     this.gunModel[85].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 498 */     this.gunModel[85].setRotationPoint(-36.0F, 5.25F, -9.5F);
/*     */     
/* 500 */     this.gunModel[86].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 5, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 501 */     this.gunModel[86].setRotationPoint(-53.75F, 7.25F, -9.5F);
/*     */     
/* 503 */     this.gunModel[87].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 504 */     this.gunModel[87].setRotationPoint(-55.5F, 5.25F, -9.5F);
/*     */     
/* 506 */     this.gunModel[88].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 507 */     this.gunModel[88].setRotationPoint(-55.75F, 1.25F, -9.5F);
/*     */     
/* 509 */     this.gunModel[89].addShapeBox(59.0F, -19.0F, 7.0F, 28, 17, 16, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 3.0F, -1.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 3.0F, -1.0F);
/* 510 */     this.gunModel[89].setRotationPoint(-114.5F, -21.25F, -15.0F);
/*     */     
/* 512 */     this.gunModel[90].addShapeBox(59.0F, -19.0F, 7.0F, 49, 14, 14, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 513 */     this.gunModel[90].setRotationPoint(-163.5F, -15.25F, -14.0F);
/*     */     
/* 515 */     this.gunModel[91].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 12, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 516 */     this.gunModel[91].setRotationPoint(-170.5F, -15.25F, -13.0F);
/*     */     
/* 518 */     this.gunModel[92].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 519 */     this.gunModel[92].setRotationPoint(-170.5F, -11.25F, -13.0F);
/*     */     
/* 521 */     this.gunModel[93].addShapeBox(59.0F, -19.0F, 7.0F, 2, 13, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 522 */     this.gunModel[93].setRotationPoint(-170.5F, -9.25F, -13.0F);
/*     */     
/* 524 */     this.gunModel[94].addShapeBox(59.0F, -19.0F, 7.0F, 4, 17, 12, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 525 */     this.gunModel[94].setRotationPoint(-172.5F, 3.75F, -13.0F);
/*     */     
/* 527 */     this.gunModel[95].addShapeBox(59.0F, -19.0F, 7.0F, 4, 37, 12, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F);
/* 528 */     this.gunModel[95].setRotationPoint(-168.0F, -14.25F, -13.0F);
/*     */     
/* 530 */     this.gunModel[96].addShapeBox(59.0F, -19.0F, 7.0F, 26, 5, 13, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 531 */     this.gunModel[96].setRotationPoint(-80.5F, -6.75F, -13.5F);
/*     */     
/* 533 */     this.gunModel[97].addShapeBox(59.0F, -19.0F, 7.0F, 24, 3, 13, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 534 */     this.gunModel[97].setRotationPoint(-79.5F, -1.75F, -13.5F);
/*     */     
/* 536 */     this.gunModel[98].addShapeBox(59.0F, -19.0F, 7.0F, 24, 2, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/* 537 */     this.gunModel[98].setRotationPoint(-79.5F, 1.25F, -13.5F);
/*     */     
/* 539 */     this.gunModel[99].addShapeBox(59.0F, -19.0F, 7.0F, 24, 1, 13, 0.0F, -1.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/* 540 */     this.gunModel[99].setRotationPoint(-79.5F, 3.25F, -13.5F);
/*     */     
/* 542 */     this.gunModel[100].addShapeBox(59.0F, -19.0F, 7.0F, 22, 1, 13, 0.0F, -1.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 543 */     this.gunModel[100].setRotationPoint(-79.5F, 4.25F, -13.5F);
/*     */     
/* 545 */     this.gunModel[101].addShapeBox(59.0F, -19.0F, 7.0F, 22, 2, 13, 0.0F, -1.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -2.75F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/* 546 */     this.gunModel[101].setRotationPoint(-79.5F, 5.25F, -13.5F);
/*     */     
/* 548 */     this.gunModel[102].addShapeBox(59.0F, -19.0F, 7.0F, 22, 21, 13, 0.0F, -1.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, 6.0F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, -12.5F, -0.25F, 0.0F, 6.0F, -0.25F, 0.0F);
/* 549 */     this.gunModel[102].setRotationPoint(-79.5F, 7.25F, -13.5F);
/*     */     
/* 551 */     this.gunModel[103].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 13, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/* 552 */     this.gunModel[103].setRotationPoint(-87.0F, 28.25F, -13.5F);
/*     */     
/* 554 */     this.gunModel[104].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 13, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F);
/* 555 */     this.gunModel[104].setRotationPoint(-87.0F, 30.25F, -13.5F);
/*     */     
/* 557 */     this.gunModel[105].addShapeBox(59.0F, -19.0F, 7.0F, 18, 2, 13, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/* 558 */     this.gunModel[105].setRotationPoint(-87.0F, 32.25F, -13.5F);
/*     */     
/* 560 */     this.gunModel[106].addShapeBox(59.0F, -19.0F, 7.0F, 15, 1, 13, 0.0F, -2.5F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -1.75F, 0.25F, 0.0F, -2.5F, 0.25F, 0.0F, -5.75F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -5.75F, -0.25F, 0.0F);
/* 561 */     this.gunModel[106].setRotationPoint(-84.0F, 34.25F, -13.5F);
/*     */     
/* 563 */     this.gunModel[107].addShapeBox(59.0F, -19.0F, 7.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 564 */     this.gunModel[107].setRotationPoint(-53.0F, -6.75F, -8.5F);
/*     */     
/* 566 */     this.gunModel[108].addShapeBox(59.0F, -19.0F, 7.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 567 */     this.gunModel[108].setRotationPoint(-53.0F, -5.75F, -8.5F);
/*     */     
/* 569 */     this.gunModel[109].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 570 */     this.gunModel[109].setRotationPoint(-52.75F, -4.75F, -8.5F);
/*     */     
/* 572 */     this.gunModel[110].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 573 */     this.gunModel[110].setRotationPoint(-52.75F, -3.75F, -8.5F);
/*     */     
/* 575 */     this.gunModel[111].addShapeBox(59.0F, -19.0F, 7.0F, 5, 1, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 576 */     this.gunModel[111].setRotationPoint(-52.75F, -2.75F, -8.5F);
/*     */     
/* 578 */     this.gunModel[112].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 3, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 579 */     this.gunModel[112].setRotationPoint(-52.75F, -1.75F, -8.5F);
/*     */     
/* 581 */     this.gunModel[113].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 3, 0.0F, -1.5F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/* 582 */     this.gunModel[113].setRotationPoint(-52.75F, 0.25F, -8.5F);
/*     */     
/* 584 */     this.gunModel[114].addShapeBox(59.0F, -19.0F, 7.0F, 7, 2, 3, 0.0F, -2.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -5.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F);
/* 585 */     this.gunModel[114].setRotationPoint(-51.75F, 3.25F, -8.5F);
/*     */     
/* 587 */     this.gunModel[115].addShapeBox(59.0F, -19.0F, 7.0F, 83, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 588 */     this.gunModel[115].setRotationPoint(-86.5F, -21.75F, 1.0F);
/*     */     
/* 590 */     this.gunModel[116].addShapeBox(59.0F, -19.0F, 7.0F, 83, 3, 1, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 591 */     this.gunModel[116].setRotationPoint(-86.5F, -24.75F, 1.0F);
/*     */     
/* 593 */     this.gunModel[117].addShapeBox(59.0F, -19.0F, 7.0F, 23, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 594 */     this.gunModel[117].setRotationPoint(-3.5F, -24.75F, 0.0F);
/*     */     
/* 596 */     this.gunModel[118].addShapeBox(59.0F, -19.0F, 7.0F, 28, 3, 17, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 597 */     this.gunModel[118].setRotationPoint(-86.5F, -24.75F, -16.0F);
/*     */     
/* 599 */     this.gunModel[119].addShapeBox(59.0F, -19.0F, 7.0F, 27, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 600 */     this.gunModel[119].setRotationPoint(-86.5F, -21.75F, -16.0F);
/*     */     
/* 602 */     this.gunModel[120].addShapeBox(59.0F, -19.0F, 7.0F, 103, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 603 */     this.gunModel[120].setRotationPoint(-83.5F, -26.75F, 0.0F);
/*     */     
/* 605 */     this.gunModel[121].addShapeBox(59.0F, -19.0F, 7.0F, 59, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 606 */     this.gunModel[121].setRotationPoint(-83.5F, -26.75F, -16.0F);
/*     */     
/* 608 */     this.gunModel[122].addShapeBox(59.0F, -19.0F, 7.0F, 14, 2, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 609 */     this.gunModel[122].setRotationPoint(-83.5F, -26.75F, -14.0F);
/*     */     
/* 611 */     this.gunModel[123].addShapeBox(59.0F, -19.0F, 7.0F, 92, 5, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 612 */     this.gunModel[123].setRotationPoint(-81.5F, -31.75F, -3.0F);
/*     */     
/* 614 */     this.gunModel[124].addShapeBox(59.0F, -19.0F, 7.0F, 56, 5, 3, 0.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 615 */     this.gunModel[124].setRotationPoint(-81.5F, -31.75F, -14.0F);
/*     */     
/* 617 */     this.gunModel[125].addShapeBox(59.0F, -19.0F, 7.0F, 12, 5, 8, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 618 */     this.gunModel[125].setRotationPoint(-81.5F, -31.75F, -11.0F);
/*     */     
/* 620 */     this.gunModel[126].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 621 */     this.gunModel[126].setRotationPoint(-77.5F, -34.75F, -5.0F);
/*     */     
/* 623 */     this.gunModel[127].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 624 */     this.gunModel[127].setRotationPoint(-77.5F, -34.75F, -12.0F);
/*     */     
/* 626 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 88, 3, 4, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 627 */     this.gunModel[''].setRotationPoint(-77.5F, -34.75F, -9.0F);
/*     */     
/* 629 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 630 */     this.gunModel[''].setRotationPoint(-74.5F, -35.75F, -9.0F);
/*     */     
/* 632 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 85, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 633 */     this.gunModel[''].setRotationPoint(-74.5F, -35.75F, -7.0F);
/*     */     
/* 635 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 10, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 636 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -13.0F);
/*     */     
/* 638 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 639 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -1.0F);
/*     */     
/* 641 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 5, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 642 */     this.gunModel[''].setRotationPoint(14.5F, -29.25F, -1.0F);
/*     */     
/* 644 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 35, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 645 */     this.gunModel[''].setRotationPoint(-59.5F, -24.75F, -15.0F);
/*     */     
/* 647 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 648 */     this.gunModel[''].setRotationPoint(-57.5F, -24.75F, -17.0F);
/*     */     
/* 650 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 651 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -17.0F);
/*     */     
/* 653 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 654 */     this.gunModel[''].setRotationPoint(-67.5F, -14.75F, -15.75F);
/*     */     
/* 656 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 657 */     this.gunModel[''].setRotationPoint(-64.5F, -17.75F, -15.75F);
/*     */     
/* 659 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 660 */     this.gunModel[''].setRotationPoint(-67.5F, -17.75F, -15.75F);
/*     */     
/* 662 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 663 */     this.gunModel[''].setRotationPoint(-67.5F, -11.75F, -15.75F);
/*     */     
/* 665 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 666 */     this.gunModel[''].setRotationPoint(-64.5F, -11.75F, -15.75F);
/*     */     
/* 668 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 669 */     this.gunModel[''].setRotationPoint(-61.5F, -11.75F, -15.75F);
/*     */     
/* 671 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 672 */     this.gunModel[''].setRotationPoint(-61.5F, -14.75F, -15.75F);
/*     */     
/* 674 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 21, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 675 */     this.gunModel[''].setRotationPoint(-58.5F, -16.75F, -15.75F);
/*     */     
/* 677 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 678 */     this.gunModel[''].setRotationPoint(-61.5F, -17.75F, -15.75F);
/*     */     
/* 680 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 681 */     this.gunModel[''].setRotationPoint(-65.0F, -14.25F, -16.0F);
/*     */     
/* 683 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 684 */     this.gunModel[''].setRotationPoint(-65.0F, -15.25F, -16.0F);
/*     */     
/* 686 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 687 */     this.gunModel[''].setRotationPoint(-65.0F, -12.75F, -16.0F);
/*     */     
/* 689 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 4, 8, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 690 */     this.gunModel[''].setRotationPoint(10.5F, -29.25F, -15.0F);
/*     */     
/* 692 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 5, 8, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 693 */     this.gunModel[''].setRotationPoint(14.5F, -29.25F, -15.0F);
/*     */     
/* 695 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 11, 0.0F, 0.0F, 0.0F, -1.2F, 1.0F, 0.0F, -1.2F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 696 */     this.gunModel[''].setRotationPoint(-25.5F, -29.75F, -14.0F);
/*     */     
/* 698 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 699 */     this.gunModel[''].setRotationPoint(-25.5F, -31.75F, -13.0F);
/*     */     
/* 701 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 57, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 702 */     this.gunModel[''].setRotationPoint(-81.5F, -26.75F, -14.0F);
/*     */     
/* 704 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 31, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 705 */     this.gunModel[''].setRotationPoint(-55.5F, -24.75F, -16.0F);
/*     */     
/* 707 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/* 708 */     this.gunModel[''].setRotationPoint(33.5F, -35.75F, -14.0F);
/*     */     
/* 710 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 711 */     this.gunModel[''].setRotationPoint(33.5F, -37.75F, -14.0F);
/*     */     
/* 713 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 714 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -14.0F);
/*     */     
/* 716 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 717 */     this.gunModel[''].setRotationPoint(38.5F, -37.75F, -14.0F);
/*     */     
/* 719 */     this.gunModel[''].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 720 */     this.gunModel[''].setRotationPoint(36.5F, -37.75F, -1.0F);
/*     */     
/* 722 */     this.gunModel[' '].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 723 */     this.gunModel[' '].setRotationPoint(38.5F, -37.75F, -1.0F);
/*     */     
/* 725 */     this.gunModel['¡'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 726 */     this.gunModel['¡'].setRotationPoint(28.5F, -37.75F, -3.0F);
/*     */     
/* 728 */     this.gunModel['¢'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/* 729 */     this.gunModel['¢'].setRotationPoint(23.5F, -37.75F, -2.0F);
/*     */     
/* 731 */     this.gunModel['£'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 732 */     this.gunModel['£'].setRotationPoint(27.5F, -37.75F, -3.0F);
/*     */     
/* 734 */     this.gunModel['¤'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 735 */     this.gunModel['¤'].setRotationPoint(28.5F, -37.75F, -13.0F);
/*     */     
/* 737 */     this.gunModel['¥'].addShapeBox(59.0F, -19.0F, 7.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F);
/* 738 */     this.gunModel['¥'].setRotationPoint(23.5F, -37.75F, -13.0F);
/*     */     
/* 740 */     this.gunModel['¦'].addShapeBox(59.0F, -19.0F, 7.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 741 */     this.gunModel['¦'].setRotationPoint(27.5F, -37.75F, -12.0F);
/*     */     
/* 743 */     this.gunModel['§'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 744 */     this.gunModel['§'].setRotationPoint(29.0F, -38.75F, -3.0F);
/*     */     
/* 746 */     this.gunModel['¨'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 747 */     this.gunModel['¨'].setRotationPoint(29.0F, -38.75F, -13.0F);
/*     */     
/* 749 */     this.gunModel['©'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 750 */     this.gunModel['©'].setRotationPoint(13.0F, -37.75F, -4.0F);
/*     */     
/* 752 */     this.gunModel['ª'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 753 */     this.gunModel['ª'].setRotationPoint(13.0F, -36.75F, -4.0F);
/*     */     
/* 755 */     this.gunModel['«'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 756 */     this.gunModel['«'].setRotationPoint(13.0F, -35.75F, -1.0F);
/*     */     
/* 758 */     this.gunModel['¬'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 759 */     this.gunModel['¬'].setRotationPoint(13.0F, -37.75F, -15.0F);
/*     */     
/* 761 */     this.gunModel['­'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 762 */     this.gunModel['­'].setRotationPoint(13.0F, -36.75F, -15.0F);
/*     */     
/* 764 */     this.gunModel['®'].addShapeBox(59.0F, -19.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 765 */     this.gunModel['®'].setRotationPoint(13.0F, -35.75F, -15.0F);
/*     */     
/* 767 */     this.gunModel['¯'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 768 */     this.gunModel['¯'].setRotationPoint(13.5F, -37.75F, -11.0F);
/*     */     
/* 770 */     this.gunModel['°'].addShapeBox(59.0F, -19.0F, 7.0F, 20, 2, 3, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 771 */     this.gunModel['°'].setRotationPoint(13.5F, -37.75F, -6.0F);
/*     */     
/* 773 */     this.gunModel['±'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 2, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 774 */     this.gunModel['±'].setRotationPoint(33.5F, -37.75F, -6.0F);
/*     */     
/* 776 */     this.gunModel['²'].addShapeBox(59.0F, -19.0F, 7.0F, 23, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 777 */     this.gunModel['²'].setRotationPoint(13.5F, -37.75F, -8.0F);
/*     */     
/* 779 */     this.gunModel['³'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F);
/* 780 */     this.gunModel['³'].setRotationPoint(33.5F, -35.75F, -1.0F);
/*     */     
/* 782 */     this.gunModel['´'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 783 */     this.gunModel['´'].setRotationPoint(-6.5F, -31.75F, -3.0F);
/*     */     
/* 785 */     this.gunModel['µ'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 786 */     this.gunModel['µ'].setRotationPoint(-6.5F, -34.75F, -4.5F);
/*     */     
/* 788 */     this.gunModel['¶'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 789 */     this.gunModel['¶'].setRotationPoint(-6.5F, -35.75F, -7.0F);
/*     */     
/* 791 */     this.gunModel['·'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 792 */     this.gunModel['·'].setRotationPoint(-6.5F, -35.75F, -9.0F);
/*     */     
/* 794 */     this.gunModel['¸'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 795 */     this.gunModel['¸'].setRotationPoint(-6.5F, -34.75F, -12.5F);
/*     */     
/* 797 */     this.gunModel['¹'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 798 */     this.gunModel['¹'].setRotationPoint(-31.5F, -31.75F, -3.0F);
/*     */     
/* 800 */     this.gunModel['º'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 801 */     this.gunModel['º'].setRotationPoint(-31.5F, -34.75F, -4.5F);
/*     */     
/* 803 */     this.gunModel['»'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 804 */     this.gunModel['»'].setRotationPoint(-31.5F, -35.75F, -7.0F);
/*     */     
/* 806 */     this.gunModel['¼'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 807 */     this.gunModel['¼'].setRotationPoint(-31.5F, -35.75F, -9.0F);
/*     */     
/* 809 */     this.gunModel['½'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 810 */     this.gunModel['½'].setRotationPoint(-31.5F, -34.75F, -12.5F);
/*     */     
/* 812 */     this.gunModel['¾'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 813 */     this.gunModel['¾'].setRotationPoint(-59.5F, -31.75F, -3.0F);
/*     */     
/* 815 */     this.gunModel['¿'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 816 */     this.gunModel['¿'].setRotationPoint(-59.5F, -34.75F, -4.5F);
/*     */     
/* 818 */     this.gunModel['À'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 819 */     this.gunModel['À'].setRotationPoint(-59.5F, -35.75F, -7.0F);
/*     */     
/* 821 */     this.gunModel['Á'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 822 */     this.gunModel['Á'].setRotationPoint(-59.5F, -35.75F, -9.0F);
/*     */     
/* 824 */     this.gunModel['Â'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 3, 3, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 825 */     this.gunModel['Â'].setRotationPoint(-59.5F, -34.75F, -12.5F);
/*     */     
/* 827 */     this.gunModel['Ã'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 828 */     this.gunModel['Ã'].setRotationPoint(-31.5F, -31.75F, -14.0F);
/*     */     
/* 830 */     this.gunModel['Ä'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 831 */     this.gunModel['Ä'].setRotationPoint(-59.5F, -31.75F, -14.0F);
/*     */     
/* 833 */     this.gunModel['Å'].addShapeBox(59.0F, -19.0F, 7.0F, 9, 3, 4, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 834 */     this.gunModel['Å'].setRotationPoint(-84.0F, -29.75F, -9.0F);
/*     */     
/* 836 */     this.gunModel['Æ'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 837 */     this.gunModel['Æ'].setRotationPoint(-79.5F, -16.75F, 0.5F);
/*     */     
/* 839 */     this.gunModel['Ç'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 840 */     this.gunModel['Ç'].setRotationPoint(-45.5F, -12.75F, 0.5F);
/*     */     
/* 842 */     this.gunModel['È'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 843 */     this.gunModel['È'].setRotationPoint(-28.5F, -12.75F, 0.5F);
/*     */     
/* 845 */     this.gunModel['É'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 846 */     this.gunModel['É'].setRotationPoint(-15.5F, -18.75F, 0.5F);
/*     */     
/* 848 */     this.gunModel['Ê'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 849 */     this.gunModel['Ê'].setRotationPoint(-77.5F, -16.75F, -15.5F);
/*     */     
/* 851 */     this.gunModel['Ë'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 852 */     this.gunModel['Ë'].setRotationPoint(-67.5F, -8.75F, -15.5F);
/*     */     
/* 854 */     this.gunModel['Ì'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 855 */     this.gunModel['Ì'].setRotationPoint(-33.5F, -12.75F, -15.5F);
/*     */     
/* 857 */     this.gunModel['Í'].addShapeBox(59.0F, -19.0F, 7.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 858 */     this.gunModel['Í'].setRotationPoint(-33.5F, -17.75F, -15.5F);
/*     */     
/* 860 */     this.gunModel['Î'].addShapeBox(59.0F, -19.0F, 7.0F, 18, 4, 1, 0.0F, -4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 861 */     this.gunModel['Î'].setRotationPoint(-55.5F, -20.75F, -16.0F);
/*     */     
/* 863 */     this.gunModel['Ï'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, -2.0F, -0.5F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 864 */     this.gunModel['Ï'].setRotationPoint(-37.5F, -20.75F, -16.0F);
/*     */     
/* 866 */     this.gunModel['Ð'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 8, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 867 */     this.gunModel['Ð'].setRotationPoint(153.0F, -24.25F, -11.0F);
/*     */     
/* 869 */     this.gunModel['Ñ'].addShapeBox(59.0F, -19.0F, 7.0F, 6, 4, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 870 */     this.gunModel['Ñ'].setRotationPoint(154.5F, -16.25F, -9.5F);
/*     */     
/* 872 */     this.gunModel['Ò'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 5, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 873 */     this.gunModel['Ò'].setRotationPoint(187.0F, -15.75F, -11.0F);
/*     */     
/* 875 */     this.gunModel['Ó'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 5, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 876 */     this.gunModel['Ó'].setRotationPoint(187.0F, -10.25F, -11.0F);
/*     */     
/* 878 */     this.gunModel['Ô'].addShapeBox(59.0F, -19.0F, 7.0F, 3, 5, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 879 */     this.gunModel['Ô'].setRotationPoint(192.0F, -10.25F, -11.0F);
/*     */     
/* 881 */     this.gunModel['Õ'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 2, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 4.25F, 0.0F, 0.25F, 4.25F, 0.0F, 0.25F, 4.25F, 0.0F, 0.25F, 4.25F);
/* 882 */     this.gunModel['Õ'].setRotationPoint(187.0F, -4.75F, -11.0F);
/*     */     
/* 884 */     this.gunModel['Ö'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 92, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -18.75F, 0.0F, 0.25F, -18.75F, 0.0F, 0.25F, 19.25F, 0.0F, 0.25F, 19.25F);
/* 885 */     this.gunModel['Ö'].setRotationPoint(187.0F, -2.25F, -7.0F);
/*     */     
/* 887 */     this.gunModel['×'].addShapeBox(59.0F, -19.0F, 7.0F, 8, 92, 8, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 19.25F, 0.0F, 0.25F, 19.25F, 0.0F, 0.25F, -18.75F, 0.0F, 0.25F, -18.75F);
/* 888 */     this.gunModel['×'].setRotationPoint(187.0F, -2.25F, -15.0F);
/*     */     
/* 890 */     this.gunModel['Ø'].addShapeBox(59.0F, -19.0F, 7.0F, 49, 8, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 891 */     this.gunModel['Ø'].setRotationPoint(-163.5F, -1.25F, -14.0F);
/*     */     
/* 893 */     this.gunModel['Ù'].addShapeBox(59.0F, -19.0F, 7.0F, 37, 10, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 894 */     this.gunModel['Ù'].setRotationPoint(-163.5F, 10.75F, -14.0F);
/*     */     
/* 896 */     this.gunModel['Ú'].addShapeBox(59.0F, -19.0F, 7.0F, 40, 4, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 897 */     this.gunModel['Ú'].setRotationPoint(-163.5F, 6.75F, -14.0F);
/*     */     
/*     */ 
/* 900 */     this.ammoModel = new ModelRendererTurbo[8];
/* 901 */     this.ammoModel[0] = new ModelRendererTurbo(this, 209, 281, this.textureX, this.textureY);
/* 902 */     this.ammoModel[1] = new ModelRendererTurbo(this, 353, 281, this.textureX, this.textureY);
/* 903 */     this.ammoModel[2] = new ModelRendererTurbo(this, 145, 305, this.textureX, this.textureY);
/* 904 */     this.ammoModel[3] = new ModelRendererTurbo(this, 233, 305, this.textureX, this.textureY);
/* 905 */     this.ammoModel[4] = new ModelRendererTurbo(this, 273, 321, this.textureX, this.textureY);
/* 906 */     this.ammoModel[5] = new ModelRendererTurbo(this, 425, 305, this.textureX, this.textureY);
/* 907 */     this.ammoModel[6] = new ModelRendererTurbo(this, 145, 345, this.textureX, this.textureY);
/* 908 */     this.ammoModel[7] = new ModelRendererTurbo(this, 417, 377, this.textureX, this.textureY);
/*     */     
/* 910 */     this.ammoModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 26, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 911 */     this.ammoModel[0].setRotationPoint(-25.5F, -11.75F, -13.5F);
/*     */     
/* 913 */     this.ammoModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 26, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 914 */     this.ammoModel[1].setRotationPoint(-25.5F, -7.75F, -15.5F);
/*     */     
/* 916 */     this.ammoModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 26, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, -17.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 917 */     this.ammoModel[2].setRotationPoint(-25.5F, -7.75F, 1.5F);
/*     */     
/* 919 */     this.ammoModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 26, 17, 17, 0.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 920 */     this.ammoModel[3].setRotationPoint(-25.5F, -7.75F, -32.5F);
/*     */     
/* 922 */     this.ammoModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 26, 17, 51, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 923 */     this.ammoModel[4].setRotationPoint(-21.5F, 9.25F, -32.5F);
/*     */     
/* 925 */     this.ammoModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 26, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 926 */     this.ammoModel[5].setRotationPoint(-17.5F, 26.25F, -15.5F);
/*     */     
/* 928 */     this.ammoModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 26, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, -17.0F, -4.0F, 0.0F, -17.0F);
/* 929 */     this.ammoModel[6].setRotationPoint(-17.5F, 26.25F, 1.5F);
/*     */     
/* 931 */     this.ammoModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 26, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -17.0F, 4.0F, 0.0F, -17.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 932 */     this.ammoModel[7].setRotationPoint(-17.5F, 26.25F, -32.5F);
/*     */     
/*     */ 
/* 935 */     this.slideModel = new ModelRendererTurbo[9];
/* 936 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 937 */     this.slideModel[1] = new ModelRendererTurbo(this, 449, 233, this.textureX, this.textureY);
/* 938 */     this.slideModel[2] = new ModelRendererTurbo(this, 57, 273, this.textureX, this.textureY);
/* 939 */     this.slideModel[3] = new ModelRendererTurbo(this, 297, 273, this.textureX, this.textureY);
/* 940 */     this.slideModel[4] = new ModelRendererTurbo(this, 137, 281, this.textureX, this.textureY);
/* 941 */     this.slideModel[5] = new ModelRendererTurbo(this, 185, 193, this.textureX, this.textureY);
/* 942 */     this.slideModel[6] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/* 943 */     this.slideModel[7] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 944 */     this.slideModel[8] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*     */     
/* 946 */     this.slideModel[0].addShapeBox(59.0F, -19.0F, 7.0F, 17, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 947 */     this.slideModel[0].setRotationPoint(-24.5F, -24.75F, -14.0F);
/*     */     
/* 949 */     this.slideModel[1].addShapeBox(59.0F, -19.0F, 7.0F, 17, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 950 */     this.slideModel[1].setRotationPoint(-24.5F, -25.75F, -13.0F);
/*     */     
/* 952 */     this.slideModel[2].addShapeBox(59.0F, -19.0F, 7.0F, 35, 5, 9, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, -1.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 953 */     this.slideModel[2].setRotationPoint(-24.5F, -30.75F, -12.0F);
/*     */     
/* 955 */     this.slideModel[3].addShapeBox(59.0F, -19.0F, 7.0F, 18, 3, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 956 */     this.slideModel[3].setRotationPoint(-7.5F, -24.75F, -14.0F);
/*     */     
/* 958 */     this.slideModel[4].addShapeBox(59.0F, -19.0F, 7.0F, 18, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 959 */     this.slideModel[4].setRotationPoint(-7.5F, -25.75F, -13.0F);
/*     */     
/* 961 */     this.slideModel[5].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 12, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 962 */     this.slideModel[5].setRotationPoint(7.5F, -25.75F, -20.0F);
/*     */     
/* 964 */     this.slideModel[6].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 8, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 965 */     this.slideModel[6].setRotationPoint(8.5F, -25.75F, -15.0F);
/*     */     
/* 967 */     this.slideModel[7].addShapeBox(59.0F, -19.0F, 7.0F, 2, 4, 1, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 968 */     this.slideModel[7].setRotationPoint(8.5F, -25.75F, -16.0F);
/*     */     
/* 970 */     this.slideModel[8].addShapeBox(59.0F, -19.0F, 7.0F, 1, 4, 2, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 971 */     this.slideModel[8].setRotationPoint(8.5F, -25.75F, -18.0F);
/*     */     
/*     */ 
/*     */ 
/* 975 */     this.gripAttachPoint = new Vector3f(7.0625F, 2.6875F, 0.0F);
/*     */     
/*     */ 
/* 978 */     translateAll(0.0F, -32.75F, 0.0F);
/* 979 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*     */     
/* 981 */     this.gunSlideDistance = 0.75F;
/* 982 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 985 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelrpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */