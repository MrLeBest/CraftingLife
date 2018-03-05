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
/*     */ public class Modelf2000
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelf2000()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[54];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*     */     
/*  77 */     this.gunModel[0].addShapeBox(-17.0F, 7.0F, -2.0F, 8, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  78 */     this.gunModel[0].setRotationPoint(1.0F, -10.0F, 0.0F);
/*     */     
/*  80 */     this.gunModel[1].addShapeBox(-17.0F, 7.0F, -2.0F, 33, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  81 */     this.gunModel[1].setRotationPoint(1.0F, -13.0F, 0.0F);
/*     */     
/*  83 */     this.gunModel[2].addShapeBox(-17.0F, 7.0F, -2.0F, 4, 4, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  84 */     this.gunModel[2].setRotationPoint(9.0F, -10.0F, 0.5F);
/*     */     
/*  86 */     this.gunModel[3].addShapeBox(-17.0F, 7.0F, -2.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  87 */     this.gunModel[3].setRotationPoint(9.0F, -6.0F, 0.5F);
/*     */     
/*  89 */     this.gunModel[4].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  90 */     this.gunModel[4].setRotationPoint(15.0F, -5.0F, 0.5F);
/*     */     
/*  92 */     this.gunModel[5].addBox(-17.0F, 7.0F, -2.0F, 2, 1, 3, 0.0F);
/*  93 */     this.gunModel[5].setRotationPoint(13.0F, -7.0F, 0.5F);
/*     */     
/*  95 */     this.gunModel[6].addBox(-17.0F, 7.0F, -2.0F, 3, 2, 3, 0.0F);
/*  96 */     this.gunModel[6].setRotationPoint(15.0F, -7.0F, 0.5F);
/*     */     
/*  98 */     this.gunModel[7].addBox(-17.0F, 7.0F, -2.0F, 2, 1, 3, 0.0F);
/*  99 */     this.gunModel[7].setRotationPoint(16.0F, -5.0F, 0.5F);
/*     */     
/* 101 */     this.gunModel[8].addBox(-17.0F, 7.0F, -2.0F, 1, 3, 3, 0.0F);
/* 102 */     this.gunModel[8].setRotationPoint(13.0F, -10.0F, 0.5F);
/*     */     
/* 104 */     this.gunModel[9].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 105 */     this.gunModel[9].setRotationPoint(14.0F, -10.0F, 0.5F);
/*     */     
/* 107 */     this.gunModel[10].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 108 */     this.gunModel[10].setRotationPoint(14.0F, -8.0F, 0.5F);
/*     */     
/* 110 */     this.gunModel[11].addShapeBox(-17.0F, 7.0F, -2.0F, 2, 2, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 111 */     this.gunModel[11].setRotationPoint(18.0F, -9.0F, 0.5F);
/*     */     
/* 113 */     this.gunModel[12].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 114 */     this.gunModel[12].setRotationPoint(19.0F, -10.0F, 0.5F);
/*     */     
/* 116 */     this.gunModel[13].addShapeBox(-17.0F, 7.0F, -2.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 117 */     this.gunModel[13].setRotationPoint(18.0F, -6.0F, 0.5F);
/*     */     
/* 119 */     this.gunModel[14].addShapeBox(-17.0F, 7.0F, -2.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[14].setRotationPoint(20.0F, -10.0F, 0.5F);
/*     */     
/* 122 */     this.gunModel[15].addShapeBox(-17.0F, 7.0F, -2.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[15].setRotationPoint(18.0F, -7.0F, 0.5F);
/*     */     
/* 125 */     this.gunModel[16].addBox(-17.0F, 7.0F, -2.0F, 2, 2, 3, 0.0F);
/* 126 */     this.gunModel[16].setRotationPoint(20.0F, -9.0F, 0.5F);
/*     */     
/* 128 */     this.gunModel[17].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 129 */     this.gunModel[17].setRotationPoint(22.0F, -9.0F, 0.5F);
/*     */     
/* 131 */     this.gunModel[18].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 132 */     this.gunModel[18].setRotationPoint(22.0F, -8.0F, 0.5F);
/*     */     
/* 134 */     this.gunModel[19].addShapeBox(-17.0F, 7.0F, -2.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 135 */     this.gunModel[19].setRotationPoint(22.0F, -9.0F, 1.5F);
/*     */     
/* 137 */     this.gunModel[20].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 138 */     this.gunModel[20].setRotationPoint(26.0F, -10.0F, 0.5F);
/*     */     
/* 140 */     this.gunModel[21].addShapeBox(-17.0F, 7.0F, -2.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 141 */     this.gunModel[21].setRotationPoint(27.0F, -10.0F, 1.0F);
/*     */     
/* 143 */     this.gunModel[22].addShapeBox(-17.0F, 7.0F, -2.0F, 29, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 144 */     this.gunModel[22].setRotationPoint(1.0F, -14.0F, -0.5F);
/*     */     
/* 146 */     this.gunModel[23].addShapeBox(-17.0F, 7.0F, -2.0F, 29, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 147 */     this.gunModel[23].setRotationPoint(1.0F, -14.0F, 3.5F);
/*     */     
/* 149 */     this.gunModel[24].addShapeBox(-17.0F, 7.0F, -2.0F, 29, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 150 */     this.gunModel[24].setRotationPoint(1.0F, -14.0F, 0.5F);
/*     */     
/* 152 */     this.gunModel[25].addShapeBox(-17.0F, 7.0F, -2.0F, 29, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 153 */     this.gunModel[25].setRotationPoint(1.0F, -15.0F, 0.0F);
/*     */     
/* 155 */     this.gunModel[26].addShapeBox(-17.0F, 7.0F, -2.0F, 29, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 156 */     this.gunModel[26].setRotationPoint(1.0F, -15.0F, 1.0F);
/*     */     
/* 158 */     this.gunModel[27].addShapeBox(-17.0F, 7.0F, -2.0F, 29, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 159 */     this.gunModel[27].setRotationPoint(1.0F, -15.0F, 3.0F);
/*     */     
/* 161 */     this.gunModel[28].addShapeBox(-17.0F, 7.0F, -2.0F, 18, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 162 */     this.gunModel[28].setRotationPoint(12.0F, -15.5F, 1.0F);
/*     */     
/* 164 */     this.gunModel[29].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 4, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.29F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 165 */     this.gunModel[29].setRotationPoint(34.0F, -14.0F, 0.0F);
/*     */     
/* 167 */     this.gunModel[30].addShapeBox(-17.0F, 7.0F, -2.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 168 */     this.gunModel[30].setRotationPoint(30.0F, -14.0F, 1.5F);
/*     */     
/* 170 */     this.gunModel[31].addShapeBox(-17.0F, 7.0F, -2.0F, 4, 1, 2, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 171 */     this.gunModel[31].setRotationPoint(30.0F, -14.0F, -0.5F);
/*     */     
/* 173 */     this.gunModel[32].addShapeBox(-17.0F, 7.0F, -2.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 174 */     this.gunModel[32].setRotationPoint(30.0F, -15.0F, 1.0F);
/*     */     
/* 176 */     this.gunModel[33].addShapeBox(-17.0F, 7.0F, -2.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 177 */     this.gunModel[33].setRotationPoint(30.0F, -14.0F, 2.0F);
/*     */     
/* 179 */     this.gunModel[34].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 4, 2, 0.0F, 0.0F, 0.29F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 180 */     this.gunModel[34].setRotationPoint(34.0F, -14.0F, 2.0F);
/*     */     
/* 182 */     this.gunModel[35].addShapeBox(-17.0F, 7.0F, -2.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 183 */     this.gunModel[35].setRotationPoint(12.0F, -16.0F, 1.0F);
/*     */     
/* 185 */     this.gunModel[36].addShapeBox(-17.0F, 7.0F, -2.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 186 */     this.gunModel[36].setRotationPoint(12.0F, -16.0F, 2.5F);
/*     */     
/* 188 */     this.gunModel[37].addShapeBox(-17.0F, 7.0F, -2.0F, 18, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 189 */     this.gunModel[37].setRotationPoint(12.0F, -16.0F, 1.5F);
/*     */     
/* 191 */     this.gunModel[38].addShapeBox(-17.0F, 7.0F, -2.0F, 8, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 192 */     this.gunModel[38].setRotationPoint(26.0F, -12.5F, 4.0F);
/*     */     
/* 194 */     this.gunModel[39].addShapeBox(-17.0F, 7.0F, -2.0F, 8, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 195 */     this.gunModel[39].setRotationPoint(26.0F, -12.5F, -0.5F);
/*     */     
/* 197 */     this.gunModel[40].addBox(-17.0F, 7.0F, -2.0F, 6, 1, 1, 0.0F);
/* 198 */     this.gunModel[40].setRotationPoint(34.0F, -13.0F, 1.5F);
/*     */     
/* 200 */     this.gunModel[41].addShapeBox(-17.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 201 */     this.gunModel[41].setRotationPoint(9.0F, -15.5F, 1.0F);
/*     */     
/* 203 */     this.gunModel[42].addShapeBox(-17.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 204 */     this.gunModel[42].setRotationPoint(9.0F, -16.0F, 1.5F);
/*     */     
/* 206 */     this.gunModel[43].addShapeBox(-17.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 207 */     this.gunModel[43].setRotationPoint(9.0F, -16.0F, 2.0F);
/*     */     
/* 209 */     this.gunModel[44].addShapeBox(-17.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 210 */     this.gunModel[44].setRotationPoint(9.0F, -15.5F, 2.5F);
/*     */     
/* 212 */     this.gunModel[45].addShapeBox(-17.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[45].setRotationPoint(9.0F, -15.5F, 1.5F);
/*     */     
/* 215 */     this.gunModel[46].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 216 */     this.gunModel[46].setRotationPoint(8.0F, -15.5F, 2.5F);
/*     */     
/* 218 */     this.gunModel[47].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 219 */     this.gunModel[47].setRotationPoint(8.0F, -15.5F, 2.0F);
/*     */     
/* 221 */     this.gunModel[48].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 222 */     this.gunModel[48].setRotationPoint(8.0F, -15.5F, 1.5F);
/*     */     
/* 224 */     this.gunModel[49].addShapeBox(-17.0F, 7.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 225 */     this.gunModel[49].setRotationPoint(8.0F, -15.5F, 1.0F);
/*     */     
/* 227 */     this.gunModel[50].addShapeBox(0.0F, 7.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 228 */     this.gunModel[50].setRotationPoint(13.0F, -16.0F, 0.0F);
/*     */     
/* 230 */     this.gunModel[51].addShapeBox(0.0F, 7.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 231 */     this.gunModel[51].setRotationPoint(13.0F, -16.0F, -1.5F);
/*     */     
/* 233 */     this.gunModel[52].addShapeBox(0.0F, 7.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 234 */     this.gunModel[52].setRotationPoint(13.0F, -16.0F, -0.87F);
/*     */     
/* 236 */     this.gunModel[53].addBox(0.0F, 7.0F, 0.0F, 1, 1, 2, 0.0F);
/* 237 */     this.gunModel[53].setRotationPoint(10.0F, -14.0F, 1.0F);
/*     */     
/*     */ 
/* 240 */     this.ammoModel = new ModelRendererTurbo[1];
/* 241 */     this.ammoModel[0] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*     */     
/* 243 */     this.ammoModel[0].addBox(-18.0F, 4.0F, -2.0F, 5, 6, 2, 0.0F);
/* 244 */     this.ammoModel[0].setRotationPoint(9.0F, -7.0F, 1.0F);
/* 245 */     this.ammoModel[0].rotateAngleZ = 0.15707964F;
/*     */     
/* 247 */     this.scopeAttachPoint = new Vector3f(0.1875F, 0.75F, 0.0F);
/*     */     
/* 249 */     translateAll(0.0F, -3.5F, 0.0F);
/* 250 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 252 */     this.gunSlideDistance = 0.0F;
/* 253 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/*     */ 
/* 256 */     this.tiltGun = 5.0F;
/* 257 */     this.rotateGunVertical = 40.0F;
/* 258 */     this.rotateGunHorizontal = 10.0F;
/* 259 */     this.translateGun = new Vector3f(0.5F, 0.0F, 0.0F);
/*     */     
/* 261 */     this.rotateClipVertical = 5.0F;
/* 262 */     this.translateClip = new Vector3f(-5.0F, -6.0F, 0.0F);
/*     */     
/* 264 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelf2000.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */