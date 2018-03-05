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
/*     */ public class Modelvss
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelvss()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[49];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*     */     
/*  72 */     this.gunModel[0].addShapeBox(0.0F, -5.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  73 */     this.gunModel[0].setRotationPoint(0.0F, -0.75F, 0.0F);
/*     */     
/*  75 */     this.gunModel[1].addShapeBox(0.0F, -5.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  76 */     this.gunModel[1].setRotationPoint(0.0F, -0.75F, 0.5F);
/*     */     
/*  78 */     this.gunModel[2].addShapeBox(0.0F, -5.0F, -1.0F, 9, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  79 */     this.gunModel[2].setRotationPoint(-1.0F, -0.25F, 1.0F);
/*     */     
/*  81 */     this.gunModel[3].addShapeBox(0.0F, -5.0F, -1.0F, 9, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  82 */     this.gunModel[3].setRotationPoint(-1.0F, -0.25F, 0.5F);
/*     */     
/*  84 */     this.gunModel[4].addShapeBox(0.0F, -5.0F, -1.0F, 8, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  85 */     this.gunModel[4].setRotationPoint(0.0F, 1.75F, 0.0F);
/*     */     
/*  87 */     this.gunModel[5].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  88 */     this.gunModel[5].setRotationPoint(-1.0F, -0.75F, 0.5F);
/*     */     
/*  90 */     this.gunModel[6].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  91 */     this.gunModel[6].setRotationPoint(-1.0F, -0.75F, 0.0F);
/*     */     
/*  93 */     this.gunModel[7].addShapeBox(0.0F, -5.0F, -1.0F, 5, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  94 */     this.gunModel[7].setRotationPoint(-1.0F, 2.25F, 0.0F);
/*     */     
/*  96 */     this.gunModel[8].addShapeBox(0.0F, -5.0F, -1.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  97 */     this.gunModel[8].setRotationPoint(-1.0F, 3.0F, 0.0F);
/*     */     
/*  99 */     this.gunModel[9].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 100 */     this.gunModel[9].setRotationPoint(1.75F, 2.5F, 0.5F);
/*     */     
/* 102 */     this.gunModel[10].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 103 */     this.gunModel[10].setRotationPoint(2.5F, 3.25F, 0.5F);
/*     */     
/* 105 */     this.gunModel[11].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.8F, -0.5F, -0.65F, -0.8F, -0.5F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 106 */     this.gunModel[11].setRotationPoint(26.5F, -4.8F, -0.88F);
/*     */     
/* 108 */     this.gunModel[12].addShapeBox(0.0F, -5.0F, 0.0F, 9, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 109 */     this.gunModel[12].setRotationPoint(-10.0F, 5.5F, -1.0F);
/*     */     
/* 111 */     this.gunModel[13].addShapeBox(0.0F, -5.0F, 0.0F, 2, 6, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 112 */     this.gunModel[13].setRotationPoint(-12.0F, 1.0F, -1.0F);
/*     */     
/* 114 */     this.gunModel[14].addShapeBox(0.0F, -5.0F, 0.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
/* 115 */     this.gunModel[14].setRotationPoint(-7.5F, 2.5F, -0.75F);
/*     */     
/* 117 */     this.gunModel[15].addShapeBox(0.0F, -5.0F, -1.0F, 9, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 118 */     this.gunModel[15].setRotationPoint(-10.0F, 1.25F, 0.0F);
/*     */     
/* 120 */     this.gunModel[16].addShapeBox(0.0F, -5.0F, -1.0F, 7, 1, 2, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 121 */     this.gunModel[16].setRotationPoint(-9.0F, 0.75F, 0.0F);
/*     */     
/* 123 */     this.gunModel[17].addShapeBox(0.0F, -5.0F, -1.0F, 1, 3, 2, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 124 */     this.gunModel[17].setRotationPoint(-2.0F, 2.5F, 0.0F);
/*     */     
/* 126 */     this.gunModel[18].addShapeBox(0.0F, -5.0F, -1.0F, 0, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 127 */     this.gunModel[18].setRotationPoint(8.0F, -0.75F, 1.0F);
/*     */     
/* 129 */     this.gunModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, 0.05F, -0.8F, 0.0F, 0.5F, -0.8F, 0.0F, 0.5F, -0.8F, 0.0F, 0.05F, -0.8F, 0.0F, 0.1F, 0.05F, 0.0F, 0.5F, 0.05F, 0.0F, 0.5F, 0.05F, 0.0F, 0.1F, 0.05F, 0.0F);
/* 130 */     this.gunModel[19].setRotationPoint(1.0F, -1.25F, -1.0F);
/*     */     
/* 132 */     this.gunModel[20].addShapeBox(0.0F, -5.0F, -1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 133 */     this.gunModel[20].setRotationPoint(4.5F, 2.5F, 0.0F);
/*     */     
/* 135 */     this.gunModel[21].addShapeBox(0.0F, -5.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.35F, 0.0F, 0.0F, 0.3F, -0.25F, 0.0F, 0.3F, -0.5F, 0.0F, 1.35F, -0.5F);
/* 136 */     this.gunModel[21].setRotationPoint(8.0F, 1.4F, -0.5F);
/*     */     
/* 138 */     this.gunModel[22].addShapeBox(0.0F, -5.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, 1.35F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, -0.75F, 0.0F, 1.35F, -0.5F);
/* 139 */     this.gunModel[22].setRotationPoint(8.0F, 1.4F, 2.0F);
/*     */     
/* 141 */     this.gunModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.4F, 0.0F);
/* 142 */     this.gunModel[23].setRotationPoint(8.0F, -4.6F, -1.0F);
/*     */     
/* 144 */     this.gunModel[24].addShapeBox(0.0F, -5.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 145 */     this.gunModel[24].setRotationPoint(8.0F, -0.85F, 1.0F);
/*     */     
/* 147 */     this.gunModel[25].addShapeBox(0.0F, -5.0F, -1.0F, 6, 1, 1, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 148 */     this.gunModel[25].setRotationPoint(8.0F, -0.85F, 0.0F);
/*     */     
/* 150 */     this.gunModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 151 */     this.gunModel[26].setRotationPoint(14.0F, -3.85F, -1.75F);
/*     */     
/* 153 */     this.gunModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 154 */     this.gunModel[27].setRotationPoint(14.0F, -4.85F, -0.25F);
/*     */     
/* 156 */     this.gunModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 157 */     this.gunModel[28].setRotationPoint(14.0F, -4.85F, 0.25F);
/*     */     
/* 159 */     this.gunModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 160 */     this.gunModel[29].setRotationPoint(14.0F, -4.85F, -1.25F);
/*     */     
/* 162 */     this.gunModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 163 */     this.gunModel[30].setRotationPoint(14.0F, -3.35F, 0.25F);
/*     */     
/* 165 */     this.gunModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 166 */     this.gunModel[31].setRotationPoint(14.0F, -3.35F, -1.25F);
/*     */     
/* 168 */     this.gunModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 169 */     this.gunModel[32].setRotationPoint(14.0F, -3.35F, -0.25F);
/*     */     
/* 171 */     this.gunModel[33].addShapeBox(0.0F, -5.0F, -1.0F, 6, 2, 1, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[33].setRotationPoint(-1.0F, -0.25F, -0.5F);
/*     */     
/* 174 */     this.gunModel[34].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 175 */     this.gunModel[34].setRotationPoint(-1.0F, 1.75F, 0.0F);
/*     */     
/* 177 */     this.gunModel[35].addShapeBox(0.0F, -5.0F, -1.0F, 3, 2, 1, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 178 */     this.gunModel[35].setRotationPoint(5.0F, -0.25F, -0.5F);
/*     */     
/* 180 */     this.gunModel[36].addShapeBox(0.0F, -5.0F, -1.0F, 2, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 181 */     this.gunModel[36].setRotationPoint(-1.0F, 6.5F, 0.0F);
/*     */     
/* 183 */     this.gunModel[37].addShapeBox(0.0F, -5.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F);
/* 184 */     this.gunModel[37].setRotationPoint(1.5F, -0.25F, 1.0F);
/*     */     
/* 186 */     this.gunModel[38].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 187 */     this.gunModel[38].setRotationPoint(1.5F, -0.75F, 0.5F);
/*     */     
/* 189 */     this.gunModel[39].addShapeBox(0.0F, -5.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F);
/* 190 */     this.gunModel[39].setRotationPoint(3.5F, -0.25F, 1.0F);
/*     */     
/* 192 */     this.gunModel[40].addShapeBox(0.0F, -5.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F);
/* 193 */     this.gunModel[40].setRotationPoint(5.5F, -0.25F, 1.0F);
/*     */     
/* 195 */     this.gunModel[41].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 196 */     this.gunModel[41].setRotationPoint(3.5F, -0.75F, 0.5F);
/*     */     
/* 198 */     this.gunModel[42].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 199 */     this.gunModel[42].setRotationPoint(5.5F, -0.75F, 0.5F);
/*     */     
/* 201 */     this.gunModel[43].addShapeBox(0.0F, -5.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -1.5F, -0.4F, -0.75F, -1.5F, -0.4F, -0.75F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.4F, -0.75F, -0.5F, -0.4F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 202 */     this.gunModel[43].setRotationPoint(1.5F, -0.25F, -0.5F);
/*     */     
/* 204 */     this.gunModel[44].addShapeBox(0.0F, -5.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -1.5F, -0.4F, -0.75F, -1.5F, -0.4F, -0.75F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.4F, -0.75F, -0.5F, -0.4F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 205 */     this.gunModel[44].setRotationPoint(3.5F, -0.25F, -0.5F);
/*     */     
/* 207 */     this.gunModel[45].addShapeBox(0.0F, -5.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, -1.0F, -0.65F, -0.75F, -1.0F, -0.65F, -0.75F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, -1.0F, -0.65F, -0.75F, -1.0F, -0.65F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 208 */     this.gunModel[45].setRotationPoint(5.5F, -0.25F, -0.5F);
/*     */     
/* 210 */     this.gunModel[46].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 211 */     this.gunModel[46].setRotationPoint(0.75F, -0.75F, 0.0F);
/*     */     
/* 213 */     this.gunModel[47].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 214 */     this.gunModel[47].setRotationPoint(2.75F, -0.75F, 0.0F);
/*     */     
/* 216 */     this.gunModel[48].addShapeBox(0.0F, -5.0F, -1.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.85F, 0.0F, -0.5F, -0.85F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 217 */     this.gunModel[48].setRotationPoint(4.75F, -0.75F, 0.0F);
/*     */     
/*     */ 
/* 220 */     this.defaultScopeModel = new ModelRendererTurbo[36];
/* 221 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 222 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/* 223 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 224 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/* 225 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 226 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/* 227 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/* 228 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/* 229 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/* 230 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/* 231 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 232 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 233 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 234 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/* 235 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 236 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/* 237 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/* 238 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/* 239 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/* 240 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 241 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 242 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 243 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 244 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/* 245 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/* 246 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/* 247 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 248 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/* 249 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/* 250 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/* 251 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/* 252 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/* 253 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/* 254 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/* 255 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 256 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*     */     
/* 258 */     this.defaultScopeModel[0].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 259 */     this.defaultScopeModel[0].setRotationPoint(7.0F, -1.0F, 0.0F);
/*     */     
/* 261 */     this.defaultScopeModel[1].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 262 */     this.defaultScopeModel[1].setRotationPoint(2.0F, -1.0F, 0.0F);
/*     */     
/* 264 */     this.defaultScopeModel[2].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 265 */     this.defaultScopeModel[2].setRotationPoint(7.0F, -1.0F, 0.5F);
/*     */     
/* 267 */     this.defaultScopeModel[3].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 268 */     this.defaultScopeModel[3].setRotationPoint(7.0F, -1.5F, 0.5F);
/*     */     
/* 270 */     this.defaultScopeModel[4].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 271 */     this.defaultScopeModel[4].setRotationPoint(7.0F, -3.0F, 0.0F);
/*     */     
/* 273 */     this.defaultScopeModel[5].addShapeBox(0.0F, -5.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 274 */     this.defaultScopeModel[5].setRotationPoint(2.0F, -3.0F, 0.0F);
/*     */     
/* 276 */     this.defaultScopeModel[6].addShapeBox(0.0F, -5.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 277 */     this.defaultScopeModel[6].setRotationPoint(3.0F, -2.0F, 0.0F);
/*     */     
/* 279 */     this.defaultScopeModel[7].addShapeBox(0.0F, -5.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 280 */     this.defaultScopeModel[7].setRotationPoint(2.0F, -1.5F, -0.65F);
/*     */     
/* 282 */     this.defaultScopeModel[8].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 283 */     this.defaultScopeModel[8].setRotationPoint(2.0F, -1.0F, 0.5F);
/*     */     
/* 285 */     this.defaultScopeModel[9].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 286 */     this.defaultScopeModel[9].setRotationPoint(2.0F, -1.5F, 0.5F);
/*     */     
/* 288 */     this.defaultScopeModel[10].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 289 */     this.defaultScopeModel[10].setRotationPoint(2.0F, -1.0F, 0.0F);
/*     */     
/* 291 */     this.defaultScopeModel[11].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 292 */     this.defaultScopeModel[11].setRotationPoint(2.0F, -1.5F, 0.0F);
/*     */     
/* 294 */     this.defaultScopeModel[12].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 295 */     this.defaultScopeModel[12].setRotationPoint(7.0F, -1.5F, 0.0F);
/*     */     
/* 297 */     this.defaultScopeModel[13].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 298 */     this.defaultScopeModel[13].setRotationPoint(7.0F, -1.0F, 0.0F);
/*     */     
/* 300 */     this.defaultScopeModel[14].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 301 */     this.defaultScopeModel[14].setRotationPoint(0.0F, -2.5F, 0.5F);
/*     */     
/* 303 */     this.defaultScopeModel[15].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 304 */     this.defaultScopeModel[15].setRotationPoint(0.0F, -3.5F, 0.5F);
/*     */     
/* 306 */     this.defaultScopeModel[16].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 307 */     this.defaultScopeModel[16].setRotationPoint(0.0F, -3.5F, -0.5F);
/*     */     
/* 309 */     this.defaultScopeModel[17].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 310 */     this.defaultScopeModel[17].setRotationPoint(0.0F, -3.5F, -1.5F);
/*     */     
/* 312 */     this.defaultScopeModel[18].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 313 */     this.defaultScopeModel[18].setRotationPoint(0.0F, -2.5F, -1.5F);
/*     */     
/* 315 */     this.defaultScopeModel[19].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 316 */     this.defaultScopeModel[19].setRotationPoint(0.0F, -1.5F, -1.5F);
/*     */     
/* 318 */     this.defaultScopeModel[20].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 319 */     this.defaultScopeModel[20].setRotationPoint(0.0F, -1.5F, -0.5F);
/*     */     
/* 321 */     this.defaultScopeModel[21].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F);
/* 322 */     this.defaultScopeModel[21].setRotationPoint(0.0F, -1.5F, 0.5F);
/*     */     
/* 324 */     this.defaultScopeModel[22].addBox(0.0F, -5.0F, 0.0F, 1, 2, 2, 0.0F);
/* 325 */     this.defaultScopeModel[22].setRotationPoint(-1.0F, -3.0F, -1.0F);
/*     */     
/* 327 */     this.defaultScopeModel[23].addShapeBox(0.0F, -5.0F, 0.0F, 8, 1, 1, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 328 */     this.defaultScopeModel[23].setRotationPoint(1.0F, -2.5F, -0.65F);
/*     */     
/* 330 */     this.defaultScopeModel[24].addBox(0.0F, -5.0F, 0.0F, 2, 2, 2, 0.0F);
/* 331 */     this.defaultScopeModel[24].setRotationPoint(-3.0F, -3.0F, -1.0F);
/*     */     
/* 333 */     this.defaultScopeModel[25].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 334 */     this.defaultScopeModel[25].setRotationPoint(9.0F, -2.5F, -1.5F);
/*     */     
/* 336 */     this.defaultScopeModel[26].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 337 */     this.defaultScopeModel[26].setRotationPoint(9.0F, -3.5F, -0.5F);
/*     */     
/* 339 */     this.defaultScopeModel[27].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 340 */     this.defaultScopeModel[27].setRotationPoint(9.0F, -3.5F, -1.5F);
/*     */     
/* 342 */     this.defaultScopeModel[28].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 343 */     this.defaultScopeModel[28].setRotationPoint(9.0F, -1.5F, -1.5F);
/*     */     
/* 345 */     this.defaultScopeModel[29].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 346 */     this.defaultScopeModel[29].setRotationPoint(9.0F, -1.5F, -0.5F);
/*     */     
/* 348 */     this.defaultScopeModel[30].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F);
/* 349 */     this.defaultScopeModel[30].setRotationPoint(9.0F, -1.5F, 0.5F);
/*     */     
/* 351 */     this.defaultScopeModel[31].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 352 */     this.defaultScopeModel[31].setRotationPoint(9.0F, -2.5F, 0.5F);
/*     */     
/* 354 */     this.defaultScopeModel[32].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 355 */     this.defaultScopeModel[32].setRotationPoint(9.0F, -3.5F, 0.5F);
/*     */     
/* 357 */     this.defaultScopeModel[33].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 358 */     this.defaultScopeModel[33].setRotationPoint(0.0F, -2.5F, -0.65F);
/*     */     
/* 360 */     this.defaultScopeModel[34].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F);
/* 361 */     this.defaultScopeModel[34].setRotationPoint(9.0F, -2.5F, -0.75F);
/*     */     
/* 363 */     this.defaultScopeModel[35].addBox(0.0F, -5.0F, 0.0F, 3, 2, 2, 0.0F);
/* 364 */     this.defaultScopeModel[35].setRotationPoint(10.0F, -3.0F, -1.0F);
/*     */     
/*     */ 
/* 367 */     this.ammoModel = new ModelRendererTurbo[1];
/* 368 */     this.ammoModel[0] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*     */     
/* 370 */     this.ammoModel[0].addShapeBox(0.0F, -5.0F, -1.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 371 */     this.ammoModel[0].setRotationPoint(5.75F, 3.5F, 0.0F);
/* 372 */     this.ammoModel[0].rotateAngleZ = 0.2268928F;
/*     */     
/*     */ 
/* 375 */     this.slideModel = new ModelRendererTurbo[1];
/* 376 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*     */     
/* 378 */     this.slideModel[0].addShapeBox(0.0F, -5.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 379 */     this.slideModel[0].setRotationPoint(7.0F, 1.25F, -1.75F);
/*     */     
/*     */ 
/*     */ 
/* 383 */     translateAll(0.0F, -5.5F, 0.0F);
/* 384 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/*     */ 
/* 387 */     this.gunSlideDistance = 0.0F;
/* 388 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*     */     
/*     */ 
/* 391 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelvss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */