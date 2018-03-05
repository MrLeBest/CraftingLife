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
/*     */ public class Modelg18
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelg18()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[49];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 241, 25, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
/*     */     
/*  72 */     this.gunModel[0].addBox(-1.0F, -7.0F, -4.0F, 34, 4, 8, 0.0F);
/*  73 */     this.gunModel[0].setRotationPoint(-4.0F, -30.0F, -0.5F);
/*     */     
/*  75 */     this.gunModel[1].addShapeBox(-1.0F, -7.0F, -4.0F, 14, 23, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  76 */     this.gunModel[1].setRotationPoint(-4.0F, -24.0F, -0.5F);
/*     */     
/*  78 */     this.gunModel[2].addShapeBox(-1.0F, -7.0F, -4.0F, 6, 1, 9, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  79 */     this.gunModel[2].setRotationPoint(-10.0F, -30.0F, -0.5F);
/*     */     
/*  81 */     this.gunModel[3].addShapeBox(-1.0F, -7.0F, -4.0F, 3, 11, 9, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  82 */     this.gunModel[3].setRotationPoint(-7.0F, -24.0F, -0.5F);
/*     */     
/*  84 */     this.gunModel[4].addBox(-1.0F, -7.0F, -4.0F, 52, 2, 1, 0.0F);
/*  85 */     this.gunModel[4].setRotationPoint(-9.0F, -30.5F, 5.5F);
/*     */     
/*  87 */     this.gunModel[5].addBox(-1.0F, -7.0F, -4.0F, 52, 2, 1, 0.0F);
/*  88 */     this.gunModel[5].setRotationPoint(-9.0F, -30.5F, 1.5F);
/*     */     
/*  90 */     this.gunModel[6].addBox(-1.0F, -7.0F, -4.0F, 23, 4, 4, 0.0F);
/*  91 */     this.gunModel[6].setRotationPoint(22.0F, -35.2F, 2.0F);
/*     */     
/*  93 */     this.gunModel[7].addBox(-1.0F, -7.0F, -4.0F, 13, 2, 7, 0.0F);
/*  94 */     this.gunModel[7].setRotationPoint(31.0F, -30.0F, 0.5F);
/*     */     
/*  96 */     this.gunModel[8].addBox(-1.0F, -7.0F, -4.0F, 13, 1, 4, 0.0F);
/*  97 */     this.gunModel[8].setRotationPoint(31.0F, -28.0F, 2.0F);
/*     */     
/*  99 */     this.gunModel[9].addBox(-1.0F, -7.0F, -4.0F, 9, 1, 7, 0.0F);
/* 100 */     this.gunModel[9].setRotationPoint(31.0F, -27.0F, 0.5F);
/*     */     
/* 102 */     this.gunModel[10].addBox(-1.0F, -7.0F, -4.0F, 2, 1, 7, 0.0F);
/* 103 */     this.gunModel[10].setRotationPoint(42.0F, -27.0F, 0.5F);
/*     */     
/* 105 */     this.gunModel[11].addShapeBox(-1.0F, -7.0F, -4.0F, 3, 1, 9, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 106 */     this.gunModel[11].setRotationPoint(-7.0F, -29.0F, -0.5F);
/*     */     
/* 108 */     this.gunModel[12].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 2, 9, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 109 */     this.gunModel[12].setRotationPoint(-5.0F, -28.0F, -0.5F);
/*     */     
/* 111 */     this.gunModel[13].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 112 */     this.gunModel[13].setRotationPoint(-5.0F, -26.0F, -0.5F);
/*     */     
/* 114 */     this.gunModel[14].addShapeBox(-1.0F, -7.0F, -4.0F, 4, 7, 9, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 115 */     this.gunModel[14].setRotationPoint(-10.0F, -13.0F, -0.5F);
/*     */     
/* 117 */     this.gunModel[15].addShapeBox(-1.0F, -7.0F, -4.0F, 5, 4, 9, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 118 */     this.gunModel[15].setRotationPoint(-11.0F, -6.0F, -0.5F);
/*     */     
/* 120 */     this.gunModel[16].addShapeBox(-1.0F, -7.0F, -4.0F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 121 */     this.gunModel[16].setRotationPoint(-11.0F, -2.0F, -0.5F);
/*     */     
/* 123 */     this.gunModel[17].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 124 */     this.gunModel[17].setRotationPoint(30.0F, -30.0F, 7.5F);
/*     */     
/* 126 */     this.gunModel[18].addBox(-1.0F, -7.0F, -4.0F, 1, 2, 7, 0.0F);
/* 127 */     this.gunModel[18].setRotationPoint(31.0F, -30.0F, 0.5F);
/*     */     
/* 129 */     this.gunModel[19].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 130 */     this.gunModel[19].setRotationPoint(30.0F, -30.0F, -0.5F);
/*     */     
/* 132 */     this.gunModel[20].addBox(-1.0F, -7.0F, -4.0F, 1, 4, 7, 0.0F);
/* 133 */     this.gunModel[20].setRotationPoint(30.0F, -30.0F, 0.5F);
/*     */     
/* 135 */     this.gunModel[21].addBox(-1.0F, -7.0F, -4.0F, 2, 12, 9, 0.0F);
/* 136 */     this.gunModel[21].setRotationPoint(-6.0F, -13.0F, -0.5F);
/*     */     
/* 138 */     this.gunModel[22].addBox(-1.0F, -7.0F, -4.0F, 14, 2, 9, 0.0F);
/* 139 */     this.gunModel[22].setRotationPoint(-4.0F, -26.0F, -0.5F);
/*     */     
/* 141 */     this.gunModel[23].addBox(-1.0F, -7.0F, -4.0F, 10, 2, 5, 0.0F);
/* 142 */     this.gunModel[23].setRotationPoint(11.0F, -18.0F, 1.5F);
/*     */     
/* 144 */     this.gunModel[24].addBox(-1.0F, -7.0F, -4.0F, 2, 10, 5, 0.0F);
/* 145 */     this.gunModel[24].setRotationPoint(21.0F, -26.0F, 1.5F);
/*     */     
/* 147 */     this.gunModel[25].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 148 */     this.gunModel[25].setRotationPoint(23.0F, -21.0F, 1.5F);
/*     */     
/* 150 */     this.gunModel[26].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 151 */     this.gunModel[26].setRotationPoint(23.0F, -26.0F, 1.5F);
/*     */     
/* 153 */     this.gunModel[27].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 2, 5, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 154 */     this.gunModel[27].setRotationPoint(19.0F, -20.0F, 1.5F);
/*     */     
/* 156 */     this.gunModel[28].addShapeBox(-1.0F, -7.0F, -4.0F, 4, 2, 5, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 157 */     this.gunModel[28].setRotationPoint(7.0F, -18.0F, 1.5F);
/*     */     
/* 159 */     this.gunModel[29].addShapeBox(-1.0F, -7.0F, -4.0F, 12, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 160 */     this.gunModel[29].setRotationPoint(10.0F, -26.0F, -0.5F);
/*     */     
/* 162 */     this.gunModel[30].addShapeBox(-1.0F, -7.0F, -4.0F, 14, 22, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 163 */     this.gunModel[30].setRotationPoint(-3.0F, -23.0F, 1.0F);
/*     */     
/* 165 */     this.gunModel[31].addShapeBox(-1.0F, -7.0F, -4.0F, 12, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 166 */     this.gunModel[31].setRotationPoint(11.0F, -26.0F, 1.0F);
/*     */     
/* 168 */     this.gunModel[32].addBox(-1.0F, -7.0F, -4.0F, 2, 2, 6, 0.0F);
/* 169 */     this.gunModel[32].setRotationPoint(9.0F, -25.0F, 1.0F);
/*     */     
/* 171 */     this.gunModel[33].addShapeBox(-1.0F, -7.0F, -4.0F, 8, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 172 */     this.gunModel[33].setRotationPoint(23.0F, -26.0F, 1.0F);
/*     */     
/* 174 */     this.gunModel[34].addShapeBox(-1.0F, -7.0F, -4.0F, 4, 1, 6, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 175 */     this.gunModel[34].setRotationPoint(-8.0F, -29.0F, 1.0F);
/*     */     
/* 177 */     this.gunModel[35].addShapeBox(-1.0F, -7.0F, -4.0F, 7, 1, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 178 */     this.gunModel[35].setRotationPoint(-11.0F, -30.0F, 1.0F);
/*     */     
/* 180 */     this.gunModel[36].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 2, 6, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 181 */     this.gunModel[36].setRotationPoint(-6.0F, -28.0F, 1.0F);
/*     */     
/* 183 */     this.gunModel[37].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 2, 6, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 184 */     this.gunModel[37].setRotationPoint(-5.0F, -26.0F, 1.0F);
/*     */     
/* 186 */     this.gunModel[38].addShapeBox(-1.0F, -7.0F, -4.0F, 4, 11, 6, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 187 */     this.gunModel[38].setRotationPoint(-8.0F, -24.0F, 1.0F);
/*     */     
/* 189 */     this.gunModel[39].addShapeBox(-1.0F, -7.0F, -4.0F, 4, 7, 6, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 190 */     this.gunModel[39].setRotationPoint(-11.0F, -13.0F, 1.0F);
/*     */     
/* 192 */     this.gunModel[40].addShapeBox(-1.0F, -7.0F, -4.0F, 5, 4, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 193 */     this.gunModel[40].setRotationPoint(-12.0F, -6.0F, 1.0F);
/*     */     
/* 195 */     this.gunModel[41].addShapeBox(-1.0F, -7.0F, -4.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 196 */     this.gunModel[41].setRotationPoint(-12.0F, -2.0F, 1.0F);
/*     */     
/* 198 */     this.gunModel[42].addShapeBox(-1.0F, -7.0F, -4.0F, 22, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 199 */     this.gunModel[42].setRotationPoint(-4.0F, -30.0F, 7.5F);
/*     */     
/* 201 */     this.gunModel[43].addShapeBox(-1.0F, -7.0F, -4.0F, 10, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 202 */     this.gunModel[43].setRotationPoint(20.0F, -30.0F, 7.5F);
/*     */     
/* 204 */     this.gunModel[44].addBox(-1.0F, -7.0F, -4.0F, 3, 2, 1, 0.0F);
/* 205 */     this.gunModel[44].setRotationPoint(7.0F, -30.0F, 8.5F);
/*     */     
/* 207 */     this.gunModel[45].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 208 */     this.gunModel[45].setRotationPoint(19.0F, -29.0F, 7.5F);
/*     */     
/* 210 */     this.gunModel[46].addShapeBox(-1.0F, -7.0F, -4.0F, 5, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 211 */     this.gunModel[46].setRotationPoint(17.0F, -30.0F, 7.5F);
/*     */     
/* 213 */     this.gunModel[47].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 214 */     this.gunModel[47].setRotationPoint(3.75F, -19.0F, 6.0F);
/* 215 */     this.gunModel[47].rotateAngleZ = -0.27925268F;
/*     */     
/* 217 */     this.gunModel[48].addShapeBox(-1.0F, -7.0F, -4.0F, 3, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 218 */     this.gunModel[48].setRotationPoint(13.0F, -26.0F, 3.0F);
/*     */     
/*     */ 
/* 221 */     this.ammoModel = new ModelRendererTurbo[2];
/* 222 */     this.ammoModel[0] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/* 223 */     this.ammoModel[1] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/*     */     
/* 225 */     this.ammoModel[0].addShapeBox(-1.0F, -7.0F, -4.0F, 20, 40, 7, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 226 */     this.ammoModel[0].setRotationPoint(-11.0F, -25.0F, 0.5F);
/*     */     
/* 228 */     this.ammoModel[1].addBox(-1.0F, -7.0F, -4.0F, 13, 2, 8, 0.0F);
/* 229 */     this.ammoModel[1].setRotationPoint(-12.0F, 15.0F, 0.0F);
/*     */     
/*     */ 
/* 232 */     this.slideModel = new ModelRendererTurbo[40];
/* 233 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 234 */     this.slideModel[1] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/* 235 */     this.slideModel[2] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/* 236 */     this.slideModel[3] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/* 237 */     this.slideModel[4] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/* 238 */     this.slideModel[5] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/* 239 */     this.slideModel[6] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 240 */     this.slideModel[7] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/* 241 */     this.slideModel[8] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/* 242 */     this.slideModel[9] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 243 */     this.slideModel[10] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 244 */     this.slideModel[11] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 245 */     this.slideModel[12] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 246 */     this.slideModel[13] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 247 */     this.slideModel[14] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 248 */     this.slideModel[15] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/* 249 */     this.slideModel[16] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/* 250 */     this.slideModel[17] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 251 */     this.slideModel[18] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/* 252 */     this.slideModel[19] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 253 */     this.slideModel[20] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 254 */     this.slideModel[21] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/* 255 */     this.slideModel[22] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/* 256 */     this.slideModel[23] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/* 257 */     this.slideModel[24] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 258 */     this.slideModel[25] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/* 259 */     this.slideModel[26] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 260 */     this.slideModel[27] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/* 261 */     this.slideModel[28] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/* 262 */     this.slideModel[29] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 263 */     this.slideModel[30] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 264 */     this.slideModel[31] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 265 */     this.slideModel[32] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 266 */     this.slideModel[33] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 267 */     this.slideModel[34] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 268 */     this.slideModel[35] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 269 */     this.slideModel[36] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 270 */     this.slideModel[37] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 271 */     this.slideModel[38] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 272 */     this.slideModel[39] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*     */     
/* 274 */     this.slideModel[0].addBox(-1.0F, -7.0F, -4.0F, 21, 5, 6, 0.0F);
/* 275 */     this.slideModel[0].setRotationPoint(22.0F, -36.2F, 1.0F);
/*     */     
/* 277 */     this.slideModel[1].addBox(-1.0F, -7.0F, -4.0F, 8, 5, 6, 0.0F);
/* 278 */     this.slideModel[1].setRotationPoint(14.0F, -35.7F, 1.0F);
/*     */     
/* 280 */     this.slideModel[2].addShapeBox(-1.0F, -7.0F, -4.0F, 39, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 281 */     this.slideModel[2].setRotationPoint(5.0F, -36.2F, 7.0F);
/*     */     
/* 283 */     this.slideModel[3].addShapeBox(-1.0F, -7.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 284 */     this.slideModel[3].setRotationPoint(40.0F, -37.0F, 3.5F);
/*     */     
/* 286 */     this.slideModel[4].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 287 */     this.slideModel[4].setRotationPoint(-7.0F, -37.2F, 2.5F);
/*     */     
/* 289 */     this.slideModel[5].addBox(-1.0F, -7.0F, -4.0F, 2, 1, 1, 0.0F);
/* 290 */     this.slideModel[5].setRotationPoint(-7.0F, -37.2F, 3.5F);
/*     */     
/* 292 */     this.slideModel[6].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 293 */     this.slideModel[6].setRotationPoint(-7.0F, -36.2F, 7.0F);
/*     */     
/* 295 */     this.slideModel[7].addBox(-1.0F, -7.0F, -4.0F, 1, 1, 6, 0.0F);
/* 296 */     this.slideModel[7].setRotationPoint(43.0F, -36.2F, 1.0F);
/*     */     
/* 298 */     this.slideModel[8].addBox(-1.0F, -7.0F, -4.0F, 2, 4, 1, 0.0F);
/* 299 */     this.slideModel[8].setRotationPoint(42.0F, -35.2F, 6.0F);
/*     */     
/* 301 */     this.slideModel[9].addBox(-1.0F, -7.0F, -4.0F, 1, 4, 1, 0.0F);
/* 302 */     this.slideModel[9].setRotationPoint(43.0F, -35.2F, 1.0F);
/*     */     
/* 304 */     this.slideModel[10].addBox(-1.0F, -7.0F, -4.0F, 1, 1, 6, 0.0F);
/* 305 */     this.slideModel[10].setRotationPoint(43.0F, -31.2F, 1.0F);
/*     */     
/* 307 */     this.slideModel[11].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 308 */     this.slideModel[11].setRotationPoint(-5.0F, -36.2F, 7.0F);
/*     */     
/* 310 */     this.slideModel[12].addShapeBox(-1.0F, -7.0F, -4.0F, 3, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 311 */     this.slideModel[12].setRotationPoint(-3.0F, -36.2F, 7.0F);
/*     */     
/* 313 */     this.slideModel[13].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 314 */     this.slideModel[13].setRotationPoint(3.0F, -36.2F, 7.0F);
/*     */     
/* 316 */     this.slideModel[14].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 317 */     this.slideModel[14].setRotationPoint(1.0F, -36.2F, 7.0F);
/*     */     
/* 319 */     this.slideModel[15].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 320 */     this.slideModel[15].setRotationPoint(-7.0F, -36.2F, 0.0F);
/*     */     
/* 322 */     this.slideModel[16].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 323 */     this.slideModel[16].setRotationPoint(-5.0F, -36.2F, 0.0F);
/*     */     
/* 325 */     this.slideModel[17].addShapeBox(-1.0F, -7.0F, -4.0F, 3, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 326 */     this.slideModel[17].setRotationPoint(-3.0F, -36.2F, 0.0F);
/*     */     
/* 328 */     this.slideModel[18].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 329 */     this.slideModel[18].setRotationPoint(1.0F, -36.2F, 0.0F);
/*     */     
/* 331 */     this.slideModel[19].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 332 */     this.slideModel[19].setRotationPoint(3.0F, -36.2F, 0.0F);
/*     */     
/* 334 */     this.slideModel[20].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 335 */     this.slideModel[20].setRotationPoint(-10.0F, -36.2F, 7.0F);
/*     */     
/* 337 */     this.slideModel[21].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 338 */     this.slideModel[21].setRotationPoint(-10.0F, -36.2F, 0.0F);
/*     */     
/* 340 */     this.slideModel[22].addShapeBox(-1.0F, -7.0F, -4.0F, 9, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 341 */     this.slideModel[22].setRotationPoint(5.0F, -36.2F, 0.0F);
/*     */     
/* 343 */     this.slideModel[23].addShapeBox(-1.0F, -7.0F, -4.0F, 22, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 344 */     this.slideModel[23].setRotationPoint(22.0F, -36.2F, 0.0F);
/*     */     
/* 346 */     this.slideModel[24].addShapeBox(-1.0F, -7.0F, -4.0F, 8, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 347 */     this.slideModel[24].setRotationPoint(14.0F, -32.2F, 0.0F);
/*     */     
/* 349 */     this.slideModel[25].addBox(-1.0F, -7.0F, -4.0F, 24, 6, 6, 0.0F);
/* 350 */     this.slideModel[25].setRotationPoint(-10.0F, -36.2F, 1.0F);
/*     */     
/* 352 */     this.slideModel[26].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 353 */     this.slideModel[26].setRotationPoint(-7.0F, -37.2F, 4.5F);
/*     */     
/* 355 */     this.slideModel[27].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 356 */     this.slideModel[27].setRotationPoint(-7.0F, -37.2F, 5.5F);
/*     */     
/* 358 */     this.slideModel[28].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 359 */     this.slideModel[28].setRotationPoint(-7.0F, -37.2F, 1.5F);
/*     */     
/* 361 */     this.slideModel[29].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 362 */     this.slideModel[29].setRotationPoint(-5.0F, -34.2F, 1.0F);
/*     */     
/* 364 */     this.slideModel[30].addShapeBox(-1.0F, -7.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 365 */     this.slideModel[30].setRotationPoint(-5.0F, -33.2F, 8.0F);
/*     */     
/* 367 */     this.slideModel[31].addShapeBox(-1.0F, -7.0F, -4.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 368 */     this.slideModel[31].setRotationPoint(-5.0F, -32.2F, 1.0F);
/*     */     
/* 370 */     this.slideModel[32].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 371 */     this.slideModel[32].setRotationPoint(-5.0F, -36.2F, 1.0F);
/*     */     
/* 373 */     this.slideModel[33].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 374 */     this.slideModel[33].setRotationPoint(-4.0F, -34.2F, 8.0F);
/*     */     
/* 376 */     this.slideModel[34].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 377 */     this.slideModel[34].setRotationPoint(-4.0F, -32.2F, 8.0F);
/*     */     
/* 379 */     this.slideModel[35].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 380 */     this.slideModel[35].setRotationPoint(-5.0F, -32.2F, 8.0F);
/*     */     
/* 382 */     this.slideModel[36].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 383 */     this.slideModel[36].setRotationPoint(-5.0F, -34.2F, 8.0F);
/*     */     
/* 385 */     this.slideModel[37].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 386 */     this.slideModel[37].setRotationPoint(-3.0F, -34.2F, 8.0F);
/*     */     
/* 388 */     this.slideModel[38].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 389 */     this.slideModel[38].setRotationPoint(-3.0F, -32.2F, 8.0F);
/*     */     
/* 391 */     this.slideModel[39].addShapeBox(-1.0F, -7.0F, -4.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 392 */     this.slideModel[39].setRotationPoint(-0.15F, -34.8F, 9.0F);
/* 393 */     this.slideModel[39].rotateAngleZ = 0.7853982F;
/*     */     
/*     */ 
/*     */ 
/* 397 */     translateAll(0.0F, -9.0F, 0.0F);
/* 398 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 400 */     this.gunSlideDistance = 1.5F;
/* 401 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 403 */     this.tiltGun = 7.0F;
/* 404 */     this.rotateGunVertical = 3.0F;
/* 405 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 407 */     this.rotateClipVertical = 5.0F;
/* 408 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/*     */     
/*     */ 
/* 411 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelg18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */