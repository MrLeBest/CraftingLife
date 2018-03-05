/*     */ package com.flansmod.client.model.mpack;
/*     */ 
/*     */ import com.flansmod.client.model.ModelAttachment;
/*     */ import com.flansmod.client.tmt.ModelRendererTurbo;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelakgrip
/*     */   extends ModelAttachment
/*     */ {
/*  15 */   int textureX = 256;
/*  16 */   int textureY = 256;
/*     */   
/*     */   public Modelakgrip()
/*     */   {
/*  20 */     this.attachmentModel = new ModelRendererTurbo[21];
/*  21 */     this.attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  22 */     this.attachmentModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*  23 */     this.attachmentModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  24 */     this.attachmentModel[3] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  25 */     this.attachmentModel[4] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  26 */     this.attachmentModel[5] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  27 */     this.attachmentModel[6] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  28 */     this.attachmentModel[7] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  29 */     this.attachmentModel[8] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  30 */     this.attachmentModel[9] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  31 */     this.attachmentModel[10] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  32 */     this.attachmentModel[11] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  33 */     this.attachmentModel[12] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
/*  34 */     this.attachmentModel[13] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*  35 */     this.attachmentModel[14] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
/*  36 */     this.attachmentModel[15] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  37 */     this.attachmentModel[16] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  38 */     this.attachmentModel[17] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  39 */     this.attachmentModel[18] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  40 */     this.attachmentModel[19] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  41 */     this.attachmentModel[20] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*     */     
/*  43 */     this.attachmentModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  44 */     this.attachmentModel[0].setRotationPoint(-8.0F, -8.0F, -2.5F);
/*     */     
/*  46 */     this.attachmentModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  47 */     this.attachmentModel[1].setRotationPoint(-5.0F, -5.0F, -2.5F);
/*     */     
/*  49 */     this.attachmentModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  50 */     this.attachmentModel[2].setRotationPoint(-10.0F, -9.0F, -2.5F);
/*     */     
/*  52 */     this.attachmentModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 1, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  53 */     this.attachmentModel[3].setRotationPoint(-4.0F, -8.0F, -2.5F);
/*     */     
/*  55 */     this.attachmentModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 1, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  56 */     this.attachmentModel[4].setRotationPoint(-4.0F, -2.0F, -2.5F);
/*     */     
/*  58 */     this.attachmentModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  59 */     this.attachmentModel[5].setRotationPoint(-3.0F, 4.0F, -2.5F);
/*     */     
/*  61 */     this.attachmentModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  62 */     this.attachmentModel[6].setRotationPoint(-2.0F, 7.0F, -2.5F);
/*     */     
/*  64 */     this.attachmentModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  65 */     this.attachmentModel[7].setRotationPoint(-4.0F, -9.0F, -2.5F);
/*     */     
/*  67 */     this.attachmentModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  68 */     this.attachmentModel[8].setRotationPoint(0.0F, 9.0F, -2.5F);
/*     */     
/*  70 */     this.attachmentModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  71 */     this.attachmentModel[9].setRotationPoint(4.5F, 4.0F, -2.5F);
/*     */     
/*  73 */     this.attachmentModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  74 */     this.attachmentModel[10].setRotationPoint(0.0F, 7.0F, -2.5F);
/*     */     
/*  76 */     this.attachmentModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  77 */     this.attachmentModel[11].setRotationPoint(6.5F, 7.0F, -2.5F);
/*     */     
/*  79 */     this.attachmentModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  80 */     this.attachmentModel[12].setRotationPoint(6.5F, 8.0F, -2.5F);
/*     */     
/*  82 */     this.attachmentModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  83 */     this.attachmentModel[13].setRotationPoint(2.5F, -7.5F, -2.5F);
/*     */     
/*  85 */     this.attachmentModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  86 */     this.attachmentModel[14].setRotationPoint(4.5F, -9.0F, -2.5F);
/*     */     
/*  88 */     this.attachmentModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  89 */     this.attachmentModel[15].setRotationPoint(-3.0F, -8.0F, -2.5F);
/*     */     
/*  91 */     this.attachmentModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  92 */     this.attachmentModel[16].setRotationPoint(-3.0F, -7.0F, -2.5F);
/*     */     
/*  94 */     this.attachmentModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 4, 10, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  95 */     this.attachmentModel[17].setRotationPoint(-3.0F, -6.0F, -2.5F);
/*     */     
/*  97 */     this.attachmentModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 3, 8, 5, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  98 */     this.attachmentModel[18].setRotationPoint(1.5F, -4.0F, -2.5F);
/*     */     
/* 100 */     this.attachmentModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 101 */     this.attachmentModel[19].setRotationPoint(1.5F, -5.0F, -2.5F);
/*     */     
/* 103 */     this.attachmentModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 104 */     this.attachmentModel[20].setRotationPoint(-2.0F, 4.0F, -2.5F);
/*     */     
/*     */ 
/*     */ 
/* 108 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelakgrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */