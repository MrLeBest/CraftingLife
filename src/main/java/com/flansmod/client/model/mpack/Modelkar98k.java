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
/*     */ public class Modelkar98k
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelkar98k()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[104];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 289, 33, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 329, 57, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 185, 57, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 281, 65, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 425, 65, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 161, 89, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 321, 105, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 153, 129, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 193, 129, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 385, 41, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 457, 105, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 121, 89, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
/*     */     
/* 127 */     this.gunModel[0].addBox(49.0F, -3.0F, -3.65F, 84, 9, 10, 0.0F);
/* 128 */     this.gunModel[0].setRotationPoint(-7.0F, -25.0F, -1.0F);
/*     */     
/* 130 */     this.gunModel[1].addShapeBox(49.0F, -3.0F, -3.65F, 84, 4, 10, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 3.0F, -2.0F);
/* 131 */     this.gunModel[1].setRotationPoint(-7.0F, -16.0F, -1.0F);
/*     */     
/* 133 */     this.gunModel[2].addShapeBox(49.0F, -3.0F, -3.65F, 84, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 134 */     this.gunModel[2].setRotationPoint(-7.0F, -16.0F, -1.0F);
/*     */     
/* 136 */     this.gunModel[3].addShapeBox(49.0F, -3.0F, -3.65F, 40, 4, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 137 */     this.gunModel[3].setRotationPoint(37.0F, -29.0F, -1.0F);
/*     */     
/* 139 */     this.gunModel[4].addBox(49.0F, -3.0F, -3.65F, 87, 5, 5, 0.0F);
/* 140 */     this.gunModel[4].setRotationPoint(77.0F, -26.5F, 1.5F);
/*     */     
/* 142 */     this.gunModel[5].addBox(49.0F, -3.0F, -3.65F, 32, 3, 3, 0.0F);
/* 143 */     this.gunModel[5].setRotationPoint(120.0F, -18.5F, 2.5F);
/*     */     
/* 145 */     this.gunModel[6].addBox(49.0F, -3.0F, -3.65F, 14, 6, 2, 0.0F);
/* 146 */     this.gunModel[6].setRotationPoint(120.0F, -22.0F, 3.0F);
/*     */     
/* 148 */     this.gunModel[7].addShapeBox(49.0F, -3.0F, -3.65F, 3, 9, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 149 */     this.gunModel[7].setRotationPoint(77.0F, -25.0F, -1.0F);
/*     */     
/* 151 */     this.gunModel[8].addShapeBox(49.0F, -3.0F, -3.65F, 3, 4, 10, 0.0F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 152 */     this.gunModel[8].setRotationPoint(77.0F, -29.0F, -1.0F);
/*     */     
/* 154 */     this.gunModel[9].addShapeBox(49.0F, -3.0F, -3.65F, 3, 4, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F);
/* 155 */     this.gunModel[9].setRotationPoint(77.0F, -16.0F, -1.0F);
/*     */     
/* 157 */     this.gunModel[10].addShapeBox(49.0F, -3.0F, -3.65F, 4, 9, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 158 */     this.gunModel[10].setRotationPoint(108.0F, -25.0F, -1.0F);
/*     */     
/* 160 */     this.gunModel[11].addShapeBox(49.0F, -3.0F, -3.65F, 4, 4, 10, 0.0F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 161 */     this.gunModel[11].setRotationPoint(108.0F, -29.0F, -1.0F);
/*     */     
/* 163 */     this.gunModel[12].addShapeBox(49.0F, -3.0F, -3.65F, 4, 4, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F);
/* 164 */     this.gunModel[12].setRotationPoint(108.0F, -16.0F, -1.0F);
/*     */     
/* 166 */     this.gunModel[13].addBox(49.0F, -3.0F, -3.65F, 28, 3, 10, 0.0F);
/* 167 */     this.gunModel[13].setRotationPoint(80.0F, -25.0F, -1.0F);
/*     */     
/* 169 */     this.gunModel[14].addShapeBox(49.0F, -3.0F, -3.65F, 28, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 170 */     this.gunModel[14].setRotationPoint(80.0F, -16.0F, -1.0F);
/*     */     
/* 172 */     this.gunModel[15].addShapeBox(49.0F, -3.0F, -3.65F, 4, 4, 10, 0.0F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, -1.5F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 173 */     this.gunModel[15].setRotationPoint(116.0F, -29.0F, -1.0F);
/*     */     
/* 175 */     this.gunModel[16].addShapeBox(49.0F, -3.0F, -3.65F, 4, 9, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 176 */     this.gunModel[16].setRotationPoint(116.0F, -25.0F, -1.0F);
/*     */     
/* 178 */     this.gunModel[17].addShapeBox(49.0F, -3.0F, -3.65F, 4, 3, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 179 */     this.gunModel[17].setRotationPoint(112.0F, -22.0F, -1.0F);
/*     */     
/* 181 */     this.gunModel[18].addShapeBox(49.0F, -3.0F, -3.65F, 4, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 182 */     this.gunModel[18].setRotationPoint(112.0F, -19.0F, 0.0F);
/*     */     
/* 184 */     this.gunModel[19].addShapeBox(49.0F, -3.0F, -3.65F, 4, 4, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F);
/* 185 */     this.gunModel[19].setRotationPoint(116.0F, -16.0F, -1.0F);
/*     */     
/* 187 */     this.gunModel[20].addShapeBox(49.0F, -3.0F, -3.65F, 4, 4, 10, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F);
/* 188 */     this.gunModel[20].setRotationPoint(112.0F, -16.0F, -1.0F);
/*     */     
/* 190 */     this.gunModel[21].addShapeBox(49.0F, -3.0F, -3.65F, 1, 4, 10, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 191 */     this.gunModel[21].setRotationPoint(36.0F, -29.0F, -1.0F);
/*     */     
/* 193 */     this.gunModel[22].addShapeBox(49.0F, -3.0F, -3.65F, 34, 4, 10, 0.0F, 0.0F, -1.5F, -3.5F, 0.0F, -1.5F, -3.5F, 0.0F, -1.5F, -3.5F, 0.0F, -1.5F, -3.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 194 */     this.gunModel[22].setRotationPoint(2.0F, -29.0F, -1.0F);
/*     */     
/* 196 */     this.gunModel[23].addShapeBox(49.0F, -3.0F, -3.65F, 8, 4, 10, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 197 */     this.gunModel[23].setRotationPoint(-7.0F, -29.0F, -1.0F);
/*     */     
/* 199 */     this.gunModel[24].addShapeBox(49.0F, -3.0F, -3.65F, 1, 4, 10, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 200 */     this.gunModel[24].setRotationPoint(1.0F, -29.0F, -1.0F);
/*     */     
/* 202 */     this.gunModel[25].addBox(49.0F, -3.0F, -3.65F, 25, 7, 2, 0.0F);
/* 203 */     this.gunModel[25].setRotationPoint(-32.0F, -23.0F, 7.0F);
/*     */     
/* 205 */     this.gunModel[26].addShapeBox(49.0F, -3.0F, -3.65F, 25, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 206 */     this.gunModel[26].setRotationPoint(-32.0F, -16.0F, -1.0F);
/*     */     
/* 208 */     this.gunModel[27].addShapeBox(49.0F, -3.0F, -3.65F, 25, 4, 10, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 2.0F, -2.0F);
/* 209 */     this.gunModel[27].setRotationPoint(-32.0F, -13.0F, -1.0F);
/*     */     
/* 211 */     this.gunModel[28].addBox(49.0F, -3.0F, -3.65F, 25, 2, 2, 0.0F);
/* 212 */     this.gunModel[28].setRotationPoint(-32.0F, -25.0F, 7.0F);
/*     */     
/* 214 */     this.gunModel[29].addShapeBox(49.0F, -3.0F, -3.65F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 215 */     this.gunModel[29].setRotationPoint(-32.0F, -25.0F, -1.0F);
/*     */     
/* 217 */     this.gunModel[30].addShapeBox(49.0F, -3.0F, -3.65F, 2, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 218 */     this.gunModel[30].setRotationPoint(-9.0F, -25.0F, -1.0F);
/*     */     
/* 220 */     this.gunModel[31].addShapeBox(49.0F, -3.0F, -3.65F, 18, 4, 5, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 3.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F);
/* 221 */     this.gunModel[31].setRotationPoint(-25.0F, -29.0F, 4.0F);
/*     */     
/* 223 */     this.gunModel[32].addShapeBox(49.0F, -3.0F, -3.65F, 8, 4, 10, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 224 */     this.gunModel[32].setRotationPoint(-40.0F, -29.0F, -1.0F);
/*     */     
/* 226 */     this.gunModel[33].addBox(49.0F, -3.0F, -3.65F, 8, 3, 10, 0.0F);
/* 227 */     this.gunModel[33].setRotationPoint(-40.0F, -25.0F, -1.0F);
/*     */     
/* 229 */     this.gunModel[34].addShapeBox(49.0F, -3.0F, -3.65F, 3, 6, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 230 */     this.gunModel[34].setRotationPoint(-39.0F, -17.0F, -1.0F);
/*     */     
/* 232 */     this.gunModel[35].addBox(49.0F, -3.0F, -3.65F, 12, 9, 8, 0.0F);
/* 233 */     this.gunModel[35].setRotationPoint(-51.0F, -20.0F, 1.0F);
/*     */     
/* 235 */     this.gunModel[36].addShapeBox(49.0F, -3.0F, -3.65F, 3, 4, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 236 */     this.gunModel[36].setRotationPoint(-39.0F, -11.0F, -1.0F);
/*     */     
/* 238 */     this.gunModel[37].addShapeBox(49.0F, -3.0F, -3.65F, 3, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 239 */     this.gunModel[37].setRotationPoint(-39.0F, -20.0F, -1.0F);
/*     */     
/* 241 */     this.gunModel[38].addShapeBox(49.0F, -3.0F, -3.65F, 9, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 242 */     this.gunModel[38].setRotationPoint(-48.0F, -20.0F, -1.0F);
/*     */     
/* 244 */     this.gunModel[39].addBox(49.0F, -3.0F, -3.65F, 3, 2, 10, 0.0F);
/* 245 */     this.gunModel[39].setRotationPoint(-35.0F, -22.0F, -1.0F);
/*     */     
/* 247 */     this.gunModel[40].addBox(49.0F, -3.0F, -3.65F, 5, 2, 10, 0.0F);
/* 248 */     this.gunModel[40].setRotationPoint(-40.0F, -22.0F, -1.0F);
/*     */     
/* 250 */     this.gunModel[41].addShapeBox(49.0F, -3.0F, -3.65F, 3, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 251 */     this.gunModel[41].setRotationPoint(-51.0F, -17.0F, -1.0F);
/*     */     
/* 253 */     this.gunModel[42].addShapeBox(49.0F, -3.0F, -3.65F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 254 */     this.gunModel[42].setRotationPoint(-51.0F, -20.0F, -1.0F);
/*     */     
/* 256 */     this.gunModel[43].addShapeBox(49.0F, -3.0F, -3.65F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 257 */     this.gunModel[43].setRotationPoint(-51.0F, -11.0F, -1.0F);
/*     */     
/* 259 */     this.gunModel[44].addShapeBox(49.0F, -3.0F, -3.65F, 9, 4, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 260 */     this.gunModel[44].setRotationPoint(-48.0F, -11.0F, -1.0F);
/*     */     
/* 262 */     this.gunModel[45].addShapeBox(49.0F, -3.0F, -3.65F, 11, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 263 */     this.gunModel[45].setRotationPoint(-51.0F, -23.0F, -1.0F);
/*     */     
/* 265 */     this.gunModel[46].addShapeBox(49.0F, -3.0F, -3.65F, 4, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 266 */     this.gunModel[46].setRotationPoint(-36.0F, -11.0F, -1.0F);
/*     */     
/* 268 */     this.gunModel[47].addBox(49.0F, -3.0F, -3.65F, 4, 9, 10, 0.0F);
/* 269 */     this.gunModel[47].setRotationPoint(-36.0F, -20.0F, -1.0F);
/*     */     
/* 271 */     this.gunModel[48].addShapeBox(49.0F, -3.0F, -3.65F, 24, 3, 10, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 272 */     this.gunModel[48].setRotationPoint(-75.0F, -23.0F, -1.0F);
/*     */     
/* 274 */     this.gunModel[49].addShapeBox(49.0F, -3.0F, -3.65F, 12, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 275 */     this.gunModel[49].setRotationPoint(-63.0F, -11.0F, -1.0F);
/*     */     
/* 277 */     this.gunModel[50].addShapeBox(49.0F, -3.0F, -3.65F, 24, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 278 */     this.gunModel[50].setRotationPoint(-75.0F, -16.0F, -1.0F);
/*     */     
/* 280 */     this.gunModel[51].addShapeBox(49.0F, -3.0F, -3.65F, 12, 4, 10, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 6.0F, -2.0F);
/* 281 */     this.gunModel[51].setRotationPoint(-75.0F, -11.0F, -1.0F);
/*     */     
/* 283 */     this.gunModel[52].addShapeBox(49.0F, -3.0F, -3.65F, 12, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 284 */     this.gunModel[52].setRotationPoint(-75.0F, -11.0F, -1.0F);
/*     */     
/* 286 */     this.gunModel[53].addShapeBox(49.0F, -3.0F, -3.65F, 3, 6, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 287 */     this.gunModel[53].setRotationPoint(-78.0F, -11.0F, -1.0F);
/*     */     
/* 289 */     this.gunModel[54].addShapeBox(49.0F, -3.0F, -3.65F, 3, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 3.0F, -2.0F, 0.0F, 3.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 290 */     this.gunModel[54].setRotationPoint(-78.0F, -8.0F, -1.0F);
/*     */     
/* 292 */     this.gunModel[55].addShapeBox(49.0F, -3.0F, -3.65F, 3, 5, 10, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 293 */     this.gunModel[55].setRotationPoint(-78.0F, -16.0F, -1.0F);
/*     */     
/* 295 */     this.gunModel[56].addShapeBox(49.0F, -3.0F, -3.65F, 3, 3, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 296 */     this.gunModel[56].setRotationPoint(-78.0F, -21.0F, -1.0F);
/*     */     
/* 298 */     this.gunModel[57].addShapeBox(49.0F, -3.0F, -3.65F, 62, 3, 10, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 299 */     this.gunModel[57].setRotationPoint(-140.0F, -21.0F, -1.0F);
/*     */     
/* 301 */     this.gunModel[58].addShapeBox(49.0F, -3.0F, -3.65F, 62, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 302 */     this.gunModel[58].setRotationPoint(-140.0F, -14.0F, -1.0F);
/*     */     
/* 304 */     this.gunModel[59].addShapeBox(49.0F, -3.0F, -3.65F, 62, 19, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 305 */     this.gunModel[59].setRotationPoint(-140.0F, -11.0F, -1.0F);
/*     */     
/* 307 */     this.gunModel[60].addShapeBox(49.0F, -3.0F, -3.65F, 62, 4, 10, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -16.0F, 0.0F, 0.0F, 16.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 16.0F, -2.0F);
/* 308 */     this.gunModel[60].setRotationPoint(-140.0F, -8.0F, -1.0F);
/*     */     
/* 310 */     this.gunModel[61].addBox(49.0F, -3.0F, -3.65F, 28, 3, 10, 0.0F);
/* 311 */     this.gunModel[61].setRotationPoint(80.0F, -19.0F, -1.0F);
/*     */     
/* 313 */     this.gunModel[62].addBox(49.0F, -3.0F, -3.65F, 28, 3, 8, 0.0F);
/* 314 */     this.gunModel[62].setRotationPoint(80.0F, -22.0F, 1.0F);
/*     */     
/* 316 */     this.gunModel[63].addShapeBox(49.0F, -3.0F, -3.65F, 28, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 317 */     this.gunModel[63].setRotationPoint(80.0F, -22.0F, -1.0F);
/*     */     
/* 319 */     this.gunModel[64].addBox(49.0F, -3.0F, -3.65F, 3, 1, 11, 0.0F);
/* 320 */     this.gunModel[64].setRotationPoint(-6.0F, -19.0F, -1.5F);
/*     */     
/* 322 */     this.gunModel[65].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 323 */     this.gunModel[65].setRotationPoint(-6.0F, -20.0F, -1.5F);
/*     */     
/* 325 */     this.gunModel[66].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 326 */     this.gunModel[66].setRotationPoint(-6.0F, -18.0F, -1.5F);
/*     */     
/* 328 */     this.gunModel[67].addBox(49.0F, -3.0F, -3.65F, 6, 2, 11, 0.0F);
/* 329 */     this.gunModel[67].setRotationPoint(-104.0F, -11.0F, -1.5F);
/*     */     
/* 331 */     this.gunModel[68].addShapeBox(49.0F, -3.0F, -3.65F, 6, 2, 11, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 332 */     this.gunModel[68].setRotationPoint(-104.0F, -13.0F, -1.5F);
/*     */     
/* 334 */     this.gunModel[69].addShapeBox(49.0F, -3.0F, -3.65F, 6, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 335 */     this.gunModel[69].setRotationPoint(-104.0F, -9.0F, -1.5F);
/*     */     
/* 337 */     this.gunModel[70].addShapeBox(49.0F, -3.0F, -3.65F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 338 */     this.gunModel[70].setRotationPoint(-42.0F, 0.0F, 2.0F);
/*     */     
/* 340 */     this.gunModel[71].addShapeBox(49.0F, -3.0F, -3.65F, 9, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 341 */     this.gunModel[71].setRotationPoint(-39.5F, 0.0F, 2.0F);
/*     */     
/* 343 */     this.gunModel[72].addShapeBox(49.0F, -3.0F, -3.65F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 344 */     this.gunModel[72].setRotationPoint(-30.0F, -8.0F, 2.0F);
/*     */     
/* 346 */     this.gunModel[73].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 347 */     this.gunModel[73].setRotationPoint(-30.0F, -5.0F, 2.0F);
/*     */     
/* 349 */     this.gunModel[74].addShapeBox(49.0F, -3.0F, -3.65F, 4, 4, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 350 */     this.gunModel[74].setRotationPoint(-30.0F, -4.0F, 2.0F);
/*     */     
/* 352 */     this.gunModel[75].addShapeBox(49.0F, -3.0F, -3.65F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 353 */     this.gunModel[75].setRotationPoint(-30.0F, 0.0F, 2.0F);
/*     */     
/* 355 */     this.gunModel[76].addShapeBox(49.0F, -3.0F, -3.65F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 356 */     this.gunModel[76].setRotationPoint(-44.0F, -7.0F, 2.0F);
/*     */     
/* 358 */     this.gunModel[77].addShapeBox(49.0F, -3.0F, -3.65F, 4, 5, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 359 */     this.gunModel[77].setRotationPoint(-44.0F, -5.0F, 2.0F);
/*     */     
/* 361 */     this.gunModel[78].addShapeBox(49.0F, -3.0F, -3.65F, 3, 2, 4, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 362 */     this.gunModel[78].setRotationPoint(-38.5F, -7.0F, 2.0F);
/*     */     
/* 364 */     this.gunModel[79].addShapeBox(49.0F, -3.0F, -3.65F, 2, 2, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 365 */     this.gunModel[79].setRotationPoint(-38.0F, -5.0F, 2.0F);
/*     */     
/* 367 */     this.gunModel[80].addShapeBox(49.0F, -3.0F, -3.65F, 2, 2, 4, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 368 */     this.gunModel[80].setRotationPoint(-37.0F, -3.0F, 2.0F);
/*     */     
/* 370 */     this.gunModel[81].addShapeBox(49.0F, -3.0F, -3.65F, 16, 5, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 371 */     this.gunModel[81].setRotationPoint(20.0F, -30.0F, 0.5F);
/*     */     
/* 373 */     this.gunModel[82].addShapeBox(49.0F, -3.0F, -3.65F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 374 */     this.gunModel[82].setRotationPoint(20.0F, -31.0F, 0.0F);
/*     */     
/* 376 */     this.gunModel[83].addShapeBox(49.0F, -3.0F, -3.65F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 377 */     this.gunModel[83].setRotationPoint(20.0F, -31.0F, 4.0F);
/*     */     
/* 379 */     this.gunModel[84].addShapeBox(49.0F, -3.0F, -3.65F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 380 */     this.gunModel[84].setRotationPoint(21.0F, -30.0F, 6.5F);
/*     */     
/* 382 */     this.gunModel[85].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 383 */     this.gunModel[85].setRotationPoint(21.0F, -31.0F, 6.5F);
/*     */     
/* 385 */     this.gunModel[86].addShapeBox(49.0F, -3.0F, -3.65F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 386 */     this.gunModel[86].setRotationPoint(21.0F, -30.0F, 1.0F);
/*     */     
/* 388 */     this.gunModel[87].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 389 */     this.gunModel[87].setRotationPoint(21.0F, -31.0F, 1.0F);
/*     */     
/* 391 */     this.gunModel[88].addShapeBox(49.0F, -3.0F, -3.65F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 392 */     this.gunModel[88].setRotationPoint(33.0F, -30.0F, 6.5F);
/*     */     
/* 394 */     this.gunModel[89].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 395 */     this.gunModel[89].setRotationPoint(33.0F, -31.0F, 6.5F);
/*     */     
/* 397 */     this.gunModel[90].addShapeBox(49.0F, -3.0F, -3.65F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 398 */     this.gunModel[90].setRotationPoint(33.0F, -30.0F, 1.0F);
/*     */     
/* 400 */     this.gunModel[91].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 401 */     this.gunModel[91].setRotationPoint(33.0F, -31.0F, 1.0F);
/*     */     
/* 403 */     this.gunModel[92].addShapeBox(49.0F, -3.0F, -3.65F, 4, 2, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 404 */     this.gunModel[92].setRotationPoint(157.0F, -28.5F, 1.0F);
/*     */     
/* 406 */     this.gunModel[93].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 407 */     this.gunModel[93].setRotationPoint(157.0F, -28.5F, 6.0F);
/*     */     
/* 409 */     this.gunModel[94].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 410 */     this.gunModel[94].setRotationPoint(157.0F, -28.5F, 0.0F);
/*     */     
/* 412 */     this.gunModel[95].addShapeBox(49.0F, -3.0F, -3.65F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 413 */     this.gunModel[95].setRotationPoint(157.0F, -31.5F, 6.0F);
/*     */     
/* 415 */     this.gunModel[96].addShapeBox(49.0F, -3.0F, -3.65F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 416 */     this.gunModel[96].setRotationPoint(157.0F, -31.5F, 1.0F);
/*     */     
/* 418 */     this.gunModel[97].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 419 */     this.gunModel[97].setRotationPoint(157.0F, -32.5F, 6.0F);
/*     */     
/* 421 */     this.gunModel[98].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 422 */     this.gunModel[98].setRotationPoint(157.0F, -32.5F, 1.0F);
/*     */     
/* 424 */     this.gunModel[99].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 425 */     this.gunModel[99].setRotationPoint(157.0F, -32.5F, 2.0F);
/*     */     
/* 427 */     this.gunModel[100].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 428 */     this.gunModel[100].setRotationPoint(157.0F, -33.5F, 4.0F);
/*     */     
/* 430 */     this.gunModel[101].addShapeBox(49.0F, -3.0F, -3.65F, 4, 1, 2, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 431 */     this.gunModel[101].setRotationPoint(157.0F, -33.5F, 2.0F);
/*     */     
/* 433 */     this.gunModel[102].addShapeBox(49.0F, -3.0F, -3.65F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
/* 434 */     this.gunModel[102].setRotationPoint(158.0F, -30.5F, 3.65F);
/*     */     
/* 436 */     this.gunModel[103].addBox(49.0F, -3.0F, -3.65F, 25, 7, 2, 0.0F);
/* 437 */     this.gunModel[103].setRotationPoint(-32.0F, -23.0F, -1.0F);
/*     */     
/*     */ 
/* 440 */     this.ammoModel = new ModelRendererTurbo[68];
/* 441 */     this.ammoModel[0] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/* 442 */     this.ammoModel[1] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/* 443 */     this.ammoModel[2] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/* 444 */     this.ammoModel[3] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/* 445 */     this.ammoModel[4] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/* 446 */     this.ammoModel[5] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/* 447 */     this.ammoModel[6] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/* 448 */     this.ammoModel[7] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 449 */     this.ammoModel[8] = new ModelRendererTurbo(this, 33, 137, this.textureX, this.textureY);
/* 450 */     this.ammoModel[9] = new ModelRendererTurbo(this, 281, 137, this.textureX, this.textureY);
/* 451 */     this.ammoModel[10] = new ModelRendererTurbo(this, 313, 137, this.textureX, this.textureY);
/* 452 */     this.ammoModel[11] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/* 453 */     this.ammoModel[12] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 454 */     this.ammoModel[13] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/* 455 */     this.ammoModel[14] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/* 456 */     this.ammoModel[15] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 457 */     this.ammoModel[16] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/* 458 */     this.ammoModel[17] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/* 459 */     this.ammoModel[18] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/* 460 */     this.ammoModel[19] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 461 */     this.ammoModel[20] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 462 */     this.ammoModel[21] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/* 463 */     this.ammoModel[22] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/* 464 */     this.ammoModel[23] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/* 465 */     this.ammoModel[24] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/* 466 */     this.ammoModel[25] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/* 467 */     this.ammoModel[26] = new ModelRendererTurbo(this, 329, 89, this.textureX, this.textureY);
/* 468 */     this.ammoModel[27] = new ModelRendererTurbo(this, 505, 89, this.textureX, this.textureY);
/* 469 */     this.ammoModel[28] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/* 470 */     this.ammoModel[29] = new ModelRendererTurbo(this, 57, 97, this.textureX, this.textureY);
/* 471 */     this.ammoModel[30] = new ModelRendererTurbo(this, 65, 97, this.textureX, this.textureY);
/* 472 */     this.ammoModel[31] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/* 473 */     this.ammoModel[32] = new ModelRendererTurbo(this, 393, 97, this.textureX, this.textureY);
/* 474 */     this.ammoModel[33] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/* 475 */     this.ammoModel[34] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/* 476 */     this.ammoModel[35] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/* 477 */     this.ammoModel[36] = new ModelRendererTurbo(this, 433, 97, this.textureX, this.textureY);
/* 478 */     this.ammoModel[37] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/* 479 */     this.ammoModel[38] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/* 480 */     this.ammoModel[39] = new ModelRendererTurbo(this, 177, 105, this.textureX, this.textureY);
/* 481 */     this.ammoModel[40] = new ModelRendererTurbo(this, 457, 105, this.textureX, this.textureY);
/* 482 */     this.ammoModel[41] = new ModelRendererTurbo(this, 505, 105, this.textureX, this.textureY);
/* 483 */     this.ammoModel[42] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/* 484 */     this.ammoModel[43] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/* 485 */     this.ammoModel[44] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/* 486 */     this.ammoModel[45] = new ModelRendererTurbo(this, 145, 129, this.textureX, this.textureY);
/* 487 */     this.ammoModel[46] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/* 488 */     this.ammoModel[47] = new ModelRendererTurbo(this, 497, 113, this.textureX, this.textureY);
/* 489 */     this.ammoModel[48] = new ModelRendererTurbo(this, 177, 129, this.textureX, this.textureY);
/* 490 */     this.ammoModel[49] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/* 491 */     this.ammoModel[50] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/* 492 */     this.ammoModel[51] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/* 493 */     this.ammoModel[52] = new ModelRendererTurbo(this, 193, 129, this.textureX, this.textureY);
/* 494 */     this.ammoModel[53] = new ModelRendererTurbo(this, 217, 129, this.textureX, this.textureY);
/* 495 */     this.ammoModel[54] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/* 496 */     this.ammoModel[55] = new ModelRendererTurbo(this, 497, 129, this.textureX, this.textureY);
/* 497 */     this.ammoModel[56] = new ModelRendererTurbo(this, 345, 137, this.textureX, this.textureY);
/* 498 */     this.ammoModel[57] = new ModelRendererTurbo(this, 177, 137, this.textureX, this.textureY);
/* 499 */     this.ammoModel[58] = new ModelRendererTurbo(this, 217, 137, this.textureX, this.textureY);
/* 500 */     this.ammoModel[59] = new ModelRendererTurbo(this, 369, 137, this.textureX, this.textureY);
/* 501 */     this.ammoModel[60] = new ModelRendererTurbo(this, 393, 137, this.textureX, this.textureY);
/* 502 */     this.ammoModel[61] = new ModelRendererTurbo(this, 409, 137, this.textureX, this.textureY);
/* 503 */     this.ammoModel[62] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/* 504 */     this.ammoModel[63] = new ModelRendererTurbo(this, 441, 137, this.textureX, this.textureY);
/* 505 */     this.ammoModel[64] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/* 506 */     this.ammoModel[65] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/* 507 */     this.ammoModel[66] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/* 508 */     this.ammoModel[67] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/*     */     
/* 510 */     this.ammoModel[0].addShapeBox(49.0F, -3.0F, -3.65F, 13, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 511 */     this.ammoModel[0].setRotationPoint(-30.0F, -25.0F, 2.0F);
/*     */     
/* 513 */     this.ammoModel[1].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 514 */     this.ammoModel[1].setRotationPoint(-30.0F, -26.0F, 2.0F);
/*     */     
/* 516 */     this.ammoModel[2].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 517 */     this.ammoModel[2].setRotationPoint(-30.0F, -23.0F, 2.0F);
/*     */     
/* 519 */     this.ammoModel[3].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 520 */     this.ammoModel[3].setRotationPoint(-30.0F, -27.0F, 3.0F);
/*     */     
/* 522 */     this.ammoModel[4].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 523 */     this.ammoModel[4].setRotationPoint(-30.0F, -27.0F, 4.0F);
/*     */     
/* 525 */     this.ammoModel[5].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 526 */     this.ammoModel[5].setRotationPoint(-30.0F, -22.0F, 3.0F);
/*     */     
/* 528 */     this.ammoModel[6].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 529 */     this.ammoModel[6].setRotationPoint(-30.0F, -22.0F, 4.0F);
/*     */     
/* 531 */     this.ammoModel[7].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 532 */     this.ammoModel[7].setRotationPoint(-30.0F, -25.0F, 1.0F);
/*     */     
/* 534 */     this.ammoModel[8].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 535 */     this.ammoModel[8].setRotationPoint(-30.0F, -24.0F, 1.0F);
/*     */     
/* 537 */     this.ammoModel[9].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 538 */     this.ammoModel[9].setRotationPoint(-30.0F, -25.0F, 6.0F);
/*     */     
/* 540 */     this.ammoModel[10].addShapeBox(49.0F, -3.0F, -3.65F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 541 */     this.ammoModel[10].setRotationPoint(-30.0F, -24.0F, 6.0F);
/*     */     
/* 543 */     this.ammoModel[11].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 544 */     this.ammoModel[11].setRotationPoint(-32.0F, -26.0F, 2.0F);
/*     */     
/* 546 */     this.ammoModel[12].addShapeBox(49.0F, -3.0F, -3.65F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 547 */     this.ammoModel[12].setRotationPoint(-32.0F, -25.0F, 2.0F);
/*     */     
/* 549 */     this.ammoModel[13].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 550 */     this.ammoModel[13].setRotationPoint(-32.0F, -22.0F, 4.0F);
/*     */     
/* 552 */     this.ammoModel[14].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 553 */     this.ammoModel[14].setRotationPoint(-32.0F, -23.0F, 2.0F);
/*     */     
/* 555 */     this.ammoModel[15].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 556 */     this.ammoModel[15].setRotationPoint(-32.0F, -22.0F, 3.0F);
/*     */     
/* 558 */     this.ammoModel[16].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 559 */     this.ammoModel[16].setRotationPoint(-32.0F, -25.0F, 1.0F);
/*     */     
/* 561 */     this.ammoModel[17].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 562 */     this.ammoModel[17].setRotationPoint(-32.0F, -24.0F, 1.0F);
/*     */     
/* 564 */     this.ammoModel[18].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 565 */     this.ammoModel[18].setRotationPoint(-32.0F, -25.0F, 6.0F);
/*     */     
/* 567 */     this.ammoModel[19].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 568 */     this.ammoModel[19].setRotationPoint(-32.0F, -24.0F, 6.0F);
/*     */     
/* 570 */     this.ammoModel[20].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 571 */     this.ammoModel[20].setRotationPoint(-32.0F, -27.0F, 4.0F);
/*     */     
/* 573 */     this.ammoModel[21].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 574 */     this.ammoModel[21].setRotationPoint(-32.0F, -27.0F, 3.0F);
/*     */     
/* 576 */     this.ammoModel[22].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 4, 0.0F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 577 */     this.ammoModel[22].setRotationPoint(-31.0F, -26.0F, 2.0F);
/*     */     
/* 579 */     this.ammoModel[23].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 580 */     this.ammoModel[23].setRotationPoint(-31.0F, -26.75F, 3.0F);
/*     */     
/* 582 */     this.ammoModel[24].addShapeBox(49.0F, -3.0F, -3.65F, 1, 2, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 583 */     this.ammoModel[24].setRotationPoint(-31.0F, -25.0F, 2.0F);
/*     */     
/* 585 */     this.ammoModel[25].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 586 */     this.ammoModel[25].setRotationPoint(-31.0F, -25.0F, 1.25F);
/*     */     
/* 588 */     this.ammoModel[26].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 589 */     this.ammoModel[26].setRotationPoint(-31.0F, -24.0F, 1.25F);
/*     */     
/* 591 */     this.ammoModel[27].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 592 */     this.ammoModel[27].setRotationPoint(-31.0F, -25.0F, 5.75F);
/*     */     
/* 594 */     this.ammoModel[28].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 595 */     this.ammoModel[28].setRotationPoint(-31.0F, -24.0F, 5.75F);
/*     */     
/* 597 */     this.ammoModel[29].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F);
/* 598 */     this.ammoModel[29].setRotationPoint(-31.0F, -23.0F, 2.0F);
/*     */     
/* 600 */     this.ammoModel[30].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 601 */     this.ammoModel[30].setRotationPoint(-31.0F, -26.75F, 4.0F);
/*     */     
/* 603 */     this.ammoModel[31].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 604 */     this.ammoModel[31].setRotationPoint(-31.0F, -22.25F, 3.0F);
/*     */     
/* 606 */     this.ammoModel[32].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 607 */     this.ammoModel[32].setRotationPoint(-31.0F, -22.25F, 4.0F);
/*     */     
/* 609 */     this.ammoModel[33].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 610 */     this.ammoModel[33].setRotationPoint(-17.0F, -26.0F, 2.0F);
/*     */     
/* 612 */     this.ammoModel[34].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 613 */     this.ammoModel[34].setRotationPoint(-17.0F, -23.0F, 2.0F);
/*     */     
/* 615 */     this.ammoModel[35].addShapeBox(49.0F, -3.0F, -3.65F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 616 */     this.ammoModel[35].setRotationPoint(-17.0F, -25.0F, 2.0F);
/*     */     
/* 618 */     this.ammoModel[36].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F);
/* 619 */     this.ammoModel[36].setRotationPoint(-17.0F, -25.0F, 6.0F);
/*     */     
/* 621 */     this.ammoModel[37].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F);
/* 622 */     this.ammoModel[37].setRotationPoint(-17.0F, -24.0F, 6.0F);
/*     */     
/* 624 */     this.ammoModel[38].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F);
/* 625 */     this.ammoModel[38].setRotationPoint(-17.0F, -24.0F, 1.0F);
/*     */     
/* 627 */     this.ammoModel[39].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F);
/* 628 */     this.ammoModel[39].setRotationPoint(-17.0F, -25.0F, 1.0F);
/*     */     
/* 630 */     this.ammoModel[40].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 631 */     this.ammoModel[40].setRotationPoint(-17.0F, -27.0F, 4.0F);
/*     */     
/* 633 */     this.ammoModel[41].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 634 */     this.ammoModel[41].setRotationPoint(-17.0F, -27.0F, 3.0F);
/*     */     
/* 636 */     this.ammoModel[42].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 637 */     this.ammoModel[42].setRotationPoint(-17.0F, -22.0F, 4.0F);
/*     */     
/* 639 */     this.ammoModel[43].addShapeBox(49.0F, -3.0F, -3.65F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 640 */     this.ammoModel[43].setRotationPoint(-17.0F, -22.0F, 3.0F);
/*     */     
/* 642 */     this.ammoModel[44].addShapeBox(49.0F, -3.0F, -3.65F, 3, 2, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 643 */     this.ammoModel[44].setRotationPoint(-16.0F, -25.0F, 2.0F);
/*     */     
/* 645 */     this.ammoModel[45].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 646 */     this.ammoModel[45].setRotationPoint(-16.0F, -26.0F, 2.0F);
/*     */     
/* 648 */     this.ammoModel[46].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 649 */     this.ammoModel[46].setRotationPoint(-16.0F, -27.0F, 4.0F);
/*     */     
/* 651 */     this.ammoModel[47].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 652 */     this.ammoModel[47].setRotationPoint(-16.0F, -27.0F, 3.0F);
/*     */     
/* 654 */     this.ammoModel[48].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 655 */     this.ammoModel[48].setRotationPoint(-16.0F, -23.0F, 2.0F);
/*     */     
/* 657 */     this.ammoModel[49].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 658 */     this.ammoModel[49].setRotationPoint(-16.0F, -24.0F, 1.0F);
/*     */     
/* 660 */     this.ammoModel[50].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 661 */     this.ammoModel[50].setRotationPoint(-16.0F, -25.0F, 1.0F);
/*     */     
/* 663 */     this.ammoModel[51].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 664 */     this.ammoModel[51].setRotationPoint(-16.0F, -25.0F, 6.0F);
/*     */     
/* 666 */     this.ammoModel[52].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 667 */     this.ammoModel[52].setRotationPoint(-16.0F, -24.0F, 6.0F);
/*     */     
/* 669 */     this.ammoModel[53].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 670 */     this.ammoModel[53].setRotationPoint(-16.0F, -22.0F, 3.0F);
/*     */     
/* 672 */     this.ammoModel[54].addShapeBox(49.0F, -3.0F, -3.65F, 3, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 673 */     this.ammoModel[54].setRotationPoint(-16.0F, -22.0F, 4.0F);
/*     */     
/* 675 */     this.ammoModel[55].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, -0.125F, 0.5F, 0.0F, -1.0F, 1.875F, 0.0F, -1.0F, -2.875F, 0.0F, -0.125F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.875F, 0.0F, 0.0F, -2.87F, 0.0F, 0.0F, -1.37F);
/* 676 */     this.ammoModel[55].setRotationPoint(-13.0F, -25.0F, 5.88F);
/*     */     
/* 678 */     this.ammoModel[56].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 4, 0.0F, 0.0F, -0.5F, -1.125F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -0.5F, -1.125F, 0.0F, 0.125F, -0.625F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.125F, -0.625F);
/* 679 */     this.ammoModel[56].setRotationPoint(-13.0F, -26.0F, 2.0F);
/*     */     
/* 681 */     this.ammoModel[57].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, -1.5F, -0.125F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.375F, 0.0F, 0.0F, 0.5F, -0.125F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 682 */     this.ammoModel[57].setRotationPoint(-13.0F, -27.0F, 3.0F);
/*     */     
/* 684 */     this.ammoModel[58].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.875F, 0.0F, 0.0F, -2.87F, 0.0F, 0.0F, -1.37F, 0.0F, -0.125F, 0.5F, 0.0F, -1.0F, 1.875F, 0.0F, -1.0F, -2.875F, 0.0F, -0.125F, -1.5F);
/* 685 */     this.ammoModel[58].setRotationPoint(-13.0F, -24.0F, 5.88F);
/*     */     
/* 687 */     this.ammoModel[59].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 4, 0.0F, 0.0F, 0.125F, -0.625F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.125F, -0.625F, 0.0F, -0.5F, -1.125F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -0.5F, -1.125F);
/* 688 */     this.ammoModel[59].setRotationPoint(-13.0F, -23.0F, 2.0F);
/*     */     
/* 690 */     this.ammoModel[60].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.5F, -0.125F, 0.0F, -1.375F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -1.5F, -0.125F);
/* 691 */     this.ammoModel[60].setRotationPoint(-13.0F, -22.0F, 4.0F);
/*     */     
/* 693 */     this.ammoModel[61].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, 0.5F, -0.125F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, -0.125F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.375F, 0.0F);
/* 694 */     this.ammoModel[61].setRotationPoint(-13.0F, -22.0F, 3.0F);
/*     */     
/* 696 */     this.ammoModel[62].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, -0.125F, -1.5F, 0.0F, -1.0F, -2.875F, 0.0F, -1.0F, 1.875F, 0.0F, -0.125F, 0.5F, 0.0F, 0.0F, -1.37F, 0.0F, 0.0F, -2.87F, 0.0F, 0.0F, 1.875F, 0.0F, 0.0F, 0.5F);
/* 697 */     this.ammoModel[62].setRotationPoint(-13.0F, -25.0F, 1.12F);
/*     */     
/* 699 */     this.ammoModel[63].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -1.37F, 0.0F, 0.0F, -2.87F, 0.0F, 0.0F, 1.875F, 0.0F, 0.0F, 0.5F, 0.0F, -0.125F, -1.5F, 0.0F, -1.0F, -2.875F, 0.0F, -1.0F, 1.875F, 0.0F, -0.125F, 0.5F);
/* 700 */     this.ammoModel[63].setRotationPoint(-13.0F, -24.0F, 1.12F);
/*     */     
/* 702 */     this.ammoModel[64].addShapeBox(49.0F, -3.0F, -3.65F, 6, 1, 1, 0.0F, 0.0F, -1.375F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -1.5F, -0.125F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.5F, -0.125F);
/* 703 */     this.ammoModel[64].setRotationPoint(-13.0F, -27.0F, 4.0F);
/*     */     
/* 705 */     this.ammoModel[65].addShapeBox(49.0F, -3.0F, -3.65F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 706 */     this.ammoModel[65].setRotationPoint(-32.0F, -25.0F, 5.0F);
/*     */     
/* 708 */     this.ammoModel[66].addShapeBox(49.0F, -3.0F, -3.65F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 709 */     this.ammoModel[66].setRotationPoint(-32.0F, -25.0F, 3.0F);
/*     */     
/* 711 */     this.ammoModel[67].addShapeBox(49.0F, -3.0F, -3.65F, 1, 2, 2, 0.0F, -0.5F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F);
/* 712 */     this.ammoModel[67].setRotationPoint(-32.5F, -25.0F, 3.0F);
/*     */     
/*     */ 
/* 715 */     this.pumpModel = new ModelRendererTurbo[29];
/* 716 */     this.pumpModel[0] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/* 717 */     this.pumpModel[1] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 718 */     this.pumpModel[2] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 719 */     this.pumpModel[3] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/* 720 */     this.pumpModel[4] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/* 721 */     this.pumpModel[5] = new ModelRendererTurbo(this, 329, 49, this.textureX, this.textureY);
/* 722 */     this.pumpModel[6] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 723 */     this.pumpModel[7] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/* 724 */     this.pumpModel[8] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/* 725 */     this.pumpModel[9] = new ModelRendererTurbo(this, 185, 89, this.textureX, this.textureY);
/* 726 */     this.pumpModel[10] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 727 */     this.pumpModel[11] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/* 728 */     this.pumpModel[12] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/* 729 */     this.pumpModel[13] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/* 730 */     this.pumpModel[14] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/* 731 */     this.pumpModel[15] = new ModelRendererTurbo(this, 17, 97, this.textureX, this.textureY);
/* 732 */     this.pumpModel[16] = new ModelRendererTurbo(this, 33, 97, this.textureX, this.textureY);
/* 733 */     this.pumpModel[17] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/* 734 */     this.pumpModel[18] = new ModelRendererTurbo(this, 57, 145, this.textureX, this.textureY);
/* 735 */     this.pumpModel[19] = new ModelRendererTurbo(this, 113, 145, this.textureX, this.textureY);
/* 736 */     this.pumpModel[20] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/* 737 */     this.pumpModel[21] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/* 738 */     this.pumpModel[22] = new ModelRendererTurbo(this, 281, 145, this.textureX, this.textureY);
/* 739 */     this.pumpModel[23] = new ModelRendererTurbo(this, 281, 145, this.textureX, this.textureY);
/* 740 */     this.pumpModel[24] = new ModelRendererTurbo(this, 225, 145, this.textureX, this.textureY);
/* 741 */     this.pumpModel[25] = new ModelRendererTurbo(this, 169, 145, this.textureX, this.textureY);
/* 742 */     this.pumpModel[26] = new ModelRendererTurbo(this, 57, 145, this.textureX, this.textureY);
/* 743 */     this.pumpModel[27] = new ModelRendererTurbo(this, 113, 145, this.textureX, this.textureY);
/* 744 */     this.pumpModel[28] = new ModelRendererTurbo(this, 57, 145, this.textureX, this.textureY);
/*     */     
/* 746 */     this.pumpModel[0].addBox(49.0F, -3.0F, -3.65F, 8, 5, 3, 0.0F);
/* 747 */     this.pumpModel[0].setRotationPoint(-48.0F, -28.0F, 2.5F);
/*     */     
/* 749 */     this.pumpModel[1].addShapeBox(49.0F, -3.0F, -3.65F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 750 */     this.pumpModel[1].setRotationPoint(-42.0F, -27.0F, 0.5F);
/*     */     
/* 752 */     this.pumpModel[2].addShapeBox(49.0F, -3.0F, -3.65F, 2, 5, 5, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 753 */     this.pumpModel[2].setRotationPoint(-42.0F, -26.5F, -4.5F);
/*     */     
/* 755 */     this.pumpModel[3].addShapeBox(49.0F, -3.0F, -3.65F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 756 */     this.pumpModel[3].setRotationPoint(-42.5F, -20.0F, -7.5F);
/*     */     
/* 758 */     this.pumpModel[4].addShapeBox(49.0F, -3.0F, -3.65F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 759 */     this.pumpModel[4].setRotationPoint(-48.0F, -28.0F, 1.5F);
/*     */     
/* 761 */     this.pumpModel[5].addShapeBox(49.0F, -3.0F, -3.65F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 762 */     this.pumpModel[5].setRotationPoint(-48.0F, -28.0F, 5.5F);
/*     */     
/* 764 */     this.pumpModel[6].addShapeBox(49.0F, -3.0F, -3.65F, 8, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 765 */     this.pumpModel[6].setRotationPoint(-48.0F, -27.0F, 5.5F);
/*     */     
/* 767 */     this.pumpModel[7].addShapeBox(49.0F, -3.0F, -3.65F, 8, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 768 */     this.pumpModel[7].setRotationPoint(-48.0F, -27.0F, 1.5F);
/*     */     
/* 770 */     this.pumpModel[8].addShapeBox(49.0F, -3.0F, -3.65F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 771 */     this.pumpModel[8].setRotationPoint(-48.0F, -24.0F, 1.5F);
/*     */     
/* 773 */     this.pumpModel[9].addShapeBox(49.0F, -3.0F, -3.65F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 774 */     this.pumpModel[9].setRotationPoint(-48.0F, -24.0F, 5.5F);
/*     */     
/* 776 */     this.pumpModel[10].addShapeBox(49.0F, -3.0F, -3.65F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 777 */     this.pumpModel[10].setRotationPoint(-43.0F, -28.5F, 5.5F);
/*     */     
/* 779 */     this.pumpModel[11].addShapeBox(49.0F, -3.0F, -3.65F, 1, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 780 */     this.pumpModel[11].setRotationPoint(-43.0F, -28.5F, 2.5F);
/*     */     
/* 782 */     this.pumpModel[12].addShapeBox(49.0F, -3.0F, -3.65F, 1, 6, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 783 */     this.pumpModel[12].setRotationPoint(-43.0F, -28.5F, 1.0F);
/*     */     
/* 785 */     this.pumpModel[13].addShapeBox(49.0F, -3.0F, -3.65F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 786 */     this.pumpModel[13].setRotationPoint(-48.0F, -29.0F, 3.5F);
/*     */     
/* 788 */     this.pumpModel[14].addBox(49.0F, -3.0F, -3.65F, 1, 2, 2, 0.0F);
/* 789 */     this.pumpModel[14].setRotationPoint(-49.0F, -26.5F, 3.0F);
/*     */     
/* 791 */     this.pumpModel[15].addShapeBox(49.0F, -3.0F, -3.65F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 792 */     this.pumpModel[15].setRotationPoint(-48.0F, -26.0F, 0.5F);
/*     */     
/* 794 */     this.pumpModel[16].addShapeBox(49.0F, -3.0F, -3.65F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 795 */     this.pumpModel[16].setRotationPoint(-48.0F, -26.0F, 6.0F);
/*     */     
/* 797 */     this.pumpModel[17].addShapeBox(49.0F, -3.0F, -3.65F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F);
/* 798 */     this.pumpModel[17].setRotationPoint(-47.5F, -29.0F, 0.5F);
/*     */     
/* 800 */     this.pumpModel[18].addBox(49.0F, -3.0F, -3.65F, 25, 2, 1, 0.0F);
/* 801 */     this.pumpModel[18].setRotationPoint(-32.0F, -25.0F, 1.0F);
/*     */     
/* 803 */     this.pumpModel[19].addBox(49.0F, -3.0F, -3.65F, 25, 2, 1, 0.0F);
/* 804 */     this.pumpModel[19].setRotationPoint(-32.0F, -25.0F, 6.0F);
/*     */     
/* 806 */     this.pumpModel[20].addShapeBox(49.0F, -3.0F, -3.65F, 25, 2, 1, 0.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 807 */     this.pumpModel[20].setRotationPoint(-32.0F, -27.0F, 6.0F);
/*     */     
/* 809 */     this.pumpModel[21].addShapeBox(49.0F, -3.0F, -3.65F, 25, 2, 1, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 810 */     this.pumpModel[21].setRotationPoint(-32.0F, -27.0F, 1.0F);
/*     */     
/* 812 */     this.pumpModel[22].addShapeBox(49.0F, -3.0F, -3.65F, 25, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F);
/* 813 */     this.pumpModel[22].setRotationPoint(-32.0F, -27.5F, 3.0F);
/*     */     
/* 815 */     this.pumpModel[23].addShapeBox(49.0F, -3.0F, -3.65F, 8, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F);
/* 816 */     this.pumpModel[23].setRotationPoint(-40.0F, -27.5F, 3.0F);
/*     */     
/* 818 */     this.pumpModel[24].addShapeBox(49.0F, -3.0F, -3.65F, 8, 2, 1, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 819 */     this.pumpModel[24].setRotationPoint(-40.0F, -27.0F, 1.0F);
/*     */     
/* 821 */     this.pumpModel[25].addShapeBox(49.0F, -3.0F, -3.65F, 8, 2, 1, 0.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 822 */     this.pumpModel[25].setRotationPoint(-40.0F, -27.0F, 6.0F);
/*     */     
/* 824 */     this.pumpModel[26].addShapeBox(49.0F, -3.0F, -3.65F, 8, 2, 1, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
/* 825 */     this.pumpModel[26].setRotationPoint(-40.0F, -25.0F, 1.0F);
/*     */     
/* 827 */     this.pumpModel[27].addShapeBox(49.0F, -3.0F, -3.65F, 8, 2, 1, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
/* 828 */     this.pumpModel[27].setRotationPoint(-40.0F, -25.0F, 6.0F);
/*     */     
/* 830 */     this.pumpModel[28].addBox(49.0F, -3.0F, -3.65F, 8, 2, 1, 0.0F);
/* 831 */     this.pumpModel[28].setRotationPoint(-40.0F, -25.0F, 1.0F);
/*     */     
/*     */ 
/*     */ 
/* 835 */     translateAll(0.0F, -23.0F, 0.0F);
/* 836 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 838 */     this.gunSlideDistance = 0.0F;
/* 839 */     this.animationType = EnumAnimationType.RIFLE_TOP;this.gunSlideDistance = 1.0F;
/* 840 */     this.pumpDelayAfterReload = 1;
/* 841 */     this.pumpDelay = 11;
/* 842 */     this.pumpTime = 36;
/* 843 */     this.animationType = EnumAnimationType.RIFLE_TOP;
/*     */     
/* 845 */     this.numBulletsInReloadAnimation = 5.0F;
/* 846 */     this.tiltGunTime = 0.25F;
/* 847 */     this.unloadClipTime = 0.0F;
/* 848 */     this.loadClipTime = 0.6F;
/* 849 */     this.untiltGunTime = 0.5F;this.pumpHandleDistance = 1.0F;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 856 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelkar98k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */