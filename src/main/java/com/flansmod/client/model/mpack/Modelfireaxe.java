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
/*     */ public class Modelfireaxe
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelfireaxe()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[24];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*     */     
/*  47 */     this.gunModel[0].addBox(-5.0F, 6.0F, -1.5F, 8, 8, 3, 0.0F);
/*  48 */     this.gunModel[0].setRotationPoint(0.0F, -49.0F, 0.0F);
/*     */     
/*  50 */     this.gunModel[1].addShapeBox(-5.0F, 6.0F, -1.5F, 7, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  51 */     this.gunModel[1].setRotationPoint(8.0F, -49.0F, 0.0F);
/*     */     
/*  53 */     this.gunModel[2].addShapeBox(-5.0F, 6.0F, -1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  54 */     this.gunModel[2].setRotationPoint(15.0F, -49.0F, 1.0F);
/*     */     
/*  56 */     this.gunModel[3].addShapeBox(-5.0F, 6.0F, -1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  57 */     this.gunModel[3].setRotationPoint(15.0F, -47.0F, 1.0F);
/*     */     
/*  59 */     this.gunModel[4].addShapeBox(-5.0F, 6.0F, -1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  60 */     this.gunModel[4].setRotationPoint(15.0F, -43.0F, 1.0F);
/*     */     
/*  62 */     this.gunModel[5].addShapeBox(-5.0F, 6.0F, -1.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  63 */     this.gunModel[5].setRotationPoint(15.0F, -45.0F, 1.0F);
/*     */     
/*  65 */     this.gunModel[6].addShapeBox(-5.0F, 6.0F, -1.5F, 5, 3, 3, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  66 */     this.gunModel[6].setRotationPoint(-5.0F, -49.0F, 0.0F);
/*     */     
/*  68 */     this.gunModel[7].addShapeBox(-5.0F, 6.0F, -1.5F, 4, 2, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F);
/*  69 */     this.gunModel[7].setRotationPoint(-9.0F, -48.0F, 0.0F);
/*     */     
/*  71 */     this.gunModel[8].addShapeBox(-5.0F, 6.0F, -1.5F, 2, 11, 3, 0.0F, 2.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  72 */     this.gunModel[8].setRotationPoint(5.0F, -41.0F, 0.0F);
/*     */     
/*  74 */     this.gunModel[9].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 11, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F);
/*  75 */     this.gunModel[9].setRotationPoint(7.5F, -41.0F, 0.0F);
/*     */     
/*  77 */     this.gunModel[10].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 11, 3, 0.0F, 1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F);
/*  78 */     this.gunModel[10].setRotationPoint(2.0F, -41.0F, 0.0F);
/*     */     
/*  80 */     this.gunModel[11].addShapeBox(-5.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F);
/*  81 */     this.gunModel[11].setRotationPoint(15.0F, -41.0F, 1.0F);
/*     */     
/*  83 */     this.gunModel[12].addShapeBox(-5.0F, 6.0F, -1.5F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -0.425F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.425F, 0.0F, -1.0F, -0.425F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -1.0F, -0.425F);
/*  84 */     this.gunModel[12].setRotationPoint(11.0F, -41.0F, 0.0F);
/*     */     
/*  86 */     this.gunModel[13].addShapeBox(-5.0F, 6.0F, -1.5F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/*  87 */     this.gunModel[13].setRotationPoint(15.0F, -50.0F, 1.0F);
/*     */     
/*  89 */     this.gunModel[14].addShapeBox(-5.0F, 6.0F, -1.5F, 4, 1, 3, 0.0F, 0.0F, -1.0F, -0.425F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -1.0F, -0.425F, 0.0F, 0.0F, -0.425F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.425F);
/*  90 */     this.gunModel[14].setRotationPoint(11.0F, -50.0F, 0.0F);
/*     */     
/*  92 */     this.gunModel[15].addShapeBox(-5.0F, 6.0F, -1.5F, 2, 36, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/*  93 */     this.gunModel[15].setRotationPoint(5.0F, -30.0F, 0.0F);
/*     */     
/*  95 */     this.gunModel[16].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 36, 3, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F);
/*  96 */     this.gunModel[16].setRotationPoint(7.5F, -30.0F, 0.0F);
/*     */     
/*  98 */     this.gunModel[17].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 36, 3, 0.0F, -1.0F, 0.0F, -0.75F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F);
/*  99 */     this.gunModel[17].setRotationPoint(2.0F, -30.0F, 0.0F);
/*     */     
/* 101 */     this.gunModel[18].addShapeBox(-5.0F, 6.0F, -1.5F, 2, 9, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/* 102 */     this.gunModel[18].setRotationPoint(5.0F, 6.0F, 0.0F);
/*     */     
/* 104 */     this.gunModel[19].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 9, 3, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 2.0F, 0.0F, -1.0F, 2.0F, 0.0F, -1.0F, -1.5F, 0.0F, -0.25F);
/* 105 */     this.gunModel[19].setRotationPoint(7.5F, 6.0F, 0.0F);
/*     */     
/* 107 */     this.gunModel[20].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 3.35F, 0.0F, -0.5F, -4.0F, 2.0F, -1.0F, -4.0F, 2.0F, -1.0F, 3.35F, 0.0F, -0.5F);
/* 108 */     this.gunModel[20].setRotationPoint(9.5F, 15.0F, 0.0F);
/*     */     
/* 110 */     this.gunModel[21].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 9, 3, 0.0F, -1.0F, 0.0F, -0.75F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, 3.0F, 0.0F, -0.25F, 3.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.75F);
/* 111 */     this.gunModel[21].setRotationPoint(2.0F, 6.0F, 0.0F);
/*     */     
/* 113 */     this.gunModel[22].addShapeBox(-5.0F, 6.0F, -1.5F, 1, 3, 3, 0.0F, -1.0F, 0.0F, -0.75F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.75F, -2.0F, 0.0F, -1.0F, 2.5F, 0.0F, -1.0F, 2.5F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F);
/* 114 */     this.gunModel[22].setRotationPoint(3.0F, 15.0F, 0.0F);
/*     */     
/* 116 */     this.gunModel[23].addShapeBox(-5.0F, 6.0F, -1.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.125F, 0.0F, -0.5F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.125F, 0.0F, -0.5F);
/* 117 */     this.gunModel[23].setRotationPoint(6.0F, 15.0F, 0.0F);
/*     */     
/*     */ 
/*     */ 
/* 121 */     translateAll(1.0F, 4.0F, 0.5F);
/*     */     
/*     */ 
/* 124 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelfireaxe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */