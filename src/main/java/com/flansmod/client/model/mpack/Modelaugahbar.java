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
/*     */ public class Modelaugahbar
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelaugahbar()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[52];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*     */     
/*  75 */     this.gunModel[0].addShapeBox(-20.0F, -2.0F, 1.0F, 24, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  76 */     this.gunModel[0].setRotationPoint(1.0F, -7.0F, 0.0F);
/*     */     
/*  78 */     this.gunModel[1].addShapeBox(-20.0F, -2.0F, 1.0F, 23, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  79 */     this.gunModel[1].setRotationPoint(1.0F, -8.0F, -1.0F);
/*     */     
/*  81 */     this.gunModel[2].addShapeBox(-20.0F, -2.0F, 1.0F, 23, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  82 */     this.gunModel[2].setRotationPoint(1.0F, -8.0F, -2.0F);
/*     */     
/*  84 */     this.gunModel[3].addShapeBox(-20.0F, -2.0F, 1.0F, 24, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  85 */     this.gunModel[3].setRotationPoint(1.0F, -7.0F, -4.0F);
/*     */     
/*  87 */     this.gunModel[4].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  88 */     this.gunModel[4].setRotationPoint(24.0F, -8.0F, -1.0F);
/*     */     
/*  90 */     this.gunModel[5].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  91 */     this.gunModel[5].setRotationPoint(24.0F, -8.0F, -2.0F);
/*     */     
/*  93 */     this.gunModel[6].addShapeBox(-20.0F, -2.0F, 1.0F, 8, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  94 */     this.gunModel[6].setRotationPoint(25.0F, -7.0F, 0.0F);
/*     */     
/*  96 */     this.gunModel[7].addShapeBox(-20.0F, -2.0F, 1.0F, 7, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  97 */     this.gunModel[7].setRotationPoint(25.0F, -8.0F, -1.0F);
/*     */     
/*  99 */     this.gunModel[8].addShapeBox(-20.0F, -2.0F, 1.0F, 8, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 100 */     this.gunModel[8].setRotationPoint(25.0F, -7.0F, -4.0F);
/*     */     
/* 102 */     this.gunModel[9].addBox(-20.0F, -2.0F, 1.0F, 32, 2, 2, 0.0F);
/* 103 */     this.gunModel[9].setRotationPoint(1.0F, -7.0F, -2.0F);
/*     */     
/* 105 */     this.gunModel[10].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 106 */     this.gunModel[10].setRotationPoint(30.0F, -8.3F, 0.35F);
/* 107 */     this.gunModel[10].rotateAngleX = -0.7330383F;
/*     */     
/* 109 */     this.gunModel[11].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 110 */     this.gunModel[11].setRotationPoint(31.0F, -8.75F, 0.75F);
/* 111 */     this.gunModel[11].rotateAngleX = -0.7330383F;
/*     */     
/* 113 */     this.gunModel[12].addShapeBox(-20.0F, -2.0F, 1.0F, 21, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 114 */     this.gunModel[12].setRotationPoint(33.0F, -6.5F, -1.25F);
/*     */     
/* 116 */     this.gunModel[13].addShapeBox(-20.0F, -2.0F, 1.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 117 */     this.gunModel[13].setRotationPoint(33.0F, -5.5F, -1.5F);
/*     */     
/* 119 */     this.gunModel[14].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[14].setRotationPoint(33.0F, -5.0F, -1.38F);
/*     */     
/* 122 */     this.gunModel[15].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[15].setRotationPoint(16.5F, 13.0F, 2.0F);
/* 124 */     this.gunModel[15].rotateAngleX = -3.1415927F;
/* 125 */     this.gunModel[15].rotateAngleZ = -1.5707964F;
/*     */     
/* 127 */     this.gunModel[16].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 128 */     this.gunModel[16].setRotationPoint(32.0F, -8.0F, -2.0F);
/*     */     
/* 130 */     this.gunModel[17].addShapeBox(-20.0F, -2.0F, 1.0F, 7, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 131 */     this.gunModel[17].setRotationPoint(25.0F, -8.0F, -2.0F);
/*     */     
/* 133 */     this.gunModel[18].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 134 */     this.gunModel[18].setRotationPoint(25.0F, -9.0F, -2.0F);
/*     */     
/* 136 */     this.gunModel[19].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 1, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 137 */     this.gunModel[19].setRotationPoint(54.0F, -6.25F, -1.0F);
/*     */     
/* 139 */     this.gunModel[20].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 1, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 140 */     this.gunModel[20].setRotationPoint(33.0F, -6.25F, -1.0F);
/*     */     
/* 142 */     this.gunModel[21].addShapeBox(-20.0F, -2.0F, 1.0F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 143 */     this.gunModel[21].setRotationPoint(21.0F, -5.0F, 0.0F);
/*     */     
/* 145 */     this.gunModel[22].addBox(-20.0F, -2.0F, 1.0F, 12, 2, 2, 0.0F);
/* 146 */     this.gunModel[22].setRotationPoint(21.0F, -5.0F, -2.0F);
/*     */     
/* 148 */     this.gunModel[23].addShapeBox(-20.0F, -2.0F, 1.0F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 149 */     this.gunModel[23].setRotationPoint(21.0F, -5.0F, -4.0F);
/*     */     
/* 151 */     this.gunModel[24].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 152 */     this.gunModel[24].setRotationPoint(27.0F, -3.0F, -2.0F);
/*     */     
/* 154 */     this.gunModel[25].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 155 */     this.gunModel[25].setRotationPoint(26.0F, -2.0F, -2.0F);
/*     */     
/* 157 */     this.gunModel[26].addShapeBox(-20.0F, -2.0F, 1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 158 */     this.gunModel[26].setRotationPoint(21.0F, 2.0F, -2.0F);
/*     */     
/* 160 */     this.gunModel[27].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 161 */     this.gunModel[27].setRotationPoint(21.0F, -1.0F, -2.0F);
/*     */     
/* 163 */     this.gunModel[28].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 164 */     this.gunModel[28].setRotationPoint(21.0F, -3.0F, -2.0F);
/*     */     
/* 166 */     this.gunModel[29].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 167 */     this.gunModel[29].setRotationPoint(23.0F, -3.0F, -1.5F);
/*     */     
/* 169 */     this.gunModel[30].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 170 */     this.gunModel[30].setRotationPoint(20.0F, 1.0F, -2.0F);
/*     */     
/* 172 */     this.gunModel[31].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 173 */     this.gunModel[31].setRotationPoint(20.0F, 0.0F, -2.0F);
/*     */     
/* 175 */     this.gunModel[32].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 176 */     this.gunModel[32].setRotationPoint(20.0F, -2.0F, -2.0F);
/*     */     
/* 178 */     this.gunModel[33].addShapeBox(-20.0F, -2.0F, 1.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 179 */     this.gunModel[33].setRotationPoint(1.0F, -5.0F, 0.0F);
/*     */     
/* 181 */     this.gunModel[34].addShapeBox(-20.0F, -2.0F, 1.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 182 */     this.gunModel[34].setRotationPoint(1.0F, -5.0F, -4.5F);
/*     */     
/* 184 */     this.gunModel[35].addShapeBox(-20.0F, -2.0F, 1.0F, 30, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 185 */     this.gunModel[35].setRotationPoint(1.0F, -5.0F, -2.5F);
/*     */     
/* 187 */     this.gunModel[36].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 188 */     this.gunModel[36].setRotationPoint(1.0F, -4.0F, -2.75F);
/*     */     
/* 190 */     this.gunModel[37].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 191 */     this.gunModel[37].setRotationPoint(6.0F, 2.0F, -2.75F);
/*     */     
/* 193 */     this.gunModel[38].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 194 */     this.gunModel[38].setRotationPoint(6.0F, -4.0F, -2.75F);
/*     */     
/* 196 */     this.gunModel[39].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 197 */     this.gunModel[39].setRotationPoint(8.0F, -4.0F, -2.75F);
/*     */     
/* 199 */     this.gunModel[40].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 200 */     this.gunModel[40].setRotationPoint(10.0F, -4.0F, -2.75F);
/*     */     
/* 202 */     this.gunModel[41].addShapeBox(-20.0F, -2.0F, 1.0F, 6, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -1.0F, 0.0F, -2.0F, -0.5F);
/* 203 */     this.gunModel[41].setRotationPoint(15.0F, -4.0F, -2.75F);
/*     */     
/* 205 */     this.gunModel[42].addBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
/* 206 */     this.gunModel[42].setRotationPoint(25.0F, -8.0F, -2.0F);
/*     */     
/* 208 */     this.gunModel[43].addBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
/* 209 */     this.gunModel[43].setRotationPoint(31.0F, -8.0F, -2.0F);
/*     */     
/* 211 */     this.gunModel[44].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F);
/* 212 */     this.gunModel[44].setRotationPoint(29.0F, -9.0F, -2.0F);
/*     */     
/* 214 */     this.gunModel[45].addShapeBox(-20.0F, -2.0F, 1.0F, 9, 1, 2, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 215 */     this.gunModel[45].setRotationPoint(21.0F, -10.0F, -2.0F);
/*     */     
/* 217 */     this.gunModel[46].addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
/* 218 */     this.gunModel[46].setRotationPoint(31.0F, -7.5F, -1.0F);
/* 219 */     this.gunModel[46].rotateAngleX = 0.4886922F;
/* 220 */     this.gunModel[46].rotateAngleZ = 0.20943952F;
/*     */     
/* 222 */     this.gunModel[47].addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
/* 223 */     this.gunModel[47].setRotationPoint(31.0F, -8.5F, -0.5F);
/* 224 */     this.gunModel[47].rotateAngleX = -0.4886922F;
/* 225 */     this.gunModel[47].rotateAngleZ = 0.20943952F;
/*     */     
/* 227 */     this.gunModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 1, 12, 2, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F);
/* 228 */     this.gunModel[48].setRotationPoint(30.45F, -6.67F, -1.4F);
/* 229 */     this.gunModel[48].rotateAngleX = -0.4886922F;
/* 230 */     this.gunModel[48].rotateAngleZ = 0.20943952F;
/*     */     
/* 232 */     this.gunModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 1, 12, 2, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F);
/* 233 */     this.gunModel[49].setRotationPoint(30.45F, -5.67F, -0.15F);
/* 234 */     this.gunModel[49].rotateAngleX = 0.4886922F;
/* 235 */     this.gunModel[49].rotateAngleZ = 0.20943952F;
/*     */     
/* 237 */     this.gunModel[50].addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/* 238 */     this.gunModel[50].setRotationPoint(33.15F, 4.4F, -8.0F);
/* 239 */     this.gunModel[50].rotateAngleX = -0.4886922F;
/* 240 */     this.gunModel[50].rotateAngleZ = 0.20943952F;
/*     */     
/* 242 */     this.gunModel[51].addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/* 243 */     this.gunModel[51].setRotationPoint(33.5F, 5.5F, 5.5F);
/* 244 */     this.gunModel[51].rotateAngleX = 0.4886922F;
/* 245 */     this.gunModel[51].rotateAngleZ = 0.20943952F;
/*     */     
/*     */ 
/* 248 */     this.defaultScopeModel = new ModelRendererTurbo[3];
/* 249 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/* 250 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 251 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*     */     
/* 253 */     this.defaultScopeModel[0].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 254 */     this.defaultScopeModel[0].setRotationPoint(29.0F, -10.25F, -1.87F);
/*     */     
/* 256 */     this.defaultScopeModel[1].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 257 */     this.defaultScopeModel[1].setRotationPoint(21.0F, -10.25F, -1.0F);
/*     */     
/* 259 */     this.defaultScopeModel[2].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 260 */     this.defaultScopeModel[2].setRotationPoint(21.0F, -10.25F, -2.5F);
/*     */     
/*     */ 
/* 263 */     this.ammoModel = new ModelRendererTurbo[3];
/* 264 */     this.ammoModel[0] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/* 265 */     this.ammoModel[1] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/* 266 */     this.ammoModel[2] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*     */     
/* 268 */     this.ammoModel[0].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 4, 3, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 269 */     this.ammoModel[0].setRotationPoint(10.0F, -3.0F, -2.5F);
/*     */     
/* 271 */     this.ammoModel[1].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 3, 3, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/* 272 */     this.ammoModel[1].setRotationPoint(10.0F, 1.0F, -2.5F);
/*     */     
/* 274 */     this.ammoModel[2].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 2, 3, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.35F, 0.5F, 0.0F, 0.65F, -0.5F, 0.0F, 0.65F, -0.5F, 0.0F, -1.35F, 0.5F, 0.0F);
/* 275 */     this.ammoModel[2].setRotationPoint(10.5F, 4.0F, -2.5F);
/*     */     
/*     */ 
/*     */ 
/* 279 */     translateAll(0.0F, -3.75F, 0.0F);
/* 280 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 282 */     this.gunSlideDistance = 0.0F;
/* 283 */     this.animationType = EnumAnimationType.CUSTOM;
/* 284 */     this.tiltGun = 15.0F;
/* 285 */     this.rotateGunVertical = 5.0F;
/* 286 */     this.rotateGunVertical = 3.0F;
/* 287 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 289 */     this.rotateClipVertical = 5.0F;
/* 290 */     this.translateClip = new Vector3f(0.0F, -3.0F, 0.0F);
/*     */     
/*     */ 
/* 293 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelaugahbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */