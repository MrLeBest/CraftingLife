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
/*     */ public class Modelm16lmg
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm16lmg()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[105];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/* 118 */     this.gunModel[96] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/* 119 */     this.gunModel[97] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/* 120 */     this.gunModel[98] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/* 121 */     this.gunModel[99] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/* 122 */     this.gunModel[100] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/* 123 */     this.gunModel[101] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/* 124 */     this.gunModel[102] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/* 125 */     this.gunModel[103] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/* 126 */     this.gunModel[104] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*     */     
/* 128 */     this.gunModel[0].addShapeBox(0.0F, -4.0F, -1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 129 */     this.gunModel[0].setRotationPoint(0.0F, -1.0F, 0.0F);
/*     */     
/* 131 */     this.gunModel[1].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 132 */     this.gunModel[1].setRotationPoint(4.0F, 1.0F, 0.0F);
/*     */     
/* 134 */     this.gunModel[2].addShapeBox(0.0F, -4.0F, -1.0F, 5, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 135 */     this.gunModel[2].setRotationPoint(6.0F, -5.0F, 0.0F);
/*     */     
/* 137 */     this.gunModel[3].addShapeBox(0.0F, -4.0F, -1.0F, 8, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 138 */     this.gunModel[3].setRotationPoint(-2.0F, -5.0F, 0.0F);
/*     */     
/* 140 */     this.gunModel[4].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 141 */     this.gunModel[4].setRotationPoint(-1.0F, -1.0F, 0.0F);
/*     */     
/* 143 */     this.gunModel[5].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 144 */     this.gunModel[5].setRotationPoint(-2.0F, -1.0F, 0.0F);
/*     */     
/* 146 */     this.gunModel[6].addShapeBox(0.0F, -4.0F, -1.0F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 147 */     this.gunModel[6].setRotationPoint(-1.0F, -2.5F, 2.0F);
/*     */     
/* 149 */     this.gunModel[7].addShapeBox(0.0F, -4.0F, -1.0F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 150 */     this.gunModel[7].setRotationPoint(-1.0F, -3.5F, 2.0F);
/*     */     
/* 152 */     this.gunModel[8].addShapeBox(0.0F, -4.0F, -1.0F, 13, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 153 */     this.gunModel[8].setRotationPoint(-1.0F, -4.5F, 2.0F);
/*     */     
/* 155 */     this.gunModel[9].addShapeBox(0.0F, -4.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 156 */     this.gunModel[9].setRotationPoint(2.0F, -3.5F, -1.0F);
/*     */     
/* 158 */     this.gunModel[10].addShapeBox(0.0F, -4.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 159 */     this.gunModel[10].setRotationPoint(2.0F, -4.5F, -1.0F);
/*     */     
/* 161 */     this.gunModel[11].addShapeBox(0.0F, -4.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 162 */     this.gunModel[11].setRotationPoint(2.0F, -2.5F, -1.0F);
/*     */     
/* 164 */     this.gunModel[12].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 165 */     this.gunModel[12].setRotationPoint(12.0F, -2.25F, -0.75F);
/*     */     
/* 167 */     this.gunModel[13].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 168 */     this.gunModel[13].setRotationPoint(12.0F, -3.75F, -0.75F);
/*     */     
/* 170 */     this.gunModel[14].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 171 */     this.gunModel[14].setRotationPoint(12.0F, -4.75F, -0.75F);
/*     */     
/* 173 */     this.gunModel[15].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 174 */     this.gunModel[15].setRotationPoint(12.0F, -2.25F, 1.75F);
/*     */     
/* 176 */     this.gunModel[16].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 177 */     this.gunModel[16].setRotationPoint(12.0F, -4.75F, 1.75F);
/*     */     
/* 179 */     this.gunModel[17].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 180 */     this.gunModel[17].setRotationPoint(12.0F, -4.25F, 0.25F);
/*     */     
/* 182 */     this.gunModel[18].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 2, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 183 */     this.gunModel[18].setRotationPoint(-1.0F, -6.0F, 0.0F);
/*     */     
/* 185 */     this.gunModel[19].addShapeBox(0.0F, -4.0F, -1.0F, 18, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 186 */     this.gunModel[19].setRotationPoint(13.0F, -4.75F, 0.0F);
/*     */     
/* 188 */     this.gunModel[20].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 189 */     this.gunModel[20].setRotationPoint(12.0F, -3.75F, 1.25F);
/*     */     
/* 191 */     this.gunModel[21].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 192 */     this.gunModel[21].setRotationPoint(31.0F, -3.25F, 0.75F);
/*     */     
/* 194 */     this.gunModel[22].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, -1.0F, 1.0F, 0.5F, 0.5F, 1.0F, 0.5F, 0.5F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 195 */     this.gunModel[22].setRotationPoint(31.0F, -5.75F, 0.75F);
/*     */     
/* 197 */     this.gunModel[23].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 1.0F, 0.5F, -0.5F, 1.0F, 0.5F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 198 */     this.gunModel[23].setRotationPoint(32.5F, -5.75F, 0.75F);
/*     */     
/* 200 */     this.gunModel[24].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 201 */     this.gunModel[24].setRotationPoint(32.0F, -7.75F, -0.5F);
/*     */     
/* 203 */     this.gunModel[25].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 204 */     this.gunModel[25].setRotationPoint(32.0F, -7.75F, 0.75F);
/*     */     
/* 206 */     this.gunModel[26].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.35F, -0.75F, 0.0F, 0.35F, -0.75F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 207 */     this.gunModel[26].setRotationPoint(32.0F, -7.75F, 0.1F);
/*     */     
/* 209 */     this.gunModel[27].addShapeBox(0.0F, -4.0F, -1.0F, 18, 2, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 210 */     this.gunModel[27].setRotationPoint(-20.0F, -4.0F, 0.0F);
/*     */     
/* 212 */     this.gunModel[28].addShapeBox(0.0F, -4.0F, -1.0F, 18, 4, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.05F, 0.0F, -3.0F, -0.05F, 0.0F, -3.0F, -0.05F, 0.0F, 0.0F, -0.05F);
/* 213 */     this.gunModel[28].setRotationPoint(-20.0F, -1.5F, 0.0F);
/*     */     
/* 215 */     this.gunModel[29].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[29].setRotationPoint(3.0F, -1.0F, 0.0F);
/*     */     
/* 218 */     this.gunModel[30].addShapeBox(0.0F, -4.0F, -1.0F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 219 */     this.gunModel[30].setRotationPoint(-2.0F, -2.0F, 0.0F);
/*     */     
/* 221 */     this.gunModel[31].addShapeBox(0.0F, -4.0F, -1.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 222 */     this.gunModel[31].setRotationPoint(11.0F, -5.0F, 0.0F);
/*     */     
/* 224 */     this.gunModel[32].addShapeBox(0.0F, -4.0F, -1.0F, 5, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 225 */     this.gunModel[32].setRotationPoint(-2.0F, 2.0F, 0.0F);
/*     */     
/* 227 */     this.gunModel[33].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 228 */     this.gunModel[33].setRotationPoint(3.0F, 1.0F, 0.0F);
/*     */     
/* 230 */     this.gunModel[34].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 231 */     this.gunModel[34].setRotationPoint(3.0F, 0.0F, 0.0F);
/*     */     
/* 233 */     this.gunModel[35].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 234 */     this.gunModel[35].setRotationPoint(-2.0F, -3.5F, 2.0F);
/*     */     
/* 236 */     this.gunModel[36].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 237 */     this.gunModel[36].setRotationPoint(-2.0F, -4.5F, 2.0F);
/*     */     
/* 239 */     this.gunModel[37].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F);
/* 240 */     this.gunModel[37].setRotationPoint(-2.0F, -2.5F, 2.0F);
/*     */     
/* 242 */     this.gunModel[38].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 243 */     this.gunModel[38].setRotationPoint(3.5F, -0.5F, 0.5F);
/*     */     
/* 245 */     this.gunModel[39].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 246 */     this.gunModel[39].setRotationPoint(14.0F, -5.75F, 2.0F);
/*     */     
/* 248 */     this.gunModel[40].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 249 */     this.gunModel[40].setRotationPoint(25.0F, -5.75F, 2.0F);
/*     */     
/* 251 */     this.gunModel[41].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 252 */     this.gunModel[41].setRotationPoint(14.0F, -3.75F, 2.0F);
/*     */     
/* 254 */     this.gunModel[42].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 255 */     this.gunModel[42].setRotationPoint(14.0F, -1.75F, 2.0F);
/*     */     
/* 257 */     this.gunModel[43].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 258 */     this.gunModel[43].setRotationPoint(13.0F, -5.75F, 2.0F);
/*     */     
/* 260 */     this.gunModel[44].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 261 */     this.gunModel[44].setRotationPoint(23.0F, -5.75F, 2.0F);
/*     */     
/* 263 */     this.gunModel[45].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 264 */     this.gunModel[45].setRotationPoint(23.0F, -5.75F, -1.0F);
/*     */     
/* 266 */     this.gunModel[46].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 267 */     this.gunModel[46].setRotationPoint(14.0F, -5.75F, -1.0F);
/*     */     
/* 269 */     this.gunModel[47].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 270 */     this.gunModel[47].setRotationPoint(14.0F, -3.75F, -1.0F);
/*     */     
/* 272 */     this.gunModel[48].addShapeBox(0.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 273 */     this.gunModel[48].setRotationPoint(14.0F, -1.75F, -1.0F);
/*     */     
/* 275 */     this.gunModel[49].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 276 */     this.gunModel[49].setRotationPoint(13.0F, -5.75F, -1.0F);
/*     */     
/* 278 */     this.gunModel[50].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 279 */     this.gunModel[50].setRotationPoint(24.0F, -5.75F, 2.0F);
/*     */     
/* 281 */     this.gunModel[51].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 282 */     this.gunModel[51].setRotationPoint(30.0F, -5.75F, 2.0F);
/*     */     
/* 284 */     this.gunModel[52].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 285 */     this.gunModel[52].setRotationPoint(25.0F, -3.75F, 2.0F);
/*     */     
/* 287 */     this.gunModel[53].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 288 */     this.gunModel[53].setRotationPoint(25.0F, -1.75F, 2.0F);
/*     */     
/* 290 */     this.gunModel[54].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 291 */     this.gunModel[54].setRotationPoint(24.0F, -5.75F, -0.5F);
/*     */     
/* 293 */     this.gunModel[55].addShapeBox(0.0F, -4.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 294 */     this.gunModel[55].setRotationPoint(30.0F, -5.75F, -0.5F);
/*     */     
/* 296 */     this.gunModel[56].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 297 */     this.gunModel[56].setRotationPoint(25.0F, -3.75F, -0.5F);
/*     */     
/* 299 */     this.gunModel[57].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 300 */     this.gunModel[57].setRotationPoint(25.0F, -1.75F, -0.5F);
/*     */     
/* 302 */     this.gunModel[58].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 303 */     this.gunModel[58].setRotationPoint(25.0F, -5.75F, -0.5F);
/*     */     
/* 305 */     this.gunModel[59].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 306 */     this.gunModel[59].setRotationPoint(13.0F, -5.75F, 0.0F);
/*     */     
/* 308 */     this.gunModel[60].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 309 */     this.gunModel[60].setRotationPoint(17.0F, -5.75F, 0.0F);
/*     */     
/* 311 */     this.gunModel[61].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 312 */     this.gunModel[61].setRotationPoint(21.0F, -5.75F, 0.0F);
/*     */     
/* 314 */     this.gunModel[62].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 315 */     this.gunModel[62].setRotationPoint(25.0F, -5.75F, 0.0F);
/*     */     
/* 317 */     this.gunModel[63].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 318 */     this.gunModel[63].setRotationPoint(29.0F, -5.75F, 0.0F);
/*     */     
/* 320 */     this.gunModel[64].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 321 */     this.gunModel[64].setRotationPoint(23.0F, -5.75F, 1.5F);
/*     */     
/* 323 */     this.gunModel[65].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 324 */     this.gunModel[65].setRotationPoint(27.0F, -5.75F, 1.5F);
/*     */     
/* 326 */     this.gunModel[66].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 327 */     this.gunModel[66].setRotationPoint(19.0F, -5.75F, 1.5F);
/*     */     
/* 329 */     this.gunModel[67].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 330 */     this.gunModel[67].setRotationPoint(15.0F, -5.75F, 1.5F);
/*     */     
/* 332 */     this.gunModel[68].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 333 */     this.gunModel[68].setRotationPoint(19.0F, -5.75F, 0.0F);
/*     */     
/* 335 */     this.gunModel[69].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 336 */     this.gunModel[69].setRotationPoint(15.0F, -5.75F, 0.0F);
/*     */     
/* 338 */     this.gunModel[70].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 339 */     this.gunModel[70].setRotationPoint(23.0F, -5.75F, 0.0F);
/*     */     
/* 341 */     this.gunModel[71].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 342 */     this.gunModel[71].setRotationPoint(27.0F, -5.75F, 0.0F);
/*     */     
/* 344 */     this.gunModel[72].addShapeBox(0.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 345 */     this.gunModel[72].setRotationPoint(19.0F, 0.25F, 0.0F);
/*     */     
/* 347 */     this.gunModel[73].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 348 */     this.gunModel[73].setRotationPoint(18.5F, -0.75F, -0.5F);
/*     */     
/* 350 */     this.gunModel[74].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 351 */     this.gunModel[74].setRotationPoint(18.5F, 4.25F, -0.5F);
/*     */     
/* 353 */     this.gunModel[75].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 354 */     this.gunModel[75].setRotationPoint(28.0F, -0.75F, 0.0F);
/*     */     
/* 356 */     this.gunModel[76].addShapeBox(0.0F, -4.0F, -1.0F, 1, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 357 */     this.gunModel[76].setRotationPoint(28.0F, 0.25F, 0.0F);
/*     */     
/* 359 */     this.gunModel[77].addShapeBox(0.0F, -4.0F, -1.0F, 1, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
/* 360 */     this.gunModel[77].setRotationPoint(28.0F, 0.25F, 1.0F);
/*     */     
/* 362 */     this.gunModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 363 */     this.gunModel[78].setRotationPoint(-1.5F, -9.5F, -0.5F);
/*     */     
/* 365 */     this.gunModel[79].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 366 */     this.gunModel[79].setRotationPoint(-2.25F, -9.5F, -0.5F);
/*     */     
/* 368 */     this.gunModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F);
/* 369 */     this.gunModel[80].setRotationPoint(-1.75F, -9.5F, 0.5F);
/*     */     
/* 371 */     this.gunModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 372 */     this.gunModel[81].setRotationPoint(-2.25F, -9.5F, 0.5F);
/*     */     
/* 374 */     this.gunModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 375 */     this.gunModel[82].setRotationPoint(-1.75F, -9.5F, -1.5F);
/*     */     
/* 377 */     this.gunModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 378 */     this.gunModel[83].setRotationPoint(-2.25F, -9.5F, -1.5F);
/*     */     
/* 380 */     this.gunModel[84].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 381 */     this.gunModel[84].setRotationPoint(-1.0F, -3.5F, -1.0F);
/*     */     
/* 383 */     this.gunModel[85].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 384 */     this.gunModel[85].setRotationPoint(-1.0F, -4.5F, -1.0F);
/*     */     
/* 386 */     this.gunModel[86].addShapeBox(0.0F, -4.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.3F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 387 */     this.gunModel[86].setRotationPoint(-1.0F, -2.5F, -1.0F);
/*     */     
/* 389 */     this.gunModel[87].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/* 390 */     this.gunModel[87].setRotationPoint(-1.6F, -7.5F, -2.35F);
/* 391 */     this.gunModel[87].rotateAngleY = 0.27925268F;
/*     */     
/* 393 */     this.gunModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.8F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, -0.8F, 0.15F, 0.1F);
/* 394 */     this.gunModel[88].setRotationPoint(-2.55F, -7.5F, -2.65F);
/* 395 */     this.gunModel[88].rotateAngleY = 0.27925268F;
/*     */     
/* 397 */     this.gunModel[89].addShapeBox(0.0F, -4.0F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 398 */     this.gunModel[89].setRotationPoint(8.0F, -4.0F, -1.0F);
/*     */     
/* 400 */     this.gunModel[90].addShapeBox(0.0F, -4.0F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -1.75F, -0.85F, 0.0F, -1.75F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 401 */     this.gunModel[90].setRotationPoint(8.0F, -4.0F, -1.4F);
/*     */     
/* 403 */     this.gunModel[91].addShapeBox(0.0F, -4.0F, -1.0F, 11, 1, 2, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 404 */     this.gunModel[91].setRotationPoint(0.0F, -6.0F, 0.0F);
/*     */     
/* 406 */     this.gunModel[92].addShapeBox(0.0F, -4.0F, -1.0F, 18, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 407 */     this.gunModel[92].setRotationPoint(-20.0F, -5.0F, 0.0F);
/*     */     
/* 409 */     this.gunModel[93].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 410 */     this.gunModel[93].setRotationPoint(6.0F, 0.0F, 2.0F);
/*     */     
/* 412 */     this.gunModel[94].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 413 */     this.gunModel[94].setRotationPoint(6.0F, 0.0F, -0.15F);
/*     */     
/* 415 */     this.gunModel[95].addShapeBox(0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.85F, 0.0F, 0.25F, -0.85F);
/* 416 */     this.gunModel[95].setRotationPoint(7.0F, -2.0F, 2.0F);
/*     */     
/* 418 */     this.gunModel[96].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.9F, 0.45F, -0.9F, -0.9F, 0.45F, -0.9F, -0.9F, -0.15F, 0.0F, -0.9F, -0.15F, 0.0F, 0.0F, 0.45F, -0.9F, 0.0F, 0.45F, -0.9F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 419 */     this.gunModel[96].setRotationPoint(11.0F, 0.0F, 0.3F);
/*     */     
/* 421 */     this.gunModel[97].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.9F, 0.25F, -0.75F, -0.9F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.9F, 0.25F, 0.0F, -0.9F);
/* 422 */     this.gunModel[97].setRotationPoint(1.5F, -4.0F, 1.0F);
/*     */     
/* 424 */     this.gunModel[98].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 425 */     this.gunModel[98].setRotationPoint(1.5F, -4.25F, 1.0F);
/*     */     
/* 427 */     this.gunModel[99].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 428 */     this.gunModel[99].setRotationPoint(1.5F, -3.75F, 1.0F);
/*     */     
/* 430 */     this.gunModel[100].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, -0.25F, 0.0F, -0.9F);
/* 431 */     this.gunModel[100].setRotationPoint(1.25F, -3.75F, 1.0F);
/*     */     
/* 433 */     this.gunModel[101].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 434 */     this.gunModel[101].setRotationPoint(1.75F, -3.75F, 1.0F);
/*     */     
/* 436 */     this.gunModel[102].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, -0.25F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 437 */     this.gunModel[102].setRotationPoint(1.25F, -4.25F, 1.0F);
/*     */     
/* 439 */     this.gunModel[103].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 440 */     this.gunModel[103].setRotationPoint(1.75F, -4.25F, 1.0F);
/*     */     
/* 442 */     this.gunModel[104].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F);
/* 443 */     this.gunModel[104].setRotationPoint(1.0F, -4.0F, 1.0F);
/*     */     
/*     */ 
/* 446 */     this.defaultScopeModel = new ModelRendererTurbo[15];
/* 447 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 448 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 449 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 450 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 451 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 452 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 453 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 454 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 455 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 456 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 457 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/* 458 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/* 459 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/* 460 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/* 461 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*     */     
/* 463 */     this.defaultScopeModel[0].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 464 */     this.defaultScopeModel[0].setRotationPoint(10.5F, -6.0F, 0.0F);
/*     */     
/* 466 */     this.defaultScopeModel[1].addShapeBox(0.0F, -4.0F, -1.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 467 */     this.defaultScopeModel[1].setRotationPoint(11.0F, -7.0F, 0.0F);
/*     */     
/* 469 */     this.defaultScopeModel[2].addShapeBox(0.0F, -4.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 470 */     this.defaultScopeModel[2].setRotationPoint(2.0F, -8.0F, 0.0F);
/*     */     
/* 472 */     this.defaultScopeModel[3].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 473 */     this.defaultScopeModel[3].setRotationPoint(11.75F, -8.0F, 0.0F);
/*     */     
/* 475 */     this.defaultScopeModel[4].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 476 */     this.defaultScopeModel[4].setRotationPoint(1.0F, -8.0F, 0.0F);
/*     */     
/* 478 */     this.defaultScopeModel[5].addShapeBox(0.0F, -4.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 479 */     this.defaultScopeModel[5].setRotationPoint(2.0F, -8.0F, 1.5F);
/*     */     
/* 481 */     this.defaultScopeModel[6].addShapeBox(0.0F, -4.0F, -1.0F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 482 */     this.defaultScopeModel[6].setRotationPoint(2.0F, -8.0F, 0.5F);
/*     */     
/* 484 */     this.defaultScopeModel[7].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 485 */     this.defaultScopeModel[7].setRotationPoint(0.0F, -8.0F, 1.5F);
/*     */     
/* 487 */     this.defaultScopeModel[8].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 488 */     this.defaultScopeModel[8].setRotationPoint(1.0F, -8.0F, 1.5F);
/*     */     
/* 490 */     this.defaultScopeModel[9].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 491 */     this.defaultScopeModel[9].setRotationPoint(0.0F, -8.0F, 0.0F);
/*     */     
/* 493 */     this.defaultScopeModel[10].addShapeBox(0.0F, -4.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 494 */     this.defaultScopeModel[10].setRotationPoint(0.0F, -8.0F, 0.5F);
/*     */     
/* 496 */     this.defaultScopeModel[11].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 497 */     this.defaultScopeModel[11].setRotationPoint(0.0F, -8.5F, -0.25F);
/*     */     
/* 499 */     this.defaultScopeModel[12].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 500 */     this.defaultScopeModel[12].setRotationPoint(0.0F, -8.5F, 0.5F);
/*     */     
/* 502 */     this.defaultScopeModel[13].addShapeBox(0.0F, -4.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.9F, -0.5F, 0.0F, -0.9F, -0.5F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 503 */     this.defaultScopeModel[13].setRotationPoint(0.0F, -9.4F, 0.25F);
/*     */     
/* 505 */     this.defaultScopeModel[14].addShapeBox(0.0F, -4.0F, -1.0F, 5, 1, 2, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 506 */     this.defaultScopeModel[14].setRotationPoint(-0.75F, -7.0F, 0.0F);
/*     */     
/*     */ 
/* 509 */     this.ammoModel = new ModelRendererTurbo[23];
/* 510 */     this.ammoModel[0] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 511 */     this.ammoModel[1] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/* 512 */     this.ammoModel[2] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/* 513 */     this.ammoModel[3] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 514 */     this.ammoModel[4] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 515 */     this.ammoModel[5] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 516 */     this.ammoModel[6] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/* 517 */     this.ammoModel[7] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 518 */     this.ammoModel[8] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/* 519 */     this.ammoModel[9] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 520 */     this.ammoModel[10] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 521 */     this.ammoModel[11] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 522 */     this.ammoModel[12] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 523 */     this.ammoModel[13] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/* 524 */     this.ammoModel[14] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 525 */     this.ammoModel[15] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 526 */     this.ammoModel[16] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/* 527 */     this.ammoModel[17] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 528 */     this.ammoModel[18] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 529 */     this.ammoModel[19] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/* 530 */     this.ammoModel[20] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/* 531 */     this.ammoModel[21] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/* 532 */     this.ammoModel[22] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*     */     
/* 534 */     this.ammoModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 5, 4, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, -0.1F, 0.0F, 0.8F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, -0.1F, 0.0F, 0.8F);
/* 535 */     this.ammoModel[0].setRotationPoint(6.0F, -4.0F, -0.9F);
/*     */     
/* 537 */     this.ammoModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 538 */     this.ammoModel[1].setRotationPoint(6.0F, -3.0F, -4.9F);
/*     */     
/* 540 */     this.ammoModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 541 */     this.ammoModel[2].setRotationPoint(6.0F, -3.0F, -3.9F);
/*     */     
/* 543 */     this.ammoModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 544 */     this.ammoModel[3].setRotationPoint(6.0F, -3.0F, -1.9F);
/*     */     
/* 546 */     this.ammoModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 547 */     this.ammoModel[4].setRotationPoint(6.0F, -3.0F, 0.9F);
/*     */     
/* 549 */     this.ammoModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 550 */     this.ammoModel[5].setRotationPoint(6.0F, -3.0F, 1.9F);
/*     */     
/* 552 */     this.ammoModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 553 */     this.ammoModel[6].setRotationPoint(6.0F, -2.0F, -4.9F);
/*     */     
/* 555 */     this.ammoModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 556 */     this.ammoModel[7].setRotationPoint(6.0F, -2.0F, 0.9F);
/*     */     
/* 558 */     this.ammoModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 559 */     this.ammoModel[8].setRotationPoint(6.0F, -3.0F, 3.9F);
/*     */     
/* 561 */     this.ammoModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 562 */     this.ammoModel[9].setRotationPoint(6.0F, -2.0F, -5.9F);
/*     */     
/* 564 */     this.ammoModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 565 */     this.ammoModel[10].setRotationPoint(6.0F, 0.0F, -5.9F);
/*     */     
/* 567 */     this.ammoModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 568 */     this.ammoModel[11].setRotationPoint(6.0F, -1.0F, -5.9F);
/*     */     
/* 570 */     this.ammoModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 571 */     this.ammoModel[12].setRotationPoint(6.0F, -1.0F, 4.4F);
/*     */     
/* 573 */     this.ammoModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 574 */     this.ammoModel[13].setRotationPoint(6.0F, -2.0F, 4.4F);
/*     */     
/* 576 */     this.ammoModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F);
/* 577 */     this.ammoModel[14].setRotationPoint(6.0F, 0.0F, 4.4F);
/*     */     
/* 579 */     this.ammoModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 580 */     this.ammoModel[15].setRotationPoint(6.0F, 1.0F, -3.9F);
/*     */     
/* 582 */     this.ammoModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 583 */     this.ammoModel[16].setRotationPoint(6.0F, 1.0F, -4.9F);
/*     */     
/* 585 */     this.ammoModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F);
/* 586 */     this.ammoModel[17].setRotationPoint(6.0F, 1.0F, -1.9F);
/*     */     
/* 588 */     this.ammoModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F);
/* 589 */     this.ammoModel[18].setRotationPoint(6.0F, 0.0F, -1.4F);
/*     */     
/* 591 */     this.ammoModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 592 */     this.ammoModel[19].setRotationPoint(6.0F, 1.0F, 1.9F);
/*     */     
/* 594 */     this.ammoModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.1F, -1.0F, 0.0F);
/* 595 */     this.ammoModel[20].setRotationPoint(6.0F, 1.0F, 3.9F);
/*     */     
/* 597 */     this.ammoModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 598 */     this.ammoModel[21].setRotationPoint(6.0F, 1.0F, 0.9F);
/*     */     
/* 600 */     this.ammoModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 601 */     this.ammoModel[22].setRotationPoint(6.0F, 0.0F, -0.1F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 606 */     this.scopeAttachPoint = new Vector3f(0.4375F, 0.625F, 0.0F);
/*     */     
/* 608 */     translateAll(0.0F, -0.5F, 0.0F);
/* 609 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 611 */     this.gunSlideDistance = 0.0F;
/* 612 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 615 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm16lmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */