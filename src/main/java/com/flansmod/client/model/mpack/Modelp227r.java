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
/*     */ public class Modelp227r
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelp227r()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[96];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 9, 65, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 449, 73, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/* 113 */     this.gunModel[91] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/* 114 */     this.gunModel[92] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/* 115 */     this.gunModel[93] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/* 116 */     this.gunModel[94] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 117 */     this.gunModel[95] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*     */     
/* 119 */     this.gunModel[0].addBox(0.0F, -3.0F, -4.0F, 25, 3, 7, 0.0F);
/* 120 */     this.gunModel[0].setRotationPoint(12.0F, -18.0F, 0.5F);
/*     */     
/* 122 */     this.gunModel[1].addShapeBox(0.0F, -3.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[1].setRotationPoint(11.0F, -18.0F, 7.0F);
/*     */     
/* 125 */     this.gunModel[2].addShapeBox(0.0F, -3.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 126 */     this.gunModel[2].setRotationPoint(11.0F, -18.0F, 0.0F);
/*     */     
/* 128 */     this.gunModel[3].addBox(0.0F, -3.0F, -4.0F, 16, 5, 8, 0.0F);
/* 129 */     this.gunModel[3].setRotationPoint(-5.0F, -18.0F, 0.0F);
/*     */     
/* 131 */     this.gunModel[4].addShapeBox(0.0F, -3.0F, -4.0F, 12, 3, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 132 */     this.gunModel[4].setRotationPoint(-4.0F, -10.0F, 0.0F);
/*     */     
/* 134 */     this.gunModel[5].addBox(0.0F, -3.0F, -4.0F, 7, 3, 1, 0.0F);
/* 135 */     this.gunModel[5].setRotationPoint(15.0F, -17.5F, 7.5F);
/*     */     
/* 137 */     this.gunModel[6].addShapeBox(0.0F, -3.0F, -4.0F, 8, 5, 8, 0.0F, -1.5F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 138 */     this.gunModel[6].setRotationPoint(-12.6F, -18.0F, 0.0F);
/*     */     
/* 140 */     this.gunModel[7].addBox(0.0F, -3.0F, -4.0F, 2, 5, 2, 0.0F);
/* 141 */     this.gunModel[7].setRotationPoint(-13.0F, -22.0F, 3.0F);
/* 142 */     this.gunModel[7].rotateAngleZ = 1.1519173F;
/*     */     
/* 144 */     this.gunModel[8].addShapeBox(0.0F, -3.0F, -4.0F, 7, 3, 4, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 145 */     this.gunModel[8].setRotationPoint(-13.0F, -13.0F, 2.0F);
/*     */     
/* 147 */     this.gunModel[9].addBox(0.0F, -3.0F, -4.0F, 6, 1, 8, 0.0F);
/* 148 */     this.gunModel[9].setRotationPoint(5.0F, -13.0F, 0.0F);
/*     */     
/* 150 */     this.gunModel[10].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 151 */     this.gunModel[10].setRotationPoint(22.0F, -9.5F, 2.0F);
/*     */     
/* 153 */     this.gunModel[11].addShapeBox(0.0F, -3.0F, -4.0F, 11, 1, 4, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 154 */     this.gunModel[11].setRotationPoint(11.0F, -5.5F, 2.0F);
/*     */     
/* 156 */     this.gunModel[12].addShapeBox(0.0F, -3.0F, -4.0F, 5, 9, 10, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 157 */     this.gunModel[12].setRotationPoint(-9.0F, -7.0F, -1.0F);
/*     */     
/* 159 */     this.gunModel[13].addShapeBox(0.0F, -3.0F, -4.0F, 2, 13, 8, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.25F, 3.0F, 0.5F, 0.25F, -3.0F, 0.5F, -2.0F, -3.0F, 0.5F, -2.0F, 3.0F, 0.5F, 0.25F);
/* 160 */     this.gunModel[13].setRotationPoint(4.5F, -1.5F, 0.0F);
/*     */     
/* 162 */     this.gunModel[14].addShapeBox(0.0F, -3.0F, -4.0F, 6, 6, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 163 */     this.gunModel[14].setRotationPoint(-10.0F, 2.0F, -1.0F);
/*     */     
/* 165 */     this.gunModel[15].addShapeBox(0.0F, -3.0F, -4.0F, 6, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 166 */     this.gunModel[15].setRotationPoint(-10.0F, 8.0F, -1.0F);
/*     */     
/* 168 */     this.gunModel[16].addShapeBox(0.0F, -3.0F, -4.0F, 9, 16, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 169 */     this.gunModel[16].setRotationPoint(-4.0F, -4.0F, -1.0F);
/*     */     
/* 171 */     this.gunModel[17].addShapeBox(0.0F, -3.0F, -4.0F, 9, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[17].setRotationPoint(-4.0F, -14.0F, -1.0F);
/*     */     
/* 174 */     this.gunModel[18].addShapeBox(0.0F, -3.0F, -4.0F, 16, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 175 */     this.gunModel[18].setRotationPoint(-11.0F, -16.0F, -1.0F);
/*     */     
/* 177 */     this.gunModel[19].addShapeBox(0.0F, -3.0F, -4.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 178 */     this.gunModel[19].setRotationPoint(-3.0F, -17.5F, 9.0F);
/*     */     
/* 180 */     this.gunModel[20].addShapeBox(0.0F, -3.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 181 */     this.gunModel[20].setRotationPoint(-2.0F, -18.0F, 8.0F);
/*     */     
/* 183 */     this.gunModel[21].addShapeBox(0.0F, -3.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 184 */     this.gunModel[21].setRotationPoint(6.0F, -8.0F, 5.5F);
/*     */     
/* 186 */     this.gunModel[22].addShapeBox(0.0F, -2.0F, -4.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 187 */     this.gunModel[22].setRotationPoint(5.0F, -11.5F, 7.0F);
/*     */     
/* 189 */     this.gunModel[23].addShapeBox(0.0F, -3.0F, -4.0F, 13, 1, 7, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 190 */     this.gunModel[23].setRotationPoint(12.0F, -12.5F, 0.5F);
/*     */     
/* 192 */     this.gunModel[24].addShapeBox(0.0F, -3.0F, -4.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 193 */     this.gunModel[24].setRotationPoint(5.0F, -11.0F, 7.5F);
/*     */     
/* 195 */     this.gunModel[25].addShapeBox(0.0F, -3.0F, -4.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 196 */     this.gunModel[25].setRotationPoint(4.5F, -14.0F, 7.5F);
/*     */     
/* 198 */     this.gunModel[26].addShapeBox(0.0F, -3.0F, -4.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 199 */     this.gunModel[26].setRotationPoint(5.0F, -16.0F, 7.5F);
/*     */     
/* 201 */     this.gunModel[27].addShapeBox(0.0F, -3.0F, -4.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 202 */     this.gunModel[27].setRotationPoint(3.0F, -15.5F, 9.0F);
/*     */     
/* 204 */     this.gunModel[28].addShapeBox(0.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 205 */     this.gunModel[28].setRotationPoint(4.0F, -16.5F, 8.0F);
/*     */     
/* 207 */     this.gunModel[29].addShapeBox(0.0F, -3.0F, -4.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 208 */     this.gunModel[29].setRotationPoint(-10.5F, -23.0F, 3.0F);
/* 209 */     this.gunModel[29].rotateAngleZ = 1.1868238F;
/*     */     
/* 211 */     this.gunModel[30].addShapeBox(0.0F, -3.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 212 */     this.gunModel[30].setRotationPoint(11.0F, -13.0F, 2.5F);
/*     */     
/* 214 */     this.gunModel[31].addShapeBox(0.0F, -3.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 215 */     this.gunModel[31].setRotationPoint(13.5F, -10.0F, 2.5F);
/*     */     
/* 217 */     this.gunModel[32].addShapeBox(0.0F, -3.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 218 */     this.gunModel[32].setRotationPoint(14.5F, -8.5F, 2.5F);
/*     */     
/* 220 */     this.gunModel[33].addShapeBox(0.0F, -3.0F, -4.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F);
/* 221 */     this.gunModel[33].setRotationPoint(21.0F, -11.5F, 2.0F);
/*     */     
/* 223 */     this.gunModel[34].addShapeBox(0.0F, -3.0F, -4.0F, 0, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 224 */     this.gunModel[34].setRotationPoint(23.0F, -11.5F, 2.0F);
/*     */     
/* 226 */     this.gunModel[35].addBox(0.0F, -3.0F, -4.0F, 47, 2, 1, 0.0F);
/* 227 */     this.gunModel[35].setRotationPoint(-10.0F, -18.5F, 5.5F);
/*     */     
/* 229 */     this.gunModel[36].addBox(0.0F, -3.0F, -4.0F, 47, 2, 1, 0.0F);
/* 230 */     this.gunModel[36].setRotationPoint(-10.0F, -18.5F, 1.5F);
/*     */     
/* 232 */     this.gunModel[37].addBox(0.0F, -3.0F, -4.0F, 38, 2, 2, 0.0F);
/* 233 */     this.gunModel[37].setRotationPoint(6.0F, -18.2F, 3.0F);
/*     */     
/* 235 */     this.gunModel[38].addShapeBox(0.0F, -3.0F, -4.0F, 23, 5, 5, 0.0F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F, 0.0F, -0.125F, -0.125F);
/* 236 */     this.gunModel[38].setRotationPoint(21.0F, -24.7F, 1.5F);
/*     */     
/* 238 */     this.gunModel[39].addBox(0.0F, -3.0F, -4.0F, 13, 3, 7, 0.0F);
/* 239 */     this.gunModel[39].setRotationPoint(12.0F, -15.0F, 0.5F);
/*     */     
/* 241 */     this.gunModel[40].addBox(0.0F, -3.0F, -4.0F, 12, 1, 5, 0.0F);
/* 242 */     this.gunModel[40].setRotationPoint(25.0F, -14.0F, 1.5F);
/*     */     
/* 244 */     this.gunModel[41].addBox(0.0F, -3.0F, -4.0F, 12, 1, 7, 0.0F);
/* 245 */     this.gunModel[41].setRotationPoint(25.0F, -15.0F, 0.5F);
/*     */     
/* 247 */     this.gunModel[42].addBox(0.0F, -3.0F, -4.0F, 2, 1, 3, 0.0F);
/* 248 */     this.gunModel[42].setRotationPoint(35.0F, -13.0F, 2.5F);
/*     */     
/* 250 */     this.gunModel[43].addShapeBox(0.0F, -3.0F, -4.0F, 2, 6, 10, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F);
/* 251 */     this.gunModel[43].setRotationPoint(-12.0F, 8.0F, -1.0F);
/*     */     
/* 253 */     this.gunModel[44].addShapeBox(0.0F, -3.0F, -4.0F, 3, 6, 10, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 254 */     this.gunModel[44].setRotationPoint(-12.0F, 2.0F, -1.0F);
/*     */     
/* 256 */     this.gunModel[45].addShapeBox(0.0F, -3.0F, -4.0F, 7, 9, 10, 0.0F, -3.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 257 */     this.gunModel[45].setRotationPoint(-11.0F, -7.0F, -1.0F);
/*     */     
/* 259 */     this.gunModel[46].addShapeBox(0.0F, -3.0F, -4.0F, 7, 3, 2, 0.0F, -0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, -8.45F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 260 */     this.gunModel[46].setRotationPoint(-13.0F, -13.0F, 0.0F);
/*     */     
/* 262 */     this.gunModel[47].addShapeBox(0.0F, -3.0F, -4.0F, 7, 3, 2, 0.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -8.45F, 0.0F, 0.0F);
/* 263 */     this.gunModel[47].setRotationPoint(-13.0F, -13.0F, 6.0F);
/*     */     
/* 265 */     this.gunModel[48].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F);
/* 266 */     this.gunModel[48].setRotationPoint(-11.1F, -17.0F, -1.0F);
/*     */     
/* 268 */     this.gunModel[49].addShapeBox(0.0F, -3.0F, -4.0F, 17, 1, 1, 0.0F, 0.5F, -0.4F, 0.0F, 0.6F, -0.4F, 0.0F, 0.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 269 */     this.gunModel[49].setRotationPoint(-9.6F, -17.0F, -1.0F);
/*     */     
/* 271 */     this.gunModel[50].addShapeBox(0.0F, -3.0F, -4.0F, 6, 2, 1, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.4F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -6.0F, 0.25F, 0.0F);
/* 272 */     this.gunModel[50].setRotationPoint(-12.0F, -13.0F, 8.0F);
/*     */     
/* 274 */     this.gunModel[51].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 275 */     this.gunModel[51].setRotationPoint(-12.0F, -16.0F, 8.0F);
/*     */     
/* 277 */     this.gunModel[52].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -1.0F, -0.4F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 278 */     this.gunModel[52].setRotationPoint(-11.1F, -17.0F, 8.0F);
/*     */     
/* 280 */     this.gunModel[53].addShapeBox(0.0F, -3.0F, -4.0F, 12, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, -0.4F, 0.0F, 0.5F, -0.4F, 0.0F, 0.5F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 281 */     this.gunModel[53].setRotationPoint(-9.6F, -17.0F, 8.0F);
/*     */     
/* 283 */     this.gunModel[54].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 284 */     this.gunModel[54].setRotationPoint(3.0F, -17.0F, 8.0F);
/*     */     
/* 286 */     this.gunModel[55].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 287 */     this.gunModel[55].setRotationPoint(35.0F, -13.0F, 0.5F);
/*     */     
/* 289 */     this.gunModel[56].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 290 */     this.gunModel[56].setRotationPoint(35.0F, -13.0F, 5.5F);
/*     */     
/* 292 */     this.gunModel[57].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 293 */     this.gunModel[57].setRotationPoint(32.0F, -13.0F, 5.5F);
/*     */     
/* 295 */     this.gunModel[58].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 296 */     this.gunModel[58].setRotationPoint(32.0F, -13.0F, 0.5F);
/*     */     
/* 298 */     this.gunModel[59].addBox(0.0F, -3.0F, -4.0F, 2, 1, 3, 0.0F);
/* 299 */     this.gunModel[59].setRotationPoint(32.0F, -13.0F, 2.5F);
/*     */     
/* 301 */     this.gunModel[60].addShapeBox(0.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 302 */     this.gunModel[60].setRotationPoint(25.0F, -13.0F, 5.5F);
/*     */     
/* 304 */     this.gunModel[61].addShapeBox(0.0F, -3.0F, -4.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 305 */     this.gunModel[61].setRotationPoint(25.0F, -13.0F, 0.5F);
/*     */     
/* 307 */     this.gunModel[62].addBox(0.0F, -3.0F, -4.0F, 3, 1, 3, 0.0F);
/* 308 */     this.gunModel[62].setRotationPoint(25.0F, -13.0F, 2.5F);
/*     */     
/* 310 */     this.gunModel[63].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 311 */     this.gunModel[63].setRotationPoint(29.0F, -13.0F, 5.5F);
/*     */     
/* 313 */     this.gunModel[64].addBox(0.0F, -3.0F, -4.0F, 2, 1, 3, 0.0F);
/* 314 */     this.gunModel[64].setRotationPoint(29.0F, -13.0F, 2.5F);
/*     */     
/* 316 */     this.gunModel[65].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 317 */     this.gunModel[65].setRotationPoint(29.0F, -13.0F, 0.5F);
/*     */     
/* 319 */     this.gunModel[66].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 320 */     this.gunModel[66].setRotationPoint(10.0F, -12.5F, 0.0F);
/*     */     
/* 322 */     this.gunModel[67].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 8, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, 0.5F, -0.5F, 0.0F);
/* 323 */     this.gunModel[67].setRotationPoint(8.0F, -10.0F, 0.0F);
/*     */     
/* 325 */     this.gunModel[68].addShapeBox(0.0F, -3.0F, -4.0F, 4, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 326 */     this.gunModel[68].setRotationPoint(4.0F, -12.0F, 0.0F);
/*     */     
/* 328 */     this.gunModel[69].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 1.0F, -1.5F);
/* 329 */     this.gunModel[69].setRotationPoint(9.0F, -12.5F, 0.0F);
/*     */     
/* 331 */     this.gunModel[70].addShapeBox(0.0F, -3.0F, -4.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 332 */     this.gunModel[70].setRotationPoint(22.0F, -6.5F, 2.0F);
/*     */     
/* 334 */     this.gunModel[71].addShapeBox(0.0F, -3.0F, -4.0F, 3, 12, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 335 */     this.gunModel[71].setRotationPoint(5.0F, -16.0F, -1.0F);
/*     */     
/* 337 */     this.gunModel[72].addShapeBox(0.0F, -3.0F, -4.0F, 3, 5, 8, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F);
/* 338 */     this.gunModel[72].setRotationPoint(-14.1F, -18.0F, 0.0F);
/*     */     
/* 340 */     this.gunModel[73].addShapeBox(0.0F, -3.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F);
/* 341 */     this.gunModel[73].setRotationPoint(8.0F, -12.0F, 0.0F);
/*     */     
/* 343 */     this.gunModel[74].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F);
/* 344 */     this.gunModel[74].setRotationPoint(8.0F, -7.0F, 0.0F);
/*     */     
/* 346 */     this.gunModel[75].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, -2.0F, 0.5F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, -2.0F, 0.5F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 347 */     this.gunModel[75].setRotationPoint(7.5F, -7.5F, 0.0F);
/*     */     
/* 349 */     this.gunModel[76].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/* 350 */     this.gunModel[76].setRotationPoint(5.5F, -6.5F, 2.0F);
/*     */     
/* 352 */     this.gunModel[77].addShapeBox(0.0F, -3.0F, -4.0F, 3, 1, 8, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, -0.5F, -2.0F);
/* 353 */     this.gunModel[77].setRotationPoint(7.0F, -6.0F, 0.0F);
/*     */     
/* 355 */     this.gunModel[78].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 356 */     this.gunModel[78].setRotationPoint(10.0F, -6.0F, 0.0F);
/*     */     
/* 358 */     this.gunModel[79].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 359 */     this.gunModel[79].setRotationPoint(4.0F, -7.5F, 0.0F);
/*     */     
/* 361 */     this.gunModel[80].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 362 */     this.gunModel[80].setRotationPoint(5.5F, -7.5F, 2.0F);
/*     */     
/* 364 */     this.gunModel[81].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
/* 365 */     this.gunModel[81].setRotationPoint(5.5F, -5.5F, 2.0F);
/*     */     
/* 367 */     this.gunModel[82].addShapeBox(0.0F, -3.0F, -4.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F);
/* 368 */     this.gunModel[82].setRotationPoint(4.5F, -4.5F, 2.0F);
/*     */     
/* 370 */     this.gunModel[83].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 2.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F);
/* 371 */     this.gunModel[83].setRotationPoint(4.5F, -2.5F, 2.0F);
/*     */     
/* 373 */     this.gunModel[84].addShapeBox(0.0F, -3.0F, -4.0F, 2, 13, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 374 */     this.gunModel[84].setRotationPoint(2.5F, -1.5F, 0.0F);
/*     */     
/* 376 */     this.gunModel[85].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 377 */     this.gunModel[85].setRotationPoint(3.5F, -4.5F, 0.0F);
/*     */     
/* 379 */     this.gunModel[86].addShapeBox(0.0F, -3.0F, -4.0F, 2, 4, 10, 0.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 380 */     this.gunModel[86].setRotationPoint(-8.0F, -11.0F, -1.0F);
/*     */     
/* 382 */     this.gunModel[87].addShapeBox(0.0F, -3.0F, -4.0F, 2, 4, 10, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 383 */     this.gunModel[87].setRotationPoint(-6.0F, -11.0F, -1.0F);
/*     */     
/* 385 */     this.gunModel[88].addShapeBox(0.0F, -3.0F, -4.0F, 2, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 386 */     this.gunModel[88].setRotationPoint(-6.0F, -13.0F, -1.0F);
/*     */     
/* 388 */     this.gunModel[89].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 389 */     this.gunModel[89].setRotationPoint(-11.0F, -14.0F, -1.0F);
/*     */     
/* 391 */     this.gunModel[90].addShapeBox(0.0F, -3.0F, -4.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -6.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -5.4F, 0.25F, 0.0F);
/* 392 */     this.gunModel[90].setRotationPoint(-12.0F, -13.0F, -1.0F);
/*     */     
/* 394 */     this.gunModel[91].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 1, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F);
/* 395 */     this.gunModel[91].setRotationPoint(-12.0F, -16.0F, -1.0F);
/*     */     
/* 397 */     this.gunModel[92].addShapeBox(0.0F, -3.0F, -4.0F, 11, 2, 1, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 398 */     this.gunModel[92].setRotationPoint(-9.5F, 12.0F, 8.0F);
/*     */     
/* 400 */     this.gunModel[93].addShapeBox(0.0F, -3.0F, -4.0F, 11, 2, 1, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, 0.4F, -0.5F, -0.25F);
/* 401 */     this.gunModel[93].setRotationPoint(-9.5F, 12.0F, -1.0F);
/*     */     
/* 403 */     this.gunModel[94].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 404 */     this.gunModel[94].setRotationPoint(8.0F, -16.0F, -1.0F);
/*     */     
/* 406 */     this.gunModel[95].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, -0.4F, 0.0F, -0.625F, -0.4F, 0.0F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 407 */     this.gunModel[95].setRotationPoint(8.0F, -17.0F, -1.0F);
/*     */     
/*     */ 
/* 410 */     this.ammoModel = new ModelRendererTurbo[3];
/* 411 */     this.ammoModel[0] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 412 */     this.ammoModel[1] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/* 413 */     this.ammoModel[2] = new ModelRendererTurbo(this, 89, 73, this.textureX, this.textureY);
/*     */     
/* 415 */     this.ammoModel[0].addShapeBox(0.0F, -3.0F, -4.0F, 11, 26, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F);
/* 416 */     this.ammoModel[0].setRotationPoint(-4.25F, -14.0F, 0.5F);
/*     */     
/* 418 */     this.ammoModel[1].addShapeBox(0.0F, -3.0F, -4.0F, 12, 2, 8, 0.0F, 0.4F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.4F, 0.0F, 0.25F);
/* 419 */     this.ammoModel[1].setRotationPoint(-9.0F, 12.0F, 0.0F);
/*     */     
/* 421 */     this.ammoModel[2].addShapeBox(0.0F, -3.0F, -4.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F);
/* 422 */     this.ammoModel[2].setRotationPoint(3.0F, 12.0F, 0.5F);
/*     */     
/*     */ 
/* 425 */     this.slideModel = new ModelRendererTurbo[113];
/* 426 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 427 */     this.slideModel[1] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/* 428 */     this.slideModel[2] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/* 429 */     this.slideModel[3] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/* 430 */     this.slideModel[4] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/* 431 */     this.slideModel[5] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/* 432 */     this.slideModel[6] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/* 433 */     this.slideModel[7] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/* 434 */     this.slideModel[8] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/* 435 */     this.slideModel[9] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 436 */     this.slideModel[10] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/* 437 */     this.slideModel[11] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/* 438 */     this.slideModel[12] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 439 */     this.slideModel[13] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 440 */     this.slideModel[14] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 441 */     this.slideModel[15] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 442 */     this.slideModel[16] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 443 */     this.slideModel[17] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/* 444 */     this.slideModel[18] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/* 445 */     this.slideModel[19] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/* 446 */     this.slideModel[20] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/* 447 */     this.slideModel[21] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/* 448 */     this.slideModel[22] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/* 449 */     this.slideModel[23] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 450 */     this.slideModel[24] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/* 451 */     this.slideModel[25] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 452 */     this.slideModel[26] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 453 */     this.slideModel[27] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 454 */     this.slideModel[28] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 455 */     this.slideModel[29] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 456 */     this.slideModel[30] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/* 457 */     this.slideModel[31] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/* 458 */     this.slideModel[32] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 459 */     this.slideModel[33] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/* 460 */     this.slideModel[34] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 461 */     this.slideModel[35] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/* 462 */     this.slideModel[36] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 463 */     this.slideModel[37] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/* 464 */     this.slideModel[38] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 465 */     this.slideModel[39] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/* 466 */     this.slideModel[40] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/* 467 */     this.slideModel[41] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/* 468 */     this.slideModel[42] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 469 */     this.slideModel[43] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/* 470 */     this.slideModel[44] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
/* 471 */     this.slideModel[45] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 472 */     this.slideModel[46] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 473 */     this.slideModel[47] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/* 474 */     this.slideModel[48] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/* 475 */     this.slideModel[49] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/* 476 */     this.slideModel[50] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/* 477 */     this.slideModel[51] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/* 478 */     this.slideModel[52] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/* 479 */     this.slideModel[53] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/* 480 */     this.slideModel[54] = new ModelRendererTurbo(this, 313, 33, this.textureX, this.textureY);
/* 481 */     this.slideModel[55] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/* 482 */     this.slideModel[56] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/* 483 */     this.slideModel[57] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/* 484 */     this.slideModel[58] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/* 485 */     this.slideModel[59] = new ModelRendererTurbo(this, 289, 41, this.textureX, this.textureY);
/* 486 */     this.slideModel[60] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 487 */     this.slideModel[61] = new ModelRendererTurbo(this, 241, 25, this.textureX, this.textureY);
/* 488 */     this.slideModel[62] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/* 489 */     this.slideModel[63] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/* 490 */     this.slideModel[64] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/* 491 */     this.slideModel[65] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/* 492 */     this.slideModel[66] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/* 493 */     this.slideModel[67] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/* 494 */     this.slideModel[68] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/* 495 */     this.slideModel[69] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/* 496 */     this.slideModel[70] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/* 497 */     this.slideModel[71] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/* 498 */     this.slideModel[72] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/* 499 */     this.slideModel[73] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/* 500 */     this.slideModel[74] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/* 501 */     this.slideModel[75] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/* 502 */     this.slideModel[76] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/* 503 */     this.slideModel[77] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/* 504 */     this.slideModel[78] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 505 */     this.slideModel[79] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 506 */     this.slideModel[80] = new ModelRendererTurbo(this, 9, 57, this.textureX, this.textureY);
/* 507 */     this.slideModel[81] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/* 508 */     this.slideModel[82] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/* 509 */     this.slideModel[83] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/* 510 */     this.slideModel[84] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 511 */     this.slideModel[85] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/* 512 */     this.slideModel[86] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 513 */     this.slideModel[87] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/* 514 */     this.slideModel[88] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/* 515 */     this.slideModel[89] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/* 516 */     this.slideModel[90] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 517 */     this.slideModel[91] = new ModelRendererTurbo(this, 129, 57, this.textureX, this.textureY);
/* 518 */     this.slideModel[92] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/* 519 */     this.slideModel[93] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/* 520 */     this.slideModel[94] = new ModelRendererTurbo(this, 185, 57, this.textureX, this.textureY);
/* 521 */     this.slideModel[95] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/* 522 */     this.slideModel[96] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/* 523 */     this.slideModel[97] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/* 524 */     this.slideModel[98] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/* 525 */     this.slideModel[99] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 526 */     this.slideModel[100] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/* 527 */     this.slideModel[101] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/* 528 */     this.slideModel[102] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/* 529 */     this.slideModel[103] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 530 */     this.slideModel[104] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 531 */     this.slideModel[105] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/* 532 */     this.slideModel[106] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/* 533 */     this.slideModel[107] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/* 534 */     this.slideModel[108] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/* 535 */     this.slideModel[109] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/* 536 */     this.slideModel[110] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/* 537 */     this.slideModel[111] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/* 538 */     this.slideModel[112] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/*     */     
/* 540 */     this.slideModel[0].addBox(0.0F, -3.0F, -4.0F, 22, 7, 6, 0.0F);
/* 541 */     this.slideModel[0].setRotationPoint(-9.0F, -25.2F, 1.0F);
/*     */     
/* 543 */     this.slideModel[1].addBox(0.0F, -3.0F, -4.0F, 16, 3, 8, 0.0F);
/* 544 */     this.slideModel[1].setRotationPoint(13.0F, -21.2F, 0.0F);
/*     */     
/* 546 */     this.slideModel[2].addBox(0.0F, -3.0F, -4.0F, 21, 5, 6, 0.0F);
/* 547 */     this.slideModel[2].setRotationPoint(22.0F, -25.2F, 1.0F);
/*     */     
/* 549 */     this.slideModel[3].addShapeBox(0.0F, -3.0F, -4.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 550 */     this.slideModel[3].setRotationPoint(13.0F, -24.7F, 6.0F);
/*     */     
/* 552 */     this.slideModel[4].addShapeBox(0.0F, -3.0F, -4.0F, 9, 5, 4, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 553 */     this.slideModel[4].setRotationPoint(13.0F, -25.3F, 2.0F);
/*     */     
/* 555 */     this.slideModel[5].addShapeBox(0.0F, -3.0F, -4.0F, 6, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 556 */     this.slideModel[5].setRotationPoint(7.0F, -25.2F, 7.0F);
/*     */     
/* 558 */     this.slideModel[6].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 559 */     this.slideModel[6].setRotationPoint(3.0F, -25.2F, 7.0F);
/*     */     
/* 561 */     this.slideModel[7].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 562 */     this.slideModel[7].setRotationPoint(5.0F, -25.2F, 7.0F);
/*     */     
/* 564 */     this.slideModel[8].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 565 */     this.slideModel[8].setRotationPoint(1.0F, -25.2F, 7.0F);
/*     */     
/* 567 */     this.slideModel[9].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 568 */     this.slideModel[9].setRotationPoint(-1.0F, -25.2F, 7.0F);
/*     */     
/* 570 */     this.slideModel[10].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 571 */     this.slideModel[10].setRotationPoint(-1.0F, -25.2F, 0.0F);
/*     */     
/* 573 */     this.slideModel[11].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 574 */     this.slideModel[11].setRotationPoint(1.0F, -25.2F, 0.0F);
/*     */     
/* 576 */     this.slideModel[12].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 577 */     this.slideModel[12].setRotationPoint(3.0F, -25.2F, 0.0F);
/*     */     
/* 579 */     this.slideModel[13].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 580 */     this.slideModel[13].setRotationPoint(5.0F, -25.2F, 0.0F);
/*     */     
/* 582 */     this.slideModel[14].addShapeBox(0.0F, -3.0F, -4.0F, 6, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 583 */     this.slideModel[14].setRotationPoint(7.0F, -25.2F, 0.0F);
/*     */     
/* 585 */     this.slideModel[15].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 586 */     this.slideModel[15].setRotationPoint(37.0F, -21.2F, 0.0F);
/*     */     
/* 588 */     this.slideModel[16].addShapeBox(0.0F, -3.0F, -4.0F, 6, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 589 */     this.slideModel[16].setRotationPoint(37.0F, -20.2F, 1.0F);
/*     */     
/* 591 */     this.slideModel[17].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 592 */     this.slideModel[17].setRotationPoint(-5.0F, -25.2F, 7.0F);
/*     */     
/* 594 */     this.slideModel[18].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 595 */     this.slideModel[18].setRotationPoint(-3.0F, -25.2F, 7.0F);
/*     */     
/* 597 */     this.slideModel[19].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 598 */     this.slideModel[19].setRotationPoint(-5.0F, -25.2F, 0.0F);
/*     */     
/* 600 */     this.slideModel[20].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 601 */     this.slideModel[20].setRotationPoint(-3.0F, -25.2F, 0.0F);
/*     */     
/* 603 */     this.slideModel[21].addShapeBox(0.0F, -3.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 604 */     this.slideModel[21].setRotationPoint(40.0F, -27.5F, 3.5F);
/*     */     
/* 606 */     this.slideModel[22].addBox(0.0F, -3.0F, -4.0F, 3, 1, 1, 0.0F);
/* 607 */     this.slideModel[22].setRotationPoint(40.0F, -26.5F, 3.5F);
/*     */     
/* 609 */     this.slideModel[23].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 610 */     this.slideModel[23].setRotationPoint(39.0F, -27.5F, 3.5F);
/*     */     
/* 612 */     this.slideModel[24].addBox(0.0F, -3.0F, -4.0F, 2, 2, 1, 0.0F);
/* 613 */     this.slideModel[24].setRotationPoint(-7.0F, -27.5F, 2.5F);
/*     */     
/* 615 */     this.slideModel[25].addBox(0.0F, -3.0F, -4.0F, 2, 2, 1, 0.0F);
/* 616 */     this.slideModel[25].setRotationPoint(-7.0F, -27.5F, 4.5F);
/*     */     
/* 618 */     this.slideModel[26].addBox(0.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F);
/* 619 */     this.slideModel[26].setRotationPoint(-7.0F, -26.5F, 3.5F);
/*     */     
/* 621 */     this.slideModel[27].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 622 */     this.slideModel[27].setRotationPoint(-8.0F, -27.5F, 4.5F);
/*     */     
/* 624 */     this.slideModel[28].addShapeBox(0.0F, -3.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 625 */     this.slideModel[28].setRotationPoint(-8.0F, -27.5F, 2.5F);
/*     */     
/* 627 */     this.slideModel[29].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 628 */     this.slideModel[29].setRotationPoint(-9.0F, -25.2F, 7.0F);
/*     */     
/* 630 */     this.slideModel[30].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 631 */     this.slideModel[30].setRotationPoint(-7.0F, -25.2F, 7.0F);
/*     */     
/* 633 */     this.slideModel[31].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 634 */     this.slideModel[31].setRotationPoint(-7.0F, -25.2F, 0.0F);
/*     */     
/* 636 */     this.slideModel[32].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 637 */     this.slideModel[32].setRotationPoint(-9.0F, -25.2F, 0.0F);
/*     */     
/* 639 */     this.slideModel[33].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 3, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 640 */     this.slideModel[33].setRotationPoint(-11.0F, -25.2F, 5.0F);
/*     */     
/* 642 */     this.slideModel[34].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 3, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 643 */     this.slideModel[34].setRotationPoint(-11.0F, -25.2F, 0.0F);
/*     */     
/* 645 */     this.slideModel[35].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.04F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.04F, 0.0F, 0.0F);
/* 646 */     this.slideModel[35].setRotationPoint(-10.75F, -25.2F, 3.0F);
/*     */     
/* 648 */     this.slideModel[36].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 649 */     this.slideModel[36].setRotationPoint(37.0F, -21.2F, 7.0F);
/*     */     
/* 651 */     this.slideModel[37].addShapeBox(0.0F, -3.0F, -4.0F, 1, 4, 2, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 652 */     this.slideModel[37].setRotationPoint(43.0F, -20.2F, 1.0F);
/*     */     
/* 654 */     this.slideModel[38].addShapeBox(0.0F, -3.0F, -4.0F, 1, 4, 2, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 655 */     this.slideModel[38].setRotationPoint(43.0F, -20.2F, 5.0F);
/*     */     
/* 657 */     this.slideModel[39].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 658 */     this.slideModel[39].setRotationPoint(43.0F, -16.2F, 1.0F);
/*     */     
/* 660 */     this.slideModel[40].addShapeBox(0.0F, -3.0F, -4.0F, 1, 2, 2, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 661 */     this.slideModel[40].setRotationPoint(43.0F, -20.2F, 3.0F);
/*     */     
/* 663 */     this.slideModel[41].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.125F, 0.0F);
/* 664 */     this.slideModel[41].setRotationPoint(43.0F, -25.2F, 1.0F);
/*     */     
/* 666 */     this.slideModel[42].addShapeBox(0.0F, -3.0F, -4.0F, 1, 4, 1, 0.0F, 0.0F, 0.375F, -0.375F, 0.0F, 0.375F, -0.375F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, -0.375F, 0.0F, 0.375F, -0.375F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F);
/* 667 */     this.slideModel[42].setRotationPoint(43.0F, -24.2F, 6.0F);
/*     */     
/* 669 */     this.slideModel[43].addShapeBox(0.0F, -3.0F, -4.0F, 1, 4, 1, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, -0.375F, 0.0F, 0.375F, -0.375F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, -0.375F, 0.0F, 0.375F, -0.375F);
/* 670 */     this.slideModel[43].setRotationPoint(43.0F, -24.2F, 1.0F);
/*     */     
/* 672 */     this.slideModel[44].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 673 */     this.slideModel[44].setRotationPoint(-7.5F, -26.2F, 0.0F);
/*     */     
/* 675 */     this.slideModel[45].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 4, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 676 */     this.slideModel[45].setRotationPoint(-9.0F, -26.2F, 2.0F);
/*     */     
/* 678 */     this.slideModel[46].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 679 */     this.slideModel[46].setRotationPoint(-9.0F, -26.95F, 2.0F);
/*     */     
/* 681 */     this.slideModel[47].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 682 */     this.slideModel[47].setRotationPoint(-9.0F, -26.95F, 4.0F);
/*     */     
/* 684 */     this.slideModel[48].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 685 */     this.slideModel[48].setRotationPoint(22.0F, -26.95F, 4.0F);
/*     */     
/* 687 */     this.slideModel[49].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 688 */     this.slideModel[49].setRotationPoint(22.0F, -26.95F, 2.0F);
/*     */     
/* 690 */     this.slideModel[50].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 4, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 691 */     this.slideModel[50].setRotationPoint(22.0F, -26.2F, 2.0F);
/*     */     
/* 693 */     this.slideModel[51].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 1, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F);
/* 694 */     this.slideModel[51].setRotationPoint(22.0F, -26.58F, 6.0F);
/*     */     
/* 696 */     this.slideModel[52].addShapeBox(0.0F, -3.0F, -4.0F, 22, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F);
/* 697 */     this.slideModel[52].setRotationPoint(22.0F, -26.58F, 1.0F);
/*     */     
/* 699 */     this.slideModel[53].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 700 */     this.slideModel[53].setRotationPoint(-5.5F, -26.2F, 0.0F);
/*     */     
/* 702 */     this.slideModel[54].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 703 */     this.slideModel[54].setRotationPoint(-1.5F, -26.2F, 0.0F);
/*     */     
/* 705 */     this.slideModel[55].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 706 */     this.slideModel[55].setRotationPoint(-3.5F, -26.2F, 0.0F);
/*     */     
/* 708 */     this.slideModel[56].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 709 */     this.slideModel[56].setRotationPoint(4.5F, -26.2F, 0.0F);
/*     */     
/* 711 */     this.slideModel[57].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 712 */     this.slideModel[57].setRotationPoint(6.5F, -26.2F, 0.0F);
/*     */     
/* 714 */     this.slideModel[58].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 715 */     this.slideModel[58].setRotationPoint(2.5F, -26.2F, 0.0F);
/*     */     
/* 717 */     this.slideModel[59].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 718 */     this.slideModel[59].setRotationPoint(0.5F, -26.2F, 0.0F);
/*     */     
/* 720 */     this.slideModel[60].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 721 */     this.slideModel[60].setRotationPoint(7.5F, -26.2F, 1.0F);
/*     */     
/* 723 */     this.slideModel[61].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 724 */     this.slideModel[61].setRotationPoint(5.5F, -26.2F, 1.0F);
/*     */     
/* 726 */     this.slideModel[62].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 727 */     this.slideModel[62].setRotationPoint(1.5F, -26.2F, 1.0F);
/*     */     
/* 729 */     this.slideModel[63].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 730 */     this.slideModel[63].setRotationPoint(3.5F, -26.2F, 1.0F);
/*     */     
/* 732 */     this.slideModel[64].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 733 */     this.slideModel[64].setRotationPoint(-6.5F, -26.2F, 1.0F);
/*     */     
/* 735 */     this.slideModel[65].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 736 */     this.slideModel[65].setRotationPoint(-4.5F, -26.2F, 1.0F);
/*     */     
/* 738 */     this.slideModel[66].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 739 */     this.slideModel[66].setRotationPoint(-2.5F, -26.2F, 1.0F);
/*     */     
/* 741 */     this.slideModel[67].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 742 */     this.slideModel[67].setRotationPoint(-0.5F, -26.2F, 1.0F);
/*     */     
/* 744 */     this.slideModel[68].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 745 */     this.slideModel[68].setRotationPoint(-7.5F, -26.2F, 6.0F);
/*     */     
/* 747 */     this.slideModel[69].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 748 */     this.slideModel[69].setRotationPoint(-6.5F, -26.2F, 6.0F);
/*     */     
/* 750 */     this.slideModel[70].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 751 */     this.slideModel[70].setRotationPoint(-4.5F, -26.2F, 6.0F);
/*     */     
/* 753 */     this.slideModel[71].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 754 */     this.slideModel[71].setRotationPoint(-5.5F, -26.2F, 6.0F);
/*     */     
/* 756 */     this.slideModel[72].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 757 */     this.slideModel[72].setRotationPoint(-0.5F, -26.2F, 6.0F);
/*     */     
/* 759 */     this.slideModel[73].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 760 */     this.slideModel[73].setRotationPoint(-1.5F, -26.2F, 6.0F);
/*     */     
/* 762 */     this.slideModel[74].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 763 */     this.slideModel[74].setRotationPoint(-2.5F, -26.2F, 6.0F);
/*     */     
/* 765 */     this.slideModel[75].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 766 */     this.slideModel[75].setRotationPoint(-3.5F, -26.2F, 6.0F);
/*     */     
/* 768 */     this.slideModel[76].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 769 */     this.slideModel[76].setRotationPoint(7.5F, -26.2F, 6.0F);
/*     */     
/* 771 */     this.slideModel[77].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 772 */     this.slideModel[77].setRotationPoint(6.5F, -26.2F, 6.0F);
/*     */     
/* 774 */     this.slideModel[78].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 775 */     this.slideModel[78].setRotationPoint(5.5F, -26.2F, 6.0F);
/*     */     
/* 777 */     this.slideModel[79].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 778 */     this.slideModel[79].setRotationPoint(4.5F, -26.2F, 6.0F);
/*     */     
/* 780 */     this.slideModel[80].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 781 */     this.slideModel[80].setRotationPoint(3.5F, -26.2F, 6.0F);
/*     */     
/* 783 */     this.slideModel[81].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 784 */     this.slideModel[81].setRotationPoint(2.5F, -26.2F, 6.0F);
/*     */     
/* 786 */     this.slideModel[82].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 787 */     this.slideModel[82].setRotationPoint(1.5F, -26.2F, 6.0F);
/*     */     
/* 789 */     this.slideModel[83].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 790 */     this.slideModel[83].setRotationPoint(0.5F, -26.2F, 6.0F);
/*     */     
/* 792 */     this.slideModel[84].addShapeBox(0.0F, -3.0F, -4.0F, 4, 1, 2, 0.0F, -0.16F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 793 */     this.slideModel[84].setRotationPoint(8.5F, -26.2F, 6.0F);
/*     */     
/* 795 */     this.slideModel[85].addShapeBox(0.0F, -3.0F, -4.0F, 4, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 796 */     this.slideModel[85].setRotationPoint(8.5F, -26.2F, 0.0F);
/*     */     
/* 798 */     this.slideModel[86].addBox(0.0F, -3.0F, -4.0F, 5, 3, 7, 0.0F);
/* 799 */     this.slideModel[86].setRotationPoint(29.0F, -21.2F, 0.0F);
/*     */     
/* 801 */     this.slideModel[87].addBox(0.0F, -3.0F, -4.0F, 3, 3, 8, 0.0F);
/* 802 */     this.slideModel[87].setRotationPoint(34.0F, -21.2F, 0.0F);
/*     */     
/* 804 */     this.slideModel[88].addShapeBox(0.0F, -3.0F, -4.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 805 */     this.slideModel[88].setRotationPoint(29.0F, -21.2F, 7.0F);
/*     */     
/* 807 */     this.slideModel[89].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 808 */     this.slideModel[89].setRotationPoint(29.0F, -19.2F, 7.0F);
/*     */     
/* 810 */     this.slideModel[90].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 811 */     this.slideModel[90].setRotationPoint(32.0F, -19.2F, 7.0F);
/*     */     
/* 813 */     this.slideModel[91].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 814 */     this.slideModel[91].setRotationPoint(31.0F, -19.2F, 7.0F);
/*     */     
/* 816 */     this.slideModel[92].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 817 */     this.slideModel[92].setRotationPoint(37.0F, -14.95F, 2.0F);
/*     */     
/* 819 */     this.slideModel[93].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F);
/* 820 */     this.slideModel[93].setRotationPoint(37.0F, -14.32F, 1.0F);
/*     */     
/* 822 */     this.slideModel[94].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 1, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, 0.38F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F);
/* 823 */     this.slideModel[94].setRotationPoint(37.0F, -14.32F, 6.0F);
/*     */     
/* 825 */     this.slideModel[95].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 826 */     this.slideModel[95].setRotationPoint(37.0F, -13.95F, 4.0F);
/*     */     
/* 828 */     this.slideModel[96].addShapeBox(0.0F, -3.0F, -4.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 829 */     this.slideModel[96].setRotationPoint(37.0F, -13.95F, 2.0F);
/*     */     
/* 831 */     this.slideModel[97].addShapeBox(0.0F, -3.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 832 */     this.slideModel[97].setRotationPoint(13.0F, -25.3F, 1.25F);
/*     */     
/* 834 */     this.slideModel[98].addBox(0.0F, -3.0F, -4.0F, 9, 4, 5, 0.0F);
/* 835 */     this.slideModel[98].setRotationPoint(13.0F, -24.3F, 1.25F);
/*     */     
/* 837 */     this.slideModel[99].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.07F, -0.625F, 0.0F, 0.07F, -0.625F, 0.0F, 0.16F, -0.25F, 0.0F, -0.16F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 838 */     this.slideModel[99].setRotationPoint(-8.5F, -26.2F, 1.0F);
/*     */     
/* 840 */     this.slideModel[100].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.16F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.07F, -0.625F, 0.0F, -0.07F, -0.625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 841 */     this.slideModel[100].setRotationPoint(-8.5F, -26.2F, 6.0F);
/*     */     
/* 843 */     this.slideModel[101].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.16F, -0.25F, 0.0F, 0.44F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6666666F, 0.0F, 0.0F);
/* 844 */     this.slideModel[101].setRotationPoint(-9.5F, -26.2F, 0.0F);
/*     */     
/* 846 */     this.slideModel[102].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 4, 0.0F, -0.67F, -0.25F, -1.0F, -0.95F, -0.25F, 0.0F, -0.95F, -0.25F, 0.0F, -0.67F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -1.17F, 0.0F, 0.0F, -1.17F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F);
/* 847 */     this.slideModel[102].setRotationPoint(-11.0F, -26.2F, 2.0F);
/*     */     
/* 849 */     this.slideModel[103].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, -0.75F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -1.0F, 0.0F, -1.05F, -1.0F, 0.0F, -0.67F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F);
/* 850 */     this.slideModel[103].setRotationPoint(-11.0F, -26.95F, 5.0F);
/*     */     
/* 852 */     this.slideModel[104].addShapeBox(0.0F, -3.0F, -4.0F, 1, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 853 */     this.slideModel[104].setRotationPoint(-10.0F, -25.2F, 1.0F);
/*     */     
/* 855 */     this.slideModel[105].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.075F, -0.875F, -0.125F, -0.66666F, -0.125F, -0.125F, -0.66666F, -0.125F, -0.125F, -0.075F, -0.875F, -0.125F, -0.075F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.075F, -0.125F, -0.125F);
/* 856 */     this.slideModel[105].setRotationPoint(-7.4F, -27.5F, 2.5F);
/*     */     
/* 858 */     this.slideModel[106].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.075F, -0.875F, -0.125F, -0.66666F, -0.125F, -0.125F, -0.66666F, -0.125F, -0.125F, -0.075F, -0.875F, -0.125F, -0.075F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.075F, -0.125F, -0.125F);
/* 859 */     this.slideModel[106].setRotationPoint(-7.4F, -27.5F, 4.5F);
/*     */     
/* 861 */     this.slideModel[107].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 1, 0.0F, -0.075F, -0.875F, -0.125F, -0.66666F, -0.125F, -0.125F, -0.66666F, -0.125F, -0.125F, -0.075F, -0.875F, -0.125F, -0.075F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.075F, -0.125F, -0.125F);
/* 862 */     this.slideModel[107].setRotationPoint(39.6F, -27.5F, 3.5F);
/*     */     
/* 864 */     this.slideModel[108].addShapeBox(0.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, 0.44F, -0.25F, 0.0F, 0.16F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.6666666F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 865 */     this.slideModel[108].setRotationPoint(-9.5F, -26.2F, 6.0F);
/*     */     
/* 867 */     this.slideModel[109].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, -1.05F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.875F, 0.0F, -0.75F, -0.875F, 0.0F, -1.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.67F, 0.0F, 0.0F);
/* 868 */     this.slideModel[109].setRotationPoint(-11.0F, -26.95F, 2.0F);
/*     */     
/* 870 */     this.slideModel[110].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, -0.82F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.875F, 0.0F, -0.82F, -0.875F, 0.0F, -0.73F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.73F, 0.0F, 0.0F);
/* 871 */     this.slideModel[110].setRotationPoint(-11.0F, -27.08F, 3.0F);
/*     */     
/* 873 */     this.slideModel[111].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 2, 0.0F, -0.75F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, -0.75F, -0.875F, 0.0F, -0.67F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.67F, 0.0F, 0.0F);
/* 874 */     this.slideModel[111].setRotationPoint(-11.0F, -26.95F, 3.0F);
/*     */     
/* 876 */     this.slideModel[112].addShapeBox(0.0F, -3.0F, -4.0F, 2, 1, 1, 0.0F, -0.82F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -1.0F, 0.0F, -0.82F, -1.0F, 0.0F, -0.73F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.73F, 0.0F, 0.0F);
/* 877 */     this.slideModel[112].setRotationPoint(-11.0F, -27.08F, 4.0F);
/*     */     
/*     */ 
/*     */ 
/* 881 */     translateAll(0.0F, -23.0F, 0.0F);
/* 882 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/*     */ 
/* 885 */     this.gunSlideDistance = 1.8F;
/* 886 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 888 */     this.tiltGun = 7.0F;
/* 889 */     this.rotateGunVertical = 3.0F;
/* 890 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 892 */     this.rotateClipVertical = 5.0F;
/* 893 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/*     */     
/* 895 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelp227r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */