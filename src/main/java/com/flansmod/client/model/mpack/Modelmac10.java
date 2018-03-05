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
/*     */ public class Modelmac10
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelmac10()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[49];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*     */     
/*  72 */     this.gunModel[0].addBox(-1.0F, -3.0F, -1.0F, 5, 13, 6, 0.0F);
/*  73 */     this.gunModel[0].setRotationPoint(0.0F, -6.0F, -2.0F);
/*     */     
/*  75 */     this.gunModel[1].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  76 */     this.gunModel[1].setRotationPoint(-1.0F, 0.0F, -2.0F);
/*     */     
/*  78 */     this.gunModel[2].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  79 */     this.gunModel[2].setRotationPoint(-1.0F, -6.0F, -2.0F);
/*     */     
/*  81 */     this.gunModel[3].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  82 */     this.gunModel[3].setRotationPoint(-2.0F, -6.0F, -2.0F);
/*     */     
/*  84 */     this.gunModel[4].addBox(-1.0F, -3.0F, -1.0F, 26, 7, 5, 0.0F);
/*  85 */     this.gunModel[4].setRotationPoint(-7.0F, -13.0F, -1.0F);
/*     */     
/*  87 */     this.gunModel[5].addShapeBox(-1.0F, -3.0F, -1.0F, 26, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  88 */     this.gunModel[5].setRotationPoint(-7.0F, -9.0F, -3.0F);
/*     */     
/*  90 */     this.gunModel[6].addShapeBox(-1.0F, -3.0F, -1.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  91 */     this.gunModel[6].setRotationPoint(-3.0F, -13.0F, -3.0F);
/*     */     
/*  93 */     this.gunModel[7].addShapeBox(-1.0F, -3.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  94 */     this.gunModel[7].setRotationPoint(-7.0F, -13.0F, -3.0F);
/*     */     
/*  96 */     this.gunModel[8].addFlexBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 4);
/*  97 */     this.gunModel[8].setRotationPoint(17.0F, -15.0F, -2.0F);
/*     */     
/*  99 */     this.gunModel[9].addBox(-1.0F, -3.0F, -1.0F, 2, 1, 1, 0.0F);
/* 100 */     this.gunModel[9].setRotationPoint(17.0F, -14.0F, -2.0F);
/*     */     
/* 102 */     this.gunModel[10].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 103 */     this.gunModel[10].setRotationPoint(18.0F, -15.0F, -2.0F);
/*     */     
/* 105 */     this.gunModel[11].addBox(-1.0F, -3.0F, -1.0F, 2, 1, 1, 0.0F);
/* 106 */     this.gunModel[11].setRotationPoint(17.0F, -14.0F, 3.0F);
/*     */     
/* 108 */     this.gunModel[12].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 109 */     this.gunModel[12].setRotationPoint(16.0F, -14.0F, 3.0F);
/*     */     
/* 111 */     this.gunModel[13].addFlexBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 112 */     this.gunModel[13].setRotationPoint(17.0F, -15.0F, 3.0F);
/*     */     
/* 114 */     this.gunModel[14].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 115 */     this.gunModel[14].setRotationPoint(18.0F, -15.0F, 3.0F);
/*     */     
/* 117 */     this.gunModel[15].addShapeBox(-1.0F, -3.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 118 */     this.gunModel[15].setRotationPoint(-7.0F, -13.0F, 4.0F);
/*     */     
/* 120 */     this.gunModel[16].addShapeBox(-1.0F, -3.0F, -1.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 121 */     this.gunModel[16].setRotationPoint(-3.0F, -13.0F, 4.0F);
/*     */     
/* 123 */     this.gunModel[17].addShapeBox(-1.0F, -3.0F, -1.0F, 26, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 124 */     this.gunModel[17].setRotationPoint(-7.0F, -9.0F, 4.0F);
/*     */     
/* 126 */     this.gunModel[18].addShapeBox(-1.0F, -3.0F, -1.0F, 17, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 127 */     this.gunModel[18].setRotationPoint(0.0F, -10.25F, 4.0F);
/*     */     
/* 129 */     this.gunModel[19].addShapeBox(-1.0F, -3.0F, -1.0F, 17, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 130 */     this.gunModel[19].setRotationPoint(0.0F, -12.25F, 4.0F);
/*     */     
/* 132 */     this.gunModel[20].addBox(-1.0F, -3.0F, -1.0F, 1, 3, 3, 0.0F);
/* 133 */     this.gunModel[20].setRotationPoint(19.0F, -11.0F, -0.5F);
/*     */     
/* 135 */     this.gunModel[21].addBox(-1.0F, -3.0F, -1.0F, 5, 2, 2, 0.0F);
/* 136 */     this.gunModel[21].setRotationPoint(20.0F, -10.5F, 0.0F);
/*     */     
/* 138 */     this.gunModel[22].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 139 */     this.gunModel[22].setRotationPoint(-7.0F, -15.0F, 2.0F);
/*     */     
/* 141 */     this.gunModel[23].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 142 */     this.gunModel[23].setRotationPoint(-7.0F, -15.0F, -2.0F);
/*     */     
/* 144 */     this.gunModel[24].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 145 */     this.gunModel[24].setRotationPoint(-7.0F, -14.0F, 0.0F);
/*     */     
/* 147 */     this.gunModel[25].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 148 */     this.gunModel[25].setRotationPoint(-7.0F, -14.0F, 1.0F);
/*     */     
/* 150 */     this.gunModel[26].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 151 */     this.gunModel[26].setRotationPoint(-7.0F, -15.0F, 0.0F);
/*     */     
/* 153 */     this.gunModel[27].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 154 */     this.gunModel[27].setRotationPoint(-7.0F, -15.0F, 1.0F);
/*     */     
/* 156 */     this.gunModel[28].addShapeBox(-1.0F, -3.0F, -1.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 157 */     this.gunModel[28].setRotationPoint(5.0F, -3.0F, -1.0F);
/*     */     
/* 159 */     this.gunModel[29].addShapeBox(-1.0F, -3.0F, -1.0F, 2, 4, 4, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 160 */     this.gunModel[29].setRotationPoint(8.5F, -6.5F, -1.0F);
/*     */     
/* 162 */     this.gunModel[30].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 163 */     this.gunModel[30].setRotationPoint(16.0F, -14.0F, -2.0F);
/*     */     
/* 165 */     this.gunModel[31].addBox(-1.0F, -3.0F, -1.0F, 26, 3, 1, 0.0F);
/* 166 */     this.gunModel[31].setRotationPoint(-7.0F, -9.0F, -2.0F);
/*     */     
/* 168 */     this.gunModel[32].addBox(-1.0F, -3.0F, -1.0F, 8, 4, 1, 0.0F);
/* 169 */     this.gunModel[32].setRotationPoint(-7.0F, -13.0F, -2.0F);
/*     */     
/* 171 */     this.gunModel[33].addBox(-1.0F, -3.0F, -1.0F, 4, 1, 1, 0.0F);
/* 172 */     this.gunModel[33].setRotationPoint(1.0F, -13.0F, -2.0F);
/*     */     
/* 174 */     this.gunModel[34].addBox(-1.0F, -3.0F, -1.0F, 14, 4, 1, 0.0F);
/* 175 */     this.gunModel[34].setRotationPoint(5.0F, -13.0F, -2.0F);
/*     */     
/* 177 */     this.gunModel[35].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 178 */     this.gunModel[35].setRotationPoint(6.5F, -6.0F, 0.0F);
/*     */     
/* 180 */     this.gunModel[36].addBox(-1.0F, -3.0F, -1.0F, 1, 2, 1, 0.0F);
/* 181 */     this.gunModel[36].setRotationPoint(18.0F, -15.0F, 0.5F);
/*     */     
/* 183 */     this.gunModel[37].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 184 */     this.gunModel[37].setRotationPoint(-8.0F, -8.0F, -1.0F);
/*     */     
/* 186 */     this.gunModel[38].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 187 */     this.gunModel[38].setRotationPoint(-8.0F, -4.0F, 0.0F);
/*     */     
/* 189 */     this.gunModel[39].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 190 */     this.gunModel[39].setRotationPoint(-8.0F, -8.0F, 2.5F);
/*     */     
/* 192 */     this.gunModel[40].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 3, 0, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 193 */     this.gunModel[40].setRotationPoint(-9.0F, -6.0F, 3.5F);
/*     */     
/* 195 */     this.gunModel[41].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 3, 0, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 196 */     this.gunModel[41].setRotationPoint(-9.0F, -6.0F, -1.0F);
/*     */     
/* 198 */     this.gunModel[42].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 199 */     this.gunModel[42].setRotationPoint(-8.5F, -15.0F, -1.0F);
/*     */     
/* 201 */     this.gunModel[43].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 11, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 202 */     this.gunModel[43].setRotationPoint(-8.5F, -15.0F, 2.0F);
/*     */     
/* 204 */     this.gunModel[44].addShapeBox(-1.0F, -3.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 205 */     this.gunModel[44].setRotationPoint(-7.5F, -16.0F, 2.0F);
/*     */     
/* 207 */     this.gunModel[45].addShapeBox(-1.0F, -3.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 208 */     this.gunModel[45].setRotationPoint(-7.5F, -16.0F, -1.0F);
/*     */     
/* 210 */     this.gunModel[46].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 211 */     this.gunModel[46].setRotationPoint(-8.5F, -16.0F, 2.0F);
/*     */     
/* 213 */     this.gunModel[47].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 214 */     this.gunModel[47].setRotationPoint(-8.5F, -16.0F, -1.0F);
/*     */     
/* 216 */     this.gunModel[48].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 217 */     this.gunModel[48].setRotationPoint(-0.5F, -15.13F, 0.0F);
/*     */     
/*     */ 
/* 220 */     this.ammoModel = new ModelRendererTurbo[1];
/* 221 */     this.ammoModel[0] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*     */     
/* 223 */     this.ammoModel[0].addBox(-1.0F, -3.0F, -1.0F, 4, 18, 4, 0.0F);
/* 224 */     this.ammoModel[0].setRotationPoint(0.5F, 0.0F, -1.0F);
/*     */     
/*     */ 
/* 227 */     this.slideModel = new ModelRendererTurbo[4];
/* 228 */     this.slideModel[0] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/* 229 */     this.slideModel[1] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 230 */     this.slideModel[2] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 231 */     this.slideModel[3] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*     */     
/* 233 */     this.slideModel[0].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 234 */     this.slideModel[0].setRotationPoint(12.0F, -14.0F, 0.5F);
/*     */     
/* 236 */     this.slideModel[1].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/* 237 */     this.slideModel[1].setRotationPoint(11.5F, -14.5F, 0.0F);
/*     */     
/* 239 */     this.slideModel[2].addShapeBox(-1.0F, -3.0F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 240 */     this.slideModel[2].setRotationPoint(12.5F, -14.5F, 0.0F);
/*     */     
/* 242 */     this.slideModel[3].addShapeBox(-1.0F, -3.0F, -1.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 243 */     this.slideModel[3].setRotationPoint(1.0F, -12.0F, -2.0F);
/*     */     
/*     */ 
/* 246 */     translateAll(0.0F, -3.75F, 0.0F);
/* 247 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.1F, 0.0F);
/*     */     
/* 249 */     this.gunSlideDistance = 0.4F;
/* 250 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 252 */     this.tiltGun = 7.0F;
/* 253 */     this.rotateGunVertical = 3.0F;
/* 254 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 256 */     this.rotateClipVertical = 5.0F;
/* 257 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/*     */     
/*     */ 
/* 260 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmac10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */