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
/*     */ public class Modelskorpion
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelskorpion()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo['Î'];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 257, 105, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 233, 113, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 481, 105, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 425, 113, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 457, 113, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 57, 121, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 89, 121, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 257, 121, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 297, 121, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 313, 121, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 225, 129, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 393, 129, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 257, 137, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 49, 145, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 97, 145, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 145, 145, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 177, 145, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 177, 161, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 393, 153, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 289, 145, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 345, 145, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 457, 153, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 385, 177, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 241, 185, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 81, 169, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 113, 209, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 345, 121, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 33, 145, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 81, 145, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 129, 145, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 337, 193, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 209, 209, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 249, 209, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 289, 209, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 377, 209, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 417, 209, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 457, 209, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 313, 217, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 97, 225, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 137, 225, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 33, 233, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 169, 225, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 201, 233, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 249, 233, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 281, 233, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 321, 233, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 353, 233, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 377, 233, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 433, 233, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 49, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 257, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 57, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 209, this.textureX, this.textureY);
/* 176 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 57, this.textureX, this.textureY);
/* 177 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/* 178 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 179 */     this.gunModel[''] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/* 180 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/* 181 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/* 182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/* 183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/* 184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/* 185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/* 186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/* 187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/* 188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/* 189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/* 190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 369, 73, this.textureX, this.textureY);
/* 191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/* 192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/* 193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1, 265, this.textureX, this.textureY);
/* 195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 393, 249, this.textureX, this.textureY);
/* 196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 233, 233, this.textureX, this.textureY);
/* 197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 281, 249, this.textureX, this.textureY);
/* 198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 121, 241, this.textureX, this.textureY);
/* 199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 209, 257, this.textureX, this.textureY);
/* 200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/* 202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/* 203 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/* 204 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 321, 249, this.textureX, this.textureY);
/* 205 */     this.gunModel['·'] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/* 206 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 297, 89, this.textureX, this.textureY);
/* 207 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/* 208 */     this.gunModel['º'] = new ModelRendererTurbo(this, 289, 81, this.textureX, this.textureY);
/* 209 */     this.gunModel['»'] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/* 210 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 425, 97, this.textureX, this.textureY);
/* 211 */     this.gunModel['½'] = new ModelRendererTurbo(this, 337, 249, this.textureX, this.textureY);
/* 212 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/* 213 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 481, 233, this.textureX, this.textureY);
/* 214 */     this.gunModel['À'] = new ModelRendererTurbo(this, 257, 265, this.textureX, this.textureY);
/* 215 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
/* 216 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 217 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/* 218 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 281, 105, this.textureX, this.textureY);
/* 219 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/* 220 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/* 221 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/* 222 */     this.gunModel['È'] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/* 223 */     this.gunModel['É'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/* 224 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/* 225 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 226 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/* 227 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*     */     
/* 229 */     this.gunModel[0].addBox(53.0F, -20.0F, -7.5F, 1, 18, 8, 0.0F);
/* 230 */     this.gunModel[0].setRotationPoint(-38.5F, -10.0F, 3.0F);
/*     */     
/* 232 */     this.gunModel[1].addBox(53.0F, -20.0F, -7.5F, 22, 18, 14, 0.0F);
/* 233 */     this.gunModel[1].setRotationPoint(-60.5F, -10.0F, 0.0F);
/*     */     
/* 235 */     this.gunModel[2].addBox(53.0F, -20.0F, -7.5F, 3, 18, 14, 0.0F);
/* 236 */     this.gunModel[2].setRotationPoint(-63.5F, -10.0F, 0.0F);
/*     */     
/* 238 */     this.gunModel[3].addBox(53.0F, -20.0F, -7.5F, 1, 12, 14, 0.0F);
/* 239 */     this.gunModel[3].setRotationPoint(-64.5F, -10.0F, 0.0F);
/*     */     
/* 241 */     this.gunModel[4].addShapeBox(53.0F, -20.0F, -7.5F, 2, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 242 */     this.gunModel[4].setRotationPoint(-66.5F, -10.0F, 0.0F);
/*     */     
/* 244 */     this.gunModel[5].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F);
/* 245 */     this.gunModel[5].setRotationPoint(-70.5F, -7.0F, 0.0F);
/*     */     
/* 247 */     this.gunModel[6].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 248 */     this.gunModel[6].setRotationPoint(-70.5F, -10.0F, 0.0F);
/*     */     
/* 250 */     this.gunModel[7].addShapeBox(53.0F, -20.0F, -7.5F, 1, 6, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 251 */     this.gunModel[7].setRotationPoint(-64.5F, 2.0F, 0.0F);
/*     */     
/* 253 */     this.gunModel[8].addShapeBox(53.0F, -20.0F, -7.5F, 15, 6, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 254 */     this.gunModel[8].setRotationPoint(-66.0F, 8.0F, 0.0F);
/*     */     
/* 256 */     this.gunModel[9].addShapeBox(53.0F, -20.0F, -7.5F, 17, 6, 14, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 257 */     this.gunModel[9].setRotationPoint(-68.0F, 14.0F, 0.0F);
/*     */     
/* 259 */     this.gunModel[10].addShapeBox(53.0F, -20.0F, -7.5F, 17, 8, 14, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 260 */     this.gunModel[10].setRotationPoint(-68.0F, 20.0F, 0.0F);
/*     */     
/* 262 */     this.gunModel[11].addShapeBox(53.0F, -20.0F, -7.5F, 17, 8, 14, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/* 263 */     this.gunModel[11].setRotationPoint(-68.0F, 28.0F, 0.0F);
/*     */     
/* 265 */     this.gunModel[12].addShapeBox(53.0F, -20.0F, -7.5F, 17, 5, 14, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 5.25F, -0.5F, 0.0F);
/* 266 */     this.gunModel[12].setRotationPoint(-68.0F, 36.0F, 0.0F);
/*     */     
/* 268 */     this.gunModel[13].addShapeBox(53.0F, -20.0F, -7.5F, 6, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 269 */     this.gunModel[13].setRotationPoint(-51.0F, 36.0F, 0.0F);
/*     */     
/* 271 */     this.gunModel[14].addShapeBox(53.0F, -20.0F, -7.5F, 6, 7, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 272 */     this.gunModel[14].setRotationPoint(-51.0F, 29.0F, 0.0F);
/*     */     
/* 274 */     this.gunModel[15].addShapeBox(53.0F, -20.0F, -7.5F, 6, 9, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 275 */     this.gunModel[15].setRotationPoint(-51.0F, 20.0F, 0.0F);
/*     */     
/* 277 */     this.gunModel[16].addShapeBox(53.0F, -20.0F, -7.5F, 6, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 278 */     this.gunModel[16].setRotationPoint(-51.0F, 15.0F, 0.0F);
/*     */     
/* 280 */     this.gunModel[17].addShapeBox(53.0F, -20.0F, -7.5F, 7, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 281 */     this.gunModel[17].setRotationPoint(-51.0F, 10.0F, 0.0F);
/*     */     
/* 283 */     this.gunModel[18].addShapeBox(53.0F, -20.0F, -7.5F, 9, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 284 */     this.gunModel[18].setRotationPoint(-51.0F, 8.0F, 0.0F);
/*     */     
/* 286 */     this.gunModel[19].addShapeBox(53.0F, -20.0F, -7.5F, 13, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 287 */     this.gunModel[19].setRotationPoint(-34.5F, 7.5F, 3.0F);
/*     */     
/* 289 */     this.gunModel[20].addShapeBox(53.0F, -20.0F, -7.5F, 3, 2, 8, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 290 */     this.gunModel[20].setRotationPoint(-37.5F, 7.5F, 3.0F);
/*     */     
/* 292 */     this.gunModel[21].addShapeBox(53.0F, -20.0F, -7.5F, 3, 2, 8, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 293 */     this.gunModel[21].setRotationPoint(-21.5F, 6.0F, 3.0F);
/*     */     
/* 295 */     this.gunModel[22].addShapeBox(53.0F, -20.0F, -7.5F, 3, 2, 8, 0.0F, 0.0F, -4.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 4.5F, 0.0F, -0.5F, 2.5F, 0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 4.5F, 0.0F);
/* 296 */     this.gunModel[22].setRotationPoint(-18.5F, 1.5F, 3.0F);
/*     */     
/* 298 */     this.gunModel[23].addShapeBox(53.0F, -20.0F, -7.5F, 2, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 299 */     this.gunModel[23].setRotationPoint(-16.0F, -2.5F, 3.0F);
/*     */     
/* 301 */     this.gunModel[24].addShapeBox(53.0F, -20.0F, -7.5F, 2, 4, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 302 */     this.gunModel[24].setRotationPoint(-16.0F, -6.5F, 3.0F);
/*     */     
/* 304 */     this.gunModel[25].addShapeBox(53.0F, -20.0F, -7.5F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 305 */     this.gunModel[25].setRotationPoint(-19.5F, -9.5F, 3.0F);
/*     */     
/* 307 */     this.gunModel[26].addShapeBox(53.0F, -20.0F, -7.5F, 1, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 308 */     this.gunModel[26].setRotationPoint(-16.5F, -7.5F, 3.0F);
/*     */     
/* 310 */     this.gunModel[27].addShapeBox(53.0F, -20.0F, -7.5F, 17, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 311 */     this.gunModel[27].setRotationPoint(-37.5F, -9.5F, 3.0F);
/*     */     
/* 313 */     this.gunModel[28].addShapeBox(53.0F, -20.0F, -7.5F, 1, 2, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 314 */     this.gunModel[28].setRotationPoint(-20.5F, -9.5F, 3.0F);
/*     */     
/* 316 */     this.gunModel[29].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 317 */     this.gunModel[29].setRotationPoint(-27.25F, -7.5F, 3.0F);
/*     */     
/* 319 */     this.gunModel[30].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 320 */     this.gunModel[30].setRotationPoint(-34.25F, -7.5F, 4.0F);
/*     */     
/* 322 */     this.gunModel[31].addShapeBox(53.0F, -20.0F, -7.5F, 3, 5, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 323 */     this.gunModel[31].setRotationPoint(-33.75F, -6.5F, 4.0F);
/*     */     
/* 325 */     this.gunModel[32].addShapeBox(53.0F, -20.0F, -7.5F, 3, 6, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.5F, -0.5F, 0.0F, 2.5F, -0.5F, 0.0F, 2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F);
/* 326 */     this.gunModel[32].setRotationPoint(-33.75F, -1.5F, 4.0F);
/*     */     
/* 328 */     this.gunModel[33].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F);
/* 329 */     this.gunModel[33].setRotationPoint(-31.25F, 4.5F, 4.0F);
/*     */     
/* 331 */     this.gunModel[34].addShapeBox(53.0F, -20.0F, -7.5F, 10, 1, 14, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 332 */     this.gunModel[34].setRotationPoint(-70.5F, -11.0F, 0.0F);
/*     */     
/* 334 */     this.gunModel[35].addShapeBox(53.0F, -20.0F, -7.5F, 9, 1, 14, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 335 */     this.gunModel[35].setRotationPoint(-69.5F, -12.0F, 0.0F);
/*     */     
/* 337 */     this.gunModel[36].addShapeBox(53.0F, -20.0F, -7.5F, 7, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 338 */     this.gunModel[36].setRotationPoint(-67.5F, -13.0F, 0.0F);
/*     */     
/* 340 */     this.gunModel[37].addShapeBox(53.0F, -20.0F, -7.5F, 6, 4, 14, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 341 */     this.gunModel[37].setRotationPoint(-66.5F, -17.0F, 0.0F);
/*     */     
/* 343 */     this.gunModel[38].addShapeBox(53.0F, -20.0F, -7.5F, 6, 3, 14, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 344 */     this.gunModel[38].setRotationPoint(-63.5F, -20.0F, 0.0F);
/*     */     
/* 346 */     this.gunModel[39].addShapeBox(53.0F, -20.0F, -7.5F, 5, 2, 14, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 347 */     this.gunModel[39].setRotationPoint(-63.5F, -22.0F, 0.0F);
/*     */     
/* 349 */     this.gunModel[40].addShapeBox(53.0F, -20.0F, -7.5F, 3, 7, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 350 */     this.gunModel[40].setRotationPoint(-60.5F, -17.0F, 0.0F);
/*     */     
/* 352 */     this.gunModel[41].addShapeBox(53.0F, -20.0F, -7.5F, 47, 10, 14, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 353 */     this.gunModel[41].setRotationPoint(-57.5F, -20.0F, 0.0F);
/*     */     
/* 355 */     this.gunModel[42].addShapeBox(53.0F, -20.0F, -7.5F, 22, 3, 14, 0.0F, 0.0F, -1.5F, 0.0F, -0.5F, 3.25F, 0.0F, -0.5F, 3.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 356 */     this.gunModel[42].setRotationPoint(-10.5F, -13.0F, 0.0F);
/*     */     
/* 358 */     this.gunModel[43].addShapeBox(53.0F, -20.0F, -7.5F, 5, 7, 14, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.3F, 0.0F, 0.5F, 0.3F, 0.0F, 0.0F, 1.5F, 0.0F);
/* 359 */     this.gunModel[43].setRotationPoint(-10.5F, -20.0F, 0.0F);
/*     */     
/* 361 */     this.gunModel[44].addShapeBox(53.0F, -20.0F, -7.5F, 1, 6, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 362 */     this.gunModel[44].setRotationPoint(11.0F, -20.0F, 0.0F);
/*     */     
/* 364 */     this.gunModel[45].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 14, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 365 */     this.gunModel[45].setRotationPoint(11.0F, -21.0F, 0.0F);
/*     */     
/* 367 */     this.gunModel[46].addShapeBox(53.0F, -20.0F, -7.5F, 16, 1, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 368 */     this.gunModel[46].setRotationPoint(-5.0F, -20.75F, 0.0F);
/*     */     
/* 370 */     this.gunModel[47].addShapeBox(53.0F, -20.0F, -7.5F, 64, 2, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 371 */     this.gunModel[47].setRotationPoint(-53.5F, -22.0F, 0.5F);
/*     */     
/* 373 */     this.gunModel[48].addShapeBox(53.0F, -20.0F, -7.5F, 6, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F);
/* 374 */     this.gunModel[48].setRotationPoint(-50.5F, -22.25F, 0.5F);
/*     */     
/* 376 */     this.gunModel[49].addShapeBox(53.0F, -20.0F, -7.5F, 6, 1, 13, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 377 */     this.gunModel[49].setRotationPoint(-37.5F, -23.0F, 0.5F);
/*     */     
/* 379 */     this.gunModel[50].addShapeBox(53.0F, -20.0F, -7.5F, 16, 6, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, -2.15F, 0.0F, 0.0F, 1.3F, 0.0F);
/* 380 */     this.gunModel[50].setRotationPoint(-5.0F, -20.0F, 0.5F);
/*     */     
/* 382 */     this.gunModel[51].addShapeBox(53.0F, -20.0F, -7.5F, 1, 2, 14, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 383 */     this.gunModel[51].setRotationPoint(12.0F, -16.0F, 0.0F);
/*     */     
/* 385 */     this.gunModel[52].addShapeBox(53.0F, -20.0F, -7.5F, 83, 2, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 386 */     this.gunModel[52].setRotationPoint(-53.5F, -24.75F, 0.0F);
/*     */     
/* 388 */     this.gunModel[53].addShapeBox(53.0F, -20.0F, -7.5F, 60, 2, 14, 0.0F, 1.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 389 */     this.gunModel[53].setRotationPoint(-29.5F, -23.25F, 0.0F);
/*     */     
/* 391 */     this.gunModel[54].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 14, 0.0F, 0.0F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 392 */     this.gunModel[54].setRotationPoint(-40.5F, -23.25F, 0.0F);
/*     */     
/* 394 */     this.gunModel[55].addShapeBox(53.0F, -20.0F, -7.5F, 10, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 395 */     this.gunModel[55].setRotationPoint(-53.5F, -23.0F, 0.0F);
/*     */     
/* 397 */     this.gunModel[56].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 398 */     this.gunModel[56].setRotationPoint(-43.5F, -22.25F, 0.0F);
/*     */     
/* 400 */     this.gunModel[57].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 14, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F);
/* 401 */     this.gunModel[57].setRotationPoint(-43.5F, -23.0F, 0.0F);
/*     */     
/* 403 */     this.gunModel[58].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 14, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 404 */     this.gunModel[58].setRotationPoint(-54.5F, -22.25F, 0.0F);
/*     */     
/* 406 */     this.gunModel[59].addShapeBox(53.0F, -20.0F, -7.5F, 1, 6, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 407 */     this.gunModel[59].setRotationPoint(12.0F, -22.0F, 0.0F);
/*     */     
/* 409 */     this.gunModel[60].addShapeBox(53.0F, -20.0F, -7.5F, 1, 8, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 410 */     this.gunModel[60].setRotationPoint(13.0F, -22.0F, 0.0F);
/*     */     
/* 412 */     this.gunModel[61].addShapeBox(53.0F, -20.0F, -7.5F, 2, 8, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 413 */     this.gunModel[61].setRotationPoint(14.0F, -22.0F, 0.0F);
/*     */     
/* 415 */     this.gunModel[62].addShapeBox(53.0F, -20.0F, -7.5F, 1, 8, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 416 */     this.gunModel[62].setRotationPoint(16.0F, -22.0F, 0.0F);
/*     */     
/* 418 */     this.gunModel[63].addShapeBox(53.0F, -20.0F, -7.5F, 1, 7, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 419 */     this.gunModel[63].setRotationPoint(17.0F, -22.0F, 0.0F);
/*     */     
/* 421 */     this.gunModel[64].addShapeBox(53.0F, -20.0F, -7.5F, 1, 6, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 422 */     this.gunModel[64].setRotationPoint(18.0F, -22.0F, 0.0F);
/*     */     
/* 424 */     this.gunModel[65].addShapeBox(53.0F, -20.0F, -7.5F, 2, 5, 14, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 425 */     this.gunModel[65].setRotationPoint(19.0F, -22.0F, 0.0F);
/*     */     
/* 427 */     this.gunModel[66].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 428 */     this.gunModel[66].setRotationPoint(21.0F, -21.5F, 0.0F);
/*     */     
/* 430 */     this.gunModel[67].addShapeBox(53.0F, -20.0F, -7.5F, 5, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 431 */     this.gunModel[67].setRotationPoint(23.0F, -21.5F, 0.0F);
/*     */     
/* 433 */     this.gunModel[68].addShapeBox(53.0F, -20.0F, -7.5F, 2, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 434 */     this.gunModel[68].setRotationPoint(28.0F, -21.5F, 0.0F);
/*     */     
/* 436 */     this.gunModel[69].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 437 */     this.gunModel[69].setRotationPoint(11.0F, -21.5F, 0.0F);
/*     */     
/* 439 */     this.gunModel[70].addShapeBox(53.0F, -20.0F, -7.5F, 4, 13, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 440 */     this.gunModel[70].setRotationPoint(-49.0F, -39.0F, -1.0F);
/*     */     
/* 442 */     this.gunModel[71].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 443 */     this.gunModel[71].setRotationPoint(-49.0F, -40.0F, -1.0F);
/*     */     
/* 445 */     this.gunModel[72].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, -1.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 446 */     this.gunModel[72].setRotationPoint(-49.0F, -41.0F, -1.0F);
/*     */     
/* 448 */     this.gunModel[73].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 449 */     this.gunModel[73].setRotationPoint(-49.0F, -26.25F, -1.0F);
/*     */     
/* 451 */     this.gunModel[74].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/* 452 */     this.gunModel[74].setRotationPoint(-49.0F, -25.25F, -1.0F);
/*     */     
/* 454 */     this.gunModel[75].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 455 */     this.gunModel[75].setRotationPoint(-39.0F, -26.25F, -1.0F);
/*     */     
/* 457 */     this.gunModel[76].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F);
/* 458 */     this.gunModel[76].setRotationPoint(-39.0F, -25.25F, -1.0F);
/*     */     
/* 460 */     this.gunModel[77].addShapeBox(53.0F, -20.0F, -7.5F, 4, 13, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 461 */     this.gunModel[77].setRotationPoint(-39.0F, -39.0F, -1.0F);
/*     */     
/* 463 */     this.gunModel[78].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 464 */     this.gunModel[78].setRotationPoint(-39.0F, -40.0F, -1.0F);
/*     */     
/* 466 */     this.gunModel[79].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 16, 0.0F, -1.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 467 */     this.gunModel[79].setRotationPoint(-39.0F, -41.0F, -1.0F);
/*     */     
/* 469 */     this.gunModel[80].addShapeBox(53.0F, -20.0F, -7.5F, 12, 2, 13, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 470 */     this.gunModel[80].setRotationPoint(38.5F, -24.75F, 0.5F);
/*     */     
/* 472 */     this.gunModel[81].addShapeBox(53.0F, -20.0F, -7.5F, 12, 2, 11, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F, -3.0F);
/* 473 */     this.gunModel[81].setRotationPoint(38.5F, -22.75F, 1.5F);
/*     */     
/* 475 */     this.gunModel[82].addShapeBox(53.0F, -20.0F, -7.5F, 93, 2, 14, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 2.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 2.0F, -0.75F, 0.0F);
/* 476 */     this.gunModel[82].setRotationPoint(-51.0F, -25.75F, 0.0F);
/*     */     
/* 478 */     this.gunModel[83].addShapeBox(53.0F, -20.0F, -7.5F, 8, 10, 13, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 479 */     this.gunModel[83].setRotationPoint(42.5F, -33.75F, 0.5F);
/*     */     
/* 481 */     this.gunModel[84].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 13, 0.0F, 0.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.75F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 482 */     this.gunModel[84].setRotationPoint(39.5F, -32.75F, 0.5F);
/*     */     
/* 484 */     this.gunModel[85].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 13, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F);
/* 485 */     this.gunModel[85].setRotationPoint(39.5F, -31.75F, 0.5F);
/*     */     
/* 487 */     this.gunModel[86].addShapeBox(53.0F, -20.0F, -7.5F, 6, 2, 14, 0.0F, 1.0F, -0.75F, 0.0F, 2.0F, -0.75F, 0.0F, 2.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/* 488 */     this.gunModel[86].setRotationPoint(-59.5F, -26.75F, 0.0F);
/*     */     
/* 490 */     this.gunModel[87].addShapeBox(53.0F, -20.0F, -7.5F, 103, 3, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 491 */     this.gunModel[87].setRotationPoint(-60.5F, -29.25F, 0.0F);
/*     */     
/* 493 */     this.gunModel[88].addShapeBox(53.0F, -20.0F, -7.5F, 47, 10, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 494 */     this.gunModel[88].setRotationPoint(-60.5F, -39.25F, 0.0F);
/*     */     
/* 496 */     this.gunModel[89].addShapeBox(53.0F, -20.0F, -7.5F, 39, 4, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 497 */     this.gunModel[89].setRotationPoint(-13.5F, -39.25F, 0.0F);
/*     */     
/* 499 */     this.gunModel[90].addShapeBox(53.0F, -20.0F, -7.5F, 39, 3, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 500 */     this.gunModel[90].setRotationPoint(-13.5F, -32.25F, 0.0F);
/*     */     
/* 502 */     this.gunModel[91].addShapeBox(53.0F, -20.0F, -7.5F, 33, 1, 14, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 503 */     this.gunModel[91].setRotationPoint(-7.5F, -33.25F, 0.0F);
/*     */     
/* 505 */     this.gunModel[92].addShapeBox(53.0F, -20.0F, -7.5F, 33, 1, 14, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 506 */     this.gunModel[92].setRotationPoint(-7.5F, -35.75F, 0.0F);
/*     */     
/* 508 */     this.gunModel[93].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 14, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F);
/* 509 */     this.gunModel[93].setRotationPoint(-8.5F, -35.75F, 0.0F);
/*     */     
/* 511 */     this.gunModel[94].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 14, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 512 */     this.gunModel[94].setRotationPoint(-13.5F, -35.75F, 0.0F);
/*     */     
/* 514 */     this.gunModel[95].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 14, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 515 */     this.gunModel[95].setRotationPoint(-13.5F, -32.25F, 0.0F);
/*     */     
/* 517 */     this.gunModel[96].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 14, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 518 */     this.gunModel[96].setRotationPoint(-8.5F, -32.25F, 0.0F);
/*     */     
/* 520 */     this.gunModel[97].addShapeBox(53.0F, -20.0F, -7.5F, 9, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 521 */     this.gunModel[97].setRotationPoint(33.5F, -31.25F, 0.0F);
/*     */     
/* 523 */     this.gunModel[98].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 524 */     this.gunModel[98].setRotationPoint(25.5F, -31.75F, 0.0F);
/*     */     
/* 526 */     this.gunModel[99].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 14, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 527 */     this.gunModel[99].setRotationPoint(31.5F, -31.75F, 0.0F);
/*     */     
/* 529 */     this.gunModel[100].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 14, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 530 */     this.gunModel[100].setRotationPoint(31.5F, -37.0F, 0.0F);
/*     */     
/* 532 */     this.gunModel[101].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 14, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 533 */     this.gunModel[101].setRotationPoint(25.5F, -37.0F, 0.0F);
/*     */     
/* 535 */     this.gunModel[102].addShapeBox(53.0F, -20.0F, -7.5F, 5, 1, 14, 0.0F, 0.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 536 */     this.gunModel[102].setRotationPoint(37.5F, -32.25F, 0.0F);
/*     */     
/* 538 */     this.gunModel[103].addShapeBox(53.0F, -20.0F, -7.5F, 3, 2, 14, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 539 */     this.gunModel[103].setRotationPoint(37.25F, -33.75F, 0.0F);
/*     */     
/* 541 */     this.gunModel[104].addShapeBox(53.0F, -20.0F, -7.5F, 2, 5, 14, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 542 */     this.gunModel[104].setRotationPoint(37.25F, -38.75F, 0.0F);
/*     */     
/* 544 */     this.gunModel[105].addShapeBox(53.0F, -20.0F, -7.5F, 11, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 545 */     this.gunModel[105].setRotationPoint(25.5F, -39.25F, 0.0F);
/*     */     
/* 547 */     this.gunModel[106].addShapeBox(53.0F, -20.0F, -7.5F, 3, 7, 14, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 548 */     this.gunModel[106].setRotationPoint(34.0F, -37.75F, 0.0F);
/*     */     
/* 550 */     this.gunModel[107].addShapeBox(53.0F, -20.0F, -7.5F, 4, 8, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 551 */     this.gunModel[107].setRotationPoint(27.5F, -37.5F, 11.0F);
/*     */     
/* 553 */     this.gunModel[108].addShapeBox(53.0F, -20.0F, -7.5F, 8, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 554 */     this.gunModel[108].setRotationPoint(25.5F, -38.0F, 0.0F);
/*     */     
/* 556 */     this.gunModel[109].addShapeBox(53.0F, -20.0F, -7.5F, 8, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 557 */     this.gunModel[109].setRotationPoint(25.5F, -29.75F, 0.0F);
/*     */     
/* 559 */     this.gunModel[110].addShapeBox(53.0F, -20.0F, -7.5F, 22, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 560 */     this.gunModel[110].setRotationPoint(50.5F, -31.75F, 4.25F);
/*     */     
/* 562 */     this.gunModel[111].addShapeBox(53.0F, -20.0F, -7.5F, 5, 4, 16, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 563 */     this.gunModel[111].setRotationPoint(-58.5F, -24.25F, -1.0F);
/*     */     
/* 565 */     this.gunModel[112].addShapeBox(53.0F, -20.0F, -7.5F, 5, 2, 16, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -1.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, -1.75F, 0.0F);
/* 566 */     this.gunModel[112].setRotationPoint(-64.5F, -22.75F, -1.0F);
/*     */     
/* 568 */     this.gunModel[113].addShapeBox(53.0F, -20.0F, -7.5F, 4, 2, 16, 0.0F, 1.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F);
/* 569 */     this.gunModel[113].setRotationPoint(-63.0F, -24.25F, -1.0F);
/*     */     
/* 571 */     this.gunModel[114].addShapeBox(53.0F, -20.0F, -7.5F, 7, 2, 11, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -3.0F, -0.5F, -0.75F, -3.0F, -0.5F, -0.75F, -3.0F, 0.0F, -0.75F, -3.0F);
/* 572 */     this.gunModel[114].setRotationPoint(32.0F, -22.75F, 1.5F);
/*     */     
/* 574 */     this.gunModel[115].addShapeBox(53.0F, -20.0F, -7.5F, 7, 2, 13, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F);
/* 575 */     this.gunModel[115].setRotationPoint(32.0F, -24.25F, 0.5F);
/*     */     
/* 577 */     this.gunModel[116].addShapeBox(53.0F, -20.0F, -7.5F, 3, 16, 16, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F);
/* 578 */     this.gunModel[116].setRotationPoint(-63.0F, -40.25F, -1.0F);
/*     */     
/* 580 */     this.gunModel[117].addShapeBox(53.0F, -20.0F, -7.5F, 12, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 581 */     this.gunModel[117].setRotationPoint(-60.5F, -40.25F, 0.0F);
/*     */     
/* 583 */     this.gunModel[118].addShapeBox(53.0F, -20.0F, -7.5F, 8, 1, 14, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 584 */     this.gunModel[118].setRotationPoint(-46.5F, -40.25F, 0.0F);
/*     */     
/* 586 */     this.gunModel[119].addShapeBox(53.0F, -20.0F, -7.5F, 7, 5, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 587 */     this.gunModel[119].setRotationPoint(-46.0F, -44.25F, 3.5F);
/*     */     
/* 589 */     this.gunModel[120].addShapeBox(53.0F, -20.0F, -7.5F, 7, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 590 */     this.gunModel[120].setRotationPoint(-46.0F, -45.25F, 3.5F);
/*     */     
/* 592 */     this.gunModel[121].addShapeBox(53.0F, -20.0F, -7.5F, 5, 1, 1, 0.0F, -1.5F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 593 */     this.gunModel[121].setRotationPoint(-45.0F, -46.25F, 3.5F);
/*     */     
/* 595 */     this.gunModel[122].addShapeBox(53.0F, -20.0F, -7.5F, 11, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F);
/* 596 */     this.gunModel[122].setRotationPoint(27.0F, -40.25F, 3.5F);
/*     */     
/* 598 */     this.gunModel[123].addShapeBox(53.0F, -20.0F, -7.5F, 6, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 599 */     this.gunModel[123].setRotationPoint(32.0F, -43.25F, 3.5F);
/*     */     
/* 601 */     this.gunModel[124].addShapeBox(53.0F, -20.0F, -7.5F, 6, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 602 */     this.gunModel[124].setRotationPoint(32.0F, -44.25F, 3.5F);
/*     */     
/* 604 */     this.gunModel[125].addShapeBox(53.0F, -20.0F, -7.5F, 11, 2, 1, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 605 */     this.gunModel[125].setRotationPoint(27.0F, -42.25F, 3.5F);
/*     */     
/* 607 */     this.gunModel[126].addShapeBox(53.0F, -20.0F, -7.5F, 6, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 608 */     this.gunModel[126].setRotationPoint(-70.5F, -33.0F, 0.0F);
/*     */     
/* 610 */     this.gunModel[127].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 4, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 611 */     this.gunModel[127].setRotationPoint(-65.5F, -34.0F, 0.0F);
/*     */     
/* 613 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 614 */     this.gunModel[''].setRotationPoint(-65.5F, -25.0F, 0.0F);
/*     */     
/* 616 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 1, 8, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 617 */     this.gunModel[''].setRotationPoint(-72.0F, -33.0F, 0.0F);
/*     */     
/* 619 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 1, 8, 4, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 620 */     this.gunModel[''].setRotationPoint(-73.0F, -33.0F, 0.0F);
/*     */     
/* 622 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 2, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 623 */     this.gunModel[''].setRotationPoint(-70.0F, -34.0F, 0.5F);
/*     */     
/* 625 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 626 */     this.gunModel[''].setRotationPoint(-70.0F, -41.0F, 0.5F);
/*     */     
/* 628 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 3, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 629 */     this.gunModel[''].setRotationPoint(-70.0F, -42.0F, 0.5F);
/*     */     
/* 631 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 632 */     this.gunModel[''].setRotationPoint(-71.0F, -38.0F, 0.5F);
/*     */     
/* 634 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 635 */     this.gunModel[''].setRotationPoint(-67.25F, -41.0F, 0.5F);
/*     */     
/* 637 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 3, 2, 3, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 638 */     this.gunModel[''].setRotationPoint(-70.0F, -44.0F, 0.5F);
/*     */     
/* 640 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 3, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 641 */     this.gunModel[''].setRotationPoint(-68.5F, -45.0F, 0.5F);
/*     */     
/* 643 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 644 */     this.gunModel[''].setRotationPoint(-67.0F, -44.0F, 0.5F);
/*     */     
/* 646 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 7, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 647 */     this.gunModel[''].setRotationPoint(-66.0F, -45.0F, 0.5F);
/*     */     
/* 649 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 9, 3, 4, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 650 */     this.gunModel[''].setRotationPoint(-59.0F, -45.0F, 0.0F);
/*     */     
/* 652 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 99, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 653 */     this.gunModel[''].setRotationPoint(-50.0F, -45.0F, 0.5F);
/*     */     
/* 655 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 656 */     this.gunModel[''].setRotationPoint(49.0F, -43.0F, 0.5F);
/*     */     
/* 658 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 659 */     this.gunModel[''].setRotationPoint(49.0F, -39.75F, 0.5F);
/*     */     
/* 661 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 662 */     this.gunModel[''].setRotationPoint(49.75F, -38.75F, 0.5F);
/*     */     
/* 664 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 3, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 665 */     this.gunModel[''].setRotationPoint(50.75F, -37.75F, 0.5F);
/*     */     
/* 667 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 22, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 668 */     this.gunModel[''].setRotationPoint(51.75F, -34.75F, 0.5F);
/*     */     
/* 670 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 671 */     this.gunModel[''].setRotationPoint(51.75F, -12.75F, 0.5F);
/*     */     
/* 673 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 11, 3, 3, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 674 */     this.gunModel[''].setRotationPoint(53.75F, -8.75F, 0.5F);
/*     */     
/* 676 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 677 */     this.gunModel[''].setRotationPoint(64.25F, -8.75F, 0.5F);
/*     */     
/* 679 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 680 */     this.gunModel[''].setRotationPoint(61.25F, -5.75F, 0.5F);
/*     */     
/* 682 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 683 */     this.gunModel[''].setRotationPoint(57.0F, -5.75F, 0.5F);
/*     */     
/* 685 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 3, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 686 */     this.gunModel[''].setRotationPoint(66.25F, -12.75F, 0.5F);
/*     */     
/* 688 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 24, 3, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 689 */     this.gunModel[''].setRotationPoint(66.5F, -36.75F, 0.5F);
/*     */     
/* 691 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, -1.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 692 */     this.gunModel[''].setRotationPoint(66.5F, -38.25F, 0.5F);
/*     */     
/* 694 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 8, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 695 */     this.gunModel[''].setRotationPoint(27.5F, -37.5F, 2.0F);
/*     */     
/* 697 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 1, 8, 4, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 698 */     this.gunModel[''].setRotationPoint(-73.0F, -33.0F, 10.5F);
/*     */     
/* 700 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 1, 8, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 701 */     this.gunModel[''].setRotationPoint(-72.0F, -33.0F, 10.5F);
/*     */     
/* 703 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 6, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 704 */     this.gunModel[''].setRotationPoint(-70.5F, -33.0F, 10.5F);
/*     */     
/* 706 */     this.gunModel[''].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 707 */     this.gunModel[''].setRotationPoint(-71.0F, -38.0F, 11.0F);
/*     */     
/* 709 */     this.gunModel[' '].addShapeBox(53.0F, -20.0F, -7.5F, 2, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 710 */     this.gunModel[' '].setRotationPoint(-70.0F, -34.0F, 11.0F);
/*     */     
/* 712 */     this.gunModel['¡'].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 713 */     this.gunModel['¡'].setRotationPoint(-70.0F, -41.0F, 11.0F);
/*     */     
/* 715 */     this.gunModel['¢'].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 716 */     this.gunModel['¢'].setRotationPoint(-67.25F, -41.0F, 11.0F);
/*     */     
/* 718 */     this.gunModel['£'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 3, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 719 */     this.gunModel['£'].setRotationPoint(-70.0F, -42.0F, 11.0F);
/*     */     
/* 721 */     this.gunModel['¤'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 2, 3, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 722 */     this.gunModel['¤'].setRotationPoint(-70.0F, -44.0F, 11.0F);
/*     */     
/* 724 */     this.gunModel['¥'].addShapeBox(53.0F, -20.0F, -7.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 725 */     this.gunModel['¥'].setRotationPoint(-67.0F, -44.0F, 11.0F);
/*     */     
/* 727 */     this.gunModel['¦'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 3, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 728 */     this.gunModel['¦'].setRotationPoint(-68.5F, -45.0F, 11.0F);
/*     */     
/* 730 */     this.gunModel['§'].addShapeBox(53.0F, -20.0F, -7.5F, 7, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 731 */     this.gunModel['§'].setRotationPoint(-66.0F, -45.0F, 11.0F);
/*     */     
/* 733 */     this.gunModel['¨'].addShapeBox(53.0F, -20.0F, -7.5F, 9, 3, 4, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F);
/* 734 */     this.gunModel['¨'].setRotationPoint(-59.0F, -45.0F, 10.5F);
/*     */     
/* 736 */     this.gunModel['©'].addShapeBox(53.0F, -20.0F, -7.5F, 7, 5, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 737 */     this.gunModel['©'].setRotationPoint(-46.0F, -44.25F, 10.0F);
/*     */     
/* 739 */     this.gunModel['ª'].addShapeBox(53.0F, -20.0F, -7.5F, 7, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 740 */     this.gunModel['ª'].setRotationPoint(-46.0F, -45.25F, 10.0F);
/*     */     
/* 742 */     this.gunModel['«'].addShapeBox(53.0F, -20.0F, -7.5F, 5, 1, 1, 0.0F, -1.5F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 743 */     this.gunModel['«'].setRotationPoint(-45.0F, -46.25F, 10.0F);
/*     */     
/* 745 */     this.gunModel['¬'].addShapeBox(53.0F, -20.0F, -7.5F, 99, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 746 */     this.gunModel['¬'].setRotationPoint(-50.0F, -45.0F, 11.0F);
/*     */     
/* 748 */     this.gunModel['­'].addShapeBox(53.0F, -20.0F, -7.5F, 47, 7, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 749 */     this.gunModel['­'].setRotationPoint(-13.5F, -36.25F, 1.0F);
/*     */     
/* 751 */     this.gunModel['®'].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 12, 0.0F, 0.5F, 0.25F, 1.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 1.0F, 0.5F, -0.75F, 1.0F, -0.5F, -0.75F, -3.5F, -0.5F, -0.75F, -3.5F, 0.5F, -0.75F, 1.0F);
/* 752 */     this.gunModel['®'].setRotationPoint(30.5F, -22.75F, 1.0F);
/*     */     
/* 754 */     this.gunModel['¯'].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 14, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -1.5F, -0.5F, -0.75F, -1.5F, 0.5F, -0.75F, 0.0F);
/* 755 */     this.gunModel['¯'].setRotationPoint(30.5F, -24.25F, 0.0F);
/*     */     
/* 757 */     this.gunModel['°'].addShapeBox(53.0F, -20.0F, -7.5F, 13, 2, 13, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 758 */     this.gunModel['°'].setRotationPoint(37.5F, -35.25F, 0.5F);
/*     */     
/* 760 */     this.gunModel['±'].addShapeBox(53.0F, -20.0F, -7.5F, 13, 2, 11, 0.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 761 */     this.gunModel['±'].setRotationPoint(37.5F, -37.25F, 1.5F);
/*     */     
/* 763 */     this.gunModel['²'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 764 */     this.gunModel['²'].setRotationPoint(49.0F, -43.0F, 11.0F);
/*     */     
/* 766 */     this.gunModel['³'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 767 */     this.gunModel['³'].setRotationPoint(49.0F, -39.75F, 11.0F);
/*     */     
/* 769 */     this.gunModel['´'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 770 */     this.gunModel['´'].setRotationPoint(49.75F, -38.75F, 11.0F);
/*     */     
/* 772 */     this.gunModel['µ'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 3, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 773 */     this.gunModel['µ'].setRotationPoint(50.75F, -37.75F, 11.0F);
/*     */     
/* 775 */     this.gunModel['¶'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 22, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 776 */     this.gunModel['¶'].setRotationPoint(51.75F, -34.75F, 11.0F);
/*     */     
/* 778 */     this.gunModel['·'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 779 */     this.gunModel['·'].setRotationPoint(51.75F, -12.75F, 11.0F);
/*     */     
/* 781 */     this.gunModel['¸'].addShapeBox(53.0F, -20.0F, -7.5F, 11, 3, 3, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 782 */     this.gunModel['¸'].setRotationPoint(53.75F, -8.75F, 11.0F);
/*     */     
/* 784 */     this.gunModel['¹'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 785 */     this.gunModel['¹'].setRotationPoint(61.25F, -5.75F, 11.0F);
/*     */     
/* 787 */     this.gunModel['º'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F);
/* 788 */     this.gunModel['º'].setRotationPoint(57.0F, -5.75F, 11.0F);
/*     */     
/* 790 */     this.gunModel['»'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 791 */     this.gunModel['»'].setRotationPoint(64.25F, -8.75F, 11.0F);
/*     */     
/* 793 */     this.gunModel['¼'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 3, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 794 */     this.gunModel['¼'].setRotationPoint(66.25F, -12.75F, 11.0F);
/*     */     
/* 796 */     this.gunModel['½'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 24, 3, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 797 */     this.gunModel['½'].setRotationPoint(66.5F, -36.75F, 11.0F);
/*     */     
/* 799 */     this.gunModel['¾'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 1, 3, 0.0F, -1.0F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 800 */     this.gunModel['¾'].setRotationPoint(66.5F, -38.25F, 11.0F);
/*     */     
/* 802 */     this.gunModel['¿'].addShapeBox(53.0F, -20.0F, -7.5F, 4, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 803 */     this.gunModel['¿'].setRotationPoint(-68.5F, -32.5F, 4.0F);
/*     */     
/* 805 */     this.gunModel['À'].addShapeBox(53.0F, -20.0F, -7.5F, 1, 7, 7, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 806 */     this.gunModel['À'].setRotationPoint(-70.0F, -32.5F, 4.0F);
/*     */     
/* 808 */     this.gunModel['Á'].addShapeBox(53.0F, -20.0F, -7.5F, 1, 7, 7, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 809 */     this.gunModel['Á'].setRotationPoint(-71.0F, -32.5F, 4.0F);
/*     */     
/* 811 */     this.gunModel['Â'].addShapeBox(53.0F, -20.0F, -7.5F, 1, 1, 4, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 812 */     this.gunModel['Â'].setRotationPoint(-65.5F, -34.0F, 10.5F);
/*     */     
/* 814 */     this.gunModel['Ã'].addShapeBox(53.0F, -20.0F, -7.5F, 11, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 815 */     this.gunModel['Ã'].setRotationPoint(27.0F, -40.25F, 10.0F);
/*     */     
/* 817 */     this.gunModel['Ä'].addShapeBox(53.0F, -20.0F, -7.5F, 6, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 818 */     this.gunModel['Ä'].setRotationPoint(32.0F, -43.25F, 10.0F);
/*     */     
/* 820 */     this.gunModel['Å'].addShapeBox(53.0F, -20.0F, -7.5F, 6, 1, 1, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 821 */     this.gunModel['Å'].setRotationPoint(32.0F, -44.25F, 10.0F);
/*     */     
/* 823 */     this.gunModel['Æ'].addShapeBox(53.0F, -20.0F, -7.5F, 11, 2, 1, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 824 */     this.gunModel['Æ'].setRotationPoint(27.0F, -42.25F, 10.0F);
/*     */     
/* 826 */     this.gunModel['Ç'].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 827 */     this.gunModel['Ç'].setRotationPoint(34.0F, -43.25F, 6.75F);
/*     */     
/* 829 */     this.gunModel['È'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 5, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 830 */     this.gunModel['È'].setRotationPoint(-44.0F, -45.25F, 9.0F);
/*     */     
/* 832 */     this.gunModel['É'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 5, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 833 */     this.gunModel['É'].setRotationPoint(-44.0F, -45.25F, 4.5F);
/*     */     
/* 835 */     this.gunModel['Ê'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 4, 3, 0.0F, 0.0F, -0.75F, 0.5F, 0.25F, -0.75F, 0.5F, 0.25F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F);
/* 836 */     this.gunModel['Ê'].setRotationPoint(-44.0F, -44.25F, 5.5F);
/*     */     
/* 838 */     this.gunModel['Ë'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 839 */     this.gunModel['Ë'].setRotationPoint(-44.0F, -45.25F, 4.5F);
/*     */     
/* 841 */     this.gunModel['Ì'].addShapeBox(53.0F, -20.0F, -7.5F, 3, 1, 1, 0.0F, 0.0F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F);
/* 842 */     this.gunModel['Ì'].setRotationPoint(-44.0F, -45.25F, 9.0F);
/*     */     
/* 844 */     this.gunModel['Í'].addShapeBox(53.0F, -20.0F, -7.5F, 2, 10, 1, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 4.75F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F);
/* 845 */     this.gunModel['Í'].setRotationPoint(-49.5F, -19.75F, 13.5F);
/*     */     
/*     */ 
/* 848 */     this.ammoModel = new ModelRendererTurbo[6];
/* 849 */     this.ammoModel[0] = new ModelRendererTurbo(this, 25, 273, this.textureX, this.textureY);
/* 850 */     this.ammoModel[1] = new ModelRendererTurbo(this, 89, 273, this.textureX, this.textureY);
/* 851 */     this.ammoModel[2] = new ModelRendererTurbo(this, 153, 273, this.textureX, this.textureY);
/* 852 */     this.ammoModel[3] = new ModelRendererTurbo(this, 265, 273, this.textureX, this.textureY);
/* 853 */     this.ammoModel[4] = new ModelRendererTurbo(this, 345, 273, this.textureX, this.textureY);
/* 854 */     this.ammoModel[5] = new ModelRendererTurbo(this, 217, 273, this.textureX, this.textureY);
/*     */     
/* 856 */     this.ammoModel[0].addShapeBox(53.0F, -20.0F, -7.5F, 19, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 857 */     this.ammoModel[0].setRotationPoint(-10.0F, -18.0F, 2.0F);
/*     */     
/* 859 */     this.ammoModel[1].addShapeBox(53.0F, -20.0F, -7.5F, 20, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 860 */     this.ammoModel[1].setRotationPoint(-11.0F, -14.0F, 2.0F);
/*     */     
/* 862 */     this.ammoModel[2].addShapeBox(53.0F, -20.0F, -7.5F, 20, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 863 */     this.ammoModel[2].setRotationPoint(-10.0F, -7.0F, 2.0F);
/*     */     
/* 865 */     this.ammoModel[3].addShapeBox(53.0F, -20.0F, -7.5F, 20, 17, 10, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
/* 866 */     this.ammoModel[3].setRotationPoint(-7.0F, 5.0F, 2.0F);
/*     */     
/* 868 */     this.ammoModel[4].addShapeBox(53.0F, -20.0F, -7.5F, 21, 9, 10, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, 7.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
/* 869 */     this.ammoModel[4].setRotationPoint(-1.0F, 22.0F, 2.0F);
/*     */     
/* 871 */     this.ammoModel[5].addShapeBox(53.0F, -20.0F, -7.5F, 12, 11, 10, 0.0F, 9.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 872 */     this.ammoModel[5].setRotationPoint(13.0F, 31.0F, 2.0F);
/*     */     
/*     */ 
/* 875 */     this.slideModel = new ModelRendererTurbo[18];
/* 876 */     this.slideModel[0] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/* 877 */     this.slideModel[1] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/* 878 */     this.slideModel[2] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/* 879 */     this.slideModel[3] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/* 880 */     this.slideModel[4] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 881 */     this.slideModel[5] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/* 882 */     this.slideModel[6] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/* 883 */     this.slideModel[7] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 884 */     this.slideModel[8] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/* 885 */     this.slideModel[9] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/* 886 */     this.slideModel[10] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 887 */     this.slideModel[11] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/* 888 */     this.slideModel[12] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/* 889 */     this.slideModel[13] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/* 890 */     this.slideModel[14] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/* 891 */     this.slideModel[15] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 892 */     this.slideModel[16] = new ModelRendererTurbo(this, 257, 89, this.textureX, this.textureY);
/* 893 */     this.slideModel[17] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*     */     
/* 895 */     this.slideModel[0].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F);
/* 896 */     this.slideModel[0].setRotationPoint(25.5F, -31.5F, 13.0F);
/*     */     
/* 898 */     this.slideModel[1].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 899 */     this.slideModel[1].setRotationPoint(31.5F, -31.5F, 13.0F);
/*     */     
/* 901 */     this.slideModel[2].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F);
/* 902 */     this.slideModel[2].setRotationPoint(31.5F, -37.25F, 13.0F);
/*     */     
/* 904 */     this.slideModel[3].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F);
/* 905 */     this.slideModel[3].setRotationPoint(25.5F, -37.25F, 13.0F);
/*     */     
/* 907 */     this.slideModel[4].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 908 */     this.slideModel[4].setRotationPoint(31.5F, -35.25F, 13.0F);
/*     */     
/* 910 */     this.slideModel[5].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 911 */     this.slideModel[5].setRotationPoint(25.5F, -35.25F, 13.0F);
/*     */     
/* 913 */     this.slideModel[6].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 1, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 914 */     this.slideModel[6].setRotationPoint(27.5F, -35.5F, 14.5F);
/*     */     
/* 916 */     this.slideModel[7].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 917 */     this.slideModel[7].setRotationPoint(27.5F, -37.5F, 14.0F);
/*     */     
/* 919 */     this.slideModel[8].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F);
/* 920 */     this.slideModel[8].setRotationPoint(27.5F, -32.25F, 14.0F);
/*     */     
/* 922 */     this.slideModel[9].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 923 */     this.slideModel[9].setRotationPoint(25.5F, -37.25F, -1.0F);
/*     */     
/* 925 */     this.slideModel[10].addShapeBox(53.0F, -20.0F, -7.5F, 4, 4, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F);
/* 926 */     this.slideModel[10].setRotationPoint(27.5F, -35.5F, -1.5F);
/*     */     
/* 928 */     this.slideModel[11].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 929 */     this.slideModel[11].setRotationPoint(25.5F, -35.25F, -0.5F);
/*     */     
/* 931 */     this.slideModel[12].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 932 */     this.slideModel[12].setRotationPoint(25.5F, -31.5F, -1.0F);
/*     */     
/* 934 */     this.slideModel[13].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 935 */     this.slideModel[13].setRotationPoint(31.5F, -31.5F, -1.0F);
/*     */     
/* 937 */     this.slideModel[14].addShapeBox(53.0F, -20.0F, -7.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 938 */     this.slideModel[14].setRotationPoint(31.5F, -37.25F, -1.0F);
/*     */     
/* 940 */     this.slideModel[15].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 2, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 941 */     this.slideModel[15].setRotationPoint(27.5F, -37.5F, -2.0F);
/*     */     
/* 943 */     this.slideModel[16].addShapeBox(53.0F, -20.0F, -7.5F, 4, 3, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 944 */     this.slideModel[16].setRotationPoint(27.5F, -32.25F, -2.0F);
/*     */     
/* 946 */     this.slideModel[17].addShapeBox(53.0F, -20.0F, -7.5F, 2, 3, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 947 */     this.slideModel[17].setRotationPoint(31.5F, -35.25F, -0.5F);
/*     */     
/*     */ 
/*     */ 
/* 951 */     translateAll(0.0F, -25.5F, 0.0F);
/* 952 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 954 */     this.gunSlideDistance = 2.0F;
/* 955 */     this.animationType = EnumAnimationType.CUSTOM;this.tiltGun = 7.0F;
/* 956 */     this.rotateGunVertical = 3.0F;
/* 957 */     this.translateGun = new Vector3f(0.15F, 0.05F, 0.0F);
/*     */     
/* 959 */     this.rotateClipVertical = 5.0F;
/* 960 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/*     */     
/*     */ 
/*     */ 
/* 964 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelskorpion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */