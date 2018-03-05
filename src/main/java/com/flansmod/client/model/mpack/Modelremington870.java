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
/*     */ public class Modelremington870
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelremington870()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[91];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 137, 41, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 417, 41, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/* 112 */     this.gunModel[90] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*     */     
/* 114 */     this.gunModel[0].addShapeBox(0.0F, -6.0F, 7.0F, 6, 1, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 115 */     this.gunModel[0].setRotationPoint(4.0F, -9.0F, -9.0F);
/*     */     
/* 117 */     this.gunModel[1].addShapeBox(0.0F, -6.0F, 7.0F, 6, 1, 3, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 118 */     this.gunModel[1].setRotationPoint(4.0F, -9.5F, -8.5F);
/*     */     
/* 120 */     this.gunModel[2].addShapeBox(0.0F, -6.0F, 7.0F, 22, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 121 */     this.gunModel[2].setRotationPoint(0.0F, -1.5F, -8.5F);
/*     */     
/* 123 */     this.gunModel[3].addShapeBox(0.0F, -6.0F, 7.0F, 22, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 124 */     this.gunModel[3].setRotationPoint(0.0F, -2.0F, -9.0F);
/*     */     
/* 126 */     this.gunModel[4].addShapeBox(0.0F, -6.0F, 7.0F, 18, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 127 */     this.gunModel[4].setRotationPoint(4.0F, -8.0F, -6.0F);
/*     */     
/* 129 */     this.gunModel[5].addShapeBox(0.0F, -6.0F, 7.0F, 22, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 130 */     this.gunModel[5].setRotationPoint(0.0F, -5.0F, -9.0F);
/*     */     
/* 132 */     this.gunModel[6].addShapeBox(0.0F, -6.0F, 7.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 133 */     this.gunModel[6].setRotationPoint(4.0F, -8.0F, -9.0F);
/*     */     
/* 135 */     this.gunModel[7].addShapeBox(0.0F, -6.0F, 7.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 136 */     this.gunModel[7].setRotationPoint(20.0F, -8.0F, -9.0F);
/*     */     
/* 138 */     this.gunModel[8].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 139 */     this.gunModel[8].setRotationPoint(20.0F, -9.5F, -8.5F);
/*     */     
/* 141 */     this.gunModel[9].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 142 */     this.gunModel[9].setRotationPoint(20.0F, -9.0F, -9.0F);
/*     */     
/* 144 */     this.gunModel[10].addShapeBox(0.0F, -6.0F, 7.0F, 10, 1, 3, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 145 */     this.gunModel[10].setRotationPoint(10.0F, -9.5F, -8.5F);
/*     */     
/* 147 */     this.gunModel[11].addShapeBox(0.0F, -6.0F, 7.0F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 148 */     this.gunModel[11].setRotationPoint(10.0F, -9.0F, -6.0F);
/*     */     
/* 150 */     this.gunModel[12].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 151 */     this.gunModel[12].setRotationPoint(10.0F, -9.0F, -9.0F);
/*     */     
/* 153 */     this.gunModel[13].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 154 */     this.gunModel[13].setRotationPoint(18.0F, -9.0F, -9.0F);
/*     */     
/* 156 */     this.gunModel[14].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 157 */     this.gunModel[14].setRotationPoint(18.0F, -5.5F, -9.0F);
/*     */     
/* 159 */     this.gunModel[15].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 160 */     this.gunModel[15].setRotationPoint(10.0F, -5.5F, -9.0F);
/*     */     
/* 162 */     this.gunModel[16].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 163 */     this.gunModel[16].setRotationPoint(10.0F, -6.5F, -9.0F);
/*     */     
/* 165 */     this.gunModel[17].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 166 */     this.gunModel[17].setRotationPoint(10.0F, -8.0F, -9.0F);
/*     */     
/* 168 */     this.gunModel[18].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 169 */     this.gunModel[18].setRotationPoint(19.0F, -8.0F, -9.0F);
/*     */     
/* 171 */     this.gunModel[19].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[19].setRotationPoint(19.0F, -6.5F, -9.0F);
/*     */     
/* 174 */     this.gunModel[20].addShapeBox(0.0F, -6.0F, 7.0F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 175 */     this.gunModel[20].setRotationPoint(21.0F, -8.0F, -8.0F);
/*     */     
/* 177 */     this.gunModel[21].addShapeBox(0.0F, -6.0F, 7.0F, 6, 1, 4, 0.0F, 0.5F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0.375F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F, 1.0F, 0.0F);
/* 178 */     this.gunModel[21].setRotationPoint(-2.0F, -9.0F, -9.0F);
/*     */     
/* 180 */     this.gunModel[22].addShapeBox(0.0F, -6.0F, 7.0F, 6, 1, 3, 0.0F, 0.5625F, -1.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.5625F, -1.75F, -0.75F, 0.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F);
/* 181 */     this.gunModel[22].setRotationPoint(-2.0F, -9.5F, -8.5F);
/*     */     
/* 183 */     this.gunModel[23].addShapeBox(0.0F, -6.0F, 7.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 184 */     this.gunModel[23].setRotationPoint(0.0F, -5.0F, -6.0F);
/*     */     
/* 186 */     this.gunModel[24].addShapeBox(0.0F, -6.0F, 7.0F, 6, 3, 4, 0.0F, 0.375F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.375F, -1.0F, 0.0F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F);
/* 187 */     this.gunModel[24].setRotationPoint(-2.0F, -8.0F, -9.0F);
/*     */     
/* 189 */     this.gunModel[25].addShapeBox(0.0F, -6.0F, 7.0F, 10, 4, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 190 */     this.gunModel[25].setRotationPoint(10.0F, -8.5F, -8.0F);
/*     */     
/* 192 */     this.gunModel[26].addShapeBox(0.0F, -6.0F, 7.0F, 10, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 193 */     this.gunModel[26].setRotationPoint(10.0F, -4.5F, -8.0F);
/*     */     
/* 195 */     this.gunModel[27].addShapeBox(0.0F, -6.0F, 7.0F, 6, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 196 */     this.gunModel[27].setRotationPoint(4.0F, -8.0F, -8.0F);
/*     */     
/* 198 */     this.gunModel[28].addShapeBox(0.0F, -6.0F, 7.0F, 2, 3, 4, 0.0F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F);
/* 199 */     this.gunModel[28].setRotationPoint(-2.0F, -5.0F, -9.0F);
/*     */     
/* 201 */     this.gunModel[29].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 4, 0.0F, 0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 202 */     this.gunModel[29].setRotationPoint(-1.0F, -2.0F, -9.0F);
/*     */     
/* 204 */     this.gunModel[30].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0625F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.0625F, -0.75F, -0.75F);
/* 205 */     this.gunModel[30].setRotationPoint(-1.0F, -1.5F, -8.5F);
/*     */     
/* 207 */     this.gunModel[31].addShapeBox(0.0F, -6.0F, 7.0F, 1, 2, 4, 0.0F, -0.25F, -0.125F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 208 */     this.gunModel[31].setRotationPoint(-3.25F, -7.0F, -9.0F);
/*     */     
/* 210 */     this.gunModel[32].addShapeBox(0.0F, -6.0F, 7.0F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 211 */     this.gunModel[32].setRotationPoint(-3.0F, -5.0F, -9.0F);
/*     */     
/* 213 */     this.gunModel[33].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 4, 0.0F, 0.0F, -0.125F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.125F, -0.5F, 0.0F, -0.375F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, 0.0F, -0.375F, 0.0F);
/* 214 */     this.gunModel[33].setRotationPoint(-3.0F, -7.5F, -9.0F);
/*     */     
/* 216 */     this.gunModel[34].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 3, 0.0F, -0.5F, -0.875F, -0.75F, -0.05F, -0.75F, -0.75F, -0.05F, -0.75F, -0.75F, -0.5F, -0.875F, -0.75F, -0.5F, 0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.125F, 0.0F);
/* 217 */     this.gunModel[34].setRotationPoint(-3.5F, -8.5F, -8.5F);
/*     */     
/* 219 */     this.gunModel[35].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.875F, 0.0F, 0.0F, 0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 220 */     this.gunModel[35].setRotationPoint(-3.0F, -2.0F, -9.0F);
/*     */     
/* 222 */     this.gunModel[36].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, -0.5F, -0.75F, 0.0F, 0.5125F, -0.75F, 0.0F, 0.5125F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.75F, 0.5625F, 0.0F, -0.75F, 0.5625F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F);
/* 223 */     this.gunModel[36].setRotationPoint(-3.5F, -2.25F, -8.5F);
/*     */     
/* 225 */     this.gunModel[37].addShapeBox(0.0F, -6.0F, 7.0F, 9, 1, 4, 0.0F, 0.0F, -4.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 226 */     this.gunModel[37].setRotationPoint(-12.0F, -7.88F, -9.0F);
/*     */     
/* 228 */     this.gunModel[38].addShapeBox(0.0F, -6.0F, 7.0F, 9, 1, 3, 0.0F, 0.0F, -4.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -4.75F, -0.75F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 229 */     this.gunModel[38].setRotationPoint(-12.0F, -8.38F, -8.5F);
/*     */     
/* 231 */     this.gunModel[39].addShapeBox(0.0F, -6.0F, 7.0F, 9, 4, 4, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 232 */     this.gunModel[39].setRotationPoint(-12.0F, -6.88F, -9.0F);
/*     */     
/* 234 */     this.gunModel[40].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 3, 0.0F, -0.5F, -1.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, -0.5F, 0.5F, -0.75F);
/* 235 */     this.gunModel[40].setRotationPoint(-6.5F, -2.25F, -8.5F);
/*     */     
/* 237 */     this.gunModel[41].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 238 */     this.gunModel[41].setRotationPoint(-6.0F, -2.0F, -9.0F);
/*     */     
/* 240 */     this.gunModel[42].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 4, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 241 */     this.gunModel[42].setRotationPoint(-6.0F, -3.0F, -9.0F);
/*     */     
/* 243 */     this.gunModel[43].addShapeBox(0.0F, -6.0F, 7.0F, 6, 1, 4, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 4.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 4.0F, -0.5F);
/* 244 */     this.gunModel[43].setRotationPoint(-12.0F, -1.5F, -9.0F);
/*     */     
/* 246 */     this.gunModel[44].addShapeBox(0.0F, -6.0F, 7.0F, 6, 1, 3, 0.0F, -0.5F, -5.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -5.25F, 0.0F, -0.5F, 4.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, -0.5F, 4.5F, -0.75F);
/* 247 */     this.gunModel[44].setRotationPoint(-12.5F, -1.75F, -8.5F);
/*     */     
/* 249 */     this.gunModel[45].addShapeBox(0.0F, -6.0F, 7.0F, 6, 6, 4, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 250 */     this.gunModel[45].setRotationPoint(-12.0F, -3.0F, -9.0F);
/*     */     
/* 252 */     this.gunModel[46].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 253 */     this.gunModel[46].setRotationPoint(-15.0F, -3.88F, -9.0F);
/*     */     
/* 255 */     this.gunModel[47].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 256 */     this.gunModel[47].setRotationPoint(-15.0F, -4.88F, -9.0F);
/*     */     
/* 258 */     this.gunModel[48].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 3, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -1.75F, -0.75F, 0.0F, -1.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 259 */     this.gunModel[48].setRotationPoint(-15.0F, -5.38F, -8.5F);
/*     */     
/* 261 */     this.gunModel[49].addShapeBox(0.0F, -6.0F, 7.0F, 3, 4, 4, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 262 */     this.gunModel[49].setRotationPoint(-15.0F, -3.0F, -9.0F);
/*     */     
/* 264 */     this.gunModel[50].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 4, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, -0.5F);
/* 265 */     this.gunModel[50].setRotationPoint(-15.0F, 3.0F, -9.0F);
/*     */     
/* 267 */     this.gunModel[51].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 3, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -1.75F, -0.75F);
/* 268 */     this.gunModel[51].setRotationPoint(-15.0F, 3.5F, -8.5F);
/*     */     
/* 270 */     this.gunModel[52].addShapeBox(0.0F, -6.0F, 7.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 271 */     this.gunModel[52].setRotationPoint(-15.0F, 1.0F, -9.0F);
/*     */     
/* 273 */     this.gunModel[53].addShapeBox(0.0F, -6.0F, 7.0F, 32, 4, 4, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 274 */     this.gunModel[53].setRotationPoint(-47.0F, -3.88F, -9.0F);
/*     */     
/* 276 */     this.gunModel[54].addShapeBox(0.0F, -6.0F, 7.0F, 32, 1, 4, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 277 */     this.gunModel[54].setRotationPoint(-47.0F, -4.88F, -9.0F);
/*     */     
/* 279 */     this.gunModel[55].addShapeBox(0.0F, -6.0F, 7.0F, 32, 1, 3, 0.0F, 0.0F, -3.25F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -3.25F, -0.75F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F);
/* 280 */     this.gunModel[55].setRotationPoint(-47.0F, -5.38F, -8.5F);
/*     */     
/* 282 */     this.gunModel[56].addShapeBox(0.0F, -6.0F, 7.0F, 32, 12, 4, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 283 */     this.gunModel[56].setRotationPoint(-47.0F, 0.0F, -9.0F);
/*     */     
/* 285 */     this.gunModel[57].addShapeBox(0.0F, -6.0F, 7.0F, 32, 1, 4, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, 10.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 10.0F, -0.5F);
/* 286 */     this.gunModel[57].setRotationPoint(-47.0F, 2.0F, -9.0F);
/*     */     
/* 288 */     this.gunModel[58].addShapeBox(0.0F, -6.0F, 7.0F, 32, 1, 3, 0.0F, -0.5F, -11.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -0.5F, -11.25F, 0.0F, -0.5F, 10.5F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, -0.5F, 10.5F, -0.75F);
/* 289 */     this.gunModel[58].setRotationPoint(-47.5F, 1.75F, -8.5F);
/*     */     
/* 291 */     this.gunModel[59].addShapeBox(0.0F, -6.0F, 7.0F, 60, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 292 */     this.gunModel[59].setRotationPoint(22.0F, -7.25F, -8.5F);
/*     */     
/* 294 */     this.gunModel[60].addShapeBox(0.0F, -6.0F, 7.0F, 61, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 295 */     this.gunModel[60].setRotationPoint(22.0F, -3.75F, -8.5F);
/*     */     
/* 297 */     this.gunModel[61].addShapeBox(0.0F, -6.0F, 7.0F, 60, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 298 */     this.gunModel[61].setRotationPoint(22.0F, -8.25F, -8.5F);
/*     */     
/* 300 */     this.gunModel[62].addShapeBox(0.0F, -6.0F, 7.0F, 60, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 301 */     this.gunModel[62].setRotationPoint(22.0F, -6.25F, -8.5F);
/*     */     
/* 303 */     this.gunModel[63].addShapeBox(0.0F, -6.0F, 7.0F, 61, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 304 */     this.gunModel[63].setRotationPoint(22.0F, -2.75F, -8.5F);
/*     */     
/* 306 */     this.gunModel[64].addShapeBox(0.0F, -6.0F, 7.0F, 61, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 307 */     this.gunModel[64].setRotationPoint(22.0F, -4.75F, -8.5F);
/*     */     
/* 309 */     this.gunModel[65].addShapeBox(0.0F, -6.0F, 7.0F, 12, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 310 */     this.gunModel[65].setRotationPoint(22.0F, -5.25F, -7.5F);
/*     */     
/* 312 */     this.gunModel[66].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/* 313 */     this.gunModel[66].setRotationPoint(61.0F, -2.75F, -8.5F);
/*     */     
/* 315 */     this.gunModel[67].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 316 */     this.gunModel[67].setRotationPoint(61.0F, -4.75F, -8.5F);
/*     */     
/* 318 */     this.gunModel[68].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 319 */     this.gunModel[68].setRotationPoint(61.0F, -3.75F, -8.5F);
/*     */     
/* 321 */     this.gunModel[69].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 322 */     this.gunModel[69].setRotationPoint(61.0F, -6.0F, -8.5F);
/*     */     
/* 324 */     this.gunModel[70].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 325 */     this.gunModel[70].setRotationPoint(75.0F, -4.75F, -8.5F);
/*     */     
/* 327 */     this.gunModel[71].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 328 */     this.gunModel[71].setRotationPoint(75.0F, -3.75F, -8.5F);
/*     */     
/* 330 */     this.gunModel[72].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
/* 331 */     this.gunModel[72].setRotationPoint(75.0F, -2.75F, -8.5F);
/*     */     
/* 333 */     this.gunModel[73].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 334 */     this.gunModel[73].setRotationPoint(75.0F, -8.25F, -8.5F);
/*     */     
/* 336 */     this.gunModel[74].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 337 */     this.gunModel[74].setRotationPoint(75.0F, -7.25F, -8.5F);
/*     */     
/* 339 */     this.gunModel[75].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 340 */     this.gunModel[75].setRotationPoint(75.0F, -6.25F, -8.5F);
/*     */     
/* 342 */     this.gunModel[76].addShapeBox(0.0F, -6.0F, 7.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 343 */     this.gunModel[76].setRotationPoint(4.5F, -1.25F, -8.0F);
/*     */     
/* 345 */     this.gunModel[77].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 346 */     this.gunModel[77].setRotationPoint(3.5F, -1.25F, -8.0F);
/*     */     
/* 348 */     this.gunModel[78].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 349 */     this.gunModel[78].setRotationPoint(3.5F, 0.75F, -8.0F);
/*     */     
/* 351 */     this.gunModel[79].addShapeBox(0.0F, -6.0F, 7.0F, 3, 1, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 352 */     this.gunModel[79].setRotationPoint(0.0F, 1.25F, -8.0F);
/*     */     
/* 354 */     this.gunModel[80].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 355 */     this.gunModel[80].setRotationPoint(3.5F, 1.25F, -8.0F);
/*     */     
/* 357 */     this.gunModel[81].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/* 358 */     this.gunModel[81].setRotationPoint(-1.0F, 1.25F, -8.0F);
/*     */     
/* 360 */     this.gunModel[82].addShapeBox(0.0F, -6.0F, 7.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 361 */     this.gunModel[82].setRotationPoint(-1.25F, -0.75F, -8.0F);
/*     */     
/* 363 */     this.gunModel[83].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 364 */     this.gunModel[83].setRotationPoint(-1.25F, -1.75F, -8.0F);
/*     */     
/* 366 */     this.gunModel[84].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 367 */     this.gunModel[84].setRotationPoint(-1.75F, -1.75F, -8.0F);
/*     */     
/* 369 */     this.gunModel[85].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F);
/* 370 */     this.gunModel[85].setRotationPoint(-0.5F, -1.75F, -8.0F);
/*     */     
/* 372 */     this.gunModel[86].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 2, 0.0F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F);
/* 373 */     this.gunModel[86].setRotationPoint(-0.5F, -0.75F, -8.0F);
/*     */     
/* 375 */     this.gunModel[87].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 2, 0.0F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F);
/* 376 */     this.gunModel[87].setRotationPoint(-0.25F, 0.5F, -8.0F);
/*     */     
/* 378 */     this.gunModel[88].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
/* 379 */     this.gunModel[88].setRotationPoint(75.5F, -9.75F, -7.5F);
/*     */     
/* 381 */     this.gunModel[89].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, 0.0F);
/* 382 */     this.gunModel[89].setRotationPoint(75.5F, -9.5F, -7.5F);
/*     */     
/* 384 */     this.gunModel[90].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 1, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 385 */     this.gunModel[90].setRotationPoint(75.5F, -9.5F, -7.5F);
/*     */     
/*     */ 
/* 388 */     this.ammoModel = new ModelRendererTurbo[1];
/* 389 */     this.ammoModel[0] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*     */     
/* 391 */     this.ammoModel[0].addShapeBox(0.0F, -6.0F, 7.0F, 8, 2, 2, 0.0F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F);
/* 392 */     this.ammoModel[0].setRotationPoint(11.0F, -4.0F, -8.0F);
/*     */     
/*     */ 
/* 395 */     this.pumpModel = new ModelRendererTurbo[5];
/* 396 */     this.pumpModel[0] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/* 397 */     this.pumpModel[1] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/* 398 */     this.pumpModel[2] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 399 */     this.pumpModel[3] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 400 */     this.pumpModel[4] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*     */     
/* 402 */     this.pumpModel[0].addShapeBox(0.0F, -6.0F, 7.0F, 25, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 403 */     this.pumpModel[0].setRotationPoint(35.0F, -4.75F, -9.0F);
/*     */     
/* 405 */     this.pumpModel[1].addShapeBox(0.0F, -6.0F, 7.0F, 25, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 406 */     this.pumpModel[1].setRotationPoint(35.0F, -1.75F, -9.0F);
/*     */     
/* 408 */     this.pumpModel[2].addShapeBox(0.0F, -6.0F, 7.0F, 21, 1, 4, 0.0F, 0.0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 409 */     this.pumpModel[2].setRotationPoint(38.5F, -5.75F, -9.0F);
/*     */     
/* 411 */     this.pumpModel[3].addShapeBox(0.0F, -6.0F, 7.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 412 */     this.pumpModel[3].setRotationPoint(35.0F, -5.75F, -9.0F);
/*     */     
/* 414 */     this.pumpModel[4].addShapeBox(0.0F, -6.0F, 7.0F, 2, 1, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 415 */     this.pumpModel[4].setRotationPoint(36.5F, -5.75F, -9.0F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 420 */     translateAll(0.0F, -8.0F, 0.0F);
/* 421 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 423 */     this.gunSlideDistance = 0.0F;
/* 424 */     this.animationType = EnumAnimationType.SHOTGUN;
/* 425 */     this.pumpDelayAfterReload = 115;this.pumpDelay = 6;
/* 426 */     this.pumpTime = 9;
/* 427 */     this.gripIsOnPump = true;
/* 428 */     this.pumpHandleDistance = 0.5F;
/* 429 */     this.numBulletsInReloadAnimation = 7.0F;
/* 430 */     this.tiltGunTime = 0.159F;
/* 431 */     this.unloadClipTime = 0.0F;
/* 432 */     this.loadClipTime = 0.825F;
/* 433 */     this.untiltGunTime = 0.15F;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 438 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelremington870.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */