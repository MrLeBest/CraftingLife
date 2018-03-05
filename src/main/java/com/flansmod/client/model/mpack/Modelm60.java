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
/*     */ public class Modelm60
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm60()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[94];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 473, 17, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*     */     
/* 117 */     this.gunModel[0].addBox(0.0F, 0.0F, 0.0F, 26, 3, 4, 0.0F);
/* 118 */     this.gunModel[0].setRotationPoint(-15.0F, -8.0F, -3.0F);
/*     */     
/* 120 */     this.gunModel[1].addBox(0.0F, 0.0F, 0.0F, 19, 4, 5, 0.0F);
/* 121 */     this.gunModel[1].setRotationPoint(11.0F, -8.0F, -3.5F);
/*     */     
/* 123 */     this.gunModel[2].addBox(0.0F, 0.0F, 0.0F, 48, 2, 2, 0.0F);
/* 124 */     this.gunModel[2].setRotationPoint(11.0F, -10.0F, -2.0F);
/*     */     
/* 126 */     this.gunModel[3].addBox(0.0F, 0.0F, 0.0F, 17, 1, 1, 0.0F);
/* 127 */     this.gunModel[3].setRotationPoint(13.0F, -9.0F, 0.5F);
/*     */     
/* 129 */     this.gunModel[4].addBox(0.0F, 0.0F, 0.0F, 17, 1, 1, 0.0F);
/* 130 */     this.gunModel[4].setRotationPoint(13.0F, -9.0F, -3.5F);
/*     */     
/* 132 */     this.gunModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 133 */     this.gunModel[5].setRotationPoint(13.0F, -10.0F, -3.5F);
/*     */     
/* 135 */     this.gunModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 136 */     this.gunModel[6].setRotationPoint(15.0F, -10.0F, -3.5F);
/*     */     
/* 138 */     this.gunModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 139 */     this.gunModel[7].setRotationPoint(17.0F, -10.0F, -3.5F);
/*     */     
/* 141 */     this.gunModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 142 */     this.gunModel[8].setRotationPoint(19.0F, -10.0F, -3.5F);
/*     */     
/* 144 */     this.gunModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 145 */     this.gunModel[9].setRotationPoint(21.0F, -10.0F, -3.5F);
/*     */     
/* 147 */     this.gunModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 148 */     this.gunModel[10].setRotationPoint(23.0F, -10.0F, -3.5F);
/*     */     
/* 150 */     this.gunModel[11].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 151 */     this.gunModel[11].setRotationPoint(25.0F, -10.0F, -3.5F);
/*     */     
/* 153 */     this.gunModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 154 */     this.gunModel[12].setRotationPoint(27.0F, -10.0F, -3.5F);
/*     */     
/* 156 */     this.gunModel[13].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 157 */     this.gunModel[13].setRotationPoint(13.0F, -11.0F, -2.5F);
/*     */     
/* 159 */     this.gunModel[14].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 160 */     this.gunModel[14].setRotationPoint(15.0F, -11.0F, -2.5F);
/*     */     
/* 162 */     this.gunModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 163 */     this.gunModel[15].setRotationPoint(17.0F, -11.0F, -2.5F);
/*     */     
/* 165 */     this.gunModel[16].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 166 */     this.gunModel[16].setRotationPoint(19.0F, -11.0F, -2.5F);
/*     */     
/* 168 */     this.gunModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 169 */     this.gunModel[17].setRotationPoint(21.0F, -11.0F, -2.5F);
/*     */     
/* 171 */     this.gunModel[18].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 172 */     this.gunModel[18].setRotationPoint(23.0F, -11.0F, -2.5F);
/*     */     
/* 174 */     this.gunModel[19].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 175 */     this.gunModel[19].setRotationPoint(25.0F, -11.0F, -2.5F);
/*     */     
/* 177 */     this.gunModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 178 */     this.gunModel[20].setRotationPoint(27.0F, -11.0F, -2.5F);
/*     */     
/* 180 */     this.gunModel[21].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 181 */     this.gunModel[21].setRotationPoint(13.0F, -10.0F, 0.5F);
/*     */     
/* 183 */     this.gunModel[22].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 184 */     this.gunModel[22].setRotationPoint(15.0F, -10.0F, 0.5F);
/*     */     
/* 186 */     this.gunModel[23].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 187 */     this.gunModel[23].setRotationPoint(17.0F, -10.0F, 0.5F);
/*     */     
/* 189 */     this.gunModel[24].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 190 */     this.gunModel[24].setRotationPoint(19.0F, -10.0F, 0.5F);
/*     */     
/* 192 */     this.gunModel[25].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 193 */     this.gunModel[25].setRotationPoint(21.0F, -10.0F, 0.5F);
/*     */     
/* 195 */     this.gunModel[26].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 196 */     this.gunModel[26].setRotationPoint(23.0F, -10.0F, 0.5F);
/*     */     
/* 198 */     this.gunModel[27].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 199 */     this.gunModel[27].setRotationPoint(25.0F, -10.0F, 0.5F);
/*     */     
/* 201 */     this.gunModel[28].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 202 */     this.gunModel[28].setRotationPoint(27.0F, -10.0F, 0.5F);
/*     */     
/* 204 */     this.gunModel[29].addBox(0.0F, 0.0F, 0.0F, 25, 2, 2, 0.0F);
/* 205 */     this.gunModel[29].setRotationPoint(18.0F, -7.0F, -2.0F);
/*     */     
/* 207 */     this.gunModel[30].addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
/* 208 */     this.gunModel[30].setRotationPoint(37.0F, -10.5F, -2.5F);
/*     */     
/* 210 */     this.gunModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F);
/* 211 */     this.gunModel[31].setRotationPoint(37.0F, -7.5F, -2.0F);
/*     */     
/* 213 */     this.gunModel[32].addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
/* 214 */     this.gunModel[32].setRotationPoint(45.0F, -7.0F, -2.0F);
/*     */     
/* 216 */     this.gunModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 217 */     this.gunModel[33].setRotationPoint(52.5F, -13.0F, -1.5F);
/*     */     
/* 219 */     this.gunModel[34].addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
/* 220 */     this.gunModel[34].setRotationPoint(53.0F, -10.5F, -2.5F);
/*     */     
/* 222 */     this.gunModel[35].addBox(0.0F, 0.0F, 0.0F, 2, 18, 2, 0.0F);
/* 223 */     this.gunModel[35].setRotationPoint(53.0F, -8.5F, -2.5F);
/* 224 */     this.gunModel[35].rotateAngleX = -0.2617994F;
/*     */     
/* 226 */     this.gunModel[36].addBox(0.0F, 0.0F, 0.0F, 2, 18, 2, 0.0F);
/* 227 */     this.gunModel[36].setRotationPoint(53.0F, -8.0F, -1.5F);
/* 228 */     this.gunModel[36].rotateAngleX = 0.2617994F;
/*     */     
/* 230 */     this.gunModel[37].addBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F);
/* 231 */     this.gunModel[37].setRotationPoint(10.0F, -11.0F, -3.0F);
/*     */     
/* 233 */     this.gunModel[38].addBox(0.0F, 0.0F, 0.0F, 18, 1, 4, 0.0F);
/* 234 */     this.gunModel[38].setRotationPoint(-14.0F, -11.0F, -3.0F);
/*     */     
/* 236 */     this.gunModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 15, 1, 4, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 237 */     this.gunModel[39].setRotationPoint(-5.0F, -12.0F, -3.0F);
/*     */     
/* 239 */     this.gunModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 7, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 240 */     this.gunModel[40].setRotationPoint(-17.0F, -4.5F, -3.5F);
/*     */     
/* 242 */     this.gunModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 243 */     this.gunModel[41].setRotationPoint(-18.0F, -12.0F, -3.5F);
/*     */     
/* 245 */     this.gunModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 246 */     this.gunModel[42].setRotationPoint(-18.0F, -10.0F, -3.5F);
/*     */     
/* 248 */     this.gunModel[43].addFlexBox(0.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 2);
/* 249 */     this.gunModel[43].setRotationPoint(0.0F, -4.0F, -2.5F);
/* 250 */     this.gunModel[43].rotateAngleZ = -0.31415927F;
/*     */     
/* 252 */     this.gunModel[44].addFlexBox(0.0F, 0.0F, 0.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 253 */     this.gunModel[44].setRotationPoint(1.0F, -2.0F, -2.0F);
/*     */     
/* 255 */     this.gunModel[45].addFlexBox(0.0F, 0.0F, 0.0F, 9, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 256 */     this.gunModel[45].setRotationPoint(-1.0F, -5.0F, -2.5F);
/*     */     
/* 258 */     this.gunModel[46].addFlexBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 259 */     this.gunModel[46].setRotationPoint(6.0F, -4.0F, -2.0F);
/*     */     
/* 261 */     this.gunModel[47].addFlexBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 262 */     this.gunModel[47].setRotationPoint(4.0F, -4.5F, -1.5F);
/*     */     
/* 264 */     this.gunModel[48].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 265 */     this.gunModel[48].setRotationPoint(9.0F, -6.5F, -5.5F);
/*     */     
/* 267 */     this.gunModel[49].addBox(0.0F, 0.0F, -1.0F, 6, 1, 1, 0.0F);
/* 268 */     this.gunModel[49].setRotationPoint(4.0F, -9.0F, 1.0F);
/*     */     
/* 270 */     this.gunModel[50].addBox(0.0F, 0.0F, 0.0F, 19, 2, 4, 0.0F);
/* 271 */     this.gunModel[50].setRotationPoint(-15.0F, -10.0F, -3.0F);
/*     */     
/* 273 */     this.gunModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 274 */     this.gunModel[51].setRotationPoint(13.0F, -11.0F, 0.5F);
/*     */     
/* 276 */     this.gunModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 277 */     this.gunModel[52].setRotationPoint(15.0F, -11.0F, 0.5F);
/*     */     
/* 279 */     this.gunModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 280 */     this.gunModel[53].setRotationPoint(19.0F, -11.0F, 0.5F);
/*     */     
/* 282 */     this.gunModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 283 */     this.gunModel[54].setRotationPoint(17.0F, -11.0F, 0.5F);
/*     */     
/* 285 */     this.gunModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 286 */     this.gunModel[55].setRotationPoint(27.0F, -11.0F, 0.5F);
/*     */     
/* 288 */     this.gunModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 289 */     this.gunModel[56].setRotationPoint(25.0F, -11.0F, 0.5F);
/*     */     
/* 291 */     this.gunModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 292 */     this.gunModel[57].setRotationPoint(23.0F, -11.0F, 0.5F);
/*     */     
/* 294 */     this.gunModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 295 */     this.gunModel[58].setRotationPoint(21.0F, -11.0F, 0.5F);
/*     */     
/* 297 */     this.gunModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 298 */     this.gunModel[59].setRotationPoint(27.0F, -11.0F, -3.5F);
/*     */     
/* 300 */     this.gunModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 301 */     this.gunModel[60].setRotationPoint(25.0F, -11.0F, -3.5F);
/*     */     
/* 303 */     this.gunModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 304 */     this.gunModel[61].setRotationPoint(21.0F, -11.0F, -3.5F);
/*     */     
/* 306 */     this.gunModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 307 */     this.gunModel[62].setRotationPoint(23.0F, -11.0F, -3.5F);
/*     */     
/* 309 */     this.gunModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 310 */     this.gunModel[63].setRotationPoint(13.0F, -11.0F, -3.5F);
/*     */     
/* 312 */     this.gunModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 313 */     this.gunModel[64].setRotationPoint(15.0F, -11.0F, -3.5F);
/*     */     
/* 315 */     this.gunModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 316 */     this.gunModel[65].setRotationPoint(17.0F, -11.0F, -3.5F);
/*     */     
/* 318 */     this.gunModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 319 */     this.gunModel[66].setRotationPoint(19.0F, -11.0F, -3.5F);
/*     */     
/* 321 */     this.gunModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F);
/* 322 */     this.gunModel[67].setRotationPoint(43.0F, -7.5F, -2.0F);
/*     */     
/* 324 */     this.gunModel[68].addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
/* 325 */     this.gunModel[68].setRotationPoint(43.0F, -10.5F, -2.5F);
/*     */     
/* 327 */     this.gunModel[69].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 328 */     this.gunModel[69].setRotationPoint(29.0F, -10.0F, -3.5F);
/*     */     
/* 330 */     this.gunModel[70].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/* 331 */     this.gunModel[70].setRotationPoint(29.0F, -11.0F, -2.5F);
/*     */     
/* 333 */     this.gunModel[71].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 334 */     this.gunModel[71].setRotationPoint(29.0F, -11.0F, -3.5F);
/*     */     
/* 336 */     this.gunModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 337 */     this.gunModel[72].setRotationPoint(29.0F, -11.0F, 0.5F);
/*     */     
/* 339 */     this.gunModel[73].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 340 */     this.gunModel[73].setRotationPoint(29.0F, -10.0F, 0.5F);
/*     */     
/* 342 */     this.gunModel[74].addFlexBox(0.0F, 0.0F, 0.0F, 1, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 343 */     this.gunModel[74].setRotationPoint(-18.0F, -4.5F, -3.5F);
/*     */     
/* 345 */     this.gunModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 1, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 346 */     this.gunModel[75].setRotationPoint(-19.0F, -12.0F, -3.5F);
/*     */     
/* 348 */     this.gunModel[76].addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
/* 349 */     this.gunModel[76].setRotationPoint(-18.0F, -11.0F, -3.5F);
/*     */     
/* 351 */     this.gunModel[77].addBox(0.0F, 0.0F, -1.0F, 6, 3, 1, 0.0F);
/* 352 */     this.gunModel[77].setRotationPoint(4.0F, -11.0F, -2.0F);
/*     */     
/* 354 */     this.gunModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F);
/* 355 */     this.gunModel[78].setRotationPoint(-1.0F, -12.0F, 1.0F);
/*     */     
/* 357 */     this.gunModel[79].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 358 */     this.gunModel[79].setRotationPoint(3.0F, -11.0F, 1.0F);
/*     */     
/* 360 */     this.gunModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 361 */     this.gunModel[80].setRotationPoint(10.0F, -11.0F, 1.0F);
/*     */     
/* 363 */     this.gunModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 364 */     this.gunModel[81].setRotationPoint(3.0F, -12.0F, 1.0F);
/*     */     
/* 366 */     this.gunModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 367 */     this.gunModel[82].setRotationPoint(3.0F, -9.0F, 1.0F);
/*     */     
/* 369 */     this.gunModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 370 */     this.gunModel[83].setRotationPoint(10.0F, -9.0F, 1.0F);
/*     */     
/* 372 */     this.gunModel[84].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 373 */     this.gunModel[84].setRotationPoint(4.0F, -9.0F, 1.0F);
/*     */     
/* 375 */     this.gunModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 376 */     this.gunModel[85].setRotationPoint(52.0F, -13.0F, -1.5F);
/*     */     
/* 378 */     this.gunModel[86].addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
/* 379 */     this.gunModel[86].setRotationPoint(11.0F, -13.0F, -1.5F);
/*     */     
/* 381 */     this.gunModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 382 */     this.gunModel[87].setRotationPoint(11.0F, -16.0F, -1.5F);
/*     */     
/* 384 */     this.gunModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 385 */     this.gunModel[88].setRotationPoint(11.0F, -16.0F, 0.0F);
/*     */     
/* 387 */     this.gunModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 388 */     this.gunModel[89].setRotationPoint(11.0F, -16.0F, -1.0F);
/*     */     
/* 390 */     this.gunModel[90].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 391 */     this.gunModel[90].setRotationPoint(11.0F, -14.0F, -1.0F);
/*     */     
/* 393 */     this.gunModel[91].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.25F, 0.5F, -0.75F, -1.0F, 0.5F, -0.75F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 394 */     this.gunModel[91].setRotationPoint(52.86F, -14.0F, -1.88F);
/*     */     
/* 396 */     this.gunModel[92].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F);
/* 397 */     this.gunModel[92].setRotationPoint(-1.0F, -10.0F, 1.0F);
/*     */     
/* 399 */     this.gunModel[93].addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
/* 400 */     this.gunModel[93].setRotationPoint(10.0F, -12.0F, -3.0F);
/*     */     
/*     */ 
/* 403 */     this.ammoModel = new ModelRendererTurbo[5];
/* 404 */     this.ammoModel[0] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/* 405 */     this.ammoModel[1] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/* 406 */     this.ammoModel[2] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/* 407 */     this.ammoModel[3] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/* 408 */     this.ammoModel[4] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*     */     
/* 410 */     this.ammoModel[0].addBox(0.0F, 0.0F, 0.0F, 8, 12, 9, 0.0F);
/* 411 */     this.ammoModel[0].setRotationPoint(3.0F, -8.0F, 1.0F);
/*     */     
/* 413 */     this.ammoModel[1].addBox(0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F);
/* 414 */     this.ammoModel[1].setRotationPoint(4.0F, -9.0F, 2.0F);
/*     */     
/* 416 */     this.ammoModel[2].addBox(0.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F);
/* 417 */     this.ammoModel[2].setRotationPoint(4.0F, -11.0F, 1.0F);
/*     */     
/* 419 */     this.ammoModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 420 */     this.ammoModel[3].setRotationPoint(6.0F, -9.0F, 2.0F);
/*     */     
/* 422 */     this.ammoModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 423 */     this.ammoModel[4].setRotationPoint(6.0F, -11.0F, 0.0F);
/*     */     
/*     */ 
/*     */ 
/* 427 */     translateAll(0.0F, -2.0F, 0.25F);
/* 428 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.03F, 0.0F);
/*     */     
/*     */ 
/* 431 */     this.gunSlideDistance = 0.0F;
/* 432 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 435 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */