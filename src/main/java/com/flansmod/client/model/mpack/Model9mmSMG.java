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
/*     */ public class Model9mmSMG
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Model9mmSMG()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[85];
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
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
/*     */     
/* 108 */     this.gunModel[0].addShapeBox(0.0F, -6.5F, -1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 109 */     this.gunModel[0].setRotationPoint(0.0F, 2.25F, 0.0F);
/*     */     
/* 111 */     this.gunModel[1].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 2, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 112 */     this.gunModel[1].setRotationPoint(4.0F, 4.25F, 0.0F);
/*     */     
/* 114 */     this.gunModel[2].addShapeBox(0.0F, -6.5F, -1.0F, 5, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 115 */     this.gunModel[2].setRotationPoint(6.0F, -1.75F, 0.0F);
/*     */     
/* 117 */     this.gunModel[3].addShapeBox(0.0F, -6.5F, -1.0F, 8, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 118 */     this.gunModel[3].setRotationPoint(-2.0F, -1.75F, 0.0F);
/*     */     
/* 120 */     this.gunModel[4].addShapeBox(0.0F, -6.5F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 121 */     this.gunModel[4].setRotationPoint(-1.0F, 2.25F, 0.0F);
/*     */     
/* 123 */     this.gunModel[5].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 124 */     this.gunModel[5].setRotationPoint(-2.0F, 2.25F, 0.0F);
/*     */     
/* 126 */     this.gunModel[6].addShapeBox(0.0F, -6.5F, -1.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 127 */     this.gunModel[6].setRotationPoint(-2.0F, 0.75F, 2.0F);
/*     */     
/* 129 */     this.gunModel[7].addShapeBox(0.0F, -6.5F, -1.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 130 */     this.gunModel[7].setRotationPoint(-2.0F, -0.25F, 2.0F);
/*     */     
/* 132 */     this.gunModel[8].addShapeBox(0.0F, -6.5F, -1.0F, 14, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 133 */     this.gunModel[8].setRotationPoint(-2.0F, -1.25F, 2.0F);
/*     */     
/* 135 */     this.gunModel[9].addShapeBox(0.0F, -6.5F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 136 */     this.gunModel[9].setRotationPoint(-2.0F, -0.25F, -1.0F);
/*     */     
/* 138 */     this.gunModel[10].addShapeBox(0.0F, -6.5F, -1.0F, 9, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 139 */     this.gunModel[10].setRotationPoint(-2.0F, -1.25F, -1.0F);
/*     */     
/* 141 */     this.gunModel[11].addShapeBox(0.0F, -6.5F, -1.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 142 */     this.gunModel[11].setRotationPoint(-2.0F, 0.75F, -1.0F);
/*     */     
/* 144 */     this.gunModel[12].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 145 */     this.gunModel[12].setRotationPoint(12.0F, 1.0F, -0.75F);
/*     */     
/* 147 */     this.gunModel[13].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 148 */     this.gunModel[13].setRotationPoint(12.0F, -0.5F, -0.75F);
/*     */     
/* 150 */     this.gunModel[14].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 151 */     this.gunModel[14].setRotationPoint(12.0F, -1.5F, -0.75F);
/*     */     
/* 153 */     this.gunModel[15].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 154 */     this.gunModel[15].setRotationPoint(12.0F, 1.0F, 1.75F);
/*     */     
/* 156 */     this.gunModel[16].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 157 */     this.gunModel[16].setRotationPoint(12.0F, -1.5F, 1.75F);
/*     */     
/* 159 */     this.gunModel[17].addShapeBox(0.0F, -6.5F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 160 */     this.gunModel[17].setRotationPoint(12.0F, -1.0F, 0.25F);
/*     */     
/* 162 */     this.gunModel[18].addShapeBox(0.0F, -6.5F, -1.0F, 5, 1, 2, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 163 */     this.gunModel[18].setRotationPoint(-1.0F, -2.75F, 0.0F);
/*     */     
/* 165 */     this.gunModel[19].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 166 */     this.gunModel[19].setRotationPoint(12.0F, -0.5F, 1.25F);
/*     */     
/* 168 */     this.gunModel[20].addShapeBox(0.0F, -6.5F, -1.0F, 7, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 169 */     this.gunModel[20].setRotationPoint(26.0F, 0.0F, 0.75F);
/*     */     
/* 171 */     this.gunModel[21].addShapeBox(0.0F, -6.5F, -1.0F, 1, 2, 1, 0.0F, -1.0F, 1.75F, 0.5F, 0.5F, 1.75F, 0.5F, 0.5F, 1.75F, 0.0F, -1.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[21].setRotationPoint(26.0F, -2.5F, 0.75F);
/*     */     
/* 174 */     this.gunModel[22].addShapeBox(0.0F, -6.5F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 1.75F, 0.5F, -0.5F, 1.75F, 0.5F, -0.5F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 175 */     this.gunModel[22].setRotationPoint(27.5F, -2.5F, 0.75F);
/*     */     
/* 177 */     this.gunModel[23].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 178 */     this.gunModel[23].setRotationPoint(27.0F, -4.75F, -0.5F);
/*     */     
/* 180 */     this.gunModel[24].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 181 */     this.gunModel[24].setRotationPoint(27.0F, -4.75F, 0.75F);
/*     */     
/* 183 */     this.gunModel[25].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 184 */     this.gunModel[25].setRotationPoint(27.0F, -4.75F, 0.1F);
/*     */     
/* 186 */     this.gunModel[26].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 187 */     this.gunModel[26].setRotationPoint(3.0F, 2.25F, 0.0F);
/*     */     
/* 189 */     this.gunModel[27].addShapeBox(0.0F, -6.5F, -1.0F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 190 */     this.gunModel[27].setRotationPoint(11.0F, -1.75F, 0.0F);
/*     */     
/* 192 */     this.gunModel[28].addShapeBox(0.0F, -6.5F, -1.0F, 5, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 193 */     this.gunModel[28].setRotationPoint(-2.0F, 5.25F, 0.0F);
/*     */     
/* 195 */     this.gunModel[29].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 196 */     this.gunModel[29].setRotationPoint(3.0F, 4.25F, 0.0F);
/*     */     
/* 198 */     this.gunModel[30].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 199 */     this.gunModel[30].setRotationPoint(3.0F, 3.25F, 0.0F);
/*     */     
/* 201 */     this.gunModel[31].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 202 */     this.gunModel[31].setRotationPoint(3.35F, 2.75F, 0.5F);
/*     */     
/* 204 */     this.gunModel[32].addShapeBox(0.0F, -6.5F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 205 */     this.gunModel[32].setRotationPoint(6.0F, 3.25F, 2.0F);
/*     */     
/* 207 */     this.gunModel[33].addShapeBox(0.0F, -6.5F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -0.85F, 0.0F, -1.5F, -0.85F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 1.0F, -0.85F);
/* 208 */     this.gunModel[33].setRotationPoint(6.0F, 3.25F, -0.15F);
/*     */     
/* 210 */     this.gunModel[34].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.9F, 0.45F, -0.9F, -0.9F, 0.45F, -0.9F, -0.9F, -0.15F, 0.0F, -0.9F, -0.15F, 0.0F, 0.0F, 0.45F, -0.9F, 0.0F, 0.45F, -0.9F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F);
/* 211 */     this.gunModel[34].setRotationPoint(11.0F, 3.25F, 0.3F);
/*     */     
/* 213 */     this.gunModel[35].addShapeBox(0.0F, -6.5F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 214 */     this.gunModel[35].setRotationPoint(7.0F, -0.75F, -1.0F);
/*     */     
/* 216 */     this.gunModel[36].addShapeBox(0.0F, -6.5F, -1.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, -0.55F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -0.95F, 0.0F, -0.55F, -0.95F);
/* 217 */     this.gunModel[36].setRotationPoint(7.0F, 1.25F, 2.0F);
/*     */     
/* 219 */     this.gunModel[37].addShapeBox(0.0F, -2.5F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 220 */     this.gunModel[37].setRotationPoint(-1.5F, -6.25F, -0.5F);
/*     */     
/* 222 */     this.gunModel[38].addShapeBox(0.0F, -2.5F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 223 */     this.gunModel[38].setRotationPoint(-2.25F, -6.25F, -0.5F);
/*     */     
/* 225 */     this.gunModel[39].addShapeBox(0.0F, -2.5F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 226 */     this.gunModel[39].setRotationPoint(-2.25F, -6.25F, -1.5F);
/*     */     
/* 228 */     this.gunModel[40].addShapeBox(0.0F, -2.5F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F);
/* 229 */     this.gunModel[40].setRotationPoint(-2.25F, -6.25F, 0.5F);
/*     */     
/* 231 */     this.gunModel[41].addShapeBox(0.0F, -2.5F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 232 */     this.gunModel[41].setRotationPoint(-2.75F, -6.25F, -1.5F);
/*     */     
/* 234 */     this.gunModel[42].addShapeBox(0.0F, -2.5F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 235 */     this.gunModel[42].setRotationPoint(-2.75F, -6.25F, 0.5F);
/*     */     
/* 237 */     this.gunModel[43].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 238 */     this.gunModel[43].setRotationPoint(4.15F, 3.75F, 0.5F);
/*     */     
/* 240 */     this.gunModel[44].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.4F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F);
/* 241 */     this.gunModel[44].setRotationPoint(3.35F, 3.75F, 0.5F);
/*     */     
/* 243 */     this.gunModel[45].addShapeBox(0.0F, -6.5F, -1.0F, 4, 2, 1, 0.0F, 0.0F, -1.75F, -0.85F, 0.0F, -1.75F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, -0.85F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 244 */     this.gunModel[45].setRotationPoint(7.0F, -0.75F, -1.4F);
/*     */     
/* 246 */     this.gunModel[46].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 247 */     this.gunModel[46].setRotationPoint(1.5F, 2.0F, 2.0F);
/*     */     
/* 249 */     this.gunModel[47].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 250 */     this.gunModel[47].setRotationPoint(1.75F, 2.0F, 2.0F);
/*     */     
/* 252 */     this.gunModel[48].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -1.0F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 253 */     this.gunModel[48].setRotationPoint(1.25F, 2.0F, 2.0F);
/*     */     
/* 255 */     this.gunModel[49].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 256 */     this.gunModel[49].setRotationPoint(1.5F, 2.25F, 2.0F);
/*     */     
/* 258 */     this.gunModel[50].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 259 */     this.gunModel[50].setRotationPoint(1.25F, 2.25F, 2.0F);
/*     */     
/* 261 */     this.gunModel[51].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.5F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.8F, 0.5F, -0.75F, -0.8F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.8F, 0.5F, 0.0F, -0.8F);
/* 262 */     this.gunModel[51].setRotationPoint(2.25F, 2.25F, 2.0F);
/*     */     
/* 264 */     this.gunModel[52].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, -0.25F, -0.9F);
/* 265 */     this.gunModel[52].setRotationPoint(1.25F, 2.5F, 2.0F);
/*     */     
/* 267 */     this.gunModel[53].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 268 */     this.gunModel[53].setRotationPoint(1.75F, 2.5F, 2.0F);
/*     */     
/* 270 */     this.gunModel[54].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 271 */     this.gunModel[54].setRotationPoint(3.0F, -2.75F, 0.25F);
/*     */     
/* 273 */     this.gunModel[55].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.9F, 0.0F, -0.75F, -0.9F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
/* 274 */     this.gunModel[55].setRotationPoint(1.5F, 2.5F, 2.0F);
/*     */     
/* 276 */     this.gunModel[56].addShapeBox(0.0F, -6.5F, -1.0F, 13, 2, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.5F, 0.0F, 1.25F, 0.5F);
/* 277 */     this.gunModel[56].setRotationPoint(13.0F, -1.0F, 0.25F);
/*     */     
/* 279 */     this.gunModel[57].addShapeBox(0.0F, -6.5F, -1.0F, 13, 1, 1, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 280 */     this.gunModel[57].setRotationPoint(13.0F, 0.0F, -0.75F);
/*     */     
/* 282 */     this.gunModel[58].addShapeBox(0.0F, -6.5F, -1.0F, 13, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 283 */     this.gunModel[58].setRotationPoint(13.0F, -0.5F, 0.75F);
/*     */     
/* 285 */     this.gunModel[59].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 286 */     this.gunModel[59].setRotationPoint(13.0F, 1.0F, -0.75F);
/*     */     
/* 288 */     this.gunModel[60].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 289 */     this.gunModel[60].setRotationPoint(16.0F, 1.0F, -0.75F);
/*     */     
/* 291 */     this.gunModel[61].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 292 */     this.gunModel[61].setRotationPoint(20.0F, 1.0F, -0.75F);
/*     */     
/* 294 */     this.gunModel[62].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 295 */     this.gunModel[62].setRotationPoint(18.0F, 1.0F, -0.75F);
/*     */     
/* 297 */     this.gunModel[63].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 298 */     this.gunModel[63].setRotationPoint(22.0F, 1.0F, -0.75F);
/*     */     
/* 300 */     this.gunModel[64].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 301 */     this.gunModel[64].setRotationPoint(20.0F, -1.5F, -0.75F);
/*     */     
/* 303 */     this.gunModel[65].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 304 */     this.gunModel[65].setRotationPoint(22.0F, -1.5F, -0.75F);
/*     */     
/* 306 */     this.gunModel[66].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 307 */     this.gunModel[66].setRotationPoint(13.0F, -1.5F, -0.75F);
/*     */     
/* 309 */     this.gunModel[67].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 310 */     this.gunModel[67].setRotationPoint(18.0F, 1.0F, 1.75F);
/*     */     
/* 312 */     this.gunModel[68].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 313 */     this.gunModel[68].setRotationPoint(20.0F, 1.0F, 1.75F);
/*     */     
/* 315 */     this.gunModel[69].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 316 */     this.gunModel[69].setRotationPoint(22.0F, 1.0F, 1.75F);
/*     */     
/* 318 */     this.gunModel[70].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 319 */     this.gunModel[70].setRotationPoint(13.0F, 1.0F, 1.75F);
/*     */     
/* 321 */     this.gunModel[71].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 322 */     this.gunModel[71].setRotationPoint(16.0F, 1.0F, 1.75F);
/*     */     
/* 324 */     this.gunModel[72].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 325 */     this.gunModel[72].setRotationPoint(22.0F, -1.5F, 1.75F);
/*     */     
/* 327 */     this.gunModel[73].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 328 */     this.gunModel[73].setRotationPoint(18.0F, -1.5F, 1.75F);
/*     */     
/* 330 */     this.gunModel[74].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 331 */     this.gunModel[74].setRotationPoint(20.0F, -1.5F, 1.75F);
/*     */     
/* 333 */     this.gunModel[75].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 334 */     this.gunModel[75].setRotationPoint(16.0F, -1.5F, 1.75F);
/*     */     
/* 336 */     this.gunModel[76].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 337 */     this.gunModel[76].setRotationPoint(13.0F, -1.5F, 1.75F);
/*     */     
/* 339 */     this.gunModel[77].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 340 */     this.gunModel[77].setRotationPoint(16.0F, -1.5F, -0.75F);
/*     */     
/* 342 */     this.gunModel[78].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 343 */     this.gunModel[78].setRotationPoint(18.0F, -1.5F, -0.75F);
/*     */     
/* 345 */     this.gunModel[79].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 346 */     this.gunModel[79].setRotationPoint(24.0F, 1.0F, 1.75F);
/*     */     
/* 348 */     this.gunModel[80].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 349 */     this.gunModel[80].setRotationPoint(24.0F, -1.5F, 1.75F);
/*     */     
/* 351 */     this.gunModel[81].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 352 */     this.gunModel[81].setRotationPoint(24.0F, 1.0F, -0.75F);
/*     */     
/* 354 */     this.gunModel[82].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 355 */     this.gunModel[82].setRotationPoint(24.0F, -1.5F, -0.75F);
/*     */     
/* 357 */     this.gunModel[83].addShapeBox(0.0F, -6.5F, -1.0F, 7, 1, 1, 0.0F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F);
/* 358 */     this.gunModel[83].setRotationPoint(-14.0F, 1.1F, 0.55F);
/*     */     
/* 360 */     this.gunModel[84].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 361 */     this.gunModel[84].setRotationPoint(-15.0F, 1.3F, 1.45F);
/*     */     
/*     */ 
/* 364 */     this.defaultScopeModel = new ModelRendererTurbo[16];
/* 365 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 366 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 367 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 368 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 369 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 370 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 371 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 372 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 373 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 374 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 375 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 376 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 377 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 378 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/* 379 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/* 380 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*     */     
/* 382 */     this.defaultScopeModel[0].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 383 */     this.defaultScopeModel[0].setRotationPoint(10.5F, -2.75F, 0.0F);
/*     */     
/* 385 */     this.defaultScopeModel[1].addShapeBox(0.0F, -6.5F, -1.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 386 */     this.defaultScopeModel[1].setRotationPoint(11.0F, -3.75F, 0.0F);
/*     */     
/* 388 */     this.defaultScopeModel[2].addShapeBox(0.0F, -6.5F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 389 */     this.defaultScopeModel[2].setRotationPoint(2.0F, -4.75F, 1.5F);
/*     */     
/* 391 */     this.defaultScopeModel[3].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 392 */     this.defaultScopeModel[3].setRotationPoint(11.75F, -4.75F, 0.0F);
/*     */     
/* 394 */     this.defaultScopeModel[4].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 395 */     this.defaultScopeModel[4].setRotationPoint(1.0F, -4.75F, 1.5F);
/*     */     
/* 397 */     this.defaultScopeModel[5].addShapeBox(0.0F, -6.5F, -1.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 398 */     this.defaultScopeModel[5].setRotationPoint(2.0F, -4.75F, 0.0F);
/*     */     
/* 400 */     this.defaultScopeModel[6].addShapeBox(0.0F, -6.5F, -1.0F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 401 */     this.defaultScopeModel[6].setRotationPoint(2.0F, -4.75F, 0.5F);
/*     */     
/* 403 */     this.defaultScopeModel[7].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 404 */     this.defaultScopeModel[7].setRotationPoint(0.0F, -4.75F, 1.5F);
/*     */     
/* 406 */     this.defaultScopeModel[8].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 407 */     this.defaultScopeModel[8].setRotationPoint(1.0F, -4.75F, 0.0F);
/*     */     
/* 409 */     this.defaultScopeModel[9].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 410 */     this.defaultScopeModel[9].setRotationPoint(0.0F, -4.75F, 0.0F);
/*     */     
/* 412 */     this.defaultScopeModel[10].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 413 */     this.defaultScopeModel[10].setRotationPoint(0.0F, -4.75F, 0.5F);
/*     */     
/* 415 */     this.defaultScopeModel[11].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 416 */     this.defaultScopeModel[11].setRotationPoint(0.0F, -5.25F, -0.25F);
/*     */     
/* 418 */     this.defaultScopeModel[12].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 419 */     this.defaultScopeModel[12].setRotationPoint(0.0F, -5.25F, 0.5F);
/*     */     
/* 421 */     this.defaultScopeModel[13].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/* 422 */     this.defaultScopeModel[13].setRotationPoint(0.0F, -5.25F, 0.25F);
/*     */     
/* 424 */     this.defaultScopeModel[14].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F);
/* 425 */     this.defaultScopeModel[14].setRotationPoint(0.0F, -4.4F, 0.25F);
/*     */     
/* 427 */     this.defaultScopeModel[15].addShapeBox(0.0F, -6.5F, -1.0F, 5, 1, 2, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 428 */     this.defaultScopeModel[15].setRotationPoint(-0.75F, -3.75F, 0.0F);
/*     */     
/*     */ 
/* 431 */     this.defaultStockModel = new ModelRendererTurbo[50];
/* 432 */     this.defaultStockModel[0] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/* 433 */     this.defaultStockModel[1] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 434 */     this.defaultStockModel[2] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/* 435 */     this.defaultStockModel[3] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/* 436 */     this.defaultStockModel[4] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 437 */     this.defaultStockModel[5] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 438 */     this.defaultStockModel[6] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 439 */     this.defaultStockModel[7] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/* 440 */     this.defaultStockModel[8] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/* 441 */     this.defaultStockModel[9] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/* 442 */     this.defaultStockModel[10] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 443 */     this.defaultStockModel[11] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 444 */     this.defaultStockModel[12] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/* 445 */     this.defaultStockModel[13] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/* 446 */     this.defaultStockModel[14] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 447 */     this.defaultStockModel[15] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/* 448 */     this.defaultStockModel[16] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 449 */     this.defaultStockModel[17] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 450 */     this.defaultStockModel[18] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 451 */     this.defaultStockModel[19] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/* 452 */     this.defaultStockModel[20] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/* 453 */     this.defaultStockModel[21] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/* 454 */     this.defaultStockModel[22] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 455 */     this.defaultStockModel[23] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 456 */     this.defaultStockModel[24] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/* 457 */     this.defaultStockModel[25] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 458 */     this.defaultStockModel[26] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/* 459 */     this.defaultStockModel[27] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/* 460 */     this.defaultStockModel[28] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/* 461 */     this.defaultStockModel[29] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/* 462 */     this.defaultStockModel[30] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/* 463 */     this.defaultStockModel[31] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/* 464 */     this.defaultStockModel[32] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/* 465 */     this.defaultStockModel[33] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/* 466 */     this.defaultStockModel[34] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/* 467 */     this.defaultStockModel[35] = new ModelRendererTurbo(this, 241, 25, this.textureX, this.textureY);
/* 468 */     this.defaultStockModel[36] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/* 469 */     this.defaultStockModel[37] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/* 470 */     this.defaultStockModel[38] = new ModelRendererTurbo(this, 281, 25, this.textureX, this.textureY);
/* 471 */     this.defaultStockModel[39] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
/* 472 */     this.defaultStockModel[40] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/* 473 */     this.defaultStockModel[41] = new ModelRendererTurbo(this, 313, 25, this.textureX, this.textureY);
/* 474 */     this.defaultStockModel[42] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/* 475 */     this.defaultStockModel[43] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/* 476 */     this.defaultStockModel[44] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/* 477 */     this.defaultStockModel[45] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/* 478 */     this.defaultStockModel[46] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/* 479 */     this.defaultStockModel[47] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/* 480 */     this.defaultStockModel[48] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/* 481 */     this.defaultStockModel[49] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*     */     
/* 483 */     this.defaultStockModel[0].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 484 */     this.defaultStockModel[0].setRotationPoint(-7.0F, -0.25F, 1.25F);
/*     */     
/* 486 */     this.defaultStockModel[1].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 487 */     this.defaultStockModel[1].setRotationPoint(-7.0F, -0.95F, 1.25F);
/*     */     
/* 489 */     this.defaultStockModel[2].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F);
/* 490 */     this.defaultStockModel[2].setRotationPoint(-7.0F, 0.45F, 1.25F);
/*     */     
/* 492 */     this.defaultStockModel[3].addShapeBox(0.0F, -6.5F, -1.0F, 3, 2, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 493 */     this.defaultStockModel[3].setRotationPoint(-7.0F, -0.95F, 0.55F);
/*     */     
/* 495 */     this.defaultStockModel[4].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 496 */     this.defaultStockModel[4].setRotationPoint(-7.0F, -0.95F, -0.15F);
/*     */     
/* 498 */     this.defaultStockModel[5].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 499 */     this.defaultStockModel[5].setRotationPoint(-7.0F, -0.25F, -0.15F);
/*     */     
/* 501 */     this.defaultStockModel[6].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 502 */     this.defaultStockModel[6].setRotationPoint(-7.0F, 0.45F, -0.15F);
/*     */     
/* 504 */     this.defaultStockModel[7].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 505 */     this.defaultStockModel[7].setRotationPoint(-3.0F, -1.15F, 1.45F);
/*     */     
/* 507 */     this.defaultStockModel[8].addShapeBox(0.0F, -6.5F, -1.0F, 1, 3, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F);
/* 508 */     this.defaultStockModel[8].setRotationPoint(-3.0F, -1.15F, 0.55F);
/*     */     
/* 510 */     this.defaultStockModel[9].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 511 */     this.defaultStockModel[9].setRotationPoint(-3.0F, -1.15F, -0.35F);
/*     */     
/* 513 */     this.defaultStockModel[10].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 514 */     this.defaultStockModel[10].setRotationPoint(-3.0F, -0.25F, 1.45F);
/*     */     
/* 516 */     this.defaultStockModel[11].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F);
/* 517 */     this.defaultStockModel[11].setRotationPoint(-3.0F, 0.65F, 1.45F);
/*     */     
/* 519 */     this.defaultStockModel[12].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 520 */     this.defaultStockModel[12].setRotationPoint(-3.0F, -0.25F, -0.35F);
/*     */     
/* 522 */     this.defaultStockModel[13].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 523 */     this.defaultStockModel[13].setRotationPoint(-3.0F, 0.65F, -0.35F);
/*     */     
/* 525 */     this.defaultStockModel[14].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F);
/* 526 */     this.defaultStockModel[14].setRotationPoint(-4.0F, -0.25F, 1.25F);
/*     */     
/* 528 */     this.defaultStockModel[15].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.45F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F);
/* 529 */     this.defaultStockModel[15].setRotationPoint(-4.0F, -0.95F, 1.25F);
/*     */     
/* 531 */     this.defaultStockModel[16].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.5F, -0.15F, 0.0F, -0.85F, -0.15F);
/* 532 */     this.defaultStockModel[16].setRotationPoint(-4.0F, 0.45F, 1.25F);
/*     */     
/* 534 */     this.defaultStockModel[17].addShapeBox(0.0F, -6.5F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, 0.25F, -0.15F, 0.0F, 0.55F, -0.15F, 0.0F, 0.55F, -0.15F, 0.0F, 0.25F, -0.15F);
/* 535 */     this.defaultStockModel[17].setRotationPoint(-4.0F, -0.95F, 0.55F);
/*     */     
/* 537 */     this.defaultStockModel[18].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.15F, 0.0F, -0.45F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 538 */     this.defaultStockModel[18].setRotationPoint(-4.0F, -0.95F, -0.15F);
/*     */     
/* 540 */     this.defaultStockModel[19].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 541 */     this.defaultStockModel[19].setRotationPoint(-4.0F, -0.25F, -0.15F);
/*     */     
/* 543 */     this.defaultStockModel[20].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, 0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.85F, -0.15F, 0.0F, -0.45F, -0.15F, 0.0F, 0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 544 */     this.defaultStockModel[20].setRotationPoint(-4.0F, 0.45F, -0.15F);
/*     */     
/* 546 */     this.defaultStockModel[21].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 547 */     this.defaultStockModel[21].setRotationPoint(-15.0F, -0.9F, 1.45F);
/*     */     
/* 549 */     this.defaultStockModel[22].addShapeBox(0.0F, -6.5F, -1.0F, 6, 3, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F);
/* 550 */     this.defaultStockModel[22].setRotationPoint(-13.0F, -0.9F, 0.55F);
/*     */     
/* 552 */     this.defaultStockModel[23].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 553 */     this.defaultStockModel[23].setRotationPoint(-15.0F, -0.9F, -0.35F);
/*     */     
/* 555 */     this.defaultStockModel[24].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F);
/* 556 */     this.defaultStockModel[24].setRotationPoint(-15.0F, 0.0F, 1.45F);
/*     */     
/* 558 */     this.defaultStockModel[25].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F);
/* 559 */     this.defaultStockModel[25].setRotationPoint(-15.0F, 0.4F, 1.45F);
/*     */     
/* 561 */     this.defaultStockModel[26].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F, 0.0F, -0.55F, -0.05F);
/* 562 */     this.defaultStockModel[26].setRotationPoint(-15.0F, 0.0F, -0.35F);
/*     */     
/* 564 */     this.defaultStockModel[27].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F);
/* 565 */     this.defaultStockModel[27].setRotationPoint(-15.0F, 0.4F, -0.35F);
/*     */     
/* 567 */     this.defaultStockModel[28].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.95F, -0.55F, 0.0F, -0.95F, -0.55F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, -0.55F, 0.0F, -0.05F, -0.55F);
/* 568 */     this.defaultStockModel[28].setRotationPoint(-15.0F, -1.8F, 1.05F);
/*     */     
/* 570 */     this.defaultStockModel[29].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.95F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.5F, 0.0F, -0.05F, -0.5F);
/* 571 */     this.defaultStockModel[29].setRotationPoint(-15.0F, -1.8F, 0.55F);
/*     */     
/* 573 */     this.defaultStockModel[30].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.25F, -0.15F, -0.75F, -0.25F, -0.15F, -0.75F, -0.25F, -0.15F, 0.0F, -0.25F, -0.15F);
/* 574 */     this.defaultStockModel[30].setRotationPoint(-7.0F, 1.05F, 0.55F);
/*     */     
/* 576 */     this.defaultStockModel[31].addShapeBox(0.0F, -6.5F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 577 */     this.defaultStockModel[31].setRotationPoint(-15.0F, 0.3F, 1.45F);
/*     */     
/* 579 */     this.defaultStockModel[32].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 580 */     this.defaultStockModel[32].setRotationPoint(-15.0F, 1.3F, 0.35F);
/*     */     
/* 582 */     this.defaultStockModel[33].addShapeBox(0.0F, -6.5F, -1.0F, 7, 1, 1, 0.0F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.05F, 0.0F, -0.45F, -0.75F, 0.0F, -0.45F, -0.75F);
/* 583 */     this.defaultStockModel[33].setRotationPoint(-14.0F, 1.3F, 0.35F);
/*     */     
/* 585 */     this.defaultStockModel[34].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.05F, 0.15F, -0.75F, -0.05F, 0.15F, -0.75F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 586 */     this.defaultStockModel[34].setRotationPoint(-10.0F, 1.6F, 0.55F);
/*     */     
/* 588 */     this.defaultStockModel[35].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.25F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.25F, -0.25F, 0.15F, 0.25F, -0.05F, 0.15F, -0.5F, -0.05F, 0.15F, -0.5F, -0.05F, 0.15F, 0.25F, -0.05F, 0.15F);
/* 589 */     this.defaultStockModel[35].setRotationPoint(-9.75F, 2.3F, 0.55F);
/*     */     
/* 591 */     this.defaultStockModel[36].addShapeBox(0.0F, -6.5F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 592 */     this.defaultStockModel[36].setRotationPoint(-15.0F, 2.3F, 0.55F);
/*     */     
/* 594 */     this.defaultStockModel[37].addShapeBox(0.0F, -6.5F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, -0.25F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, 0.45F, 0.15F, -0.25F, -0.75F, 0.15F, -0.25F, -0.75F, 0.15F, 0.0F, 0.45F, 0.15F);
/* 595 */     this.defaultStockModel[37].setRotationPoint(-15.0F, 3.0F, 0.55F);
/*     */     
/* 597 */     this.defaultStockModel[38].addShapeBox(0.0F, -6.5F, -1.0F, 2, 3, 1, 0.0F, 0.0F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, 0.2F, 0.4F, -0.5F, -2.0F, 0.4F, -0.5F, -2.0F, 0.4F, 0.0F, 0.2F, 0.4F);
/* 598 */     this.defaultStockModel[38].setRotationPoint(-15.0F, 3.0F, 0.55F);
/*     */     
/* 600 */     this.defaultStockModel[39].addShapeBox(0.0F, -6.5F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.25F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 601 */     this.defaultStockModel[39].setRotationPoint(-13.0F, 1.6F, 0.55F);
/*     */     
/* 603 */     this.defaultStockModel[40].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.15F, -0.75F, -0.5F, 0.15F, -0.75F, -0.5F, 0.15F, 0.0F, -0.5F, 0.15F, 0.0F, -0.3F, 0.15F, -0.75F, -0.3F, 0.15F, -0.75F, -0.3F, 0.15F, 0.0F, -0.3F, 0.15F);
/* 604 */     this.defaultStockModel[40].setRotationPoint(-15.0F, 1.35F, 0.55F);
/*     */     
/* 606 */     this.defaultStockModel[41].addShapeBox(0.0F, -6.5F, -1.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F, 0.0F, -0.5F, 0.4F, 0.0F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, 0.0F, -1.0F, 0.4F);
/* 607 */     this.defaultStockModel[41].setRotationPoint(-11.0F, 2.5F, 0.55F);
/*     */     
/* 609 */     this.defaultStockModel[42].addShapeBox(0.0F, -6.5F, -1.0F, 2, 2, 1, 0.0F, 0.0F, -0.75F, 0.4F, -0.5F, -0.75F, 0.4F, -0.5F, -0.75F, 0.4F, 0.0F, -0.75F, 0.4F, 0.0F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, -0.25F, -1.0F, 0.4F, 0.0F, -1.0F, 0.4F);
/* 610 */     this.defaultStockModel[42].setRotationPoint(-11.0F, 2.0F, 0.55F);
/*     */     
/* 612 */     this.defaultStockModel[43].addShapeBox(0.0F, -6.5F, -1.0F, 2, 3, 1, 0.0F, 0.0F, -1.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, 0.0F, -1.25F, 0.4F, 0.0F, -1.0F, 0.4F, -0.25F, -2.0F, 0.4F, -0.25F, -2.0F, 0.4F, 0.0F, -1.0F, 0.4F);
/* 613 */     this.defaultStockModel[43].setRotationPoint(-12.75F, 2.5F, 0.55F);
/*     */     
/* 615 */     this.defaultStockModel[44].addShapeBox(0.0F, -6.5F, -1.0F, 1, 7, 1, 0.0F, -0.5F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 616 */     this.defaultStockModel[44].setRotationPoint(-16.0F, -0.9F, 0.55F);
/*     */     
/* 618 */     this.defaultStockModel[45].addShapeBox(0.0F, -6.5F, -1.0F, 1, 7, 1, 0.0F, -0.5F, -0.8F, -0.05F, 0.0F, -0.8F, -0.05F, 0.0F, -0.05F, -0.05F, -0.5F, -0.05F, -0.05F, -0.5F, 0.1F, -0.55F, 0.0F, 0.1F, -0.55F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 619 */     this.defaultStockModel[45].setRotationPoint(-16.0F, -0.9F, -0.35F);
/*     */     
/* 621 */     this.defaultStockModel[46].addShapeBox(0.0F, -6.5F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.45F, 0.15F, 0.0F, -0.45F, 0.15F, 0.0F, -0.45F, 0.15F, 0.0F, -0.45F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F, 0.0F, -0.05F, 0.15F);
/* 622 */     this.defaultStockModel[46].setRotationPoint(-15.0F, 1.6F, 0.55F);
/*     */     
/* 624 */     this.defaultStockModel[47].addShapeBox(0.0F, -6.5F, -1.0F, 1, 7, 1, 0.0F, -0.5F, -0.05F, -0.05F, 0.0F, -0.05F, -0.05F, 0.0F, -0.8F, -0.05F, -0.5F, -0.8F, -0.05F, -0.5F, 0.1F, -0.05F, 0.0F, 0.1F, -0.05F, 0.0F, 0.1F, -0.55F, -0.5F, 0.1F, -0.55F);
/* 625 */     this.defaultStockModel[47].setRotationPoint(-16.0F, -0.9F, 1.45F);
/*     */     
/* 627 */     this.defaultStockModel[48].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, -0.5F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -1.1F, -0.05F, -0.5F, -1.1F, -0.05F, -0.5F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 628 */     this.defaultStockModel[48].setRotationPoint(-16.0F, -1.95F, 0.55F);
/*     */     
/* 630 */     this.defaultStockModel[49].addShapeBox(0.0F, -6.5F, -1.0F, 1, 1, 1, 0.0F, -0.5F, -1.1F, -0.5F, 0.0F, -1.1F, -0.5F, 0.0F, -0.85F, -0.05F, -0.5F, -0.85F, -0.05F, -0.5F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.05F, -0.5F, 0.1F, -0.05F);
/* 631 */     this.defaultStockModel[49].setRotationPoint(-16.0F, -1.95F, 0.1F);
/*     */     
/*     */ 
/* 634 */     this.ammoModel = new ModelRendererTurbo[1];
/* 635 */     this.ammoModel[0] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*     */     
/* 637 */     this.ammoModel[0].addShapeBox(0.0F, -6.5F, -1.0F, 2, 10, 1, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.6F, 0.15F, 0.0F, 0.6F, 0.15F, 0.5F, 0.0F, 0.15F, 0.5F, 0.0F, 0.15F, 0.5F, 0.6F, 0.15F, 0.5F, 0.6F);
/* 638 */     this.ammoModel[0].setRotationPoint(7.0F, 1.75F, 0.2F);
/*     */     
/*     */ 
/*     */ 
/* 642 */     this.scopeAttachPoint = new Vector3f(0.4375F, 0.75F, 0.0F);
/* 643 */     this.gripAttachPoint = new Vector3f(1.1875F, 0.375F, 0.0F);
/*     */     
/* 645 */     translateAll(0.0F, -3.75F, 0.0F);
/* 646 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*     */     
/* 648 */     this.gunSlideDistance = 0.0F;
/* 649 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/* 651 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Model9mmSMG.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */