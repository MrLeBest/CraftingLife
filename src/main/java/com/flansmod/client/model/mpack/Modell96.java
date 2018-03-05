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
/*     */ public class Modell96
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modell96()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[61];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*     */     
/*  84 */     this.gunModel[0].addShapeBox(-4.0F, -8.0F, -1.0F, 11, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  85 */     this.gunModel[0].setRotationPoint(10.0F, 5.0F, 0.0F);
/*     */     
/*  87 */     this.gunModel[1].addShapeBox(-4.0F, -8.0F, -1.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  88 */     this.gunModel[1].setRotationPoint(10.0F, 6.0F, 0.0F);
/*     */     
/*  90 */     this.gunModel[2].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  91 */     this.gunModel[2].setRotationPoint(9.0F, 6.0F, 0.0F);
/*     */     
/*  93 */     this.gunModel[3].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  94 */     this.gunModel[3].setRotationPoint(8.0F, 6.0F, 0.0F);
/*     */     
/*  96 */     this.gunModel[4].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  97 */     this.gunModel[4].setRotationPoint(7.0F, 6.0F, 0.0F);
/*     */     
/*  99 */     this.gunModel[5].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 100 */     this.gunModel[5].setRotationPoint(6.0F, 6.0F, 0.0F);
/*     */     
/* 102 */     this.gunModel[6].addBox(-4.0F, -8.0F, -1.0F, 1, 2, 2, 0.0F);
/* 103 */     this.gunModel[6].setRotationPoint(5.0F, 4.0F, 0.0F);
/*     */     
/* 105 */     this.gunModel[7].addShapeBox(-4.0F, -8.0F, -1.0F, 3, 1, 2, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 106 */     this.gunModel[7].setRotationPoint(2.0F, 4.0F, 0.0F);
/*     */     
/* 108 */     this.gunModel[8].addBox(-4.0F, -8.0F, -1.0F, 4, 1, 2, 0.0F);
/* 109 */     this.gunModel[8].setRotationPoint(6.0F, 5.0F, 0.0F);
/*     */     
/* 111 */     this.gunModel[9].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 112 */     this.gunModel[9].setRotationPoint(9.0F, 4.0F, 0.0F);
/*     */     
/* 114 */     this.gunModel[10].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 115 */     this.gunModel[10].setRotationPoint(6.0F, 4.0F, 0.0F);
/*     */     
/* 117 */     this.gunModel[11].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 118 */     this.gunModel[11].setRotationPoint(7.0F, 4.0F, 0.0F);
/*     */     
/* 120 */     this.gunModel[12].addBox(-4.0F, -8.0F, -1.0F, 21, 1, 1, 0.0F);
/* 121 */     this.gunModel[12].setRotationPoint(10.0F, 3.5F, 0.5F);
/*     */     
/* 123 */     this.gunModel[13].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 124 */     this.gunModel[13].setRotationPoint(5.0F, 2.5F, 0.75F);
/*     */     
/* 126 */     this.gunModel[14].addShapeBox(-4.0F, -8.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 127 */     this.gunModel[14].setRotationPoint(5.0F, 2.5F, 1.75F);
/*     */     
/* 129 */     this.gunModel[15].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 130 */     this.gunModel[15].setRotationPoint(7.0F, 4.0F, 0.75F);
/*     */     
/* 132 */     this.gunModel[16].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 133 */     this.gunModel[16].setRotationPoint(9.0F, 4.0F, 0.75F);
/*     */     
/* 135 */     this.gunModel[17].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F);
/* 136 */     this.gunModel[17].setRotationPoint(6.0F, 4.0F, 0.75F);
/*     */     
/* 138 */     this.gunModel[18].addShapeBox(-4.0F, -8.0F, -1.0F, 12, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 139 */     this.gunModel[18].setRotationPoint(-7.0F, 4.5F, 0.0F);
/*     */     
/* 141 */     this.gunModel[19].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 142 */     this.gunModel[19].setRotationPoint(9.0F, 2.5F, 0.75F);
/*     */     
/* 144 */     this.gunModel[20].addShapeBox(-4.0F, -8.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 145 */     this.gunModel[20].setRotationPoint(6.0F, 2.5F, 0.0F);
/*     */     
/* 147 */     this.gunModel[21].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 148 */     this.gunModel[21].setRotationPoint(5.0F, 3.0F, 0.75F);
/*     */     
/* 150 */     this.gunModel[22].addShapeBox(-4.0F, -8.0F, -1.0F, 4, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 151 */     this.gunModel[22].setRotationPoint(10.0F, 3.5F, 0.0F);
/*     */     
/* 153 */     this.gunModel[23].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 154 */     this.gunModel[23].setRotationPoint(20.0F, 4.5F, 0.0F);
/*     */     
/* 156 */     this.gunModel[24].addShapeBox(-4.0F, -8.0F, -1.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 157 */     this.gunModel[24].setRotationPoint(10.0F, 4.5F, 0.0F);
/*     */     
/* 159 */     this.gunModel[25].addShapeBox(-4.0F, -8.0F, -1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 160 */     this.gunModel[25].setRotationPoint(14.0F, 4.75F, 0.0F);
/*     */     
/* 162 */     this.gunModel[26].addShapeBox(-4.0F, -8.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 163 */     this.gunModel[26].setRotationPoint(14.0F, 4.25F, 0.5F);
/*     */     
/* 165 */     this.gunModel[27].addShapeBox(-4.0F, -8.0F, -1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 166 */     this.gunModel[27].setRotationPoint(14.0F, 4.0F, 0.0F);
/*     */     
/* 168 */     this.gunModel[28].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 169 */     this.gunModel[28].setRotationPoint(20.0F, 3.5F, 0.0F);
/*     */     
/* 171 */     this.gunModel[29].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[29].setRotationPoint(3.0F, 8.5F, 0.0F);
/*     */     
/* 174 */     this.gunModel[30].addShapeBox(-4.0F, -8.0F, -1.0F, 6, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 175 */     this.gunModel[30].setRotationPoint(-7.0F, 5.5F, 0.0F);
/*     */     
/* 177 */     this.gunModel[31].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 178 */     this.gunModel[31].setRotationPoint(2.0F, 7.5F, 0.0F);
/*     */     
/* 180 */     this.gunModel[32].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 181 */     this.gunModel[32].setRotationPoint(2.0F, 5.5F, 0.0F);
/*     */     
/* 183 */     this.gunModel[33].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 184 */     this.gunModel[33].setRotationPoint(2.0F, 7.0F, 0.0F);
/*     */     
/* 186 */     this.gunModel[34].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 187 */     this.gunModel[34].setRotationPoint(-1.0F, 5.5F, 0.0F);
/*     */     
/* 189 */     this.gunModel[35].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 190 */     this.gunModel[35].setRotationPoint(-1.0F, 7.0F, 0.0F);
/*     */     
/* 192 */     this.gunModel[36].addShapeBox(-4.0F, -8.0F, -1.0F, 3, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 193 */     this.gunModel[36].setRotationPoint(-1.0F, 7.5F, 0.0F);
/*     */     
/* 195 */     this.gunModel[37].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 196 */     this.gunModel[37].setRotationPoint(-3.0F, 7.5F, 0.0F);
/*     */     
/* 198 */     this.gunModel[38].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 199 */     this.gunModel[38].setRotationPoint(-7.0F, 7.5F, 0.0F);
/*     */     
/* 201 */     this.gunModel[39].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 202 */     this.gunModel[39].setRotationPoint(-9.0F, 7.5F, 0.0F);
/*     */     
/* 204 */     this.gunModel[40].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 205 */     this.gunModel[40].setRotationPoint(3.0F, 5.5F, 0.0F);
/*     */     
/* 207 */     this.gunModel[41].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 208 */     this.gunModel[41].setRotationPoint(3.0F, 6.5F, 0.0F);
/*     */     
/* 210 */     this.gunModel[42].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 211 */     this.gunModel[42].setRotationPoint(-9.0F, 6.5F, -1.0F);
/*     */     
/* 213 */     this.gunModel[43].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 214 */     this.gunModel[43].setRotationPoint(-9.0F, 6.0F, -1.0F);
/*     */     
/* 216 */     this.gunModel[44].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 217 */     this.gunModel[44].setRotationPoint(-9.0F, 4.5F, 0.0F);
/*     */     
/* 219 */     this.gunModel[45].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 220 */     this.gunModel[45].setRotationPoint(-9.0F, 4.5F, 1.0F);
/*     */     
/* 222 */     this.gunModel[46].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F);
/* 223 */     this.gunModel[46].setRotationPoint(5.0F, 6.0F, 0.0F);
/*     */     
/* 225 */     this.gunModel[47].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 226 */     this.gunModel[47].setRotationPoint(3.0F, 6.0F, 0.0F);
/*     */     
/* 228 */     this.gunModel[48].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 229 */     this.gunModel[48].setRotationPoint(4.0F, 6.0F, 0.0F);
/*     */     
/* 231 */     this.gunModel[49].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 232 */     this.gunModel[49].setRotationPoint(-9.0F, 7.5F, 1.0F);
/*     */     
/* 234 */     this.gunModel[50].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 235 */     this.gunModel[50].setRotationPoint(-9.0F, 6.5F, 0.0F);
/*     */     
/* 237 */     this.gunModel[51].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 238 */     this.gunModel[51].setRotationPoint(-9.0F, 6.5F, 2.0F);
/*     */     
/* 240 */     this.gunModel[52].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F);
/* 241 */     this.gunModel[52].setRotationPoint(-9.0F, 6.0F, 2.0F);
/*     */     
/* 243 */     this.gunModel[53].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 244 */     this.gunModel[53].setRotationPoint(4.0F, 1.0F, 0.5F);
/*     */     
/* 246 */     this.gunModel[54].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 247 */     this.gunModel[54].setRotationPoint(9.0F, 3.0F, 0.75F);
/*     */     
/* 249 */     this.gunModel[55].addShapeBox(-4.0F, -8.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 250 */     this.gunModel[55].setRotationPoint(6.0F, 3.0F, 0.75F);
/*     */     
/* 252 */     this.gunModel[56].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 253 */     this.gunModel[56].setRotationPoint(5.0F, 6.5F, 0.0F);
/*     */     
/* 255 */     this.gunModel[57].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, 0.1F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.15F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.15F, -0.9F, 0.0F);
/* 256 */     this.gunModel[57].setRotationPoint(4.0F, 7.0F, 0.0F);
/*     */     
/* 258 */     this.gunModel[58].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F);
/* 259 */     this.gunModel[58].setRotationPoint(4.0F, 6.0F, 0.75F);
/*     */     
/* 261 */     this.gunModel[59].addBox(-4.0F, -8.0F, -1.0F, 1, 9, 1, 0.0F);
/* 262 */     this.gunModel[59].setRotationPoint(20.9F, 3.5F, 3.5F);
/* 263 */     this.gunModel[59].rotateAngleX = 0.34906584F;
/*     */     
/* 265 */     this.gunModel[60].addBox(-4.0F, -8.0F, -1.0F, 1, 9, 1, 0.0F);
/* 266 */     this.gunModel[60].setRotationPoint(20.9F, 4.0F, -2.5F);
/* 267 */     this.gunModel[60].rotateAngleX = -0.34906584F;
/*     */     
/*     */ 
/* 270 */     this.defaultScopeModel = new ModelRendererTurbo[38];
/* 271 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 272 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/* 273 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 274 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 275 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 276 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 277 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/* 278 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/* 279 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 280 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/* 281 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 282 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/* 283 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/* 284 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/* 285 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 286 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/* 287 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/* 288 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/* 289 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/* 290 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/* 291 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/* 292 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/* 293 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/* 294 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/* 295 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/* 296 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/* 297 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 298 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/* 299 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/* 300 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 301 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/* 302 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/* 303 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/* 304 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/* 305 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/* 306 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/* 307 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/* 308 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*     */     
/* 310 */     this.defaultScopeModel[0].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 311 */     this.defaultScopeModel[0].setRotationPoint(6.0F, 2.0F, 0.25F);
/*     */     
/* 313 */     this.defaultScopeModel[1].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 314 */     this.defaultScopeModel[1].setRotationPoint(7.0F, 2.0F, 0.25F);
/*     */     
/* 316 */     this.defaultScopeModel[2].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 317 */     this.defaultScopeModel[2].setRotationPoint(8.0F, 2.0F, 0.25F);
/*     */     
/* 319 */     this.defaultScopeModel[3].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 320 */     this.defaultScopeModel[3].setRotationPoint(6.0F, 0.0F, 0.5F);
/*     */     
/* 322 */     this.defaultScopeModel[4].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -0.85F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 323 */     this.defaultScopeModel[4].setRotationPoint(8.0F, 0.0F, 0.5F);
/*     */     
/* 325 */     this.defaultScopeModel[5].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 326 */     this.defaultScopeModel[5].setRotationPoint(8.0F, 1.5F, 0.5F);
/*     */     
/* 328 */     this.defaultScopeModel[6].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 329 */     this.defaultScopeModel[6].setRotationPoint(8.0F, 0.0F, 0.0F);
/*     */     
/* 331 */     this.defaultScopeModel[7].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 332 */     this.defaultScopeModel[7].setRotationPoint(6.0F, 0.0F, 0.0F);
/*     */     
/* 334 */     this.defaultScopeModel[8].addShapeBox(-4.0F, -8.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 335 */     this.defaultScopeModel[8].setRotationPoint(5.0F, 1.0F, 0.5F);
/*     */     
/* 337 */     this.defaultScopeModel[9].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 338 */     this.defaultScopeModel[9].setRotationPoint(6.0F, 0.5F, -0.5F);
/*     */     
/* 340 */     this.defaultScopeModel[10].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 341 */     this.defaultScopeModel[10].setRotationPoint(8.0F, 0.5F, -0.5F);
/*     */     
/* 343 */     this.defaultScopeModel[11].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 344 */     this.defaultScopeModel[11].setRotationPoint(8.0F, 1.5F, -0.5F);
/*     */     
/* 346 */     this.defaultScopeModel[12].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 347 */     this.defaultScopeModel[12].setRotationPoint(6.0F, 1.5F, -0.5F);
/*     */     
/* 349 */     this.defaultScopeModel[13].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 350 */     this.defaultScopeModel[13].setRotationPoint(8.0F, 1.5F, 0.0F);
/*     */     
/* 352 */     this.defaultScopeModel[14].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 353 */     this.defaultScopeModel[14].setRotationPoint(6.0F, 1.5F, 0.0F);
/*     */     
/* 355 */     this.defaultScopeModel[15].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 356 */     this.defaultScopeModel[15].setRotationPoint(6.0F, 1.5F, 0.5F);
/*     */     
/* 358 */     this.defaultScopeModel[16].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 359 */     this.defaultScopeModel[16].setRotationPoint(6.0F, 1.0F, 1.5F);
/*     */     
/* 361 */     this.defaultScopeModel[17].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 362 */     this.defaultScopeModel[17].setRotationPoint(6.0F, 0.5F, 1.5F);
/*     */     
/* 364 */     this.defaultScopeModel[18].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 365 */     this.defaultScopeModel[18].setRotationPoint(8.0F, 0.5F, 1.5F);
/*     */     
/* 367 */     this.defaultScopeModel[19].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 368 */     this.defaultScopeModel[19].setRotationPoint(8.0F, 1.0F, 1.5F);
/*     */     
/* 370 */     this.defaultScopeModel[20].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 371 */     this.defaultScopeModel[20].setRotationPoint(4.0F, 1.0F, -0.5F);
/*     */     
/* 373 */     this.defaultScopeModel[21].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 374 */     this.defaultScopeModel[21].setRotationPoint(4.0F, 0.0F, -0.5F);
/*     */     
/* 376 */     this.defaultScopeModel[22].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 377 */     this.defaultScopeModel[22].setRotationPoint(4.0F, 0.0F, 0.5F);
/*     */     
/* 379 */     this.defaultScopeModel[23].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F);
/* 380 */     this.defaultScopeModel[23].setRotationPoint(4.0F, 0.0F, 1.5F);
/*     */     
/* 382 */     this.defaultScopeModel[24].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F);
/* 383 */     this.defaultScopeModel[24].setRotationPoint(4.0F, 1.0F, 1.5F);
/*     */     
/* 385 */     this.defaultScopeModel[25].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 386 */     this.defaultScopeModel[25].setRotationPoint(4.0F, 2.0F, -0.5F);
/*     */     
/* 388 */     this.defaultScopeModel[26].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 389 */     this.defaultScopeModel[26].setRotationPoint(4.0F, 2.0F, 0.5F);
/*     */     
/* 391 */     this.defaultScopeModel[27].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.75F, -0.75F);
/* 392 */     this.defaultScopeModel[27].setRotationPoint(4.0F, 2.0F, 1.5F);
/*     */     
/* 394 */     this.defaultScopeModel[28].addShapeBox(-4.0F, -8.0F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 395 */     this.defaultScopeModel[28].setRotationPoint(2.0F, 0.75F, 0.75F);
/*     */     
/* 397 */     this.defaultScopeModel[29].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F);
/* 398 */     this.defaultScopeModel[29].setRotationPoint(10.0F, 1.0F, 1.5F);
/*     */     
/* 400 */     this.defaultScopeModel[30].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F);
/* 401 */     this.defaultScopeModel[30].setRotationPoint(10.0F, 0.0F, 1.5F);
/*     */     
/* 403 */     this.defaultScopeModel[31].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 404 */     this.defaultScopeModel[31].setRotationPoint(10.0F, 0.0F, 0.5F);
/*     */     
/* 406 */     this.defaultScopeModel[32].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 407 */     this.defaultScopeModel[32].setRotationPoint(10.0F, 0.0F, -0.5F);
/*     */     
/* 409 */     this.defaultScopeModel[33].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 410 */     this.defaultScopeModel[33].setRotationPoint(10.0F, 1.0F, -0.5F);
/*     */     
/* 412 */     this.defaultScopeModel[34].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 413 */     this.defaultScopeModel[34].setRotationPoint(10.0F, 2.0F, -0.5F);
/*     */     
/* 415 */     this.defaultScopeModel[35].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 416 */     this.defaultScopeModel[35].setRotationPoint(10.0F, 2.0F, 0.5F);
/*     */     
/* 418 */     this.defaultScopeModel[36].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -1.0F, -1.0F);
/* 419 */     this.defaultScopeModel[36].setRotationPoint(10.0F, 2.0F, 1.5F);
/*     */     
/* 421 */     this.defaultScopeModel[37].addShapeBox(-4.0F, -8.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 422 */     this.defaultScopeModel[37].setRotationPoint(11.0F, 0.75F, 0.75F);
/*     */     
/*     */ 
/* 425 */     this.ammoModel = new ModelRendererTurbo[2];
/* 426 */     this.ammoModel[0] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/* 427 */     this.ammoModel[1] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*     */     
/* 429 */     this.ammoModel[0].addShapeBox(-4.0F, -8.0F, -1.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 430 */     this.ammoModel[0].setRotationPoint(6.0F, 5.0F, 0.25F);
/*     */     
/* 432 */     this.ammoModel[1].addShapeBox(-4.0F, -8.0F, -1.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 433 */     this.ammoModel[1].setRotationPoint(6.0F, 8.0F, 0.25F);
/*     */     
/*     */ 
/* 436 */     this.pumpModel = new ModelRendererTurbo[4];
/* 437 */     this.pumpModel[0] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 438 */     this.pumpModel[1] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/* 439 */     this.pumpModel[2] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 440 */     this.pumpModel[3] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*     */     
/* 442 */     this.pumpModel[0].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 443 */     this.pumpModel[0].setRotationPoint(4.5F, 3.0F, -0.5F);
/*     */     
/* 445 */     this.pumpModel[1].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.5F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 446 */     this.pumpModel[1].setRotationPoint(4.5F, 3.0F, -1.0F);
/*     */     
/* 448 */     this.pumpModel[2].addShapeBox(-4.0F, -8.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 449 */     this.pumpModel[2].setRotationPoint(3.9F, 3.6F, -1.5F);
/*     */     
/* 451 */     this.pumpModel[3].addShapeBox(-4.0F, -8.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 452 */     this.pumpModel[3].setRotationPoint(4.2F, 3.0F, 0.25F);
/*     */     
/*     */ 
/*     */ 
/* 456 */     this.barrelAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
/* 457 */     this.stockAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
/* 458 */     this.scopeAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
/* 459 */     this.gripAttachPoint = new Vector3f(0.0F, 0.0F, 0.0F);
/*     */     
/* 461 */     translateAll(0.0F, -2.0F, 0.0F);
/* 462 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*     */     
/* 464 */     this.gunSlideDistance = 0.0F;
/* 465 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;this.pumpDelayAfterReload = 60;this.pumpDelay = 12;
/* 466 */     this.pumpTime = 30;
/* 467 */     this.gripIsOnPump = false;
/* 468 */     this.pumpHandleDistance = 0.05F;
/*     */     
/*     */ 
/* 471 */     translateAll(0.0F, 0.0F, 0.0F);
/*     */     
/*     */ 
/* 474 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modell96.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */