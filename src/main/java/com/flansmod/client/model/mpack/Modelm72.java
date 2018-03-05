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
/*     */ public class Modelm72
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelm72()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[36];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*     */     
/*  59 */     this.gunModel[0].addBox(6.0F, -4.0F, 0.0F, 5, 1, 3, 0.0F);
/*  60 */     this.gunModel[0].setRotationPoint(-10.0F, 0.0F, -1.5F);
/*     */     
/*  62 */     this.gunModel[1].addBox(6.0F, -4.0F, 0.0F, 4, 2, 3, 0.0F);
/*  63 */     this.gunModel[1].setRotationPoint(-9.0F, -2.0F, -1.5F);
/*     */     
/*  65 */     this.gunModel[2].addShapeBox(6.0F, -4.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  66 */     this.gunModel[2].setRotationPoint(-9.0F, -3.0F, -1.5F);
/*     */     
/*  68 */     this.gunModel[3].addBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F);
/*  69 */     this.gunModel[3].setRotationPoint(-6.0F, -3.0F, -0.5F);
/*     */     
/*  71 */     this.gunModel[4].addShapeBox(6.0F, -4.0F, 0.0F, 4, 2, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  72 */     this.gunModel[4].setRotationPoint(-13.0F, -2.0F, -1.5F);
/*     */     
/*  74 */     this.gunModel[5].addShapeBox(6.0F, -4.0F, 0.0F, 5, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  75 */     this.gunModel[5].setRotationPoint(-11.0F, 1.0F, -1.5F);
/*     */     
/*  77 */     this.gunModel[6].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  78 */     this.gunModel[6].setRotationPoint(-10.0F, 3.0F, -1.5F);
/*     */     
/*  80 */     this.gunModel[7].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  81 */     this.gunModel[7].setRotationPoint(-12.0F, 3.0F, -1.5F);
/*     */     
/*  83 */     this.gunModel[8].addFlexBox(6.0F, -4.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  84 */     this.gunModel[8].setRotationPoint(-14.0F, 2.0F, -1.5F);
/*     */     
/*  86 */     this.gunModel[9].addFlexBox(6.0F, -4.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  87 */     this.gunModel[9].setRotationPoint(-16.0F, 2.0F, -1.5F);
/*     */     
/*  89 */     this.gunModel[10].addShapeBox(6.0F, -4.0F, 0.0F, 14, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  90 */     this.gunModel[10].setRotationPoint(-26.0F, 3.0F, -1.5F);
/*     */     
/*  92 */     this.gunModel[11].addFlexBox(6.0F, -4.0F, 0.0F, 14, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  93 */     this.gunModel[11].setRotationPoint(-26.0F, 0.0F, -1.5F);
/*     */     
/*  95 */     this.gunModel[12].addFlexBox(6.0F, -4.0F, 0.0F, 10, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/*  96 */     this.gunModel[12].setRotationPoint(-26.0F, 2.0F, -1.5F);
/*     */     
/*  98 */     this.gunModel[13].addShapeBox(6.0F, -4.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  99 */     this.gunModel[13].setRotationPoint(-6.0F, -3.0F, 0.5F);
/*     */     
/* 101 */     this.gunModel[14].addShapeBox(6.0F, -4.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 102 */     this.gunModel[14].setRotationPoint(-6.0F, -3.0F, -1.5F);
/*     */     
/* 104 */     this.gunModel[15].addShapeBox(6.0F, -4.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 105 */     this.gunModel[15].setRotationPoint(-9.0F, -3.0F, -0.5F);
/*     */     
/* 107 */     this.gunModel[16].addShapeBox(6.0F, -4.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 108 */     this.gunModel[16].setRotationPoint(-9.0F, -3.0F, 0.5F);
/*     */     
/* 110 */     this.gunModel[17].addShapeBox(6.0F, -4.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 111 */     this.gunModel[17].setRotationPoint(-5.5F, -4.0F, -0.5F);
/*     */     
/* 113 */     this.gunModel[18].addShapeBox(6.0F, -4.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 114 */     this.gunModel[18].setRotationPoint(-5.0F, -3.0F, -0.5F);
/*     */     
/* 116 */     this.gunModel[19].addShapeBox(6.0F, -4.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 117 */     this.gunModel[19].setRotationPoint(-5.0F, -2.0F, -1.0F);
/*     */     
/* 119 */     this.gunModel[20].addShapeBox(6.0F, -4.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 120 */     this.gunModel[20].setRotationPoint(-5.0F, -2.0F, 1.0F);
/*     */     
/* 122 */     this.gunModel[21].addShapeBox(6.0F, -4.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 123 */     this.gunModel[21].setRotationPoint(-5.0F, -2.0F, -1.5F);
/*     */     
/* 125 */     this.gunModel[22].addFlexBox(6.0F, -4.0F, 0.0F, 10, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 126 */     this.gunModel[22].setRotationPoint(-24.0F, -1.0F, -1.5F);
/*     */     
/* 128 */     this.gunModel[23].addFlexBox(6.0F, -4.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4);
/* 129 */     this.gunModel[23].setRotationPoint(-14.0F, -1.0F, -1.5F);
/*     */     
/* 131 */     this.gunModel[24].addFlexBox(6.0F, -4.0F, 0.0F, 1, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 4);
/* 132 */     this.gunModel[24].setRotationPoint(-25.0F, -1.0F, -1.5F);
/*     */     
/* 134 */     this.gunModel[25].addFlexBox(6.0F, -4.0F, 0.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 135 */     this.gunModel[25].setRotationPoint(-12.0F, 1.0F, -1.5F);
/*     */     
/* 137 */     this.gunModel[26].addFlexBox(6.0F, -4.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4);
/* 138 */     this.gunModel[26].setRotationPoint(-12.0F, 0.0F, -1.5F);
/*     */     
/* 140 */     this.gunModel[27].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 141 */     this.gunModel[27].setRotationPoint(-6.0F, 1.0F, -0.5F);
/*     */     
/* 143 */     this.gunModel[28].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 144 */     this.gunModel[28].setRotationPoint(-5.0F, 2.0F, -0.5F);
/*     */     
/* 146 */     this.gunModel[29].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 147 */     this.gunModel[29].setRotationPoint(-5.0F, 1.5F, -0.5F);
/*     */     
/* 149 */     this.gunModel[30].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 150 */     this.gunModel[30].setRotationPoint(-4.0F, 2.0F, -0.5F);
/*     */     
/* 152 */     this.gunModel[31].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 153 */     this.gunModel[31].setRotationPoint(-3.0F, 1.0F, -0.5F);
/*     */     
/* 155 */     this.gunModel[32].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 156 */     this.gunModel[32].setRotationPoint(-3.5F, 1.5F, -0.5F);
/*     */     
/* 158 */     this.gunModel[33].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
/* 159 */     this.gunModel[33].setRotationPoint(-4.75F, 1.0F, -0.5F);
/*     */     
/* 161 */     this.gunModel[34].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.7F, 0.0F);
/* 162 */     this.gunModel[34].setRotationPoint(-7.0F, -3.0F, -0.5F);
/*     */     
/* 164 */     this.gunModel[35].addBox(6.0F, -4.0F, 0.0F, 5, 1, 3, 0.0F);
/* 165 */     this.gunModel[35].setRotationPoint(-5.0F, 0.0F, -1.5F);
/*     */     
/*     */ 
/* 168 */     this.ammoModel = new ModelRendererTurbo[2];
/* 169 */     this.ammoModel[0] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/* 170 */     this.ammoModel[1] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*     */     
/* 172 */     this.ammoModel[0].addBox(6.0F, -4.0F, 0.0F, 3, 1, 1, 0.0F);
/* 173 */     this.ammoModel[0].setRotationPoint(2.0F, -2.5F, -0.5F);
/*     */     
/* 175 */     this.ammoModel[1].addBox(6.0F, -4.0F, 0.0F, 3, 1, 1, 0.0F);
/* 176 */     this.ammoModel[1].setRotationPoint(2.0F, -0.5F, -0.5F);
/*     */     
/*     */ 
/* 179 */     this.breakActionModel = new ModelRendererTurbo[80];
/* 180 */     this.breakActionModel[0] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/* 181 */     this.breakActionModel[1] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/* 182 */     this.breakActionModel[2] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/* 183 */     this.breakActionModel[3] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 184 */     this.breakActionModel[4] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/* 185 */     this.breakActionModel[5] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/* 186 */     this.breakActionModel[6] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 187 */     this.breakActionModel[7] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/* 188 */     this.breakActionModel[8] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/* 189 */     this.breakActionModel[9] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/* 190 */     this.breakActionModel[10] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/* 191 */     this.breakActionModel[11] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/* 192 */     this.breakActionModel[12] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/* 193 */     this.breakActionModel[13] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/* 194 */     this.breakActionModel[14] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/* 195 */     this.breakActionModel[15] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 196 */     this.breakActionModel[16] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/* 197 */     this.breakActionModel[17] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/* 198 */     this.breakActionModel[18] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/* 199 */     this.breakActionModel[19] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/* 200 */     this.breakActionModel[20] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/* 201 */     this.breakActionModel[21] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/* 202 */     this.breakActionModel[22] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/* 203 */     this.breakActionModel[23] = new ModelRendererTurbo(this, 249, 9, this.textureX, this.textureY);
/* 204 */     this.breakActionModel[24] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/* 205 */     this.breakActionModel[25] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/* 206 */     this.breakActionModel[26] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/* 207 */     this.breakActionModel[27] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 208 */     this.breakActionModel[28] = new ModelRendererTurbo(this, 321, 9, this.textureX, this.textureY);
/* 209 */     this.breakActionModel[29] = new ModelRendererTurbo(this, 337, 9, this.textureX, this.textureY);
/* 210 */     this.breakActionModel[30] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/* 211 */     this.breakActionModel[31] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/* 212 */     this.breakActionModel[32] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/* 213 */     this.breakActionModel[33] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/* 214 */     this.breakActionModel[34] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/* 215 */     this.breakActionModel[35] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/* 216 */     this.breakActionModel[36] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/* 217 */     this.breakActionModel[37] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/* 218 */     this.breakActionModel[38] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/* 219 */     this.breakActionModel[39] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/* 220 */     this.breakActionModel[40] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 221 */     this.breakActionModel[41] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/* 222 */     this.breakActionModel[42] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/* 223 */     this.breakActionModel[43] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/* 224 */     this.breakActionModel[44] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/* 225 */     this.breakActionModel[45] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/* 226 */     this.breakActionModel[46] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/* 227 */     this.breakActionModel[47] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/* 228 */     this.breakActionModel[48] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
/* 229 */     this.breakActionModel[49] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/* 230 */     this.breakActionModel[50] = new ModelRendererTurbo(this, 73, 17, this.textureX, this.textureY);
/* 231 */     this.breakActionModel[51] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/* 232 */     this.breakActionModel[52] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/* 233 */     this.breakActionModel[53] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/* 234 */     this.breakActionModel[54] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/* 235 */     this.breakActionModel[55] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/* 236 */     this.breakActionModel[56] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/* 237 */     this.breakActionModel[57] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/* 238 */     this.breakActionModel[58] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/* 239 */     this.breakActionModel[59] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/* 240 */     this.breakActionModel[60] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 241 */     this.breakActionModel[61] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/* 242 */     this.breakActionModel[62] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/* 243 */     this.breakActionModel[63] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/* 244 */     this.breakActionModel[64] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/* 245 */     this.breakActionModel[65] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 246 */     this.breakActionModel[66] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/* 247 */     this.breakActionModel[67] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 248 */     this.breakActionModel[68] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 249 */     this.breakActionModel[69] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/* 250 */     this.breakActionModel[70] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/* 251 */     this.breakActionModel[71] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 252 */     this.breakActionModel[72] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/* 253 */     this.breakActionModel[73] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 254 */     this.breakActionModel[74] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 255 */     this.breakActionModel[75] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 256 */     this.breakActionModel[76] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 257 */     this.breakActionModel[77] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/* 258 */     this.breakActionModel[78] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/* 259 */     this.breakActionModel[79] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*     */     
/* 261 */     this.breakActionModel[0].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 262 */     this.breakActionModel[0].setRotationPoint(0.0F, -3.0F, -1.5F);
/*     */     
/* 264 */     this.breakActionModel[1].addShapeBox(6.0F, -4.0F, 0.0F, 37, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 265 */     this.breakActionModel[1].setRotationPoint(2.0F, -2.5F, -0.75F);
/*     */     
/* 267 */     this.breakActionModel[2].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 268 */     this.breakActionModel[2].setRotationPoint(0.0F, -3.0F, 0.5F);
/*     */     
/* 270 */     this.breakActionModel[3].addShapeBox(6.0F, -4.0F, 0.0F, 25, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 271 */     this.breakActionModel[3].setRotationPoint(14.0F, -0.5F, -0.75F);
/*     */     
/* 273 */     this.breakActionModel[4].addBox(6.0F, -4.0F, 0.0F, 14, 1, 3, 0.0F);
/* 274 */     this.breakActionModel[4].setRotationPoint(0.0F, 0.0F, -1.5F);
/*     */     
/* 276 */     this.breakActionModel[5].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 277 */     this.breakActionModel[5].setRotationPoint(-1.0F, 1.0F, -1.5F);
/*     */     
/* 279 */     this.breakActionModel[6].addShapeBox(6.0F, -4.0F, 0.0F, 13, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 280 */     this.breakActionModel[6].setRotationPoint(1.0F, 1.0F, -1.5F);
/*     */     
/* 282 */     this.breakActionModel[7].addShapeBox(6.0F, -4.0F, 0.0F, 12, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 283 */     this.breakActionModel[7].setRotationPoint(2.0F, -1.0F, -1.0F);
/*     */     
/* 285 */     this.breakActionModel[8].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 286 */     this.breakActionModel[8].setRotationPoint(25.1F, -1.5F, -0.25F);
/*     */     
/* 288 */     this.breakActionModel[9].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 289 */     this.breakActionModel[9].setRotationPoint(21.1F, -1.5F, -0.25F);
/*     */     
/* 291 */     this.breakActionModel[10].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 292 */     this.breakActionModel[10].setRotationPoint(17.1F, -1.5F, -0.25F);
/*     */     
/* 294 */     this.breakActionModel[11].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 295 */     this.breakActionModel[11].setRotationPoint(14.0F, -1.5F, -0.25F);
/*     */     
/* 297 */     this.breakActionModel[12].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 298 */     this.breakActionModel[12].setRotationPoint(0.0F, -2.0F, 1.0F);
/*     */     
/* 300 */     this.breakActionModel[13].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 301 */     this.breakActionModel[13].setRotationPoint(0.0F, -2.0F, -1.5F);
/*     */     
/* 303 */     this.breakActionModel[14].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
/* 304 */     this.breakActionModel[14].setRotationPoint(2.0F, -2.5F, -1.0F);
/*     */     
/* 306 */     this.breakActionModel[15].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
/* 307 */     this.breakActionModel[15].setRotationPoint(2.0F, -2.5F, 0.8F);
/*     */     
/* 309 */     this.breakActionModel[16].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 310 */     this.breakActionModel[16].setRotationPoint(13.0F, -1.0F, 1.0F);
/*     */     
/* 312 */     this.breakActionModel[17].addShapeBox(6.0F, -4.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 313 */     this.breakActionModel[17].setRotationPoint(3.0F, -1.0F, 1.0F);
/*     */     
/* 315 */     this.breakActionModel[18].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 316 */     this.breakActionModel[18].setRotationPoint(2.0F, -1.0F, 1.0F);
/*     */     
/* 318 */     this.breakActionModel[19].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 319 */     this.breakActionModel[19].setRotationPoint(0.0F, -1.0F, 1.0F);
/*     */     
/* 321 */     this.breakActionModel[20].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 322 */     this.breakActionModel[20].setRotationPoint(13.0F, -1.0F, -1.5F);
/*     */     
/* 324 */     this.breakActionModel[21].addShapeBox(6.0F, -4.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 325 */     this.breakActionModel[21].setRotationPoint(3.0F, -1.0F, -1.5F);
/*     */     
/* 327 */     this.breakActionModel[22].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 328 */     this.breakActionModel[22].setRotationPoint(2.0F, -1.0F, -1.5F);
/*     */     
/* 330 */     this.breakActionModel[23].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 331 */     this.breakActionModel[23].setRotationPoint(0.0F, -1.0F, -1.5F);
/*     */     
/* 333 */     this.breakActionModel[24].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 334 */     this.breakActionModel[24].setRotationPoint(29.1F, -1.5F, -0.25F);
/*     */     
/* 336 */     this.breakActionModel[25].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 337 */     this.breakActionModel[25].setRotationPoint(33.1F, -1.5F, -0.25F);
/*     */     
/* 339 */     this.breakActionModel[26].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 340 */     this.breakActionModel[26].setRotationPoint(37.1F, -1.5F, -0.25F);
/*     */     
/* 342 */     this.breakActionModel[27].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 343 */     this.breakActionModel[27].setRotationPoint(1.0F, -4.0F, -0.5F);
/*     */     
/* 345 */     this.breakActionModel[28].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 346 */     this.breakActionModel[28].setRotationPoint(0.5F, -4.0F, -0.5F);
/*     */     
/* 348 */     this.breakActionModel[29].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 349 */     this.breakActionModel[29].setRotationPoint(-0.5F, -4.0F, -0.5F);
/*     */     
/* 351 */     this.breakActionModel[30].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 352 */     this.breakActionModel[30].setRotationPoint(2.0F, -4.0F, -0.5F);
/*     */     
/* 354 */     this.breakActionModel[31].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 355 */     this.breakActionModel[31].setRotationPoint(2.5F, -4.0F, -0.5F);
/*     */     
/* 357 */     this.breakActionModel[32].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 358 */     this.breakActionModel[32].setRotationPoint(3.5F, -4.0F, -0.5F);
/*     */     
/* 360 */     this.breakActionModel[33].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 361 */     this.breakActionModel[33].setRotationPoint(4.0F, -4.0F, -0.5F);
/*     */     
/* 363 */     this.breakActionModel[34].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 364 */     this.breakActionModel[34].setRotationPoint(5.0F, -4.0F, -0.5F);
/*     */     
/* 366 */     this.breakActionModel[35].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 367 */     this.breakActionModel[35].setRotationPoint(9.5F, -4.0F, -0.5F);
/*     */     
/* 369 */     this.breakActionModel[36].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 370 */     this.breakActionModel[36].setRotationPoint(10.0F, -4.0F, -0.5F);
/*     */     
/* 372 */     this.breakActionModel[37].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 373 */     this.breakActionModel[37].setRotationPoint(11.0F, -4.0F, -0.5F);
/*     */     
/* 375 */     this.breakActionModel[38].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 376 */     this.breakActionModel[38].setRotationPoint(8.5F, -4.0F, -0.5F);
/*     */     
/* 378 */     this.breakActionModel[39].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 379 */     this.breakActionModel[39].setRotationPoint(8.0F, -4.0F, -0.5F);
/*     */     
/* 381 */     this.breakActionModel[40].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 382 */     this.breakActionModel[40].setRotationPoint(7.0F, -4.0F, -0.5F);
/*     */     
/* 384 */     this.breakActionModel[41].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 385 */     this.breakActionModel[41].setRotationPoint(6.5F, -4.0F, -0.5F);
/*     */     
/* 387 */     this.breakActionModel[42].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 388 */     this.breakActionModel[42].setRotationPoint(5.5F, -4.0F, -0.5F);
/*     */     
/* 390 */     this.breakActionModel[43].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 391 */     this.breakActionModel[43].setRotationPoint(15.5F, -4.0F, -0.5F);
/*     */     
/* 393 */     this.breakActionModel[44].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 394 */     this.breakActionModel[44].setRotationPoint(16.0F, -4.0F, -0.5F);
/*     */     
/* 396 */     this.breakActionModel[45].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 397 */     this.breakActionModel[45].setRotationPoint(17.0F, -4.0F, -0.5F);
/*     */     
/* 399 */     this.breakActionModel[46].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 400 */     this.breakActionModel[46].setRotationPoint(14.5F, -4.0F, -0.5F);
/*     */     
/* 402 */     this.breakActionModel[47].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 403 */     this.breakActionModel[47].setRotationPoint(14.0F, -4.0F, -0.5F);
/*     */     
/* 405 */     this.breakActionModel[48].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 406 */     this.breakActionModel[48].setRotationPoint(13.0F, -4.0F, -0.5F);
/*     */     
/* 408 */     this.breakActionModel[49].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 409 */     this.breakActionModel[49].setRotationPoint(12.5F, -4.0F, -0.5F);
/*     */     
/* 411 */     this.breakActionModel[50].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 412 */     this.breakActionModel[50].setRotationPoint(11.5F, -4.0F, -0.5F);
/*     */     
/* 414 */     this.breakActionModel[51].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 415 */     this.breakActionModel[51].setRotationPoint(21.5F, -4.0F, -0.5F);
/*     */     
/* 417 */     this.breakActionModel[52].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 418 */     this.breakActionModel[52].setRotationPoint(22.0F, -4.0F, -0.5F);
/*     */     
/* 420 */     this.breakActionModel[53].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 421 */     this.breakActionModel[53].setRotationPoint(23.0F, -4.0F, -0.5F);
/*     */     
/* 423 */     this.breakActionModel[54].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 424 */     this.breakActionModel[54].setRotationPoint(20.5F, -4.0F, -0.5F);
/*     */     
/* 426 */     this.breakActionModel[55].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 427 */     this.breakActionModel[55].setRotationPoint(20.0F, -4.0F, -0.5F);
/*     */     
/* 429 */     this.breakActionModel[56].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 430 */     this.breakActionModel[56].setRotationPoint(19.0F, -4.0F, -0.5F);
/*     */     
/* 432 */     this.breakActionModel[57].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 433 */     this.breakActionModel[57].setRotationPoint(18.5F, -4.0F, -0.5F);
/*     */     
/* 435 */     this.breakActionModel[58].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 436 */     this.breakActionModel[58].setRotationPoint(17.5F, -4.0F, -0.5F);
/*     */     
/* 438 */     this.breakActionModel[59].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 439 */     this.breakActionModel[59].setRotationPoint(27.5F, -4.0F, -0.5F);
/*     */     
/* 441 */     this.breakActionModel[60].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 442 */     this.breakActionModel[60].setRotationPoint(28.0F, -4.0F, -0.5F);
/*     */     
/* 444 */     this.breakActionModel[61].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 445 */     this.breakActionModel[61].setRotationPoint(29.0F, -4.0F, -0.5F);
/*     */     
/* 447 */     this.breakActionModel[62].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 448 */     this.breakActionModel[62].setRotationPoint(26.5F, -4.0F, -0.5F);
/*     */     
/* 450 */     this.breakActionModel[63].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 451 */     this.breakActionModel[63].setRotationPoint(26.0F, -4.0F, -0.5F);
/*     */     
/* 453 */     this.breakActionModel[64].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 454 */     this.breakActionModel[64].setRotationPoint(25.0F, -4.0F, -0.5F);
/*     */     
/* 456 */     this.breakActionModel[65].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 457 */     this.breakActionModel[65].setRotationPoint(24.5F, -4.0F, -0.5F);
/*     */     
/* 459 */     this.breakActionModel[66].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 460 */     this.breakActionModel[66].setRotationPoint(23.5F, -4.0F, -0.5F);
/*     */     
/* 462 */     this.breakActionModel[67].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 463 */     this.breakActionModel[67].setRotationPoint(33.5F, -4.0F, -0.5F);
/*     */     
/* 465 */     this.breakActionModel[68].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 466 */     this.breakActionModel[68].setRotationPoint(34.0F, -4.0F, -0.5F);
/*     */     
/* 468 */     this.breakActionModel[69].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 469 */     this.breakActionModel[69].setRotationPoint(35.0F, -4.0F, -0.5F);
/*     */     
/* 471 */     this.breakActionModel[70].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 472 */     this.breakActionModel[70].setRotationPoint(32.5F, -4.0F, -0.5F);
/*     */     
/* 474 */     this.breakActionModel[71].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 475 */     this.breakActionModel[71].setRotationPoint(32.0F, -4.0F, -0.5F);
/*     */     
/* 477 */     this.breakActionModel[72].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 478 */     this.breakActionModel[72].setRotationPoint(31.0F, -4.0F, -0.5F);
/*     */     
/* 480 */     this.breakActionModel[73].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 481 */     this.breakActionModel[73].setRotationPoint(30.5F, -4.0F, -0.5F);
/*     */     
/* 483 */     this.breakActionModel[74].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 484 */     this.breakActionModel[74].setRotationPoint(29.5F, -4.0F, -0.5F);
/*     */     
/* 486 */     this.breakActionModel[75].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 487 */     this.breakActionModel[75].setRotationPoint(38.0F, -4.0F, -0.5F);
/*     */     
/* 489 */     this.breakActionModel[76].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 490 */     this.breakActionModel[76].setRotationPoint(37.0F, -4.0F, -0.5F);
/*     */     
/* 492 */     this.breakActionModel[77].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 493 */     this.breakActionModel[77].setRotationPoint(36.5F, -4.0F, -0.5F);
/*     */     
/* 495 */     this.breakActionModel[78].addShapeBox(6.0F, -4.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 496 */     this.breakActionModel[78].setRotationPoint(35.5F, -4.0F, -0.5F);
/*     */     
/* 498 */     this.breakActionModel[79].addShapeBox(6.0F, -4.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 499 */     this.breakActionModel[79].setRotationPoint(0.0F, -3.0F, -0.5F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 504 */     translateAll(0.0F, -5.0F, 0.0F);
/* 505 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*     */     
/*     */ 
/* 508 */     this.gunSlideDistance = 0.0F;
/* 509 */     this.animationType = EnumAnimationType.BACK_LOADED;
/*     */     
/*     */ 
/* 512 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */