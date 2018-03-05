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
/*     */ public class Modelfmg
/*     */   extends ModelGun
/*     */ {
/*  16 */   int textureX = 512;
/*  17 */   int textureY = 512;
/*     */   
/*     */   public Modelfmg()
/*     */   {
/*  21 */     this.gunModel = new ModelRendererTurbo[90];
/*  22 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  23 */     this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
/*  24 */     this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*  25 */     this.gunModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*  26 */     this.gunModel[4] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
/*  27 */     this.gunModel[5] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*  28 */     this.gunModel[6] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  29 */     this.gunModel[7] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*  30 */     this.gunModel[8] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  31 */     this.gunModel[9] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*  32 */     this.gunModel[10] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
/*  33 */     this.gunModel[11] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  34 */     this.gunModel[12] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  35 */     this.gunModel[13] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  36 */     this.gunModel[14] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
/*  37 */     this.gunModel[15] = new ModelRendererTurbo(this, 329, 1, this.textureX, this.textureY);
/*  38 */     this.gunModel[16] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*  39 */     this.gunModel[17] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  40 */     this.gunModel[18] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  41 */     this.gunModel[19] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  42 */     this.gunModel[20] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  43 */     this.gunModel[21] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
/*  44 */     this.gunModel[22] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
/*  45 */     this.gunModel[23] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*  46 */     this.gunModel[24] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
/*  47 */     this.gunModel[25] = new ModelRendererTurbo(this, 81, 9, this.textureX, this.textureY);
/*  48 */     this.gunModel[26] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
/*  49 */     this.gunModel[27] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*  50 */     this.gunModel[28] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  51 */     this.gunModel[29] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*  52 */     this.gunModel[30] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  53 */     this.gunModel[31] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*  54 */     this.gunModel[32] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
/*  55 */     this.gunModel[33] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*  56 */     this.gunModel[34] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*  57 */     this.gunModel[35] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*  58 */     this.gunModel[36] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/*  59 */     this.gunModel[37] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*  60 */     this.gunModel[38] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  61 */     this.gunModel[39] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*  62 */     this.gunModel[40] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*  63 */     this.gunModel[41] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*  64 */     this.gunModel[42] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
/*  65 */     this.gunModel[43] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*  66 */     this.gunModel[44] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  67 */     this.gunModel[45] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  68 */     this.gunModel[46] = new ModelRendererTurbo(this, 289, 9, this.textureX, this.textureY);
/*  69 */     this.gunModel[47] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/*  70 */     this.gunModel[48] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/*  71 */     this.gunModel[49] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  72 */     this.gunModel[50] = new ModelRendererTurbo(this, 353, 9, this.textureX, this.textureY);
/*  73 */     this.gunModel[51] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*  74 */     this.gunModel[52] = new ModelRendererTurbo(this, 369, 9, this.textureX, this.textureY);
/*  75 */     this.gunModel[53] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  76 */     this.gunModel[54] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  77 */     this.gunModel[55] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  78 */     this.gunModel[56] = new ModelRendererTurbo(this, 449, 9, this.textureX, this.textureY);
/*  79 */     this.gunModel[57] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  80 */     this.gunModel[58] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  81 */     this.gunModel[59] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  82 */     this.gunModel[60] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*  83 */     this.gunModel[61] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  84 */     this.gunModel[62] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*  85 */     this.gunModel[63] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  86 */     this.gunModel[64] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  87 */     this.gunModel[65] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/*  88 */     this.gunModel[66] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
/*  89 */     this.gunModel[67] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*  90 */     this.gunModel[68] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*  91 */     this.gunModel[69] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  92 */     this.gunModel[70] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*  93 */     this.gunModel[71] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  94 */     this.gunModel[72] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  95 */     this.gunModel[73] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
/*  96 */     this.gunModel[74] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*  97 */     this.gunModel[75] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  98 */     this.gunModel[76] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  99 */     this.gunModel[77] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/* 100 */     this.gunModel[78] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/* 101 */     this.gunModel[79] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/* 102 */     this.gunModel[80] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/* 103 */     this.gunModel[81] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/* 104 */     this.gunModel[82] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 105 */     this.gunModel[83] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/* 106 */     this.gunModel[84] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 107 */     this.gunModel[85] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
/* 108 */     this.gunModel[86] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 109 */     this.gunModel[87] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/* 110 */     this.gunModel[88] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/* 111 */     this.gunModel[89] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*     */     
/* 113 */     this.gunModel[0].addShapeBox(-1.0F, -11.0F, -2.0F, 11, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 114 */     this.gunModel[0].setRotationPoint(6.5F, -1.0F, 0.0F);
/*     */     
/* 116 */     this.gunModel[1].addBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F);
/* 117 */     this.gunModel[1].setRotationPoint(18.5F, 3.0F, 1.0F);
/*     */     
/* 119 */     this.gunModel[2].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 120 */     this.gunModel[2].setRotationPoint(18.5F, 4.0F, 1.0F);
/*     */     
/* 122 */     this.gunModel[3].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 123 */     this.gunModel[3].setRotationPoint(18.5F, 4.0F, 2.0F);
/*     */     
/* 125 */     this.gunModel[4].addBox(-1.0F, -11.0F, -2.0F, 4, 1, 2, 0.0F);
/* 126 */     this.gunModel[4].setRotationPoint(15.5F, 2.0F, 1.0F);
/*     */     
/* 128 */     this.gunModel[5].addBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F);
/* 129 */     this.gunModel[5].setRotationPoint(11.5F, 2.0F, 1.0F);
/*     */     
/* 131 */     this.gunModel[6].addShapeBox(-1.0F, -11.0F, -2.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 132 */     this.gunModel[6].setRotationPoint(16.5F, 3.0F, 1.0F);
/*     */     
/* 134 */     this.gunModel[7].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 135 */     this.gunModel[7].setRotationPoint(15.5F, 3.0F, 1.5F);
/*     */     
/* 137 */     this.gunModel[8].addShapeBox(-1.0F, -11.0F, -2.0F, 20, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 138 */     this.gunModel[8].setRotationPoint(-0.5F, -1.5F, 2.5F);
/*     */     
/* 140 */     this.gunModel[9].addShapeBox(-1.0F, -11.0F, -2.0F, 20, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 141 */     this.gunModel[9].setRotationPoint(-0.5F, -1.5F, 0.0F);
/*     */     
/* 143 */     this.gunModel[10].addShapeBox(-1.0F, -11.0F, -2.0F, 18, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 144 */     this.gunModel[10].setRotationPoint(-0.5F, -1.0F, 2.5F);
/*     */     
/* 146 */     this.gunModel[11].addBox(-1.0F, -11.0F, -2.0F, 3, 3, 2, 0.0F);
/* 147 */     this.gunModel[11].setRotationPoint(0.5F, -1.0F, 1.0F);
/*     */     
/* 149 */     this.gunModel[12].addShapeBox(-1.0F, -11.0F, -2.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 150 */     this.gunModel[12].setRotationPoint(-0.5F, -1.0F, 0.0F);
/*     */     
/* 152 */     this.gunModel[13].addShapeBox(-1.0F, -11.0F, -2.0F, 3, 2, 1, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 153 */     this.gunModel[13].setRotationPoint(3.5F, 1.0F, 0.0F);
/*     */     
/* 155 */     this.gunModel[14].addBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F);
/* 156 */     this.gunModel[14].setRotationPoint(18.5F, 0.0F, 1.5F);
/*     */     
/* 158 */     this.gunModel[15].addBox(-1.0F, -11.0F, -2.0F, 9, 1, 2, 0.0F);
/* 159 */     this.gunModel[15].setRotationPoint(-0.5F, 2.0F, 1.0F);
/*     */     
/* 161 */     this.gunModel[16].addShapeBox(-1.0F, -11.0F, -2.0F, 16, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 162 */     this.gunModel[16].setRotationPoint(-16.5F, -1.5F, 0.0F);
/*     */     
/* 164 */     this.gunModel[17].addShapeBox(-1.0F, -11.0F, -2.0F, 16, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 165 */     this.gunModel[17].setRotationPoint(-16.5F, -1.0F, 0.0F);
/*     */     
/* 167 */     this.gunModel[18].addShapeBox(-1.0F, -11.0F, -2.0F, 16, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 168 */     this.gunModel[18].setRotationPoint(-16.5F, -1.0F, 2.5F);
/*     */     
/* 170 */     this.gunModel[19].addShapeBox(-1.0F, -11.0F, -2.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 171 */     this.gunModel[19].setRotationPoint(-16.5F, -1.5F, 2.5F);
/*     */     
/* 173 */     this.gunModel[20].addShapeBox(-1.0F, -11.0F, -2.0F, 17, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 174 */     this.gunModel[20].setRotationPoint(-16.5F, -1.5F, 1.0F);
/*     */     
/* 176 */     this.gunModel[21].addShapeBox(-1.0F, -11.0F, -2.0F, 6, 7, 3, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 177 */     this.gunModel[21].setRotationPoint(-0.5F, 3.0F, 0.5F);
/*     */     
/* 179 */     this.gunModel[22].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F);
/* 180 */     this.gunModel[22].setRotationPoint(4.5F, 5.0F, 1.0F);
/*     */     
/* 182 */     this.gunModel[23].addBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F);
/* 183 */     this.gunModel[23].setRotationPoint(6.5F, 5.0F, 1.0F);
/*     */     
/* 185 */     this.gunModel[24].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, -0.35F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 186 */     this.gunModel[24].setRotationPoint(4.5F, 5.0F, 2.0F);
/*     */     
/* 188 */     this.gunModel[25].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 189 */     this.gunModel[25].setRotationPoint(5.5F, 5.0F, 1.0F);
/*     */     
/* 191 */     this.gunModel[26].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 192 */     this.gunModel[26].setRotationPoint(5.5F, 5.0F, 2.0F);
/*     */     
/* 194 */     this.gunModel[27].addShapeBox(-1.0F, -11.0F, -2.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 195 */     this.gunModel[27].setRotationPoint(17.5F, -1.0F, 0.0F);
/*     */     
/* 197 */     this.gunModel[28].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 198 */     this.gunModel[28].setRotationPoint(18.5F, -1.0F, 0.5F);
/*     */     
/* 200 */     this.gunModel[29].addShapeBox(-1.0F, -11.0F, -2.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 201 */     this.gunModel[29].setRotationPoint(17.5F, -1.0F, 2.5F);
/*     */     
/* 203 */     this.gunModel[30].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 204 */     this.gunModel[30].setRotationPoint(18.5F, -1.0F, 2.25F);
/*     */     
/* 206 */     this.gunModel[31].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 207 */     this.gunModel[31].setRotationPoint(6.5F, 4.0F, 1.0F);
/*     */     
/* 209 */     this.gunModel[32].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 210 */     this.gunModel[32].setRotationPoint(7.5F, 3.0F, 1.0F);
/*     */     
/* 212 */     this.gunModel[33].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 213 */     this.gunModel[33].setRotationPoint(7.5F, 5.0F, 1.0F);
/*     */     
/* 215 */     this.gunModel[34].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 216 */     this.gunModel[34].setRotationPoint(7.5F, 3.0F, 2.0F);
/*     */     
/* 218 */     this.gunModel[35].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 219 */     this.gunModel[35].setRotationPoint(6.5F, 4.0F, 2.0F);
/*     */     
/* 221 */     this.gunModel[36].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 222 */     this.gunModel[36].setRotationPoint(5.5F, 3.0F, 1.75F);
/*     */     
/* 224 */     this.gunModel[37].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 225 */     this.gunModel[37].setRotationPoint(-16.5F, 3.0F, 0.0F);
/*     */     
/* 227 */     this.gunModel[38].addBox(-1.0F, -11.0F, -2.0F, 1, 6, 2, 0.0F);
/* 228 */     this.gunModel[38].setRotationPoint(-16.5F, 0.0F, 1.0F);
/*     */     
/* 230 */     this.gunModel[39].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 231 */     this.gunModel[39].setRotationPoint(-15.5F, 3.0F, 2.5F);
/*     */     
/* 233 */     this.gunModel[40].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 234 */     this.gunModel[40].setRotationPoint(-16.5F, 3.0F, 2.5F);
/*     */     
/* 236 */     this.gunModel[41].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 237 */     this.gunModel[41].setRotationPoint(-15.5F, 3.0F, 0.0F);
/*     */     
/* 239 */     this.gunModel[42].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 240 */     this.gunModel[42].setRotationPoint(-16.5F, 6.0F, 0.5F);
/*     */     
/* 242 */     this.gunModel[43].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 243 */     this.gunModel[43].setRotationPoint(-16.5F, 6.0F, 2.5F);
/*     */     
/* 245 */     this.gunModel[44].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 246 */     this.gunModel[44].setRotationPoint(-16.5F, 6.0F, 1.5F);
/*     */     
/* 248 */     this.gunModel[45].addBox(-1.0F, -11.0F, -2.0F, 18, 1, 2, 0.0F);
/* 249 */     this.gunModel[45].setRotationPoint(1.5F, -2.0F, 1.0F);
/*     */     
/* 251 */     this.gunModel[46].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 252 */     this.gunModel[46].setRotationPoint(2.5F, -3.0F, 1.5F);
/*     */     
/* 254 */     this.gunModel[47].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 255 */     this.gunModel[47].setRotationPoint(1.5F, -3.0F, 1.0F);
/*     */     
/* 257 */     this.gunModel[48].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 258 */     this.gunModel[48].setRotationPoint(2.5F, -4.0F, 1.0F);
/*     */     
/* 260 */     this.gunModel[49].addShapeBox(-1.0F, -11.0F, -2.0F, 15, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 261 */     this.gunModel[49].setRotationPoint(3.5F, -4.0F, 1.0F);
/*     */     
/* 263 */     this.gunModel[50].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 264 */     this.gunModel[50].setRotationPoint(3.5F, -5.0F, 1.0F);
/*     */     
/* 266 */     this.gunModel[51].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 267 */     this.gunModel[51].setRotationPoint(3.5F, -5.0F, 2.75F);
/*     */     
/* 269 */     this.gunModel[52].addShapeBox(-1.0F, -11.0F, -2.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 270 */     this.gunModel[52].setRotationPoint(4.5F, -5.0F, 2.75F);
/*     */     
/* 272 */     this.gunModel[53].addShapeBox(-1.0F, -11.0F, -2.0F, 14, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 273 */     this.gunModel[53].setRotationPoint(4.5F, -5.0F, 1.0F);
/*     */     
/* 275 */     this.gunModel[54].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 276 */     this.gunModel[54].setRotationPoint(3.5F, -4.0F, 1.0F);
/*     */     
/* 278 */     this.gunModel[55].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 279 */     this.gunModel[55].setRotationPoint(2.5F, -3.0F, 1.0F);
/*     */     
/* 281 */     this.gunModel[56].addShapeBox(-1.0F, -11.0F, -2.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 282 */     this.gunModel[56].setRotationPoint(3.5F, -3.0F, 1.5F);
/*     */     
/* 284 */     this.gunModel[57].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 285 */     this.gunModel[57].setRotationPoint(4.5F, -4.0F, 1.5F);
/*     */     
/* 287 */     this.gunModel[58].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 288 */     this.gunModel[58].setRotationPoint(3.5F, -4.0F, 1.5F);
/*     */     
/* 290 */     this.gunModel[59].addBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F);
/* 291 */     this.gunModel[59].setRotationPoint(-0.5F, 1.0F, 1.0F);
/*     */     
/* 293 */     this.gunModel[60].addBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F);
/* 294 */     this.gunModel[60].setRotationPoint(-0.5F, 0.0F, 1.0F);
/*     */     
/* 296 */     this.gunModel[61].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 297 */     this.gunModel[61].setRotationPoint(15.5F, -3.0F, 1.0F);
/*     */     
/* 299 */     this.gunModel[62].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 300 */     this.gunModel[62].setRotationPoint(5.5F, -3.0F, 1.5F);
/*     */     
/* 302 */     this.gunModel[63].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 303 */     this.gunModel[63].setRotationPoint(5.5F, -3.75F, 1.5F);
/*     */     
/* 305 */     this.gunModel[64].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 306 */     this.gunModel[64].setRotationPoint(0.5F, -2.5F, 1.0F);
/*     */     
/* 308 */     this.gunModel[65].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 309 */     this.gunModel[65].setRotationPoint(15.0F, -3.75F, 1.0F);
/*     */     
/* 311 */     this.gunModel[66].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 312 */     this.gunModel[66].setRotationPoint(15.0F, -2.5F, 1.0F);
/*     */     
/* 314 */     this.gunModel[67].addShapeBox(-1.0F, -11.0F, -2.0F, 6, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 315 */     this.gunModel[67].setRotationPoint(-6.5F, -2.0F, 0.5F);
/*     */     
/* 317 */     this.gunModel[68].addShapeBox(-1.0F, -11.0F, -2.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 318 */     this.gunModel[68].setRotationPoint(-6.5F, -2.0F, 2.0F);
/*     */     
/* 320 */     this.gunModel[69].addShapeBox(-1.0F, -11.0F, -2.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 321 */     this.gunModel[69].setRotationPoint(-6.5F, -2.0F, 1.5F);
/*     */     
/* 323 */     this.gunModel[70].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 324 */     this.gunModel[70].setRotationPoint(18.0F, -5.0F, 1.75F);
/*     */     
/* 326 */     this.gunModel[71].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 327 */     this.gunModel[71].setRotationPoint(4.5F, -5.0F, 2.25F);
/*     */     
/* 329 */     this.gunModel[72].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 330 */     this.gunModel[72].setRotationPoint(4.5F, -5.0F, 1.25F);
/*     */     
/* 332 */     this.gunModel[73].addShapeBox(-1.0F, -11.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 333 */     this.gunModel[73].setRotationPoint(16.5F, -4.0F, 2.75F);
/*     */     
/* 335 */     this.gunModel[74].addShapeBox(-1.0F, -11.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 336 */     this.gunModel[74].setRotationPoint(16.5F, -3.0F, 2.75F);
/*     */     
/* 338 */     this.gunModel[75].addShapeBox(-1.0F, -11.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 339 */     this.gunModel[75].setRotationPoint(16.5F, -3.0F, 0.75F);
/*     */     
/* 341 */     this.gunModel[76].addShapeBox(-1.0F, -11.0F, -2.0F, 3, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 342 */     this.gunModel[76].setRotationPoint(16.5F, -4.0F, 0.75F);
/*     */     
/* 344 */     this.gunModel[77].addShapeBox(-1.0F, -11.0F, -2.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F);
/* 345 */     this.gunModel[77].setRotationPoint(16.5F, -3.75F, 1.25F);
/*     */     
/* 347 */     this.gunModel[78].addShapeBox(-1.0F, -11.0F, -2.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 348 */     this.gunModel[78].setRotationPoint(17.5F, -2.0F, 0.75F);
/*     */     
/* 350 */     this.gunModel[79].addShapeBox(-1.0F, -11.0F, -2.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 351 */     this.gunModel[79].setRotationPoint(17.5F, -2.0F, 3.0F);
/*     */     
/* 353 */     this.gunModel[80].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 354 */     this.gunModel[80].setRotationPoint(19.5F, -4.0F, 2.5F);
/*     */     
/* 356 */     this.gunModel[81].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 357 */     this.gunModel[81].setRotationPoint(19.5F, -4.0F, 1.0F);
/*     */     
/* 359 */     this.gunModel[82].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 360 */     this.gunModel[82].setRotationPoint(19.5F, -3.75F, 1.5F);
/*     */     
/* 362 */     this.gunModel[83].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 363 */     this.gunModel[83].setRotationPoint(19.5F, -2.0F, 1.0F);
/*     */     
/* 365 */     this.gunModel[84].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 366 */     this.gunModel[84].setRotationPoint(19.5F, -2.0F, 2.5F);
/*     */     
/* 368 */     this.gunModel[85].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 369 */     this.gunModel[85].setRotationPoint(19.5F, -3.0F, 2.5F);
/*     */     
/* 371 */     this.gunModel[86].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 372 */     this.gunModel[86].setRotationPoint(19.5F, -3.0F, 1.0F);
/*     */     
/* 374 */     this.gunModel[87].addShapeBox(-1.0F, -11.0F, -2.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 375 */     this.gunModel[87].setRotationPoint(19.5F, -2.75F, 1.5F);
/*     */     
/* 377 */     this.gunModel[88].addBox(-1.0F, -11.0F, -2.0F, 12, 3, 2, 0.0F);
/* 378 */     this.gunModel[88].setRotationPoint(6.5F, -1.0F, 1.0F);
/*     */     
/* 380 */     this.gunModel[89].addBox(-1.0F, -11.0F, -2.0F, 3, 1, 1, 0.0F);
/* 381 */     this.gunModel[89].setRotationPoint(3.5F, 1.0F, 1.0F);
/*     */     
/*     */ 
/* 384 */     this.ammoModel = new ModelRendererTurbo[1];
/* 385 */     this.ammoModel[0] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*     */     
/* 387 */     this.ammoModel[0].addShapeBox(-1.0F, -11.0F, -2.0F, 6, 10, 2, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 388 */     this.ammoModel[0].setRotationPoint(-1.5F, 5.0F, 1.0F);
/*     */     
/*     */ 
/* 391 */     this.slideModel = new ModelRendererTurbo[1];
/* 392 */     this.slideModel[0] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*     */     
/* 394 */     this.slideModel[0].addBox(-1.0F, -11.0F, -2.0F, 3, 2, 1, 0.0F);
/* 395 */     this.slideModel[0].setRotationPoint(3.5F, -1.0F, 1.0F);
/*     */     
/*     */ 
/*     */ 
/* 399 */     translateAll(-2.0F, -2.0F, 0.0F);
/* 400 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*     */     
/* 402 */     this.gunSlideDistance = 0.4F;
/* 403 */     this.animationType = EnumAnimationType.CUSTOM;
/*     */     
/* 405 */     this.tiltGun = 7.0F;
/* 406 */     this.rotateGunVertical = 3.0F;
/* 407 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*     */     
/* 409 */     this.rotateClipVertical = 5.0F;
/* 410 */     this.translateClip = new Vector3f(0.0F, -12.0F, 0.0F);
/*     */     
/*     */ 
/* 413 */     flipAll();
/*     */   }
/*     */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelfmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */