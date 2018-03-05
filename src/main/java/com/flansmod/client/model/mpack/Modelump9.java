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
/*      */ public class Modelump9
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 2048;
/*   17 */   int textureY = 2048;
/*      */   
/*      */   public Modelump9()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ƫ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[33];
/*   23 */     this.ammoModel = new ModelRendererTurbo[7];
/*   24 */     this.slideModel = new ModelRendererTurbo[1];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initdefaultScopeModel_1();
/*   28 */     initammoModel_1();
/*   29 */     initslideModel_1();
/*      */     
/*   31 */     this.scopeAttachPoint = new Vector3f(1.375F, 7.8125F, 0.0F);
/*      */     
/*   33 */     this.gripAttachPoint = new Vector3f(10.9375F, 4.375F, 0.0F);
/*      */     
/*   35 */     translateAll(0.0F, -34.0F, 0.0F);
/*   36 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.08F, 0.0F);
/*      */     
/*   38 */     this.gunSlideDistance = 0.75F;
/*   39 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   42 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   47 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[1] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[2] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[3] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[4] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[5] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[6] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[7] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[8] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[9] = new ModelRendererTurbo(this, 689, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[10] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[11] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[12] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[13] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[14] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[15] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[16] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[17] = new ModelRendererTurbo(this, 1001, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[18] = new ModelRendererTurbo(this, 1057, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[19] = new ModelRendererTurbo(this, 1113, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[20] = new ModelRendererTurbo(this, 1169, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[21] = new ModelRendererTurbo(this, 1225, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[22] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[23] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[24] = new ModelRendererTurbo(this, 1385, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[25] = new ModelRendererTurbo(this, 1457, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[26] = new ModelRendererTurbo(this, 1529, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[27] = new ModelRendererTurbo(this, 1601, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[28] = new ModelRendererTurbo(this, 1665, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[29] = new ModelRendererTurbo(this, 1729, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[30] = new ModelRendererTurbo(this, 1793, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[31] = new ModelRendererTurbo(this, 1849, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[32] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*   80 */     this.gunModel[33] = new ModelRendererTurbo(this, 321, 33, this.textureX, this.textureY);
/*   81 */     this.gunModel[34] = new ModelRendererTurbo(this, 1913, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[35] = new ModelRendererTurbo(this, 1977, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[36] = new ModelRendererTurbo(this, 529, 33, this.textureX, this.textureY);
/*   84 */     this.gunModel[37] = new ModelRendererTurbo(this, 585, 33, this.textureX, this.textureY);
/*   85 */     this.gunModel[38] = new ModelRendererTurbo(this, 641, 33, this.textureX, this.textureY);
/*   86 */     this.gunModel[39] = new ModelRendererTurbo(this, 697, 33, this.textureX, this.textureY);
/*   87 */     this.gunModel[40] = new ModelRendererTurbo(this, 753, 33, this.textureX, this.textureY);
/*   88 */     this.gunModel[41] = new ModelRendererTurbo(this, 809, 33, this.textureX, this.textureY);
/*   89 */     this.gunModel[42] = new ModelRendererTurbo(this, 865, 33, this.textureX, this.textureY);
/*   90 */     this.gunModel[43] = new ModelRendererTurbo(this, 929, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[44] = new ModelRendererTurbo(this, 1313, 1, this.textureX, this.textureY);
/*   92 */     this.gunModel[45] = new ModelRendererTurbo(this, 953, 33, this.textureX, this.textureY);
/*   93 */     this.gunModel[46] = new ModelRendererTurbo(this, 1353, 33, this.textureX, this.textureY);
/*   94 */     this.gunModel[47] = new ModelRendererTurbo(this, 993, 33, this.textureX, this.textureY);
/*   95 */     this.gunModel[48] = new ModelRendererTurbo(this, 1689, 33, this.textureX, this.textureY);
/*   96 */     this.gunModel[49] = new ModelRendererTurbo(this, 2033, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[50] = new ModelRendererTurbo(this, 1729, 33, this.textureX, this.textureY);
/*   98 */     this.gunModel[51] = new ModelRendererTurbo(this, 1745, 33, this.textureX, this.textureY);
/*   99 */     this.gunModel[52] = new ModelRendererTurbo(this, 1785, 33, this.textureX, this.textureY);
/*  100 */     this.gunModel[53] = new ModelRendererTurbo(this, 1801, 33, this.textureX, this.textureY);
/*  101 */     this.gunModel[54] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*  102 */     this.gunModel[55] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
/*  103 */     this.gunModel[56] = new ModelRendererTurbo(this, 1817, 33, this.textureX, this.textureY);
/*  104 */     this.gunModel[57] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*  105 */     this.gunModel[58] = new ModelRendererTurbo(this, 1761, 1, this.textureX, this.textureY);
/*  106 */     this.gunModel[59] = new ModelRendererTurbo(this, 1017, 57, this.textureX, this.textureY);
/*  107 */     this.gunModel[60] = new ModelRendererTurbo(this, 577, 73, this.textureX, this.textureY);
/*  108 */     this.gunModel[61] = new ModelRendererTurbo(this, 1001, 73, this.textureX, this.textureY);
/*  109 */     this.gunModel[62] = new ModelRendererTurbo(this, 1209, 73, this.textureX, this.textureY);
/*  110 */     this.gunModel[63] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[64] = new ModelRendererTurbo(this, 1393, 73, this.textureX, this.textureY);
/*  112 */     this.gunModel[65] = new ModelRendererTurbo(this, 1929, 49, this.textureX, this.textureY);
/*  113 */     this.gunModel[66] = new ModelRendererTurbo(this, 593, 1, this.textureX, this.textureY);
/*  114 */     this.gunModel[67] = new ModelRendererTurbo(this, 657, 1, this.textureX, this.textureY);
/*  115 */     this.gunModel[68] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/*  116 */     this.gunModel[69] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  117 */     this.gunModel[70] = new ModelRendererTurbo(this, 1721, 73, this.textureX, this.textureY);
/*  118 */     this.gunModel[71] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*  119 */     this.gunModel[72] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/*  120 */     this.gunModel[73] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/*  121 */     this.gunModel[74] = new ModelRendererTurbo(this, 489, 97, this.textureX, this.textureY);
/*  122 */     this.gunModel[75] = new ModelRendererTurbo(this, 1777, 73, this.textureX, this.textureY);
/*  123 */     this.gunModel[76] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*  124 */     this.gunModel[77] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  125 */     this.gunModel[78] = new ModelRendererTurbo(this, 1985, 49, this.textureX, this.textureY);
/*  126 */     this.gunModel[79] = new ModelRendererTurbo(this, 857, 81, this.textureX, this.textureY);
/*  127 */     this.gunModel[80] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[81] = new ModelRendererTurbo(this, 1993, 73, this.textureX, this.textureY);
/*  129 */     this.gunModel[82] = new ModelRendererTurbo(this, 1433, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[83] = new ModelRendererTurbo(this, 897, 89, this.textureX, this.textureY);
/*  131 */     this.gunModel[84] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  132 */     this.gunModel[85] = new ModelRendererTurbo(this, 1033, 1, this.textureX, this.textureY);
/*  133 */     this.gunModel[86] = new ModelRendererTurbo(this, 1089, 1, this.textureX, this.textureY);
/*  134 */     this.gunModel[87] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/*  135 */     this.gunModel[88] = new ModelRendererTurbo(this, 1145, 1, this.textureX, this.textureY);
/*  136 */     this.gunModel[89] = new ModelRendererTurbo(this, 1577, 1, this.textureX, this.textureY);
/*  137 */     this.gunModel[90] = new ModelRendererTurbo(this, 1585, 89, this.textureX, this.textureY);
/*  138 */     this.gunModel[91] = new ModelRendererTurbo(this, 1905, 89, this.textureX, this.textureY);
/*  139 */     this.gunModel[92] = new ModelRendererTurbo(this, 1641, 1, this.textureX, this.textureY);
/*  140 */     this.gunModel[93] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/*  141 */     this.gunModel[94] = new ModelRendererTurbo(this, 1257, 1, this.textureX, this.textureY);
/*  142 */     this.gunModel[95] = new ModelRendererTurbo(this, 1705, 1, this.textureX, this.textureY);
/*  143 */     this.gunModel[96] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  144 */     this.gunModel[97] = new ModelRendererTurbo(this, 721, 97, this.textureX, this.textureY);
/*  145 */     this.gunModel[98] = new ModelRendererTurbo(this, 1833, 97, this.textureX, this.textureY);
/*  146 */     this.gunModel[99] = new ModelRendererTurbo(this, 1937, 97, this.textureX, this.textureY);
/*  147 */     this.gunModel[100] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*  148 */     this.gunModel[101] = new ModelRendererTurbo(this, 153, 105, this.textureX, this.textureY);
/*  149 */     this.gunModel[102] = new ModelRendererTurbo(this, 249, 105, this.textureX, this.textureY);
/*  150 */     this.gunModel[103] = new ModelRendererTurbo(this, 1641, 97, this.textureX, this.textureY);
/*  151 */     this.gunModel[104] = new ModelRendererTurbo(this, 809, 97, this.textureX, this.textureY);
/*  152 */     this.gunModel[105] = new ModelRendererTurbo(this, 337, 105, this.textureX, this.textureY);
/*  153 */     this.gunModel[106] = new ModelRendererTurbo(this, 857, 105, this.textureX, this.textureY);
/*  154 */     this.gunModel[107] = new ModelRendererTurbo(this, 1825, 1, this.textureX, this.textureY);
/*  155 */     this.gunModel[108] = new ModelRendererTurbo(this, 1889, 1, this.textureX, this.textureY);
/*  156 */     this.gunModel[109] = new ModelRendererTurbo(this, 1953, 1, this.textureX, this.textureY);
/*  157 */     this.gunModel[110] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  158 */     this.gunModel[111] = new ModelRendererTurbo(this, 953, 105, this.textureX, this.textureY);
/*  159 */     this.gunModel[112] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/*  160 */     this.gunModel[113] = new ModelRendererTurbo(this, 1057, 105, this.textureX, this.textureY);
/*  161 */     this.gunModel[114] = new ModelRendererTurbo(this, 1113, 105, this.textureX, this.textureY);
/*  162 */     this.gunModel[115] = new ModelRendererTurbo(this, 1169, 105, this.textureX, this.textureY);
/*  163 */     this.gunModel[116] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*  164 */     this.gunModel[117] = new ModelRendererTurbo(this, 1225, 105, this.textureX, this.textureY);
/*  165 */     this.gunModel[118] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  166 */     this.gunModel[119] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  167 */     this.gunModel[120] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  168 */     this.gunModel[121] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/*  169 */     this.gunModel[122] = new ModelRendererTurbo(this, 593, 9, this.textureX, this.textureY);
/*  170 */     this.gunModel[123] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/*  171 */     this.gunModel[124] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  172 */     this.gunModel[125] = new ModelRendererTurbo(this, 1721, 1, this.textureX, this.textureY);
/*  173 */     this.gunModel[126] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
/*  174 */     this.gunModel[127] = new ModelRendererTurbo(this, 1417, 105, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 25, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 561, 33, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 385, 105, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 617, 33, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 673, 33, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 1489, 105, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 113, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 793, 25, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 841, 33, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 905, 33, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 1185, 73, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 1537, 113, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 689, 97, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 1585, 113, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 105, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 881, 121, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 129, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 1025, 105, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 1057, 129, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 1361, 73, this.textureX, this.textureY);
/*  207 */     this.gunModel[' '] = new ModelRendererTurbo(this, 257, 129, this.textureX, this.textureY);
/*  208 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*  209 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
/*  210 */     this.gunModel['£'] = new ModelRendererTurbo(this, 1305, 57, this.textureX, this.textureY);
/*  211 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 913, 1, this.textureX, this.textureY);
/*  212 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*  213 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  214 */     this.gunModel['§'] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
/*  215 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 1753, 73, this.textureX, this.textureY);
/*  216 */     this.gunModel['©'] = new ModelRendererTurbo(this, 1033, 1, this.textureX, this.textureY);
/*  217 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 1065, 1, this.textureX, this.textureY);
/*  218 */     this.gunModel['«'] = new ModelRendererTurbo(this, 1089, 1, this.textureX, this.textureY);
/*  219 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 1121, 1, this.textureX, this.textureY);
/*  220 */     this.gunModel['­'] = new ModelRendererTurbo(this, 233, 129, this.textureX, this.textureY);
/*  221 */     this.gunModel['®'] = new ModelRendererTurbo(this, 1145, 1, this.textureX, this.textureY);
/*  222 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 1177, 1, this.textureX, this.textureY);
/*  223 */     this.gunModel['°'] = new ModelRendererTurbo(this, 489, 129, this.textureX, this.textureY);
/*  224 */     this.gunModel['±'] = new ModelRendererTurbo(this, 1265, 129, this.textureX, this.textureY);
/*  225 */     this.gunModel['²'] = new ModelRendererTurbo(this, 1449, 145, this.textureX, this.textureY);
/*  226 */     this.gunModel['³'] = new ModelRendererTurbo(this, 1201, 17, this.textureX, this.textureY);
/*  227 */     this.gunModel['´'] = new ModelRendererTurbo(this, 1257, 17, this.textureX, this.textureY);
/*  228 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 1705, 17, this.textureX, this.textureY);
/*  229 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 785, 49, this.textureX, this.textureY);
/*  230 */     this.gunModel['·'] = new ModelRendererTurbo(this, 1641, 153, this.textureX, this.textureY);
/*  231 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 521, 161, this.textureX, this.textureY);
/*  232 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 929, 161, this.textureX, this.textureY);
/*  233 */     this.gunModel['º'] = new ModelRendererTurbo(this, 1129, 161, this.textureX, this.textureY);
/*  234 */     this.gunModel['»'] = new ModelRendererTurbo(this, 1833, 161, this.textureX, this.textureY);
/*  235 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 1, 169, this.textureX, this.textureY);
/*  236 */     this.gunModel['½'] = new ModelRendererTurbo(this, 193, 169, this.textureX, this.textureY);
/*  237 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 1201, 1, this.textureX, this.textureY);
/*  238 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 1225, 1, this.textureX, this.textureY);
/*  239 */     this.gunModel['À'] = new ModelRendererTurbo(this, 1321, 169, this.textureX, this.textureY);
/*  240 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 1257, 1, this.textureX, this.textureY);
/*  241 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 1281, 1, this.textureX, this.textureY);
/*  242 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 545, 129, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 809, 65, this.textureX, this.textureY);
/*  244 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*  245 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 1321, 1, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 289, 81, this.textureX, this.textureY);
/*  247 */     this.gunModel['È'] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/*  248 */     this.gunModel['É'] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  249 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 1385, 1, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 1433, 1, this.textureX, this.textureY);
/*  252 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  253 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 289, 129, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 785, 97, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 721, 129, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/*  257 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 601, 129, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 785, 129, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 2009, 97, this.textureX, this.textureY);
/*  260 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 953, 129, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 953, 89, this.textureX, this.textureY);
/*  262 */     this.gunModel['×'] = new ModelRendererTurbo(this, 1345, 1, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 1665, 1, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 1793, 1, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 753, 9, this.textureX, this.textureY);
/*  266 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 697, 169, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 241, 177, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 1465, 1, this.textureX, this.textureY);
/*  269 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 1505, 1, this.textureX, this.textureY);
/*  270 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 1537, 1, this.textureX, this.textureY);
/*  271 */     this.gunModel['à'] = new ModelRendererTurbo(this, 1761, 1, this.textureX, this.textureY);
/*  272 */     this.gunModel['á'] = new ModelRendererTurbo(this, 2009, 1, this.textureX, this.textureY);
/*  273 */     this.gunModel['â'] = new ModelRendererTurbo(this, 1577, 1, this.textureX, this.textureY);
/*  274 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 1609, 1, this.textureX, this.textureY);
/*  275 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 1641, 1, this.textureX, this.textureY);
/*  276 */     this.gunModel['å'] = new ModelRendererTurbo(this, 1641, 129, this.textureX, this.textureY);
/*  277 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 817, 9, this.textureX, this.textureY);
/*  278 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 1905, 49, this.textureX, this.textureY);
/*  279 */     this.gunModel['è'] = new ModelRendererTurbo(this, 945, 9, this.textureX, this.textureY);
/*  280 */     this.gunModel['é'] = new ModelRendererTurbo(this, 1889, 129, this.textureX, this.textureY);
/*  281 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 401, 169, this.textureX, this.textureY);
/*  282 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 1657, 169, this.textureX, this.textureY);
/*  283 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 977, 129, this.textureX, this.textureY);
/*  284 */     this.gunModel['í'] = new ModelRendererTurbo(this, 1977, 129, this.textureX, this.textureY);
/*  285 */     this.gunModel['î'] = new ModelRendererTurbo(this, 89, 137, this.textureX, this.textureY);
/*  286 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 489, 153, this.textureX, this.textureY);
/*  287 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 1721, 169, this.textureX, this.textureY);
/*  288 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 1473, 169, this.textureX, this.textureY);
/*  289 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 209, 177, this.textureX, this.textureY);
/*  290 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 449, 177, this.textureX, this.textureY);
/*  291 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 521, 177, this.textureX, this.textureY);
/*  292 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 585, 177, this.textureX, this.textureY);
/*  293 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 665, 177, this.textureX, this.textureY);
/*  294 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 865, 177, this.textureX, this.textureY);
/*  295 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 1121, 177, this.textureX, this.textureY);
/*  296 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1185, 177, this.textureX, this.textureY);
/*  297 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 1257, 177, this.textureX, this.textureY);
/*  298 */     this.gunModel['û'] = new ModelRendererTurbo(this, 633, 129, this.textureX, this.textureY);
/*  299 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  300 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 1785, 177, this.textureX, this.textureY);
/*  301 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 1857, 177, this.textureX, this.textureY);
/*  302 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 913, 185, this.textureX, this.textureY);
/*  303 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 905, 81, this.textureX, this.textureY);
/*  304 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  305 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  306 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  307 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 225, 105, this.textureX, this.textureY);
/*  308 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 1953, 129, this.textureX, this.textureY);
/*  309 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 961, 33, this.textureX, this.textureY);
/*  310 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 1969, 177, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 1001, 185, this.textureX, this.textureY);
/*  312 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 1825, 1, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 1857, 1, this.textureX, this.textureY);
/*  314 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 1889, 1, this.textureX, this.textureY);
/*  315 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 249, 193, this.textureX, this.textureY);
/*  316 */     this.gunModel['č'] = new ModelRendererTurbo(this, 297, 193, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 369, 193, this.textureX, this.textureY);
/*  318 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 1937, 89, this.textureX, this.textureY);
/*  319 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 921, 121, this.textureX, this.textureY);
/*  320 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 705, 193, this.textureX, this.textureY);
/*  321 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 777, 193, this.textureX, this.textureY);
/*  322 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  323 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 1305, 193, this.textureX, this.textureY);
/*  324 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 1377, 193, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 1513, 193, this.textureX, this.textureY);
/*  326 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 1, 201, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 1697, 169, this.textureX, this.textureY);
/*  328 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 489, 209, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 1577, 193, this.textureX, this.textureY);
/*  330 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 161, 209, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 1105, 209, this.textureX, this.textureY);
/*  332 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 1441, 193, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 1153, 177, this.textureX, this.textureY);
/*  334 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 1625, 209, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 401, 209, this.textureX, this.textureY);
/*  336 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 1233, 177, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 1945, 201, this.textureX, this.textureY);
/*  338 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 2001, 201, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 825, 129, this.textureX, this.textureY);
/*  340 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 521, 137, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 969, 185, this.textureX, this.textureY);
/*  342 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 673, 209, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 833, 209, this.textureX, this.textureY);
/*  344 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 1201, 209, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 393, 145, this.textureX, this.textureY);
/*  346 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 1617, 145, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 705, 217, this.textureX, this.textureY);
/*  348 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 1, 225, this.textureX, this.textureY);
/*  349 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 1489, 225, this.textureX, this.textureY);
/*  350 */     this.gunModel['į'] = new ModelRendererTurbo(this, 81, 225, this.textureX, this.textureY);
/*  351 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 1881, 217, this.textureX, this.textureY);
/*  352 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 1073, 185, this.textureX, this.textureY);
/*  353 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 313, 105, this.textureX, this.textureY);
/*  354 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/*  355 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 369, 105, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 2009, 129, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 1089, 105, this.textureX, this.textureY);
/*  358 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 617, 9, this.textureX, this.textureY);
/*  359 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 1145, 105, this.textureX, this.textureY);
/*  360 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 1201, 105, this.textureX, this.textureY);
/*  361 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 1401, 105, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 2009, 161, this.textureX, this.textureY);
/*  363 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 161, 233, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 553, 177, this.textureX, this.textureY);
/*  365 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 641, 177, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 1265, 209, this.textureX, this.textureY);
/*  367 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 1473, 105, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 481, 185, this.textureX, this.textureY);
/*  369 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 1569, 217, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 1417, 193, this.textureX, this.textureY);
/*  371 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 1457, 129, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 1497, 129, this.textureX, this.textureY);
/*  373 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 1777, 137, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 1825, 177, this.textureX, this.textureY);
/*  375 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 1321, 153, this.textureX, this.textureY);
/*  376 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 1369, 153, this.textureX, this.textureY);
/*  377 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 1369, 225, this.textureX, this.textureY);
/*  378 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 457, 233, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 841, 153, this.textureX, this.textureY);
/*  380 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 513, 233, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 577, 233, this.textureX, this.textureY);
/*  382 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 761, 233, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 1089, 233, this.textureX, this.textureY);
/*  384 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 969, 89, this.textureX, this.textureY);
/*  385 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 1417, 153, this.textureX, this.textureY);
/*  386 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 1169, 233, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 865, 209, this.textureX, this.textureY);
/*  388 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 1105, 185, this.textureX, this.textureY);
/*  389 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 1289, 233, this.textureX, this.textureY);
/*  390 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 393, 241, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 633, 241, this.textureX, this.textureY);
/*  392 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 417, 145, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 1817, 33, this.textureX, this.textureY);
/*  394 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 1961, 33, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 737, 57, this.textureX, this.textureY);
/*  396 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 561, 81, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 849, 105, this.textureX, this.textureY);
/*  398 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 305, 153, this.textureX, this.textureY);
/*  399 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 1297, 177, this.textureX, this.textureY);
/*  400 */     this.gunModel['š'] = new ModelRendererTurbo(this, 1625, 113, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  402 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 873, 225, this.textureX, this.textureY);
/*  403 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 1241, 233, this.textureX, this.textureY);
/*  404 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 1785, 169, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 1977, 233, this.textureX, this.textureY);
/*  406 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 681, 241, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 825, 241, this.textureX, this.textureY);
/*  408 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 897, 241, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 977, 225, this.textureX, this.textureY);
/*  410 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 489, 233, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1705, 1, this.textureX, this.textureY);
/*  412 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 1921, 1, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 1953, 1, this.textureX, this.textureY);
/*  414 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 1985, 1, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*  416 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*  418 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 569, 9, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  420 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 721, 9, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 785, 9, this.textureX, this.textureY);
/*  422 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 849, 9, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 881, 9, this.textureX, this.textureY);
/*  424 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 913, 9, this.textureX, this.textureY);
/*  425 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 977, 9, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 1105, 249, this.textureX, this.textureY);
/*  427 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 1489, 249, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 113, 257, this.textureX, this.textureY);
/*  429 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 857, 137, this.textureX, this.textureY);
/*  430 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 233, 145, this.textureX, this.textureY);
/*  431 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 833, 193, this.textureX, this.textureY);
/*  433 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 1145, 9, this.textureX, this.textureY);
/*  434 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 1465, 9, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 1505, 9, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 1401, 1, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 209, 257, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 849, 265, this.textureX, this.textureY);
/*  439 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 1105, 273, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 1233, 9, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 1289, 9, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 561, 33, this.textureX, this.textureY);
/*  444 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 1665, 1, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 1281, 257, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 1401, 9, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 1537, 9, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 1577, 9, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 585, 33, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 1625, 129, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 753, 33, this.textureX, this.textureY);
/*  452 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 1641, 9, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 1577, 241, this.textureX, this.textureY);
/*  456 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 1201, 249, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 89, 249, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 1953, 177, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 921, 249, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 617, 33, this.textureX, this.textureY);
/*  461 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 1609, 9, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 993, 33, this.textureX, this.textureY);
/*  463 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  464 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  465 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  466 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  468 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  471 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 1321, 169, this.textureX, this.textureY);
/*      */     
/*  475 */     this.gunModel[0].addBox(20.0F, 27.0F, -13.0F, 75, 1, 23, 0.0F);
/*  476 */     this.gunModel[0].setRotationPoint(-24.0F, -57.0F, 2.0F);
/*      */     
/*  478 */     this.gunModel[1].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  479 */     this.gunModel[1].setRotationPoint(-5.0F, -63.0F, 1.0F);
/*      */     
/*  481 */     this.gunModel[2].addBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F);
/*  482 */     this.gunModel[2].setRotationPoint(-5.0F, -62.0F, 1.0F);
/*      */     
/*  484 */     this.gunModel[3].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  485 */     this.gunModel[3].setRotationPoint(-5.0F, -61.0F, 1.0F);
/*      */     
/*  487 */     this.gunModel[4].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  488 */     this.gunModel[4].setRotationPoint(-5.0F, -68.5F, 1.0F);
/*      */     
/*  490 */     this.gunModel[5].addBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F);
/*  491 */     this.gunModel[5].setRotationPoint(-5.0F, -67.5F, 1.0F);
/*      */     
/*  493 */     this.gunModel[6].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  494 */     this.gunModel[6].setRotationPoint(-5.0F, -66.5F, 1.0F);
/*      */     
/*  496 */     this.gunModel[7].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  497 */     this.gunModel[7].setRotationPoint(11.5F, -72.0F, 1.0F);
/*      */     
/*  499 */     this.gunModel[8].addBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F);
/*  500 */     this.gunModel[8].setRotationPoint(11.5F, -71.0F, 1.0F);
/*      */     
/*  502 */     this.gunModel[9].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  503 */     this.gunModel[9].setRotationPoint(11.5F, -70.0F, 1.0F);
/*      */     
/*  505 */     this.gunModel[10].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  506 */     this.gunModel[10].setRotationPoint(27.5F, -67.5F, 1.0F);
/*      */     
/*  508 */     this.gunModel[11].addBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F);
/*  509 */     this.gunModel[11].setRotationPoint(27.5F, -66.5F, 1.0F);
/*      */     
/*  511 */     this.gunModel[12].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  512 */     this.gunModel[12].setRotationPoint(27.5F, -65.5F, 1.0F);
/*      */     
/*  514 */     this.gunModel[13].addShapeBox(20.0F, 27.0F, -13.0F, 4, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  515 */     this.gunModel[13].setRotationPoint(-28.0F, -57.0F, 2.0F);
/*      */     
/*  517 */     this.gunModel[14].addShapeBox(20.0F, 27.0F, -13.0F, 5, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  518 */     this.gunModel[14].setRotationPoint(-33.0F, -58.0F, 2.0F);
/*      */     
/*  520 */     this.gunModel[15].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  521 */     this.gunModel[15].setRotationPoint(-36.0F, -59.25F, 2.0F);
/*      */     
/*  523 */     this.gunModel[16].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  524 */     this.gunModel[16].setRotationPoint(-40.0F, -61.25F, 2.0F);
/*      */     
/*  526 */     this.gunModel[17].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  527 */     this.gunModel[17].setRotationPoint(-43.0F, -62.25F, 2.0F);
/*      */     
/*  529 */     this.gunModel[18].addShapeBox(20.0F, 27.0F, -13.0F, 2, 4, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  530 */     this.gunModel[18].setRotationPoint(-45.0F, -65.25F, 2.0F);
/*      */     
/*  532 */     this.gunModel[19].addShapeBox(20.0F, 27.0F, -13.0F, 2, 4, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  533 */     this.gunModel[19].setRotationPoint(-47.0F, -67.25F, 2.0F);
/*      */     
/*  535 */     this.gunModel[20].addShapeBox(20.0F, 27.0F, -13.0F, 3, 4, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  536 */     this.gunModel[20].setRotationPoint(-50.0F, -69.25F, 2.0F);
/*      */     
/*  538 */     this.gunModel[21].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  539 */     this.gunModel[21].setRotationPoint(-53.0F, -70.75F, 2.0F);
/*      */     
/*  541 */     this.gunModel[22].addShapeBox(20.0F, 27.0F, -13.0F, 6, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F);
/*  542 */     this.gunModel[22].setRotationPoint(-59.0F, -72.75F, 2.0F);
/*      */     
/*  544 */     this.gunModel[23].addShapeBox(20.0F, 27.0F, -13.0F, 8, 2, 23, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  545 */     this.gunModel[23].setRotationPoint(-67.0F, -73.75F, 2.0F);
/*      */     
/*  547 */     this.gunModel[24].addShapeBox(20.0F, 27.0F, -13.0F, 9, 3, 26, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  548 */     this.gunModel[24].setRotationPoint(-22.0F, -76.0F, 0.5F);
/*      */     
/*  550 */     this.gunModel[25].addShapeBox(20.0F, 27.0F, -13.0F, 9, 3, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[25].setRotationPoint(-22.0F, -73.0F, 0.5F);
/*      */     
/*  553 */     this.gunModel[26].addShapeBox(20.0F, 27.0F, -13.0F, 9, 3, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  554 */     this.gunModel[26].setRotationPoint(-22.0F, -70.0F, 0.5F);
/*      */     
/*  556 */     this.gunModel[27].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 26, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  557 */     this.gunModel[27].setRotationPoint(-22.0F, -70.0F, 0.5F);
/*      */     
/*  559 */     this.gunModel[28].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  560 */     this.gunModel[28].setRotationPoint(-22.0F, -67.0F, 0.5F);
/*      */     
/*  562 */     this.gunModel[29].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 26, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  563 */     this.gunModel[29].setRotationPoint(-24.0F, -70.0F, 0.5F);
/*      */     
/*  565 */     this.gunModel[30].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  566 */     this.gunModel[30].setRotationPoint(-23.0F, -67.0F, 0.5F);
/*      */     
/*  568 */     this.gunModel[31].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  569 */     this.gunModel[31].setRotationPoint(-24.0F, -64.0F, 0.5F);
/*      */     
/*  571 */     this.gunModel[32].addShapeBox(20.0F, 27.0F, -13.0F, 134, 23, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  572 */     this.gunModel[32].setRotationPoint(-53.0F, -100.5F, 3.0F);
/*      */     
/*  574 */     this.gunModel[33].addBox(20.0F, 27.0F, -13.0F, 79, 21, 23, 0.0F);
/*  575 */     this.gunModel[33].setRotationPoint(-28.0F, -78.0F, 2.0F);
/*      */     
/*  577 */     this.gunModel[34].addBox(20.0F, 27.0F, -13.0F, 5, 20, 23, 0.0F);
/*  578 */     this.gunModel[34].setRotationPoint(-33.0F, -78.0F, 2.0F);
/*      */     
/*  580 */     this.gunModel[35].addShapeBox(20.0F, 27.0F, -13.0F, 3, 19, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  581 */     this.gunModel[35].setRotationPoint(-36.0F, -78.0F, 2.0F);
/*      */     
/*  583 */     this.gunModel[36].addShapeBox(20.0F, 27.0F, -13.0F, 4, 17, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  584 */     this.gunModel[36].setRotationPoint(-40.0F, -78.0F, 2.0F);
/*      */     
/*  586 */     this.gunModel[37].addShapeBox(20.0F, 27.0F, -13.0F, 3, 16, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  587 */     this.gunModel[37].setRotationPoint(-43.0F, -78.0F, 2.0F);
/*      */     
/*  589 */     this.gunModel[38].addShapeBox(20.0F, 27.0F, -13.0F, 2, 13, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  590 */     this.gunModel[38].setRotationPoint(-45.0F, -78.0F, 2.0F);
/*      */     
/*  592 */     this.gunModel[39].addShapeBox(20.0F, 27.0F, -13.0F, 2, 11, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  593 */     this.gunModel[39].setRotationPoint(-47.0F, -78.0F, 2.0F);
/*      */     
/*  595 */     this.gunModel[40].addShapeBox(20.0F, 27.0F, -13.0F, 3, 9, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  596 */     this.gunModel[40].setRotationPoint(-50.0F, -78.0F, 2.0F);
/*      */     
/*  598 */     this.gunModel[41].addShapeBox(20.0F, 27.0F, -13.0F, 3, 7, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  599 */     this.gunModel[41].setRotationPoint(-53.0F, -78.0F, 2.0F);
/*      */     
/*  601 */     this.gunModel[42].addShapeBox(20.0F, 27.0F, -13.0F, 6, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  602 */     this.gunModel[42].setRotationPoint(-59.0F, -74.75F, 2.0F);
/*      */     
/*  604 */     this.gunModel[43].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 23, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 1.0F, 0.25F, 0.0F);
/*  605 */     this.gunModel[43].setRotationPoint(-55.0F, -78.0F, 2.0F);
/*      */     
/*  607 */     this.gunModel[44].addShapeBox(20.0F, 27.0F, -13.0F, 2, 25, 27, 0.0F, 0.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.25F, 0.0F, 1.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[44].setRotationPoint(-56.0F, -99.75F, 0.0F);
/*      */     
/*  610 */     this.gunModel[45].addShapeBox(20.0F, 27.0F, -13.0F, 4, 25, 27, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[45].setRotationPoint(-60.0F, -99.75F, 0.0F);
/*      */     
/*  613 */     this.gunModel[46].addShapeBox(20.0F, 27.0F, -13.0F, 143, 16, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  614 */     this.gunModel[46].setRotationPoint(-37.0F, -116.5F, 2.5F);
/*      */     
/*  616 */     this.gunModel[47].addShapeBox(20.0F, 27.0F, -13.0F, 143, 1, 22, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  617 */     this.gunModel[47].setRotationPoint(-37.0F, -117.5F, 2.5F);
/*      */     
/*  619 */     this.gunModel[48].addShapeBox(20.0F, 27.0F, -13.0F, 12, 33, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  620 */     this.gunModel[48].setRotationPoint(-51.0F, -133.5F, 22.0F);
/*      */     
/*  622 */     this.gunModel[49].addShapeBox(20.0F, 27.0F, -13.0F, 1, 33, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  623 */     this.gunModel[49].setRotationPoint(-39.0F, -133.5F, 22.0F);
/*      */     
/*  625 */     this.gunModel[50].addShapeBox(20.0F, 27.0F, -13.0F, 1, 33, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  626 */     this.gunModel[50].setRotationPoint(-38.0F, -133.5F, 22.0F);
/*      */     
/*  628 */     this.gunModel[51].addShapeBox(20.0F, 27.0F, -13.0F, 12, 33, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  629 */     this.gunModel[51].setRotationPoint(-51.0F, -133.5F, 1.0F);
/*      */     
/*  631 */     this.gunModel[52].addShapeBox(20.0F, 27.0F, -13.0F, 1, 33, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  632 */     this.gunModel[52].setRotationPoint(-39.0F, -133.5F, 1.0F);
/*      */     
/*  634 */     this.gunModel[53].addShapeBox(20.0F, 27.0F, -13.0F, 1, 33, 4, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  635 */     this.gunModel[53].setRotationPoint(-38.0F, -133.5F, 1.0F);
/*      */     
/*  637 */     this.gunModel[54].addShapeBox(20.0F, 27.0F, -13.0F, 22, 16, 4, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  638 */     this.gunModel[54].setRotationPoint(-73.0F, -133.5F, 1.0F);
/*      */     
/*  640 */     this.gunModel[55].addShapeBox(20.0F, 27.0F, -13.0F, 22, 16, 4, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  641 */     this.gunModel[55].setRotationPoint(-73.0F, -133.5F, 22.0F);
/*      */     
/*  643 */     this.gunModel[56].addShapeBox(20.0F, 27.0F, -13.0F, 27, 30, 26, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -1.5F, 0.5F, 0.0F, 3.5F, -1.75F, 0.0F, 3.5F, -1.75F, 0.0F, -1.5F, 0.5F, 0.0F);
/*  644 */     this.gunModel[56].setRotationPoint(50.0F, -78.0F, 0.5F);
/*      */     
/*  646 */     this.gunModel[57].addShapeBox(20.0F, 27.0F, -13.0F, 5, 1, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[57].setRotationPoint(46.0F, -56.0F, 2.0F);
/*      */     
/*  649 */     this.gunModel[58].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F);
/*  650 */     this.gunModel[58].setRotationPoint(49.0F, -55.0F, 2.0F);
/*      */     
/*  652 */     this.gunModel[59].addShapeBox(20.0F, 27.0F, -13.0F, 132, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  653 */     this.gunModel[59].setRotationPoint(-37.0F, -120.5F, 8.5F);
/*      */     
/*  655 */     this.gunModel[60].addShapeBox(20.0F, 27.0F, -13.0F, 132, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  656 */     this.gunModel[60].setRotationPoint(-37.0F, -123.5F, 6.5F);
/*      */     
/*  658 */     this.gunModel[61].addShapeBox(20.0F, 27.0F, -13.0F, 78, 6, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  659 */     this.gunModel[61].setRotationPoint(106.0F, -106.5F, 2.5F);
/*      */     
/*  661 */     this.gunModel[62].addShapeBox(20.0F, 27.0F, -13.0F, 66, 2, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  662 */     this.gunModel[62].setRotationPoint(118.0F, -114.5F, 2.5F);
/*      */     
/*  664 */     this.gunModel[63].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  665 */     this.gunModel[63].setRotationPoint(106.0F, -108.5F, 23.5F);
/*      */     
/*  667 */     this.gunModel[64].addShapeBox(20.0F, 27.0F, -13.0F, 82, 3, 22, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  668 */     this.gunModel[64].setRotationPoint(118.0F, -117.5F, 2.5F);
/*      */     
/*  670 */     this.gunModel[65].addShapeBox(20.0F, 27.0F, -13.0F, 16, 14, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  671 */     this.gunModel[65].setRotationPoint(184.0F, -114.5F, 2.5F);
/*      */     
/*  673 */     this.gunModel[66].addShapeBox(20.0F, 27.0F, -13.0F, 22, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  674 */     this.gunModel[66].setRotationPoint(-73.0F, -118.5F, 26.0F);
/*      */     
/*  676 */     this.gunModel[67].addShapeBox(20.0F, 27.0F, -13.0F, 22, 17, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  677 */     this.gunModel[67].setRotationPoint(-73.0F, -117.5F, 22.0F);
/*      */     
/*  679 */     this.gunModel[68].addShapeBox(20.0F, 27.0F, -13.0F, 1, 17, 1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  680 */     this.gunModel[68].setRotationPoint(-51.0F, -117.5F, 26.0F);
/*      */     
/*  682 */     this.gunModel[69].addShapeBox(20.0F, 27.0F, -13.0F, 93, 1, 20, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[69].setRotationPoint(-43.0F, -56.0F, 3.5F);
/*      */     
/*  685 */     this.gunModel[70].addShapeBox(20.0F, 27.0F, -13.0F, 5, 57, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 26.0F, 0.0F, 0.0F, -26.0F, 0.0F, -4.0F, -26.0F, 0.0F, -4.0F, 26.0F, 0.0F, 0.0F);
/*  686 */     this.gunModel[70].setRotationPoint(-18.0F, -53.0F, 3.5F);
/*      */     
/*  688 */     this.gunModel[71].addShapeBox(20.0F, 27.0F, -13.0F, 5, 2, 20, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
/*  689 */     this.gunModel[71].setRotationPoint(-18.0F, -55.0F, 3.5F);
/*      */     
/*  691 */     this.gunModel[72].addShapeBox(20.0F, 27.0F, -13.0F, 26, 2, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/*  692 */     this.gunModel[72].setRotationPoint(-43.0F, -55.0F, 3.5F);
/*      */     
/*  694 */     this.gunModel[73].addShapeBox(20.0F, 27.0F, -13.0F, 26, 4, 20, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.8F, 0.0F, 0.0F, -2.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  695 */     this.gunModel[73].setRotationPoint(-43.0F, -53.0F, 3.5F);
/*      */     
/*  697 */     this.gunModel[74].addShapeBox(20.0F, 27.0F, -13.0F, 92, 6, 20, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  698 */     this.gunModel[74].setRotationPoint(-42.0F, -62.0F, 3.5F);
/*      */     
/*  700 */     this.gunModel[75].addShapeBox(20.0F, 27.0F, -13.0F, 5, 40, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, 0.0F);
/*  701 */     this.gunModel[75].setRotationPoint(-43.0F, -49.0F, 3.5F);
/*      */     
/*  703 */     this.gunModel[76].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 20, 0.0F, -2.4F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/*  704 */     this.gunModel[76].setRotationPoint(-41.0F, -48.0F, 3.5F);
/*      */     
/*  706 */     this.gunModel[77].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 20, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/*  707 */     this.gunModel[77].setRotationPoint(-39.0F, -49.0F, 3.5F);
/*      */     
/*  709 */     this.gunModel[78].addShapeBox(20.0F, 27.0F, -13.0F, 12, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  710 */     this.gunModel[78].setRotationPoint(106.0F, -114.5F, 2.5F);
/*      */     
/*  712 */     this.gunModel[79].addShapeBox(20.0F, 27.0F, -13.0F, 12, 3, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  713 */     this.gunModel[79].setRotationPoint(106.0F, -117.5F, 2.5F);
/*      */     
/*  715 */     this.gunModel[80].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 20, 0.0F, 0.5F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F);
/*  716 */     this.gunModel[80].setRotationPoint(-22.0F, -49.0F, 3.5F);
/*      */     
/*  718 */     this.gunModel[81].addShapeBox(20.0F, 27.0F, -13.0F, 5, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  719 */     this.gunModel[81].setRotationPoint(-67.0F, -9.0F, 3.5F);
/*      */     
/*  721 */     this.gunModel[82].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/*  722 */     this.gunModel[82].setRotationPoint(-67.0F, -6.0F, 3.5F);
/*      */     
/*  724 */     this.gunModel[83].addShapeBox(20.0F, 27.0F, -13.0F, 17, 8, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -6.0F, 0.0F);
/*  725 */     this.gunModel[83].setRotationPoint(-62.0F, -8.0F, 3.5F);
/*      */     
/*  727 */     this.gunModel[84].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  728 */     this.gunModel[84].setRotationPoint(-62.0F, -9.0F, 3.5F);
/*      */     
/*  730 */     this.gunModel[85].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 20, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.2F, 0.5F, 0.0F, 0.2F, 0.5F, 0.0F, 0.2F, 0.5F, 0.0F, -3.2F, 0.5F, 0.0F);
/*  731 */     this.gunModel[85].setRotationPoint(-62.0F, -8.0F, 3.5F);
/*      */     
/*  733 */     this.gunModel[86].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 20, 0.0F, -1.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  734 */     this.gunModel[86].setRotationPoint(-62.0F, -11.0F, 3.5F);
/*      */     
/*  736 */     this.gunModel[87].addShapeBox(20.0F, 27.0F, -13.0F, 3, 4, 20, 0.0F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  737 */     this.gunModel[87].setRotationPoint(-45.0F, 0.0F, 3.5F);
/*      */     
/*  739 */     this.gunModel[88].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 20, 0.0F, -2.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[88].setRotationPoint(-44.0F, -2.0F, 3.5F);
/*      */     
/*  742 */     this.gunModel[89].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  743 */     this.gunModel[89].setRotationPoint(-64.0F, -6.0F, 3.5F);
/*      */     
/*  745 */     this.gunModel[90].addShapeBox(20.0F, 27.0F, -13.0F, 17, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  746 */     this.gunModel[90].setRotationPoint(-62.0F, -6.0F, 3.5F);
/*      */     
/*  748 */     this.gunModel[91].addShapeBox(20.0F, 27.0F, -13.0F, 5, 6, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, -4.0F, 0.0F, -0.5F, 0.0F);
/*  749 */     this.gunModel[91].setRotationPoint(-44.0F, 4.0F, 3.5F);
/*      */     
/*  751 */     this.gunModel[92].addShapeBox(20.0F, 27.0F, -13.0F, 1, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  752 */     this.gunModel[92].setRotationPoint(-45.0F, 4.0F, 3.5F);
/*      */     
/*  754 */     this.gunModel[93].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  755 */     this.gunModel[93].setRotationPoint(-39.0F, 5.0F, 7.5F);
/*      */     
/*  757 */     this.gunModel[94].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  758 */     this.gunModel[94].setRotationPoint(-39.0F, 8.0F, 7.5F);
/*      */     
/*  760 */     this.gunModel[95].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  761 */     this.gunModel[95].setRotationPoint(-39.0F, 9.0F, 7.5F);
/*      */     
/*  763 */     this.gunModel[96].addShapeBox(20.0F, 27.0F, -13.0F, 15, 1, 22, 0.0F, -1.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  764 */     this.gunModel[96].setRotationPoint(-37.25F, -49.0F, 2.5F);
/*      */     
/*  766 */     this.gunModel[97].addShapeBox(20.0F, 27.0F, -13.0F, 20, 3, 22, 0.0F, -2.4F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  767 */     this.gunModel[97].setRotationPoint(-40.15F, -48.0F, 2.5F);
/*      */     
/*  769 */     this.gunModel[98].addShapeBox(20.0F, 27.0F, -13.0F, 18, 34, 22, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 20.5F, -0.5F, 0.0F, -14.75F, -0.5F, 0.0F, -14.75F, -0.5F, 0.0F, 20.5F, -0.5F, 0.0F);
/*  770 */     this.gunModel[98].setRotationPoint(-40.15F, -45.0F, 2.5F);
/*      */     
/*  772 */     this.gunModel[99].addShapeBox(20.0F, 27.0F, -13.0F, 24, 2, 22, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel[99].setRotationPoint(-60.65F, -11.0F, 2.5F);
/*      */     
/*  775 */     this.gunModel[100].addShapeBox(20.0F, 27.0F, -13.0F, 22, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  776 */     this.gunModel[100].setRotationPoint(-60.65F, -9.0F, 2.5F);
/*      */     
/*  778 */     this.gunModel[101].addShapeBox(20.0F, 27.0F, -13.0F, 22, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.5F, 0.0F, -0.45F, 0.5F, 0.0F, -0.45F, 0.5F, 0.0F, -1.75F, 0.5F, 0.0F);
/*  779 */     this.gunModel[101].setRotationPoint(-60.65F, -8.0F, 2.5F);
/*      */     
/*  781 */     this.gunModel[102].addShapeBox(20.0F, 27.0F, -13.0F, 19, 1, 22, 0.0F, 0.25F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F);
/*  782 */     this.gunModel[102].setRotationPoint(-58.65F, -6.5F, 2.5F);
/*      */     
/*  784 */     this.gunModel[103].addShapeBox(20.0F, 27.0F, -13.0F, 17, 3, 22, 0.0F, 0.15F, 0.5F, 0.0F, 0.05F, 0.5F, 0.0F, 0.05F, 0.5F, 0.0F, 0.15F, 0.5F, 0.0F, -7.25F, 0.0F, 0.0F, -1.55F, 0.0F, 0.0F, -1.55F, 0.0F, 0.0F, -7.25F, 0.0F, 0.0F);
/*  785 */     this.gunModel[103].setRotationPoint(-56.65F, -5.0F, 2.5F);
/*      */     
/*  787 */     this.gunModel[104].addShapeBox(20.0F, 27.0F, -13.0F, 8, 2, 22, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -4.25F, 0.0F, 0.0F);
/*  788 */     this.gunModel[104].setRotationPoint(-49.25F, -2.0F, 2.5F);
/*      */     
/*  790 */     this.gunModel[105].addShapeBox(20.0F, 27.0F, -13.0F, 2, 40, 20, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 24.0F, 0.0F, -3.0F, -24.0F, 0.0F, 0.0F, -24.0F, 0.0F, 0.0F, 24.0F, 0.0F, -3.0F);
/*  791 */     this.gunModel[105].setRotationPoint(-45.0F, -49.0F, 3.5F);
/*      */     
/*  793 */     this.gunModel[106].addShapeBox(20.0F, 27.0F, -13.0F, 5, 4, 20, 0.0F, -0.5F, 0.0F, -3.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/*  794 */     this.gunModel[106].setRotationPoint(-45.0F, -53.0F, 3.5F);
/*      */     
/*  796 */     this.gunModel[107].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  797 */     this.gunModel[107].setRotationPoint(-69.0F, -9.0F, 3.5F);
/*      */     
/*  799 */     this.gunModel[108].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 20, 0.0F, 1.0F, 0.0F, -3.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F);
/*  800 */     this.gunModel[108].setRotationPoint(-43.5F, -55.0F, 3.5F);
/*      */     
/*  802 */     this.gunModel[109].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 20, 0.0F, 0.25F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/*  803 */     this.gunModel[109].setRotationPoint(-44.25F, -56.0F, 3.5F);
/*      */     
/*  805 */     this.gunModel[110].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 20, 0.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/*  806 */     this.gunModel[110].setRotationPoint(-44.25F, -58.0F, 3.5F);
/*      */     
/*  808 */     this.gunModel[111].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 20, 0.0F, 2.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/*  809 */     this.gunModel[111].setRotationPoint(-44.25F, -61.0F, 3.5F);
/*      */     
/*  811 */     this.gunModel[112].addShapeBox(20.0F, 27.0F, -13.0F, 4, 3, 20, 0.0F, 3.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/*  812 */     this.gunModel[112].setRotationPoint(-46.25F, -64.0F, 3.5F);
/*      */     
/*  814 */     this.gunModel[113].addShapeBox(20.0F, 27.0F, -13.0F, 4, 3, 20, 0.0F, 3.25F, 0.0F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 3.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.25F, 0.0F, -3.0F);
/*  815 */     this.gunModel[113].setRotationPoint(-49.25F, -67.0F, 3.5F);
/*      */     
/*  817 */     this.gunModel[114].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 20, 0.0F, 3.25F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 3.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.25F, 0.0F, -3.0F);
/*  818 */     this.gunModel[114].setRotationPoint(-52.25F, -69.0F, 3.5F);
/*      */     
/*  820 */     this.gunModel[115].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 20, 0.0F, 6.25F, 0.0F, -3.0F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 6.25F, 0.0F, -3.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -2.4F, 0.0F, 0.0F, -2.4F, 0.25F, 0.0F, -3.0F);
/*  821 */     this.gunModel[115].setRotationPoint(-55.25F, -71.0F, 3.5F);
/*      */     
/*  823 */     this.gunModel[116].addShapeBox(20.0F, 27.0F, -13.0F, 7, 3, 14, 0.0F, 5.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 5.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F);
/*  824 */     this.gunModel[116].setRotationPoint(-61.25F, -74.0F, 6.5F);
/*      */     
/*  826 */     this.gunModel[117].addShapeBox(20.0F, 27.0F, -13.0F, 78, 6, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  827 */     this.gunModel[117].setRotationPoint(106.0F, -112.0F, 2.5F);
/*      */     
/*  829 */     this.gunModel[118].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  830 */     this.gunModel[118].setRotationPoint(-19.0F, -40.0F, 9.5F);
/*      */     
/*  832 */     this.gunModel[119].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  833 */     this.gunModel[119].setRotationPoint(-19.0F, -37.0F, 9.5F);
/*      */     
/*  835 */     this.gunModel[120].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  836 */     this.gunModel[120].setRotationPoint(-22.0F, -37.0F, 9.5F);
/*      */     
/*  838 */     this.gunModel[121].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  839 */     this.gunModel[121].setRotationPoint(-22.0F, -40.0F, 9.5F);
/*      */     
/*  841 */     this.gunModel[122].addShapeBox(20.0F, 27.0F, -13.0F, 9, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  842 */     this.gunModel[122].setRotationPoint(-17.0F, -37.0F, 9.5F);
/*      */     
/*  844 */     this.gunModel[123].addShapeBox(20.0F, 27.0F, -13.0F, 31, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  845 */     this.gunModel[123].setRotationPoint(-8.0F, -32.0F, 9.5F);
/*      */     
/*  847 */     this.gunModel[124].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  848 */     this.gunModel[124].setRotationPoint(23.0F, -32.0F, 9.5F);
/*      */     
/*  850 */     this.gunModel[125].addShapeBox(20.0F, 27.0F, -13.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  851 */     this.gunModel[125].setRotationPoint(27.0F, -34.0F, 9.5F);
/*      */     
/*  853 */     this.gunModel[126].addShapeBox(20.0F, 27.0F, -13.0F, 1, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  854 */     this.gunModel[126].setRotationPoint(32.0F, -45.0F, 9.5F);
/*      */     
/*  856 */     this.gunModel[127].addShapeBox(20.0F, 27.0F, -13.0F, 16, 4, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  857 */     this.gunModel[127].setRotationPoint(34.0F, -45.0F, 4.5F);
/*      */     
/*  859 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 7, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  860 */     this.gunModel[''].setRotationPoint(33.0F, -48.0F, 4.5F);
/*      */     
/*  862 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  863 */     this.gunModel[''].setRotationPoint(50.0F, -45.0F, 4.5F);
/*      */     
/*  865 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 2, 7, 18, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  866 */     this.gunModel[''].setRotationPoint(49.5F, -52.0F, 4.5F);
/*      */     
/*  868 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  869 */     this.gunModel[''].setRotationPoint(48.0F, -53.0F, 4.5F);
/*      */     
/*  871 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  872 */     this.gunModel[''].setRotationPoint(48.0F, -55.0F, 4.5F);
/*      */     
/*  874 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 14, 2, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  875 */     this.gunModel[''].setRotationPoint(34.0F, -54.0F, 4.5F);
/*      */     
/*  877 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 16, 7, 18, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  878 */     this.gunModel[''].setRotationPoint(34.0F, -52.0F, 4.5F);
/*      */     
/*  880 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  881 */     this.gunModel[''].setRotationPoint(33.0F, -51.0F, 4.5F);
/*      */     
/*  883 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 2, 18, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  884 */     this.gunModel[''].setRotationPoint(33.0F, -53.0F, 4.5F);
/*      */     
/*  886 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 18, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  887 */     this.gunModel[''].setRotationPoint(32.0F, -51.0F, 4.5F);
/*      */     
/*  889 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 4, 1, 18, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  890 */     this.gunModel[''].setRotationPoint(30.0F, -54.0F, 4.5F);
/*      */     
/*  892 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 19, 1, 18, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  893 */     this.gunModel[''].setRotationPoint(29.0F, -55.0F, 4.5F);
/*      */     
/*  895 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 10, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/*  896 */     this.gunModel[''].setRotationPoint(-11.0F, -55.0F, 12.5F);
/*      */     
/*  898 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  899 */     this.gunModel[''].setRotationPoint(-8.0F, -52.0F, 12.5F);
/*      */     
/*  901 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 4, 6, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  902 */     this.gunModel[''].setRotationPoint(-8.0F, -51.0F, 12.5F);
/*      */     
/*  904 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  905 */     this.gunModel[''].setRotationPoint(-8.0F, -45.0F, 12.5F);
/*      */     
/*  907 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 4, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  908 */     this.gunModel[''].setRotationPoint(-8.0F, -43.0F, 12.5F);
/*      */     
/*  910 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  911 */     this.gunModel[''].setRotationPoint(-7.0F, -39.0F, 12.5F);
/*      */     
/*  913 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  914 */     this.gunModel[''].setRotationPoint(-6.0F, -37.0F, 12.5F);
/*      */     
/*  916 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.5F, -0.5F, 0.0F);
/*  917 */     this.gunModel[''].setRotationPoint(-4.0F, -35.0F, 12.5F);
/*      */     
/*  919 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  920 */     this.gunModel[''].setRotationPoint(-0.5F, -35.0F, 12.5F);
/*      */     
/*  922 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  923 */     this.gunModel[''].setRotationPoint(-0.5F, -34.25F, 12.5F);
/*      */     
/*  925 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 2, 30, 30, 0.0F, 3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 5.0F, 0.5F, 0.0F, 5.0F, 0.5F, 0.0F, -3.0F, 1.0F, 0.0F);
/*  926 */     this.gunModel[''].setRotationPoint(80.0F, -78.0F, -1.5F);
/*      */     
/*  928 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 30, 28, 0.0F, 3.0F, 0.0F, -1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 0.0F, -1.0F, -3.0F, 1.25F, -1.0F, 4.0F, 1.0F, 1.0F, 4.0F, 1.0F, 1.0F, -3.0F, 1.25F, -1.0F);
/*  929 */     this.gunModel[''].setRotationPoint(78.0F, -78.0F, -0.5F);
/*      */     
/*  931 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 29, 3, 28, 0.0F, 0.5F, -2.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.5F, -2.5F, -1.0F, 0.5F, 2.75F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.5F, 2.75F, 1.0F);
/*  932 */     this.gunModel[''].setRotationPoint(52.0F, -50.0F, -0.5F);
/*      */     
/*  934 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 28, 0.0F, 0.0F, 0.0F, -1.0F, -0.55F, 0.0F, -1.0F, -0.55F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.25F, 1.0F);
/*  935 */     this.gunModel[''].setRotationPoint(81.0F, -50.0F, -0.5F);
/*      */     
/*  937 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 1, 23, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  938 */     this.gunModel[''].setRotationPoint(81.0F, -100.5F, 0.0F);
/*      */     
/*  940 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 5, 23, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  941 */     this.gunModel[''].setRotationPoint(82.0F, -100.5F, 0.0F);
/*      */     
/*  943 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 23, 9, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  944 */     this.gunModel[''].setRotationPoint(87.0F, -100.5F, 0.0F);
/*      */     
/*  946 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 2, 14, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  947 */     this.gunModel[''].setRotationPoint(110.0F, -93.5F, 0.0F);
/*      */     
/*  949 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 90, 2, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  950 */     this.gunModel[''].setRotationPoint(110.0F, -100.5F, 0.0F);
/*      */     
/*  952 */     this.gunModel[''].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  953 */     this.gunModel[''].setRotationPoint(110.0F, -95.5F, 0.0F);
/*      */     
/*  955 */     this.gunModel[' '].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  956 */     this.gunModel[' '].setRotationPoint(110.0F, -98.5F, 0.0F);
/*      */     
/*  958 */     this.gunModel['¡'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  959 */     this.gunModel['¡'].setRotationPoint(139.0F, -98.5F, 0.0F);
/*      */     
/*  961 */     this.gunModel['¢'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  962 */     this.gunModel['¢'].setRotationPoint(139.0F, -95.5F, 0.0F);
/*      */     
/*  964 */     this.gunModel['£'].addShapeBox(20.0F, 27.0F, -13.0F, 12, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  965 */     this.gunModel['£'].setRotationPoint(141.0F, -98.5F, 0.0F);
/*      */     
/*  967 */     this.gunModel['¤'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  968 */     this.gunModel['¤'].setRotationPoint(153.0F, -98.5F, 0.0F);
/*      */     
/*  970 */     this.gunModel['¥'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  971 */     this.gunModel['¥'].setRotationPoint(153.0F, -95.5F, 0.0F);
/*      */     
/*  973 */     this.gunModel['¦'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  974 */     this.gunModel['¦'].setRotationPoint(139.0F, -98.5F, 22.0F);
/*      */     
/*  976 */     this.gunModel['§'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  977 */     this.gunModel['§'].setRotationPoint(139.0F, -95.5F, 22.0F);
/*      */     
/*  979 */     this.gunModel['¨'].addShapeBox(20.0F, 27.0F, -13.0F, 12, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  980 */     this.gunModel['¨'].setRotationPoint(141.0F, -98.5F, 22.0F);
/*      */     
/*  982 */     this.gunModel['©'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  983 */     this.gunModel['©'].setRotationPoint(153.0F, -98.5F, 22.0F);
/*      */     
/*  985 */     this.gunModel['ª'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  986 */     this.gunModel['ª'].setRotationPoint(153.0F, -95.5F, 22.0F);
/*      */     
/*  988 */     this.gunModel['«'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  989 */     this.gunModel['«'].setRotationPoint(179.0F, -98.5F, 0.0F);
/*      */     
/*  991 */     this.gunModel['¬'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  992 */     this.gunModel['¬'].setRotationPoint(179.0F, -95.5F, 0.0F);
/*      */     
/*  994 */     this.gunModel['­'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  995 */     this.gunModel['­'].setRotationPoint(181.0F, -98.5F, 0.0F);
/*      */     
/*  997 */     this.gunModel['®'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  998 */     this.gunModel['®'].setRotationPoint(179.0F, -98.5F, 22.0F);
/*      */     
/* 1000 */     this.gunModel['¯'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 5, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1001 */     this.gunModel['¯'].setRotationPoint(179.0F, -95.5F, 22.0F);
/*      */     
/* 1003 */     this.gunModel['°'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1004 */     this.gunModel['°'].setRotationPoint(181.0F, -98.5F, 22.0F);
/*      */     
/* 1006 */     this.gunModel['±'].addShapeBox(20.0F, 27.0F, -13.0F, 88, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1007 */     this.gunModel['±'].setRotationPoint(112.0F, -93.5F, 22.0F);
/*      */     
/* 1009 */     this.gunModel['²'].addShapeBox(20.0F, 27.0F, -13.0F, 88, 12, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1010 */     this.gunModel['²'].setRotationPoint(112.0F, -93.5F, 0.0F);
/*      */     
/* 1012 */     this.gunModel['³'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1013 */     this.gunModel['³'].setRotationPoint(181.0F, -98.5F, 5.0F);
/*      */     
/* 1015 */     this.gunModel['´'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1016 */     this.gunModel['´'].setRotationPoint(181.0F, -96.5F, 5.0F);
/*      */     
/* 1018 */     this.gunModel['µ'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 2, 1, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1019 */     this.gunModel['µ'].setRotationPoint(181.0F, -96.5F, 21.0F);
/*      */     
/* 1021 */     this.gunModel['¶'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 2, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1022 */     this.gunModel['¶'].setRotationPoint(181.0F, -98.5F, 20.0F);
/*      */     
/* 1024 */     this.gunModel['·'].addShapeBox(20.0F, 27.0F, -13.0F, 90, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1025 */     this.gunModel['·'].setRotationPoint(110.0F, -81.0F, 0.0F);
/*      */     
/* 1027 */     this.gunModel['¸'].addShapeBox(20.0F, 27.0F, -13.0F, 90, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1028 */     this.gunModel['¸'].setRotationPoint(110.0F, -77.0F, 1.0F);
/*      */     
/* 1030 */     this.gunModel['¹'].addShapeBox(20.0F, 27.0F, -13.0F, 90, 3, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F);
/* 1031 */     this.gunModel['¹'].setRotationPoint(110.0F, -74.0F, 4.0F);
/*      */     
/* 1033 */     this.gunModel['º'].addShapeBox(20.0F, 27.0F, -13.0F, 90, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1034 */     this.gunModel['º'].setRotationPoint(110.0F, -81.0F, 22.0F);
/*      */     
/* 1036 */     this.gunModel['»'].addShapeBox(20.0F, 27.0F, -13.0F, 90, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1037 */     this.gunModel['»'].setRotationPoint(110.0F, -77.0F, 21.0F);
/*      */     
/* 1039 */     this.gunModel['¼'].addShapeBox(20.0F, 27.0F, -13.0F, 90, 2, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1040 */     this.gunModel['¼'].setRotationPoint(110.0F, -76.0F, 6.0F);
/*      */     
/* 1042 */     this.gunModel['½'].addShapeBox(20.0F, 27.0F, -13.0F, 90, 2, 5, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1043 */     this.gunModel['½'].setRotationPoint(110.0F, -76.0F, 16.0F);
/*      */     
/* 1045 */     this.gunModel['¾'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1046 */     this.gunModel['¾'].setRotationPoint(116.0F, -92.5F, 27.0F);
/*      */     
/* 1048 */     this.gunModel['¿'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1049 */     this.gunModel['¿'].setRotationPoint(194.0F, -92.5F, 27.0F);
/*      */     
/* 1051 */     this.gunModel['À'].addShapeBox(20.0F, 27.0F, -13.0F, 87, 14, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1052 */     this.gunModel['À'].setRotationPoint(114.0F, -95.5F, 28.0F);
/*      */     
/* 1054 */     this.gunModel['Á'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1055 */     this.gunModel['Á'].setRotationPoint(116.0F, -92.5F, -1.0F);
/*      */     
/* 1057 */     this.gunModel['Â'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1058 */     this.gunModel['Â'].setRotationPoint(194.0F, -92.5F, -1.0F);
/*      */     
/* 1060 */     this.gunModel['Ã'].addShapeBox(20.0F, 27.0F, -13.0F, 22, 17, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1061 */     this.gunModel['Ã'].setRotationPoint(-73.0F, -117.5F, 0.0F);
/*      */     
/* 1063 */     this.gunModel['Ä'].addShapeBox(20.0F, 27.0F, -13.0F, 22, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1064 */     this.gunModel['Ä'].setRotationPoint(-73.0F, -118.5F, 0.0F);
/*      */     
/* 1066 */     this.gunModel['Å'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1067 */     this.gunModel['Å'].setRotationPoint(-51.0F, -117.5F, 0.0F);
/*      */     
/* 1069 */     this.gunModel['Æ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1070 */     this.gunModel['Æ'].setRotationPoint(180.0F, -110.5F, 19.5F);
/*      */     
/* 1072 */     this.gunModel['Ç'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1073 */     this.gunModel['Ç'].setRotationPoint(180.0F, -112.0F, 24.5F);
/*      */     
/* 1075 */     this.gunModel['È'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1076 */     this.gunModel['È'].setRotationPoint(185.0F, -112.0F, 24.5F);
/*      */     
/* 1078 */     this.gunModel['É'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1079 */     this.gunModel['É'].setRotationPoint(185.0F, -112.0F, 28.5F);
/*      */     
/* 1081 */     this.gunModel['Ê'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1082 */     this.gunModel['Ê'].setRotationPoint(185.0F, -112.0F, 30.5F);
/*      */     
/* 1084 */     this.gunModel['Ë'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 6, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1085 */     this.gunModel['Ë'].setRotationPoint(178.0F, -112.0F, 24.5F);
/*      */     
/* 1087 */     this.gunModel['Ì'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1088 */     this.gunModel['Ì'].setRotationPoint(178.0F, -112.0F, 29.5F);
/*      */     
/* 1090 */     this.gunModel['Í'].addShapeBox(20.0F, 27.0F, -13.0F, 109, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1091 */     this.gunModel['Í'].setRotationPoint(111.0F, -90.5F, 9.5F);
/*      */     
/* 1093 */     this.gunModel['Î'].addShapeBox(20.0F, 27.0F, -13.0F, 14, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1094 */     this.gunModel['Î'].setRotationPoint(210.0F, -91.0F, 9.0F);
/*      */     
/* 1096 */     this.gunModel['Ï'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 10, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1097 */     this.gunModel['Ï'].setRotationPoint(201.0F, -91.5F, 8.5F);
/*      */     
/* 1099 */     this.gunModel['Ð'].addShapeBox(20.0F, 27.0F, -13.0F, 16, 10, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1100 */     this.gunModel['Ð'].setRotationPoint(94.0F, -82.5F, 0.0F);
/*      */     
/* 1102 */     this.gunModel['Ñ'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 11, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1103 */     this.gunModel['Ñ'].setRotationPoint(191.0F, -81.0F, 0.0F);
/*      */     
/* 1105 */     this.gunModel['Ò'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 5, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1106 */     this.gunModel['Ò'].setRotationPoint(191.0F, -70.0F, 0.0F);
/*      */     
/* 1108 */     this.gunModel['Ó'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 3, 23, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F);
/* 1109 */     this.gunModel['Ó'].setRotationPoint(191.0F, -65.0F, 2.0F);
/*      */     
/* 1111 */     this.gunModel['Ô'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 11, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1112 */     this.gunModel['Ô'].setRotationPoint(191.0F, -81.0F, 22.0F);
/*      */     
/* 1114 */     this.gunModel['Õ'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 4, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1115 */     this.gunModel['Õ'].setRotationPoint(191.0F, -74.0F, 5.0F);
/*      */     
/* 1117 */     this.gunModel['Ö'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1118 */     this.gunModel['Ö'].setRotationPoint(191.0F, -70.0F, 22.0F);
/*      */     
/* 1120 */     this.gunModel['×'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 6, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1121 */     this.gunModel['×'].setRotationPoint(191.5F, -62.0F, 9.0F);
/*      */     
/* 1123 */     this.gunModel['Ø'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 6, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1124 */     this.gunModel['Ø'].setRotationPoint(196.5F, -62.0F, 9.0F);
/*      */     
/* 1126 */     this.gunModel['Ù'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1127 */     this.gunModel['Ù'].setRotationPoint(193.5F, -62.0F, 9.0F);
/*      */     
/* 1129 */     this.gunModel['Ú'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1130 */     this.gunModel['Ú'].setRotationPoint(193.5F, -58.0F, 9.0F);
/*      */     
/* 1132 */     this.gunModel['Û'].addShapeBox(20.0F, 27.0F, -13.0F, 78, 3, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1133 */     this.gunModel['Û'].setRotationPoint(113.0F, -68.0F, 5.0F);
/*      */     
/* 1135 */     this.gunModel['Ü'].addShapeBox(20.0F, 27.0F, -13.0F, 78, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1136 */     this.gunModel['Ü'].setRotationPoint(113.0F, -70.0F, 7.0F);
/*      */     
/* 1138 */     this.gunModel['Ý'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/* 1139 */     this.gunModel['Ý'].setRotationPoint(193.5F, -71.0F, 25.0F);
/*      */     
/* 1141 */     this.gunModel['Þ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1142 */     this.gunModel['Þ'].setRotationPoint(193.5F, -69.0F, 28.0F);
/*      */     
/* 1144 */     this.gunModel['ß'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1145 */     this.gunModel['ß'].setRotationPoint(193.5F, -67.0F, 25.0F);
/*      */     
/* 1147 */     this.gunModel['à'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1148 */     this.gunModel['à'].setRotationPoint(116.0F, -72.0F, 10.0F);
/*      */     
/* 1150 */     this.gunModel['á'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1151 */     this.gunModel['á'].setRotationPoint(184.0F, -72.0F, 10.0F);
/*      */     
/* 1153 */     this.gunModel['â'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1154 */     this.gunModel['â'].setRotationPoint(193.5F, -67.0F, -1.0F);
/*      */     
/* 1156 */     this.gunModel['ã'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1157 */     this.gunModel['ã'].setRotationPoint(193.5F, -71.0F, -1.0F);
/*      */     
/* 1159 */     this.gunModel['ä'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1160 */     this.gunModel['ä'].setRotationPoint(193.5F, -69.0F, -3.0F);
/*      */     
/* 1162 */     this.gunModel['å'].addShapeBox(20.0F, 27.0F, -13.0F, 17, 3, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F);
/* 1163 */     this.gunModel['å'].setRotationPoint(93.0F, -74.0F, 4.0F);
/*      */     
/* 1165 */     this.gunModel['æ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1166 */     this.gunModel['æ'].setRotationPoint(104.0F, -77.0F, 21.0F);
/*      */     
/* 1168 */     this.gunModel['ç'].addShapeBox(20.0F, 27.0F, -13.0F, 10, 3, 5, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1169 */     this.gunModel['ç'].setRotationPoint(94.0F, -77.0F, 21.0F);
/*      */     
/* 1171 */     this.gunModel['è'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 4, 5, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -3.85F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.15F);
/* 1172 */     this.gunModel['è'].setRotationPoint(104.0F, -81.0F, 22.0F);
/*      */     
/* 1174 */     this.gunModel['é'].addShapeBox(20.0F, 27.0F, -13.0F, 16, 2, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1175 */     this.gunModel['é'].setRotationPoint(94.0F, -84.5F, 0.0F);
/*      */     
/* 1177 */     this.gunModel['ê'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 6, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1178 */     this.gunModel['ê'].setRotationPoint(87.0F, -84.5F, 0.0F);
/*      */     
/* 1180 */     this.gunModel['ë'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 7, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1181 */     this.gunModel['ë'].setRotationPoint(106.0F, -91.5F, 0.0F);
/*      */     
/* 1183 */     this.gunModel['ì'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1184 */     this.gunModel['ì'].setRotationPoint(87.0F, -86.5F, 0.0F);
/*      */     
/* 1186 */     this.gunModel['í'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1187 */     this.gunModel['í'].setRotationPoint(87.0F, -91.5F, 0.0F);
/*      */     
/* 1189 */     this.gunModel['î'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/* 1190 */     this.gunModel['î'].setRotationPoint(104.0F, -91.5F, 0.0F);
/*      */     
/* 1192 */     this.gunModel['ï'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 27, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1193 */     this.gunModel['ï'].setRotationPoint(104.0F, -86.5F, 0.0F);
/*      */     
/* 1195 */     this.gunModel['ð'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 7, 25, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1196 */     this.gunModel['ð'].setRotationPoint(87.0F, -91.5F, 1.0F);
/*      */     
/* 1198 */     this.gunModel['ñ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 5, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1199 */     this.gunModel['ñ'].setRotationPoint(92.0F, -79.0F, 0.0F);
/*      */     
/* 1201 */     this.gunModel['ò'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1202 */     this.gunModel['ò'].setRotationPoint(92.0F, -74.0F, 0.0F);
/*      */     
/* 1204 */     this.gunModel['ó'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 5, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
/* 1205 */     this.gunModel['ó'].setRotationPoint(90.0F, -79.0F, 0.0F);
/*      */     
/* 1207 */     this.gunModel['ô'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1208 */     this.gunModel['ô'].setRotationPoint(88.0F, -79.0F, 0.0F);
/*      */     
/* 1210 */     this.gunModel['õ'].addShapeBox(20.0F, 27.0F, -13.0F, 13, 8, 23, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/* 1211 */     this.gunModel['õ'].setRotationPoint(80.0F, -79.0F, 2.0F);
/*      */     
/* 1213 */     this.gunModel['ö'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1214 */     this.gunModel['ö'].setRotationPoint(86.0F, -78.0F, 0.0F);
/*      */     
/* 1216 */     this.gunModel['÷'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 3, 27, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1217 */     this.gunModel['÷'].setRotationPoint(81.5F, -73.0F, 0.0F);
/*      */     
/* 1219 */     this.gunModel['ø'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 4, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1220 */     this.gunModel['ø'].setRotationPoint(88.0F, -77.0F, 0.0F);
/*      */     
/* 1222 */     this.gunModel['ù'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 4, 27, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1223 */     this.gunModel['ù'].setRotationPoint(81.0F, -77.0F, 0.0F);
/*      */     
/* 1225 */     this.gunModel['ú'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 1, 27, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1226 */     this.gunModel['ú'].setRotationPoint(81.0F, -78.0F, 0.0F);
/*      */     
/* 1228 */     this.gunModel['û'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 29, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1229 */     this.gunModel['û'].setRotationPoint(84.5F, -74.5F, -1.0F);
/*      */     
/* 1231 */     this.gunModel['ü'].addBox(20.0F, 27.0F, -13.0F, 3, 1, 29, 0.0F);
/* 1232 */     this.gunModel['ü'].setRotationPoint(84.5F, -73.5F, -1.0F);
/*      */     
/* 1234 */     this.gunModel['ý'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 29, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1235 */     this.gunModel['ý'].setRotationPoint(84.5F, -72.5F, -1.0F);
/*      */     
/* 1237 */     this.gunModel['þ'].addShapeBox(20.0F, 27.0F, -13.0F, 36, 17, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1238 */     this.gunModel['þ'].setRotationPoint(-73.0F, -117.5F, 5.0F);
/*      */     
/* 1240 */     this.gunModel['ÿ'].addShapeBox(20.0F, 27.0F, -13.0F, 13, 25, 27, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1241 */     this.gunModel['ÿ'].setRotationPoint(-73.0F, -99.75F, 0.0F);
/*      */     
/* 1243 */     this.gunModel['Ā'].addShapeBox(20.0F, 27.0F, -13.0F, 11, 5, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1244 */     this.gunModel['Ā'].setRotationPoint(-73.0F, -79.75F, 27.0F);
/*      */     
/* 1246 */     this.gunModel['ā'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 5, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1247 */     this.gunModel['ā'].setRotationPoint(-62.0F, -79.75F, 27.0F);
/*      */     
/* 1249 */     this.gunModel['Ă'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1250 */     this.gunModel['Ă'].setRotationPoint(-60.0F, -78.75F, 27.0F);
/*      */     
/* 1252 */     this.gunModel['ă'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 20, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1253 */     this.gunModel['ă'].setRotationPoint(-73.0F, -100.5F, 27.0F);
/*      */     
/* 1255 */     this.gunModel['Ą'].addShapeBox(20.0F, 27.0F, -13.0F, 16, 6, 2, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1256 */     this.gunModel['Ą'].setRotationPoint(-89.0F, -80.75F, 27.0F);
/*      */     
/* 1258 */     this.gunModel['ą'].addShapeBox(20.0F, 27.0F, -13.0F, 16, 19, 2, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1259 */     this.gunModel['ą'].setRotationPoint(-89.0F, -100.5F, 27.0F);
/*      */     
/* 1261 */     this.gunModel['Ć'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 17, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1262 */     this.gunModel['Ć'].setRotationPoint(-76.0F, -117.5F, 22.0F);
/*      */     
/* 1264 */     this.gunModel['ć'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 17, 21, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1265 */     this.gunModel['ć'].setRotationPoint(-76.0F, -117.5F, 1.0F);
/*      */     
/* 1267 */     this.gunModel['Ĉ'].addShapeBox(20.0F, 27.0F, -13.0F, 21, 25, 27, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1268 */     this.gunModel['Ĉ'].setRotationPoint(-94.0F, -99.75F, 0.0F);
/*      */     
/* 1270 */     this.gunModel['ĉ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 6, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1271 */     this.gunModel['ĉ'].setRotationPoint(-85.0F, -89.75F, 29.0F);
/*      */     
/* 1273 */     this.gunModel['Ċ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 3, 1, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1274 */     this.gunModel['Ċ'].setRotationPoint(-85.0F, -93.5F, 29.0F);
/*      */     
/* 1276 */     this.gunModel['ċ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F);
/* 1277 */     this.gunModel['ċ'].setRotationPoint(-85.0F, -83.75F, 29.0F);
/*      */     
/* 1279 */     this.gunModel['Č'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 17, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1280 */     this.gunModel['Č'].setRotationPoint(-79.0F, -117.5F, 4.0F);
/*      */     
/* 1282 */     this.gunModel['č'].addShapeBox(20.0F, 27.0F, -13.0F, 15, 14, 19, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1283 */     this.gunModel['č'].setRotationPoint(-97.0F, -114.5F, 4.0F);
/*      */     
/* 1285 */     this.gunModel['Ď'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 14, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1286 */     this.gunModel['Ď'].setRotationPoint(-82.0F, -114.5F, 4.0F);
/*      */     
/* 1288 */     this.gunModel['ď'].addShapeBox(20.0F, 27.0F, -13.0F, 23, 2, 3, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, -3.0F, 0.0F, 0.75F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1289 */     this.gunModel['ď'].setRotationPoint(-96.0F, -102.5F, 23.0F);
/*      */     
/* 1291 */     this.gunModel['Đ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
/* 1292 */     this.gunModel['Đ'].setRotationPoint(-82.0F, -116.5F, 4.0F);
/*      */     
/* 1294 */     this.gunModel['đ'].addShapeBox(20.0F, 27.0F, -13.0F, 15, 2, 19, 0.0F, 0.0F, -10.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -10.0F, -3.0F, 0.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 0.0F);
/* 1295 */     this.gunModel['đ'].setRotationPoint(-97.0F, -116.5F, 4.0F);
/*      */     
/* 1297 */     this.gunModel['Ē'].addShapeBox(20.0F, 27.0F, -13.0F, 15, 14, 19, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1298 */     this.gunModel['Ē'].setRotationPoint(-112.0F, -112.5F, 4.0F);
/*      */     
/* 1300 */     this.gunModel['ē'].addShapeBox(20.0F, 27.0F, -13.0F, 23, 2, 3, 0.0F, 0.0F, 0.75F, -3.0F, 0.0F, 0.75F, -3.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1301 */     this.gunModel['ē'].setRotationPoint(-96.0F, -102.5F, 1.0F);
/*      */     
/* 1303 */     this.gunModel['Ĕ'].addShapeBox(20.0F, 27.0F, -13.0F, 15, 14, 19, 0.0F, 0.0F, -12.0F, -3.0F, 0.0F, -8.0F, -3.0F, 0.0F, -8.0F, -3.0F, 0.0F, -12.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1304 */     this.gunModel['Ĕ'].setRotationPoint(-112.0F, -114.5F, 4.0F);
/*      */     
/* 1306 */     this.gunModel['ĕ'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 12, 19, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1307 */     this.gunModel['ĕ'].setRotationPoint(-121.0F, -108.5F, 4.0F);
/*      */     
/* 1309 */     this.gunModel['Ė'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 10, 19, 0.0F, 0.0F, -11.0F, -3.0F, 0.0F, -8.0F, -3.0F, 0.0F, -8.0F, -3.0F, 0.0F, -11.0F, -3.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/* 1310 */     this.gunModel['Ė'].setRotationPoint(-121.0F, -110.5F, 4.0F);
/*      */     
/* 1312 */     this.gunModel['ė'].addShapeBox(20.0F, 27.0F, -13.0F, 69, 4, 19, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1313 */     this.gunModel['ė'].setRotationPoint(-195.0F, -99.5F, 4.0F);
/*      */     
/* 1315 */     this.gunModel['Ę'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 4, 19, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1316 */     this.gunModel['Ę'].setRotationPoint(-126.0F, -99.5F, 4.0F);
/*      */     
/* 1318 */     this.gunModel['ę'].addShapeBox(20.0F, 27.0F, -13.0F, 69, 4, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1319 */     this.gunModel['ę'].setRotationPoint(-195.0F, -95.5F, 4.0F);
/*      */     
/* 1321 */     this.gunModel['Ě'].addShapeBox(20.0F, 27.0F, -13.0F, 11, 4, 19, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F);
/* 1322 */     this.gunModel['Ě'].setRotationPoint(-206.0F, -95.5F, 4.0F);
/*      */     
/* 1324 */     this.gunModel['ě'].addShapeBox(20.0F, 27.0F, -13.0F, 11, 4, 19, 0.0F, 0.0F, 2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 2.0F, -3.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
/* 1325 */     this.gunModel['ě'].setRotationPoint(-206.0F, -99.5F, 4.0F);
/*      */     
/* 1327 */     this.gunModel['Ĝ'].addShapeBox(20.0F, 27.0F, -13.0F, 25, 3, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1328 */     this.gunModel['Ĝ'].setRotationPoint(-231.0F, -100.5F, 4.0F);
/*      */     
/* 1330 */     this.gunModel['ĝ'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 67, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1331 */     this.gunModel['ĝ'].setRotationPoint(-231.0F, -97.5F, 4.0F);
/*      */     
/* 1333 */     this.gunModel['Ğ'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 4, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1334 */     this.gunModel['Ğ'].setRotationPoint(-227.0F, -34.5F, 4.0F);
/*      */     
/* 1336 */     this.gunModel['ğ'].addShapeBox(20.0F, 27.0F, -13.0F, 106, 43, 19, 0.0F, 0.0F, -39.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -39.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -39.0F, 0.0F, 0.0F, -39.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1337 */     this.gunModel['ğ'].setRotationPoint(-219.0F, -73.5F, 4.0F);
/*      */     
/* 1339 */     this.gunModel['Ġ'].addShapeBox(20.0F, 27.0F, -13.0F, 12, 6, 19, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1340 */     this.gunModel['Ġ'].setRotationPoint(-113.0F, -75.5F, 4.0F);
/*      */     
/* 1342 */     this.gunModel['ġ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 4, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1343 */     this.gunModel['ġ'].setRotationPoint(-101.0F, -77.5F, 4.0F);
/*      */     
/* 1345 */     this.gunModel['Ģ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 23, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1346 */     this.gunModel['Ģ'].setRotationPoint(-97.0F, -100.5F, 4.0F);
/*      */     
/* 1348 */     this.gunModel['ģ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 21, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1349 */     this.gunModel['ģ'].setRotationPoint(-98.0F, -98.5F, 4.0F);
/*      */     
/* 1351 */     this.gunModel['Ĥ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1352 */     this.gunModel['Ĥ'].setRotationPoint(-227.0F, -97.5F, 4.0F);
/*      */     
/* 1354 */     this.gunModel['ĥ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1355 */     this.gunModel['ĥ'].setRotationPoint(-227.0F, -36.5F, 4.0F);
/*      */     
/* 1357 */     this.gunModel['Ħ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 6, 19, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1358 */     this.gunModel['Ħ'].setRotationPoint(-126.0F, -97.5F, 4.0F);
/*      */     
/* 1360 */     this.gunModel['ħ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 5, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1361 */     this.gunModel['ħ'].setRotationPoint(-121.0F, -96.5F, 4.0F);
/*      */     
/* 1363 */     this.gunModel['Ĩ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 5, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1364 */     this.gunModel['Ĩ'].setRotationPoint(-116.0F, -96.5F, 4.0F);
/*      */     
/* 1366 */     this.gunModel['ĩ'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 4, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1367 */     this.gunModel['ĩ'].setRotationPoint(-111.0F, -96.5F, 4.0F);
/*      */     
/* 1369 */     this.gunModel['Ī'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1370 */     this.gunModel['Ī'].setRotationPoint(-102.0F, -96.5F, 4.0F);
/*      */     
/* 1372 */     this.gunModel['ī'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1373 */     this.gunModel['ī'].setRotationPoint(-100.0F, -96.5F, 4.0F);
/*      */     
/* 1375 */     this.gunModel['Ĭ'].addShapeBox(20.0F, 27.0F, -13.0F, 14, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1376 */     this.gunModel['Ĭ'].setRotationPoint(-112.0F, -98.5F, 4.0F);
/*      */     
/* 1378 */     this.gunModel['ĭ'].addShapeBox(20.0F, 27.0F, -13.0F, 32, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1379 */     this.gunModel['ĭ'].setRotationPoint(-227.0F, -97.5F, 6.0F);
/*      */     
/* 1381 */     this.gunModel['Į'].addShapeBox(20.0F, 27.0F, -13.0F, 32, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
/* 1382 */     this.gunModel['Į'].setRotationPoint(-227.0F, -94.5F, 6.0F);
/*      */     
/* 1384 */     this.gunModel['į'].addShapeBox(20.0F, 27.0F, -13.0F, 25, 1, 19, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1385 */     this.gunModel['į'].setRotationPoint(-231.0F, -101.5F, 4.0F);
/*      */     
/* 1387 */     this.gunModel['İ'].addShapeBox(20.0F, 27.0F, -13.0F, 15, 6, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1388 */     this.gunModel['İ'].setRotationPoint(-227.0F, -39.5F, 6.0F);
/*      */     
/* 1390 */     this.gunModel['ı'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 8, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1391 */     this.gunModel['ı'].setRotationPoint(-227.0F, -47.5F, 6.0F);
/*      */     
/* 1393 */     this.gunModel['Ĳ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1394 */     this.gunModel['Ĳ'].setRotationPoint(-220.0F, -47.5F, 6.0F);
/*      */     
/* 1396 */     this.gunModel['ĳ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1397 */     this.gunModel['ĳ'].setRotationPoint(-215.0F, -47.5F, 6.0F);
/*      */     
/* 1399 */     this.gunModel['Ĵ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 2, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1400 */     this.gunModel['Ĵ'].setRotationPoint(-213.0F, -45.5F, 6.0F);
/*      */     
/* 1402 */     this.gunModel['ĵ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 7, 15, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1403 */     this.gunModel['ĵ'].setRotationPoint(-212.0F, -43.5F, 6.0F);
/*      */     
/* 1405 */     this.gunModel['Ķ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1406 */     this.gunModel['Ķ'].setRotationPoint(-217.0F, -43.5F, 6.0F);
/*      */     
/* 1408 */     this.gunModel['ķ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1409 */     this.gunModel['ķ'].setRotationPoint(-218.0F, -43.5F, 6.0F);
/*      */     
/* 1411 */     this.gunModel['ĸ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1412 */     this.gunModel['ĸ'].setRotationPoint(-220.0F, -43.5F, 6.0F);
/*      */     
/* 1414 */     this.gunModel['Ĺ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1415 */     this.gunModel['Ĺ'].setRotationPoint(-220.0F, -41.5F, 6.0F);
/*      */     
/* 1417 */     this.gunModel['ĺ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 15, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1418 */     this.gunModel['ĺ'].setRotationPoint(-218.0F, -41.5F, 6.0F);
/*      */     
/* 1420 */     this.gunModel['Ļ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1421 */     this.gunModel['Ļ'].setRotationPoint(-220.0F, -40.5F, 6.0F);
/*      */     
/* 1423 */     this.gunModel['ļ'].addShapeBox(20.0F, 27.0F, -13.0F, 97, 5, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 34.0F, 0.0F, 0.0F, 34.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -34.0F, 0.0F, 0.0F, -34.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1424 */     this.gunModel['ļ'].setRotationPoint(-210.0F, -41.5F, 6.0F);
/*      */     
/* 1426 */     this.gunModel['Ľ'].addShapeBox(20.0F, 27.0F, -13.0F, 12, 6, 15, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1427 */     this.gunModel['Ľ'].setRotationPoint(-113.0F, -77.5F, 6.0F);
/*      */     
/* 1429 */     this.gunModel['ľ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 6, 15, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1430 */     this.gunModel['ľ'].setRotationPoint(-101.0F, -81.5F, 6.0F);
/*      */     
/* 1432 */     this.gunModel['Ŀ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 17, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1433 */     this.gunModel['Ŀ'].setRotationPoint(-99.0F, -94.5F, 6.0F);
/*      */     
/* 1435 */     this.gunModel['ŀ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 4, 11, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1436 */     this.gunModel['ŀ'].setRotationPoint(-172.0F, -58.5F, 8.0F);
/*      */     
/* 1438 */     this.gunModel['Ł'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 7, 11, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1439 */     this.gunModel['Ł'].setRotationPoint(-169.0F, -65.5F, 8.0F);
/*      */     
/* 1441 */     this.gunModel['ł'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 11, 11, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1442 */     this.gunModel['ł'].setRotationPoint(-166.0F, -76.5F, 8.0F);
/*      */     
/* 1444 */     this.gunModel['Ń'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 7, 11, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1445 */     this.gunModel['Ń'].setRotationPoint(-163.0F, -83.5F, 8.0F);
/*      */     
/* 1447 */     this.gunModel['ń'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1448 */     this.gunModel['ń'].setRotationPoint(-162.0F, -85.5F, 8.0F);
/*      */     
/* 1450 */     this.gunModel['Ņ'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 2, 11, 0.0F, 1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1451 */     this.gunModel['Ņ'].setRotationPoint(-162.0F, -87.5F, 8.0F);
/*      */     
/* 1453 */     this.gunModel['ņ'].addShapeBox(20.0F, 27.0F, -13.0F, 10, 2, 11, 0.0F, 4.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1454 */     this.gunModel['ņ'].setRotationPoint(-163.0F, -89.5F, 8.0F);
/*      */     
/* 1456 */     this.gunModel['Ň'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 5, 11, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1457 */     this.gunModel['Ň'].setRotationPoint(-161.0F, -76.5F, 8.0F);
/*      */     
/* 1459 */     this.gunModel['ň'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1460 */     this.gunModel['ň'].setRotationPoint(-161.0F, -71.5F, 8.0F);
/*      */     
/* 1462 */     this.gunModel['ŉ'].addShapeBox(20.0F, 27.0F, -13.0F, 11, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1463 */     this.gunModel['ŉ'].setRotationPoint(-161.0F, -68.5F, 8.0F);
/*      */     
/* 1465 */     this.gunModel['Ŋ'].addShapeBox(20.0F, 27.0F, -13.0F, 23, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1466 */     this.gunModel['Ŋ'].setRotationPoint(-164.0F, -65.5F, 8.0F);
/*      */     
/* 1468 */     this.gunModel['ŋ'].addShapeBox(20.0F, 27.0F, -13.0F, 14, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1469 */     this.gunModel['ŋ'].setRotationPoint(-164.0F, -62.5F, 8.0F);
/*      */     
/* 1471 */     this.gunModel['Ō'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1472 */     this.gunModel['Ō'].setRotationPoint(-167.0F, -58.5F, 8.0F);
/*      */     
/* 1474 */     this.gunModel['ō'].addShapeBox(20.0F, 27.0F, -13.0F, 17, 2, 11, 0.0F, 7.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1475 */     this.gunModel['ō'].setRotationPoint(-167.0F, -91.5F, 8.0F);
/*      */     
/* 1477 */     this.gunModel['Ŏ'].addShapeBox(20.0F, 27.0F, -13.0F, 19, 3, 11, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1478 */     this.gunModel['Ŏ'].setRotationPoint(-129.0F, -76.5F, 8.0F);
/*      */     
/* 1480 */     this.gunModel['ŏ'].addShapeBox(20.0F, 27.0F, -13.0F, 27, 3, 11, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1481 */     this.gunModel['ŏ'].setRotationPoint(-127.0F, -79.5F, 8.0F);
/*      */     
/* 1483 */     this.gunModel['Ő'].addShapeBox(20.0F, 27.0F, -13.0F, 27, 3, 11, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1484 */     this.gunModel['Ő'].setRotationPoint(-126.0F, -82.5F, 8.0F);
/*      */     
/* 1486 */     this.gunModel['ő'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1487 */     this.gunModel['ő'].setRotationPoint(-127.0F, -85.5F, 8.0F);
/*      */     
/* 1489 */     this.gunModel['Œ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 3, 11, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1490 */     this.gunModel['Œ'].setRotationPoint(-129.0F, -88.5F, 8.0F);
/*      */     
/* 1492 */     this.gunModel['œ'].addShapeBox(20.0F, 27.0F, -13.0F, 32, 1, 11, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
/* 1493 */     this.gunModel['œ'].setRotationPoint(-131.0F, -89.5F, 8.0F);
/*      */     
/* 1495 */     this.gunModel['Ŕ'].addShapeBox(20.0F, 27.0F, -13.0F, 12, 3, 11, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1496 */     this.gunModel['Ŕ'].setRotationPoint(-131.0F, -73.5F, 8.0F);
/*      */     
/* 1498 */     this.gunModel['ŕ'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 2, 11, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1499 */     this.gunModel['ŕ'].setRotationPoint(-133.0F, -70.5F, 8.0F);
/*      */     
/* 1501 */     this.gunModel['Ŗ'].addShapeBox(20.0F, 27.0F, -13.0F, 32, 6, 11, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1502 */     this.gunModel['Ŗ'].setRotationPoint(-131.0F, -95.5F, 8.0F);
/*      */     
/* 1504 */     this.gunModel['ŗ'].addShapeBox(20.0F, 27.0F, -13.0F, 25, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1505 */     this.gunModel['ŗ'].setRotationPoint(-124.0F, -88.5F, 8.0F);
/*      */     
/* 1507 */     this.gunModel['Ř'].addShapeBox(20.0F, 27.0F, -13.0F, 21, 4, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1508 */     this.gunModel['Ř'].setRotationPoint(-120.0F, -86.5F, 8.0F);
/*      */     
/* 1510 */     this.gunModel['ř'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1511 */     this.gunModel['ř'].setRotationPoint(-124.0F, -86.5F, 8.0F);
/*      */     
/* 1513 */     this.gunModel['Ś'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1514 */     this.gunModel['Ś'].setRotationPoint(-124.0F, -85.5F, 8.0F);
/*      */     
/* 1516 */     this.gunModel['ś'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1517 */     this.gunModel['ś'].setRotationPoint(-123.0F, -85.5F, 7.5F);
/*      */     
/* 1519 */     this.gunModel['Ŝ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1520 */     this.gunModel['Ŝ'].setRotationPoint(-121.0F, -85.5F, 7.5F);
/*      */     
/* 1522 */     this.gunModel['ŝ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 12, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1523 */     this.gunModel['ŝ'].setRotationPoint(-121.0F, -83.5F, 7.5F);
/*      */     
/* 1525 */     this.gunModel['Ş'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1526 */     this.gunModel['Ş'].setRotationPoint(-123.0F, -83.5F, 7.5F);
/*      */     
/* 1528 */     this.gunModel['ş'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1529 */     this.gunModel['ş'].setRotationPoint(-123.0F, -86.5F, 7.5F);
/*      */     
/* 1531 */     this.gunModel['Š'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 12, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1532 */     this.gunModel['Š'].setRotationPoint(-123.0F, -82.5F, 7.5F);
/*      */     
/* 1534 */     this.gunModel['š'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1535 */     this.gunModel['š'].setRotationPoint(-124.0F, -85.5F, 7.5F);
/*      */     
/* 1537 */     this.gunModel['Ţ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1538 */     this.gunModel['Ţ'].setRotationPoint(-120.0F, -85.5F, 7.5F);
/*      */     
/* 1540 */     this.gunModel['ţ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 5, 15, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1541 */     this.gunModel['ţ'].setRotationPoint(-223.0F, -52.5F, 6.0F);
/*      */     
/* 1543 */     this.gunModel['Ť'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 50, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1544 */     this.gunModel['Ť'].setRotationPoint(-227.0F, -97.5F, 6.0F);
/*      */     
/* 1546 */     this.gunModel['ť'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1547 */     this.gunModel['ť'].setRotationPoint(-223.0F, -91.5F, 8.0F);
/*      */     
/* 1549 */     this.gunModel['Ŧ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 70, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1550 */     this.gunModel['Ŧ'].setRotationPoint(-232.0F, -101.0F, 6.0F);
/*      */     
/* 1552 */     this.gunModel['ŧ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 70, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1553 */     this.gunModel['ŧ'].setRotationPoint(-238.0F, -101.0F, 4.0F);
/*      */     
/* 1555 */     this.gunModel['Ũ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1556 */     this.gunModel['Ũ'].setRotationPoint(-237.0F, -102.0F, 4.0F);
/*      */     
/* 1558 */     this.gunModel['ũ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 1, 19, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1559 */     this.gunModel['ũ'].setRotationPoint(-237.0F, -31.0F, 4.0F);
/*      */     
/* 1561 */     this.gunModel['Ū'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 30, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1562 */     this.gunModel['Ū'].setRotationPoint(-239.0F, -101.0F, 4.0F);
/*      */     
/* 1564 */     this.gunModel['ū'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 38, 19, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1565 */     this.gunModel['ū'].setRotationPoint(-239.0F, -69.0F, 4.0F);
/*      */     
/* 1567 */     this.gunModel['Ŭ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1568 */     this.gunModel['Ŭ'].setRotationPoint(36.0F, -72.5F, 25.0F);
/*      */     
/* 1570 */     this.gunModel['ŭ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1571 */     this.gunModel['ŭ'].setRotationPoint(42.5F, -72.5F, 25.0F);
/*      */     
/* 1573 */     this.gunModel['Ů'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1574 */     this.gunModel['Ů'].setRotationPoint(36.0F, -78.5F, 25.0F);
/*      */     
/* 1576 */     this.gunModel['ů'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1577 */     this.gunModel['ů'].setRotationPoint(42.5F, -78.5F, 25.0F);
/*      */     
/* 1579 */     this.gunModel['Ű'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1580 */     this.gunModel['Ű'].setRotationPoint(42.5F, -73.5F, 25.0F);
/*      */     
/* 1582 */     this.gunModel['ű'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1583 */     this.gunModel['ű'].setRotationPoint(38.0F, -73.5F, 25.0F);
/*      */     
/* 1585 */     this.gunModel['Ų'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 5, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1586 */     this.gunModel['Ų'].setRotationPoint(38.5F, -78.5F, 24.5F);
/*      */     
/* 1588 */     this.gunModel['ų'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1589 */     this.gunModel['ų'].setRotationPoint(38.5F, -73.5F, 25.0F);
/*      */     
/* 1591 */     this.gunModel['Ŵ'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 11, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1592 */     this.gunModel['Ŵ'].setRotationPoint(38.5F, -71.5F, 25.0F);
/*      */     
/* 1594 */     this.gunModel['ŵ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 9, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1595 */     this.gunModel['ŵ'].setRotationPoint(39.25F, -87.5F, 26.5F);
/*      */     
/* 1597 */     this.gunModel['Ŷ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 9, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1598 */     this.gunModel['Ŷ'].setRotationPoint(42.25F, -87.5F, 26.5F);
/*      */     
/* 1600 */     this.gunModel['ŷ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 9, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1601 */     this.gunModel['ŷ'].setRotationPoint(36.25F, -87.5F, 26.5F);
/*      */     
/* 1603 */     this.gunModel['Ÿ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1604 */     this.gunModel['Ÿ'].setRotationPoint(39.25F, -84.5F, 26.0F);
/*      */     
/* 1606 */     this.gunModel['Ź'].addBox(20.0F, 27.0F, -13.0F, 3, 1, 3, 0.0F);
/* 1607 */     this.gunModel['Ź'].setRotationPoint(39.25F, -83.5F, 26.0F);
/*      */     
/* 1609 */     this.gunModel['ź'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1610 */     this.gunModel['ź'].setRotationPoint(39.25F, -82.5F, 26.0F);
/*      */     
/* 1612 */     this.gunModel['Ż'].addShapeBox(20.0F, 27.0F, -13.0F, 30, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1613 */     this.gunModel['Ż'].setRotationPoint(-67.0F, -119.5F, 5.0F);
/*      */     
/* 1615 */     this.gunModel['ż'].addShapeBox(20.0F, 27.0F, -13.0F, 30, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1616 */     this.gunModel['ż'].setRotationPoint(-67.0F, -121.5F, 5.0F);
/*      */     
/* 1618 */     this.gunModel['Ž'].addShapeBox(20.0F, 27.0F, -13.0F, 30, 5, 17, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1619 */     this.gunModel['Ž'].setRotationPoint(-67.0F, -126.5F, 5.0F);
/*      */     
/* 1621 */     this.gunModel['ž'].addShapeBox(20.0F, 27.0F, -13.0F, 22, 5, 2, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1622 */     this.gunModel['ž'].setRotationPoint(-59.0F, -131.5F, 5.0F);
/*      */     
/* 1624 */     this.gunModel['ſ'].addShapeBox(20.0F, 27.0F, -13.0F, 22, 5, 2, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1625 */     this.gunModel['ſ'].setRotationPoint(-59.0F, -131.5F, 20.0F);
/*      */     
/* 1627 */     this.gunModel['ƀ'].addShapeBox(20.0F, 27.0F, -13.0F, 22, 3, 2, 0.0F, -4.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1628 */     this.gunModel['ƀ'].setRotationPoint(-59.0F, -129.5F, 7.0F);
/*      */     
/* 1630 */     this.gunModel['Ɓ'].addShapeBox(20.0F, 27.0F, -13.0F, 22, 3, 2, 0.0F, -4.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1631 */     this.gunModel['Ɓ'].setRotationPoint(-59.0F, -129.5F, 18.0F);
/*      */     
/* 1633 */     this.gunModel['Ƃ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1634 */     this.gunModel['Ƃ'].setRotationPoint(-53.0F, -128.0F, 10.5F);
/*      */     
/* 1636 */     this.gunModel['ƃ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1637 */     this.gunModel['ƃ'].setRotationPoint(-51.0F, -128.0F, 10.5F);
/*      */     
/* 1639 */     this.gunModel['Ƅ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1640 */     this.gunModel['Ƅ'].setRotationPoint(-49.0F, -128.0F, 10.5F);
/*      */     
/* 1642 */     this.gunModel['ƅ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1643 */     this.gunModel['ƅ'].setRotationPoint(-51.0F, -127.5F, 12.5F);
/*      */     
/* 1645 */     this.gunModel['Ɔ'].addShapeBox(20.0F, 27.0F, -13.0F, 89, 23, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1646 */     this.gunModel['Ɔ'].setRotationPoint(-53.0F, -100.5F, 0.0F);
/*      */     
/* 1648 */     this.gunModel['Ƈ'].addShapeBox(20.0F, 27.0F, -13.0F, 45, 7, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1649 */     this.gunModel['Ƈ'].setRotationPoint(36.0F, -84.5F, 0.0F);
/*      */     
/* 1651 */     this.gunModel['ƈ'].addShapeBox(20.0F, 27.0F, -13.0F, 42, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1652 */     this.gunModel['ƈ'].setRotationPoint(36.0F, -100.5F, 0.0F);
/*      */     
/* 1654 */     this.gunModel['Ɖ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1655 */     this.gunModel['Ɖ'].setRotationPoint(36.0F, -86.5F, -2.0F);
/*      */     
/* 1657 */     this.gunModel['Ɗ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1658 */     this.gunModel['Ɗ'].setRotationPoint(76.0F, -86.5F, -2.0F);
/*      */     
/* 1660 */     this.gunModel['Ƌ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 16, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1661 */     this.gunModel['Ƌ'].setRotationPoint(78.0F, -100.5F, 0.0F);
/*      */     
/* 1663 */     this.gunModel['ƌ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 14, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1664 */     this.gunModel['ƌ'].setRotationPoint(34.0F, -100.5F, -2.0F);
/*      */     
/* 1666 */     this.gunModel['ƍ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
/* 1667 */     this.gunModel['ƍ'].setRotationPoint(34.0F, -86.5F, -2.0F);
/*      */     
/* 1669 */     this.gunModel['Ǝ'].addShapeBox(20.0F, 27.0F, -13.0F, 42, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1670 */     this.gunModel['Ǝ'].setRotationPoint(36.0F, -84.5F, -2.0F);
/*      */     
/* 1672 */     this.gunModel['Ə'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 11, 2, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1673 */     this.gunModel['Ə'].setRotationPoint(78.0F, -95.5F, -2.0F);
/*      */     
/* 1675 */     this.gunModel['Ɛ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1676 */     this.gunModel['Ɛ'].setRotationPoint(78.0F, -98.5F, -4.0F);
/*      */     
/* 1678 */     this.gunModel['Ƒ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1679 */     this.gunModel['Ƒ'].setRotationPoint(78.0F, -100.5F, -4.0F);
/*      */     
/* 1681 */     this.gunModel['ƒ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 3, 5, 0.0F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1682 */     this.gunModel['ƒ'].setRotationPoint(104.0F, -77.0F, 1.0F);
/*      */     
/* 1684 */     this.gunModel['Ɠ'].addShapeBox(20.0F, 27.0F, -13.0F, 10, 3, 5, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.15F, 1.0F, 0.0F, 0.15F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F);
/* 1685 */     this.gunModel['Ɠ'].setRotationPoint(94.0F, -77.0F, 1.0F);
/*      */     
/* 1687 */     this.gunModel['Ɣ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 4, 5, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -3.85F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1688 */     this.gunModel['Ɣ'].setRotationPoint(104.0F, -81.0F, 0.0F);
/*      */     
/* 1690 */     this.gunModel['ƕ'].addShapeBox(20.0F, 27.0F, -13.0F, 8, 10, 1, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1691 */     this.gunModel['ƕ'].setRotationPoint(-94.0F, -91.75F, 27.0F);
/*      */     
/* 1693 */     this.gunModel['Ɩ'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 3, 1, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1694 */     this.gunModel['Ɩ'].setRotationPoint(-94.0F, -95.5F, 27.0F);
/*      */     
/* 1696 */     this.gunModel['Ɨ'].addShapeBox(20.0F, 27.0F, -13.0F, 9, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F);
/* 1697 */     this.gunModel['Ɨ'].setRotationPoint(-94.0F, -81.75F, 27.0F);
/*      */     
/* 1699 */     this.gunModel['Ƙ'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 14, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1700 */     this.gunModel['Ƙ'].setRotationPoint(-80.0F, -118.75F, -3.0F);
/*      */     
/* 1702 */     this.gunModel['ƙ'].addShapeBox(20.0F, 27.0F, -13.0F, 6, 29, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1703 */     this.gunModel['ƙ'].setRotationPoint(-79.5F, -112.75F, -2.5F);
/*      */     
/* 1705 */     this.gunModel['ƚ'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 14, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1706 */     this.gunModel['ƚ'].setRotationPoint(-80.0F, -87.75F, -3.0F);
/*      */     
/* 1708 */     this.gunModel['ƛ'].addShapeBox(20.0F, 27.0F, -13.0F, 7, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1709 */     this.gunModel['ƛ'].setRotationPoint(-80.0F, -99.75F, -3.0F);
/*      */     
/* 1711 */     this.gunModel['Ɯ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 25, 27, 0.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1712 */     this.gunModel['Ɯ'].setRotationPoint(-96.0F, -99.75F, 0.0F);
/*      */     
/* 1714 */     this.gunModel['Ɲ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 14, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1715 */     this.gunModel['Ɲ'].setRotationPoint(-85.0F, -87.75F, -3.0F);
/*      */     
/* 1717 */     this.gunModel['ƞ'].addShapeBox(20.0F, 27.0F, -13.0F, 5, 7, 3, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1718 */     this.gunModel['ƞ'].setRotationPoint(-85.0F, -99.75F, -3.0F);
/*      */     
/* 1720 */     this.gunModel['Ɵ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 10, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1721 */     this.gunModel['Ɵ'].setRotationPoint(47.0F, -44.0F, 9.5F);
/*      */     
/* 1723 */     this.gunModel['Ơ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1724 */     this.gunModel['Ơ'].setRotationPoint(-66.0F, -100.5F, 27.0F);
/*      */     
/* 1726 */     this.gunModel['ơ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1727 */     this.gunModel['ơ'].setRotationPoint(-67.0F, -100.5F, 27.0F);
/*      */     
/* 1729 */     this.gunModel['Ƣ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1730 */     this.gunModel['Ƣ'].setRotationPoint(-74.0F, -100.5F, 29.0F);
/*      */     
/* 1732 */     this.gunModel['ƣ'].addShapeBox(20.0F, 27.0F, -13.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1733 */     this.gunModel['ƣ'].setRotationPoint(-71.0F, -100.5F, 29.0F);
/*      */     
/* 1735 */     this.gunModel['Ƥ'].addShapeBox(20.0F, 27.0F, -13.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1736 */     this.gunModel['Ƥ'].setRotationPoint(-69.0F, -100.5F, 29.0F);
/*      */     
/* 1738 */     this.gunModel['ƥ'].addShapeBox(20.0F, 27.0F, -13.0F, 4, 3, 2, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1739 */     this.gunModel['ƥ'].setRotationPoint(-73.0F, -100.5F, 27.0F);
/*      */     
/* 1741 */     this.gunModel['Ʀ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F);
/* 1742 */     this.gunModel['Ʀ'].setRotationPoint(-68.0F, -100.5F, 27.0F);
/*      */     
/* 1744 */     this.gunModel['Ƨ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1745 */     this.gunModel['Ƨ'].setRotationPoint(-68.0F, -100.5F, 28.0F);
/*      */     
/* 1747 */     this.gunModel['ƨ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 1748 */     this.gunModel['ƨ'].setRotationPoint(-69.0F, -100.5F, 27.0F);
/*      */     
/* 1750 */     this.gunModel['Ʃ'].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1751 */     this.gunModel['Ʃ'].setRotationPoint(-69.0F, -100.5F, 28.0F);
/*      */     
/* 1753 */     this.gunModel['ƪ'].addShapeBox(20.0F, 27.0F, -13.0F, 87, 14, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1754 */     this.gunModel['ƪ'].setRotationPoint(114.0F, -95.5F, -3.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 1759 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 857, 65, this.textureX, this.textureY);
/* 1760 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 1585, 73, this.textureX, this.textureY);
/* 1761 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 1665, 73, this.textureX, this.textureY);
/* 1762 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 1763 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 89, 129, this.textureX, this.textureY);
/* 1764 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 865, 25, this.textureX, this.textureY);
/* 1765 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 1009, 9, this.textureX, this.textureY);
/* 1766 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 1033, 9, this.textureX, this.textureY);
/* 1767 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 1065, 9, this.textureX, this.textureY);
/* 1768 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 1089, 9, this.textureX, this.textureY);
/* 1769 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 1441, 1, this.textureX, this.textureY);
/* 1770 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 2025, 1, this.textureX, this.textureY);
/* 1771 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/* 1772 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
/* 1773 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 1121, 9, this.textureX, this.textureY);
/* 1774 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 1177, 9, this.textureX, this.textureY);
/* 1775 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 1537, 105, this.textureX, this.textureY);
/* 1776 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 1537, 137, this.textureX, this.textureY);
/* 1777 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 1281, 265, this.textureX, this.textureY);
/* 1778 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 257, 161, this.textureX, this.textureY);
/* 1779 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 2001, 185, this.textureX, this.textureY);
/* 1780 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 161, 201, this.textureX, this.textureY);
/* 1781 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 385, 169, this.textureX, this.textureY);
/* 1782 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 401, 273, this.textureX, this.textureY);
/* 1783 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 505, 185, this.textureX, this.textureY);
/* 1784 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 1553, 193, this.textureX, this.textureY);
/* 1785 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/* 1786 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 2001, 193, this.textureX, this.textureY);
/* 1787 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 449, 217, this.textureX, this.textureY);
/* 1788 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 1593, 217, this.textureX, this.textureY);
/* 1789 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/* 1790 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 273, 17, this.textureX, this.textureY);
/* 1791 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*      */     
/* 1793 */     this.defaultScopeModel[0].addShapeBox(20.0F, 27.0F, -13.0F, 31, 2, 12, 0.0F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1794 */     this.defaultScopeModel[0].setRotationPoint(169.0F, -120.5F, 7.5F);
/*      */     
/* 1796 */     this.defaultScopeModel[1].addShapeBox(20.0F, 27.0F, -13.0F, 27, 3, 12, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1797 */     this.defaultScopeModel[1].setRotationPoint(172.0F, -123.5F, 7.5F);
/*      */     
/* 1799 */     this.defaultScopeModel[2].addShapeBox(20.0F, 27.0F, -13.0F, 23, 4, 12, 0.0F, -3.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1800 */     this.defaultScopeModel[2].setRotationPoint(175.0F, -127.5F, 7.5F);
/*      */     
/* 1802 */     this.defaultScopeModel[3].addShapeBox(20.0F, 27.0F, -13.0F, 34, 1, 12, 0.0F, -3.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1803 */     this.defaultScopeModel[3].setRotationPoint(166.0F, -118.5F, 7.5F);
/*      */     
/* 1805 */     this.defaultScopeModel[4].addShapeBox(20.0F, 27.0F, -13.0F, 4, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1806 */     this.defaultScopeModel[4].setRotationPoint(-42.0F, -131.5F, 9.0F);
/*      */     
/* 1808 */     this.defaultScopeModel[5].addShapeBox(20.0F, 27.0F, -13.0F, 1, 3, 9, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1809 */     this.defaultScopeModel[5].setRotationPoint(-43.0F, -129.5F, 9.0F);
/*      */     
/* 1811 */     this.defaultScopeModel[6].addShapeBox(20.0F, 27.0F, -13.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1812 */     this.defaultScopeModel[6].setRotationPoint(-42.0F, -134.5F, 10.0F);
/*      */     
/* 1814 */     this.defaultScopeModel[7].addShapeBox(20.0F, 27.0F, -13.0F, 4, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1815 */     this.defaultScopeModel[7].setRotationPoint(-42.0F, -134.5F, 15.5F);
/*      */     
/* 1817 */     this.defaultScopeModel[8].addShapeBox(20.0F, 27.0F, -13.0F, 4, 1, 2, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1818 */     this.defaultScopeModel[8].setRotationPoint(-42.0F, -135.5F, 15.5F);
/*      */     
/* 1820 */     this.defaultScopeModel[9].addShapeBox(20.0F, 27.0F, -13.0F, 4, 1, 2, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1821 */     this.defaultScopeModel[9].setRotationPoint(-42.0F, -135.5F, 9.5F);
/*      */     
/* 1823 */     this.defaultScopeModel[10].addShapeBox(20.0F, 27.0F, -13.0F, 4, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1824 */     this.defaultScopeModel[10].setRotationPoint(-42.0F, -132.5F, 11.5F);
/*      */     
/* 1826 */     this.defaultScopeModel[11].addShapeBox(20.0F, 27.0F, -13.0F, 4, 1, 1, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1827 */     this.defaultScopeModel[11].setRotationPoint(-42.0F, -132.5F, 14.5F);
/*      */     
/* 1829 */     this.defaultScopeModel[12].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1830 */     this.defaultScopeModel[12].setRotationPoint(-42.15F, -134.0F, 16.15F);
/*      */     
/* 1832 */     this.defaultScopeModel[13].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1833 */     this.defaultScopeModel[13].setRotationPoint(-42.15F, -134.0F, 9.65F);
/*      */     
/* 1835 */     this.defaultScopeModel[14].addShapeBox(20.0F, 27.0F, -13.0F, 4, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1836 */     this.defaultScopeModel[14].setRotationPoint(-42.0F, -134.5F, 9.0F);
/*      */     
/* 1838 */     this.defaultScopeModel[15].addShapeBox(20.0F, 27.0F, -13.0F, 4, 3, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1839 */     this.defaultScopeModel[15].setRotationPoint(-42.0F, -134.5F, 17.0F);
/*      */     
/* 1841 */     this.defaultScopeModel[16].addShapeBox(20.0F, 27.0F, -13.0F, 20, 4, 2, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1842 */     this.defaultScopeModel[16].setRotationPoint(178.0F, -132.5F, 5.5F);
/*      */     
/* 1844 */     this.defaultScopeModel[17].addShapeBox(20.0F, 27.0F, -13.0F, 20, 4, 3, 0.0F, -0.75F, 0.0F, -3.0F, -1.5F, 0.0F, -3.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1845 */     this.defaultScopeModel[17].setRotationPoint(178.0F, -136.5F, 5.5F);
/*      */     
/* 1847 */     this.defaultScopeModel[18].addShapeBox(20.0F, 27.0F, -13.0F, 20, 2, 10, 0.0F, -1.75F, 0.0F, -5.0F, -2.5F, 0.0F, -5.0F, -2.5F, 0.0F, -5.0F, -1.75F, 0.0F, -5.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1848 */     this.defaultScopeModel[18].setRotationPoint(178.0F, -138.5F, 8.5F);
/*      */     
/* 1850 */     this.defaultScopeModel[19].addShapeBox(20.0F, 27.0F, -13.0F, 19, 4, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.5F, 0.0F, -2.0F);
/* 1851 */     this.defaultScopeModel[19].setRotationPoint(179.0F, -128.5F, 19.5F);
/*      */     
/* 1853 */     this.defaultScopeModel[20].addShapeBox(20.0F, 27.0F, -13.0F, 20, 4, 2, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1854 */     this.defaultScopeModel[20].setRotationPoint(178.0F, -132.5F, 19.5F);
/*      */     
/* 1856 */     this.defaultScopeModel[21].addShapeBox(20.0F, 27.0F, -13.0F, 20, 4, 3, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, -3.0F, -0.75F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1857 */     this.defaultScopeModel[21].setRotationPoint(178.0F, -136.5F, 18.5F);
/*      */     
/* 1859 */     this.defaultScopeModel[22].addShapeBox(20.0F, 27.0F, -13.0F, 19, 4, 2, 0.0F, 0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 1860 */     this.defaultScopeModel[22].setRotationPoint(179.0F, -128.5F, 5.5F);
/*      */     
/* 1862 */     this.defaultScopeModel[23].addShapeBox(20.0F, 27.0F, -13.0F, 20, 1, 10, 0.0F, -0.75F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
/* 1863 */     this.defaultScopeModel[23].setRotationPoint(178.0F, -136.5F, 8.5F);
/*      */     
/* 1865 */     this.defaultScopeModel[24].addShapeBox(20.0F, 27.0F, -13.0F, 20, 5, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1866 */     this.defaultScopeModel[24].setRotationPoint(178.0F, -132.5F, 18.5F);
/*      */     
/* 1868 */     this.defaultScopeModel[25].addShapeBox(20.0F, 27.0F, -13.0F, 20, 5, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1869 */     this.defaultScopeModel[25].setRotationPoint(178.0F, -132.5F, 7.5F);
/*      */     
/* 1871 */     this.defaultScopeModel[26].addShapeBox(20.0F, 27.0F, -13.0F, 20, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1872 */     this.defaultScopeModel[26].setRotationPoint(178.0F, -129.5F, 8.5F);
/*      */     
/* 1874 */     this.defaultScopeModel[27].addShapeBox(20.0F, 27.0F, -13.0F, 20, 2, 2, 0.0F, -0.7F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -1.35F, 0.0F, 0.0F, -1.35F, 0.0F, -2.0F, -0.6F, 0.0F, -2.0F);
/* 1875 */     this.defaultScopeModel[27].setRotationPoint(178.0F, -135.5F, 8.5F);
/*      */     
/* 1877 */     this.defaultScopeModel[28].addShapeBox(20.0F, 27.0F, -13.0F, 20, 2, 2, 0.0F, -0.5F, 0.0F, -2.0F, -1.25F, 0.0F, -2.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1878 */     this.defaultScopeModel[28].setRotationPoint(178.0F, -129.5F, 16.5F);
/*      */     
/* 1880 */     this.defaultScopeModel[29].addShapeBox(20.0F, 27.0F, -13.0F, 20, 2, 2, 0.0F, -0.7F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -1.45F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.6F, 0.0F, -2.0F, -1.35F, 0.0F, -2.0F, -1.35F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F);
/* 1881 */     this.defaultScopeModel[29].setRotationPoint(178.0F, -135.5F, 16.5F);
/*      */     
/* 1883 */     this.defaultScopeModel[30].addShapeBox(20.0F, 27.0F, -13.0F, 8, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F);
/* 1884 */     this.defaultScopeModel[30].setRotationPoint(184.0F, -130.5F, 12.5F);
/*      */     
/* 1886 */     this.defaultScopeModel[31].addShapeBox(20.0F, 27.0F, -13.0F, 8, 3, 2, 0.0F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, -1.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1887 */     this.defaultScopeModel[31].setRotationPoint(184.0F, -133.5F, 12.5F);
/*      */     
/* 1889 */     this.defaultScopeModel[32].addShapeBox(20.0F, 27.0F, -13.0F, 1, 1, 1, 0.0F, -0.25F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1890 */     this.defaultScopeModel[32].setRotationPoint(184.5F, -134.0F, 12.85F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 1895 */     this.ammoModel[0] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/* 1896 */     this.ammoModel[1] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/* 1897 */     this.ammoModel[2] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/* 1898 */     this.ammoModel[3] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/* 1899 */     this.ammoModel[4] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/* 1900 */     this.ammoModel[5] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/* 1901 */     this.ammoModel[6] = new ModelRendererTurbo(this, 537, 249, this.textureX, this.textureY);
/*      */     
/* 1903 */     this.ammoModel[0].addShapeBox(20.0F, 27.0F, -13.0F, 28, 33, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F);
/* 1904 */     this.ammoModel[0].setRotationPoint(47.0F, -79.0F, 2.5F);
/*      */     
/* 1906 */     this.ammoModel[1].addShapeBox(20.0F, 27.0F, -13.0F, 28, 18, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F);
/* 1907 */     this.ammoModel[1].setRotationPoint(54.0F, -46.0F, 2.5F);
/*      */     
/* 1909 */     this.ammoModel[2].addShapeBox(20.0F, 27.0F, -13.0F, 28, 20, 22, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, 6.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F);
/* 1910 */     this.ammoModel[2].setRotationPoint(59.0F, -28.0F, 2.5F);
/*      */     
/* 1912 */     this.ammoModel[3].addShapeBox(20.0F, 27.0F, -13.0F, 28, 20, 22, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, -8.5F, 0.0F, 0.0F);
/* 1913 */     this.ammoModel[3].setRotationPoint(67.0F, -8.0F, 2.5F);
/*      */     
/* 1915 */     this.ammoModel[4].addShapeBox(20.0F, 27.0F, -13.0F, 28, 19, 22, 0.0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -8.75F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 0.0F, -8.75F, 0.0F, 0.0F);
/* 1916 */     this.ammoModel[4].setRotationPoint(77.25F, 12.0F, 2.5F);
/*      */     
/* 1918 */     this.ammoModel[5].addShapeBox(20.0F, 27.0F, -13.0F, 32, 5, 22, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/* 1919 */     this.ammoModel[5].setRotationPoint(85.75F, 31.0F, 2.5F);
/*      */     
/* 1921 */     this.ammoModel[6].addShapeBox(20.0F, 27.0F, -13.0F, 35, 8, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 2.0F, 0.0F, -8.0F, 2.0F, 0.0F, -8.0F, 2.0F, -6.0F, 0.0F, 2.0F);
/* 1922 */     this.ammoModel[6].setRotationPoint(89.75F, 36.0F, 2.5F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 1927 */     this.slideModel[0] = new ModelRendererTurbo(this, 401, 257, this.textureX, this.textureY);
/*      */     
/* 1929 */     this.slideModel[0].addShapeBox(20.0F, 27.0F, -13.0F, 42, 12, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1930 */     this.slideModel[0].setRotationPoint(36.0F, -96.0F, 2.0F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelump9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */