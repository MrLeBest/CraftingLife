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
/*     */ public class Modelmp7
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelmp7()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo['µ'];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 385, 41, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 17, 49, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/* 127 */     this.gunModel[105] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/* 128 */     this.gunModel[106] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/* 129 */     this.gunModel[107] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 130 */     this.gunModel[108] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 131 */     this.gunModel[109] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 132 */     this.gunModel[110] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 133 */     this.gunModel[111] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 134 */     this.gunModel[112] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/* 135 */     this.gunModel[113] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/* 136 */     this.gunModel[114] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/* 137 */     this.gunModel[115] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/* 138 */     this.gunModel[116] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/* 139 */     this.gunModel[117] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/* 140 */     this.gunModel[118] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/* 141 */     this.gunModel[119] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/* 142 */     this.gunModel[120] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/* 143 */     this.gunModel[121] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/* 144 */     this.gunModel[122] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/* 145 */     this.gunModel[123] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 146 */     this.gunModel[124] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 147 */     this.gunModel[125] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 148 */     this.gunModel[126] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/* 149 */     this.gunModel[127] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/* 150 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/* 151 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/* 152 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/* 153 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/* 154 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 155 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/* 156 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/* 157 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/* 158 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/* 159 */     this.gunModel[''] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/* 160 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/* 161 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/* 162 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/* 163 */     this.gunModel[''] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/* 164 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/* 165 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/* 166 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 167 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 89, this.textureX, this.textureY);
/* 168 */     this.gunModel[''] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/* 169 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/* 170 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/* 171 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/* 172 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 173 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/* 174 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/* 175 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 176 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/* 177 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/* 178 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/* 179 */     this.gunModel[''] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/* 180 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/* 181 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/* 182 */     this.gunModel[' '] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/* 183 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/* 184 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/* 185 */     this.gunModel['£'] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/* 186 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/* 187 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/* 188 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/* 189 */     this.gunModel['§'] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/* 190 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/* 191 */     this.gunModel['©'] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/* 192 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
/* 193 */     this.gunModel['«'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/* 194 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/* 195 */     this.gunModel['­'] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/* 196 */     this.gunModel['®'] = new ModelRendererTurbo(this, 169, 97, this.textureX, this.textureY);
/* 197 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 433, 97, this.textureX, this.textureY);
/* 198 */     this.gunModel['°'] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/* 199 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/* 200 */     this.gunModel['²'] = new ModelRendererTurbo(this, 33, 105, this.textureX, this.textureY);
/* 201 */     this.gunModel['³'] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/* 202 */     this.gunModel['´'] = new ModelRendererTurbo(this, 89, 105, this.textureX, this.textureY);
/*     */     
/* 204 */     this.gunModel[0].addBox(-10.0F, -5.0F, -2.75F, 15, 1, 6, 0.0F);
/* 205 */     this.gunModel[0].setRotationPoint(2.0F, -9.0F, 0.0F);
/*     */     
/* 207 */     this.gunModel[1].addShapeBox(-10.0F, -5.0F, -2.75F, 12, 1, 6, 0.0F, 1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 208 */     this.gunModel[1].setRotationPoint(4.0F, -8.0F, 0.0F);
/*     */     
/* 210 */     this.gunModel[2].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 1, 6, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 211 */     this.gunModel[2].setRotationPoint(5.0F, -7.0F, 0.0F);
/*     */     
/* 213 */     this.gunModel[3].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 1, 6, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 214 */     this.gunModel[3].setRotationPoint(5.0F, -6.0F, 0.0F);
/*     */     
/* 216 */     this.gunModel[4].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 1, 6, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 217 */     this.gunModel[4].setRotationPoint(5.0F, -5.0F, 0.0F);
/*     */     
/* 219 */     this.gunModel[5].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 1, 6, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.75F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F);
/* 220 */     this.gunModel[5].setRotationPoint(5.0F, -4.0F, 0.0F);
/*     */     
/* 222 */     this.gunModel[6].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 3, 6, 0.0F, 1.75F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.75F, 0.5F, 0.0F, 2.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 223 */     this.gunModel[6].setRotationPoint(5.0F, -2.0F, 0.0F);
/*     */     
/* 225 */     this.gunModel[7].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 3, 6, 0.0F, 2.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F);
/* 226 */     this.gunModel[7].setRotationPoint(5.0F, 1.0F, 0.0F);
/*     */     
/* 228 */     this.gunModel[8].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 5, 6, 0.0F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F);
/* 229 */     this.gunModel[8].setRotationPoint(5.0F, 4.0F, 0.0F);
/*     */     
/* 231 */     this.gunModel[9].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 4, 6, 0.0F, 2.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F);
/* 232 */     this.gunModel[9].setRotationPoint(5.0F, 9.0F, 0.0F);
/*     */     
/* 234 */     this.gunModel[10].addShapeBox(-10.0F, -5.0F, -2.75F, 16, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 235 */     this.gunModel[10].setRotationPoint(2.25F, 13.0F, 0.0F);
/*     */     
/* 237 */     this.gunModel[11].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 238 */     this.gunModel[11].setRotationPoint(18.25F, 13.0F, 0.0F);
/*     */     
/* 240 */     this.gunModel[12].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 241 */     this.gunModel[12].setRotationPoint(18.25F, 14.0F, 0.0F);
/*     */     
/* 243 */     this.gunModel[13].addShapeBox(-10.0F, -5.0F, -2.75F, 36, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 244 */     this.gunModel[13].setRotationPoint(-19.0F, -15.0F, -0.5F);
/*     */     
/* 246 */     this.gunModel[14].addShapeBox(-10.0F, -5.0F, -2.75F, 41, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 247 */     this.gunModel[14].setRotationPoint(-19.0F, -17.5F, 6.75F);
/*     */     
/* 249 */     this.gunModel[15].addShapeBox(-10.0F, -5.0F, -2.75F, 34, 2, 5, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 250 */     this.gunModel[15].setRotationPoint(-18.0F, -26.0F, 0.5F);
/*     */     
/* 252 */     this.gunModel[16].addShapeBox(-10.0F, -5.0F, -2.75F, 39, 6, 6, 0.0F, 0.75F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F, 0.75F, 0.5F, 0.5F, 0.75F, -1.0F, 0.5F, 3.0F, -1.0F, 0.5F, 3.0F, -1.0F, 0.5F, 0.75F, -1.0F, 0.5F);
/* 253 */     this.gunModel[16].setRotationPoint(20.0F, -18.0F, 0.0F);
/*     */     
/* 255 */     this.gunModel[17].addShapeBox(-10.0F, -5.0F, -2.75F, 27, 4, 5, 0.0F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -1.25F, 1.0F, -0.5F, 1.25F, 1.0F, -0.5F, 1.25F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F);
/* 256 */     this.gunModel[17].setRotationPoint(18.0F, -24.0F, 0.75F);
/*     */     
/* 258 */     this.gunModel[18].addShapeBox(-10.0F, -5.0F, -2.75F, 4, 4, 5, 0.0F, 1.0F, 0.0F, -1.0F, 3.25F, 0.0F, -1.0F, 3.25F, 0.0F, -1.5F, 1.0F, 0.0F, -1.5F, 1.0F, -0.5F, 1.5F, 4.25F, -0.5F, 1.5F, 4.25F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F);
/* 259 */     this.gunModel[18].setRotationPoint(54.0F, -24.0F, 1.0F);
/*     */     
/* 261 */     this.gunModel[19].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 6, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.75F, 0.0F);
/* 262 */     this.gunModel[19].setRotationPoint(17.25F, -15.0F, -0.5F);
/*     */     
/* 264 */     this.gunModel[20].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 1.0F, 0.0F);
/* 265 */     this.gunModel[20].setRotationPoint(19.5F, -13.0F, -0.5F);
/*     */     
/* 267 */     this.gunModel[21].addShapeBox(-10.0F, -5.0F, -2.75F, 5, 3, 5, 0.0F, 1.0F, 0.0F, -1.5F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.5F, -0.1F, 1.0F, -0.5F, -0.2F, 1.0F, -0.5F, 0.75F, 1.0F, -0.5F, 0.75F);
/* 268 */     this.gunModel[21].setRotationPoint(47.0F, -24.0F, 8.326673E-17F);
/*     */     
/* 270 */     this.gunModel[22].addShapeBox(-10.0F, -5.0F, -2.75F, 23, 3, 2, 0.0F, 1.0F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F);
/* 271 */     this.gunModel[22].setRotationPoint(17.0F, -26.5F, 2.0F);
/*     */     
/* 273 */     this.gunModel[23].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 3, 2, 0.0F, 0.75F, -0.5F, 0.5F, 1.5F, -0.5F, 0.5F, 1.5F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 1.5F, -0.5F, 0.5F, 1.5F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F);
/* 274 */     this.gunModel[23].setRotationPoint(47.0F, -26.5F, 2.0F);
/*     */     
/* 276 */     this.gunModel[24].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 3, 3, 0.0F, 0.75F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.5F, 0.0F, 4.25F, -0.5F, 0.0F, 4.25F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F);
/* 277 */     this.gunModel[24].setRotationPoint(54.5F, -26.5F, 1.25F);
/*     */     
/* 279 */     this.gunModel[25].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 2, 2, 0.0F, 0.75F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -1.0F, 0.5F, 1.25F, -1.0F, 0.5F, 1.25F, -1.0F, 0.5F, 0.75F, -1.0F, 0.5F);
/* 280 */     this.gunModel[25].setRotationPoint(42.0F, -26.5F, 2.0F);
/*     */     
/* 282 */     this.gunModel[26].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 2, 0.0F, 1.0F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F, 1.0F, -1.0F, 0.5F, 1.25F, -1.0F, 0.5F, 1.25F, -1.0F, 0.5F, 1.0F, -1.0F, 0.5F);
/* 283 */     this.gunModel[26].setRotationPoint(50.5F, -26.5F, 2.0F);
/*     */     
/* 285 */     this.gunModel[27].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 286 */     this.gunModel[27].setRotationPoint(49.5F, -24.5F, 2.0F);
/*     */     
/* 288 */     this.gunModel[28].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 289 */     this.gunModel[28].setRotationPoint(49.5F, -25.5F, 2.0F);
/*     */     
/* 291 */     this.gunModel[29].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F);
/* 292 */     this.gunModel[29].setRotationPoint(52.75F, -24.5F, 1.85F);
/*     */     
/* 294 */     this.gunModel[30].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 2, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 295 */     this.gunModel[30].setRotationPoint(52.75F, -26.0F, 1.85F);
/*     */     
/* 297 */     this.gunModel[31].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 298 */     this.gunModel[31].setRotationPoint(41.25F, -24.5F, 1.0F);
/*     */     
/* 300 */     this.gunModel[32].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 301 */     this.gunModel[32].setRotationPoint(41.25F, -25.5F, 2.0F);
/*     */     
/* 303 */     this.gunModel[33].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F);
/* 304 */     this.gunModel[33].setRotationPoint(45.25F, -24.5F, 2.0F);
/*     */     
/* 306 */     this.gunModel[34].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 2, 0.0F, -0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 307 */     this.gunModel[34].setRotationPoint(45.25F, -26.0F, 2.0F);
/*     */     
/* 309 */     this.gunModel[35].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 1, 5, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 310 */     this.gunModel[35].setRotationPoint(19.0F, -19.0F, 0.5F);
/*     */     
/* 312 */     this.gunModel[36].addShapeBox(-10.0F, -5.0F, -2.75F, 33, 1, 5, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 313 */     this.gunModel[36].setRotationPoint(19.0F, -20.0F, 0.5F);
/*     */     
/* 315 */     this.gunModel[37].addShapeBox(-10.0F, -5.0F, -2.75F, 5, 1, 5, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F);
/* 316 */     this.gunModel[37].setRotationPoint(54.0F, -20.0F, 0.15F);
/*     */     
/* 318 */     this.gunModel[38].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 1, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 319 */     this.gunModel[38].setRotationPoint(58.0F, -20.0F, 5.0F);
/*     */     
/* 321 */     this.gunModel[39].addShapeBox(-10.0F, -5.0F, -2.75F, 10, 2, 7, 0.0F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 322 */     this.gunModel[39].setRotationPoint(21.75F, -13.0F, -0.5F);
/*     */     
/* 324 */     this.gunModel[40].addShapeBox(-10.0F, -5.0F, -2.75F, 30, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.75F, 1.0F, 0.25F, -0.75F, 1.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F);
/* 325 */     this.gunModel[40].setRotationPoint(31.75F, -13.0F, -0.6F);
/*     */     
/* 327 */     this.gunModel[41].addShapeBox(-10.0F, -5.0F, -2.75F, 22, 6, 1, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F);
/* 328 */     this.gunModel[41].setRotationPoint(37.0F, -18.0F, 6.75F);
/*     */     
/* 330 */     this.gunModel[42].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 331 */     this.gunModel[42].setRotationPoint(50.0F, -10.75F, 1.5F);
/*     */     
/* 333 */     this.gunModel[43].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 1, 4, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 334 */     this.gunModel[43].setRotationPoint(51.0F, -6.75F, 1.0F);
/*     */     
/* 336 */     this.gunModel[44].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 9, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 337 */     this.gunModel[44].setRotationPoint(51.0F, -7.75F, 2.0F);
/*     */     
/* 339 */     this.gunModel[45].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 13, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 340 */     this.gunModel[45].setRotationPoint(58.0F, -3.75F, 1.0F);
/*     */     
/* 342 */     this.gunModel[46].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 2, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 343 */     this.gunModel[46].setRotationPoint(51.0F, -5.75F, 1.0F);
/*     */     
/* 345 */     this.gunModel[47].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 13, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 346 */     this.gunModel[47].setRotationPoint(56.0F, -3.75F, 1.0F);
/*     */     
/* 348 */     this.gunModel[48].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 349 */     this.gunModel[48].setRotationPoint(54.75F, -4.75F, 1.0F);
/*     */     
/* 351 */     this.gunModel[49].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 13, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 352 */     this.gunModel[49].setRotationPoint(54.25F, -3.75F, 1.0F);
/*     */     
/* 354 */     this.gunModel[50].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 5, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 355 */     this.gunModel[50].setRotationPoint(52.75F, -3.75F, 1.0F);
/*     */     
/* 357 */     this.gunModel[51].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 358 */     this.gunModel[51].setRotationPoint(53.25F, -4.75F, 1.0F);
/*     */     
/* 360 */     this.gunModel[52].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 361 */     this.gunModel[52].setRotationPoint(51.5F, -4.75F, 1.0F);
/*     */     
/* 363 */     this.gunModel[53].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 5, 1, 0.0F, 0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 364 */     this.gunModel[53].setRotationPoint(51.0F, -3.75F, 1.0F);
/*     */     
/* 366 */     this.gunModel[54].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 367 */     this.gunModel[54].setRotationPoint(51.5F, 0.25F, 1.0F);
/*     */     
/* 369 */     this.gunModel[55].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 370 */     this.gunModel[55].setRotationPoint(53.25F, -0.25F, 1.0F);
/*     */     
/* 372 */     this.gunModel[56].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 4, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F);
/* 373 */     this.gunModel[56].setRotationPoint(53.25F, 0.75F, 1.0F);
/*     */     
/* 375 */     this.gunModel[57].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 7, 4, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F);
/* 376 */     this.gunModel[57].setRotationPoint(53.25F, 1.75F, 1.0F);
/*     */     
/* 378 */     this.gunModel[58].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 379 */     this.gunModel[58].setRotationPoint(54.75F, 7.25F, 1.0F);
/*     */     
/* 381 */     this.gunModel[59].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 382 */     this.gunModel[59].setRotationPoint(56.5F, 7.25F, 1.0F);
/*     */     
/* 384 */     this.gunModel[60].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 385 */     this.gunModel[60].setRotationPoint(37.0F, -16.5F, 7.25F);
/*     */     
/* 387 */     this.gunModel[61].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 388 */     this.gunModel[61].setRotationPoint(58.0F, -16.5F, 7.25F);
/*     */     
/* 390 */     this.gunModel[62].addShapeBox(-10.0F, -5.0F, -2.75F, 4, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 391 */     this.gunModel[62].setRotationPoint(65.0F, -16.0F, 1.5F);
/*     */     
/* 393 */     this.gunModel[63].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 3, 3, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 394 */     this.gunModel[63].setRotationPoint(69.0F, -16.0F, 1.5F);
/*     */     
/* 396 */     this.gunModel[64].addShapeBox(-10.0F, -5.0F, -2.75F, 9, 3, 3, 0.0F, 0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F);
/* 397 */     this.gunModel[64].setRotationPoint(70.0F, -16.0F, 1.5F);
/*     */     
/* 399 */     this.gunModel[65].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 400 */     this.gunModel[65].setRotationPoint(17.0F, -9.0F, 0.0F);
/*     */     
/* 402 */     this.gunModel[66].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 3, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 403 */     this.gunModel[66].setRotationPoint(18.0F, -5.0F, 0.0F);
/*     */     
/* 405 */     this.gunModel[67].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 406 */     this.gunModel[67].setRotationPoint(19.0F, -4.5F, 0.0F);
/*     */     
/* 408 */     this.gunModel[68].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F);
/* 409 */     this.gunModel[68].setRotationPoint(54.5F, 9.75F, 1.0F);
/*     */     
/* 411 */     this.gunModel[69].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 412 */     this.gunModel[69].setRotationPoint(57.0F, 9.75F, 1.0F);
/*     */     
/* 414 */     this.gunModel[70].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F);
/* 415 */     this.gunModel[70].setRotationPoint(51.5F, 8.5F, 1.5F);
/*     */     
/* 417 */     this.gunModel[71].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 7, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 418 */     this.gunModel[71].setRotationPoint(51.5F, 1.0F, 1.5F);
/*     */     
/* 420 */     this.gunModel[72].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 5, 1, 0.0F, 0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 421 */     this.gunModel[72].setRotationPoint(51.0F, -3.75F, 4.0F);
/*     */     
/* 423 */     this.gunModel[73].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 2, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 424 */     this.gunModel[73].setRotationPoint(51.0F, -5.75F, 4.0F);
/*     */     
/* 426 */     this.gunModel[74].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 427 */     this.gunModel[74].setRotationPoint(51.5F, -4.75F, 4.0F);
/*     */     
/* 429 */     this.gunModel[75].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 5, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 430 */     this.gunModel[75].setRotationPoint(52.75F, -3.75F, 4.0F);
/*     */     
/* 432 */     this.gunModel[76].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 433 */     this.gunModel[76].setRotationPoint(53.25F, -4.75F, 4.0F);
/*     */     
/* 435 */     this.gunModel[77].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 13, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 436 */     this.gunModel[77].setRotationPoint(54.25F, -3.75F, 4.0F);
/*     */     
/* 438 */     this.gunModel[78].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 439 */     this.gunModel[78].setRotationPoint(54.75F, -4.75F, 4.0F);
/*     */     
/* 441 */     this.gunModel[79].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 13, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 442 */     this.gunModel[79].setRotationPoint(56.0F, -3.75F, 4.0F);
/*     */     
/* 444 */     this.gunModel[80].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 13, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 445 */     this.gunModel[80].setRotationPoint(58.0F, -3.75F, 4.0F);
/*     */     
/* 447 */     this.gunModel[81].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 448 */     this.gunModel[81].setRotationPoint(51.5F, 0.25F, 4.0F);
/*     */     
/* 450 */     this.gunModel[82].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 451 */     this.gunModel[82].setRotationPoint(53.25F, -0.25F, 4.0F);
/*     */     
/* 453 */     this.gunModel[83].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 454 */     this.gunModel[83].setRotationPoint(54.75F, 7.25F, 4.0F);
/*     */     
/* 456 */     this.gunModel[84].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 457 */     this.gunModel[84].setRotationPoint(56.5F, 7.25F, 4.0F);
/*     */     
/* 459 */     this.gunModel[85].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 460 */     this.gunModel[85].setRotationPoint(57.0F, 9.75F, 2.0F);
/*     */     
/* 462 */     this.gunModel[86].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F);
/* 463 */     this.gunModel[86].setRotationPoint(54.5F, 9.75F, 2.0F);
/*     */     
/* 465 */     this.gunModel[87].addShapeBox(-10.0F, -5.0F, -2.75F, 5, 8, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 466 */     this.gunModel[87].setRotationPoint(54.0F, 1.25F, 2.0F);
/*     */     
/* 468 */     this.gunModel[88].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F);
/* 469 */     this.gunModel[88].setRotationPoint(51.5F, 2.0F, 1.5F);
/*     */     
/* 471 */     this.gunModel[89].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F);
/* 472 */     this.gunModel[89].setRotationPoint(51.5F, 3.0F, 1.5F);
/*     */     
/* 474 */     this.gunModel[90].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F);
/* 475 */     this.gunModel[90].setRotationPoint(51.5F, 4.0F, 1.5F);
/*     */     
/* 477 */     this.gunModel[91].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F);
/* 478 */     this.gunModel[91].setRotationPoint(51.5F, 5.0F, 1.5F);
/*     */     
/* 480 */     this.gunModel[92].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.75F, -0.25F, 0.25F);
/* 481 */     this.gunModel[92].setRotationPoint(51.5F, 6.0F, 1.5F);
/*     */     
/* 483 */     this.gunModel[93].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 3, 0.0F, 0.75F, 0.0F, 0.1F, 0.5F, 0.0F, 0.1F, 0.5F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.5F, -0.25F, 0.1F, 0.5F, -0.25F, 0.1F, 0.5F, -0.25F, 0.1F, 0.5F, -0.25F, 0.1F);
/* 484 */     this.gunModel[93].setRotationPoint(51.5F, 6.75F, 1.5F);
/*     */     
/* 486 */     this.gunModel[94].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 2, 4, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 487 */     this.gunModel[94].setRotationPoint(51.0F, -8.75F, 1.0F);
/*     */     
/* 489 */     this.gunModel[95].addShapeBox(-10.0F, -5.0F, -2.75F, 6, 1, 4, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 490 */     this.gunModel[95].setRotationPoint(52.0F, -9.75F, 1.0F);
/*     */     
/* 492 */     this.gunModel[96].addShapeBox(-10.0F, -5.0F, -2.75F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 493 */     this.gunModel[96].setRotationPoint(50.0F, -8.75F, 1.5F);
/*     */     
/* 495 */     this.gunModel[97].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 15, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 496 */     this.gunModel[97].setRotationPoint(55.0F, -5.75F, 4.0F);
/*     */     
/* 498 */     this.gunModel[98].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 6, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 499 */     this.gunModel[98].setRotationPoint(52.0F, -5.75F, 4.0F);
/*     */     
/* 501 */     this.gunModel[99].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 15, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 502 */     this.gunModel[99].setRotationPoint(55.0F, -5.75F, 1.5F);
/*     */     
/* 504 */     this.gunModel[100].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 6, 1, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 505 */     this.gunModel[100].setRotationPoint(52.0F, -3.75F, 1.5F);
/*     */     
/* 507 */     this.gunModel[101].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 2, 5, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 508 */     this.gunModel[101].setRotationPoint(20.0F, -4.5F, 0.0F);
/*     */     
/* 510 */     this.gunModel[102].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 5, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 511 */     this.gunModel[102].setRotationPoint(28.0F, -4.5F, 0.0F);
/*     */     
/* 513 */     this.gunModel[103].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 5, 0.0F, -1.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 514 */     this.gunModel[103].setRotationPoint(28.0F, -5.75F, 0.0F);
/*     */     
/* 516 */     this.gunModel[104].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 5, 5, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 1.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F);
/* 517 */     this.gunModel[104].setRotationPoint(30.0F, -9.75F, 0.0F);
/*     */     
/* 519 */     this.gunModel[105].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 5, 0.0F, 0.25F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F);
/* 520 */     this.gunModel[105].setRotationPoint(30.0F, -11.25F, 0.0F);
/*     */     
/* 522 */     this.gunModel[106].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 5, 0.0F, 1.25F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, 0.0F, 1.25F, -1.0F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F);
/* 523 */     this.gunModel[106].setRotationPoint(30.0F, -11.75F, 0.0F);
/*     */     
/* 525 */     this.gunModel[107].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 526 */     this.gunModel[107].setRotationPoint(37.0F, -15.0F, 6.0F);
/*     */     
/* 528 */     this.gunModel[108].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 529 */     this.gunModel[108].setRotationPoint(37.0F, -18.0F, 6.0F);
/*     */     
/* 531 */     this.gunModel[109].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 532 */     this.gunModel[109].setRotationPoint(58.0F, -18.0F, 6.0F);
/*     */     
/* 534 */     this.gunModel[110].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 535 */     this.gunModel[110].setRotationPoint(58.0F, -15.0F, 6.0F);
/*     */     
/* 537 */     this.gunModel[111].addShapeBox(-10.0F, -5.0F, -2.75F, 4, 3, 5, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 538 */     this.gunModel[111].setRotationPoint(18.0F, -11.5F, 0.0F);
/*     */     
/* 540 */     this.gunModel[112].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 5, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 541 */     this.gunModel[112].setRotationPoint(20.0F, -9.25F, 0.0F);
/*     */     
/* 543 */     this.gunModel[113].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 3, 5, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 544 */     this.gunModel[113].setRotationPoint(20.5F, -8.0F, 0.0F);
/*     */     
/* 546 */     this.gunModel[114].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 547 */     this.gunModel[114].setRotationPoint(22.25F, -5.0F, 0.0F);
/*     */     
/* 549 */     this.gunModel[115].addShapeBox(-10.0F, -5.0F, -2.75F, 69, 2, 2, 0.0F, 1.0F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F, 1.25F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F);
/* 550 */     this.gunModel[115].setRotationPoint(-13.5F, -27.5F, 1.85F);
/*     */     
/* 552 */     this.gunModel[116].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 3, 0.0F, -0.5F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.25F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F);
/* 553 */     this.gunModel[116].setRotationPoint(55.5F, -27.5F, 1.25F);
/*     */     
/* 555 */     this.gunModel[117].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 3, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F);
/* 556 */     this.gunModel[117].setRotationPoint(56.5F, -28.5F, 1.25F);
/*     */     
/* 558 */     this.gunModel[118].addShapeBox(-10.0F, -5.0F, -2.75F, 68, 1, 3, 0.0F, 1.0F, -0.25F, 0.75F, 2.25F, -0.25F, 0.75F, 2.25F, -0.25F, 0.75F, 1.0F, -0.25F, 0.75F, 1.0F, -0.25F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, 0.75F, 1.0F, -0.25F, 0.75F);
/* 559 */     this.gunModel[118].setRotationPoint(-13.5F, -27.75F, 1.5F);
/*     */     
/* 561 */     this.gunModel[119].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 4, 6, 0.0F, -0.25F, -0.5F, -1.5F, 1.5F, -0.5F, -3.0F, 1.5F, -0.5F, -3.0F, -0.25F, -0.5F, -1.5F, -1.25F, 0.0F, 0.5F, 2.5F, 0.0F, -1.5F, 2.5F, 0.0F, -1.5F, -1.25F, 0.0F, 0.5F);
/* 562 */     this.gunModel[119].setRotationPoint(61.0F, -24.5F, 8.326673E-17F);
/*     */     
/* 564 */     this.gunModel[120].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 6, 7, 0.0F, 3.0F, -1.0F, -0.5F, -1.75F, -1.0F, -0.5F, -1.75F, -1.0F, 0.5F, 3.0F, -1.0F, 0.5F, 1.5F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F);
/* 565 */     this.gunModel[120].setRotationPoint(63.5F, -19.5F, -1.0F);
/*     */     
/* 567 */     this.gunModel[121].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 6, 6, 0.0F, 3.0F, -1.0F, 0.5F, -1.75F, -1.0F, -1.5F, -1.75F, -1.0F, -1.5F, 3.0F, -1.0F, 0.5F, 1.5F, 0.5F, 0.5F, -0.25F, 0.5F, -1.5F, -0.25F, 0.5F, -1.5F, 1.5F, 0.5F, 0.5F);
/* 568 */     this.gunModel[121].setRotationPoint(65.75F, -19.5F, 1.110223E-16F);
/*     */     
/* 570 */     this.gunModel[122].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 7, 0.0F, 0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 571 */     this.gunModel[122].setRotationPoint(60.5F, -21.0F, -1.0F);
/*     */     
/* 573 */     this.gunModel[123].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 7, 0.0F, 0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -2.5F, -0.25F, -0.5F, -1.5F, 0.5F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.25F, 0.5F, -2.5F, 0.25F, 0.5F, -1.5F, 0.0F, 0.5F, 0.5F);
/* 574 */     this.gunModel[123].setRotationPoint(62.75F, -21.0F, -1.0F);
/*     */     
/* 576 */     this.gunModel[124].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 7, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.25F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F);
/* 577 */     this.gunModel[124].setRotationPoint(63.0F, -12.75F, -0.5F);
/*     */     
/* 579 */     this.gunModel[125].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 7, 0.0F, 1.0F, 0.25F, 0.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F, -2.0F, 1.0F, 0.25F, 0.0F, 0.5F, 0.0F, -0.75F, 1.25F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, 0.5F, 0.0F, -0.75F);
/* 580 */     this.gunModel[125].setRotationPoint(65.0F, -12.75F, -0.5F);
/*     */     
/* 582 */     this.gunModel[126].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 3, 3, 0.0F, 1.75F, 0.0F, 1.3F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 1.75F, 0.0F, 1.3F, 0.25F, 0.0F, 1.3F, 0.75F, 0.0F, 0.1F, 0.75F, 0.0F, 0.1F, 0.25F, 0.0F, 1.3F);
/* 583 */     this.gunModel[126].setRotationPoint(66.0F, -10.75F, 1.5F);
/*     */     
/* 585 */     this.gunModel[127].addShapeBox(-10.0F, -5.0F, -2.75F, 41, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 586 */     this.gunModel[127].setRotationPoint(-19.0F, -18.5F, 6.75F);
/*     */     
/* 588 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 589 */     this.gunModel[''].setRotationPoint(-19.0F, -21.5F, 6.75F);
/*     */     
/* 591 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 592 */     this.gunModel[''].setRotationPoint(-19.0F, -19.5F, 7.75F);
/*     */     
/* 594 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 595 */     this.gunModel[''].setRotationPoint(-19.0F, -21.5F, 7.75F);
/*     */     
/* 597 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 598 */     this.gunModel[''].setRotationPoint(-19.0F, -24.5F, 6.75F);
/*     */     
/* 600 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 36, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 601 */     this.gunModel[''].setRotationPoint(-19.0F, -25.5F, 5.75F);
/*     */     
/* 603 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 35, 9, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 604 */     this.gunModel[''].setRotationPoint(-19.0F, -24.0F, -0.5F);
/*     */     
/* 606 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 33, 12, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 607 */     this.gunModel[''].setRotationPoint(-19.0F, -24.5F, 5.75F);
/*     */     
/* 609 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 5, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 610 */     this.gunModel[''].setRotationPoint(14.0F, -17.5F, 5.75F);
/*     */     
/* 612 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 32, 1, 3, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.5F, 1.0F, -0.5F, 0.5F);
/* 613 */     this.gunModel[''].setRotationPoint(20.0F, -21.0F, 1.0F);
/*     */     
/* 615 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 616 */     this.gunModel[''].setRotationPoint(-19.0F, -20.5F, 6.75F);
/*     */     
/* 618 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 38, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 619 */     this.gunModel[''].setRotationPoint(-19.0F, -24.5F, 5.75F);
/*     */     
/* 621 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 2, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 622 */     this.gunModel[''].setRotationPoint(-16.5F, -27.5F, 3.25F);
/*     */     
/* 624 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 2, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 625 */     this.gunModel[''].setRotationPoint(-16.5F, -27.5F, 0.75F);
/*     */     
/* 627 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 36, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 628 */     this.gunModel[''].setRotationPoint(-19.0F, -25.5F, -0.75F);
/*     */     
/* 630 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 3, 1, 0.0F, 0.0F, 0.0F, -1.0F, -3.5F, 0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 631 */     this.gunModel[''].setRotationPoint(-19.0F, -24.5F, -1.75F);
/*     */     
/* 633 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 38, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.25F, -1.25F, -0.5F, 0.25F, -1.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 634 */     this.gunModel[''].setRotationPoint(-19.0F, -24.5F, -0.25F);
/*     */     
/* 636 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 33, 12, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 637 */     this.gunModel[''].setRotationPoint(-19.0F, -24.5F, -1.5F);
/*     */     
/* 639 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 640 */     this.gunModel[''].setRotationPoint(-19.0F, -20.5F, -1.75F);
/*     */     
/* 642 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 41, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 643 */     this.gunModel[''].setRotationPoint(-19.0F, -18.5F, -1.75F);
/*     */     
/* 645 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 646 */     this.gunModel[''].setRotationPoint(-19.0F, -21.5F, -1.75F);
/*     */     
/* 648 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 19, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 649 */     this.gunModel[''].setRotationPoint(-19.0F, -17.5F, -1.75F);
/*     */     
/* 651 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 652 */     this.gunModel[''].setRotationPoint(-19.0F, -19.5F, -2.75F);
/*     */     
/* 654 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 40, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 655 */     this.gunModel[''].setRotationPoint(-19.0F, -21.5F, -2.75F);
/*     */     
/* 657 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 5, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 658 */     this.gunModel[''].setRotationPoint(14.0F, -17.5F, -1.5F);
/*     */     
/* 660 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 5, 7, 8, 0.0F, 0.0F, 0.0F, -0.5F, -4.5F, 0.0F, -0.5F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 661 */     this.gunModel[''].setRotationPoint(17.0F, -24.5F, -1.25F);
/*     */     
/* 663 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 1, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 664 */     this.gunModel[''].setRotationPoint(58.0F, -20.0F, -0.85F);
/*     */     
/* 666 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 22, 6, 1, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F);
/* 667 */     this.gunModel[''].setRotationPoint(37.0F, -18.0F, -1.75F);
/*     */     
/* 669 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 670 */     this.gunModel[''].setRotationPoint(58.0F, -15.0F, -0.75F);
/*     */     
/* 672 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 673 */     this.gunModel[''].setRotationPoint(58.0F, -18.0F, -0.75F);
/*     */     
/* 675 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 676 */     this.gunModel[''].setRotationPoint(37.0F, -15.0F, -0.75F);
/*     */     
/* 678 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 679 */     this.gunModel[''].setRotationPoint(37.0F, -18.0F, -0.75F);
/*     */     
/* 681 */     this.gunModel[''].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 682 */     this.gunModel[''].setRotationPoint(37.0F, -16.5F, -2.25F);
/*     */     
/* 684 */     this.gunModel[' '].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F);
/* 685 */     this.gunModel[' '].setRotationPoint(58.0F, -16.5F, -2.25F);
/*     */     
/* 687 */     this.gunModel['¡'].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 688 */     this.gunModel['¡'].setRotationPoint(-19.75F, -26.0F, 3.4F);
/*     */     
/* 690 */     this.gunModel['¢'].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 691 */     this.gunModel['¢'].setRotationPoint(-19.75F, -26.0F, 0.6F);
/*     */     
/* 693 */     this.gunModel['£'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 694 */     this.gunModel['£'].setRotationPoint(-20.75F, -26.0F, -0.4F);
/*     */     
/* 696 */     this.gunModel['¤'].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 697 */     this.gunModel['¤'].setRotationPoint(19.0F, -17.5F, -1.75F);
/*     */     
/* 699 */     this.gunModel['¥'].addShapeBox(-10.0F, -5.0F, -2.75F, 19, 2, 1, 0.0F, 0.25F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 700 */     this.gunModel['¥'].setRotationPoint(0.0F, -15.5F, -1.75F);
/*     */     
/* 702 */     this.gunModel['¦'].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 703 */     this.gunModel['¦'].setRotationPoint(-2.0F, -17.5F, -2.5F);
/*     */     
/* 705 */     this.gunModel['§'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.35F);
/* 706 */     this.gunModel['§'].setRotationPoint(-19.75F, -26.0F, -0.9F);
/*     */     
/* 708 */     this.gunModel['¨'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F);
/* 709 */     this.gunModel['¨'].setRotationPoint(-20.75F, -26.0F, 4.4F);
/*     */     
/* 711 */     this.gunModel['©'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F);
/* 712 */     this.gunModel['©'].setRotationPoint(-19.75F, -26.0F, 5.55F);
/*     */     
/* 714 */     this.gunModel['ª'].addShapeBox(-10.0F, -5.0F, -2.75F, 53, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 715 */     this.gunModel['ª'].setRotationPoint(-71.0F, -20.5F, 5.25F);
/*     */     
/* 717 */     this.gunModel['«'].addShapeBox(-10.0F, -5.0F, -2.75F, 53, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 718 */     this.gunModel['«'].setRotationPoint(-71.0F, -20.5F, -1.25F);
/*     */     
/* 720 */     this.gunModel['¬'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 721 */     this.gunModel['¬'].setRotationPoint(-72.0F, -22.5F, -1.75F);
/*     */     
/* 723 */     this.gunModel['­'].addShapeBox(-10.0F, -5.0F, -2.75F, 5, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 724 */     this.gunModel['­'].setRotationPoint(-77.0F, -22.5F, -1.75F);
/*     */     
/* 726 */     this.gunModel['®'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 727 */     this.gunModel['®'].setRotationPoint(-78.0F, -21.5F, -1.75F);
/*     */     
/* 729 */     this.gunModel['¯'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 730 */     this.gunModel['¯'].setRotationPoint(-72.0F, -20.5F, -1.75F);
/*     */     
/* 732 */     this.gunModel['°'].addShapeBox(-10.0F, -5.0F, -2.75F, 7, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 733 */     this.gunModel['°'].setRotationPoint(-78.0F, -16.5F, -1.75F);
/*     */     
/* 735 */     this.gunModel['±'].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 736 */     this.gunModel['±'].setRotationPoint(-74.0F, -9.5F, -1.75F);
/*     */     
/* 738 */     this.gunModel['²'].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 739 */     this.gunModel['²'].setRotationPoint(-78.0F, -20.5F, -1.75F);
/*     */     
/* 741 */     this.gunModel['³'].addShapeBox(-10.0F, -5.0F, -2.75F, 4, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 742 */     this.gunModel['³'].setRotationPoint(-78.0F, -9.5F, -1.75F);
/*     */     
/* 744 */     this.gunModel['´'].addShapeBox(-10.0F, -5.0F, -2.75F, 4, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F);
/* 745 */     this.gunModel['´'].setRotationPoint(-78.0F, 2.5F, -1.75F);
/*     */     
/*     */ 
/* 748 */     this.defaultScopeModel = new ModelRendererTurbo[24];
/* 749 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 113, 105, this.textureX, this.textureY);
/* 750 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/* 751 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/* 752 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/* 753 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 754 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/* 755 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 489, 97, this.textureX, this.textureY);
/* 756 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 425, 97, this.textureX, this.textureY);
/* 757 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/* 758 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/* 759 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/* 760 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/* 761 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/* 762 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/* 763 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 145, 105, this.textureX, this.textureY);
/* 764 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/* 765 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 217, 105, this.textureX, this.textureY);
/* 766 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/* 767 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/* 768 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 769 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 770 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/* 771 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/* 772 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/*     */     
/* 774 */     this.defaultScopeModel[0].addShapeBox(-10.0F, -5.0F, -2.75F, 12, 1, 3, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 775 */     this.defaultScopeModel[0].setRotationPoint(-11.5F, -28.5F, 1.5F);
/*     */     
/* 777 */     this.defaultScopeModel[1].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 1, 3, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 778 */     this.defaultScopeModel[1].setRotationPoint(-11.5F, -29.5F, 1.5F);
/*     */     
/* 780 */     this.defaultScopeModel[2].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 781 */     this.defaultScopeModel[2].setRotationPoint(-3.5F, -29.5F, 2.5F);
/*     */     
/* 783 */     this.defaultScopeModel[3].addShapeBox(-10.0F, -5.0F, -2.75F, 1, 1, 1, 0.0F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 784 */     this.defaultScopeModel[3].setRotationPoint(-8.0F, -28.5F, 0.5F);
/*     */     
/* 786 */     this.defaultScopeModel[4].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 787 */     this.defaultScopeModel[4].setRotationPoint(-9.0F, -29.5F, 0.5F);
/*     */     
/* 789 */     this.defaultScopeModel[5].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 790 */     this.defaultScopeModel[5].setRotationPoint(-9.0F, -30.5F, 0.5F);
/*     */     
/* 792 */     this.defaultScopeModel[6].addShapeBox(-10.0F, -5.0F, -2.75F, 8, 1, 2, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 793 */     this.defaultScopeModel[6].setRotationPoint(-11.5F, -30.5F, 3.5F);
/*     */     
/* 795 */     this.defaultScopeModel[7].addShapeBox(-10.0F, -5.0F, -2.75F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 796 */     this.defaultScopeModel[7].setRotationPoint(-9.5F, -30.5F, 2.0F);
/*     */     
/* 798 */     this.defaultScopeModel[8].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 799 */     this.defaultScopeModel[8].setRotationPoint(-9.0F, -32.5F, 2.5F);
/*     */     
/* 801 */     this.defaultScopeModel[9].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 802 */     this.defaultScopeModel[9].setRotationPoint(-9.0F, -32.5F, 1.25F);
/*     */     
/* 804 */     this.defaultScopeModel[10].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 805 */     this.defaultScopeModel[10].setRotationPoint(-9.0F, -32.5F, 3.75F);
/*     */     
/* 807 */     this.defaultScopeModel[11].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 808 */     this.defaultScopeModel[11].setRotationPoint(-9.0F, -33.5F, 3.75F);
/*     */     
/* 810 */     this.defaultScopeModel[12].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 811 */     this.defaultScopeModel[12].setRotationPoint(-9.0F, -34.5F, 1.25F);
/*     */     
/* 813 */     this.defaultScopeModel[13].addShapeBox(-10.0F, -5.0F, -2.75F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 814 */     this.defaultScopeModel[13].setRotationPoint(-9.0F, -33.5F, 1.25F);
/*     */     
/* 816 */     this.defaultScopeModel[14].addShapeBox(-10.0F, -5.0F, -2.75F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 817 */     this.defaultScopeModel[14].setRotationPoint(49.5F, -28.5F, 1.5F);
/*     */     
/* 819 */     this.defaultScopeModel[15].addShapeBox(-10.0F, -5.0F, -2.75F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 820 */     this.defaultScopeModel[15].setRotationPoint(49.5F, -29.5F, 1.5F);
/*     */     
/* 822 */     this.defaultScopeModel[16].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 823 */     this.defaultScopeModel[16].setRotationPoint(51.5F, -30.5F, 2.0F);
/*     */     
/* 825 */     this.defaultScopeModel[17].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 826 */     this.defaultScopeModel[17].setRotationPoint(51.5F, -32.5F, 2.5F);
/*     */     
/* 828 */     this.defaultScopeModel[18].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 829 */     this.defaultScopeModel[18].setRotationPoint(51.5F, -33.5F, 2.5F);
/*     */     
/* 831 */     this.defaultScopeModel[19].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 1, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 832 */     this.defaultScopeModel[19].setRotationPoint(51.5F, -33.0F, 1.5F);
/*     */     
/* 834 */     this.defaultScopeModel[20].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 1, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 835 */     this.defaultScopeModel[20].setRotationPoint(51.5F, -34.5F, 1.5F);
/*     */     
/* 837 */     this.defaultScopeModel[21].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 2, 1, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 838 */     this.defaultScopeModel[21].setRotationPoint(51.5F, -33.0F, 3.5F);
/*     */     
/* 840 */     this.defaultScopeModel[22].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 1, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 841 */     this.defaultScopeModel[22].setRotationPoint(51.5F, -34.5F, 3.5F);
/*     */     
/* 843 */     this.defaultScopeModel[23].addShapeBox(-10.0F, -5.0F, -2.75F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 844 */     this.defaultScopeModel[23].setRotationPoint(51.5F, -32.0F, 2.5F);
/*     */     
/*     */ 
/* 847 */     this.ammoModel = new ModelRendererTurbo[5];
/* 848 */     this.ammoModel[0] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/* 849 */     this.ammoModel[1] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/* 850 */     this.ammoModel[2] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/* 851 */     this.ammoModel[3] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/* 852 */     this.ammoModel[4] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*     */     
/* 854 */     this.ammoModel[0].addShapeBox(-10.0F, -5.0F, -2.75F, 12, 5, 5, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 855 */     this.ammoModel[0].setRotationPoint(5.4F, 15.0F, 0.5F);
/*     */     
/* 857 */     this.ammoModel[1].addShapeBox(-10.0F, -5.0F, -2.75F, 12, 5, 5, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 858 */     this.ammoModel[1].setRotationPoint(6.15F, 20.0F, 0.5F);
/*     */     
/* 860 */     this.ammoModel[2].addShapeBox(-10.0F, -5.0F, -2.75F, 12, 5, 5, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 861 */     this.ammoModel[2].setRotationPoint(7.4F, 25.0F, 0.5F);
/*     */     
/* 863 */     this.ammoModel[3].addShapeBox(-10.0F, -5.0F, -2.75F, 12, 5, 5, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 1.5F, 0.0F, 1.75F, -0.75F, 0.0F, 1.75F, -0.75F, 0.0F, -1.25F, 1.5F, 0.0F);
/* 864 */     this.ammoModel[3].setRotationPoint(8.9F, 30.0F, 0.5F);
/*     */     
/* 866 */     this.ammoModel[4].addShapeBox(-10.0F, -5.0F, -2.75F, 12, 18, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 867 */     this.ammoModel[4].setRotationPoint(4.9F, -2.0F, 0.5F);
/*     */     
/*     */ 
/* 870 */     this.scopeAttachPoint = new Vector3f(-0.1875F, 2.6875F, 0.0F);
/*     */     
/* 872 */     translateAll(0.0F, -11.0F, -0.35F);
/* 873 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*     */     
/* 875 */     this.gunSlideDistance = 0.0F;
/* 876 */     this.animationType = EnumAnimationType.CUSTOM;this.tiltGun = 7.0F;
/* 877 */     this.rotateGunVertical = 3.0F;
/* 878 */     this.translateGun = new Vector3f(0.15F, 0.15F, 0.0F);
/*     */     
/* 880 */     this.rotateClipVertical = 5.0F;
/* 881 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/*     */     
/*     */ 
/* 884 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmp7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */