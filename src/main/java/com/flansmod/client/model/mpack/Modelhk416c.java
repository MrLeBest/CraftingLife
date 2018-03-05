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
/*      */ public class Modelhk416c
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelhk416c()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ʑ'];
/*   22 */     this.defaultBarrelModel = new ModelRendererTurbo[14];
/*   23 */     this.defaultScopeModel = new ModelRendererTurbo[87];
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
/*   38 */     this.scopeAttachPoint = new Vector3f(0.9375F, 3.75F, 0.0F);
/*      */     
/*   40 */     this.gripAttachPoint = new Vector3f(6.25F, 2.5F, 0.0F);
/*      */     
/*      */ 
/*   43 */     translateAll(0.0F, -13.0F, 0.0F);
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
/*  103 */     this.gunModel[48] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[49] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[50] = new ModelRendererTurbo(this, 1777, 17, this.textureX, this.textureY);
/*  106 */     this.gunModel[51] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*  107 */     this.gunModel[52] = new ModelRendererTurbo(this, 1289, 17, this.textureX, this.textureY);
/*  108 */     this.gunModel[53] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  109 */     this.gunModel[54] = new ModelRendererTurbo(this, 889, 25, this.textureX, this.textureY);
/*  110 */     this.gunModel[55] = new ModelRendererTurbo(this, 1033, 25, this.textureX, this.textureY);
/*  111 */     this.gunModel[56] = new ModelRendererTurbo(this, 1425, 25, this.textureX, this.textureY);
/*  112 */     this.gunModel[57] = new ModelRendererTurbo(this, 1769, 9, this.textureX, this.textureY);
/*  113 */     this.gunModel[58] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  114 */     this.gunModel[59] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[60] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  116 */     this.gunModel[61] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  117 */     this.gunModel[62] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  118 */     this.gunModel[63] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  119 */     this.gunModel[64] = new ModelRendererTurbo(this, 889, 17, this.textureX, this.textureY);
/*  120 */     this.gunModel[65] = new ModelRendererTurbo(this, 985, 17, this.textureX, this.textureY);
/*  121 */     this.gunModel[66] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  122 */     this.gunModel[67] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  123 */     this.gunModel[68] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  124 */     this.gunModel[69] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*  125 */     this.gunModel[70] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  126 */     this.gunModel[71] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  127 */     this.gunModel[72] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[73] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/*  129 */     this.gunModel[74] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[75] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*  131 */     this.gunModel[76] = new ModelRendererTurbo(this, 705, 1, this.textureX, this.textureY);
/*  132 */     this.gunModel[77] = new ModelRendererTurbo(this, 1121, 1, this.textureX, this.textureY);
/*  133 */     this.gunModel[78] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  134 */     this.gunModel[79] = new ModelRendererTurbo(this, 1033, 17, this.textureX, this.textureY);
/*  135 */     this.gunModel[80] = new ModelRendererTurbo(this, 1065, 17, this.textureX, this.textureY);
/*  136 */     this.gunModel[81] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*  137 */     this.gunModel[82] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  138 */     this.gunModel[83] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  139 */     this.gunModel[84] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*  140 */     this.gunModel[85] = new ModelRendererTurbo(this, 1569, 25, this.textureX, this.textureY);
/*  141 */     this.gunModel[86] = new ModelRendererTurbo(this, 1137, 17, this.textureX, this.textureY);
/*  142 */     this.gunModel[87] = new ModelRendererTurbo(this, 1169, 17, this.textureX, this.textureY);
/*  143 */     this.gunModel[88] = new ModelRendererTurbo(this, 841, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[89] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[90] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*  146 */     this.gunModel[91] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  147 */     this.gunModel[92] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
/*  148 */     this.gunModel[93] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  149 */     this.gunModel[94] = new ModelRendererTurbo(this, 1705, 25, this.textureX, this.textureY);
/*  150 */     this.gunModel[95] = new ModelRendererTurbo(this, 1849, 25, this.textureX, this.textureY);
/*  151 */     this.gunModel[96] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  152 */     this.gunModel[97] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  153 */     this.gunModel[98] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  154 */     this.gunModel[99] = new ModelRendererTurbo(this, 617, 33, this.textureX, this.textureY);
/*  155 */     this.gunModel[100] = new ModelRendererTurbo(this, 753, 33, this.textureX, this.textureY);
/*  156 */     this.gunModel[101] = new ModelRendererTurbo(this, 1177, 33, this.textureX, this.textureY);
/*  157 */     this.gunModel[102] = new ModelRendererTurbo(this, 1577, 33, this.textureX, this.textureY);
/*  158 */     this.gunModel[103] = new ModelRendererTurbo(this, 1713, 33, this.textureX, this.textureY);
/*  159 */     this.gunModel[104] = new ModelRendererTurbo(this, 1993, 17, this.textureX, this.textureY);
/*  160 */     this.gunModel[105] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  161 */     this.gunModel[106] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*  162 */     this.gunModel[107] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*  163 */     this.gunModel[108] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  164 */     this.gunModel[109] = new ModelRendererTurbo(this, 1049, 1, this.textureX, this.textureY);
/*  165 */     this.gunModel[110] = new ModelRendererTurbo(this, 1089, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[111] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*  167 */     this.gunModel[112] = new ModelRendererTurbo(this, 1201, 17, this.textureX, this.textureY);
/*  168 */     this.gunModel[113] = new ModelRendererTurbo(this, 1913, 17, this.textureX, this.textureY);
/*  169 */     this.gunModel[114] = new ModelRendererTurbo(this, 1169, 25, this.textureX, this.textureY);
/*  170 */     this.gunModel[115] = new ModelRendererTurbo(this, 1201, 25, this.textureX, this.textureY);
/*  171 */     this.gunModel[116] = new ModelRendererTurbo(this, 1233, 25, this.textureX, this.textureY);
/*  172 */     this.gunModel[117] = new ModelRendererTurbo(this, 521, 25, this.textureX, this.textureY);
/*  173 */     this.gunModel[118] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/*  174 */     this.gunModel[119] = new ModelRendererTurbo(this, 841, 9, this.textureX, this.textureY);
/*  175 */     this.gunModel[120] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/*  176 */     this.gunModel[121] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/*  177 */     this.gunModel[122] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*  178 */     this.gunModel[123] = new ModelRendererTurbo(this, 1953, 1, this.textureX, this.textureY);
/*  179 */     this.gunModel[124] = new ModelRendererTurbo(this, 1977, 1, this.textureX, this.textureY);
/*  180 */     this.gunModel[125] = new ModelRendererTurbo(this, 1993, 1, this.textureX, this.textureY);
/*  181 */     this.gunModel[126] = new ModelRendererTurbo(this, 1961, 1, this.textureX, this.textureY);
/*  182 */     this.gunModel[127] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 9, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 873, 9, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 2041, 1, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 601, 41, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 881, 41, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 1993, 25, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 1513, 9, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 1265, 25, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 1321, 33, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 1345, 33, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 1393, 33, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 1993, 33, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 2017, 33, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 1025, 41, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 1057, 41, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 1137, 9, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 1817, 9, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 649, 17, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  211 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  212 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  213 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  214 */     this.gunModel[''] = new ModelRendererTurbo(this, 1089, 41, this.textureX, this.textureY);
/*  215 */     this.gunModel[' '] = new ModelRendererTurbo(this, 1121, 41, this.textureX, this.textureY);
/*  216 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
/*  217 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*  218 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1025, 25, this.textureX, this.textureY);
/*  219 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 1153, 41, this.textureX, this.textureY);
/*  220 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1321, 41, this.textureX, this.textureY);
/*  221 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 1337, 41, this.textureX, this.textureY);
/*  222 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1353, 41, this.textureX, this.textureY);
/*  223 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 1369, 41, this.textureX, this.textureY);
/*  224 */     this.gunModel['©'] = new ModelRendererTurbo(this, 1385, 41, this.textureX, this.textureY);
/*  225 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1433, 41, this.textureX, this.textureY);
/*  226 */     this.gunModel['«'] = new ModelRendererTurbo(this, 1497, 41, this.textureX, this.textureY);
/*  227 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1513, 41, this.textureX, this.textureY);
/*  228 */     this.gunModel['­'] = new ModelRendererTurbo(this, 1529, 41, this.textureX, this.textureY);
/*  229 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1545, 41, this.textureX, this.textureY);
/*  230 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1561, 41, this.textureX, this.textureY);
/*  231 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1577, 41, this.textureX, this.textureY);
/*  232 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1593, 41, this.textureX, this.textureY);
/*  233 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1641, 41, this.textureX, this.textureY);
/*  234 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1689, 41, this.textureX, this.textureY);
/*  235 */     this.gunModel['´'] = new ModelRendererTurbo(this, 1833, 41, this.textureX, this.textureY);
/*  236 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 1961, 41, this.textureX, this.textureY);
/*  237 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 1993, 41, this.textureX, this.textureY);
/*  238 */     this.gunModel['·'] = new ModelRendererTurbo(this, 1985, 41, this.textureX, this.textureY);
/*  239 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  240 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  241 */     this.gunModel['º'] = new ModelRendererTurbo(this, 2017, 41, this.textureX, this.textureY);
/*  242 */     this.gunModel['»'] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  243 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  244 */     this.gunModel['½'] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  245 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  246 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 905, 9, this.textureX, this.textureY);
/*  247 */     this.gunModel['À'] = new ModelRendererTurbo(this, 1649, 9, this.textureX, this.textureY);
/*  248 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  249 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 529, 9, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*  252 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/*  253 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 553, 49, this.textureX, this.textureY);
/*  255 */     this.gunModel['È'] = new ModelRendererTurbo(this, 569, 49, this.textureX, this.textureY);
/*  256 */     this.gunModel['É'] = new ModelRendererTurbo(this, 753, 49, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 769, 49, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 785, 49, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1081, 49, this.textureX, this.textureY);
/*  260 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 1137, 49, this.textureX, this.textureY);
/*  261 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 1177, 49, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1225, 49, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 1273, 49, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 1321, 49, this.textureX, this.textureY);
/*  268 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 1369, 49, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 1409, 49, this.textureX, this.textureY);
/*  270 */     this.gunModel['×'] = new ModelRendererTurbo(this, 1449, 49, this.textureX, this.textureY);
/*  271 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 1489, 49, this.textureX, this.textureY);
/*  272 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1529, 49, this.textureX, this.textureY);
/*  273 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 1569, 49, this.textureX, this.textureY);
/*  274 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 1129, 49, this.textureX, this.textureY);
/*  275 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 1601, 49, this.textureX, this.textureY);
/*  276 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 929, 17, this.textureX, this.textureY);
/*  277 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1625, 49, this.textureX, this.textureY);
/*  278 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*  279 */     this.gunModel['à'] = new ModelRendererTurbo(this, 1409, 33, this.textureX, this.textureY);
/*  280 */     this.gunModel['á'] = new ModelRendererTurbo(this, 1657, 49, this.textureX, this.textureY);
/*  281 */     this.gunModel['â'] = new ModelRendererTurbo(this, 1681, 49, this.textureX, this.textureY);
/*  282 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 1705, 49, this.textureX, this.textureY);
/*  283 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 1729, 49, this.textureX, this.textureY);
/*  284 */     this.gunModel['å'] = new ModelRendererTurbo(this, 1753, 49, this.textureX, this.textureY);
/*  285 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  286 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  287 */     this.gunModel['è'] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*  288 */     this.gunModel['é'] = new ModelRendererTurbo(this, 545, 9, this.textureX, this.textureY);
/*  289 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 561, 9, this.textureX, this.textureY);
/*  290 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*  291 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 1777, 49, this.textureX, this.textureY);
/*  292 */     this.gunModel['í'] = new ModelRendererTurbo(this, 569, 9, this.textureX, this.textureY);
/*  293 */     this.gunModel['î'] = new ModelRendererTurbo(this, 593, 9, this.textureX, this.textureY);
/*  294 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 609, 9, this.textureX, this.textureY);
/*  295 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 593, 57, this.textureX, this.textureY);
/*  296 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 897, 57, this.textureX, this.textureY);
/*  297 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 1281, 57, this.textureX, this.textureY);
/*  298 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/*  299 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 1353, 49, this.textureX, this.textureY);
/*  300 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 1609, 49, this.textureX, this.textureY);
/*  301 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 817, 57, this.textureX, this.textureY);
/*  302 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 1689, 49, this.textureX, this.textureY);
/*  303 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 1713, 49, this.textureX, this.textureY);
/*  304 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 961, 57, this.textureX, this.textureY);
/*  305 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 1737, 49, this.textureX, this.textureY);
/*  306 */     this.gunModel['û'] = new ModelRendererTurbo(this, 993, 57, this.textureX, this.textureY);
/*  307 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/*  308 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 1041, 57, this.textureX, this.textureY);
/*  309 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/*  310 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1385, 57, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 537, 57, this.textureX, this.textureY);
/*  312 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 1417, 57, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 737, 57, this.textureX, this.textureY);
/*  314 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 1449, 57, this.textureX, this.textureY);
/*  315 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 1481, 57, this.textureX, this.textureY);
/*  316 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 1505, 57, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1537, 57, this.textureX, this.textureY);
/*  318 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 1561, 57, this.textureX, this.textureY);
/*  319 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 1649, 57, this.textureX, this.textureY);
/*  320 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 1753, 57, this.textureX, this.textureY);
/*  321 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 1673, 57, this.textureX, this.textureY);
/*  322 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 1961, 57, this.textureX, this.textureY);
/*  323 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/*  324 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1993, 57, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/*  326 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/*  327 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 1265, 57, this.textureX, this.textureY);
/*  328 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 377, 65, this.textureX, this.textureY);
/*  330 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/*  332 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 553, 65, this.textureX, this.textureY);
/*  334 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 593, 65, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 641, 65, this.textureX, this.textureY);
/*  336 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 689, 65, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 753, 65, this.textureX, this.textureY);
/*  338 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 521, 65, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 841, 65, this.textureX, this.textureY);
/*  340 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 897, 65, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 929, 65, this.textureX, this.textureY);
/*  342 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 1017, 65, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 1065, 65, this.textureX, this.textureY);
/*  344 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 1097, 65, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1129, 65, this.textureX, this.textureY);
/*  346 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1161, 65, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1201, 65, this.textureX, this.textureY);
/*  348 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 785, 65, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 1241, 65, this.textureX, this.textureY);
/*  350 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 1281, 65, this.textureX, this.textureY);
/*  351 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1305, 65, this.textureX, this.textureY);
/*  352 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 1329, 65, this.textureX, this.textureY);
/*  353 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 1689, 65, this.textureX, this.textureY);
/*  354 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 1369, 65, this.textureX, this.textureY);
/*  355 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 1585, 65, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 1777, 65, this.textureX, this.textureY);
/*  357 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 1625, 65, this.textureX, this.textureY);
/*  358 */     this.gunModel['į'] = new ModelRendererTurbo(this, 1825, 65, this.textureX, this.textureY);
/*  359 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 185, 57, this.textureX, this.textureY);
/*  360 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/*  362 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 1065, 57, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 1409, 57, this.textureX, this.textureY);
/*  364 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 1441, 57, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 1849, 65, this.textureX, this.textureY);
/*  366 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  367 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1881, 65, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 1913, 65, this.textureX, this.textureY);
/*  369 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 1937, 65, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 2017, 65, this.textureX, this.textureY);
/*  371 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/*  373 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/*  375 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 625, 65, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/*  377 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/*  379 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 953, 73, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 809, 73, this.textureX, this.textureY);
/*  381 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 729, 73, this.textureX, this.textureY);
/*  383 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 865, 73, this.textureX, this.textureY);
/*  384 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 1041, 73, this.textureX, this.textureY);
/*  385 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 673, 65, this.textureX, this.textureY);
/*  386 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 1473, 57, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 1185, 73, this.textureX, this.textureY);
/*  388 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 1225, 73, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/*  390 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 889, 81, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/*  392 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 921, 65, this.textureX, this.textureY);
/*  393 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 1009, 81, this.textureX, this.textureY);
/*  394 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 937, 81, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 1065, 81, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 1105, 81, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 1145, 81, this.textureX, this.textureY);
/*  398 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 1201, 81, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 1273, 81, this.textureX, this.textureY);
/*  400 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 1313, 81, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 1577, 81, this.textureX, this.textureY);
/*  402 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 1617, 81, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 1681, 81, this.textureX, this.textureY);
/*  404 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 1361, 81, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 1705, 81, this.textureX, this.textureY);
/*  406 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 1809, 81, this.textureX, this.textureY);
/*  407 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 1841, 81, this.textureX, this.textureY);
/*  408 */     this.gunModel['š'] = new ModelRendererTurbo(this, 1241, 81, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 1665, 81, this.textureX, this.textureY);
/*  410 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 1873, 81, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 1905, 81, this.textureX, this.textureY);
/*  412 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 1937, 81, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 2009, 81, this.textureX, this.textureY);
/*  414 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 41, 89, this.textureX, this.textureY);
/*  416 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 513, 65, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 1089, 65, this.textureX, this.textureY);
/*  418 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 1089, 81, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1121, 65, this.textureX, this.textureY);
/*  420 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  422 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 1153, 65, this.textureX, this.textureY);
/*  424 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 1841, 65, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  426 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 1873, 65, this.textureX, this.textureY);
/*  428 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 1297, 65, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 1321, 65, this.textureX, this.textureY);
/*  430 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 225, 89, this.textureX, this.textureY);
/*  431 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 1129, 81, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 1169, 81, this.textureX, this.textureY);
/*  433 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 265, 89, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 425, 89, this.textureX, this.textureY);
/*  435 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 681, 89, this.textureX, this.textureY);
/*  436 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 1817, 65, this.textureX, this.textureY);
/*  437 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/*  438 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/*  439 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 1297, 81, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 1561, 1, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 1905, 65, this.textureX, this.textureY);
/*  442 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 1929, 65, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/*  444 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 1729, 81, this.textureX, this.textureY);
/*  447 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 1833, 81, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 1697, 1, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 1865, 81, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 993, 73, this.textureX, this.textureY);
/*  451 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 729, 89, this.textureX, this.textureY);
/*  452 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 1889, 81, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 985, 9, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 889, 9, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*  458 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 777, 89, this.textureX, this.textureY);
/*  460 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 953, 89, this.textureX, this.textureY);
/*  461 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 1513, 89, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 865, 89, this.textureX, this.textureY);
/*  463 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 1041, 89, this.textureX, this.textureY);
/*  464 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 1745, 89, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 825, 89, this.textureX, this.textureY);
/*  466 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 1185, 89, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 1225, 89, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 1561, 89, this.textureX, this.textureY);
/*  469 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 1601, 89, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 1777, 89, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 1849, 49, this.textureX, this.textureY);
/*  472 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 1905, 49, this.textureX, this.textureY);
/*  473 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/*  474 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1961, 89, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 1921, 81, this.textureX, this.textureY);
/*  476 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 1993, 9, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 545, 49, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 1441, 49, this.textureX, this.textureY);
/*  479 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 1089, 9, this.textureX, this.textureY);
/*  480 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 1449, 73, this.textureX, this.textureY);
/*  481 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 1481, 49, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/*  484 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 1977, 9, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 601, 49, this.textureX, this.textureY);
/*  487 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 881, 49, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 1097, 9, this.textureX, this.textureY);
/*  490 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 1225, 1, this.textureX, this.textureY);
/*  492 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 841, 49, this.textureX, this.textureY);
/*  493 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 1025, 49, this.textureX, this.textureY);
/*  494 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 1129, 49, this.textureX, this.textureY);
/*  495 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 881, 9, this.textureX, this.textureY);
/*  496 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 1225, 49, this.textureX, this.textureY);
/*  497 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*  498 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 569, 49, this.textureX, this.textureY);
/*  499 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 753, 49, this.textureX, this.textureY);
/*  500 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 769, 49, this.textureX, this.textureY);
/*  501 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 1521, 49, this.textureX, this.textureY);
/*  502 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 785, 49, this.textureX, this.textureY);
/*  503 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 1273, 49, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 1369, 49, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 1561, 49, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 1601, 49, this.textureX, this.textureY);
/*  507 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 1121, 9, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 1129, 9, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 1281, 9, this.textureX, this.textureY);
/*  510 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 1345, 9, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 1513, 73, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 2025, 81, this.textureX, this.textureY);
/*  513 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 1961, 57, this.textureX, this.textureY);
/*  514 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 2017, 57, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 1977, 89, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/*  518 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/*  519 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
/*  520 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 1569, 49, this.textureX, this.textureY);
/*  525 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/*  526 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 625, 65, this.textureX, this.textureY);
/*  527 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 2017, 9, this.textureX, this.textureY);
/*  528 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 1425, 17, this.textureX, this.textureY);
/*  529 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/*  530 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 809, 73, this.textureX, this.textureY);
/*  531 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 1105, 81, this.textureX, this.textureY);
/*  532 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 673, 65, this.textureX, this.textureY);
/*  533 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 1961, 49, this.textureX, this.textureY);
/*  534 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 2017, 49, this.textureX, this.textureY);
/*  535 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 249, 97, this.textureX, this.textureY);
/*  536 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/*  537 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/*  538 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 1625, 49, this.textureX, this.textureY);
/*  539 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 1705, 49, this.textureX, this.textureY);
/*  540 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  541 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 1729, 49, this.textureX, this.textureY);
/*  542 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/*  543 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/*  544 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/*  545 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 721, 89, this.textureX, this.textureY);
/*  546 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 817, 89, this.textureX, this.textureY);
/*  547 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 993, 89, this.textureX, this.textureY);
/*  548 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/*  549 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 1577, 73, this.textureX, this.textureY);
/*  550 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 1313, 81, this.textureX, this.textureY);
/*  551 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/*  552 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 569, 97, this.textureX, this.textureY);
/*  553 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 1073, 97, this.textureX, this.textureY);
/*  554 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 897, 97, this.textureX, this.textureY);
/*      */     
/*  556 */     this.gunModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 25, 13, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  557 */     this.gunModel[0].setRotationPoint(-45.0F, -19.5F, 0.5F);
/*      */     
/*  559 */     this.gunModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/*  560 */     this.gunModel[1].setRotationPoint(-20.0F, -6.75F, 0.5F);
/*      */     
/*  562 */     this.gunModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 22, 21, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  563 */     this.gunModel[2].setRotationPoint(-15.0F, -19.5F, 0.0F);
/*      */     
/*  565 */     this.gunModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 64, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[3].setRotationPoint(-52.0F, -27.0F, 3.5F);
/*      */     
/*  568 */     this.gunModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 1, 16, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F);
/*  569 */     this.gunModel[4].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  571 */     this.gunModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  572 */     this.gunModel[5].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  574 */     this.gunModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[6].setRotationPoint(8.0F, -15.5F, 0.0F);
/*      */     
/*  577 */     this.gunModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[7].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  580 */     this.gunModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  581 */     this.gunModel[8].setRotationPoint(7.5F, -15.5F, 0.0F);
/*      */     
/*  583 */     this.gunModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  584 */     this.gunModel[9].setRotationPoint(7.5F, -16.0F, 0.0F);
/*      */     
/*  586 */     this.gunModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  587 */     this.gunModel[10].setRotationPoint(11.5F, -16.0F, 0.0F);
/*      */     
/*  589 */     this.gunModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  590 */     this.gunModel[11].setRotationPoint(11.5F, -15.5F, 0.0F);
/*      */     
/*  592 */     this.gunModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  593 */     this.gunModel[12].setRotationPoint(7.5F, -17.0F, 0.0F);
/*      */     
/*  595 */     this.gunModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  596 */     this.gunModel[13].setRotationPoint(7.5F, -18.0F, 0.0F);
/*      */     
/*  598 */     this.gunModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  599 */     this.gunModel[14].setRotationPoint(11.5F, -18.0F, 0.0F);
/*      */     
/*  601 */     this.gunModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  602 */     this.gunModel[15].setRotationPoint(11.5F, -18.5F, 0.0F);
/*      */     
/*  604 */     this.gunModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[16].setRotationPoint(9.0F, -19.0F, 0.0F);
/*      */     
/*  607 */     this.gunModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 12, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  608 */     this.gunModel[17].setRotationPoint(7.0F, -19.0F, 0.0F);
/*      */     
/*  610 */     this.gunModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 13, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  611 */     this.gunModel[18].setRotationPoint(9.5F, -17.0F, -0.5F);
/*      */     
/*  613 */     this.gunModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 13, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  614 */     this.gunModel[19].setRotationPoint(9.5F, -17.5F, -0.5F);
/*      */     
/*  616 */     this.gunModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 13, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/*  617 */     this.gunModel[20].setRotationPoint(9.5F, -16.5F, -0.5F);
/*      */     
/*  619 */     this.gunModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, 0.0F, 0.5F, 0.0F);
/*  620 */     this.gunModel[21].setRotationPoint(7.5F, 0.0F, 0.0F);
/*      */     
/*  622 */     this.gunModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 5, 9, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[22].setRotationPoint(-20.0F, -19.5F, 0.0F);
/*      */     
/*  625 */     this.gunModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  626 */     this.gunModel[23].setRotationPoint(-20.0F, -10.5F, 0.0F);
/*      */     
/*  628 */     this.gunModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  629 */     this.gunModel[24].setRotationPoint(-20.0F, -9.5F, 0.0F);
/*      */     
/*  631 */     this.gunModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 12, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F);
/*  632 */     this.gunModel[25].setRotationPoint(-17.0F, -9.0F, 0.0F);
/*      */     
/*  634 */     this.gunModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 5, 12, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  635 */     this.gunModel[26].setRotationPoint(-20.0F, -18.5F, 0.5F);
/*      */     
/*  637 */     this.gunModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 22, 1, 14, 0.0F, 0.0F, -1.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 1.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 1.5F, 0.5F);
/*  638 */     this.gunModel[27].setRotationPoint(-15.0F, 1.5F, -1.0F);
/*      */     
/*  640 */     this.gunModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 22, 1, 15, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  641 */     this.gunModel[28].setRotationPoint(-15.0F, 2.5F, -1.5F);
/*      */     
/*  643 */     this.gunModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 25, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  644 */     this.gunModel[29].setRotationPoint(-45.0F, -21.25F, 0.5F);
/*      */     
/*  646 */     this.gunModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 28, 3, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  647 */     this.gunModel[30].setRotationPoint(-20.0F, -22.5F, 4.0F);
/*      */     
/*  649 */     this.gunModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 8, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  650 */     this.gunModel[31].setRotationPoint(8.0F, -22.5F, 4.0F);
/*      */     
/*  652 */     this.gunModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 65, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/*  653 */     this.gunModel[32].setRotationPoint(-53.0F, -24.0F, 11.5F);
/*      */     
/*  655 */     this.gunModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 65, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/*  656 */     this.gunModel[33].setRotationPoint(-53.0F, -30.0F, 10.5F);
/*      */     
/*  658 */     this.gunModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 65, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  659 */     this.gunModel[34].setRotationPoint(-53.0F, -27.0F, 11.5F);
/*      */     
/*  661 */     this.gunModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 55, 3, 9, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F);
/*  662 */     this.gunModel[35].setRotationPoint(-43.0F, -32.75F, 1.5F);
/*      */     
/*  664 */     this.gunModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 35, 2, 11, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/*  665 */     this.gunModel[36].setRotationPoint(-54.0F, -20.25F, 0.5F);
/*      */     
/*  667 */     this.gunModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 15, 0.0F, -0.5F, -1.5F, 0.0F, 0.5F, -1.25F, -1.0F, 0.5F, -1.25F, -1.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.5F, 0.0F, 0.5F, 1.25F, -1.0F, 0.5F, 1.25F, -1.0F, -0.5F, 1.5F, 0.0F);
/*  668 */     this.gunModel[37].setRotationPoint(7.0F, 1.0F, -1.5F);
/*      */     
/*  670 */     this.gunModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 14, 0.0F, -0.5F, -1.5F, -1.0F, 0.5F, -1.25F, -2.0F, 0.5F, -1.25F, -2.0F, -0.5F, -1.5F, -1.0F, -0.5F, 1.5F, 0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, -0.5F, 1.5F, 0.5F);
/*  671 */     this.gunModel[38].setRotationPoint(7.0F, 0.0F, -1.0F);
/*      */     
/*  673 */     this.gunModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -1.5F, 0.5F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, -0.5F, -1.5F, 0.5F, -0.5F, 1.5F, 0.5F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, -0.5F, 1.5F, 0.5F);
/*  674 */     this.gunModel[39].setRotationPoint(9.0F, 0.75F, 0.0F);
/*      */     
/*  676 */     this.gunModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -1.5F, -1.0F, 0.0F, -2.25F, -1.0F, 0.0F, -2.25F, -1.0F, -0.5F, -1.5F, -1.0F, -0.5F, 1.5F, 0.5F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, -0.5F, 1.5F, 0.5F);
/*  677 */     this.gunModel[40].setRotationPoint(9.0F, -0.25F, 0.0F);
/*      */     
/*  679 */     this.gunModel[41].addShapeBox(40.0F, -11.0F, -6.0F, 56, 3, 10, 0.0F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F);
/*  680 */     this.gunModel[41].setRotationPoint(-44.0F, -34.75F, 1.0F);
/*      */     
/*  682 */     this.gunModel[42].addShapeBox(40.0F, -11.0F, -6.0F, 55, 2, 7, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/*  683 */     this.gunModel[42].setRotationPoint(-43.0F, -35.75F, 2.5F);
/*      */     
/*  685 */     this.gunModel[43].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  686 */     this.gunModel[43].setRotationPoint(8.0F, -21.25F, 0.5F);
/*      */     
/*  688 */     this.gunModel[44].addShapeBox(40.0F, -11.0F, -6.0F, 65, 3, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  689 */     this.gunModel[44].setRotationPoint(-53.0F, -29.75F, 1.5F);
/*      */     
/*  691 */     this.gunModel[45].addShapeBox(40.0F, -11.0F, -6.0F, 33, 3, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  692 */     this.gunModel[45].setRotationPoint(-53.0F, -24.0F, -0.5F);
/*      */     
/*  694 */     this.gunModel[46].addShapeBox(40.0F, -11.0F, -6.0F, 33, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  695 */     this.gunModel[46].setRotationPoint(-53.0F, -27.0F, -1.5F);
/*      */     
/*  697 */     this.gunModel[47].addShapeBox(40.0F, -11.0F, -6.0F, 52, 1, 7, 0.0F, 0.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.5F, -0.5F, 1.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/*  698 */     this.gunModel[47].setRotationPoint(-40.0F, -37.0F, 2.5F);
/*      */     
/*  700 */     this.gunModel[48].addShapeBox(40.0F, -11.0F, -6.0F, 53, 1, 7, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.5F, -0.5F, 1.25F);
/*  701 */     this.gunModel[48].setRotationPoint(-40.0F, -37.5F, 2.5F);
/*      */     
/*  703 */     this.gunModel[49].addShapeBox(40.0F, -11.0F, -6.0F, 52, 1, 9, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F);
/*  704 */     this.gunModel[49].setRotationPoint(-40.0F, -37.0F, 1.5F);
/*      */     
/*  706 */     this.gunModel[50].addShapeBox(40.0F, -11.0F, -6.0F, 66, 3, 1, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  707 */     this.gunModel[50].setRotationPoint(12.0F, -32.75F, 1.0F);
/*      */     
/*  709 */     this.gunModel[51].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 4, 0.0F, -0.25F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.25F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F);
/*  710 */     this.gunModel[51].setRotationPoint(12.0F, -33.75F, -0.5F);
/*      */     
/*  712 */     this.gunModel[52].addShapeBox(40.0F, -11.0F, -6.0F, 64, 2, 7, 0.0F, -0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F);
/*  713 */     this.gunModel[52].setRotationPoint(12.0F, -35.75F, 2.5F);
/*      */     
/*  715 */     this.gunModel[53].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 7, 0.0F, -0.5F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F);
/*  716 */     this.gunModel[53].setRotationPoint(76.0F, -35.75F, 2.5F);
/*      */     
/*  718 */     this.gunModel[54].addShapeBox(40.0F, -11.0F, -6.0F, 64, 1, 7, 0.0F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  719 */     this.gunModel[54].setRotationPoint(12.0F, -37.0F, 2.5F);
/*      */     
/*  721 */     this.gunModel[55].addShapeBox(40.0F, -11.0F, -6.0F, 64, 1, 7, 0.0F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 1.25F, -1.5F, -0.5F, 1.25F, -1.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F);
/*  722 */     this.gunModel[55].setRotationPoint(13.0F, -37.5F, 2.5F);
/*      */     
/*  724 */     this.gunModel[56].addShapeBox(40.0F, -11.0F, -6.0F, 65, 1, 9, 0.0F, 0.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  725 */     this.gunModel[56].setRotationPoint(12.0F, -37.0F, 1.5F);
/*      */     
/*  727 */     this.gunModel[57].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  728 */     this.gunModel[57].setRotationPoint(12.0F, -29.0F, -3.5F);
/*      */     
/*  730 */     this.gunModel[58].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  731 */     this.gunModel[58].setRotationPoint(37.0F, -29.0F, -3.5F);
/*      */     
/*  733 */     this.gunModel[59].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  734 */     this.gunModel[59].setRotationPoint(54.0F, -29.0F, -3.5F);
/*      */     
/*  736 */     this.gunModel[60].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  737 */     this.gunModel[60].setRotationPoint(72.0F, -29.0F, -3.5F);
/*      */     
/*  739 */     this.gunModel[61].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  740 */     this.gunModel[61].setRotationPoint(31.0F, -28.0F, -3.0F);
/*      */     
/*  742 */     this.gunModel[62].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  743 */     this.gunModel[62].setRotationPoint(31.0F, -29.0F, -3.5F);
/*      */     
/*  745 */     this.gunModel[63].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/*  746 */     this.gunModel[63].setRotationPoint(36.25F, -29.0F, -3.5F);
/*      */     
/*  748 */     this.gunModel[64].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  749 */     this.gunModel[64].setRotationPoint(12.0F, -30.0F, 11.5F);
/*      */     
/*  751 */     this.gunModel[65].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  752 */     this.gunModel[65].setRotationPoint(12.0F, -29.0F, 12.5F);
/*      */     
/*  754 */     this.gunModel[66].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  755 */     this.gunModel[66].setRotationPoint(37.0F, -30.0F, 11.5F);
/*      */     
/*  757 */     this.gunModel[67].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  758 */     this.gunModel[67].setRotationPoint(37.0F, -29.0F, 12.5F);
/*      */     
/*  760 */     this.gunModel[68].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  761 */     this.gunModel[68].setRotationPoint(31.0F, -30.0F, 11.0F);
/*      */     
/*  763 */     this.gunModel[69].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  764 */     this.gunModel[69].setRotationPoint(31.0F, -28.0F, 12.5F);
/*      */     
/*  766 */     this.gunModel[70].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  767 */     this.gunModel[70].setRotationPoint(31.0F, -29.0F, 12.5F);
/*      */     
/*  769 */     this.gunModel[71].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  770 */     this.gunModel[71].setRotationPoint(36.25F, -29.0F, 12.5F);
/*      */     
/*  772 */     this.gunModel[72].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  773 */     this.gunModel[72].setRotationPoint(54.0F, -30.0F, 11.5F);
/*      */     
/*  775 */     this.gunModel[73].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  776 */     this.gunModel[73].setRotationPoint(54.0F, -29.0F, 12.5F);
/*      */     
/*  778 */     this.gunModel[74].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  779 */     this.gunModel[74].setRotationPoint(72.0F, -30.0F, 11.5F);
/*      */     
/*  781 */     this.gunModel[75].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  782 */     this.gunModel[75].setRotationPoint(72.0F, -29.0F, 12.5F);
/*      */     
/*  784 */     this.gunModel[76].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  785 */     this.gunModel[76].setRotationPoint(31.0F, -28.0F, 12.0F);
/*      */     
/*  787 */     this.gunModel[77].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  788 */     this.gunModel[77].setRotationPoint(43.0F, -28.0F, 12.5F);
/*      */     
/*  790 */     this.gunModel[78].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  791 */     this.gunModel[78].setRotationPoint(43.0F, -28.0F, 12.0F);
/*      */     
/*  793 */     this.gunModel[79].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  794 */     this.gunModel[79].setRotationPoint(60.0F, -28.0F, 12.5F);
/*      */     
/*  796 */     this.gunModel[80].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  797 */     this.gunModel[80].setRotationPoint(60.0F, -28.0F, 12.0F);
/*      */     
/*  799 */     this.gunModel[81].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  800 */     this.gunModel[81].setRotationPoint(43.0F, -29.0F, 12.5F);
/*      */     
/*  802 */     this.gunModel[82].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  803 */     this.gunModel[82].setRotationPoint(53.25F, -29.0F, 12.5F);
/*      */     
/*  805 */     this.gunModel[83].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  806 */     this.gunModel[83].setRotationPoint(60.0F, -29.0F, 12.5F);
/*      */     
/*  808 */     this.gunModel[84].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  809 */     this.gunModel[84].setRotationPoint(71.25F, -29.0F, 12.5F);
/*      */     
/*  811 */     this.gunModel[85].addShapeBox(40.0F, -11.0F, -6.0F, 66, 3, 1, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  812 */     this.gunModel[85].setRotationPoint(12.0F, -32.75F, 10.0F);
/*      */     
/*  814 */     this.gunModel[86].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  815 */     this.gunModel[86].setRotationPoint(60.0F, -29.0F, 12.5F);
/*      */     
/*  817 */     this.gunModel[87].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  818 */     this.gunModel[87].setRotationPoint(43.0F, -29.0F, 12.5F);
/*      */     
/*  820 */     this.gunModel[88].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  821 */     this.gunModel[88].setRotationPoint(31.0F, -29.0F, 12.5F);
/*      */     
/*  823 */     this.gunModel[89].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  824 */     this.gunModel[89].setRotationPoint(36.25F, -30.0F, 11.0F);
/*      */     
/*  826 */     this.gunModel[90].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  827 */     this.gunModel[90].setRotationPoint(43.0F, -30.0F, 11.0F);
/*      */     
/*  829 */     this.gunModel[91].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  830 */     this.gunModel[91].setRotationPoint(53.25F, -30.0F, 11.0F);
/*      */     
/*  832 */     this.gunModel[92].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  833 */     this.gunModel[92].setRotationPoint(60.0F, -30.0F, 11.0F);
/*      */     
/*  835 */     this.gunModel[93].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  836 */     this.gunModel[93].setRotationPoint(71.25F, -30.0F, 11.0F);
/*      */     
/*  838 */     this.gunModel[94].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 4, 0.0F, -0.25F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -0.75F, -1.5F, -0.25F, -0.75F, -1.5F, -0.25F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F);
/*  839 */     this.gunModel[94].setRotationPoint(12.0F, -33.75F, 8.5F);
/*      */     
/*  841 */     this.gunModel[95].addShapeBox(40.0F, -11.0F, -6.0F, 67, 9, 1, 0.0F, -0.25F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  842 */     this.gunModel[95].setRotationPoint(11.0F, -28.5F, 14.5F);
/*      */     
/*  844 */     this.gunModel[96].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  845 */     this.gunModel[96].setRotationPoint(12.0F, -26.0F, 14.0F);
/*      */     
/*  847 */     this.gunModel[97].addShapeBox(40.0F, -11.0F, -6.0F, 67, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, -1.75F, -0.5F, -0.25F, -1.75F, -0.5F);
/*  848 */     this.gunModel[97].setRotationPoint(11.0F, -28.5F, 16.0F);
/*      */     
/*  850 */     this.gunModel[98].addShapeBox(40.0F, -11.0F, -6.0F, 67, 9, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  851 */     this.gunModel[98].setRotationPoint(11.0F, -28.5F, 15.0F);
/*      */     
/*  853 */     this.gunModel[99].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  854 */     this.gunModel[99].setRotationPoint(12.0F, -24.25F, 14.0F);
/*      */     
/*  856 */     this.gunModel[100].addShapeBox(40.0F, -11.0F, -6.0F, 67, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, -0.5F, -0.25F, -1.75F, -0.5F);
/*  857 */     this.gunModel[100].setRotationPoint(11.0F, -28.5F, -3.5F);
/*      */     
/*  859 */     this.gunModel[101].addShapeBox(40.0F, -11.0F, -6.0F, 67, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F);
/*  860 */     this.gunModel[101].setRotationPoint(11.0F, -28.5F, -4.0F);
/*      */     
/*  862 */     this.gunModel[102].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  863 */     this.gunModel[102].setRotationPoint(12.0F, -26.0F, -3.0F);
/*      */     
/*  865 */     this.gunModel[103].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  866 */     this.gunModel[103].setRotationPoint(12.0F, -24.25F, -3.0F);
/*      */     
/*  868 */     this.gunModel[104].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  869 */     this.gunModel[104].setRotationPoint(12.0F, -21.25F, 11.5F);
/*      */     
/*  871 */     this.gunModel[105].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  872 */     this.gunModel[105].setRotationPoint(12.0F, -22.25F, 12.5F);
/*      */     
/*  874 */     this.gunModel[106].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  875 */     this.gunModel[106].setRotationPoint(37.0F, -21.25F, 11.5F);
/*      */     
/*  877 */     this.gunModel[107].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  878 */     this.gunModel[107].setRotationPoint(37.0F, -22.25F, 12.5F);
/*      */     
/*  880 */     this.gunModel[108].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  881 */     this.gunModel[108].setRotationPoint(31.0F, -21.25F, 14.5F);
/*      */     
/*  883 */     this.gunModel[109].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  884 */     this.gunModel[109].setRotationPoint(54.0F, -21.25F, 11.5F);
/*      */     
/*  886 */     this.gunModel[110].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  887 */     this.gunModel[110].setRotationPoint(54.0F, -22.25F, 12.5F);
/*      */     
/*  889 */     this.gunModel[111].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  890 */     this.gunModel[111].setRotationPoint(72.0F, -21.25F, 11.5F);
/*      */     
/*  892 */     this.gunModel[112].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  893 */     this.gunModel[112].setRotationPoint(72.0F, -22.25F, 12.5F);
/*      */     
/*  895 */     this.gunModel[113].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  896 */     this.gunModel[113].setRotationPoint(43.0F, -21.25F, 12.5F);
/*      */     
/*  898 */     this.gunModel[114].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  899 */     this.gunModel[114].setRotationPoint(60.0F, -21.25F, 12.5F);
/*      */     
/*  901 */     this.gunModel[115].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  902 */     this.gunModel[115].setRotationPoint(60.0F, -22.25F, 14.5F);
/*      */     
/*  904 */     this.gunModel[116].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  905 */     this.gunModel[116].setRotationPoint(43.0F, -22.25F, 14.5F);
/*      */     
/*  907 */     this.gunModel[117].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  908 */     this.gunModel[117].setRotationPoint(31.0F, -22.25F, 14.5F);
/*      */     
/*  910 */     this.gunModel[118].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 10, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  911 */     this.gunModel[118].setRotationPoint(12.0F, -18.25F, 1.0F);
/*      */     
/*  913 */     this.gunModel[119].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  914 */     this.gunModel[119].setRotationPoint(31.0F, -21.25F, 12.5F);
/*      */     
/*  916 */     this.gunModel[120].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  917 */     this.gunModel[120].setRotationPoint(31.0F, -20.25F, 12.5F);
/*      */     
/*  919 */     this.gunModel[121].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  920 */     this.gunModel[121].setRotationPoint(36.25F, -20.25F, 12.5F);
/*      */     
/*  922 */     this.gunModel[122].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  923 */     this.gunModel[122].setRotationPoint(31.0F, -19.25F, 11.0F);
/*      */     
/*  925 */     this.gunModel[123].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  926 */     this.gunModel[123].setRotationPoint(36.25F, -19.25F, 11.0F);
/*      */     
/*  928 */     this.gunModel[124].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  929 */     this.gunModel[124].setRotationPoint(43.0F, -20.25F, 12.5F);
/*      */     
/*  931 */     this.gunModel[125].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  932 */     this.gunModel[125].setRotationPoint(53.25F, -20.25F, 12.5F);
/*      */     
/*  934 */     this.gunModel[126].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  935 */     this.gunModel[126].setRotationPoint(43.0F, -19.25F, 11.0F);
/*      */     
/*  937 */     this.gunModel[127].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  938 */     this.gunModel[127].setRotationPoint(53.25F, -19.25F, 11.0F);
/*      */     
/*  940 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  941 */     this.gunModel[''].setRotationPoint(60.0F, -20.25F, 12.5F);
/*      */     
/*  943 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  944 */     this.gunModel[''].setRotationPoint(71.25F, -20.25F, 12.5F);
/*      */     
/*  946 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  947 */     this.gunModel[''].setRotationPoint(60.0F, -19.25F, 11.0F);
/*      */     
/*  949 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  950 */     this.gunModel[''].setRotationPoint(71.25F, -19.25F, 11.0F);
/*      */     
/*  952 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 10, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 1.0F, -0.75F, -0.5F, 1.0F, -0.75F, -0.5F, 1.0F, -0.25F, -0.5F, 1.0F);
/*  953 */     this.gunModel[''].setRotationPoint(12.0F, -17.25F, 1.0F);
/*      */     
/*  955 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 66, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  956 */     this.gunModel[''].setRotationPoint(12.0F, -16.75F, 0.0F);
/*      */     
/*  958 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 65, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F);
/*  959 */     this.gunModel[''].setRotationPoint(12.0F, -16.25F, 0.0F);
/*      */     
/*  961 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/*  962 */     this.gunModel[''].setRotationPoint(12.0F, -21.25F, -1.5F);
/*      */     
/*  964 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/*  965 */     this.gunModel[''].setRotationPoint(12.0F, -22.25F, -3.5F);
/*      */     
/*  967 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/*  968 */     this.gunModel[''].setRotationPoint(37.0F, -21.25F, -1.5F);
/*      */     
/*  970 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/*  971 */     this.gunModel[''].setRotationPoint(37.0F, -22.25F, -3.5F);
/*      */     
/*  973 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/*  974 */     this.gunModel[''].setRotationPoint(54.0F, -21.25F, -1.5F);
/*      */     
/*  976 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/*  977 */     this.gunModel[''].setRotationPoint(54.0F, -22.25F, -3.5F);
/*      */     
/*  979 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/*  980 */     this.gunModel[''].setRotationPoint(72.0F, -21.25F, -1.5F);
/*      */     
/*  982 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/*  983 */     this.gunModel[''].setRotationPoint(72.0F, -22.25F, -3.5F);
/*      */     
/*  985 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/*  986 */     this.gunModel[''].setRotationPoint(12.0F, -30.0F, -1.5F);
/*      */     
/*  988 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/*  989 */     this.gunModel[''].setRotationPoint(37.0F, -30.0F, -1.5F);
/*      */     
/*  991 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/*  992 */     this.gunModel[''].setRotationPoint(54.0F, -30.0F, -1.5F);
/*      */     
/*  994 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/*  995 */     this.gunModel[''].setRotationPoint(72.0F, -30.0F, -1.5F);
/*      */     
/*  997 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  998 */     this.gunModel[''].setRotationPoint(31.0F, -30.0F, -1.0F);
/*      */     
/* 1000 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1001 */     this.gunModel[''].setRotationPoint(43.0F, -28.0F, -3.5F);
/*      */     
/* 1003 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1004 */     this.gunModel[''].setRotationPoint(60.0F, -28.0F, -3.5F);
/*      */     
/* 1006 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1007 */     this.gunModel[''].setRotationPoint(43.0F, -29.0F, -3.5F);
/*      */     
/* 1009 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1010 */     this.gunModel[''].setRotationPoint(53.25F, -29.0F, -3.5F);
/*      */     
/* 1012 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1013 */     this.gunModel[''].setRotationPoint(60.0F, -29.0F, -3.5F);
/*      */     
/* 1015 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1016 */     this.gunModel[''].setRotationPoint(71.25F, -29.0F, -3.5F);
/*      */     
/* 1018 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1019 */     this.gunModel[''].setRotationPoint(36.25F, -30.0F, -1.0F);
/*      */     
/* 1021 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1022 */     this.gunModel[''].setRotationPoint(43.0F, -30.0F, -1.0F);
/*      */     
/* 1024 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1025 */     this.gunModel[''].setRotationPoint(53.25F, -30.0F, -1.0F);
/*      */     
/* 1027 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1028 */     this.gunModel[''].setRotationPoint(60.0F, -30.0F, -1.0F);
/*      */     
/* 1030 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1031 */     this.gunModel[''].setRotationPoint(71.25F, -30.0F, -1.0F);
/*      */     
/* 1033 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1034 */     this.gunModel[''].setRotationPoint(60.0F, -29.0F, -3.5F);
/*      */     
/* 1036 */     this.gunModel[' '].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1037 */     this.gunModel[' '].setRotationPoint(43.0F, -29.0F, -3.5F);
/*      */     
/* 1039 */     this.gunModel['¡'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1040 */     this.gunModel['¡'].setRotationPoint(31.0F, -29.0F, -3.5F);
/*      */     
/* 1042 */     this.gunModel['¢'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1043 */     this.gunModel['¢'].setRotationPoint(31.0F, -28.0F, -3.5F);
/*      */     
/* 1045 */     this.gunModel['£'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1046 */     this.gunModel['£'].setRotationPoint(72.0F, -21.25F, 10.5F);
/*      */     
/* 1048 */     this.gunModel['¤'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1049 */     this.gunModel['¤'].setRotationPoint(72.0F, -21.25F, 0.5F);
/*      */     
/* 1051 */     this.gunModel['¥'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1052 */     this.gunModel['¥'].setRotationPoint(54.0F, -21.25F, 10.5F);
/*      */     
/* 1054 */     this.gunModel['¦'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1055 */     this.gunModel['¦'].setRotationPoint(54.0F, -21.25F, 0.5F);
/*      */     
/* 1057 */     this.gunModel['§'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1058 */     this.gunModel['§'].setRotationPoint(37.0F, -21.25F, 10.5F);
/*      */     
/* 1060 */     this.gunModel['¨'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1061 */     this.gunModel['¨'].setRotationPoint(37.0F, -21.25F, 0.5F);
/*      */     
/* 1063 */     this.gunModel['©'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1064 */     this.gunModel['©'].setRotationPoint(12.0F, -21.25F, 10.5F);
/*      */     
/* 1066 */     this.gunModel['ª'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1067 */     this.gunModel['ª'].setRotationPoint(12.0F, -21.25F, 0.5F);
/*      */     
/* 1069 */     this.gunModel['«'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1070 */     this.gunModel['«'].setRotationPoint(72.0F, -30.0F, 10.5F);
/*      */     
/* 1072 */     this.gunModel['¬'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1073 */     this.gunModel['¬'].setRotationPoint(72.0F, -30.0F, 0.5F);
/*      */     
/* 1075 */     this.gunModel['­'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1076 */     this.gunModel['­'].setRotationPoint(54.0F, -30.0F, 10.5F);
/*      */     
/* 1078 */     this.gunModel['®'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1079 */     this.gunModel['®'].setRotationPoint(54.0F, -30.0F, 0.5F);
/*      */     
/* 1081 */     this.gunModel['¯'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1082 */     this.gunModel['¯'].setRotationPoint(37.0F, -30.0F, 10.5F);
/*      */     
/* 1084 */     this.gunModel['°'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1085 */     this.gunModel['°'].setRotationPoint(37.0F, -30.0F, 0.5F);
/*      */     
/* 1087 */     this.gunModel['±'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1088 */     this.gunModel['±'].setRotationPoint(12.0F, -30.0F, 10.5F);
/*      */     
/* 1090 */     this.gunModel['²'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1091 */     this.gunModel['²'].setRotationPoint(12.0F, -30.0F, 0.5F);
/*      */     
/* 1093 */     this.gunModel['³'].addShapeBox(40.0F, -11.0F, -6.0F, 66, 2, 2, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F);
/* 1094 */     this.gunModel['³'].setRotationPoint(12.0F, -34.0F, 1.5F);
/*      */     
/* 1096 */     this.gunModel['´'].addShapeBox(40.0F, -11.0F, -6.0F, 66, 2, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1097 */     this.gunModel['´'].setRotationPoint(12.0F, -34.0F, 8.5F);
/*      */     
/* 1099 */     this.gunModel['µ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 1100 */     this.gunModel['µ'].setRotationPoint(8.0F, -20.25F, 0.5F);
/*      */     
/* 1102 */     this.gunModel['¶'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 4, 11, 0.0F, 0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.5F, -1.0F, -1.5F);
/* 1103 */     this.gunModel['¶'].setRotationPoint(8.0F, -20.25F, 0.5F);
/*      */     
/* 1105 */     this.gunModel['·'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1106 */     this.gunModel['·'].setRotationPoint(-11.5F, -19.5F, 11.75F);
/*      */     
/* 1108 */     this.gunModel['¸'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1109 */     this.gunModel['¸'].setRotationPoint(-11.5F, -20.5F, 11.75F);
/*      */     
/* 1111 */     this.gunModel['¹'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1112 */     this.gunModel['¹'].setRotationPoint(-11.5F, -20.0F, 11.75F);
/*      */     
/* 1114 */     this.gunModel['º'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1115 */     this.gunModel['º'].setRotationPoint(-18.5F, -13.0F, 10.75F);
/*      */     
/* 1117 */     this.gunModel['»'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1118 */     this.gunModel['»'].setRotationPoint(-11.5F, -14.0F, 12.25F);
/*      */     
/* 1120 */     this.gunModel['¼'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1121 */     this.gunModel['¼'].setRotationPoint(-10.5F, -14.75F, 12.25F);
/*      */     
/* 1123 */     this.gunModel['½'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 1124 */     this.gunModel['½'].setRotationPoint(-11.5F, -11.0F, 12.25F);
/*      */     
/* 1126 */     this.gunModel['¾'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F);
/* 1127 */     this.gunModel['¾'].setRotationPoint(-10.5F, -10.25F, 12.25F);
/*      */     
/* 1129 */     this.gunModel['¿'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1130 */     this.gunModel['¿'].setRotationPoint(-5.5F, -13.0F, 10.75F);
/*      */     
/* 1132 */     this.gunModel['À'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1133 */     this.gunModel['À'].setRotationPoint(-20.0F, -13.0F, 10.75F);
/*      */     
/* 1135 */     this.gunModel['Á'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1136 */     this.gunModel['Á'].setRotationPoint(-19.5F, -13.0F, 10.75F);
/*      */     
/* 1138 */     this.gunModel['Â'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 15, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1139 */     this.gunModel['Â'].setRotationPoint(-11.5F, -11.0F, 11.75F);
/*      */     
/* 1141 */     this.gunModel['Ã'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1142 */     this.gunModel['Ã'].setRotationPoint(-11.5F, -19.75F, 11.75F);
/*      */     
/* 1144 */     this.gunModel['Ä'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1145 */     this.gunModel['Ä'].setRotationPoint(84.0F, -27.5F, 3.0F);
/*      */     
/* 1147 */     this.gunModel['Å'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1148 */     this.gunModel['Å'].setRotationPoint(87.0F, -27.5F, 3.0F);
/*      */     
/* 1150 */     this.gunModel['Æ'].addShapeBox(40.0F, -11.0F, -6.0F, 80, 4, 4, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1151 */     this.gunModel['Æ'].setRotationPoint(12.0F, -26.5F, 4.0F);
/*      */     
/* 1153 */     this.gunModel['Ç'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F);
/* 1154 */     this.gunModel['Ç'].setRotationPoint(90.0F, -27.5F, 3.0F);
/*      */     
/* 1156 */     this.gunModel['È'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1157 */     this.gunModel['È'].setRotationPoint(91.0F, -27.5F, 3.0F);
/*      */     
/* 1159 */     this.gunModel['É'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, -0.5F, -0.25F, -0.25F);
/* 1160 */     this.gunModel['É'].setRotationPoint(95.0F, -27.5F, 3.0F);
/*      */     
/* 1162 */     this.gunModel['Ê'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1163 */     this.gunModel['Ê'].setRotationPoint(96.5F, -27.5F, 3.0F);
/*      */     
/* 1165 */     this.gunModel['Ë'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1166 */     this.gunModel['Ë'].setRotationPoint(95.0F, -27.5F, 3.0F);
/*      */     
/* 1168 */     this.gunModel['Ì'].addShapeBox(40.0F, -11.0F, -6.0F, 18, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1169 */     this.gunModel['Ì'].setRotationPoint(68.25F, -24.5F, 1.5F);
/*      */     
/* 1171 */     this.gunModel['Í'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1172 */     this.gunModel['Í'].setRotationPoint(81.0F, -21.5F, 1.5F);
/*      */     
/* 1174 */     this.gunModel['Î'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1175 */     this.gunModel['Î'].setRotationPoint(-7.5F, -12.5F, 12.25F);
/*      */     
/* 1177 */     this.gunModel['Ï'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1178 */     this.gunModel['Ï'].setRotationPoint(-7.5F, -13.0F, 12.25F);
/*      */     
/* 1180 */     this.gunModel['Ð'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1181 */     this.gunModel['Ð'].setRotationPoint(-7.5F, -12.0F, 12.25F);
/*      */     
/* 1183 */     this.gunModel['Ñ'].addShapeBox(40.0F, -11.0F, -6.0F, 18, 2, 9, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1184 */     this.gunModel['Ñ'].setRotationPoint(68.25F, -27.0F, 1.5F);
/*      */     
/* 1186 */     this.gunModel['Ò'].addShapeBox(40.0F, -11.0F, -6.0F, 18, 1, 7, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1187 */     this.gunModel['Ò'].setRotationPoint(68.25F, -28.0F, 2.5F);
/*      */     
/* 1189 */     this.gunModel['Ó'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1190 */     this.gunModel['Ó'].setRotationPoint(68.25F, -29.0F, 3.5F);
/*      */     
/* 1192 */     this.gunModel['Ô'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1193 */     this.gunModel['Ô'].setRotationPoint(68.25F, -30.0F, 3.5F);
/*      */     
/* 1195 */     this.gunModel['Õ'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1196 */     this.gunModel['Õ'].setRotationPoint(68.25F, -31.5F, 3.5F);
/*      */     
/* 1198 */     this.gunModel['Ö'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1199 */     this.gunModel['Ö'].setRotationPoint(68.25F, -30.5F, 3.5F);
/*      */     
/* 1201 */     this.gunModel['×'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1202 */     this.gunModel['×'].setRotationPoint(68.25F, -32.5F, 3.5F);
/*      */     
/* 1204 */     this.gunModel['Ø'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1205 */     this.gunModel['Ø'].setRotationPoint(68.25F, -32.0F, 3.5F);
/*      */     
/* 1207 */     this.gunModel['Ù'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 5, 0.0F, 0.5F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1208 */     this.gunModel['Ù'].setRotationPoint(68.75F, -33.0F, 3.5F);
/*      */     
/* 1210 */     this.gunModel['Ú'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1211 */     this.gunModel['Ú'].setRotationPoint(77.0F, -20.0F, 3.0F);
/*      */     
/* 1213 */     this.gunModel['Û'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1214 */     this.gunModel['Û'].setRotationPoint(85.0F, -18.5F, 2.5F);
/*      */     
/* 1216 */     this.gunModel['Ü'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1217 */     this.gunModel['Ü'].setRotationPoint(84.5F, -18.5F, 2.5F);
/*      */     
/* 1219 */     this.gunModel['Ý'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1220 */     this.gunModel['Ý'].setRotationPoint(84.0F, -19.0F, 3.0F);
/*      */     
/* 1222 */     this.gunModel['Þ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1223 */     this.gunModel['Þ'].setRotationPoint(77.0F, -18.5F, 2.5F);
/*      */     
/* 1225 */     this.gunModel['ß'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1226 */     this.gunModel['ß'].setRotationPoint(80.0F, -21.5F, 1.5F);
/*      */     
/* 1228 */     this.gunModel['à'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1229 */     this.gunModel['à'].setRotationPoint(77.0F, -21.5F, 3.0F);
/*      */     
/* 1231 */     this.gunModel['á'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1232 */     this.gunModel['á'].setRotationPoint(73.0F, -20.5F, 3.0F);
/*      */     
/* 1234 */     this.gunModel['â'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1235 */     this.gunModel['â'].setRotationPoint(73.0F, -19.5F, 3.0F);
/*      */     
/* 1237 */     this.gunModel['ã'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 6, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F);
/* 1238 */     this.gunModel['ã'].setRotationPoint(68.0F, -19.5F, 3.0F);
/*      */     
/* 1240 */     this.gunModel['ä'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 6, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1241 */     this.gunModel['ä'].setRotationPoint(68.0F, -20.5F, 3.0F);
/*      */     
/* 1243 */     this.gunModel['å'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 6, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F);
/* 1244 */     this.gunModel['å'].setRotationPoint(69.0F, -18.5F, 3.0F);
/*      */     
/* 1246 */     this.gunModel['æ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1247 */     this.gunModel['æ'].setRotationPoint(83.0F, -25.0F, 10.0F);
/*      */     
/* 1249 */     this.gunModel['ç'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1250 */     this.gunModel['ç'].setRotationPoint(80.5F, -25.0F, 10.0F);
/*      */     
/* 1252 */     this.gunModel['è'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1253 */     this.gunModel['è'].setRotationPoint(81.0F, -25.0F, 11.5F);
/*      */     
/* 1255 */     this.gunModel['é'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1256 */     this.gunModel['é'].setRotationPoint(83.0F, -25.0F, 0.5F);
/*      */     
/* 1258 */     this.gunModel['ê'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1259 */     this.gunModel['ê'].setRotationPoint(80.5F, -25.0F, 0.5F);
/*      */     
/* 1261 */     this.gunModel['ë'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1262 */     this.gunModel['ë'].setRotationPoint(81.0F, -25.0F, -0.5F);
/*      */     
/* 1264 */     this.gunModel['ì'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1265 */     this.gunModel['ì'].setRotationPoint(20.0F, -20.25F, 10.0F);
/*      */     
/* 1267 */     this.gunModel['í'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1268 */     this.gunModel['í'].setRotationPoint(22.5F, -18.5F, 11.5F);
/*      */     
/* 1270 */     this.gunModel['î'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1271 */     this.gunModel['î'].setRotationPoint(22.5F, -19.0F, 11.5F);
/*      */     
/* 1273 */     this.gunModel['ï'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1274 */     this.gunModel['ï'].setRotationPoint(22.5F, -18.0F, 11.5F);
/*      */     
/* 1276 */     this.gunModel['ð'].addShapeBox(40.0F, -11.0F, -6.0F, 65, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1277 */     this.gunModel['ð'].setRotationPoint(-53.0F, -28.0F, 10.5F);
/*      */     
/* 1279 */     this.gunModel['ñ'].addShapeBox(40.0F, -11.0F, -6.0F, 34, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1280 */     this.gunModel['ñ'].setRotationPoint(-53.0F, -30.0F, 0.5F);
/*      */     
/* 1282 */     this.gunModel['ò'].addShapeBox(40.0F, -11.0F, -6.0F, 33, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1283 */     this.gunModel['ò'].setRotationPoint(-53.0F, -28.0F, -0.5F);
/*      */     
/* 1285 */     this.gunModel['ó'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 11, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1286 */     this.gunModel['ó'].setRotationPoint(-45.0F, -6.5F, 0.5F);
/*      */     
/* 1288 */     this.gunModel['ô'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 11, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1289 */     this.gunModel['ô'].setRotationPoint(-38.0F, -6.5F, 0.5F);
/*      */     
/* 1291 */     this.gunModel['õ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 11, 11, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1292 */     this.gunModel['õ'].setRotationPoint(-37.0F, -6.5F, 0.5F);
/*      */     
/* 1294 */     this.gunModel['ö'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1295 */     this.gunModel['ö'].setRotationPoint(-48.0F, -6.5F, 0.5F);
/*      */     
/* 1297 */     this.gunModel['÷'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1298 */     this.gunModel['÷'].setRotationPoint(-49.0F, -6.5F, 1.5F);
/*      */     
/* 1300 */     this.gunModel['ø'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F);
/* 1301 */     this.gunModel['ø'].setRotationPoint(-49.0F, -4.5F, 1.5F);
/*      */     
/* 1303 */     this.gunModel['ù'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/* 1304 */     this.gunModel['ù'].setRotationPoint(-48.0F, -4.5F, 0.5F);
/*      */     
/* 1306 */     this.gunModel['ú'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
/* 1307 */     this.gunModel['ú'].setRotationPoint(-49.5F, -2.5F, 1.5F);
/*      */     
/* 1309 */     this.gunModel['û'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F);
/* 1310 */     this.gunModel['û'].setRotationPoint(-48.5F, -2.5F, 0.5F);
/*      */     
/* 1312 */     this.gunModel['ü'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -2.0F);
/* 1313 */     this.gunModel['ü'].setRotationPoint(-50.5F, -0.5F, 1.5F);
/*      */     
/* 1315 */     this.gunModel['ý'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -1.0F);
/* 1316 */     this.gunModel['ý'].setRotationPoint(-49.5F, -0.5F, 0.5F);
/*      */     
/* 1318 */     this.gunModel['þ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F);
/* 1319 */     this.gunModel['þ'].setRotationPoint(-51.75F, 1.5F, 1.5F);
/*      */     
/* 1321 */     this.gunModel['ÿ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F);
/* 1322 */     this.gunModel['ÿ'].setRotationPoint(-50.75F, 1.5F, 0.5F);
/*      */     
/* 1324 */     this.gunModel['Ā'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.75F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -2.0F);
/* 1325 */     this.gunModel['Ā'].setRotationPoint(-53.25F, 3.5F, 1.5F);
/*      */     
/* 1327 */     this.gunModel['ā'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.75F, 0.0F, -1.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -1.0F);
/* 1328 */     this.gunModel['ā'].setRotationPoint(-52.25F, 3.5F, 0.5F);
/*      */     
/* 1330 */     this.gunModel['Ă'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.25F, 0.0F, -2.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F);
/* 1331 */     this.gunModel['Ă'].setRotationPoint(-55.0F, 5.5F, 1.5F);
/*      */     
/* 1333 */     this.gunModel['ă'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.25F, 0.0F, -1.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -1.0F);
/* 1334 */     this.gunModel['ă'].setRotationPoint(-54.0F, 5.5F, 0.5F);
/*      */     
/* 1336 */     this.gunModel['Ą'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.25F, 0.0F, -2.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F);
/* 1337 */     this.gunModel['Ą'].setRotationPoint(-57.25F, 8.5F, 1.5F);
/*      */     
/* 1339 */     this.gunModel['ą'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.25F, 0.0F, -1.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -1.0F);
/* 1340 */     this.gunModel['ą'].setRotationPoint(-56.25F, 8.5F, 0.5F);
/*      */     
/* 1342 */     this.gunModel['Ć'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F);
/* 1343 */     this.gunModel['Ć'].setRotationPoint(-59.5F, 11.5F, 1.5F);
/*      */     
/* 1345 */     this.gunModel['ć'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -1.0F);
/* 1346 */     this.gunModel['ć'].setRotationPoint(-58.5F, 11.5F, 0.5F);
/*      */     
/* 1348 */     this.gunModel['Ĉ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.75F, 0.0F, -2.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.75F, 0.0F, -2.0F);
/* 1349 */     this.gunModel['Ĉ'].setRotationPoint(-62.5F, 15.5F, 1.5F);
/*      */     
/* 1351 */     this.gunModel['ĉ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.75F, 0.0F, -1.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.75F, 0.0F, -1.0F);
/* 1352 */     this.gunModel['ĉ'].setRotationPoint(-61.5F, 15.5F, 0.5F);
/*      */     
/* 1354 */     this.gunModel['Ċ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F);
/* 1355 */     this.gunModel['Ċ'].setRotationPoint(-65.25F, 19.5F, 1.5F);
/*      */     
/* 1357 */     this.gunModel['ċ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F);
/* 1358 */     this.gunModel['ċ'].setRotationPoint(-64.25F, 19.5F, 0.5F);
/*      */     
/* 1360 */     this.gunModel['Č'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 16, 11, 0.0F, -7.75F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, -7.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -8.25F, 0.0F, -3.0F, -8.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1361 */     this.gunModel['Č'].setRotationPoint(-50.0F, 7.5F, 0.5F);
/*      */     
/* 1363 */     this.gunModel['č'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, -2.0F, -0.25F, 0.0F, 2.0F, -0.25F, -3.0F, 2.0F, -0.25F, -3.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1364 */     this.gunModel['č'].setRotationPoint(-42.25F, 5.75F, 0.5F);
/*      */     
/* 1366 */     this.gunModel['Ď'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1367 */     this.gunModel['Ď'].setRotationPoint(-40.25F, 5.0F, 0.5F);
/*      */     
/* 1369 */     this.gunModel['ď'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1370 */     this.gunModel['ď'].setRotationPoint(-45.0F, -4.5F, 0.5F);
/*      */     
/* 1372 */     this.gunModel['Đ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1373 */     this.gunModel['Đ'].setRotationPoint(-45.0F, -2.5F, 0.5F);
/*      */     
/* 1375 */     this.gunModel['đ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/* 1376 */     this.gunModel['đ'].setRotationPoint(-46.0F, -0.5F, 0.5F);
/*      */     
/* 1378 */     this.gunModel['Ē'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1379 */     this.gunModel['Ē'].setRotationPoint(-47.0F, 1.5F, 0.5F);
/*      */     
/* 1381 */     this.gunModel['ē'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1382 */     this.gunModel['ē'].setRotationPoint(-48.0F, 3.5F, 0.5F);
/*      */     
/* 1384 */     this.gunModel['Ĕ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 11, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F);
/* 1385 */     this.gunModel['Ĕ'].setRotationPoint(-50.0F, 5.5F, 0.5F);
/*      */     
/* 1387 */     this.gunModel['ĕ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 11, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F);
/* 1388 */     this.gunModel['ĕ'].setRotationPoint(-52.0F, 8.5F, 0.5F);
/*      */     
/* 1390 */     this.gunModel['Ė'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 4, 11, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F);
/* 1391 */     this.gunModel['Ė'].setRotationPoint(-54.0F, 11.5F, 0.5F);
/*      */     
/* 1393 */     this.gunModel['ė'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 4, 11, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F);
/* 1394 */     this.gunModel['ė'].setRotationPoint(-57.0F, 15.5F, 0.5F);
/*      */     
/* 1396 */     this.gunModel['Ę'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 3, 11, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F);
/* 1397 */     this.gunModel['Ę'].setRotationPoint(-58.0F, 19.5F, 0.5F);
/*      */     
/* 1399 */     this.gunModel['ę'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 5, 11, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, -2.25F, 0.0F);
/* 1400 */     this.gunModel['ę'].setRotationPoint(-63.0F, 22.5F, 0.5F);
/*      */     
/* 1402 */     this.gunModel['Ě'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -1.0F);
/* 1403 */     this.gunModel['Ě'].setRotationPoint(-65.75F, 22.5F, 0.5F);
/*      */     
/* 1405 */     this.gunModel['ě'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.25F, -2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -2.25F, -2.0F);
/* 1406 */     this.gunModel['ě'].setRotationPoint(-66.75F, 22.5F, 1.5F);
/*      */     
/* 1408 */     this.gunModel['Ĝ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1409 */     this.gunModel['Ĝ'].setRotationPoint(-50.0F, 23.25F, 0.5F);
/*      */     
/* 1411 */     this.gunModel['ĝ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1412 */     this.gunModel['ĝ'].setRotationPoint(-50.0F, 25.0F, 0.5F);
/*      */     
/* 1414 */     this.gunModel['Ğ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -3.0F, -1.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1415 */     this.gunModel['Ğ'].setRotationPoint(-50.0F, 27.0F, 0.5F);
/*      */     
/* 1417 */     this.gunModel['ğ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1418 */     this.gunModel['ğ'].setRotationPoint(-50.0F, 19.25F, 0.5F);
/*      */     
/* 1420 */     this.gunModel['Ġ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1421 */     this.gunModel['Ġ'].setRotationPoint(-49.0F, 15.25F, 0.5F);
/*      */     
/* 1423 */     this.gunModel['ġ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1424 */     this.gunModel['ġ'].setRotationPoint(-47.0F, 11.25F, 0.5F);
/*      */     
/* 1426 */     this.gunModel['Ģ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 11, 0.0F, 0.0F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1427 */     this.gunModel['Ģ'].setRotationPoint(-45.0F, 8.25F, 0.5F);
/*      */     
/* 1429 */     this.gunModel['ģ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1430 */     this.gunModel['ģ'].setRotationPoint(-45.0F, 6.25F, 0.5F);
/*      */     
/* 1432 */     this.gunModel['Ĥ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, -0.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1433 */     this.gunModel['Ĥ'].setRotationPoint(-45.25F, 5.0F, 0.5F);
/*      */     
/* 1435 */     this.gunModel['ĥ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 11, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1436 */     this.gunModel['ĥ'].setRotationPoint(-16.0F, -6.5F, 1.0F);
/*      */     
/* 1438 */     this.gunModel['Ħ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1439 */     this.gunModel['Ħ'].setRotationPoint(-17.5F, -6.5F, 1.0F);
/*      */     
/* 1441 */     this.gunModel['ħ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1442 */     this.gunModel['ħ'].setRotationPoint(-19.0F, -6.5F, 1.0F);
/*      */     
/* 1444 */     this.gunModel['Ĩ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1445 */     this.gunModel['Ĩ'].setRotationPoint(-17.5F, 1.5F, 1.0F);
/*      */     
/* 1447 */     this.gunModel['ĩ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1448 */     this.gunModel['ĩ'].setRotationPoint(-18.5F, 1.5F, 1.0F);
/*      */     
/* 1450 */     this.gunModel['Ī'].addShapeBox(40.0F, -11.0F, -6.0F, 14, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1451 */     this.gunModel['Ī'].setRotationPoint(-31.5F, 2.5F, 1.0F);
/*      */     
/* 1453 */     this.gunModel['ī'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 10, 0.0F, -0.5F, 2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1454 */     this.gunModel['ī'].setRotationPoint(-34.5F, 2.5F, 1.0F);
/*      */     
/* 1456 */     this.gunModel['Ĭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1457 */     this.gunModel['Ĭ'].setRotationPoint(-32.0F, 3.0F, 1.0F);
/*      */     
/* 1459 */     this.gunModel['ĭ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1460 */     this.gunModel['ĭ'].setRotationPoint(-45.0F, -7.5F, 1.0F);
/*      */     
/* 1462 */     this.gunModel['Į'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 2.0F, 0.0F);
/* 1463 */     this.gunModel['Į'].setRotationPoint(-34.5F, -7.5F, 1.0F);
/*      */     
/* 1465 */     this.gunModel['į'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1466 */     this.gunModel['į'].setRotationPoint(-32.0F, -7.0F, 1.0F);
/*      */     
/* 1468 */     this.gunModel['İ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1469 */     this.gunModel['İ'].setRotationPoint(-29.5F, -6.5F, 3.5F);
/*      */     
/* 1471 */     this.gunModel['ı'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1472 */     this.gunModel['ı'].setRotationPoint(-29.5F, -5.0F, 3.5F);
/*      */     
/* 1474 */     this.gunModel['Ĳ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1475 */     this.gunModel['Ĳ'].setRotationPoint(-29.75F, -3.5F, 3.5F);
/*      */     
/* 1477 */     this.gunModel['ĳ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1478 */     this.gunModel['ĳ'].setRotationPoint(-29.75F, -2.0F, 3.5F);
/*      */     
/* 1480 */     this.gunModel['Ĵ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1481 */     this.gunModel['Ĵ'].setRotationPoint(-29.75F, -0.5F, 3.5F);
/*      */     
/* 1483 */     this.gunModel['ĵ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1484 */     this.gunModel['ĵ'].setRotationPoint(-28.75F, 0.5F, 3.5F);
/*      */     
/* 1486 */     this.gunModel['Ķ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1487 */     this.gunModel['Ķ'].setRotationPoint(-48.0F, -7.5F, 0.5F);
/*      */     
/* 1489 */     this.gunModel['ķ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1490 */     this.gunModel['ķ'].setRotationPoint(-49.0F, -7.5F, 1.5F);
/*      */     
/* 1492 */     this.gunModel['ĸ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1493 */     this.gunModel['ĸ'].setRotationPoint(-48.0F, -9.0F, 0.5F);
/*      */     
/* 1495 */     this.gunModel['Ĺ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.5F, -0.25F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1496 */     this.gunModel['Ĺ'].setRotationPoint(-49.0F, -9.0F, 1.5F);
/*      */     
/* 1498 */     this.gunModel['ĺ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1499 */     this.gunModel['ĺ'].setRotationPoint(-49.5F, -10.75F, 1.5F);
/*      */     
/* 1501 */     this.gunModel['Ļ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1502 */     this.gunModel['Ļ'].setRotationPoint(-48.5F, -10.75F, 0.5F);
/*      */     
/* 1504 */     this.gunModel['ļ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 2.5F, -0.5F, -2.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, 2.5F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1505 */     this.gunModel['ļ'].setRotationPoint(-51.0F, -12.75F, 1.5F);
/*      */     
/* 1507 */     this.gunModel['Ľ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 2.5F, -0.5F, -1.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, 2.5F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1508 */     this.gunModel['Ľ'].setRotationPoint(-50.0F, -12.75F, 0.5F);
/*      */     
/* 1510 */     this.gunModel['ľ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 9, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, -0.5F, -0.25F, -2.0F);
/* 1511 */     this.gunModel['ľ'].setRotationPoint(-58.5F, -13.0F, 1.5F);
/*      */     
/* 1513 */     this.gunModel['Ŀ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 11, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F);
/* 1514 */     this.gunModel['Ŀ'].setRotationPoint(-58.5F, -15.5F, 0.5F);
/*      */     
/* 1516 */     this.gunModel['ŀ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1517 */     this.gunModel['ŀ'].setRotationPoint(-53.5F, -13.0F, 1.5F);
/*      */     
/* 1519 */     this.gunModel['Ł'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F);
/* 1520 */     this.gunModel['Ł'].setRotationPoint(-53.5F, -15.0F, 0.5F);
/*      */     
/* 1522 */     this.gunModel['ł'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, -0.25F, -0.7F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -1.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1523 */     this.gunModel['ł'].setRotationPoint(-52.5F, -13.0F, 0.5F);
/*      */     
/* 1525 */     this.gunModel['Ń'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 11, 0.0F, 2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1526 */     this.gunModel['Ń'].setRotationPoint(-50.0F, -18.5F, 0.5F);
/*      */     
/* 1528 */     this.gunModel['ń'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1529 */     this.gunModel['ń'].setRotationPoint(-58.0F, -17.0F, 0.5F);
/*      */     
/* 1531 */     this.gunModel['Ņ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 11, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F);
/* 1532 */     this.gunModel['Ņ'].setRotationPoint(-53.0F, -15.5F, 0.5F);
/*      */     
/* 1534 */     this.gunModel['ņ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 11, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1535 */     this.gunModel['ņ'].setRotationPoint(-49.0F, -13.0F, 0.5F);
/*      */     
/* 1537 */     this.gunModel['Ň'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/* 1538 */     this.gunModel['Ň'].setRotationPoint(-49.0F, -12.5F, 0.5F);
/*      */     
/* 1540 */     this.gunModel['ň'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 11, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, -0.75F, 0.0F, -3.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.5F, -0.25F, 0.0F);
/* 1541 */     this.gunModel['ň'].setRotationPoint(-49.0F, -11.5F, 0.5F);
/*      */     
/* 1543 */     this.gunModel['ŉ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 11, 0.0F, -3.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -3.5F, -0.75F, 0.0F, -4.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -4.0F, -0.75F, 0.0F);
/* 1544 */     this.gunModel['ŉ'].setRotationPoint(-49.0F, -9.5F, 0.5F);
/*      */     
/* 1546 */     this.gunModel['Ŋ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1547 */     this.gunModel['Ŋ'].setRotationPoint(-48.0F, -7.0F, 2.0F);
/*      */     
/* 1549 */     this.gunModel['ŋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1550 */     this.gunModel['ŋ'].setRotationPoint(-49.0F, -7.0F, 3.0F);
/*      */     
/* 1552 */     this.gunModel['Ō'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1553 */     this.gunModel['Ō'].setRotationPoint(-46.25F, -32.75F, 1.5F);
/*      */     
/* 1555 */     this.gunModel['ō'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1556 */     this.gunModel['ō'].setRotationPoint(-45.75F, -31.75F, 1.5F);
/*      */     
/* 1558 */     this.gunModel['Ŏ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1559 */     this.gunModel['Ŏ'].setRotationPoint(-44.75F, -31.75F, 1.5F);
/*      */     
/* 1561 */     this.gunModel['ŏ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1562 */     this.gunModel['ŏ'].setRotationPoint(-45.25F, -31.75F, 1.5F);
/*      */     
/* 1564 */     this.gunModel['Ő'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, -0.25F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1565 */     this.gunModel['Ő'].setRotationPoint(-47.25F, -32.75F, 1.5F);
/*      */     
/* 1567 */     this.gunModel['ő'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F);
/* 1568 */     this.gunModel['ő'].setRotationPoint(-44.75F, -34.75F, 2.5F);
/*      */     
/* 1570 */     this.gunModel['Œ'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 3, 9, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1571 */     this.gunModel['Œ'].setRotationPoint(-56.0F, -32.75F, 1.5F);
/*      */     
/* 1573 */     this.gunModel['œ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 9, 0.0F, -0.75F, -1.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1574 */     this.gunModel['œ'].setRotationPoint(-47.25F, -33.25F, 1.5F);
/*      */     
/* 1576 */     this.gunModel['Ŕ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, -0.25F, 1.25F, -1.5F, -0.25F, 1.25F, -1.5F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1577 */     this.gunModel['Ŕ'].setRotationPoint(-58.0F, -20.0F, 0.5F);
/*      */     
/* 1579 */     this.gunModel['ŕ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1580 */     this.gunModel['ŕ'].setRotationPoint(-58.0F, -18.5F, 0.5F);
/*      */     
/* 1582 */     this.gunModel['Ŗ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, -0.25F, 1.75F, -0.5F, -0.25F, 1.75F, -0.5F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 1583 */     this.gunModel['Ŗ'].setRotationPoint(-58.0F, -20.75F, 0.5F);
/*      */     
/* 1585 */     this.gunModel['ŗ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F);
/* 1586 */     this.gunModel['ŗ'].setRotationPoint(-58.0F, -21.5F, 0.5F);
/*      */     
/* 1588 */     this.gunModel['Ř'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 11, 0.0F, 0.0F, -0.5F, 2.25F, -1.5F, -0.5F, 2.25F, -1.5F, -0.5F, 2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -0.75F, 2.0F, -0.25F, -0.75F, 2.0F, -0.25F, -0.75F, 2.0F, 0.0F, -0.75F, 2.0F);
/* 1589 */     this.gunModel['Ř'].setRotationPoint(-58.0F, -23.5F, 0.5F);
/*      */     
/* 1591 */     this.gunModel['ř'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 12, 0.0F, 0.0F, -0.5F, 1.75F, -2.25F, -0.5F, 1.75F, -2.25F, -0.5F, 1.75F, 0.0F, -0.5F, 1.75F, 0.0F, -0.75F, 1.75F, -1.5F, -0.75F, 1.75F, -1.5F, -0.75F, 1.75F, 0.0F, -0.75F, 1.75F);
/* 1592 */     this.gunModel['ř'].setRotationPoint(-58.0F, -25.24F, 0.0F);
/*      */     
/* 1594 */     this.gunModel['Ś'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 9, 0.0F, 0.0F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, -0.5F, 3.25F, -2.25F, -0.5F, 3.25F, -2.25F, -0.5F, 3.25F, 0.0F, -0.5F, 3.25F);
/* 1595 */     this.gunModel['Ś'].setRotationPoint(-58.0F, -29.25F, 1.5F);
/*      */     
/* 1597 */     this.gunModel['ś'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 4, 10, 0.0F, 0.0F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F);
/* 1598 */     this.gunModel['ś'].setRotationPoint(-58.0F, -28.25F, 1.0F);
/*      */     
/* 1600 */     this.gunModel['Ŝ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F);
/* 1601 */     this.gunModel['Ŝ'].setRotationPoint(-58.0F, -31.25F, 1.5F);
/*      */     
/* 1603 */     this.gunModel['ŝ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 11, 0.0F, 3.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 3.25F, -0.25F, 0.0F, 2.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 2.25F, -0.75F, 0.0F);
/* 1604 */     this.gunModel['ŝ'].setRotationPoint(-50.0F, -19.5F, 0.5F);
/*      */     
/* 1606 */     this.gunModel['Ş'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/* 1607 */     this.gunModel['Ş'].setRotationPoint(-48.0F, -21.25F, 0.5F);
/*      */     
/* 1609 */     this.gunModel['ş'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 2.0F, -0.25F, 1.25F, -1.75F, -0.25F, 1.25F, -1.75F, -0.25F, 1.25F, 2.0F, -0.25F, 1.25F, -0.5F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1610 */     this.gunModel['ş'].setRotationPoint(-50.0F, -21.25F, 0.5F);
/*      */     
/* 1612 */     this.gunModel['Š'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 1.25F, -0.25F, 2.0F, -2.0F, -0.25F, 2.0F, -2.0F, -0.25F, 2.0F, 1.25F, -0.25F, 2.0F, 0.0F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F);
/* 1613 */     this.gunModel['Š'].setRotationPoint(-52.0F, -22.75F, 0.5F);
/*      */     
/* 1615 */     this.gunModel['š'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.5F, -0.25F, 2.5F, -0.75F, -0.25F, 2.5F, -0.75F, -0.25F, 2.5F, 0.5F, -0.25F, 2.5F, -0.25F, -0.25F, 2.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F);
/* 1616 */     this.gunModel['š'].setRotationPoint(-53.5F, -24.25F, 0.5F);
/*      */     
/* 1618 */     this.gunModel['Ţ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.75F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.5F, 0.5F, 0.25F, 2.5F, -0.75F, 0.25F, 2.5F, -0.75F, 0.25F, 2.5F, 0.5F, 0.25F, 2.5F);
/* 1619 */     this.gunModel['Ţ'].setRotationPoint(-53.5F, -26.25F, 0.5F);
/*      */     
/* 1621 */     this.gunModel['ţ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 11, 0.0F, 0.75F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.5F, 0.75F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.5F);
/* 1622 */     this.gunModel['ţ'].setRotationPoint(-53.5F, -27.25F, 0.5F);
/*      */     
/* 1624 */     this.gunModel['Ť'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.75F, -0.25F, 1.5F, -1.0F, -0.25F, 1.5F, -1.0F, -0.25F, 1.5F, 0.75F, -0.25F, 1.5F, 0.75F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.5F);
/* 1625 */     this.gunModel['Ť'].setRotationPoint(-53.5F, -29.25F, 0.5F);
/*      */     
/* 1627 */     this.gunModel['ť'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 11, 0.0F, 0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, 0.25F, 1.5F, -1.0F, 0.25F, 1.5F, -1.0F, 0.25F, 1.5F, 0.75F, 0.25F, 1.5F);
/* 1628 */     this.gunModel['ť'].setRotationPoint(-53.5F, -30.25F, 0.5F);
/*      */     
/* 1630 */     this.gunModel['Ŧ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1631 */     this.gunModel['Ŧ'].setRotationPoint(-55.25F, -27.25F, 0.5F);
/*      */     
/* 1633 */     this.gunModel['ŧ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1634 */     this.gunModel['ŧ'].setRotationPoint(-54.25F, -22.25F, 0.5F);
/*      */     
/* 1636 */     this.gunModel['Ũ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 6, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1637 */     this.gunModel['Ũ'].setRotationPoint(-54.25F, -27.75F, 0.5F);
/*      */     
/* 1639 */     this.gunModel['ũ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.75F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.75F, -0.5F, 1.25F, 1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F);
/* 1640 */     this.gunModel['ũ'].setRotationPoint(-41.5F, -37.0F, 2.5F);
/*      */     
/* 1642 */     this.gunModel['Ū'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F);
/* 1643 */     this.gunModel['Ū'].setRotationPoint(-41.5F, -37.5F, 2.5F);
/*      */     
/* 1645 */     this.gunModel['ū'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F);
/* 1646 */     this.gunModel['ū'].setRotationPoint(-41.5F, -37.0F, 1.5F);
/*      */     
/* 1648 */     this.gunModel['Ŭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F);
/* 1649 */     this.gunModel['Ŭ'].setRotationPoint(-44.0F, -35.75F, 2.5F);
/*      */     
/* 1651 */     this.gunModel['ŭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1652 */     this.gunModel['ŭ'].setRotationPoint(-55.25F, -28.75F, 0.5F);
/*      */     
/* 1654 */     this.gunModel['Ů'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 1655 */     this.gunModel['Ů'].setRotationPoint(-55.25F, -30.25F, 0.5F);
/*      */     
/* 1657 */     this.gunModel['ů'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 7, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1658 */     this.gunModel['ů'].setRotationPoint(-50.75F, -35.75F, 2.5F);
/*      */     
/* 1660 */     this.gunModel['Ű'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1661 */     this.gunModel['Ű'].setRotationPoint(-51.75F, -35.75F, 2.5F);
/*      */     
/* 1663 */     this.gunModel['ű'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F);
/* 1664 */     this.gunModel['ű'].setRotationPoint(-53.75F, -35.75F, 2.5F);
/*      */     
/* 1666 */     this.gunModel['Ų'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.25F);
/* 1667 */     this.gunModel['Ų'].setRotationPoint(-54.75F, -35.75F, 3.5F);
/*      */     
/* 1669 */     this.gunModel['ų'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, -0.25F, -1.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1670 */     this.gunModel['ų'].setRotationPoint(-48.0F, -32.75F, 1.5F);
/*      */     
/* 1672 */     this.gunModel['Ŵ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F);
/* 1673 */     this.gunModel['Ŵ'].setRotationPoint(-47.75F, -34.75F, 2.5F);
/*      */     
/* 1675 */     this.gunModel['ŵ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1676 */     this.gunModel['ŵ'].setRotationPoint(-46.25F, -34.75F, 2.5F);
/*      */     
/* 1678 */     this.gunModel['Ŷ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -1.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1679 */     this.gunModel['Ŷ'].setRotationPoint(-45.75F, -34.75F, 2.5F);
/*      */     
/* 1681 */     this.gunModel['ŷ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1682 */     this.gunModel['ŷ'].setRotationPoint(-45.75F, -34.75F, 3.0F);
/*      */     
/* 1684 */     this.gunModel['Ÿ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1685 */     this.gunModel['Ÿ'].setRotationPoint(-48.75F, -33.75F, 2.0F);
/*      */     
/* 1687 */     this.gunModel['Ź'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 8, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F);
/* 1688 */     this.gunModel['Ź'].setRotationPoint(-50.75F, -33.75F, 2.0F);
/*      */     
/* 1690 */     this.gunModel['ź'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.25F, -0.25F, 1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.25F, 0.25F, 1.0F);
/* 1691 */     this.gunModel['ź'].setRotationPoint(-51.75F, -33.75F, 1.0F);
/*      */     
/* 1693 */     this.gunModel['Ż'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 1.25F, -0.25F, 1.0F, 0.25F, -0.25F, 1.0F, 0.25F, -0.25F, 1.0F, 1.25F, -0.25F, 1.0F, 1.25F, 0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 1.25F, 0.25F, 1.0F);
/* 1694 */     this.gunModel['Ż'].setRotationPoint(-53.25F, -33.75F, 1.0F);
/*      */     
/* 1696 */     this.gunModel['ż'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.5F, 0.25F, 1.0F, 0.5F, 0.25F, 1.0F, 0.0F, 0.25F, -0.5F);
/* 1697 */     this.gunModel['ż'].setRotationPoint(-56.0F, -33.75F, 1.0F);
/*      */     
/* 1699 */     this.gunModel['Ž'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, 0.0F, -0.25F, -1.5F, 0.0F, 0.25F, -1.5F, -0.25F, 0.25F, 1.0F, -0.25F, 0.25F, 1.0F, 0.0F, 0.25F, -1.5F);
/* 1700 */     this.gunModel['Ž'].setRotationPoint(-56.75F, -33.75F, 2.5F);
/*      */     
/* 1702 */     this.gunModel['ž'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 8, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F);
/* 1703 */     this.gunModel['ž'].setRotationPoint(-52.75F, -35.25F, 2.0F);
/*      */     
/* 1705 */     this.gunModel['ſ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.75F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.75F, -0.5F, 1.5F, 0.75F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.75F, 0.25F, 1.5F);
/* 1706 */     this.gunModel['ſ'].setRotationPoint(-53.75F, -35.25F, 2.0F);
/*      */     
/* 1708 */     this.gunModel['ƀ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 0.0F);
/* 1709 */     this.gunModel['ƀ'].setRotationPoint(-55.5F, -35.25F, 2.0F);
/*      */     
/* 1711 */     this.gunModel['Ɓ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, 0.0F, 0.25F, -1.0F);
/* 1712 */     this.gunModel['Ɓ'].setRotationPoint(-56.0F, -35.25F, 3.5F);
/*      */     
/* 1714 */     this.gunModel['Ƃ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.75F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.0F, 0.75F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.0F);
/* 1715 */     this.gunModel['Ƃ'].setRotationPoint(-53.75F, -34.25F, 2.0F);
/*      */     
/* 1717 */     this.gunModel['ƃ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 0.5F);
/* 1718 */     this.gunModel['ƃ'].setRotationPoint(-55.5F, -34.25F, 2.0F);
/*      */     
/* 1720 */     this.gunModel['Ƅ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 1.0F);
/* 1721 */     this.gunModel['Ƅ'].setRotationPoint(-51.75F, -35.25F, 3.0F);
/*      */     
/* 1723 */     this.gunModel['ƅ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1724 */     this.gunModel['ƅ'].setRotationPoint(-50.75F, -35.25F, 3.0F);
/*      */     
/* 1726 */     this.gunModel['Ɔ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1727 */     this.gunModel['Ɔ'].setRotationPoint(-50.75F, -34.75F, 3.0F);
/*      */     
/* 1729 */     this.gunModel['Ƈ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.75F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.75F, -0.5F, 1.5F, 0.75F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.75F, 0.0F, 1.5F);
/* 1730 */     this.gunModel['Ƈ'].setRotationPoint(-53.75F, -33.0F, 2.0F);
/*      */     
/* 1732 */     this.gunModel['ƈ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F);
/* 1733 */     this.gunModel['ƈ'].setRotationPoint(-55.5F, -33.0F, 2.0F);
/*      */     
/* 1735 */     this.gunModel['Ɖ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F);
/* 1736 */     this.gunModel['Ɖ'].setRotationPoint(-56.0F, -33.0F, 3.5F);
/*      */     
/* 1738 */     this.gunModel['Ɗ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F);
/* 1739 */     this.gunModel['Ɗ'].setRotationPoint(-52.75F, -33.0F, 2.0F);
/*      */     
/* 1741 */     this.gunModel['Ƌ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F);
/* 1742 */     this.gunModel['Ƌ'].setRotationPoint(-51.75F, -33.0F, 3.0F);
/*      */     
/* 1744 */     this.gunModel['ƌ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1745 */     this.gunModel['ƌ'].setRotationPoint(-50.75F, -34.0F, 3.0F);
/*      */     
/* 1747 */     this.gunModel['ƍ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1748 */     this.gunModel['ƍ'].setRotationPoint(-50.75F, -32.75F, 3.0F);
/*      */     
/* 1750 */     this.gunModel['Ǝ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F);
/* 1751 */     this.gunModel['Ǝ'].setRotationPoint(-50.75F, -34.25F, 10.5F);
/*      */     
/* 1753 */     this.gunModel['Ə'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 1754 */     this.gunModel['Ə'].setRotationPoint(-51.75F, -34.25F, 10.25F);
/*      */     
/* 1756 */     this.gunModel['Ɛ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F);
/* 1757 */     this.gunModel['Ɛ'].setRotationPoint(-50.75F, -34.25F, 10.75F);
/*      */     
/* 1759 */     this.gunModel['Ƒ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F);
/* 1760 */     this.gunModel['Ƒ'].setRotationPoint(-50.75F, -33.25F, 10.75F);
/*      */     
/* 1762 */     this.gunModel['ƒ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F);
/* 1763 */     this.gunModel['ƒ'].setRotationPoint(-51.5F, -34.25F, 11.75F);
/*      */     
/* 1765 */     this.gunModel['Ɠ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F);
/* 1766 */     this.gunModel['Ɠ'].setRotationPoint(-51.5F, -33.25F, 11.75F);
/*      */     
/* 1768 */     this.gunModel['Ɣ'].addShapeBox(40.0F, -11.0F, -6.0F, 14, 3, 9, 0.0F, 0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1769 */     this.gunModel['Ɣ'].setRotationPoint(-80.0F, -28.5F, 1.5F);
/*      */     
/* 1771 */     this.gunModel['ƕ'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 3, 9, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1772 */     this.gunModel['ƕ'].setRotationPoint(-80.0F, -25.5F, 1.5F);
/*      */     
/* 1774 */     this.gunModel['Ɩ'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 9, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F);
/* 1775 */     this.gunModel['Ɩ'].setRotationPoint(-80.0F, -22.5F, 1.5F);
/*      */     
/* 1777 */     this.gunModel['Ɨ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1778 */     this.gunModel['Ɨ'].setRotationPoint(-68.0F, -25.5F, 2.0F);
/*      */     
/* 1780 */     this.gunModel['Ƙ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 8, 0.0F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1781 */     this.gunModel['Ƙ'].setRotationPoint(-68.0F, -28.0F, 2.0F);
/*      */     
/* 1783 */     this.gunModel['ƙ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F);
/* 1784 */     this.gunModel['ƙ'].setRotationPoint(-68.0F, -23.0F, 2.0F);
/*      */     
/* 1786 */     this.gunModel['ƚ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F);
/* 1787 */     this.gunModel['ƚ'].setRotationPoint(-62.0F, -22.5F, 1.5F);
/*      */     
/* 1789 */     this.gunModel['ƛ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F);
/* 1790 */     this.gunModel['ƛ'].setRotationPoint(-62.0F, -25.5F, 1.5F);
/*      */     
/* 1792 */     this.gunModel['Ɯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1793 */     this.gunModel['Ɯ'].setRotationPoint(-59.0F, -26.0F, 0.5F);
/*      */     
/* 1795 */     this.gunModel['Ɲ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F);
/* 1796 */     this.gunModel['Ɲ'].setRotationPoint(-59.0F, -22.5F, 0.5F);
/*      */     
/* 1798 */     this.gunModel['ƞ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1799 */     this.gunModel['ƞ'].setRotationPoint(-59.0F, -29.5F, 0.5F);
/*      */     
/* 1801 */     this.gunModel['Ɵ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F);
/* 1802 */     this.gunModel['Ɵ'].setRotationPoint(-62.0F, -28.5F, 1.5F);
/*      */     
/* 1804 */     this.gunModel['Ơ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1805 */     this.gunModel['Ơ'].setRotationPoint(-59.0F, -18.75F, 4.5F);
/*      */     
/* 1807 */     this.gunModel['ơ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1808 */     this.gunModel['ơ'].setRotationPoint(-59.0F, -18.75F, 1.0F);
/*      */     
/* 1810 */     this.gunModel['Ƣ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1811 */     this.gunModel['Ƣ'].setRotationPoint(-59.0F, -18.75F, 8.0F);
/*      */     
/* 1813 */     this.gunModel['ƣ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1814 */     this.gunModel['ƣ'].setRotationPoint(-59.0F, -14.75F, 1.0F);
/*      */     
/* 1816 */     this.gunModel['Ƥ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F);
/* 1817 */     this.gunModel['Ƥ'].setRotationPoint(-59.0F, -13.75F, 2.0F);
/*      */     
/* 1819 */     this.gunModel['ƥ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1820 */     this.gunModel['ƥ'].setRotationPoint(-41.5F, -13.5F, 11.25F);
/*      */     
/* 1822 */     this.gunModel['Ʀ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 1823 */     this.gunModel['Ʀ'].setRotationPoint(-41.5F, -12.0F, 11.25F);
/*      */     
/* 1825 */     this.gunModel['Ƨ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1826 */     this.gunModel['Ƨ'].setRotationPoint(-41.5F, -15.0F, 11.25F);
/*      */     
/* 1828 */     this.gunModel['ƨ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1829 */     this.gunModel['ƨ'].setRotationPoint(-42.0F, -13.5F, 11.25F);
/*      */     
/* 1831 */     this.gunModel['Ʃ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1832 */     this.gunModel['Ʃ'].setRotationPoint(-37.0F, -13.5F, 10.75F);
/*      */     
/* 1834 */     this.gunModel['ƪ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1835 */     this.gunModel['ƪ'].setRotationPoint(-33.0F, -13.5F, 10.75F);
/*      */     
/* 1837 */     this.gunModel['ƫ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1838 */     this.gunModel['ƫ'].setRotationPoint(-36.0F, -14.5F, 11.0F);
/*      */     
/* 1840 */     this.gunModel['Ƭ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1841 */     this.gunModel['Ƭ'].setRotationPoint(-45.5F, -14.5F, 11.0F);
/*      */     
/* 1843 */     this.gunModel['ƭ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1844 */     this.gunModel['ƭ'].setRotationPoint(-41.0F, -17.5F, 10.6F);
/*      */     
/* 1846 */     this.gunModel['Ʈ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1847 */     this.gunModel['Ʈ'].setRotationPoint(-46.0F, -12.5F, 10.6F);
/*      */     
/* 1849 */     this.gunModel['Ư'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1850 */     this.gunModel['Ư'].setRotationPoint(-36.0F, -12.5F, 10.6F);
/*      */     
/* 1852 */     this.gunModel['ư'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F);
/* 1853 */     this.gunModel['ư'].setRotationPoint(-39.0F, -13.5F, 11.75F);
/*      */     
/* 1855 */     this.gunModel['Ʊ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F);
/* 1856 */     this.gunModel['Ʊ'].setRotationPoint(-45.5F, -14.5F, 12.0F);
/*      */     
/* 1858 */     this.gunModel['Ʋ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F);
/* 1859 */     this.gunModel['Ʋ'].setRotationPoint(-36.0F, -14.5F, 12.0F);
/*      */     
/* 1861 */     this.gunModel['Ƴ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1862 */     this.gunModel['Ƴ'].setRotationPoint(-18.0F, -16.5F, 11.5F);
/*      */     
/* 1864 */     this.gunModel['ƴ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 1865 */     this.gunModel['ƴ'].setRotationPoint(-18.0F, -14.5F, 11.5F);
/*      */     
/* 1867 */     this.gunModel['Ƶ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1868 */     this.gunModel['Ƶ'].setRotationPoint(-19.5F, -18.5F, 11.5F);
/*      */     
/* 1870 */     this.gunModel['ƶ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1871 */     this.gunModel['ƶ'].setRotationPoint(-16.5F, -18.5F, 11.5F);
/*      */     
/* 1873 */     this.gunModel['Ʒ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 1874 */     this.gunModel['Ʒ'].setRotationPoint(-18.0F, -19.5F, 11.5F);
/*      */     
/* 1876 */     this.gunModel['Ƹ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1877 */     this.gunModel['Ƹ'].setRotationPoint(-18.0F, -20.0F, 11.5F);
/*      */     
/* 1879 */     this.gunModel['ƹ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1880 */     this.gunModel['ƹ'].setRotationPoint(-18.0F, -21.0F, 12.0F);
/*      */     
/* 1882 */     this.gunModel['ƺ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1883 */     this.gunModel['ƺ'].setRotationPoint(-18.5F, -21.0F, 12.0F);
/*      */     
/* 1885 */     this.gunModel['ƻ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 1886 */     this.gunModel['ƻ'].setRotationPoint(-19.0F, -21.0F, 12.0F);
/*      */     
/* 1888 */     this.gunModel['Ƽ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1889 */     this.gunModel['Ƽ'].setRotationPoint(-16.5F, -21.0F, 12.0F);
/*      */     
/* 1891 */     this.gunModel['ƽ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1892 */     this.gunModel['ƽ'].setRotationPoint(-16.0F, -21.0F, 12.0F);
/*      */     
/* 1894 */     this.gunModel['ƾ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1895 */     this.gunModel['ƾ'].setRotationPoint(-19.0F, -22.0F, 12.0F);
/*      */     
/* 1897 */     this.gunModel['ƿ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1898 */     this.gunModel['ƿ'].setRotationPoint(-18.5F, -23.25F, 12.0F);
/*      */     
/* 1900 */     this.gunModel['ǀ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1901 */     this.gunModel['ǀ'].setRotationPoint(-19.0F, -23.25F, 12.0F);
/*      */     
/* 1903 */     this.gunModel['ǁ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1904 */     this.gunModel['ǁ'].setRotationPoint(-16.5F, -23.25F, 12.0F);
/*      */     
/* 1906 */     this.gunModel['ǂ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1907 */     this.gunModel['ǂ'].setRotationPoint(-16.0F, -23.25F, 12.0F);
/*      */     
/* 1909 */     this.gunModel['ǃ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1910 */     this.gunModel['ǃ'].setRotationPoint(-18.0F, -23.25F, 12.0F);
/*      */     
/* 1912 */     this.gunModel['Ǆ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1913 */     this.gunModel['Ǆ'].setRotationPoint(-18.0F, -17.0F, 11.5F);
/*      */     
/* 1915 */     this.gunModel['ǅ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1916 */     this.gunModel['ǅ'].setRotationPoint(-18.0F, -21.5F, 12.5F);
/*      */     
/* 1918 */     this.gunModel['ǆ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1919 */     this.gunModel['ǆ'].setRotationPoint(-18.0F, -22.0F, 12.5F);
/*      */     
/* 1921 */     this.gunModel['Ǉ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1922 */     this.gunModel['Ǉ'].setRotationPoint(-18.0F, -21.0F, 12.5F);
/*      */     
/* 1924 */     this.gunModel['ǈ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1925 */     this.gunModel['ǈ'].setRotationPoint(9.0F, -24.0F, -0.5F);
/*      */     
/* 1927 */     this.gunModel['ǉ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1928 */     this.gunModel['ǉ'].setRotationPoint(9.0F, -27.0F, -1.5F);
/*      */     
/* 1930 */     this.gunModel['Ǌ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1931 */     this.gunModel['Ǌ'].setRotationPoint(9.0F, -30.0F, 0.5F);
/*      */     
/* 1933 */     this.gunModel['ǋ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1934 */     this.gunModel['ǋ'].setRotationPoint(9.0F, -28.0F, -0.5F);
/*      */     
/* 1936 */     this.gunModel['ǌ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 2, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F);
/* 1937 */     this.gunModel['ǌ'].setRotationPoint(-51.0F, -25.0F, -3.5F);
/*      */     
/* 1939 */     this.gunModel['Ǎ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F);
/* 1940 */     this.gunModel['Ǎ'].setRotationPoint(-51.0F, -27.0F, -4.5F);
/*      */     
/* 1942 */     this.gunModel['ǎ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 1.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F);
/* 1943 */     this.gunModel['ǎ'].setRotationPoint(-51.0F, -28.0F, -2.5F);
/*      */     
/* 1945 */     this.gunModel['Ǐ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.75F);
/* 1946 */     this.gunModel['Ǐ'].setRotationPoint(-40.0F, -25.0F, -3.5F);
/*      */     
/* 1948 */     this.gunModel['ǐ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1949 */     this.gunModel['ǐ'].setRotationPoint(-40.0F, -27.0F, -4.5F);
/*      */     
/* 1951 */     this.gunModel['Ǒ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1952 */     this.gunModel['Ǒ'].setRotationPoint(-40.0F, -29.0F, -2.5F);
/*      */     
/* 1954 */     this.gunModel['ǒ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1955 */     this.gunModel['ǒ'].setRotationPoint(-41.5F, -13.5F, -0.5F);
/*      */     
/* 1957 */     this.gunModel['Ǔ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 1958 */     this.gunModel['Ǔ'].setRotationPoint(-41.5F, -12.0F, -0.5F);
/*      */     
/* 1960 */     this.gunModel['ǔ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1961 */     this.gunModel['ǔ'].setRotationPoint(-41.5F, -15.0F, -0.5F);
/*      */     
/* 1963 */     this.gunModel['Ǖ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1964 */     this.gunModel['Ǖ'].setRotationPoint(-42.0F, -13.5F, -0.5F);
/*      */     
/* 1966 */     this.gunModel['ǖ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1967 */     this.gunModel['ǖ'].setRotationPoint(-37.0F, -13.5F, -1.0F);
/*      */     
/* 1969 */     this.gunModel['Ǘ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1970 */     this.gunModel['Ǘ'].setRotationPoint(-33.0F, -13.5F, -1.0F);
/*      */     
/* 1972 */     this.gunModel['ǘ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1973 */     this.gunModel['ǘ'].setRotationPoint(-36.0F, -14.5F, 0.0F);
/*      */     
/* 1975 */     this.gunModel['Ǚ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1976 */     this.gunModel['Ǚ'].setRotationPoint(-45.5F, -14.5F, 0.0F);
/*      */     
/* 1978 */     this.gunModel['ǚ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1979 */     this.gunModel['ǚ'].setRotationPoint(-41.0F, -17.5F, 0.4F);
/*      */     
/* 1981 */     this.gunModel['Ǜ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1982 */     this.gunModel['Ǜ'].setRotationPoint(-46.0F, -12.5F, 0.4F);
/*      */     
/* 1984 */     this.gunModel['ǜ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1985 */     this.gunModel['ǜ'].setRotationPoint(-36.0F, -12.5F, 0.4F);
/*      */     
/* 1987 */     this.gunModel['ǝ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1988 */     this.gunModel['ǝ'].setRotationPoint(-39.0F, -13.5F, -1.0F);
/*      */     
/* 1990 */     this.gunModel['Ǟ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1991 */     this.gunModel['Ǟ'].setRotationPoint(-45.5F, -14.5F, -1.0F);
/*      */     
/* 1993 */     this.gunModel['ǟ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1994 */     this.gunModel['ǟ'].setRotationPoint(-36.0F, -14.5F, -1.0F);
/*      */     
/* 1996 */     this.gunModel['Ǡ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 11, 1, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1997 */     this.gunModel['Ǡ'].setRotationPoint(-11.5F, -14.5F, -1.0F);
/*      */     
/* 1999 */     this.gunModel['ǡ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.5F, -0.25F, -0.5F, -1.75F, -0.25F, -0.5F, -1.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 2000 */     this.gunModel['ǡ'].setRotationPoint(-11.5F, -3.5F, -1.0F);
/*      */     
/* 2002 */     this.gunModel['Ǣ'].addShapeBox(40.0F, -11.0F, -6.0F, 23, 3, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2003 */     this.gunModel['Ǣ'].setRotationPoint(-15.5F, -17.0F, -1.0F);
/*      */     
/* 2005 */     this.gunModel['ǣ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2006 */     this.gunModel['ǣ'].setRotationPoint(7.5F, -17.0F, -1.0F);
/*      */     
/* 2008 */     this.gunModel['Ǥ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2009 */     this.gunModel['Ǥ'].setRotationPoint(-16.5F, -17.0F, -1.0F);
/*      */     
/* 2011 */     this.gunModel['ǥ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2012 */     this.gunModel['ǥ'].setRotationPoint(-13.75F, -7.0F, -1.0F);
/*      */     
/* 2014 */     this.gunModel['Ǧ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2015 */     this.gunModel['Ǧ'].setRotationPoint(-14.75F, -7.0F, -1.0F);
/*      */     
/* 2017 */     this.gunModel['ǧ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2018 */     this.gunModel['ǧ'].setRotationPoint(-17.5F, -11.5F, -1.0F);
/*      */     
/* 2020 */     this.gunModel['Ǩ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2021 */     this.gunModel['Ǩ'].setRotationPoint(-17.5F, -12.5F, -1.0F);
/*      */     
/* 2023 */     this.gunModel['ǩ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2024 */     this.gunModel['ǩ'].setRotationPoint(-17.5F, -10.5F, -1.0F);
/*      */     
/* 2026 */     this.gunModel['Ǫ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2027 */     this.gunModel['Ǫ'].setRotationPoint(-53.0F, -27.55F, -12.25F);
/* 2028 */     this.gunModel['Ǫ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2030 */     this.gunModel['ǫ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2031 */     this.gunModel['ǫ'].setRotationPoint(-53.0F, -26.55F, -12.25F);
/* 2032 */     this.gunModel['ǫ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2034 */     this.gunModel['Ǭ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F);
/* 2035 */     this.gunModel['Ǭ'].setRotationPoint(-53.0F, -25.55F, -12.25F);
/* 2036 */     this.gunModel['Ǭ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2038 */     this.gunModel['ǭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2039 */     this.gunModel['ǭ'].setRotationPoint(-54.0F, -26.4F, -12.65F);
/* 2040 */     this.gunModel['ǭ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2042 */     this.gunModel['Ǯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F);
/* 2043 */     this.gunModel['Ǯ'].setRotationPoint(-54.0F, -25.4F, -12.65F);
/* 2044 */     this.gunModel['Ǯ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2046 */     this.gunModel['ǯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2047 */     this.gunModel['ǯ'].setRotationPoint(-54.0F, -27.65F, -12.65F);
/* 2048 */     this.gunModel['ǯ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2050 */     this.gunModel['ǰ'].addShapeBox(40.0F, -11.0F, -6.0F, 28, 3, 2, 0.0F, 2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F);
/* 2051 */     this.gunModel['ǰ'].setRotationPoint(-19.0F, -30.0F, -1.5F);
/*      */     
/* 2053 */     this.gunModel['Ǳ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F);
/* 2054 */     this.gunModel['Ǳ'].setRotationPoint(-19.5F, -19.25F, -1.5F);
/*      */     
/* 2056 */     this.gunModel['ǲ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 2057 */     this.gunModel['ǲ'].setRotationPoint(-19.5F, -15.25F, -1.9F);
/*      */     
/* 2059 */     this.gunModel['ǳ'].addShapeBox(40.0F, -11.0F, -6.0F, 26, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F);
/* 2060 */     this.gunModel['ǳ'].setRotationPoint(-19.0F, -14.25F, -2.15F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2065 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 1257, 97, this.textureX, this.textureY);
/* 2066 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 1321, 97, this.textureX, this.textureY);
/* 2067 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 1385, 97, this.textureX, this.textureY);
/* 2068 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 1449, 97, this.textureX, this.textureY);
/* 2069 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 633, 97, this.textureX, this.textureY);
/* 2070 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/* 2071 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 1089, 81, this.textureX, this.textureY);
/* 2072 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 1705, 81, this.textureX, this.textureY);
/* 2073 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 1553, 89, this.textureX, this.textureY);
/* 2074 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 657, 97, this.textureX, this.textureY);
/* 2075 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 1769, 89, this.textureX, this.textureY);
/* 2076 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 753, 97, this.textureX, this.textureY);
/* 2077 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 1001, 97, this.textureX, this.textureY);
/* 2078 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 1793, 89, this.textureX, this.textureY);
/* 2079 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 1025, 97, this.textureX, this.textureY);
/* 2080 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/* 2081 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 1825, 9, this.textureX, this.textureY);
/* 2082 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/* 2083 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 1129, 97, this.textureX, this.textureY);
/* 2084 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 1153, 97, this.textureX, this.textureY);
/* 2085 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 1201, 97, this.textureX, this.textureY);
/* 2086 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 393, 105, this.textureX, this.textureY);
/* 2087 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 1937, 81, this.textureX, this.textureY);
/* 2088 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 2089 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 1153, 65, this.textureX, this.textureY);
/* 2090 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 1257, 65, this.textureX, this.textureY);
/* 2091 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/* 2092 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 441, 105, this.textureX, this.textureY);
/* 2093 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/* 2094 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 505, 105, this.textureX, this.textureY);
/* 2095 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 537, 105, this.textureX, this.textureY);
/* 2096 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 569, 105, this.textureX, this.textureY);
/* 2097 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 593, 105, this.textureX, this.textureY);
/* 2098 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 1145, 97, this.textureX, this.textureY);
/* 2099 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 1169, 97, this.textureX, this.textureY);
/* 2100 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 1297, 65, this.textureX, this.textureY);
/* 2101 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 1321, 65, this.textureX, this.textureY);
/* 2102 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 625, 105, this.textureX, this.textureY);
/* 2103 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 1697, 97, this.textureX, this.textureY);
/* 2104 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 1825, 97, this.textureX, this.textureY);
/* 2105 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 1345, 65, this.textureX, this.textureY);
/* 2106 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 1601, 65, this.textureX, this.textureY);
/* 2107 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 729, 105, this.textureX, this.textureY);
/* 2108 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 969, 105, this.textureX, this.textureY);
/* 2109 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 993, 105, this.textureX, this.textureY);
/* 2110 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 1009, 105, this.textureX, this.textureY);
/* 2111 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 1041, 105, this.textureX, this.textureY);
/* 2112 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 1577, 97, this.textureX, this.textureY);
/* 2113 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 1729, 97, this.textureX, this.textureY);
/* 2114 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/* 2115 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 1049, 105, this.textureX, this.textureY);
/* 2116 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 1113, 105, this.textureX, this.textureY);
/* 2117 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 1257, 105, this.textureX, this.textureY);
/* 2118 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 737, 105, this.textureX, this.textureY);
/* 2119 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 937, 105, this.textureX, this.textureY);
/* 2120 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 977, 105, this.textureX, this.textureY);
/* 2121 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 1137, 105, this.textureX, this.textureY);
/* 2122 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 1281, 105, this.textureX, this.textureY);
/* 2123 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 1305, 105, this.textureX, this.textureY);
/* 2124 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 1329, 105, this.textureX, this.textureY);
/* 2125 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 1353, 105, this.textureX, this.textureY);
/* 2126 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 1377, 105, this.textureX, this.textureY);
/* 2127 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 1385, 105, this.textureX, this.textureY);
/* 2128 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 1401, 105, this.textureX, this.textureY);
/* 2129 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/* 2130 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 481, 113, this.textureX, this.textureY);
/* 2131 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 1513, 105, this.textureX, this.textureY);
/* 2132 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 1537, 105, this.textureX, this.textureY);
/* 2133 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 1609, 105, this.textureX, this.textureY);
/* 2134 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 1273, 105, this.textureX, this.textureY);
/* 2135 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 1297, 105, this.textureX, this.textureY);
/* 2136 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 1705, 105, this.textureX, this.textureY);
/* 2137 */     this.gunModel['ȼ'] = new ModelRendererTurbo(this, 1409, 113, this.textureX, this.textureY);
/* 2138 */     this.gunModel['Ƚ'] = new ModelRendererTurbo(this, 1521, 113, this.textureX, this.textureY);
/* 2139 */     this.gunModel['Ⱦ'] = new ModelRendererTurbo(this, 1633, 113, this.textureX, this.textureY);
/* 2140 */     this.gunModel['ȿ'] = new ModelRendererTurbo(this, 1761, 105, this.textureX, this.textureY);
/* 2141 */     this.gunModel['ɀ'] = new ModelRendererTurbo(this, 1785, 105, this.textureX, this.textureY);
/* 2142 */     this.gunModel['Ɂ'] = new ModelRendererTurbo(this, 1809, 105, this.textureX, this.textureY);
/* 2143 */     this.gunModel['ɂ'] = new ModelRendererTurbo(this, 1897, 105, this.textureX, this.textureY);
/* 2144 */     this.gunModel['Ƀ'] = new ModelRendererTurbo(this, 1921, 105, this.textureX, this.textureY);
/* 2145 */     this.gunModel['Ʉ'] = new ModelRendererTurbo(this, 1945, 105, this.textureX, this.textureY);
/* 2146 */     this.gunModel['Ʌ'] = new ModelRendererTurbo(this, 1961, 105, this.textureX, this.textureY);
/* 2147 */     this.gunModel['Ɇ'] = new ModelRendererTurbo(this, 2001, 105, this.textureX, this.textureY);
/* 2148 */     this.gunModel['ɇ'] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/* 2149 */     this.gunModel['Ɉ'] = new ModelRendererTurbo(this, 329, 105, this.textureX, this.textureY);
/* 2150 */     this.gunModel['ɉ'] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/* 2151 */     this.gunModel['Ɋ'] = new ModelRendererTurbo(this, 1321, 105, this.textureX, this.textureY);
/* 2152 */     this.gunModel['ɋ'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/* 2153 */     this.gunModel['Ɍ'] = new ModelRendererTurbo(this, 1345, 105, this.textureX, this.textureY);
/* 2154 */     this.gunModel['ɍ'] = new ModelRendererTurbo(this, 1369, 105, this.textureX, this.textureY);
/* 2155 */     this.gunModel['Ɏ'] = new ModelRendererTurbo(this, 89, 113, this.textureX, this.textureY);
/* 2156 */     this.gunModel['ɏ'] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/* 2157 */     this.gunModel['ɐ'] = new ModelRendererTurbo(this, 1561, 105, this.textureX, this.textureY);
/* 2158 */     this.gunModel['ɑ'] = new ModelRendererTurbo(this, 2025, 105, this.textureX, this.textureY);
/* 2159 */     this.gunModel['ɒ'] = new ModelRendererTurbo(this, 697, 105, this.textureX, this.textureY);
/* 2160 */     this.gunModel['ɓ'] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/* 2161 */     this.gunModel['ɔ'] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/* 2162 */     this.gunModel['ɕ'] = new ModelRendererTurbo(this, 1305, 33, this.textureX, this.textureY);
/* 2163 */     this.gunModel['ɖ'] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/* 2164 */     this.gunModel['ɗ'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/* 2165 */     this.gunModel['ɘ'] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/* 2166 */     this.gunModel['ə'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/* 2167 */     this.gunModel['ɚ'] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/* 2168 */     this.gunModel['ɛ'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/* 2169 */     this.gunModel['ɜ'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/* 2170 */     this.gunModel['ɝ'] = new ModelRendererTurbo(this, 593, 113, this.textureX, this.textureY);
/* 2171 */     this.gunModel['ɞ'] = new ModelRendererTurbo(this, 617, 113, this.textureX, this.textureY);
/* 2172 */     this.gunModel['ɟ'] = new ModelRendererTurbo(this, 633, 113, this.textureX, this.textureY);
/* 2173 */     this.gunModel['ɠ'] = new ModelRendererTurbo(this, 649, 113, this.textureX, this.textureY);
/* 2174 */     this.gunModel['ɡ'] = new ModelRendererTurbo(this, 665, 113, this.textureX, this.textureY);
/* 2175 */     this.gunModel['ɢ'] = new ModelRendererTurbo(this, 705, 113, this.textureX, this.textureY);
/* 2176 */     this.gunModel['ɣ'] = new ModelRendererTurbo(this, 721, 113, this.textureX, this.textureY);
/* 2177 */     this.gunModel['ɤ'] = new ModelRendererTurbo(this, 761, 113, this.textureX, this.textureY);
/* 2178 */     this.gunModel['ɥ'] = new ModelRendererTurbo(this, 921, 113, this.textureX, this.textureY);
/* 2179 */     this.gunModel['ɦ'] = new ModelRendererTurbo(this, 777, 113, this.textureX, this.textureY);
/* 2180 */     this.gunModel['ɧ'] = new ModelRendererTurbo(this, 1817, 65, this.textureX, this.textureY);
/* 2181 */     this.gunModel['ɨ'] = new ModelRendererTurbo(this, 1841, 65, this.textureX, this.textureY);
/* 2182 */     this.gunModel['ɩ'] = new ModelRendererTurbo(this, 1745, 105, this.textureX, this.textureY);
/* 2183 */     this.gunModel['ɪ'] = new ModelRendererTurbo(this, 1905, 105, this.textureX, this.textureY);
/* 2184 */     this.gunModel['ɫ'] = new ModelRendererTurbo(this, 961, 113, this.textureX, this.textureY);
/* 2185 */     this.gunModel['ɬ'] = new ModelRendererTurbo(this, 993, 113, this.textureX, this.textureY);
/* 2186 */     this.gunModel['ɭ'] = new ModelRendererTurbo(this, 1065, 113, this.textureX, this.textureY);
/* 2187 */     this.gunModel['ɮ'] = new ModelRendererTurbo(this, 1929, 105, this.textureX, this.textureY);
/* 2188 */     this.gunModel['ɯ'] = new ModelRendererTurbo(this, 41, 113, this.textureX, this.textureY);
/* 2189 */     this.gunModel['ɰ'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/* 2190 */     this.gunModel['ɱ'] = new ModelRendererTurbo(this, 601, 113, this.textureX, this.textureY);
/* 2191 */     this.gunModel['ɲ'] = new ModelRendererTurbo(this, 1017, 113, this.textureX, this.textureY);
/* 2192 */     this.gunModel['ɳ'] = new ModelRendererTurbo(this, 1081, 113, this.textureX, this.textureY);
/* 2193 */     this.gunModel['ɴ'] = new ModelRendererTurbo(this, 1177, 113, this.textureX, this.textureY);
/* 2194 */     this.gunModel['ɵ'] = new ModelRendererTurbo(this, 1153, 113, this.textureX, this.textureY);
/* 2195 */     this.gunModel['ɶ'] = new ModelRendererTurbo(this, 1873, 65, this.textureX, this.textureY);
/* 2196 */     this.gunModel['ɷ'] = new ModelRendererTurbo(this, 1905, 65, this.textureX, this.textureY);
/* 2197 */     this.gunModel['ɸ'] = new ModelRendererTurbo(this, 1929, 65, this.textureX, this.textureY);
/* 2198 */     this.gunModel['ɹ'] = new ModelRendererTurbo(this, 1953, 65, this.textureX, this.textureY);
/* 2199 */     this.gunModel['ɺ'] = new ModelRendererTurbo(this, 2041, 65, this.textureX, this.textureY);
/* 2200 */     this.gunModel['ɻ'] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/* 2201 */     this.gunModel['ɼ'] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/* 2202 */     this.gunModel['ɽ'] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/* 2203 */     this.gunModel['ɾ'] = new ModelRendererTurbo(this, 889, 73, this.textureX, this.textureY);
/* 2204 */     this.gunModel['ɿ'] = new ModelRendererTurbo(this, 1673, 73, this.textureX, this.textureY);
/* 2205 */     this.gunModel['ʀ'] = new ModelRendererTurbo(this, 2009, 73, this.textureX, this.textureY);
/* 2206 */     this.gunModel['ʁ'] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/* 2207 */     this.gunModel['ʂ'] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/* 2208 */     this.gunModel['ʃ'] = new ModelRendererTurbo(this, 857, 81, this.textureX, this.textureY);
/* 2209 */     this.gunModel['ʄ'] = new ModelRendererTurbo(this, 1129, 81, this.textureX, this.textureY);
/* 2210 */     this.gunModel['ʅ'] = new ModelRendererTurbo(this, 1169, 81, this.textureX, this.textureY);
/* 2211 */     this.gunModel['ʆ'] = new ModelRendererTurbo(this, 1297, 81, this.textureX, this.textureY);
/* 2212 */     this.gunModel['ʇ'] = new ModelRendererTurbo(this, 1337, 81, this.textureX, this.textureY);
/* 2213 */     this.gunModel['ʈ'] = new ModelRendererTurbo(this, 1201, 113, this.textureX, this.textureY);
/* 2214 */     this.gunModel['ʉ'] = new ModelRendererTurbo(this, 1225, 113, this.textureX, this.textureY);
/* 2215 */     this.gunModel['ʊ'] = new ModelRendererTurbo(this, 1769, 113, this.textureX, this.textureY);
/* 2216 */     this.gunModel['ʋ'] = new ModelRendererTurbo(this, 1793, 113, this.textureX, this.textureY);
/* 2217 */     this.gunModel['ʌ'] = new ModelRendererTurbo(this, 1809, 113, this.textureX, this.textureY);
/* 2218 */     this.gunModel['ʍ'] = new ModelRendererTurbo(this, 1833, 113, this.textureX, this.textureY);
/* 2219 */     this.gunModel['ʎ'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/* 2220 */     this.gunModel['ʏ'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/* 2221 */     this.gunModel['ʐ'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*      */     
/* 2223 */     this.gunModel['Ǵ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2224 */     this.gunModel['Ǵ'].setRotationPoint(-19.5F, -21.0F, -0.25F);
/*      */     
/* 2226 */     this.gunModel['ǵ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 2227 */     this.gunModel['ǵ'].setRotationPoint(-19.5F, -20.0F, -0.5F);
/*      */     
/* 2229 */     this.gunModel['Ƕ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 3, 0.0F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2230 */     this.gunModel['Ƕ'].setRotationPoint(-19.5F, -21.75F, -0.5F);
/*      */     
/* 2232 */     this.gunModel['Ƿ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2233 */     this.gunModel['Ƿ'].setRotationPoint(-19.5F, -20.25F, -1.25F);
/*      */     
/* 2235 */     this.gunModel['Ǹ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2236 */     this.gunModel['Ǹ'].setRotationPoint(20.0F, -20.25F, -1.0F);
/*      */     
/* 2238 */     this.gunModel['ǹ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2239 */     this.gunModel['ǹ'].setRotationPoint(22.5F, -18.5F, -1.5F);
/*      */     
/* 2241 */     this.gunModel['Ǻ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2242 */     this.gunModel['Ǻ'].setRotationPoint(22.5F, -19.0F, -1.5F);
/*      */     
/* 2244 */     this.gunModel['ǻ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 2245 */     this.gunModel['ǻ'].setRotationPoint(22.5F, -18.0F, -1.5F);
/*      */     
/* 2247 */     this.gunModel['Ǽ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 4, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2248 */     this.gunModel['Ǽ'].setRotationPoint(-27.0F, -30.0F, -3.25F);
/*      */     
/* 2250 */     this.gunModel['ǽ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2251 */     this.gunModel['ǽ'].setRotationPoint(-24.0F, -28.0F, -3.25F);
/*      */     
/* 2253 */     this.gunModel['Ǿ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, -1.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 2254 */     this.gunModel['Ǿ'].setRotationPoint(-24.0F, -26.0F, -3.25F);
/*      */     
/* 2256 */     this.gunModel['ǿ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2257 */     this.gunModel['ǿ'].setRotationPoint(-24.0F, -26.5F, -3.25F);
/*      */     
/* 2259 */     this.gunModel['Ȁ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2260 */     this.gunModel['Ȁ'].setRotationPoint(-24.0F, -30.0F, -3.25F);
/*      */     
/* 2262 */     this.gunModel['ȁ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2263 */     this.gunModel['ȁ'].setRotationPoint(-27.0F, -28.0F, -3.25F);
/*      */     
/* 2265 */     this.gunModel['Ȃ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, -2.0F, 0.5F, -1.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2266 */     this.gunModel['Ȃ'].setRotationPoint(-27.0F, -26.5F, -3.25F);
/*      */     
/* 2268 */     this.gunModel['ȃ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2269 */     this.gunModel['ȃ'].setRotationPoint(-20.0F, -24.0F, -1.25F);
/*      */     
/* 2271 */     this.gunModel['Ȅ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2272 */     this.gunModel['Ȅ'].setRotationPoint(-20.0F, -20.0F, -1.25F);
/*      */     
/* 2274 */     this.gunModel['ȅ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2275 */     this.gunModel['ȅ'].setRotationPoint(-20.0F, -21.0F, -1.25F);
/*      */     
/* 2277 */     this.gunModel['Ȇ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 8, 6, 0.0F, -0.5F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F);
/* 2278 */     this.gunModel['Ȇ'].setRotationPoint(7.0F, -28.0F, -3.5F);
/*      */     
/* 2280 */     this.gunModel['ȇ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 6, 0.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F, -0.5F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 2281 */     this.gunModel['ȇ'].setRotationPoint(7.0F, -21.0F, -3.5F);
/*      */     
/* 2283 */     this.gunModel['Ȉ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 6, 0.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F);
/* 2284 */     this.gunModel['Ȉ'].setRotationPoint(7.0F, -22.0F, -3.5F);
/*      */     
/* 2286 */     this.gunModel['ȉ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2287 */     this.gunModel['ȉ'].setRotationPoint(31.0F, -21.25F, -3.5F);
/*      */     
/* 2289 */     this.gunModel['Ȋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2290 */     this.gunModel['Ȋ'].setRotationPoint(31.0F, -20.25F, -3.5F);
/*      */     
/* 2292 */     this.gunModel['ȋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 2293 */     this.gunModel['ȋ'].setRotationPoint(36.25F, -20.25F, -3.5F);
/*      */     
/* 2295 */     this.gunModel['Ȍ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2296 */     this.gunModel['Ȍ'].setRotationPoint(31.0F, -19.25F, -1.0F);
/*      */     
/* 2298 */     this.gunModel['ȍ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2299 */     this.gunModel['ȍ'].setRotationPoint(36.25F, -19.25F, -1.0F);
/*      */     
/* 2301 */     this.gunModel['Ȏ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 2302 */     this.gunModel['Ȏ'].setRotationPoint(31.0F, -22.25F, 12.5F);
/*      */     
/* 2304 */     this.gunModel['ȏ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 2305 */     this.gunModel['ȏ'].setRotationPoint(43.0F, -22.25F, 12.5F);
/*      */     
/* 2307 */     this.gunModel['Ȑ'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 2308 */     this.gunModel['Ȑ'].setRotationPoint(60.0F, -22.25F, 12.5F);
/*      */     
/* 2310 */     this.gunModel['ȑ'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 2311 */     this.gunModel['ȑ'].setRotationPoint(60.0F, -22.25F, -3.5F);
/*      */     
/* 2313 */     this.gunModel['Ȓ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 2314 */     this.gunModel['Ȓ'].setRotationPoint(43.0F, -22.25F, -3.5F);
/*      */     
/* 2316 */     this.gunModel['ȓ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 2317 */     this.gunModel['ȓ'].setRotationPoint(31.0F, -22.25F, -3.5F);
/*      */     
/* 2319 */     this.gunModel['Ȕ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2320 */     this.gunModel['Ȕ'].setRotationPoint(43.0F, -21.25F, -3.5F);
/*      */     
/* 2322 */     this.gunModel['ȕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2323 */     this.gunModel['ȕ'].setRotationPoint(43.0F, -20.25F, -3.5F);
/*      */     
/* 2325 */     this.gunModel['Ȗ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 2326 */     this.gunModel['Ȗ'].setRotationPoint(53.25F, -20.25F, -3.5F);
/*      */     
/* 2328 */     this.gunModel['ȗ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2329 */     this.gunModel['ȗ'].setRotationPoint(43.0F, -19.25F, -1.0F);
/*      */     
/* 2331 */     this.gunModel['Ș'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2332 */     this.gunModel['Ș'].setRotationPoint(53.25F, -19.25F, -1.0F);
/*      */     
/* 2334 */     this.gunModel['ș'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2335 */     this.gunModel['ș'].setRotationPoint(60.0F, -21.25F, -3.5F);
/*      */     
/* 2337 */     this.gunModel['Ț'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2338 */     this.gunModel['Ț'].setRotationPoint(60.0F, -20.25F, -3.5F);
/*      */     
/* 2340 */     this.gunModel['ț'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 2341 */     this.gunModel['ț'].setRotationPoint(71.25F, -20.25F, -3.5F);
/*      */     
/* 2343 */     this.gunModel['Ȝ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2344 */     this.gunModel['Ȝ'].setRotationPoint(60.0F, -19.25F, -1.0F);
/*      */     
/* 2346 */     this.gunModel['ȝ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2347 */     this.gunModel['ȝ'].setRotationPoint(71.25F, -19.25F, -1.0F);
/*      */     
/* 2349 */     this.gunModel['Ȟ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2350 */     this.gunModel['Ȟ'].setRotationPoint(80.5F, -34.0F, 3.5F);
/*      */     
/* 2352 */     this.gunModel['ȟ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 5, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2353 */     this.gunModel['ȟ'].setRotationPoint(80.5F, -33.0F, 3.5F);
/*      */     
/* 2355 */     this.gunModel['Ƞ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2356 */     this.gunModel['Ƞ'].setRotationPoint(80.5F, -32.0F, 3.5F);
/*      */     
/* 2358 */     this.gunModel['ȡ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.25F, 0.0F, 2.75F, 0.25F, 0.0F, 2.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 2359 */     this.gunModel['ȡ'].setRotationPoint(80.5F, -31.0F, 3.5F);
/*      */     
/* 2361 */     this.gunModel['Ȣ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2362 */     this.gunModel['Ȣ'].setRotationPoint(81.5F, -32.5F, 4.0F);
/*      */     
/* 2364 */     this.gunModel['ȣ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 2365 */     this.gunModel['ȣ'].setRotationPoint(-61.0F, -25.5F, 1.0F);
/*      */     
/* 2367 */     this.gunModel['Ȥ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 10, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F);
/* 2368 */     this.gunModel['Ȥ'].setRotationPoint(-61.0F, -22.0F, 1.0F);
/*      */     
/* 2370 */     this.gunModel['ȥ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 10, 0.0F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, -3.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 2371 */     this.gunModel['ȥ'].setRotationPoint(-61.0F, -29.0F, 1.0F);
/*      */     
/* 2373 */     this.gunModel['Ȧ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2374 */     this.gunModel['Ȧ'].setRotationPoint(-82.0F, -25.5F, 2.0F);
/*      */     
/* 2376 */     this.gunModel['ȧ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 8, 0.0F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2377 */     this.gunModel['ȧ'].setRotationPoint(-82.0F, -28.0F, 2.0F);
/*      */     
/* 2379 */     this.gunModel['Ȩ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F);
/* 2380 */     this.gunModel['Ȩ'].setRotationPoint(-82.0F, -23.0F, 2.0F);
/*      */     
/* 2382 */     this.gunModel['ȩ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2383 */     this.gunModel['ȩ'].setRotationPoint(-84.0F, -28.5F, 1.5F);
/*      */     
/* 2385 */     this.gunModel['Ȫ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2386 */     this.gunModel['Ȫ'].setRotationPoint(-84.0F, -25.5F, 1.5F);
/*      */     
/* 2388 */     this.gunModel['ȫ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 2389 */     this.gunModel['ȫ'].setRotationPoint(-84.0F, -22.5F, 1.5F);
/*      */     
/* 2391 */     this.gunModel['Ȭ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2392 */     this.gunModel['Ȭ'].setRotationPoint(-86.0F, -28.5F, 1.5F);
/*      */     
/* 2394 */     this.gunModel['ȭ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2395 */     this.gunModel['ȭ'].setRotationPoint(-86.0F, -25.5F, 1.5F);
/*      */     
/* 2397 */     this.gunModel['Ȯ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, -3.0F);
/* 2398 */     this.gunModel['Ȯ'].setRotationPoint(-86.0F, -22.5F, 1.5F);
/*      */     
/* 2400 */     this.gunModel['ȯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2401 */     this.gunModel['ȯ'].setRotationPoint(-87.0F, -27.5F, 2.5F);
/*      */     
/* 2403 */     this.gunModel['Ȱ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 2404 */     this.gunModel['Ȱ'].setRotationPoint(-87.0F, -25.5F, 2.5F);
/*      */     
/* 2406 */     this.gunModel['ȱ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -3.0F);
/* 2407 */     this.gunModel['ȱ'].setRotationPoint(-87.0F, -22.5F, 2.5F);
/*      */     
/* 2409 */     this.gunModel['Ȳ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2410 */     this.gunModel['Ȳ'].setRotationPoint(-83.5F, -25.0F, 1.0F);
/*      */     
/* 2412 */     this.gunModel['ȳ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2413 */     this.gunModel['ȳ'].setRotationPoint(-118.0F, -19.0F, 9.5F);
/*      */     
/* 2415 */     this.gunModel['ȴ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 1, 2, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2416 */     this.gunModel['ȴ'].setRotationPoint(-118.0F, -19.5F, 9.5F);
/*      */     
/* 2418 */     this.gunModel['ȵ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 2419 */     this.gunModel['ȵ'].setRotationPoint(-118.0F, -18.5F, 9.5F);
/*      */     
/* 2421 */     this.gunModel['ȶ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2422 */     this.gunModel['ȶ'].setRotationPoint(-80.0F, -19.0F, 9.0F);
/*      */     
/* 2424 */     this.gunModel['ȷ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2425 */     this.gunModel['ȷ'].setRotationPoint(-80.0F, -18.0F, 9.0F);
/*      */     
/* 2427 */     this.gunModel['ȸ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2428 */     this.gunModel['ȸ'].setRotationPoint(-80.0F, -20.0F, 9.0F);
/*      */     
/* 2430 */     this.gunModel['ȹ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2431 */     this.gunModel['ȹ'].setRotationPoint(-71.0F, -19.0F, 9.0F);
/*      */     
/* 2433 */     this.gunModel['Ⱥ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2434 */     this.gunModel['Ⱥ'].setRotationPoint(-71.0F, -18.0F, 9.0F);
/*      */     
/* 2436 */     this.gunModel['Ȼ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2437 */     this.gunModel['Ȼ'].setRotationPoint(-71.0F, -20.0F, 9.0F);
/*      */     
/* 2439 */     this.gunModel['ȼ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2440 */     this.gunModel['ȼ'].setRotationPoint(-118.0F, -19.0F, 0.5F);
/*      */     
/* 2442 */     this.gunModel['Ƚ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 1, 2, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2443 */     this.gunModel['Ƚ'].setRotationPoint(-118.0F, -19.5F, 0.5F);
/*      */     
/* 2445 */     this.gunModel['Ⱦ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 2446 */     this.gunModel['Ⱦ'].setRotationPoint(-118.0F, -18.5F, 0.5F);
/*      */     
/* 2448 */     this.gunModel['ȿ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2449 */     this.gunModel['ȿ'].setRotationPoint(-80.0F, -19.0F, 0.0F);
/*      */     
/* 2451 */     this.gunModel['ɀ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2452 */     this.gunModel['ɀ'].setRotationPoint(-80.0F, -18.0F, 0.0F);
/*      */     
/* 2454 */     this.gunModel['Ɂ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2455 */     this.gunModel['Ɂ'].setRotationPoint(-80.0F, -20.0F, 0.0F);
/*      */     
/* 2457 */     this.gunModel['ɂ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2458 */     this.gunModel['ɂ'].setRotationPoint(-71.0F, -19.0F, 0.0F);
/*      */     
/* 2460 */     this.gunModel['Ƀ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2461 */     this.gunModel['Ƀ'].setRotationPoint(-71.0F, -18.0F, 0.0F);
/*      */     
/* 2463 */     this.gunModel['Ʉ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2464 */     this.gunModel['Ʉ'].setRotationPoint(-71.0F, -20.0F, 0.0F);
/*      */     
/* 2466 */     this.gunModel['Ʌ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 5, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2467 */     this.gunModel['Ʌ'].setRotationPoint(-126.0F, -19.5F, -1.25F);
/*      */     
/* 2469 */     this.gunModel['Ɇ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2470 */     this.gunModel['Ɇ'].setRotationPoint(-126.0F, -16.5F, -1.25F);
/*      */     
/* 2472 */     this.gunModel['ɇ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2473 */     this.gunModel['ɇ'].setRotationPoint(-126.0F, -15.5F, -1.25F);
/*      */     
/* 2475 */     this.gunModel['Ɉ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2476 */     this.gunModel['Ɉ'].setRotationPoint(-125.0F, -14.5F, -1.25F);
/*      */     
/* 2478 */     this.gunModel['ɉ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2479 */     this.gunModel['ɉ'].setRotationPoint(-125.0F, -13.5F, -1.25F);
/*      */     
/* 2481 */     this.gunModel['Ɋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2482 */     this.gunModel['Ɋ'].setRotationPoint(-125.0F, -11.5F, -1.25F);
/*      */     
/* 2484 */     this.gunModel['ɋ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 5, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2485 */     this.gunModel['ɋ'].setRotationPoint(-126.0F, -24.5F, -1.25F);
/*      */     
/* 2487 */     this.gunModel['Ɍ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, 0.75F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 2488 */     this.gunModel['Ɍ'].setRotationPoint(-125.0F, -26.5F, -1.25F);
/*      */     
/* 2490 */     this.gunModel['ɍ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, 0.25F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2491 */     this.gunModel['ɍ'].setRotationPoint(-125.0F, -28.5F, -0.75F);
/*      */     
/* 2493 */     this.gunModel['Ɏ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 14, 0.0F, 0.75F, 0.0F, -2.5F, 0.75F, 0.0F, -2.5F, 0.75F, 0.0F, -3.0F, 0.75F, 0.0F, -3.0F, 1.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F);
/* 2494 */     this.gunModel['Ɏ'].setRotationPoint(-124.0F, -29.5F, -0.25F);
/*      */     
/* 2496 */     this.gunModel['ɏ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 14, 0.0F, 0.75F, 0.0F, -5.0F, 0.75F, 0.0F, -5.0F, 0.75F, 0.0F, -5.5F, 0.75F, 0.0F, -5.5F, 1.75F, 0.0F, -2.5F, -0.25F, 0.0F, -2.5F, -0.25F, 0.0F, -3.0F, 1.75F, 0.0F, -3.0F);
/* 2497 */     this.gunModel['ɏ'].setRotationPoint(-123.0F, -30.5F, -0.25F);
/*      */     
/* 2499 */     this.gunModel['ɐ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2500 */     this.gunModel['ɐ'].setRotationPoint(-123.75F, -11.5F, -1.25F);
/*      */     
/* 2502 */     this.gunModel['ɑ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2503 */     this.gunModel['ɑ'].setRotationPoint(-122.75F, -13.5F, -1.25F);
/*      */     
/* 2505 */     this.gunModel['ɒ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2506 */     this.gunModel['ɒ'].setRotationPoint(-121.75F, -14.5F, -1.25F);
/*      */     
/* 2508 */     this.gunModel['ɓ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2509 */     this.gunModel['ɓ'].setRotationPoint(-121.75F, -15.5F, -1.25F);
/*      */     
/* 2511 */     this.gunModel['ɔ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.25F, -0.85F, 0.0F, 0.25F, -0.85F, 0.0F, 0.25F, -0.85F, -1.0F, -1.25F, -0.85F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F);
/* 2512 */     this.gunModel['ɔ'].setRotationPoint(-121.75F, -16.5F, 11.25F);
/*      */     
/* 2514 */     this.gunModel['ɕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F);
/* 2515 */     this.gunModel['ɕ'].setRotationPoint(-125.0F, -8.5F, -1.25F);
/*      */     
/* 2517 */     this.gunModel['ɖ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 3, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2518 */     this.gunModel['ɖ'].setRotationPoint(-124.5F, -8.5F, -1.25F);
/*      */     
/* 2520 */     this.gunModel['ɗ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 5, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2521 */     this.gunModel['ɗ'].setRotationPoint(-126.0F, -19.5F, 9.25F);
/*      */     
/* 2523 */     this.gunModel['ɘ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 3, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2524 */     this.gunModel['ɘ'].setRotationPoint(-126.0F, -16.5F, 11.25F);
/*      */     
/* 2526 */     this.gunModel['ə'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2527 */     this.gunModel['ə'].setRotationPoint(-126.0F, -15.5F, 11.25F);
/*      */     
/* 2529 */     this.gunModel['ɚ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2530 */     this.gunModel['ɚ'].setRotationPoint(-125.0F, -14.5F, 11.25F);
/*      */     
/* 2532 */     this.gunModel['ɛ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 3, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2533 */     this.gunModel['ɛ'].setRotationPoint(-125.0F, -13.5F, 11.25F);
/*      */     
/* 2535 */     this.gunModel['ɜ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 3, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2536 */     this.gunModel['ɜ'].setRotationPoint(-125.0F, -11.5F, 11.25F);
/*      */     
/* 2538 */     this.gunModel['ɝ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 5, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2539 */     this.gunModel['ɝ'].setRotationPoint(-126.0F, -24.5F, 12.25F);
/*      */     
/* 2541 */     this.gunModel['ɞ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, 0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 2542 */     this.gunModel['ɞ'].setRotationPoint(-125.0F, -26.5F, 12.25F);
/*      */     
/* 2544 */     this.gunModel['ɟ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2545 */     this.gunModel['ɟ'].setRotationPoint(-125.0F, -28.5F, 11.75F);
/*      */     
/* 2547 */     this.gunModel['ɠ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F);
/* 2548 */     this.gunModel['ɠ'].setRotationPoint(-123.75F, -11.5F, 11.25F);
/*      */     
/* 2550 */     this.gunModel['ɡ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 2551 */     this.gunModel['ɡ'].setRotationPoint(-122.75F, -13.5F, 11.25F);
/*      */     
/* 2553 */     this.gunModel['ɢ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F);
/* 2554 */     this.gunModel['ɢ'].setRotationPoint(-121.75F, -14.5F, 11.25F);
/*      */     
/* 2556 */     this.gunModel['ɣ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F);
/* 2557 */     this.gunModel['ɣ'].setRotationPoint(-121.75F, -15.5F, 11.25F);
/*      */     
/* 2559 */     this.gunModel['ɤ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F);
/* 2560 */     this.gunModel['ɤ'].setRotationPoint(-125.0F, -8.5F, 11.25F);
/*      */     
/* 2562 */     this.gunModel['ɥ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 3, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F);
/* 2563 */     this.gunModel['ɥ'].setRotationPoint(-124.5F, -8.5F, 11.25F);
/*      */     
/* 2565 */     this.gunModel['ɦ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.25F, -0.85F, 0.0F, 0.25F, -0.85F, -1.0F, 0.25F, -0.85F, 0.0F, -1.25F, -0.85F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 2566 */     this.gunModel['ɦ'].setRotationPoint(-121.75F, -16.5F, -1.25F);
/*      */     
/* 2568 */     this.gunModel['ɧ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2569 */     this.gunModel['ɧ'].setRotationPoint(-120.0F, -20.5F, 12.25F);
/*      */     
/* 2571 */     this.gunModel['ɨ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2572 */     this.gunModel['ɨ'].setRotationPoint(-120.0F, -20.5F, -1.25F);
/*      */     
/* 2574 */     this.gunModel['ɩ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2575 */     this.gunModel['ɩ'].setRotationPoint(-125.0F, -11.5F, 1.25F);
/*      */     
/* 2577 */     this.gunModel['ɪ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 9, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/* 2578 */     this.gunModel['ɪ'].setRotationPoint(-125.0F, -13.5F, 1.75F);
/*      */     
/* 2580 */     this.gunModel['ɫ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 5, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F);
/* 2581 */     this.gunModel['ɫ'].setRotationPoint(-126.0F, -19.5F, 3.75F);
/*      */     
/* 2583 */     this.gunModel['ɬ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/* 2584 */     this.gunModel['ɬ'].setRotationPoint(-126.0F, -16.5F, 1.75F);
/*      */     
/* 2586 */     this.gunModel['ɭ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 2587 */     this.gunModel['ɭ'].setRotationPoint(-126.0F, -15.5F, 1.75F);
/*      */     
/* 2589 */     this.gunModel['ɮ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 9, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 1.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 2590 */     this.gunModel['ɮ'].setRotationPoint(-125.0F, -14.5F, 1.75F);
/*      */     
/* 2592 */     this.gunModel['ɯ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 5, 11, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.75F, 0.0F, 0.5F);
/* 2593 */     this.gunModel['ɯ'].setRotationPoint(-126.0F, -24.5F, 0.75F);
/*      */     
/* 2595 */     this.gunModel['ɰ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.75F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.25F, 0.0F, 0.5F);
/* 2596 */     this.gunModel['ɰ'].setRotationPoint(-125.0F, -26.5F, 0.75F);
/*      */     
/* 2598 */     this.gunModel['ɱ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F);
/* 2599 */     this.gunModel['ɱ'].setRotationPoint(-125.0F, -28.5F, 1.75F);
/*      */     
/* 2601 */     this.gunModel['ɲ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2602 */     this.gunModel['ɲ'].setRotationPoint(73.0F, -18.25F, -0.5F);
/*      */     
/* 2604 */     this.gunModel['ɳ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2605 */     this.gunModel['ɳ'].setRotationPoint(73.0F, -15.25F, -0.5F);
/*      */     
/* 2607 */     this.gunModel['ɴ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 2608 */     this.gunModel['ɴ'].setRotationPoint(73.0F, -13.25F, 0.5F);
/*      */     
/* 2610 */     this.gunModel['ɵ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 7, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 2611 */     this.gunModel['ɵ'].setRotationPoint(73.0F, -11.25F, 2.5F);
/*      */     
/* 2613 */     this.gunModel['ɶ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 2614 */     this.gunModel['ɶ'].setRotationPoint(74.5F, -14.25F, 9.5F);
/*      */     
/* 2616 */     this.gunModel['ɷ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2617 */     this.gunModel['ɷ'].setRotationPoint(74.5F, -13.75F, 11.5F);
/*      */     
/* 2619 */     this.gunModel['ɸ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 2620 */     this.gunModel['ɸ'].setRotationPoint(74.5F, -12.5F, 11.5F);
/*      */     
/* 2622 */     this.gunModel['ɹ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2623 */     this.gunModel['ɹ'].setRotationPoint(74.5F, -13.5F, 11.5F);
/*      */     
/* 2625 */     this.gunModel['ɺ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2626 */     this.gunModel['ɺ'].setRotationPoint(74.5F, -13.5F, 10.5F);
/*      */     
/* 2628 */     this.gunModel['ɻ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2629 */     this.gunModel['ɻ'].setRotationPoint(74.5F, -13.5F, 11.5F);
/*      */     
/* 2631 */     this.gunModel['ɼ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2632 */     this.gunModel['ɼ'].setRotationPoint(74.5F, -13.5F, 10.75F);
/*      */     
/* 2634 */     this.gunModel['ɽ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F);
/* 2635 */     this.gunModel['ɽ'].setRotationPoint(74.5F, -13.25F, 11.5F);
/*      */     
/* 2637 */     this.gunModel['ɾ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F);
/* 2638 */     this.gunModel['ɾ'].setRotationPoint(74.5F, -13.25F, 10.75F);
/*      */     
/* 2640 */     this.gunModel['ɿ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F);
/* 2641 */     this.gunModel['ɿ'].setRotationPoint(74.5F, -14.25F, 0.5F);
/*      */     
/* 2643 */     this.gunModel['ʀ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2644 */     this.gunModel['ʀ'].setRotationPoint(74.5F, -13.75F, -1.5F);
/*      */     
/* 2646 */     this.gunModel['ʁ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2647 */     this.gunModel['ʁ'].setRotationPoint(74.5F, -12.5F, -1.5F);
/*      */     
/* 2649 */     this.gunModel['ʂ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2650 */     this.gunModel['ʂ'].setRotationPoint(74.5F, -13.5F, -2.0F);
/*      */     
/* 2652 */     this.gunModel['ʃ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2653 */     this.gunModel['ʃ'].setRotationPoint(74.5F, -13.5F, -0.75F);
/*      */     
/* 2655 */     this.gunModel['ʄ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2656 */     this.gunModel['ʄ'].setRotationPoint(74.5F, -13.5F, -0.75F);
/*      */     
/* 2658 */     this.gunModel['ʅ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2659 */     this.gunModel['ʅ'].setRotationPoint(74.5F, -13.5F, -1.5F);
/*      */     
/* 2661 */     this.gunModel['ʆ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F);
/* 2662 */     this.gunModel['ʆ'].setRotationPoint(74.5F, -13.25F, -0.75F);
/*      */     
/* 2664 */     this.gunModel['ʇ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F);
/* 2665 */     this.gunModel['ʇ'].setRotationPoint(74.5F, -13.25F, -1.5F);
/*      */     
/* 2667 */     this.gunModel['ʈ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2668 */     this.gunModel['ʈ'].setRotationPoint(-80.0F, -20.0F, 6.0F);
/*      */     
/* 2670 */     this.gunModel['ʉ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2671 */     this.gunModel['ʉ'].setRotationPoint(-71.0F, -20.0F, 6.0F);
/*      */     
/* 2673 */     this.gunModel['ʊ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2674 */     this.gunModel['ʊ'].setRotationPoint(-80.0F, -20.0F, 2.0F);
/*      */     
/* 2676 */     this.gunModel['ʋ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2677 */     this.gunModel['ʋ'].setRotationPoint(-71.0F, -20.0F, 2.0F);
/*      */     
/* 2679 */     this.gunModel['ʌ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 9, 0.0F, -0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, -0.25F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2680 */     this.gunModel['ʌ'].setRotationPoint(-124.5F, -7.5F, 3.25F);
/*      */     
/* 2682 */     this.gunModel['ʍ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2683 */     this.gunModel['ʍ'].setRotationPoint(73.0F, -10.25F, 5.0F);
/*      */     
/* 2685 */     this.gunModel['ʎ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 9, 1, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -6.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -6.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F);
/* 2686 */     this.gunModel['ʎ'].setRotationPoint(75.0F, -28.5F, 16.0F);
/*      */     
/* 2688 */     this.gunModel['ʏ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 9, 1, 0.0F, 0.0F, -1.5F, -0.5F, -6.0F, -1.5F, -0.5F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, -0.5F, -6.0F, -1.75F, -0.5F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2689 */     this.gunModel['ʏ'].setRotationPoint(75.0F, -28.5F, -5.0F);
/*      */     
/* 2691 */     this.gunModel['ʐ'].addShapeBox(40.0F, -11.0F, -6.0F, 67, 9, 1, 0.0F, -0.25F, -1.5F, -0.5F, -3.0F, -1.5F, -0.5F, -3.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.75F, -0.5F, -3.0F, -1.75F, -0.5F, -3.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2692 */     this.gunModel['ʐ'].setRotationPoint(11.0F, -28.5F, -5.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultBarrelModel_1()
/*      */   {
/* 2697 */     this.defaultBarrelModel[0] = new ModelRendererTurbo(this, 1161, 41, this.textureX, this.textureY);
/* 2698 */     this.defaultBarrelModel[1] = new ModelRendererTurbo(this, 801, 49, this.textureX, this.textureY);
/* 2699 */     this.defaultBarrelModel[2] = new ModelRendererTurbo(this, 817, 49, this.textureX, this.textureY);
/* 2700 */     this.defaultBarrelModel[3] = new ModelRendererTurbo(this, 841, 49, this.textureX, this.textureY);
/* 2701 */     this.defaultBarrelModel[4] = new ModelRendererTurbo(this, 1041, 49, this.textureX, this.textureY);
/* 2702 */     this.defaultBarrelModel[5] = new ModelRendererTurbo(this, 1065, 49, this.textureX, this.textureY);
/* 2703 */     this.defaultBarrelModel[6] = new ModelRendererTurbo(this, 1945, 17, this.textureX, this.textureY);
/* 2704 */     this.defaultBarrelModel[7] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 2705 */     this.defaultBarrelModel[8] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/* 2706 */     this.defaultBarrelModel[9] = new ModelRendererTurbo(this, 1313, 49, this.textureX, this.textureY);
/* 2707 */     this.defaultBarrelModel[10] = new ModelRendererTurbo(this, 1401, 49, this.textureX, this.textureY);
/* 2708 */     this.defaultBarrelModel[11] = new ModelRendererTurbo(this, 1185, 65, this.textureX, this.textureY);
/* 2709 */     this.defaultBarrelModel[12] = new ModelRendererTurbo(this, 1225, 65, this.textureX, this.textureY);
/* 2710 */     this.defaultBarrelModel[13] = new ModelRendererTurbo(this, 1729, 65, this.textureX, this.textureY);
/*      */     
/* 2712 */     this.defaultBarrelModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 2, 8, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2713 */     this.defaultBarrelModel[0].setRotationPoint(92.0F, -28.5F, 2.0F);
/*      */     
/* 2715 */     this.defaultBarrelModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 3, 8, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2716 */     this.defaultBarrelModel[1].setRotationPoint(96.0F, -28.5F, 2.0F);
/*      */     
/* 2718 */     this.defaultBarrelModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 2719 */     this.defaultBarrelModel[2].setRotationPoint(99.0F, -28.5F, 2.0F);
/*      */     
/* 2721 */     this.defaultBarrelModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2722 */     this.defaultBarrelModel[3].setRotationPoint(99.0F, -22.5F, 2.0F);
/*      */     
/* 2724 */     this.defaultBarrelModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2725 */     this.defaultBarrelModel[4].setRotationPoint(99.0F, -26.0F, 2.0F);
/*      */     
/* 2727 */     this.defaultBarrelModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2728 */     this.defaultBarrelModel[5].setRotationPoint(99.0F, -28.5F, 6.0F);
/*      */     
/* 2730 */     this.defaultBarrelModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2731 */     this.defaultBarrelModel[6].setRotationPoint(105.0F, -24.5F, 2.0F);
/*      */     
/* 2733 */     this.defaultBarrelModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2734 */     this.defaultBarrelModel[7].setRotationPoint(105.0F, -27.5F, 2.0F);
/*      */     
/* 2736 */     this.defaultBarrelModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2737 */     this.defaultBarrelModel[8].setRotationPoint(105.0F, -28.5F, 5.0F);
/*      */     
/* 2739 */     this.defaultBarrelModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2740 */     this.defaultBarrelModel[9].setRotationPoint(105.0F, -24.5F, 8.0F);
/*      */     
/* 2742 */     this.defaultBarrelModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2743 */     this.defaultBarrelModel[10].setRotationPoint(105.0F, -27.5F, 8.0F);
/*      */     
/* 2745 */     this.defaultBarrelModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2746 */     this.defaultBarrelModel[11].setRotationPoint(99.0F, -26.0F, 8.0F);
/*      */     
/* 2748 */     this.defaultBarrelModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2749 */     this.defaultBarrelModel[12].setRotationPoint(99.0F, -23.5F, 2.0F);
/*      */     
/* 2751 */     this.defaultBarrelModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 2752 */     this.defaultBarrelModel[13].setRotationPoint(99.0F, -23.5F, 8.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 2757 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 1793, 49, this.textureX, this.textureY);
/* 2758 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 1849, 49, this.textureX, this.textureY);
/* 2759 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 1905, 49, this.textureX, this.textureY);
/* 2760 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1937, 49, this.textureX, this.textureY);
/* 2761 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 2017, 49, this.textureX, this.textureY);
/* 2762 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/* 2763 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 2764 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/* 2765 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/* 2766 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 2767 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 865, 49, this.textureX, this.textureY);
/* 2768 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 1025, 49, this.textureX, this.textureY);
/* 2769 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 1833, 49, this.textureX, this.textureY);
/* 2770 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 1889, 49, this.textureX, this.textureY);
/* 2771 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 2772 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/* 2773 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 1929, 49, this.textureX, this.textureY);
/* 2774 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 2775 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/* 2776 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/* 2777 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/* 2778 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/* 2779 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/* 2780 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 2041, 17, this.textureX, this.textureY);
/* 2781 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 2041, 25, this.textureX, this.textureY);
/* 2782 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 2041, 33, this.textureX, this.textureY);
/* 2783 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 593, 49, this.textureX, this.textureY);
/* 2784 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/* 2785 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/* 2786 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/* 2787 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/* 2788 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 729, 57, this.textureX, this.textureY);
/* 2789 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 633, 9, this.textureX, this.textureY);
/* 2790 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 673, 9, this.textureX, this.textureY);
/* 2791 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 705, 9, this.textureX, this.textureY);
/* 2792 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 777, 9, this.textureX, this.textureY);
/* 2793 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 929, 9, this.textureX, this.textureY);
/* 2794 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 969, 9, this.textureX, this.textureY);
/* 2795 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/* 2796 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 1049, 9, this.textureX, this.textureY);
/* 2797 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/* 2798 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 641, 65, this.textureX, this.textureY);
/* 2799 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 689, 65, this.textureX, this.textureY);
/* 2800 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 1025, 9, this.textureX, this.textureY);
/* 2801 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 1065, 9, this.textureX, this.textureY);
/* 2802 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 1201, 9, this.textureX, this.textureY);
/* 2803 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 905, 81, this.textureX, this.textureY);
/* 2804 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 929, 81, this.textureX, this.textureY);
/* 2805 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 681, 105, this.textureX, this.textureY);
/* 2806 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 721, 97, this.textureX, this.textureY);
/* 2807 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 1769, 17, this.textureX, this.textureY);
/* 2808 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 1937, 17, this.textureX, this.textureY);
/* 2809 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 705, 105, this.textureX, this.textureY);
/* 2810 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/* 2811 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/* 2812 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 1065, 97, this.textureX, this.textureY);
/* 2813 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 929, 105, this.textureX, this.textureY);
/* 2814 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 953, 105, this.textureX, this.textureY);
/* 2815 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 1889, 97, this.textureX, this.textureY);
/* 2816 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 1025, 57, this.textureX, this.textureY);
/* 2817 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 1569, 33, this.textureX, this.textureY);
/* 2818 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 1041, 57, this.textureX, this.textureY);
/* 2819 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 1353, 57, this.textureX, this.textureY);
/* 2820 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 1369, 57, this.textureX, this.textureY);
/* 2821 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 1793, 57, this.textureX, this.textureY);
/* 2822 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/* 2823 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/* 2824 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 841, 65, this.textureX, this.textureY);
/* 2825 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 881, 65, this.textureX, this.textureY);
/* 2826 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 897, 65, this.textureX, this.textureY);
/* 2827 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 1025, 105, this.textureX, this.textureY);
/* 2828 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 1641, 65, this.textureX, this.textureY);
/* 2829 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 1353, 9, this.textureX, this.textureY);
/* 2830 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 2041, 9, this.textureX, this.textureY);
/* 2831 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 2001, 97, this.textureX, this.textureY);
/* 2832 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/* 2833 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 1513, 17, this.textureX, this.textureY);
/* 2834 */     this.defaultScopeModel[77] = new ModelRendererTurbo(this, 1281, 25, this.textureX, this.textureY);
/* 2835 */     this.defaultScopeModel[78] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/* 2836 */     this.defaultScopeModel[79] = new ModelRendererTurbo(this, 1073, 105, this.textureX, this.textureY);
/* 2837 */     this.defaultScopeModel[80] = new ModelRendererTurbo(this, 1089, 105, this.textureX, this.textureY);
/* 2838 */     this.defaultScopeModel[81] = new ModelRendererTurbo(this, 1105, 105, this.textureX, this.textureY);
/* 2839 */     this.defaultScopeModel[82] = new ModelRendererTurbo(this, 1169, 105, this.textureX, this.textureY);
/* 2840 */     this.defaultScopeModel[83] = new ModelRendererTurbo(this, 1185, 105, this.textureX, this.textureY);
/* 2841 */     this.defaultScopeModel[84] = new ModelRendererTurbo(this, 1217, 105, this.textureX, this.textureY);
/* 2842 */     this.defaultScopeModel[85] = new ModelRendererTurbo(this, 1233, 105, this.textureX, this.textureY);
/* 2843 */     this.defaultScopeModel[86] = new ModelRendererTurbo(this, 1249, 105, this.textureX, this.textureY);
/*      */     
/* 2845 */     this.defaultScopeModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 13, 4, 11, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2846 */     this.defaultScopeModel[0].setRotationPoint(-41.0F, -39.5F, 0.5F);
/*      */     
/* 2848 */     this.defaultScopeModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 14, 1, 11, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F);
/* 2849 */     this.defaultScopeModel[1].setRotationPoint(-42.0F, -35.5F, 0.5F);
/*      */     
/* 2851 */     this.defaultScopeModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2852 */     this.defaultScopeModel[2].setRotationPoint(-36.25F, -39.25F, 0.0F);
/*      */     
/* 2854 */     this.defaultScopeModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2855 */     this.defaultScopeModel[3].setRotationPoint(-36.25F, -38.25F, 0.0F);
/*      */     
/* 2857 */     this.defaultScopeModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 2858 */     this.defaultScopeModel[4].setRotationPoint(-36.25F, -37.25F, 0.0F);
/*      */     
/* 2860 */     this.defaultScopeModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F);
/* 2861 */     this.defaultScopeModel[5].setRotationPoint(-41.5F, -39.5F, 0.5F);
/*      */     
/* 2863 */     this.defaultScopeModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -1.75F, -0.25F, -1.0F, -1.75F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F);
/* 2864 */     this.defaultScopeModel[6].setRotationPoint(-29.0F, -35.5F, 0.5F);
/*      */     
/* 2866 */     this.defaultScopeModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 2867 */     this.defaultScopeModel[7].setRotationPoint(-28.5F, -39.5F, 0.5F);
/*      */     
/* 2869 */     this.defaultScopeModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, -1.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, -1.0F, -1.75F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -1.75F, -0.25F, -1.0F);
/* 2870 */     this.defaultScopeModel[8].setRotationPoint(-43.0F, -35.5F, 0.5F);
/*      */     
/* 2872 */     this.defaultScopeModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 13, 2, 11, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2873 */     this.defaultScopeModel[9].setRotationPoint(-41.0F, -41.25F, 0.5F);
/*      */     
/* 2875 */     this.defaultScopeModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, -0.75F, -0.75F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.75F, -0.75F, -1.5F, -0.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F);
/* 2876 */     this.defaultScopeModel[10].setRotationPoint(-42.0F, -41.25F, 0.5F);
/*      */     
/* 2878 */     this.defaultScopeModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, -0.5F, 0.0F, -1.5F, -0.75F, -0.75F, -1.5F, -0.75F, -0.75F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F);
/* 2879 */     this.defaultScopeModel[11].setRotationPoint(-29.0F, -41.25F, 0.5F);
/*      */     
/* 2881 */     this.defaultScopeModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 8, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2882 */     this.defaultScopeModel[12].setRotationPoint(-33.0F, -41.25F, 2.0F);
/*      */     
/* 2884 */     this.defaultScopeModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 8, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2885 */     this.defaultScopeModel[13].setRotationPoint(-35.0F, -42.25F, 2.0F);
/*      */     
/* 2887 */     this.defaultScopeModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 8, 0.0F, -0.25F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2888 */     this.defaultScopeModel[14].setRotationPoint(-38.0F, -43.25F, 2.0F);
/*      */     
/* 2890 */     this.defaultScopeModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2891 */     this.defaultScopeModel[15].setRotationPoint(-40.0F, -44.25F, 2.0F);
/*      */     
/* 2893 */     this.defaultScopeModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 8, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2894 */     this.defaultScopeModel[16].setRotationPoint(-38.0F, -44.25F, 2.0F);
/*      */     
/* 2896 */     this.defaultScopeModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2897 */     this.defaultScopeModel[17].setRotationPoint(-40.0F, -45.75F, 2.0F);
/*      */     
/* 2899 */     this.defaultScopeModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2900 */     this.defaultScopeModel[18].setRotationPoint(-39.0F, -45.75F, 2.0F);
/*      */     
/* 2902 */     this.defaultScopeModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 1, 5, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2903 */     this.defaultScopeModel[19].setRotationPoint(-41.0F, -44.25F, 2.0F);
/*      */     
/* 2905 */     this.defaultScopeModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2906 */     this.defaultScopeModel[20].setRotationPoint(-40.0F, -42.75F, 2.5F);
/*      */     
/* 2908 */     this.defaultScopeModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 2909 */     this.defaultScopeModel[21].setRotationPoint(-38.75F, -42.75F, 2.0F);
/*      */     
/* 2911 */     this.defaultScopeModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2912 */     this.defaultScopeModel[22].setRotationPoint(-40.0F, -42.75F, 2.0F);
/*      */     
/* 2914 */     this.defaultScopeModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2915 */     this.defaultScopeModel[23].setRotationPoint(-41.0F, -45.5F, 2.0F);
/*      */     
/* 2917 */     this.defaultScopeModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2918 */     this.defaultScopeModel[24].setRotationPoint(-40.0F, -45.75F, 8.0F);
/*      */     
/* 2920 */     this.defaultScopeModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2921 */     this.defaultScopeModel[25].setRotationPoint(-39.0F, -45.75F, 8.0F);
/*      */     
/* 2923 */     this.defaultScopeModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2924 */     this.defaultScopeModel[26].setRotationPoint(-41.0F, -45.5F, 8.0F);
/*      */     
/* 2926 */     this.defaultScopeModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 6, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 2927 */     this.defaultScopeModel[27].setRotationPoint(-37.0F, -64.0F, 7.0F);
/* 2928 */     this.defaultScopeModel[27].rotateAngleZ = -0.43633232F;
/*      */     
/* 2930 */     this.defaultScopeModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 6, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2931 */     this.defaultScopeModel[28].setRotationPoint(-37.0F, -64.0F, 3.0F);
/* 2932 */     this.defaultScopeModel[28].rotateAngleZ = -0.43633232F;
/*      */     
/* 2934 */     this.defaultScopeModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 6, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2935 */     this.defaultScopeModel[29].setRotationPoint(-37.0F, -64.0F, 5.0F);
/* 2936 */     this.defaultScopeModel[29].rotateAngleZ = -0.43633232F;
/*      */     
/* 2938 */     this.defaultScopeModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 2, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.25F, -1.75F, -0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F);
/* 2939 */     this.defaultScopeModel[30].setRotationPoint(-36.15F, -65.8F, 7.0F);
/* 2940 */     this.defaultScopeModel[30].rotateAngleZ = -0.43633232F;
/*      */     
/* 2942 */     this.defaultScopeModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 2, 0.0F, -1.75F, -0.5F, 0.25F, -1.75F, -0.5F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2943 */     this.defaultScopeModel[31].setRotationPoint(-36.15F, -65.8F, 3.0F);
/* 2944 */     this.defaultScopeModel[31].rotateAngleZ = -0.43633232F;
/*      */     
/* 2946 */     this.defaultScopeModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.5F, -4.75F, -0.5F, -0.5F, -4.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -4.75F, 0.0F, -0.5F);
/* 2947 */     this.defaultScopeModel[32].setRotationPoint(-36.15F, -65.8F, 5.0F);
/* 2948 */     this.defaultScopeModel[32].rotateAngleZ = -0.43633232F;
/*      */     
/* 2950 */     this.defaultScopeModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.5F, -4.75F, -0.5F, -0.5F, -4.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -4.75F, 0.0F, -0.5F);
/* 2951 */     this.defaultScopeModel[33].setRotationPoint(-36.15F, -65.8F, 6.5F);
/* 2952 */     this.defaultScopeModel[33].rotateAngleZ = -0.43633232F;
/*      */     
/* 2954 */     this.defaultScopeModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -4.75F, -1.5F, 0.0F, -4.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F);
/* 2955 */     this.defaultScopeModel[34].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 2956 */     this.defaultScopeModel[34].rotateAngleZ = -0.43633232F;
/*      */     
/* 2958 */     this.defaultScopeModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, -4.75F, -1.25F, 0.0F);
/* 2959 */     this.defaultScopeModel[35].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 2960 */     this.defaultScopeModel[35].rotateAngleZ = -0.43633232F;
/*      */     
/* 2962 */     this.defaultScopeModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, 0.0F, -4.75F, -0.75F, 0.0F, -4.75F, -1.0F, -1.0F, 0.25F, -1.0F, -1.0F, 0.25F, -1.0F, 0.0F, -4.75F, -1.0F, 0.0F);
/* 2963 */     this.defaultScopeModel[36].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 2964 */     this.defaultScopeModel[36].rotateAngleZ = -0.43633232F;
/*      */     
/* 2966 */     this.defaultScopeModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -0.75F, -4.75F, -0.75F, -0.75F, -4.75F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -1.0F, -4.75F, -1.0F, -1.0F);
/* 2967 */     this.defaultScopeModel[37].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 2968 */     this.defaultScopeModel[37].rotateAngleZ = -0.43633232F;
/*      */     
/* 2970 */     this.defaultScopeModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, -1.0F, -4.75F, -1.25F, -1.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F);
/* 2971 */     this.defaultScopeModel[38].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 2972 */     this.defaultScopeModel[38].rotateAngleZ = -0.43633232F;
/*      */     
/* 2974 */     this.defaultScopeModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -1.25F, -1.0F, 0.25F, -1.25F, -1.0F, 0.25F, -1.25F, 0.0F, -4.75F, -1.25F, 0.0F, -4.75F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F);
/* 2975 */     this.defaultScopeModel[39].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 2976 */     this.defaultScopeModel[39].rotateAngleZ = -0.43633232F;
/*      */     
/* 2978 */     this.defaultScopeModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2979 */     this.defaultScopeModel[40].setRotationPoint(-3.0F, -30.5F, 11.5F);
/*      */     
/* 2981 */     this.defaultScopeModel[41].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, 0.0F);
/* 2982 */     this.defaultScopeModel[41].setRotationPoint(-1.0F, -30.5F, 11.5F);
/*      */     
/* 2984 */     this.defaultScopeModel[42].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -2.0F);
/* 2985 */     this.defaultScopeModel[42].setRotationPoint(-5.0F, -30.5F, 11.5F);
/*      */     
/* 2987 */     this.defaultScopeModel[43].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 2988 */     this.defaultScopeModel[43].setRotationPoint(-3.0F, -31.5F, 11.5F);
/*      */     
/* 2990 */     this.defaultScopeModel[44].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, 0.0F);
/* 2991 */     this.defaultScopeModel[44].setRotationPoint(-1.0F, -31.5F, 11.5F);
/*      */     
/* 2993 */     this.defaultScopeModel[45].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -2.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F);
/* 2994 */     this.defaultScopeModel[45].setRotationPoint(-5.0F, -31.5F, 11.5F);
/*      */     
/* 2996 */     this.defaultScopeModel[46].addShapeBox(40.0F, -11.0F, -6.0F, 7, 4, 1, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2997 */     this.defaultScopeModel[46].setRotationPoint(-5.0F, -30.5F, 10.5F);
/*      */     
/* 2999 */     this.defaultScopeModel[47].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 1, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 3000 */     this.defaultScopeModel[47].setRotationPoint(-5.0F, -32.0F, 10.5F);
/*      */     
/* 3002 */     this.defaultScopeModel[48].addShapeBox(40.0F, -11.0F, -6.0F, 3, 6, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3003 */     this.defaultScopeModel[48].setRotationPoint(80.0F, -45.0F, 3.5F);
/*      */     
/* 3005 */     this.defaultScopeModel[49].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3006 */     this.defaultScopeModel[49].setRotationPoint(80.0F, -39.0F, 3.5F);
/*      */     
/* 3008 */     this.defaultScopeModel[50].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3009 */     this.defaultScopeModel[50].setRotationPoint(82.25F, -39.0F, 3.5F);
/*      */     
/* 3011 */     this.defaultScopeModel[51].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3012 */     this.defaultScopeModel[51].setRotationPoint(81.5F, -39.0F, 3.5F);
/*      */     
/* 3014 */     this.defaultScopeModel[52].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 3015 */     this.defaultScopeModel[52].setRotationPoint(81.5F, -39.0F, 3.5F);
/*      */     
/* 3017 */     this.defaultScopeModel[53].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3018 */     this.defaultScopeModel[53].setRotationPoint(82.25F, -35.0F, 3.5F);
/*      */     
/* 3020 */     this.defaultScopeModel[54].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3021 */     this.defaultScopeModel[54].setRotationPoint(81.5F, -35.0F, 3.5F);
/*      */     
/* 3023 */     this.defaultScopeModel[55].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 5, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, -0.5F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F);
/* 3024 */     this.defaultScopeModel[55].setRotationPoint(83.5F, -39.0F, 3.5F);
/*      */     
/* 3026 */     this.defaultScopeModel[56].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 3027 */     this.defaultScopeModel[56].setRotationPoint(81.5F, -34.25F, 3.5F);
/*      */     
/* 3029 */     this.defaultScopeModel[57].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3030 */     this.defaultScopeModel[57].setRotationPoint(80.0F, -46.0F, 3.5F);
/*      */     
/* 3032 */     this.defaultScopeModel[58].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3033 */     this.defaultScopeModel[58].setRotationPoint(80.0F, -47.0F, 4.5F);
/*      */     
/* 3035 */     this.defaultScopeModel[59].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3036 */     this.defaultScopeModel[59].setRotationPoint(80.0F, -47.5F, 3.5F);
/*      */     
/* 3038 */     this.defaultScopeModel[60].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3039 */     this.defaultScopeModel[60].setRotationPoint(80.0F, -35.0F, 3.5F);
/*      */     
/* 3041 */     this.defaultScopeModel[61].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3042 */     this.defaultScopeModel[61].setRotationPoint(80.0F, -48.5F, 2.5F);
/*      */     
/* 3044 */     this.defaultScopeModel[62].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3045 */     this.defaultScopeModel[62].setRotationPoint(80.0F, -49.5F, 2.0F);
/*      */     
/* 3047 */     this.defaultScopeModel[63].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3048 */     this.defaultScopeModel[63].setRotationPoint(80.0F, -47.5F, 7.5F);
/*      */     
/* 3050 */     this.defaultScopeModel[64].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3051 */     this.defaultScopeModel[64].setRotationPoint(80.0F, -48.5F, 8.5F);
/*      */     
/* 3053 */     this.defaultScopeModel[65].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3054 */     this.defaultScopeModel[65].setRotationPoint(80.0F, -49.5F, 9.0F);
/*      */     
/* 3056 */     this.defaultScopeModel[66].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3057 */     this.defaultScopeModel[66].setRotationPoint(80.0F, -50.5F, 2.5F);
/*      */     
/* 3059 */     this.defaultScopeModel[67].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3060 */     this.defaultScopeModel[67].setRotationPoint(80.0F, -50.5F, 8.5F);
/*      */     
/* 3062 */     this.defaultScopeModel[68].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3063 */     this.defaultScopeModel[68].setRotationPoint(80.0F, -51.5F, 8.5F);
/*      */     
/* 3065 */     this.defaultScopeModel[69].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3066 */     this.defaultScopeModel[69].setRotationPoint(80.0F, -51.5F, 2.5F);
/*      */     
/* 3068 */     this.defaultScopeModel[70].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 3069 */     this.defaultScopeModel[70].setRotationPoint(80.0F, -52.5F, 3.5F);
/*      */     
/* 3071 */     this.defaultScopeModel[71].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3072 */     this.defaultScopeModel[71].setRotationPoint(80.5F, -50.0F, 5.5F);
/*      */     
/* 3074 */     this.defaultScopeModel[72].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3075 */     this.defaultScopeModel[72].setRotationPoint(80.5F, -48.0F, 4.5F);
/*      */     
/* 3077 */     this.defaultScopeModel[73].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3078 */     this.defaultScopeModel[73].setRotationPoint(80.5F, -48.0F, 6.5F);
/*      */     
/* 3080 */     this.defaultScopeModel[74].addShapeBox(40.0F, -11.0F, -6.0F, 2, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 3081 */     this.defaultScopeModel[74].setRotationPoint(81.5F, -39.0F, 4.5F);
/*      */     
/* 3083 */     this.defaultScopeModel[75].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3084 */     this.defaultScopeModel[75].setRotationPoint(80.0F, -47.0F, 3.5F);
/*      */     
/* 3086 */     this.defaultScopeModel[76].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3087 */     this.defaultScopeModel[76].setRotationPoint(80.0F, -47.0F, 7.5F);
/*      */     
/* 3089 */     this.defaultScopeModel[77].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3090 */     this.defaultScopeModel[77].setRotationPoint(80.0F, -47.5F, 7.5F);
/*      */     
/* 3092 */     this.defaultScopeModel[78].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 1.0F, -0.5F, -0.5F, 1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3093 */     this.defaultScopeModel[78].setRotationPoint(80.0F, -47.5F, 3.5F);
/*      */     
/* 3095 */     this.defaultScopeModel[79].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/* 3096 */     this.defaultScopeModel[79].setRotationPoint(81.0F, -35.25F, 3.0F);
/*      */     
/* 3098 */     this.defaultScopeModel[80].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3099 */     this.defaultScopeModel[80].setRotationPoint(82.5F, -35.25F, 3.0F);
/*      */     
/* 3101 */     this.defaultScopeModel[81].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/* 3102 */     this.defaultScopeModel[81].setRotationPoint(81.5F, -37.0F, 3.0F);
/*      */     
/* 3104 */     this.defaultScopeModel[82].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/* 3105 */     this.defaultScopeModel[82].setRotationPoint(81.5F, -36.0F, 3.0F);
/*      */     
/* 3107 */     this.defaultScopeModel[83].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 3108 */     this.defaultScopeModel[83].setRotationPoint(81.0F, -37.0F, 3.0F);
/*      */     
/* 3110 */     this.defaultScopeModel[84].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 3111 */     this.defaultScopeModel[84].setRotationPoint(82.5F, -37.0F, 3.0F);
/*      */     
/* 3113 */     this.defaultScopeModel[85].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3114 */     this.defaultScopeModel[85].setRotationPoint(82.5F, -36.25F, 3.0F);
/*      */     
/* 3116 */     this.defaultScopeModel[86].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 3117 */     this.defaultScopeModel[86].setRotationPoint(81.25F, -36.25F, 3.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 3122 */     this.ammoModel[0] = new ModelRendererTurbo(this, 1393, 73, this.textureX, this.textureY);
/* 3123 */     this.ammoModel[1] = new ModelRendererTurbo(this, 1457, 73, this.textureX, this.textureY);
/* 3124 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1521, 73, this.textureX, this.textureY);
/* 3125 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1953, 73, this.textureX, this.textureY);
/* 3126 */     this.ammoModel[4] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/* 3127 */     this.ammoModel[5] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/* 3128 */     this.ammoModel[6] = new ModelRendererTurbo(this, 1257, 73, this.textureX, this.textureY);
/* 3129 */     this.ammoModel[7] = new ModelRendererTurbo(this, 1345, 73, this.textureX, this.textureY);
/* 3130 */     this.ammoModel[8] = new ModelRendererTurbo(this, 1601, 73, this.textureX, this.textureY);
/* 3131 */     this.ammoModel[9] = new ModelRendererTurbo(this, 537, 73, this.textureX, this.textureY);
/* 3132 */     this.ammoModel[10] = new ModelRendererTurbo(this, 1649, 73, this.textureX, this.textureY);
/* 3133 */     this.ammoModel[11] = new ModelRendererTurbo(this, 1745, 73, this.textureX, this.textureY);
/* 3134 */     this.ammoModel[12] = new ModelRendererTurbo(this, 1761, 73, this.textureX, this.textureY);
/* 3135 */     this.ammoModel[13] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/* 3136 */     this.ammoModel[14] = new ModelRendererTurbo(this, 1497, 57, this.textureX, this.textureY);
/* 3137 */     this.ammoModel[15] = new ModelRendererTurbo(this, 649, 9, this.textureX, this.textureY);
/* 3138 */     this.ammoModel[16] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/* 3139 */     this.ammoModel[17] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/* 3140 */     this.ammoModel[18] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/* 3141 */     this.ammoModel[19] = new ModelRendererTurbo(this, 1529, 57, this.textureX, this.textureY);
/* 3142 */     this.ammoModel[20] = new ModelRendererTurbo(this, 689, 9, this.textureX, this.textureY);
/* 3143 */     this.ammoModel[21] = new ModelRendererTurbo(this, 1217, 9, this.textureX, this.textureY);
/* 3144 */     this.ammoModel[22] = new ModelRendererTurbo(this, 473, 81, this.textureX, this.textureY);
/* 3145 */     this.ammoModel[23] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/* 3146 */     this.ammoModel[24] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/* 3147 */     this.ammoModel[25] = new ModelRendererTurbo(this, 1553, 57, this.textureX, this.textureY);
/* 3148 */     this.ammoModel[26] = new ModelRendererTurbo(this, 721, 9, this.textureX, this.textureY);
/* 3149 */     this.ammoModel[27] = new ModelRendererTurbo(this, 1649, 49, this.textureX, this.textureY);
/* 3150 */     this.ammoModel[28] = new ModelRendererTurbo(this, 2041, 49, this.textureX, this.textureY);
/* 3151 */     this.ammoModel[29] = new ModelRendererTurbo(this, 1009, 73, this.textureX, this.textureY);
/* 3152 */     this.ammoModel[30] = new ModelRendererTurbo(this, 1681, 73, this.textureX, this.textureY);
/* 3153 */     this.ammoModel[31] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 3154 */     this.ammoModel[32] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/* 3155 */     this.ammoModel[33] = new ModelRendererTurbo(this, 801, 49, this.textureX, this.textureY);
/* 3156 */     this.ammoModel[34] = new ModelRendererTurbo(this, 521, 81, this.textureX, this.textureY);
/* 3157 */     this.ammoModel[35] = new ModelRendererTurbo(this, 561, 81, this.textureX, this.textureY);
/* 3158 */     this.ammoModel[36] = new ModelRendererTurbo(this, 577, 81, this.textureX, this.textureY);
/* 3159 */     this.ammoModel[37] = new ModelRendererTurbo(this, 1665, 57, this.textureX, this.textureY);
/* 3160 */     this.ammoModel[38] = new ModelRendererTurbo(this, 913, 9, this.textureX, this.textureY);
/* 3161 */     this.ammoModel[39] = new ModelRendererTurbo(this, 593, 81, this.textureX, this.textureY);
/* 3162 */     this.ammoModel[40] = new ModelRendererTurbo(this, 609, 81, this.textureX, this.textureY);
/* 3163 */     this.ammoModel[41] = new ModelRendererTurbo(this, 625, 81, this.textureX, this.textureY);
/* 3164 */     this.ammoModel[42] = new ModelRendererTurbo(this, 1985, 57, this.textureX, this.textureY);
/* 3165 */     this.ammoModel[43] = new ModelRendererTurbo(this, 945, 9, this.textureX, this.textureY);
/* 3166 */     this.ammoModel[44] = new ModelRendererTurbo(this, 1585, 57, this.textureX, this.textureY);
/* 3167 */     this.ammoModel[45] = new ModelRendererTurbo(this, 641, 81, this.textureX, this.textureY);
/* 3168 */     this.ammoModel[46] = new ModelRendererTurbo(this, 657, 81, this.textureX, this.textureY);
/* 3169 */     this.ammoModel[47] = new ModelRendererTurbo(this, 673, 81, this.textureX, this.textureY);
/* 3170 */     this.ammoModel[48] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/* 3171 */     this.ammoModel[49] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/* 3172 */     this.ammoModel[50] = new ModelRendererTurbo(this, 1673, 49, this.textureX, this.textureY);
/* 3173 */     this.ammoModel[51] = new ModelRendererTurbo(this, 761, 81, this.textureX, this.textureY);
/* 3174 */     this.ammoModel[52] = new ModelRendererTurbo(this, 769, 81, this.textureX, this.textureY);
/* 3175 */     this.ammoModel[53] = new ModelRendererTurbo(this, 777, 81, this.textureX, this.textureY);
/* 3176 */     this.ammoModel[54] = new ModelRendererTurbo(this, 1017, 57, this.textureX, this.textureY);
/* 3177 */     this.ammoModel[55] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/* 3178 */     this.ammoModel[56] = new ModelRendererTurbo(this, 1833, 49, this.textureX, this.textureY);
/* 3179 */     this.ammoModel[57] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/* 3180 */     this.ammoModel[58] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/* 3181 */     this.ammoModel[59] = new ModelRendererTurbo(this, 1385, 57, this.textureX, this.textureY);
/* 3182 */     this.ammoModel[60] = new ModelRendererTurbo(this, 1777, 57, this.textureX, this.textureY);
/* 3183 */     this.ammoModel[61] = new ModelRendererTurbo(this, 585, 65, this.textureX, this.textureY);
/* 3184 */     this.ammoModel[62] = new ModelRendererTurbo(this, 777, 65, this.textureX, this.textureY);
/* 3185 */     this.ammoModel[63] = new ModelRendererTurbo(this, 865, 65, this.textureX, this.textureY);
/* 3186 */     this.ammoModel[64] = new ModelRendererTurbo(this, 161, 65, this.textureX, this.textureY);
/* 3187 */     this.ammoModel[65] = new ModelRendererTurbo(this, 841, 81, this.textureX, this.textureY);
/*      */     
/* 3189 */     this.ammoModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 22, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3190 */     this.ammoModel[0].setRotationPoint(-12.0F, 9.5F, 2.0F);
/*      */     
/* 3192 */     this.ammoModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 22, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3193 */     this.ammoModel[1].setRotationPoint(-10.75F, 19.5F, 2.0F);
/*      */     
/* 3195 */     this.ammoModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 22, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3196 */     this.ammoModel[2].setRotationPoint(-8.5F, 29.5F, 2.0F);
/*      */     
/* 3198 */     this.ammoModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 22, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.0F, 1.5F, 0.0F, -1.0F, -7.0F, 0.0F, -1.0F, -7.0F, 0.0F, -3.0F, 1.5F, 0.0F);
/* 3199 */     this.ammoModel[3].setRotationPoint(-6.25F, 36.5F, 2.0F);
/*      */     
/* 3201 */     this.ammoModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 21, 10, 8, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3202 */     this.ammoModel[4].setRotationPoint(-12.0F, -0.5F, 2.0F);
/*      */     
/* 3204 */     this.ammoModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 20, 8, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3205 */     this.ammoModel[5].setRotationPoint(-12.5F, -8.5F, 2.0F);
/*      */     
/* 3207 */     this.ammoModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 4, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3208 */     this.ammoModel[6].setRotationPoint(-14.0F, 9.5F, 2.0F);
/*      */     
/* 3210 */     this.ammoModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 4, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3211 */     this.ammoModel[7].setRotationPoint(-12.75F, 19.5F, 2.0F);
/*      */     
/* 3213 */     this.ammoModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 4, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3214 */     this.ammoModel[8].setRotationPoint(-10.5F, 29.5F, 2.0F);
/*      */     
/* 3216 */     this.ammoModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 3, 10, 8, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3217 */     this.ammoModel[9].setRotationPoint(-14.0F, -0.5F, 2.0F);
/*      */     
/* 3219 */     this.ammoModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 4, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -3.0F, 1.0F, 0.0F);
/* 3220 */     this.ammoModel[10].setRotationPoint(-8.0F, 36.5F, 2.0F);
/*      */     
/* 3222 */     this.ammoModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3223 */     this.ammoModel[11].setRotationPoint(5.25F, 19.5F, 1.0F);
/*      */     
/* 3225 */     this.ammoModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3226 */     this.ammoModel[12].setRotationPoint(2.75F, 9.5F, 1.0F);
/*      */     
/* 3228 */     this.ammoModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3229 */     this.ammoModel[13].setRotationPoint(1.75F, -0.5F, 1.0F);
/*      */     
/* 3231 */     this.ammoModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3232 */     this.ammoModel[14].setRotationPoint(7.75F, 29.5F, 1.0F);
/*      */     
/* 3234 */     this.ammoModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.15F, 0.0F);
/* 3235 */     this.ammoModel[15].setRotationPoint(10.25F, 36.5F, 1.0F);
/*      */     
/* 3237 */     this.ammoModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3238 */     this.ammoModel[16].setRotationPoint(-2.0F, 19.5F, 1.0F);
/*      */     
/* 3240 */     this.ammoModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3241 */     this.ammoModel[17].setRotationPoint(-4.5F, 9.5F, 1.0F);
/*      */     
/* 3243 */     this.ammoModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3244 */     this.ammoModel[18].setRotationPoint(-5.5F, -0.5F, 1.0F);
/*      */     
/* 3246 */     this.ammoModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3247 */     this.ammoModel[19].setRotationPoint(0.5F, 29.5F, 1.0F);
/*      */     
/* 3249 */     this.ammoModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, 0.35F, 0.0F);
/* 3250 */     this.ammoModel[20].setRotationPoint(5.0F, 39.0F, 1.0F);
/*      */     
/* 3252 */     this.ammoModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3253 */     this.ammoModel[21].setRotationPoint(3.0F, 36.5F, 1.0F);
/*      */     
/* 3255 */     this.ammoModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3256 */     this.ammoModel[22].setRotationPoint(-7.75F, 19.5F, 1.0F);
/*      */     
/* 3258 */     this.ammoModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3259 */     this.ammoModel[23].setRotationPoint(-10.25F, 9.5F, 1.0F);
/*      */     
/* 3261 */     this.ammoModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3262 */     this.ammoModel[24].setRotationPoint(-11.25F, -0.5F, 1.0F);
/*      */     
/* 3264 */     this.ammoModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 5, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3265 */     this.ammoModel[25].setRotationPoint(-5.25F, 29.5F, 1.0F);
/*      */     
/* 3267 */     this.ammoModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.75F, 1.0F, 0.0F);
/* 3268 */     this.ammoModel[26].setRotationPoint(-0.25F, 41.0F, 1.0F);
/*      */     
/* 3270 */     this.ammoModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 5, 4, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3271 */     this.ammoModel[27].setRotationPoint(-2.75F, 36.5F, 1.0F);
/*      */     
/* 3273 */     this.ammoModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3274 */     this.ammoModel[28].setRotationPoint(-10.0F, 19.5F, 1.0F);
/*      */     
/* 3276 */     this.ammoModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3277 */     this.ammoModel[29].setRotationPoint(-12.5F, 9.5F, 1.0F);
/*      */     
/* 3279 */     this.ammoModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3280 */     this.ammoModel[30].setRotationPoint(-13.5F, -0.5F, 1.0F);
/*      */     
/* 3282 */     this.ammoModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 2, 7, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3283 */     this.ammoModel[31].setRotationPoint(-7.5F, 29.5F, 1.0F);
/*      */     
/* 3285 */     this.ammoModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 3286 */     this.ammoModel[32].setRotationPoint(-2.5F, 43.0F, 1.0F);
/*      */     
/* 3288 */     this.ammoModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 2, 6, 1, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 3289 */     this.ammoModel[33].setRotationPoint(-5.0F, 36.5F, 1.0F);
/*      */     
/* 3291 */     this.ammoModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3292 */     this.ammoModel[34].setRotationPoint(5.25F, 19.5F, 10.0F);
/*      */     
/* 3294 */     this.ammoModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3295 */     this.ammoModel[35].setRotationPoint(2.75F, 9.5F, 10.0F);
/*      */     
/* 3297 */     this.ammoModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3298 */     this.ammoModel[36].setRotationPoint(1.75F, -0.5F, 10.0F);
/*      */     
/* 3300 */     this.ammoModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3301 */     this.ammoModel[37].setRotationPoint(7.75F, 29.5F, 10.0F);
/*      */     
/* 3303 */     this.ammoModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.15F, 0.0F);
/* 3304 */     this.ammoModel[38].setRotationPoint(10.25F, 36.5F, 10.0F);
/*      */     
/* 3306 */     this.ammoModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3307 */     this.ammoModel[39].setRotationPoint(-2.0F, 19.5F, 10.0F);
/*      */     
/* 3309 */     this.ammoModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3310 */     this.ammoModel[40].setRotationPoint(-4.5F, 9.5F, 10.0F);
/*      */     
/* 3312 */     this.ammoModel[41].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3313 */     this.ammoModel[41].setRotationPoint(-5.5F, -0.5F, 10.0F);
/*      */     
/* 3315 */     this.ammoModel[42].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3316 */     this.ammoModel[42].setRotationPoint(0.5F, 29.5F, 10.0F);
/*      */     
/* 3318 */     this.ammoModel[43].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, 0.35F, 0.0F);
/* 3319 */     this.ammoModel[43].setRotationPoint(5.0F, 39.0F, 10.0F);
/*      */     
/* 3321 */     this.ammoModel[44].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3322 */     this.ammoModel[44].setRotationPoint(3.0F, 36.5F, 10.0F);
/*      */     
/* 3324 */     this.ammoModel[45].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3325 */     this.ammoModel[45].setRotationPoint(-7.75F, 19.5F, 10.0F);
/*      */     
/* 3327 */     this.ammoModel[46].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3328 */     this.ammoModel[46].setRotationPoint(-10.25F, 9.5F, 10.0F);
/*      */     
/* 3330 */     this.ammoModel[47].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3331 */     this.ammoModel[47].setRotationPoint(-11.25F, -0.5F, 10.0F);
/*      */     
/* 3333 */     this.ammoModel[48].addShapeBox(40.0F, -11.0F, -6.0F, 5, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3334 */     this.ammoModel[48].setRotationPoint(-5.25F, 29.5F, 10.0F);
/*      */     
/* 3336 */     this.ammoModel[49].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.75F, 1.0F, 0.0F);
/* 3337 */     this.ammoModel[49].setRotationPoint(-0.25F, 41.0F, 10.0F);
/*      */     
/* 3339 */     this.ammoModel[50].addShapeBox(40.0F, -11.0F, -6.0F, 5, 4, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3340 */     this.ammoModel[50].setRotationPoint(-2.75F, 36.5F, 10.0F);
/*      */     
/* 3342 */     this.ammoModel[51].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3343 */     this.ammoModel[51].setRotationPoint(-10.0F, 19.5F, 10.0F);
/*      */     
/* 3345 */     this.ammoModel[52].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3346 */     this.ammoModel[52].setRotationPoint(-12.5F, 9.5F, 10.0F);
/*      */     
/* 3348 */     this.ammoModel[53].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3349 */     this.ammoModel[53].setRotationPoint(-13.5F, -0.5F, 10.0F);
/*      */     
/* 3351 */     this.ammoModel[54].addShapeBox(40.0F, -11.0F, -6.0F, 2, 7, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3352 */     this.ammoModel[54].setRotationPoint(-7.5F, 29.5F, 10.0F);
/*      */     
/* 3354 */     this.ammoModel[55].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 3355 */     this.ammoModel[55].setRotationPoint(-2.5F, 43.0F, 10.0F);
/*      */     
/* 3357 */     this.ammoModel[56].addShapeBox(40.0F, -11.0F, -6.0F, 2, 6, 1, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 3358 */     this.ammoModel[56].setRotationPoint(-5.0F, 36.5F, 10.0F);
/*      */     
/* 3360 */     this.ammoModel[57].addShapeBox(40.0F, -11.0F, -6.0F, 6, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3361 */     this.ammoModel[57].setRotationPoint(1.75F, -8.5F, 10.0F);
/*      */     
/* 3363 */     this.ammoModel[58].addShapeBox(40.0F, -11.0F, -6.0F, 5, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3364 */     this.ammoModel[58].setRotationPoint(-4.5F, -8.5F, 10.0F);
/*      */     
/* 3366 */     this.ammoModel[59].addShapeBox(40.0F, -11.0F, -6.0F, 4, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3367 */     this.ammoModel[59].setRotationPoint(-10.25F, -8.5F, 10.0F);
/*      */     
/* 3369 */     this.ammoModel[60].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3370 */     this.ammoModel[60].setRotationPoint(-12.5F, -8.5F, 10.0F);
/*      */     
/* 3372 */     this.ammoModel[61].addShapeBox(40.0F, -11.0F, -6.0F, 6, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3373 */     this.ammoModel[61].setRotationPoint(1.75F, -8.5F, 1.0F);
/*      */     
/* 3375 */     this.ammoModel[62].addShapeBox(40.0F, -11.0F, -6.0F, 5, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3376 */     this.ammoModel[62].setRotationPoint(-4.5F, -8.5F, 1.0F);
/*      */     
/* 3378 */     this.ammoModel[63].addShapeBox(40.0F, -11.0F, -6.0F, 4, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3379 */     this.ammoModel[63].setRotationPoint(-10.25F, -8.5F, 1.0F);
/*      */     
/* 3381 */     this.ammoModel[64].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3382 */     this.ammoModel[64].setRotationPoint(-12.5F, -8.5F, 1.0F);
/*      */     
/* 3384 */     this.ammoModel[65].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3385 */     this.ammoModel[65].setRotationPoint(-14.75F, -8.5F, 2.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 3390 */     this.slideModel[0] = new ModelRendererTurbo(this, 1633, 97, this.textureX, this.textureY);
/* 3391 */     this.slideModel[1] = new ModelRendererTurbo(this, 1705, 97, this.textureX, this.textureY);
/* 3392 */     this.slideModel[2] = new ModelRendererTurbo(this, 1793, 97, this.textureX, this.textureY);
/* 3393 */     this.slideModel[3] = new ModelRendererTurbo(this, 1833, 97, this.textureX, this.textureY);
/* 3394 */     this.slideModel[4] = new ModelRendererTurbo(this, 1849, 97, this.textureX, this.textureY);
/* 3395 */     this.slideModel[5] = new ModelRendererTurbo(this, 1865, 97, this.textureX, this.textureY);
/* 3396 */     this.slideModel[6] = new ModelRendererTurbo(this, 1897, 97, this.textureX, this.textureY);
/* 3397 */     this.slideModel[7] = new ModelRendererTurbo(this, 1913, 97, this.textureX, this.textureY);
/* 3398 */     this.slideModel[8] = new ModelRendererTurbo(this, 1929, 97, this.textureX, this.textureY);
/* 3399 */     this.slideModel[9] = new ModelRendererTurbo(this, 1945, 97, this.textureX, this.textureY);
/* 3400 */     this.slideModel[10] = new ModelRendererTurbo(this, 1985, 97, this.textureX, this.textureY);
/* 3401 */     this.slideModel[11] = new ModelRendererTurbo(this, 2033, 97, this.textureX, this.textureY);
/* 3402 */     this.slideModel[12] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/* 3403 */     this.slideModel[13] = new ModelRendererTurbo(this, 17, 105, this.textureX, this.textureY);
/* 3404 */     this.slideModel[14] = new ModelRendererTurbo(this, 65, 105, this.textureX, this.textureY);
/* 3405 */     this.slideModel[15] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/* 3406 */     this.slideModel[16] = new ModelRendererTurbo(this, 97, 105, this.textureX, this.textureY);
/* 3407 */     this.slideModel[17] = new ModelRendererTurbo(this, 113, 105, this.textureX, this.textureY);
/* 3408 */     this.slideModel[18] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/* 3409 */     this.slideModel[19] = new ModelRendererTurbo(this, 145, 105, this.textureX, this.textureY);
/* 3410 */     this.slideModel[20] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/* 3411 */     this.slideModel[21] = new ModelRendererTurbo(this, 177, 105, this.textureX, this.textureY);
/* 3412 */     this.slideModel[22] = new ModelRendererTurbo(this, 209, 105, this.textureX, this.textureY);
/* 3413 */     this.slideModel[23] = new ModelRendererTurbo(this, 265, 105, this.textureX, this.textureY);
/* 3414 */     this.slideModel[24] = new ModelRendererTurbo(this, 289, 105, this.textureX, this.textureY);
/* 3415 */     this.slideModel[25] = new ModelRendererTurbo(this, 1889, 49, this.textureX, this.textureY);
/* 3416 */     this.slideModel[26] = new ModelRendererTurbo(this, 1929, 49, this.textureX, this.textureY);
/* 3417 */     this.slideModel[27] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/* 3418 */     this.slideModel[28] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/* 3419 */     this.slideModel[29] = new ModelRendererTurbo(this, 1473, 57, this.textureX, this.textureY);
/* 3420 */     this.slideModel[30] = new ModelRendererTurbo(this, 1785, 57, this.textureX, this.textureY);
/* 3421 */     this.slideModel[31] = new ModelRendererTurbo(this, 513, 65, this.textureX, this.textureY);
/* 3422 */     this.slideModel[32] = new ModelRendererTurbo(this, 729, 65, this.textureX, this.textureY);
/* 3423 */     this.slideModel[33] = new ModelRendererTurbo(this, 921, 65, this.textureX, this.textureY);
/* 3424 */     this.slideModel[34] = new ModelRendererTurbo(this, 953, 65, this.textureX, this.textureY);
/* 3425 */     this.slideModel[35] = new ModelRendererTurbo(this, 1089, 65, this.textureX, this.textureY);
/* 3426 */     this.slideModel[36] = new ModelRendererTurbo(this, 1121, 65, this.textureX, this.textureY);
/* 3427 */     this.slideModel[37] = new ModelRendererTurbo(this, 225, 105, this.textureX, this.textureY);
/* 3428 */     this.slideModel[38] = new ModelRendererTurbo(this, 305, 105, this.textureX, this.textureY);
/* 3429 */     this.slideModel[39] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/* 3430 */     this.slideModel[40] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/*      */     
/* 3432 */     this.slideModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 26, 8, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3433 */     this.slideModel[0].setRotationPoint(-18.5F, -27.0F, 0.75F);
/*      */     
/* 3435 */     this.slideModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 10, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3436 */     this.slideModel[1].setRotationPoint(-11.0F, -26.75F, 0.5F);
/*      */     
/* 3438 */     this.slideModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 10, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3439 */     this.slideModel[2].setRotationPoint(-11.0F, -22.75F, 0.5F);
/*      */     
/* 3441 */     this.slideModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3442 */     this.slideModel[3].setRotationPoint(-11.0F, -25.75F, 0.5F);
/*      */     
/* 3444 */     this.slideModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3445 */     this.slideModel[4].setRotationPoint(-2.0F, -25.75F, 0.5F);
/*      */     
/* 3447 */     this.slideModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 6, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3448 */     this.slideModel[5].setRotationPoint(-10.0F, -25.75F, 0.5F);
/*      */     
/* 3450 */     this.slideModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3451 */     this.slideModel[6].setRotationPoint(-10.0F, -25.75F, 0.5F);
/*      */     
/* 3453 */     this.slideModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 3454 */     this.slideModel[7].setRotationPoint(-3.0F, -25.75F, 0.5F);
/*      */     
/* 3456 */     this.slideModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3457 */     this.slideModel[8].setRotationPoint(-10.0F, -23.75F, 0.5F);
/*      */     
/* 3459 */     this.slideModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3460 */     this.slideModel[9].setRotationPoint(-3.0F, -23.75F, 0.5F);
/*      */     
/* 3462 */     this.slideModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3463 */     this.slideModel[10].setRotationPoint(-8.0F, -25.25F, 0.5F);
/*      */     
/* 3465 */     this.slideModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3466 */     this.slideModel[11].setRotationPoint(-7.0F, -25.25F, 0.5F);
/*      */     
/* 3468 */     this.slideModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 3469 */     this.slideModel[12].setRotationPoint(-7.5F, -25.25F, 0.5F);
/*      */     
/* 3471 */     this.slideModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3472 */     this.slideModel[13].setRotationPoint(-6.0F, -25.25F, 0.5F);
/*      */     
/* 3474 */     this.slideModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 3475 */     this.slideModel[14].setRotationPoint(-5.5F, -24.25F, 0.5F);
/*      */     
/* 3477 */     this.slideModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3478 */     this.slideModel[15].setRotationPoint(-5.5F, -25.25F, 0.5F);
/*      */     
/* 3480 */     this.slideModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3481 */     this.slideModel[16].setRotationPoint(-19.0F, -27.0F, 0.25F);
/*      */     
/* 3483 */     this.slideModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3484 */     this.slideModel[17].setRotationPoint(-19.0F, -22.5F, 0.25F);
/*      */     
/* 3486 */     this.slideModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 3487 */     this.slideModel[18].setRotationPoint(-19.0F, -26.0F, 0.25F);
/*      */     
/* 3489 */     this.slideModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3490 */     this.slideModel[19].setRotationPoint(6.5F, -27.0F, 0.25F);
/*      */     
/* 3492 */     this.slideModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3493 */     this.slideModel[20].setRotationPoint(6.5F, -22.5F, 0.25F);
/*      */     
/* 3495 */     this.slideModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 3496 */     this.slideModel[21].setRotationPoint(6.5F, -26.0F, 0.25F);
/*      */     
/* 3498 */     this.slideModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 3499 */     this.slideModel[22].setRotationPoint(-18.5F, -24.25F, 1.0F);
/*      */     
/* 3501 */     this.slideModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 3502 */     this.slideModel[23].setRotationPoint(-18.5F, -23.25F, 1.0F);
/*      */     
/* 3504 */     this.slideModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 3505 */     this.slideModel[24].setRotationPoint(-18.5F, -23.75F, 1.0F);
/*      */     
/* 3507 */     this.slideModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3508 */     this.slideModel[25].setRotationPoint(-18.0F, -23.85F, 1.25F);
/*      */     
/* 3510 */     this.slideModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3511 */     this.slideModel[26].setRotationPoint(-18.0F, -22.85F, 1.25F);
/*      */     
/* 3513 */     this.slideModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3514 */     this.slideModel[27].setRotationPoint(-18.0F, -24.6F, 1.25F);
/*      */     
/* 3516 */     this.slideModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3517 */     this.slideModel[28].setRotationPoint(-16.0F, -23.85F, 1.25F);
/*      */     
/* 3519 */     this.slideModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3520 */     this.slideModel[29].setRotationPoint(-16.0F, -22.85F, 1.25F);
/*      */     
/* 3522 */     this.slideModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3523 */     this.slideModel[30].setRotationPoint(-16.0F, -24.6F, 1.25F);
/*      */     
/* 3525 */     this.slideModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3526 */     this.slideModel[31].setRotationPoint(-14.0F, -23.85F, 1.25F);
/*      */     
/* 3528 */     this.slideModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3529 */     this.slideModel[32].setRotationPoint(-14.0F, -22.85F, 1.25F);
/*      */     
/* 3531 */     this.slideModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3532 */     this.slideModel[33].setRotationPoint(-14.0F, -24.6F, 1.25F);
/*      */     
/* 3534 */     this.slideModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3535 */     this.slideModel[34].setRotationPoint(-12.0F, -23.85F, 1.25F);
/*      */     
/* 3537 */     this.slideModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3538 */     this.slideModel[35].setRotationPoint(-12.0F, -22.85F, 1.25F);
/*      */     
/* 3540 */     this.slideModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3541 */     this.slideModel[36].setRotationPoint(-12.0F, -24.6F, 1.25F);
/*      */     
/* 3543 */     this.slideModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3544 */     this.slideModel[37].setRotationPoint(-1.0F, -25.75F, 0.75F);
/*      */     
/* 3546 */     this.slideModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3547 */     this.slideModel[38].setRotationPoint(-1.0F, -22.75F, 0.75F);
/*      */     
/* 3549 */     this.slideModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3550 */     this.slideModel[39].setRotationPoint(-1.0F, -27.0F, 0.75F);
/*      */     
/* 3552 */     this.slideModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 6, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3553 */     this.slideModel[40].setRotationPoint(-1.0F, -26.75F, 0.75F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelhk416c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */