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
/*     */ public class Modelauga1
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelauga1()
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
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
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
/* 113 */     this.gunModel[12].addShapeBox(-20.0F, -2.0F, 1.0F, 14, 1, 1, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 114 */     this.gunModel[12].setRotationPoint(33.0F, -6.5F, -1.25F);
/*     */     
/* 116 */     this.gunModel[13].addShapeBox(-20.0F, -2.0F, 1.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 117 */     this.gunModel[13].setRotationPoint(33.0F, -5.5F, -1.5F);
/*     */     
/* 119 */     this.gunModel[14].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[14].setRotationPoint(33.0F, -5.0F, -1.38F);
/*     */     
/* 122 */     this.gunModel[15].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[15].setRotationPoint(33.0F, -4.0F, -2.0F);
/*     */     
/* 125 */     this.gunModel[16].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 126 */     this.gunModel[16].setRotationPoint(32.0F, -8.0F, -2.0F);
/*     */     
/* 128 */     this.gunModel[17].addShapeBox(-20.0F, -2.0F, 1.0F, 7, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 129 */     this.gunModel[17].setRotationPoint(25.0F, -8.0F, -2.0F);
/*     */     
/* 131 */     this.gunModel[18].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 2, 0.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 132 */     this.gunModel[18].setRotationPoint(25.0F, -10.0F, -2.0F);
/*     */     
/* 134 */     this.gunModel[19].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 1, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 135 */     this.gunModel[19].setRotationPoint(47.0F, -6.25F, -1.0F);
/*     */     
/* 137 */     this.gunModel[20].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 1, 1, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 138 */     this.gunModel[20].setRotationPoint(33.0F, -6.25F, -1.0F);
/*     */     
/* 140 */     this.gunModel[21].addShapeBox(-20.0F, -2.0F, 1.0F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 141 */     this.gunModel[21].setRotationPoint(21.0F, -5.0F, 0.0F);
/*     */     
/* 143 */     this.gunModel[22].addBox(-20.0F, -2.0F, 1.0F, 12, 2, 2, 0.0F);
/* 144 */     this.gunModel[22].setRotationPoint(21.0F, -5.0F, -2.0F);
/*     */     
/* 146 */     this.gunModel[23].addShapeBox(-20.0F, -2.0F, 1.0F, 12, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 147 */     this.gunModel[23].setRotationPoint(21.0F, -5.0F, -4.0F);
/*     */     
/* 149 */     this.gunModel[24].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 150 */     this.gunModel[24].setRotationPoint(27.0F, -3.0F, -2.0F);
/*     */     
/* 152 */     this.gunModel[25].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 153 */     this.gunModel[25].setRotationPoint(26.0F, -2.0F, -2.0F);
/*     */     
/* 155 */     this.gunModel[26].addShapeBox(-20.0F, -2.0F, 1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 156 */     this.gunModel[26].setRotationPoint(21.0F, 2.0F, -2.0F);
/*     */     
/* 158 */     this.gunModel[27].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 159 */     this.gunModel[27].setRotationPoint(21.0F, -1.0F, -2.0F);
/*     */     
/* 161 */     this.gunModel[28].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 162 */     this.gunModel[28].setRotationPoint(21.0F, -3.0F, -2.0F);
/*     */     
/* 164 */     this.gunModel[29].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 165 */     this.gunModel[29].setRotationPoint(23.0F, -3.0F, -1.5F);
/*     */     
/* 167 */     this.gunModel[30].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 168 */     this.gunModel[30].setRotationPoint(20.0F, 1.0F, -2.0F);
/*     */     
/* 170 */     this.gunModel[31].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 171 */     this.gunModel[31].setRotationPoint(20.0F, 0.0F, -2.0F);
/*     */     
/* 173 */     this.gunModel[32].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 174 */     this.gunModel[32].setRotationPoint(20.0F, -2.0F, -2.0F);
/*     */     
/* 176 */     this.gunModel[33].addShapeBox(-20.0F, -2.0F, 1.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 177 */     this.gunModel[33].setRotationPoint(1.0F, -5.0F, 0.0F);
/*     */     
/* 179 */     this.gunModel[34].addShapeBox(-20.0F, -2.0F, 1.0F, 20, 1, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 180 */     this.gunModel[34].setRotationPoint(1.0F, -5.0F, -4.5F);
/*     */     
/* 182 */     this.gunModel[35].addShapeBox(-20.0F, -2.0F, 1.0F, 30, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 183 */     this.gunModel[35].setRotationPoint(1.0F, -5.0F, -2.5F);
/*     */     
/* 185 */     this.gunModel[36].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 186 */     this.gunModel[36].setRotationPoint(1.0F, -4.0F, -2.75F);
/*     */     
/* 188 */     this.gunModel[37].addShapeBox(-20.0F, -2.0F, 1.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 189 */     this.gunModel[37].setRotationPoint(6.0F, 2.0F, -2.75F);
/*     */     
/* 191 */     this.gunModel[38].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 192 */     this.gunModel[38].setRotationPoint(6.0F, -4.0F, -2.75F);
/*     */     
/* 194 */     this.gunModel[39].addShapeBox(-20.0F, -2.0F, 1.0F, 2, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 195 */     this.gunModel[39].setRotationPoint(8.0F, -4.0F, -2.75F);
/*     */     
/* 197 */     this.gunModel[40].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 198 */     this.gunModel[40].setRotationPoint(10.0F, -4.0F, -2.75F);
/*     */     
/* 200 */     this.gunModel[41].addShapeBox(-20.0F, -2.0F, 1.0F, 6, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -1.0F, 0.0F, -2.0F, -0.5F);
/* 201 */     this.gunModel[41].setRotationPoint(15.0F, -4.0F, -2.75F);
/*     */     
/* 203 */     this.gunModel[42].addBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
/* 204 */     this.gunModel[42].setRotationPoint(25.0F, -8.0F, -2.0F);
/*     */     
/* 206 */     this.gunModel[43].addBox(-20.0F, -2.0F, 1.0F, 1, 1, 2, 0.0F);
/* 207 */     this.gunModel[43].setRotationPoint(31.0F, -8.0F, -2.0F);
/*     */     
/* 209 */     this.gunModel[44].addShapeBox(-20.0F, -2.0F, 1.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 210 */     this.gunModel[44].setRotationPoint(29.0F, -10.0F, -2.0F);
/*     */     
/* 212 */     this.gunModel[45].addShapeBox(-20.0F, -2.0F, 1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 213 */     this.gunModel[45].setRotationPoint(19.0F, -11.0F, -1.75F);
/*     */     
/* 215 */     this.gunModel[46].addShapeBox(-20.0F, -2.0F, 1.0F, 11, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 216 */     this.gunModel[46].setRotationPoint(19.0F, -11.5F, -1.75F);
/*     */     
/* 218 */     this.gunModel[47].addShapeBox(-20.0F, -2.0F, 1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 219 */     this.gunModel[47].setRotationPoint(19.0F, -11.5F, -1.25F);
/*     */     
/* 221 */     this.gunModel[48].addShapeBox(-20.0F, -2.0F, 1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 222 */     this.gunModel[48].setRotationPoint(19.0F, -11.5F, -0.75F);
/*     */     
/* 224 */     this.gunModel[49].addShapeBox(-20.0F, -2.0F, 1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 225 */     this.gunModel[49].setRotationPoint(19.0F, -10.5F, -1.75F);
/*     */     
/* 227 */     this.gunModel[50].addShapeBox(-20.0F, -2.0F, 1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 228 */     this.gunModel[50].setRotationPoint(19.0F, -10.5F, -0.75F);
/*     */     
/* 230 */     this.gunModel[51].addShapeBox(-20.0F, -2.0F, 1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 231 */     this.gunModel[51].setRotationPoint(19.0F, -10.5F, -1.25F);
/*     */     
/*     */ 
/* 234 */     this.ammoModel = new ModelRendererTurbo[2];
/* 235 */     this.ammoModel[0] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/* 236 */     this.ammoModel[1] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*     */     
/* 238 */     this.ammoModel[0].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 5, 3, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 239 */     this.ammoModel[0].setRotationPoint(10.0F, -3.0F, -2.5F);
/*     */     
/* 241 */     this.ammoModel[1].addShapeBox(-20.0F, -2.0F, 1.0F, 5, 4, 3, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.1F, 1.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, -1.1F, 1.0F, 0.0F);
/* 242 */     this.ammoModel[1].setRotationPoint(10.0F, 2.0F, -2.5F);
/*     */     
/*     */ 
/*     */ 
/* 246 */     translateAll(-0.5F, -3.0F, 0.0F);
/* 247 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 249 */     this.gunSlideDistance = 0.0F;
/* 250 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 252 */     this.tiltGun = 5.0F;
/* 253 */     this.rotateGunVertical = 40.0F;
/* 254 */     this.rotateGunHorizontal = 10.0F;
/* 255 */     this.translateGun = new Vector3f(0.5F, 0.0F, 0.0F);
/*     */     
/* 257 */     this.rotateClipVertical = 5.0F;
/* 258 */     this.translateClip = new Vector3f(-5.0F, -6.0F, 0.0F);
/*     */     
/*     */ 
/* 261 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelauga1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */