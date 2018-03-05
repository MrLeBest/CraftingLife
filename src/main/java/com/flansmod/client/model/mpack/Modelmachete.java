/*     */ package com.flansmod.client.model.mpack;
/*     */ 
/*     */ import com.flansmod.client.model.ModelGun;
/*     */ import com.flansmod.client.tmt.ModelRendererTurbo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelmachete
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelmachete()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[30];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*     */     
/*  53 */     this.gunModel[0].addBox(-4.0F, 14.0F, 0.0F, 5, 65, 1, 0.0F);
/*  54 */     this.gunModel[0].setRotationPoint(0.0F, -98.0F, 0.0F);
/*     */     
/*  56 */     this.gunModel[1].addBox(-4.0F, 14.0F, 0.0F, 5, 60, 1, 0.0F);
/*  57 */     this.gunModel[1].setRotationPoint(5.0F, -93.0F, 0.0F);
/*     */     
/*  59 */     this.gunModel[2].addBox(-4.0F, 14.0F, 0.0F, 4, 4, 1, 0.0F);
/*  60 */     this.gunModel[2].setRotationPoint(10.0F, -83.0F, 0.0F);
/*     */     
/*  62 */     this.gunModel[3].addShapeBox(-4.0F, 14.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  63 */     this.gunModel[3].setRotationPoint(0.0F, -100.0F, 0.0F);
/*     */     
/*  65 */     this.gunModel[4].addShapeBox(-4.0F, 14.0F, 0.0F, 5, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  66 */     this.gunModel[4].setRotationPoint(5.0F, -98.0F, 0.0F);
/*     */     
/*  68 */     this.gunModel[5].addShapeBox(-4.0F, 14.0F, 0.0F, 4, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  69 */     this.gunModel[5].setRotationPoint(10.0F, -93.0F, 0.0F);
/*     */     
/*  71 */     this.gunModel[6].addShapeBox(-4.0F, 14.0F, 0.0F, 4, 46, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  72 */     this.gunModel[6].setRotationPoint(10.0F, -79.0F, 0.0F);
/*     */     
/*  74 */     this.gunModel[7].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 10, 1, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  75 */     this.gunModel[7].setRotationPoint(14.0F, -93.0F, 0.0F);
/*     */     
/*  77 */     this.gunModel[8].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 5, 1, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  78 */     this.gunModel[8].setRotationPoint(10.0F, -98.0F, 0.0F);
/*     */     
/*  80 */     this.gunModel[9].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 2, 1, 0.0F, 5.0F, 0.0F, 0.0F, -6.0F, 1.0F, -0.5F, -6.0F, 1.0F, -0.5F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  81 */     this.gunModel[9].setRotationPoint(5.0F, -100.0F, 0.0F);
/*     */     
/*  83 */     this.gunModel[10].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  84 */     this.gunModel[10].setRotationPoint(14.0F, -83.0F, 0.0F);
/*     */     
/*  86 */     this.gunModel[11].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 46, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, 3.0F, 0.0F, 0.0F);
/*  87 */     this.gunModel[11].setRotationPoint(14.0F, -79.0F, 0.0F);
/*     */     
/*  89 */     this.gunModel[12].addBox(-4.0F, 14.0F, 0.0F, 9, 31, 3, 0.0F);
/*  90 */     this.gunModel[12].setRotationPoint(1.0F, -32.0F, -1.0F);
/*     */     
/*  92 */     this.gunModel[13].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 31, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  93 */     this.gunModel[13].setRotationPoint(0.0F, -32.0F, -1.0F);
/*     */     
/*  95 */     this.gunModel[14].addShapeBox(-4.0F, 14.0F, 0.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  96 */     this.gunModel[14].setRotationPoint(1.0F, -33.0F, -1.0F);
/*     */     
/*  98 */     this.gunModel[15].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
/*  99 */     this.gunModel[15].setRotationPoint(0.0F, -33.0F, -1.0F);
/*     */     
/* 101 */     this.gunModel[16].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 102 */     this.gunModel[16].setRotationPoint(12.0F, -33.0F, -1.0F);
/*     */     
/* 104 */     this.gunModel[17].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 19, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 105 */     this.gunModel[17].setRotationPoint(10.0F, -25.0F, -1.0F);
/*     */     
/* 107 */     this.gunModel[18].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 5, 3, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 108 */     this.gunModel[18].setRotationPoint(10.0F, -30.0F, -1.0F);
/*     */     
/* 110 */     this.gunModel[19].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 5, 3, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 111 */     this.gunModel[19].setRotationPoint(9.0F, -30.0F, -1.0F);
/*     */     
/* 113 */     this.gunModel[20].addBox(-4.0F, 14.0F, 0.0F, 2, 2, 3, 0.0F);
/* 114 */     this.gunModel[20].setRotationPoint(10.0F, -32.0F, -1.0F);
/*     */     
/* 116 */     this.gunModel[21].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 117 */     this.gunModel[21].setRotationPoint(12.0F, -32.0F, -1.0F);
/*     */     
/* 119 */     this.gunModel[22].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 5, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[22].setRotationPoint(9.0F, -6.0F, -1.0F);
/*     */     
/* 122 */     this.gunModel[23].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F);
/* 123 */     this.gunModel[23].setRotationPoint(10.0F, -6.0F, -1.0F);
/*     */     
/* 125 */     this.gunModel[24].addBox(-4.0F, 14.0F, 0.0F, 3, 3, 4, 0.0F);
/* 126 */     this.gunModel[24].setRotationPoint(4.0F, -29.0F, -1.5F);
/*     */     
/* 128 */     this.gunModel[25].addBox(-4.0F, 14.0F, 0.0F, 3, 3, 4, 0.0F);
/* 129 */     this.gunModel[25].setRotationPoint(4.0F, -19.0F, -1.5F);
/*     */     
/* 131 */     this.gunModel[26].addBox(-4.0F, 14.0F, 0.0F, 3, 3, 4, 0.0F);
/* 132 */     this.gunModel[26].setRotationPoint(4.0F, -10.0F, -1.5F);
/*     */     
/* 134 */     this.gunModel[27].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F);
/* 135 */     this.gunModel[27].setRotationPoint(0.0F, -1.0F, -1.0F);
/*     */     
/* 137 */     this.gunModel[28].addShapeBox(-4.0F, 14.0F, 0.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 138 */     this.gunModel[28].setRotationPoint(1.0F, -1.0F, -1.0F);
/*     */     
/* 140 */     this.gunModel[29].addShapeBox(-4.0F, 14.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 141 */     this.gunModel[29].setRotationPoint(12.0F, -1.0F, -1.0F);
/*     */     
/*     */ 
/*     */ 
/* 145 */     translateAll(0.0F, -1.0F, 0.5F);
/*     */     
/*     */ 
/* 148 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmachete.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */