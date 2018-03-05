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
/*     */ public class Modelpp2000
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelpp2000()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[63];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*     */     
/*  86 */     this.gunModel[0].addBox(-5.0F, -10.0F, -1.5F, 14, 2, 3, 0.0F);
/*  87 */     this.gunModel[0].setRotationPoint(-2.0F, 1.0F, 0.0F);
/*     */     
/*  89 */     this.gunModel[1].addShapeBox(-5.0F, -10.0F, -1.5F, 15, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  90 */     this.gunModel[1].setRotationPoint(-2.0F, 2.0F, -1.0F);
/*     */     
/*  92 */     this.gunModel[2].addShapeBox(-5.0F, -10.0F, -1.5F, 15, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  93 */     this.gunModel[2].setRotationPoint(-2.0F, 2.0F, 3.0F);
/*     */     
/*  95 */     this.gunModel[3].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  96 */     this.gunModel[3].setRotationPoint(-1.0F, 1.0F, -1.0F);
/*     */     
/*  98 */     this.gunModel[4].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  99 */     this.gunModel[4].setRotationPoint(-2.0F, 0.0F, -1.0F);
/*     */     
/* 101 */     this.gunModel[5].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 102 */     this.gunModel[5].setRotationPoint(-2.0F, 1.0F, -1.0F);
/*     */     
/* 104 */     this.gunModel[6].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 105 */     this.gunModel[6].setRotationPoint(0.0F, 1.0F, -1.0F);
/*     */     
/* 107 */     this.gunModel[7].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 108 */     this.gunModel[7].setRotationPoint(0.0F, 1.0F, 3.0F);
/*     */     
/* 110 */     this.gunModel[8].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 111 */     this.gunModel[8].setRotationPoint(-1.0F, 1.0F, 3.0F);
/*     */     
/* 113 */     this.gunModel[9].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 114 */     this.gunModel[9].setRotationPoint(-2.0F, 1.0F, 3.0F);
/*     */     
/* 116 */     this.gunModel[10].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 117 */     this.gunModel[10].setRotationPoint(-2.0F, 0.0F, 3.0F);
/*     */     
/* 119 */     this.gunModel[11].addShapeBox(-5.0F, -10.0F, -1.5F, 14, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[11].setRotationPoint(-2.0F, 0.0F, 0.0F);
/*     */     
/* 122 */     this.gunModel[12].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[12].setRotationPoint(-2.0F, -0.5F, 1.0F);
/*     */     
/* 125 */     this.gunModel[13].addShapeBox(-5.0F, -10.0F, -1.5F, 14, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 126 */     this.gunModel[13].setRotationPoint(-2.0F, -0.5F, 0.0F);
/*     */     
/* 128 */     this.gunModel[14].addShapeBox(-5.0F, -10.0F, -1.5F, 14, 1, 1, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 129 */     this.gunModel[14].setRotationPoint(-2.0F, -0.5F, 1.0F);
/*     */     
/* 131 */     this.gunModel[15].addShapeBox(-5.0F, -10.0F, -1.5F, 14, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 132 */     this.gunModel[15].setRotationPoint(-2.0F, -0.5F, 2.0F);
/*     */     
/* 134 */     this.gunModel[16].addBox(-5.0F, -10.0F, -1.5F, 3, 4, 4, 0.0F);
/* 135 */     this.gunModel[16].setRotationPoint(-5.0F, 0.0F, -0.5F);
/*     */     
/* 137 */     this.gunModel[17].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 3, 4, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 138 */     this.gunModel[17].setRotationPoint(-6.0F, 0.0F, -0.5F);
/*     */     
/* 140 */     this.gunModel[18].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 141 */     this.gunModel[18].setRotationPoint(13.0F, 2.0F, -1.0F);
/*     */     
/* 143 */     this.gunModel[19].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 144 */     this.gunModel[19].setRotationPoint(13.0F, 2.0F, 3.0F);
/*     */     
/* 146 */     this.gunModel[20].addShapeBox(-5.0F, -10.0F, -1.5F, 8, 2, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 147 */     this.gunModel[20].setRotationPoint(12.0F, 2.0F, 0.0F);
/*     */     
/* 149 */     this.gunModel[21].addShapeBox(-5.0F, -10.0F, -1.5F, 8, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 150 */     this.gunModel[21].setRotationPoint(12.0F, 1.75F, 1.2F);
/*     */     
/* 152 */     this.gunModel[22].addBox(-5.0F, -10.0F, -1.5F, 1, 2, 2, 0.0F);
/* 153 */     this.gunModel[22].setRotationPoint(20.0F, 1.0F, 0.5F);
/*     */     
/* 155 */     this.gunModel[23].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 156 */     this.gunModel[23].setRotationPoint(20.0F, 0.0F, 0.5F);
/*     */     
/* 158 */     this.gunModel[24].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 159 */     this.gunModel[24].setRotationPoint(20.0F, -1.0F, 0.5F);
/*     */     
/* 161 */     this.gunModel[25].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 162 */     this.gunModel[25].setRotationPoint(20.0F, -1.5F, 2.0F);
/*     */     
/* 164 */     this.gunModel[26].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 165 */     this.gunModel[26].setRotationPoint(20.0F, -1.5F, 0.25F);
/*     */     
/* 167 */     this.gunModel[27].addShapeBox(-5.0F, -10.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 168 */     this.gunModel[27].setRotationPoint(20.0F, -1.5F, 0.13F);
/*     */     
/* 170 */     this.gunModel[28].addShapeBox(-5.0F, -10.0F, -1.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
/* 171 */     this.gunModel[28].setRotationPoint(12.0F, 0.2F, 1.0F);
/*     */     
/* 173 */     this.gunModel[29].addShapeBox(-5.0F, -10.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 174 */     this.gunModel[29].setRotationPoint(18.3F, 0.35F, 1.15F);
/*     */     
/* 176 */     this.gunModel[30].addBox(-5.0F, -10.0F, -1.5F, 1, 4, 4, 0.0F);
/* 177 */     this.gunModel[30].setRotationPoint(-6.0F, 3.0F, -0.5F);
/*     */     
/* 179 */     this.gunModel[31].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 180 */     this.gunModel[31].setRotationPoint(19.0F, 4.0F, 0.0F);
/*     */     
/* 182 */     this.gunModel[32].addBox(-5.0F, -10.0F, -1.5F, 14, 1, 3, 0.0F);
/* 183 */     this.gunModel[32].setRotationPoint(-2.0F, 3.0F, 0.0F);
/*     */     
/* 185 */     this.gunModel[33].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 186 */     this.gunModel[33].setRotationPoint(15.0F, 4.0F, 0.25F);
/*     */     
/* 188 */     this.gunModel[34].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 189 */     this.gunModel[34].setRotationPoint(16.0F, 4.0F, 0.25F);
/*     */     
/* 191 */     this.gunModel[35].addBox(-5.0F, -10.0F, -1.5F, 3, 8, 3, 0.0F);
/* 192 */     this.gunModel[35].setRotationPoint(5.0F, 4.0F, 0.0F);
/*     */     
/* 194 */     this.gunModel[36].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 195 */     this.gunModel[36].setRotationPoint(8.0F, 11.0F, 0.0F);
/*     */     
/* 197 */     this.gunModel[37].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 7, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 198 */     this.gunModel[37].setRotationPoint(4.0F, 5.0F, 0.0F);
/*     */     
/* 200 */     this.gunModel[38].addShapeBox(-5.0F, -10.0F, -1.5F, 8, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F);
/* 201 */     this.gunModel[38].setRotationPoint(8.0F, 7.0F, 0.25F);
/*     */     
/* 203 */     this.gunModel[39].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -1.0F, 0.5F);
/* 204 */     this.gunModel[39].setRotationPoint(16.0F, 9.0F, 0.25F);
/*     */     
/* 206 */     this.gunModel[40].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 207 */     this.gunModel[40].setRotationPoint(14.0F, 4.0F, 0.25F);
/*     */     
/* 209 */     this.gunModel[41].addShapeBox(-5.0F, -10.0F, -1.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 210 */     this.gunModel[41].setRotationPoint(8.0F, 6.0F, 0.25F);
/*     */     
/* 212 */     this.gunModel[42].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 213 */     this.gunModel[42].setRotationPoint(16.0F, 5.0F, 0.25F);
/*     */     
/* 215 */     this.gunModel[43].addBox(-5.0F, -10.0F, -1.5F, 7, 1, 4, 0.0F);
/* 216 */     this.gunModel[43].setRotationPoint(-2.0F, 4.0F, -0.5F);
/*     */     
/* 218 */     this.gunModel[44].addShapeBox(-5.0F, -10.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 219 */     this.gunModel[44].setRotationPoint(6.0F, 4.0F, 3.0F);
/*     */     
/* 221 */     this.gunModel[45].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 222 */     this.gunModel[45].setRotationPoint(5.0F, 4.0F, 3.0F);
/*     */     
/* 224 */     this.gunModel[46].addShapeBox(-5.0F, -10.0F, -1.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 225 */     this.gunModel[46].setRotationPoint(-6.0F, 7.0F, -0.5F);
/*     */     
/* 227 */     this.gunModel[47].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 228 */     this.gunModel[47].setRotationPoint(-3.0F, 6.0F, -0.5F);
/*     */     
/* 230 */     this.gunModel[48].addBox(-5.0F, -10.0F, -1.5F, 2, 3, 4, 0.0F);
/* 231 */     this.gunModel[48].setRotationPoint(-5.0F, 4.0F, -0.5F);
/*     */     
/* 233 */     this.gunModel[49].addBox(-5.0F, -10.0F, -1.5F, 1, 2, 4, 0.0F);
/* 234 */     this.gunModel[49].setRotationPoint(-3.0F, 4.0F, -0.5F);
/*     */     
/* 236 */     this.gunModel[50].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 237 */     this.gunModel[50].setRotationPoint(-2.0F, 6.0F, -0.5F);
/*     */     
/* 239 */     this.gunModel[51].addShapeBox(-5.0F, -10.0F, -1.5F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 240 */     this.gunModel[51].setRotationPoint(-1.0F, 5.0F, -0.5F);
/*     */     
/* 242 */     this.gunModel[52].addShapeBox(-5.0F, -10.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 243 */     this.gunModel[52].setRotationPoint(5.0F, 4.0F, -0.5F);
/*     */     
/* 245 */     this.gunModel[53].addShapeBox(-5.0F, -10.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 246 */     this.gunModel[53].setRotationPoint(21.0F, 1.75F, 1.2F);
/*     */     
/* 248 */     this.gunModel[54].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 249 */     this.gunModel[54].setRotationPoint(9.5F, 4.0F, 0.7F);
/*     */     
/* 251 */     this.gunModel[55].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 252 */     this.gunModel[55].setRotationPoint(-7.0F, 3.0F, -1.0F);
/*     */     
/* 254 */     this.gunModel[56].addBox(-5.0F, -10.0F, -1.5F, 1, 1, 4, 0.0F);
/* 255 */     this.gunModel[56].setRotationPoint(-2.0F, 5.0F, -0.5F);
/*     */     
/* 257 */     this.gunModel[57].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 258 */     this.gunModel[57].setRotationPoint(-7.0F, 4.5F, -1.0F);
/*     */     
/* 260 */     this.gunModel[58].addBox(-5.0F, -10.0F, -1.5F, 18, 1, 1, 0.0F);
/* 261 */     this.gunModel[58].setRotationPoint(-6.0F, 3.0F, -1.5F);
/*     */     
/* 263 */     this.gunModel[59].addShapeBox(-5.0F, -10.0F, -1.5F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 264 */     this.gunModel[59].setRotationPoint(10.0F, 4.0F, -1.5F);
/*     */     
/* 266 */     this.gunModel[60].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 267 */     this.gunModel[60].setRotationPoint(-7.0F, 7.0F, -1.0F);
/*     */     
/* 269 */     this.gunModel[61].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 270 */     this.gunModel[61].setRotationPoint(-6.75F, 6.0F, -1.25F);
/*     */     
/* 272 */     this.gunModel[62].addShapeBox(-5.0F, -10.0F, -1.5F, 14, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 273 */     this.gunModel[62].setRotationPoint(-2.0F, -1.25F, 1.0F);
/*     */     
/*     */ 
/* 276 */     this.defaultScopeModel = new ModelRendererTurbo[4];
/* 277 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 278 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 279 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 280 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*     */     
/* 282 */     this.defaultScopeModel[0].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 283 */     this.defaultScopeModel[0].setRotationPoint(11.0F, -1.75F, 0.5F);
/*     */     
/* 285 */     this.defaultScopeModel[1].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 286 */     this.defaultScopeModel[1].setRotationPoint(11.0F, -1.75F, 2.25F);
/*     */     
/* 288 */     this.defaultScopeModel[2].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, -0.5F, -0.6F, 0.25F, 0.0F, -0.6F, 0.25F, 0.0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F);
/* 289 */     this.defaultScopeModel[2].setRotationPoint(11.0F, -1.75F, 2.0F);
/*     */     
/* 291 */     this.defaultScopeModel[3].addShapeBox(-5.0F, -10.0F, -1.5F, 1, 1, 1, 0.0F, -0.5F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 292 */     this.defaultScopeModel[3].setRotationPoint(11.0F, -1.75F, 0.75F);
/*     */     
/*     */ 
/* 295 */     this.ammoModel = new ModelRendererTurbo[1];
/* 296 */     this.ammoModel[0] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*     */     
/* 298 */     this.ammoModel[0].addShapeBox(6.0F, -5.0F, -3.5F, 3, 9, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
/* 299 */     this.ammoModel[0].setRotationPoint(-6.1F, 1.0F, 2.5F);
/*     */     
/*     */ 
/*     */ 
/* 303 */     translateAll(0.0F, -6.75F, 0.0F);
/* 304 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 306 */     this.gunSlideDistance = 0.0F;
/* 307 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 309 */     this.tiltGun = 7.0F;
/* 310 */     this.rotateGunVertical = 3.0F;
/* 311 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 313 */     this.rotateClipVertical = 5.0F;
/* 314 */     this.translateClip = new Vector3f(0.0F, -8.0F, 0.0F);
/*     */     
/*     */ 
/* 317 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelpp2000.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */