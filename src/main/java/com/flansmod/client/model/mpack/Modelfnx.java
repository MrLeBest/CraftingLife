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
/*     */ public class Modelfnx
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelfnx()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[84];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/*     */     
/* 107 */     this.gunModel[0].addBox(-2.0F, 5.0F, -4.0F, 9, 5, 5, 0.0F);
/* 108 */     this.gunModel[0].setRotationPoint(13.0F, -33.7F, 1.0F);
/*     */     
/* 110 */     this.gunModel[1].addBox(-2.0F, 5.0F, -4.0F, 35, 3, 8, 0.0F);
/* 111 */     this.gunModel[1].setRotationPoint(11.0F, -26.0F, -0.5F);
/*     */     
/* 113 */     this.gunModel[2].addShapeBox(-2.0F, 5.0F, -4.0F, 6, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 114 */     this.gunModel[2].setRotationPoint(22.0F, -26.0F, 7.0F);
/*     */     
/* 116 */     this.gunModel[3].addBox(-2.0F, 5.0F, -4.0F, 16, 5, 9, 0.0F);
/* 117 */     this.gunModel[3].setRotationPoint(-5.0F, -26.0F, -1.0F);
/*     */     
/* 119 */     this.gunModel[4].addShapeBox(-2.0F, 5.0F, -4.0F, 12, 21, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.25F, -2.0F, 0.0F, -3.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 120 */     this.gunModel[4].setRotationPoint(-1.0F, -12.0F, -1.0F);
/*     */     
/* 122 */     this.gunModel[5].addBox(-2.0F, 5.0F, -4.0F, 6, 3, 1, 0.0F);
/* 123 */     this.gunModel[5].setRotationPoint(15.0F, -25.5F, 7.5F);
/*     */     
/* 125 */     this.gunModel[6].addShapeBox(-2.0F, 5.0F, -4.0F, 9, 2, 9, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 126 */     this.gunModel[6].setRotationPoint(-14.0F, -26.0F, -1.0F);
/*     */     
/* 128 */     this.gunModel[7].addBox(-2.0F, 5.0F, -4.0F, 2, 5, 2, 0.0F);
/* 129 */     this.gunModel[7].setRotationPoint(-20.5F, -27.0F, 2.5F);
/* 130 */     this.gunModel[7].rotateAngleZ = 1.1519173F;
/*     */     
/* 132 */     this.gunModel[8].addShapeBox(-2.0F, 5.0F, -4.0F, 7, 2, 9, 0.0F, 0.25F, 0.0F, -3.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F);
/* 133 */     this.gunModel[8].setRotationPoint(-14.0F, -23.0F, -1.0F);
/*     */     
/* 135 */     this.gunModel[9].addBox(-2.0F, 5.0F, -4.0F, 15, 1, 9, 0.0F);
/* 136 */     this.gunModel[9].setRotationPoint(-4.0F, -21.0F, -1.0F);
/*     */     
/* 138 */     this.gunModel[10].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 26, 9, 0.0F, -5.0F, 0.0F, -3.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F);
/* 139 */     this.gunModel[10].setRotationPoint(-11.0F, -16.0F, -1.0F);
/*     */     
/* 141 */     this.gunModel[11].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 142 */     this.gunModel[11].setRotationPoint(3.0F, -25.4F, 8.25F);
/*     */     
/* 144 */     this.gunModel[12].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 145 */     this.gunModel[12].setRotationPoint(5.0F, -25.9F, 7.5F);
/*     */     
/* 147 */     this.gunModel[13].addShapeBox(-2.0F, 5.0F, -4.0F, 4, 2, 10, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F);
/* 148 */     this.gunModel[13].setRotationPoint(8.0F, -13.5F, -1.5F);
/*     */     
/* 150 */     this.gunModel[14].addBox(-2.0F, 5.0F, -4.0F, 12, 1, 8, 0.0F);
/* 151 */     this.gunModel[14].setRotationPoint(11.0F, -21.0F, -0.5F);
/*     */     
/* 153 */     this.gunModel[15].addFlexBox(-2.0F, 5.0F, -4.0F, 2, 2, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 4);
/* 154 */     this.gunModel[15].setRotationPoint(-17.0F, -27.35F, 2.5F);
/* 155 */     this.gunModel[15].rotateAngleZ = 1.2042772F;
/*     */     
/* 157 */     this.gunModel[16].addShapeBox(-2.0F, 5.0F, -4.0F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 158 */     this.gunModel[16].setRotationPoint(11.0F, -20.5F, 2.5F);
/*     */     
/* 160 */     this.gunModel[17].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 161 */     this.gunModel[17].setRotationPoint(13.5F, -17.5F, 2.5F);
/*     */     
/* 163 */     this.gunModel[18].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 164 */     this.gunModel[18].setRotationPoint(14.5F, -15.5F, 2.5F);
/*     */     
/* 166 */     this.gunModel[19].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 167 */     this.gunModel[19].setRotationPoint(26.0F, -20.0F, 2.0F);
/*     */     
/* 169 */     this.gunModel[20].addBox(-2.0F, 5.0F, -4.0F, 41, 2, 2, 0.0F);
/* 170 */     this.gunModel[20].setRotationPoint(8.0F, -26.2F, 2.5F);
/*     */     
/* 172 */     this.gunModel[21].addBox(-2.0F, 5.0F, -4.0F, 31, 4, 4, 0.0F);
/* 173 */     this.gunModel[21].setRotationPoint(21.0F, -32.2F, 1.5F);
/*     */     
/* 175 */     this.gunModel[22].addBox(-2.0F, 5.0F, -4.0F, 19, 2, 8, 0.0F);
/* 176 */     this.gunModel[22].setRotationPoint(11.0F, -23.0F, -0.5F);
/*     */     
/* 178 */     this.gunModel[23].addBox(-2.0F, 5.0F, -4.0F, 21, 1, 6, 0.0F);
/* 179 */     this.gunModel[23].setRotationPoint(25.0F, -22.0F, 0.5F);
/*     */     
/* 181 */     this.gunModel[24].addShapeBox(-2.0F, 5.0F, -4.0F, 16, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 182 */     this.gunModel[24].setRotationPoint(30.0F, -23.0F, -0.5F);
/*     */     
/* 184 */     this.gunModel[25].addBox(-2.0F, 5.0F, -4.0F, 11, 1, 8, 0.0F);
/* 185 */     this.gunModel[25].setRotationPoint(23.0F, -21.0F, -0.5F);
/*     */     
/* 187 */     this.gunModel[26].addBox(-2.0F, 5.0F, -4.0F, 2, 1, 8, 0.0F);
/* 188 */     this.gunModel[26].setRotationPoint(35.0F, -21.0F, -0.5F);
/*     */     
/* 190 */     this.gunModel[27].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 191 */     this.gunModel[27].setRotationPoint(30.0F, -34.2F, 0.0F);
/*     */     
/* 193 */     this.gunModel[28].addBox(-2.0F, 5.0F, -4.0F, 2, 1, 8, 0.0F);
/* 194 */     this.gunModel[28].setRotationPoint(44.0F, -21.0F, -0.5F);
/*     */     
/* 196 */     this.gunModel[29].addBox(-2.0F, 5.0F, -4.0F, 2, 1, 8, 0.0F);
/* 197 */     this.gunModel[29].setRotationPoint(41.0F, -21.0F, -0.5F);
/*     */     
/* 199 */     this.gunModel[30].addBox(-2.0F, 5.0F, -4.0F, 2, 1, 8, 0.0F);
/* 200 */     this.gunModel[30].setRotationPoint(38.0F, -21.0F, -0.5F);
/*     */     
/* 202 */     this.gunModel[31].addShapeBox(-1.0F, 5.0F, -4.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 203 */     this.gunModel[31].setRotationPoint(45.0F, -26.2F, 5.5F);
/*     */     
/* 205 */     this.gunModel[32].addShapeBox(-1.0F, 5.0F, -4.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 206 */     this.gunModel[32].setRotationPoint(45.0F, -26.2F, 0.0F);
/*     */     
/* 208 */     this.gunModel[33].addShapeBox(-1.0F, 5.0F, -4.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 209 */     this.gunModel[33].setRotationPoint(45.0F, -26.2F, 4.5F);
/*     */     
/* 211 */     this.gunModel[34].addShapeBox(-1.0F, 5.0F, -4.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 212 */     this.gunModel[34].setRotationPoint(45.0F, -26.2F, 2.0F);
/*     */     
/* 214 */     this.gunModel[35].addBox(-2.0F, 5.0F, -4.0F, 3, 1, 2, 0.0F);
/* 215 */     this.gunModel[35].setRotationPoint(46.0F, -24.2F, 2.5F);
/*     */     
/* 217 */     this.gunModel[36].addShapeBox(-2.0F, 5.0F, -4.0F, 17, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 218 */     this.gunModel[36].setRotationPoint(11.0F, -26.0F, -1.0F);
/*     */     
/* 220 */     this.gunModel[37].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 221 */     this.gunModel[37].setRotationPoint(11.0F, -26.0F, 7.0F);
/*     */     
/* 223 */     this.gunModel[38].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 224 */     this.gunModel[38].setRotationPoint(24.0F, -20.0F, 2.0F);
/*     */     
/* 226 */     this.gunModel[39].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 227 */     this.gunModel[39].setRotationPoint(27.0F, -20.0F, 2.0F);
/*     */     
/* 229 */     this.gunModel[40].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 230 */     this.gunModel[40].setRotationPoint(46.0F, -23.0F, 0.5F);
/*     */     
/* 232 */     this.gunModel[41].addShapeBox(-2.0F, 5.0F, -4.0F, 5, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 233 */     this.gunModel[41].setRotationPoint(-10.0F, -24.0F, -1.0F);
/*     */     
/* 235 */     this.gunModel[42].addShapeBox(-2.0F, 5.0F, -4.0F, 6, 1, 9, 0.0F, 0.0F, 0.0F, -3.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F);
/* 236 */     this.gunModel[42].setRotationPoint(-11.0F, -21.0F, -1.0F);
/*     */     
/* 238 */     this.gunModel[43].addBox(-2.0F, 5.0F, -4.0F, 6, 2, 1, 0.0F);
/* 239 */     this.gunModel[43].setRotationPoint(-8.0F, -24.0F, 7.5F);
/*     */     
/* 241 */     this.gunModel[44].addShapeBox(-2.0F, 5.0F, -4.0F, 6, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F);
/* 242 */     this.gunModel[44].setRotationPoint(-9.0F, -20.0F, -1.0F);
/*     */     
/* 244 */     this.gunModel[45].addShapeBox(-2.0F, 5.0F, -4.0F, 4, 2, 9, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F);
/* 245 */     this.gunModel[45].setRotationPoint(-7.0F, -18.0F, -1.0F);
/*     */     
/* 247 */     this.gunModel[46].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 248 */     this.gunModel[46].setRotationPoint(26.0F, -18.0F, 2.0F);
/*     */     
/* 250 */     this.gunModel[47].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 251 */     this.gunModel[47].setRotationPoint(25.5F, -15.0F, 2.0F);
/*     */     
/* 253 */     this.gunModel[48].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 254 */     this.gunModel[48].setRotationPoint(22.0F, -12.0F, 2.0F);
/*     */     
/* 256 */     this.gunModel[49].addShapeBox(-2.0F, 5.0F, -4.0F, 7, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 257 */     this.gunModel[49].setRotationPoint(15.0F, -12.0F, 2.0F);
/*     */     
/* 259 */     this.gunModel[50].addShapeBox(-2.0F, 5.0F, -4.0F, 4, 1, 4, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 260 */     this.gunModel[50].setRotationPoint(11.0F, -11.0F, 2.0F);
/*     */     
/* 262 */     this.gunModel[51].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 263 */     this.gunModel[51].setRotationPoint(12.5F, -20.0F, -1.0F);
/*     */     
/* 265 */     this.gunModel[52].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F);
/* 266 */     this.gunModel[52].setRotationPoint(11.5F, -19.0F, -1.0F);
/*     */     
/* 268 */     this.gunModel[53].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 2, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F);
/* 269 */     this.gunModel[53].setRotationPoint(10.5F, -18.0F, -1.0F);
/*     */     
/* 271 */     this.gunModel[54].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 272 */     this.gunModel[54].setRotationPoint(11.0F, -16.0F, -1.0F);
/*     */     
/* 274 */     this.gunModel[55].addShapeBox(-2.0F, 5.0F, -4.0F, 12, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 275 */     this.gunModel[55].setRotationPoint(-1.0F, -14.0F, -1.0F);
/*     */     
/* 277 */     this.gunModel[56].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 278 */     this.gunModel[56].setRotationPoint(12.0F, -14.0F, -1.0F);
/*     */     
/* 280 */     this.gunModel[57].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 281 */     this.gunModel[57].setRotationPoint(13.0F, -13.0F, -1.0F);
/*     */     
/* 283 */     this.gunModel[58].addShapeBox(-2.0F, 5.0F, -4.0F, 12, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 284 */     this.gunModel[58].setRotationPoint(-1.0F, -16.0F, -1.0F);
/*     */     
/* 286 */     this.gunModel[59].addShapeBox(-2.0F, 5.0F, -4.0F, 12, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 287 */     this.gunModel[59].setRotationPoint(-1.0F, -18.0F, -1.0F);
/*     */     
/* 289 */     this.gunModel[60].addShapeBox(-2.0F, 5.0F, -4.0F, 12, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 290 */     this.gunModel[60].setRotationPoint(-1.0F, -20.0F, -1.0F);
/*     */     
/* 292 */     this.gunModel[61].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 293 */     this.gunModel[61].setRotationPoint(11.0F, -14.0F, -1.0F);
/*     */     
/* 295 */     this.gunModel[62].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 296 */     this.gunModel[62].setRotationPoint(11.5F, -20.0F, -1.0F);
/*     */     
/* 298 */     this.gunModel[63].addShapeBox(-2.0F, 5.0F, -4.0F, 14, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 299 */     this.gunModel[63].setRotationPoint(-4.0F, 7.5F, -1.0F);
/*     */     
/* 301 */     this.gunModel[64].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 2, 9, 0.0F, -0.25F, 0.5F, -3.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -3.0F, -0.25F, -1.85F, -3.0F, 0.25F, -1.4F, 0.0F, 0.25F, -1.4F, 0.0F, -0.25F, -1.75F, -3.0F);
/* 302 */     this.gunModel[64].setRotationPoint(-11.25F, 7.5F, -1.0F);
/*     */     
/* 304 */     this.gunModel[65].addShapeBox(-2.0F, 5.0F, -4.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 305 */     this.gunModel[65].setRotationPoint(-6.0F, -23.5F, 8.0F);
/*     */     
/* 307 */     this.gunModel[66].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 308 */     this.gunModel[66].setRotationPoint(-9.0F, -24.0F, 7.5F);
/*     */     
/* 310 */     this.gunModel[67].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 311 */     this.gunModel[67].setRotationPoint(-9.0F, -23.0F, 7.5F);
/*     */     
/* 313 */     this.gunModel[68].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 314 */     this.gunModel[68].setRotationPoint(-9.0F, -24.0F, 7.5F);
/*     */     
/* 316 */     this.gunModel[69].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 317 */     this.gunModel[69].setRotationPoint(-9.0F, -24.0F, -1.5F);
/*     */     
/* 319 */     this.gunModel[70].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 320 */     this.gunModel[70].setRotationPoint(-9.0F, -24.0F, -1.5F);
/*     */     
/* 322 */     this.gunModel[71].addBox(-2.0F, 5.0F, -4.0F, 6, 2, 1, 0.0F);
/* 323 */     this.gunModel[71].setRotationPoint(-8.0F, -24.0F, -1.5F);
/*     */     
/* 325 */     this.gunModel[72].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 326 */     this.gunModel[72].setRotationPoint(-9.0F, -23.0F, -1.5F);
/*     */     
/* 328 */     this.gunModel[73].addShapeBox(-2.0F, 5.0F, -4.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 329 */     this.gunModel[73].setRotationPoint(-6.0F, -23.5F, -2.5F);
/*     */     
/* 331 */     this.gunModel[74].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 332 */     this.gunModel[74].setRotationPoint(5.0F, -25.9F, -1.5F);
/*     */     
/* 334 */     this.gunModel[75].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 335 */     this.gunModel[75].setRotationPoint(3.0F, -25.4F, -2.5F);
/*     */     
/* 337 */     this.gunModel[76].addShapeBox(-2.0F, 5.0F, -4.0F, 7, 23, 9, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 338 */     this.gunModel[76].setRotationPoint(-8.0F, -16.0F, -1.0F);
/*     */     
/* 340 */     this.gunModel[77].addShapeBox(-2.0F, 5.0F, -4.0F, 4, 2, 9, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.4F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.25F, -1.4F, 0.0F);
/* 341 */     this.gunModel[77].setRotationPoint(-8.25F, 7.5F, -1.0F);
/*     */     
/* 343 */     this.gunModel[78].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 1, 9, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/* 344 */     this.gunModel[78].setRotationPoint(-14.0F, -24.0F, -1.0F);
/*     */     
/* 346 */     this.gunModel[79].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 2, 9, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 347 */     this.gunModel[79].setRotationPoint(-3.0F, -18.0F, -1.0F);
/*     */     
/* 349 */     this.gunModel[80].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 2, 9, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 350 */     this.gunModel[80].setRotationPoint(-4.0F, -20.0F, -1.0F);
/*     */     
/* 352 */     this.gunModel[81].addBox(-2.0F, 5.0F, -4.0F, 1, 1, 9, 0.0F);
/* 353 */     this.gunModel[81].setRotationPoint(-5.0F, -21.0F, -1.0F);
/*     */     
/* 355 */     this.gunModel[82].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 9, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 356 */     this.gunModel[82].setRotationPoint(-6.0F, -21.0F, -1.0F);
/*     */     
/* 358 */     this.gunModel[83].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 2, 9, 0.0F, 3.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 359 */     this.gunModel[83].setRotationPoint(-7.0F, -23.0F, -1.0F);
/*     */     
/*     */ 
/* 362 */     this.ammoModel = new ModelRendererTurbo[4];
/* 363 */     this.ammoModel[0] = new ModelRendererTurbo(this, 425, 65, this.textureX, this.textureY);
/* 364 */     this.ammoModel[1] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/* 365 */     this.ammoModel[2] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/* 366 */     this.ammoModel[3] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/*     */     
/* 368 */     this.ammoModel[0].addShapeBox(-2.0F, 5.0F, -4.0F, 13, 2, 9, 0.0F, 0.0F, 0.1F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 369 */     this.ammoModel[0].setRotationPoint(-5.0F, 8.5F, -1.0F);
/*     */     
/* 371 */     this.ammoModel[1].addShapeBox(-2.0F, 5.0F, -4.0F, 4, 2, 9, 0.0F, 1.0F, -0.2F, -2.25F, 0.5F, -0.95F, 0.0F, 0.5F, -0.95F, 0.0F, 1.0F, -0.2F, -2.25F, -1.0F, 1.5F, -2.25F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, -1.0F, 1.5F, -2.25F);
/* 372 */     this.ammoModel[1].setRotationPoint(-9.5F, 7.5F, -1.0F);
/*     */     
/* 374 */     this.ammoModel[2].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 375 */     this.ammoModel[2].setRotationPoint(8.5F, 10.0F, -1.0F);
/*     */     
/* 377 */     this.ammoModel[3].addShapeBox(-2.0F, 5.0F, -4.0F, 11, 25, 8, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 5.0F, 0.0F, -0.1F, -5.0F, 1.35F, -0.1F, -5.0F, 1.35F, -0.1F, 5.0F, 0.0F, -0.1F);
/* 378 */     this.ammoModel[3].setRotationPoint(-1.0F, -17.0F, -0.5F);
/*     */     
/*     */ 
/* 381 */     this.slideModel = new ModelRendererTurbo[81];
/* 382 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 383 */     this.slideModel[1] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/* 384 */     this.slideModel[2] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/* 385 */     this.slideModel[3] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/* 386 */     this.slideModel[4] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 387 */     this.slideModel[5] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/* 388 */     this.slideModel[6] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/* 389 */     this.slideModel[7] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/* 390 */     this.slideModel[8] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/* 391 */     this.slideModel[9] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 392 */     this.slideModel[10] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/* 393 */     this.slideModel[11] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
/* 394 */     this.slideModel[12] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 395 */     this.slideModel[13] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/* 396 */     this.slideModel[14] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/* 397 */     this.slideModel[15] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/* 398 */     this.slideModel[16] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 399 */     this.slideModel[17] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/* 400 */     this.slideModel[18] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/* 401 */     this.slideModel[19] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/* 402 */     this.slideModel[20] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/* 403 */     this.slideModel[21] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/* 404 */     this.slideModel[22] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/* 405 */     this.slideModel[23] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/* 406 */     this.slideModel[24] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/* 407 */     this.slideModel[25] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/* 408 */     this.slideModel[26] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/* 409 */     this.slideModel[27] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
/* 410 */     this.slideModel[28] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/* 411 */     this.slideModel[29] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/* 412 */     this.slideModel[30] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/* 413 */     this.slideModel[31] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 414 */     this.slideModel[32] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 415 */     this.slideModel[33] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/* 416 */     this.slideModel[34] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/* 417 */     this.slideModel[35] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/* 418 */     this.slideModel[36] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/* 419 */     this.slideModel[37] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/* 420 */     this.slideModel[38] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/* 421 */     this.slideModel[39] = new ModelRendererTurbo(this, 137, 41, this.textureX, this.textureY);
/* 422 */     this.slideModel[40] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/* 423 */     this.slideModel[41] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/* 424 */     this.slideModel[42] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/* 425 */     this.slideModel[43] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/* 426 */     this.slideModel[44] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/* 427 */     this.slideModel[45] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/* 428 */     this.slideModel[46] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/* 429 */     this.slideModel[47] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/* 430 */     this.slideModel[48] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 431 */     this.slideModel[49] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 432 */     this.slideModel[50] = new ModelRendererTurbo(this, 209, 25, this.textureX, this.textureY);
/* 433 */     this.slideModel[51] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/* 434 */     this.slideModel[52] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/* 435 */     this.slideModel[53] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/* 436 */     this.slideModel[54] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/* 437 */     this.slideModel[55] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/* 438 */     this.slideModel[56] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/* 439 */     this.slideModel[57] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/* 440 */     this.slideModel[58] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 441 */     this.slideModel[59] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/* 442 */     this.slideModel[60] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 443 */     this.slideModel[61] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/* 444 */     this.slideModel[62] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/* 445 */     this.slideModel[63] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/* 446 */     this.slideModel[64] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 447 */     this.slideModel[65] = new ModelRendererTurbo(this, 401, 41, this.textureX, this.textureY);
/* 448 */     this.slideModel[66] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 449 */     this.slideModel[67] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/* 450 */     this.slideModel[68] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/* 451 */     this.slideModel[69] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/* 452 */     this.slideModel[70] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/* 453 */     this.slideModel[71] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/* 454 */     this.slideModel[72] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/* 455 */     this.slideModel[73] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/* 456 */     this.slideModel[74] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/* 457 */     this.slideModel[75] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/* 458 */     this.slideModel[76] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/* 459 */     this.slideModel[77] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/* 460 */     this.slideModel[78] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/* 461 */     this.slideModel[79] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/* 462 */     this.slideModel[80] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/*     */     
/* 464 */     this.slideModel[0].addBox(-2.0F, 5.0F, -4.0F, 22, 7, 7, 0.0F);
/* 465 */     this.slideModel[0].setRotationPoint(-9.0F, -33.2F, 0.0F);
/*     */     
/* 467 */     this.slideModel[1].addBox(-2.0F, 5.0F, -4.0F, 33, 3, 9, 0.0F);
/* 468 */     this.slideModel[1].setRotationPoint(13.0F, -29.2F, -1.0F);
/*     */     
/* 470 */     this.slideModel[2].addShapeBox(-2.0F, 5.0F, -4.0F, 24, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 471 */     this.slideModel[2].setRotationPoint(22.0F, -33.2F, 1.0F);
/*     */     
/* 473 */     this.slideModel[3].addShapeBox(-2.0F, 5.0F, -4.0F, 8, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 474 */     this.slideModel[3].setRotationPoint(13.0F, -32.2F, 6.0F);
/*     */     
/* 476 */     this.slideModel[4].addShapeBox(-2.0F, 5.0F, -4.0F, 10, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 477 */     this.slideModel[4].setRotationPoint(3.0F, -32.2F, 7.0F);
/*     */     
/* 479 */     this.slideModel[5].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 480 */     this.slideModel[5].setRotationPoint(1.0F, -32.2F, 7.0F);
/*     */     
/* 482 */     this.slideModel[6].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 483 */     this.slideModel[6].setRotationPoint(-1.0F, -32.2F, 7.0F);
/*     */     
/* 485 */     this.slideModel[7].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 486 */     this.slideModel[7].setRotationPoint(-1.0F, -32.2F, -1.0F);
/*     */     
/* 488 */     this.slideModel[8].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 489 */     this.slideModel[8].setRotationPoint(1.0F, -32.2F, -1.0F);
/*     */     
/* 491 */     this.slideModel[9].addShapeBox(-2.0F, 5.0F, -4.0F, 10, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 492 */     this.slideModel[9].setRotationPoint(3.0F, -32.2F, -1.0F);
/*     */     
/* 494 */     this.slideModel[10].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 495 */     this.slideModel[10].setRotationPoint(-5.0F, -32.2F, 7.0F);
/*     */     
/* 497 */     this.slideModel[11].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 498 */     this.slideModel[11].setRotationPoint(-3.0F, -32.2F, 7.0F);
/*     */     
/* 500 */     this.slideModel[12].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 501 */     this.slideModel[12].setRotationPoint(-5.0F, -32.2F, -1.0F);
/*     */     
/* 503 */     this.slideModel[13].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 504 */     this.slideModel[13].setRotationPoint(-3.0F, -32.2F, -1.0F);
/*     */     
/* 506 */     this.slideModel[14].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 507 */     this.slideModel[14].setRotationPoint(44.0F, -36.0F, 3.0F);
/*     */     
/* 509 */     this.slideModel[15].addBox(-2.0F, 5.0F, -4.0F, 3, 1, 1, 0.0F);
/* 510 */     this.slideModel[15].setRotationPoint(44.0F, -35.0F, 3.0F);
/*     */     
/* 512 */     this.slideModel[16].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 513 */     this.slideModel[16].setRotationPoint(43.0F, -36.0F, 3.0F);
/*     */     
/* 515 */     this.slideModel[17].addBox(-2.0F, 5.0F, -4.0F, 2, 2, 1, 0.0F);
/* 516 */     this.slideModel[17].setRotationPoint(-7.0F, -36.0F, 2.0F);
/*     */     
/* 518 */     this.slideModel[18].addBox(-2.0F, 5.0F, -4.0F, 2, 2, 1, 0.0F);
/* 519 */     this.slideModel[18].setRotationPoint(-7.0F, -36.0F, 4.0F);
/*     */     
/* 521 */     this.slideModel[19].addBox(-2.0F, 5.0F, -4.0F, 2, 1, 1, 0.0F);
/* 522 */     this.slideModel[19].setRotationPoint(-7.0F, -35.0F, 3.0F);
/*     */     
/* 524 */     this.slideModel[20].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 525 */     this.slideModel[20].setRotationPoint(-8.0F, -36.0F, 4.0F);
/*     */     
/* 527 */     this.slideModel[21].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 3, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 528 */     this.slideModel[21].setRotationPoint(-8.0F, -36.0F, 2.0F);
/*     */     
/* 530 */     this.slideModel[22].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 531 */     this.slideModel[22].setRotationPoint(-7.0F, -32.2F, 7.0F);
/*     */     
/* 533 */     this.slideModel[23].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 534 */     this.slideModel[23].setRotationPoint(-7.0F, -32.2F, -1.0F);
/*     */     
/* 536 */     this.slideModel[24].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 537 */     this.slideModel[24].setRotationPoint(-11.0F, -32.2F, 7.0F);
/*     */     
/* 539 */     this.slideModel[25].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 540 */     this.slideModel[25].setRotationPoint(-11.0F, -32.2F, -1.0F);
/*     */     
/* 542 */     this.slideModel[26].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 5, 2, 0.0F, -1.1F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 543 */     this.slideModel[26].setRotationPoint(-10.6F, -33.2F, 0.0F);
/*     */     
/* 545 */     this.slideModel[27].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 3, 0.0F, -0.25F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 546 */     this.slideModel[27].setRotationPoint(-9.75F, -33.2F, 2.0F);
/*     */     
/* 548 */     this.slideModel[28].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 549 */     this.slideModel[28].setRotationPoint(-11.25F, -28.2F, 0.0F);
/*     */     
/* 551 */     this.slideModel[29].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 552 */     this.slideModel[29].setRotationPoint(-11.25F, -28.2F, 5.0F);
/*     */     
/* 554 */     this.slideModel[30].addBox(-2.0F, 5.0F, -4.0F, 47, 2, 1, 0.0F);
/* 555 */     this.slideModel[30].setRotationPoint(-10.0F, -26.5F, 5.5F);
/*     */     
/* 557 */     this.slideModel[31].addBox(-2.0F, 5.0F, -4.0F, 47, 2, 1, 0.0F);
/* 558 */     this.slideModel[31].setRotationPoint(-10.0F, -26.5F, 1.5F);
/*     */     
/* 560 */     this.slideModel[32].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 561 */     this.slideModel[32].setRotationPoint(46.0F, -28.2F, 4.5F);
/*     */     
/* 563 */     this.slideModel[33].addBox(-2.0F, 5.0F, -4.0F, 3, 2, 2, 0.0F);
/* 564 */     this.slideModel[33].setRotationPoint(46.0F, -28.2F, 2.5F);
/*     */     
/* 566 */     this.slideModel[34].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 567 */     this.slideModel[34].setRotationPoint(46.0F, -34.2F, 0.0F);
/*     */     
/* 569 */     this.slideModel[35].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 5, 2, 0.0F, -1.1F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 570 */     this.slideModel[35].setRotationPoint(-10.6F, -33.2F, 5.0F);
/*     */     
/* 572 */     this.slideModel[36].addShapeBox(-1.0F, 5.0F, -4.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 573 */     this.slideModel[36].setRotationPoint(45.0F, -29.2F, 6.0F);
/*     */     
/* 575 */     this.slideModel[37].addBox(-2.0F, 5.0F, -4.0F, 8, 6, 1, 0.0F);
/* 576 */     this.slideModel[37].setRotationPoint(13.0F, -33.2F, 6.0F);
/*     */     
/* 578 */     this.slideModel[38].addShapeBox(-2.0F, 5.0F, -4.0F, 39, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 579 */     this.slideModel[38].setRotationPoint(-9.0F, -34.2F, 6.0F);
/*     */     
/* 581 */     this.slideModel[39].addShapeBox(-2.0F, 5.0F, -4.0F, 22, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 582 */     this.slideModel[39].setRotationPoint(-9.0F, -34.2F, 0.0F);
/*     */     
/* 584 */     this.slideModel[40].addShapeBox(-2.0F, 5.0F, -4.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 585 */     this.slideModel[40].setRotationPoint(22.0F, -34.2F, 0.0F);
/*     */     
/* 587 */     this.slideModel[41].addBox(-2.0F, 5.0F, -4.0F, 22, 1, 5, 0.0F);
/* 588 */     this.slideModel[41].setRotationPoint(-9.0F, -34.2F, 1.0F);
/*     */     
/* 590 */     this.slideModel[42].addBox(-2.0F, 5.0F, -4.0F, 24, 1, 5, 0.0F);
/* 591 */     this.slideModel[42].setRotationPoint(22.0F, -34.2F, 1.0F);
/*     */     
/* 593 */     this.slideModel[43].addBox(-2.0F, 5.0F, -4.0F, 3, 1, 4, 0.0F);
/* 594 */     this.slideModel[43].setRotationPoint(46.0F, -33.2F, 1.5F);
/*     */     
/* 596 */     this.slideModel[44].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 597 */     this.slideModel[44].setRotationPoint(30.0F, -33.2F, 6.0F);
/*     */     
/* 599 */     this.slideModel[45].addBox(-2.0F, 5.0F, -4.0F, 8, 6, 1, 0.0F);
/* 600 */     this.slideModel[45].setRotationPoint(21.0F, -33.2F, 6.0F);
/*     */     
/* 602 */     this.slideModel[46].addBox(-2.0F, 5.0F, -4.0F, 7, 6, 1, 0.0F);
/* 603 */     this.slideModel[46].setRotationPoint(22.0F, -33.2F, 0.0F);
/*     */     
/* 605 */     this.slideModel[47].addShapeBox(-2.0F, 5.0F, -4.0F, 0, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 606 */     this.slideModel[47].setRotationPoint(29.0F, -33.2F, 6.0F);
/*     */     
/* 608 */     this.slideModel[48].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 609 */     this.slideModel[48].setRotationPoint(32.0F, -33.2F, 6.0F);
/*     */     
/* 611 */     this.slideModel[49].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 612 */     this.slideModel[49].setRotationPoint(36.0F, -33.2F, 6.0F);
/*     */     
/* 614 */     this.slideModel[50].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 615 */     this.slideModel[50].setRotationPoint(34.0F, -33.2F, 6.0F);
/*     */     
/* 617 */     this.slideModel[51].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 618 */     this.slideModel[51].setRotationPoint(38.0F, -33.2F, 6.0F);
/*     */     
/* 620 */     this.slideModel[52].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 621 */     this.slideModel[52].setRotationPoint(38.0F, -33.2F, 0.0F);
/*     */     
/* 623 */     this.slideModel[53].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 624 */     this.slideModel[53].setRotationPoint(36.0F, -33.2F, 0.0F);
/*     */     
/* 626 */     this.slideModel[54].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 627 */     this.slideModel[54].setRotationPoint(34.0F, -33.2F, 0.0F);
/*     */     
/* 629 */     this.slideModel[55].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 630 */     this.slideModel[55].setRotationPoint(32.0F, -33.2F, 0.0F);
/*     */     
/* 632 */     this.slideModel[56].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 633 */     this.slideModel[56].setRotationPoint(30.0F, -33.2F, 0.0F);
/*     */     
/* 635 */     this.slideModel[57].addShapeBox(-2.0F, 5.0F, -4.0F, 0, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 636 */     this.slideModel[57].setRotationPoint(29.0F, -33.2F, 0.0F);
/*     */     
/* 638 */     this.slideModel[58].addShapeBox(-2.0F, 5.0F, -4.0F, 6, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 639 */     this.slideModel[58].setRotationPoint(40.0F, -33.2F, 6.0F);
/*     */     
/* 641 */     this.slideModel[59].addShapeBox(-2.0F, 5.0F, -4.0F, 6, 6, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 642 */     this.slideModel[59].setRotationPoint(40.0F, -33.2F, 0.0F);
/*     */     
/* 644 */     this.slideModel[60].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 645 */     this.slideModel[60].setRotationPoint(31.75F, -34.2F, 0.0F);
/*     */     
/* 647 */     this.slideModel[61].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 648 */     this.slideModel[61].setRotationPoint(33.75F, -34.2F, 0.0F);
/*     */     
/* 650 */     this.slideModel[62].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 651 */     this.slideModel[62].setRotationPoint(35.75F, -34.2F, 0.0F);
/*     */     
/* 653 */     this.slideModel[63].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 654 */     this.slideModel[63].setRotationPoint(37.75F, -34.2F, 0.0F);
/*     */     
/* 656 */     this.slideModel[64].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 657 */     this.slideModel[64].setRotationPoint(39.75F, -34.2F, 0.0F);
/*     */     
/* 659 */     this.slideModel[65].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 660 */     this.slideModel[65].setRotationPoint(41.5F, -34.2F, 0.0F);
/*     */     
/* 662 */     this.slideModel[66].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 663 */     this.slideModel[66].setRotationPoint(42.5F, -34.2F, 0.0F);
/*     */     
/* 665 */     this.slideModel[67].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 666 */     this.slideModel[67].setRotationPoint(30.0F, -34.2F, 6.0F);
/*     */     
/* 668 */     this.slideModel[68].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 669 */     this.slideModel[68].setRotationPoint(31.75F, -34.2F, 6.0F);
/*     */     
/* 671 */     this.slideModel[69].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 672 */     this.slideModel[69].setRotationPoint(33.75F, -34.2F, 6.0F);
/*     */     
/* 674 */     this.slideModel[70].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 675 */     this.slideModel[70].setRotationPoint(37.75F, -34.2F, 6.0F);
/*     */     
/* 677 */     this.slideModel[71].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 678 */     this.slideModel[71].setRotationPoint(35.75F, -34.2F, 6.0F);
/*     */     
/* 680 */     this.slideModel[72].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 681 */     this.slideModel[72].setRotationPoint(39.75F, -34.2F, 6.0F);
/*     */     
/* 683 */     this.slideModel[73].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 684 */     this.slideModel[73].setRotationPoint(41.5F, -34.2F, 6.0F);
/*     */     
/* 686 */     this.slideModel[74].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 687 */     this.slideModel[74].setRotationPoint(42.5F, -34.2F, 6.0F);
/*     */     
/* 689 */     this.slideModel[75].addShapeBox(-2.0F, 5.0F, -4.0F, 2, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 690 */     this.slideModel[75].setRotationPoint(20.0F, -31.2F, 0.0F);
/*     */     
/* 692 */     this.slideModel[76].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 693 */     this.slideModel[76].setRotationPoint(46.0F, -33.2F, 6.0F);
/*     */     
/* 695 */     this.slideModel[77].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 696 */     this.slideModel[77].setRotationPoint(46.0F, -33.2F, 0.5F);
/*     */     
/* 698 */     this.slideModel[78].addShapeBox(-1.0F, 5.0F, -4.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 699 */     this.slideModel[78].setRotationPoint(45.0F, -29.2F, -0.5F);
/*     */     
/* 701 */     this.slideModel[79].addShapeBox(-2.0F, 5.0F, -4.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 702 */     this.slideModel[79].setRotationPoint(46.0F, -28.2F, 1.5F);
/*     */     
/* 704 */     this.slideModel[80].addShapeBox(-2.0F, 5.0F, -4.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F);
/* 705 */     this.slideModel[80].setRotationPoint(47.5F, -34.2F, 0.0F);
/*     */     
/*     */ 
/*     */ 
/* 709 */     translateAll(0.0F, -19.0F, 0.5F);
/* 710 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/*     */ 
/* 713 */     this.gunSlideDistance = 1.5F;
/* 714 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 716 */     this.tiltGun = 7.0F;
/* 717 */     this.rotateGunVertical = 3.0F;
/* 718 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 720 */     this.rotateClipVertical = 5.0F;
/* 721 */     this.translateClip = new Vector3f(0.0F, -16.0F, 0.0F);
/*     */     
/*     */ 
/* 724 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelfnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */