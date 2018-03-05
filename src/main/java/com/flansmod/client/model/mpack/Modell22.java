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
/*     */ public class Modell22
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modell22()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[54];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*     */     
/*  77 */     this.gunModel[0].addShapeBox(4.0F, -5.0F, 1.5F, 18, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  78 */     this.gunModel[0].setRotationPoint(-18.0F, 0.0F, -2.5F);
/*     */     
/*  80 */     this.gunModel[1].addBox(4.0F, -5.0F, 1.5F, 4, 1, 1, 0.0F);
/*  81 */     this.gunModel[1].setRotationPoint(0.0F, -0.65F, -2.0F);
/*     */     
/*  83 */     this.gunModel[2].addShapeBox(4.0F, -5.0F, 1.5F, 4, 2, 2, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  84 */     this.gunModel[2].setRotationPoint(-13.0F, 2.0F, -2.5F);
/*     */     
/*  86 */     this.gunModel[3].addShapeBox(4.0F, -5.0F, 1.5F, 15, 1, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  87 */     this.gunModel[3].setRotationPoint(-15.0F, 0.0F, -0.5F);
/*     */     
/*  89 */     this.gunModel[4].addShapeBox(4.0F, -5.0F, 1.5F, 15, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F);
/*  90 */     this.gunModel[4].setRotationPoint(-15.0F, 0.0F, -2.75F);
/*     */     
/*  92 */     this.gunModel[5].addShapeBox(4.0F, -5.0F, 1.5F, 10, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  93 */     this.gunModel[5].setRotationPoint(-18.0F, -2.0F, -2.5F);
/*     */     
/*  95 */     this.gunModel[6].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  96 */     this.gunModel[6].setRotationPoint(-0.5F, -2.0F, -2.5F);
/*     */     
/*  98 */     this.gunModel[7].addShapeBox(4.0F, -5.0F, 1.5F, 7, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  99 */     this.gunModel[7].setRotationPoint(-8.0F, -2.0F, -2.5F);
/*     */     
/* 101 */     this.gunModel[8].addShapeBox(4.0F, -5.0F, 1.5F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 102 */     this.gunModel[8].setRotationPoint(-8.0F, -1.25F, -2.5F);
/*     */     
/* 104 */     this.gunModel[9].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 105 */     this.gunModel[9].setRotationPoint(-6.0F, -1.5F, -2.5F);
/*     */     
/* 107 */     this.gunModel[10].addShapeBox(4.0F, -5.0F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 108 */     this.gunModel[10].setRotationPoint(-8.0F, -1.5F, -2.5F);
/*     */     
/* 110 */     this.gunModel[11].addShapeBox(4.0F, -5.0F, 1.5F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 111 */     this.gunModel[11].setRotationPoint(-7.0F, -1.0F, -2.75F);
/*     */     
/* 113 */     this.gunModel[12].addShapeBox(4.0F, -5.0F, 1.5F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 114 */     this.gunModel[12].setRotationPoint(-7.0F, -1.0F, -0.5F);
/*     */     
/* 116 */     this.gunModel[13].addShapeBox(4.0F, -5.0F, 1.5F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 117 */     this.gunModel[13].setRotationPoint(-8.0F, -1.0F, -2.5F);
/*     */     
/* 119 */     this.gunModel[14].addShapeBox(4.0F, -5.0F, 1.5F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[14].setRotationPoint(-18.0F, -1.0F, -2.5F);
/*     */     
/* 122 */     this.gunModel[15].addShapeBox(4.0F, -5.0F, 1.5F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/* 123 */     this.gunModel[15].setRotationPoint(-12.0F, -1.0F, -2.0F);
/*     */     
/* 125 */     this.gunModel[16].addShapeBox(4.0F, -5.0F, 1.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 126 */     this.gunModel[16].setRotationPoint(-12.0F, -0.75F, -1.5F);
/*     */     
/* 128 */     this.gunModel[17].addShapeBox(4.0F, -5.0F, 1.5F, 3, 1, 3, 0.0F, 0.0F, -0.3F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.2F, -0.25F, 0.0F, -0.3F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 129 */     this.gunModel[17].setRotationPoint(-5.0F, 1.5F, -3.0F);
/*     */     
/* 131 */     this.gunModel[18].addShapeBox(4.0F, -5.0F, 1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 132 */     this.gunModel[18].setRotationPoint(-4.0F, 2.5F, -3.25F);
/*     */     
/* 134 */     this.gunModel[19].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 135 */     this.gunModel[19].setRotationPoint(-5.0F, 2.5F, -2.25F);
/*     */     
/* 137 */     this.gunModel[20].addShapeBox(4.0F, -5.0F, 1.5F, 2, 3, 3, 0.0F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 138 */     this.gunModel[20].setRotationPoint(-4.5F, 3.5F, -3.25F);
/*     */     
/* 140 */     this.gunModel[21].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.05F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.5F, 0.05F, -0.8F, 0.5F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.1F, 0.0F, 0.5F);
/* 141 */     this.gunModel[21].setRotationPoint(-2.2F, 2.7F, -2.25F);
/*     */     
/* 143 */     this.gunModel[22].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.5F, 0.0F, -0.8F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 144 */     this.gunModel[22].setRotationPoint(-1.2F, 2.7F, -2.25F);
/*     */     
/* 146 */     this.gunModel[23].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, -0.8F, 0.25F, 0.0F, -0.8F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 147 */     this.gunModel[23].setRotationPoint(-0.2F, 2.3F, -2.25F);
/*     */     
/* 149 */     this.gunModel[24].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 150 */     this.gunModel[24].setRotationPoint(-5.0F, -1.5F, -2.5F);
/*     */     
/* 152 */     this.gunModel[25].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 153 */     this.gunModel[25].setRotationPoint(-4.0F, -1.5F, -2.5F);
/*     */     
/* 155 */     this.gunModel[26].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 156 */     this.gunModel[26].setRotationPoint(-3.0F, -1.5F, -2.5F);
/*     */     
/* 158 */     this.gunModel[27].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 159 */     this.gunModel[27].setRotationPoint(-2.0F, -1.5F, -2.5F);
/*     */     
/* 161 */     this.gunModel[28].addShapeBox(4.0F, -5.0F, 1.5F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 162 */     this.gunModel[28].setRotationPoint(-18.0F, 3.0F, -2.5F);
/*     */     
/* 164 */     this.gunModel[29].addShapeBox(4.0F, -5.0F, 1.5F, 6, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F);
/* 165 */     this.gunModel[29].setRotationPoint(-16.5F, -2.0F, -2.75F);
/*     */     
/* 167 */     this.gunModel[30].addShapeBox(4.0F, -5.0F, 1.5F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 168 */     this.gunModel[30].setRotationPoint(-15.5F, -1.0F, -2.75F);
/*     */     
/* 170 */     this.gunModel[31].addShapeBox(4.0F, -5.0F, 1.5F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 171 */     this.gunModel[31].setRotationPoint(-16.5F, -1.75F, -2.75F);
/*     */     
/* 173 */     this.gunModel[32].addShapeBox(4.0F, -5.0F, 1.5F, 1, 3, 2, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 174 */     this.gunModel[32].setRotationPoint(-19.0F, 1.0F, -2.5F);
/*     */     
/* 176 */     this.gunModel[33].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 177 */     this.gunModel[33].setRotationPoint(-19.0F, -1.25F, -2.5F);
/*     */     
/* 179 */     this.gunModel[34].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 180 */     this.gunModel[34].setRotationPoint(-1.5F, 2.0F, -1.75F);
/*     */     
/* 182 */     this.gunModel[35].addShapeBox(4.0F, -5.0F, 1.5F, 6, 1, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 183 */     this.gunModel[35].setRotationPoint(0.0F, 1.0F, -2.5F);
/*     */     
/* 185 */     this.gunModel[36].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 186 */     this.gunModel[36].setRotationPoint(0.0F, -1.65F, -2.0F);
/*     */     
/* 188 */     this.gunModel[37].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 189 */     this.gunModel[37].setRotationPoint(0.0F, 0.35F, -2.0F);
/*     */     
/* 191 */     this.gunModel[38].addShapeBox(4.0F, -5.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 192 */     this.gunModel[38].setRotationPoint(2.5F, 2.25F, -1.5F);
/*     */     
/* 194 */     this.gunModel[39].addShapeBox(4.0F, -5.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F);
/* 195 */     this.gunModel[39].setRotationPoint(3.0F, 2.25F, -1.5F);
/*     */     
/* 197 */     this.gunModel[40].addShapeBox(4.0F, -5.0F, 1.5F, 1, 3, 1, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 198 */     this.gunModel[40].setRotationPoint(3.0F, 2.25F, -2.5F);
/*     */     
/* 200 */     this.gunModel[41].addShapeBox(4.0F, -5.0F, 1.5F, 1, 3, 1, 0.0F, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 201 */     this.gunModel[41].setRotationPoint(2.5F, 2.25F, -2.5F);
/*     */     
/* 203 */     this.gunModel[42].addShapeBox(4.0F, -5.0F, 1.5F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 204 */     this.gunModel[42].setRotationPoint(3.0F, 2.0F, -2.5F);
/*     */     
/* 206 */     this.gunModel[43].addShapeBox(4.0F, -5.0F, 1.5F, 2, 1, 1, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.15F, 0.0F, 0.15F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 207 */     this.gunModel[43].setRotationPoint(4.0F, -0.58F, -2.12F);
/*     */     
/* 209 */     this.gunModel[44].addShapeBox(0.0F, 6.0F, 0.0F, 2, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 210 */     this.gunModel[44].setRotationPoint(-3.0F, -13.75F, -0.75F);
/*     */     
/* 212 */     this.gunModel[45].addShapeBox(0.0F, 6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 213 */     this.gunModel[45].setRotationPoint(-2.0F, -14.25F, 0.5F);
/*     */     
/* 215 */     this.gunModel[46].addShapeBox(0.0F, 6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[46].setRotationPoint(-2.0F, -14.25F, -1.5F);
/*     */     
/* 218 */     this.gunModel[47].addShapeBox(0.0F, 6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 219 */     this.gunModel[47].setRotationPoint(-2.0F, -14.25F, -0.5F);
/*     */     
/* 221 */     this.gunModel[48].addShapeBox(0.0F, 6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 222 */     this.gunModel[48].setRotationPoint(-2.0F, -14.75F, -1.0F);
/*     */     
/* 224 */     this.gunModel[49].addShapeBox(0.0F, 6.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 225 */     this.gunModel[49].setRotationPoint(-2.0F, -14.75F, 0.5F);
/*     */     
/* 227 */     this.gunModel[50].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 228 */     this.gunModel[50].setRotationPoint(0.0F, -2.65F, -2.0F);
/*     */     
/* 230 */     this.gunModel[51].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.8F, 0.0F, -0.5F, -0.8F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
/* 231 */     this.gunModel[51].setRotationPoint(0.0F, -3.65F, -2.0F);
/*     */     
/* 233 */     this.gunModel[52].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.8F, 0.0F, -0.5F, -0.8F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
/* 234 */     this.gunModel[52].setRotationPoint(0.0F, -3.65F, -1.2F);
/*     */     
/* 236 */     this.gunModel[53].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 1, 0.0F, 0.0F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
/* 237 */     this.gunModel[53].setRotationPoint(0.0F, -3.65F, -1.6F);
/*     */     
/*     */ 
/* 240 */     this.ammoModel = new ModelRendererTurbo[2];
/* 241 */     this.ammoModel[0] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/* 242 */     this.ammoModel[1] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*     */     
/* 244 */     this.ammoModel[0].addShapeBox(4.0F, -5.0F, 1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.8F, -0.25F, 0.0F, 0.8F);
/* 245 */     this.ammoModel[0].setRotationPoint(-13.0F, 4.0F, -2.38F);
/*     */     
/* 247 */     this.ammoModel[1].addShapeBox(4.0F, -5.0F, 1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.8F, -1.0F, 0.0F, 0.8F);
/* 248 */     this.ammoModel[1].setRotationPoint(-12.75F, 6.0F, -2.38F);
/*     */     
/*     */ 
/* 251 */     this.slideModel = new ModelRendererTurbo[1];
/* 252 */     this.slideModel[0] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*     */     
/* 254 */     this.slideModel[0].addShapeBox(4.0F, -5.0F, 1.5F, 1, 1, 2, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 255 */     this.slideModel[0].setRotationPoint(-9.0F, -0.75F, -4.0F);
/*     */     
/*     */ 
/*     */ 
/* 259 */     translateAll(0.0F, -3.0F, 0.0F);
/* 260 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 262 */     this.gunSlideDistance = 0.0F;
/* 263 */     this.animationType = EnumAnimationType.CUSTOM;
/* 264 */     this.tiltGun = 15.0F;
/* 265 */     this.rotateGunVertical = 5.0F;
/* 266 */     this.rotateGunVertical = 3.0F;
/* 267 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 269 */     this.rotateClipVertical = 5.0F;
/* 270 */     this.translateClip = new Vector3f(0.0F, -3.0F, 0.0F);
/*     */     
/*     */ 
/* 273 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modell22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */