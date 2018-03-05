/*      */ package com.flansmod.client.model.mpack;
/*      */ 
/*      */ import com.flansmod.client.model.EnumAnimationType;
/*      */ import com.flansmod.client.model.ModelGun;
/*      */ import com.flansmod.client.tmt.ModelRendererTurbo;
/*      */ import com.flansmod.common.vector.Vector3f;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Modelm27iar
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelm27iar()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['̦'];
/*   22 */     this.defaultBarrelModel = new ModelRendererTurbo[15];
/*   23 */     this.defaultScopeModel = new ModelRendererTurbo[91];
/*   24 */     this.ammoModel = new ModelRendererTurbo[66];
/*   25 */     this.slideModel = new ModelRendererTurbo[41];
/*      */     
/*   27 */     initgunModel_1();
/*   28 */     initgunModel_2();
/*   29 */     initdefaultBarrelModel_1();
/*   30 */     initdefaultScopeModel_1();
/*   31 */     initammoModel_1();
/*   32 */     initslideModel_1();
/*      */     
/*   34 */     this.barrelAttachPoint = new Vector3f(8.625F, 1.5625F, 0.375F);
/*      */     
/*   36 */     this.stockAttachPoint = new Vector3f(4.125F, 1.5F, -0.25F);
/*      */     
/*   38 */     this.scopeAttachPoint = new Vector3f(0.9375F, 3.6875F, 0.0F);
/*      */     
/*   40 */     this.gripAttachPoint = new Vector3f(6.25F, 2.3125F, 0.0F);
/*      */     
/*      */ 
/*   43 */     translateAll(0.0F, -9.0F, 0.0F);
/*   44 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.06F, 0.0F);
/*      */     
/*   46 */     this.gunSlideDistance = 1.5F;
/*   47 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   50 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   55 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[1] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[2] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[3] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[5] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[6] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[7] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[8] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[9] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[10] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[11] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[12] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[13] = new ModelRendererTurbo(this, 649, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[14] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[15] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[16] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[17] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[18] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[19] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[20] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[21] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[22] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[23] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[24] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[25] = new ModelRendererTurbo(this, 1065, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[26] = new ModelRendererTurbo(this, 1097, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[27] = new ModelRendererTurbo(this, 1137, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[28] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[29] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[30] = new ModelRendererTurbo(this, 1361, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[31] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[32] = new ModelRendererTurbo(this, 1433, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[33] = new ModelRendererTurbo(this, 1569, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[34] = new ModelRendererTurbo(this, 1705, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[35] = new ModelRendererTurbo(this, 1833, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[36] = new ModelRendererTurbo(this, 1425, 9, this.textureX, this.textureY);
/*   92 */     this.gunModel[37] = new ModelRendererTurbo(this, 1953, 1, this.textureX, this.textureY);
/*   93 */     this.gunModel[38] = new ModelRendererTurbo(this, 1993, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[39] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[40] = new ModelRendererTurbo(this, 1977, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[41] = new ModelRendererTurbo(this, 1521, 9, this.textureX, this.textureY);
/*   97 */     this.gunModel[42] = new ModelRendererTurbo(this, 1649, 9, this.textureX, this.textureY);
/*   98 */     this.gunModel[43] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*   99 */     this.gunModel[44] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  100 */     this.gunModel[45] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*  101 */     this.gunModel[46] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[47] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/*  103 */     this.gunModel[48] = new ModelRendererTurbo(this, 665, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[49] = new ModelRendererTurbo(this, 777, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[50] = new ModelRendererTurbo(this, 905, 25, this.textureX, this.textureY);
/*  106 */     this.gunModel[51] = new ModelRendererTurbo(this, 1097, 25, this.textureX, this.textureY);
/*  107 */     this.gunModel[52] = new ModelRendererTurbo(this, 1289, 25, this.textureX, this.textureY);
/*  108 */     this.gunModel[53] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  109 */     this.gunModel[54] = new ModelRendererTurbo(this, 1489, 25, this.textureX, this.textureY);
/*  110 */     this.gunModel[55] = new ModelRendererTurbo(this, 1769, 17, this.textureX, this.textureY);
/*  111 */     this.gunModel[56] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  112 */     this.gunModel[57] = new ModelRendererTurbo(this, 1769, 9, this.textureX, this.textureY);
/*  113 */     this.gunModel[58] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  114 */     this.gunModel[59] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[60] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  116 */     this.gunModel[61] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  117 */     this.gunModel[62] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  118 */     this.gunModel[63] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  119 */     this.gunModel[64] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  120 */     this.gunModel[65] = new ModelRendererTurbo(this, 897, 17, this.textureX, this.textureY);
/*  121 */     this.gunModel[66] = new ModelRendererTurbo(this, 985, 17, this.textureX, this.textureY);
/*  122 */     this.gunModel[67] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  123 */     this.gunModel[68] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  124 */     this.gunModel[69] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  125 */     this.gunModel[70] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*  126 */     this.gunModel[71] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  127 */     this.gunModel[72] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[73] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/*  129 */     this.gunModel[74] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[75] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*  131 */     this.gunModel[76] = new ModelRendererTurbo(this, 705, 1, this.textureX, this.textureY);
/*  132 */     this.gunModel[77] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*  133 */     this.gunModel[78] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[79] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*  135 */     this.gunModel[80] = new ModelRendererTurbo(this, 1121, 1, this.textureX, this.textureY);
/*  136 */     this.gunModel[81] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  137 */     this.gunModel[82] = new ModelRendererTurbo(this, 1033, 17, this.textureX, this.textureY);
/*  138 */     this.gunModel[83] = new ModelRendererTurbo(this, 1065, 17, this.textureX, this.textureY);
/*  139 */     this.gunModel[84] = new ModelRendererTurbo(this, 1137, 17, this.textureX, this.textureY);
/*  140 */     this.gunModel[85] = new ModelRendererTurbo(this, 1169, 17, this.textureX, this.textureY);
/*  141 */     this.gunModel[86] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*  142 */     this.gunModel[87] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  143 */     this.gunModel[88] = new ModelRendererTurbo(this, 841, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[89] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[90] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
/*  146 */     this.gunModel[91] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*  147 */     this.gunModel[92] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  148 */     this.gunModel[93] = new ModelRendererTurbo(this, 1289, 17, this.textureX, this.textureY);
/*  149 */     this.gunModel[94] = new ModelRendererTurbo(this, 1321, 17, this.textureX, this.textureY);
/*  150 */     this.gunModel[95] = new ModelRendererTurbo(this, 1353, 17, this.textureX, this.textureY);
/*  151 */     this.gunModel[96] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*  152 */     this.gunModel[97] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[98] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  154 */     this.gunModel[99] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  155 */     this.gunModel[100] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[101] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[102] = new ModelRendererTurbo(this, 1049, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[103] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[104] = new ModelRendererTurbo(this, 569, 33, this.textureX, this.textureY);
/*  160 */     this.gunModel[105] = new ModelRendererTurbo(this, 769, 33, this.textureX, this.textureY);
/*  161 */     this.gunModel[106] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*  162 */     this.gunModel[107] = new ModelRendererTurbo(this, 1689, 33, this.textureX, this.textureY);
/*  163 */     this.gunModel[108] = new ModelRendererTurbo(this, 385, 41, this.textureX, this.textureY);
/*  164 */     this.gunModel[109] = new ModelRendererTurbo(this, 577, 41, this.textureX, this.textureY);
/*  165 */     this.gunModel[110] = new ModelRendererTurbo(this, 961, 41, this.textureX, this.textureY);
/*  166 */     this.gunModel[111] = new ModelRendererTurbo(this, 1345, 41, this.textureX, this.textureY);
/*  167 */     this.gunModel[112] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  168 */     this.gunModel[113] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  169 */     this.gunModel[114] = new ModelRendererTurbo(this, 1993, 17, this.textureX, this.textureY);
/*  170 */     this.gunModel[115] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  171 */     this.gunModel[116] = new ModelRendererTurbo(this, 1089, 1, this.textureX, this.textureY);
/*  172 */     this.gunModel[117] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*  173 */     this.gunModel[118] = new ModelRendererTurbo(this, 841, 9, this.textureX, this.textureY);
/*  174 */     this.gunModel[119] = new ModelRendererTurbo(this, 1513, 9, this.textureX, this.textureY);
/*  175 */     this.gunModel[120] = new ModelRendererTurbo(this, 1201, 17, this.textureX, this.textureY);
/*  176 */     this.gunModel[121] = new ModelRendererTurbo(this, 1065, 1, this.textureX, this.textureY);
/*  177 */     this.gunModel[122] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/*  178 */     this.gunModel[123] = new ModelRendererTurbo(this, 1385, 17, this.textureX, this.textureY);
/*  179 */     this.gunModel[124] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*  180 */     this.gunModel[125] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  181 */     this.gunModel[126] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  182 */     this.gunModel[127] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 569, 49, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 873, 9, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 1953, 1, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 1961, 1, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 1977, 1, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 1993, 1, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 2041, 1, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 1137, 9, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 1817, 9, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 9, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 777, 17, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 1529, 49, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 1729, 49, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 1681, 25, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 1961, 25, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 513, 25, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 1729, 25, this.textureX, this.textureY);
/*  211 */     this.gunModel[''] = new ModelRendererTurbo(this, 1753, 25, this.textureX, this.textureY);
/*  212 */     this.gunModel[''] = new ModelRendererTurbo(this, 2009, 25, this.textureX, this.textureY);
/*  213 */     this.gunModel[''] = new ModelRendererTurbo(this, 1481, 25, this.textureX, this.textureY);
/*  214 */     this.gunModel[''] = new ModelRendererTurbo(this, 2033, 25, this.textureX, this.textureY);
/*  215 */     this.gunModel[' '] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  216 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  217 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*  218 */     this.gunModel['£'] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  219 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  220 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1153, 33, this.textureX, this.textureY);
/*  221 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 1177, 33, this.textureX, this.textureY);
/*  222 */     this.gunModel['§'] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  223 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 1193, 33, this.textureX, this.textureY);
/*  224 */     this.gunModel['©'] = new ModelRendererTurbo(this, 1225, 33, this.textureX, this.textureY);
/*  225 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1257, 33, this.textureX, this.textureY);
/*  226 */     this.gunModel['«'] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*  227 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1481, 33, this.textureX, this.textureY);
/*  228 */     this.gunModel['­'] = new ModelRendererTurbo(this, 1881, 33, this.textureX, this.textureY);
/*  229 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1897, 33, this.textureX, this.textureY);
/*  230 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1913, 33, this.textureX, this.textureY);
/*  231 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1929, 33, this.textureX, this.textureY);
/*  232 */     this.gunModel['±'] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  233 */     this.gunModel['²'] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  234 */     this.gunModel['³'] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  235 */     this.gunModel['´'] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  236 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  237 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  238 */     this.gunModel['·'] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  239 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 1945, 33, this.textureX, this.textureY);
/*  240 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 1977, 33, this.textureX, this.textureY);
/*  241 */     this.gunModel['º'] = new ModelRendererTurbo(this, 2009, 33, this.textureX, this.textureY);
/*  242 */     this.gunModel['»'] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  243 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/*  244 */     this.gunModel['½'] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/*  245 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/*  246 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/*  247 */     this.gunModel['À'] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/*  248 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*  249 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/*  252 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 1537, 41, this.textureX, this.textureY);
/*  253 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 1585, 41, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 1633, 41, this.textureX, this.textureY);
/*  255 */     this.gunModel['È'] = new ModelRendererTurbo(this, 1649, 41, this.textureX, this.textureY);
/*  256 */     this.gunModel['É'] = new ModelRendererTurbo(this, 1665, 41, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 1881, 41, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 1897, 41, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1913, 41, this.textureX, this.textureY);
/*  260 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 1929, 41, this.textureX, this.textureY);
/*  261 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 1945, 41, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 1961, 41, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 769, 49, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 777, 57, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 1993, 41, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 1945, 49, this.textureX, this.textureY);
/*  268 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 2017, 41, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  270 */     this.gunModel['×'] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  271 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 817, 49, this.textureX, this.textureY);
/*  272 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 529, 9, this.textureX, this.textureY);
/*  273 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  274 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 561, 9, this.textureX, this.textureY);
/*  275 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  276 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 905, 9, this.textureX, this.textureY);
/*  277 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1649, 9, this.textureX, this.textureY);
/*  278 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  279 */     this.gunModel['à'] = new ModelRendererTurbo(this, 2033, 41, this.textureX, this.textureY);
/*  280 */     this.gunModel['á'] = new ModelRendererTurbo(this, 593, 9, this.textureX, this.textureY);
/*  281 */     this.gunModel['â'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  282 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 1977, 49, this.textureX, this.textureY);
/*  283 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 969, 57, this.textureX, this.textureY);
/*  284 */     this.gunModel['å'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  285 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  286 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/*  287 */     this.gunModel['è'] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/*  288 */     this.gunModel['é'] = new ModelRendererTurbo(this, 513, 57, this.textureX, this.textureY);
/*  289 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 1185, 57, this.textureX, this.textureY);
/*  290 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1305, 57, this.textureX, this.textureY);
/*  291 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*  292 */     this.gunModel['í'] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  293 */     this.gunModel['î'] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  294 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*  295 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 1361, 57, this.textureX, this.textureY);
/*  296 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1409, 57, this.textureX, this.textureY);
/*  297 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 1449, 57, this.textureX, this.textureY);
/*  298 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 1993, 57, this.textureX, this.textureY);
/*  299 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*  300 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/*  301 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 1497, 57, this.textureX, this.textureY);
/*  302 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  303 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/*  304 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/*  305 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  306 */     this.gunModel['û'] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/*  307 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 577, 65, this.textureX, this.textureY);
/*  308 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 1937, 49, this.textureX, this.textureY);
/*  309 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 1353, 57, this.textureX, this.textureY);
/*  310 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1409, 17, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 609, 65, this.textureX, this.textureY);
/*  312 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 945, 49, this.textureX, this.textureY);
/*  314 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 1561, 1, this.textureX, this.textureY);
/*  315 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 1697, 1, this.textureX, this.textureY);
/*  316 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1161, 17, this.textureX, this.textureY);
/*  318 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 641, 65, this.textureX, this.textureY);
/*  319 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 1297, 57, this.textureX, this.textureY);
/*  320 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 665, 65, this.textureX, this.textureY);
/*  321 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 689, 65, this.textureX, this.textureY);
/*  322 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 713, 65, this.textureX, this.textureY);
/*  323 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  324 */     this.gunModel['č'] = new ModelRendererTurbo(this, 545, 9, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 649, 1, this.textureX, this.textureY);
/*  326 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 577, 9, this.textureX, this.textureY);
/*  327 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 609, 9, this.textureX, this.textureY);
/*  328 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 737, 65, this.textureX, this.textureY);
/*  330 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 633, 9, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 649, 9, this.textureX, this.textureY);
/*  332 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 673, 9, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 761, 65, this.textureX, this.textureY);
/*  334 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 897, 65, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 1457, 65, this.textureX, this.textureY);
/*  336 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 1521, 65, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/*  338 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 1561, 65, this.textureX, this.textureY);
/*  340 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 625, 65, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 673, 65, this.textureX, this.textureY);
/*  342 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 1593, 65, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 697, 65, this.textureX, this.textureY);
/*  344 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 1625, 65, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1169, 65, this.textureX, this.textureY);
/*  346 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1657, 65, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1289, 65, this.textureX, this.textureY);
/*  348 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 1689, 65, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 1721, 65, this.textureX, this.textureY);
/*  350 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 1745, 65, this.textureX, this.textureY);
/*  351 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1777, 65, this.textureX, this.textureY);
/*  352 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 1801, 65, this.textureX, this.textureY);
/*  353 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 1833, 65, this.textureX, this.textureY);
/*  354 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 1857, 65, this.textureX, this.textureY);
/*  355 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 1889, 65, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 1913, 65, this.textureX, this.textureY);
/*  357 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 1945, 65, this.textureX, this.textureY);
/*  358 */     this.gunModel['į'] = new ModelRendererTurbo(this, 1969, 65, this.textureX, this.textureY);
/*  359 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 2001, 65, this.textureX, this.textureY);
/*  360 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/*  362 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/*  364 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 753, 33, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/*  366 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 561, 65, this.textureX, this.textureY);
/*  367 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 177, 73, this.textureX, this.textureY);
/*  369 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/*  371 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/*  373 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 577, 73, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 713, 73, this.textureX, this.textureY);
/*  375 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 2025, 65, this.textureX, this.textureY);
/*  377 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 641, 73, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 769, 73, this.textureX, this.textureY);
/*  379 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 801, 73, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 833, 73, this.textureX, this.textureY);
/*  381 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 865, 73, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 897, 73, this.textureX, this.textureY);
/*  383 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 929, 73, this.textureX, this.textureY);
/*  384 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 961, 73, this.textureX, this.textureY);
/*  385 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 1001, 73, this.textureX, this.textureY);
/*  386 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 1041, 73, this.textureX, this.textureY);
/*  388 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 1065, 73, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 1089, 73, this.textureX, this.textureY);
/*  390 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 1113, 73, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 1185, 73, this.textureX, this.textureY);
/*  392 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 1137, 73, this.textureX, this.textureY);
/*  393 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 1257, 73, this.textureX, this.textureY);
/*  394 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 1305, 73, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 1353, 73, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 1385, 73, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 545, 57, this.textureX, this.textureY);
/*  398 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 1257, 57, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 1553, 65, this.textureX, this.textureY);
/*  400 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 1585, 65, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 1617, 65, this.textureX, this.textureY);
/*  402 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 1649, 65, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 1409, 73, this.textureX, this.textureY);
/*  404 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 1441, 73, this.textureX, this.textureY);
/*  406 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 1473, 73, this.textureX, this.textureY);
/*  407 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 1497, 73, this.textureX, this.textureY);
/*  408 */     this.gunModel['š'] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/*  410 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 513, 81, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 537, 81, this.textureX, this.textureY);
/*  412 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 609, 81, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 753, 73, this.textureX, this.textureY);
/*  414 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 665, 81, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 1153, 81, this.textureX, this.textureY);
/*  416 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 1225, 81, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 1553, 81, this.textureX, this.textureY);
/*  418 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 1609, 81, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1273, 81, this.textureX, this.textureY);
/*  420 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 1649, 81, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 1681, 81, this.textureX, this.textureY);
/*  422 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 1713, 81, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 985, 73, this.textureX, this.textureY);
/*  424 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 1681, 65, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 1025, 81, this.textureX, this.textureY);
/*  426 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 1369, 81, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 881, 89, this.textureX, this.textureY);
/*  428 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 905, 89, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 929, 89, this.textureX, this.textureY);
/*  430 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/*  431 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 953, 89, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 1593, 81, this.textureX, this.textureY);
/*  433 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 993, 89, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 1041, 89, this.textureX, this.textureY);
/*  435 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 1081, 89, this.textureX, this.textureY);
/*  436 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 1121, 89, this.textureX, this.textureY);
/*  437 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 1177, 89, this.textureX, this.textureY);
/*  438 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 1249, 89, this.textureX, this.textureY);
/*  439 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 1345, 89, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 1385, 89, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 1201, 89, this.textureX, this.textureY);
/*  442 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 1417, 89, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 1457, 89, this.textureX, this.textureY);
/*  444 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 1489, 89, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 1521, 89, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 1225, 65, this.textureX, this.textureY);
/*  447 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 249, 97, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/*  452 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 545, 97, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 2017, 65, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 1065, 89, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 601, 97, this.textureX, this.textureY);
/*  458 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 633, 97, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 657, 97, this.textureX, this.textureY);
/*  460 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 793, 73, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 825, 73, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  463 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 689, 97, this.textureX, this.textureY);
/*  464 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 857, 73, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 889, 73, this.textureX, this.textureY);
/*  466 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 921, 73, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 713, 97, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 1441, 89, this.textureX, this.textureY);
/*  469 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 737, 97, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 1025, 97, this.textureX, this.textureY);
/*  472 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 1105, 97, this.textureX, this.textureY);
/*  473 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 953, 73, this.textureX, this.textureY);
/*  474 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1433, 73, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 1401, 73, this.textureX, this.textureY);
/*  476 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 1641, 81, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 897, 25, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 1057, 73, this.textureX, this.textureY);
/*  479 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 1081, 73, this.textureX, this.textureY);
/*  480 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 1105, 73, this.textureX, this.textureY);
/*  481 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 1289, 97, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 529, 97, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 1673, 81, this.textureX, this.textureY);
/*  484 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 1705, 81, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 1217, 33, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 1409, 89, this.textureX, this.textureY);
/*  487 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 513, 73, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 1321, 97, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 617, 97, this.textureX, this.textureY);
/*  490 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 913, 9, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 985, 9, this.textureX, this.textureY);
/*  492 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  493 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*  494 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*  495 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  496 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 1145, 97, this.textureX, this.textureY);
/*  497 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 1545, 97, this.textureX, this.textureY);
/*  498 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 1593, 97, this.textureX, this.textureY);
/*  499 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 1865, 97, this.textureX, this.textureY);
/*  500 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 873, 105, this.textureX, this.textureY);
/*  501 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 1345, 105, this.textureX, this.textureY);
/*  502 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 1129, 73, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 985, 89, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 1641, 97, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 1345, 73, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 1481, 89, this.textureX, this.textureY);
/*  507 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 1513, 89, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 1153, 73, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 1665, 97, this.textureX, this.textureY);
/*  510 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 1225, 97, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 1705, 97, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/*  513 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/*  514 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 217, 105, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/*  518 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/*  519 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 577, 105, this.textureX, this.textureY);
/*  520 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 753, 105, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 785, 105, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 817, 105, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 1041, 105, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 1073, 105, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 1121, 105, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 1185, 105, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 1249, 105, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 1465, 105, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 1497, 105, this.textureX, this.textureY);
/*  530 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 1729, 105, this.textureX, this.textureY);
/*  531 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 1761, 105, this.textureX, this.textureY);
/*  532 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 1793, 105, this.textureX, this.textureY);
/*  533 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/*  534 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  535 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 1465, 73, this.textureX, this.textureY);
/*  536 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 561, 97, this.textureX, this.textureY);
/*  537 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 2025, 97, this.textureX, this.textureY);
/*  538 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 1833, 105, this.textureX, this.textureY);
/*  539 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 1577, 97, this.textureX, this.textureY);
/*  540 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/*  541 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  542 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 1009, 105, this.textureX, this.textureY);
/*  543 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 1529, 105, this.textureX, this.textureY);
/*  544 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/*  545 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 1049, 9, this.textureX, this.textureY);
/*  546 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  547 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 2001, 105, this.textureX, this.textureY);
/*  548 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/*  549 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 241, 113, this.textureX, this.textureY);
/*  550 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 601, 113, this.textureX, this.textureY);
/*  551 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  552 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 1537, 113, this.textureX, this.textureY);
/*  553 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 1857, 113, this.textureX, this.textureY);
/*  554 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/*      */     
/*  556 */     this.gunModel[0].addShapeBox(39.0F, -13.0F, -6.0F, 25, 13, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  557 */     this.gunModel[0].setRotationPoint(-45.0F, -19.5F, 0.5F);
/*      */     
/*  559 */     this.gunModel[1].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/*  560 */     this.gunModel[1].setRotationPoint(-20.0F, -6.75F, 0.5F);
/*      */     
/*  562 */     this.gunModel[2].addShapeBox(39.0F, -13.0F, -6.0F, 22, 21, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  563 */     this.gunModel[2].setRotationPoint(-15.0F, -19.5F, 0.0F);
/*      */     
/*  565 */     this.gunModel[3].addShapeBox(39.0F, -13.0F, -6.0F, 64, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[3].setRotationPoint(-53.0F, -27.0F, 3.5F);
/*      */     
/*  568 */     this.gunModel[4].addShapeBox(39.0F, -13.0F, -6.0F, 1, 16, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F);
/*  569 */     this.gunModel[4].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  571 */     this.gunModel[5].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  572 */     this.gunModel[5].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  574 */     this.gunModel[6].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, -0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[6].setRotationPoint(8.0F, -15.5F, 0.0F);
/*      */     
/*  577 */     this.gunModel[7].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[7].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  580 */     this.gunModel[8].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[8].setRotationPoint(7.5F, -15.5F, 0.0F);
/*      */     
/*  583 */     this.gunModel[9].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  584 */     this.gunModel[9].setRotationPoint(7.5F, -16.0F, 0.0F);
/*      */     
/*  586 */     this.gunModel[10].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  587 */     this.gunModel[10].setRotationPoint(11.5F, -16.0F, 0.0F);
/*      */     
/*  589 */     this.gunModel[11].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  590 */     this.gunModel[11].setRotationPoint(11.5F, -15.5F, 0.0F);
/*      */     
/*  592 */     this.gunModel[12].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[12].setRotationPoint(7.5F, -17.0F, 0.0F);
/*      */     
/*  595 */     this.gunModel[13].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[13].setRotationPoint(7.5F, -18.0F, 0.0F);
/*      */     
/*  598 */     this.gunModel[14].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  599 */     this.gunModel[14].setRotationPoint(11.5F, -18.0F, 0.0F);
/*      */     
/*  601 */     this.gunModel[15].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  602 */     this.gunModel[15].setRotationPoint(11.5F, -18.5F, 0.0F);
/*      */     
/*  604 */     this.gunModel[16].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[16].setRotationPoint(9.0F, -19.0F, 0.0F);
/*      */     
/*  607 */     this.gunModel[17].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 12, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  608 */     this.gunModel[17].setRotationPoint(7.0F, -19.0F, 0.0F);
/*      */     
/*  610 */     this.gunModel[18].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 13, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  611 */     this.gunModel[18].setRotationPoint(9.5F, -17.0F, -0.5F);
/*      */     
/*  613 */     this.gunModel[19].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 13, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  614 */     this.gunModel[19].setRotationPoint(9.5F, -17.5F, -0.5F);
/*      */     
/*  616 */     this.gunModel[20].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 13, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/*  617 */     this.gunModel[20].setRotationPoint(9.5F, -16.5F, -0.5F);
/*      */     
/*  619 */     this.gunModel[21].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, 0.0F, 0.5F, 0.0F);
/*  620 */     this.gunModel[21].setRotationPoint(7.5F, 0.0F, 0.0F);
/*      */     
/*  622 */     this.gunModel[22].addShapeBox(39.0F, -13.0F, -6.0F, 5, 9, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[22].setRotationPoint(-20.0F, -19.5F, 0.0F);
/*      */     
/*  625 */     this.gunModel[23].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  626 */     this.gunModel[23].setRotationPoint(-20.0F, -10.5F, 0.0F);
/*      */     
/*  628 */     this.gunModel[24].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  629 */     this.gunModel[24].setRotationPoint(-20.0F, -9.5F, 0.0F);
/*      */     
/*  631 */     this.gunModel[25].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 12, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F);
/*  632 */     this.gunModel[25].setRotationPoint(-17.0F, -9.0F, 0.0F);
/*      */     
/*  634 */     this.gunModel[26].addShapeBox(39.0F, -13.0F, -6.0F, 5, 12, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  635 */     this.gunModel[26].setRotationPoint(-20.0F, -18.5F, 0.5F);
/*      */     
/*  637 */     this.gunModel[27].addShapeBox(39.0F, -13.0F, -6.0F, 22, 1, 14, 0.0F, 0.0F, -1.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 1.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 1.5F, 0.5F);
/*  638 */     this.gunModel[27].setRotationPoint(-15.0F, 1.5F, -1.0F);
/*      */     
/*  640 */     this.gunModel[28].addShapeBox(39.0F, -13.0F, -6.0F, 22, 1, 15, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  641 */     this.gunModel[28].setRotationPoint(-15.0F, 2.5F, -1.5F);
/*      */     
/*  643 */     this.gunModel[29].addShapeBox(39.0F, -13.0F, -6.0F, 25, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  644 */     this.gunModel[29].setRotationPoint(-45.0F, -21.25F, 0.5F);
/*      */     
/*  646 */     this.gunModel[30].addShapeBox(39.0F, -13.0F, -6.0F, 28, 3, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  647 */     this.gunModel[30].setRotationPoint(-20.0F, -22.5F, 4.0F);
/*      */     
/*  649 */     this.gunModel[31].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 8, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  650 */     this.gunModel[31].setRotationPoint(8.0F, -22.5F, 4.0F);
/*      */     
/*  652 */     this.gunModel[32].addShapeBox(39.0F, -13.0F, -6.0F, 65, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/*  653 */     this.gunModel[32].setRotationPoint(-53.0F, -24.0F, 11.5F);
/*      */     
/*  655 */     this.gunModel[33].addShapeBox(39.0F, -13.0F, -6.0F, 65, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/*  656 */     this.gunModel[33].setRotationPoint(-53.0F, -30.0F, 10.5F);
/*      */     
/*  658 */     this.gunModel[34].addShapeBox(39.0F, -13.0F, -6.0F, 65, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  659 */     this.gunModel[34].setRotationPoint(-53.0F, -27.0F, 11.5F);
/*      */     
/*  661 */     this.gunModel[35].addShapeBox(39.0F, -13.0F, -6.0F, 55, 3, 9, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F);
/*  662 */     this.gunModel[35].setRotationPoint(-43.0F, -32.75F, 1.5F);
/*      */     
/*  664 */     this.gunModel[36].addShapeBox(39.0F, -13.0F, -6.0F, 35, 2, 11, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/*  665 */     this.gunModel[36].setRotationPoint(-54.0F, -20.25F, 0.5F);
/*      */     
/*  667 */     this.gunModel[37].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 15, 0.0F, -0.5F, -1.5F, 0.0F, 0.5F, -1.25F, -1.0F, 0.5F, -1.25F, -1.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.5F, 0.0F, 0.5F, 1.25F, -1.0F, 0.5F, 1.25F, -1.0F, -0.5F, 1.5F, 0.0F);
/*  668 */     this.gunModel[37].setRotationPoint(7.0F, 1.0F, -1.5F);
/*      */     
/*  670 */     this.gunModel[38].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 14, 0.0F, -0.5F, -1.5F, -1.0F, 0.5F, -1.25F, -2.0F, 0.5F, -1.25F, -2.0F, -0.5F, -1.5F, -1.0F, -0.5F, 1.5F, 0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, -0.5F, 1.5F, 0.5F);
/*  671 */     this.gunModel[38].setRotationPoint(7.0F, 0.0F, -1.0F);
/*      */     
/*  673 */     this.gunModel[39].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -1.5F, 0.5F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, -0.5F, -1.5F, 0.5F, -0.5F, 1.5F, 0.5F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, -0.5F, 1.5F, 0.5F);
/*  674 */     this.gunModel[39].setRotationPoint(9.0F, 0.75F, 0.0F);
/*      */     
/*  676 */     this.gunModel[40].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -1.5F, -1.0F, 0.0F, -2.25F, -1.0F, 0.0F, -2.25F, -1.0F, -0.5F, -1.5F, -1.0F, -0.5F, 1.5F, 0.5F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, -0.5F, 1.5F, 0.5F);
/*  677 */     this.gunModel[40].setRotationPoint(9.0F, -0.25F, 0.0F);
/*      */     
/*  679 */     this.gunModel[41].addShapeBox(39.0F, -13.0F, -6.0F, 56, 3, 10, 0.0F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F);
/*  680 */     this.gunModel[41].setRotationPoint(-44.0F, -34.75F, 1.0F);
/*      */     
/*  682 */     this.gunModel[42].addShapeBox(39.0F, -13.0F, -6.0F, 55, 2, 7, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/*  683 */     this.gunModel[42].setRotationPoint(-43.0F, -35.75F, 2.5F);
/*      */     
/*  685 */     this.gunModel[43].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  686 */     this.gunModel[43].setRotationPoint(8.0F, -21.25F, 0.5F);
/*      */     
/*  688 */     this.gunModel[44].addShapeBox(39.0F, -13.0F, -6.0F, 65, 3, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  689 */     this.gunModel[44].setRotationPoint(-53.0F, -29.75F, 1.5F);
/*      */     
/*  691 */     this.gunModel[45].addShapeBox(39.0F, -13.0F, -6.0F, 33, 3, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  692 */     this.gunModel[45].setRotationPoint(-53.0F, -24.0F, -0.5F);
/*      */     
/*  694 */     this.gunModel[46].addShapeBox(39.0F, -13.0F, -6.0F, 33, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  695 */     this.gunModel[46].setRotationPoint(-53.0F, -27.0F, -1.5F);
/*      */     
/*  697 */     this.gunModel[47].addShapeBox(39.0F, -13.0F, -6.0F, 53, 1, 7, 0.0F, 0.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.5F, -0.5F, 1.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/*  698 */     this.gunModel[47].setRotationPoint(-40.0F, -37.0F, 2.5F);
/*      */     
/*  700 */     this.gunModel[48].addShapeBox(39.0F, -13.0F, -6.0F, 51, 1, 7, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.5F, -0.5F, 1.25F);
/*  701 */     this.gunModel[48].setRotationPoint(-38.0F, -37.5F, 2.5F);
/*      */     
/*  703 */     this.gunModel[49].addShapeBox(39.0F, -13.0F, -6.0F, 53, 1, 9, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F);
/*  704 */     this.gunModel[49].setRotationPoint(-40.0F, -37.0F, 1.5F);
/*      */     
/*  706 */     this.gunModel[50].addShapeBox(39.0F, -13.0F, -6.0F, 92, 3, 1, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  707 */     this.gunModel[50].setRotationPoint(12.0F, -32.75F, 1.0F);
/*      */     
/*  709 */     this.gunModel[51].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 4, 0.0F, -0.25F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.25F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F);
/*  710 */     this.gunModel[51].setRotationPoint(12.0F, -33.75F, -0.5F);
/*      */     
/*  712 */     this.gunModel[52].addShapeBox(39.0F, -13.0F, -6.0F, 90, 2, 7, 0.0F, -0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F);
/*  713 */     this.gunModel[52].setRotationPoint(12.0F, -35.75F, 2.5F);
/*      */     
/*  715 */     this.gunModel[53].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 7, 0.0F, -0.5F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F);
/*  716 */     this.gunModel[53].setRotationPoint(102.0F, -35.75F, 2.5F);
/*      */     
/*  718 */     this.gunModel[54].addShapeBox(39.0F, -13.0F, -6.0F, 89, 1, 7, 0.0F, 0.0F, -0.5F, 1.25F, -1.0F, -0.5F, 1.25F, -1.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  719 */     this.gunModel[54].setRotationPoint(13.0F, -37.0F, 2.5F);
/*      */     
/*  721 */     this.gunModel[55].addShapeBox(39.0F, -13.0F, -6.0F, 88, 1, 7, 0.0F, 0.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 1.25F, -3.0F, -0.5F, 1.25F, -3.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F);
/*  722 */     this.gunModel[55].setRotationPoint(13.0F, -37.5F, 2.5F);
/*      */     
/*  724 */     this.gunModel[56].addShapeBox(39.0F, -13.0F, -6.0F, 89, 1, 9, 0.0F, 0.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  725 */     this.gunModel[56].setRotationPoint(13.0F, -37.0F, 1.5F);
/*      */     
/*  727 */     this.gunModel[57].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  728 */     this.gunModel[57].setRotationPoint(12.0F, -29.0F, -3.5F);
/*      */     
/*  730 */     this.gunModel[58].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  731 */     this.gunModel[58].setRotationPoint(37.0F, -29.0F, -3.5F);
/*      */     
/*  733 */     this.gunModel[59].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  734 */     this.gunModel[59].setRotationPoint(54.0F, -29.0F, -3.5F);
/*      */     
/*  736 */     this.gunModel[60].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  737 */     this.gunModel[60].setRotationPoint(72.0F, -29.0F, -3.5F);
/*      */     
/*  739 */     this.gunModel[61].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  740 */     this.gunModel[61].setRotationPoint(89.0F, -29.0F, -3.5F);
/*      */     
/*  742 */     this.gunModel[62].addShapeBox(39.0F, -13.0F, -6.0F, 6, 2, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  743 */     this.gunModel[62].setRotationPoint(31.0F, -28.0F, -3.0F);
/*      */     
/*  745 */     this.gunModel[63].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  746 */     this.gunModel[63].setRotationPoint(31.0F, -29.0F, -3.5F);
/*      */     
/*  748 */     this.gunModel[64].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/*  749 */     this.gunModel[64].setRotationPoint(36.25F, -29.0F, -3.5F);
/*      */     
/*  751 */     this.gunModel[65].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  752 */     this.gunModel[65].setRotationPoint(12.0F, -30.0F, 11.5F);
/*      */     
/*  754 */     this.gunModel[66].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  755 */     this.gunModel[66].setRotationPoint(12.0F, -29.0F, 12.5F);
/*      */     
/*  757 */     this.gunModel[67].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  758 */     this.gunModel[67].setRotationPoint(37.0F, -30.0F, 11.5F);
/*      */     
/*  760 */     this.gunModel[68].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  761 */     this.gunModel[68].setRotationPoint(37.0F, -29.0F, 12.5F);
/*      */     
/*  763 */     this.gunModel[69].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  764 */     this.gunModel[69].setRotationPoint(31.0F, -30.0F, 11.0F);
/*      */     
/*  766 */     this.gunModel[70].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  767 */     this.gunModel[70].setRotationPoint(31.0F, -28.0F, 12.5F);
/*      */     
/*  769 */     this.gunModel[71].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  770 */     this.gunModel[71].setRotationPoint(31.0F, -29.0F, 12.5F);
/*      */     
/*  772 */     this.gunModel[72].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  773 */     this.gunModel[72].setRotationPoint(36.25F, -29.0F, 12.5F);
/*      */     
/*  775 */     this.gunModel[73].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  776 */     this.gunModel[73].setRotationPoint(54.0F, -30.0F, 11.5F);
/*      */     
/*  778 */     this.gunModel[74].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  779 */     this.gunModel[74].setRotationPoint(54.0F, -29.0F, 12.5F);
/*      */     
/*  781 */     this.gunModel[75].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  782 */     this.gunModel[75].setRotationPoint(72.0F, -30.0F, 11.5F);
/*      */     
/*  784 */     this.gunModel[76].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  785 */     this.gunModel[76].setRotationPoint(72.0F, -29.0F, 12.5F);
/*      */     
/*  787 */     this.gunModel[77].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  788 */     this.gunModel[77].setRotationPoint(89.0F, -30.0F, 11.5F);
/*      */     
/*  790 */     this.gunModel[78].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  791 */     this.gunModel[78].setRotationPoint(89.0F, -29.0F, 12.5F);
/*      */     
/*  793 */     this.gunModel[79].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  794 */     this.gunModel[79].setRotationPoint(31.0F, -28.0F, 12.0F);
/*      */     
/*  796 */     this.gunModel[80].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  797 */     this.gunModel[80].setRotationPoint(43.0F, -28.0F, 12.5F);
/*      */     
/*  799 */     this.gunModel[81].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  800 */     this.gunModel[81].setRotationPoint(43.0F, -28.0F, 12.0F);
/*      */     
/*  802 */     this.gunModel[82].addShapeBox(39.0F, -13.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  803 */     this.gunModel[82].setRotationPoint(60.0F, -28.0F, 12.5F);
/*      */     
/*  805 */     this.gunModel[83].addShapeBox(39.0F, -13.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  806 */     this.gunModel[83].setRotationPoint(60.0F, -28.0F, 12.0F);
/*      */     
/*  808 */     this.gunModel[84].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  809 */     this.gunModel[84].setRotationPoint(78.0F, -28.0F, 12.5F);
/*      */     
/*  811 */     this.gunModel[85].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  812 */     this.gunModel[85].setRotationPoint(78.0F, -28.0F, 12.0F);
/*      */     
/*  814 */     this.gunModel[86].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  815 */     this.gunModel[86].setRotationPoint(43.0F, -29.0F, 12.5F);
/*      */     
/*  817 */     this.gunModel[87].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  818 */     this.gunModel[87].setRotationPoint(53.25F, -29.0F, 12.5F);
/*      */     
/*  820 */     this.gunModel[88].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  821 */     this.gunModel[88].setRotationPoint(78.0F, -29.0F, 12.5F);
/*      */     
/*  823 */     this.gunModel[89].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  824 */     this.gunModel[89].setRotationPoint(88.25F, -29.0F, 12.5F);
/*      */     
/*  826 */     this.gunModel[90].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  827 */     this.gunModel[90].setRotationPoint(60.0F, -29.0F, 12.5F);
/*      */     
/*  829 */     this.gunModel[91].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  830 */     this.gunModel[91].setRotationPoint(71.25F, -29.0F, 12.5F);
/*      */     
/*  832 */     this.gunModel[92].addShapeBox(39.0F, -13.0F, -6.0F, 92, 3, 1, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  833 */     this.gunModel[92].setRotationPoint(12.0F, -32.75F, 10.0F);
/*      */     
/*  835 */     this.gunModel[93].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  836 */     this.gunModel[93].setRotationPoint(78.0F, -29.0F, 12.5F);
/*      */     
/*  838 */     this.gunModel[94].addShapeBox(39.0F, -13.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  839 */     this.gunModel[94].setRotationPoint(60.0F, -29.0F, 12.5F);
/*      */     
/*  841 */     this.gunModel[95].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  842 */     this.gunModel[95].setRotationPoint(43.0F, -29.0F, 12.5F);
/*      */     
/*  844 */     this.gunModel[96].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  845 */     this.gunModel[96].setRotationPoint(31.0F, -22.25F, 12.5F);
/*      */     
/*  847 */     this.gunModel[97].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  848 */     this.gunModel[97].setRotationPoint(36.25F, -30.0F, 11.0F);
/*      */     
/*  850 */     this.gunModel[98].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  851 */     this.gunModel[98].setRotationPoint(43.0F, -30.0F, 11.0F);
/*      */     
/*  853 */     this.gunModel[99].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  854 */     this.gunModel[99].setRotationPoint(53.25F, -30.0F, 11.0F);
/*      */     
/*  856 */     this.gunModel[100].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  857 */     this.gunModel[100].setRotationPoint(60.0F, -30.0F, 11.0F);
/*      */     
/*  859 */     this.gunModel[101].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  860 */     this.gunModel[101].setRotationPoint(71.25F, -30.0F, 11.0F);
/*      */     
/*  862 */     this.gunModel[102].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  863 */     this.gunModel[102].setRotationPoint(78.0F, -30.0F, 11.0F);
/*      */     
/*  865 */     this.gunModel[103].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  866 */     this.gunModel[103].setRotationPoint(88.25F, -30.0F, 11.0F);
/*      */     
/*  868 */     this.gunModel[104].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 4, 0.0F, -0.25F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -0.75F, -1.5F, -0.25F, -0.75F, -1.5F, -0.25F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F);
/*  869 */     this.gunModel[104].setRotationPoint(12.0F, -33.75F, 8.5F);
/*      */     
/*  871 */     this.gunModel[105].addShapeBox(39.0F, -13.0F, -6.0F, 94, 9, 1, 0.0F, -0.25F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  872 */     this.gunModel[105].setRotationPoint(11.0F, -28.5F, 14.5F);
/*      */     
/*  874 */     this.gunModel[106].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  875 */     this.gunModel[106].setRotationPoint(12.0F, -26.0F, 14.0F);
/*      */     
/*  877 */     this.gunModel[107].addShapeBox(39.0F, -13.0F, -6.0F, 94, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, -1.75F, -0.5F, -0.25F, -1.75F, -0.5F);
/*  878 */     this.gunModel[107].setRotationPoint(11.0F, -28.5F, 16.0F);
/*      */     
/*  880 */     this.gunModel[108].addShapeBox(39.0F, -13.0F, -6.0F, 94, 9, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  881 */     this.gunModel[108].setRotationPoint(11.0F, -28.5F, 15.0F);
/*      */     
/*  883 */     this.gunModel[109].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  884 */     this.gunModel[109].setRotationPoint(12.0F, -24.25F, 14.0F);
/*      */     
/*  886 */     this.gunModel[110].addShapeBox(39.0F, -13.0F, -6.0F, 94, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, -0.5F, -0.25F, -1.75F, -0.5F);
/*  887 */     this.gunModel[110].setRotationPoint(11.0F, -28.5F, -3.5F);
/*      */     
/*  889 */     this.gunModel[111].addShapeBox(39.0F, -13.0F, -6.0F, 94, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F);
/*  890 */     this.gunModel[111].setRotationPoint(11.0F, -28.5F, -4.0F);
/*      */     
/*  892 */     this.gunModel[112].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  893 */     this.gunModel[112].setRotationPoint(12.0F, -26.0F, -3.0F);
/*      */     
/*  895 */     this.gunModel[113].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  896 */     this.gunModel[113].setRotationPoint(12.0F, -24.25F, -3.0F);
/*      */     
/*  898 */     this.gunModel[114].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  899 */     this.gunModel[114].setRotationPoint(12.0F, -21.25F, 11.5F);
/*      */     
/*  901 */     this.gunModel[115].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  902 */     this.gunModel[115].setRotationPoint(12.0F, -22.25F, 12.5F);
/*      */     
/*  904 */     this.gunModel[116].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  905 */     this.gunModel[116].setRotationPoint(37.0F, -21.25F, 11.5F);
/*      */     
/*  907 */     this.gunModel[117].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  908 */     this.gunModel[117].setRotationPoint(37.0F, -22.25F, 12.5F);
/*      */     
/*  910 */     this.gunModel[118].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  911 */     this.gunModel[118].setRotationPoint(31.0F, -21.25F, 14.5F);
/*      */     
/*  913 */     this.gunModel[119].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  914 */     this.gunModel[119].setRotationPoint(54.0F, -21.25F, 11.5F);
/*      */     
/*  916 */     this.gunModel[120].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  917 */     this.gunModel[120].setRotationPoint(54.0F, -22.25F, 12.5F);
/*      */     
/*  919 */     this.gunModel[121].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  920 */     this.gunModel[121].setRotationPoint(72.0F, -21.25F, 11.5F);
/*      */     
/*  922 */     this.gunModel[122].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  923 */     this.gunModel[122].setRotationPoint(72.0F, -22.25F, 12.5F);
/*      */     
/*  925 */     this.gunModel[123].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  926 */     this.gunModel[123].setRotationPoint(43.0F, -21.25F, 12.5F);
/*      */     
/*  928 */     this.gunModel[124].addShapeBox(39.0F, -13.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  929 */     this.gunModel[124].setRotationPoint(60.0F, -21.25F, 12.5F);
/*      */     
/*  931 */     this.gunModel[125].addShapeBox(39.0F, -13.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  932 */     this.gunModel[125].setRotationPoint(60.0F, -22.25F, 14.5F);
/*      */     
/*  934 */     this.gunModel[126].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  935 */     this.gunModel[126].setRotationPoint(43.0F, -22.25F, 14.5F);
/*      */     
/*  937 */     this.gunModel[127].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  938 */     this.gunModel[127].setRotationPoint(31.0F, -22.25F, 14.5F);
/*      */     
/*  940 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 10, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  941 */     this.gunModel[''].setRotationPoint(12.0F, -18.25F, 1.0F);
/*      */     
/*  943 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  944 */     this.gunModel[''].setRotationPoint(31.0F, -21.25F, 12.5F);
/*      */     
/*  946 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  947 */     this.gunModel[''].setRotationPoint(31.0F, -20.25F, 12.5F);
/*      */     
/*  949 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  950 */     this.gunModel[''].setRotationPoint(36.25F, -20.25F, 12.5F);
/*      */     
/*  952 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  953 */     this.gunModel[''].setRotationPoint(31.0F, -19.25F, 11.0F);
/*      */     
/*  955 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  956 */     this.gunModel[''].setRotationPoint(36.25F, -19.25F, 11.0F);
/*      */     
/*  958 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  959 */     this.gunModel[''].setRotationPoint(43.0F, -20.25F, 12.5F);
/*      */     
/*  961 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  962 */     this.gunModel[''].setRotationPoint(53.25F, -20.25F, 12.5F);
/*      */     
/*  964 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  965 */     this.gunModel[''].setRotationPoint(43.0F, -19.25F, 11.0F);
/*      */     
/*  967 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  968 */     this.gunModel[''].setRotationPoint(53.25F, -19.25F, 11.0F);
/*      */     
/*  970 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  971 */     this.gunModel[''].setRotationPoint(79.0F, -21.25F, 11.5F);
/*      */     
/*  973 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  974 */     this.gunModel[''].setRotationPoint(79.0F, -22.25F, 12.5F);
/*      */     
/*  976 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  977 */     this.gunModel[''].setRotationPoint(60.0F, -20.25F, 12.5F);
/*      */     
/*  979 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  980 */     this.gunModel[''].setRotationPoint(71.25F, -20.25F, 12.5F);
/*      */     
/*  982 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  983 */     this.gunModel[''].setRotationPoint(60.0F, -19.25F, 11.0F);
/*      */     
/*  985 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  986 */     this.gunModel[''].setRotationPoint(71.25F, -19.25F, 11.0F);
/*      */     
/*  988 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  989 */     this.gunModel[''].setRotationPoint(75.0F, -20.25F, 12.5F);
/*      */     
/*  991 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  992 */     this.gunModel[''].setRotationPoint(78.25F, -20.25F, 12.5F);
/*      */     
/*  994 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  995 */     this.gunModel[''].setRotationPoint(75.0F, -19.25F, 11.0F);
/*      */     
/*  997 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  998 */     this.gunModel[''].setRotationPoint(78.25F, -19.25F, 11.0F);
/*      */     
/* 1000 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/* 1001 */     this.gunModel[''].setRotationPoint(75.0F, -21.25F, 12.5F);
/*      */     
/* 1003 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 10, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 1.0F, -0.75F, -0.5F, 1.0F, -0.75F, -0.5F, 1.0F, -0.25F, -0.5F, 1.0F);
/* 1004 */     this.gunModel[''].setRotationPoint(12.0F, -17.25F, 1.0F);
/*      */     
/* 1006 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 92, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1007 */     this.gunModel[''].setRotationPoint(12.0F, -16.75F, 0.0F);
/*      */     
/* 1009 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 91, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F);
/* 1010 */     this.gunModel[''].setRotationPoint(12.0F, -16.25F, 0.0F);
/*      */     
/* 1012 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1013 */     this.gunModel[''].setRotationPoint(12.0F, -21.25F, -1.5F);
/*      */     
/* 1015 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1016 */     this.gunModel[''].setRotationPoint(12.0F, -22.25F, -3.5F);
/*      */     
/* 1018 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1019 */     this.gunModel[''].setRotationPoint(37.0F, -21.25F, -1.5F);
/*      */     
/* 1021 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1022 */     this.gunModel[''].setRotationPoint(37.0F, -22.25F, -3.5F);
/*      */     
/* 1024 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1025 */     this.gunModel[''].setRotationPoint(54.0F, -21.25F, -1.5F);
/*      */     
/* 1027 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1028 */     this.gunModel[''].setRotationPoint(54.0F, -22.25F, -3.5F);
/*      */     
/* 1030 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1031 */     this.gunModel[''].setRotationPoint(72.0F, -21.25F, -1.5F);
/*      */     
/* 1033 */     this.gunModel[''].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1034 */     this.gunModel[''].setRotationPoint(72.0F, -22.25F, -3.5F);
/*      */     
/* 1036 */     this.gunModel[' '].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1037 */     this.gunModel[' '].setRotationPoint(79.0F, -21.25F, -1.5F);
/*      */     
/* 1039 */     this.gunModel['¡'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1040 */     this.gunModel['¡'].setRotationPoint(79.0F, -22.25F, -3.5F);
/*      */     
/* 1042 */     this.gunModel['¢'].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1043 */     this.gunModel['¢'].setRotationPoint(12.0F, -30.0F, -1.5F);
/*      */     
/* 1045 */     this.gunModel['£'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1046 */     this.gunModel['£'].setRotationPoint(37.0F, -30.0F, -1.5F);
/*      */     
/* 1048 */     this.gunModel['¤'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1049 */     this.gunModel['¤'].setRotationPoint(54.0F, -30.0F, -1.5F);
/*      */     
/* 1051 */     this.gunModel['¥'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1052 */     this.gunModel['¥'].setRotationPoint(72.0F, -30.0F, -1.5F);
/*      */     
/* 1054 */     this.gunModel['¦'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1055 */     this.gunModel['¦'].setRotationPoint(89.0F, -30.0F, -1.5F);
/*      */     
/* 1057 */     this.gunModel['§'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1058 */     this.gunModel['§'].setRotationPoint(31.0F, -30.0F, -1.0F);
/*      */     
/* 1060 */     this.gunModel['¨'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1061 */     this.gunModel['¨'].setRotationPoint(43.0F, -28.0F, -3.5F);
/*      */     
/* 1063 */     this.gunModel['©'].addShapeBox(39.0F, -13.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1064 */     this.gunModel['©'].setRotationPoint(60.0F, -28.0F, -3.5F);
/*      */     
/* 1066 */     this.gunModel['ª'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1067 */     this.gunModel['ª'].setRotationPoint(78.0F, -28.0F, -3.5F);
/*      */     
/* 1069 */     this.gunModel['«'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1070 */     this.gunModel['«'].setRotationPoint(43.0F, -29.0F, -3.5F);
/*      */     
/* 1072 */     this.gunModel['¬'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1073 */     this.gunModel['¬'].setRotationPoint(53.25F, -29.0F, -3.5F);
/*      */     
/* 1075 */     this.gunModel['­'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1076 */     this.gunModel['­'].setRotationPoint(78.0F, -29.0F, -3.5F);
/*      */     
/* 1078 */     this.gunModel['®'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1079 */     this.gunModel['®'].setRotationPoint(88.25F, -29.0F, -3.5F);
/*      */     
/* 1081 */     this.gunModel['¯'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1082 */     this.gunModel['¯'].setRotationPoint(60.0F, -29.0F, -3.5F);
/*      */     
/* 1084 */     this.gunModel['°'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1085 */     this.gunModel['°'].setRotationPoint(71.25F, -29.0F, -3.5F);
/*      */     
/* 1087 */     this.gunModel['±'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1088 */     this.gunModel['±'].setRotationPoint(36.25F, -30.0F, -1.0F);
/*      */     
/* 1090 */     this.gunModel['²'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1091 */     this.gunModel['²'].setRotationPoint(43.0F, -30.0F, -1.0F);
/*      */     
/* 1093 */     this.gunModel['³'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1094 */     this.gunModel['³'].setRotationPoint(53.25F, -30.0F, -1.0F);
/*      */     
/* 1096 */     this.gunModel['´'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1097 */     this.gunModel['´'].setRotationPoint(60.0F, -30.0F, -1.0F);
/*      */     
/* 1099 */     this.gunModel['µ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1100 */     this.gunModel['µ'].setRotationPoint(71.25F, -30.0F, -1.0F);
/*      */     
/* 1102 */     this.gunModel['¶'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1103 */     this.gunModel['¶'].setRotationPoint(78.0F, -30.0F, -1.0F);
/*      */     
/* 1105 */     this.gunModel['·'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1106 */     this.gunModel['·'].setRotationPoint(88.25F, -30.0F, -1.0F);
/*      */     
/* 1108 */     this.gunModel['¸'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1109 */     this.gunModel['¸'].setRotationPoint(78.0F, -29.0F, -3.5F);
/*      */     
/* 1111 */     this.gunModel['¹'].addShapeBox(39.0F, -13.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1112 */     this.gunModel['¹'].setRotationPoint(60.0F, -29.0F, -3.5F);
/*      */     
/* 1114 */     this.gunModel['º'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1115 */     this.gunModel['º'].setRotationPoint(43.0F, -29.0F, -3.5F);
/*      */     
/* 1117 */     this.gunModel['»'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1118 */     this.gunModel['»'].setRotationPoint(31.0F, -29.0F, -3.5F);
/*      */     
/* 1120 */     this.gunModel['¼'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1121 */     this.gunModel['¼'].setRotationPoint(31.0F, -28.0F, -3.5F);
/*      */     
/* 1123 */     this.gunModel['½'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1124 */     this.gunModel['½'].setRotationPoint(79.0F, -21.25F, 10.5F);
/*      */     
/* 1126 */     this.gunModel['¾'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1127 */     this.gunModel['¾'].setRotationPoint(79.0F, -21.25F, 0.5F);
/*      */     
/* 1129 */     this.gunModel['¿'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1130 */     this.gunModel['¿'].setRotationPoint(72.0F, -21.25F, 10.5F);
/*      */     
/* 1132 */     this.gunModel['À'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1133 */     this.gunModel['À'].setRotationPoint(72.0F, -21.25F, 0.5F);
/*      */     
/* 1135 */     this.gunModel['Á'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1136 */     this.gunModel['Á'].setRotationPoint(54.0F, -21.25F, 10.5F);
/*      */     
/* 1138 */     this.gunModel['Â'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1139 */     this.gunModel['Â'].setRotationPoint(54.0F, -21.25F, 0.5F);
/*      */     
/* 1141 */     this.gunModel['Ã'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1142 */     this.gunModel['Ã'].setRotationPoint(37.0F, -21.25F, 10.5F);
/*      */     
/* 1144 */     this.gunModel['Ä'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1145 */     this.gunModel['Ä'].setRotationPoint(37.0F, -21.25F, 0.5F);
/*      */     
/* 1147 */     this.gunModel['Å'].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1148 */     this.gunModel['Å'].setRotationPoint(12.0F, -21.25F, 10.5F);
/*      */     
/* 1150 */     this.gunModel['Æ'].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1151 */     this.gunModel['Æ'].setRotationPoint(12.0F, -21.25F, 0.5F);
/*      */     
/* 1153 */     this.gunModel['Ç'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1154 */     this.gunModel['Ç'].setRotationPoint(89.0F, -30.0F, 10.5F);
/*      */     
/* 1156 */     this.gunModel['È'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1157 */     this.gunModel['È'].setRotationPoint(89.0F, -30.0F, 0.5F);
/*      */     
/* 1159 */     this.gunModel['É'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1160 */     this.gunModel['É'].setRotationPoint(72.0F, -30.0F, 10.5F);
/*      */     
/* 1162 */     this.gunModel['Ê'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1163 */     this.gunModel['Ê'].setRotationPoint(72.0F, -30.0F, 0.5F);
/*      */     
/* 1165 */     this.gunModel['Ë'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1166 */     this.gunModel['Ë'].setRotationPoint(54.0F, -30.0F, 10.5F);
/*      */     
/* 1168 */     this.gunModel['Ì'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1169 */     this.gunModel['Ì'].setRotationPoint(54.0F, -30.0F, 0.5F);
/*      */     
/* 1171 */     this.gunModel['Í'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1172 */     this.gunModel['Í'].setRotationPoint(37.0F, -30.0F, 10.5F);
/*      */     
/* 1174 */     this.gunModel['Î'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1175 */     this.gunModel['Î'].setRotationPoint(37.0F, -30.0F, 0.5F);
/*      */     
/* 1177 */     this.gunModel['Ï'].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1178 */     this.gunModel['Ï'].setRotationPoint(12.0F, -30.0F, 10.5F);
/*      */     
/* 1180 */     this.gunModel['Ð'].addShapeBox(39.0F, -13.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1181 */     this.gunModel['Ð'].setRotationPoint(12.0F, -30.0F, 0.5F);
/*      */     
/* 1183 */     this.gunModel['Ñ'].addShapeBox(39.0F, -13.0F, -6.0F, 92, 2, 2, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F);
/* 1184 */     this.gunModel['Ñ'].setRotationPoint(12.0F, -34.0F, 1.5F);
/*      */     
/* 1186 */     this.gunModel['Ò'].addShapeBox(39.0F, -13.0F, -6.0F, 92, 2, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1187 */     this.gunModel['Ò'].setRotationPoint(12.0F, -34.0F, 8.5F);
/*      */     
/* 1189 */     this.gunModel['Ó'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 1190 */     this.gunModel['Ó'].setRotationPoint(8.0F, -20.25F, 0.5F);
/*      */     
/* 1192 */     this.gunModel['Ô'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 4, 11, 0.0F, 0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.5F, -1.0F, -1.5F);
/* 1193 */     this.gunModel['Ô'].setRotationPoint(8.0F, -20.25F, 0.5F);
/*      */     
/* 1195 */     this.gunModel['Õ'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1196 */     this.gunModel['Õ'].setRotationPoint(-11.5F, -19.5F, 11.75F);
/*      */     
/* 1198 */     this.gunModel['Ö'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1199 */     this.gunModel['Ö'].setRotationPoint(-11.5F, -20.5F, 11.75F);
/*      */     
/* 1201 */     this.gunModel['×'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1202 */     this.gunModel['×'].setRotationPoint(-11.5F, -20.0F, 11.75F);
/*      */     
/* 1204 */     this.gunModel['Ø'].addShapeBox(39.0F, -13.0F, -6.0F, 13, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1205 */     this.gunModel['Ø'].setRotationPoint(-18.5F, -13.0F, 10.75F);
/*      */     
/* 1207 */     this.gunModel['Ù'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1208 */     this.gunModel['Ù'].setRotationPoint(-11.5F, -14.0F, 12.25F);
/*      */     
/* 1210 */     this.gunModel['Ú'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1211 */     this.gunModel['Ú'].setRotationPoint(-10.5F, -14.75F, 12.25F);
/*      */     
/* 1213 */     this.gunModel['Û'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 1214 */     this.gunModel['Û'].setRotationPoint(-11.5F, -11.0F, 12.25F);
/*      */     
/* 1216 */     this.gunModel['Ü'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F);
/* 1217 */     this.gunModel['Ü'].setRotationPoint(-10.5F, -10.25F, 12.25F);
/*      */     
/* 1219 */     this.gunModel['Ý'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1220 */     this.gunModel['Ý'].setRotationPoint(-5.5F, -13.0F, 10.75F);
/*      */     
/* 1222 */     this.gunModel['Þ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 2, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1223 */     this.gunModel['Þ'].setRotationPoint(-20.0F, -13.0F, 10.75F);
/*      */     
/* 1225 */     this.gunModel['ß'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1226 */     this.gunModel['ß'].setRotationPoint(-19.5F, -13.0F, 10.75F);
/*      */     
/* 1228 */     this.gunModel['à'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 15, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1229 */     this.gunModel['à'].setRotationPoint(-11.5F, -11.0F, 11.75F);
/*      */     
/* 1231 */     this.gunModel['á'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1232 */     this.gunModel['á'].setRotationPoint(-11.5F, -19.75F, 11.75F);
/*      */     
/* 1234 */     this.gunModel['â'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1235 */     this.gunModel['â'].setRotationPoint(98.0F, -27.5F, 3.0F);
/*      */     
/* 1237 */     this.gunModel['ã'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1238 */     this.gunModel['ã'].setRotationPoint(106.0F, -27.5F, 3.0F);
/*      */     
/* 1240 */     this.gunModel['ä'].addShapeBox(39.0F, -13.0F, -6.0F, 100, 4, 4, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1241 */     this.gunModel['ä'].setRotationPoint(12.0F, -26.5F, 4.0F);
/*      */     
/* 1243 */     this.gunModel['å'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F);
/* 1244 */     this.gunModel['å'].setRotationPoint(112.0F, -27.5F, 3.0F);
/*      */     
/* 1246 */     this.gunModel['æ'].addShapeBox(39.0F, -13.0F, -6.0F, 14, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1247 */     this.gunModel['æ'].setRotationPoint(113.0F, -27.5F, 3.0F);
/*      */     
/* 1249 */     this.gunModel['ç'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 6, 6, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F);
/* 1250 */     this.gunModel['ç'].setRotationPoint(127.0F, -27.5F, 3.0F);
/*      */     
/* 1252 */     this.gunModel['è'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1253 */     this.gunModel['è'].setRotationPoint(126.5F, -27.5F, 3.0F);
/*      */     
/* 1255 */     this.gunModel['é'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1256 */     this.gunModel['é'].setRotationPoint(127.0F, -27.5F, 3.0F);
/*      */     
/* 1258 */     this.gunModel['ê'].addShapeBox(39.0F, -13.0F, -6.0F, 19, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1259 */     this.gunModel['ê'].setRotationPoint(128.0F, -27.5F, 3.0F);
/*      */     
/* 1261 */     this.gunModel['ë'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1262 */     this.gunModel['ë'].setRotationPoint(82.25F, -24.5F, 1.5F);
/*      */     
/* 1264 */     this.gunModel['ì'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1265 */     this.gunModel['ì'].setRotationPoint(95.0F, -21.5F, 1.5F);
/*      */     
/* 1267 */     this.gunModel['í'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1268 */     this.gunModel['í'].setRotationPoint(-7.5F, -12.5F, 12.25F);
/*      */     
/* 1270 */     this.gunModel['î'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1271 */     this.gunModel['î'].setRotationPoint(-7.5F, -13.0F, 12.25F);
/*      */     
/* 1273 */     this.gunModel['ï'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1274 */     this.gunModel['ï'].setRotationPoint(-7.5F, -12.0F, 12.25F);
/*      */     
/* 1276 */     this.gunModel['ð'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 2, 9, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1277 */     this.gunModel['ð'].setRotationPoint(82.25F, -27.0F, 1.5F);
/*      */     
/* 1279 */     this.gunModel['ñ'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 1, 7, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1280 */     this.gunModel['ñ'].setRotationPoint(82.25F, -28.0F, 2.5F);
/*      */     
/* 1282 */     this.gunModel['ò'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1283 */     this.gunModel['ò'].setRotationPoint(82.25F, -29.0F, 3.5F);
/*      */     
/* 1285 */     this.gunModel['ó'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1286 */     this.gunModel['ó'].setRotationPoint(82.25F, -30.0F, 3.5F);
/*      */     
/* 1288 */     this.gunModel['ô'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.5F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 1289 */     this.gunModel['ô'].setRotationPoint(97.0F, -30.5F, 3.5F);
/*      */     
/* 1291 */     this.gunModel['õ'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1292 */     this.gunModel['õ'].setRotationPoint(82.25F, -31.5F, 3.5F);
/*      */     
/* 1294 */     this.gunModel['ö'].addShapeBox(39.0F, -13.0F, -6.0F, 13, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1295 */     this.gunModel['ö'].setRotationPoint(82.25F, -30.5F, 3.5F);
/*      */     
/* 1297 */     this.gunModel['÷'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.5F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 1298 */     this.gunModel['÷'].setRotationPoint(97.0F, -31.0F, 3.5F);
/*      */     
/* 1300 */     this.gunModel['ø'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1301 */     this.gunModel['ø'].setRotationPoint(82.25F, -32.5F, 3.5F);
/*      */     
/* 1303 */     this.gunModel['ù'].addShapeBox(39.0F, -13.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1304 */     this.gunModel['ù'].setRotationPoint(82.25F, -32.0F, 3.5F);
/*      */     
/* 1306 */     this.gunModel['ú'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1307 */     this.gunModel['ú'].setRotationPoint(97.0F, -33.0F, 3.5F);
/*      */     
/* 1309 */     this.gunModel['û'].addShapeBox(39.0F, -13.0F, -6.0F, 13, 1, 5, 0.0F, 0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1310 */     this.gunModel['û'].setRotationPoint(82.75F, -33.0F, 3.5F);
/*      */     
/* 1312 */     this.gunModel['ü'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1313 */     this.gunModel['ü'].setRotationPoint(91.0F, -20.0F, 3.0F);
/*      */     
/* 1315 */     this.gunModel['ý'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1316 */     this.gunModel['ý'].setRotationPoint(97.0F, -18.5F, 2.5F);
/*      */     
/* 1318 */     this.gunModel['þ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1319 */     this.gunModel['þ'].setRotationPoint(96.5F, -18.5F, 2.5F);
/*      */     
/* 1321 */     this.gunModel['ÿ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1322 */     this.gunModel['ÿ'].setRotationPoint(96.0F, -19.0F, 3.0F);
/*      */     
/* 1324 */     this.gunModel['Ā'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1325 */     this.gunModel['Ā'].setRotationPoint(91.0F, -18.5F, 2.5F);
/*      */     
/* 1327 */     this.gunModel['ā'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 9, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1328 */     this.gunModel['ā'].setRotationPoint(94.0F, -21.5F, 1.5F);
/*      */     
/* 1330 */     this.gunModel['Ă'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1331 */     this.gunModel['Ă'].setRotationPoint(91.0F, -21.5F, 3.0F);
/*      */     
/* 1333 */     this.gunModel['ă'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1334 */     this.gunModel['ă'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1336 */     this.gunModel['Ą'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1337 */     this.gunModel['Ą'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1339 */     this.gunModel['ą'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1340 */     this.gunModel['ą'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1342 */     this.gunModel['Ć'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1343 */     this.gunModel['Ć'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1345 */     this.gunModel['ć'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1346 */     this.gunModel['ć'].setRotationPoint(87.0F, -20.5F, 3.0F);
/*      */     
/* 1348 */     this.gunModel['Ĉ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1349 */     this.gunModel['Ĉ'].setRotationPoint(87.0F, -19.5F, 3.0F);
/*      */     
/* 1351 */     this.gunModel['ĉ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 6, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F);
/* 1352 */     this.gunModel['ĉ'].setRotationPoint(82.0F, -19.5F, 3.0F);
/*      */     
/* 1354 */     this.gunModel['Ċ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 6, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1355 */     this.gunModel['Ċ'].setRotationPoint(82.0F, -20.5F, 3.0F);
/*      */     
/* 1357 */     this.gunModel['ċ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 6, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F);
/* 1358 */     this.gunModel['ċ'].setRotationPoint(83.0F, -18.5F, 3.0F);
/*      */     
/* 1360 */     this.gunModel['Č'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1361 */     this.gunModel['Č'].setRotationPoint(97.0F, -25.0F, 10.0F);
/*      */     
/* 1363 */     this.gunModel['č'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1364 */     this.gunModel['č'].setRotationPoint(94.5F, -25.0F, 10.0F);
/*      */     
/* 1366 */     this.gunModel['Ď'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1367 */     this.gunModel['Ď'].setRotationPoint(95.0F, -25.0F, 11.5F);
/*      */     
/* 1369 */     this.gunModel['ď'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1370 */     this.gunModel['ď'].setRotationPoint(97.0F, -25.0F, 0.0F);
/*      */     
/* 1372 */     this.gunModel['Đ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1373 */     this.gunModel['Đ'].setRotationPoint(94.5F, -25.0F, 0.0F);
/*      */     
/* 1375 */     this.gunModel['đ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1376 */     this.gunModel['đ'].setRotationPoint(95.0F, -25.0F, -1.0F);
/*      */     
/* 1378 */     this.gunModel['Ē'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1379 */     this.gunModel['Ē'].setRotationPoint(20.0F, -20.25F, 10.0F);
/*      */     
/* 1381 */     this.gunModel['ē'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1382 */     this.gunModel['ē'].setRotationPoint(22.5F, -18.5F, 11.5F);
/*      */     
/* 1384 */     this.gunModel['Ĕ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1385 */     this.gunModel['Ĕ'].setRotationPoint(22.5F, -19.0F, 11.5F);
/*      */     
/* 1387 */     this.gunModel['ĕ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1388 */     this.gunModel['ĕ'].setRotationPoint(22.5F, -18.0F, 11.5F);
/*      */     
/* 1390 */     this.gunModel['Ė'].addShapeBox(39.0F, -13.0F, -6.0F, 65, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1391 */     this.gunModel['Ė'].setRotationPoint(-53.0F, -28.0F, 10.5F);
/*      */     
/* 1393 */     this.gunModel['ė'].addShapeBox(39.0F, -13.0F, -6.0F, 34, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1394 */     this.gunModel['ė'].setRotationPoint(-53.0F, -30.0F, 0.5F);
/*      */     
/* 1396 */     this.gunModel['Ę'].addShapeBox(39.0F, -13.0F, -6.0F, 33, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1397 */     this.gunModel['Ę'].setRotationPoint(-53.0F, -28.0F, -0.5F);
/*      */     
/* 1399 */     this.gunModel['ę'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 11, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1400 */     this.gunModel['ę'].setRotationPoint(-45.0F, -6.5F, 0.5F);
/*      */     
/* 1402 */     this.gunModel['Ě'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 11, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1403 */     this.gunModel['Ě'].setRotationPoint(-38.0F, -6.5F, 0.5F);
/*      */     
/* 1405 */     this.gunModel['ě'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 11, 11, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1406 */     this.gunModel['ě'].setRotationPoint(-37.0F, -6.5F, 0.5F);
/*      */     
/* 1408 */     this.gunModel['Ĝ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1409 */     this.gunModel['Ĝ'].setRotationPoint(-48.0F, -6.5F, 0.5F);
/*      */     
/* 1411 */     this.gunModel['ĝ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1412 */     this.gunModel['ĝ'].setRotationPoint(-49.0F, -6.5F, 1.5F);
/*      */     
/* 1414 */     this.gunModel['Ğ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F);
/* 1415 */     this.gunModel['Ğ'].setRotationPoint(-49.0F, -4.5F, 1.5F);
/*      */     
/* 1417 */     this.gunModel['ğ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/* 1418 */     this.gunModel['ğ'].setRotationPoint(-48.0F, -4.5F, 0.5F);
/*      */     
/* 1420 */     this.gunModel['Ġ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
/* 1421 */     this.gunModel['Ġ'].setRotationPoint(-49.5F, -2.5F, 1.5F);
/*      */     
/* 1423 */     this.gunModel['ġ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F);
/* 1424 */     this.gunModel['ġ'].setRotationPoint(-48.5F, -2.5F, 0.5F);
/*      */     
/* 1426 */     this.gunModel['Ģ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -2.0F);
/* 1427 */     this.gunModel['Ģ'].setRotationPoint(-50.5F, -0.5F, 1.5F);
/*      */     
/* 1429 */     this.gunModel['ģ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -1.0F);
/* 1430 */     this.gunModel['ģ'].setRotationPoint(-49.5F, -0.5F, 0.5F);
/*      */     
/* 1432 */     this.gunModel['Ĥ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F);
/* 1433 */     this.gunModel['Ĥ'].setRotationPoint(-51.75F, 1.5F, 1.5F);
/*      */     
/* 1435 */     this.gunModel['ĥ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F);
/* 1436 */     this.gunModel['ĥ'].setRotationPoint(-50.75F, 1.5F, 0.5F);
/*      */     
/* 1438 */     this.gunModel['Ħ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.75F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -2.0F);
/* 1439 */     this.gunModel['Ħ'].setRotationPoint(-53.25F, 3.5F, 1.5F);
/*      */     
/* 1441 */     this.gunModel['ħ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.75F, 0.0F, -1.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -1.0F);
/* 1442 */     this.gunModel['ħ'].setRotationPoint(-52.25F, 3.5F, 0.5F);
/*      */     
/* 1444 */     this.gunModel['Ĩ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.25F, 0.0F, -2.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F);
/* 1445 */     this.gunModel['Ĩ'].setRotationPoint(-55.0F, 5.5F, 1.5F);
/*      */     
/* 1447 */     this.gunModel['ĩ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.25F, 0.0F, -1.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -1.0F);
/* 1448 */     this.gunModel['ĩ'].setRotationPoint(-54.0F, 5.5F, 0.5F);
/*      */     
/* 1450 */     this.gunModel['Ī'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.25F, 0.0F, -2.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F);
/* 1451 */     this.gunModel['Ī'].setRotationPoint(-57.25F, 8.5F, 1.5F);
/*      */     
/* 1453 */     this.gunModel['ī'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.25F, 0.0F, -1.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -1.0F);
/* 1454 */     this.gunModel['ī'].setRotationPoint(-56.25F, 8.5F, 0.5F);
/*      */     
/* 1456 */     this.gunModel['Ĭ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F);
/* 1457 */     this.gunModel['Ĭ'].setRotationPoint(-59.5F, 11.5F, 1.5F);
/*      */     
/* 1459 */     this.gunModel['ĭ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -1.0F);
/* 1460 */     this.gunModel['ĭ'].setRotationPoint(-58.5F, 11.5F, 0.5F);
/*      */     
/* 1462 */     this.gunModel['Į'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.75F, 0.0F, -2.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.75F, 0.0F, -2.0F);
/* 1463 */     this.gunModel['Į'].setRotationPoint(-62.5F, 15.5F, 1.5F);
/*      */     
/* 1465 */     this.gunModel['į'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.75F, 0.0F, -1.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.75F, 0.0F, -1.0F);
/* 1466 */     this.gunModel['į'].setRotationPoint(-61.5F, 15.5F, 0.5F);
/*      */     
/* 1468 */     this.gunModel['İ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F);
/* 1469 */     this.gunModel['İ'].setRotationPoint(-65.25F, 19.5F, 1.5F);
/*      */     
/* 1471 */     this.gunModel['ı'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F);
/* 1472 */     this.gunModel['ı'].setRotationPoint(-64.25F, 19.5F, 0.5F);
/*      */     
/* 1474 */     this.gunModel['Ĳ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 16, 11, 0.0F, -7.75F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, -7.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -8.25F, 0.0F, -3.0F, -8.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1475 */     this.gunModel['Ĳ'].setRotationPoint(-50.0F, 7.5F, 0.5F);
/*      */     
/* 1477 */     this.gunModel['ĳ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, -2.0F, -0.25F, 0.0F, 2.0F, -0.25F, -3.0F, 2.0F, -0.25F, -3.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1478 */     this.gunModel['ĳ'].setRotationPoint(-42.25F, 5.75F, 0.5F);
/*      */     
/* 1480 */     this.gunModel['Ĵ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 11, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1481 */     this.gunModel['Ĵ'].setRotationPoint(-40.25F, 5.0F, 0.5F);
/*      */     
/* 1483 */     this.gunModel['ĵ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1484 */     this.gunModel['ĵ'].setRotationPoint(-45.0F, -4.5F, 0.5F);
/*      */     
/* 1486 */     this.gunModel['Ķ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 11, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1487 */     this.gunModel['Ķ'].setRotationPoint(-45.0F, -2.5F, 0.5F);
/*      */     
/* 1489 */     this.gunModel['ķ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 11, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/* 1490 */     this.gunModel['ķ'].setRotationPoint(-46.0F, -0.5F, 0.5F);
/*      */     
/* 1492 */     this.gunModel['ĸ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1493 */     this.gunModel['ĸ'].setRotationPoint(-47.0F, 1.5F, 0.5F);
/*      */     
/* 1495 */     this.gunModel['Ĺ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 11, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1496 */     this.gunModel['Ĺ'].setRotationPoint(-48.0F, 3.5F, 0.5F);
/*      */     
/* 1498 */     this.gunModel['ĺ'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 11, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F);
/* 1499 */     this.gunModel['ĺ'].setRotationPoint(-50.0F, 5.5F, 0.5F);
/*      */     
/* 1501 */     this.gunModel['Ļ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 11, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F);
/* 1502 */     this.gunModel['Ļ'].setRotationPoint(-52.0F, 8.5F, 0.5F);
/*      */     
/* 1504 */     this.gunModel['ļ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 4, 11, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F);
/* 1505 */     this.gunModel['ļ'].setRotationPoint(-54.0F, 11.5F, 0.5F);
/*      */     
/* 1507 */     this.gunModel['Ľ'].addShapeBox(39.0F, -13.0F, -6.0F, 9, 4, 11, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F);
/* 1508 */     this.gunModel['Ľ'].setRotationPoint(-57.0F, 15.5F, 0.5F);
/*      */     
/* 1510 */     this.gunModel['ľ'].addShapeBox(39.0F, -13.0F, -6.0F, 9, 3, 11, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F);
/* 1511 */     this.gunModel['ľ'].setRotationPoint(-58.0F, 19.5F, 0.5F);
/*      */     
/* 1513 */     this.gunModel['Ŀ'].addShapeBox(39.0F, -13.0F, -6.0F, 13, 5, 11, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, -2.25F, 0.0F);
/* 1514 */     this.gunModel['Ŀ'].setRotationPoint(-63.0F, 22.5F, 0.5F);
/*      */     
/* 1516 */     this.gunModel['ŀ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -1.0F);
/* 1517 */     this.gunModel['ŀ'].setRotationPoint(-65.75F, 22.5F, 0.5F);
/*      */     
/* 1519 */     this.gunModel['Ł'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.25F, -2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -2.25F, -2.0F);
/* 1520 */     this.gunModel['Ł'].setRotationPoint(-66.75F, 22.5F, 1.5F);
/*      */     
/* 1522 */     this.gunModel['ł'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1523 */     this.gunModel['ł'].setRotationPoint(-50.0F, 23.25F, 0.5F);
/*      */     
/* 1525 */     this.gunModel['Ń'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1526 */     this.gunModel['Ń'].setRotationPoint(-50.0F, 25.0F, 0.5F);
/*      */     
/* 1528 */     this.gunModel['ń'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -3.0F, -1.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1529 */     this.gunModel['ń'].setRotationPoint(-50.0F, 27.0F, 0.5F);
/*      */     
/* 1531 */     this.gunModel['Ņ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1532 */     this.gunModel['Ņ'].setRotationPoint(-50.0F, 19.25F, 0.5F);
/*      */     
/* 1534 */     this.gunModel['ņ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1535 */     this.gunModel['ņ'].setRotationPoint(-49.0F, 15.25F, 0.5F);
/*      */     
/* 1537 */     this.gunModel['Ň'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1538 */     this.gunModel['Ň'].setRotationPoint(-47.0F, 11.25F, 0.5F);
/*      */     
/* 1540 */     this.gunModel['ň'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 11, 0.0F, 0.0F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1541 */     this.gunModel['ň'].setRotationPoint(-45.0F, 8.25F, 0.5F);
/*      */     
/* 1543 */     this.gunModel['ŉ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1544 */     this.gunModel['ŉ'].setRotationPoint(-45.0F, 6.25F, 0.5F);
/*      */     
/* 1546 */     this.gunModel['Ŋ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 11, 0.0F, -0.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1547 */     this.gunModel['Ŋ'].setRotationPoint(-45.25F, 5.0F, 0.5F);
/*      */     
/* 1549 */     this.gunModel['ŋ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 11, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1550 */     this.gunModel['ŋ'].setRotationPoint(-16.0F, -6.5F, 1.0F);
/*      */     
/* 1552 */     this.gunModel['Ō'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1553 */     this.gunModel['Ō'].setRotationPoint(-17.5F, -6.5F, 1.0F);
/*      */     
/* 1555 */     this.gunModel['ō'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1556 */     this.gunModel['ō'].setRotationPoint(-19.0F, -6.5F, 1.0F);
/*      */     
/* 1558 */     this.gunModel['Ŏ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1559 */     this.gunModel['Ŏ'].setRotationPoint(-17.5F, 1.5F, 1.0F);
/*      */     
/* 1561 */     this.gunModel['ŏ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 10, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1562 */     this.gunModel['ŏ'].setRotationPoint(-18.5F, 1.5F, 1.0F);
/*      */     
/* 1564 */     this.gunModel['Ő'].addShapeBox(39.0F, -13.0F, -6.0F, 14, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1565 */     this.gunModel['Ő'].setRotationPoint(-31.5F, 2.5F, 1.0F);
/*      */     
/* 1567 */     this.gunModel['ő'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 10, 0.0F, -0.5F, 2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1568 */     this.gunModel['ő'].setRotationPoint(-34.5F, 2.5F, 1.0F);
/*      */     
/* 1570 */     this.gunModel['Œ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1571 */     this.gunModel['Œ'].setRotationPoint(-32.0F, 3.0F, 1.0F);
/*      */     
/* 1573 */     this.gunModel['œ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1574 */     this.gunModel['œ'].setRotationPoint(-45.0F, -7.5F, 1.0F);
/*      */     
/* 1576 */     this.gunModel['Ŕ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 2.0F, 0.0F);
/* 1577 */     this.gunModel['Ŕ'].setRotationPoint(-34.5F, -7.5F, 1.0F);
/*      */     
/* 1579 */     this.gunModel['ŕ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1580 */     this.gunModel['ŕ'].setRotationPoint(-32.0F, -7.0F, 1.0F);
/*      */     
/* 1582 */     this.gunModel['Ŗ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1583 */     this.gunModel['Ŗ'].setRotationPoint(-29.5F, -6.5F, 3.5F);
/*      */     
/* 1585 */     this.gunModel['ŗ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1586 */     this.gunModel['ŗ'].setRotationPoint(-29.5F, -5.0F, 3.5F);
/*      */     
/* 1588 */     this.gunModel['Ř'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1589 */     this.gunModel['Ř'].setRotationPoint(-29.75F, -3.5F, 3.5F);
/*      */     
/* 1591 */     this.gunModel['ř'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1592 */     this.gunModel['ř'].setRotationPoint(-29.75F, -2.0F, 3.5F);
/*      */     
/* 1594 */     this.gunModel['Ś'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1595 */     this.gunModel['Ś'].setRotationPoint(-29.75F, -0.5F, 3.5F);
/*      */     
/* 1597 */     this.gunModel['ś'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1598 */     this.gunModel['ś'].setRotationPoint(-28.75F, 0.5F, 3.5F);
/*      */     
/* 1600 */     this.gunModel['Ŝ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1601 */     this.gunModel['Ŝ'].setRotationPoint(-48.0F, -7.5F, 0.5F);
/*      */     
/* 1603 */     this.gunModel['ŝ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1604 */     this.gunModel['ŝ'].setRotationPoint(-49.0F, -7.5F, 1.5F);
/*      */     
/* 1606 */     this.gunModel['Ş'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1607 */     this.gunModel['Ş'].setRotationPoint(-48.0F, -9.0F, 0.5F);
/*      */     
/* 1609 */     this.gunModel['ş'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.5F, -0.25F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1610 */     this.gunModel['ş'].setRotationPoint(-49.0F, -9.0F, 1.5F);
/*      */     
/* 1612 */     this.gunModel['Š'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1613 */     this.gunModel['Š'].setRotationPoint(-49.5F, -10.75F, 1.5F);
/*      */     
/* 1615 */     this.gunModel['š'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1616 */     this.gunModel['š'].setRotationPoint(-48.5F, -10.75F, 0.5F);
/*      */     
/* 1618 */     this.gunModel['Ţ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 2.5F, -0.5F, -2.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, 2.5F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1619 */     this.gunModel['Ţ'].setRotationPoint(-51.0F, -12.75F, 1.5F);
/*      */     
/* 1621 */     this.gunModel['ţ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 2.5F, -0.5F, -1.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, 2.5F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1622 */     this.gunModel['ţ'].setRotationPoint(-50.0F, -12.75F, 0.5F);
/*      */     
/* 1624 */     this.gunModel['Ť'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 9, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, -0.5F, -0.25F, -2.0F);
/* 1625 */     this.gunModel['Ť'].setRotationPoint(-58.5F, -13.0F, 1.5F);
/*      */     
/* 1627 */     this.gunModel['ť'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 3, 11, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F);
/* 1628 */     this.gunModel['ť'].setRotationPoint(-58.5F, -15.5F, 0.5F);
/*      */     
/* 1630 */     this.gunModel['Ŧ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1631 */     this.gunModel['Ŧ'].setRotationPoint(-53.5F, -13.0F, 1.5F);
/*      */     
/* 1633 */     this.gunModel['ŧ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F);
/* 1634 */     this.gunModel['ŧ'].setRotationPoint(-53.5F, -15.0F, 0.5F);
/*      */     
/* 1636 */     this.gunModel['Ũ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, -0.25F, -0.7F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -1.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1637 */     this.gunModel['Ũ'].setRotationPoint(-52.5F, -13.0F, 0.5F);
/*      */     
/* 1639 */     this.gunModel['ũ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 11, 0.0F, 2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1640 */     this.gunModel['ũ'].setRotationPoint(-50.0F, -18.5F, 0.5F);
/*      */     
/* 1642 */     this.gunModel['Ū'].addShapeBox(39.0F, -13.0F, -6.0F, 13, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1643 */     this.gunModel['Ū'].setRotationPoint(-58.0F, -17.0F, 0.5F);
/*      */     
/* 1645 */     this.gunModel['ū'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 11, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F);
/* 1646 */     this.gunModel['ū'].setRotationPoint(-53.0F, -15.5F, 0.5F);
/*      */     
/* 1648 */     this.gunModel['Ŭ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 11, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1649 */     this.gunModel['Ŭ'].setRotationPoint(-49.0F, -13.0F, 0.5F);
/*      */     
/* 1651 */     this.gunModel['ŭ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/* 1652 */     this.gunModel['ŭ'].setRotationPoint(-49.0F, -12.5F, 0.5F);
/*      */     
/* 1654 */     this.gunModel['Ů'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 11, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, -0.75F, 0.0F, -3.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.5F, -0.25F, 0.0F);
/* 1655 */     this.gunModel['Ů'].setRotationPoint(-49.0F, -11.5F, 0.5F);
/*      */     
/* 1657 */     this.gunModel['ů'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 11, 0.0F, -3.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -3.5F, -0.75F, 0.0F, -4.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -4.0F, -0.75F, 0.0F);
/* 1658 */     this.gunModel['ů'].setRotationPoint(-49.0F, -9.5F, 0.5F);
/*      */     
/* 1660 */     this.gunModel['Ű'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1661 */     this.gunModel['Ű'].setRotationPoint(-48.0F, -7.0F, 2.0F);
/*      */     
/* 1663 */     this.gunModel['ű'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1664 */     this.gunModel['ű'].setRotationPoint(-49.0F, -7.0F, 3.0F);
/*      */     
/* 1666 */     this.gunModel['Ų'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1667 */     this.gunModel['Ų'].setRotationPoint(-46.25F, -32.75F, 1.5F);
/*      */     
/* 1669 */     this.gunModel['ų'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1670 */     this.gunModel['ų'].setRotationPoint(-45.75F, -31.75F, 1.5F);
/*      */     
/* 1672 */     this.gunModel['Ŵ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1673 */     this.gunModel['Ŵ'].setRotationPoint(-44.75F, -31.75F, 1.5F);
/*      */     
/* 1675 */     this.gunModel['ŵ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1676 */     this.gunModel['ŵ'].setRotationPoint(-45.25F, -31.75F, 1.5F);
/*      */     
/* 1678 */     this.gunModel['Ŷ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 3, 9, 0.0F, -0.25F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1679 */     this.gunModel['Ŷ'].setRotationPoint(-47.25F, -32.75F, 1.5F);
/*      */     
/* 1681 */     this.gunModel['ŷ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F);
/* 1682 */     this.gunModel['ŷ'].setRotationPoint(-44.75F, -34.75F, 2.5F);
/*      */     
/* 1684 */     this.gunModel['Ÿ'].addShapeBox(39.0F, -13.0F, -6.0F, 9, 3, 9, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1685 */     this.gunModel['Ÿ'].setRotationPoint(-56.0F, -32.75F, 1.5F);
/*      */     
/* 1687 */     this.gunModel['Ź'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 9, 0.0F, -0.75F, -1.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1688 */     this.gunModel['Ź'].setRotationPoint(-47.25F, -33.25F, 1.5F);
/*      */     
/* 1690 */     this.gunModel['ź'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, -0.25F, 1.25F, -1.5F, -0.25F, 1.25F, -1.5F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1691 */     this.gunModel['ź'].setRotationPoint(-58.0F, -20.0F, 0.5F);
/*      */     
/* 1693 */     this.gunModel['Ż'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1694 */     this.gunModel['Ż'].setRotationPoint(-58.0F, -18.5F, 0.5F);
/*      */     
/* 1696 */     this.gunModel['ż'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, -0.25F, 1.75F, -0.5F, -0.25F, 1.75F, -0.5F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 1697 */     this.gunModel['ż'].setRotationPoint(-58.0F, -20.75F, 0.5F);
/*      */     
/* 1699 */     this.gunModel['Ž'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F);
/* 1700 */     this.gunModel['Ž'].setRotationPoint(-58.0F, -21.5F, 0.5F);
/*      */     
/* 1702 */     this.gunModel['ž'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 3, 11, 0.0F, 0.0F, -0.5F, 2.25F, -1.5F, -0.5F, 2.25F, -1.5F, -0.5F, 2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -0.75F, 2.0F, -0.25F, -0.75F, 2.0F, -0.25F, -0.75F, 2.0F, 0.0F, -0.75F, 2.0F);
/* 1703 */     this.gunModel['ž'].setRotationPoint(-58.0F, -23.5F, 0.5F);
/*      */     
/* 1705 */     this.gunModel['ſ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 3, 12, 0.0F, 0.0F, -0.5F, 1.75F, -2.25F, -0.5F, 1.75F, -2.25F, -0.5F, 1.75F, 0.0F, -0.5F, 1.75F, 0.0F, -0.75F, 1.75F, -1.5F, -0.75F, 1.75F, -1.5F, -0.75F, 1.75F, 0.0F, -0.75F, 1.75F);
/* 1706 */     this.gunModel['ſ'].setRotationPoint(-58.0F, -25.24F, 0.0F);
/*      */     
/* 1708 */     this.gunModel['ƀ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 9, 0.0F, 0.0F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, -0.5F, 3.25F, -2.25F, -0.5F, 3.25F, -2.25F, -0.5F, 3.25F, 0.0F, -0.5F, 3.25F);
/* 1709 */     this.gunModel['ƀ'].setRotationPoint(-58.0F, -29.25F, 1.5F);
/*      */     
/* 1711 */     this.gunModel['Ɓ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 4, 10, 0.0F, 0.0F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F);
/* 1712 */     this.gunModel['Ɓ'].setRotationPoint(-58.0F, -28.25F, 1.0F);
/*      */     
/* 1714 */     this.gunModel['Ƃ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F);
/* 1715 */     this.gunModel['Ƃ'].setRotationPoint(-58.0F, -31.25F, 1.5F);
/*      */     
/* 1717 */     this.gunModel['ƃ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 11, 0.0F, 3.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 3.25F, -0.25F, 0.0F, 2.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 2.25F, -0.75F, 0.0F);
/* 1718 */     this.gunModel['ƃ'].setRotationPoint(-50.0F, -19.5F, 0.5F);
/*      */     
/* 1720 */     this.gunModel['Ƅ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/* 1721 */     this.gunModel['Ƅ'].setRotationPoint(-48.0F, -21.25F, 0.5F);
/*      */     
/* 1723 */     this.gunModel['ƅ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 2.0F, -0.25F, 1.25F, -1.75F, -0.25F, 1.25F, -1.75F, -0.25F, 1.25F, 2.0F, -0.25F, 1.25F, -0.5F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1724 */     this.gunModel['ƅ'].setRotationPoint(-50.0F, -21.25F, 0.5F);
/*      */     
/* 1726 */     this.gunModel['Ɔ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 11, 0.0F, 1.25F, -0.25F, 2.0F, -2.0F, -0.25F, 2.0F, -2.0F, -0.25F, 2.0F, 1.25F, -0.25F, 2.0F, 0.0F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F);
/* 1727 */     this.gunModel['Ɔ'].setRotationPoint(-52.0F, -22.75F, 0.5F);
/*      */     
/* 1729 */     this.gunModel['Ƈ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 11, 0.0F, 0.5F, -0.25F, 2.5F, -0.75F, -0.25F, 2.5F, -0.75F, -0.25F, 2.5F, 0.5F, -0.25F, 2.5F, -0.25F, -0.25F, 2.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F);
/* 1730 */     this.gunModel['Ƈ'].setRotationPoint(-53.5F, -24.25F, 0.5F);
/*      */     
/* 1732 */     this.gunModel['ƈ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 11, 0.0F, 0.75F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.5F, 0.5F, 0.25F, 2.5F, -0.75F, 0.25F, 2.5F, -0.75F, 0.25F, 2.5F, 0.5F, 0.25F, 2.5F);
/* 1733 */     this.gunModel['ƈ'].setRotationPoint(-53.5F, -26.25F, 0.5F);
/*      */     
/* 1735 */     this.gunModel['Ɖ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 11, 0.0F, 0.75F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.5F, 0.75F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.5F);
/* 1736 */     this.gunModel['Ɖ'].setRotationPoint(-53.5F, -27.25F, 0.5F);
/*      */     
/* 1738 */     this.gunModel['Ɗ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 11, 0.0F, 0.75F, -0.25F, 1.5F, -1.0F, -0.25F, 1.5F, -1.0F, -0.25F, 1.5F, 0.75F, -0.25F, 1.5F, 0.75F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.5F);
/* 1739 */     this.gunModel['Ɗ'].setRotationPoint(-53.5F, -29.25F, 0.5F);
/*      */     
/* 1741 */     this.gunModel['Ƌ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 11, 0.0F, 0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, 0.25F, 1.5F, -1.0F, 0.25F, 1.5F, -1.0F, 0.25F, 1.5F, 0.75F, 0.25F, 1.5F);
/* 1742 */     this.gunModel['Ƌ'].setRotationPoint(-53.5F, -30.25F, 0.5F);
/*      */     
/* 1744 */     this.gunModel['ƌ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 6, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1745 */     this.gunModel['ƌ'].setRotationPoint(-55.25F, -27.25F, 0.5F);
/*      */     
/* 1747 */     this.gunModel['ƍ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 3, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1748 */     this.gunModel['ƍ'].setRotationPoint(-54.25F, -22.25F, 0.5F);
/*      */     
/* 1750 */     this.gunModel['Ǝ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 6, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1751 */     this.gunModel['Ǝ'].setRotationPoint(-54.25F, -27.75F, 0.5F);
/*      */     
/* 1753 */     this.gunModel['Ə'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.75F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.75F, -0.5F, 1.25F, 1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F);
/* 1754 */     this.gunModel['Ə'].setRotationPoint(-41.5F, -37.0F, 2.5F);
/*      */     
/* 1756 */     this.gunModel['Ɛ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 9, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F);
/* 1757 */     this.gunModel['Ɛ'].setRotationPoint(-41.5F, -37.0F, 1.5F);
/*      */     
/* 1759 */     this.gunModel['Ƒ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F);
/* 1760 */     this.gunModel['Ƒ'].setRotationPoint(-44.0F, -35.75F, 2.5F);
/*      */     
/* 1762 */     this.gunModel['ƒ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1763 */     this.gunModel['ƒ'].setRotationPoint(-55.25F, -28.75F, 0.5F);
/*      */     
/* 1765 */     this.gunModel['Ɠ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 1766 */     this.gunModel['Ɠ'].setRotationPoint(-55.25F, -30.25F, 0.5F);
/*      */     
/* 1768 */     this.gunModel['Ɣ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 2, 7, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1769 */     this.gunModel['Ɣ'].setRotationPoint(-50.75F, -35.75F, 2.5F);
/*      */     
/* 1771 */     this.gunModel['ƕ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1772 */     this.gunModel['ƕ'].setRotationPoint(-51.75F, -35.75F, 2.5F);
/*      */     
/* 1774 */     this.gunModel['Ɩ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F);
/* 1775 */     this.gunModel['Ɩ'].setRotationPoint(-53.75F, -35.75F, 2.5F);
/*      */     
/* 1777 */     this.gunModel['Ɨ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.25F);
/* 1778 */     this.gunModel['Ɨ'].setRotationPoint(-54.75F, -35.75F, 3.5F);
/*      */     
/* 1780 */     this.gunModel['Ƙ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 3, 9, 0.0F, -0.25F, -1.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1781 */     this.gunModel['Ƙ'].setRotationPoint(-48.0F, -32.75F, 1.5F);
/*      */     
/* 1783 */     this.gunModel['ƙ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F);
/* 1784 */     this.gunModel['ƙ'].setRotationPoint(-47.75F, -34.75F, 2.5F);
/*      */     
/* 1786 */     this.gunModel['ƚ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1787 */     this.gunModel['ƚ'].setRotationPoint(-46.25F, -34.75F, 2.5F);
/*      */     
/* 1789 */     this.gunModel['ƛ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 7, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -1.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1790 */     this.gunModel['ƛ'].setRotationPoint(-45.75F, -34.75F, 2.5F);
/*      */     
/* 1792 */     this.gunModel['Ɯ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1793 */     this.gunModel['Ɯ'].setRotationPoint(-45.75F, -34.75F, 3.0F);
/*      */     
/* 1795 */     this.gunModel['Ɲ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1796 */     this.gunModel['Ɲ'].setRotationPoint(-48.75F, -33.75F, 2.0F);
/*      */     
/* 1798 */     this.gunModel['ƞ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 8, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F);
/* 1799 */     this.gunModel['ƞ'].setRotationPoint(-50.75F, -33.75F, 2.0F);
/*      */     
/* 1801 */     this.gunModel['Ɵ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 0.25F, -0.25F, 1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.25F, 0.25F, 1.0F);
/* 1802 */     this.gunModel['Ɵ'].setRotationPoint(-51.75F, -33.75F, 1.0F);
/*      */     
/* 1804 */     this.gunModel['Ơ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 1.25F, -0.25F, 1.0F, 0.25F, -0.25F, 1.0F, 0.25F, -0.25F, 1.0F, 1.25F, -0.25F, 1.0F, 1.25F, 0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 1.25F, 0.25F, 1.0F);
/* 1805 */     this.gunModel['Ơ'].setRotationPoint(-53.25F, -33.75F, 1.0F);
/*      */     
/* 1807 */     this.gunModel['ơ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.5F, 0.25F, 1.0F, 0.5F, 0.25F, 1.0F, 0.0F, 0.25F, -0.5F);
/* 1808 */     this.gunModel['ơ'].setRotationPoint(-56.0F, -33.75F, 1.0F);
/*      */     
/* 1810 */     this.gunModel['Ƣ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, 0.0F, -0.25F, -1.5F, 0.0F, 0.25F, -1.5F, -0.25F, 0.25F, 1.0F, -0.25F, 0.25F, 1.0F, 0.0F, 0.25F, -1.5F);
/* 1811 */     this.gunModel['Ƣ'].setRotationPoint(-56.75F, -33.75F, 2.5F);
/*      */     
/* 1813 */     this.gunModel['ƣ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 8, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F);
/* 1814 */     this.gunModel['ƣ'].setRotationPoint(-52.75F, -35.25F, 2.0F);
/*      */     
/* 1816 */     this.gunModel['Ƥ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 8, 0.0F, 0.75F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.75F, -0.5F, 1.5F, 0.75F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.75F, 0.25F, 1.5F);
/* 1817 */     this.gunModel['Ƥ'].setRotationPoint(-53.75F, -35.25F, 2.0F);
/*      */     
/* 1819 */     this.gunModel['ƥ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 0.0F);
/* 1820 */     this.gunModel['ƥ'].setRotationPoint(-55.5F, -35.25F, 2.0F);
/*      */     
/* 1822 */     this.gunModel['Ʀ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, 0.0F, 0.25F, -1.0F);
/* 1823 */     this.gunModel['Ʀ'].setRotationPoint(-56.0F, -35.25F, 3.5F);
/*      */     
/* 1825 */     this.gunModel['Ƨ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.75F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.0F, 0.75F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.0F);
/* 1826 */     this.gunModel['Ƨ'].setRotationPoint(-53.75F, -34.75F, 2.0F);
/*      */     
/* 1828 */     this.gunModel['ƨ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 0.5F);
/* 1829 */     this.gunModel['ƨ'].setRotationPoint(-55.5F, -34.75F, 2.0F);
/*      */     
/* 1831 */     this.gunModel['Ʃ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 1.0F);
/* 1832 */     this.gunModel['Ʃ'].setRotationPoint(-51.75F, -35.25F, 3.0F);
/*      */     
/* 1834 */     this.gunModel['ƪ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1835 */     this.gunModel['ƪ'].setRotationPoint(-50.75F, -35.25F, 3.0F);
/*      */     
/* 1837 */     this.gunModel['ƫ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1838 */     this.gunModel['ƫ'].setRotationPoint(-50.75F, -34.75F, 3.0F);
/*      */     
/* 1840 */     this.gunModel['Ƭ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 8, 0.0F, 0.75F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.75F, -0.5F, 1.5F, 0.75F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.75F, 0.0F, 1.5F);
/* 1841 */     this.gunModel['Ƭ'].setRotationPoint(-53.75F, -33.0F, 2.0F);
/*      */     
/* 1843 */     this.gunModel['ƭ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F);
/* 1844 */     this.gunModel['ƭ'].setRotationPoint(-55.5F, -33.0F, 2.0F);
/*      */     
/* 1846 */     this.gunModel['Ʈ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F);
/* 1847 */     this.gunModel['Ʈ'].setRotationPoint(-56.0F, -33.0F, 3.5F);
/*      */     
/* 1849 */     this.gunModel['Ư'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F);
/* 1850 */     this.gunModel['Ư'].setRotationPoint(-52.75F, -33.0F, 2.0F);
/*      */     
/* 1852 */     this.gunModel['ư'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F);
/* 1853 */     this.gunModel['ư'].setRotationPoint(-51.75F, -33.0F, 3.0F);
/*      */     
/* 1855 */     this.gunModel['Ʊ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1856 */     this.gunModel['Ʊ'].setRotationPoint(-50.75F, -34.0F, 3.0F);
/*      */     
/* 1858 */     this.gunModel['Ʋ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1859 */     this.gunModel['Ʋ'].setRotationPoint(-50.75F, -32.75F, 3.0F);
/*      */     
/* 1861 */     this.gunModel['Ƴ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F);
/* 1862 */     this.gunModel['Ƴ'].setRotationPoint(-50.75F, -34.25F, 10.5F);
/*      */     
/* 1864 */     this.gunModel['ƴ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 1865 */     this.gunModel['ƴ'].setRotationPoint(-51.75F, -34.25F, 10.25F);
/*      */     
/* 1867 */     this.gunModel['Ƶ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F);
/* 1868 */     this.gunModel['Ƶ'].setRotationPoint(-50.75F, -34.25F, 10.75F);
/*      */     
/* 1870 */     this.gunModel['ƶ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F);
/* 1871 */     this.gunModel['ƶ'].setRotationPoint(-50.75F, -33.25F, 10.75F);
/*      */     
/* 1873 */     this.gunModel['Ʒ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F);
/* 1874 */     this.gunModel['Ʒ'].setRotationPoint(-51.5F, -34.25F, 11.75F);
/*      */     
/* 1876 */     this.gunModel['Ƹ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F);
/* 1877 */     this.gunModel['Ƹ'].setRotationPoint(-51.5F, -33.25F, 11.75F);
/*      */     
/* 1879 */     this.gunModel['ƹ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1880 */     this.gunModel['ƹ'].setRotationPoint(-75.0F, -28.5F, 1.5F);
/*      */     
/* 1882 */     this.gunModel['ƺ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1883 */     this.gunModel['ƺ'].setRotationPoint(-75.0F, -25.5F, 1.5F);
/*      */     
/* 1885 */     this.gunModel['ƻ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1886 */     this.gunModel['ƻ'].setRotationPoint(-75.0F, -22.5F, 1.5F);
/*      */     
/* 1888 */     this.gunModel['Ƽ'].addShapeBox(39.0F, -13.0F, -6.0F, 60, 2, 11, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1889 */     this.gunModel['Ƽ'].setRotationPoint(-135.0F, -28.5F, 0.5F);
/*      */     
/* 1891 */     this.gunModel['ƽ'].addShapeBox(39.0F, -13.0F, -6.0F, 60, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1892 */     this.gunModel['ƽ'].setRotationPoint(-135.0F, -29.5F, 2.5F);
/*      */     
/* 1894 */     this.gunModel['ƾ'].addShapeBox(39.0F, -13.0F, -6.0F, 52, 3, 11, 0.0F, 0.0F, 0.0F, -0.5F, 8.0F, 0.0F, -0.5F, 8.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1895 */     this.gunModel['ƾ'].setRotationPoint(-135.0F, -26.5F, 0.5F);
/*      */     
/* 1897 */     this.gunModel['ƿ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1898 */     this.gunModel['ƿ'].setRotationPoint(-75.0F, -19.5F, 4.5F);
/*      */     
/* 1900 */     this.gunModel['ǀ'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1901 */     this.gunModel['ǀ'].setRotationPoint(-75.0F, -20.0F, 4.5F);
/*      */     
/* 1903 */     this.gunModel['ǁ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 5, 4, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1904 */     this.gunModel['ǁ'].setRotationPoint(-82.0F, -19.5F, 4.5F);
/*      */     
/* 1906 */     this.gunModel['ǂ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 5, 4, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1907 */     this.gunModel['ǂ'].setRotationPoint(-85.0F, -19.5F, 4.5F);
/*      */     
/* 1909 */     this.gunModel['ǃ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 5, 4, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 3.75F, 0.0F);
/* 1910 */     this.gunModel['ǃ'].setRotationPoint(-87.0F, -18.5F, 4.5F);
/*      */     
/* 1912 */     this.gunModel['Ǆ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 5, 4, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F);
/* 1913 */     this.gunModel['Ǆ'].setRotationPoint(-89.0F, -17.5F, 4.5F);
/*      */     
/* 1915 */     this.gunModel['ǅ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 4, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -3.75F, 0.0F, -0.75F, -3.75F, 0.0F, -0.75F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F);
/* 1916 */     this.gunModel['ǅ'].setRotationPoint(-89.0F, -7.0F, 4.5F);
/*      */     
/* 1918 */     this.gunModel['ǆ'].addShapeBox(39.0F, -13.0F, -6.0F, 12, 6, 4, 0.0F, -2.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, -2.0F, -4.75F, 0.0F, 2.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 2.0F, 2.75F, 0.0F);
/* 1919 */     this.gunModel['ǆ'].setRotationPoint(-101.0F, -17.5F, 4.5F);
/*      */     
/* 1921 */     this.gunModel['Ǉ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 22, 7, 0.0F, -14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, -14.0F, -4.75F, 0.0F, 6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, 6.0F, 2.75F, 0.0F);
/* 1922 */     this.gunModel['Ǉ'].setRotationPoint(-124.0F, -17.5F, 2.5F);
/*      */     
/* 1924 */     this.gunModel['ǈ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 22, 7, 0.0F, -14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, -14.0F, -4.75F, 0.0F, 6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, 6.0F, 2.75F, 0.0F);
/* 1925 */     this.gunModel['ǈ'].setRotationPoint(-115.0F, -17.5F, 2.5F);
/*      */     
/* 1927 */     this.gunModel['ǉ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1928 */     this.gunModel['ǉ'].setRotationPoint(-109.0F, -12.75F, 2.5F);
/*      */     
/* 1930 */     this.gunModel['Ǌ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1931 */     this.gunModel['Ǌ'].setRotationPoint(-110.0F, -11.75F, 2.5F);
/*      */     
/* 1933 */     this.gunModel['ǋ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1934 */     this.gunModel['ǋ'].setRotationPoint(-111.0F, -10.75F, 2.5F);
/*      */     
/* 1936 */     this.gunModel['ǌ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1937 */     this.gunModel['ǌ'].setRotationPoint(-112.0F, -9.75F, 2.5F);
/*      */     
/* 1939 */     this.gunModel['Ǎ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1940 */     this.gunModel['Ǎ'].setRotationPoint(-113.0F, -8.75F, 2.5F);
/*      */     
/* 1942 */     this.gunModel['ǎ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1943 */     this.gunModel['ǎ'].setRotationPoint(-114.0F, -7.75F, 2.5F);
/*      */     
/* 1945 */     this.gunModel['Ǐ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1946 */     this.gunModel['Ǐ'].setRotationPoint(-115.0F, -6.75F, 2.5F);
/*      */     
/* 1948 */     this.gunModel['ǐ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1949 */     this.gunModel['ǐ'].setRotationPoint(-116.0F, -5.75F, 2.5F);
/*      */     
/* 1951 */     this.gunModel['Ǒ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1952 */     this.gunModel['Ǒ'].setRotationPoint(-117.0F, -4.75F, 2.5F);
/*      */     
/* 1954 */     this.gunModel['ǒ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1955 */     this.gunModel['ǒ'].setRotationPoint(-118.0F, -3.75F, 2.5F);
/*      */     
/* 1957 */     this.gunModel['Ǔ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1958 */     this.gunModel['Ǔ'].setRotationPoint(-119.0F, -2.75F, 2.5F);
/*      */     
/* 1960 */     this.gunModel['ǔ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1961 */     this.gunModel['ǔ'].setRotationPoint(-120.0F, -1.75F, 2.5F);
/*      */     
/* 1963 */     this.gunModel['Ǖ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1964 */     this.gunModel['Ǖ'].setRotationPoint(-121.0F, -0.75F, 2.5F);
/*      */     
/* 1966 */     this.gunModel['ǖ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1967 */     this.gunModel['ǖ'].setRotationPoint(-122.0F, 0.25F, 2.5F);
/*      */     
/* 1969 */     this.gunModel['Ǘ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1970 */     this.gunModel['Ǘ'].setRotationPoint(-123.0F, 1.25F, 2.5F);
/*      */     
/* 1972 */     this.gunModel['ǘ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1973 */     this.gunModel['ǘ'].setRotationPoint(-124.0F, 2.25F, 2.5F);
/*      */     
/* 1975 */     this.gunModel['Ǚ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1976 */     this.gunModel['Ǚ'].setRotationPoint(-125.0F, 3.25F, 2.5F);
/*      */     
/* 1978 */     this.gunModel['ǚ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1979 */     this.gunModel['ǚ'].setRotationPoint(-126.0F, 4.25F, 2.5F);
/*      */     
/* 1981 */     this.gunModel['Ǜ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1982 */     this.gunModel['Ǜ'].setRotationPoint(-127.0F, 5.25F, 2.5F);
/*      */     
/* 1984 */     this.gunModel['ǜ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1985 */     this.gunModel['ǜ'].setRotationPoint(-128.0F, 6.25F, 2.5F);
/*      */     
/* 1987 */     this.gunModel['ǝ'].addShapeBox(39.0F, -13.0F, -6.0F, 10, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1988 */     this.gunModel['ǝ'].setRotationPoint(-130.0F, 7.25F, 2.5F);
/*      */     
/* 1990 */     this.gunModel['Ǟ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1991 */     this.gunModel['Ǟ'].setRotationPoint(-114.0F, -12.75F, 2.5F);
/*      */     
/* 1993 */     this.gunModel['ǟ'].addShapeBox(39.0F, -13.0F, -6.0F, 19, 1, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1994 */     this.gunModel['ǟ'].setRotationPoint(-133.0F, -11.75F, 2.5F);
/*      */     
/* 1996 */     this.gunModel['Ǡ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1997 */     this.gunModel['Ǡ'].setRotationPoint(-115.0F, -12.75F, 2.5F);
/*      */     
/* 1999 */     this.gunModel['ǡ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, -0.7F, -2.0F, 0.0F, -0.7F, -2.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2000 */     this.gunModel['ǡ'].setRotationPoint(-128.5F, -12.75F, 2.5F);
/*      */     
/* 2002 */     this.gunModel['Ǣ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 15, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2003 */     this.gunModel['Ǣ'].setRotationPoint(-133.0F, -10.25F, 2.5F);
/*      */     
/* 2005 */     this.gunModel['ǣ'].addShapeBox(39.0F, -13.0F, -6.0F, 12, 1, 7, 0.0F, 0.8F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.8F, 0.5F, 0.0F, 0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F);
/* 2006 */     this.gunModel['ǣ'].setRotationPoint(-129.0F, -6.75F, 2.5F);
/*      */     
/* 2008 */     this.gunModel['Ǥ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2009 */     this.gunModel['Ǥ'].setRotationPoint(-114.0F, -10.75F, 2.5F);
/*      */     
/* 2011 */     this.gunModel['ǥ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2012 */     this.gunModel['ǥ'].setRotationPoint(-119.0F, -5.75F, 2.5F);
/*      */     
/* 2014 */     this.gunModel['Ǧ'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 7, 0.0F, 0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
/* 2015 */     this.gunModel['Ǧ'].setRotationPoint(-129.0F, -1.75F, 2.5F);
/*      */     
/* 2017 */     this.gunModel['ǧ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2018 */     this.gunModel['ǧ'].setRotationPoint(-124.0F, -0.75F, 2.5F);
/*      */     
/* 2020 */     this.gunModel['Ǩ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2021 */     this.gunModel['Ǩ'].setRotationPoint(-131.0F, 4.75F, 2.5F);
/*      */     
/* 2023 */     this.gunModel['ǩ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 22, 5, 0.0F, -14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, -14.0F, -4.75F, 0.0F, 6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, 6.0F, 2.75F, 0.0F);
/* 2024 */     this.gunModel['ǩ'].setRotationPoint(-122.0F, -17.5F, 3.5F);
/*      */     
/* 2026 */     this.gunModel['Ǫ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2027 */     this.gunModel['Ǫ'].setRotationPoint(-109.0F, -12.75F, 8.5F);
/*      */     
/* 2029 */     this.gunModel['ǫ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 15, 6, 0.0F, 0.0F, 0.5F, 0.0F, 16.0F, 0.5F, 0.0F, 16.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2030 */     this.gunModel['ǫ'].setRotationPoint(-130.0F, -10.25F, 3.0F);
/*      */     
/* 2032 */     this.gunModel['Ǭ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2033 */     this.gunModel['Ǭ'].setRotationPoint(-122.0F, -2.75F, 2.5F);
/*      */     
/* 2035 */     this.gunModel['ǭ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2036 */     this.gunModel['ǭ'].setRotationPoint(-116.5F, -8.25F, 2.5F);
/*      */     
/* 2038 */     this.gunModel['Ǯ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2039 */     this.gunModel['Ǯ'].setRotationPoint(-128.5F, 3.75F, 2.5F);
/*      */     
/* 2041 */     this.gunModel['ǯ'].addShapeBox(39.0F, -13.0F, -6.0F, 51, 3, 13, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2042 */     this.gunModel['ǯ'].setRotationPoint(-134.0F, -23.5F, -0.5F);
/*      */     
/* 2044 */     this.gunModel['ǰ'].addShapeBox(39.0F, -13.0F, -6.0F, 48, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2045 */     this.gunModel['ǰ'].setRotationPoint(-134.0F, -20.5F, -0.5F);
/*      */     
/* 2047 */     this.gunModel['Ǳ'].addShapeBox(39.0F, -13.0F, -6.0F, 51, 2, 13, 0.0F, 0.0F, -1.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2048 */     this.gunModel['Ǳ'].setRotationPoint(-134.0F, -24.5F, -0.5F);
/*      */     
/* 2050 */     this.gunModel['ǲ'].addShapeBox(39.0F, -13.0F, -6.0F, 45, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2051 */     this.gunModel['ǲ'].setRotationPoint(-133.0F, -18.5F, -1.5F);
/*      */     
/* 2053 */     this.gunModel['ǳ'].addShapeBox(39.0F, -13.0F, -6.0F, 45, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F);
/* 2054 */     this.gunModel['ǳ'].setRotationPoint(-133.0F, -17.5F, -1.5F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2059 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 489, 121, this.textureX, this.textureY);
/* 2060 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 1273, 97, this.textureX, this.textureY);
/* 2061 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 841, 113, this.textureX, this.textureY);
/* 2062 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 1145, 113, this.textureX, this.textureY);
/* 2063 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 1273, 113, this.textureX, this.textureY);
/* 2064 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 17, 121, this.textureX, this.textureY);
/* 2065 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 1089, 113, this.textureX, this.textureY);
/* 2066 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 1017, 113, this.textureX, this.textureY);
/* 2067 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 1201, 113, this.textureX, this.textureY);
/* 2068 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 1673, 113, this.textureX, this.textureY);
/* 2069 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/* 2070 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/* 2071 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 1673, 33, this.textureX, this.textureY);
/* 2072 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 721, 121, this.textureX, this.textureY);
/* 2073 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 721, 105, this.textureX, this.textureY);
/* 2074 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 473, 113, this.textureX, this.textureY);
/* 2075 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 1313, 113, this.textureX, this.textureY);
/* 2076 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 1657, 113, this.textureX, this.textureY);
/* 2077 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 889, 121, this.textureX, this.textureY);
/* 2078 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/* 2079 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 1969, 113, this.textureX, this.textureY);
/* 2080 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 1329, 113, this.textureX, this.textureY);
/* 2081 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 793, 121, this.textureX, this.textureY);
/* 2082 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 945, 121, this.textureX, this.textureY);
/* 2083 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 977, 121, this.textureX, this.textureY);
/* 2084 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 65, 121, this.textureX, this.textureY);
/* 2085 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/* 2086 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 529, 105, this.textureX, this.textureY);
/* 2087 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 1817, 113, this.textureX, this.textureY);
/* 2088 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 2009, 113, this.textureX, this.textureY);
/* 2089 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 825, 121, this.textureX, this.textureY);
/* 2090 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/* 2091 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/* 2092 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 1889, 65, this.textureX, this.textureY);
/* 2093 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 873, 121, this.textureX, this.textureY);
/* 2094 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 1041, 121, this.textureX, this.textureY);
/* 2095 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 1057, 121, this.textureX, this.textureY);
/* 2096 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 1121, 121, this.textureX, this.textureY);
/* 2097 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 1217, 9, this.textureX, this.textureY);
/* 2098 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 993, 121, this.textureX, this.textureY);
/* 2099 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/* 2100 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 801, 121, this.textureX, this.textureY);
/* 2101 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 953, 121, this.textureX, this.textureY);
/* 2102 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 1177, 121, this.textureX, this.textureY);
/* 2103 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 1233, 121, this.textureX, this.textureY);
/* 2104 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 1249, 121, this.textureX, this.textureY);
/* 2105 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 1345, 121, this.textureX, this.textureY);
/* 2106 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 1377, 121, this.textureX, this.textureY);
/* 2107 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 1409, 121, this.textureX, this.textureY);
/* 2108 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 1449, 121, this.textureX, this.textureY);
/* 2109 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 1489, 121, this.textureX, this.textureY);
/* 2110 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 1713, 121, this.textureX, this.textureY);
/* 2111 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 1433, 121, this.textureX, this.textureY);
/* 2112 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 1489, 73, this.textureX, this.textureY);
/* 2113 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 1473, 121, this.textureX, this.textureY);
/* 2114 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 1753, 121, this.textureX, this.textureY);
/* 2115 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 1793, 121, this.textureX, this.textureY);
/* 2116 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 1833, 121, this.textureX, this.textureY);
/* 2117 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 1273, 73, this.textureX, this.textureY);
/* 2118 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 2119 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 601, 65, this.textureX, this.textureY);
/* 2120 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 1737, 81, this.textureX, this.textureY);
/* 2121 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/* 2122 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 1721, 97, this.textureX, this.textureY);
/* 2123 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 665, 73, this.textureX, this.textureY);
/* 2124 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 769, 73, this.textureX, this.textureY);
/* 2125 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 1001, 73, this.textureX, this.textureY);
/* 2126 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 1249, 81, this.textureX, this.textureY);
/* 2127 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 1609, 81, this.textureX, this.textureY);
/* 2128 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 1737, 121, this.textureX, this.textureY);
/* 2129 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 1985, 121, this.textureX, this.textureY);
/* 2130 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 73, 129, this.textureX, this.textureY);
/* 2131 */     this.gunModel['ȼ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 2132 */     this.gunModel['Ƚ'] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/* 2133 */     this.gunModel['Ⱦ'] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/* 2134 */     this.gunModel['ȿ'] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/* 2135 */     this.gunModel['ɀ'] = new ModelRendererTurbo(this, 1513, 121, this.textureX, this.textureY);
/* 2136 */     this.gunModel['Ɂ'] = new ModelRendererTurbo(this, 1401, 121, this.textureX, this.textureY);
/* 2137 */     this.gunModel['ɂ'] = new ModelRendererTurbo(this, 297, 129, this.textureX, this.textureY);
/* 2138 */     this.gunModel['Ƀ'] = new ModelRendererTurbo(this, 337, 129, this.textureX, this.textureY);
/* 2139 */     this.gunModel['Ʉ'] = new ModelRendererTurbo(this, 465, 129, this.textureX, this.textureY);
/* 2140 */     this.gunModel['Ʌ'] = new ModelRendererTurbo(this, 841, 129, this.textureX, this.textureY);
/* 2141 */     this.gunModel['Ɇ'] = new ModelRendererTurbo(this, 881, 129, this.textureX, this.textureY);
/* 2142 */     this.gunModel['ɇ'] = new ModelRendererTurbo(this, 921, 129, this.textureX, this.textureY);
/* 2143 */     this.gunModel['Ɉ'] = new ModelRendererTurbo(this, 1137, 41, this.textureX, this.textureY);
/* 2144 */     this.gunModel['ɉ'] = new ModelRendererTurbo(this, 1329, 41, this.textureX, this.textureY);
/* 2145 */     this.gunModel['Ɋ'] = new ModelRendererTurbo(this, 1009, 129, this.textureX, this.textureY);
/* 2146 */     this.gunModel['ɋ'] = new ModelRendererTurbo(this, 1777, 121, this.textureX, this.textureY);
/* 2147 */     this.gunModel['Ɍ'] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/* 2148 */     this.gunModel['ɍ'] = new ModelRendererTurbo(this, 1049, 129, this.textureX, this.textureY);
/* 2149 */     this.gunModel['Ɏ'] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/* 2150 */     this.gunModel['ɏ'] = new ModelRendererTurbo(this, 1121, 129, this.textureX, this.textureY);
/* 2151 */     this.gunModel['ɐ'] = new ModelRendererTurbo(this, 1257, 129, this.textureX, this.textureY);
/* 2152 */     this.gunModel['ɑ'] = new ModelRendererTurbo(this, 1297, 129, this.textureX, this.textureY);
/* 2153 */     this.gunModel['ɒ'] = new ModelRendererTurbo(this, 1529, 129, this.textureX, this.textureY);
/* 2154 */     this.gunModel['ɓ'] = new ModelRendererTurbo(this, 1569, 129, this.textureX, this.textureY);
/* 2155 */     this.gunModel['ɔ'] = new ModelRendererTurbo(this, 1609, 129, this.textureX, this.textureY);
/* 2156 */     this.gunModel['ɕ'] = new ModelRendererTurbo(this, 1649, 129, this.textureX, this.textureY);
/* 2157 */     this.gunModel['ɖ'] = new ModelRendererTurbo(this, 193, 137, this.textureX, this.textureY);
/* 2158 */     this.gunModel['ɗ'] = new ModelRendererTurbo(this, 505, 137, this.textureX, this.textureY);
/* 2159 */     this.gunModel['ɘ'] = new ModelRendererTurbo(this, 545, 137, this.textureX, this.textureY);
/* 2160 */     this.gunModel['ə'] = new ModelRendererTurbo(this, 585, 137, this.textureX, this.textureY);
/* 2161 */     this.gunModel['ɚ'] = new ModelRendererTurbo(this, 625, 137, this.textureX, this.textureY);
/* 2162 */     this.gunModel['ɛ'] = new ModelRendererTurbo(this, 665, 137, this.textureX, this.textureY);
/* 2163 */     this.gunModel['ɜ'] = new ModelRendererTurbo(this, 705, 137, this.textureX, this.textureY);
/* 2164 */     this.gunModel['ɝ'] = new ModelRendererTurbo(this, 745, 137, this.textureX, this.textureY);
/* 2165 */     this.gunModel['ɞ'] = new ModelRendererTurbo(this, 1073, 137, this.textureX, this.textureY);
/* 2166 */     this.gunModel['ɟ'] = new ModelRendererTurbo(this, 2025, 121, this.textureX, this.textureY);
/* 2167 */     this.gunModel['ɠ'] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/* 2168 */     this.gunModel['ɡ'] = new ModelRendererTurbo(this, 905, 129, this.textureX, this.textureY);
/* 2169 */     this.gunModel['ɢ'] = new ModelRendererTurbo(this, 153, 137, this.textureX, this.textureY);
/* 2170 */     this.gunModel['ɣ'] = new ModelRendererTurbo(this, 1145, 137, this.textureX, this.textureY);
/* 2171 */     this.gunModel['ɤ'] = new ModelRendererTurbo(this, 1201, 137, this.textureX, this.textureY);
/* 2172 */     this.gunModel['ɥ'] = new ModelRendererTurbo(this, 1321, 137, this.textureX, this.textureY);
/* 2173 */     this.gunModel['ɦ'] = new ModelRendererTurbo(this, 1673, 137, this.textureX, this.textureY);
/* 2174 */     this.gunModel['ɧ'] = new ModelRendererTurbo(this, 1857, 137, this.textureX, this.textureY);
/* 2175 */     this.gunModel['ɨ'] = new ModelRendererTurbo(this, 1897, 137, this.textureX, this.textureY);
/* 2176 */     this.gunModel['ɩ'] = new ModelRendererTurbo(this, 1945, 137, this.textureX, this.textureY);
/* 2177 */     this.gunModel['ɪ'] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/* 2178 */     this.gunModel['ɫ'] = new ModelRendererTurbo(this, 1177, 57, this.textureX, this.textureY);
/* 2179 */     this.gunModel['ɬ'] = new ModelRendererTurbo(this, 1489, 57, this.textureX, this.textureY);
/* 2180 */     this.gunModel['ɭ'] = new ModelRendererTurbo(this, 1089, 9, this.textureX, this.textureY);
/* 2181 */     this.gunModel['ɮ'] = new ModelRendererTurbo(this, 1993, 81, this.textureX, this.textureY);
/* 2182 */     this.gunModel['ɯ'] = new ModelRendererTurbo(this, 657, 65, this.textureX, this.textureY);
/* 2183 */     this.gunModel['ɰ'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 2184 */     this.gunModel['ɱ'] = new ModelRendererTurbo(this, 1097, 9, this.textureX, this.textureY);
/* 2185 */     this.gunModel['ɲ'] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 2186 */     this.gunModel['ɳ'] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/* 2187 */     this.gunModel['ɴ'] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/* 2188 */     this.gunModel['ɵ'] = new ModelRendererTurbo(this, 1929, 57, this.textureX, this.textureY);
/* 2189 */     this.gunModel['ɶ'] = new ModelRendererTurbo(this, 1121, 9, this.textureX, this.textureY);
/* 2190 */     this.gunModel['ɷ'] = new ModelRendererTurbo(this, 1281, 9, this.textureX, this.textureY);
/* 2191 */     this.gunModel['ɸ'] = new ModelRendererTurbo(this, 1289, 25, this.textureX, this.textureY);
/* 2192 */     this.gunModel['ɹ'] = new ModelRendererTurbo(this, 1361, 1, this.textureX, this.textureY);
/* 2193 */     this.gunModel['ɺ'] = new ModelRendererTurbo(this, 873, 49, this.textureX, this.textureY);
/* 2194 */     this.gunModel['ɻ'] = new ModelRendererTurbo(this, 929, 49, this.textureX, this.textureY);
/* 2195 */     this.gunModel['ɼ'] = new ModelRendererTurbo(this, 529, 57, this.textureX, this.textureY);
/* 2196 */     this.gunModel['ɽ'] = new ModelRendererTurbo(this, 1345, 9, this.textureX, this.textureY);
/* 2197 */     this.gunModel['ɾ'] = new ModelRendererTurbo(this, 1353, 57, this.textureX, this.textureY);
/* 2198 */     this.gunModel['ɿ'] = new ModelRendererTurbo(this, 1681, 41, this.textureX, this.textureY);
/* 2199 */     this.gunModel['ʀ'] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/* 2200 */     this.gunModel['ʁ'] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/* 2201 */     this.gunModel['ʂ'] = new ModelRendererTurbo(this, 513, 57, this.textureX, this.textureY);
/* 2202 */     this.gunModel['ʃ'] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/* 2203 */     this.gunModel['ʄ'] = new ModelRendererTurbo(this, 545, 57, this.textureX, this.textureY);
/* 2204 */     this.gunModel['ʅ'] = new ModelRendererTurbo(this, 1257, 57, this.textureX, this.textureY);
/* 2205 */     this.gunModel['ʆ'] = new ModelRendererTurbo(this, 1297, 57, this.textureX, this.textureY);
/* 2206 */     this.gunModel['ʇ'] = new ModelRendererTurbo(this, 1409, 57, this.textureX, this.textureY);
/* 2207 */     this.gunModel['ʈ'] = new ModelRendererTurbo(this, 1681, 65, this.textureX, this.textureY);
/* 2208 */     this.gunModel['ʉ'] = new ModelRendererTurbo(this, 1353, 9, this.textureX, this.textureY);
/* 2209 */     this.gunModel['ʊ'] = new ModelRendererTurbo(this, 2017, 9, this.textureX, this.textureY);
/* 2210 */     this.gunModel['ʋ'] = new ModelRendererTurbo(this, 2041, 9, this.textureX, this.textureY);
/* 2211 */     this.gunModel['ʌ'] = new ModelRendererTurbo(this, 665, 17, this.textureX, this.textureY);
/* 2212 */     this.gunModel['ʍ'] = new ModelRendererTurbo(this, 921, 89, this.textureX, this.textureY);
/* 2213 */     this.gunModel['ʎ'] = new ModelRendererTurbo(this, 945, 89, this.textureX, this.textureY);
/* 2214 */     this.gunModel['ʏ'] = new ModelRendererTurbo(this, 1945, 65, this.textureX, this.textureY);
/* 2215 */     this.gunModel['ʐ'] = new ModelRendererTurbo(this, 1081, 89, this.textureX, this.textureY);
/* 2216 */     this.gunModel['ʑ'] = new ModelRendererTurbo(this, 1281, 129, this.textureX, this.textureY);
/* 2217 */     this.gunModel['ʒ'] = new ModelRendererTurbo(this, 1553, 129, this.textureX, this.textureY);
/* 2218 */     this.gunModel['ʓ'] = new ModelRendererTurbo(this, 1321, 129, this.textureX, this.textureY);
/* 2219 */     this.gunModel['ʔ'] = new ModelRendererTurbo(this, 593, 121, this.textureX, this.textureY);
/* 2220 */     this.gunModel['ʕ'] = new ModelRendererTurbo(this, 1265, 121, this.textureX, this.textureY);
/* 2221 */     this.gunModel['ʖ'] = new ModelRendererTurbo(this, 505, 113, this.textureX, this.textureY);
/* 2222 */     this.gunModel['ʗ'] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/* 2223 */     this.gunModel['ʘ'] = new ModelRendererTurbo(this, 681, 97, this.textureX, this.textureY);
/* 2224 */     this.gunModel['ʙ'] = new ModelRendererTurbo(this, 705, 97, this.textureX, this.textureY);
/* 2225 */     this.gunModel['ʚ'] = new ModelRendererTurbo(this, 1449, 57, this.textureX, this.textureY);
/* 2226 */     this.gunModel['ʛ'] = new ModelRendererTurbo(this, 729, 97, this.textureX, this.textureY);
/* 2227 */     this.gunModel['ʜ'] = new ModelRendererTurbo(this, 2001, 65, this.textureX, this.textureY);
/* 2228 */     this.gunModel['ʝ'] = new ModelRendererTurbo(this, 1425, 17, this.textureX, this.textureY);
/* 2229 */     this.gunModel['ʞ'] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/* 2230 */     this.gunModel['ʟ'] = new ModelRendererTurbo(this, 1241, 97, this.textureX, this.textureY);
/* 2231 */     this.gunModel['ʠ'] = new ModelRendererTurbo(this, 1273, 97, this.textureX, this.textureY);
/* 2232 */     this.gunModel['ʡ'] = new ModelRendererTurbo(this, 1313, 97, this.textureX, this.textureY);
/* 2233 */     this.gunModel['ʢ'] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/* 2234 */     this.gunModel['ʣ'] = new ModelRendererTurbo(this, 2025, 25, this.textureX, this.textureY);
/* 2235 */     this.gunModel['ʤ'] = new ModelRendererTurbo(this, 1889, 33, this.textureX, this.textureY);
/* 2236 */     this.gunModel['ʥ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 2237 */     this.gunModel['ʦ'] = new ModelRendererTurbo(this, 1905, 33, this.textureX, this.textureY);
/* 2238 */     this.gunModel['ʧ'] = new ModelRendererTurbo(this, 377, 145, this.textureX, this.textureY);
/* 2239 */     this.gunModel['ʨ'] = new ModelRendererTurbo(this, 1993, 57, this.textureX, this.textureY);
/* 2240 */     this.gunModel['ʩ'] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/* 2241 */     this.gunModel['ʪ'] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/* 2242 */     this.gunModel['ʫ'] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 2243 */     this.gunModel['ʬ'] = new ModelRendererTurbo(this, 1921, 33, this.textureX, this.textureY);
/* 2244 */     this.gunModel['ʭ'] = new ModelRendererTurbo(this, 1937, 33, this.textureX, this.textureY);
/* 2245 */     this.gunModel['ʮ'] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
/* 2246 */     this.gunModel['ʯ'] = new ModelRendererTurbo(this, 1625, 97, this.textureX, this.textureY);
/* 2247 */     this.gunModel['ʰ'] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/* 2248 */     this.gunModel['ʱ'] = new ModelRendererTurbo(this, 385, 105, this.textureX, this.textureY);
/* 2249 */     this.gunModel['ʲ'] = new ModelRendererTurbo(this, 753, 97, this.textureX, this.textureY);
/* 2250 */     this.gunModel['ʳ'] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/* 2251 */     this.gunModel['ʴ'] = new ModelRendererTurbo(this, 777, 105, this.textureX, this.textureY);
/* 2252 */     this.gunModel['ʵ'] = new ModelRendererTurbo(this, 1345, 145, this.textureX, this.textureY);
/* 2253 */     this.gunModel['ʶ'] = new ModelRendererTurbo(this, 1697, 145, this.textureX, this.textureY);
/* 2254 */     this.gunModel['ʷ'] = new ModelRendererTurbo(this, 1761, 145, this.textureX, this.textureY);
/* 2255 */     this.gunModel['ʸ'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 2256 */     this.gunModel['ʹ'] = new ModelRendererTurbo(this, 225, 153, this.textureX, this.textureY);
/* 2257 */     this.gunModel['ʺ'] = new ModelRendererTurbo(this, 289, 153, this.textureX, this.textureY);
/* 2258 */     this.gunModel['ʻ'] = new ModelRendererTurbo(this, 353, 153, this.textureX, this.textureY);
/* 2259 */     this.gunModel['ʼ'] = new ModelRendererTurbo(this, 777, 153, this.textureX, this.textureY);
/* 2260 */     this.gunModel['ʽ'] = new ModelRendererTurbo(this, 1593, 129, this.textureX, this.textureY);
/* 2261 */     this.gunModel['ʾ'] = new ModelRendererTurbo(this, 753, 73, this.textureX, this.textureY);
/* 2262 */     this.gunModel['ʿ'] = new ModelRendererTurbo(this, 985, 73, this.textureX, this.textureY);
/* 2263 */     this.gunModel['ˀ'] = new ModelRendererTurbo(this, 537, 81, this.textureX, this.textureY);
/* 2264 */     this.gunModel['ˁ'] = new ModelRendererTurbo(this, 809, 105, this.textureX, this.textureY);
/* 2265 */     this.gunModel['˂'] = new ModelRendererTurbo(this, 1633, 129, this.textureX, this.textureY);
/* 2266 */     this.gunModel['˃'] = new ModelRendererTurbo(this, 841, 105, this.textureX, this.textureY);
/* 2267 */     this.gunModel['˄'] = new ModelRendererTurbo(this, 529, 137, this.textureX, this.textureY);
/* 2268 */     this.gunModel['˅'] = new ModelRendererTurbo(this, 1369, 121, this.textureX, this.textureY);
/* 2269 */     this.gunModel['ˆ'] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/* 2270 */     this.gunModel['ˇ'] = new ModelRendererTurbo(this, 1065, 105, this.textureX, this.textureY);
/* 2271 */     this.gunModel['ˈ'] = new ModelRendererTurbo(this, 1017, 89, this.textureX, this.textureY);
/* 2272 */     this.gunModel['ˉ'] = new ModelRendererTurbo(this, 1281, 33, this.textureX, this.textureY);
/* 2273 */     this.gunModel['ˊ'] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/* 2274 */     this.gunModel['ˋ'] = new ModelRendererTurbo(this, 841, 129, this.textureX, this.textureY);
/* 2275 */     this.gunModel['ˌ'] = new ModelRendererTurbo(this, 113, 129, this.textureX, this.textureY);
/* 2276 */     this.gunModel['ˍ'] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/* 2277 */     this.gunModel['ˎ'] = new ModelRendererTurbo(this, 1209, 105, this.textureX, this.textureY);
/* 2278 */     this.gunModel['ˏ'] = new ModelRendererTurbo(this, 1489, 105, this.textureX, this.textureY);
/* 2279 */     this.gunModel['ː'] = new ModelRendererTurbo(this, 1521, 105, this.textureX, this.textureY);
/* 2280 */     this.gunModel['ˑ'] = new ModelRendererTurbo(this, 1753, 105, this.textureX, this.textureY);
/* 2281 */     this.gunModel['˒'] = new ModelRendererTurbo(this, 1785, 105, this.textureX, this.textureY);
/* 2282 */     this.gunModel['˓'] = new ModelRendererTurbo(this, 1825, 105, this.textureX, this.textureY);
/* 2283 */     this.gunModel['˔'] = new ModelRendererTurbo(this, 1201, 121, this.textureX, this.textureY);
/* 2284 */     this.gunModel['˕'] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/* 2285 */     this.gunModel['˖'] = new ModelRendererTurbo(this, 1857, 121, this.textureX, this.textureY);
/* 2286 */     this.gunModel['˗'] = new ModelRendererTurbo(this, 17, 129, this.textureX, this.textureY);
/* 2287 */     this.gunModel['˘'] = new ModelRendererTurbo(this, 769, 137, this.textureX, this.textureY);
/* 2288 */     this.gunModel['˙'] = new ModelRendererTurbo(this, 1593, 81, this.textureX, this.textureY);
/* 2289 */     this.gunModel['˚'] = new ModelRendererTurbo(this, 1065, 89, this.textureX, this.textureY);
/* 2290 */     this.gunModel['˛'] = new ModelRendererTurbo(this, 889, 73, this.textureX, this.textureY);
/* 2291 */     this.gunModel['˜'] = new ModelRendererTurbo(this, 921, 73, this.textureX, this.textureY);
/* 2292 */     this.gunModel['˝'] = new ModelRendererTurbo(this, 1201, 89, this.textureX, this.textureY);
/* 2293 */     this.gunModel['˞'] = new ModelRendererTurbo(this, 1593, 97, this.textureX, this.textureY);
/* 2294 */     this.gunModel['˟'] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/* 2295 */     this.gunModel['ˠ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/* 2296 */     this.gunModel['ˡ'] = new ModelRendererTurbo(this, 361, 121, this.textureX, this.textureY);
/* 2297 */     this.gunModel['ˢ'] = new ModelRendererTurbo(this, 361, 129, this.textureX, this.textureY);
/* 2298 */     this.gunModel['ˣ'] = new ModelRendererTurbo(this, 1753, 129, this.textureX, this.textureY);
/* 2299 */     this.gunModel['ˤ'] = new ModelRendererTurbo(this, 841, 121, this.textureX, this.textureY);
/* 2300 */     this.gunModel['˥'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/* 2301 */     this.gunModel['˦'] = new ModelRendererTurbo(this, 569, 113, this.textureX, this.textureY);
/* 2302 */     this.gunModel['˧'] = new ModelRendererTurbo(this, 953, 73, this.textureX, this.textureY);
/* 2303 */     this.gunModel['˨'] = new ModelRendererTurbo(this, 1057, 73, this.textureX, this.textureY);
/* 2304 */     this.gunModel['˩'] = new ModelRendererTurbo(this, 1033, 137, this.textureX, this.textureY);
/* 2305 */     this.gunModel['˪'] = new ModelRendererTurbo(this, 1177, 113, this.textureX, this.textureY);
/* 2306 */     this.gunModel['˫'] = new ModelRendererTurbo(this, 1313, 113, this.textureX, this.textureY);
/* 2307 */     this.gunModel['ˬ'] = new ModelRendererTurbo(this, 1081, 73, this.textureX, this.textureY);
/* 2308 */     this.gunModel['˭'] = new ModelRendererTurbo(this, 1401, 73, this.textureX, this.textureY);
/* 2309 */     this.gunModel['ˮ'] = new ModelRendererTurbo(this, 1097, 137, this.textureX, this.textureY);
/* 2310 */     this.gunModel['˯'] = new ModelRendererTurbo(this, 1225, 137, this.textureX, this.textureY);
/* 2311 */     this.gunModel['˰'] = new ModelRendererTurbo(this, 1657, 113, this.textureX, this.textureY);
/* 2312 */     this.gunModel['˱'] = new ModelRendererTurbo(this, 1969, 113, this.textureX, this.textureY);
/* 2313 */     this.gunModel['˲'] = new ModelRendererTurbo(this, 1433, 73, this.textureX, this.textureY);
/* 2314 */     this.gunModel['˳'] = new ModelRendererTurbo(this, 1465, 73, this.textureX, this.textureY);
/* 2315 */     this.gunModel['˴'] = new ModelRendererTurbo(this, 1249, 137, this.textureX, this.textureY);
/* 2316 */     this.gunModel['˵'] = new ModelRendererTurbo(this, 1993, 113, this.textureX, this.textureY);
/* 2317 */     this.gunModel['˶'] = new ModelRendererTurbo(this, 65, 121, this.textureX, this.textureY);
/* 2318 */     this.gunModel['˷'] = new ModelRendererTurbo(this, 1489, 73, this.textureX, this.textureY);
/* 2319 */     this.gunModel['˸'] = new ModelRendererTurbo(this, 1513, 73, this.textureX, this.textureY);
/* 2320 */     this.gunModel['˹'] = new ModelRendererTurbo(this, 1281, 137, this.textureX, this.textureY);
/* 2321 */     this.gunModel['˺'] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/* 2322 */     this.gunModel['˻'] = new ModelRendererTurbo(this, 721, 121, this.textureX, this.textureY);
/* 2323 */     this.gunModel['˼'] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/* 2324 */     this.gunModel['˽'] = new ModelRendererTurbo(this, 561, 81, this.textureX, this.textureY);
/* 2325 */     this.gunModel['˾'] = new ModelRendererTurbo(this, 1553, 137, this.textureX, this.textureY);
/* 2326 */     this.gunModel['˿'] = new ModelRendererTurbo(this, 825, 121, this.textureX, this.textureY);
/* 2327 */     this.gunModel['̀'] = new ModelRendererTurbo(this, 873, 121, this.textureX, this.textureY);
/* 2328 */     this.gunModel['́'] = new ModelRendererTurbo(this, 633, 81, this.textureX, this.textureY);
/* 2329 */     this.gunModel['̂'] = new ModelRendererTurbo(this, 689, 81, this.textureX, this.textureY);
/* 2330 */     this.gunModel['̃'] = new ModelRendererTurbo(this, 1177, 121, this.textureX, this.textureY);
/* 2331 */     this.gunModel['̄'] = new ModelRendererTurbo(this, 1017, 121, this.textureX, this.textureY);
/* 2332 */     this.gunModel['̅'] = new ModelRendererTurbo(this, 1433, 121, this.textureX, this.textureY);
/* 2333 */     this.gunModel['̆'] = new ModelRendererTurbo(this, 1177, 81, this.textureX, this.textureY);
/* 2334 */     this.gunModel['̇'] = new ModelRendererTurbo(this, 1297, 81, this.textureX, this.textureY);
/* 2335 */     this.gunModel['̈'] = new ModelRendererTurbo(this, 1593, 137, this.textureX, this.textureY);
/* 2336 */     this.gunModel['̉'] = new ModelRendererTurbo(this, 1473, 121, this.textureX, this.textureY);
/* 2337 */     this.gunModel['̊'] = new ModelRendererTurbo(this, 1513, 121, this.textureX, this.textureY);
/* 2338 */     this.gunModel['̋'] = new ModelRendererTurbo(this, 1641, 81, this.textureX, this.textureY);
/* 2339 */     this.gunModel['̌'] = new ModelRendererTurbo(this, 1673, 81, this.textureX, this.textureY);
/* 2340 */     this.gunModel['̍'] = new ModelRendererTurbo(this, 1881, 137, this.textureX, this.textureY);
/* 2341 */     this.gunModel['̎'] = new ModelRendererTurbo(this, 1777, 121, this.textureX, this.textureY);
/* 2342 */     this.gunModel['̏'] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/* 2343 */     this.gunModel['̐'] = new ModelRendererTurbo(this, 1705, 81, this.textureX, this.textureY);
/* 2344 */     this.gunModel['̑'] = new ModelRendererTurbo(this, 2025, 81, this.textureX, this.textureY);
/* 2345 */     this.gunModel['̒'] = new ModelRendererTurbo(this, 1929, 137, this.textureX, this.textureY);
/* 2346 */     this.gunModel['̓'] = new ModelRendererTurbo(this, 2025, 137, this.textureX, this.textureY);
/* 2347 */     this.gunModel['̔'] = new ModelRendererTurbo(this, 433, 145, this.textureX, this.textureY);
/* 2348 */     this.gunModel['̕'] = new ModelRendererTurbo(this, 649, 145, this.textureX, this.textureY);
/* 2349 */     this.gunModel['̖'] = new ModelRendererTurbo(this, 729, 145, this.textureX, this.textureY);
/* 2350 */     this.gunModel['̗'] = new ModelRendererTurbo(this, 1121, 137, this.textureX, this.textureY);
/* 2351 */     this.gunModel['̘'] = new ModelRendererTurbo(this, 769, 145, this.textureX, this.textureY);
/* 2352 */     this.gunModel['̙'] = new ModelRendererTurbo(this, 1097, 145, this.textureX, this.textureY);
/* 2353 */     this.gunModel['̚'] = new ModelRendererTurbo(this, 993, 145, this.textureX, this.textureY);
/* 2354 */     this.gunModel['̛'] = new ModelRendererTurbo(this, 1169, 145, this.textureX, this.textureY);
/* 2355 */     this.gunModel['̜'] = new ModelRendererTurbo(this, 1225, 145, this.textureX, this.textureY);
/* 2356 */     this.gunModel['̝'] = new ModelRendererTurbo(this, 1145, 137, this.textureX, this.textureY);
/* 2357 */     this.gunModel['̞'] = new ModelRendererTurbo(this, 1817, 145, this.textureX, this.textureY);
/* 2358 */     this.gunModel['̟'] = new ModelRendererTurbo(this, 1841, 145, this.textureX, this.textureY);
/* 2359 */     this.gunModel['̠'] = new ModelRendererTurbo(this, 1497, 153, this.textureX, this.textureY);
/* 2360 */     this.gunModel['̡'] = new ModelRendererTurbo(this, 1513, 153, this.textureX, this.textureY);
/* 2361 */     this.gunModel['̢'] = new ModelRendererTurbo(this, 1521, 153, this.textureX, this.textureY);
/* 2362 */     this.gunModel['̣'] = new ModelRendererTurbo(this, 1585, 153, this.textureX, this.textureY);
/* 2363 */     this.gunModel['̤'] = new ModelRendererTurbo(this, 1689, 33, this.textureX, this.textureY);
/* 2364 */     this.gunModel['̥'] = new ModelRendererTurbo(this, 1065, 89, this.textureX, this.textureY);
/*      */     
/* 2366 */     this.gunModel['Ǵ'].addShapeBox(39.0F, -13.0F, -6.0F, 43, 2, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2367 */     this.gunModel['Ǵ'].setRotationPoint(-131.0F, -16.5F, -0.5F);
/*      */     
/* 2369 */     this.gunModel['ǵ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 11, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.5F);
/* 2370 */     this.gunModel['ǵ'].setRotationPoint(-76.0F, -26.5F, 0.5F);
/*      */     
/* 2372 */     this.gunModel['Ƕ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 2, 13, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -0.5F);
/* 2373 */     this.gunModel['Ƕ'].setRotationPoint(-82.0F, -24.5F, -0.5F);
/*      */     
/* 2375 */     this.gunModel['Ƿ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 13, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -0.5F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 2.75F, 0.0F, 0.0F);
/* 2376 */     this.gunModel['Ƿ'].setRotationPoint(-83.0F, -23.5F, -0.5F);
/*      */     
/* 2378 */     this.gunModel['Ǹ'].addShapeBox(39.0F, -13.0F, -6.0F, 13, 2, 13, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F);
/* 2379 */     this.gunModel['Ǹ'].setRotationPoint(-88.0F, -20.5F, -0.5F);
/*      */     
/* 2381 */     this.gunModel['ǹ'].addShapeBox(39.0F, -13.0F, -6.0F, 13, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.4F, -2.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.4F, -2.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.0F);
/* 2382 */     this.gunModel['ǹ'].setRotationPoint(-88.0F, -18.5F, -1.5F);
/*      */     
/* 2384 */     this.gunModel['Ǻ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.1F, -0.25F, 0.0F, -2.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, -0.25F, 0.5F, -2.6F, -0.25F, 0.5F, -2.6F, 0.0F, 0.5F, -1.0F);
/* 2385 */     this.gunModel['Ǻ'].setRotationPoint(-88.0F, -17.5F, -1.5F);
/*      */     
/* 2387 */     this.gunModel['ǻ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2388 */     this.gunModel['ǻ'].setRotationPoint(-88.0F, -16.5F, -0.5F);
/*      */     
/* 2390 */     this.gunModel['Ǽ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 15, 0.0F, 0.0F, 0.0F, -3.4F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -2.0F, -0.75F, -4.0F, -2.0F, -0.75F, -4.0F, 0.0F, 0.0F, -3.4F);
/* 2391 */     this.gunModel['Ǽ'].setRotationPoint(-77.0F, -18.5F, -1.5F);
/*      */     
/* 2393 */     this.gunModel['ǽ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 15, 0.0F, 0.0F, 0.0F, -2.1F, 0.25F, 0.0F, -3.4F, 0.25F, 0.0F, -3.4F, 0.0F, 0.0F, -2.1F, 0.0F, 0.5F, -2.6F, 0.25F, -1.0F, -3.4F, 0.25F, -1.0F, -3.4F, 0.0F, 0.5F, -2.6F);
/* 2394 */     this.gunModel['ǽ'].setRotationPoint(-81.25F, -17.5F, -1.5F);
/*      */     
/* 2396 */     this.gunModel['Ǿ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 13, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/* 2397 */     this.gunModel['Ǿ'].setRotationPoint(-85.0F, -16.5F, -0.5F);
/*      */     
/* 2399 */     this.gunModel['ǿ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, -0.5F, -1.5F, -0.25F, -0.5F, -1.6F, -0.25F, -0.5F, -1.6F, 0.0F, -0.5F, -1.5F, 0.0F, -1.25F, -2.0F, -0.25F, -1.5F, -2.0F, -0.25F, -1.5F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 2400 */     this.gunModel['ǿ'].setRotationPoint(-82.0F, -16.5F, -0.5F);
/*      */     
/* 2402 */     this.gunModel['Ȁ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2403 */     this.gunModel['Ȁ'].setRotationPoint(-86.0F, -16.5F, -0.5F);
/*      */     
/* 2405 */     this.gunModel['ȁ'].addShapeBox(39.0F, -13.0F, -6.0F, 25, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2406 */     this.gunModel['ȁ'].setRotationPoint(-114.0F, -15.0F, 1.5F);
/*      */     
/* 2408 */     this.gunModel['Ȃ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2409 */     this.gunModel['Ȃ'].setRotationPoint(-89.0F, -15.0F, 1.5F);
/*      */     
/* 2411 */     this.gunModel['ȃ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.25F, -2.0F);
/* 2412 */     this.gunModel['ȃ'].setRotationPoint(-88.0F, -15.0F, 1.5F);
/*      */     
/* 2414 */     this.gunModel['Ȅ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.75F, -2.0F);
/* 2415 */     this.gunModel['Ȅ'].setRotationPoint(-87.0F, -15.0F, 1.5F);
/*      */     
/* 2417 */     this.gunModel['ȅ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 2418 */     this.gunModel['ȅ'].setRotationPoint(-86.0F, -15.0F, 1.5F);
/*      */     
/* 2420 */     this.gunModel['Ȇ'].addShapeBox(39.0F, -13.0F, -6.0F, 25, 2, 3, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F);
/* 2421 */     this.gunModel['Ȇ'].setRotationPoint(-114.0F, -17.5F, 4.0F);
/*      */     
/* 2423 */     this.gunModel['ȇ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 3, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F);
/* 2424 */     this.gunModel['ȇ'].setRotationPoint(-89.0F, -18.5F, 4.0F);
/*      */     
/* 2426 */     this.gunModel['Ȉ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2427 */     this.gunModel['Ȉ'].setRotationPoint(-133.0F, -15.0F, 1.5F);
/*      */     
/* 2429 */     this.gunModel['ȉ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 7, 0.0F, 0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2430 */     this.gunModel['ȉ'].setRotationPoint(-132.5F, -12.75F, 2.5F);
/*      */     
/* 2432 */     this.gunModel['Ȋ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2433 */     this.gunModel['Ȋ'].setRotationPoint(-64.0F, -25.5F, 2.0F);
/*      */     
/* 2435 */     this.gunModel['ȋ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 8, 0.0F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2436 */     this.gunModel['ȋ'].setRotationPoint(-64.0F, -28.0F, 2.0F);
/*      */     
/* 2438 */     this.gunModel['Ȍ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F);
/* 2439 */     this.gunModel['Ȍ'].setRotationPoint(-64.0F, -23.0F, 2.0F);
/*      */     
/* 2441 */     this.gunModel['ȍ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F);
/* 2442 */     this.gunModel['ȍ'].setRotationPoint(-60.0F, -22.5F, 1.5F);
/*      */     
/* 2444 */     this.gunModel['Ȏ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F);
/* 2445 */     this.gunModel['Ȏ'].setRotationPoint(-60.0F, -25.5F, 1.5F);
/*      */     
/* 2447 */     this.gunModel['ȏ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2448 */     this.gunModel['ȏ'].setRotationPoint(-59.0F, -26.0F, 0.5F);
/*      */     
/* 2450 */     this.gunModel['Ȑ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F);
/* 2451 */     this.gunModel['Ȑ'].setRotationPoint(-59.0F, -22.5F, 0.5F);
/*      */     
/* 2453 */     this.gunModel['ȑ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2454 */     this.gunModel['ȑ'].setRotationPoint(-59.0F, -29.5F, 0.5F);
/*      */     
/* 2456 */     this.gunModel['Ȓ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F);
/* 2457 */     this.gunModel['Ȓ'].setRotationPoint(-60.0F, -28.5F, 1.5F);
/*      */     
/* 2459 */     this.gunModel['ȓ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2460 */     this.gunModel['ȓ'].setRotationPoint(-59.0F, -18.75F, 4.5F);
/*      */     
/* 2462 */     this.gunModel['Ȕ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2463 */     this.gunModel['Ȕ'].setRotationPoint(-59.0F, -18.75F, 1.0F);
/*      */     
/* 2465 */     this.gunModel['ȕ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2466 */     this.gunModel['ȕ'].setRotationPoint(-59.0F, -18.75F, 8.0F);
/*      */     
/* 2468 */     this.gunModel['Ȗ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2469 */     this.gunModel['Ȗ'].setRotationPoint(-59.0F, -14.75F, 1.0F);
/*      */     
/* 2471 */     this.gunModel['ȗ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F);
/* 2472 */     this.gunModel['ȗ'].setRotationPoint(-59.0F, -13.75F, 2.0F);
/*      */     
/* 2474 */     this.gunModel['Ș'].addShapeBox(39.0F, -13.0F, -6.0F, 17, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2475 */     this.gunModel['Ș'].setRotationPoint(-104.0F, -8.5F, 5.5F);
/*      */     
/* 2477 */     this.gunModel['ș'].addShapeBox(39.0F, -13.0F, -6.0F, 15, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2478 */     this.gunModel['ș'].setRotationPoint(-104.0F, -9.5F, 5.5F);
/*      */     
/* 2480 */     this.gunModel['Ț'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F);
/* 2481 */     this.gunModel['Ț'].setRotationPoint(-97.0F, -7.5F, 5.5F);
/*      */     
/* 2483 */     this.gunModel['ț'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 7, 13, 0.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2484 */     this.gunModel['ț'].setRotationPoint(-135.0F, 2.5F, -0.5F);
/*      */     
/* 2486 */     this.gunModel['Ȝ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 8, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2487 */     this.gunModel['Ȝ'].setRotationPoint(-136.0F, -5.5F, -2.5F);
/*      */     
/* 2489 */     this.gunModel['ȝ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 9, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2490 */     this.gunModel['ȝ'].setRotationPoint(-137.0F, -14.5F, -2.5F);
/*      */     
/* 2492 */     this.gunModel['Ȟ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 9, 17, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2493 */     this.gunModel['Ȟ'].setRotationPoint(-136.75F, -23.5F, -2.5F);
/*      */     
/* 2495 */     this.gunModel['ȟ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 5, 17, 0.0F, 0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, 0.75F, 0.0F, -2.5F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 2496 */     this.gunModel['ȟ'].setRotationPoint(-136.75F, -28.5F, -2.5F);
/*      */     
/* 2498 */     this.gunModel['Ƞ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 3, 11, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2499 */     this.gunModel['Ƞ'].setRotationPoint(-137.5F, -31.5F, 0.5F);
/*      */     
/* 2501 */     this.gunModel['ȡ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 2502 */     this.gunModel['ȡ'].setRotationPoint(-137.5F, -32.5F, 1.5F);
/*      */     
/* 2504 */     this.gunModel['Ȣ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 3, 13, 0.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -1.25F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, -1.25F, -0.25F, -2.5F);
/* 2505 */     this.gunModel['Ȣ'].setRotationPoint(-134.0F, 9.5F, -0.5F);
/*      */     
/* 2507 */     this.gunModel['ȣ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 7, 12, 0.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2508 */     this.gunModel['ȣ'].setRotationPoint(-133.0F, 2.5F, 0.0F);
/*      */     
/* 2510 */     this.gunModel['Ȥ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 8, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2511 */     this.gunModel['Ȥ'].setRotationPoint(-134.0F, -5.5F, -2.0F);
/*      */     
/* 2513 */     this.gunModel['ȥ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 9, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2514 */     this.gunModel['ȥ'].setRotationPoint(-135.0F, -14.5F, -2.0F);
/*      */     
/* 2516 */     this.gunModel['Ȧ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 9, 16, 0.0F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2517 */     this.gunModel['Ȧ'].setRotationPoint(-134.75F, -23.5F, -2.0F);
/*      */     
/* 2519 */     this.gunModel['ȧ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 5, 16, 0.0F, 0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, 0.75F, 0.0F, -2.5F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 2520 */     this.gunModel['ȧ'].setRotationPoint(-134.75F, -28.5F, -2.0F);
/*      */     
/* 2522 */     this.gunModel['Ȩ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2523 */     this.gunModel['Ȩ'].setRotationPoint(-135.5F, -31.5F, 1.0F);
/*      */     
/* 2525 */     this.gunModel['ȩ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 2526 */     this.gunModel['ȩ'].setRotationPoint(-135.5F, -32.5F, 2.0F);
/*      */     
/* 2528 */     this.gunModel['Ȫ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 12, 0.0F, -0.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -1.25F, -0.25F, -2.0F, 1.0F, -0.25F, -2.0F, 1.0F, -0.25F, -2.0F, -1.25F, -0.25F, -2.0F);
/* 2529 */     this.gunModel['Ȫ'].setRotationPoint(-132.0F, 9.5F, 0.0F);
/*      */     
/* 2531 */     this.gunModel['ȫ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 15, 0.0F, 0.2F, 0.0F, -0.45F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.2F, 0.0F, -0.45F, -0.15F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, -0.1F);
/* 2532 */     this.gunModel['ȫ'].setRotationPoint(-132.75F, -18.5F, -1.5F);
/*      */     
/* 2534 */     this.gunModel['Ȭ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 15, 0.0F, -0.15F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, -0.1F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
/* 2535 */     this.gunModel['Ȭ'].setRotationPoint(-132.75F, -15.5F, -1.5F);
/*      */     
/* 2537 */     this.gunModel['ȭ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 15, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 2538 */     this.gunModel['ȭ'].setRotationPoint(-132.75F, -14.5F, -1.5F);
/*      */     
/* 2540 */     this.gunModel['Ȯ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2541 */     this.gunModel['Ȯ'].setRotationPoint(-131.0F, -32.0F, 4.0F);
/*      */     
/* 2543 */     this.gunModel['ȯ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 4, 0.0F, -1.25F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2544 */     this.gunModel['ȯ'].setRotationPoint(-134.5F, -34.0F, 4.0F);
/*      */     
/* 2546 */     this.gunModel['Ȱ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 4, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 2547 */     this.gunModel['Ȱ'].setRotationPoint(-132.0F, -34.0F, 4.0F);
/*      */     
/* 2549 */     this.gunModel['ȱ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 4, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2550 */     this.gunModel['ȱ'].setRotationPoint(-131.0F, -34.0F, 4.0F);
/*      */     
/* 2552 */     this.gunModel['Ȳ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 4, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 2553 */     this.gunModel['Ȳ'].setRotationPoint(-134.5F, -32.5F, 4.0F);
/*      */     
/* 2555 */     this.gunModel['ȳ'].addShapeBox(39.0F, -13.0F, -6.0F, 9, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2556 */     this.gunModel['ȳ'].setRotationPoint(-135.0F, -30.0F, 4.0F);
/*      */     
/* 2558 */     this.gunModel['ȴ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 4, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F);
/* 2559 */     this.gunModel['ȴ'].setRotationPoint(-132.5F, -32.5F, 4.0F);
/*      */     
/* 2561 */     this.gunModel['ȵ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 4, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2562 */     this.gunModel['ȵ'].setRotationPoint(-132.5F, -33.5F, 4.0F);
/*      */     
/* 2564 */     this.gunModel['ȶ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 4, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F);
/* 2565 */     this.gunModel['ȶ'].setRotationPoint(-132.5F, -32.5F, 4.0F);
/*      */     
/* 2567 */     this.gunModel['ȷ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 4, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2568 */     this.gunModel['ȷ'].setRotationPoint(-132.5F, -31.5F, 4.0F);
/*      */     
/* 2570 */     this.gunModel['ȸ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 4, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 2571 */     this.gunModel['ȸ'].setRotationPoint(-132.5F, -31.5F, 4.0F);
/*      */     
/* 2573 */     this.gunModel['ȹ'].addShapeBox(39.0F, -13.0F, -6.0F, 9, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2574 */     this.gunModel['ȹ'].setRotationPoint(-135.0F, -29.0F, 4.0F);
/*      */     
/* 2576 */     this.gunModel['Ⱥ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 9, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2577 */     this.gunModel['Ⱥ'].setRotationPoint(-138.0F, -14.5F, -2.5F);
/*      */     
/* 2579 */     this.gunModel['Ȼ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 9, 17, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2580 */     this.gunModel['Ȼ'].setRotationPoint(-138.0F, -23.5F, -2.5F);
/*      */     
/* 2582 */     this.gunModel['ȼ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 7, 13, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 2583 */     this.gunModel['ȼ'].setRotationPoint(-136.0F, 2.5F, -0.5F);
/*      */     
/* 2585 */     this.gunModel['Ƚ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 8, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F);
/* 2586 */     this.gunModel['Ƚ'].setRotationPoint(-137.0F, -5.5F, -2.5F);
/*      */     
/* 2588 */     this.gunModel['Ⱦ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 13, 0.0F, 0.75F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.75F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, 0.75F, -0.25F, -2.5F);
/* 2589 */     this.gunModel['Ⱦ'].setRotationPoint(-138.0F, 9.5F, -0.5F);
/*      */     
/* 2591 */     this.gunModel['ȿ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 5, 17, 0.0F, 0.5F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 2592 */     this.gunModel['ȿ'].setRotationPoint(-137.75F, -28.5F, -2.5F);
/*      */     
/* 2594 */     this.gunModel['ɀ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 11, 0.0F, 1.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 1.0F, -0.5F, -1.5F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F);
/* 2595 */     this.gunModel['ɀ'].setRotationPoint(-138.5F, -31.5F, 0.5F);
/*      */     
/* 2597 */     this.gunModel['Ɂ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 8, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 2598 */     this.gunModel['Ɂ'].setRotationPoint(-139.5F, -32.5F, 1.5F);
/*      */     
/* 2600 */     this.gunModel['ɂ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 17, 0.0F, 0.75F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 0.75F, 0.0F, -2.5F, 1.25F, 0.0F, -1.9F, -0.5F, 0.0F, -1.9F, -0.5F, 0.0F, -1.9F, 1.25F, 0.0F, -1.9F);
/* 2601 */     this.gunModel['ɂ'].setRotationPoint(-139.75F, -28.5F, -2.5F);
/*      */     
/* 2603 */     this.gunModel['Ƀ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 18, 0.0F, 0.75F, 0.0F, -2.4F, -1.0F, 0.0F, -2.4F, -1.0F, 0.0F, -2.4F, 0.75F, 0.0F, -2.4F, 1.25F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, 1.25F, 0.0F, -1.5F);
/* 2604 */     this.gunModel['Ƀ'].setRotationPoint(-140.25F, -26.5F, -3.0F);
/*      */     
/* 2606 */     this.gunModel['Ʉ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 9, 17, 0.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 2607 */     this.gunModel['Ʉ'].setRotationPoint(-141.25F, -23.5F, -2.5F);
/*      */     
/* 2609 */     this.gunModel['Ʌ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 9, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2610 */     this.gunModel['Ʌ'].setRotationPoint(-143.0F, -14.5F, -2.5F);
/*      */     
/* 2612 */     this.gunModel['Ɇ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 8, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 2613 */     this.gunModel['Ɇ'].setRotationPoint(-143.0F, -5.5F, -2.5F);
/*      */     
/* 2615 */     this.gunModel['ɇ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 7, 13, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F);
/* 2616 */     this.gunModel['ɇ'].setRotationPoint(-142.0F, 2.5F, -0.5F);
/*      */     
/* 2618 */     this.gunModel['Ɉ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 13, 0.0F, 0.5F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.25F, -1.7F, 0.25F, 0.25F, -1.7F, 0.25F, 0.25F, -1.7F, 0.0F, 0.25F, -1.7F);
/* 2619 */     this.gunModel['Ɉ'].setRotationPoint(-140.0F, 9.5F, -0.5F);
/*      */     
/* 2621 */     this.gunModel['ɉ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, -0.25F, -1.7F, 0.25F, -0.25F, -1.7F, 0.25F, -0.25F, -1.7F, 0.0F, -0.25F, -1.7F, -1.25F, -0.25F, -2.5F, 0.25F, -0.25F, -2.5F, 0.25F, -0.25F, -2.5F, -1.25F, -0.25F, -2.5F);
/* 2622 */     this.gunModel['ɉ'].setRotationPoint(-140.0F, 10.5F, -0.5F);
/*      */     
/* 2624 */     this.gunModel['Ɋ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2625 */     this.gunModel['Ɋ'].setRotationPoint(-139.75F, -17.5F, -1.5F);
/*      */     
/* 2627 */     this.gunModel['ɋ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 2628 */     this.gunModel['ɋ'].setRotationPoint(-139.75F, -26.5F, 1.0F);
/*      */     
/* 2630 */     this.gunModel['Ɍ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 10, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, -0.25F, 0.0F, 2.5F);
/* 2631 */     this.gunModel['Ɍ'].setRotationPoint(-141.75F, -23.5F, 1.0F);
/*      */     
/* 2633 */     this.gunModel['ɍ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2634 */     this.gunModel['ɍ'].setRotationPoint(-139.25F, -21.5F, -1.5F);
/*      */     
/* 2636 */     this.gunModel['Ɏ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2637 */     this.gunModel['Ɏ'].setRotationPoint(-139.75F, -22.5F, -1.5F);
/*      */     
/* 2639 */     this.gunModel['ɏ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2640 */     this.gunModel['ɏ'].setRotationPoint(-141.75F, -18.5F, -1.5F);
/*      */     
/* 2642 */     this.gunModel['ɐ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2643 */     this.gunModel['ɐ'].setRotationPoint(-139.75F, -20.5F, -1.5F);
/*      */     
/* 2645 */     this.gunModel['ɑ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2646 */     this.gunModel['ɑ'].setRotationPoint(-139.25F, -15.5F, -1.5F);
/*      */     
/* 2648 */     this.gunModel['ɒ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 2649 */     this.gunModel['ɒ'].setRotationPoint(-139.75F, -14.5F, -1.5F);
/*      */     
/* 2651 */     this.gunModel['ɓ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 15, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 2652 */     this.gunModel['ɓ'].setRotationPoint(-142.75F, -13.0F, -1.5F);
/*      */     
/* 2654 */     this.gunModel['ɔ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2655 */     this.gunModel['ɔ'].setRotationPoint(-139.75F, -12.0F, -1.5F);
/*      */     
/* 2657 */     this.gunModel['ɕ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2658 */     this.gunModel['ɕ'].setRotationPoint(-138.75F, -10.0F, -1.5F);
/*      */     
/* 2660 */     this.gunModel['ɖ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 2661 */     this.gunModel['ɖ'].setRotationPoint(-139.25F, -9.0F, -1.5F);
/*      */     
/* 2663 */     this.gunModel['ɗ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2664 */     this.gunModel['ɗ'].setRotationPoint(-142.25F, -7.5F, -1.5F);
/*      */     
/* 2666 */     this.gunModel['ɘ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 2667 */     this.gunModel['ɘ'].setRotationPoint(-139.25F, -6.5F, -1.5F);
/*      */     
/* 2669 */     this.gunModel['ə'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 15, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2670 */     this.gunModel['ə'].setRotationPoint(-138.25F, -4.5F, -1.5F);
/*      */     
/* 2672 */     this.gunModel['ɚ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2673 */     this.gunModel['ɚ'].setRotationPoint(-138.25F, 0.5F, -1.5F);
/*      */     
/* 2675 */     this.gunModel['ɛ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 15, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2676 */     this.gunModel['ɛ'].setRotationPoint(-141.25F, -2.0F, -1.5F);
/*      */     
/* 2678 */     this.gunModel['ɜ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 2679 */     this.gunModel['ɜ'].setRotationPoint(-139.25F, -3.5F, -1.5F);
/*      */     
/* 2681 */     this.gunModel['ɝ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2682 */     this.gunModel['ɝ'].setRotationPoint(-138.25F, -1.5F, -1.5F);
/*      */     
/* 2684 */     this.gunModel['ɞ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2685 */     this.gunModel['ɞ'].setRotationPoint(-141.25F, 2.5F, -1.5F);
/*      */     
/* 2687 */     this.gunModel['ɟ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 10, 0.0F, 1.0F, -0.5F, 2.0F, -1.0F, -0.5F, 2.0F, -1.0F, -0.5F, 2.0F, 1.0F, -0.5F, 2.0F, -1.25F, 0.5F, 1.0F, 1.25F, 0.5F, 1.0F, 1.25F, 0.5F, 1.0F, -1.25F, 0.5F, 1.0F);
/* 2688 */     this.gunModel['ɟ'].setRotationPoint(-138.25F, 3.0F, 1.0F);
/*      */     
/* 2690 */     this.gunModel['ɠ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 10, 0.0F, -1.25F, 0.5F, 0.5F, 1.25F, 0.5F, 0.5F, 1.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2691 */     this.gunModel['ɠ'].setRotationPoint(-138.25F, 7.0F, 1.0F);
/*      */     
/* 2693 */     this.gunModel['ɡ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 10, 0.0F, 0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 2694 */     this.gunModel['ɡ'].setRotationPoint(-136.75F, 5.5F, 1.0F);
/*      */     
/* 2696 */     this.gunModel['ɢ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 6, 10, 0.0F, 1.0F, -0.5F, 2.0F, -0.75F, -0.5F, 2.0F, -0.75F, -0.5F, 2.0F, 1.0F, -0.5F, 2.0F, -1.0F, 1.1F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, -1.0F, 1.1F, 0.0F);
/* 2697 */     this.gunModel['ɢ'].setRotationPoint(-140.25F, 3.0F, 1.0F);
/*      */     
/* 2699 */     this.gunModel['ɣ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 15, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 2700 */     this.gunModel['ɣ'].setRotationPoint(-142.75F, -12.0F, -1.5F);
/*      */     
/* 2702 */     this.gunModel['ɤ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 2703 */     this.gunModel['ɤ'].setRotationPoint(-142.75F, -6.5F, -1.5F);
/*      */     
/* 2705 */     this.gunModel['ɥ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 2706 */     this.gunModel['ɥ'].setRotationPoint(-142.25F, -1.0F, -1.5F);
/*      */     
/* 2708 */     this.gunModel['ɦ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 2709 */     this.gunModel['ɦ'].setRotationPoint(-142.75F, -17.5F, -1.5F);
/*      */     
/* 2711 */     this.gunModel['ɧ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 15, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2712 */     this.gunModel['ɧ'].setRotationPoint(-141.75F, -23.0F, -1.5F);
/*      */     
/* 2714 */     this.gunModel['ɨ'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 27, 15, 0.0F, 1.0F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 1.0F, 0.0F, -2.5F, -0.35F, 0.0F, -2.9F, -0.5F, 0.0F, -2.9F, -0.5F, 0.0F, -2.9F, -0.35F, 0.0F, -2.9F);
/* 2715 */     this.gunModel['ɨ'].setRotationPoint(-140.75F, -17.5F, -1.5F);
/*      */     
/* 2717 */     this.gunModel['ɩ'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 9, 15, 0.0F, 0.2F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 0.2F, 0.0F, -2.5F, 0.25F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 0.25F, 0.0F, -2.5F);
/* 2718 */     this.gunModel['ɩ'].setRotationPoint(-140.75F, -26.5F, -2.0F);
/*      */     
/* 2720 */     this.gunModel['ɪ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2721 */     this.gunModel['ɪ'].setRotationPoint(-41.5F, -13.5F, 11.25F);
/*      */     
/* 2723 */     this.gunModel['ɫ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 2724 */     this.gunModel['ɫ'].setRotationPoint(-41.5F, -12.0F, 11.25F);
/*      */     
/* 2726 */     this.gunModel['ɬ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 1, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2727 */     this.gunModel['ɬ'].setRotationPoint(-41.5F, -15.0F, 11.25F);
/*      */     
/* 2729 */     this.gunModel['ɭ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2730 */     this.gunModel['ɭ'].setRotationPoint(-42.0F, -13.5F, 11.25F);
/*      */     
/* 2732 */     this.gunModel['ɮ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2733 */     this.gunModel['ɮ'].setRotationPoint(-37.0F, -13.5F, 10.75F);
/*      */     
/* 2735 */     this.gunModel['ɯ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2736 */     this.gunModel['ɯ'].setRotationPoint(-33.0F, -13.5F, 10.75F);
/*      */     
/* 2738 */     this.gunModel['ɰ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2739 */     this.gunModel['ɰ'].setRotationPoint(-36.0F, -14.5F, 11.0F);
/*      */     
/* 2741 */     this.gunModel['ɱ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2742 */     this.gunModel['ɱ'].setRotationPoint(-45.5F, -14.5F, 11.0F);
/*      */     
/* 2744 */     this.gunModel['ɲ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2745 */     this.gunModel['ɲ'].setRotationPoint(-41.0F, -17.5F, 10.6F);
/*      */     
/* 2747 */     this.gunModel['ɳ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2748 */     this.gunModel['ɳ'].setRotationPoint(-46.0F, -12.5F, 10.6F);
/*      */     
/* 2750 */     this.gunModel['ɴ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2751 */     this.gunModel['ɴ'].setRotationPoint(-36.0F, -12.5F, 10.6F);
/*      */     
/* 2753 */     this.gunModel['ɵ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F);
/* 2754 */     this.gunModel['ɵ'].setRotationPoint(-39.0F, -13.5F, 11.75F);
/*      */     
/* 2756 */     this.gunModel['ɶ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F);
/* 2757 */     this.gunModel['ɶ'].setRotationPoint(-45.5F, -14.5F, 12.0F);
/*      */     
/* 2759 */     this.gunModel['ɷ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F);
/* 2760 */     this.gunModel['ɷ'].setRotationPoint(-36.0F, -14.5F, 12.0F);
/*      */     
/* 2762 */     this.gunModel['ɸ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2763 */     this.gunModel['ɸ'].setRotationPoint(-18.0F, -16.5F, 11.5F);
/*      */     
/* 2765 */     this.gunModel['ɹ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 2766 */     this.gunModel['ɹ'].setRotationPoint(-18.0F, -14.5F, 11.5F);
/*      */     
/* 2768 */     this.gunModel['ɺ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2769 */     this.gunModel['ɺ'].setRotationPoint(-19.5F, -18.5F, 11.5F);
/*      */     
/* 2771 */     this.gunModel['ɻ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2772 */     this.gunModel['ɻ'].setRotationPoint(-16.5F, -18.5F, 11.5F);
/*      */     
/* 2774 */     this.gunModel['ɼ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2775 */     this.gunModel['ɼ'].setRotationPoint(-18.0F, -19.5F, 11.5F);
/*      */     
/* 2777 */     this.gunModel['ɽ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2778 */     this.gunModel['ɽ'].setRotationPoint(-18.0F, -20.0F, 11.5F);
/*      */     
/* 2780 */     this.gunModel['ɾ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2781 */     this.gunModel['ɾ'].setRotationPoint(-18.0F, -21.0F, 12.0F);
/*      */     
/* 2783 */     this.gunModel['ɿ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2784 */     this.gunModel['ɿ'].setRotationPoint(-18.5F, -21.0F, 12.0F);
/*      */     
/* 2786 */     this.gunModel['ʀ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2787 */     this.gunModel['ʀ'].setRotationPoint(-19.0F, -21.0F, 12.0F);
/*      */     
/* 2789 */     this.gunModel['ʁ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2790 */     this.gunModel['ʁ'].setRotationPoint(-16.5F, -21.0F, 12.0F);
/*      */     
/* 2792 */     this.gunModel['ʂ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2793 */     this.gunModel['ʂ'].setRotationPoint(-16.0F, -21.0F, 12.0F);
/*      */     
/* 2795 */     this.gunModel['ʃ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2796 */     this.gunModel['ʃ'].setRotationPoint(-19.0F, -22.0F, 12.0F);
/*      */     
/* 2798 */     this.gunModel['ʄ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2799 */     this.gunModel['ʄ'].setRotationPoint(-18.5F, -23.25F, 12.0F);
/*      */     
/* 2801 */     this.gunModel['ʅ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2802 */     this.gunModel['ʅ'].setRotationPoint(-19.0F, -23.25F, 12.0F);
/*      */     
/* 2804 */     this.gunModel['ʆ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2805 */     this.gunModel['ʆ'].setRotationPoint(-16.5F, -23.25F, 12.0F);
/*      */     
/* 2807 */     this.gunModel['ʇ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2808 */     this.gunModel['ʇ'].setRotationPoint(-16.0F, -23.25F, 12.0F);
/*      */     
/* 2810 */     this.gunModel['ʈ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2811 */     this.gunModel['ʈ'].setRotationPoint(-18.0F, -23.25F, 12.0F);
/*      */     
/* 2813 */     this.gunModel['ʉ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 2814 */     this.gunModel['ʉ'].setRotationPoint(-18.0F, -17.0F, 11.5F);
/*      */     
/* 2816 */     this.gunModel['ʊ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2817 */     this.gunModel['ʊ'].setRotationPoint(-18.0F, -21.5F, 12.5F);
/*      */     
/* 2819 */     this.gunModel['ʋ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2820 */     this.gunModel['ʋ'].setRotationPoint(-18.0F, -22.0F, 12.5F);
/*      */     
/* 2822 */     this.gunModel['ʌ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 2823 */     this.gunModel['ʌ'].setRotationPoint(-18.0F, -21.0F, 12.5F);
/*      */     
/* 2825 */     this.gunModel['ʍ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2826 */     this.gunModel['ʍ'].setRotationPoint(9.0F, -24.0F, -0.5F);
/*      */     
/* 2828 */     this.gunModel['ʎ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2829 */     this.gunModel['ʎ'].setRotationPoint(9.0F, -27.0F, -1.5F);
/*      */     
/* 2831 */     this.gunModel['ʏ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2832 */     this.gunModel['ʏ'].setRotationPoint(9.0F, -30.0F, 0.5F);
/*      */     
/* 2834 */     this.gunModel['ʐ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2835 */     this.gunModel['ʐ'].setRotationPoint(9.0F, -28.0F, -0.5F);
/*      */     
/* 2837 */     this.gunModel['ʑ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 2, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F);
/* 2838 */     this.gunModel['ʑ'].setRotationPoint(-51.0F, -25.0F, -3.5F);
/*      */     
/* 2840 */     this.gunModel['ʒ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F);
/* 2841 */     this.gunModel['ʒ'].setRotationPoint(-51.0F, -27.0F, -4.5F);
/*      */     
/* 2843 */     this.gunModel['ʓ'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 1.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F);
/* 2844 */     this.gunModel['ʓ'].setRotationPoint(-51.0F, -28.0F, -2.5F);
/*      */     
/* 2846 */     this.gunModel['ʔ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.75F);
/* 2847 */     this.gunModel['ʔ'].setRotationPoint(-40.0F, -25.0F, -3.5F);
/*      */     
/* 2849 */     this.gunModel['ʕ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2850 */     this.gunModel['ʕ'].setRotationPoint(-40.0F, -27.0F, -4.5F);
/*      */     
/* 2852 */     this.gunModel['ʖ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 2853 */     this.gunModel['ʖ'].setRotationPoint(-40.0F, -29.0F, -2.5F);
/*      */     
/* 2855 */     this.gunModel['ʗ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2856 */     this.gunModel['ʗ'].setRotationPoint(-41.5F, -13.5F, -0.5F);
/*      */     
/* 2858 */     this.gunModel['ʘ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 2859 */     this.gunModel['ʘ'].setRotationPoint(-41.5F, -12.0F, -0.5F);
/*      */     
/* 2861 */     this.gunModel['ʙ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 1, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2862 */     this.gunModel['ʙ'].setRotationPoint(-41.5F, -15.0F, -0.5F);
/*      */     
/* 2864 */     this.gunModel['ʚ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2865 */     this.gunModel['ʚ'].setRotationPoint(-42.0F, -13.5F, -0.5F);
/*      */     
/* 2867 */     this.gunModel['ʛ'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2868 */     this.gunModel['ʛ'].setRotationPoint(-37.0F, -13.5F, -1.0F);
/*      */     
/* 2870 */     this.gunModel['ʜ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2871 */     this.gunModel['ʜ'].setRotationPoint(-33.0F, -13.5F, -1.0F);
/*      */     
/* 2873 */     this.gunModel['ʝ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2874 */     this.gunModel['ʝ'].setRotationPoint(-36.0F, -14.5F, 0.0F);
/*      */     
/* 2876 */     this.gunModel['ʞ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2877 */     this.gunModel['ʞ'].setRotationPoint(-45.5F, -14.5F, 0.0F);
/*      */     
/* 2879 */     this.gunModel['ʟ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2880 */     this.gunModel['ʟ'].setRotationPoint(-41.0F, -17.5F, 0.4F);
/*      */     
/* 2882 */     this.gunModel['ʠ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2883 */     this.gunModel['ʠ'].setRotationPoint(-46.0F, -12.5F, 0.4F);
/*      */     
/* 2885 */     this.gunModel['ʡ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2886 */     this.gunModel['ʡ'].setRotationPoint(-36.0F, -12.5F, 0.4F);
/*      */     
/* 2888 */     this.gunModel['ʢ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 1, 0.0F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2889 */     this.gunModel['ʢ'].setRotationPoint(-39.0F, -13.5F, -1.0F);
/*      */     
/* 2891 */     this.gunModel['ʣ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2892 */     this.gunModel['ʣ'].setRotationPoint(-45.5F, -14.5F, -1.0F);
/*      */     
/* 2894 */     this.gunModel['ʤ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2895 */     this.gunModel['ʤ'].setRotationPoint(-36.0F, -14.5F, -1.0F);
/*      */     
/* 2897 */     this.gunModel['ʥ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 11, 1, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2898 */     this.gunModel['ʥ'].setRotationPoint(-11.5F, -14.5F, -1.0F);
/*      */     
/* 2900 */     this.gunModel['ʦ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.5F, -0.25F, -0.5F, -1.75F, -0.25F, -0.5F, -1.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 2901 */     this.gunModel['ʦ'].setRotationPoint(-11.5F, -3.5F, -1.0F);
/*      */     
/* 2903 */     this.gunModel['ʧ'].addShapeBox(39.0F, -13.0F, -6.0F, 23, 3, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2904 */     this.gunModel['ʧ'].setRotationPoint(-15.5F, -17.0F, -1.0F);
/*      */     
/* 2906 */     this.gunModel['ʨ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2907 */     this.gunModel['ʨ'].setRotationPoint(7.5F, -17.0F, -1.0F);
/*      */     
/* 2909 */     this.gunModel['ʩ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2910 */     this.gunModel['ʩ'].setRotationPoint(-16.5F, -17.0F, -1.0F);
/*      */     
/* 2912 */     this.gunModel['ʪ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2913 */     this.gunModel['ʪ'].setRotationPoint(-13.75F, -7.0F, -1.0F);
/*      */     
/* 2915 */     this.gunModel['ʫ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2916 */     this.gunModel['ʫ'].setRotationPoint(-14.75F, -7.0F, -1.0F);
/*      */     
/* 2918 */     this.gunModel['ʬ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2919 */     this.gunModel['ʬ'].setRotationPoint(-17.5F, -11.5F, -1.0F);
/*      */     
/* 2921 */     this.gunModel['ʭ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2922 */     this.gunModel['ʭ'].setRotationPoint(-17.5F, -12.5F, -1.0F);
/*      */     
/* 2924 */     this.gunModel['ʮ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2925 */     this.gunModel['ʮ'].setRotationPoint(-17.5F, -10.5F, -1.0F);
/*      */     
/* 2927 */     this.gunModel['ʯ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2928 */     this.gunModel['ʯ'].setRotationPoint(-53.0F, -27.55F, -12.25F);
/* 2929 */     this.gunModel['ʯ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2931 */     this.gunModel['ʰ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2932 */     this.gunModel['ʰ'].setRotationPoint(-53.0F, -26.55F, -12.25F);
/* 2933 */     this.gunModel['ʰ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2935 */     this.gunModel['ʱ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F);
/* 2936 */     this.gunModel['ʱ'].setRotationPoint(-53.0F, -25.55F, -12.25F);
/* 2937 */     this.gunModel['ʱ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2939 */     this.gunModel['ʲ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2940 */     this.gunModel['ʲ'].setRotationPoint(-54.0F, -26.4F, -12.65F);
/* 2941 */     this.gunModel['ʲ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2943 */     this.gunModel['ʳ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F);
/* 2944 */     this.gunModel['ʳ'].setRotationPoint(-54.0F, -25.4F, -12.65F);
/* 2945 */     this.gunModel['ʳ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2947 */     this.gunModel['ʴ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2948 */     this.gunModel['ʴ'].setRotationPoint(-54.0F, -27.65F, -12.65F);
/* 2949 */     this.gunModel['ʴ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2951 */     this.gunModel['ʵ'].addShapeBox(39.0F, -13.0F, -6.0F, 28, 3, 2, 0.0F, 2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F);
/* 2952 */     this.gunModel['ʵ'].setRotationPoint(-19.0F, -30.0F, -1.5F);
/*      */     
/* 2954 */     this.gunModel['ʶ'].addShapeBox(39.0F, -13.0F, -6.0F, 27, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F);
/* 2955 */     this.gunModel['ʶ'].setRotationPoint(-19.5F, -19.25F, -1.5F);
/*      */     
/* 2957 */     this.gunModel['ʷ'].addShapeBox(39.0F, -13.0F, -6.0F, 27, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 2958 */     this.gunModel['ʷ'].setRotationPoint(-19.5F, -15.25F, -1.9F);
/*      */     
/* 2960 */     this.gunModel['ʸ'].addShapeBox(39.0F, -13.0F, -6.0F, 26, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F);
/* 2961 */     this.gunModel['ʸ'].setRotationPoint(-19.0F, -14.25F, -2.15F);
/*      */     
/* 2963 */     this.gunModel['ʹ'].addShapeBox(39.0F, -13.0F, -6.0F, 27, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2964 */     this.gunModel['ʹ'].setRotationPoint(-19.5F, -21.0F, -0.25F);
/*      */     
/* 2966 */     this.gunModel['ʺ'].addShapeBox(39.0F, -13.0F, -6.0F, 27, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 2967 */     this.gunModel['ʺ'].setRotationPoint(-19.5F, -20.0F, -0.5F);
/*      */     
/* 2969 */     this.gunModel['ʻ'].addShapeBox(39.0F, -13.0F, -6.0F, 27, 1, 3, 0.0F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2970 */     this.gunModel['ʻ'].setRotationPoint(-19.5F, -21.75F, -0.5F);
/*      */     
/* 2972 */     this.gunModel['ʼ'].addShapeBox(39.0F, -13.0F, -6.0F, 27, 1, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2973 */     this.gunModel['ʼ'].setRotationPoint(-19.5F, -20.25F, -1.25F);
/*      */     
/* 2975 */     this.gunModel['ʽ'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2976 */     this.gunModel['ʽ'].setRotationPoint(20.0F, -20.25F, -1.0F);
/*      */     
/* 2978 */     this.gunModel['ʾ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2979 */     this.gunModel['ʾ'].setRotationPoint(22.5F, -18.5F, -1.5F);
/*      */     
/* 2981 */     this.gunModel['ʿ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2982 */     this.gunModel['ʿ'].setRotationPoint(22.5F, -19.0F, -1.5F);
/*      */     
/* 2984 */     this.gunModel['ˀ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 2985 */     this.gunModel['ˀ'].setRotationPoint(22.5F, -18.0F, -1.5F);
/*      */     
/* 2987 */     this.gunModel['ˁ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 4, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2988 */     this.gunModel['ˁ'].setRotationPoint(-27.0F, -30.0F, -3.25F);
/*      */     
/* 2990 */     this.gunModel['˂'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2991 */     this.gunModel['˂'].setRotationPoint(-24.0F, -28.0F, -3.25F);
/*      */     
/* 2993 */     this.gunModel['˃'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, -1.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 2994 */     this.gunModel['˃'].setRotationPoint(-24.0F, -26.0F, -3.25F);
/*      */     
/* 2996 */     this.gunModel['˄'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2997 */     this.gunModel['˄'].setRotationPoint(-24.0F, -26.5F, -3.25F);
/*      */     
/* 2999 */     this.gunModel['˅'].addShapeBox(39.0F, -13.0F, -6.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3000 */     this.gunModel['˅'].setRotationPoint(-24.0F, -30.0F, -3.25F);
/*      */     
/* 3002 */     this.gunModel['ˆ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 3003 */     this.gunModel['ˆ'].setRotationPoint(-27.0F, -28.0F, -3.25F);
/*      */     
/* 3005 */     this.gunModel['ˇ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, -2.0F, 0.5F, -1.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 3006 */     this.gunModel['ˇ'].setRotationPoint(-27.0F, -26.5F, -3.25F);
/*      */     
/* 3008 */     this.gunModel['ˈ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3009 */     this.gunModel['ˈ'].setRotationPoint(-20.0F, -24.0F, -1.25F);
/*      */     
/* 3011 */     this.gunModel['ˉ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3012 */     this.gunModel['ˉ'].setRotationPoint(-20.0F, -20.0F, -1.25F);
/*      */     
/* 3014 */     this.gunModel['ˊ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3015 */     this.gunModel['ˊ'].setRotationPoint(-20.0F, -21.0F, -1.25F);
/*      */     
/* 3017 */     this.gunModel['ˋ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 8, 6, 0.0F, -0.5F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F);
/* 3018 */     this.gunModel['ˋ'].setRotationPoint(7.0F, -28.0F, -3.5F);
/*      */     
/* 3020 */     this.gunModel['ˌ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 3, 6, 0.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F, -0.5F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 3021 */     this.gunModel['ˌ'].setRotationPoint(7.0F, -21.0F, -3.5F);
/*      */     
/* 3023 */     this.gunModel['ˍ'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 6, 0.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F);
/* 3024 */     this.gunModel['ˍ'].setRotationPoint(7.0F, -22.0F, -3.5F);
/*      */     
/* 3026 */     this.gunModel['ˎ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 3027 */     this.gunModel['ˎ'].setRotationPoint(100.0F, -29.0F, -3.5F);
/*      */     
/* 3029 */     this.gunModel['ˏ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/* 3030 */     this.gunModel['ˏ'].setRotationPoint(90.0F, -21.25F, 11.5F);
/*      */     
/* 3032 */     this.gunModel['ː'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/* 3033 */     this.gunModel['ː'].setRotationPoint(90.0F, -22.25F, 12.5F);
/*      */     
/* 3035 */     this.gunModel['ˑ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/* 3036 */     this.gunModel['ˑ'].setRotationPoint(101.0F, -21.25F, 11.5F);
/*      */     
/* 3038 */     this.gunModel['˒'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/* 3039 */     this.gunModel['˒'].setRotationPoint(101.0F, -22.25F, 12.5F);
/*      */     
/* 3041 */     this.gunModel['˓'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 3042 */     this.gunModel['˓'].setRotationPoint(90.0F, -21.25F, -1.5F);
/*      */     
/* 3044 */     this.gunModel['˔'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 3045 */     this.gunModel['˔'].setRotationPoint(90.0F, -22.25F, -3.5F);
/*      */     
/* 3047 */     this.gunModel['˕'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 3048 */     this.gunModel['˕'].setRotationPoint(101.0F, -21.25F, -1.5F);
/*      */     
/* 3050 */     this.gunModel['˖'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 3051 */     this.gunModel['˖'].setRotationPoint(101.0F, -22.25F, -3.5F);
/*      */     
/* 3053 */     this.gunModel['˗'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 3054 */     this.gunModel['˗'].setRotationPoint(100.0F, -30.0F, -1.5F);
/*      */     
/* 3056 */     this.gunModel['˘'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3057 */     this.gunModel['˘'].setRotationPoint(89.0F, -28.0F, -3.5F);
/*      */     
/* 3059 */     this.gunModel['˙'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3060 */     this.gunModel['˙'].setRotationPoint(93.0F, -29.0F, -3.5F);
/*      */     
/* 3062 */     this.gunModel['˚'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 3063 */     this.gunModel['˚'].setRotationPoint(99.25F, -29.0F, -3.5F);
/*      */     
/* 3065 */     this.gunModel['˛'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3066 */     this.gunModel['˛'].setRotationPoint(93.0F, -30.0F, -1.0F);
/*      */     
/* 3068 */     this.gunModel['˜'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 3069 */     this.gunModel['˜'].setRotationPoint(99.25F, -30.0F, -1.0F);
/*      */     
/* 3071 */     this.gunModel['˝'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 3072 */     this.gunModel['˝'].setRotationPoint(101.0F, -21.25F, 10.5F);
/*      */     
/* 3074 */     this.gunModel['˞'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 3075 */     this.gunModel['˞'].setRotationPoint(101.0F, -21.25F, 0.5F);
/*      */     
/* 3077 */     this.gunModel['˟'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 3078 */     this.gunModel['˟'].setRotationPoint(90.0F, -21.25F, 10.5F);
/*      */     
/* 3080 */     this.gunModel['ˠ'].addShapeBox(39.0F, -13.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 3081 */     this.gunModel['ˠ'].setRotationPoint(90.0F, -21.25F, 0.5F);
/*      */     
/* 3083 */     this.gunModel['ˡ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 3084 */     this.gunModel['ˡ'].setRotationPoint(100.0F, -30.0F, 0.5F);
/*      */     
/* 3086 */     this.gunModel['ˢ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/* 3087 */     this.gunModel['ˢ'].setRotationPoint(100.0F, -30.0F, 11.5F);
/*      */     
/* 3089 */     this.gunModel['ˣ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/* 3090 */     this.gunModel['ˣ'].setRotationPoint(100.0F, -29.0F, 12.5F);
/*      */     
/* 3092 */     this.gunModel['ˤ'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 3093 */     this.gunModel['ˤ'].setRotationPoint(100.0F, -30.0F, 10.5F);
/*      */     
/* 3095 */     this.gunModel['˥'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/* 3096 */     this.gunModel['˥'].setRotationPoint(93.0F, -20.25F, 12.5F);
/*      */     
/* 3098 */     this.gunModel['˦'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/* 3099 */     this.gunModel['˦'].setRotationPoint(100.25F, -20.25F, 12.5F);
/*      */     
/* 3101 */     this.gunModel['˧'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 3102 */     this.gunModel['˧'].setRotationPoint(93.0F, -19.25F, 11.0F);
/*      */     
/* 3104 */     this.gunModel['˨'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/* 3105 */     this.gunModel['˨'].setRotationPoint(100.25F, -19.25F, 11.0F);
/*      */     
/* 3107 */     this.gunModel['˩'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/* 3108 */     this.gunModel['˩'].setRotationPoint(93.0F, -21.25F, 12.5F);
/*      */     
/* 3110 */     this.gunModel['˪'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/* 3111 */     this.gunModel['˪'].setRotationPoint(82.0F, -20.25F, 12.5F);
/*      */     
/* 3113 */     this.gunModel['˫'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/* 3114 */     this.gunModel['˫'].setRotationPoint(89.25F, -20.25F, 12.5F);
/*      */     
/* 3116 */     this.gunModel['ˬ'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 3117 */     this.gunModel['ˬ'].setRotationPoint(82.0F, -19.25F, 11.0F);
/*      */     
/* 3119 */     this.gunModel['˭'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/* 3120 */     this.gunModel['˭'].setRotationPoint(89.25F, -19.25F, 11.0F);
/*      */     
/* 3122 */     this.gunModel['ˮ'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/* 3123 */     this.gunModel['ˮ'].setRotationPoint(82.0F, -21.25F, 12.5F);
/*      */     
/* 3125 */     this.gunModel['˯'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3126 */     this.gunModel['˯'].setRotationPoint(93.0F, -28.0F, 12.5F);
/*      */     
/* 3128 */     this.gunModel['˰'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 3129 */     this.gunModel['˰'].setRotationPoint(93.0F, -29.0F, 12.5F);
/*      */     
/* 3131 */     this.gunModel['˱'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/* 3132 */     this.gunModel['˱'].setRotationPoint(99.25F, -29.0F, 12.5F);
/*      */     
/* 3134 */     this.gunModel['˲'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 3135 */     this.gunModel['˲'].setRotationPoint(93.0F, -30.0F, 11.0F);
/*      */     
/* 3137 */     this.gunModel['˳'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/* 3138 */     this.gunModel['˳'].setRotationPoint(99.25F, -30.0F, 11.0F);
/*      */     
/* 3140 */     this.gunModel['˴'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3141 */     this.gunModel['˴'].setRotationPoint(31.0F, -21.25F, -3.5F);
/*      */     
/* 3143 */     this.gunModel['˵'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3144 */     this.gunModel['˵'].setRotationPoint(31.0F, -20.25F, -3.5F);
/*      */     
/* 3146 */     this.gunModel['˶'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3147 */     this.gunModel['˶'].setRotationPoint(36.25F, -20.25F, -3.5F);
/*      */     
/* 3149 */     this.gunModel['˷'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3150 */     this.gunModel['˷'].setRotationPoint(31.0F, -19.25F, -1.0F);
/*      */     
/* 3152 */     this.gunModel['˸'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3153 */     this.gunModel['˸'].setRotationPoint(36.25F, -19.25F, -1.0F);
/*      */     
/* 3155 */     this.gunModel['˹'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3156 */     this.gunModel['˹'].setRotationPoint(43.0F, -21.25F, -3.5F);
/*      */     
/* 3158 */     this.gunModel['˺'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3159 */     this.gunModel['˺'].setRotationPoint(43.0F, -20.25F, -3.5F);
/*      */     
/* 3161 */     this.gunModel['˻'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3162 */     this.gunModel['˻'].setRotationPoint(53.25F, -20.25F, -3.5F);
/*      */     
/* 3164 */     this.gunModel['˼'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3165 */     this.gunModel['˼'].setRotationPoint(43.0F, -19.25F, -1.0F);
/*      */     
/* 3167 */     this.gunModel['˽'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3168 */     this.gunModel['˽'].setRotationPoint(53.25F, -19.25F, -1.0F);
/*      */     
/* 3170 */     this.gunModel['˾'].addShapeBox(39.0F, -13.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3171 */     this.gunModel['˾'].setRotationPoint(60.0F, -21.25F, -3.5F);
/*      */     
/* 3173 */     this.gunModel['˿'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3174 */     this.gunModel['˿'].setRotationPoint(60.0F, -20.25F, -3.5F);
/*      */     
/* 3176 */     this.gunModel['̀'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3177 */     this.gunModel['̀'].setRotationPoint(71.25F, -20.25F, -3.5F);
/*      */     
/* 3179 */     this.gunModel['́'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3180 */     this.gunModel['́'].setRotationPoint(60.0F, -19.25F, -1.0F);
/*      */     
/* 3182 */     this.gunModel['̂'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3183 */     this.gunModel['̂'].setRotationPoint(71.25F, -19.25F, -1.0F);
/*      */     
/* 3185 */     this.gunModel['̃'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3186 */     this.gunModel['̃'].setRotationPoint(75.0F, -21.25F, -3.5F);
/*      */     
/* 3188 */     this.gunModel['̄'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3189 */     this.gunModel['̄'].setRotationPoint(75.0F, -20.25F, -3.5F);
/*      */     
/* 3191 */     this.gunModel['̅'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3192 */     this.gunModel['̅'].setRotationPoint(78.25F, -20.25F, -3.5F);
/*      */     
/* 3194 */     this.gunModel['̆'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3195 */     this.gunModel['̆'].setRotationPoint(75.0F, -19.25F, -1.0F);
/*      */     
/* 3197 */     this.gunModel['̇'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3198 */     this.gunModel['̇'].setRotationPoint(78.25F, -19.25F, -1.0F);
/*      */     
/* 3200 */     this.gunModel['̈'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3201 */     this.gunModel['̈'].setRotationPoint(82.0F, -21.25F, -3.5F);
/*      */     
/* 3203 */     this.gunModel['̉'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3204 */     this.gunModel['̉'].setRotationPoint(82.0F, -20.25F, -3.5F);
/*      */     
/* 3206 */     this.gunModel['̊'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3207 */     this.gunModel['̊'].setRotationPoint(89.25F, -20.25F, -3.5F);
/*      */     
/* 3209 */     this.gunModel['̋'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3210 */     this.gunModel['̋'].setRotationPoint(82.0F, -19.25F, -1.0F);
/*      */     
/* 3212 */     this.gunModel['̌'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3213 */     this.gunModel['̌'].setRotationPoint(89.25F, -19.25F, -1.0F);
/*      */     
/* 3215 */     this.gunModel['̍'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3216 */     this.gunModel['̍'].setRotationPoint(93.0F, -21.25F, -3.5F);
/*      */     
/* 3218 */     this.gunModel['̎'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3219 */     this.gunModel['̎'].setRotationPoint(93.0F, -20.25F, -3.5F);
/*      */     
/* 3221 */     this.gunModel['̏'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3222 */     this.gunModel['̏'].setRotationPoint(100.25F, -20.25F, -3.5F);
/*      */     
/* 3224 */     this.gunModel['̐'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3225 */     this.gunModel['̐'].setRotationPoint(93.0F, -19.25F, -1.0F);
/*      */     
/* 3227 */     this.gunModel['̑'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3228 */     this.gunModel['̑'].setRotationPoint(100.25F, -19.25F, -1.0F);
/*      */     
/* 3230 */     this.gunModel['̒'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3231 */     this.gunModel['̒'].setRotationPoint(93.0F, -29.0F, -3.5F);
/*      */     
/* 3233 */     this.gunModel['̓'].addShapeBox(39.0F, -13.0F, -6.0F, 7, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/* 3234 */     this.gunModel['̓'].setRotationPoint(93.0F, -29.0F, 12.5F);
/*      */     
/* 3236 */     this.gunModel['̔'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/* 3237 */     this.gunModel['̔'].setRotationPoint(31.0F, -29.0F, 12.5F);
/*      */     
/* 3239 */     this.gunModel['̕'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3240 */     this.gunModel['̕'].setRotationPoint(43.0F, -22.25F, 12.5F);
/*      */     
/* 3242 */     this.gunModel['̖'].addShapeBox(39.0F, -13.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3243 */     this.gunModel['̖'].setRotationPoint(60.0F, -22.25F, 12.5F);
/*      */     
/* 3245 */     this.gunModel['̗'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3246 */     this.gunModel['̗'].setRotationPoint(75.0F, -22.25F, 12.5F);
/*      */     
/* 3248 */     this.gunModel['̘'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3249 */     this.gunModel['̘'].setRotationPoint(82.0F, -22.25F, 12.5F);
/*      */     
/* 3251 */     this.gunModel['̙'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3252 */     this.gunModel['̙'].setRotationPoint(93.0F, -22.25F, 12.5F);
/*      */     
/* 3254 */     this.gunModel['̚'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3255 */     this.gunModel['̚'].setRotationPoint(31.0F, -22.25F, -3.5F);
/*      */     
/* 3257 */     this.gunModel['̛'].addShapeBox(39.0F, -13.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3258 */     this.gunModel['̛'].setRotationPoint(43.0F, -22.25F, -3.5F);
/*      */     
/* 3260 */     this.gunModel['̜'].addShapeBox(39.0F, -13.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3261 */     this.gunModel['̜'].setRotationPoint(60.0F, -22.25F, -3.5F);
/*      */     
/* 3263 */     this.gunModel['̝'].addShapeBox(39.0F, -13.0F, -6.0F, 4, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3264 */     this.gunModel['̝'].setRotationPoint(75.0F, -22.25F, -3.5F);
/*      */     
/* 3266 */     this.gunModel['̞'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3267 */     this.gunModel['̞'].setRotationPoint(82.0F, -22.25F, -3.5F);
/*      */     
/* 3269 */     this.gunModel['̟'].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3270 */     this.gunModel['̟'].setRotationPoint(93.0F, -22.25F, -3.5F);
/*      */     
/* 3272 */     this.gunModel['̠'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 9, 1, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -6.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -6.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F);
/* 3273 */     this.gunModel['̠'].setRotationPoint(102.0F, -28.5F, 16.0F);
/*      */     
/* 3275 */     this.gunModel['̡'].addShapeBox(39.0F, -13.0F, -6.0F, 6, 9, 1, 0.0F, 0.0F, -1.5F, -0.5F, -6.0F, -1.5F, -0.5F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, -0.5F, -6.0F, -1.75F, -0.5F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 3276 */     this.gunModel['̡'].setRotationPoint(102.0F, -28.5F, -5.0F);
/*      */     
/* 3278 */     this.gunModel['̢'].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -1.5F, -0.5F, -1.0F, -1.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F);
/* 3279 */     this.gunModel['̢'].setRotationPoint(102.0F, -16.25F, 0.0F);
/*      */     
/* 3281 */     this.gunModel['̣'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 7, 0.0F, 2.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, -3.0F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 0.5F, -0.5F, 1.25F, -3.0F, -0.5F, 1.25F, -3.0F, -0.5F, 1.25F, 0.5F, -0.5F, 1.25F);
/* 3282 */     this.gunModel['̣'].setRotationPoint(100.0F, -37.5F, 2.5F);
/*      */     
/* 3284 */     this.gunModel['̤'].addShapeBox(39.0F, -13.0F, -6.0F, 94, 9, 1, 0.0F, -0.25F, -1.5F, -0.5F, -3.0F, -1.5F, -0.5F, -3.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.75F, -0.5F, -3.0F, -1.75F, -0.5F, -3.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 3285 */     this.gunModel['̤'].setRotationPoint(11.0F, -28.5F, -5.0F);
/*      */     
/* 3287 */     this.gunModel['̥'].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 9, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F);
/* 3288 */     this.gunModel['̥'].setRotationPoint(-39.5F, -37.5F, 1.5F);
/*      */   }
/*      */   
/*      */   private void initdefaultBarrelModel_1()
/*      */   {
/* 3293 */     this.defaultBarrelModel[0] = new ModelRendererTurbo(this, 529, 57, this.textureX, this.textureY);
/* 3294 */     this.defaultBarrelModel[1] = new ModelRendererTurbo(this, 553, 57, this.textureX, this.textureY);
/* 3295 */     this.defaultBarrelModel[2] = new ModelRendererTurbo(this, 1241, 57, this.textureX, this.textureY);
/* 3296 */     this.defaultBarrelModel[3] = new ModelRendererTurbo(this, 849, 49, this.textureX, this.textureY);
/* 3297 */     this.defaultBarrelModel[4] = new ModelRendererTurbo(this, 1265, 57, this.textureX, this.textureY);
/* 3298 */     this.defaultBarrelModel[5] = new ModelRendererTurbo(this, 881, 49, this.textureX, this.textureY);
/* 3299 */     this.defaultBarrelModel[6] = new ModelRendererTurbo(this, 905, 49, this.textureX, this.textureY);
/* 3300 */     this.defaultBarrelModel[7] = new ModelRendererTurbo(this, 937, 49, this.textureX, this.textureY);
/* 3301 */     this.defaultBarrelModel[8] = new ModelRendererTurbo(this, 1729, 49, this.textureX, this.textureY);
/* 3302 */     this.defaultBarrelModel[9] = new ModelRendererTurbo(this, 1929, 49, this.textureX, this.textureY);
/* 3303 */     this.defaultBarrelModel[10] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/* 3304 */     this.defaultBarrelModel[11] = new ModelRendererTurbo(this, 1233, 57, this.textureX, this.textureY);
/* 3305 */     this.defaultBarrelModel[12] = new ModelRendererTurbo(this, 1025, 73, this.textureX, this.textureY);
/* 3306 */     this.defaultBarrelModel[13] = new ModelRendererTurbo(this, 1369, 73, this.textureX, this.textureY);
/* 3307 */     this.defaultBarrelModel[14] = new ModelRendererTurbo(this, 1105, 89, this.textureX, this.textureY);
/*      */     
/* 3309 */     this.defaultBarrelModel[0].addShapeBox(39.0F, -13.0F, -6.0F, 2, 8, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3310 */     this.defaultBarrelModel[0].setRotationPoint(141.0F, -28.5F, 2.0F);
/*      */     
/* 3312 */     this.defaultBarrelModel[1].addShapeBox(39.0F, -13.0F, -6.0F, 1, 8, 8, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F);
/* 3313 */     this.defaultBarrelModel[1].setRotationPoint(144.0F, -28.5F, 2.0F);
/*      */     
/* 3315 */     this.defaultBarrelModel[2].addShapeBox(39.0F, -13.0F, -6.0F, 3, 8, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3316 */     this.defaultBarrelModel[2].setRotationPoint(146.0F, -28.5F, 2.0F);
/*      */     
/* 3318 */     this.defaultBarrelModel[3].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 3319 */     this.defaultBarrelModel[3].setRotationPoint(149.0F, -28.5F, 2.0F);
/*      */     
/* 3321 */     this.defaultBarrelModel[4].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3322 */     this.defaultBarrelModel[4].setRotationPoint(149.0F, -22.5F, 2.0F);
/*      */     
/* 3324 */     this.defaultBarrelModel[5].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3325 */     this.defaultBarrelModel[5].setRotationPoint(149.0F, -26.0F, 2.0F);
/*      */     
/* 3327 */     this.defaultBarrelModel[6].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3328 */     this.defaultBarrelModel[6].setRotationPoint(149.0F, -28.5F, 6.0F);
/*      */     
/* 3330 */     this.defaultBarrelModel[7].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3331 */     this.defaultBarrelModel[7].setRotationPoint(155.0F, -24.5F, 2.0F);
/*      */     
/* 3333 */     this.defaultBarrelModel[8].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3334 */     this.defaultBarrelModel[8].setRotationPoint(155.0F, -27.5F, 2.0F);
/*      */     
/* 3336 */     this.defaultBarrelModel[9].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3337 */     this.defaultBarrelModel[9].setRotationPoint(155.0F, -28.5F, 5.0F);
/*      */     
/* 3339 */     this.defaultBarrelModel[10].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3340 */     this.defaultBarrelModel[10].setRotationPoint(155.0F, -24.5F, 8.0F);
/*      */     
/* 3342 */     this.defaultBarrelModel[11].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3343 */     this.defaultBarrelModel[11].setRotationPoint(155.0F, -27.5F, 8.0F);
/*      */     
/* 3345 */     this.defaultBarrelModel[12].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3346 */     this.defaultBarrelModel[12].setRotationPoint(149.0F, -26.0F, 8.0F);
/*      */     
/* 3348 */     this.defaultBarrelModel[13].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3349 */     this.defaultBarrelModel[13].setRotationPoint(149.0F, -23.5F, 2.0F);
/*      */     
/* 3351 */     this.defaultBarrelModel[14].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3352 */     this.defaultBarrelModel[14].setRotationPoint(149.0F, -23.5F, 8.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 3357 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 3358 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/* 3359 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 1801, 81, this.textureX, this.textureY);
/* 3360 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1865, 81, this.textureX, this.textureY);
/* 3361 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 1929, 81, this.textureX, this.textureY);
/* 3362 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 1201, 9, this.textureX, this.textureY);
/* 3363 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 1977, 9, this.textureX, this.textureY);
/* 3364 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 1993, 9, this.textureX, this.textureY);
/* 3365 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 873, 89, this.textureX, this.textureY);
/* 3366 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 897, 89, this.textureX, this.textureY);
/* 3367 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 1881, 145, this.textureX, this.textureY);
/* 3368 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/* 3369 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 3370 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/* 3371 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/* 3372 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 3373 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/* 3374 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 1033, 145, this.textureX, this.textureY);
/* 3375 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 1281, 145, this.textureX, this.textureY);
/* 3376 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 1553, 145, this.textureX, this.textureY);
/* 3377 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 1633, 145, this.textureX, this.textureY);
/* 3378 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 1929, 145, this.textureX, this.textureY);
/* 3379 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/* 3380 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/* 3381 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/* 3382 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 857, 89, this.textureX, this.textureY);
/* 3383 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 1145, 89, this.textureX, this.textureY);
/* 3384 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 985, 153, this.textureX, this.textureY);
/* 3385 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 1697, 137, this.textureX, this.textureY);
/* 3386 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 1321, 137, this.textureX, this.textureY);
/* 3387 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 1529, 137, this.textureX, this.textureY);
/* 3388 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 1673, 137, this.textureX, this.textureY);
/* 3389 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 57, 145, this.textureX, this.textureY);
/* 3390 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 1201, 145, this.textureX, this.textureY);
/* 3391 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 2025, 145, this.textureX, this.textureY);
/* 3392 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 57, 153, this.textureX, this.textureY);
/* 3393 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 1993, 49, this.textureX, this.textureY);
/* 3394 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 1513, 17, this.textureX, this.textureY);
/* 3395 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 177, 153, this.textureX, this.textureY);
/* 3396 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/* 3397 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 1745, 25, this.textureX, this.textureY);
/* 3398 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/* 3399 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 441, 145, this.textureX, this.textureY);
/* 3400 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 1049, 153, this.textureX, this.textureY);
/* 3401 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 1105, 153, this.textureX, this.textureY);
/* 3402 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 1241, 153, this.textureX, this.textureY);
/* 3403 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 1361, 153, this.textureX, this.textureY);
/* 3404 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 1385, 153, this.textureX, this.textureY);
/* 3405 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 1177, 153, this.textureX, this.textureY);
/* 3406 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 1129, 153, this.textureX, this.textureY);
/* 3407 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 1265, 153, this.textureX, this.textureY);
/* 3408 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 1369, 129, this.textureX, this.textureY);
/* 3409 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 1409, 153, this.textureX, this.textureY);
/* 3410 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 1433, 153, this.textureX, this.textureY);
/* 3411 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/* 3412 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/* 3413 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/* 3414 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/* 3415 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/* 3416 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 577, 73, this.textureX, this.textureY);
/* 3417 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 1225, 73, this.textureX, this.textureY);
/* 3418 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 1521, 73, this.textureX, this.textureY);
/* 3419 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 1585, 73, this.textureX, this.textureY);
/* 3420 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 1617, 73, this.textureX, this.textureY);
/* 3421 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 1649, 73, this.textureX, this.textureY);
/* 3422 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 3423 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/* 3424 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/* 3425 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 513, 81, this.textureX, this.textureY);
/* 3426 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 577, 81, this.textureX, this.textureY);
/* 3427 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 609, 81, this.textureX, this.textureY);
/* 3428 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/* 3429 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 641, 81, this.textureX, this.textureY);
/* 3430 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 665, 81, this.textureX, this.textureY);
/* 3431 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 1305, 153, this.textureX, this.textureY);
/* 3432 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 1449, 153, this.textureX, this.textureY);
/* 3433 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 1473, 153, this.textureX, this.textureY);
/* 3434 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 1697, 97, this.textureX, this.textureY);
/* 3435 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 1969, 57, this.textureX, this.textureY);
/* 3436 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/* 3437 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 713, 81, this.textureX, this.textureY);
/* 3438 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 1025, 81, this.textureX, this.textureY);
/* 3439 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 257, 89, this.textureX, this.textureY);
/* 3440 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/* 3441 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 513, 89, this.textureX, this.textureY);
/* 3442 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 609, 89, this.textureX, this.textureY);
/* 3443 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 633, 89, this.textureX, this.textureY);
/* 3444 */     this.defaultScopeModel[87] = new ModelRendererTurbo(this, 641, 89, this.textureX, this.textureY);
/* 3445 */     this.defaultScopeModel[88] = new ModelRendererTurbo(this, 665, 89, this.textureX, this.textureY);
/* 3446 */     this.defaultScopeModel[89] = new ModelRendererTurbo(this, 689, 89, this.textureX, this.textureY);
/* 3447 */     this.defaultScopeModel[90] = new ModelRendererTurbo(this, 1153, 89, this.textureX, this.textureY);
/*      */     
/* 3449 */     this.defaultScopeModel[0].addShapeBox(39.0F, -13.0F, -6.0F, 3, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3450 */     this.defaultScopeModel[0].setRotationPoint(90.75F, -48.25F, 3.5F);
/*      */     
/* 3452 */     this.defaultScopeModel[1].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F);
/* 3453 */     this.defaultScopeModel[1].setRotationPoint(-37.5F, -37.5F, 2.5F);
/*      */     
/* 3455 */     this.defaultScopeModel[2].addShapeBox(39.0F, -13.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 3456 */     this.defaultScopeModel[2].setRotationPoint(-3.0F, -30.5F, 11.5F);
/*      */     
/* 3458 */     this.defaultScopeModel[3].addShapeBox(39.0F, -13.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, 0.0F);
/* 3459 */     this.defaultScopeModel[3].setRotationPoint(-1.0F, -30.5F, 11.5F);
/*      */     
/* 3461 */     this.defaultScopeModel[4].addShapeBox(39.0F, -13.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -2.0F);
/* 3462 */     this.defaultScopeModel[4].setRotationPoint(-5.0F, -30.5F, 11.5F);
/*      */     
/* 3464 */     this.defaultScopeModel[5].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 3465 */     this.defaultScopeModel[5].setRotationPoint(-3.0F, -31.5F, 11.5F);
/*      */     
/* 3467 */     this.defaultScopeModel[6].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, 0.0F);
/* 3468 */     this.defaultScopeModel[6].setRotationPoint(-1.0F, -31.5F, 11.5F);
/*      */     
/* 3470 */     this.defaultScopeModel[7].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 2, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -2.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F);
/* 3471 */     this.defaultScopeModel[7].setRotationPoint(-5.0F, -31.5F, 11.5F);
/*      */     
/* 3473 */     this.defaultScopeModel[8].addShapeBox(39.0F, -13.0F, -6.0F, 7, 4, 1, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 3474 */     this.defaultScopeModel[8].setRotationPoint(-5.0F, -30.5F, 10.5F);
/*      */     
/* 3476 */     this.defaultScopeModel[9].addShapeBox(39.0F, -13.0F, -6.0F, 7, 2, 1, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 3477 */     this.defaultScopeModel[9].setRotationPoint(-5.0F, -32.0F, 10.5F);
/*      */     
/* 3479 */     this.defaultScopeModel[10].addShapeBox(39.0F, -13.0F, -6.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3480 */     this.defaultScopeModel[10].setRotationPoint(81.75F, -40.25F, 1.0F);
/*      */     
/* 3482 */     this.defaultScopeModel[11].addShapeBox(39.0F, -13.0F, -6.0F, 2, 4, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3483 */     this.defaultScopeModel[11].setRotationPoint(79.75F, -40.25F, 1.0F);
/*      */     
/* 3485 */     this.defaultScopeModel[12].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3486 */     this.defaultScopeModel[12].setRotationPoint(78.75F, -40.25F, 1.0F);
/*      */     
/* 3488 */     this.defaultScopeModel[13].addShapeBox(39.0F, -13.0F, -6.0F, 1, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3489 */     this.defaultScopeModel[13].setRotationPoint(95.75F, -41.25F, 1.0F);
/*      */     
/* 3491 */     this.defaultScopeModel[14].addShapeBox(39.0F, -13.0F, -6.0F, 1, 5, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3492 */     this.defaultScopeModel[14].setRotationPoint(90.75F, -41.25F, 1.0F);
/*      */     
/* 3494 */     this.defaultScopeModel[15].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3495 */     this.defaultScopeModel[15].setRotationPoint(91.75F, -39.25F, 1.0F);
/*      */     
/* 3497 */     this.defaultScopeModel[16].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3498 */     this.defaultScopeModel[16].setRotationPoint(93.75F, -39.25F, 1.0F);
/*      */     
/* 3500 */     this.defaultScopeModel[17].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3501 */     this.defaultScopeModel[17].setRotationPoint(92.75F, -38.25F, 1.0F);
/*      */     
/* 3503 */     this.defaultScopeModel[18].addShapeBox(39.0F, -13.0F, -6.0F, 1, 5, 10, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3504 */     this.defaultScopeModel[18].setRotationPoint(94.75F, -41.25F, 1.0F);
/*      */     
/* 3506 */     this.defaultScopeModel[19].addShapeBox(39.0F, -13.0F, -6.0F, 2, 5, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3507 */     this.defaultScopeModel[19].setRotationPoint(96.75F, -41.25F, 1.0F);
/*      */     
/* 3509 */     this.defaultScopeModel[20].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3510 */     this.defaultScopeModel[20].setRotationPoint(98.75F, -39.25F, 1.0F);
/*      */     
/* 3512 */     this.defaultScopeModel[21].addShapeBox(39.0F, -13.0F, -6.0F, 9, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3513 */     this.defaultScopeModel[21].setRotationPoint(81.75F, -40.25F, 9.0F);
/*      */     
/* 3515 */     this.defaultScopeModel[22].addShapeBox(39.0F, -13.0F, -6.0F, 2, 4, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3516 */     this.defaultScopeModel[22].setRotationPoint(79.75F, -40.25F, 9.0F);
/*      */     
/* 3518 */     this.defaultScopeModel[23].addShapeBox(39.0F, -13.0F, -6.0F, 1, 4, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3519 */     this.defaultScopeModel[23].setRotationPoint(78.75F, -40.25F, 9.0F);
/*      */     
/* 3521 */     this.defaultScopeModel[24].addShapeBox(39.0F, -13.0F, -6.0F, 1, 5, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3522 */     this.defaultScopeModel[24].setRotationPoint(90.75F, -41.25F, 9.0F);
/*      */     
/* 3524 */     this.defaultScopeModel[25].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3525 */     this.defaultScopeModel[25].setRotationPoint(91.75F, -39.25F, 9.0F);
/*      */     
/* 3527 */     this.defaultScopeModel[26].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3528 */     this.defaultScopeModel[26].setRotationPoint(93.75F, -39.25F, 9.0F);
/*      */     
/* 3530 */     this.defaultScopeModel[27].addShapeBox(39.0F, -13.0F, -6.0F, 13, 1, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.9F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.9F, -0.25F, 0.0F);
/* 3531 */     this.defaultScopeModel[27].setRotationPoint(79.75F, -38.25F, 3.0F);
/*      */     
/* 3533 */     this.defaultScopeModel[28].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3534 */     this.defaultScopeModel[28].setRotationPoint(92.75F, -38.25F, 3.0F);
/*      */     
/* 3536 */     this.defaultScopeModel[29].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3537 */     this.defaultScopeModel[29].setRotationPoint(91.75F, -38.25F, 0.0F);
/*      */     
/* 3539 */     this.defaultScopeModel[30].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3540 */     this.defaultScopeModel[30].setRotationPoint(91.75F, -40.25F, 0.0F);
/*      */     
/* 3542 */     this.defaultScopeModel[31].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3543 */     this.defaultScopeModel[31].setRotationPoint(91.75F, -39.25F, 0.0F);
/*      */     
/* 3545 */     this.defaultScopeModel[32].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3546 */     this.defaultScopeModel[32].setRotationPoint(91.75F, -38.25F, 8.0F);
/*      */     
/* 3548 */     this.defaultScopeModel[33].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 4, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3549 */     this.defaultScopeModel[33].setRotationPoint(91.75F, -40.25F, 8.0F);
/*      */     
/* 3551 */     this.defaultScopeModel[34].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3552 */     this.defaultScopeModel[34].setRotationPoint(91.75F, -39.25F, 8.0F);
/*      */     
/* 3554 */     this.defaultScopeModel[35].addShapeBox(39.0F, -13.0F, -6.0F, 3, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3555 */     this.defaultScopeModel[35].setRotationPoint(90.75F, -48.25F, 7.5F);
/*      */     
/* 3557 */     this.defaultScopeModel[36].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, -0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3558 */     this.defaultScopeModel[36].setRotationPoint(90.75F, -49.25F, 3.5F);
/*      */     
/* 3560 */     this.defaultScopeModel[37].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F);
/* 3561 */     this.defaultScopeModel[37].setRotationPoint(91.75F, -51.25F, 3.0F);
/*      */     
/* 3563 */     this.defaultScopeModel[38].addShapeBox(39.0F, -13.0F, -6.0F, 3, 10, 3, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3564 */     this.defaultScopeModel[38].setRotationPoint(90.75F, -48.25F, 4.5F);
/*      */     
/* 3566 */     this.defaultScopeModel[39].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, -0.5F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3567 */     this.defaultScopeModel[39].setRotationPoint(90.75F, -49.25F, 7.5F);
/*      */     
/* 3569 */     this.defaultScopeModel[40].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, -0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F);
/* 3570 */     this.defaultScopeModel[40].setRotationPoint(91.75F, -51.25F, 8.0F);
/*      */     
/* 3572 */     this.defaultScopeModel[41].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3573 */     this.defaultScopeModel[41].setRotationPoint(92.25F, -51.25F, 5.5F);
/*      */     
/* 3575 */     this.defaultScopeModel[42].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3576 */     this.defaultScopeModel[42].setRotationPoint(98.0F, -37.0F, 0.5F);
/*      */     
/* 3578 */     this.defaultScopeModel[43].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3579 */     this.defaultScopeModel[43].setRotationPoint(98.0F, -39.0F, 0.5F);
/*      */     
/* 3581 */     this.defaultScopeModel[44].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3582 */     this.defaultScopeModel[44].setRotationPoint(98.0F, -38.0F, 0.5F);
/*      */     
/* 3584 */     this.defaultScopeModel[45].addShapeBox(39.0F, -13.0F, -6.0F, 6, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3585 */     this.defaultScopeModel[45].setRotationPoint(-38.5F, -45.25F, 7.0F);
/*      */     
/* 3587 */     this.defaultScopeModel[46].addShapeBox(39.0F, -13.0F, -6.0F, 6, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3588 */     this.defaultScopeModel[46].setRotationPoint(-38.5F, -45.25F, 5.0F);
/*      */     
/* 3590 */     this.defaultScopeModel[47].addShapeBox(39.0F, -13.0F, -6.0F, 6, 6, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3591 */     this.defaultScopeModel[47].setRotationPoint(-38.5F, -45.25F, 3.0F);
/*      */     
/* 3593 */     this.defaultScopeModel[48].addShapeBox(39.0F, -13.0F, -6.0F, 6, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3594 */     this.defaultScopeModel[48].setRotationPoint(-38.25F, -39.25F, 3.0F);
/*      */     
/* 3596 */     this.defaultScopeModel[49].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 6, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F);
/* 3597 */     this.defaultScopeModel[49].setRotationPoint(-39.25F, -39.25F, 3.0F);
/*      */     
/* 3599 */     this.defaultScopeModel[50].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F);
/* 3600 */     this.defaultScopeModel[50].setRotationPoint(-39.25F, -37.25F, 3.0F);
/*      */     
/* 3602 */     this.defaultScopeModel[51].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3603 */     this.defaultScopeModel[51].setRotationPoint(-38.5F, -46.25F, 7.0F);
/*      */     
/* 3605 */     this.defaultScopeModel[52].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3606 */     this.defaultScopeModel[52].setRotationPoint(-38.5F, -46.25F, 5.0F);
/*      */     
/* 3608 */     this.defaultScopeModel[53].addShapeBox(39.0F, -13.0F, -6.0F, 6, 1, 2, 0.0F, -2.0F, 0.0F, -1.5F, -2.0F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3609 */     this.defaultScopeModel[53].setRotationPoint(-38.5F, -46.25F, 3.0F);
/*      */     
/* 3611 */     this.defaultScopeModel[54].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3612 */     this.defaultScopeModel[54].setRotationPoint(-37.25F, -37.25F, 9.0F);
/*      */     
/* 3614 */     this.defaultScopeModel[55].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3615 */     this.defaultScopeModel[55].setRotationPoint(-37.25F, -38.25F, 9.0F);
/*      */     
/* 3617 */     this.defaultScopeModel[56].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3618 */     this.defaultScopeModel[56].setRotationPoint(-37.25F, -39.25F, 9.0F);
/*      */     
/* 3620 */     this.defaultScopeModel[57].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3621 */     this.defaultScopeModel[57].setRotationPoint(-37.25F, -38.25F, 10.0F);
/*      */     
/* 3623 */     this.defaultScopeModel[58].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3624 */     this.defaultScopeModel[58].setRotationPoint(-37.25F, -39.75F, 10.0F);
/*      */     
/* 3626 */     this.defaultScopeModel[59].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F);
/* 3627 */     this.defaultScopeModel[59].setRotationPoint(-37.25F, -36.75F, 10.0F);
/*      */     
/* 3629 */     this.defaultScopeModel[60].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F);
/* 3630 */     this.defaultScopeModel[60].setRotationPoint(-37.25F, -38.25F, 2.25F);
/*      */     
/* 3632 */     this.defaultScopeModel[61].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F);
/* 3633 */     this.defaultScopeModel[61].setRotationPoint(-37.25F, -39.75F, 2.25F);
/*      */     
/* 3635 */     this.defaultScopeModel[62].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3636 */     this.defaultScopeModel[62].setRotationPoint(-37.25F, -37.25F, 1.5F);
/*      */     
/* 3638 */     this.defaultScopeModel[63].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3639 */     this.defaultScopeModel[63].setRotationPoint(-37.25F, -38.25F, 1.5F);
/*      */     
/* 3641 */     this.defaultScopeModel[64].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3642 */     this.defaultScopeModel[64].setRotationPoint(-37.25F, -39.25F, 1.5F);
/*      */     
/* 3644 */     this.defaultScopeModel[65].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3645 */     this.defaultScopeModel[65].setRotationPoint(-37.25F, -38.25F, 0.5F);
/*      */     
/* 3647 */     this.defaultScopeModel[66].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F);
/* 3648 */     this.defaultScopeModel[66].setRotationPoint(-37.25F, -39.75F, 0.5F);
/*      */     
/* 3650 */     this.defaultScopeModel[67].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F, -1.25F, 0.25F, 0.25F);
/* 3651 */     this.defaultScopeModel[67].setRotationPoint(-37.25F, -36.75F, 0.5F);
/*      */     
/* 3653 */     this.defaultScopeModel[68].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F);
/* 3654 */     this.defaultScopeModel[68].setRotationPoint(-37.25F, -38.25F, -0.75F);
/*      */     
/* 3656 */     this.defaultScopeModel[69].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, -1.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F);
/* 3657 */     this.defaultScopeModel[69].setRotationPoint(-37.25F, -39.75F, -0.75F);
/*      */     
/* 3659 */     this.defaultScopeModel[70].addShapeBox(39.0F, -13.0F, -6.0F, 4, 1, 1, 0.0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 0.25F, -0.25F);
/* 3660 */     this.defaultScopeModel[70].setRotationPoint(-37.25F, -36.75F, -0.75F);
/*      */     
/* 3662 */     this.defaultScopeModel[71].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/* 3663 */     this.defaultScopeModel[71].setRotationPoint(-37.25F, -37.25F, -0.25F);
/*      */     
/* 3665 */     this.defaultScopeModel[72].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3666 */     this.defaultScopeModel[72].setRotationPoint(-37.25F, -38.25F, -0.25F);
/*      */     
/* 3668 */     this.defaultScopeModel[73].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3669 */     this.defaultScopeModel[73].setRotationPoint(-37.25F, -39.25F, -0.25F);
/*      */     
/* 3671 */     this.defaultScopeModel[74].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 7, 0.0F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3672 */     this.defaultScopeModel[74].setRotationPoint(-37.1F, -45.75F, 2.35F);
/*      */     
/* 3674 */     this.defaultScopeModel[75].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 7, 0.0F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F);
/* 3675 */     this.defaultScopeModel[75].setRotationPoint(-34.6F, -45.75F, 2.35F);
/*      */     
/* 3677 */     this.defaultScopeModel[76].addShapeBox(39.0F, -13.0F, -6.0F, 3, 1, 7, 0.0F, -0.5F, 0.0F, -2.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, -2.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F);
/* 3678 */     this.defaultScopeModel[76].setRotationPoint(-39.35F, -45.75F, 2.35F);
/*      */     
/* 3680 */     this.defaultScopeModel[77].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3681 */     this.defaultScopeModel[77].setRotationPoint(-36.5F, -47.25F, 5.0F);
/*      */     
/* 3683 */     this.defaultScopeModel[78].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3684 */     this.defaultScopeModel[78].setRotationPoint(-36.5F, -49.25F, 7.5F);
/*      */     
/* 3686 */     this.defaultScopeModel[79].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3687 */     this.defaultScopeModel[79].setRotationPoint(-36.5F, -49.25F, 3.5F);
/*      */     
/* 3689 */     this.defaultScopeModel[80].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 3690 */     this.defaultScopeModel[80].setRotationPoint(-36.5F, -49.75F, 7.5F);
/*      */     
/* 3692 */     this.defaultScopeModel[81].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 3693 */     this.defaultScopeModel[81].setRotationPoint(-36.5F, -49.75F, 3.5F);
/*      */     
/* 3695 */     this.defaultScopeModel[82].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3696 */     this.defaultScopeModel[82].setRotationPoint(-36.5F, -50.75F, 7.0F);
/*      */     
/* 3698 */     this.defaultScopeModel[83].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3699 */     this.defaultScopeModel[83].setRotationPoint(-36.5F, -50.75F, 4.0F);
/*      */     
/* 3701 */     this.defaultScopeModel[84].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 3702 */     this.defaultScopeModel[84].setRotationPoint(-36.5F, -49.75F, 7.5F);
/*      */     
/* 3704 */     this.defaultScopeModel[85].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3705 */     this.defaultScopeModel[85].setRotationPoint(-36.5F, -49.75F, 4.25F);
/*      */     
/* 3707 */     this.defaultScopeModel[86].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 3708 */     this.defaultScopeModel[86].setRotationPoint(-36.5F, -48.25F, 7.0F);
/*      */     
/* 3710 */     this.defaultScopeModel[87].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F);
/* 3711 */     this.defaultScopeModel[87].setRotationPoint(-36.5F, -48.25F, 4.0F);
/*      */     
/* 3713 */     this.defaultScopeModel[88].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3714 */     this.defaultScopeModel[88].setRotationPoint(-36.5F, -51.25F, 6.5F);
/*      */     
/* 3716 */     this.defaultScopeModel[89].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3717 */     this.defaultScopeModel[89].setRotationPoint(-36.5F, -51.25F, 4.5F);
/*      */     
/* 3719 */     this.defaultScopeModel[90].addShapeBox(39.0F, -13.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3720 */     this.defaultScopeModel[90].setRotationPoint(-36.5F, -51.25F, 5.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 3725 */     this.ammoModel[0] = new ModelRendererTurbo(this, 1745, 81, this.textureX, this.textureY);
/* 3726 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1809, 81, this.textureX, this.textureY);
/* 3727 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1873, 81, this.textureX, this.textureY);
/* 3728 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1937, 81, this.textureX, this.textureY);
/* 3729 */     this.ammoModel[4] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 3730 */     this.ammoModel[5] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/* 3731 */     this.ammoModel[6] = new ModelRendererTurbo(this, 2001, 81, this.textureX, this.textureY);
/* 3732 */     this.ammoModel[7] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 3733 */     this.ammoModel[8] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/* 3734 */     this.ammoModel[9] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/* 3735 */     this.ammoModel[10] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/* 3736 */     this.ammoModel[11] = new ModelRendererTurbo(this, 697, 81, this.textureX, this.textureY);
/* 3737 */     this.ammoModel[12] = new ModelRendererTurbo(this, 2033, 81, this.textureX, this.textureY);
/* 3738 */     this.ammoModel[13] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/* 3739 */     this.ammoModel[14] = new ModelRendererTurbo(this, 1713, 65, this.textureX, this.textureY);
/* 3740 */     this.ammoModel[15] = new ModelRendererTurbo(this, 689, 9, this.textureX, this.textureY);
/* 3741 */     this.ammoModel[16] = new ModelRendererTurbo(this, 369, 89, this.textureX, this.textureY);
/* 3742 */     this.ammoModel[17] = new ModelRendererTurbo(this, 385, 89, this.textureX, this.textureY);
/* 3743 */     this.ammoModel[18] = new ModelRendererTurbo(this, 401, 89, this.textureX, this.textureY);
/* 3744 */     this.ammoModel[19] = new ModelRendererTurbo(this, 1737, 65, this.textureX, this.textureY);
/* 3745 */     this.ammoModel[20] = new ModelRendererTurbo(this, 705, 9, this.textureX, this.textureY);
/* 3746 */     this.ammoModel[21] = new ModelRendererTurbo(this, 737, 9, this.textureX, this.textureY);
/* 3747 */     this.ammoModel[22] = new ModelRendererTurbo(this, 417, 89, this.textureX, this.textureY);
/* 3748 */     this.ammoModel[23] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/* 3749 */     this.ammoModel[24] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/* 3750 */     this.ammoModel[25] = new ModelRendererTurbo(this, 1769, 65, this.textureX, this.textureY);
/* 3751 */     this.ammoModel[26] = new ModelRendererTurbo(this, 721, 9, this.textureX, this.textureY);
/* 3752 */     this.ammoModel[27] = new ModelRendererTurbo(this, 1969, 49, this.textureX, this.textureY);
/* 3753 */     this.ammoModel[28] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/* 3754 */     this.ammoModel[29] = new ModelRendererTurbo(this, 569, 81, this.textureX, this.textureY);
/* 3755 */     this.ammoModel[30] = new ModelRendererTurbo(this, 313, 89, this.textureX, this.textureY);
/* 3756 */     this.ammoModel[31] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 3757 */     this.ammoModel[32] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/* 3758 */     this.ammoModel[33] = new ModelRendererTurbo(this, 2041, 17, this.textureX, this.textureY);
/* 3759 */     this.ammoModel[34] = new ModelRendererTurbo(this, 489, 89, this.textureX, this.textureY);
/* 3760 */     this.ammoModel[35] = new ModelRendererTurbo(this, 577, 89, this.textureX, this.textureY);
/* 3761 */     this.ammoModel[36] = new ModelRendererTurbo(this, 593, 89, this.textureX, this.textureY);
/* 3762 */     this.ammoModel[37] = new ModelRendererTurbo(this, 1793, 65, this.textureX, this.textureY);
/* 3763 */     this.ammoModel[38] = new ModelRendererTurbo(this, 753, 9, this.textureX, this.textureY);
/* 3764 */     this.ammoModel[39] = new ModelRendererTurbo(this, 649, 89, this.textureX, this.textureY);
/* 3765 */     this.ammoModel[40] = new ModelRendererTurbo(this, 761, 89, this.textureX, this.textureY);
/* 3766 */     this.ammoModel[41] = new ModelRendererTurbo(this, 777, 89, this.textureX, this.textureY);
/* 3767 */     this.ammoModel[42] = new ModelRendererTurbo(this, 1825, 65, this.textureX, this.textureY);
/* 3768 */     this.ammoModel[43] = new ModelRendererTurbo(this, 777, 9, this.textureX, this.textureY);
/* 3769 */     this.ammoModel[44] = new ModelRendererTurbo(this, 969, 9, this.textureX, this.textureY);
/* 3770 */     this.ammoModel[45] = new ModelRendererTurbo(this, 793, 89, this.textureX, this.textureY);
/* 3771 */     this.ammoModel[46] = new ModelRendererTurbo(this, 809, 89, this.textureX, this.textureY);
/* 3772 */     this.ammoModel[47] = new ModelRendererTurbo(this, 825, 89, this.textureX, this.textureY);
/* 3773 */     this.ammoModel[48] = new ModelRendererTurbo(this, 1849, 65, this.textureX, this.textureY);
/* 3774 */     this.ammoModel[49] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/* 3775 */     this.ammoModel[50] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/* 3776 */     this.ammoModel[51] = new ModelRendererTurbo(this, 505, 89, this.textureX, this.textureY);
/* 3777 */     this.ammoModel[52] = new ModelRendererTurbo(this, 841, 89, this.textureX, this.textureY);
/* 3778 */     this.ammoModel[53] = new ModelRendererTurbo(this, 849, 89, this.textureX, this.textureY);
/* 3779 */     this.ammoModel[54] = new ModelRendererTurbo(this, 1881, 65, this.textureX, this.textureY);
/* 3780 */     this.ammoModel[55] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/* 3781 */     this.ammoModel[56] = new ModelRendererTurbo(this, 2041, 33, this.textureX, this.textureY);
/* 3782 */     this.ammoModel[57] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/* 3783 */     this.ammoModel[58] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/* 3784 */     this.ammoModel[59] = new ModelRendererTurbo(this, 1913, 65, this.textureX, this.textureY);
/* 3785 */     this.ammoModel[60] = new ModelRendererTurbo(this, 1937, 65, this.textureX, this.textureY);
/* 3786 */     this.ammoModel[61] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/* 3787 */     this.ammoModel[62] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/* 3788 */     this.ammoModel[63] = new ModelRendererTurbo(this, 1969, 65, this.textureX, this.textureY);
/* 3789 */     this.ammoModel[64] = new ModelRendererTurbo(this, 1993, 65, this.textureX, this.textureY);
/* 3790 */     this.ammoModel[65] = new ModelRendererTurbo(this, 857, 89, this.textureX, this.textureY);
/*      */     
/* 3792 */     this.ammoModel[0].addShapeBox(39.0F, -13.0F, -6.0F, 22, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3793 */     this.ammoModel[0].setRotationPoint(-12.0F, 9.5F, 2.0F);
/*      */     
/* 3795 */     this.ammoModel[1].addShapeBox(39.0F, -13.0F, -6.0F, 22, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3796 */     this.ammoModel[1].setRotationPoint(-10.75F, 19.5F, 2.0F);
/*      */     
/* 3798 */     this.ammoModel[2].addShapeBox(39.0F, -13.0F, -6.0F, 22, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3799 */     this.ammoModel[2].setRotationPoint(-8.5F, 29.5F, 2.0F);
/*      */     
/* 3801 */     this.ammoModel[3].addShapeBox(39.0F, -13.0F, -6.0F, 22, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.0F, 1.5F, 0.0F, -1.0F, -7.0F, 0.0F, -1.0F, -7.0F, 0.0F, -3.0F, 1.5F, 0.0F);
/* 3802 */     this.ammoModel[3].setRotationPoint(-6.25F, 36.5F, 2.0F);
/*      */     
/* 3804 */     this.ammoModel[4].addShapeBox(39.0F, -13.0F, -6.0F, 21, 10, 8, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3805 */     this.ammoModel[4].setRotationPoint(-12.0F, -0.5F, 2.0F);
/*      */     
/* 3807 */     this.ammoModel[5].addShapeBox(39.0F, -13.0F, -6.0F, 20, 8, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3808 */     this.ammoModel[5].setRotationPoint(-12.5F, -8.5F, 2.0F);
/*      */     
/* 3810 */     this.ammoModel[6].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3811 */     this.ammoModel[6].setRotationPoint(-14.0F, 9.5F, 2.0F);
/*      */     
/* 3813 */     this.ammoModel[7].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3814 */     this.ammoModel[7].setRotationPoint(-12.75F, 19.5F, 2.0F);
/*      */     
/* 3816 */     this.ammoModel[8].addShapeBox(39.0F, -13.0F, -6.0F, 6, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3817 */     this.ammoModel[8].setRotationPoint(-10.5F, 29.5F, 2.0F);
/*      */     
/* 3819 */     this.ammoModel[9].addShapeBox(39.0F, -13.0F, -6.0F, 5, 10, 8, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3820 */     this.ammoModel[9].setRotationPoint(-14.0F, -0.5F, 2.0F);
/*      */     
/* 3822 */     this.ammoModel[10].addShapeBox(39.0F, -13.0F, -6.0F, 6, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, 0.0F, -3.0F, 1.0F, 0.0F);
/* 3823 */     this.ammoModel[10].setRotationPoint(-8.0F, 36.5F, 2.0F);
/*      */     
/* 3825 */     this.ammoModel[11].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3826 */     this.ammoModel[11].setRotationPoint(5.25F, 19.5F, 1.0F);
/*      */     
/* 3828 */     this.ammoModel[12].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3829 */     this.ammoModel[12].setRotationPoint(2.75F, 9.5F, 1.0F);
/*      */     
/* 3831 */     this.ammoModel[13].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3832 */     this.ammoModel[13].setRotationPoint(1.75F, -0.5F, 1.0F);
/*      */     
/* 3834 */     this.ammoModel[14].addShapeBox(39.0F, -13.0F, -6.0F, 6, 7, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3835 */     this.ammoModel[14].setRotationPoint(7.75F, 29.5F, 1.0F);
/*      */     
/* 3837 */     this.ammoModel[15].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.15F, 0.0F);
/* 3838 */     this.ammoModel[15].setRotationPoint(10.25F, 36.5F, 1.0F);
/*      */     
/* 3840 */     this.ammoModel[16].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3841 */     this.ammoModel[16].setRotationPoint(-2.0F, 19.5F, 1.0F);
/*      */     
/* 3843 */     this.ammoModel[17].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3844 */     this.ammoModel[17].setRotationPoint(-4.5F, 9.5F, 1.0F);
/*      */     
/* 3846 */     this.ammoModel[18].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3847 */     this.ammoModel[18].setRotationPoint(-5.5F, -0.5F, 1.0F);
/*      */     
/* 3849 */     this.ammoModel[19].addShapeBox(39.0F, -13.0F, -6.0F, 6, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3850 */     this.ammoModel[19].setRotationPoint(0.5F, 29.5F, 1.0F);
/*      */     
/* 3852 */     this.ammoModel[20].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 1, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, 0.35F, 0.0F);
/* 3853 */     this.ammoModel[20].setRotationPoint(5.0F, 39.0F, 1.0F);
/*      */     
/* 3855 */     this.ammoModel[21].addShapeBox(39.0F, -13.0F, -6.0F, 6, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3856 */     this.ammoModel[21].setRotationPoint(3.0F, 36.5F, 1.0F);
/*      */     
/* 3858 */     this.ammoModel[22].addShapeBox(39.0F, -13.0F, -6.0F, 5, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3859 */     this.ammoModel[22].setRotationPoint(-7.75F, 19.5F, 1.0F);
/*      */     
/* 3861 */     this.ammoModel[23].addShapeBox(39.0F, -13.0F, -6.0F, 5, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3862 */     this.ammoModel[23].setRotationPoint(-10.25F, 9.5F, 1.0F);
/*      */     
/* 3864 */     this.ammoModel[24].addShapeBox(39.0F, -13.0F, -6.0F, 5, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3865 */     this.ammoModel[24].setRotationPoint(-11.25F, -0.5F, 1.0F);
/*      */     
/* 3867 */     this.ammoModel[25].addShapeBox(39.0F, -13.0F, -6.0F, 5, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3868 */     this.ammoModel[25].setRotationPoint(-5.25F, 29.5F, 1.0F);
/*      */     
/* 3870 */     this.ammoModel[26].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.75F, 1.0F, 0.0F);
/* 3871 */     this.ammoModel[26].setRotationPoint(-0.25F, 41.0F, 1.0F);
/*      */     
/* 3873 */     this.ammoModel[27].addShapeBox(39.0F, -13.0F, -6.0F, 5, 4, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3874 */     this.ammoModel[27].setRotationPoint(-2.75F, 36.5F, 1.0F);
/*      */     
/* 3876 */     this.ammoModel[28].addShapeBox(39.0F, -13.0F, -6.0F, 2, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3877 */     this.ammoModel[28].setRotationPoint(-10.0F, 19.5F, 1.0F);
/*      */     
/* 3879 */     this.ammoModel[29].addShapeBox(39.0F, -13.0F, -6.0F, 2, 10, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3880 */     this.ammoModel[29].setRotationPoint(-12.5F, 9.5F, 1.0F);
/*      */     
/* 3882 */     this.ammoModel[30].addShapeBox(39.0F, -13.0F, -6.0F, 2, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3883 */     this.ammoModel[30].setRotationPoint(-13.5F, -0.5F, 1.0F);
/*      */     
/* 3885 */     this.ammoModel[31].addShapeBox(39.0F, -13.0F, -6.0F, 2, 7, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3886 */     this.ammoModel[31].setRotationPoint(-7.5F, 29.5F, 1.0F);
/*      */     
/* 3888 */     this.ammoModel[32].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 3889 */     this.ammoModel[32].setRotationPoint(-2.5F, 43.0F, 1.0F);
/*      */     
/* 3891 */     this.ammoModel[33].addShapeBox(39.0F, -13.0F, -6.0F, 2, 6, 1, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 3892 */     this.ammoModel[33].setRotationPoint(-5.0F, 36.5F, 1.0F);
/*      */     
/* 3894 */     this.ammoModel[34].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3895 */     this.ammoModel[34].setRotationPoint(5.25F, 19.5F, 10.0F);
/*      */     
/* 3897 */     this.ammoModel[35].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3898 */     this.ammoModel[35].setRotationPoint(2.75F, 9.5F, 10.0F);
/*      */     
/* 3900 */     this.ammoModel[36].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3901 */     this.ammoModel[36].setRotationPoint(1.75F, -0.5F, 10.0F);
/*      */     
/* 3903 */     this.ammoModel[37].addShapeBox(39.0F, -13.0F, -6.0F, 6, 7, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3904 */     this.ammoModel[37].setRotationPoint(7.75F, 29.5F, 10.0F);
/*      */     
/* 3906 */     this.ammoModel[38].addShapeBox(39.0F, -13.0F, -6.0F, 4, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.15F, 0.0F);
/* 3907 */     this.ammoModel[38].setRotationPoint(10.25F, 36.5F, 10.0F);
/*      */     
/* 3909 */     this.ammoModel[39].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3910 */     this.ammoModel[39].setRotationPoint(-2.0F, 19.5F, 10.0F);
/*      */     
/* 3912 */     this.ammoModel[40].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3913 */     this.ammoModel[40].setRotationPoint(-4.5F, 9.5F, 10.0F);
/*      */     
/* 3915 */     this.ammoModel[41].addShapeBox(39.0F, -13.0F, -6.0F, 6, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3916 */     this.ammoModel[41].setRotationPoint(-5.5F, -0.5F, 10.0F);
/*      */     
/* 3918 */     this.ammoModel[42].addShapeBox(39.0F, -13.0F, -6.0F, 6, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3919 */     this.ammoModel[42].setRotationPoint(0.5F, 29.5F, 10.0F);
/*      */     
/* 3921 */     this.ammoModel[43].addShapeBox(39.0F, -13.0F, -6.0F, 3, 2, 1, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, 0.35F, 0.0F);
/* 3922 */     this.ammoModel[43].setRotationPoint(5.0F, 39.0F, 10.0F);
/*      */     
/* 3924 */     this.ammoModel[44].addShapeBox(39.0F, -13.0F, -6.0F, 6, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3925 */     this.ammoModel[44].setRotationPoint(3.0F, 36.5F, 10.0F);
/*      */     
/* 3927 */     this.ammoModel[45].addShapeBox(39.0F, -13.0F, -6.0F, 5, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3928 */     this.ammoModel[45].setRotationPoint(-7.75F, 19.5F, 10.0F);
/*      */     
/* 3930 */     this.ammoModel[46].addShapeBox(39.0F, -13.0F, -6.0F, 5, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3931 */     this.ammoModel[46].setRotationPoint(-10.25F, 9.5F, 10.0F);
/*      */     
/* 3933 */     this.ammoModel[47].addShapeBox(39.0F, -13.0F, -6.0F, 5, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3934 */     this.ammoModel[47].setRotationPoint(-11.25F, -0.5F, 10.0F);
/*      */     
/* 3936 */     this.ammoModel[48].addShapeBox(39.0F, -13.0F, -6.0F, 5, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3937 */     this.ammoModel[48].setRotationPoint(-5.25F, 29.5F, 10.0F);
/*      */     
/* 3939 */     this.ammoModel[49].addShapeBox(39.0F, -13.0F, -6.0F, 2, 2, 1, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.75F, 1.0F, 0.0F);
/* 3940 */     this.ammoModel[49].setRotationPoint(-0.25F, 41.0F, 10.0F);
/*      */     
/* 3942 */     this.ammoModel[50].addShapeBox(39.0F, -13.0F, -6.0F, 5, 4, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3943 */     this.ammoModel[50].setRotationPoint(-2.75F, 36.5F, 10.0F);
/*      */     
/* 3945 */     this.ammoModel[51].addShapeBox(39.0F, -13.0F, -6.0F, 2, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3946 */     this.ammoModel[51].setRotationPoint(-10.0F, 19.5F, 10.0F);
/*      */     
/* 3948 */     this.ammoModel[52].addShapeBox(39.0F, -13.0F, -6.0F, 2, 10, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3949 */     this.ammoModel[52].setRotationPoint(-12.5F, 9.5F, 10.0F);
/*      */     
/* 3951 */     this.ammoModel[53].addShapeBox(39.0F, -13.0F, -6.0F, 2, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3952 */     this.ammoModel[53].setRotationPoint(-13.5F, -0.5F, 10.0F);
/*      */     
/* 3954 */     this.ammoModel[54].addShapeBox(39.0F, -13.0F, -6.0F, 2, 7, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3955 */     this.ammoModel[54].setRotationPoint(-7.5F, 29.5F, 10.0F);
/*      */     
/* 3957 */     this.ammoModel[55].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 1, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 3958 */     this.ammoModel[55].setRotationPoint(-2.5F, 43.0F, 10.0F);
/*      */     
/* 3960 */     this.ammoModel[56].addShapeBox(39.0F, -13.0F, -6.0F, 2, 6, 1, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 3961 */     this.ammoModel[56].setRotationPoint(-5.0F, 36.5F, 10.0F);
/*      */     
/* 3963 */     this.ammoModel[57].addShapeBox(39.0F, -13.0F, -6.0F, 6, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3964 */     this.ammoModel[57].setRotationPoint(1.75F, -8.5F, 10.0F);
/*      */     
/* 3966 */     this.ammoModel[58].addShapeBox(39.0F, -13.0F, -6.0F, 5, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3967 */     this.ammoModel[58].setRotationPoint(-4.5F, -8.5F, 10.0F);
/*      */     
/* 3969 */     this.ammoModel[59].addShapeBox(39.0F, -13.0F, -6.0F, 4, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3970 */     this.ammoModel[59].setRotationPoint(-10.25F, -8.5F, 10.0F);
/*      */     
/* 3972 */     this.ammoModel[60].addShapeBox(39.0F, -13.0F, -6.0F, 1, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3973 */     this.ammoModel[60].setRotationPoint(-12.5F, -8.5F, 10.0F);
/*      */     
/* 3975 */     this.ammoModel[61].addShapeBox(39.0F, -13.0F, -6.0F, 6, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3976 */     this.ammoModel[61].setRotationPoint(1.75F, -8.5F, 1.0F);
/*      */     
/* 3978 */     this.ammoModel[62].addShapeBox(39.0F, -13.0F, -6.0F, 5, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3979 */     this.ammoModel[62].setRotationPoint(-4.5F, -8.5F, 1.0F);
/*      */     
/* 3981 */     this.ammoModel[63].addShapeBox(39.0F, -13.0F, -6.0F, 4, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3982 */     this.ammoModel[63].setRotationPoint(-10.25F, -8.5F, 1.0F);
/*      */     
/* 3984 */     this.ammoModel[64].addShapeBox(39.0F, -13.0F, -6.0F, 1, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3985 */     this.ammoModel[64].setRotationPoint(-12.5F, -8.5F, 1.0F);
/*      */     
/* 3987 */     this.ammoModel[65].addShapeBox(39.0F, -13.0F, -6.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3988 */     this.ammoModel[65].setRotationPoint(-14.75F, -8.5F, 2.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 3993 */     this.slideModel[0] = new ModelRendererTurbo(this, 913, 153, this.textureX, this.textureY);
/* 3994 */     this.slideModel[1] = new ModelRendererTurbo(this, 865, 137, this.textureX, this.textureY);
/* 3995 */     this.slideModel[2] = new ModelRendererTurbo(this, 25, 145, this.textureX, this.textureY);
/* 3996 */     this.slideModel[3] = new ModelRendererTurbo(this, 1449, 121, this.textureX, this.textureY);
/* 3997 */     this.slideModel[4] = new ModelRendererTurbo(this, 1489, 121, this.textureX, this.textureY);
/* 3998 */     this.slideModel[5] = new ModelRendererTurbo(this, 569, 137, this.textureX, this.textureY);
/* 3999 */     this.slideModel[6] = new ModelRendererTurbo(this, 1369, 97, this.textureX, this.textureY);
/* 4000 */     this.slideModel[7] = new ModelRendererTurbo(this, 737, 113, this.textureX, this.textureY);
/* 4001 */     this.slideModel[8] = new ModelRendererTurbo(this, 1673, 113, this.textureX, this.textureY);
/* 4002 */     this.slideModel[9] = new ModelRendererTurbo(this, 785, 121, this.textureX, this.textureY);
/* 4003 */     this.slideModel[10] = new ModelRendererTurbo(this, 1793, 121, this.textureX, this.textureY);
/* 4004 */     this.slideModel[11] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/* 4005 */     this.slideModel[12] = new ModelRendererTurbo(this, 337, 129, this.textureX, this.textureY);
/* 4006 */     this.slideModel[13] = new ModelRendererTurbo(this, 1073, 129, this.textureX, this.textureY);
/* 4007 */     this.slideModel[14] = new ModelRendererTurbo(this, 1713, 129, this.textureX, this.textureY);
/* 4008 */     this.slideModel[15] = new ModelRendererTurbo(this, 1737, 129, this.textureX, this.textureY);
/* 4009 */     this.slideModel[16] = new ModelRendererTurbo(this, 1977, 129, this.textureX, this.textureY);
/* 4010 */     this.slideModel[17] = new ModelRendererTurbo(this, 2009, 129, this.textureX, this.textureY);
/* 4011 */     this.slideModel[18] = new ModelRendererTurbo(this, 217, 137, this.textureX, this.textureY);
/* 4012 */     this.slideModel[19] = new ModelRendererTurbo(this, 73, 137, this.textureX, this.textureY);
/* 4013 */     this.slideModel[20] = new ModelRendererTurbo(this, 489, 137, this.textureX, this.textureY);
/* 4014 */     this.slideModel[21] = new ModelRendererTurbo(this, 505, 137, this.textureX, this.textureY);
/* 4015 */     this.slideModel[22] = new ModelRendererTurbo(this, 1529, 121, this.textureX, this.textureY);
/* 4016 */     this.slideModel[23] = new ModelRendererTurbo(this, 193, 129, this.textureX, this.textureY);
/* 4017 */     this.slideModel[24] = new ModelRendererTurbo(this, 1817, 129, this.textureX, this.textureY);
/* 4018 */     this.slideModel[25] = new ModelRendererTurbo(this, 1905, 65, this.textureX, this.textureY);
/* 4019 */     this.slideModel[26] = new ModelRendererTurbo(this, 1961, 65, this.textureX, this.textureY);
/* 4020 */     this.slideModel[27] = new ModelRendererTurbo(this, 2017, 65, this.textureX, this.textureY);
/* 4021 */     this.slideModel[28] = new ModelRendererTurbo(this, 2041, 65, this.textureX, this.textureY);
/* 4022 */     this.slideModel[29] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/* 4023 */     this.slideModel[30] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/* 4024 */     this.slideModel[31] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/* 4025 */     this.slideModel[32] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/* 4026 */     this.slideModel[33] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/* 4027 */     this.slideModel[34] = new ModelRendererTurbo(this, 793, 73, this.textureX, this.textureY);
/* 4028 */     this.slideModel[35] = new ModelRendererTurbo(this, 825, 73, this.textureX, this.textureY);
/* 4029 */     this.slideModel[36] = new ModelRendererTurbo(this, 857, 73, this.textureX, this.textureY);
/* 4030 */     this.slideModel[37] = new ModelRendererTurbo(this, 609, 137, this.textureX, this.textureY);
/* 4031 */     this.slideModel[38] = new ModelRendererTurbo(this, 649, 137, this.textureX, this.textureY);
/* 4032 */     this.slideModel[39] = new ModelRendererTurbo(this, 689, 137, this.textureX, this.textureY);
/* 4033 */     this.slideModel[40] = new ModelRendererTurbo(this, 729, 137, this.textureX, this.textureY);
/*      */     
/* 4035 */     this.slideModel[0].addShapeBox(39.0F, -13.0F, -6.0F, 26, 8, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4036 */     this.slideModel[0].setRotationPoint(-18.5F, -27.0F, 0.75F);
/*      */     
/* 4038 */     this.slideModel[1].addShapeBox(39.0F, -13.0F, -6.0F, 10, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4039 */     this.slideModel[1].setRotationPoint(-11.0F, -26.75F, 0.5F);
/*      */     
/* 4041 */     this.slideModel[2].addShapeBox(39.0F, -13.0F, -6.0F, 10, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4042 */     this.slideModel[2].setRotationPoint(-11.0F, -22.75F, 0.5F);
/*      */     
/* 4044 */     this.slideModel[3].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4045 */     this.slideModel[3].setRotationPoint(-11.0F, -25.75F, 0.5F);
/*      */     
/* 4047 */     this.slideModel[4].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4048 */     this.slideModel[4].setRotationPoint(-2.0F, -25.75F, 0.5F);
/*      */     
/* 4050 */     this.slideModel[5].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 6, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4051 */     this.slideModel[5].setRotationPoint(-10.0F, -25.75F, 0.5F);
/*      */     
/* 4053 */     this.slideModel[6].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 4054 */     this.slideModel[6].setRotationPoint(-10.0F, -25.75F, 0.5F);
/*      */     
/* 4056 */     this.slideModel[7].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 4057 */     this.slideModel[7].setRotationPoint(-3.0F, -25.75F, 0.5F);
/*      */     
/* 4059 */     this.slideModel[8].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4060 */     this.slideModel[8].setRotationPoint(-10.0F, -23.75F, 0.5F);
/*      */     
/* 4062 */     this.slideModel[9].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 4063 */     this.slideModel[9].setRotationPoint(-3.0F, -23.75F, 0.5F);
/*      */     
/* 4065 */     this.slideModel[10].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 4066 */     this.slideModel[10].setRotationPoint(-8.0F, -25.25F, 0.5F);
/*      */     
/* 4068 */     this.slideModel[11].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 4069 */     this.slideModel[11].setRotationPoint(-7.0F, -25.25F, 0.5F);
/*      */     
/* 4071 */     this.slideModel[12].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 4072 */     this.slideModel[12].setRotationPoint(-7.5F, -25.25F, 0.5F);
/*      */     
/* 4074 */     this.slideModel[13].addShapeBox(39.0F, -13.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 4075 */     this.slideModel[13].setRotationPoint(-6.0F, -25.25F, 0.5F);
/*      */     
/* 4077 */     this.slideModel[14].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 4078 */     this.slideModel[14].setRotationPoint(-5.5F, -24.25F, 0.5F);
/*      */     
/* 4080 */     this.slideModel[15].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 4081 */     this.slideModel[15].setRotationPoint(-5.5F, -25.25F, 0.5F);
/*      */     
/* 4083 */     this.slideModel[16].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4084 */     this.slideModel[16].setRotationPoint(-19.0F, -27.0F, 0.25F);
/*      */     
/* 4086 */     this.slideModel[17].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4087 */     this.slideModel[17].setRotationPoint(-19.0F, -22.5F, 0.25F);
/*      */     
/* 4089 */     this.slideModel[18].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 4090 */     this.slideModel[18].setRotationPoint(-19.0F, -26.0F, 0.25F);
/*      */     
/* 4092 */     this.slideModel[19].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4093 */     this.slideModel[19].setRotationPoint(6.5F, -27.0F, 0.25F);
/*      */     
/* 4095 */     this.slideModel[20].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4096 */     this.slideModel[20].setRotationPoint(6.5F, -22.5F, 0.25F);
/*      */     
/* 4098 */     this.slideModel[21].addShapeBox(39.0F, -13.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 4099 */     this.slideModel[21].setRotationPoint(6.5F, -26.0F, 0.25F);
/*      */     
/* 4101 */     this.slideModel[22].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 4102 */     this.slideModel[22].setRotationPoint(-18.5F, -24.25F, 1.0F);
/*      */     
/* 4104 */     this.slideModel[23].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 4105 */     this.slideModel[23].setRotationPoint(-18.5F, -23.25F, 1.0F);
/*      */     
/* 4107 */     this.slideModel[24].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 4108 */     this.slideModel[24].setRotationPoint(-18.5F, -23.75F, 1.0F);
/*      */     
/* 4110 */     this.slideModel[25].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4111 */     this.slideModel[25].setRotationPoint(-18.0F, -23.85F, 1.25F);
/*      */     
/* 4113 */     this.slideModel[26].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 4114 */     this.slideModel[26].setRotationPoint(-18.0F, -22.85F, 1.25F);
/*      */     
/* 4116 */     this.slideModel[27].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4117 */     this.slideModel[27].setRotationPoint(-18.0F, -24.6F, 1.25F);
/*      */     
/* 4119 */     this.slideModel[28].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4120 */     this.slideModel[28].setRotationPoint(-16.0F, -23.85F, 1.25F);
/*      */     
/* 4122 */     this.slideModel[29].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 4123 */     this.slideModel[29].setRotationPoint(-16.0F, -22.85F, 1.25F);
/*      */     
/* 4125 */     this.slideModel[30].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4126 */     this.slideModel[30].setRotationPoint(-16.0F, -24.6F, 1.25F);
/*      */     
/* 4128 */     this.slideModel[31].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4129 */     this.slideModel[31].setRotationPoint(-14.0F, -23.85F, 1.25F);
/*      */     
/* 4131 */     this.slideModel[32].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 4132 */     this.slideModel[32].setRotationPoint(-14.0F, -22.85F, 1.25F);
/*      */     
/* 4134 */     this.slideModel[33].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4135 */     this.slideModel[33].setRotationPoint(-14.0F, -24.6F, 1.25F);
/*      */     
/* 4137 */     this.slideModel[34].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4138 */     this.slideModel[34].setRotationPoint(-12.0F, -23.85F, 1.25F);
/*      */     
/* 4140 */     this.slideModel[35].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 4141 */     this.slideModel[35].setRotationPoint(-12.0F, -22.85F, 1.25F);
/*      */     
/* 4143 */     this.slideModel[36].addShapeBox(39.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 4144 */     this.slideModel[36].setRotationPoint(-12.0F, -24.6F, 1.25F);
/*      */     
/* 4146 */     this.slideModel[37].addShapeBox(39.0F, -13.0F, -6.0F, 8, 3, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4147 */     this.slideModel[37].setRotationPoint(-1.0F, -25.75F, 0.75F);
/*      */     
/* 4149 */     this.slideModel[38].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4150 */     this.slideModel[38].setRotationPoint(-1.0F, -22.75F, 0.75F);
/*      */     
/* 4152 */     this.slideModel[39].addShapeBox(39.0F, -13.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4153 */     this.slideModel[39].setRotationPoint(-1.0F, -27.0F, 0.75F);
/*      */     
/* 4155 */     this.slideModel[40].addShapeBox(39.0F, -13.0F, -6.0F, 8, 1, 6, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 4156 */     this.slideModel[40].setRotationPoint(-1.0F, -26.75F, 0.75F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm27iar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */