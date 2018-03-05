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
/*      */ public class Modelhk416
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelhk416()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['˾'];
/*   22 */     this.defaultBarrelModel = new ModelRendererTurbo[15];
/*   23 */     this.defaultScopeModel = new ModelRendererTurbo[77];
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
/*      */ 
/*   35 */     this.barrelAttachPoint = new Vector3f(8.625F, 1.5625F, 0.375F);
/*      */     
/*   37 */     this.stockAttachPoint = new Vector3f(4.125F, 1.5F, -0.25F);
/*      */     
/*   39 */     this.scopeAttachPoint = new Vector3f(0.9375F, 3.75F, 0.0F);
/*      */     
/*   41 */     this.gripAttachPoint = new Vector3f(6.25F, 2.5F, 0.0F);
/*      */     
/*      */ 
/*   44 */     translateAll(0.0F, -13.0F, 0.0F);
/*   45 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.06F, 0.0F);
/*      */     
/*   47 */     this.gunSlideDistance = 1.5F;
/*   48 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   51 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   56 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[1] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[2] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[3] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[4] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[5] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[6] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[7] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[8] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[9] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[10] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[11] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[12] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[13] = new ModelRendererTurbo(this, 649, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[14] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[15] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[16] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[17] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[18] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[19] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[20] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[21] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[22] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[23] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[24] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[25] = new ModelRendererTurbo(this, 1065, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[26] = new ModelRendererTurbo(this, 1097, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[27] = new ModelRendererTurbo(this, 1137, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[28] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/*   85 */     this.gunModel[29] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*   86 */     this.gunModel[30] = new ModelRendererTurbo(this, 1361, 1, this.textureX, this.textureY);
/*   87 */     this.gunModel[31] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*   88 */     this.gunModel[32] = new ModelRendererTurbo(this, 1433, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[33] = new ModelRendererTurbo(this, 1569, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[34] = new ModelRendererTurbo(this, 1705, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[35] = new ModelRendererTurbo(this, 1833, 1, this.textureX, this.textureY);
/*   92 */     this.gunModel[36] = new ModelRendererTurbo(this, 1425, 9, this.textureX, this.textureY);
/*   93 */     this.gunModel[37] = new ModelRendererTurbo(this, 1953, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[38] = new ModelRendererTurbo(this, 1993, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[39] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[40] = new ModelRendererTurbo(this, 1977, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[41] = new ModelRendererTurbo(this, 1521, 9, this.textureX, this.textureY);
/*   98 */     this.gunModel[42] = new ModelRendererTurbo(this, 1649, 9, this.textureX, this.textureY);
/*   99 */     this.gunModel[43] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*  100 */     this.gunModel[44] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  101 */     this.gunModel[45] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[46] = new ModelRendererTurbo(this, 457, 17, this.textureX, this.textureY);
/*  103 */     this.gunModel[47] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[48] = new ModelRendererTurbo(this, 665, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[49] = new ModelRendererTurbo(this, 777, 17, this.textureX, this.textureY);
/*  106 */     this.gunModel[50] = new ModelRendererTurbo(this, 1777, 17, this.textureX, this.textureY);
/*  107 */     this.gunModel[51] = new ModelRendererTurbo(this, 905, 25, this.textureX, this.textureY);
/*  108 */     this.gunModel[52] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  109 */     this.gunModel[53] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  110 */     this.gunModel[54] = new ModelRendererTurbo(this, 1073, 25, this.textureX, this.textureY);
/*  111 */     this.gunModel[55] = new ModelRendererTurbo(this, 1249, 25, this.textureX, this.textureY);
/*  112 */     this.gunModel[56] = new ModelRendererTurbo(this, 1417, 25, this.textureX, this.textureY);
/*  113 */     this.gunModel[57] = new ModelRendererTurbo(this, 1769, 9, this.textureX, this.textureY);
/*  114 */     this.gunModel[58] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[59] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  116 */     this.gunModel[60] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  117 */     this.gunModel[61] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  118 */     this.gunModel[62] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*  119 */     this.gunModel[63] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  120 */     this.gunModel[64] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
/*  121 */     this.gunModel[65] = new ModelRendererTurbo(this, 897, 17, this.textureX, this.textureY);
/*  122 */     this.gunModel[66] = new ModelRendererTurbo(this, 985, 17, this.textureX, this.textureY);
/*  123 */     this.gunModel[67] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
/*  124 */     this.gunModel[68] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
/*  125 */     this.gunModel[69] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*  126 */     this.gunModel[70] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*  127 */     this.gunModel[71] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[72] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*  129 */     this.gunModel[73] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[74] = new ModelRendererTurbo(this, 633, 1, this.textureX, this.textureY);
/*  131 */     this.gunModel[75] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*  132 */     this.gunModel[76] = new ModelRendererTurbo(this, 705, 1, this.textureX, this.textureY);
/*  133 */     this.gunModel[77] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[78] = new ModelRendererTurbo(this, 777, 1, this.textureX, this.textureY);
/*  135 */     this.gunModel[79] = new ModelRendererTurbo(this, 809, 1, this.textureX, this.textureY);
/*  136 */     this.gunModel[80] = new ModelRendererTurbo(this, 1121, 1, this.textureX, this.textureY);
/*  137 */     this.gunModel[81] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  138 */     this.gunModel[82] = new ModelRendererTurbo(this, 1033, 17, this.textureX, this.textureY);
/*  139 */     this.gunModel[83] = new ModelRendererTurbo(this, 1065, 17, this.textureX, this.textureY);
/*  140 */     this.gunModel[84] = new ModelRendererTurbo(this, 1137, 17, this.textureX, this.textureY);
/*  141 */     this.gunModel[85] = new ModelRendererTurbo(this, 1169, 17, this.textureX, this.textureY);
/*  142 */     this.gunModel[86] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
/*  143 */     this.gunModel[87] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[88] = new ModelRendererTurbo(this, 841, 1, this.textureX, this.textureY);
/*  145 */     this.gunModel[89] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
/*  146 */     this.gunModel[90] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
/*  147 */     this.gunModel[91] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*  148 */     this.gunModel[92] = new ModelRendererTurbo(this, 1593, 25, this.textureX, this.textureY);
/*  149 */     this.gunModel[93] = new ModelRendererTurbo(this, 1289, 17, this.textureX, this.textureY);
/*  150 */     this.gunModel[94] = new ModelRendererTurbo(this, 1321, 17, this.textureX, this.textureY);
/*  151 */     this.gunModel[95] = new ModelRendererTurbo(this, 1353, 17, this.textureX, this.textureY);
/*  152 */     this.gunModel[96] = new ModelRendererTurbo(this, 969, 1, this.textureX, this.textureY);
/*  153 */     this.gunModel[97] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
/*  154 */     this.gunModel[98] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  155 */     this.gunModel[99] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[100] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[101] = new ModelRendererTurbo(this, 1025, 1, this.textureX, this.textureY);
/*  158 */     this.gunModel[102] = new ModelRendererTurbo(this, 1049, 1, this.textureX, this.textureY);
/*  159 */     this.gunModel[103] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/*  160 */     this.gunModel[104] = new ModelRendererTurbo(this, 1761, 25, this.textureX, this.textureY);
/*  161 */     this.gunModel[105] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  162 */     this.gunModel[106] = new ModelRendererTurbo(this, 545, 33, this.textureX, this.textureY);
/*  163 */     this.gunModel[107] = new ModelRendererTurbo(this, 713, 33, this.textureX, this.textureY);
/*  164 */     this.gunModel[108] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
/*  165 */     this.gunModel[109] = new ModelRendererTurbo(this, 1601, 33, this.textureX, this.textureY);
/*  166 */     this.gunModel[110] = new ModelRendererTurbo(this, 1769, 33, this.textureX, this.textureY);
/*  167 */     this.gunModel[111] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/*  168 */     this.gunModel[112] = new ModelRendererTurbo(this, 529, 41, this.textureX, this.textureY);
/*  169 */     this.gunModel[113] = new ModelRendererTurbo(this, 1049, 41, this.textureX, this.textureY);
/*  170 */     this.gunModel[114] = new ModelRendererTurbo(this, 1993, 17, this.textureX, this.textureY);
/*  171 */     this.gunModel[115] = new ModelRendererTurbo(this, 73, 25, this.textureX, this.textureY);
/*  172 */     this.gunModel[116] = new ModelRendererTurbo(this, 1089, 1, this.textureX, this.textureY);
/*  173 */     this.gunModel[117] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*  174 */     this.gunModel[118] = new ModelRendererTurbo(this, 841, 9, this.textureX, this.textureY);
/*  175 */     this.gunModel[119] = new ModelRendererTurbo(this, 1513, 9, this.textureX, this.textureY);
/*  176 */     this.gunModel[120] = new ModelRendererTurbo(this, 1201, 17, this.textureX, this.textureY);
/*  177 */     this.gunModel[121] = new ModelRendererTurbo(this, 1065, 1, this.textureX, this.textureY);
/*  178 */     this.gunModel[122] = new ModelRendererTurbo(this, 1217, 1, this.textureX, this.textureY);
/*  179 */     this.gunModel[123] = new ModelRendererTurbo(this, 1385, 17, this.textureX, this.textureY);
/*  180 */     this.gunModel[124] = new ModelRendererTurbo(this, 1937, 25, this.textureX, this.textureY);
/*  181 */     this.gunModel[125] = new ModelRendererTurbo(this, 1969, 25, this.textureX, this.textureY);
/*  182 */     this.gunModel[126] = new ModelRendererTurbo(this, 2001, 25, this.textureX, this.textureY);
/*  183 */     this.gunModel[127] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 1209, 41, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 873, 9, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 1953, 1, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 1961, 1, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 1977, 1, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 1993, 1, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 2017, 1, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 2041, 1, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 1137, 9, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 1817, 9, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 9, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 185, 9, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 1945, 17, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 1241, 25, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 1393, 41, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 1569, 41, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 2033, 25, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  211 */     this.gunModel[''] = new ModelRendererTurbo(this, 1937, 33, this.textureX, this.textureY);
/*  212 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  213 */     this.gunModel[''] = new ModelRendererTurbo(this, 1049, 33, this.textureX, this.textureY);
/*  214 */     this.gunModel[''] = new ModelRendererTurbo(this, 1985, 33, this.textureX, this.textureY);
/*  215 */     this.gunModel[''] = new ModelRendererTurbo(this, 2009, 33, this.textureX, this.textureY);
/*  216 */     this.gunModel[' '] = new ModelRendererTurbo(this, 2033, 33, this.textureX, this.textureY);
/*  217 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  218 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 697, 41, this.textureX, this.textureY);
/*  219 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1385, 41, this.textureX, this.textureY);
/*  220 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 1569, 41, this.textureX, this.textureY);
/*  221 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1745, 41, this.textureX, this.textureY);
/*  222 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 1937, 41, this.textureX, this.textureY);
/*  223 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1985, 41, this.textureX, this.textureY);
/*  224 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 2009, 41, this.textureX, this.textureY);
/*  225 */     this.gunModel['©'] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/*  226 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 2033, 41, this.textureX, this.textureY);
/*  227 */     this.gunModel['«'] = new ModelRendererTurbo(this, 401, 9, this.textureX, this.textureY);
/*  228 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 529, 49, this.textureX, this.textureY);
/*  229 */     this.gunModel['­'] = new ModelRendererTurbo(this, 561, 49, this.textureX, this.textureY);
/*  230 */     this.gunModel['®'] = new ModelRendererTurbo(this, 593, 49, this.textureX, this.textureY);
/*  231 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 657, 25, this.textureX, this.textureY);
/*  232 */     this.gunModel['°'] = new ModelRendererTurbo(this, 1417, 25, this.textureX, this.textureY);
/*  233 */     this.gunModel['±'] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*  234 */     this.gunModel['²'] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  235 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1593, 33, this.textureX, this.textureY);
/*  236 */     this.gunModel['´'] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*  237 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
/*  238 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 425, 9, this.textureX, this.textureY);
/*  239 */     this.gunModel['·'] = new ModelRendererTurbo(this, 433, 9, this.textureX, this.textureY);
/*  240 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 441, 9, this.textureX, this.textureY);
/*  241 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*  242 */     this.gunModel['º'] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  243 */     this.gunModel['»'] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*  244 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 625, 49, this.textureX, this.textureY);
/*  245 */     this.gunModel['½'] = new ModelRendererTurbo(this, 657, 49, this.textureX, this.textureY);
/*  246 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 689, 49, this.textureX, this.textureY);
/*  247 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 721, 49, this.textureX, this.textureY);
/*  248 */     this.gunModel['À'] = new ModelRendererTurbo(this, 745, 49, this.textureX, this.textureY);
/*  249 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 769, 49, this.textureX, this.textureY);
/*  250 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 785, 49, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 801, 49, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 817, 49, this.textureX, this.textureY);
/*  253 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 833, 49, this.textureX, this.textureY);
/*  254 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 849, 49, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 865, 49, this.textureX, this.textureY);
/*  256 */     this.gunModel['È'] = new ModelRendererTurbo(this, 881, 49, this.textureX, this.textureY);
/*  257 */     this.gunModel['É'] = new ModelRendererTurbo(this, 897, 49, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 913, 49, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 929, 49, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 977, 49, this.textureX, this.textureY);
/*  261 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 1025, 49, this.textureX, this.textureY);
/*  262 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 1041, 49, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 1057, 49, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 1073, 49, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 1089, 49, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 1105, 49, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 1121, 49, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 1137, 49, this.textureX, this.textureY);
/*  269 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 1153, 49, this.textureX, this.textureY);
/*  270 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 1761, 49, this.textureX, this.textureY);
/*  271 */     this.gunModel['×'] = new ModelRendererTurbo(this, 1809, 49, this.textureX, this.textureY);
/*  272 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 353, 57, this.textureX, this.textureY);
/*  273 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1185, 49, this.textureX, this.textureY);
/*  274 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 1969, 49, this.textureX, this.textureY);
/*  275 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 1993, 49, this.textureX, this.textureY);
/*  276 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 105, 9, this.textureX, this.textureY);
/*  277 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*  278 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 2009, 49, this.textureX, this.textureY);
/*  279 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 529, 9, this.textureX, this.textureY);
/*  280 */     this.gunModel['à'] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  281 */     this.gunModel['á'] = new ModelRendererTurbo(this, 561, 9, this.textureX, this.textureY);
/*  282 */     this.gunModel['â'] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
/*  283 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 905, 9, this.textureX, this.textureY);
/*  284 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 1649, 9, this.textureX, this.textureY);
/*  285 */     this.gunModel['å'] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*  286 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/*  287 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 593, 9, this.textureX, this.textureY);
/*  288 */     this.gunModel['è'] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/*  289 */     this.gunModel['é'] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/*  290 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 521, 57, this.textureX, this.textureY);
/*  291 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/*  292 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/*  293 */     this.gunModel['í'] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/*  294 */     this.gunModel['î'] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/*  295 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 737, 57, this.textureX, this.textureY);
/*  296 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 753, 57, this.textureX, this.textureY);
/*  297 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 953, 57, this.textureX, this.textureY);
/*  298 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*  299 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*  300 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  301 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*  302 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 1009, 57, this.textureX, this.textureY);
/*  303 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 1057, 57, this.textureX, this.textureY);
/*  304 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 1097, 57, this.textureX, this.textureY);
/*  305 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1217, 57, this.textureX, this.textureY);
/*  306 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*  307 */     this.gunModel['û'] = new ModelRendererTurbo(this, 1265, 57, this.textureX, this.textureY);
/*  308 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 1145, 57, this.textureX, this.textureY);
/*  309 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  310 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 1313, 57, this.textureX, this.textureY);
/*  311 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 1361, 57, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  313 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 1409, 57, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 1449, 57, this.textureX, this.textureY);
/*  315 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 1001, 57, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 1481, 57, this.textureX, this.textureY);
/*  317 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 1409, 17, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 1505, 57, this.textureX, this.textureY);
/*  319 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 1793, 49, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 1537, 57, this.textureX, this.textureY);
/*  321 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 1561, 1, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 1697, 1, this.textureX, this.textureY);
/*  323 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  324 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 1161, 17, this.textureX, this.textureY);
/*  325 */     this.gunModel['č'] = new ModelRendererTurbo(this, 1561, 57, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 1585, 57, this.textureX, this.textureY);
/*  327 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 1609, 57, this.textureX, this.textureY);
/*  328 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 1633, 57, this.textureX, this.textureY);
/*  329 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 1657, 57, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*  331 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 545, 9, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 649, 1, this.textureX, this.textureY);
/*  333 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 577, 9, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 609, 9, this.textureX, this.textureY);
/*  335 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 1681, 57, this.textureX, this.textureY);
/*  337 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 633, 9, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 649, 9, this.textureX, this.textureY);
/*  339 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 673, 9, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 521, 73, this.textureX, this.textureY);
/*  341 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 1625, 65, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/*  343 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 1409, 65, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 1953, 57, this.textureX, this.textureY);
/*  345 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/*  346 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1225, 65, this.textureX, this.textureY);
/*  347 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 1177, 65, this.textureX, this.textureY);
/*  348 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 1201, 65, this.textureX, this.textureY);
/*  349 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 1537, 65, this.textureX, this.textureY);
/*  350 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 1265, 65, this.textureX, this.textureY);
/*  351 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 1569, 65, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 1313, 65, this.textureX, this.textureY);
/*  353 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 1769, 65, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 1449, 65, this.textureX, this.textureY);
/*  355 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/*  356 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 1489, 65, this.textureX, this.textureY);
/*  357 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/*  358 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 1985, 65, this.textureX, this.textureY);
/*  359 */     this.gunModel['į'] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/*  360 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/*  361 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 649, 73, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 681, 73, this.textureX, this.textureY);
/*  363 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 705, 73, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 737, 73, this.textureX, this.textureY);
/*  365 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 761, 73, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 881, 73, this.textureX, this.textureY);
/*  367 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 945, 73, this.textureX, this.textureY);
/*  368 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 977, 73, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 1025, 73, this.textureX, this.textureY);
/*  370 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 1057, 73, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 825, 65, this.textureX, this.textureY);
/*  372 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 1361, 65, this.textureX, this.textureY);
/*  373 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 1609, 65, this.textureX, this.textureY);
/*  374 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 1113, 73, this.textureX, this.textureY);
/*  375 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 1281, 73, this.textureX, this.textureY);
/*  376 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 1329, 73, this.textureX, this.textureY);
/*  377 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 1505, 73, this.textureX, this.textureY);
/*  378 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 1625, 73, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 1665, 73, this.textureX, this.textureY);
/*  380 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 1713, 73, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 1793, 73, this.textureX, this.textureY);
/*  382 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 1377, 73, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 1249, 73, this.textureX, this.textureY);
/*  384 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 1465, 73, this.textureX, this.textureY);
/*  385 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 1849, 73, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 1881, 73, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 1913, 73, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 2001, 73, this.textureX, this.textureY);
/*  389 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 33, 81, this.textureX, this.textureY);
/*  391 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 193, 81, this.textureX, this.textureY);
/*  393 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 1593, 73, this.textureX, this.textureY);
/*  394 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 1969, 73, this.textureX, this.textureY);
/*  395 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/*  397 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/*  399 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/*  400 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  401 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/*  403 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/*  404 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 1441, 65, this.textureX, this.textureY);
/*  405 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 1561, 65, this.textureX, this.textureY);
/*  406 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 1793, 65, this.textureX, this.textureY);
/*  407 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 2033, 65, this.textureX, this.textureY);
/*  408 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/*  409 */     this.gunModel['š'] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/*  411 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 1081, 73, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 537, 81, this.textureX, this.textureY);
/*  413 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 569, 81, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 593, 81, this.textureX, this.textureY);
/*  415 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 617, 81, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 785, 81, this.textureX, this.textureY);
/*  417 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 809, 81, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 1745, 73, this.textureX, this.textureY);
/*  419 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 841, 81, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1137, 73, this.textureX, this.textureY);
/*  421 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 897, 81, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 1153, 81, this.textureX, this.textureY);
/*  423 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 1185, 81, this.textureX, this.textureY);
/*  424 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 1537, 81, this.textureX, this.textureY);
/*  425 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 1937, 81, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 1225, 81, this.textureX, this.textureY);
/*  427 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 1305, 81, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 1353, 81, this.textureX, this.textureY);
/*  429 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 1441, 81, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 1697, 73, this.textureX, this.textureY);
/*  431 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 673, 73, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  433 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 361, 89, this.textureX, this.textureY);
/*  434 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 465, 89, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 1209, 89, this.textureX, this.textureY);
/*  436 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 1577, 89, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 57, 81, this.textureX, this.textureY);
/*  438 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 1833, 89, this.textureX, this.textureY);
/*  439 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 1873, 89, this.textureX, this.textureY);
/*  440 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 1889, 89, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 1969, 89, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 2009, 89, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 41, 97, this.textureX, this.textureY);
/*  445 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 1913, 89, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/*  452 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*  453 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 433, 97, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 513, 97, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 545, 97, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 577, 97, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 609, 97, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 777, 97, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 817, 97, this.textureX, this.textureY);
/*  461 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 273, 81, this.textureX, this.textureY);
/*  463 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 1993, 89, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 849, 97, this.textureX, this.textureY);
/*  466 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 897, 97, this.textureX, this.textureY);
/*  467 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 1153, 97, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/*  470 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 1769, 17, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 1185, 97, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 529, 81, this.textureX, this.textureY);
/*  473 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 561, 81, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 833, 81, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1225, 97, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/*  477 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 1297, 97, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 1361, 97, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 1433, 97, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 585, 81, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 1177, 81, this.textureX, this.textureY);
/*  483 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/*  485 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 1937, 17, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 609, 81, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 801, 81, this.textureX, this.textureY);
/*  488 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 865, 81, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 1449, 97, this.textureX, this.textureY);
/*  490 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 1209, 81, this.textureX, this.textureY);
/*  491 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 497, 97, this.textureX, this.textureY);
/*  492 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 529, 97, this.textureX, this.textureY);
/*  493 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 561, 97, this.textureX, this.textureY);
/*  495 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 1097, 81, this.textureX, this.textureY);
/*  496 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 1537, 97, this.textureX, this.textureY);
/*  497 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 593, 97, this.textureX, this.textureY);
/*  498 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 1025, 9, this.textureX, this.textureY);
/*  499 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 1065, 9, this.textureX, this.textureY);
/*  500 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 1361, 1, this.textureX, this.textureY);
/*  501 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*  502 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*  503 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 1593, 97, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 1769, 97, this.textureX, this.textureY);
/*  506 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 1937, 97, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 913, 105, this.textureX, this.textureY);
/*  508 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 1809, 105, this.textureX, this.textureY);
/*  509 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 1625, 105, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 1577, 81, this.textureX, this.textureY);
/*  511 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 801, 97, this.textureX, this.textureY);
/*  512 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 833, 97, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 2033, 89, this.textureX, this.textureY);
/*  514 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 65, 97, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 625, 97, this.textureX, this.textureY);
/*  516 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/*  517 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 705, 105, this.textureX, this.textureY);
/*  518 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/*  519 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 401, 105, this.textureX, this.textureY);
/*  520 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 1177, 57, this.textureX, this.textureY);
/*  521 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 745, 105, this.textureX, this.textureY);
/*  522 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 1049, 105, this.textureX, this.textureY);
/*  523 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 1201, 105, this.textureX, this.textureY);
/*  524 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 1401, 105, this.textureX, this.textureY);
/*  525 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 1473, 105, this.textureX, this.textureY);
/*  526 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 1505, 105, this.textureX, this.textureY);
/*  527 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 1561, 105, this.textureX, this.textureY);
/*  528 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 1977, 105, this.textureX, this.textureY);
/*  529 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 2009, 105, this.textureX, this.textureY);
/*  530 */     this.gunModel['ǚ'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  531 */     this.gunModel['Ǜ'] = new ModelRendererTurbo(this, 33, 113, this.textureX, this.textureY);
/*  532 */     this.gunModel['ǜ'] = new ModelRendererTurbo(this, 65, 113, this.textureX, this.textureY);
/*  533 */     this.gunModel['ǝ'] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  534 */     this.gunModel['Ǟ'] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/*  535 */     this.gunModel['ǟ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  536 */     this.gunModel['Ǡ'] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/*  537 */     this.gunModel['ǡ'] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  538 */     this.gunModel['Ǣ'] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*  539 */     this.gunModel['ǣ'] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/*  540 */     this.gunModel['Ǥ'] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/*  541 */     this.gunModel['ǥ'] = new ModelRendererTurbo(this, 465, 105, this.textureX, this.textureY);
/*  542 */     this.gunModel['Ǧ'] = new ModelRendererTurbo(this, 481, 113, this.textureX, this.textureY);
/*  543 */     this.gunModel['ǧ'] = new ModelRendererTurbo(this, 1865, 89, this.textureX, this.textureY);
/*  544 */     this.gunModel['Ǩ'] = new ModelRendererTurbo(this, 1313, 105, this.textureX, this.textureY);
/*  545 */     this.gunModel['ǩ'] = new ModelRendererTurbo(this, 425, 113, this.textureX, this.textureY);
/*  546 */     this.gunModel['Ǫ'] = new ModelRendererTurbo(this, 537, 113, this.textureX, this.textureY);
/*  547 */     this.gunModel['ǫ'] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  548 */     this.gunModel['Ǭ'] = new ModelRendererTurbo(this, 577, 113, this.textureX, this.textureY);
/*  549 */     this.gunModel['ǭ'] = new ModelRendererTurbo(this, 633, 113, this.textureX, this.textureY);
/*  550 */     this.gunModel['Ǯ'] = new ModelRendererTurbo(this, 665, 113, this.textureX, this.textureY);
/*  551 */     this.gunModel['ǯ'] = new ModelRendererTurbo(this, 689, 113, this.textureX, this.textureY);
/*  552 */     this.gunModel['ǰ'] = new ModelRendererTurbo(this, 777, 113, this.textureX, this.textureY);
/*  553 */     this.gunModel['Ǳ'] = new ModelRendererTurbo(this, 1121, 65, this.textureX, this.textureY);
/*  554 */     this.gunModel['ǲ'] = new ModelRendererTurbo(this, 841, 113, this.textureX, this.textureY);
/*  555 */     this.gunModel['ǳ'] = new ModelRendererTurbo(this, 865, 113, this.textureX, this.textureY);
/*      */     
/*  557 */     this.gunModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 25, 13, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  558 */     this.gunModel[0].setRotationPoint(-45.0F, -19.5F, 0.5F);
/*      */     
/*  560 */     this.gunModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/*  561 */     this.gunModel[1].setRotationPoint(-20.0F, -6.75F, 0.5F);
/*      */     
/*  563 */     this.gunModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 22, 21, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  564 */     this.gunModel[2].setRotationPoint(-15.0F, -19.5F, 0.0F);
/*      */     
/*  566 */     this.gunModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 64, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  567 */     this.gunModel[3].setRotationPoint(-52.0F, -27.0F, 3.5F);
/*      */     
/*  569 */     this.gunModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 1, 16, 12, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 0.0F);
/*  570 */     this.gunModel[4].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  572 */     this.gunModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  573 */     this.gunModel[5].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  575 */     this.gunModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  576 */     this.gunModel[6].setRotationPoint(8.0F, -15.5F, 0.0F);
/*      */     
/*  578 */     this.gunModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  579 */     this.gunModel[7].setRotationPoint(7.5F, -14.5F, 0.0F);
/*      */     
/*  581 */     this.gunModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  582 */     this.gunModel[8].setRotationPoint(7.5F, -15.5F, 0.0F);
/*      */     
/*  584 */     this.gunModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  585 */     this.gunModel[9].setRotationPoint(7.5F, -16.0F, 0.0F);
/*      */     
/*  587 */     this.gunModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  588 */     this.gunModel[10].setRotationPoint(11.5F, -16.0F, 0.0F);
/*      */     
/*  590 */     this.gunModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/*  591 */     this.gunModel[11].setRotationPoint(11.5F, -15.5F, 0.0F);
/*      */     
/*  593 */     this.gunModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  594 */     this.gunModel[12].setRotationPoint(7.5F, -17.0F, 0.0F);
/*      */     
/*  596 */     this.gunModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  597 */     this.gunModel[13].setRotationPoint(7.5F, -18.0F, 0.0F);
/*      */     
/*  599 */     this.gunModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  600 */     this.gunModel[14].setRotationPoint(11.5F, -18.0F, 0.0F);
/*      */     
/*  602 */     this.gunModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  603 */     this.gunModel[15].setRotationPoint(11.5F, -18.5F, 0.0F);
/*      */     
/*  605 */     this.gunModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  606 */     this.gunModel[16].setRotationPoint(9.0F, -19.0F, 0.0F);
/*      */     
/*  608 */     this.gunModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 12, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  609 */     this.gunModel[17].setRotationPoint(7.0F, -19.0F, 0.0F);
/*      */     
/*  611 */     this.gunModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 13, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  612 */     this.gunModel[18].setRotationPoint(9.5F, -17.0F, -0.5F);
/*      */     
/*  614 */     this.gunModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 13, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/*  615 */     this.gunModel[19].setRotationPoint(9.5F, -17.5F, -0.5F);
/*      */     
/*  617 */     this.gunModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 13, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/*  618 */     this.gunModel[20].setRotationPoint(9.5F, -16.5F, -0.5F);
/*      */     
/*  620 */     this.gunModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.25F, -1.0F, 1.0F, 0.25F, -1.0F, 0.0F, 0.5F, 0.0F);
/*  621 */     this.gunModel[21].setRotationPoint(7.5F, 0.0F, 0.0F);
/*      */     
/*  623 */     this.gunModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 5, 9, 12, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  624 */     this.gunModel[22].setRotationPoint(-20.0F, -19.5F, 0.0F);
/*      */     
/*  626 */     this.gunModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  627 */     this.gunModel[23].setRotationPoint(-20.0F, -10.5F, 0.0F);
/*      */     
/*  629 */     this.gunModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F);
/*  630 */     this.gunModel[24].setRotationPoint(-20.0F, -9.5F, 0.0F);
/*      */     
/*  632 */     this.gunModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 12, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F);
/*  633 */     this.gunModel[25].setRotationPoint(-17.0F, -9.0F, 0.0F);
/*      */     
/*  635 */     this.gunModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 5, 12, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  636 */     this.gunModel[26].setRotationPoint(-20.0F, -18.5F, 0.5F);
/*      */     
/*  638 */     this.gunModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 22, 1, 14, 0.0F, 0.0F, -1.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 1.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 1.5F, 0.5F);
/*  639 */     this.gunModel[27].setRotationPoint(-15.0F, 1.5F, -1.0F);
/*      */     
/*  641 */     this.gunModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 22, 1, 15, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F);
/*  642 */     this.gunModel[28].setRotationPoint(-15.0F, 2.5F, -1.5F);
/*      */     
/*  644 */     this.gunModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 25, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  645 */     this.gunModel[29].setRotationPoint(-45.0F, -21.25F, 0.5F);
/*      */     
/*  647 */     this.gunModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 28, 3, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  648 */     this.gunModel[30].setRotationPoint(-20.0F, -22.5F, 4.0F);
/*      */     
/*  650 */     this.gunModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 8, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  651 */     this.gunModel[31].setRotationPoint(8.0F, -22.5F, 4.0F);
/*      */     
/*  653 */     this.gunModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 65, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/*  654 */     this.gunModel[32].setRotationPoint(-53.0F, -24.0F, 11.5F);
/*      */     
/*  656 */     this.gunModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 65, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F);
/*  657 */     this.gunModel[33].setRotationPoint(-53.0F, -30.0F, 10.5F);
/*      */     
/*  659 */     this.gunModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 65, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  660 */     this.gunModel[34].setRotationPoint(-53.0F, -27.0F, 11.5F);
/*      */     
/*  662 */     this.gunModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 55, 3, 9, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F);
/*  663 */     this.gunModel[35].setRotationPoint(-43.0F, -32.75F, 1.5F);
/*      */     
/*  665 */     this.gunModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 35, 2, 11, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/*  666 */     this.gunModel[36].setRotationPoint(-54.0F, -20.25F, 0.5F);
/*      */     
/*  668 */     this.gunModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 15, 0.0F, -0.5F, -1.5F, 0.0F, 0.5F, -1.25F, -1.0F, 0.5F, -1.25F, -1.0F, -0.5F, -1.5F, 0.0F, -0.5F, 1.5F, 0.0F, 0.5F, 1.25F, -1.0F, 0.5F, 1.25F, -1.0F, -0.5F, 1.5F, 0.0F);
/*  669 */     this.gunModel[37].setRotationPoint(7.0F, 1.0F, -1.5F);
/*      */     
/*  671 */     this.gunModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 14, 0.0F, -0.5F, -1.5F, -1.0F, 0.5F, -1.25F, -2.0F, 0.5F, -1.25F, -2.0F, -0.5F, -1.5F, -1.0F, -0.5F, 1.5F, 0.5F, 0.5F, 1.25F, -0.5F, 0.5F, 1.25F, -0.5F, -0.5F, 1.5F, 0.5F);
/*  672 */     this.gunModel[38].setRotationPoint(7.0F, 0.0F, -1.0F);
/*      */     
/*  674 */     this.gunModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -1.5F, 0.5F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, -0.5F, -1.5F, 0.5F, -0.5F, 1.5F, 0.5F, 0.0F, 0.75F, -1.0F, 0.0F, 0.75F, -1.0F, -0.5F, 1.5F, 0.5F);
/*  675 */     this.gunModel[39].setRotationPoint(9.0F, 0.75F, 0.0F);
/*      */     
/*  677 */     this.gunModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 12, 0.0F, -0.5F, -1.5F, -1.0F, 0.0F, -2.25F, -1.0F, 0.0F, -2.25F, -1.0F, -0.5F, -1.5F, -1.0F, -0.5F, 1.5F, 0.5F, 0.0F, 1.25F, -1.0F, 0.0F, 1.25F, -1.0F, -0.5F, 1.5F, 0.5F);
/*  678 */     this.gunModel[40].setRotationPoint(9.0F, -0.25F, 0.0F);
/*      */     
/*  680 */     this.gunModel[41].addShapeBox(40.0F, -11.0F, -6.0F, 56, 3, 10, 0.0F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, -0.25F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F);
/*  681 */     this.gunModel[41].setRotationPoint(-44.0F, -34.75F, 1.0F);
/*      */     
/*  683 */     this.gunModel[42].addShapeBox(40.0F, -11.0F, -6.0F, 55, 2, 7, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/*  684 */     this.gunModel[42].setRotationPoint(-43.0F, -35.75F, 2.5F);
/*      */     
/*  686 */     this.gunModel[43].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  687 */     this.gunModel[43].setRotationPoint(8.0F, -21.25F, 0.5F);
/*      */     
/*  689 */     this.gunModel[44].addShapeBox(40.0F, -11.0F, -6.0F, 65, 3, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  690 */     this.gunModel[44].setRotationPoint(-53.0F, -29.75F, 1.5F);
/*      */     
/*  692 */     this.gunModel[45].addShapeBox(40.0F, -11.0F, -6.0F, 33, 3, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  693 */     this.gunModel[45].setRotationPoint(-53.0F, -24.0F, -0.5F);
/*      */     
/*  695 */     this.gunModel[46].addShapeBox(40.0F, -11.0F, -6.0F, 33, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*  696 */     this.gunModel[46].setRotationPoint(-53.0F, -27.0F, -1.5F);
/*      */     
/*  698 */     this.gunModel[47].addShapeBox(40.0F, -11.0F, -6.0F, 52, 1, 7, 0.0F, 0.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.5F, -0.5F, 1.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/*  699 */     this.gunModel[47].setRotationPoint(-40.0F, -37.0F, 2.5F);
/*      */     
/*  701 */     this.gunModel[48].addShapeBox(40.0F, -11.0F, -6.0F, 53, 1, 7, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.5F, -0.5F, 1.25F);
/*  702 */     this.gunModel[48].setRotationPoint(-40.0F, -37.5F, 2.5F);
/*      */     
/*  704 */     this.gunModel[49].addShapeBox(40.0F, -11.0F, -6.0F, 52, 1, 9, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F);
/*  705 */     this.gunModel[49].setRotationPoint(-40.0F, -37.0F, 1.5F);
/*      */     
/*  707 */     this.gunModel[50].addShapeBox(40.0F, -11.0F, -6.0F, 81, 3, 1, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  708 */     this.gunModel[50].setRotationPoint(12.0F, -32.75F, 1.0F);
/*      */     
/*  710 */     this.gunModel[51].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 4, 0.0F, -0.25F, -0.75F, -1.5F, 0.0F, -0.75F, -1.5F, 0.0F, 0.25F, -1.5F, -0.25F, 0.25F, -1.5F, -0.25F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F);
/*  711 */     this.gunModel[51].setRotationPoint(12.0F, -33.75F, -0.5F);
/*      */     
/*  713 */     this.gunModel[52].addShapeBox(40.0F, -11.0F, -6.0F, 79, 2, 7, 0.0F, -0.25F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F);
/*  714 */     this.gunModel[52].setRotationPoint(12.0F, -35.75F, 2.5F);
/*      */     
/*  716 */     this.gunModel[53].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 7, 0.0F, -0.5F, 0.25F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F);
/*  717 */     this.gunModel[53].setRotationPoint(91.0F, -35.75F, 2.5F);
/*      */     
/*  719 */     this.gunModel[54].addShapeBox(40.0F, -11.0F, -6.0F, 79, 1, 7, 0.0F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  720 */     this.gunModel[54].setRotationPoint(12.0F, -37.0F, 2.5F);
/*      */     
/*  722 */     this.gunModel[55].addShapeBox(40.0F, -11.0F, -6.0F, 79, 1, 7, 0.0F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 1.25F, -1.5F, -0.5F, 1.25F, -1.5F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F);
/*  723 */     this.gunModel[55].setRotationPoint(13.0F, -37.5F, 2.5F);
/*      */     
/*  725 */     this.gunModel[56].addShapeBox(40.0F, -11.0F, -6.0F, 80, 1, 9, 0.0F, 0.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  726 */     this.gunModel[56].setRotationPoint(12.0F, -37.0F, 1.5F);
/*      */     
/*  728 */     this.gunModel[57].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  729 */     this.gunModel[57].setRotationPoint(12.0F, -29.0F, -3.5F);
/*      */     
/*  731 */     this.gunModel[58].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  732 */     this.gunModel[58].setRotationPoint(37.0F, -29.0F, -3.5F);
/*      */     
/*  734 */     this.gunModel[59].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  735 */     this.gunModel[59].setRotationPoint(54.0F, -29.0F, -3.5F);
/*      */     
/*  737 */     this.gunModel[60].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  738 */     this.gunModel[60].setRotationPoint(72.0F, -29.0F, -3.5F);
/*      */     
/*  740 */     this.gunModel[61].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 3, 0.0F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/*  741 */     this.gunModel[61].setRotationPoint(89.0F, -29.0F, -3.5F);
/*      */     
/*  743 */     this.gunModel[62].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  744 */     this.gunModel[62].setRotationPoint(31.0F, -28.0F, -3.0F);
/*      */     
/*  746 */     this.gunModel[63].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  747 */     this.gunModel[63].setRotationPoint(31.0F, -29.0F, -3.5F);
/*      */     
/*  749 */     this.gunModel[64].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/*  750 */     this.gunModel[64].setRotationPoint(36.25F, -29.0F, -3.5F);
/*      */     
/*  752 */     this.gunModel[65].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  753 */     this.gunModel[65].setRotationPoint(12.0F, -30.0F, 11.5F);
/*      */     
/*  755 */     this.gunModel[66].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  756 */     this.gunModel[66].setRotationPoint(12.0F, -29.0F, 12.5F);
/*      */     
/*  758 */     this.gunModel[67].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  759 */     this.gunModel[67].setRotationPoint(37.0F, -30.0F, 11.5F);
/*      */     
/*  761 */     this.gunModel[68].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  762 */     this.gunModel[68].setRotationPoint(37.0F, -29.0F, 12.5F);
/*      */     
/*  764 */     this.gunModel[69].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  765 */     this.gunModel[69].setRotationPoint(31.0F, -30.0F, 11.0F);
/*      */     
/*  767 */     this.gunModel[70].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  768 */     this.gunModel[70].setRotationPoint(31.0F, -28.0F, 12.5F);
/*      */     
/*  770 */     this.gunModel[71].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  771 */     this.gunModel[71].setRotationPoint(31.0F, -29.0F, 12.5F);
/*      */     
/*  773 */     this.gunModel[72].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  774 */     this.gunModel[72].setRotationPoint(36.25F, -29.0F, 12.5F);
/*      */     
/*  776 */     this.gunModel[73].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  777 */     this.gunModel[73].setRotationPoint(54.0F, -30.0F, 11.5F);
/*      */     
/*  779 */     this.gunModel[74].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  780 */     this.gunModel[74].setRotationPoint(54.0F, -29.0F, 12.5F);
/*      */     
/*  782 */     this.gunModel[75].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  783 */     this.gunModel[75].setRotationPoint(72.0F, -30.0F, 11.5F);
/*      */     
/*  785 */     this.gunModel[76].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  786 */     this.gunModel[76].setRotationPoint(72.0F, -29.0F, 12.5F);
/*      */     
/*  788 */     this.gunModel[77].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F);
/*  789 */     this.gunModel[77].setRotationPoint(89.0F, -30.0F, 11.5F);
/*      */     
/*  791 */     this.gunModel[78].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 3, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F);
/*  792 */     this.gunModel[78].setRotationPoint(89.0F, -29.0F, 12.5F);
/*      */     
/*  794 */     this.gunModel[79].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  795 */     this.gunModel[79].setRotationPoint(31.0F, -28.0F, 12.0F);
/*      */     
/*  797 */     this.gunModel[80].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  798 */     this.gunModel[80].setRotationPoint(43.0F, -28.0F, 12.5F);
/*      */     
/*  800 */     this.gunModel[81].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  801 */     this.gunModel[81].setRotationPoint(43.0F, -28.0F, 12.0F);
/*      */     
/*  803 */     this.gunModel[82].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  804 */     this.gunModel[82].setRotationPoint(60.0F, -28.0F, 12.5F);
/*      */     
/*  806 */     this.gunModel[83].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  807 */     this.gunModel[83].setRotationPoint(60.0F, -28.0F, 12.0F);
/*      */     
/*  809 */     this.gunModel[84].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  810 */     this.gunModel[84].setRotationPoint(78.0F, -28.0F, 12.5F);
/*      */     
/*  812 */     this.gunModel[85].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/*  813 */     this.gunModel[85].setRotationPoint(78.0F, -28.0F, 12.0F);
/*      */     
/*  815 */     this.gunModel[86].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  816 */     this.gunModel[86].setRotationPoint(43.0F, -29.0F, 12.5F);
/*      */     
/*  818 */     this.gunModel[87].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  819 */     this.gunModel[87].setRotationPoint(53.25F, -29.0F, 12.5F);
/*      */     
/*  821 */     this.gunModel[88].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  822 */     this.gunModel[88].setRotationPoint(78.0F, -29.0F, 12.5F);
/*      */     
/*  824 */     this.gunModel[89].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  825 */     this.gunModel[89].setRotationPoint(88.25F, -29.0F, 12.5F);
/*      */     
/*  827 */     this.gunModel[90].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/*  828 */     this.gunModel[90].setRotationPoint(60.0F, -29.0F, 12.5F);
/*      */     
/*  830 */     this.gunModel[91].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F);
/*  831 */     this.gunModel[91].setRotationPoint(71.25F, -29.0F, 12.5F);
/*      */     
/*  833 */     this.gunModel[92].addShapeBox(40.0F, -11.0F, -6.0F, 81, 3, 1, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  834 */     this.gunModel[92].setRotationPoint(12.0F, -32.75F, 10.0F);
/*      */     
/*  836 */     this.gunModel[93].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  837 */     this.gunModel[93].setRotationPoint(78.0F, -29.0F, 12.5F);
/*      */     
/*  839 */     this.gunModel[94].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  840 */     this.gunModel[94].setRotationPoint(60.0F, -29.0F, 12.5F);
/*      */     
/*  842 */     this.gunModel[95].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  843 */     this.gunModel[95].setRotationPoint(43.0F, -29.0F, 12.5F);
/*      */     
/*  845 */     this.gunModel[96].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F);
/*  846 */     this.gunModel[96].setRotationPoint(31.0F, -29.0F, 12.5F);
/*      */     
/*  848 */     this.gunModel[97].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  849 */     this.gunModel[97].setRotationPoint(36.25F, -30.0F, 11.0F);
/*      */     
/*  851 */     this.gunModel[98].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  852 */     this.gunModel[98].setRotationPoint(43.0F, -30.0F, 11.0F);
/*      */     
/*  854 */     this.gunModel[99].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  855 */     this.gunModel[99].setRotationPoint(53.25F, -30.0F, 11.0F);
/*      */     
/*  857 */     this.gunModel[100].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  858 */     this.gunModel[100].setRotationPoint(60.0F, -30.0F, 11.0F);
/*      */     
/*  860 */     this.gunModel[101].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  861 */     this.gunModel[101].setRotationPoint(71.25F, -30.0F, 11.0F);
/*      */     
/*  863 */     this.gunModel[102].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  864 */     this.gunModel[102].setRotationPoint(78.0F, -30.0F, 11.0F);
/*      */     
/*  866 */     this.gunModel[103].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  867 */     this.gunModel[103].setRotationPoint(88.25F, -30.0F, 11.0F);
/*      */     
/*  869 */     this.gunModel[104].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 4, 0.0F, -0.25F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -0.75F, -1.5F, -0.25F, -0.75F, -1.5F, -0.25F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, -1.5F);
/*  870 */     this.gunModel[104].setRotationPoint(12.0F, -33.75F, 8.5F);
/*      */     
/*  872 */     this.gunModel[105].addShapeBox(40.0F, -11.0F, -6.0F, 82, 9, 1, 0.0F, -0.25F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  873 */     this.gunModel[105].setRotationPoint(11.0F, -28.5F, 14.5F);
/*      */     
/*  875 */     this.gunModel[106].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  876 */     this.gunModel[106].setRotationPoint(12.0F, -26.0F, 14.0F);
/*      */     
/*  878 */     this.gunModel[107].addShapeBox(40.0F, -11.0F, -6.0F, 82, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -1.75F, -0.5F, -0.25F, -1.75F, -0.5F);
/*  879 */     this.gunModel[107].setRotationPoint(11.0F, -28.5F, 16.0F);
/*      */     
/*  881 */     this.gunModel[108].addShapeBox(40.0F, -11.0F, -6.0F, 82, 9, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/*  882 */     this.gunModel[108].setRotationPoint(11.0F, -28.5F, 15.0F);
/*      */     
/*  884 */     this.gunModel[109].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  885 */     this.gunModel[109].setRotationPoint(12.0F, -24.25F, 14.0F);
/*      */     
/*  887 */     this.gunModel[110].addShapeBox(40.0F, -11.0F, -6.0F, 82, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.5F, -0.25F, -1.5F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.75F, -0.5F, -0.25F, -1.75F, -0.5F);
/*  888 */     this.gunModel[110].setRotationPoint(11.0F, -28.5F, -3.5F);
/*      */     
/*  890 */     this.gunModel[111].addShapeBox(40.0F, -11.0F, -6.0F, 82, 9, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F);
/*  891 */     this.gunModel[111].setRotationPoint(11.0F, -28.5F, -4.0F);
/*      */     
/*  893 */     this.gunModel[112].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  894 */     this.gunModel[112].setRotationPoint(12.0F, -26.0F, -3.0F);
/*      */     
/*  896 */     this.gunModel[113].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  897 */     this.gunModel[113].setRotationPoint(12.0F, -24.25F, -3.0F);
/*      */     
/*  899 */     this.gunModel[114].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  900 */     this.gunModel[114].setRotationPoint(12.0F, -21.25F, 11.5F);
/*      */     
/*  902 */     this.gunModel[115].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  903 */     this.gunModel[115].setRotationPoint(12.0F, -22.25F, 12.5F);
/*      */     
/*  905 */     this.gunModel[116].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  906 */     this.gunModel[116].setRotationPoint(37.0F, -21.25F, 11.5F);
/*      */     
/*  908 */     this.gunModel[117].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  909 */     this.gunModel[117].setRotationPoint(37.0F, -22.25F, 12.5F);
/*      */     
/*  911 */     this.gunModel[118].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  912 */     this.gunModel[118].setRotationPoint(31.0F, -21.25F, 14.5F);
/*      */     
/*  914 */     this.gunModel[119].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  915 */     this.gunModel[119].setRotationPoint(54.0F, -21.25F, 11.5F);
/*      */     
/*  917 */     this.gunModel[120].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  918 */     this.gunModel[120].setRotationPoint(54.0F, -22.25F, 12.5F);
/*      */     
/*  920 */     this.gunModel[121].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  921 */     this.gunModel[121].setRotationPoint(72.0F, -21.25F, 11.5F);
/*      */     
/*  923 */     this.gunModel[122].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  924 */     this.gunModel[122].setRotationPoint(72.0F, -22.25F, 12.5F);
/*      */     
/*  926 */     this.gunModel[123].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  927 */     this.gunModel[123].setRotationPoint(43.0F, -21.25F, 12.5F);
/*      */     
/*  929 */     this.gunModel[124].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  930 */     this.gunModel[124].setRotationPoint(60.0F, -21.25F, 12.5F);
/*      */     
/*  932 */     this.gunModel[125].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  933 */     this.gunModel[125].setRotationPoint(60.0F, -22.25F, 14.5F);
/*      */     
/*  935 */     this.gunModel[126].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  936 */     this.gunModel[126].setRotationPoint(43.0F, -22.25F, 14.5F);
/*      */     
/*  938 */     this.gunModel[127].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/*  939 */     this.gunModel[127].setRotationPoint(31.0F, -22.25F, 14.5F);
/*      */     
/*  941 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 10, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  942 */     this.gunModel[''].setRotationPoint(12.0F, -18.25F, 1.0F);
/*      */     
/*  944 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/*  945 */     this.gunModel[''].setRotationPoint(31.0F, -21.25F, 12.5F);
/*      */     
/*  947 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  948 */     this.gunModel[''].setRotationPoint(31.0F, -20.25F, 12.5F);
/*      */     
/*  950 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  951 */     this.gunModel[''].setRotationPoint(36.25F, -20.25F, 12.5F);
/*      */     
/*  953 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  954 */     this.gunModel[''].setRotationPoint(31.0F, -19.25F, 11.0F);
/*      */     
/*  956 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  957 */     this.gunModel[''].setRotationPoint(36.25F, -19.25F, 11.0F);
/*      */     
/*  959 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  960 */     this.gunModel[''].setRotationPoint(43.0F, -20.25F, 12.5F);
/*      */     
/*  962 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  963 */     this.gunModel[''].setRotationPoint(53.25F, -20.25F, 12.5F);
/*      */     
/*  965 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  966 */     this.gunModel[''].setRotationPoint(43.0F, -19.25F, 11.0F);
/*      */     
/*  968 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  969 */     this.gunModel[''].setRotationPoint(53.25F, -19.25F, 11.0F);
/*      */     
/*  971 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/*  972 */     this.gunModel[''].setRotationPoint(79.0F, -21.25F, 11.5F);
/*      */     
/*  974 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/*  975 */     this.gunModel[''].setRotationPoint(79.0F, -22.25F, 12.5F);
/*      */     
/*  977 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  978 */     this.gunModel[''].setRotationPoint(60.0F, -20.25F, 12.5F);
/*      */     
/*  980 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  981 */     this.gunModel[''].setRotationPoint(71.25F, -20.25F, 12.5F);
/*      */     
/*  983 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  984 */     this.gunModel[''].setRotationPoint(60.0F, -19.25F, 11.0F);
/*      */     
/*  986 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  987 */     this.gunModel[''].setRotationPoint(71.25F, -19.25F, 11.0F);
/*      */     
/*  989 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/*  990 */     this.gunModel[''].setRotationPoint(75.0F, -20.25F, 12.5F);
/*      */     
/*  992 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/*  993 */     this.gunModel[''].setRotationPoint(78.25F, -20.25F, 12.5F);
/*      */     
/*  995 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  996 */     this.gunModel[''].setRotationPoint(75.0F, -19.25F, 11.0F);
/*      */     
/*  998 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/*  999 */     this.gunModel[''].setRotationPoint(78.25F, -19.25F, 11.0F);
/*      */     
/* 1001 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/* 1002 */     this.gunModel[''].setRotationPoint(75.0F, -21.25F, 12.5F);
/*      */     
/* 1004 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 10, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 1.0F, -0.75F, -0.5F, 1.0F, -0.75F, -0.5F, 1.0F, -0.25F, -0.5F, 1.0F);
/* 1005 */     this.gunModel[''].setRotationPoint(12.0F, -17.25F, 1.0F);
/*      */     
/* 1007 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 81, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1008 */     this.gunModel[''].setRotationPoint(12.0F, -16.75F, 0.0F);
/*      */     
/* 1010 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 80, 1, 12, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F);
/* 1011 */     this.gunModel[''].setRotationPoint(12.0F, -16.25F, 0.0F);
/*      */     
/* 1013 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F);
/* 1014 */     this.gunModel[''].setRotationPoint(90.0F, -21.25F, 11.5F);
/*      */     
/* 1016 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 1.5F, -1.5F, -0.25F, 1.5F, -1.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -1.5F, -0.25F, -2.0F, -1.5F);
/* 1017 */     this.gunModel[''].setRotationPoint(90.0F, -22.25F, 12.5F);
/*      */     
/* 1019 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1020 */     this.gunModel[''].setRotationPoint(12.0F, -21.25F, -1.5F);
/*      */     
/* 1022 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1023 */     this.gunModel[''].setRotationPoint(12.0F, -22.25F, -3.5F);
/*      */     
/* 1025 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1026 */     this.gunModel[''].setRotationPoint(37.0F, -21.25F, -1.5F);
/*      */     
/* 1028 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1029 */     this.gunModel[''].setRotationPoint(37.0F, -22.25F, -3.5F);
/*      */     
/* 1031 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1032 */     this.gunModel[''].setRotationPoint(54.0F, -21.25F, -1.5F);
/*      */     
/* 1034 */     this.gunModel[''].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1035 */     this.gunModel[''].setRotationPoint(54.0F, -22.25F, -3.5F);
/*      */     
/* 1037 */     this.gunModel[' '].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1038 */     this.gunModel[' '].setRotationPoint(72.0F, -21.25F, -1.5F);
/*      */     
/* 1040 */     this.gunModel['¡'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1041 */     this.gunModel['¡'].setRotationPoint(72.0F, -22.25F, -3.5F);
/*      */     
/* 1043 */     this.gunModel['¢'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1044 */     this.gunModel['¢'].setRotationPoint(79.0F, -21.25F, -1.5F);
/*      */     
/* 1046 */     this.gunModel['£'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1047 */     this.gunModel['£'].setRotationPoint(79.0F, -22.25F, -3.5F);
/*      */     
/* 1049 */     this.gunModel['¤'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 2, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F);
/* 1050 */     this.gunModel['¤'].setRotationPoint(90.0F, -21.25F, -1.5F);
/*      */     
/* 1052 */     this.gunModel['¥'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, -0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1053 */     this.gunModel['¥'].setRotationPoint(90.0F, -22.25F, -3.5F);
/*      */     
/* 1055 */     this.gunModel['¦'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1056 */     this.gunModel['¦'].setRotationPoint(12.0F, -30.0F, -1.5F);
/*      */     
/* 1058 */     this.gunModel['§'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1059 */     this.gunModel['§'].setRotationPoint(37.0F, -30.0F, -1.5F);
/*      */     
/* 1061 */     this.gunModel['¨'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1062 */     this.gunModel['¨'].setRotationPoint(54.0F, -30.0F, -1.5F);
/*      */     
/* 1064 */     this.gunModel['©'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1065 */     this.gunModel['©'].setRotationPoint(72.0F, -30.0F, -1.5F);
/*      */     
/* 1067 */     this.gunModel['ª'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 2, 0.0F, -0.25F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F);
/* 1068 */     this.gunModel['ª'].setRotationPoint(89.0F, -30.0F, -1.5F);
/*      */     
/* 1070 */     this.gunModel['«'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1071 */     this.gunModel['«'].setRotationPoint(31.0F, -30.0F, -1.0F);
/*      */     
/* 1073 */     this.gunModel['¬'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1074 */     this.gunModel['¬'].setRotationPoint(43.0F, -28.0F, -3.5F);
/*      */     
/* 1076 */     this.gunModel['­'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1077 */     this.gunModel['­'].setRotationPoint(60.0F, -28.0F, -3.5F);
/*      */     
/* 1079 */     this.gunModel['®'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1080 */     this.gunModel['®'].setRotationPoint(78.0F, -28.0F, -3.5F);
/*      */     
/* 1082 */     this.gunModel['¯'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1083 */     this.gunModel['¯'].setRotationPoint(43.0F, -29.0F, -3.5F);
/*      */     
/* 1085 */     this.gunModel['°'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1086 */     this.gunModel['°'].setRotationPoint(53.25F, -29.0F, -3.5F);
/*      */     
/* 1088 */     this.gunModel['±'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1089 */     this.gunModel['±'].setRotationPoint(78.0F, -29.0F, -3.5F);
/*      */     
/* 1091 */     this.gunModel['²'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1092 */     this.gunModel['²'].setRotationPoint(88.25F, -29.0F, -3.5F);
/*      */     
/* 1094 */     this.gunModel['³'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1095 */     this.gunModel['³'].setRotationPoint(60.0F, -29.0F, -3.5F);
/*      */     
/* 1097 */     this.gunModel['´'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F);
/* 1098 */     this.gunModel['´'].setRotationPoint(71.25F, -29.0F, -3.5F);
/*      */     
/* 1100 */     this.gunModel['µ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1101 */     this.gunModel['µ'].setRotationPoint(36.25F, -30.0F, -1.0F);
/*      */     
/* 1103 */     this.gunModel['¶'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1104 */     this.gunModel['¶'].setRotationPoint(43.0F, -30.0F, -1.0F);
/*      */     
/* 1106 */     this.gunModel['·'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1107 */     this.gunModel['·'].setRotationPoint(53.25F, -30.0F, -1.0F);
/*      */     
/* 1109 */     this.gunModel['¸'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1110 */     this.gunModel['¸'].setRotationPoint(60.0F, -30.0F, -1.0F);
/*      */     
/* 1112 */     this.gunModel['¹'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1113 */     this.gunModel['¹'].setRotationPoint(71.25F, -30.0F, -1.0F);
/*      */     
/* 1115 */     this.gunModel['º'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1116 */     this.gunModel['º'].setRotationPoint(78.0F, -30.0F, -1.0F);
/*      */     
/* 1118 */     this.gunModel['»'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1119 */     this.gunModel['»'].setRotationPoint(88.25F, -30.0F, -1.0F);
/*      */     
/* 1121 */     this.gunModel['¼'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1122 */     this.gunModel['¼'].setRotationPoint(78.0F, -29.0F, -3.5F);
/*      */     
/* 1124 */     this.gunModel['½'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1125 */     this.gunModel['½'].setRotationPoint(60.0F, -29.0F, -3.5F);
/*      */     
/* 1127 */     this.gunModel['¾'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1128 */     this.gunModel['¾'].setRotationPoint(43.0F, -29.0F, -3.5F);
/*      */     
/* 1130 */     this.gunModel['¿'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1131 */     this.gunModel['¿'].setRotationPoint(31.0F, -29.0F, -3.5F);
/*      */     
/* 1133 */     this.gunModel['À'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1134 */     this.gunModel['À'].setRotationPoint(31.0F, -28.0F, -3.5F);
/*      */     
/* 1136 */     this.gunModel['Á'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1137 */     this.gunModel['Á'].setRotationPoint(90.0F, -21.25F, 10.5F);
/*      */     
/* 1139 */     this.gunModel['Â'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1140 */     this.gunModel['Â'].setRotationPoint(90.0F, -21.25F, 0.5F);
/*      */     
/* 1142 */     this.gunModel['Ã'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1143 */     this.gunModel['Ã'].setRotationPoint(79.0F, -21.25F, 10.5F);
/*      */     
/* 1145 */     this.gunModel['Ä'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1146 */     this.gunModel['Ä'].setRotationPoint(79.0F, -21.25F, 0.5F);
/*      */     
/* 1148 */     this.gunModel['Å'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1149 */     this.gunModel['Å'].setRotationPoint(72.0F, -21.25F, 10.5F);
/*      */     
/* 1151 */     this.gunModel['Æ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1152 */     this.gunModel['Æ'].setRotationPoint(72.0F, -21.25F, 0.5F);
/*      */     
/* 1154 */     this.gunModel['Ç'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1155 */     this.gunModel['Ç'].setRotationPoint(54.0F, -21.25F, 10.5F);
/*      */     
/* 1157 */     this.gunModel['È'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1158 */     this.gunModel['È'].setRotationPoint(54.0F, -21.25F, 0.5F);
/*      */     
/* 1160 */     this.gunModel['É'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1161 */     this.gunModel['É'].setRotationPoint(37.0F, -21.25F, 10.5F);
/*      */     
/* 1163 */     this.gunModel['Ê'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1164 */     this.gunModel['Ê'].setRotationPoint(37.0F, -21.25F, 0.5F);
/*      */     
/* 1166 */     this.gunModel['Ë'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 1167 */     this.gunModel['Ë'].setRotationPoint(12.0F, -21.25F, 10.5F);
/*      */     
/* 1169 */     this.gunModel['Ì'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.5F, -0.25F, 0.0F, 1.5F);
/* 1170 */     this.gunModel['Ì'].setRotationPoint(12.0F, -21.25F, 0.5F);
/*      */     
/* 1172 */     this.gunModel['Í'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1173 */     this.gunModel['Í'].setRotationPoint(89.0F, -30.0F, 10.5F);
/*      */     
/* 1175 */     this.gunModel['Î'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1176 */     this.gunModel['Î'].setRotationPoint(89.0F, -30.0F, 0.5F);
/*      */     
/* 1178 */     this.gunModel['Ï'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1179 */     this.gunModel['Ï'].setRotationPoint(72.0F, -30.0F, 10.5F);
/*      */     
/* 1181 */     this.gunModel['Ð'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1182 */     this.gunModel['Ð'].setRotationPoint(72.0F, -30.0F, 0.5F);
/*      */     
/* 1184 */     this.gunModel['Ñ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1185 */     this.gunModel['Ñ'].setRotationPoint(54.0F, -30.0F, 10.5F);
/*      */     
/* 1187 */     this.gunModel['Ò'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1188 */     this.gunModel['Ò'].setRotationPoint(54.0F, -30.0F, 0.5F);
/*      */     
/* 1190 */     this.gunModel['Ó'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1191 */     this.gunModel['Ó'].setRotationPoint(37.0F, -30.0F, 10.5F);
/*      */     
/* 1193 */     this.gunModel['Ô'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1194 */     this.gunModel['Ô'].setRotationPoint(37.0F, -30.0F, 0.5F);
/*      */     
/* 1196 */     this.gunModel['Õ'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1197 */     this.gunModel['Õ'].setRotationPoint(12.0F, -30.0F, 10.5F);
/*      */     
/* 1199 */     this.gunModel['Ö'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 3, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1200 */     this.gunModel['Ö'].setRotationPoint(12.0F, -30.0F, 0.5F);
/*      */     
/* 1202 */     this.gunModel['×'].addShapeBox(40.0F, -11.0F, -6.0F, 81, 2, 2, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.5F, -0.25F, -0.5F, -1.5F);
/* 1203 */     this.gunModel['×'].setRotationPoint(12.0F, -34.0F, 1.5F);
/*      */     
/* 1205 */     this.gunModel['Ø'].addShapeBox(40.0F, -11.0F, -6.0F, 81, 2, 2, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F);
/* 1206 */     this.gunModel['Ø'].setRotationPoint(12.0F, -34.0F, 8.5F);
/*      */     
/* 1208 */     this.gunModel['Ù'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
/* 1209 */     this.gunModel['Ù'].setRotationPoint(8.0F, -20.25F, 0.5F);
/*      */     
/* 1211 */     this.gunModel['Ú'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 4, 11, 0.0F, 0.5F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.5F, -1.0F, -1.5F);
/* 1212 */     this.gunModel['Ú'].setRotationPoint(8.0F, -20.25F, 0.5F);
/*      */     
/* 1214 */     this.gunModel['Û'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1215 */     this.gunModel['Û'].setRotationPoint(-11.5F, -19.5F, 11.75F);
/*      */     
/* 1217 */     this.gunModel['Ü'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1218 */     this.gunModel['Ü'].setRotationPoint(-11.5F, -20.5F, 11.75F);
/*      */     
/* 1220 */     this.gunModel['Ý'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1221 */     this.gunModel['Ý'].setRotationPoint(-11.5F, -20.0F, 11.75F);
/*      */     
/* 1223 */     this.gunModel['Þ'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1224 */     this.gunModel['Þ'].setRotationPoint(-18.5F, -13.0F, 10.75F);
/*      */     
/* 1226 */     this.gunModel['ß'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1227 */     this.gunModel['ß'].setRotationPoint(-11.5F, -14.0F, 12.25F);
/*      */     
/* 1229 */     this.gunModel['à'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1230 */     this.gunModel['à'].setRotationPoint(-10.5F, -14.75F, 12.25F);
/*      */     
/* 1232 */     this.gunModel['á'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 1233 */     this.gunModel['á'].setRotationPoint(-11.5F, -11.0F, 12.25F);
/*      */     
/* 1235 */     this.gunModel['â'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F);
/* 1236 */     this.gunModel['â'].setRotationPoint(-10.5F, -10.25F, 12.25F);
/*      */     
/* 1238 */     this.gunModel['ã'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1239 */     this.gunModel['ã'].setRotationPoint(-5.5F, -13.0F, 10.75F);
/*      */     
/* 1241 */     this.gunModel['ä'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1242 */     this.gunModel['ä'].setRotationPoint(-20.0F, -13.0F, 10.75F);
/*      */     
/* 1244 */     this.gunModel['å'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1245 */     this.gunModel['å'].setRotationPoint(-19.5F, -13.0F, 10.75F);
/*      */     
/* 1247 */     this.gunModel['æ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 15, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1248 */     this.gunModel['æ'].setRotationPoint(-11.5F, -11.0F, 11.75F);
/*      */     
/* 1250 */     this.gunModel['ç'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1251 */     this.gunModel['ç'].setRotationPoint(-11.5F, -19.75F, 11.75F);
/*      */     
/* 1253 */     this.gunModel['è'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1254 */     this.gunModel['è'].setRotationPoint(98.0F, -27.5F, 3.0F);
/*      */     
/* 1256 */     this.gunModel['é'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1257 */     this.gunModel['é'].setRotationPoint(106.0F, -27.5F, 3.0F);
/*      */     
/* 1259 */     this.gunModel['ê'].addShapeBox(40.0F, -11.0F, -6.0F, 103, 4, 4, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1260 */     this.gunModel['ê'].setRotationPoint(12.0F, -26.5F, 4.0F);
/*      */     
/* 1262 */     this.gunModel['ë'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F);
/* 1263 */     this.gunModel['ë'].setRotationPoint(115.0F, -27.5F, 3.0F);
/*      */     
/* 1265 */     this.gunModel['ì'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1266 */     this.gunModel['ì'].setRotationPoint(116.0F, -27.5F, 3.0F);
/*      */     
/* 1268 */     this.gunModel['í'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F);
/* 1269 */     this.gunModel['í'].setRotationPoint(128.0F, -27.5F, 3.0F);
/*      */     
/* 1271 */     this.gunModel['î'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1272 */     this.gunModel['î'].setRotationPoint(127.5F, -27.5F, 3.0F);
/*      */     
/* 1274 */     this.gunModel['ï'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 6, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 1275 */     this.gunModel['ï'].setRotationPoint(128.0F, -27.5F, 3.0F);
/*      */     
/* 1277 */     this.gunModel['ð'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1278 */     this.gunModel['ð'].setRotationPoint(129.0F, -27.5F, 3.0F);
/*      */     
/* 1280 */     this.gunModel['ñ'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 3, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1281 */     this.gunModel['ñ'].setRotationPoint(82.25F, -24.5F, 1.5F);
/*      */     
/* 1283 */     this.gunModel['ò'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1284 */     this.gunModel['ò'].setRotationPoint(95.0F, -21.5F, 1.5F);
/*      */     
/* 1286 */     this.gunModel['ó'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1287 */     this.gunModel['ó'].setRotationPoint(-7.5F, -12.5F, 12.25F);
/*      */     
/* 1289 */     this.gunModel['ô'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1290 */     this.gunModel['ô'].setRotationPoint(-7.5F, -13.0F, 12.25F);
/*      */     
/* 1292 */     this.gunModel['õ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1293 */     this.gunModel['õ'].setRotationPoint(-7.5F, -12.0F, 12.25F);
/*      */     
/* 1295 */     this.gunModel['ö'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 2, 9, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1296 */     this.gunModel['ö'].setRotationPoint(82.25F, -27.0F, 1.5F);
/*      */     
/* 1298 */     this.gunModel['÷'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 7, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1299 */     this.gunModel['÷'].setRotationPoint(82.25F, -28.0F, 2.5F);
/*      */     
/* 1301 */     this.gunModel['ø'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1302 */     this.gunModel['ø'].setRotationPoint(82.25F, -29.0F, 3.5F);
/*      */     
/* 1304 */     this.gunModel['ù'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1305 */     this.gunModel['ù'].setRotationPoint(82.25F, -30.0F, 3.5F);
/*      */     
/* 1307 */     this.gunModel['ú'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.5F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 1308 */     this.gunModel['ú'].setRotationPoint(97.0F, -30.5F, 3.5F);
/*      */     
/* 1310 */     this.gunModel['û'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1311 */     this.gunModel['û'].setRotationPoint(82.25F, -31.5F, 3.5F);
/*      */     
/* 1313 */     this.gunModel['ü'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1314 */     this.gunModel['ü'].setRotationPoint(82.25F, -30.5F, 3.5F);
/*      */     
/* 1316 */     this.gunModel['ý'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.5F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 1317 */     this.gunModel['ý'].setRotationPoint(97.0F, -31.0F, 3.5F);
/*      */     
/* 1319 */     this.gunModel['þ'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1320 */     this.gunModel['þ'].setRotationPoint(82.25F, -32.5F, 3.5F);
/*      */     
/* 1322 */     this.gunModel['ÿ'].addShapeBox(40.0F, -11.0F, -6.0F, 16, 1, 5, 0.0F, 0.0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1323 */     this.gunModel['ÿ'].setRotationPoint(82.25F, -32.0F, 3.5F);
/*      */     
/* 1325 */     this.gunModel['Ā'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1326 */     this.gunModel['Ā'].setRotationPoint(97.0F, -33.0F, 3.5F);
/*      */     
/* 1328 */     this.gunModel['ā'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 5, 0.0F, 0.5F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1329 */     this.gunModel['ā'].setRotationPoint(82.75F, -33.0F, 3.5F);
/*      */     
/* 1331 */     this.gunModel['Ă'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1332 */     this.gunModel['Ă'].setRotationPoint(91.0F, -20.0F, 3.0F);
/*      */     
/* 1334 */     this.gunModel['ă'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1335 */     this.gunModel['ă'].setRotationPoint(97.0F, -18.5F, 2.5F);
/*      */     
/* 1337 */     this.gunModel['Ą'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1338 */     this.gunModel['Ą'].setRotationPoint(96.5F, -18.5F, 2.5F);
/*      */     
/* 1340 */     this.gunModel['ą'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1341 */     this.gunModel['ą'].setRotationPoint(96.0F, -19.0F, 3.0F);
/*      */     
/* 1343 */     this.gunModel['Ć'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1344 */     this.gunModel['Ć'].setRotationPoint(91.0F, -18.5F, 2.5F);
/*      */     
/* 1346 */     this.gunModel['ć'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
/* 1347 */     this.gunModel['ć'].setRotationPoint(94.0F, -21.5F, 1.5F);
/*      */     
/* 1349 */     this.gunModel['Ĉ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1350 */     this.gunModel['Ĉ'].setRotationPoint(91.0F, -21.5F, 3.0F);
/*      */     
/* 1352 */     this.gunModel['ĉ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1353 */     this.gunModel['ĉ'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1355 */     this.gunModel['Ċ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1356 */     this.gunModel['Ċ'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1358 */     this.gunModel['ċ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1359 */     this.gunModel['ċ'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1361 */     this.gunModel['Č'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1362 */     this.gunModel['Č'].setRotationPoint(95.5F, -30.5F, 3.5F);
/*      */     
/* 1364 */     this.gunModel['č'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1365 */     this.gunModel['č'].setRotationPoint(87.0F, -20.5F, 3.0F);
/*      */     
/* 1367 */     this.gunModel['Ď'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 1368 */     this.gunModel['Ď'].setRotationPoint(87.0F, -19.5F, 3.0F);
/*      */     
/* 1370 */     this.gunModel['ď'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 6, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F);
/* 1371 */     this.gunModel['ď'].setRotationPoint(82.0F, -19.5F, 3.0F);
/*      */     
/* 1373 */     this.gunModel['Đ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 6, 0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1374 */     this.gunModel['Đ'].setRotationPoint(82.0F, -20.5F, 3.0F);
/*      */     
/* 1376 */     this.gunModel['đ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 6, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F);
/* 1377 */     this.gunModel['đ'].setRotationPoint(83.0F, -18.5F, 3.0F);
/*      */     
/* 1379 */     this.gunModel['Ē'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1380 */     this.gunModel['Ē'].setRotationPoint(97.0F, -25.0F, 10.0F);
/*      */     
/* 1382 */     this.gunModel['ē'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1383 */     this.gunModel['ē'].setRotationPoint(94.5F, -25.0F, 10.0F);
/*      */     
/* 1385 */     this.gunModel['Ĕ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1386 */     this.gunModel['Ĕ'].setRotationPoint(95.0F, -25.0F, 11.5F);
/*      */     
/* 1388 */     this.gunModel['ĕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1389 */     this.gunModel['ĕ'].setRotationPoint(97.0F, -25.0F, 0.0F);
/*      */     
/* 1391 */     this.gunModel['Ė'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
/* 1392 */     this.gunModel['Ė'].setRotationPoint(94.5F, -25.0F, 0.0F);
/*      */     
/* 1394 */     this.gunModel['ė'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/* 1395 */     this.gunModel['ė'].setRotationPoint(95.0F, -25.0F, -1.0F);
/*      */     
/* 1397 */     this.gunModel['Ę'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1398 */     this.gunModel['Ę'].setRotationPoint(20.0F, -20.25F, 10.0F);
/*      */     
/* 1400 */     this.gunModel['ę'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1401 */     this.gunModel['ę'].setRotationPoint(22.5F, -18.5F, 11.5F);
/*      */     
/* 1403 */     this.gunModel['Ě'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 1404 */     this.gunModel['Ě'].setRotationPoint(22.5F, -19.0F, 11.5F);
/*      */     
/* 1406 */     this.gunModel['ě'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 1407 */     this.gunModel['ě'].setRotationPoint(22.5F, -18.0F, 11.5F);
/*      */     
/* 1409 */     this.gunModel['Ĝ'].addShapeBox(40.0F, -11.0F, -6.0F, 65, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1410 */     this.gunModel['Ĝ'].setRotationPoint(-53.0F, -28.0F, 10.5F);
/*      */     
/* 1412 */     this.gunModel['ĝ'].addShapeBox(40.0F, -11.0F, -6.0F, 34, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1413 */     this.gunModel['ĝ'].setRotationPoint(-53.0F, -30.0F, 0.5F);
/*      */     
/* 1415 */     this.gunModel['Ğ'].addShapeBox(40.0F, -11.0F, -6.0F, 33, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1416 */     this.gunModel['Ğ'].setRotationPoint(-53.0F, -28.0F, -0.5F);
/*      */     
/* 1418 */     this.gunModel['ğ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 11, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1419 */     this.gunModel['ğ'].setRotationPoint(-45.0F, -6.5F, 0.5F);
/*      */     
/* 1421 */     this.gunModel['Ġ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 11, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1422 */     this.gunModel['Ġ'].setRotationPoint(-38.0F, -6.5F, 0.5F);
/*      */     
/* 1424 */     this.gunModel['ġ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 11, 11, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1425 */     this.gunModel['ġ'].setRotationPoint(-37.0F, -6.5F, 0.5F);
/*      */     
/* 1427 */     this.gunModel['Ģ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1428 */     this.gunModel['Ģ'].setRotationPoint(-48.0F, -6.5F, 0.5F);
/*      */     
/* 1430 */     this.gunModel['ģ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1431 */     this.gunModel['ģ'].setRotationPoint(-49.0F, -6.5F, 1.5F);
/*      */     
/* 1433 */     this.gunModel['Ĥ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F);
/* 1434 */     this.gunModel['Ĥ'].setRotationPoint(-49.0F, -4.5F, 1.5F);
/*      */     
/* 1436 */     this.gunModel['ĥ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F);
/* 1437 */     this.gunModel['ĥ'].setRotationPoint(-48.0F, -4.5F, 0.5F);
/*      */     
/* 1439 */     this.gunModel['Ħ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
/* 1440 */     this.gunModel['Ħ'].setRotationPoint(-49.5F, -2.5F, 1.5F);
/*      */     
/* 1442 */     this.gunModel['ħ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F);
/* 1443 */     this.gunModel['ħ'].setRotationPoint(-48.5F, -2.5F, 0.5F);
/*      */     
/* 1445 */     this.gunModel['Ĩ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.25F, 0.0F, -2.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -2.0F);
/* 1446 */     this.gunModel['Ĩ'].setRotationPoint(-50.5F, -0.5F, 1.5F);
/*      */     
/* 1448 */     this.gunModel['ĩ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, -1.0F);
/* 1449 */     this.gunModel['ĩ'].setRotationPoint(-49.5F, -0.5F, 0.5F);
/*      */     
/* 1451 */     this.gunModel['Ī'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F);
/* 1452 */     this.gunModel['Ī'].setRotationPoint(-51.75F, 1.5F, 1.5F);
/*      */     
/* 1454 */     this.gunModel['ī'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F);
/* 1455 */     this.gunModel['ī'].setRotationPoint(-50.75F, 1.5F, 0.5F);
/*      */     
/* 1457 */     this.gunModel['Ĭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.75F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -2.0F);
/* 1458 */     this.gunModel['Ĭ'].setRotationPoint(-53.25F, 3.5F, 1.5F);
/*      */     
/* 1460 */     this.gunModel['ĭ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.75F, 0.0F, -1.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, -1.0F);
/* 1461 */     this.gunModel['ĭ'].setRotationPoint(-52.25F, 3.5F, 0.5F);
/*      */     
/* 1463 */     this.gunModel['Į'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.25F, 0.0F, -2.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F);
/* 1464 */     this.gunModel['Į'].setRotationPoint(-55.0F, 5.5F, 1.5F);
/*      */     
/* 1466 */     this.gunModel['į'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.25F, 0.0F, -1.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -1.0F);
/* 1467 */     this.gunModel['į'].setRotationPoint(-54.0F, 5.5F, 0.5F);
/*      */     
/* 1469 */     this.gunModel['İ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.25F, 0.0F, -2.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -2.0F);
/* 1470 */     this.gunModel['İ'].setRotationPoint(-57.25F, 8.5F, 1.5F);
/*      */     
/* 1472 */     this.gunModel['ı'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.25F, 0.0F, -1.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 2.25F, 0.0F, -1.0F);
/* 1473 */     this.gunModel['ı'].setRotationPoint(-56.25F, 8.5F, 0.5F);
/*      */     
/* 1475 */     this.gunModel['Ĳ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -2.0F);
/* 1476 */     this.gunModel['Ĳ'].setRotationPoint(-59.5F, 11.5F, 1.5F);
/*      */     
/* 1478 */     this.gunModel['ĳ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -1.0F);
/* 1479 */     this.gunModel['ĳ'].setRotationPoint(-58.5F, 11.5F, 0.5F);
/*      */     
/* 1481 */     this.gunModel['Ĵ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.75F, 0.0F, -2.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.75F, 0.0F, -2.0F);
/* 1482 */     this.gunModel['Ĵ'].setRotationPoint(-62.5F, 15.5F, 1.5F);
/*      */     
/* 1484 */     this.gunModel['ĵ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 2.75F, 0.0F, -1.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.75F, 0.0F, -1.0F);
/* 1485 */     this.gunModel['ĵ'].setRotationPoint(-61.5F, 15.5F, 0.5F);
/*      */     
/* 1487 */     this.gunModel['Ķ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F);
/* 1488 */     this.gunModel['Ķ'].setRotationPoint(-65.25F, 19.5F, 1.5F);
/*      */     
/* 1490 */     this.gunModel['ķ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F);
/* 1491 */     this.gunModel['ķ'].setRotationPoint(-64.25F, 19.5F, 0.5F);
/*      */     
/* 1493 */     this.gunModel['ĸ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 16, 11, 0.0F, -7.75F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, -7.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -8.25F, 0.0F, -3.0F, -8.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1494 */     this.gunModel['ĸ'].setRotationPoint(-50.0F, 7.5F, 0.5F);
/*      */     
/* 1496 */     this.gunModel['Ĺ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, -2.0F, -0.25F, 0.0F, 2.0F, -0.25F, -3.0F, 2.0F, -0.25F, -3.0F, -2.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1497 */     this.gunModel['Ĺ'].setRotationPoint(-42.25F, 5.75F, 0.5F);
/*      */     
/* 1499 */     this.gunModel['ĺ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, -3.0F, 3.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1500 */     this.gunModel['ĺ'].setRotationPoint(-40.25F, 5.0F, 0.5F);
/*      */     
/* 1502 */     this.gunModel['Ļ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1503 */     this.gunModel['Ļ'].setRotationPoint(-45.0F, -4.5F, 0.5F);
/*      */     
/* 1505 */     this.gunModel['ļ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1506 */     this.gunModel['ļ'].setRotationPoint(-45.0F, -2.5F, 0.5F);
/*      */     
/* 1508 */     this.gunModel['Ľ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F);
/* 1509 */     this.gunModel['Ľ'].setRotationPoint(-46.0F, -0.5F, 0.5F);
/*      */     
/* 1511 */     this.gunModel['ľ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F);
/* 1512 */     this.gunModel['ľ'].setRotationPoint(-47.0F, 1.5F, 0.5F);
/*      */     
/* 1514 */     this.gunModel['Ŀ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1515 */     this.gunModel['Ŀ'].setRotationPoint(-48.0F, 3.5F, 0.5F);
/*      */     
/* 1517 */     this.gunModel['ŀ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 11, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F);
/* 1518 */     this.gunModel['ŀ'].setRotationPoint(-50.0F, 5.5F, 0.5F);
/*      */     
/* 1520 */     this.gunModel['Ł'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 11, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F);
/* 1521 */     this.gunModel['Ł'].setRotationPoint(-52.0F, 8.5F, 0.5F);
/*      */     
/* 1523 */     this.gunModel['ł'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 4, 11, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F);
/* 1524 */     this.gunModel['ł'].setRotationPoint(-54.0F, 11.5F, 0.5F);
/*      */     
/* 1526 */     this.gunModel['Ń'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 4, 11, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.25F, 0.0F, 0.0F);
/* 1527 */     this.gunModel['Ń'].setRotationPoint(-57.0F, 15.5F, 0.5F);
/*      */     
/* 1529 */     this.gunModel['ń'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 3, 11, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 4.75F, 0.0F, 0.0F);
/* 1530 */     this.gunModel['ń'].setRotationPoint(-58.0F, 19.5F, 0.5F);
/*      */     
/* 1532 */     this.gunModel['Ņ'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 5, 11, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, -2.25F, 0.0F);
/* 1533 */     this.gunModel['Ņ'].setRotationPoint(-63.0F, 22.5F, 0.5F);
/*      */     
/* 1535 */     this.gunModel['ņ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -1.0F);
/* 1536 */     this.gunModel['ņ'].setRotationPoint(-65.75F, 22.5F, 0.5F);
/*      */     
/* 1538 */     this.gunModel['Ň'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.25F, -2.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -2.25F, -2.0F);
/* 1539 */     this.gunModel['Ň'].setRotationPoint(-66.75F, 22.5F, 1.5F);
/*      */     
/* 1541 */     this.gunModel['ň'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1542 */     this.gunModel['ň'].setRotationPoint(-50.0F, 23.25F, 0.5F);
/*      */     
/* 1544 */     this.gunModel['ŉ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -3.0F, -0.25F, -0.25F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1545 */     this.gunModel['ŉ'].setRotationPoint(-50.0F, 25.0F, 0.5F);
/*      */     
/* 1547 */     this.gunModel['Ŋ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -3.0F, -1.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1548 */     this.gunModel['Ŋ'].setRotationPoint(-50.0F, 27.0F, 0.5F);
/*      */     
/* 1550 */     this.gunModel['ŋ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1551 */     this.gunModel['ŋ'].setRotationPoint(-50.0F, 19.25F, 0.5F);
/*      */     
/* 1553 */     this.gunModel['Ō'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1554 */     this.gunModel['Ō'].setRotationPoint(-49.0F, 15.25F, 0.5F);
/*      */     
/* 1556 */     this.gunModel['ō'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, -1.1F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1557 */     this.gunModel['ō'].setRotationPoint(-47.0F, 11.25F, 0.5F);
/*      */     
/* 1559 */     this.gunModel['Ŏ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 11, 0.0F, 0.0F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, -3.1F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1560 */     this.gunModel['Ŏ'].setRotationPoint(-45.0F, 8.25F, 0.5F);
/*      */     
/* 1562 */     this.gunModel['ŏ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, -2.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1563 */     this.gunModel['ŏ'].setRotationPoint(-45.0F, 6.25F, 0.5F);
/*      */     
/* 1565 */     this.gunModel['Ő'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, -0.25F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1566 */     this.gunModel['Ő'].setRotationPoint(-45.25F, 5.0F, 0.5F);
/*      */     
/* 1568 */     this.gunModel['ő'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 11, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1569 */     this.gunModel['ő'].setRotationPoint(-16.0F, -6.5F, 1.0F);
/*      */     
/* 1571 */     this.gunModel['Œ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1572 */     this.gunModel['Œ'].setRotationPoint(-17.5F, -6.5F, 1.0F);
/*      */     
/* 1574 */     this.gunModel['œ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1575 */     this.gunModel['œ'].setRotationPoint(-19.0F, -6.5F, 1.0F);
/*      */     
/* 1577 */     this.gunModel['Ŕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1578 */     this.gunModel['Ŕ'].setRotationPoint(-17.5F, 1.5F, 1.0F);
/*      */     
/* 1580 */     this.gunModel['ŕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1581 */     this.gunModel['ŕ'].setRotationPoint(-18.5F, 1.5F, 1.0F);
/*      */     
/* 1583 */     this.gunModel['Ŗ'].addShapeBox(40.0F, -11.0F, -6.0F, 14, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1584 */     this.gunModel['Ŗ'].setRotationPoint(-31.5F, 2.5F, 1.0F);
/*      */     
/* 1586 */     this.gunModel['ŗ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 10, 0.0F, -0.5F, 2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 1587 */     this.gunModel['ŗ'].setRotationPoint(-34.5F, 2.5F, 1.0F);
/*      */     
/* 1589 */     this.gunModel['Ř'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1590 */     this.gunModel['Ř'].setRotationPoint(-32.0F, 3.0F, 1.0F);
/*      */     
/* 1592 */     this.gunModel['ř'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1593 */     this.gunModel['ř'].setRotationPoint(-45.0F, -7.5F, 1.0F);
/*      */     
/* 1595 */     this.gunModel['Ś'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 10, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.5F, 2.0F, 0.0F);
/* 1596 */     this.gunModel['Ś'].setRotationPoint(-34.5F, -7.5F, 1.0F);
/*      */     
/* 1598 */     this.gunModel['ś'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1599 */     this.gunModel['ś'].setRotationPoint(-32.0F, -7.0F, 1.0F);
/*      */     
/* 1601 */     this.gunModel['Ŝ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1602 */     this.gunModel['Ŝ'].setRotationPoint(-29.5F, -6.5F, 3.5F);
/*      */     
/* 1604 */     this.gunModel['ŝ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1605 */     this.gunModel['ŝ'].setRotationPoint(-29.5F, -5.0F, 3.5F);
/*      */     
/* 1607 */     this.gunModel['Ş'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1608 */     this.gunModel['Ş'].setRotationPoint(-29.75F, -3.5F, 3.5F);
/*      */     
/* 1610 */     this.gunModel['ş'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1611 */     this.gunModel['ş'].setRotationPoint(-29.75F, -2.0F, 3.5F);
/*      */     
/* 1613 */     this.gunModel['Š'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1614 */     this.gunModel['Š'].setRotationPoint(-29.75F, -0.5F, 3.5F);
/*      */     
/* 1616 */     this.gunModel['š'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1617 */     this.gunModel['š'].setRotationPoint(-28.75F, 0.5F, 3.5F);
/*      */     
/* 1619 */     this.gunModel['Ţ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1620 */     this.gunModel['Ţ'].setRotationPoint(-48.0F, -7.5F, 0.5F);
/*      */     
/* 1622 */     this.gunModel['ţ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1623 */     this.gunModel['ţ'].setRotationPoint(-49.0F, -7.5F, 1.5F);
/*      */     
/* 1625 */     this.gunModel['Ť'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1626 */     this.gunModel['Ť'].setRotationPoint(-48.0F, -9.0F, 0.5F);
/*      */     
/* 1628 */     this.gunModel['ť'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.5F, -0.25F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1629 */     this.gunModel['ť'].setRotationPoint(-49.0F, -9.0F, 1.5F);
/*      */     
/* 1631 */     this.gunModel['Ŧ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 1.5F, 0.0F, -2.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1632 */     this.gunModel['Ŧ'].setRotationPoint(-49.5F, -10.75F, 1.5F);
/*      */     
/* 1634 */     this.gunModel['ŧ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1635 */     this.gunModel['ŧ'].setRotationPoint(-48.5F, -10.75F, 0.5F);
/*      */     
/* 1637 */     this.gunModel['Ũ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 2.5F, -0.5F, -2.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, 2.5F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1638 */     this.gunModel['Ũ'].setRotationPoint(-51.0F, -12.75F, 1.5F);
/*      */     
/* 1640 */     this.gunModel['ũ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 2.5F, -0.5F, -1.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, 2.5F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/* 1641 */     this.gunModel['ũ'].setRotationPoint(-50.0F, -12.75F, 0.5F);
/*      */     
/* 1643 */     this.gunModel['Ū'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 9, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, -0.5F, -0.25F, -2.0F);
/* 1644 */     this.gunModel['Ū'].setRotationPoint(-58.5F, -13.0F, 1.5F);
/*      */     
/* 1646 */     this.gunModel['ū'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 11, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, -0.5F, -0.25F, -1.0F);
/* 1647 */     this.gunModel['ū'].setRotationPoint(-58.5F, -15.5F, 0.5F);
/*      */     
/* 1649 */     this.gunModel['Ŭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1650 */     this.gunModel['Ŭ'].setRotationPoint(-53.5F, -13.0F, 1.5F);
/*      */     
/* 1652 */     this.gunModel['ŭ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, -4.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F);
/* 1653 */     this.gunModel['ŭ'].setRotationPoint(-53.5F, -15.0F, 0.5F);
/*      */     
/* 1655 */     this.gunModel['Ů'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, 0.0F, -0.25F, -0.7F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -1.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1656 */     this.gunModel['Ů'].setRotationPoint(-52.5F, -13.0F, 0.5F);
/*      */     
/* 1658 */     this.gunModel['ů'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 11, 0.0F, 2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1659 */     this.gunModel['ů'].setRotationPoint(-50.0F, -18.5F, 0.5F);
/*      */     
/* 1661 */     this.gunModel['Ű'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 2, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1662 */     this.gunModel['Ű'].setRotationPoint(-58.0F, -17.0F, 0.5F);
/*      */     
/* 1664 */     this.gunModel['ű'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 11, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F);
/* 1665 */     this.gunModel['ű'].setRotationPoint(-53.0F, -15.5F, 0.5F);
/*      */     
/* 1667 */     this.gunModel['Ų'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 11, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/* 1668 */     this.gunModel['Ų'].setRotationPoint(-49.0F, -13.0F, 0.5F);
/*      */     
/* 1670 */     this.gunModel['ų'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 11, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/* 1671 */     this.gunModel['ų'].setRotationPoint(-49.0F, -12.5F, 0.5F);
/*      */     
/* 1673 */     this.gunModel['Ŵ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 11, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, -0.75F, 0.0F, -3.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.5F, -0.25F, 0.0F);
/* 1674 */     this.gunModel['Ŵ'].setRotationPoint(-49.0F, -11.5F, 0.5F);
/*      */     
/* 1676 */     this.gunModel['ŵ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 11, 0.0F, -3.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -3.5F, -0.75F, 0.0F, -4.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -4.0F, -0.75F, 0.0F);
/* 1677 */     this.gunModel['ŵ'].setRotationPoint(-49.0F, -9.5F, 0.5F);
/*      */     
/* 1679 */     this.gunModel['Ŷ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 9, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F);
/* 1680 */     this.gunModel['Ŷ'].setRotationPoint(-48.0F, -7.0F, 2.0F);
/*      */     
/* 1682 */     this.gunModel['ŷ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F);
/* 1683 */     this.gunModel['ŷ'].setRotationPoint(-49.0F, -7.0F, 3.0F);
/*      */     
/* 1685 */     this.gunModel['Ÿ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1686 */     this.gunModel['Ÿ'].setRotationPoint(-46.25F, -32.75F, 1.5F);
/*      */     
/* 1688 */     this.gunModel['Ź'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1689 */     this.gunModel['Ź'].setRotationPoint(-45.75F, -31.75F, 1.5F);
/*      */     
/* 1691 */     this.gunModel['ź'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1692 */     this.gunModel['ź'].setRotationPoint(-44.75F, -31.75F, 1.5F);
/*      */     
/* 1694 */     this.gunModel['Ż'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1695 */     this.gunModel['Ż'].setRotationPoint(-45.25F, -31.75F, 1.5F);
/*      */     
/* 1697 */     this.gunModel['ż'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, -0.25F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1698 */     this.gunModel['ż'].setRotationPoint(-47.25F, -32.75F, 1.5F);
/*      */     
/* 1700 */     this.gunModel['Ž'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F);
/* 1701 */     this.gunModel['Ž'].setRotationPoint(-44.75F, -34.75F, 2.5F);
/*      */     
/* 1703 */     this.gunModel['ž'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 3, 9, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -1.75F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1704 */     this.gunModel['ž'].setRotationPoint(-56.0F, -32.75F, 1.5F);
/*      */     
/* 1706 */     this.gunModel['ſ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 9, 0.0F, -0.75F, -1.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/* 1707 */     this.gunModel['ſ'].setRotationPoint(-47.25F, -33.25F, 1.5F);
/*      */     
/* 1709 */     this.gunModel['ƀ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, -0.25F, 1.25F, -1.5F, -0.25F, 1.25F, -1.5F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1710 */     this.gunModel['ƀ'].setRotationPoint(-58.0F, -20.0F, 0.5F);
/*      */     
/* 1712 */     this.gunModel['Ɓ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 11, 0.0F, 0.0F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1713 */     this.gunModel['Ɓ'].setRotationPoint(-58.0F, -18.5F, 0.5F);
/*      */     
/* 1715 */     this.gunModel['Ƃ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, -0.25F, 1.75F, -0.5F, -0.25F, 1.75F, -0.5F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 1716 */     this.gunModel['Ƃ'].setRotationPoint(-58.0F, -20.75F, 0.5F);
/*      */     
/* 1718 */     this.gunModel['ƃ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 11, 0.0F, 0.0F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, -0.5F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F);
/* 1719 */     this.gunModel['ƃ'].setRotationPoint(-58.0F, -21.5F, 0.5F);
/*      */     
/* 1721 */     this.gunModel['Ƅ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 11, 0.0F, 0.0F, -0.5F, 2.25F, -1.5F, -0.5F, 2.25F, -1.5F, -0.5F, 2.25F, 0.0F, -0.5F, 2.25F, 0.0F, -0.75F, 2.0F, -0.25F, -0.75F, 2.0F, -0.25F, -0.75F, 2.0F, 0.0F, -0.75F, 2.0F);
/* 1722 */     this.gunModel['Ƅ'].setRotationPoint(-58.0F, -23.5F, 0.5F);
/*      */     
/* 1724 */     this.gunModel['ƅ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 12, 0.0F, 0.0F, -0.5F, 1.75F, -2.25F, -0.5F, 1.75F, -2.25F, -0.5F, 1.75F, 0.0F, -0.5F, 1.75F, 0.0F, -0.75F, 1.75F, -1.5F, -0.75F, 1.75F, -1.5F, -0.75F, 1.75F, 0.0F, -0.75F, 1.75F);
/* 1725 */     this.gunModel['ƅ'].setRotationPoint(-58.0F, -25.24F, 0.0F);
/*      */     
/* 1727 */     this.gunModel['Ɔ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 9, 0.0F, 0.0F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, -0.5F, 3.25F, -2.25F, -0.5F, 3.25F, -2.25F, -0.5F, 3.25F, 0.0F, -0.5F, 3.25F);
/* 1728 */     this.gunModel['Ɔ'].setRotationPoint(-58.0F, -29.25F, 1.5F);
/*      */     
/* 1730 */     this.gunModel['Ƈ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 4, 10, 0.0F, 0.0F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, -2.25F, -0.5F, 2.75F, 0.0F, -0.5F, 2.75F);
/* 1731 */     this.gunModel['Ƈ'].setRotationPoint(-58.0F, -28.25F, 1.0F);
/*      */     
/* 1733 */     this.gunModel['ƈ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 9, 0.0F, 0.0F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, -2.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, -2.25F, 0.5F, 2.0F, 0.0F, 0.5F, 2.0F);
/* 1734 */     this.gunModel['ƈ'].setRotationPoint(-58.0F, -31.25F, 1.5F);
/*      */     
/* 1736 */     this.gunModel['Ɖ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 11, 0.0F, 3.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 3.25F, -0.25F, 0.0F, 2.25F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 2.25F, -0.75F, 0.0F);
/* 1737 */     this.gunModel['Ɖ'].setRotationPoint(-50.0F, -19.5F, 0.5F);
/*      */     
/* 1739 */     this.gunModel['Ɗ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.75F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/* 1740 */     this.gunModel['Ɗ'].setRotationPoint(-48.0F, -21.25F, 0.5F);
/*      */     
/* 1742 */     this.gunModel['Ƌ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 2.0F, -0.25F, 1.25F, -1.75F, -0.25F, 1.25F, -1.75F, -0.25F, 1.25F, 2.0F, -0.25F, 1.25F, -0.5F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 1743 */     this.gunModel['Ƌ'].setRotationPoint(-50.0F, -21.25F, 0.5F);
/*      */     
/* 1745 */     this.gunModel['ƌ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 11, 0.0F, 1.25F, -0.25F, 2.0F, -2.0F, -0.25F, 2.0F, -2.0F, -0.25F, 2.0F, 1.25F, -0.25F, 2.0F, 0.0F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0.0F, -0.25F, 1.25F);
/* 1746 */     this.gunModel['ƌ'].setRotationPoint(-52.0F, -22.75F, 0.5F);
/*      */     
/* 1748 */     this.gunModel['ƍ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.5F, -0.25F, 2.5F, -0.75F, -0.25F, 2.5F, -0.75F, -0.25F, 2.5F, 0.5F, -0.25F, 2.5F, -0.25F, -0.25F, 2.0F, 0.5F, -0.25F, 2.0F, 0.5F, -0.25F, 2.0F, -0.25F, -0.25F, 2.0F);
/* 1749 */     this.gunModel['ƍ'].setRotationPoint(-53.5F, -24.25F, 0.5F);
/*      */     
/* 1751 */     this.gunModel['Ǝ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.75F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.5F, 0.5F, 0.25F, 2.5F, -0.75F, 0.25F, 2.5F, -0.75F, 0.25F, 2.5F, 0.5F, 0.25F, 2.5F);
/* 1752 */     this.gunModel['Ǝ'].setRotationPoint(-53.5F, -26.25F, 0.5F);
/*      */     
/* 1754 */     this.gunModel['Ə'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 11, 0.0F, 0.75F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, -1.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.5F, 0.75F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.5F);
/* 1755 */     this.gunModel['Ə'].setRotationPoint(-53.5F, -27.25F, 0.5F);
/*      */     
/* 1757 */     this.gunModel['Ɛ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, 0.75F, -0.25F, 1.5F, -1.0F, -0.25F, 1.5F, -1.0F, -0.25F, 1.5F, 0.75F, -0.25F, 1.5F, 0.75F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, -1.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.5F);
/* 1758 */     this.gunModel['Ɛ'].setRotationPoint(-53.5F, -29.25F, 0.5F);
/*      */     
/* 1760 */     this.gunModel['Ƒ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 11, 0.0F, 0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, 0.25F, 1.5F, -1.0F, 0.25F, 1.5F, -1.0F, 0.25F, 1.5F, 0.75F, 0.25F, 1.5F);
/* 1761 */     this.gunModel['Ƒ'].setRotationPoint(-53.5F, -30.25F, 0.5F);
/*      */     
/* 1763 */     this.gunModel['ƒ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1764 */     this.gunModel['ƒ'].setRotationPoint(-55.25F, -27.25F, 0.5F);
/*      */     
/* 1766 */     this.gunModel['Ɠ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 3, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1767 */     this.gunModel['Ɠ'].setRotationPoint(-54.25F, -22.25F, 0.5F);
/*      */     
/* 1769 */     this.gunModel['Ɣ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 6, 11, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1770 */     this.gunModel['Ɣ'].setRotationPoint(-54.25F, -27.75F, 0.5F);
/*      */     
/* 1772 */     this.gunModel['ƕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.75F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.75F, -0.5F, 1.25F, 1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F);
/* 1773 */     this.gunModel['ƕ'].setRotationPoint(-41.5F, -37.0F, 2.5F);
/*      */     
/* 1775 */     this.gunModel['Ɩ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.5F, 1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.25F);
/* 1776 */     this.gunModel['Ɩ'].setRotationPoint(-41.5F, -37.5F, 2.5F);
/*      */     
/* 1778 */     this.gunModel['Ɨ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.75F, -0.5F, 0.25F);
/* 1779 */     this.gunModel['Ɨ'].setRotationPoint(-41.5F, -37.0F, 1.5F);
/*      */     
/* 1781 */     this.gunModel['Ƙ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F);
/* 1782 */     this.gunModel['Ƙ'].setRotationPoint(-44.0F, -35.75F, 2.5F);
/*      */     
/* 1784 */     this.gunModel['ƙ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1785 */     this.gunModel['ƙ'].setRotationPoint(-55.25F, -28.75F, 0.5F);
/*      */     
/* 1787 */     this.gunModel['ƚ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 1788 */     this.gunModel['ƚ'].setRotationPoint(-55.25F, -30.25F, 0.5F);
/*      */     
/* 1790 */     this.gunModel['ƛ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 7, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1791 */     this.gunModel['ƛ'].setRotationPoint(-50.75F, -35.75F, 2.5F);
/*      */     
/* 1793 */     this.gunModel['Ɯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1794 */     this.gunModel['Ɯ'].setRotationPoint(-51.75F, -35.75F, 2.5F);
/*      */     
/* 1796 */     this.gunModel['Ɲ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F);
/* 1797 */     this.gunModel['Ɲ'].setRotationPoint(-53.75F, -35.75F, 2.5F);
/*      */     
/* 1799 */     this.gunModel['ƞ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -1.25F);
/* 1800 */     this.gunModel['ƞ'].setRotationPoint(-54.75F, -35.75F, 3.5F);
/*      */     
/* 1802 */     this.gunModel['Ɵ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 9, 0.0F, -0.25F, -1.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1803 */     this.gunModel['Ɵ'].setRotationPoint(-48.0F, -32.75F, 1.5F);
/*      */     
/* 1805 */     this.gunModel['Ơ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 7, 0.0F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -1.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F);
/* 1806 */     this.gunModel['Ơ'].setRotationPoint(-47.75F, -34.75F, 2.5F);
/*      */     
/* 1808 */     this.gunModel['ơ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/* 1809 */     this.gunModel['ơ'].setRotationPoint(-46.25F, -34.75F, 2.5F);
/*      */     
/* 1811 */     this.gunModel['Ƣ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 7, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, 0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -1.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1812 */     this.gunModel['Ƣ'].setRotationPoint(-45.75F, -34.75F, 2.5F);
/*      */     
/* 1814 */     this.gunModel['ƣ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1815 */     this.gunModel['ƣ'].setRotationPoint(-45.75F, -34.75F, 3.0F);
/*      */     
/* 1817 */     this.gunModel['Ƥ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1818 */     this.gunModel['Ƥ'].setRotationPoint(-48.75F, -33.75F, 2.0F);
/*      */     
/* 1820 */     this.gunModel['ƥ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 8, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F);
/* 1821 */     this.gunModel['ƥ'].setRotationPoint(-50.75F, -33.75F, 2.0F);
/*      */     
/* 1823 */     this.gunModel['Ʀ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.25F, -0.25F, 1.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.25F, -0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.25F, 0.25F, 1.0F);
/* 1824 */     this.gunModel['Ʀ'].setRotationPoint(-51.75F, -33.75F, 1.0F);
/*      */     
/* 1826 */     this.gunModel['Ƨ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 1.25F, -0.25F, 1.0F, 0.25F, -0.25F, 1.0F, 0.25F, -0.25F, 1.0F, 1.25F, -0.25F, 1.0F, 1.25F, 0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 0.25F, 0.25F, 1.0F, 1.25F, 0.25F, 1.0F);
/* 1827 */     this.gunModel['Ƨ'].setRotationPoint(-53.25F, -33.75F, 1.0F);
/*      */     
/* 1829 */     this.gunModel['ƨ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, -0.25F, -0.5F, 0.5F, -0.25F, 1.0F, 0.5F, -0.25F, 1.0F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.5F, 0.25F, 1.0F, 0.5F, 0.25F, 1.0F, 0.0F, 0.25F, -0.5F);
/* 1830 */     this.gunModel['ƨ'].setRotationPoint(-56.0F, -33.75F, 1.0F);
/*      */     
/* 1832 */     this.gunModel['Ʃ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, -1.5F, -0.25F, -0.25F, 1.0F, -0.25F, -0.25F, 1.0F, 0.0F, -0.25F, -1.5F, 0.0F, 0.25F, -1.5F, -0.25F, 0.25F, 1.0F, -0.25F, 0.25F, 1.0F, 0.0F, 0.25F, -1.5F);
/* 1833 */     this.gunModel['Ʃ'].setRotationPoint(-56.75F, -33.75F, 2.5F);
/*      */     
/* 1835 */     this.gunModel['ƪ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 8, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F);
/* 1836 */     this.gunModel['ƪ'].setRotationPoint(-52.75F, -35.25F, 2.0F);
/*      */     
/* 1838 */     this.gunModel['ƫ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.75F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.75F, -0.5F, 1.5F, 0.75F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.75F, 0.25F, 1.5F);
/* 1839 */     this.gunModel['ƫ'].setRotationPoint(-53.75F, -35.25F, 2.0F);
/*      */     
/* 1841 */     this.gunModel['Ƭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 0.0F);
/* 1842 */     this.gunModel['Ƭ'].setRotationPoint(-55.5F, -35.25F, 2.0F);
/*      */     
/* 1844 */     this.gunModel['ƭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, 1.5F, -0.5F, 0.25F, 1.5F, 0.0F, 0.25F, -1.0F);
/* 1845 */     this.gunModel['ƭ'].setRotationPoint(-56.0F, -35.25F, 3.5F);
/*      */     
/* 1847 */     this.gunModel['Ʈ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.75F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 2.5F, 0.75F, -0.25F, 2.0F, 0.75F, 0.25F, 1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.5F, 0.75F, 0.25F, 2.0F);
/* 1848 */     this.gunModel['Ʈ'].setRotationPoint(-53.75F, -34.75F, 2.0F);
/*      */     
/* 1850 */     this.gunModel['Ư'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 0.5F);
/* 1851 */     this.gunModel['Ư'].setRotationPoint(-55.5F, -34.75F, 2.0F);
/*      */     
/* 1853 */     this.gunModel['ư'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 1.0F);
/* 1854 */     this.gunModel['ư'].setRotationPoint(-51.75F, -35.25F, 3.0F);
/*      */     
/* 1856 */     this.gunModel['Ʊ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F);
/* 1857 */     this.gunModel['Ʊ'].setRotationPoint(-50.75F, -35.25F, 3.0F);
/*      */     
/* 1859 */     this.gunModel['Ʋ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1860 */     this.gunModel['Ʋ'].setRotationPoint(-50.75F, -34.75F, 3.0F);
/*      */     
/* 1862 */     this.gunModel['Ƴ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.75F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.75F, -0.5F, 1.5F, 0.75F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.75F, 0.0F, 1.5F);
/* 1863 */     this.gunModel['Ƴ'].setRotationPoint(-53.75F, -33.0F, 2.0F);
/*      */     
/* 1865 */     this.gunModel['ƴ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F);
/* 1866 */     this.gunModel['ƴ'].setRotationPoint(-55.5F, -33.0F, 2.0F);
/*      */     
/* 1868 */     this.gunModel['Ƶ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, -0.5F, -1.0F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F);
/* 1869 */     this.gunModel['Ƶ'].setRotationPoint(-56.0F, -33.0F, 3.5F);
/*      */     
/* 1871 */     this.gunModel['ƶ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F);
/* 1872 */     this.gunModel['ƶ'].setRotationPoint(-52.75F, -33.0F, 2.0F);
/*      */     
/* 1874 */     this.gunModel['Ʒ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F);
/* 1875 */     this.gunModel['Ʒ'].setRotationPoint(-51.75F, -33.0F, 3.0F);
/*      */     
/* 1877 */     this.gunModel['Ƹ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1878 */     this.gunModel['Ƹ'].setRotationPoint(-50.75F, -34.0F, 3.0F);
/*      */     
/* 1880 */     this.gunModel['ƹ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1881 */     this.gunModel['ƹ'].setRotationPoint(-50.75F, -32.75F, 3.0F);
/*      */     
/* 1883 */     this.gunModel['ƺ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F);
/* 1884 */     this.gunModel['ƺ'].setRotationPoint(-50.75F, -34.25F, 10.5F);
/*      */     
/* 1886 */     this.gunModel['ƻ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 1887 */     this.gunModel['ƻ'].setRotationPoint(-51.75F, -34.25F, 10.25F);
/*      */     
/* 1889 */     this.gunModel['Ƽ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F);
/* 1890 */     this.gunModel['Ƽ'].setRotationPoint(-50.75F, -34.25F, 10.75F);
/*      */     
/* 1892 */     this.gunModel['ƽ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F);
/* 1893 */     this.gunModel['ƽ'].setRotationPoint(-50.75F, -33.25F, 10.75F);
/*      */     
/* 1895 */     this.gunModel['ƾ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F);
/* 1896 */     this.gunModel['ƾ'].setRotationPoint(-51.5F, -34.25F, 11.75F);
/*      */     
/* 1898 */     this.gunModel['ƿ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F);
/* 1899 */     this.gunModel['ƿ'].setRotationPoint(-51.5F, -33.25F, 11.75F);
/*      */     
/* 1901 */     this.gunModel['ǀ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1902 */     this.gunModel['ǀ'].setRotationPoint(-75.0F, -28.5F, 2.0F);
/*      */     
/* 1904 */     this.gunModel['ǁ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1905 */     this.gunModel['ǁ'].setRotationPoint(-75.0F, -25.5F, 2.0F);
/*      */     
/* 1907 */     this.gunModel['ǂ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1908 */     this.gunModel['ǂ'].setRotationPoint(-75.0F, -22.5F, 2.0F);
/*      */     
/* 1910 */     this.gunModel['ǃ'].addShapeBox(40.0F, -11.0F, -6.0F, 60, 2, 11, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1911 */     this.gunModel['ǃ'].setRotationPoint(-135.0F, -28.5F, 0.5F);
/*      */     
/* 1913 */     this.gunModel['Ǆ'].addShapeBox(40.0F, -11.0F, -6.0F, 60, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1914 */     this.gunModel['Ǆ'].setRotationPoint(-135.0F, -29.5F, 2.5F);
/*      */     
/* 1916 */     this.gunModel['ǅ'].addShapeBox(40.0F, -11.0F, -6.0F, 52, 3, 11, 0.0F, 0.0F, 0.0F, -0.5F, 8.0F, 0.0F, -0.5F, 8.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1917 */     this.gunModel['ǅ'].setRotationPoint(-135.0F, -26.5F, 0.5F);
/*      */     
/* 1919 */     this.gunModel['ǆ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 3, 0.0F, 0.0F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1920 */     this.gunModel['ǆ'].setRotationPoint(-75.0F, -19.5F, 5.0F);
/*      */     
/* 1922 */     this.gunModel['Ǉ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1923 */     this.gunModel['Ǉ'].setRotationPoint(-75.0F, -20.0F, 5.0F);
/*      */     
/* 1925 */     this.gunModel['ǈ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 5, 4, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1926 */     this.gunModel['ǈ'].setRotationPoint(-82.0F, -19.5F, 4.5F);
/*      */     
/* 1928 */     this.gunModel['ǉ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 5, 4, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1929 */     this.gunModel['ǉ'].setRotationPoint(-85.0F, -19.5F, 4.5F);
/*      */     
/* 1931 */     this.gunModel['Ǌ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 5, 4, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 3.75F, 0.0F);
/* 1932 */     this.gunModel['Ǌ'].setRotationPoint(-87.0F, -18.5F, 4.5F);
/*      */     
/* 1934 */     this.gunModel['ǋ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 5, 4, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F);
/* 1935 */     this.gunModel['ǋ'].setRotationPoint(-89.0F, -17.5F, 4.5F);
/*      */     
/* 1937 */     this.gunModel['ǌ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 4, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, -3.75F, 0.0F, -0.75F, -3.75F, 0.0F, -0.75F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F);
/* 1938 */     this.gunModel['ǌ'].setRotationPoint(-89.0F, -7.0F, 4.5F);
/*      */     
/* 1940 */     this.gunModel['Ǎ'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 6, 4, 0.0F, -2.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F, -4.75F, 0.0F, -2.0F, -4.75F, 0.0F, 2.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 2.0F, 2.75F, 0.0F);
/* 1941 */     this.gunModel['Ǎ'].setRotationPoint(-101.0F, -17.5F, 4.5F);
/*      */     
/* 1943 */     this.gunModel['ǎ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 22, 7, 0.0F, -14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, -14.0F, -4.75F, 0.0F, 6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, 6.0F, 2.75F, 0.0F);
/* 1944 */     this.gunModel['ǎ'].setRotationPoint(-124.0F, -17.5F, 2.5F);
/*      */     
/* 1946 */     this.gunModel['Ǐ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 22, 7, 0.0F, -14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, -14.0F, -4.75F, 0.0F, 6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, 6.0F, 2.75F, 0.0F);
/* 1947 */     this.gunModel['Ǐ'].setRotationPoint(-115.0F, -17.5F, 2.5F);
/*      */     
/* 1949 */     this.gunModel['ǐ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1950 */     this.gunModel['ǐ'].setRotationPoint(-109.0F, -12.75F, 2.5F);
/*      */     
/* 1952 */     this.gunModel['Ǒ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1953 */     this.gunModel['Ǒ'].setRotationPoint(-110.0F, -11.75F, 2.5F);
/*      */     
/* 1955 */     this.gunModel['ǒ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1956 */     this.gunModel['ǒ'].setRotationPoint(-111.0F, -10.75F, 2.5F);
/*      */     
/* 1958 */     this.gunModel['Ǔ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1959 */     this.gunModel['Ǔ'].setRotationPoint(-112.0F, -9.75F, 2.5F);
/*      */     
/* 1961 */     this.gunModel['ǔ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1962 */     this.gunModel['ǔ'].setRotationPoint(-113.0F, -8.75F, 2.5F);
/*      */     
/* 1964 */     this.gunModel['Ǖ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1965 */     this.gunModel['Ǖ'].setRotationPoint(-114.0F, -7.75F, 2.5F);
/*      */     
/* 1967 */     this.gunModel['ǖ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1968 */     this.gunModel['ǖ'].setRotationPoint(-115.0F, -6.75F, 2.5F);
/*      */     
/* 1970 */     this.gunModel['Ǘ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1971 */     this.gunModel['Ǘ'].setRotationPoint(-116.0F, -5.75F, 2.5F);
/*      */     
/* 1973 */     this.gunModel['ǘ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1974 */     this.gunModel['ǘ'].setRotationPoint(-117.0F, -4.75F, 2.5F);
/*      */     
/* 1976 */     this.gunModel['Ǚ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1977 */     this.gunModel['Ǚ'].setRotationPoint(-118.0F, -3.75F, 2.5F);
/*      */     
/* 1979 */     this.gunModel['ǚ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1980 */     this.gunModel['ǚ'].setRotationPoint(-119.0F, -2.75F, 2.5F);
/*      */     
/* 1982 */     this.gunModel['Ǜ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1983 */     this.gunModel['Ǜ'].setRotationPoint(-120.0F, -1.75F, 2.5F);
/*      */     
/* 1985 */     this.gunModel['ǜ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1986 */     this.gunModel['ǜ'].setRotationPoint(-121.0F, -0.75F, 2.5F);
/*      */     
/* 1988 */     this.gunModel['ǝ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1989 */     this.gunModel['ǝ'].setRotationPoint(-122.0F, 0.25F, 2.5F);
/*      */     
/* 1991 */     this.gunModel['Ǟ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1992 */     this.gunModel['Ǟ'].setRotationPoint(-123.0F, 1.25F, 2.5F);
/*      */     
/* 1994 */     this.gunModel['ǟ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1995 */     this.gunModel['ǟ'].setRotationPoint(-124.0F, 2.25F, 2.5F);
/*      */     
/* 1997 */     this.gunModel['Ǡ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1998 */     this.gunModel['Ǡ'].setRotationPoint(-125.0F, 3.25F, 2.5F);
/*      */     
/* 2000 */     this.gunModel['ǡ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2001 */     this.gunModel['ǡ'].setRotationPoint(-126.0F, 4.25F, 2.5F);
/*      */     
/* 2003 */     this.gunModel['Ǣ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2004 */     this.gunModel['Ǣ'].setRotationPoint(-127.0F, 5.25F, 2.5F);
/*      */     
/* 2006 */     this.gunModel['ǣ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2007 */     this.gunModel['ǣ'].setRotationPoint(-128.0F, 6.25F, 2.5F);
/*      */     
/* 2009 */     this.gunModel['Ǥ'].addShapeBox(40.0F, -11.0F, -6.0F, 10, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2010 */     this.gunModel['Ǥ'].setRotationPoint(-130.0F, 7.25F, 2.5F);
/*      */     
/* 2012 */     this.gunModel['ǥ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2013 */     this.gunModel['ǥ'].setRotationPoint(-114.0F, -12.75F, 2.5F);
/*      */     
/* 2015 */     this.gunModel['Ǧ'].addShapeBox(40.0F, -11.0F, -6.0F, 19, 1, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2016 */     this.gunModel['Ǧ'].setRotationPoint(-133.0F, -11.75F, 2.5F);
/*      */     
/* 2018 */     this.gunModel['ǧ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2019 */     this.gunModel['ǧ'].setRotationPoint(-115.0F, -12.75F, 2.5F);
/*      */     
/* 2021 */     this.gunModel['Ǩ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, -0.7F, -2.0F, 0.0F, -0.7F, -2.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2022 */     this.gunModel['Ǩ'].setRotationPoint(-128.5F, -12.75F, 2.5F);
/*      */     
/* 2024 */     this.gunModel['ǩ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 15, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2025 */     this.gunModel['ǩ'].setRotationPoint(-133.0F, -10.25F, 2.5F);
/*      */     
/* 2027 */     this.gunModel['Ǫ'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 7, 0.0F, 0.8F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 1.5F, 0.5F, 0.0F, 0.8F, 0.5F, 0.0F, 0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F);
/* 2028 */     this.gunModel['Ǫ'].setRotationPoint(-129.0F, -6.75F, 2.5F);
/*      */     
/* 2030 */     this.gunModel['ǫ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2031 */     this.gunModel['ǫ'].setRotationPoint(-114.0F, -10.75F, 2.5F);
/*      */     
/* 2033 */     this.gunModel['Ǭ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2034 */     this.gunModel['Ǭ'].setRotationPoint(-119.0F, -5.75F, 2.5F);
/*      */     
/* 2036 */     this.gunModel['ǭ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 7, 0.0F, 0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
/* 2037 */     this.gunModel['ǭ'].setRotationPoint(-129.0F, -1.75F, 2.5F);
/*      */     
/* 2039 */     this.gunModel['Ǯ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2040 */     this.gunModel['Ǯ'].setRotationPoint(-124.0F, -0.75F, 2.5F);
/*      */     
/* 2042 */     this.gunModel['ǯ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2043 */     this.gunModel['ǯ'].setRotationPoint(-131.0F, 4.75F, 2.5F);
/*      */     
/* 2045 */     this.gunModel['ǰ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 22, 5, 0.0F, -14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, 14.0F, -4.75F, 0.0F, -14.0F, -4.75F, 0.0F, 6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, -6.0F, 2.75F, 0.0F, 6.0F, 2.75F, 0.0F);
/* 2046 */     this.gunModel['ǰ'].setRotationPoint(-122.0F, -17.5F, 3.5F);
/*      */     
/* 2048 */     this.gunModel['Ǳ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2049 */     this.gunModel['Ǳ'].setRotationPoint(-109.0F, -12.75F, 8.5F);
/*      */     
/* 2051 */     this.gunModel['ǲ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 15, 6, 0.0F, 0.0F, 0.5F, 0.0F, 16.0F, 0.5F, 0.0F, 16.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2052 */     this.gunModel['ǲ'].setRotationPoint(-130.0F, -10.25F, 3.0F);
/*      */     
/* 2054 */     this.gunModel['ǳ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2055 */     this.gunModel['ǳ'].setRotationPoint(-122.0F, -2.75F, 2.5F);
/*      */   }
/*      */   
/*      */   private void initgunModel_2()
/*      */   {
/* 2060 */     this.gunModel['Ǵ'] = new ModelRendererTurbo(this, 889, 113, this.textureX, this.textureY);
/* 2061 */     this.gunModel['ǵ'] = new ModelRendererTurbo(this, 1073, 113, this.textureX, this.textureY);
/* 2062 */     this.gunModel['Ƕ'] = new ModelRendererTurbo(this, 1081, 113, this.textureX, this.textureY);
/* 2063 */     this.gunModel['Ƿ'] = new ModelRendererTurbo(this, 897, 121, this.textureX, this.textureY);
/* 2064 */     this.gunModel['Ǹ'] = new ModelRendererTurbo(this, 1201, 121, this.textureX, this.textureY);
/* 2065 */     this.gunModel['ǹ'] = new ModelRendererTurbo(this, 1337, 121, this.textureX, this.textureY);
/* 2066 */     this.gunModel['Ǻ'] = new ModelRendererTurbo(this, 1465, 121, this.textureX, this.textureY);
/* 2067 */     this.gunModel['ǻ'] = new ModelRendererTurbo(this, 1593, 121, this.textureX, this.textureY);
/* 2068 */     this.gunModel['Ǽ'] = new ModelRendererTurbo(this, 1137, 97, this.textureX, this.textureY);
/* 2069 */     this.gunModel['ǽ'] = new ModelRendererTurbo(this, 1745, 113, this.textureX, this.textureY);
/* 2070 */     this.gunModel['Ǿ'] = new ModelRendererTurbo(this, 1937, 113, this.textureX, this.textureY);
/* 2071 */     this.gunModel['ǿ'] = new ModelRendererTurbo(this, 585, 121, this.textureX, this.textureY);
/* 2072 */     this.gunModel['Ȁ'] = new ModelRendererTurbo(this, 697, 121, this.textureX, this.textureY);
/* 2073 */     this.gunModel['ȁ'] = new ModelRendererTurbo(this, 369, 121, this.textureX, this.textureY);
/* 2074 */     this.gunModel['Ȃ'] = new ModelRendererTurbo(this, 1321, 113, this.textureX, this.textureY);
/* 2075 */     this.gunModel['ȃ'] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/* 2076 */     this.gunModel['Ȅ'] = new ModelRendererTurbo(this, 809, 121, this.textureX, this.textureY);
/* 2077 */     this.gunModel['ȅ'] = new ModelRendererTurbo(this, 1025, 121, this.textureX, this.textureY);
/* 2078 */     this.gunModel['Ȇ'] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/* 2079 */     this.gunModel['ȇ'] = new ModelRendererTurbo(this, 1489, 89, this.textureX, this.textureY);
/* 2080 */     this.gunModel['Ȉ'] = new ModelRendererTurbo(this, 1777, 121, this.textureX, this.textureY);
/* 2081 */     this.gunModel['ȉ'] = new ModelRendererTurbo(this, 1233, 105, this.textureX, this.textureY);
/* 2082 */     this.gunModel['Ȋ'] = new ModelRendererTurbo(this, 1449, 113, this.textureX, this.textureY);
/* 2083 */     this.gunModel['ȋ'] = new ModelRendererTurbo(this, 1585, 113, this.textureX, this.textureY);
/* 2084 */     this.gunModel['Ȍ'] = new ModelRendererTurbo(this, 745, 121, this.textureX, this.textureY);
/* 2085 */     this.gunModel['ȍ'] = new ModelRendererTurbo(this, 1257, 113, this.textureX, this.textureY);
/* 2086 */     this.gunModel['Ȏ'] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 2087 */     this.gunModel['ȏ'] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/* 2088 */     this.gunModel['Ȑ'] = new ModelRendererTurbo(this, 1049, 121, this.textureX, this.textureY);
/* 2089 */     this.gunModel['ȑ'] = new ModelRendererTurbo(this, 1697, 121, this.textureX, this.textureY);
/* 2090 */     this.gunModel['Ȓ'] = new ModelRendererTurbo(this, 1849, 121, this.textureX, this.textureY);
/* 2091 */     this.gunModel['ȓ'] = new ModelRendererTurbo(this, 1881, 121, this.textureX, this.textureY);
/* 2092 */     this.gunModel['Ȕ'] = new ModelRendererTurbo(this, 1729, 121, this.textureX, this.textureY);
/* 2093 */     this.gunModel['ȕ'] = new ModelRendererTurbo(this, 1913, 121, this.textureX, this.textureY);
/* 2094 */     this.gunModel['Ȗ'] = new ModelRendererTurbo(this, 729, 105, this.textureX, this.textureY);
/* 2095 */     this.gunModel['ȗ'] = new ModelRendererTurbo(this, 1345, 105, this.textureX, this.textureY);
/* 2096 */     this.gunModel['Ș'] = new ModelRendererTurbo(this, 649, 113, this.textureX, this.textureY);
/* 2097 */     this.gunModel['ș'] = new ModelRendererTurbo(this, 1977, 121, this.textureX, this.textureY);
/* 2098 */     this.gunModel['Ț'] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/* 2099 */     this.gunModel['ț'] = new ModelRendererTurbo(this, 1081, 73, this.textureX, this.textureY);
/* 2100 */     this.gunModel['Ȝ'] = new ModelRendererTurbo(this, 1137, 73, this.textureX, this.textureY);
/* 2101 */     this.gunModel['ȝ'] = new ModelRendererTurbo(this, 801, 105, this.textureX, this.textureY);
/* 2102 */     this.gunModel['Ȟ'] = new ModelRendererTurbo(this, 2001, 121, this.textureX, this.textureY);
/* 2103 */     this.gunModel['ȟ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/* 2104 */     this.gunModel['Ƞ'] = new ModelRendererTurbo(this, 41, 129, this.textureX, this.textureY);
/* 2105 */     this.gunModel['ȡ'] = new ModelRendererTurbo(this, 1993, 9, this.textureX, this.textureY);
/* 2106 */     this.gunModel['Ȣ'] = new ModelRendererTurbo(this, 2009, 121, this.textureX, this.textureY);
/* 2107 */     this.gunModel['ȣ'] = new ModelRendererTurbo(this, 841, 121, this.textureX, this.textureY);
/* 2108 */     this.gunModel['Ȥ'] = new ModelRendererTurbo(this, 1705, 121, this.textureX, this.textureY);
/* 2109 */     this.gunModel['ȥ'] = new ModelRendererTurbo(this, 1857, 121, this.textureX, this.textureY);
/* 2110 */     this.gunModel['Ȧ'] = new ModelRendererTurbo(this, 65, 129, this.textureX, this.textureY);
/* 2111 */     this.gunModel['ȧ'] = new ModelRendererTurbo(this, 873, 113, this.textureX, this.textureY);
/* 2112 */     this.gunModel['Ȩ'] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/* 2113 */     this.gunModel['ȩ'] = new ModelRendererTurbo(this, 97, 129, this.textureX, this.textureY);
/* 2114 */     this.gunModel['Ȫ'] = new ModelRendererTurbo(this, 129, 129, this.textureX, this.textureY);
/* 2115 */     this.gunModel['ȫ'] = new ModelRendererTurbo(this, 161, 129, this.textureX, this.textureY);
/* 2116 */     this.gunModel['Ȭ'] = new ModelRendererTurbo(this, 201, 129, this.textureX, this.textureY);
/* 2117 */     this.gunModel['ȭ'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/* 2118 */     this.gunModel['Ȯ'] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/* 2119 */     this.gunModel['ȯ'] = new ModelRendererTurbo(this, 185, 129, this.textureX, this.textureY);
/* 2120 */     this.gunModel['Ȱ'] = new ModelRendererTurbo(this, 257, 97, this.textureX, this.textureY);
/* 2121 */     this.gunModel['ȱ'] = new ModelRendererTurbo(this, 225, 129, this.textureX, this.textureY);
/* 2122 */     this.gunModel['Ȳ'] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/* 2123 */     this.gunModel['ȳ'] = new ModelRendererTurbo(this, 433, 129, this.textureX, this.textureY);
/* 2124 */     this.gunModel['ȴ'] = new ModelRendererTurbo(this, 481, 129, this.textureX, this.textureY);
/* 2125 */     this.gunModel['ȵ'] = new ModelRendererTurbo(this, 1081, 89, this.textureX, this.textureY);
/* 2126 */     this.gunModel['ȶ'] = new ModelRendererTurbo(this, 1305, 73, this.textureX, this.textureY);
/* 2127 */     this.gunModel['ȷ'] = new ModelRendererTurbo(this, 1649, 57, this.textureX, this.textureY);
/* 2128 */     this.gunModel['ȸ'] = new ModelRendererTurbo(this, 1177, 97, this.textureX, this.textureY);
/* 2129 */     this.gunModel['ȹ'] = new ModelRendererTurbo(this, 1713, 73, this.textureX, this.textureY);
/* 2130 */     this.gunModel['Ⱥ'] = new ModelRendererTurbo(this, 1801, 97, this.textureX, this.textureY);
/* 2131 */     this.gunModel['Ȼ'] = new ModelRendererTurbo(this, 1937, 73, this.textureX, this.textureY);
/* 2132 */     this.gunModel['ȼ'] = new ModelRendererTurbo(this, 1769, 89, this.textureX, this.textureY);
/* 2133 */     this.gunModel['Ƚ'] = new ModelRendererTurbo(this, 1889, 89, this.textureX, this.textureY);
/* 2134 */     this.gunModel['Ⱦ'] = new ModelRendererTurbo(this, 2009, 89, this.textureX, this.textureY);
/* 2135 */     this.gunModel['ȿ'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/* 2136 */     this.gunModel['ɀ'] = new ModelRendererTurbo(this, 1377, 113, this.textureX, this.textureY);
/* 2137 */     this.gunModel['Ɂ'] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/* 2138 */     this.gunModel['ɂ'] = new ModelRendererTurbo(this, 545, 129, this.textureX, this.textureY);
/* 2139 */     this.gunModel['Ƀ'] = new ModelRendererTurbo(this, 1897, 121, this.textureX, this.textureY);
/* 2140 */     this.gunModel['Ʉ'] = new ModelRendererTurbo(this, 625, 129, this.textureX, this.textureY);
/* 2141 */     this.gunModel['Ʌ'] = new ModelRendererTurbo(this, 649, 129, this.textureX, this.textureY);
/* 2142 */     this.gunModel['Ɇ'] = new ModelRendererTurbo(this, 673, 129, this.textureX, this.textureY);
/* 2143 */     this.gunModel['ɇ'] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/* 2144 */     this.gunModel['Ɉ'] = new ModelRendererTurbo(this, 153, 129, this.textureX, this.textureY);
/* 2145 */     this.gunModel['ɉ'] = new ModelRendererTurbo(this, 753, 129, this.textureX, this.textureY);
/* 2146 */     this.gunModel['Ɋ'] = new ModelRendererTurbo(this, 865, 129, this.textureX, this.textureY);
/* 2147 */     this.gunModel['ɋ'] = new ModelRendererTurbo(this, 1057, 129, this.textureX, this.textureY);
/* 2148 */     this.gunModel['Ɍ'] = new ModelRendererTurbo(this, 1313, 129, this.textureX, this.textureY);
/* 2149 */     this.gunModel['ɍ'] = new ModelRendererTurbo(this, 1441, 129, this.textureX, this.textureY);
/* 2150 */     this.gunModel['Ɏ'] = new ModelRendererTurbo(this, 793, 129, this.textureX, this.textureY);
/* 2151 */     this.gunModel['ɏ'] = new ModelRendererTurbo(this, 1705, 89, this.textureX, this.textureY);
/* 2152 */     this.gunModel['ɐ'] = new ModelRendererTurbo(this, 521, 113, this.textureX, this.textureY);
/* 2153 */     this.gunModel['ɑ'] = new ModelRendererTurbo(this, 1745, 129, this.textureX, this.textureY);
/* 2154 */     this.gunModel['ɒ'] = new ModelRendererTurbo(this, 305, 129, this.textureX, this.textureY);
/* 2155 */     this.gunModel['ɓ'] = new ModelRendererTurbo(this, 345, 129, this.textureX, this.textureY);
/* 2156 */     this.gunModel['ɔ'] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 2157 */     this.gunModel['ɕ'] = new ModelRendererTurbo(this, 529, 129, this.textureX, this.textureY);
/* 2158 */     this.gunModel['ɖ'] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/* 2159 */     this.gunModel['ɗ'] = new ModelRendererTurbo(this, 401, 137, this.textureX, this.textureY);
/* 2160 */     this.gunModel['ɘ'] = new ModelRendererTurbo(this, 585, 137, this.textureX, this.textureY);
/* 2161 */     this.gunModel['ə'] = new ModelRendererTurbo(this, 889, 137, this.textureX, this.textureY);
/* 2162 */     this.gunModel['ɚ'] = new ModelRendererTurbo(this, 929, 137, this.textureX, this.textureY);
/* 2163 */     this.gunModel['ɛ'] = new ModelRendererTurbo(this, 969, 137, this.textureX, this.textureY);
/* 2164 */     this.gunModel['ɜ'] = new ModelRendererTurbo(this, 1009, 137, this.textureX, this.textureY);
/* 2165 */     this.gunModel['ɝ'] = new ModelRendererTurbo(this, 1097, 137, this.textureX, this.textureY);
/* 2166 */     this.gunModel['ɞ'] = new ModelRendererTurbo(this, 1137, 137, this.textureX, this.textureY);
/* 2167 */     this.gunModel['ɟ'] = new ModelRendererTurbo(this, 1177, 137, this.textureX, this.textureY);
/* 2168 */     this.gunModel['ɠ'] = new ModelRendererTurbo(this, 1217, 137, this.textureX, this.textureY);
/* 2169 */     this.gunModel['ɡ'] = new ModelRendererTurbo(this, 1257, 137, this.textureX, this.textureY);
/* 2170 */     this.gunModel['ɢ'] = new ModelRendererTurbo(this, 1577, 137, this.textureX, this.textureY);
/* 2171 */     this.gunModel['ɣ'] = new ModelRendererTurbo(this, 1617, 137, this.textureX, this.textureY);
/* 2172 */     this.gunModel['ɤ'] = new ModelRendererTurbo(this, 1657, 137, this.textureX, this.textureY);
/* 2173 */     this.gunModel['ɥ'] = new ModelRendererTurbo(this, 1769, 137, this.textureX, this.textureY);
/* 2174 */     this.gunModel['ɦ'] = new ModelRendererTurbo(this, 569, 129, this.textureX, this.textureY);
/* 2175 */     this.gunModel['ɧ'] = new ModelRendererTurbo(this, 25, 137, this.textureX, this.textureY);
/* 2176 */     this.gunModel['ɨ'] = new ModelRendererTurbo(this, 913, 137, this.textureX, this.textureY);
/* 2177 */     this.gunModel['ɩ'] = new ModelRendererTurbo(this, 1809, 137, this.textureX, this.textureY);
/* 2178 */     this.gunModel['ɪ'] = new ModelRendererTurbo(this, 1833, 137, this.textureX, this.textureY);
/* 2179 */     this.gunModel['ɫ'] = new ModelRendererTurbo(this, 1913, 137, this.textureX, this.textureY);
/* 2180 */     this.gunModel['ɬ'] = new ModelRendererTurbo(this, 1953, 137, this.textureX, this.textureY);
/* 2181 */     this.gunModel['ɭ'] = new ModelRendererTurbo(this, 345, 145, this.textureX, this.textureY);
/* 2182 */     this.gunModel['ɮ'] = new ModelRendererTurbo(this, 457, 145, this.textureX, this.textureY);
/* 2183 */     this.gunModel['ɯ'] = new ModelRendererTurbo(this, 697, 145, this.textureX, this.textureY);
/* 2184 */     this.gunModel['ɰ'] = new ModelRendererTurbo(this, 809, 145, this.textureX, this.textureY);
/* 2185 */     this.gunModel['ɱ'] = new ModelRendererTurbo(this, 1313, 97, this.textureX, this.textureY);
/* 2186 */     this.gunModel['ɲ'] = new ModelRendererTurbo(this, 1561, 97, this.textureX, this.textureY);
/* 2187 */     this.gunModel['ɳ'] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/* 2188 */     this.gunModel['ɴ'] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/* 2189 */     this.gunModel['ɵ'] = new ModelRendererTurbo(this, 1073, 105, this.textureX, this.textureY);
/* 2190 */     this.gunModel['ɶ'] = new ModelRendererTurbo(this, 1697, 73, this.textureX, this.textureY);
/* 2191 */     this.gunModel['ɷ'] = new ModelRendererTurbo(this, 1281, 9, this.textureX, this.textureY);
/* 2192 */     this.gunModel['ɸ'] = new ModelRendererTurbo(this, 1345, 9, this.textureX, this.textureY);
/* 2193 */     this.gunModel['ɹ'] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/* 2194 */     this.gunModel['ɺ'] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 2195 */     this.gunModel['ɻ'] = new ModelRendererTurbo(this, 1809, 65, this.textureX, this.textureY);
/* 2196 */     this.gunModel['ɼ'] = new ModelRendererTurbo(this, 1745, 73, this.textureX, this.textureY);
/* 2197 */     this.gunModel['ɽ'] = new ModelRendererTurbo(this, 2017, 9, this.textureX, this.textureY);
/* 2198 */     this.gunModel['ɾ'] = new ModelRendererTurbo(this, 1425, 17, this.textureX, this.textureY);
/* 2199 */     this.gunModel['ɿ'] = new ModelRendererTurbo(this, 1073, 25, this.textureX, this.textureY);
/* 2200 */     this.gunModel['ʀ'] = new ModelRendererTurbo(this, 2041, 9, this.textureX, this.textureY);
/* 2201 */     this.gunModel['ʁ'] = new ModelRendererTurbo(this, 1929, 25, this.textureX, this.textureY);
/* 2202 */     this.gunModel['ʂ'] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/* 2203 */     this.gunModel['ʃ'] = new ModelRendererTurbo(this, 1001, 57, this.textureX, this.textureY);
/* 2204 */     this.gunModel['ʄ'] = new ModelRendererTurbo(this, 665, 17, this.textureX, this.textureY);
/* 2205 */     this.gunModel['ʅ'] = new ModelRendererTurbo(this, 1057, 57, this.textureX, this.textureY);
/* 2206 */     this.gunModel['ʆ'] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/* 2207 */     this.gunModel['ʇ'] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 2208 */     this.gunModel['ʈ'] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/* 2209 */     this.gunModel['ʉ'] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/* 2210 */     this.gunModel['ʊ'] = new ModelRendererTurbo(this, 1497, 105, this.textureX, this.textureY);
/* 2211 */     this.gunModel['ʋ'] = new ModelRendererTurbo(this, 737, 57, this.textureX, this.textureY);
/* 2212 */     this.gunModel['ʌ'] = new ModelRendererTurbo(this, 753, 57, this.textureX, this.textureY);
/* 2213 */     this.gunModel['ʍ'] = new ModelRendererTurbo(this, 1097, 57, this.textureX, this.textureY);
/* 2214 */     this.gunModel['ʎ'] = new ModelRendererTurbo(this, 1145, 57, this.textureX, this.textureY);
/* 2215 */     this.gunModel['ʏ'] = new ModelRendererTurbo(this, 1481, 57, this.textureX, this.textureY);
/* 2216 */     this.gunModel['ʐ'] = new ModelRendererTurbo(this, 1513, 17, this.textureX, this.textureY);
/* 2217 */     this.gunModel['ʑ'] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/* 2218 */     this.gunModel['ʒ'] = new ModelRendererTurbo(this, 1065, 33, this.textureX, this.textureY);
/* 2219 */     this.gunModel['ʓ'] = new ModelRendererTurbo(this, 2025, 33, this.textureX, this.textureY);
/* 2220 */     this.gunModel['ʔ'] = new ModelRendererTurbo(this, 385, 113, this.textureX, this.textureY);
/* 2221 */     this.gunModel['ʕ'] = new ModelRendererTurbo(this, 1601, 113, this.textureX, this.textureY);
/* 2222 */     this.gunModel['ʖ'] = new ModelRendererTurbo(this, 1913, 89, this.textureX, this.textureY);
/* 2223 */     this.gunModel['ʗ'] = new ModelRendererTurbo(this, 2001, 105, this.textureX, this.textureY);
/* 2224 */     this.gunModel['ʘ'] = new ModelRendererTurbo(this, 1777, 113, this.textureX, this.textureY);
/* 2225 */     this.gunModel['ʙ'] = new ModelRendererTurbo(this, 609, 137, this.textureX, this.textureY);
/* 2226 */     this.gunModel['ʚ'] = new ModelRendererTurbo(this, 1577, 129, this.textureX, this.textureY);
/* 2227 */     this.gunModel['ʛ'] = new ModelRendererTurbo(this, 1929, 121, this.textureX, this.textureY);
/* 2228 */     this.gunModel['ʜ'] = new ModelRendererTurbo(this, 121, 129, this.textureX, this.textureY);
/* 2229 */     this.gunModel['ʝ'] = new ModelRendererTurbo(this, 889, 129, this.textureX, this.textureY);
/* 2230 */     this.gunModel['ʞ'] = new ModelRendererTurbo(this, 2033, 105, this.textureX, this.textureY);
/* 2231 */     this.gunModel['ʟ'] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/* 2232 */     this.gunModel['ʠ'] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/* 2233 */     this.gunModel['ʡ'] = new ModelRendererTurbo(this, 1217, 57, this.textureX, this.textureY);
/* 2234 */     this.gunModel['ʢ'] = new ModelRendererTurbo(this, 89, 113, this.textureX, this.textureY);
/* 2235 */     this.gunModel['ʣ'] = new ModelRendererTurbo(this, 1361, 97, this.textureX, this.textureY);
/* 2236 */     this.gunModel['ʤ'] = new ModelRendererTurbo(this, 737, 49, this.textureX, this.textureY);
/* 2237 */     this.gunModel['ʥ'] = new ModelRendererTurbo(this, 1969, 57, this.textureX, this.textureY);
/* 2238 */     this.gunModel['ʦ'] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/* 2239 */     this.gunModel['ʧ'] = new ModelRendererTurbo(this, 153, 113, this.textureX, this.textureY);
/* 2240 */     this.gunModel['ʨ'] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/* 2241 */     this.gunModel['ʩ'] = new ModelRendererTurbo(this, 1529, 105, this.textureX, this.textureY);
/* 2242 */     this.gunModel['ʪ'] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/* 2243 */     this.gunModel['ʫ'] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/* 2244 */     this.gunModel['ʬ'] = new ModelRendererTurbo(this, 809, 121, this.textureX, this.textureY);
/* 2245 */     this.gunModel['ʭ'] = new ModelRendererTurbo(this, 1145, 65, this.textureX, this.textureY);
/* 2246 */     this.gunModel['ʮ'] = new ModelRendererTurbo(this, 1281, 137, this.textureX, this.textureY);
/* 2247 */     this.gunModel['ʯ'] = new ModelRendererTurbo(this, 1265, 57, this.textureX, this.textureY);
/* 2248 */     this.gunModel['ʰ'] = new ModelRendererTurbo(this, 1313, 57, this.textureX, this.textureY);
/* 2249 */     this.gunModel['ʱ'] = new ModelRendererTurbo(this, 1745, 105, this.textureX, this.textureY);
/* 2250 */     this.gunModel['ʲ'] = new ModelRendererTurbo(this, 1361, 57, this.textureX, this.textureY);
/* 2251 */     this.gunModel['ʳ'] = new ModelRendererTurbo(this, 1249, 65, this.textureX, this.textureY);
/* 2252 */     this.gunModel['ʴ'] = new ModelRendererTurbo(this, 1265, 65, this.textureX, this.textureY);
/* 2253 */     this.gunModel['ʵ'] = new ModelRendererTurbo(this, 1297, 65, this.textureX, this.textureY);
/* 2254 */     this.gunModel['ʶ'] = new ModelRendererTurbo(this, 217, 113, this.textureX, this.textureY);
/* 2255 */     this.gunModel['ʷ'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/* 2256 */     this.gunModel['ʸ'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/* 2257 */     this.gunModel['ʹ'] = new ModelRendererTurbo(this, 1201, 97, this.textureX, this.textureY);
/* 2258 */     this.gunModel['ʺ'] = new ModelRendererTurbo(this, 1425, 105, this.textureX, this.textureY);
/* 2259 */     this.gunModel['ʻ'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/* 2260 */     this.gunModel['ʼ'] = new ModelRendererTurbo(this, 1353, 145, this.textureX, this.textureY);
/* 2261 */     this.gunModel['ʽ'] = new ModelRendererTurbo(this, 1481, 145, this.textureX, this.textureY);
/* 2262 */     this.gunModel['ʾ'] = new ModelRendererTurbo(this, 1977, 145, this.textureX, this.textureY);
/* 2263 */     this.gunModel['ʿ'] = new ModelRendererTurbo(this, 81, 153, this.textureX, this.textureY);
/* 2264 */     this.gunModel['ˀ'] = new ModelRendererTurbo(this, 281, 153, this.textureX, this.textureY);
/* 2265 */     this.gunModel['ˁ'] = new ModelRendererTurbo(this, 729, 153, this.textureX, this.textureY);
/* 2266 */     this.gunModel['˂'] = new ModelRendererTurbo(this, 1353, 153, this.textureX, this.textureY);
/* 2267 */     this.gunModel['˃'] = new ModelRendererTurbo(this, 1481, 153, this.textureX, this.textureY);
/* 2268 */     this.gunModel['˄'] = new ModelRendererTurbo(this, 953, 137, this.textureX, this.textureY);
/* 2269 */     this.gunModel['˅'] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/* 2270 */     this.gunModel['ˆ'] = new ModelRendererTurbo(this, 569, 113, this.textureX, this.textureY);
/* 2271 */     this.gunModel['ˇ'] = new ModelRendererTurbo(this, 593, 113, this.textureX, this.textureY);
/* 2272 */     this.gunModel['ˈ'] = new ModelRendererTurbo(this, 681, 113, this.textureX, this.textureY);
/* 2273 */     this.gunModel['ˉ'] = new ModelRendererTurbo(this, 993, 137, this.textureX, this.textureY);
/* 2274 */     this.gunModel['ˊ'] = new ModelRendererTurbo(this, 505, 129, this.textureX, this.textureY);
/* 2275 */     this.gunModel['ˋ'] = new ModelRendererTurbo(this, 1121, 137, this.textureX, this.textureY);
/* 2276 */     this.gunModel['ˌ'] = new ModelRendererTurbo(this, 425, 137, this.textureX, this.textureY);
/* 2277 */     this.gunModel['ˍ'] = new ModelRendererTurbo(this, 857, 113, this.textureX, this.textureY);
/* 2278 */     this.gunModel['ˎ'] = new ModelRendererTurbo(this, 761, 121, this.textureX, this.textureY);
/* 2279 */     this.gunModel['ˏ'] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/* 2280 */     this.gunModel['ː'] = new ModelRendererTurbo(this, 537, 33, this.textureX, this.textureY);
/* 2281 */     this.gunModel['ˑ'] = new ModelRendererTurbo(this, 1241, 33, this.textureX, this.textureY);
/* 2282 */     this.gunModel['˒'] = new ModelRendererTurbo(this, 1033, 137, this.textureX, this.textureY);
/* 2283 */     this.gunModel['˓'] = new ModelRendererTurbo(this, 673, 129, this.textureX, this.textureY);
/* 2284 */     this.gunModel['˔'] = new ModelRendererTurbo(this, 865, 129, this.textureX, this.textureY);
/* 2285 */     this.gunModel['˕'] = new ModelRendererTurbo(this, 1681, 137, this.textureX, this.textureY);
/* 2286 */     this.gunModel['˖'] = new ModelRendererTurbo(this, 1465, 113, this.textureX, this.textureY);
/* 2287 */     this.gunModel['˗'] = new ModelRendererTurbo(this, 1969, 113, this.textureX, this.textureY);
/* 2288 */     this.gunModel['˘'] = new ModelRendererTurbo(this, 2025, 73, this.textureX, this.textureY);
/* 2289 */     this.gunModel['˙'] = new ModelRendererTurbo(this, 57, 81, this.textureX, this.textureY);
/* 2290 */     this.gunModel['˚'] = new ModelRendererTurbo(this, 1793, 137, this.textureX, this.textureY);
/* 2291 */     this.gunModel['˛'] = new ModelRendererTurbo(this, 369, 145, this.textureX, this.textureY);
/* 2292 */     this.gunModel['˜'] = new ModelRendererTurbo(this, 953, 145, this.textureX, this.textureY);
/* 2293 */     this.gunModel['˝'] = new ModelRendererTurbo(this, 457, 129, this.textureX, this.textureY);
/* 2294 */     this.gunModel['˞'] = new ModelRendererTurbo(this, 1825, 137, this.textureX, this.textureY);
/* 2295 */     this.gunModel['˟'] = new ModelRendererTurbo(this, 625, 121, this.textureX, this.textureY);
/* 2296 */     this.gunModel['ˠ'] = new ModelRendererTurbo(this, 681, 121, this.textureX, this.textureY);
/* 2297 */     this.gunModel['ˡ'] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/* 2298 */     this.gunModel['ˢ'] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/* 2299 */     this.gunModel['ˣ'] = new ModelRendererTurbo(this, 729, 145, this.textureX, this.textureY);
/* 2300 */     this.gunModel['ˤ'] = new ModelRendererTurbo(this, 1201, 145, this.textureX, this.textureY);
/* 2301 */     this.gunModel['˥'] = new ModelRendererTurbo(this, 481, 129, this.textureX, this.textureY);
/* 2302 */     this.gunModel['˦'] = new ModelRendererTurbo(this, 1281, 145, this.textureX, this.textureY);
/* 2303 */     this.gunModel['˧'] = new ModelRendererTurbo(this, 1601, 145, this.textureX, this.textureY);
/* 2304 */     this.gunModel['˨'] = new ModelRendererTurbo(this, 1417, 145, this.textureX, this.textureY);
/* 2305 */     this.gunModel['˩'] = new ModelRendererTurbo(this, 1897, 145, this.textureX, this.textureY);
/* 2306 */     this.gunModel['˪'] = new ModelRendererTurbo(this, 745, 121, this.textureX, this.textureY);
/* 2307 */     this.gunModel['˫'] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/* 2308 */     this.gunModel['ˬ'] = new ModelRendererTurbo(this, 273, 81, this.textureX, this.textureY);
/* 2309 */     this.gunModel['˭'] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/* 2310 */     this.gunModel['ˮ'] = new ModelRendererTurbo(this, 1937, 145, this.textureX, this.textureY);
/* 2311 */     this.gunModel['˯'] = new ModelRendererTurbo(this, 1065, 121, this.textureX, this.textureY);
/* 2312 */     this.gunModel['˰'] = new ModelRendererTurbo(this, 1201, 121, this.textureX, this.textureY);
/* 2313 */     this.gunModel['˱'] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/* 2314 */     this.gunModel['˲'] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/* 2315 */     this.gunModel['˳'] = new ModelRendererTurbo(this, 1321, 121, this.textureX, this.textureY);
/* 2316 */     this.gunModel['˴'] = new ModelRendererTurbo(this, 529, 81, this.textureX, this.textureY);
/* 2317 */     this.gunModel['˵'] = new ModelRendererTurbo(this, 1729, 121, this.textureX, this.textureY);
/* 2318 */     this.gunModel['˶'] = new ModelRendererTurbo(this, 561, 81, this.textureX, this.textureY);
/* 2319 */     this.gunModel['˷'] = new ModelRendererTurbo(this, 1969, 121, this.textureX, this.textureY);
/* 2320 */     this.gunModel['˸'] = new ModelRendererTurbo(this, 1569, 145, this.textureX, this.textureY);
/* 2321 */     this.gunModel['˹'] = new ModelRendererTurbo(this, 1745, 121, this.textureX, this.textureY);
/* 2322 */     this.gunModel['˺'] = new ModelRendererTurbo(this, 585, 81, this.textureX, this.textureY);
/* 2323 */     this.gunModel['˻'] = new ModelRendererTurbo(this, 1777, 121, this.textureX, this.textureY);
/* 2324 */     this.gunModel['˼'] = new ModelRendererTurbo(this, 609, 81, this.textureX, this.textureY);
/* 2325 */     this.gunModel['˽'] = new ModelRendererTurbo(this, 713, 33, this.textureX, this.textureY);
/*      */     
/* 2327 */     this.gunModel['Ǵ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2328 */     this.gunModel['Ǵ'].setRotationPoint(-116.5F, -8.25F, 3.0F);
/*      */     
/* 2330 */     this.gunModel['ǵ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 7, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2331 */     this.gunModel['ǵ'].setRotationPoint(-128.5F, 3.75F, 2.5F);
/*      */     
/* 2333 */     this.gunModel['Ƕ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 3, 13, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2334 */     this.gunModel['Ƕ'].setRotationPoint(-134.0F, -23.5F, -0.5F);
/*      */     
/* 2336 */     this.gunModel['Ƿ'].addShapeBox(40.0F, -11.0F, -6.0F, 48, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2337 */     this.gunModel['Ƿ'].setRotationPoint(-134.0F, -20.5F, -0.5F);
/*      */     
/* 2339 */     this.gunModel['Ǹ'].addShapeBox(40.0F, -11.0F, -6.0F, 51, 2, 13, 0.0F, 0.0F, -1.0F, -0.5F, 1.0F, -1.0F, -0.5F, 1.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2340 */     this.gunModel['Ǹ'].setRotationPoint(-134.0F, -24.5F, -0.5F);
/*      */     
/* 2342 */     this.gunModel['ǹ'].addShapeBox(40.0F, -11.0F, -6.0F, 45, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2343 */     this.gunModel['ǹ'].setRotationPoint(-133.0F, -18.5F, -1.5F);
/*      */     
/* 2345 */     this.gunModel['Ǻ'].addShapeBox(40.0F, -11.0F, -6.0F, 45, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F);
/* 2346 */     this.gunModel['Ǻ'].setRotationPoint(-133.0F, -17.5F, -1.5F);
/*      */     
/* 2348 */     this.gunModel['ǻ'].addShapeBox(40.0F, -11.0F, -6.0F, 43, 2, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2349 */     this.gunModel['ǻ'].setRotationPoint(-131.0F, -16.5F, -0.5F);
/*      */     
/* 2351 */     this.gunModel['Ǽ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 11, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 6.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.5F);
/* 2352 */     this.gunModel['Ǽ'].setRotationPoint(-76.0F, -26.5F, 0.5F);
/*      */     
/* 2354 */     this.gunModel['ǽ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 13, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 1.0F, 0.0F, -0.5F);
/* 2355 */     this.gunModel['ǽ'].setRotationPoint(-82.0F, -24.5F, -0.5F);
/*      */     
/* 2357 */     this.gunModel['Ǿ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 13, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -0.5F, 2.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 2.75F, 0.0F, 0.0F);
/* 2358 */     this.gunModel['Ǿ'].setRotationPoint(-83.0F, -23.5F, -0.5F);
/*      */     
/* 2360 */     this.gunModel['ǿ'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 2, 13, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F);
/* 2361 */     this.gunModel['ǿ'].setRotationPoint(-88.0F, -20.5F, -0.5F);
/*      */     
/* 2363 */     this.gunModel['Ȁ'].addShapeBox(40.0F, -11.0F, -6.0F, 13, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.4F, -2.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -3.4F, -2.0F, 0.0F, -3.4F, 0.0F, 0.0F, 0.0F);
/* 2364 */     this.gunModel['Ȁ'].setRotationPoint(-88.0F, -18.5F, -1.5F);
/*      */     
/* 2366 */     this.gunModel['ȁ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.1F, -0.25F, 0.0F, -2.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, -0.25F, 0.5F, -2.6F, -0.25F, 0.5F, -2.6F, 0.0F, 0.5F, -1.0F);
/* 2367 */     this.gunModel['ȁ'].setRotationPoint(-88.0F, -17.5F, -1.5F);
/*      */     
/* 2369 */     this.gunModel['Ȃ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2370 */     this.gunModel['Ȃ'].setRotationPoint(-88.0F, -16.5F, -0.5F);
/*      */     
/* 2372 */     this.gunModel['ȃ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 15, 0.0F, 0.0F, 0.0F, -3.4F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, -3.4F, -2.0F, -0.75F, -4.0F, -2.0F, -0.75F, -4.0F, 0.0F, 0.0F, -3.4F);
/* 2373 */     this.gunModel['ȃ'].setRotationPoint(-77.0F, -18.5F, -1.5F);
/*      */     
/* 2375 */     this.gunModel['Ȅ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 15, 0.0F, 0.0F, 0.0F, -2.1F, 0.25F, 0.0F, -3.4F, 0.25F, 0.0F, -3.4F, 0.0F, 0.0F, -2.1F, 0.0F, 0.5F, -2.6F, 0.25F, -1.0F, -3.4F, 0.25F, -1.0F, -3.4F, 0.0F, 0.5F, -2.6F);
/* 2376 */     this.gunModel['Ȅ'].setRotationPoint(-81.25F, -17.5F, -1.5F);
/*      */     
/* 2378 */     this.gunModel['ȅ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 13, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.25F, -2.0F);
/* 2379 */     this.gunModel['ȅ'].setRotationPoint(-85.0F, -16.5F, -0.5F);
/*      */     
/* 2381 */     this.gunModel['Ȇ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, -0.5F, -1.5F, -0.25F, -0.5F, -1.6F, -0.25F, -0.5F, -1.6F, 0.0F, -0.5F, -1.5F, 0.0F, -1.25F, -2.0F, -0.25F, -1.5F, -2.0F, -0.25F, -1.5F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 2382 */     this.gunModel['Ȇ'].setRotationPoint(-82.0F, -16.5F, -0.5F);
/*      */     
/* 2384 */     this.gunModel['ȇ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2385 */     this.gunModel['ȇ'].setRotationPoint(-86.0F, -16.5F, -0.5F);
/*      */     
/* 2387 */     this.gunModel['Ȉ'].addShapeBox(40.0F, -11.0F, -6.0F, 25, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2388 */     this.gunModel['Ȉ'].setRotationPoint(-114.0F, -15.0F, 1.5F);
/*      */     
/* 2390 */     this.gunModel['ȉ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2391 */     this.gunModel['ȉ'].setRotationPoint(-89.0F, -15.0F, 1.5F);
/*      */     
/* 2393 */     this.gunModel['Ȋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.75F, -2.0F, 0.0F, -0.25F, -2.0F);
/* 2394 */     this.gunModel['Ȋ'].setRotationPoint(-88.0F, -15.0F, 1.5F);
/*      */     
/* 2396 */     this.gunModel['ȋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.25F, -2.0F, 0.0F, -0.75F, -2.0F);
/* 2397 */     this.gunModel['ȋ'].setRotationPoint(-87.0F, -15.0F, 1.5F);
/*      */     
/* 2399 */     this.gunModel['Ȍ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, -2.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.25F, -2.0F);
/* 2400 */     this.gunModel['Ȍ'].setRotationPoint(-86.0F, -15.0F, 1.0F);
/*      */     
/* 2402 */     this.gunModel['ȍ'].addShapeBox(40.0F, -11.0F, -6.0F, 25, 2, 3, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F);
/* 2403 */     this.gunModel['ȍ'].setRotationPoint(-114.0F, -17.5F, 4.5F);
/*      */     
/* 2405 */     this.gunModel['Ȏ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 3, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F, 0.0F, 2.75F, 0.0F);
/* 2406 */     this.gunModel['Ȏ'].setRotationPoint(-89.0F, -18.5F, 4.0F);
/*      */     
/* 2408 */     this.gunModel['ȏ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 9, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 2409 */     this.gunModel['ȏ'].setRotationPoint(-133.0F, -15.0F, 1.5F);
/*      */     
/* 2411 */     this.gunModel['Ȑ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 7, 0.0F, 0.5F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.5F, 0.25F, -1.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2412 */     this.gunModel['Ȑ'].setRotationPoint(-132.5F, -12.75F, 2.5F);
/*      */     
/* 2414 */     this.gunModel['ȑ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2415 */     this.gunModel['ȑ'].setRotationPoint(-64.0F, -25.5F, 2.0F);
/*      */     
/* 2417 */     this.gunModel['Ȓ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 8, 0.0F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2418 */     this.gunModel['Ȓ'].setRotationPoint(-64.0F, -28.0F, 2.0F);
/*      */     
/* 2420 */     this.gunModel['ȓ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 8, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, -2.75F);
/* 2421 */     this.gunModel['ȓ'].setRotationPoint(-64.0F, -23.0F, 2.0F);
/*      */     
/* 2423 */     this.gunModel['Ȕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F);
/* 2424 */     this.gunModel['Ȕ'].setRotationPoint(-60.0F, -22.5F, 1.5F);
/*      */     
/* 2426 */     this.gunModel['ȕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.0F);
/* 2427 */     this.gunModel['ȕ'].setRotationPoint(-60.0F, -25.5F, 1.5F);
/*      */     
/* 2429 */     this.gunModel['Ȗ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2430 */     this.gunModel['Ȗ'].setRotationPoint(-59.0F, -26.0F, 0.5F);
/*      */     
/* 2432 */     this.gunModel['ȗ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F);
/* 2433 */     this.gunModel['ȗ'].setRotationPoint(-59.0F, -22.5F, 0.5F);
/*      */     
/* 2435 */     this.gunModel['Ș'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2436 */     this.gunModel['Ș'].setRotationPoint(-59.0F, -29.5F, 0.5F);
/*      */     
/* 2438 */     this.gunModel['ș'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.75F, -2.75F, 0.0F, 0.75F, -2.75F, 0.0F, 0.0F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.0F);
/* 2439 */     this.gunModel['ș'].setRotationPoint(-60.0F, -28.5F, 1.5F);
/*      */     
/* 2441 */     this.gunModel['Ț'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2442 */     this.gunModel['Ț'].setRotationPoint(-59.0F, -18.75F, 4.5F);
/*      */     
/* 2444 */     this.gunModel['ț'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2445 */     this.gunModel['ț'].setRotationPoint(-59.0F, -18.75F, 1.0F);
/*      */     
/* 2447 */     this.gunModel['Ȝ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 3, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 3.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2448 */     this.gunModel['Ȝ'].setRotationPoint(-59.0F, -18.75F, 8.0F);
/*      */     
/* 2450 */     this.gunModel['ȝ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2451 */     this.gunModel['ȝ'].setRotationPoint(-59.0F, -14.75F, 1.0F);
/*      */     
/* 2453 */     this.gunModel['Ȟ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F);
/* 2454 */     this.gunModel['Ȟ'].setRotationPoint(-59.0F, -13.75F, 2.0F);
/*      */     
/* 2456 */     this.gunModel['ȟ'].addShapeBox(40.0F, -11.0F, -6.0F, 17, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2457 */     this.gunModel['ȟ'].setRotationPoint(-104.0F, -8.5F, 5.5F);
/*      */     
/* 2459 */     this.gunModel['Ƞ'].addShapeBox(40.0F, -11.0F, -6.0F, 15, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 2460 */     this.gunModel['Ƞ'].setRotationPoint(-104.0F, -9.5F, 5.5F);
/*      */     
/* 2462 */     this.gunModel['ȡ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F, -1.0F, -0.5F, 0.25F);
/* 2463 */     this.gunModel['ȡ'].setRotationPoint(-97.0F, -7.5F, 5.5F);
/*      */     
/* 2465 */     this.gunModel['Ȣ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 7, 13, 0.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2466 */     this.gunModel['Ȣ'].setRotationPoint(-135.0F, 2.5F, -0.5F);
/*      */     
/* 2468 */     this.gunModel['ȣ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 8, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2469 */     this.gunModel['ȣ'].setRotationPoint(-136.0F, -5.5F, -2.5F);
/*      */     
/* 2471 */     this.gunModel['Ȥ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 9, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2472 */     this.gunModel['Ȥ'].setRotationPoint(-137.0F, -14.5F, -2.5F);
/*      */     
/* 2474 */     this.gunModel['ȥ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 9, 17, 0.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2475 */     this.gunModel['ȥ'].setRotationPoint(-136.75F, -23.5F, -2.5F);
/*      */     
/* 2477 */     this.gunModel['Ȧ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 5, 17, 0.0F, 0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, 0.75F, 0.0F, -2.5F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 2478 */     this.gunModel['Ȧ'].setRotationPoint(-136.75F, -28.5F, -2.5F);
/*      */     
/* 2480 */     this.gunModel['ȧ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 11, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2481 */     this.gunModel['ȧ'].setRotationPoint(-137.5F, -31.5F, 0.5F);
/*      */     
/* 2483 */     this.gunModel['Ȩ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 2484 */     this.gunModel['Ȩ'].setRotationPoint(-137.5F, -32.5F, 1.5F);
/*      */     
/* 2486 */     this.gunModel['ȩ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 13, 0.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -1.25F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, -1.25F, -0.25F, -2.5F);
/* 2487 */     this.gunModel['ȩ'].setRotationPoint(-134.0F, 9.5F, -0.5F);
/*      */     
/* 2489 */     this.gunModel['Ȫ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 7, 12, 0.0F, -0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 1.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2490 */     this.gunModel['Ȫ'].setRotationPoint(-133.0F, 2.5F, 0.0F);
/*      */     
/* 2492 */     this.gunModel['ȫ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 8, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F);
/* 2493 */     this.gunModel['ȫ'].setRotationPoint(-134.0F, -5.5F, -2.0F);
/*      */     
/* 2495 */     this.gunModel['Ȭ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 9, 16, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 2496 */     this.gunModel['Ȭ'].setRotationPoint(-135.0F, -14.5F, -2.0F);
/*      */     
/* 2498 */     this.gunModel['ȭ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 9, 16, 0.0F, 0.5F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2499 */     this.gunModel['ȭ'].setRotationPoint(-134.75F, -23.5F, -2.0F);
/*      */     
/* 2501 */     this.gunModel['Ȯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 5, 16, 0.0F, 0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, 0.75F, 0.0F, -2.5F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 2502 */     this.gunModel['Ȯ'].setRotationPoint(-134.75F, -28.5F, -2.0F);
/*      */     
/* 2504 */     this.gunModel['ȯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2505 */     this.gunModel['ȯ'].setRotationPoint(-135.5F, -31.5F, 1.0F);
/*      */     
/* 2507 */     this.gunModel['Ȱ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 2508 */     this.gunModel['Ȱ'].setRotationPoint(-135.5F, -32.5F, 2.0F);
/*      */     
/* 2510 */     this.gunModel['ȱ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 12, 0.0F, -0.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -1.25F, -0.25F, -2.0F, 1.0F, -0.25F, -2.0F, 1.0F, -0.25F, -2.0F, -1.25F, -0.25F, -2.0F);
/* 2511 */     this.gunModel['ȱ'].setRotationPoint(-132.0F, 9.5F, 0.0F);
/*      */     
/* 2513 */     this.gunModel['Ȳ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 15, 0.0F, 0.2F, 0.0F, -0.45F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.2F, 0.0F, -0.45F, -0.15F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, -0.1F);
/* 2514 */     this.gunModel['Ȳ'].setRotationPoint(-132.75F, -18.5F, -1.5F);
/*      */     
/* 2516 */     this.gunModel['ȳ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 15, 0.0F, -0.15F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, -0.1F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
/* 2517 */     this.gunModel['ȳ'].setRotationPoint(-132.75F, -15.5F, -1.5F);
/*      */     
/* 2519 */     this.gunModel['ȴ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 15, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 2520 */     this.gunModel['ȴ'].setRotationPoint(-132.75F, -14.5F, -1.5F);
/*      */     
/* 2522 */     this.gunModel['ȵ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2523 */     this.gunModel['ȵ'].setRotationPoint(-131.0F, -32.0F, 4.0F);
/*      */     
/* 2525 */     this.gunModel['ȶ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 4, 0.0F, -1.25F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2526 */     this.gunModel['ȶ'].setRotationPoint(-134.5F, -34.0F, 4.0F);
/*      */     
/* 2528 */     this.gunModel['ȷ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 4, 0.0F, 0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F);
/* 2529 */     this.gunModel['ȷ'].setRotationPoint(-132.0F, -34.0F, 4.0F);
/*      */     
/* 2531 */     this.gunModel['ȸ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 4, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2532 */     this.gunModel['ȸ'].setRotationPoint(-131.0F, -34.0F, 4.0F);
/*      */     
/* 2534 */     this.gunModel['ȹ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 4, 0.0F, -0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F);
/* 2535 */     this.gunModel['ȹ'].setRotationPoint(-134.5F, -32.5F, 4.0F);
/*      */     
/* 2537 */     this.gunModel['Ⱥ'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2538 */     this.gunModel['Ⱥ'].setRotationPoint(-135.0F, -30.0F, 4.0F);
/*      */     
/* 2540 */     this.gunModel['Ȼ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 4, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F);
/* 2541 */     this.gunModel['Ȼ'].setRotationPoint(-132.5F, -32.5F, 4.0F);
/*      */     
/* 2543 */     this.gunModel['ȼ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 4, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2544 */     this.gunModel['ȼ'].setRotationPoint(-132.5F, -33.5F, 4.0F);
/*      */     
/* 2546 */     this.gunModel['Ƚ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 4, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F);
/* 2547 */     this.gunModel['Ƚ'].setRotationPoint(-132.5F, -32.5F, 4.0F);
/*      */     
/* 2549 */     this.gunModel['Ⱦ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 4, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/* 2550 */     this.gunModel['Ⱦ'].setRotationPoint(-132.5F, -31.5F, 4.0F);
/*      */     
/* 2552 */     this.gunModel['ȿ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 4, 0.0F, -1.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 2553 */     this.gunModel['ȿ'].setRotationPoint(-132.5F, -31.5F, 4.0F);
/*      */     
/* 2555 */     this.gunModel['ɀ'].addShapeBox(40.0F, -11.0F, -6.0F, 9, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2556 */     this.gunModel['ɀ'].setRotationPoint(-135.0F, -29.0F, 4.0F);
/*      */     
/* 2558 */     this.gunModel['Ɂ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 9, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2559 */     this.gunModel['Ɂ'].setRotationPoint(-138.0F, -14.5F, -2.5F);
/*      */     
/* 2561 */     this.gunModel['ɂ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 9, 17, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2562 */     this.gunModel['ɂ'].setRotationPoint(-138.0F, -23.5F, -2.5F);
/*      */     
/* 2564 */     this.gunModel['Ƀ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 7, 13, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F);
/* 2565 */     this.gunModel['Ƀ'].setRotationPoint(-136.0F, 2.5F, -0.5F);
/*      */     
/* 2567 */     this.gunModel['Ʉ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F);
/* 2568 */     this.gunModel['Ʉ'].setRotationPoint(-137.0F, -5.5F, -2.5F);
/*      */     
/* 2570 */     this.gunModel['Ʌ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 13, 0.0F, 0.75F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.75F, 0.0F, -1.0F, 0.75F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, 1.25F, -0.25F, -2.5F, 0.75F, -0.25F, -2.5F);
/* 2571 */     this.gunModel['Ʌ'].setRotationPoint(-138.0F, 9.5F, -0.5F);
/*      */     
/* 2573 */     this.gunModel['Ɇ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 5, 17, 0.0F, 0.5F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, -0.75F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F);
/* 2574 */     this.gunModel['Ɇ'].setRotationPoint(-137.75F, -28.5F, -2.5F);
/*      */     
/* 2576 */     this.gunModel['ɇ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 11, 0.0F, 1.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 1.0F, -0.5F, -1.5F, 2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F);
/* 2577 */     this.gunModel['ɇ'].setRotationPoint(-138.5F, -31.5F, 0.5F);
/*      */     
/* 2579 */     this.gunModel['Ɉ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 8, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 2580 */     this.gunModel['Ɉ'].setRotationPoint(-139.5F, -32.5F, 1.5F);
/*      */     
/* 2582 */     this.gunModel['ɉ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 17, 0.0F, 0.75F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 0.75F, 0.0F, -2.5F, 1.25F, 0.0F, -1.9F, -0.5F, 0.0F, -1.9F, -0.5F, 0.0F, -1.9F, 1.25F, 0.0F, -1.9F);
/* 2583 */     this.gunModel['ɉ'].setRotationPoint(-139.75F, -28.5F, -2.5F);
/*      */     
/* 2585 */     this.gunModel['Ɋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 18, 0.0F, 0.75F, 0.0F, -2.4F, -1.0F, 0.0F, -2.4F, -1.0F, 0.0F, -2.4F, 0.75F, 0.0F, -2.4F, 1.25F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, 1.25F, 0.0F, -1.5F);
/* 2586 */     this.gunModel['Ɋ'].setRotationPoint(-140.25F, -26.5F, -3.0F);
/*      */     
/* 2588 */     this.gunModel['ɋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 9, 17, 0.0F, 0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 2589 */     this.gunModel['ɋ'].setRotationPoint(-141.25F, -23.5F, -2.5F);
/*      */     
/* 2591 */     this.gunModel['Ɍ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 9, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2592 */     this.gunModel['Ɍ'].setRotationPoint(-143.0F, -14.5F, -2.5F);
/*      */     
/* 2594 */     this.gunModel['ɍ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 17, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F);
/* 2595 */     this.gunModel['ɍ'].setRotationPoint(-143.0F, -5.5F, -2.5F);
/*      */     
/* 2597 */     this.gunModel['Ɏ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 7, 13, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, 1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F);
/* 2598 */     this.gunModel['Ɏ'].setRotationPoint(-142.0F, 2.5F, -0.5F);
/*      */     
/* 2600 */     this.gunModel['ɏ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 13, 0.0F, 0.5F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.25F, -1.7F, 0.25F, 0.25F, -1.7F, 0.25F, 0.25F, -1.7F, 0.0F, 0.25F, -1.7F);
/* 2601 */     this.gunModel['ɏ'].setRotationPoint(-140.0F, 9.5F, -0.5F);
/*      */     
/* 2603 */     this.gunModel['ɐ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 13, 0.0F, 0.0F, -0.25F, -1.7F, 0.25F, -0.25F, -1.7F, 0.25F, -0.25F, -1.7F, 0.0F, -0.25F, -1.7F, -1.25F, -0.25F, -2.5F, 0.25F, -0.25F, -2.5F, 0.25F, -0.25F, -2.5F, -1.25F, -0.25F, -2.5F);
/* 2604 */     this.gunModel['ɐ'].setRotationPoint(-140.0F, 10.5F, -0.5F);
/*      */     
/* 2606 */     this.gunModel['ɑ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2607 */     this.gunModel['ɑ'].setRotationPoint(-139.75F, -17.5F, -1.5F);
/*      */     
/* 2609 */     this.gunModel['ɒ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 2610 */     this.gunModel['ɒ'].setRotationPoint(-139.75F, -26.5F, 1.0F);
/*      */     
/* 2612 */     this.gunModel['ɓ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 10, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.25F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, -0.25F, 0.0F, 2.5F);
/* 2613 */     this.gunModel['ɓ'].setRotationPoint(-141.75F, -23.5F, 1.0F);
/*      */     
/* 2615 */     this.gunModel['ɔ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2616 */     this.gunModel['ɔ'].setRotationPoint(-139.25F, -21.5F, -1.5F);
/*      */     
/* 2618 */     this.gunModel['ɕ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2619 */     this.gunModel['ɕ'].setRotationPoint(-139.75F, -22.5F, -1.5F);
/*      */     
/* 2621 */     this.gunModel['ɖ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2622 */     this.gunModel['ɖ'].setRotationPoint(-141.75F, -18.5F, -1.5F);
/*      */     
/* 2624 */     this.gunModel['ɗ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2625 */     this.gunModel['ɗ'].setRotationPoint(-139.75F, -20.5F, -1.5F);
/*      */     
/* 2627 */     this.gunModel['ɘ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2628 */     this.gunModel['ɘ'].setRotationPoint(-139.25F, -15.5F, -1.5F);
/*      */     
/* 2630 */     this.gunModel['ə'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 2631 */     this.gunModel['ə'].setRotationPoint(-139.75F, -14.5F, -1.5F);
/*      */     
/* 2633 */     this.gunModel['ɚ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 15, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 2634 */     this.gunModel['ɚ'].setRotationPoint(-142.75F, -13.0F, -1.5F);
/*      */     
/* 2636 */     this.gunModel['ɛ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2637 */     this.gunModel['ɛ'].setRotationPoint(-139.75F, -12.0F, -1.5F);
/*      */     
/* 2639 */     this.gunModel['ɜ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2640 */     this.gunModel['ɜ'].setRotationPoint(-138.75F, -10.0F, -1.5F);
/*      */     
/* 2642 */     this.gunModel['ɝ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 2643 */     this.gunModel['ɝ'].setRotationPoint(-139.25F, -9.0F, -1.5F);
/*      */     
/* 2645 */     this.gunModel['ɞ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2646 */     this.gunModel['ɞ'].setRotationPoint(-142.25F, -7.5F, -1.5F);
/*      */     
/* 2648 */     this.gunModel['ɟ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 2649 */     this.gunModel['ɟ'].setRotationPoint(-139.25F, -6.5F, -1.5F);
/*      */     
/* 2651 */     this.gunModel['ɠ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 15, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2652 */     this.gunModel['ɠ'].setRotationPoint(-138.25F, -4.5F, -1.5F);
/*      */     
/* 2654 */     this.gunModel['ɡ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2655 */     this.gunModel['ɡ'].setRotationPoint(-138.25F, 0.5F, -1.5F);
/*      */     
/* 2657 */     this.gunModel['ɢ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 15, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2658 */     this.gunModel['ɢ'].setRotationPoint(-141.25F, -2.0F, -1.5F);
/*      */     
/* 2660 */     this.gunModel['ɣ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F);
/* 2661 */     this.gunModel['ɣ'].setRotationPoint(-139.25F, -3.5F, -1.5F);
/*      */     
/* 2663 */     this.gunModel['ɤ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 15, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 2664 */     this.gunModel['ɤ'].setRotationPoint(-138.25F, -1.5F, -1.5F);
/*      */     
/* 2666 */     this.gunModel['ɥ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2667 */     this.gunModel['ɥ'].setRotationPoint(-141.25F, 2.5F, -1.5F);
/*      */     
/* 2669 */     this.gunModel['ɦ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 10, 0.0F, 1.0F, -0.5F, 2.0F, -1.0F, -0.5F, 2.0F, -1.0F, -0.5F, 2.0F, 1.0F, -0.5F, 2.0F, -1.25F, 0.5F, 1.0F, 1.25F, 0.5F, 1.0F, 1.25F, 0.5F, 1.0F, -1.25F, 0.5F, 1.0F);
/* 2670 */     this.gunModel['ɦ'].setRotationPoint(-138.25F, 3.0F, 1.0F);
/*      */     
/* 2672 */     this.gunModel['ɧ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 10, 0.0F, -1.25F, 0.5F, 0.5F, 1.25F, 0.5F, 0.5F, 1.25F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 2673 */     this.gunModel['ɧ'].setRotationPoint(-138.25F, 7.0F, 1.0F);
/*      */     
/* 2675 */     this.gunModel['ɨ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 10, 0.0F, 0.25F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 2676 */     this.gunModel['ɨ'].setRotationPoint(-136.75F, 5.5F, 1.0F);
/*      */     
/* 2678 */     this.gunModel['ɩ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 6, 10, 0.0F, 1.0F, -0.5F, 2.0F, -0.75F, -0.5F, 2.0F, -0.75F, -0.5F, 2.0F, 1.0F, -0.5F, 2.0F, -1.0F, 1.1F, 0.0F, 0.75F, -0.15F, 0.0F, 0.75F, -0.15F, 0.0F, -1.0F, 1.1F, 0.0F);
/* 2679 */     this.gunModel['ɩ'].setRotationPoint(-140.25F, 3.0F, 1.0F);
/*      */     
/* 2681 */     this.gunModel['ɪ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 15, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 2682 */     this.gunModel['ɪ'].setRotationPoint(-142.75F, -12.0F, -2.0F);
/*      */     
/* 2684 */     this.gunModel['ɫ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 2685 */     this.gunModel['ɫ'].setRotationPoint(-142.75F, -6.5F, -1.5F);
/*      */     
/* 2687 */     this.gunModel['ɬ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 2688 */     this.gunModel['ɬ'].setRotationPoint(-142.25F, -1.0F, -1.5F);
/*      */     
/* 2690 */     this.gunModel['ɭ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/* 2691 */     this.gunModel['ɭ'].setRotationPoint(-142.75F, -17.5F, -1.5F);
/*      */     
/* 2693 */     this.gunModel['ɮ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 15, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2694 */     this.gunModel['ɮ'].setRotationPoint(-141.75F, -23.0F, -1.5F);
/*      */     
/* 2696 */     this.gunModel['ɯ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 27, 15, 0.0F, 1.0F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 1.0F, 0.0F, -2.5F, -0.35F, 0.0F, -2.9F, -0.5F, 0.0F, -2.9F, -0.5F, 0.0F, -2.9F, -0.35F, 0.0F, -2.9F);
/* 2697 */     this.gunModel['ɯ'].setRotationPoint(-140.75F, -17.5F, -1.5F);
/*      */     
/* 2699 */     this.gunModel['ɰ'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 9, 15, 0.0F, 0.2F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 0.2F, 0.0F, -2.5F, 0.25F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, 0.25F, 0.0F, -2.5F);
/* 2700 */     this.gunModel['ɰ'].setRotationPoint(-140.75F, -26.5F, -1.5F);
/*      */     
/* 2702 */     this.gunModel['ɱ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2703 */     this.gunModel['ɱ'].setRotationPoint(-41.5F, -13.5F, 11.25F);
/*      */     
/* 2705 */     this.gunModel['ɲ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 2706 */     this.gunModel['ɲ'].setRotationPoint(-41.5F, -12.0F, 11.25F);
/*      */     
/* 2708 */     this.gunModel['ɳ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2709 */     this.gunModel['ɳ'].setRotationPoint(-41.5F, -15.0F, 11.25F);
/*      */     
/* 2711 */     this.gunModel['ɴ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2712 */     this.gunModel['ɴ'].setRotationPoint(-42.0F, -13.5F, 11.25F);
/*      */     
/* 2714 */     this.gunModel['ɵ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2715 */     this.gunModel['ɵ'].setRotationPoint(-37.0F, -13.5F, 10.75F);
/*      */     
/* 2717 */     this.gunModel['ɶ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2718 */     this.gunModel['ɶ'].setRotationPoint(-33.0F, -13.5F, 10.75F);
/*      */     
/* 2720 */     this.gunModel['ɷ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2721 */     this.gunModel['ɷ'].setRotationPoint(-36.0F, -14.5F, 11.0F);
/*      */     
/* 2723 */     this.gunModel['ɸ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2724 */     this.gunModel['ɸ'].setRotationPoint(-45.5F, -14.5F, 11.0F);
/*      */     
/* 2726 */     this.gunModel['ɹ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2727 */     this.gunModel['ɹ'].setRotationPoint(-41.0F, -17.5F, 10.6F);
/*      */     
/* 2729 */     this.gunModel['ɺ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2730 */     this.gunModel['ɺ'].setRotationPoint(-46.0F, -12.5F, 10.6F);
/*      */     
/* 2732 */     this.gunModel['ɻ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2733 */     this.gunModel['ɻ'].setRotationPoint(-36.0F, -12.5F, 10.6F);
/*      */     
/* 2735 */     this.gunModel['ɼ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F);
/* 2736 */     this.gunModel['ɼ'].setRotationPoint(-39.0F, -13.5F, 11.75F);
/*      */     
/* 2738 */     this.gunModel['ɽ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F);
/* 2739 */     this.gunModel['ɽ'].setRotationPoint(-45.5F, -14.5F, 12.0F);
/*      */     
/* 2741 */     this.gunModel['ɾ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F);
/* 2742 */     this.gunModel['ɾ'].setRotationPoint(-36.0F, -14.5F, 12.0F);
/*      */     
/* 2744 */     this.gunModel['ɿ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2745 */     this.gunModel['ɿ'].setRotationPoint(-18.0F, -16.5F, 11.5F);
/*      */     
/* 2747 */     this.gunModel['ʀ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F);
/* 2748 */     this.gunModel['ʀ'].setRotationPoint(-18.0F, -14.5F, 11.5F);
/*      */     
/* 2750 */     this.gunModel['ʁ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2751 */     this.gunModel['ʁ'].setRotationPoint(-19.5F, -18.5F, 11.5F);
/*      */     
/* 2753 */     this.gunModel['ʂ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2754 */     this.gunModel['ʂ'].setRotationPoint(-16.5F, -18.5F, 11.5F);
/*      */     
/* 2756 */     this.gunModel['ʃ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 2757 */     this.gunModel['ʃ'].setRotationPoint(-18.0F, -19.5F, 11.5F);
/*      */     
/* 2759 */     this.gunModel['ʄ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2760 */     this.gunModel['ʄ'].setRotationPoint(-18.0F, -20.0F, 11.5F);
/*      */     
/* 2762 */     this.gunModel['ʅ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2763 */     this.gunModel['ʅ'].setRotationPoint(-18.0F, -21.0F, 12.0F);
/*      */     
/* 2765 */     this.gunModel['ʆ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2766 */     this.gunModel['ʆ'].setRotationPoint(-18.5F, -21.0F, 12.0F);
/*      */     
/* 2768 */     this.gunModel['ʇ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F);
/* 2769 */     this.gunModel['ʇ'].setRotationPoint(-19.0F, -21.0F, 12.0F);
/*      */     
/* 2771 */     this.gunModel['ʈ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2772 */     this.gunModel['ʈ'].setRotationPoint(-16.5F, -21.0F, 12.0F);
/*      */     
/* 2774 */     this.gunModel['ʉ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 2775 */     this.gunModel['ʉ'].setRotationPoint(-16.0F, -21.0F, 12.0F);
/*      */     
/* 2777 */     this.gunModel['ʊ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2778 */     this.gunModel['ʊ'].setRotationPoint(-19.0F, -22.0F, 12.0F);
/*      */     
/* 2780 */     this.gunModel['ʋ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2781 */     this.gunModel['ʋ'].setRotationPoint(-18.5F, -23.25F, 12.0F);
/*      */     
/* 2783 */     this.gunModel['ʌ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -1.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2784 */     this.gunModel['ʌ'].setRotationPoint(-19.0F, -23.25F, 12.0F);
/*      */     
/* 2786 */     this.gunModel['ʍ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2787 */     this.gunModel['ʍ'].setRotationPoint(-16.5F, -23.25F, 12.0F);
/*      */     
/* 2789 */     this.gunModel['ʎ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.25F, -0.75F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F, -1.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2790 */     this.gunModel['ʎ'].setRotationPoint(-16.0F, -23.25F, 12.0F);
/*      */     
/* 2792 */     this.gunModel['ʏ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2793 */     this.gunModel['ʏ'].setRotationPoint(-18.0F, -23.25F, 12.0F);
/*      */     
/* 2795 */     this.gunModel['ʐ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 2796 */     this.gunModel['ʐ'].setRotationPoint(-18.0F, -17.0F, 11.5F);
/*      */     
/* 2798 */     this.gunModel['ʑ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2799 */     this.gunModel['ʑ'].setRotationPoint(-18.0F, -21.5F, 12.5F);
/*      */     
/* 2801 */     this.gunModel['ʒ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2802 */     this.gunModel['ʒ'].setRotationPoint(-18.0F, -22.0F, 12.5F);
/*      */     
/* 2804 */     this.gunModel['ʓ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 2805 */     this.gunModel['ʓ'].setRotationPoint(-18.0F, -21.0F, 12.5F);
/*      */     
/* 2807 */     this.gunModel['ʔ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2808 */     this.gunModel['ʔ'].setRotationPoint(9.0F, -24.0F, -0.5F);
/*      */     
/* 2810 */     this.gunModel['ʕ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2811 */     this.gunModel['ʕ'].setRotationPoint(9.0F, -27.0F, -1.5F);
/*      */     
/* 2813 */     this.gunModel['ʖ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2814 */     this.gunModel['ʖ'].setRotationPoint(9.0F, -30.0F, 0.5F);
/*      */     
/* 2816 */     this.gunModel['ʗ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2817 */     this.gunModel['ʗ'].setRotationPoint(9.0F, -28.0F, -0.5F);
/*      */     
/* 2819 */     this.gunModel['ʘ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 2, 4, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.5F);
/* 2820 */     this.gunModel['ʘ'].setRotationPoint(-51.0F, -25.0F, -3.5F);
/*      */     
/* 2822 */     this.gunModel['ʙ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 2, 3, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F);
/* 2823 */     this.gunModel['ʙ'].setRotationPoint(-51.0F, -27.0F, -4.5F);
/*      */     
/* 2825 */     this.gunModel['ʚ'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 1.0F, 1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F);
/* 2826 */     this.gunModel['ʚ'].setRotationPoint(-51.0F, -28.0F, -2.5F);
/*      */     
/* 2828 */     this.gunModel['ʛ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.75F, -2.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.75F);
/* 2829 */     this.gunModel['ʛ'].setRotationPoint(-40.0F, -25.0F, -3.5F);
/*      */     
/* 2831 */     this.gunModel['ʜ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2832 */     this.gunModel['ʜ'].setRotationPoint(-40.0F, -27.0F, -4.5F);
/*      */     
/* 2834 */     this.gunModel['ʝ'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 1, 3, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 2835 */     this.gunModel['ʝ'].setRotationPoint(-40.0F, -29.0F, -2.5F);
/*      */     
/* 2837 */     this.gunModel['ʞ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2838 */     this.gunModel['ʞ'].setRotationPoint(-41.5F, -13.5F, -0.5F);
/*      */     
/* 2840 */     this.gunModel['ʟ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F);
/* 2841 */     this.gunModel['ʟ'].setRotationPoint(-41.5F, -12.0F, -0.5F);
/*      */     
/* 2843 */     this.gunModel['ʠ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 1, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -1.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2844 */     this.gunModel['ʠ'].setRotationPoint(-41.5F, -15.0F, -0.5F);
/*      */     
/* 2846 */     this.gunModel['ʡ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2847 */     this.gunModel['ʡ'].setRotationPoint(-42.0F, -13.5F, -0.5F);
/*      */     
/* 2849 */     this.gunModel['ʢ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2850 */     this.gunModel['ʢ'].setRotationPoint(-37.0F, -13.5F, -1.0F);
/*      */     
/* 2852 */     this.gunModel['ʣ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2853 */     this.gunModel['ʣ'].setRotationPoint(-33.0F, -13.5F, -1.0F);
/*      */     
/* 2855 */     this.gunModel['ʤ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2856 */     this.gunModel['ʤ'].setRotationPoint(-36.0F, -14.5F, 0.0F);
/*      */     
/* 2858 */     this.gunModel['ʥ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2859 */     this.gunModel['ʥ'].setRotationPoint(-45.5F, -14.5F, 0.0F);
/*      */     
/* 2861 */     this.gunModel['ʦ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2862 */     this.gunModel['ʦ'].setRotationPoint(-41.0F, -17.5F, 0.4F);
/*      */     
/* 2864 */     this.gunModel['ʧ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2865 */     this.gunModel['ʧ'].setRotationPoint(-46.0F, -12.5F, 0.4F);
/*      */     
/* 2867 */     this.gunModel['ʨ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2868 */     this.gunModel['ʨ'].setRotationPoint(-36.0F, -12.5F, 0.4F);
/*      */     
/* 2870 */     this.gunModel['ʩ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2871 */     this.gunModel['ʩ'].setRotationPoint(-39.0F, -13.5F, -1.0F);
/*      */     
/* 2873 */     this.gunModel['ʪ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2874 */     this.gunModel['ʪ'].setRotationPoint(-45.5F, -14.5F, -1.0F);
/*      */     
/* 2876 */     this.gunModel['ʫ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2877 */     this.gunModel['ʫ'].setRotationPoint(-36.0F, -14.5F, -1.0F);
/*      */     
/* 2879 */     this.gunModel['ʬ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 11, 1, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2880 */     this.gunModel['ʬ'].setRotationPoint(-11.5F, -14.5F, -1.0F);
/*      */     
/* 2882 */     this.gunModel['ʭ'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, -0.75F, 0.25F, -0.5F, -1.0F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.5F, -0.25F, -0.5F, -1.75F, -0.25F, -0.5F, -1.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 2883 */     this.gunModel['ʭ'].setRotationPoint(-11.5F, -3.5F, -1.0F);
/*      */     
/* 2885 */     this.gunModel['ʮ'].addShapeBox(40.0F, -11.0F, -6.0F, 23, 3, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2886 */     this.gunModel['ʮ'].setRotationPoint(-15.5F, -17.0F, -1.0F);
/*      */     
/* 2888 */     this.gunModel['ʯ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2889 */     this.gunModel['ʯ'].setRotationPoint(7.5F, -17.0F, -1.0F);
/*      */     
/* 2891 */     this.gunModel['ʰ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 2892 */     this.gunModel['ʰ'].setRotationPoint(-16.5F, -17.0F, -1.0F);
/*      */     
/* 2894 */     this.gunModel['ʱ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2895 */     this.gunModel['ʱ'].setRotationPoint(-13.75F, -7.0F, -1.0F);
/*      */     
/* 2897 */     this.gunModel['ʲ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, -0.5F, -0.75F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 2898 */     this.gunModel['ʲ'].setRotationPoint(-14.75F, -7.0F, -1.0F);
/*      */     
/* 2900 */     this.gunModel['ʳ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2901 */     this.gunModel['ʳ'].setRotationPoint(-17.5F, -11.5F, -1.0F);
/*      */     
/* 2903 */     this.gunModel['ʴ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2904 */     this.gunModel['ʴ'].setRotationPoint(-17.5F, -12.5F, -1.0F);
/*      */     
/* 2906 */     this.gunModel['ʵ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2907 */     this.gunModel['ʵ'].setRotationPoint(-17.5F, -10.5F, -1.0F);
/*      */     
/* 2909 */     this.gunModel['ʶ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2910 */     this.gunModel['ʶ'].setRotationPoint(-53.0F, -27.55F, -12.25F);
/* 2911 */     this.gunModel['ʶ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2913 */     this.gunModel['ʷ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 2914 */     this.gunModel['ʷ'].setRotationPoint(-53.0F, -26.55F, -12.25F);
/* 2915 */     this.gunModel['ʷ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2917 */     this.gunModel['ʸ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F);
/* 2918 */     this.gunModel['ʸ'].setRotationPoint(-53.0F, -25.55F, -12.25F);
/* 2919 */     this.gunModel['ʸ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2921 */     this.gunModel['ʹ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2922 */     this.gunModel['ʹ'].setRotationPoint(-54.0F, -26.4F, -12.65F);
/* 2923 */     this.gunModel['ʹ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2925 */     this.gunModel['ʺ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F);
/* 2926 */     this.gunModel['ʺ'].setRotationPoint(-54.0F, -25.4F, -12.65F);
/* 2927 */     this.gunModel['ʺ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2929 */     this.gunModel['ʻ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 4, 0.0F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.75F, -0.25F, 0.25F, -1.75F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2930 */     this.gunModel['ʻ'].setRotationPoint(-54.0F, -27.65F, -12.65F);
/* 2931 */     this.gunModel['ʻ'].rotateAngleY = 0.17453294F;
/*      */     
/* 2933 */     this.gunModel['ʼ'].addShapeBox(40.0F, -11.0F, -6.0F, 28, 3, 2, 0.0F, 2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F);
/* 2934 */     this.gunModel['ʼ'].setRotationPoint(-19.0F, -30.0F, -1.5F);
/*      */     
/* 2936 */     this.gunModel['ʽ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F);
/* 2937 */     this.gunModel['ʽ'].setRotationPoint(-19.5F, -19.25F, -1.5F);
/*      */     
/* 2939 */     this.gunModel['ʾ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 2940 */     this.gunModel['ʾ'].setRotationPoint(-19.5F, -15.25F, -1.9F);
/*      */     
/* 2942 */     this.gunModel['ʿ'].addShapeBox(40.0F, -11.0F, -6.0F, 26, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, -0.25F, -2.5F, 0.0F, -0.25F);
/* 2943 */     this.gunModel['ʿ'].setRotationPoint(-19.0F, -14.25F, -2.15F);
/*      */     
/* 2945 */     this.gunModel['ˀ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 2946 */     this.gunModel['ˀ'].setRotationPoint(-19.5F, -21.0F, -0.25F);
/*      */     
/* 2948 */     this.gunModel['ˁ'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 2949 */     this.gunModel['ˁ'].setRotationPoint(-19.5F, -20.0F, -0.5F);
/*      */     
/* 2951 */     this.gunModel['˂'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 3, 0.0F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2952 */     this.gunModel['˂'].setRotationPoint(-19.5F, -21.75F, -0.5F);
/*      */     
/* 2954 */     this.gunModel['˃'].addShapeBox(40.0F, -11.0F, -6.0F, 27, 1, 2, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2955 */     this.gunModel['˃'].setRotationPoint(-19.5F, -20.25F, -1.25F);
/*      */     
/* 2957 */     this.gunModel['˄'].addShapeBox(40.0F, -11.0F, -6.0F, 7, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2958 */     this.gunModel['˄'].setRotationPoint(20.0F, -20.25F, -1.0F);
/*      */     
/* 2960 */     this.gunModel['˅'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2961 */     this.gunModel['˅'].setRotationPoint(22.5F, -18.5F, -1.5F);
/*      */     
/* 2963 */     this.gunModel['ˆ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2964 */     this.gunModel['ˆ'].setRotationPoint(22.5F, -19.0F, -1.5F);
/*      */     
/* 2966 */     this.gunModel['ˇ'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 2, 0.0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F);
/* 2967 */     this.gunModel['ˇ'].setRotationPoint(22.5F, -18.0F, -1.5F);
/*      */     
/* 2969 */     this.gunModel['ˈ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 4, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2970 */     this.gunModel['ˈ'].setRotationPoint(-27.0F, -30.0F, -3.25F);
/*      */     
/* 2972 */     this.gunModel['ˉ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2973 */     this.gunModel['ˉ'].setRotationPoint(-24.0F, -28.0F, -3.25F);
/*      */     
/* 2975 */     this.gunModel['ˊ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 3, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, -1.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 2976 */     this.gunModel['ˊ'].setRotationPoint(-24.0F, -26.0F, -3.25F);
/*      */     
/* 2978 */     this.gunModel['ˋ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, -1.75F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 2979 */     this.gunModel['ˋ'].setRotationPoint(-24.0F, -26.5F, -3.25F);
/*      */     
/* 2981 */     this.gunModel['ˌ'].addShapeBox(40.0F, -11.0F, -6.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 2982 */     this.gunModel['ˌ'].setRotationPoint(-24.0F, -30.0F, -3.25F);
/*      */     
/* 2984 */     this.gunModel['ˍ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2985 */     this.gunModel['ˍ'].setRotationPoint(-27.0F, -28.0F, -3.25F);
/*      */     
/* 2987 */     this.gunModel['ˎ'].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, -2.0F, 0.5F, -1.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2988 */     this.gunModel['ˎ'].setRotationPoint(-27.0F, -26.5F, -3.25F);
/*      */     
/* 2990 */     this.gunModel['ˏ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2991 */     this.gunModel['ˏ'].setRotationPoint(-20.0F, -24.0F, -1.25F);
/*      */     
/* 2993 */     this.gunModel['ː'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2994 */     this.gunModel['ː'].setRotationPoint(-20.0F, -20.0F, -1.25F);
/*      */     
/* 2996 */     this.gunModel['ˑ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2997 */     this.gunModel['ˑ'].setRotationPoint(-20.0F, -21.0F, -1.25F);
/*      */     
/* 2999 */     this.gunModel['˒'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 8, 6, 0.0F, -0.5F, 0.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F);
/* 3000 */     this.gunModel['˒'].setRotationPoint(7.0F, -28.0F, -3.5F);
/*      */     
/* 3002 */     this.gunModel['˓'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 3, 6, 0.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F, -0.5F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 3003 */     this.gunModel['˓'].setRotationPoint(7.0F, -21.0F, -3.5F);
/*      */     
/* 3005 */     this.gunModel['˔'].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 6, 0.0F, -0.5F, -1.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, 1.0F, -0.5F, -1.0F, 1.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F);
/* 3006 */     this.gunModel['˔'].setRotationPoint(7.0F, -22.0F, -3.5F);
/*      */     
/* 3008 */     this.gunModel['˕'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3009 */     this.gunModel['˕'].setRotationPoint(31.0F, -21.25F, -3.5F);
/*      */     
/* 3011 */     this.gunModel['˖'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3012 */     this.gunModel['˖'].setRotationPoint(31.0F, -20.25F, -3.5F);
/*      */     
/* 3014 */     this.gunModel['˗'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3015 */     this.gunModel['˗'].setRotationPoint(36.25F, -20.25F, -3.5F);
/*      */     
/* 3017 */     this.gunModel['˘'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3018 */     this.gunModel['˘'].setRotationPoint(31.0F, -19.25F, -1.0F);
/*      */     
/* 3020 */     this.gunModel['˙'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3021 */     this.gunModel['˙'].setRotationPoint(36.25F, -19.25F, -1.0F);
/*      */     
/* 3023 */     this.gunModel['˚'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3024 */     this.gunModel['˚'].setRotationPoint(31.0F, -22.25F, 12.5F);
/*      */     
/* 3026 */     this.gunModel['˛'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3027 */     this.gunModel['˛'].setRotationPoint(43.0F, -22.25F, 12.5F);
/*      */     
/* 3029 */     this.gunModel['˜'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3030 */     this.gunModel['˜'].setRotationPoint(60.0F, -22.25F, 12.5F);
/*      */     
/* 3032 */     this.gunModel['˝'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3033 */     this.gunModel['˝'].setRotationPoint(75.0F, -22.25F, 12.5F);
/*      */     
/* 3035 */     this.gunModel['˞'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 1.5F, -1.5F, 0.0F, 1.5F, -1.5F, 0.0F, -2.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F);
/* 3036 */     this.gunModel['˞'].setRotationPoint(82.0F, -22.25F, 12.5F);
/*      */     
/* 3038 */     this.gunModel['˟'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F);
/* 3039 */     this.gunModel['˟'].setRotationPoint(82.0F, -20.25F, 12.5F);
/*      */     
/* 3041 */     this.gunModel['ˠ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F);
/* 3042 */     this.gunModel['ˠ'].setRotationPoint(89.25F, -20.25F, 12.5F);
/*      */     
/* 3044 */     this.gunModel['ˡ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 3045 */     this.gunModel['ˡ'].setRotationPoint(82.0F, -19.25F, 11.0F);
/*      */     
/* 3047 */     this.gunModel['ˢ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F);
/* 3048 */     this.gunModel['ˢ'].setRotationPoint(89.25F, -19.25F, 11.0F);
/*      */     
/* 3050 */     this.gunModel['ˣ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F);
/* 3051 */     this.gunModel['ˣ'].setRotationPoint(82.0F, -21.25F, 12.5F);
/*      */     
/* 3053 */     this.gunModel['ˤ'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3054 */     this.gunModel['ˤ'].setRotationPoint(82.0F, -22.25F, -3.5F);
/*      */     
/* 3056 */     this.gunModel['˥'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3057 */     this.gunModel['˥'].setRotationPoint(75.0F, -22.25F, -3.5F);
/*      */     
/* 3059 */     this.gunModel['˦'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3060 */     this.gunModel['˦'].setRotationPoint(60.0F, -22.25F, -3.5F);
/*      */     
/* 3062 */     this.gunModel['˧'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3063 */     this.gunModel['˧'].setRotationPoint(43.0F, -22.25F, -3.5F);
/*      */     
/* 3065 */     this.gunModel['˨'].addShapeBox(40.0F, -11.0F, -6.0F, 6, 3, 3, 0.0F, 0.0F, 1.5F, -1.5F, 0.25F, 1.5F, -1.5F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.25F, -2.0F, -1.5F, 0.25F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F);
/* 3066 */     this.gunModel['˨'].setRotationPoint(31.0F, -22.25F, -3.5F);
/*      */     
/* 3068 */     this.gunModel['˩'].addShapeBox(40.0F, -11.0F, -6.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3069 */     this.gunModel['˩'].setRotationPoint(43.0F, -21.25F, -3.5F);
/*      */     
/* 3071 */     this.gunModel['˪'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3072 */     this.gunModel['˪'].setRotationPoint(43.0F, -20.25F, -3.5F);
/*      */     
/* 3074 */     this.gunModel['˫'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3075 */     this.gunModel['˫'].setRotationPoint(53.25F, -20.25F, -3.5F);
/*      */     
/* 3077 */     this.gunModel['ˬ'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3078 */     this.gunModel['ˬ'].setRotationPoint(43.0F, -19.25F, -1.0F);
/*      */     
/* 3080 */     this.gunModel['˭'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3081 */     this.gunModel['˭'].setRotationPoint(53.25F, -19.25F, -1.0F);
/*      */     
/* 3083 */     this.gunModel['ˮ'].addShapeBox(40.0F, -11.0F, -6.0F, 12, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3084 */     this.gunModel['ˮ'].setRotationPoint(60.0F, -21.25F, -3.5F);
/*      */     
/* 3086 */     this.gunModel['˯'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3087 */     this.gunModel['˯'].setRotationPoint(60.0F, -20.25F, -3.5F);
/*      */     
/* 3089 */     this.gunModel['˰'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3090 */     this.gunModel['˰'].setRotationPoint(71.25F, -20.25F, -3.5F);
/*      */     
/* 3092 */     this.gunModel['˱'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3093 */     this.gunModel['˱'].setRotationPoint(60.0F, -19.25F, -1.0F);
/*      */     
/* 3095 */     this.gunModel['˲'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3096 */     this.gunModel['˲'].setRotationPoint(71.25F, -19.25F, -1.0F);
/*      */     
/* 3098 */     this.gunModel['˳'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3099 */     this.gunModel['˳'].setRotationPoint(75.0F, -20.25F, -3.5F);
/*      */     
/* 3101 */     this.gunModel['˴'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3102 */     this.gunModel['˴'].setRotationPoint(75.0F, -19.25F, -1.0F);
/*      */     
/* 3104 */     this.gunModel['˵'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3105 */     this.gunModel['˵'].setRotationPoint(78.25F, -20.25F, -3.5F);
/*      */     
/* 3107 */     this.gunModel['˶'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3108 */     this.gunModel['˶'].setRotationPoint(78.25F, -19.25F, -1.0F);
/*      */     
/* 3110 */     this.gunModel['˷'].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3111 */     this.gunModel['˷'].setRotationPoint(75.0F, -21.25F, -3.5F);
/*      */     
/* 3113 */     this.gunModel['˸'].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 3, 0.0F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -1.5F, 0.25F, -1.0F, -1.5F, 0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 3114 */     this.gunModel['˸'].setRotationPoint(82.0F, -21.25F, -3.5F);
/*      */     
/* 3116 */     this.gunModel['˹'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -2.25F, -1.0F, -0.5F, -2.25F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3117 */     this.gunModel['˹'].setRotationPoint(82.0F, -20.25F, -3.5F);
/*      */     
/* 3119 */     this.gunModel['˺'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, -1.0F, -0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3120 */     this.gunModel['˺'].setRotationPoint(82.0F, -19.25F, -1.0F);
/*      */     
/* 3122 */     this.gunModel['˻'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 3, 0.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.0F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F);
/* 3123 */     this.gunModel['˻'].setRotationPoint(89.25F, -20.25F, -3.5F);
/*      */     
/* 3125 */     this.gunModel['˼'].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3126 */     this.gunModel['˼'].setRotationPoint(89.25F, -19.25F, -1.0F);
/*      */     
/* 3128 */     this.gunModel['˽'].addShapeBox(40.0F, -11.0F, -6.0F, 82, 9, 1, 0.0F, -0.25F, -1.5F, -0.5F, -3.0F, -1.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -1.75F, -0.5F, -3.0F, -1.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 3129 */     this.gunModel['˽'].setRotationPoint(11.0F, -28.5F, -5.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultBarrelModel_1()
/*      */   {
/* 3134 */     this.defaultBarrelModel[0] = new ModelRendererTurbo(this, 793, 57, this.textureX, this.textureY);
/* 3135 */     this.defaultBarrelModel[1] = new ModelRendererTurbo(this, 817, 57, this.textureX, this.textureY);
/* 3136 */     this.defaultBarrelModel[2] = new ModelRendererTurbo(this, 841, 57, this.textureX, this.textureY);
/* 3137 */     this.defaultBarrelModel[3] = new ModelRendererTurbo(this, 857, 57, this.textureX, this.textureY);
/* 3138 */     this.defaultBarrelModel[4] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/* 3139 */     this.defaultBarrelModel[5] = new ModelRendererTurbo(this, 913, 57, this.textureX, this.textureY);
/* 3140 */     this.defaultBarrelModel[6] = new ModelRendererTurbo(this, 937, 57, this.textureX, this.textureY);
/* 3141 */     this.defaultBarrelModel[7] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 3142 */     this.defaultBarrelModel[8] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/* 3143 */     this.defaultBarrelModel[9] = new ModelRendererTurbo(this, 785, 57, this.textureX, this.textureY);
/* 3144 */     this.defaultBarrelModel[10] = new ModelRendererTurbo(this, 1441, 57, this.textureX, this.textureY);
/* 3145 */     this.defaultBarrelModel[11] = new ModelRendererTurbo(this, 1625, 57, this.textureX, this.textureY);
/* 3146 */     this.defaultBarrelModel[12] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/* 3147 */     this.defaultBarrelModel[13] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/* 3148 */     this.defaultBarrelModel[14] = new ModelRendererTurbo(this, 921, 81, this.textureX, this.textureY);
/*      */     
/* 3150 */     this.defaultBarrelModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 2, 8, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3151 */     this.defaultBarrelModel[0].setRotationPoint(135.0F, -28.5F, 2.0F);
/*      */     
/* 3153 */     this.defaultBarrelModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 8, 0.0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F);
/* 3154 */     this.defaultBarrelModel[1].setRotationPoint(138.0F, -28.5F, 2.0F);
/*      */     
/* 3156 */     this.defaultBarrelModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 3, 8, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3157 */     this.defaultBarrelModel[2].setRotationPoint(140.0F, -28.5F, 2.0F);
/*      */     
/* 3159 */     this.defaultBarrelModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 3160 */     this.defaultBarrelModel[3].setRotationPoint(143.0F, -28.5F, 2.0F);
/*      */     
/* 3162 */     this.defaultBarrelModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 8, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3163 */     this.defaultBarrelModel[4].setRotationPoint(143.0F, -22.5F, 2.0F);
/*      */     
/* 3165 */     this.defaultBarrelModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3166 */     this.defaultBarrelModel[5].setRotationPoint(143.0F, -26.0F, 2.0F);
/*      */     
/* 3168 */     this.defaultBarrelModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3169 */     this.defaultBarrelModel[6].setRotationPoint(143.0F, -28.5F, 6.0F);
/*      */     
/* 3171 */     this.defaultBarrelModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3172 */     this.defaultBarrelModel[7].setRotationPoint(149.0F, -24.5F, 2.0F);
/*      */     
/* 3174 */     this.defaultBarrelModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3175 */     this.defaultBarrelModel[8].setRotationPoint(149.0F, -27.5F, 2.0F);
/*      */     
/* 3177 */     this.defaultBarrelModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3178 */     this.defaultBarrelModel[9].setRotationPoint(149.0F, -28.5F, 5.0F);
/*      */     
/* 3180 */     this.defaultBarrelModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3181 */     this.defaultBarrelModel[10].setRotationPoint(149.0F, -24.5F, 8.0F);
/*      */     
/* 3183 */     this.defaultBarrelModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 3184 */     this.defaultBarrelModel[11].setRotationPoint(149.0F, -27.5F, 8.0F);
/*      */     
/* 3186 */     this.defaultBarrelModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3187 */     this.defaultBarrelModel[12].setRotationPoint(143.0F, -26.0F, 8.0F);
/*      */     
/* 3189 */     this.defaultBarrelModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3190 */     this.defaultBarrelModel[13].setRotationPoint(143.0F, -23.5F, 2.0F);
/*      */     
/* 3192 */     this.defaultBarrelModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/* 3193 */     this.defaultBarrelModel[14].setRotationPoint(143.0F, -23.5F, 8.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 3198 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 1697, 57, this.textureX, this.textureY);
/* 3199 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 1737, 57, this.textureX, this.textureY);
/* 3200 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 3201 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1129, 57, this.textureX, this.textureY);
/* 3202 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 1249, 57, this.textureX, this.textureY);
/* 3203 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 1297, 57, this.textureX, this.textureY);
/* 3204 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 1809, 57, this.textureX, this.textureY);
/* 3205 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 1841, 57, this.textureX, this.textureY);
/* 3206 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 1873, 57, this.textureX, this.textureY);
/* 3207 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 1905, 57, this.textureX, this.textureY);
/* 3208 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 1345, 57, this.textureX, this.textureY);
/* 3209 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 2001, 57, this.textureX, this.textureY);
/* 3210 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 1769, 57, this.textureX, this.textureY);
/* 3211 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 1937, 57, this.textureX, this.textureY);
/* 3212 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/* 3213 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 705, 9, this.textureX, this.textureY);
/* 3214 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 737, 9, this.textureX, this.textureY);
/* 3215 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 777, 9, this.textureX, this.textureY);
/* 3216 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 969, 9, this.textureX, this.textureY);
/* 3217 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/* 3218 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 1049, 9, this.textureX, this.textureY);
/* 3219 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 1089, 9, this.textureX, this.textureY);
/* 3220 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 1121, 9, this.textureX, this.textureY);
/* 3221 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/* 3222 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/* 3223 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/* 3224 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 809, 57, this.textureX, this.textureY);
/* 3225 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/* 3226 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/* 3227 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/* 3228 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/* 3229 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 3230 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/* 3231 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/* 3232 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 1393, 57, this.textureX, this.textureY);
/* 3233 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/* 3234 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 1465, 57, this.textureX, this.textureY);
/* 3235 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 857, 65, this.textureX, this.textureY);
/* 3236 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 905, 65, this.textureX, this.textureY);
/* 3237 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 1521, 57, this.textureX, this.textureY);
/* 3238 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 1593, 57, this.textureX, this.textureY);
/* 3239 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/* 3240 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/* 3241 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 1097, 65, this.textureX, this.textureY);
/* 3242 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 3243 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 1729, 57, this.textureX, this.textureY);
/* 3244 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/* 3245 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
/* 3246 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 1153, 65, this.textureX, this.textureY);
/* 3247 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 1833, 57, this.textureX, this.textureY);
/* 3248 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 1865, 57, this.textureX, this.textureY);
/* 3249 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 1897, 57, this.textureX, this.textureY);
/* 3250 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 2041, 17, this.textureX, this.textureY);
/* 3251 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 1761, 41, this.textureX, this.textureY);
/* 3252 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 2041, 49, this.textureX, this.textureY);
/* 3253 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/* 3254 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/* 3255 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/* 3256 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 1169, 65, this.textureX, this.textureY);
/* 3257 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 1193, 65, this.textureX, this.textureY);
/* 3258 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 1217, 65, this.textureX, this.textureY);
/* 3259 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 1217, 9, this.textureX, this.textureY);
/* 3260 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 1745, 49, this.textureX, this.textureY);
/* 3261 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 833, 57, this.textureX, this.textureY);
/* 3262 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 1497, 57, this.textureX, this.textureY);
/* 3263 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 2033, 57, this.textureX, this.textureY);
/* 3264 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 1281, 65, this.textureX, this.textureY);
/* 3265 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 1329, 65, this.textureX, this.textureY);
/* 3266 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 1377, 65, this.textureX, this.textureY);
/* 3267 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 513, 97, this.textureX, this.textureY);
/* 3268 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 545, 97, this.textureX, this.textureY);
/* 3269 */     this.defaultScopeModel[71] = new ModelRendererTurbo(this, 577, 97, this.textureX, this.textureY);
/* 3270 */     this.defaultScopeModel[72] = new ModelRendererTurbo(this, 1201, 9, this.textureX, this.textureY);
/* 3271 */     this.defaultScopeModel[73] = new ModelRendererTurbo(this, 1977, 9, this.textureX, this.textureY);
/* 3272 */     this.defaultScopeModel[74] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/* 3273 */     this.defaultScopeModel[75] = new ModelRendererTurbo(this, 1433, 113, this.textureX, this.textureY);
/* 3274 */     this.defaultScopeModel[76] = new ModelRendererTurbo(this, 1537, 113, this.textureX, this.textureY);
/*      */     
/* 3276 */     this.defaultScopeModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 8, 4, 11, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3277 */     this.defaultScopeModel[0].setRotationPoint(82.25F, -39.5F, 0.5F);
/*      */     
/* 3279 */     this.defaultScopeModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 10, 1, 11, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F);
/* 3280 */     this.defaultScopeModel[1].setRotationPoint(80.25F, -35.5F, 0.5F);
/*      */     
/* 3282 */     this.defaultScopeModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 2, 4, 11, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3283 */     this.defaultScopeModel[2].setRotationPoint(81.25F, -39.5F, 0.5F);
/*      */     
/* 3285 */     this.defaultScopeModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, -0.25F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F);
/* 3286 */     this.defaultScopeModel[3].setRotationPoint(80.25F, -37.5F, 0.5F);
/*      */     
/* 3288 */     this.defaultScopeModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 11, 0.0F, -1.25F, -0.25F, -1.0F, 1.5F, -0.25F, 0.0F, 1.5F, -0.25F, 0.0F, -1.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -1.0F);
/* 3289 */     this.defaultScopeModel[4].setRotationPoint(80.25F, -39.5F, 0.5F);
/*      */     
/* 3291 */     this.defaultScopeModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 11, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -1.0F);
/* 3292 */     this.defaultScopeModel[5].setRotationPoint(80.25F, -35.5F, 0.5F);
/*      */     
/* 3294 */     this.defaultScopeModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 3295 */     this.defaultScopeModel[6].setRotationPoint(83.75F, -39.0F, 0.0F);
/*      */     
/* 3297 */     this.defaultScopeModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 3298 */     this.defaultScopeModel[7].setRotationPoint(83.75F, -38.0F, 0.0F);
/*      */     
/* 3300 */     this.defaultScopeModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 3301 */     this.defaultScopeModel[8].setRotationPoint(83.75F, -37.0F, 0.0F);
/*      */     
/* 3303 */     this.defaultScopeModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 11, 0.0F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3304 */     this.defaultScopeModel[9].setRotationPoint(82.25F, -40.25F, 0.5F);
/*      */     
/* 3306 */     this.defaultScopeModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 2, 1, 11, 0.0F, -0.75F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.75F, 0.0F, -2.25F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F);
/* 3307 */     this.defaultScopeModel[10].setRotationPoint(81.25F, -40.25F, 0.5F);
/*      */     
/* 3309 */     this.defaultScopeModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 9, 0.0F, -1.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F);
/* 3310 */     this.defaultScopeModel[11].setRotationPoint(82.25F, -42.25F, 1.5F);
/*      */     
/* 3312 */     this.defaultScopeModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 5, 0.0F, -0.65F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -2.0F, -0.65F, 0.0F, -2.0F, 0.25F, 0.0F, -2.25F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F);
/* 3313 */     this.defaultScopeModel[12].setRotationPoint(82.25F, -41.25F, 0.5F);
/*      */     
/* 3315 */     this.defaultScopeModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 5, 0.0F, -0.65F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -3.0F, -0.65F, 0.0F, -3.0F, 0.25F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.25F, 0.25F, 0.0F, -2.25F);
/* 3316 */     this.defaultScopeModel[13].setRotationPoint(82.25F, -41.25F, 6.5F);
/*      */     
/* 3318 */     this.defaultScopeModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 9, 0.0F, -1.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F);
/* 3319 */     this.defaultScopeModel[14].setRotationPoint(82.25F, -43.25F, 1.5F);
/*      */     
/* 3321 */     this.defaultScopeModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, -0.35F, 0.0F, 0.5F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3322 */     this.defaultScopeModel[15].setRotationPoint(83.75F, -45.75F, 2.25F);
/*      */     
/* 3324 */     this.defaultScopeModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3325 */     this.defaultScopeModel[16].setRotationPoint(83.75F, -45.75F, 8.75F);
/*      */     
/* 3327 */     this.defaultScopeModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3328 */     this.defaultScopeModel[17].setRotationPoint(83.75F, -46.75F, 1.75F);
/*      */     
/* 3330 */     this.defaultScopeModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.5F, 0.0F, -0.6F, 0.5F, 0.0F, -0.6F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3331 */     this.defaultScopeModel[18].setRotationPoint(83.75F, -46.75F, 8.75F);
/*      */     
/* 3333 */     this.defaultScopeModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3334 */     this.defaultScopeModel[19].setRotationPoint(83.75F, -48.25F, 2.25F);
/*      */     
/* 3336 */     this.defaultScopeModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, -1.1F, 0.0F, 0.5F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3337 */     this.defaultScopeModel[20].setRotationPoint(83.75F, -48.25F, 8.75F);
/*      */     
/* 3339 */     this.defaultScopeModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -2.1F, 0.0F, -0.5F, -2.1F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, -1.1F, 0.0F, 0.5F, -1.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3340 */     this.defaultScopeModel[21].setRotationPoint(83.75F, -49.25F, 2.75F);
/*      */     
/* 3342 */     this.defaultScopeModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 1.0F, -2.1F, 0.0F, 1.0F, -2.1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 3343 */     this.defaultScopeModel[22].setRotationPoint(83.75F, -49.25F, 8.25F);
/*      */     
/* 3345 */     this.defaultScopeModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 6, 1, 5, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 3346 */     this.defaultScopeModel[23].setRotationPoint(83.75F, -44.25F, 3.5F);
/*      */     
/* 3348 */     this.defaultScopeModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 5, 0.0F, -1.5F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -3.25F, -1.5F, 0.5F, -3.25F, -1.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -2.0F, -1.5F, 0.0F, -2.0F);
/* 3349 */     this.defaultScopeModel[24].setRotationPoint(82.25F, -44.25F, 2.0F);
/*      */     
/* 3351 */     this.defaultScopeModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 5, 0.0F, -1.5F, 0.5F, -3.25F, -0.75F, 0.5F, -3.25F, -0.75F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F);
/* 3352 */     this.defaultScopeModel[25].setRotationPoint(82.25F, -44.25F, 5.0F);
/*      */     
/* 3354 */     this.defaultScopeModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 3355 */     this.defaultScopeModel[26].setRotationPoint(84.75F, -48.25F, 5.25F);
/*      */     
/* 3357 */     this.defaultScopeModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.15F, 0.0F, 0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3358 */     this.defaultScopeModel[27].setRotationPoint(84.75F, -45.25F, 6.75F);
/*      */     
/* 3360 */     this.defaultScopeModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 4, 1, 1, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, -0.15F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 3361 */     this.defaultScopeModel[28].setRotationPoint(84.75F, -45.25F, 4.25F);
/*      */     
/* 3363 */     this.defaultScopeModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 13, 4, 11, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3364 */     this.defaultScopeModel[29].setRotationPoint(-41.0F, -39.5F, 0.5F);
/*      */     
/* 3366 */     this.defaultScopeModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 14, 1, 11, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -1.5F, -0.25F, -0.5F);
/* 3367 */     this.defaultScopeModel[30].setRotationPoint(-42.0F, -35.5F, 0.5F);
/*      */     
/* 3369 */     this.defaultScopeModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 3370 */     this.defaultScopeModel[31].setRotationPoint(-36.25F, -39.25F, 0.0F);
/*      */     
/* 3372 */     this.defaultScopeModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 3373 */     this.defaultScopeModel[32].setRotationPoint(-36.25F, -38.25F, 0.0F);
/*      */     
/* 3375 */     this.defaultScopeModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F);
/* 3376 */     this.defaultScopeModel[33].setRotationPoint(-36.25F, -37.25F, 0.0F);
/*      */     
/* 3378 */     this.defaultScopeModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F);
/* 3379 */     this.defaultScopeModel[34].setRotationPoint(-41.5F, -39.5F, 0.5F);
/*      */     
/* 3381 */     this.defaultScopeModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, -1.0F, -1.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -1.75F, -0.25F, -1.0F, -1.75F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F);
/* 3382 */     this.defaultScopeModel[35].setRotationPoint(-29.0F, -35.5F, 0.5F);
/*      */     
/* 3384 */     this.defaultScopeModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 1, 4, 11, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, -1.0F, -0.25F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 3385 */     this.defaultScopeModel[36].setRotationPoint(-28.5F, -39.5F, 0.5F);
/*      */     
/* 3387 */     this.defaultScopeModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 11, 0.0F, -1.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, -1.0F, -1.75F, -0.25F, -1.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -1.75F, -0.25F, -1.0F);
/* 3388 */     this.defaultScopeModel[37].setRotationPoint(-43.0F, -35.5F, 0.5F);
/*      */     
/* 3390 */     this.defaultScopeModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 13, 2, 11, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3391 */     this.defaultScopeModel[38].setRotationPoint(-41.0F, -41.25F, 0.5F);
/*      */     
/* 3393 */     this.defaultScopeModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, -0.75F, -0.75F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.75F, -0.75F, -1.5F, -0.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F);
/* 3394 */     this.defaultScopeModel[39].setRotationPoint(-42.0F, -41.25F, 0.5F);
/*      */     
/* 3396 */     this.defaultScopeModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 11, 0.0F, -0.5F, 0.0F, -1.5F, -0.75F, -0.75F, -1.5F, -0.75F, -0.75F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F);
/* 3397 */     this.defaultScopeModel[40].setRotationPoint(-29.0F, -41.25F, 0.5F);
/*      */     
/* 3399 */     this.defaultScopeModel[41].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 8, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3400 */     this.defaultScopeModel[41].setRotationPoint(-33.0F, -41.25F, 2.0F);
/*      */     
/* 3402 */     this.defaultScopeModel[42].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 8, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3403 */     this.defaultScopeModel[42].setRotationPoint(-35.0F, -42.25F, 2.0F);
/*      */     
/* 3405 */     this.defaultScopeModel[43].addShapeBox(40.0F, -11.0F, -6.0F, 4, 3, 8, 0.0F, -0.25F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3406 */     this.defaultScopeModel[43].setRotationPoint(-38.0F, -43.25F, 2.0F);
/*      */     
/* 3408 */     this.defaultScopeModel[44].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3409 */     this.defaultScopeModel[44].setRotationPoint(-40.0F, -44.25F, 2.0F);
/*      */     
/* 3411 */     this.defaultScopeModel[45].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 8, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3412 */     this.defaultScopeModel[45].setRotationPoint(-38.0F, -44.25F, 2.0F);
/*      */     
/* 3414 */     this.defaultScopeModel[46].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3415 */     this.defaultScopeModel[46].setRotationPoint(-40.0F, -45.75F, 2.0F);
/*      */     
/* 3417 */     this.defaultScopeModel[47].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3418 */     this.defaultScopeModel[47].setRotationPoint(-39.0F, -45.75F, 2.0F);
/*      */     
/* 3420 */     this.defaultScopeModel[48].addShapeBox(40.0F, -11.0F, -6.0F, 1, 5, 8, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3421 */     this.defaultScopeModel[48].setRotationPoint(-41.0F, -44.25F, 2.0F);
/*      */     
/* 3423 */     this.defaultScopeModel[49].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3424 */     this.defaultScopeModel[49].setRotationPoint(-40.0F, -42.75F, 2.5F);
/*      */     
/* 3426 */     this.defaultScopeModel[50].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 3427 */     this.defaultScopeModel[50].setRotationPoint(-38.75F, -42.75F, 2.0F);
/*      */     
/* 3429 */     this.defaultScopeModel[51].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3430 */     this.defaultScopeModel[51].setRotationPoint(-40.0F, -42.75F, 2.0F);
/*      */     
/* 3432 */     this.defaultScopeModel[52].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3433 */     this.defaultScopeModel[52].setRotationPoint(-41.0F, -45.5F, 2.0F);
/*      */     
/* 3435 */     this.defaultScopeModel[53].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3436 */     this.defaultScopeModel[53].setRotationPoint(-40.0F, -45.75F, 8.0F);
/*      */     
/* 3438 */     this.defaultScopeModel[54].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3439 */     this.defaultScopeModel[54].setRotationPoint(-39.0F, -45.75F, 8.0F);
/*      */     
/* 3441 */     this.defaultScopeModel[55].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 3442 */     this.defaultScopeModel[55].setRotationPoint(-41.0F, -45.5F, 8.0F);
/*      */     
/* 3444 */     this.defaultScopeModel[56].addShapeBox(40.0F, -11.0F, -6.0F, 6, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3445 */     this.defaultScopeModel[56].setRotationPoint(-37.0F, -64.0F, 7.0F);
/* 3446 */     this.defaultScopeModel[56].rotateAngleZ = -0.43633232F;
/*      */     
/* 3448 */     this.defaultScopeModel[57].addShapeBox(40.0F, -11.0F, -6.0F, 6, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3449 */     this.defaultScopeModel[57].setRotationPoint(-37.0F, -64.0F, 3.0F);
/* 3450 */     this.defaultScopeModel[57].rotateAngleZ = -0.43633232F;
/*      */     
/* 3452 */     this.defaultScopeModel[58].addShapeBox(40.0F, -11.0F, -6.0F, 6, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3453 */     this.defaultScopeModel[58].setRotationPoint(-37.0F, -64.0F, 5.0F);
/* 3454 */     this.defaultScopeModel[58].rotateAngleZ = -0.43633232F;
/*      */     
/* 3456 */     this.defaultScopeModel[59].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 2, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.75F, -0.5F, 0.25F, -1.75F, -0.5F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F);
/* 3457 */     this.defaultScopeModel[59].setRotationPoint(-36.15F, -65.8F, 7.0F);
/* 3458 */     this.defaultScopeModel[59].rotateAngleZ = -0.43633232F;
/*      */     
/* 3460 */     this.defaultScopeModel[60].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 2, 0.0F, -1.75F, -0.5F, 0.25F, -1.75F, -0.5F, 0.25F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.75F, 0.0F, 0.25F, -1.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3461 */     this.defaultScopeModel[60].setRotationPoint(-36.15F, -65.8F, 3.0F);
/* 3462 */     this.defaultScopeModel[60].rotateAngleZ = -0.43633232F;
/*      */     
/* 3464 */     this.defaultScopeModel[61].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.5F, -4.75F, -0.5F, -0.5F, -4.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -4.75F, 0.0F, -0.5F);
/* 3465 */     this.defaultScopeModel[61].setRotationPoint(-36.15F, -65.8F, 5.0F);
/* 3466 */     this.defaultScopeModel[61].rotateAngleZ = -0.43633232F;
/*      */     
/* 3468 */     this.defaultScopeModel[62].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.5F, -4.75F, -0.5F, -0.5F, -4.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -4.75F, 0.0F, -0.5F);
/* 3469 */     this.defaultScopeModel[62].setRotationPoint(-36.15F, -65.8F, 6.5F);
/* 3470 */     this.defaultScopeModel[62].rotateAngleZ = -0.43633232F;
/*      */     
/* 3472 */     this.defaultScopeModel[63].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, -4.75F, -1.5F, 0.0F, -4.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -4.75F, 0.0F, 0.0F);
/* 3473 */     this.defaultScopeModel[63].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 3474 */     this.defaultScopeModel[63].rotateAngleZ = -0.43633232F;
/*      */     
/* 3476 */     this.defaultScopeModel[64].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F, -4.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, -4.75F, -1.25F, 0.0F);
/* 3477 */     this.defaultScopeModel[64].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 3478 */     this.defaultScopeModel[64].rotateAngleZ = -0.43633232F;
/*      */     
/* 3480 */     this.defaultScopeModel[65].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, 0.0F, -4.75F, -0.75F, 0.0F, -4.75F, -1.0F, -1.0F, 0.25F, -1.0F, -1.0F, 0.25F, -1.0F, 0.0F, -4.75F, -1.0F, 0.0F);
/* 3481 */     this.defaultScopeModel[65].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 3482 */     this.defaultScopeModel[65].rotateAngleZ = -0.43633232F;
/*      */     
/* 3484 */     this.defaultScopeModel[66].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -0.75F, -4.75F, -0.75F, -0.75F, -4.75F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -1.0F, -4.75F, -1.0F, -1.0F);
/* 3485 */     this.defaultScopeModel[66].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 3486 */     this.defaultScopeModel[66].rotateAngleZ = -0.43633232F;
/*      */     
/* 3488 */     this.defaultScopeModel[67].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, -1.0F, -4.75F, -1.25F, -1.0F, -4.75F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.75F, -4.75F, -0.5F, -0.75F);
/* 3489 */     this.defaultScopeModel[67].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 3490 */     this.defaultScopeModel[67].rotateAngleZ = -0.43633232F;
/*      */     
/* 3492 */     this.defaultScopeModel[68].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, -4.75F, -1.25F, -1.0F, 0.25F, -1.25F, -1.0F, 0.25F, -1.25F, 0.0F, -4.75F, -1.25F, 0.0F, -4.75F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, 0.0F, -4.75F, -0.5F, 0.0F);
/* 3493 */     this.defaultScopeModel[68].setRotationPoint(-36.15F, -65.8F, 5.5F);
/* 3494 */     this.defaultScopeModel[68].rotateAngleZ = -0.43633232F;
/*      */     
/* 3496 */     this.defaultScopeModel[69].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 3497 */     this.defaultScopeModel[69].setRotationPoint(-3.0F, -30.5F, 11.5F);
/*      */     
/* 3499 */     this.defaultScopeModel[70].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, 0.0F);
/* 3500 */     this.defaultScopeModel[70].setRotationPoint(-1.0F, -30.5F, 11.5F);
/*      */     
/* 3502 */     this.defaultScopeModel[71].addShapeBox(40.0F, -11.0F, -6.0F, 3, 4, 2, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, -2.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -2.0F);
/* 3503 */     this.defaultScopeModel[71].setRotationPoint(-5.0F, -30.5F, 11.5F);
/*      */     
/* 3505 */     this.defaultScopeModel[72].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F);
/* 3506 */     this.defaultScopeModel[72].setRotationPoint(-3.0F, -31.5F, 11.5F);
/*      */     
/* 3508 */     this.defaultScopeModel[73].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F, -0.5F, 0.25F, 0.0F);
/* 3509 */     this.defaultScopeModel[73].setRotationPoint(-1.0F, -31.5F, 11.5F);
/*      */     
/* 3511 */     this.defaultScopeModel[74].addShapeBox(40.0F, -11.0F, -6.0F, 3, 1, 2, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -2.5F, 0.0F, -2.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, -2.0F);
/* 3512 */     this.defaultScopeModel[74].setRotationPoint(-5.0F, -31.5F, 11.5F);
/*      */     
/* 3514 */     this.defaultScopeModel[75].addShapeBox(40.0F, -11.0F, -6.0F, 7, 4, 1, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 3515 */     this.defaultScopeModel[75].setRotationPoint(-5.0F, -30.5F, 10.5F);
/*      */     
/* 3517 */     this.defaultScopeModel[76].addShapeBox(40.0F, -11.0F, -6.0F, 7, 2, 1, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 3518 */     this.defaultScopeModel[76].setRotationPoint(-5.0F, -32.0F, 10.5F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 3523 */     this.ammoModel[0] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 3524 */     this.ammoModel[1] = new ModelRendererTurbo(this, 641, 89, this.textureX, this.textureY);
/* 3525 */     this.ammoModel[2] = new ModelRendererTurbo(this, 705, 89, this.textureX, this.textureY);
/* 3526 */     this.ammoModel[3] = new ModelRendererTurbo(this, 1025, 89, this.textureX, this.textureY);
/* 3527 */     this.ammoModel[4] = new ModelRendererTurbo(this, 1089, 89, this.textureX, this.textureY);
/* 3528 */     this.ammoModel[5] = new ModelRendererTurbo(this, 1249, 89, this.textureX, this.textureY);
/* 3529 */     this.ammoModel[6] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/* 3530 */     this.ammoModel[7] = new ModelRendererTurbo(this, 873, 89, this.textureX, this.textureY);
/* 3531 */     this.ammoModel[8] = new ModelRendererTurbo(this, 921, 89, this.textureX, this.textureY);
/* 3532 */     this.ammoModel[9] = new ModelRendererTurbo(this, 1329, 89, this.textureX, this.textureY);
/* 3533 */     this.ammoModel[10] = new ModelRendererTurbo(this, 1377, 89, this.textureX, this.textureY);
/* 3534 */     this.ammoModel[11] = new ModelRendererTurbo(this, 2033, 73, this.textureX, this.textureY);
/* 3535 */     this.ammoModel[12] = new ModelRendererTurbo(this, 1777, 81, this.textureX, this.textureY);
/* 3536 */     this.ammoModel[13] = new ModelRendererTurbo(this, 769, 89, this.textureX, this.textureY);
/* 3537 */     this.ammoModel[14] = new ModelRendererTurbo(this, 697, 73, this.textureX, this.textureY);
/* 3538 */     this.ammoModel[15] = new ModelRendererTurbo(this, 689, 9, this.textureX, this.textureY);
/* 3539 */     this.ammoModel[16] = new ModelRendererTurbo(this, 953, 89, this.textureX, this.textureY);
/* 3540 */     this.ammoModel[17] = new ModelRendererTurbo(this, 1409, 89, this.textureX, this.textureY);
/* 3541 */     this.ammoModel[18] = new ModelRendererTurbo(this, 1425, 89, this.textureX, this.textureY);
/* 3542 */     this.ammoModel[19] = new ModelRendererTurbo(this, 729, 73, this.textureX, this.textureY);
/* 3543 */     this.ammoModel[20] = new ModelRendererTurbo(this, 721, 9, this.textureX, this.textureY);
/* 3544 */     this.ammoModel[21] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/* 3545 */     this.ammoModel[22] = new ModelRendererTurbo(this, 1473, 89, this.textureX, this.textureY);
/* 3546 */     this.ammoModel[23] = new ModelRendererTurbo(this, 1489, 89, this.textureX, this.textureY);
/* 3547 */     this.ammoModel[24] = new ModelRendererTurbo(this, 1505, 89, this.textureX, this.textureY);
/* 3548 */     this.ammoModel[25] = new ModelRendererTurbo(this, 753, 73, this.textureX, this.textureY);
/* 3549 */     this.ammoModel[26] = new ModelRendererTurbo(this, 753, 9, this.textureX, this.textureY);
/* 3550 */     this.ammoModel[27] = new ModelRendererTurbo(this, 1553, 57, this.textureX, this.textureY);
/* 3551 */     this.ammoModel[28] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/* 3552 */     this.ammoModel[29] = new ModelRendererTurbo(this, 1945, 65, this.textureX, this.textureY);
/* 3553 */     this.ammoModel[30] = new ModelRendererTurbo(this, 1617, 81, this.textureX, this.textureY);
/* 3554 */     this.ammoModel[31] = new ModelRendererTurbo(this, 945, 65, this.textureX, this.textureY);
/* 3555 */     this.ammoModel[32] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/* 3556 */     this.ammoModel[33] = new ModelRendererTurbo(this, 1729, 57, this.textureX, this.textureY);
/* 3557 */     this.ammoModel[34] = new ModelRendererTurbo(this, 1521, 89, this.textureX, this.textureY);
/* 3558 */     this.ammoModel[35] = new ModelRendererTurbo(this, 1625, 89, this.textureX, this.textureY);
/* 3559 */     this.ammoModel[36] = new ModelRendererTurbo(this, 1641, 89, this.textureX, this.textureY);
/* 3560 */     this.ammoModel[37] = new ModelRendererTurbo(this, 969, 73, this.textureX, this.textureY);
/* 3561 */     this.ammoModel[38] = new ModelRendererTurbo(this, 913, 9, this.textureX, this.textureY);
/* 3562 */     this.ammoModel[39] = new ModelRendererTurbo(this, 1657, 89, this.textureX, this.textureY);
/* 3563 */     this.ammoModel[40] = new ModelRendererTurbo(this, 1673, 89, this.textureX, this.textureY);
/* 3564 */     this.ammoModel[41] = new ModelRendererTurbo(this, 1689, 89, this.textureX, this.textureY);
/* 3565 */     this.ammoModel[42] = new ModelRendererTurbo(this, 1017, 73, this.textureX, this.textureY);
/* 3566 */     this.ammoModel[43] = new ModelRendererTurbo(this, 985, 9, this.textureX, this.textureY);
/* 3567 */     this.ammoModel[44] = new ModelRendererTurbo(this, 1049, 73, this.textureX, this.textureY);
/* 3568 */     this.ammoModel[45] = new ModelRendererTurbo(this, 1705, 89, this.textureX, this.textureY);
/* 3569 */     this.ammoModel[46] = new ModelRendererTurbo(this, 1721, 89, this.textureX, this.textureY);
/* 3570 */     this.ammoModel[47] = new ModelRendererTurbo(this, 1737, 89, this.textureX, this.textureY);
/* 3571 */     this.ammoModel[48] = new ModelRendererTurbo(this, 1657, 73, this.textureX, this.textureY);
/* 3572 */     this.ammoModel[49] = new ModelRendererTurbo(this, 809, 9, this.textureX, this.textureY);
/* 3573 */     this.ammoModel[50] = new ModelRendererTurbo(this, 1577, 57, this.textureX, this.textureY);
/* 3574 */     this.ammoModel[51] = new ModelRendererTurbo(this, 1993, 81, this.textureX, this.textureY);
/* 3575 */     this.ammoModel[52] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/* 3576 */     this.ammoModel[53] = new ModelRendererTurbo(this, 969, 89, this.textureX, this.textureY);
/* 3577 */     this.ammoModel[54] = new ModelRendererTurbo(this, 1985, 65, this.textureX, this.textureY);
/* 3578 */     this.ammoModel[55] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/* 3579 */     this.ammoModel[56] = new ModelRendererTurbo(this, 1865, 57, this.textureX, this.textureY);
/* 3580 */     this.ammoModel[57] = new ModelRendererTurbo(this, 1833, 73, this.textureX, this.textureY);
/* 3581 */     this.ammoModel[58] = new ModelRendererTurbo(this, 1873, 73, this.textureX, this.textureY);
/* 3582 */     this.ammoModel[59] = new ModelRendererTurbo(this, 1849, 73, this.textureX, this.textureY);
/* 3583 */     this.ammoModel[60] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/* 3584 */     this.ammoModel[61] = new ModelRendererTurbo(this, 1905, 73, this.textureX, this.textureY);
/* 3585 */     this.ammoModel[62] = new ModelRendererTurbo(this, 25, 81, this.textureX, this.textureY);
/* 3586 */     this.ammoModel[63] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 3587 */     this.ammoModel[64] = new ModelRendererTurbo(this, 785, 73, this.textureX, this.textureY);
/* 3588 */     this.ammoModel[65] = new ModelRendererTurbo(this, 1753, 89, this.textureX, this.textureY);
/*      */     
/* 3590 */     this.ammoModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 22, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3591 */     this.ammoModel[0].setRotationPoint(-12.0F, 9.5F, 2.0F);
/*      */     
/* 3593 */     this.ammoModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 22, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3594 */     this.ammoModel[1].setRotationPoint(-10.75F, 19.5F, 2.0F);
/*      */     
/* 3596 */     this.ammoModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 22, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3597 */     this.ammoModel[2].setRotationPoint(-8.5F, 29.5F, 2.0F);
/*      */     
/* 3599 */     this.ammoModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 22, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -3.0F, 1.5F, 0.0F, -1.0F, -7.0F, 0.0F, -1.0F, -7.0F, 0.0F, -3.0F, 1.5F, 0.0F);
/* 3600 */     this.ammoModel[3].setRotationPoint(-6.25F, 36.5F, 2.0F);
/*      */     
/* 3602 */     this.ammoModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 21, 10, 8, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3603 */     this.ammoModel[4].setRotationPoint(-12.0F, -0.5F, 2.0F);
/*      */     
/* 3605 */     this.ammoModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 20, 8, 8, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3606 */     this.ammoModel[5].setRotationPoint(-12.5F, -8.5F, 2.0F);
/*      */     
/* 3608 */     this.ammoModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 4, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3609 */     this.ammoModel[6].setRotationPoint(-14.0F, 9.5F, 2.0F);
/*      */     
/* 3611 */     this.ammoModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 4, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3612 */     this.ammoModel[7].setRotationPoint(-12.75F, 19.5F, 2.0F);
/*      */     
/* 3614 */     this.ammoModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 4, 7, 8, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 3615 */     this.ammoModel[8].setRotationPoint(-10.5F, 29.5F, 2.0F);
/*      */     
/* 3617 */     this.ammoModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 3, 10, 8, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3618 */     this.ammoModel[9].setRotationPoint(-14.0F, -0.5F, 2.0F);
/*      */     
/* 3620 */     this.ammoModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 4, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, -3.0F, 1.0F, 0.0F);
/* 3621 */     this.ammoModel[10].setRotationPoint(-8.0F, 36.5F, 2.0F);
/*      */     
/* 3623 */     this.ammoModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3624 */     this.ammoModel[11].setRotationPoint(5.25F, 19.5F, 1.0F);
/*      */     
/* 3626 */     this.ammoModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3627 */     this.ammoModel[12].setRotationPoint(2.75F, 9.5F, 1.0F);
/*      */     
/* 3629 */     this.ammoModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3630 */     this.ammoModel[13].setRotationPoint(1.75F, -0.5F, 1.0F);
/*      */     
/* 3632 */     this.ammoModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3633 */     this.ammoModel[14].setRotationPoint(7.75F, 29.5F, 1.0F);
/*      */     
/* 3635 */     this.ammoModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.15F, 0.0F);
/* 3636 */     this.ammoModel[15].setRotationPoint(10.25F, 36.5F, 1.0F);
/*      */     
/* 3638 */     this.ammoModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3639 */     this.ammoModel[16].setRotationPoint(-2.0F, 19.5F, 1.0F);
/*      */     
/* 3641 */     this.ammoModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3642 */     this.ammoModel[17].setRotationPoint(-4.5F, 9.5F, 1.0F);
/*      */     
/* 3644 */     this.ammoModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3645 */     this.ammoModel[18].setRotationPoint(-5.5F, -0.5F, 1.0F);
/*      */     
/* 3647 */     this.ammoModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3648 */     this.ammoModel[19].setRotationPoint(0.5F, 29.5F, 1.0F);
/*      */     
/* 3650 */     this.ammoModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, 0.35F, 0.0F);
/* 3651 */     this.ammoModel[20].setRotationPoint(5.0F, 39.0F, 1.0F);
/*      */     
/* 3653 */     this.ammoModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3654 */     this.ammoModel[21].setRotationPoint(3.0F, 36.5F, 1.0F);
/*      */     
/* 3656 */     this.ammoModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3657 */     this.ammoModel[22].setRotationPoint(-7.75F, 19.5F, 1.0F);
/*      */     
/* 3659 */     this.ammoModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3660 */     this.ammoModel[23].setRotationPoint(-10.25F, 9.5F, 1.0F);
/*      */     
/* 3662 */     this.ammoModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3663 */     this.ammoModel[24].setRotationPoint(-11.25F, -0.5F, 1.0F);
/*      */     
/* 3665 */     this.ammoModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 5, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3666 */     this.ammoModel[25].setRotationPoint(-5.25F, 29.5F, 1.0F);
/*      */     
/* 3668 */     this.ammoModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.75F, 1.0F, 0.0F);
/* 3669 */     this.ammoModel[26].setRotationPoint(-0.25F, 41.0F, 1.0F);
/*      */     
/* 3671 */     this.ammoModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 5, 4, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3672 */     this.ammoModel[27].setRotationPoint(-2.75F, 36.5F, 1.0F);
/*      */     
/* 3674 */     this.ammoModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3675 */     this.ammoModel[28].setRotationPoint(-10.0F, 19.5F, 1.0F);
/*      */     
/* 3677 */     this.ammoModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3678 */     this.ammoModel[29].setRotationPoint(-12.5F, 9.5F, 1.0F);
/*      */     
/* 3680 */     this.ammoModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3681 */     this.ammoModel[30].setRotationPoint(-13.5F, -0.5F, 1.0F);
/*      */     
/* 3683 */     this.ammoModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 2, 7, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3684 */     this.ammoModel[31].setRotationPoint(-7.5F, 29.5F, 1.0F);
/*      */     
/* 3686 */     this.ammoModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 3687 */     this.ammoModel[32].setRotationPoint(-2.5F, 43.0F, 1.0F);
/*      */     
/* 3689 */     this.ammoModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 2, 6, 1, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 3690 */     this.ammoModel[33].setRotationPoint(-5.0F, 36.5F, 1.0F);
/*      */     
/* 3692 */     this.ammoModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3693 */     this.ammoModel[34].setRotationPoint(5.25F, 19.5F, 10.0F);
/*      */     
/* 3695 */     this.ammoModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3696 */     this.ammoModel[35].setRotationPoint(2.75F, 9.5F, 10.0F);
/*      */     
/* 3698 */     this.ammoModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 3699 */     this.ammoModel[36].setRotationPoint(1.75F, -0.5F, 10.0F);
/*      */     
/* 3701 */     this.ammoModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3702 */     this.ammoModel[37].setRotationPoint(7.75F, 29.5F, 10.0F);
/*      */     
/* 3704 */     this.ammoModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 4, 2, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.15F, 0.0F);
/* 3705 */     this.ammoModel[38].setRotationPoint(10.25F, 36.5F, 10.0F);
/*      */     
/* 3707 */     this.ammoModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3708 */     this.ammoModel[39].setRotationPoint(-2.0F, 19.5F, 10.0F);
/*      */     
/* 3710 */     this.ammoModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3711 */     this.ammoModel[40].setRotationPoint(-4.5F, 9.5F, 10.0F);
/*      */     
/* 3713 */     this.ammoModel[41].addShapeBox(40.0F, -11.0F, -6.0F, 6, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3714 */     this.ammoModel[41].setRotationPoint(-5.5F, -0.5F, 10.0F);
/*      */     
/* 3716 */     this.ammoModel[42].addShapeBox(40.0F, -11.0F, -6.0F, 6, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3717 */     this.ammoModel[42].setRotationPoint(0.5F, 29.5F, 10.0F);
/*      */     
/* 3719 */     this.ammoModel[43].addShapeBox(40.0F, -11.0F, -6.0F, 3, 2, 1, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 0.5F, 0.35F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, -1.55F, 0.0F, 0.5F, 0.35F, 0.0F);
/* 3720 */     this.ammoModel[43].setRotationPoint(5.0F, 39.0F, 10.0F);
/*      */     
/* 3722 */     this.ammoModel[44].addShapeBox(40.0F, -11.0F, -6.0F, 6, 2, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3723 */     this.ammoModel[44].setRotationPoint(3.0F, 36.5F, 10.0F);
/*      */     
/* 3725 */     this.ammoModel[45].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3726 */     this.ammoModel[45].setRotationPoint(-7.75F, 19.5F, 10.0F);
/*      */     
/* 3728 */     this.ammoModel[46].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 3729 */     this.ammoModel[46].setRotationPoint(-10.25F, 9.5F, 10.0F);
/*      */     
/* 3731 */     this.ammoModel[47].addShapeBox(40.0F, -11.0F, -6.0F, 5, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3732 */     this.ammoModel[47].setRotationPoint(-11.25F, -0.5F, 10.0F);
/*      */     
/* 3734 */     this.ammoModel[48].addShapeBox(40.0F, -11.0F, -6.0F, 5, 7, 1, 0.0F, 0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3735 */     this.ammoModel[48].setRotationPoint(-5.25F, 29.5F, 10.0F);
/*      */     
/* 3737 */     this.ammoModel[49].addShapeBox(40.0F, -11.0F, -6.0F, 2, 2, 1, 0.0F, 2.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 0.75F, 1.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F, -0.75F, 0.0F, 0.75F, 1.0F, 0.0F);
/* 3738 */     this.ammoModel[49].setRotationPoint(-0.25F, 41.0F, 10.0F);
/*      */     
/* 3740 */     this.ammoModel[50].addShapeBox(40.0F, -11.0F, -6.0F, 5, 4, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F);
/* 3741 */     this.ammoModel[50].setRotationPoint(-2.75F, 36.5F, 10.0F);
/*      */     
/* 3743 */     this.ammoModel[51].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 3744 */     this.ammoModel[51].setRotationPoint(-10.0F, 19.5F, 10.0F);
/*      */     
/* 3746 */     this.ammoModel[52].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3747 */     this.ammoModel[52].setRotationPoint(-12.5F, 9.5F, 10.0F);
/*      */     
/* 3749 */     this.ammoModel[53].addShapeBox(40.0F, -11.0F, -6.0F, 2, 10, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 3750 */     this.ammoModel[53].setRotationPoint(-13.5F, -0.5F, 10.0F);
/*      */     
/* 3752 */     this.ammoModel[54].addShapeBox(40.0F, -11.0F, -6.0F, 2, 7, 1, 0.0F, 1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 3753 */     this.ammoModel[54].setRotationPoint(-7.5F, 29.5F, 10.0F);
/*      */     
/* 3755 */     this.ammoModel[55].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 1, 0.0F, 1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 3756 */     this.ammoModel[55].setRotationPoint(-2.5F, 43.0F, 10.0F);
/*      */     
/* 3758 */     this.ammoModel[56].addShapeBox(40.0F, -11.0F, -6.0F, 2, 6, 1, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 3759 */     this.ammoModel[56].setRotationPoint(-5.0F, 36.5F, 10.0F);
/*      */     
/* 3761 */     this.ammoModel[57].addShapeBox(40.0F, -11.0F, -6.0F, 6, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3762 */     this.ammoModel[57].setRotationPoint(1.75F, -8.5F, 10.0F);
/*      */     
/* 3764 */     this.ammoModel[58].addShapeBox(40.0F, -11.0F, -6.0F, 5, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3765 */     this.ammoModel[58].setRotationPoint(-4.5F, -8.5F, 10.0F);
/*      */     
/* 3767 */     this.ammoModel[59].addShapeBox(40.0F, -11.0F, -6.0F, 4, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3768 */     this.ammoModel[59].setRotationPoint(-10.25F, -8.5F, 10.0F);
/*      */     
/* 3770 */     this.ammoModel[60].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3771 */     this.ammoModel[60].setRotationPoint(-12.5F, -8.5F, 10.0F);
/*      */     
/* 3773 */     this.ammoModel[61].addShapeBox(40.0F, -11.0F, -6.0F, 6, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3774 */     this.ammoModel[61].setRotationPoint(1.75F, -8.5F, 1.0F);
/*      */     
/* 3776 */     this.ammoModel[62].addShapeBox(40.0F, -11.0F, -6.0F, 5, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3777 */     this.ammoModel[62].setRotationPoint(-4.5F, -8.5F, 1.0F);
/*      */     
/* 3779 */     this.ammoModel[63].addShapeBox(40.0F, -11.0F, -6.0F, 4, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3780 */     this.ammoModel[63].setRotationPoint(-10.25F, -8.5F, 1.0F);
/*      */     
/* 3782 */     this.ammoModel[64].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 3783 */     this.ammoModel[64].setRotationPoint(-12.5F, -8.5F, 1.0F);
/*      */     
/* 3785 */     this.ammoModel[65].addShapeBox(40.0F, -11.0F, -6.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3786 */     this.ammoModel[65].setRotationPoint(-14.75F, -8.5F, 2.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 3791 */     this.slideModel[0] = new ModelRendererTurbo(this, 1689, 153, this.textureX, this.textureY);
/* 3792 */     this.slideModel[1] = new ModelRendererTurbo(this, 1977, 137, this.textureX, this.textureY);
/* 3793 */     this.slideModel[2] = new ModelRendererTurbo(this, 1537, 145, this.textureX, this.textureY);
/* 3794 */     this.slideModel[3] = new ModelRendererTurbo(this, 1465, 121, this.textureX, this.textureY);
/* 3795 */     this.slideModel[4] = new ModelRendererTurbo(this, 2033, 121, this.textureX, this.textureY);
/* 3796 */     this.slideModel[5] = new ModelRendererTurbo(this, 1161, 137, this.textureX, this.textureY);
/* 3797 */     this.slideModel[6] = new ModelRendererTurbo(this, 1265, 81, this.textureX, this.textureY);
/* 3798 */     this.slideModel[7] = new ModelRendererTurbo(this, 1489, 81, this.textureX, this.textureY);
/* 3799 */     this.slideModel[8] = new ModelRendererTurbo(this, 1841, 121, this.textureX, this.textureY);
/* 3800 */     this.slideModel[9] = new ModelRendererTurbo(this, 1993, 121, this.textureX, this.textureY);
/* 3801 */     this.slideModel[10] = new ModelRendererTurbo(this, 201, 129, this.textureX, this.textureY);
/* 3802 */     this.slideModel[11] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/* 3803 */     this.slideModel[12] = new ModelRendererTurbo(this, 281, 129, this.textureX, this.textureY);
/* 3804 */     this.slideModel[13] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/* 3805 */     this.slideModel[14] = new ModelRendererTurbo(this, 529, 129, this.textureX, this.textureY);
/* 3806 */     this.slideModel[15] = new ModelRendererTurbo(this, 1745, 129, this.textureX, this.textureY);
/* 3807 */     this.slideModel[16] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
/* 3808 */     this.slideModel[17] = new ModelRendererTurbo(this, 41, 137, this.textureX, this.textureY);
/* 3809 */     this.slideModel[18] = new ModelRendererTurbo(this, 889, 137, this.textureX, this.textureY);
/* 3810 */     this.slideModel[19] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/* 3811 */     this.slideModel[20] = new ModelRendererTurbo(this, 753, 137, this.textureX, this.textureY);
/* 3812 */     this.slideModel[21] = new ModelRendererTurbo(this, 929, 137, this.textureX, this.textureY);
/* 3813 */     this.slideModel[22] = new ModelRendererTurbo(this, 1049, 137, this.textureX, this.textureY);
/* 3814 */     this.slideModel[23] = new ModelRendererTurbo(this, 1081, 137, this.textureX, this.textureY);
/* 3815 */     this.slideModel[24] = new ModelRendererTurbo(this, 1201, 137, this.textureX, this.textureY);
/* 3816 */     this.slideModel[25] = new ModelRendererTurbo(this, 1833, 57, this.textureX, this.textureY);
/* 3817 */     this.slideModel[26] = new ModelRendererTurbo(this, 1897, 57, this.textureX, this.textureY);
/* 3818 */     this.slideModel[27] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/* 3819 */     this.slideModel[28] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/* 3820 */     this.slideModel[29] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 3821 */     this.slideModel[30] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/* 3822 */     this.slideModel[31] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/* 3823 */     this.slideModel[32] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/* 3824 */     this.slideModel[33] = new ModelRendererTurbo(this, 673, 73, this.textureX, this.textureY);
/* 3825 */     this.slideModel[34] = new ModelRendererTurbo(this, 897, 73, this.textureX, this.textureY);
/* 3826 */     this.slideModel[35] = new ModelRendererTurbo(this, 1353, 73, this.textureX, this.textureY);
/* 3827 */     this.slideModel[36] = new ModelRendererTurbo(this, 1401, 73, this.textureX, this.textureY);
/* 3828 */     this.slideModel[37] = new ModelRendererTurbo(this, 1241, 137, this.textureX, this.textureY);
/* 3829 */     this.slideModel[38] = new ModelRendererTurbo(this, 1601, 137, this.textureX, this.textureY);
/* 3830 */     this.slideModel[39] = new ModelRendererTurbo(this, 1641, 137, this.textureX, this.textureY);
/* 3831 */     this.slideModel[40] = new ModelRendererTurbo(this, 1937, 137, this.textureX, this.textureY);
/*      */     
/* 3833 */     this.slideModel[0].addShapeBox(40.0F, -11.0F, -6.0F, 26, 8, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3834 */     this.slideModel[0].setRotationPoint(-18.5F, -27.0F, 0.75F);
/*      */     
/* 3836 */     this.slideModel[1].addShapeBox(40.0F, -11.0F, -6.0F, 10, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3837 */     this.slideModel[1].setRotationPoint(-11.0F, -26.75F, 0.5F);
/*      */     
/* 3839 */     this.slideModel[2].addShapeBox(40.0F, -11.0F, -6.0F, 10, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3840 */     this.slideModel[2].setRotationPoint(-11.0F, -22.75F, 0.5F);
/*      */     
/* 3842 */     this.slideModel[3].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3843 */     this.slideModel[3].setRotationPoint(-11.0F, -25.75F, 0.5F);
/*      */     
/* 3845 */     this.slideModel[4].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3846 */     this.slideModel[4].setRotationPoint(-2.0F, -25.75F, 0.5F);
/*      */     
/* 3848 */     this.slideModel[5].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 6, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3849 */     this.slideModel[5].setRotationPoint(-10.0F, -25.75F, 0.5F);
/*      */     
/* 3851 */     this.slideModel[6].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 3852 */     this.slideModel[6].setRotationPoint(-10.0F, -25.75F, 0.5F);
/*      */     
/* 3854 */     this.slideModel[7].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 3855 */     this.slideModel[7].setRotationPoint(-3.0F, -25.75F, 0.5F);
/*      */     
/* 3857 */     this.slideModel[8].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3858 */     this.slideModel[8].setRotationPoint(-10.0F, -23.75F, 0.5F);
/*      */     
/* 3860 */     this.slideModel[9].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3861 */     this.slideModel[9].setRotationPoint(-3.0F, -23.75F, 0.5F);
/*      */     
/* 3863 */     this.slideModel[10].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3864 */     this.slideModel[10].setRotationPoint(-8.0F, -25.25F, 0.5F);
/*      */     
/* 3866 */     this.slideModel[11].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3867 */     this.slideModel[11].setRotationPoint(-7.0F, -25.25F, 0.5F);
/*      */     
/* 3869 */     this.slideModel[12].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 3870 */     this.slideModel[12].setRotationPoint(-7.5F, -25.25F, 0.5F);
/*      */     
/* 3872 */     this.slideModel[13].addShapeBox(40.0F, -11.0F, -6.0F, 1, 2, 6, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 3873 */     this.slideModel[13].setRotationPoint(-6.0F, -25.25F, 0.5F);
/*      */     
/* 3875 */     this.slideModel[14].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 3876 */     this.slideModel[14].setRotationPoint(-5.5F, -24.25F, 0.5F);
/*      */     
/* 3878 */     this.slideModel[15].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, -0.75F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 3879 */     this.slideModel[15].setRotationPoint(-5.5F, -25.25F, 0.5F);
/*      */     
/* 3881 */     this.slideModel[16].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3882 */     this.slideModel[16].setRotationPoint(-19.0F, -27.0F, 0.25F);
/*      */     
/* 3884 */     this.slideModel[17].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3885 */     this.slideModel[17].setRotationPoint(-19.0F, -22.5F, 0.25F);
/*      */     
/* 3887 */     this.slideModel[18].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 3888 */     this.slideModel[18].setRotationPoint(-19.0F, -26.0F, 0.25F);
/*      */     
/* 3890 */     this.slideModel[19].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3891 */     this.slideModel[19].setRotationPoint(6.5F, -27.0F, 0.25F);
/*      */     
/* 3893 */     this.slideModel[20].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3894 */     this.slideModel[20].setRotationPoint(6.5F, -22.5F, 0.25F);
/*      */     
/* 3896 */     this.slideModel[21].addShapeBox(40.0F, -11.0F, -6.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 3897 */     this.slideModel[21].setRotationPoint(6.5F, -26.0F, 0.25F);
/*      */     
/* 3899 */     this.slideModel[22].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 3900 */     this.slideModel[22].setRotationPoint(-18.5F, -24.25F, 1.0F);
/*      */     
/* 3902 */     this.slideModel[23].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F);
/* 3903 */     this.slideModel[23].setRotationPoint(-18.5F, -23.25F, 1.0F);
/*      */     
/* 3905 */     this.slideModel[24].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 3906 */     this.slideModel[24].setRotationPoint(-18.5F, -23.75F, 1.0F);
/*      */     
/* 3908 */     this.slideModel[25].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3909 */     this.slideModel[25].setRotationPoint(-18.0F, -23.85F, 1.25F);
/*      */     
/* 3911 */     this.slideModel[26].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3912 */     this.slideModel[26].setRotationPoint(-18.0F, -22.85F, 1.25F);
/*      */     
/* 3914 */     this.slideModel[27].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3915 */     this.slideModel[27].setRotationPoint(-18.0F, -24.6F, 1.25F);
/*      */     
/* 3917 */     this.slideModel[28].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3918 */     this.slideModel[28].setRotationPoint(-16.0F, -23.85F, 1.25F);
/*      */     
/* 3920 */     this.slideModel[29].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3921 */     this.slideModel[29].setRotationPoint(-16.0F, -22.85F, 1.25F);
/*      */     
/* 3923 */     this.slideModel[30].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3924 */     this.slideModel[30].setRotationPoint(-16.0F, -24.6F, 1.25F);
/*      */     
/* 3926 */     this.slideModel[31].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3927 */     this.slideModel[31].setRotationPoint(-14.0F, -23.85F, 1.25F);
/*      */     
/* 3929 */     this.slideModel[32].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3930 */     this.slideModel[32].setRotationPoint(-14.0F, -22.85F, 1.25F);
/*      */     
/* 3932 */     this.slideModel[33].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3933 */     this.slideModel[33].setRotationPoint(-14.0F, -24.6F, 1.25F);
/*      */     
/* 3935 */     this.slideModel[34].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3936 */     this.slideModel[34].setRotationPoint(-12.0F, -23.85F, 1.25F);
/*      */     
/* 3938 */     this.slideModel[35].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F);
/* 3939 */     this.slideModel[35].setRotationPoint(-12.0F, -22.85F, 1.25F);
/*      */     
/* 3941 */     this.slideModel[36].addShapeBox(40.0F, -11.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 3942 */     this.slideModel[36].setRotationPoint(-12.0F, -24.6F, 1.25F);
/*      */     
/* 3944 */     this.slideModel[37].addShapeBox(40.0F, -11.0F, -6.0F, 8, 3, 6, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3945 */     this.slideModel[37].setRotationPoint(-1.0F, -25.75F, 0.75F);
/*      */     
/* 3947 */     this.slideModel[38].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3948 */     this.slideModel[38].setRotationPoint(-1.0F, -22.75F, 0.75F);
/*      */     
/* 3950 */     this.slideModel[39].addShapeBox(40.0F, -11.0F, -6.0F, 8, 2, 6, 0.0F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, -0.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3951 */     this.slideModel[39].setRotationPoint(-1.0F, -27.0F, 0.75F);
/*      */     
/* 3953 */     this.slideModel[40].addShapeBox(40.0F, -11.0F, -6.0F, 8, 1, 6, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 3954 */     this.slideModel[40].setRotationPoint(-1.0F, -26.75F, 0.75F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelhk416.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */